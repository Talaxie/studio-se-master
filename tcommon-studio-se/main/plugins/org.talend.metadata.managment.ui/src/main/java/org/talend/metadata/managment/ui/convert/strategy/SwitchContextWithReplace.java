// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.metadata.managment.ui.convert.strategy;

import org.apache.log4j.Logger;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ITDQRepositoryService;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.database.conn.DatabaseConnStrUtil;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.connection.FileConnection;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.cwm.helper.CatalogHelper;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.cwm.helper.SchemaHelper;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;

import orgomg.cwm.resource.relational.Catalog;
import orgomg.cwm.resource.relational.Schema;

/**
 * default strategy work for except generic jdbc
 */
public class SwitchContextWithReplace extends AbstractSwitchContextStrategy {

    private static Logger log = Logger.getLogger(SwitchContextWithReplace.class);



    @Override
    public boolean updateContextGroup(ConnectionItem connItem, String selectedContext, String originalContext,
            boolean... isMigrationTask) {
        if (connItem == null) {
            return false;
        }
        Connection con = connItem.getConnection();
        // MOD msjian 2012-2-13 TDQ-4559: make it support file/mdm connection
        if (con != null) {
            // TDQ-4559~
            String oldContextName = originalContext == null ? con.getContextName() : originalContext;

            String newContextName = selectedContext;
            if (newContextName == null) {
                ContextType newContextType =
                        ConnectionContextHelper.getContextTypeForContextMode(con, selectedContext, false);
                newContextName = newContextType == null ? null : newContextType.getName();
            }

            if (!isContextIsValid(newContextName, oldContextName, connItem) && hasDependency(connItem)) {
                // can not update connection when context is invalid(catalog or schema is null) and has dependecy
                return false;
            }
            con.setContextName(newContextName);
            if (con instanceof DatabaseConnection) {
                DatabaseConnection dbConn = (DatabaseConnection) connItem.getConnection();
                String newURL = getChangedURL(dbConn, newContextName);
                dbConn.setURL(newURL);
                // do nothing when schema or catalog is null
                updateConnectionForSidOrUiSchema(dbConn, oldContextName);
            }

            saveConnection(connItem);
            return true;
        }
        return false;
    }

    private boolean hasDependency(ConnectionItem connItem) {
        // Added TDQ-18565
        if (GlobalServiceRegister.getDefault().isServiceRegistered(ITDQRepositoryService.class)) {
            ITDQRepositoryService tdqRepService =
                    GlobalServiceRegister.getDefault().getService(ITDQRepositoryService.class);
            if (tdqRepService.hasClientDependences(connItem)) {
                return true;
            }
        }
        return false;
    }

    /**
     * DOC talend Comment method "checkContextIsValid".
     *
     * @param selectedContext
     * @paramconn
     */
    private boolean isContextIsValid(String selectedContext, String oldContextName, ConnectionItem connItem) {
        boolean retCode = false;
        Connection conn = connItem.getConnection();
        if (conn instanceof DatabaseConnection) {
            EDatabaseTypeName dbType =
                    EDatabaseTypeName.getTypeFromDbType(((DatabaseConnection) conn).getDatabaseType());

            if (dbType == EDatabaseTypeName.GODBC) {// for ODBC
                retCode = true;
            } else if (dbType == EDatabaseTypeName.GENERAL_JDBC) {
                retCode = true;
            } else {
                DatabaseConnection dbConn = (DatabaseConnection) conn;
                boolean hasCatalog = ConnectionHelper.hasCatalog(dbConn);
                boolean hasSchema = ConnectionHelper.hasSchema(dbConn);
                ContextType newContextType = ConnectionContextHelper.getContextTypeForContextMode(dbConn,
                        selectedContext, false);
                ContextType oldContextType = ConnectionContextHelper.getContextTypeForContextMode(dbConn,
                        oldContextName, false);
                String newSidOrDatabase = ConnectionContextHelper.getOriginalValue(newContextType, dbConn.getSID());
                String newUiShema = ConnectionContextHelper.getOriginalValue(newContextType, dbConn.getUiSchema());
                String oldSidOrDatabase = ConnectionContextHelper.getOriginalValue(oldContextType, dbConn.getSID());
                String oldUiShema = ConnectionContextHelper.getOriginalValue(oldContextType, dbConn.getUiSchema());
                if (hasCatalog) {// for example mysql
                    retCode = checkEmpty(newSidOrDatabase, oldSidOrDatabase);
                    if (hasSchema) {// for example mssql
                        retCode &= checkEmpty(newUiShema, oldUiShema);
                    }
                } else if (hasSchema) {// for example oracle
                    retCode = checkEmpty(newUiShema, oldUiShema);
                } else {// some db didnot have catelog and schema
                    retCode = true;
                }

            }
        } else if (conn instanceof FileConnection) {
            retCode = true;
        }

        return retCode;

    }

