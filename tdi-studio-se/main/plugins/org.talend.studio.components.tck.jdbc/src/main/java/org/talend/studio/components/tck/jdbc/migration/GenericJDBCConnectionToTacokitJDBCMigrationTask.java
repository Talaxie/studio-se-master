package org.talend.studio.components.tck.jdbc.migration;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.components.api.properties.ComponentProperties;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.connection.TacokitDatabaseConnection;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.TacokitDatabaseConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.cwm.helper.ResourceHelper;
import org.talend.daikon.NamedThing;
import org.talend.daikon.properties.Properties;
import org.talend.daikon.serialize.SerializerDeserializer;
import org.talend.sdk.component.server.front.model.ConfigTypeNode;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel.BuiltInKeys;

public class GenericJDBCConnectionToTacokitJDBCMigrationTask extends AbstractItemMigrationTask {

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.migration.IMigrationTask#getOrder()
     */
    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 7, 11, 12, 0, 0);
        return gc.getTime();
    }

    @Override
    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
        toReturn.add(ERepositoryObjectType.JDBC);
        toReturn.add(ERepositoryObjectType.METADATA_CONNECTIONS);
        return toReturn;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.migration.IProjectMigrationTask#execute(org.talend.core.model.general.Project,
     * org.talend.core.model.properties.Item)
     */
    @Override
    public ExecutionResult execute(Item item) {
        if (item instanceof DatabaseConnectionItem) {
            ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
            DatabaseConnectionItem connectionItem = (DatabaseConnectionItem) item;
            DatabaseConnection connection = (DatabaseConnection) connectionItem.getConnection();
            String dbType = connection.getDatabaseType();
            if (dbType == null || !dbType.equals("JDBC")) {
                return ExecutionResult.NOTHING_TO_DO;
            }
            TacokitDatabaseConnection tacokitDatabaseConnection = ConnectionFactory.eINSTANCE.createTacokitDatabaseConnection();
            TacokitDatabaseConnectionItem tacokitDatabaseConnectionItem = PropertiesFactory.eINSTANCE
                    .createTacokitDatabaseConnectionItem();
            tacokitDatabaseConnectionItem.setConnection(tacokitDatabaseConnection);
            tacokitDatabaseConnectionItem.setFileExtension(item.getFileExtension());
            tacokitDatabaseConnectionItem.setParent(item.getParent());
            Property property = PropertiesFactory.eINSTANCE.createProperty();
            tacokitDatabaseConnectionItem.setProperty(property);

            property.setAuthor(item.getProperty().getAuthor());
            property.setCreationDate(item.getProperty().getCreationDate());
            property.setDescription(item.getProperty().getDescription());
            property.setDisplayName(item.getProperty().getDisplayName());
            property.setId(item.getProperty().getId());
            property.setItem(tacokitDatabaseConnectionItem);
            property.setLabel(item.getProperty().getLabel());
            property.setMaxInformationLevel(item.getProperty().getMaxInformationLevel());
            property.setModificationDate(item.getProperty().getModificationDate());
            property.setOldStatusCode(item.getProperty().getOldStatusCode());
            property.setPurpose(item.getProperty().getPurpose());
            property.setStatusCode(item.getProperty().getStatusCode());
            property.setVersion(item.getProperty().getVersion());
            property.getAdditionalProperties().addAll(item.getProperty().getAdditionalProperties());
            item.getProperty().getAdditionalProperties().clear();

            tacokitDatabaseConnection.getProperties().putAll(connection.getProperties());
            tacokitDatabaseConnection.setDbmsId(connection.getDbmsId());
            tacokitDatabaseConnection.setURL(connection.getURL());
            tacokitDatabaseConnection.setDatabaseType(connection.getDatabaseType());
            
            String driverPath = connection.getDriverJarPath();
            String properties = connection.getCompProperties();
            if (properties != null) {
                SerializerDeserializer.Deserialized<ComponentProperties> d = Properties.Helper
                        .fromSerializedPersistent(connection.getCompProperties(), ComponentProperties.class);
                ComponentProperties compProperties = d.object;
                if (compProperties != null) {
                    NamedThing nt = compProperties.getProperty("connection.driverTable.drivers");
                    if (nt != null) {
                        if (nt instanceof org.talend.daikon.properties.property.Property) {
                            Object storedValue = org.talend.daikon.properties.property.Property.class.cast(nt).getStoredValue();
                            if (storedValue != null) {
                                if (storedValue instanceof List) {
                                    StringBuffer sb = new StringBuffer();
                                    for (Object obj : (List) storedValue) {
                                        if (sb.length() > 0) {
                                            sb.append(";");
                                        }
                                        sb.append(obj);
                                    }
                                    driverPath = sb.toString();
                                } else {
                                    driverPath = storedValue.toString();
                                }
                            }
                        }
                    }
                }
            }
            if (connection.isContextMode()) {
                tacokitDatabaseConnection.setDriverJarPath(driverPath);
            } else {
                StringBuffer newPathSB = new StringBuffer();
                if (driverPath != null) {
                    String[] values = driverPath.split(";");
                    for (String v : values) {
                        if (newPathSB.length() > 0) {
                            newPathSB.append(";");
                        }
                        if (v.startsWith("\"") && v.endsWith("\"")) {
                            newPathSB.append(v);
                        } else {
                            newPathSB.append("\"").append(v).append("\"");
                        }
                    }
                } 
                tacokitDatabaseConnection.setDriverJarPath(newPathSB.toString());
            }
            
            tacokitDatabaseConnection.setDriverClass(connection.getDriverClass());
            tacokitDatabaseConnection.setUsername(connection.getUsername());
            tacokitDatabaseConnection.setPassword(connection.getPassword());
            tacokitDatabaseConnection.setProductId(connection.getProductId());
            ConfigTypeNode configNode = Lookups.taCoKitCache().findDatastoreConfigTypeNodeByName("JDBC");
            tacokitDatabaseConnection.getProperties().put(BuiltInKeys.TACOKIT_CONFIG_ID, configNode.getId());
            tacokitDatabaseConnection.getProperties().put(BuiltInKeys.TACOKIT_CONFIG_PARENT_ID, configNode.getParentId());

            tacokitDatabaseConnection.setCdcConns(connection.getCdcConns());
            connection.setCdcConns(null);
            tacokitDatabaseConnection.setCdcTypeMode(connection.getCdcTypeMode());
            tacokitDatabaseConnection.setContextId(connection.getContextId());
            tacokitDatabaseConnection.setContextMode(connection.isContextMode());
            tacokitDatabaseConnection.setContextName(connection.getContextName());
            tacokitDatabaseConnection.setAdditionalParams(connection.getAdditionalParams());
            tacokitDatabaseConnection.setDatasourceName(connection.getDatasourceName());
            tacokitDatabaseConnection.setDBRootPath(connection.getDBRootPath());
            tacokitDatabaseConnection.setDbVersionString(connection.getDbVersionString());
            tacokitDatabaseConnection.setDivergency(connection.isDivergency());
            tacokitDatabaseConnection.setFileFieldName(connection.getFileFieldName());
            
            // Port is no used for JDBC since it use URL to connect to db. comment this line for TUP-40224
//            tacokitDatabaseConnection.setPort(connection.getPort());
            tacokitDatabaseConnection.setUiSchema(connection.getUiSchema());
            tacokitDatabaseConnection.setServerName(connection.getServerName());
            tacokitDatabaseConnection.setSID(connection.getSID());
            tacokitDatabaseConnection.setComment(connection.getComment());

            tacokitDatabaseConnection.setId(connection.getId());
            tacokitDatabaseConnection.setLabel(connection.getLabel());
            tacokitDatabaseConnection.setNullChar(connection.getNullChar());
            tacokitDatabaseConnection.setProductId(connection.getProductId());
            tacokitDatabaseConnection.setSqlSynthax(connection.getSqlSynthax());
            tacokitDatabaseConnection.setStandardSQL(connection.isStandardSQL());
            tacokitDatabaseConnection.setStringQuote(connection.getStringQuote());
            tacokitDatabaseConnection.setSynchronised(connection.isSynchronised());
            tacokitDatabaseConnection.setSystemSQL(connection.isSystemSQL());
            tacokitDatabaseConnection.setVersion(connection.getVersion());
            tacokitDatabaseConnection.setReadOnly(connection.isReadOnly());
            tacokitDatabaseConnection.setName(connection.getName());
            tacokitDatabaseConnection.setNamespace(connection.getNamespace());
            connection.setNamespace(null);

            tacokitDatabaseConnection.setIsCaseSensitive(connection.isIsCaseSensitive());
            tacokitDatabaseConnection.setMachine(connection.getMachine());
            connection.setMachine(null);
            tacokitDatabaseConnection.setPathname(connection.getPathname());
            //tacokitDatabaseConnection.setPort(connection.getPort());
            tacokitDatabaseConnection.setQueries(connection.getQueries());
            connection.setQueries(null);
            
            tacokitDatabaseConnection.setStereotype(connection.getStereotype());
            connection.setStereotype(null);
            
            tacokitDatabaseConnection.setSupportNLS(connection.isSupportNLS());

            tacokitDatabaseConnection.getDataPackage().addAll(connection.getDataPackage());
            connection.getDataPackage().clear();
            
            tacokitDatabaseConnection.getConstraint().addAll(connection.getConstraint());
            connection.getConstraint().clear();
            
            tacokitDatabaseConnection.getChangeRequest().addAll(connection.getChangeRequest());
            connection.getChangeRequest().clear();
            
            tacokitDatabaseConnection.getClientDependency().addAll(connection.getClientDependency());
            connection.getClientDependency().clear();
            
            tacokitDatabaseConnection.getDataManager().addAll(connection.getDataManager());
            connection.getDataManager().clear();
            
            tacokitDatabaseConnection.getDasdlProperty().addAll(connection.getDasdlProperty());
            connection.getDasdlProperty().clear();
            
            tacokitDatabaseConnection.getDeployedSoftwareSystem().addAll(connection.getDeployedSoftwareSystem());
            connection.getDeployedSoftwareSystem().clear();
            
            tacokitDatabaseConnection.getDescription().addAll(connection.getDescription());
            connection.getDescription().clear();
            
            tacokitDatabaseConnection.getDocument().addAll(connection.getDocument());
            connection.getDocument().clear();
            
            tacokitDatabaseConnection.getElementNode().addAll(connection.getElementNode());
            connection.getElementNode().clear();
            
            tacokitDatabaseConnection.getImportedElement().addAll(connection.getImportedElement());
            connection.getImportedElement().clear();
            
            tacokitDatabaseConnection.getImporter().addAll(connection.getImporter());
            connection.getImporter().clear();
            
            tacokitDatabaseConnection.getMeasurement().addAll(connection.getMeasurement());
            connection.getMeasurement().clear();
            
            tacokitDatabaseConnection.getOwnedElement().addAll(connection.getOwnedElement());
            connection.getOwnedElement().clear();
            
            tacokitDatabaseConnection.getParameters().addAll(connection.getParameters());
            connection.getParameters().clear();
            
            tacokitDatabaseConnection.getRenderedObject().addAll(connection.getRenderedObject());
            connection.getRenderedObject().clear();
            
            tacokitDatabaseConnection.getResourceConnection().addAll(connection.getResourceConnection());
            connection.getResourceConnection().clear();
            
            tacokitDatabaseConnection.getResponsibleParty().addAll(connection.getResponsibleParty());
            connection.getResponsibleParty().clear();
            
            tacokitDatabaseConnection.getSupplierDependency().addAll(connection.getSupplierDependency());
            connection.getSupplierDependency().clear();
            
            tacokitDatabaseConnection.getTaggedValue().addAll(connection.getTaggedValue());
            connection.getTaggedValue().clear();
            
            tacokitDatabaseConnection.getVocabularyElement().addAll(connection.getVocabularyElement());
            connection.getVocabularyElement().clear();
            
            tacokitDatabaseConnection.setEnableDBType(false);

            if (connection.isSetSQLMode()) {
                tacokitDatabaseConnection.setSQLMode(connection.isSQLMode());
            } else {
                // set true by default as it's only used actually for teradata.
                // should be modified if default value is changed later.
                tacokitDatabaseConnection.setSQLMode(true);
            }
            try {
                String oldUUID = ResourceHelper.getUUID(connection);
                factory.save(item, true); // Save old item first to avoid resource release
                IRepositoryViewObject object = factory.getSpecificVersion(item.getProperty().getId(),
                        item.getProperty().getVersion(), true);
                factory.deleteObjectPhysical(object); // Delete old item 
                factory.create(tacokitDatabaseConnectionItem, new Path(item.getState().getPath()), true); // Create new item
                ResourceHelper.setUUid(tacokitDatabaseConnection, oldUUID); // Set UUID and re-save to keep save UUID
                factory.save(tacokitDatabaseConnectionItem, true);
                return ExecutionResult.SUCCESS_NO_ALERT;
            } catch (Exception e) {
                ExceptionHandler.process(e); 
                return ExecutionResult.FAILURE;
            }
        }

        return ExecutionResult.NOTHING_TO_DO;

    }
}
