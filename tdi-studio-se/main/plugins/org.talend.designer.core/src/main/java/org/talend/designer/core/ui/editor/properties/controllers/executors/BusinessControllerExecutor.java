// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.properties.controllers.executors;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.gef.commands.Command;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.CorePlugin;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.database.EDatabase4DriverClassName;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.database.ERedshiftDriver;
import org.talend.core.database.conn.ConnParameterKeys;
import org.talend.core.database.conn.version.EDatabaseVersion4Drivers;
import org.talend.core.model.components.EComponentType;
import org.talend.core.model.components.IMultipleComponentManager;
import org.talend.core.model.metadata.IMetadataConnection;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.QueryUtil;
import org.talend.core.model.metadata.builder.ConvertionHelper;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.database.ExtractMetaDataUtils;
import org.talend.core.model.metadata.builder.database.JavaSqlFactory;
import org.talend.core.model.metadata.designerproperties.EParameterNameForComponent;
import org.talend.core.model.param.EConnectionParameterName;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.services.IGenericService;
import org.talend.core.sqlbuilder.util.ConnectionParameters;
import org.talend.core.sqlbuilder.util.TextUtil;
import org.talend.core.ui.services.ISQLBuilderService;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.FakeElement;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.EmfComponent;
import org.talend.designer.core.model.process.jobsettings.JobSettingsConstants;
import org.talend.designer.core.ui.editor.cmd.ChangeValuesFromRepository;
import org.talend.designer.core.ui.editor.cmd.QueryGuessCommand;
import org.talend.designer.core.ui.editor.connections.TracesConnectionUtils;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IBusinessControllerUI;
import org.talend.designer.core.ui.projectsetting.ImplicitContextLoadElement;
import org.talend.designer.core.ui.projectsetting.StatsAndLogsElement;
import org.talend.designer.core.utils.UpgradeParameterHelper;
import org.talend.designer.runprocess.IRunProcessService;
import org.talend.hadoop.distribution.constants.HiveConstant;
import org.talend.hadoop.distribution.constants.ImpalaConstant;
import org.talend.metadata.managment.repository.ManagerConnection;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.metadata.managment.utils.MetadataConnectionUtils;
import org.talend.repository.RepositoryPlugin;
import org.talend.repository.model.IMetadataService;
import org.talend.repository.model.IProxyRepositoryFactory;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public abstract class BusinessControllerExecutor extends ControllerExecutor {

    @Override
    protected IBusinessControllerUI getUi() {
        return (IBusinessControllerUI) super.getUi();
    }

    protected String getRepositoryItemFromRepositoryName(IElementParameter param, String repositoryName) {
        String value = (String) param.getValue();
        Object[] valuesList = param.getListItemsValue();
        String[] originalList = param.getListItemsDisplayCodeName();
        for (int i = 0; i < valuesList.length; i++) {
            if (valuesList[i].equals(value)) {
                if ("DB_VERSION".equals(repositoryName) || HiveConstant.DISTRIBUTION_PARAMETER.equals(repositoryName)
                        || HiveConstant.VERSION_PARAMETER.equals(repositoryName)
                        || ImpalaConstant.DISTRIBUTION_PARAMETER.equals(repositoryName)
                        || ImpalaConstant.VERSION_PARAMETER.equals(repositoryName)) {
                    return valuesList[i].toString();
                }
                return originalList[i];
            }
        }
        return ""; //$NON-NLS-1$
    }

    protected String getValueFromRepositoryName(String repositoryName) {
        for (IElementParameter param : (List<IElementParameter>) getElem().getElementParameters()) {
            if (param.getRepositoryValue() != null) {
                if (param.getRepositoryValue().equals(repositoryName)) {
                    if (param.getFieldType().equals(EParameterFieldType.CLOSED_LIST)) {
                        return getRepositoryItemFromRepositoryName(param, repositoryName);
                    }
                    if (param.getValue() instanceof String) {
                        return (String) param.getValue();
                    } else if (param.getValue() instanceof List) {
                        // for jdbc parm driver jar
                        String value = "";
                        List list = (List) param.getValue();
                        for (Object object : list) {
                            if (object instanceof Map) {
                                Map valueMap = (Map) object;
                                if (valueMap.get("JAR_NAME") != null) {
                                    if (value.equals("")) {
                                        value = value + valueMap.get("JAR_NAME");
                                    } else {
                                        value = value + ";" + valueMap.get("JAR_NAME");
                                    }
                                } else if (valueMap.get("drivers") != null) {
                                    if (value.equals("")) {
                                        value = value + valueMap.get("drivers");
                                    } else {
                                        value = value + ";" + valueMap.get("drivers");
                                    }
                                }
                            }
                        }
                        return value;
                    }
                }
            }
        }
        return ""; //$NON-NLS-1$
    }

    protected String getValueFromRepositoryName(IElement elem2, String repositoryName) {
        return getValueFromRepositoryName(elem2, repositoryName, null);
    }

    protected String getValueFromRepositoryName(IElement elem2, String repositoryName,
            IElementParameter baseRepositoryParameter) {

        for (IElementParameter param : (List<IElementParameter>) elem2.getElementParameters()) {
            // for job settings extra.(feature 2710)
            if (!sameExtraParameter(param)) {
                continue;
            }
            // if ("TYPE".equals(repositoryName) && "CONNECTION_TYPE".equals(param.getName())) {
            // return (String) param.getValue();
            // }
            if (param.getRepositoryValue() != null) {
                if (param.getRepositoryProperty() != null && baseRepositoryParameter != null
                        && !param.getRepositoryProperty().equals(baseRepositoryParameter.getName())) {
                    continue;
                }
                if (param.getRepositoryValue().equals(repositoryName)) {
                    if (param.getFieldType().equals(EParameterFieldType.CLOSED_LIST)) {
                        return getRepositoryItemFromRepositoryName(param, repositoryName);
                    }
                    if (param.getValue() instanceof String) {
                        return (String) param.getValue();
                    } else if (param.getValue() instanceof Boolean) {
                        return String.valueOf(param.getValue());
                    } else if (param.getValue() instanceof List) {
                        // for jdbc parm driver jar
                        String value = "";
                        List list = (List) param.getValue();
                        for (Object object : list) {
                            if (object instanceof Map) {
                                Map valueMap = (Map) object;
                                if (valueMap.get("JAR_NAME") != null) {
                                    if (value.equals("")) {
                                        value = value + valueMap.get("JAR_NAME");
                                    } else {
                                        value = value + ";" + valueMap.get("JAR_NAME");
                                    }
                                } else if (valueMap.get("drivers") != null) {
                                    if (value.equals("")) {
                                        value = value + valueMap.get("drivers");
                                    } else {
                                        value = value + ";" + valueMap.get("drivers");
                                    }
                                }
                            }
                        }
                        return value;
                    }

                }
            }
        }
        return ""; //$NON-NLS-1$
    }

    /**
     * DOC zli Comment method "getValueFromRepositoryName".
     *
     * @param elem2
     * @param repositoryName
     * @param parameterName
     * @return
     */
    protected String getValueFromRepositoryNameAndParameterName(IElement elem2, String repositoryName, String parameterName) {

        for (IElementParameter param : (List<IElementParameter>) elem2.getElementParameters()) {
            if (!sameExtraParameter(param)) {
                continue;
            }
            if (param.getRepositoryValue() != null) {
                if (param.getRepositoryValue().equals(repositoryName)) {
                    if (param.getName().contains(parameterName)) {
                        if (param.getValue() instanceof String) {
                            return (String) param.getValue();
                        } else if (param.getValue() instanceof List) {
                            // for jdbc parm driver jar
                            String value = "";
                            List list = (List) param.getValue();
                            for (Object object : list) {
                                if (object instanceof Map) {
                                    Map valueMap = (Map) object;
                                    if (valueMap.get("JAR_NAME") != null) {
                                        if (value.equals("")) {
                                            value = value + valueMap.get("JAR_NAME");
                                        } else {
                                            value = value + ";" + valueMap.get("JAR_NAME");
                                        }
                                    } else if (valueMap.get("drivers") != null) {
                                        if (value.equals("")) {
                                            value = value + valueMap.get("drivers");
                                        } else {
                                            value = value + ";" + valueMap.get("drivers");
                                        }
                                    }
                                }
                            }
                            return value;
                        }
                    }
                }
            }
        }
        return ""; //$NON-NLS-1$
    }

    protected String getParaNameFromRepositoryName(String repositoryName, IElementParameter basePropertyParameter) {
        return getParaNameFromRepositoryName(getElem(), repositoryName, basePropertyParameter);
    }

    protected String getParaNameFromRepositoryName(IElement elem2, String repositoryName,
            IElementParameter basePropertyParameter) {
        for (IElementParameter param : (List<IElementParameter>) elem2.getElementParameters()) {
            // for job settings extra.(feature 2710)
            if (!sameExtraParameter(param)) {
                continue;
            }
            if (param.getRepositoryValue() != null) {
                if (param.getRepositoryProperty() != null && basePropertyParameter != null
                        && !param.getRepositoryProperty().equals(basePropertyParameter.getName())) {
                    // in case the parameter name is not linked to the current property tested (cf like tSqoopImport)
                    continue;
                }
                if (param.getRepositoryValue().equals(repositoryName)) {
                    return param.getName();
                }
            }
        }
        return null;
    }

    private void setAllConnectionParameters(String typ, IElement element) {
        IElementParameter basePropertyParameter = null;
        for (IElementParameter param : getElem().getElementParameters()) {
            if (param.getFieldType() == EParameterFieldType.PROPERTY_TYPE) {
                if (param.getRepositoryValue().startsWith("DATABASE")) {
                    basePropertyParameter = param;
                    break;
                }
            }
        }
        // jobsetting view load the db info from current selected category
        IElementParameter updateBasePropertyParameter = updateBasePropertyParameter();
        if (updateBasePropertyParameter != null && !updateBasePropertyParameter.equals(basePropertyParameter)) {
            basePropertyParameter = updateBasePropertyParameter;
        }
        String type = null;
        ExtractMetaDataUtils extractMeta = ExtractMetaDataUtils.getInstance();
        if (typ != null && !typ.equals("")) { //$NON-NLS-1$
            type = typ;
        } else {
            type = getValueFromRepositoryName(element, "TYPE", basePropertyParameter); //$NON-NLS-1$
        }
        if (type.equals("Oracle") || type.contains("OCLE")) {
            IElementParameter ele = element.getElementParameter("CONNECTION_TYPE");
            if (ele != null) {
                type = (String) ele.getValue();
            } else {
                type = "ORACLE_SID"; //$NON-NLS-1$
            }
        }
        if (type.equalsIgnoreCase("REDSHIFT")) {
            IElementParameter ele = element.getElementParameter("JDBC_URL");
            if (ele != null && ((String) ele.getValue()).equals("SSO")) {
                type = EDatabaseTypeName.REDSHIFT_SSO.getXmlName();
            } else {
                type = EDatabaseTypeName.REDSHIFT.getXmlName(); // $NON-NLS-1$
            }
        }
        // Get real hsqldb type
        if (type.equals(EDatabaseTypeName.HSQLDB.name())
                && getValueFromRepositoryName(element, "RUNNING_MODE", basePropertyParameter) //$NON-NLS-1$
                        .equals("HSQLDB_INPROGRESS_PERSISTENT")) {
            type = EDatabaseTypeName.HSQLDB_IN_PROGRESS.getDisplayName();
        }
        // If the dbtype has been setted don't reset it again unless the dbtype of connParameters is null.
        if (StringUtils.trimToNull(type) == null && StringUtils.trimToNull(getConnParameters().getDbType()) == null) {
            type = EDatabaseTypeName.GENERAL_JDBC.getXmlName();
        }
        if (StringUtils.trimToNull(type) != null) {
            getConnParameters().setDbType(type);
        }

        String frameWorkKey = getValueFromRepositoryName(element, "FRAMEWORK_TYPE", basePropertyParameter); //$NON-NLS-1$
        getConnParameters().setFrameworkType(frameWorkKey);

        String schema = getValueFromRepositoryName(element, EConnectionParameterName.SCHEMA.getName(), basePropertyParameter);
        getConnParameters().setSchema(schema);

        if ((getElem() instanceof Node)
                && (((Node) getElem()).getComponent().getComponentType().equals(EComponentType.GENERIC) || (element instanceof INode
                        && ((INode) element).getComponent().getComponentType().equals(EComponentType.GENERIC)))) {
            String userName = getValueFromRepositoryName(element, EConnectionParameterName.GENERIC_USERNAME.getDisplayName(),
                    basePropertyParameter);
            getConnParameters().setUserName(userName);

            String password = getValueFromRepositoryName(element, EConnectionParameterName.GENERIC_PASSWORD.getDisplayName(),
                    basePropertyParameter);
            getConnParameters().setPassword(password);

            String url = getValueFromRepositoryName(element, EConnectionParameterName.GENERIC_URL.getDisplayName(),
                    basePropertyParameter);
            getConnParameters().setUrl(TalendTextUtils.removeQuotes(url));

            String driverJar = getValueFromRepositoryName(element, EConnectionParameterName.GENERIC_DRIVER_JAR.getDisplayName(),
                    basePropertyParameter);
            getConnParameters().setDriverJar(TalendTextUtils.removeQuotes(driverJar));

            String driverClass = getValueFromRepositoryName(element,
                    EConnectionParameterName.GENERIC_DRIVER_CLASS.getDisplayName(), basePropertyParameter);
            getConnParameters().setDriverClass(TalendTextUtils.removeQuotes(driverClass));
        } else {
            String userName = getValueFromRepositoryName(element, EConnectionParameterName.USERNAME.getName(),
                    basePropertyParameter);
            getConnParameters().setUserName(userName);

            String password = getValueFromRepositoryName(element, EConnectionParameterName.PASSWORD.getName(),
                    basePropertyParameter);
            getConnParameters().setPassword(password);

            // General jdbc
            String url = getValueFromRepositoryName(element, EConnectionParameterName.URL.getName(), basePropertyParameter);
            if (StringUtils.isEmpty(url)) {
                // for oracle RAC
                // url = getValueFromRepositoryName(element, "RAC_" + EConnectionParameterName.URL.getName());
                // Changed by Marvin Wang on Feb. 14, 2012 for bug TDI-19597. Above is the original code, below is new
                // code
                // to get the Oracle RAC url.
                if (EDatabaseTypeName.ORACLE_CUSTOM.getXmlName().equals(type)) {
                    url = getValueFromRepositoryName(element, "RAC_" + EConnectionParameterName.URL.getName(),
                            basePropertyParameter);
                }
            }
            getConnParameters().setUrl(TalendTextUtils.removeQuotes(url));

            String driverJar = getValueFromRepositoryName(element, EConnectionParameterName.DRIVER_JAR.getName(),
                    basePropertyParameter);
            getConnParameters().setDriverJar(TalendTextUtils.removeQuotes(driverJar));

            String driverClass = getValueFromRepositoryName(element, EConnectionParameterName.DRIVER_CLASS.getName(),
                    basePropertyParameter);
            String driverName = getValueFromRepositoryName(element, "DB_VERSION", basePropertyParameter); //$NON-NLS-1$
            if (StringUtils.isBlank(driverName) && EDatabaseTypeName.MSSQL.getDisplayName().equals(getConnParameters().getDbType())) {
                driverName = getValueFromRepositoryName(element, "DRIVER", basePropertyParameter); //$NON-NLS-1$
            }
            String dbVersionName = EDatabaseVersion4Drivers.getDbVersionName(type, driverName);
            getConnParameters().setDbVersion(dbVersionName);
            getConnParameters().setDriverClass(TalendTextUtils.removeQuotes(driverClass));

            if (driverClass != null && !"".equals(driverClass)
                    && !EDatabaseTypeName.GENERAL_JDBC.getDisplayName().equals(getConnParameters().getDbType())) {
                if (driverClass.startsWith("\"") && driverClass.endsWith("\"")) {
                    driverClass = TalendTextUtils.removeQuotes(driverClass);
                }
                String dbTypeByClassName = "";
                if (driverJar != null && !"".equals(driverJar)) {
                    dbTypeByClassName = extractMeta.getDbTypeByClassNameAndDriverJar(driverClass, driverJar);
                } else {
                    dbTypeByClassName = extractMeta.getDbTypeByClassName(driverClass);
                }

                if (dbTypeByClassName != null) {
                    getConnParameters().setDbType(dbTypeByClassName);
                }
            }
        }

        String host = getValueFromRepositoryName(element, EConnectionParameterName.SERVER_NAME.getName(), basePropertyParameter);
        getConnParameters().setHost(host);

        String port = getValueFromRepositoryName(element, EConnectionParameterName.PORT.getName(), basePropertyParameter);
        getConnParameters().setPort(port);

        boolean https = Boolean.parseBoolean(
                getValueFromRepositoryName(element, EConnectionParameterName.HTTPS.getName(), basePropertyParameter));
        getConnParameters().setHttps(https);

        boolean isOracleOCI = type.equals(EDatabaseTypeName.ORACLE_OCI.getXmlName())
                || type.equals(EDatabaseTypeName.ORACLE_OCI.getDisplayName());
        if (isOracleOCI) {
            String localServiceName = getValueFromRepositoryNameAndParameterName(element, EConnectionParameterName.SID.getName(),
                    EParameterName.LOCAL_SERVICE_NAME.getName());
            // sid is the repository value both for DBName and Local_service_name
            getConnParameters().setLocalServiceName(localServiceName);
        }

        String datasource = getValueFromRepositoryName(element, EConnectionParameterName.DATASOURCE.getName(),
                basePropertyParameter);
        getConnParameters().setDatasource(datasource);

        // qli modified to fix the bug "7364".

        String dbName = getValueFromRepositoryName(element, EConnectionParameterName.SID.getName(), basePropertyParameter);
        if (EDatabaseTypeName.EXASOL.getDisplayName().equals(getConnParameters().getDbType())) {
            if (dbName.contains("\\\"")) {
                dbName = dbName.replace("\\\"", "");
            }
            dbName = TextUtil.removeQuots(dbName);
        } else if (EDatabaseTypeName.GENERAL_JDBC.getDisplayName().equals(getConnParameters().getDbType())) {
            dbName = ""; //$NON-NLS-1$
        }
        getConnParameters().setDbName(dbName);
        EDatabaseTypeName dbtype = EDatabaseTypeName.getTypeFromDbType(type);
        if (ManagerConnection.isSchemaFromSidOrDatabase(dbtype)) {
            getConnParameters().setSchema(dbName);
        }
        if (getConnParameters().getDbType().equals(EDatabaseTypeName.SQLITE.getXmlName())
                || getConnParameters().getDbType().equals(EDatabaseTypeName.ACCESS.getXmlName())
                || getConnParameters().getDbType().equals(EDatabaseTypeName.FIREBIRD.getXmlName())) {
            String file = getValueFromRepositoryName(element, EConnectionParameterName.FILE.getName(), basePropertyParameter);
            getConnParameters().setFilename(file);
        }

        String dir = getValueFromRepositoryName(element, EConnectionParameterName.DIRECTORY.getName(), basePropertyParameter);
        if (type.equals(EDatabaseTypeName.HSQLDB_IN_PROGRESS.getDisplayName())) {
            dir = getValueFromRepositoryName(getElem(), EConnectionParameterName.DBPATH.getName(), basePropertyParameter);
        }
        getConnParameters().setDirectory(dir);

        String jdbcProps = getValueFromRepositoryName(element, EConnectionParameterName.PROPERTIES_STRING.getName(),
                basePropertyParameter);
        if (EDatabaseTypeName.ORACLE_CUSTOM.getDbType().equals(typ)) {
            // for ssl
            String useSSL = getValueFromRepositoryName(element, "USE_SSL"); //$NON-NLS-1$
            getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_USE_SSL, useSSL);
            // trustStore
            String trustStore = getValueFromRepositoryName(element, "SSL_TRUSTSERVER_TRUSTSTORE");
            getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SSL_TRUST_STORE_PATH,
                    TalendQuoteUtils.removeQuotesIfExist(trustStore));
            // trusstStore pwd
            String trustStorePwd = getValueFromRepositoryName(element, "SSL_TRUSTSERVER_PASSWORD");
            getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SSL_TRUST_STORE_PASSWORD,
                    TalendQuoteUtils.removeQuotesIfExist(trustStorePwd));
            // clientAuth
            String clientAuth = getValueFromRepositoryName(element, "NEED_CLIENT_AUTH");
            getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_NEED_CLIENT_AUTH, clientAuth);
            // keyStore
            String keyStore = getValueFromRepositoryName(element, "SSL_KEYSTORE");
            getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SSL_KEY_STORE_PATH,
                    TalendQuoteUtils.removeQuotesIfExist(keyStore));
            // keyStorePwd
            String keyStorePwd = getValueFromRepositoryName(element, "SSL_KEYSTORE_PASSWORD");
            getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SSL_KEY_STORE_PASSWORD,
                    TalendQuoteUtils.removeQuotesIfExist(keyStorePwd));
        }
        getConnParameters().setJdbcProperties(jdbcProps);

        String realTableName = null;
        if (EmfComponent.REPOSITORY.equals(getElem().getPropertyValue(EParameterName.SCHEMA_TYPE.getName()))) {
            final Object propertyValue = getElem().getPropertyValue(EParameterName.REPOSITORY_SCHEMA_TYPE.getName());
            IMetadataTable metadataTable = null;

            String connectionId = propertyValue.toString().split(" - ")[0];
            String tableLabel = propertyValue.toString().split(" - ")[1];

            IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
            Item item = null;
            try {
                IRepositoryViewObject repobj = factory.getLastVersion(connectionId);
                if (repobj != null) {
                    Property property = repobj.getProperty();
                    if (property != null) {
                        item = property.getItem();
                    }
                }
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
            }
            if (item != null && item instanceof ConnectionItem) {
                Connection connection = ((ConnectionItem) item).getConnection();
                for (org.talend.core.model.metadata.builder.connection.MetadataTable table : ConnectionHelper
                        .getTables(connection)) {
                    if (table.getLabel().equals(tableLabel)) {
                        metadataTable = ConvertionHelper.convert(table);
                        break;
                    }
                }
            }

            if (metadataTable != null) {
                realTableName = metadataTable.getTableName();
            }
        }
        getConnParameters().setDbType(type);
        if (!EDatabaseTypeName.GENERAL_JDBC.getDisplayName().equals(type)) {
            getConnParameters().setDriverClass(EDatabase4DriverClassName.getDriverClassByDbType(type));
        }
        getConnParameters().setSchemaName(QueryUtil.getTableName(getElem(), getConnParameters().getMetadataTable(),
                TalendTextUtils.removeQuotes(schema), type, realTableName));
    }

    protected void initAlternateSchema(IElement element, IContext context) {
        String schemaName = getParameterValueWithContext(element, "ALTERNATE_SCHEMA", context, null);
        if (schemaName != null && !schemaName.trim().isEmpty()) {
            getConnParameters().setSchema(schemaName);
        }
    }

    protected void initConnectionParametersWithContext(IElement element, IContext context) {

        IElementParameter basePropertyParameter = null;
        for (IElementParameter param : getElem().getElementParameters()) {
            if (param.getFieldType() == EParameterFieldType.PROPERTY_TYPE) {
                if (param.getRepositoryValue().startsWith("DATABASE")) {
                    basePropertyParameter = param;
                    break;
                }
            }
        }
        // jobsetting view load the db info from current selected category
        IElementParameter updateBasePropertyParameter = updateBasePropertyParameter();
        if (updateBasePropertyParameter != null && !updateBasePropertyParameter.equals(basePropertyParameter)) {
            basePropertyParameter = updateBasePropertyParameter;
        }
        // qli modified to fix the bug "7364".
        if (getConnParameters() == null) {
            setConnParameters(new ConnectionParameters());
        }

        String dbType = getConnParameters().getDbType();
        Object value = getElem().getPropertyValue("USE_EXISTING_CONNECTION"); //$NON-NLS-1$
        IElementParameter compList = getElem().getElementParameterFromField(EParameterFieldType.COMPONENT_LIST);
        if (value != null && (value instanceof Boolean) && ((Boolean) value) && compList != null) {
            if (getConnectionNode() == null) {
                Object compValue = compList.getValue();
                if (compValue != null && !compValue.equals("")) { //$NON-NLS-1$
                    List<? extends INode> nodes = getControllerContext().getProcess().getGeneratingNodes();

                    for (INode node : nodes) {
                        if (node.getUniqueName().equals(compValue) && (node instanceof INode)) {
                            setConnectionNode(node);
                            break;
                        }
                    }

                }
            }
            if (getConnectionNode() != null) {
                element = getConnectionNode();
            }
        }
        String dbName = getParameterValueWithContext(element, EConnectionParameterName.SID.getName(), context,
                basePropertyParameter);
        if (EDatabaseTypeName.EXASOL.getDisplayName().equals(dbType)) {
            if (dbName.contains("\\\"")) {
                dbName = dbName.replace("\\\"", "");
            }
            dbName = TextUtil.removeQuots(dbName);
        } else if (EDatabaseTypeName.GENERAL_JDBC.getDisplayName().equals(dbType)) {
            dbName = ""; //$NON-NLS-1$
        }
        boolean isJDBCImplicitContext = EDatabaseTypeName.GENERAL_JDBC.getDisplayName().equals(dbType)
                && getElem() instanceof ImplicitContextLoadElement;
        getConnParameters().setDbName(dbName);

        if ((getElem() instanceof Node)
                && (((Node) getElem()).getComponent().getComponentType().equals(EComponentType.GENERIC) || (element instanceof INode
                        && ((INode) element).getComponent().getComponentType().equals(EComponentType.GENERIC)))) {
            getConnParameters().setUserName(getParameterValueWithContext(element,
                    EConnectionParameterName.GENERIC_USERNAME.getDisplayName(), context, basePropertyParameter));
            getConnParameters().setPassword(getParameterValueWithContext(element,
                    EConnectionParameterName.GENERIC_PASSWORD.getDisplayName(), context, basePropertyParameter));
            String url = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                    EConnectionParameterName.GENERIC_URL.getDisplayName(), context, basePropertyParameter));
            getConnParameters().setUrl(url);
            String jar = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                    EConnectionParameterName.GENERIC_DRIVER_JAR.getDisplayName(), context, basePropertyParameter));
            getConnParameters().setDriverJar(jar);
            String driverClass = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                    EConnectionParameterName.GENERIC_DRIVER_CLASS.getDisplayName(), context, basePropertyParameter));
            getConnParameters().setDriverClass(driverClass);
        } else {
            IElementParameter elementParameter = element.getElementParameter("PASS");//$NON-NLS-1$
            boolean containContextParam = ContextParameterUtils.isContainContextParam(
                    (elementParameter != null && elementParameter.getValue() != null) ? elementParameter.getValue().toString()
                            : ""); //$NON-NLS-1$
            getConnParameters().setPassword(getParameterValueWithContext(element, EConnectionParameterName.PASSWORD.getName(), context,
                    basePropertyParameter), containContextParam);
            getConnParameters().setUserName(getParameterValueWithContext(element, EConnectionParameterName.USERNAME.getName(), context,
                    basePropertyParameter));
            String url = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                    EConnectionParameterName.URL.getName(), context, basePropertyParameter));
            if (StringUtils.isEmpty(url)) {
                // try to get url for oracle RAC.
                // url = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                // "RAC_" + EConnectionParameterName.URL.getName(), context));
                // Changed by Marvin Wang on Feb. 14, 2012 for bug TDI-19597. Above is the original code, below is new
                // code
                // to get the Oracle RAC url.
                if (EDatabaseTypeName.ORACLE_CUSTOM.getDisplayName().equals(dbType)) {
                    url = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                            "RAC_" + EConnectionParameterName.URL.getName(), context, basePropertyParameter));
                } else if (isJDBCImplicitContext) {
                    url = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                            EConnectionParameterName.GENERIC_URL.getDisplayName(), context, basePropertyParameter));
                }
            }
            getConnParameters().setUrl(url);
            String driverClass = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                    EConnectionParameterName.DRIVER_CLASS.getName(), context, basePropertyParameter));
            String jar = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                    EConnectionParameterName.DRIVER_JAR.getName(), context, basePropertyParameter));
            if (EDatabaseTypeName.GENERAL_JDBC.getDisplayName().equals(dbType)) {
                if (StringUtils.isEmpty(driverClass)) {
                    driverClass = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                            EConnectionParameterName.GENERIC_DRIVER_CLASS.getDisplayName(), context, basePropertyParameter));
                }
                getConnParameters().setDriverClass(driverClass);// tJDBCSCDELT
                if (StringUtils.isEmpty(jar)) {
                    jar = TalendTextUtils.removeQuotesIfExist(getParameterValueWithContext(element,
                            EConnectionParameterName.GENERIC_DRIVER_JAR.getDisplayName(), context, basePropertyParameter));
                }
            } else {
                getConnParameters().setDriverClass(EDatabase4DriverClassName.getDriverClassByDbType(dbType));
            }
            getConnParameters().setDriverJar(jar);
        }

        getConnParameters().setPort(
                getParameterValueWithContext(element, EConnectionParameterName.PORT.getName(), context, basePropertyParameter));
        getConnParameters().setSchema(
                getParameterValueWithContext(element, EConnectionParameterName.SCHEMA.getName(), context, basePropertyParameter));
        getConnParameters().setHost(getParameterValueWithContext(element, EConnectionParameterName.SERVER_NAME.getName(), context,
                basePropertyParameter));

        String dir = getParameterValueWithContext(element, EConnectionParameterName.DIRECTORY.getName(), context,
                basePropertyParameter);
        if (dbType.equals(EDatabaseTypeName.HSQLDB_IN_PROGRESS.getDisplayName())) {
            dir = getParameterValueWithContext(element, EConnectionParameterName.DBPATH.getName(), context,
                    basePropertyParameter);
        }
        if (getConnParameters().getSchema() == null || getConnParameters().getSchema().equals("")) {
            if (EDatabaseTypeName.IBMDB2.getDisplayName().equals(dbType)
                    || EDatabaseTypeName.IBMDB2ZOS.getDisplayName().equals(dbType)) {
                getConnParameters().setSchema(getParameterValueWithContext(element, EParameterName.SCHEMA_DB_DB2.getDisplayName(),
                        context, basePropertyParameter));
            }
        }
        getConnParameters().setDirectory(dir);
        getConnParameters().setHttps(Boolean.parseBoolean(
                getParameterValueWithContext(element, EConnectionParameterName.HTTPS.getName(), context, basePropertyParameter)));
        // for jdbc connection from reposiotry
        final String dbTypeByClassName = ExtractMetaDataUtils.getInstance().getDbTypeByClassName(getConnParameters().getDriverClass());
        if (getConnParameters().getDbType() == null || EDatabaseTypeName.MYSQL.getDisplayName().equals(getConnParameters().getDbType())
                && !EDatabaseTypeName.MYSQL.getProduct().equals(dbTypeByClassName)) {
            if (dbTypeByClassName != null && !"".equals(dbTypeByClassName)) {
                getConnParameters().setDbType(dbTypeByClassName);
            }
        }

        if (getConnParameters().getDbType().equals(EDatabaseTypeName.SQLITE.getXmlName())
                || getConnParameters().getDbType().equals(EDatabaseTypeName.ACCESS.getXmlName())
                || getConnParameters().getDbType().equals(EDatabaseTypeName.FIREBIRD.getXmlName())) {
            getConnParameters().setFilename(getParameterValueWithContext(element, EConnectionParameterName.FILE.getName(), context,
                    basePropertyParameter));
        }
        getConnParameters().setJdbcProperties(getParameterValueWithContext(element,
                EConnectionParameterName.PROPERTIES_STRING.getName(), context, basePropertyParameter));
        getConnParameters().setDatasource(getParameterValueWithContext(element, EConnectionParameterName.DATASOURCE.getName(), context,
                basePropertyParameter));
        EDatabaseTypeName dbtypeName = EDatabaseTypeName.getTypeFromDbType(dbType);
        if (ManagerConnection.isSchemaFromSidOrDatabase(dbtypeName)
                && (getConnParameters().getSchema() == null || getConnParameters().getSchema().length() <= 0)) {
            getConnParameters().setSchema(dbName);
        }
        if (context != null) {
            getConnParameters().setSelectContext(context.getName());
        }
    }

    private String getParameterValueWithContext(IElement elem, String key, IContext context,
            IElementParameter basePropertyParameter) {
        if (elem == null || key == null) {
            return ""; //$NON-NLS-1$
        }
        String actualKey = this.getParaNameFromRepositoryName(elem, key, basePropertyParameter);// connKeyMap.get(key);
        if (actualKey != null) {
            return fetchElementParameterValue(elem, context, actualKey);
        } else {
            return fetchElementParameterValue(elem, context, key);
        }
    }

    /**
     * DOC yexiaowei Comment method "fetchElementParameterValude".
     *
     * @param elem
     * @param context
     * @param actualKey
     * @return
     */
    private String fetchElementParameterValue(IElement elem, IContext context, String actualKey) {
        IElementParameter elemParam = elem.getElementParameter(actualKey);
        if (elemParam != null) {
            Object value = elemParam.getValue();

            if (value instanceof String) {
                return ContextParameterUtils.parseScriptContextCode((String) value, context);
            } else if (value instanceof List) {
                // for jdbc parm driver jars
                String jarValues = "";
                List list = (List) value;
                for (Object object : list) {
                    if (object instanceof Map) {
                        Map valueMap = (Map) object;
                        if (valueMap.get("JAR_NAME") != null) {
                            if (jarValues.equals("")) {
                                jarValues = jarValues + valueMap.get("JAR_NAME");
                            } else {
                                jarValues = jarValues + ";" + valueMap.get("JAR_NAME");
                            }
                        } else if (valueMap.get("drivers") != null) {
                            if (jarValues.equals("")) {
                                jarValues = jarValues + valueMap.get("drivers");
                            } else {
                                jarValues = jarValues + ";" + valueMap.get("drivers");
                            }
                        }
                    }
                }
                return ContextParameterUtils.parseScriptContextCode(jarValues, context);
            }

        }
        return "";
    }

    /**
     * DOC zli Comment method "getImplicitRepositoryId".
     *
     * @return
     */
    protected String getImplicitRepositoryId() {
        // TDI-17078:when db connection with jdbc work as the implicit context,the elem is Process intance ,it also need
        // get the ImplicitRepositoryId
        if (getElem() instanceof ImplicitContextLoadElement || getElem() instanceof Process) {
            IElementParameter implicitContext = getElem().getElementParameter("PROPERTY_TYPE_IMPLICIT_CONTEXT");
            if (implicitContext != null) {
                Map<String, IElementParameter> childParameters = implicitContext.getChildParameters();
                if (childParameters != null) {
                    if (childParameters.get("PROPERTY_TYPE").getValue().equals("REPOSITORY")) {
                        IElementParameter iElementParameter = childParameters.get("REPOSITORY_PROPERTY_TYPE");
                        if (iElementParameter != null) {
                            Object value = iElementParameter.getValue();
                            if (value != null) {
                                return value.toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * DOC zli Comment method "getStatsLogRepositoryId".
     *
     * @return
     */
    protected String getStatsLogRepositoryId() {
        if (getElem() instanceof StatsAndLogsElement || getElem() instanceof Process) {
            IElementParameter statsLogContext = getElem().getElementParameter("PROPERTY_TYPE");
            if (statsLogContext != null) {
                Map<String, IElementParameter> childParameters = statsLogContext.getChildParameters();
                if (childParameters != null) {
                    if (childParameters.get("PROPERTY_TYPE").getValue().equals("REPOSITORY")) {
                        IElementParameter iElementParameter = childParameters.get("REPOSITORY_PROPERTY_TYPE");
                        if (iElementParameter != null) {
                            Object value = iElementParameter.getValue();
                            if (value != null) {
                                return value.toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private void setHiveRelatedParams(IElement element) {
        // hive embedded model, all parameters below should not be null
        String distroKey = getValueFromRepositoryName(getElem(), "DISTRIBUTION");
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HIVE_DISTRIBUTION, distroKey);

        String distroVersion = getValueFromRepositoryName(getElem(), "HIVE_VERSION");
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HIVE_VERSION, distroVersion);

        String hiveModel = getValueFromRepositoryName(getElem(), "CONNECTION_MODE");
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HIVE_MODE, hiveModel);

        String hiveServerVersion = getValueFromRepositoryName(getElem(), "HIVE_SERVER");
        getConnParameters().getParameters().put(ConnParameterKeys.HIVE_SERVER_VERSION, hiveServerVersion);

        String nameNodeURI = getValueFromRepositoryName(element, EParameterNameForComponent.PARA_NAME_FS_DEFAULT_NAME.getName());
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_NAME_NODE_URL, nameNodeURI);

        String jobTrackerURI = getValueFromRepositoryName(element, EParameterNameForComponent.PARA_NAME_MAPRED_JT.getName());
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_JOB_TRACKER_URL, jobTrackerURI);

        // for ssl
        String useSSL = getValueFromRepositoryName(getElem(), "USE_SSL"); //$NON-NLS-1$
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_USE_SSL, useSSL);

        String trustStorePath = TalendQuoteUtils.removeQuotes(getValueFromRepositoryName(getElem(), "SSL_TRUST_STORE")); //$NON-NLS-1$
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SSL_TRUST_STORE_PATH, trustStorePath);

        String trustStorePassword = TalendQuoteUtils.removeQuotes(getValueFromRepositoryName(getElem(), "SSL_TRUST_STORE_PASSWORD")); //$NON-NLS-1$
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SSL_TRUST_STORE_PASSWORD, trustStorePassword);

        String additionalJDBCSetting = TalendQuoteUtils.removeQuotes(getValueFromRepositoryName(getElem(), "HIVE_ADDITIONAL_JDBC")); //$NON-NLS-1$
        if (StringUtils.isNotEmpty(additionalJDBCSetting)) {
            getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HIVE_ADDITIONAL_JDBC_SETTINGS,
                    additionalJDBCSetting);
        }

        String hiveEnableHa = getValueFromRepositoryName(getElem(), "ENABLE_HIVE_HA"); //$NON-NLS-1$
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HIVE_ENABLE_HA, hiveEnableHa);

        String hiveMetastoreUris = TalendQuoteUtils.removeQuotes(getValueFromRepositoryName(getElem(), "HIVE_METASTORE_URIS")); //$NON-NLS-1$
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HIVE_METASTORE_URIS, hiveMetastoreUris);

        String hiveThriftPort = TalendQuoteUtils.removeQuotes(getValueFromRepositoryName(getElem(), "THRIFTPORT")); //$NON-NLS-1$
        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HIVE_THRIFTPORT, hiveThriftPort);

    }

    /**
     * DOC nrousseau Comment method "getGuessQueryCommand".
     *
     * @return
     */
    protected QueryGuessCommand getGuessQueryCommand() {
        // Map<String, IMetadataTable> repositoryTableMap = null;
        IMetadataTable newRepositoryMetadata = null;
        String realTableName = null;
        String realTableId = null;
        String schemaName = "";

        // Only for getting the real table name.
        if (getElem().getPropertyValue(EParameterName.SCHEMA_TYPE.getName()).equals(EmfComponent.REPOSITORY)) {

            IElementParameter repositorySchemaTypeParameter = getElem()
                    .getElementParameter(EParameterName.REPOSITORY_SCHEMA_TYPE.getName());

            if (repositorySchemaTypeParameter != null) {
                final Object value = repositorySchemaTypeParameter.getValue();
                if (getElem() instanceof Node) {
                    /* value can be devided means the value like "connectionid - label" */
                    String[] keySplitValues = value.toString().split(" - ");
                    if (keySplitValues.length > 1) {

                        String connectionId = value.toString().split(" - ")[0];
                        String tableLabel = value.toString().split(" - ")[1];
                        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                        Item item = null;
                        try {
                            IRepositoryViewObject repobj = factory.getLastVersion(connectionId);
                            if (repobj != null) {
                                Property property = repobj.getProperty();
                                if (property != null) {
                                    item = property.getItem();
                                }
                            }
                        } catch (PersistenceException e) {
                            ExceptionHandler.process(e);
                        }
                        if (item != null && item instanceof ConnectionItem) {
                            Connection connection = ((ConnectionItem) item).getConnection();
                            for (org.talend.core.model.metadata.builder.connection.MetadataTable table : ConnectionHelper
                                    .getTables(connection)) {
                                // bug 20365
                                if (table.getLabel().equals(tableLabel)) {
                                    IMetadataTable repositoryMetadata = ConvertionHelper.convert(table);
                                    realTableName = repositoryMetadata.getTableName();
                                    realTableId = repositoryMetadata.getId();
                                    // if (table.eContainer() != null && table.eContainer() instanceof SchemaImpl) {
                                    // SchemaImpl schemaImpl = (SchemaImpl) table.eContainer();
                                    // schemaName = schemaImpl.getName();
                                    // dynamicProperty.getTableIdAndDbSchemaMap().put(realTableId, schemaName);
                                    // }
                                    break;
                                }
                            }
                        }
                    }
                    // if (repositoryTableMap.containsKey(value)) {
                    // IMetadataTable repositoryMetadata = repositoryTableMap.get(value);
                    // realTableName = repositoryMetadata.getTableName();
                    // realTableId = repositoryMetadata.getId();
                    // }
                }
            }
            // }
            // }
        } // Ends

        Connection repositoryConnection = null;
        boolean useExisting = false;
        IElementParameter elementParameter = getElem().getElementParameter(EParameterName.USE_EXISTING_CONNECTION.name());
        if (getElem() instanceof Node) {
            IProcess process = ((Node) getElem()).getProcess();
            if (elementParameter != null && Boolean.valueOf(String.valueOf(elementParameter.getValue()))) {
                String connName = (String) getElem().getPropertyValue("CONNECTION");
                for (INode node : process.getGraphicalNodes()) {
                    if (node.getElementName().equals(connName)) {
                        useExisting = true;
                        final Object propertyValue = node.getPropertyValue(EParameterName.REPOSITORY_PROPERTY_TYPE.getName());
                        if (propertyValue != null) {
                            IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                            Item item = null;
                            try {
                                IRepositoryViewObject repobj = factory.getLastVersion(propertyValue.toString());
                                if (repobj != null) {
                                    Property property = repobj.getProperty();
                                    if (property != null) {
                                        item = property.getItem();
                                    }
                                }
                            } catch (PersistenceException e) {
                                ExceptionHandler.process(e);
                            }
                            if (item != null && item instanceof ConnectionItem) {
                                repositoryConnection = ((ConnectionItem) item).getConnection();
                            } else {
                                initConnectionParameters();
                                repositoryConnection = TracesConnectionUtils.createConnection(getConnParameters());

                            }
                        }
                        break;
                    }
                }
            }
        }
        if (!useExisting && getElem().getPropertyValue(EParameterName.PROPERTY_TYPE.getName()).equals(EmfComponent.REPOSITORY)) {
            final Object propertyValue = getElem().getPropertyValue(EParameterName.REPOSITORY_PROPERTY_TYPE.getName());
            if (propertyValue != null) {
                IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                Item item = null;
                try {
                    IRepositoryViewObject repobj = factory.getLastVersion(propertyValue.toString());
                    if (repobj != null) {
                        Property property = repobj.getProperty();
                        if (property != null) {
                            item = property.getItem();
                        }
                    }
                } catch (PersistenceException e) {
                    ExceptionHandler.process(e);
                }
                if (item != null && item instanceof ConnectionItem) {
                    repositoryConnection = ((ConnectionItem) item).getConnection();
                }
            }
        } else {
            initConnectionParameters();
            repositoryConnection = TracesConnectionUtils.createConnection(getConnParameters());
        }

        QueryGuessCommand cmd = null;
        INode node = null;
        if (getElem() instanceof INode) {
            node = (INode) getElem();
        } else { // else instanceof Connection
            node = ((IConnection) getElem()).getSource();
        }

        List<IMetadataTable> metadataList = node.getMetadataList();
        newRepositoryMetadata = metadataList.get(0);
        // for tInformixRow
        if (newRepositoryMetadata.getListColumns().size() == 0 && metadataList.size() > 1) {
            newRepositoryMetadata = metadataList.get(1);
        }

        if (newRepositoryMetadata == null) {
            String schemaSelected = (String) node.getPropertyValue(EParameterName.REPOSITORY_SCHEMA_TYPE.getName());
            if (schemaSelected != null) {
                // repositoryMetadata = repositoryTableMap.get(schemaSelected);
            } else if (newRepositoryMetadata == null) {
                getUi().openWarning(Messages.getString("QueryTypeController.alert"), //$NON-NLS-1$
                        Messages.getString("QueryTypeController.nothingToGuess")); //$NON-NLS-1$
                return cmd;
            }
        }
        cmd = new QueryGuessCommand(node, newRepositoryMetadata, repositoryConnection);

        cmd.setMaps(getControllerContext().getTableIdAndDbTypeMap(), getControllerContext().getTableIdAndDbSchemaMap(), null);
        String type = getValueFromRepositoryName("TYPE"); //$NON-NLS-1$
        if ("Oracle".equalsIgnoreCase(type)) {
            type = EDatabaseTypeName.ORACLEFORSID.getDisplayName();
        }
        cmd.setParameters(realTableId, realTableName, type);
        return cmd;
    }

    protected void initConnectionParameters() {

        setConnParameters(null);

        IElementParameter basePropertyParameter = null;
        for (IElementParameter param : getElem().getElementParameters()) {
            if (param.getFieldType() == EParameterFieldType.PROPERTY_TYPE) {
                if (param.getRepositoryValue().startsWith("DATABASE")) {
                    basePropertyParameter = param;
                    break;
                }
            }
        }
        // jobsetting view load the db info from current selected category
        IElementParameter updateBasePropertyParameter = updateBasePropertyParameter();
        if (updateBasePropertyParameter != null && !updateBasePropertyParameter.equals(basePropertyParameter)) {
            basePropertyParameter = updateBasePropertyParameter;
        }
        setConnParameters(new ConnectionParameters());
        String type = getValueFromRepositoryName(getElem(), "TYPE", basePropertyParameter); //$NON-NLS-1$
        Object isUseExistingConnection = getElem().getPropertyValue("USE_EXISTING_CONNECTION"); //$NON-NLS-1$
        boolean isUserExistionConnectionType = false;
        if (type.equals("Oracle") || type.contains("OCLE")) {
            IElementParameter ele = getElem().getElementParameter("CONNECTION_TYPE");
            if (ele != null) {
                type = (String) ele.getValue();
            } else {
                type = "ORACLE_SID"; //$NON-NLS-1$
            }
            if ((isUseExistingConnection instanceof Boolean) && ((Boolean) isUseExistingConnection)) {
                isUserExistionConnectionType = true;
            }
        } else if (EDatabaseTypeName.HIVE.getProduct().equalsIgnoreCase(type)) {
            // if (EDatabaseVersion4Drivers.HIVE_EMBEDDED.getVersionValue().equals(
            // elem.getElementParameter("CONNECTION_MODE").getValue())) {
            setHiveRelatedParams(getElem());
            // }
        } else if (EDatabaseTypeName.IMPALA.getProduct().equalsIgnoreCase(type)) {
            String distroKey = getValueFromRepositoryName(getElem(), "DISTRIBUTION");
            getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_IMPALA_DISTRIBUTION, distroKey);

            String distroVersion = getValueFromRepositoryName(getElem(), "IMPALA_VERSION");
            getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_IMPALA_VERSION, distroVersion);
        } else if (EDatabaseTypeName.REDSHIFT.getDisplayName().equalsIgnoreCase(type)
                || EDatabaseTypeName.REDSHIFT_SSO.getDisplayName().equalsIgnoreCase(type)) {
            String driverVersion = getValueFromRepositoryName(getElem(), "DRIVER_VERSION", basePropertyParameter); //$NON-NLS-1$
            getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_REDSHIFT_DRIVER, driverVersion);
            if (ERedshiftDriver.DRIVER_V2.name().equalsIgnoreCase(driverVersion)) {
                IElementParameter entryPropertiesParam = getElem().getElementParameter("ENTRY_PROPERTIES");
                if (entryPropertiesParam != null) {
                    Object value = entryPropertiesParam.getValue();
                    if (value != null && value instanceof List) {
                        List<Map<String, Object>> entryProperties = (List<Map<String, Object>>) value;
                        getConnParameters().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_REDSHIFT_PARATABLE,
                                ConvertionHelper.getEntryPropertiesString(entryProperties));
                    }
                }
            }
        }
        // Get real hsqldb type
        if (type.equals(EDatabaseTypeName.HSQLDB.name())
                && getValueFromRepositoryName(getElem(), "RUNNING_MODE").equals("HSQLDB_INPROGRESS_PERSISTENT")) {//$NON-NLS-1$
            type = EDatabaseTypeName.HSQLDB_IN_PROGRESS.getDisplayName();
        }
        getConnParameters().setDbType(type);

        String driverName = getValueFromRepositoryName(getElem(), "DB_VERSION", basePropertyParameter); //$NON-NLS-1$
        if (StringUtils.isBlank(driverName) && EDatabaseTypeName.MSSQL.getDisplayName().equals(getConnParameters().getDbType())) {
            driverName = getValueFromRepositoryName(getElem(), "DRIVER", basePropertyParameter); //$NON-NLS-1$
        }
        String dbVersionName = EDatabaseVersion4Drivers.getDbVersionName(type, driverName);
        if (EDatabaseTypeName.HIVE.getProduct().equalsIgnoreCase(type)) {
            IElementParameter connectionMode = getElem().getElementParameter("CONNECTION_MODE");
            if (connectionMode != null
                    && EDatabaseVersion4Drivers.HIVE_EMBEDDED.getVersionValue().equals(connectionMode.getValue())) {
                getConnParameters().setDbVersion(EDatabaseVersion4Drivers.HIVE_EMBEDDED.getVersionValue());
            } else {
                getConnParameters().setDbVersion(EDatabaseVersion4Drivers.HIVE.getVersionValue());
            }
        } else {
            getConnParameters().setDbVersion(dbVersionName);
        }

        getConnParameters().setNode(getElem());
        String selectedComponentName = (String) getElem().getPropertyValue(EParameterName.UNIQUE_NAME.getName());
        getConnParameters().setSelectedComponentName(selectedComponentName);
        getConnParameters().setFieldType(getParamFieldType());
        if (getElem() instanceof Node && !((Node) getElem()).getMetadataList().isEmpty()) {
            getConnParameters().setMetadataTable(((Node) getElem()).getMetadataList().get(0));
        }

        getConnParameters()
                .setSchemaRepository(EmfComponent.REPOSITORY.equals(getElem().getPropertyValue(EParameterName.SCHEMA_TYPE.getName())));
        getConnParameters().setFromDBNode(true);

        getConnParameters().setQuery(""); //$NON-NLS-1$

        List<? extends IElementParameter> list = getElem().getElementParameters();
        boolean end = false;
        for (int i = 0; i < list.size() && !end; i++) {
            IElementParameter param = list.get(i);
            if (param.getFieldType() == EParameterFieldType.MEMO_SQL) {
                getConnParameters().setNodeReadOnly(param.isReadOnly());
                end = true;
            }

        }

        IElementParameter compList = getElem().getElementParameterFromField(EParameterFieldType.COMPONENT_LIST);
        if (isUseExistingConnection != null && (isUseExistingConnection instanceof Boolean) && ((Boolean) isUseExistingConnection)
                && compList != null) {
            Object compValue = compList.getValue();

            if (compValue != null && !compValue.equals("")) { //$NON-NLS-1$
                List<? extends INode> nodes = getControllerContext().getProcess().getGraphicalNodes();
                for (INode node : nodes) {
                    if (node.getUniqueName().equals(compValue) && (node instanceof Node)) {
                        setConnectionNode(node);
                        break;
                    }
                }
                if (getConnectionNode() == null) {
                    nodes = getControllerContext().getProcess().getGeneratingNodes();
                    for (INode node : nodes) {
                        if (node.getUniqueName().equals(compValue) && (node instanceof INode)) {
                            setConnectionNode(node);
                            break;
                        }
                    }
                }
                if (getConnectionNode() == null) {
                    INode node = null;
                    if (getElem() instanceof INode) {
                        node = (INode) getElem();
                    } else { // else instanceof Connection
                        node = ((IConnection) getElem()).getSource();
                    }
                    if (node != null) {
                        List<IMultipleComponentManager> multipleComponentManagers = node.getComponent()
                                .getMultipleComponentManagers();
                        for (IMultipleComponentManager manager : multipleComponentManagers) {
                            String inName = manager.getInput().getName();
                            String componentValue = compValue + "_" + inName;
                            for (INode gnode : nodes) {
                                if (gnode.getUniqueName().equals(componentValue) && (gnode instanceof INode)) {
                                    setConnectionNode(gnode);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (getConnectionNode() != null) {
                    if (isUserExistionConnectionType) {
                        IElementParameter ele = getConnectionNode().getElementParameter("CONNECTION_TYPE");
                        if (ele != null) {
                            type = (String) ele.getValue();
                            if ("ORACLE_RAC".equals(ele.getValue())) {
                                type = "ORACLE_CUSTOM";
                            }
                        }
                    }
                    setAllConnectionParameters(type, getConnectionNode());
                }
            }
        } else {
            setAllConnectionParameters(null, getElem());
        }

        if (getConnectionNode() != null) {
            setConnectionParameterNames(getConnectionNode(), getConnParameters(), basePropertyParameter);
        } else {
            setConnectionParameterNames(getElem(), getConnParameters(), basePropertyParameter);
        }
    }

    protected boolean checkExistConnections(IMetadataConnection metadataConnection) {
        java.sql.Connection connection = null;
        try {
            List list = new ArrayList();
            list = ExtractMetaDataUtils.getInstance().connect(metadataConnection.getDbType(), metadataConnection.getUrl(),
                    metadataConnection.getUsername(), metadataConnection.getPassword(), metadataConnection.getDriverClass(),
                    metadataConnection.getDriverJarPath(), metadataConnection.getDbVersionString(),
                    metadataConnection.getAdditionalParams(), metadataConnection.isSupportNLS());
            if (list != null && list.size() > 0) {
                for (Object element : list) {
                    if (element instanceof Connection) {
                        connection = (java.sql.Connection) element;
                    }
                }
            }
        } catch (SQLException e) {
            return false;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                //
            }
        }
        return true;
    }

    protected boolean isConnectionExist() {

        ISQLBuilderService service = null;
        if (GlobalServiceRegister.getDefault().isServiceRegistered(ISQLBuilderService.class)) {
            service = GlobalServiceRegister.getDefault().getService(ISQLBuilderService.class);
        }
        if (service == null) {
            return false;
        }

        if (getContextManager() != null && getContextManager().getDefaultContext().getContextParameterList().size() != 0) {
            initConnectionParametersWithContext(getElem(), getContextManager().getDefaultContext());
        }
        DatabaseConnection connection = service.createConnection(getConnParameters());
        if (connection != null) {
            IMetadataConnection metadataConnection = null;
            metadataConnection = ConvertionHelper.convert(connection);
            return checkExistConnections(metadataConnection);
        }
        return false;
    }

    private void setConnectionParameterNames(IElement element, ConnectionParameters connParameters,
            IElementParameter basePropertyParameter) {

        addConnectionParameter(element, connParameters, EConnectionParameterName.SCHEMA.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.USERNAME.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.PASSWORD.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.SERVER_NAME.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.PORT.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.DATASOURCE.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.SID.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.FILE.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.DIRECTORY.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.URL.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.DRIVER_CLASS.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.DRIVER_JAR.getName(), basePropertyParameter);

        addConnectionParameter(element, connParameters, EConnectionParameterName.PROPERTIES_STRING.getName(),
                basePropertyParameter);

    }

    private void addConnectionParameter(IElement element, ConnectionParameters connParameters, String repositoryName,
            IElementParameter basePropertyParameter) {
        final String paraNameFromRepositoryName = getParaNameFromRepositoryName(element, repositoryName, basePropertyParameter);
        if (paraNameFromRepositoryName != null) {
            connParameters.getRepositoryNameParaName().put(repositoryName, paraNameFromRepositoryName);
        }
    }

    /**
     *
     * DOC ggu Comment method "isExtra".
     *
     * for extra db setting.
     */
    private boolean sameExtraParameter(IElementParameter param) {
        // for job settings extra.(feature 2710)
        if (getCurParameter() != null) {
            boolean extra = JobSettingsConstants.isExtraParameter(this.getCurParameter().getName());
            boolean paramFlag = JobSettingsConstants.isExtraParameter(param.getName());
            return extra == paramFlag;
        }
        return true;
    }

    protected boolean isUseExistingConnection() {
        IElementParameter elementParameter = getElem().getElementParameter(EParameterName.USE_EXISTING_CONNECTION.getName());
        if (elementParameter != null) {
            Boolean value = (Boolean) elementParameter.getValue();
            return value;
        }
        return false;
    }

    protected boolean isUseAlternateSchema() {
        IElementParameter elementParameter = getElem().getElementParameter("USE_ALTERNATE_SCHEMA");
        if (elementParameter != null) {
            Boolean value = (Boolean) elementParameter.getValue();
            return value;
        }
        return false;
    }


    /**
     * DOC qzhang Comment method "openSQLBuilder".
     *
     * @param repositoryType
     * @param propertyName
     * @param query
     */
    protected String openSQLBuilder(String repositoryType, String propertyName, String query, IContext context) {
        if (repositoryType.equals(EmfComponent.BUILTIN)) {
            getConnParameters().setQuery(query, true);
            if (getConnParameters().isShowConfigParamDialog()) {
                if (!isUseExistingConnection()) {
                    initConnectionParametersWithContext(getElem(), context);
                } else {
                    initConnectionParametersWithContext(getConnectionNode(), context);
                }
            }
            // add for bug TDI-20335
            if (isInWizard()) {
                getUi().openSqlBuilder(getConnParameters());
            } else {
                openSqlBuilderBuildIn(getConnParameters(), propertyName);
            }

        } else if (repositoryType.equals(EmfComponent.REPOSITORY)) {
            String repositoryName2 = ""; //$NON-NLS-1$
            String repositoryId = null;
            IElementParameter memoParam = getElem().getElementParameter(propertyName);
            IElementParameter repositoryParam = null;
            for (IElementParameter param : getElem().getElementParameters()) {
                if (param.getFieldType() == EParameterFieldType.PROPERTY_TYPE
                        && param.getRepositoryValue().startsWith("DATABASE")) {
                    if (memoParam != null && param.getCategory().equals(memoParam.getCategory())) {
                        repositoryParam = param;
                        break;
                    }

                }
            }
            // in case no database property found, take the first property (to keep compatibility with old code)
            if (repositoryParam == null) {
                for (IElementParameter param : getElem().getElementParameters()) {
                    if (param.getFieldType() == EParameterFieldType.PROPERTY_TYPE) {
                        repositoryParam = param;
                        break;
                    }
                }
            }

            if (repositoryParam != null) {
                IElementParameter itemFromRepository = repositoryParam.getChildParameters()
                        .get(EParameterName.REPOSITORY_PROPERTY_TYPE.getName());
                String value = (String) itemFromRepository.getValue();
                repositoryId = value;
                // for (String key : this.dynamicProperty.getRepositoryConnectionItemMap().keySet()) {
                // if (key.equals(value)) {
                // repositoryName2 =
                // this.dynamicProperty.getRepositoryConnectionItemMap().get(key).getProperty().getLabel();
                // }
                // }
                /* get connection item dynamictly,not from cache ,see 16969 */
                IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                try {
                    IRepositoryViewObject repobj = factory.getLastVersion(value);
                    if (repobj != null) {
                        Property property = repobj.getProperty();
                        if (property != null) {
                            repositoryName2 = property.getLabel();
                        }
                    }
                } catch (PersistenceException e) {
                    ExceptionHandler.process(e);
                }
            }
            // When no repository avaiable on "Repository" mode, open a MessageDialog.
            if (repositoryName2 == null || repositoryName2.length() == 0) {
                getUi().openError(Messages.getString("NoRepositoryDialog.Title"), Messages.getString("NoRepositoryDialog.Text"));
                return null;
            }

            // Part maybe not exist
            String processName = "";//$NON-NLS-1$
            String key = "";//$NON-NLS-1$

            if (getElem() instanceof Node) {
                processName = ((Node) getElem()).getProcess().getName();
                key = processName + ((Node) getElem()).getUniqueName();
            } else if (getElem() instanceof IProcess) {
                processName = ((IProcess) getElem()).getName();
                key = processName;
            }
            key += repositoryName2;

            return getUi().openSqlBuilder(getElem(), getConnParameters(), key, repositoryName2, repositoryId, processName, query);
        }
        return null;
    }

    public void openSqlBuilderBuildIn(final ConnectionParameters connParameters, final String propertyName) {
        getUi().openSqlBuilderBuildIn(connParameters, propertyName);
    }

    public Command changeToBuildInCommand(String curSubParam) {
        final String typeName = ":" + EParameterName.PROPERTY_TYPE.getName(); //$NON-NLS-1$

        if (getCurParameter() != null) {
            String parentName = null;
            if (getCurParameter().getCategory() == EComponentCategory.EXTRA) {
                parentName = JobSettingsConstants.getExtraParameterName(EParameterName.PROPERTY_TYPE.getName());
            } else if (getCurParameter().getCategory() == EComponentCategory.STATSANDLOGS) {
                parentName = EParameterName.PROPERTY_TYPE.getName();
            }
            if (parentName != null) {
                return new ChangeValuesFromRepository(getElem(), null, parentName + typeName, EmfComponent.BUILTIN);
            }
        }
        String property = null;
        if (curSubParam != null && getElem() != null) {
            if (!curSubParam.isEmpty()) {
                IElementParameter iElementParam = getElem().getElementParameter(curSubParam);
                if (iElementParam != null) {
                    property = iElementParam.getRepositoryProperty();
                }
            }
        }
        if (property == null || property.trim().isEmpty()) {
            property = UpgradeParameterHelper.PROPERTY;
        }
        return new ChangeValuesFromRepository(getElem(), null, property + typeName, EmfComponent.BUILTIN);
    }

    public Command refreshConnectionCommand(String paramName) {
        if (paramName != null) {

            IElementParameter param = getElem().getElementParameter(paramName);
            String propertyParamName = null;
            if (param.getRepositoryProperty() != null) {
                propertyParamName = param.getRepositoryProperty();
            } else {
                propertyParamName = getElem().getElementParameterFromField(EParameterFieldType.PROPERTY_TYPE).getName();
            }
            final IElementParameter propertyParam = getElem().getElementParameter(propertyParamName);

            if (propertyParam != null) {
                final IElementParameter repositoryParam = propertyParam.getChildParameters()
                        .get(EParameterName.REPOSITORY_PROPERTY_TYPE.getName());
                if (repositoryParam != null) {
                    try {
                        IRepositoryViewObject o = RepositoryPlugin.getDefault().getRepositoryService().getProxyRepositoryFactory()
                                .getLastVersion((String) repositoryParam.getValue());
                        // for bug 14535
                        if (o != null && getElem() instanceof INode) {
                            INode node = (INode) getElem();
                            IMetadataService metadataService = CorePlugin.getDefault().getMetadataService();
                            if (metadataService != null) {
                                metadataService.openMetadataConnection(o, node);
                            }
                            // TDI-21143 : Studio repository view : remove all refresh call to repo view
                            // IRepositoryView view = RepositoryManagerHelper.findRepositoryView();
                            // if (view != null) {
                            // view.refresh();
                            // }
                        }
                    } catch (Exception e) {
                        ExceptionHandler.process(e);
                    }
                }
            }
        }
        return null;
    }

    private IElementParameter updateBasePropertyParameter() {
        if (EComponentCategory.EXTRA.equals(getSection())) {
            return getElem().getElementParameter("PROPERTY_TYPE_IMPLICIT_CONTEXT"); //$NON-NLS-1$
        }
        if (EComponentCategory.STATSANDLOGS.equals(getSection())) {
            return getElem().getElementParameter("PROPERTY_TYPE"); //$NON-NLS-1$
        }
        return null;
    }

    protected void callBeforeActive(IElementParameter param) {
        IGenericService service = null;
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericService.class)) {
            service = GlobalServiceRegister.getDefault().getService(IGenericService.class);
        }
        if (service != null) {
            service.callBeforeActivate(param);
        }
    }

    protected boolean canAddRepositoryDecoration(IElementParameter param) {
        return !(getElem() instanceof FakeElement) && param.isRepositoryValueUsed();
    }

    protected void updatePromptParameter(IElementParameter parameter) {
        IElement element = parameter.getElement();
        if (isInWizard()) {
            ConnectionItem connItem = getUi().getConnectionItem();
            if (connItem == null) {
                return;
            }
            Connection conn = connItem.getConnection();
            if (!conn.isContextMode()) {
                return;
            }
            JavaSqlFactory.clearPromptContextCache();
            Connection connection = MetadataConnectionUtils.prepareConection(conn);
            if (connection == null) {
                return;
            }
            ConnectionContextHelper.context = ConnectionContextHelper.getContextTypeForContextMode(connection,
                    connection.getContextName(), false);
            List<? extends IElementParameter> params = getPromptParameters(element);
            for (IElementParameter param : params) {
                Object paramValue = param.getValue();
                if (paramValue != null && !"".equals(paramValue)) { //$NON-NLS-1$
                    String value = JavaSqlFactory.getReportPromptConValueFromCache(connection.getContextName(),
                            connection.getContextId(), paramValue.toString());
                    if (StringUtils.isNotBlank(value)) {
                        getPromptParameterMap().put(param.getName(), paramValue.toString());
                        getElem().setPropertyValue(param.getName(), value);
                    }
                }
            }
        } else {
            IContext selectContext = null;
            IProcess2 process = getControllerContext().getProcess();
            if (process != null) {
                selectContext = process.getContextManager().getDefaultContext();
            }
            if (GlobalServiceRegister.getDefault().isServiceRegistered(IRunProcessService.class) && process != null) {
                IRunProcessService service = GlobalServiceRegister.getDefault().getService(IRunProcessService.class);
                Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
                selectContext = service.promptConfirmLauch(shell, process);
                if (selectContext == null) {
                    return;
                }
                Map<String, String> promptNeededMap = new HashMap<String, String>();
                for (IContextParameter contextParameter : selectContext.getContextParameterList()) {
                    if (contextParameter.isPromptNeeded()) {
                        String name = contextParameter.getName();
                        String value = contextParameter.getValue();
                        if (StringUtils.isNotBlank(value)) {
                            promptNeededMap.put("context." + name, value);//$NON-NLS-1$
                        }
                    }
                }
                List<? extends IElementParameter> params = getPromptParameters(element);
                for (IElementParameter param : params) {
                    Object paramValue = param.getValue();
                    if (paramValue != null && !"".equals(paramValue)) { //$NON-NLS-1$
                        if (promptNeededMap.containsKey(paramValue)) {
                            getPromptParameterMap().put(param.getName(), paramValue.toString());
                            getElem().setPropertyValue(param.getName(), promptNeededMap.get(paramValue));
                        }
                    }
                }
            }
        }
    }

    protected void resetPromptParameter() {
        Iterator<String> iter = getPromptParameterMap().keySet().iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            String value = getPromptParameterMap().get(key);
            getElem().setPropertyValue(key, value);
        }
    }

    protected List<? extends IElementParameter> getPromptParameters(IElement element) {
        return element.getElementParameters();
    }
}