    private boolean checkEmpty(String newSidOrDatabase, String oldSidOrDatabase) {
        if (isEmptyString(oldSidOrDatabase) && isEmptyString(newSidOrDatabase)) {
            return true;
        }
        return !isEmptyString(oldSidOrDatabase) && !isEmptyString(newSidOrDatabase);
    }

    /**
     *
     * check whether str is null or length is zero
     *
     * @param str
     * @return
     */
    private boolean isEmptyString(final String str) {
        return str == null || str.length() == 0;
    }

    /**
     * change the URL according to selected context Added yyin 20120918 TDQ-5668
     *
     * @param connItem
     * @param con
     * @param selectedContext
     */
    private String getChangedURL(DatabaseConnection dbConn, String selectedContext) {
        ContextType contextType = ConnectionContextHelper.getContextTypeForContextMode(dbConn, selectedContext, false);
        String url = dbConn.getURL();
        if (url != null) {
            return url;
        }
        String server = ConnectionContextHelper.getOriginalValue(contextType, dbConn.getServerName());
        String username = ConnectionContextHelper.getOriginalValue(contextType, dbConn.getUsername());
        String password = ConnectionContextHelper.getOriginalValue(contextType, dbConn.getRawPassword());
        String port = ConnectionContextHelper.getOriginalValue(contextType, dbConn.getPort());
        String sidOrDatabase = ConnectionContextHelper.getOriginalValue(contextType, dbConn.getSID());
        String datasource = ConnectionContextHelper.getOriginalValue(contextType, dbConn.getDatasourceName());
        String filePath = ConnectionContextHelper.getOriginalValue(contextType, dbConn.getFileFieldName());
        String dbRootPath = ConnectionContextHelper.getOriginalValue(contextType, dbConn.getDBRootPath());
        String additionParam = ConnectionContextHelper.getOriginalValue(contextType, dbConn.getAdditionalParams());

        return DatabaseConnStrUtil.getURLString(dbConn.getDatabaseType(), dbConn.getDbVersionString(), server, username,
                password, port, sidOrDatabase, filePath.toLowerCase(), datasource, dbRootPath, additionParam);
    }

    /**
     *
     * change context Group need to synchronization name of catalog or schema
     *
     * @param dbConn
     * @param oldContextName
     */
    private void updateConnectionForSidOrUiSchema(DatabaseConnection dbConn, String oldContextName) {
        String selectedContext = dbConn.getContextName();
        ContextType newContextType =
                ConnectionContextHelper.getContextTypeForContextMode(dbConn, selectedContext, false);
        ContextType oldContextType =
                ConnectionContextHelper.getContextTypeForContextMode(dbConn, oldContextName, false);
        String newSidOrDatabase = ConnectionContextHelper.getOriginalValue(newContextType, dbConn.getSID());
        String newUiShema = ConnectionContextHelper.getOriginalValue(newContextType, dbConn.getUiSchema());
        String oldSidOrDatabase = ConnectionContextHelper.getOriginalValue(oldContextType, dbConn.getSID());
        String oldUiShema = ConnectionContextHelper.getOriginalValue(oldContextType, dbConn.getUiSchema());
        if (!isEmptyString(newSidOrDatabase) && !isEmptyString(oldSidOrDatabase)) {// for example mysql or mssql
            Catalog catalog = CatalogHelper.getCatalog(dbConn, oldSidOrDatabase);
            if (catalog != null) {
                catalog.setName(newSidOrDatabase);

                Schema schema = SchemaHelper.getSchemaByName(CatalogHelper.getSchemas(catalog), oldUiShema);// for
                                                                                                            // example
                                                                                                            // mssql
                if (schema != null) {
                    schema.setName(newUiShema);
                }
            }
        }
        if (!isEmptyString(newUiShema) && !isEmptyString(oldUiShema)) {// for example oracle
            Schema schema = SchemaHelper.getSchema(dbConn, oldUiShema);
            if (schema != null) {
                schema.setName(newUiShema);
            }
        }
    }

}
