// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.model.metadata.builder.connection;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RegExUtils;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Tacokit Database Connection</b></em>'. <!--
 * end-user-doc -->
 *
 *
 * @see org.talend.core.model.metadata.builder.connection.ConnectionPackage#getTacokitDatabaseConnection()
 * @model
 * @generated
 */
public interface TacokitDatabaseConnection extends DatabaseConnection {

    String KEY_DRIVER = "configuration.jdbcDriver";

    String KEY_DRIVER_PATH = "configuration.jdbcDriver[].path";

    String KEY_DRIVER_NAME = "configuration.jdbcDriver[].name";

    String KEY_DRIVER_CLASS = "configuration.jdbcClass";

    String KEY_URL = "configuration.jdbcUrl";

    String KEY_PORT = "configuration.port";

    String KEY_HOST = "configuration.host";

    String KEY_USER_ID = "configuration.userId";

    String KEY_PASSWORD = "configuration.password";

    String KEY_DATABASE_MAPPING = "configuration.dbMapping";

    String KEY_USE_SHARED_DB_CONNECTION = "configuration.useSharedDBConnection";

    String KEY_SHARED_DB_CONNECTION = "configuration.sharedDBConnectionName";

    String KEY_USE_DATASOURCE = "configuration.useDataSource";

    String KEY_DATASOURCE_ALIAS = "configuration.dataSourceAlias";

    String KEY_AUTHENTICATION_TYPE = "configuration.authenticationType";

    String KEY_USE_AUTO_COMMIT = "configuration.useAutoCommit";

    String KEY_AUTO_COMMIT = "configuration.autoCommit";

    String KEY_ENABLE_DB_TYPE = "configuration.enableDBType";

    String KEY_DB_TYPE = "configuration.dbType";

    String JDBCSP_EXCLUSION = "\\.dataSet";

    String KEY_DATASTORE_DRIVER = "configuration.dataSet.dataStore.jdbcDriver";

    String KEY_SP_DATASTORE_DRIVER = RegExUtils.removeFirst(KEY_DATASTORE_DRIVER, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_DRIVER_PATH = "configuration.dataSet.dataStore.jdbcDriver[].path";

    String KEY_SP_DATASTORE_DRIVER_PATH = RegExUtils.removeFirst(KEY_DATASTORE_DRIVER_PATH, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_DRIVER_NAME = "configuration.dataSet.dataStore.jdbcDriver[].name";

    String KEY_SP_DATASTORE_DRIVER_NAME = RegExUtils.removeFirst(KEY_DATASTORE_DRIVER_NAME, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_DRIVER_CLASS = "configuration.dataSet.dataStore.jdbcClass";

    String KEY_SP_DATASTORE_DRIVER_CLASS = RegExUtils.removeFirst(KEY_DATASTORE_DRIVER_CLASS, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_URL = "configuration.dataSet.dataStore.jdbcUrl";

    String KEY_SP_DATASTORE_URL = RegExUtils.removeFirst(KEY_DATASTORE_URL, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_PORT = "configuration.dataSet.dataStore.port";

    String KEY_SP_DATASTORE_PORT = RegExUtils.removeFirst(KEY_DATASTORE_PORT, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_HOST = "configuration.dataSet.dataStore.host";

    String KEY_SP_DATASTORE_HOST = RegExUtils.removeFirst(KEY_DATASTORE_HOST, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_USER_ID = "configuration.dataSet.dataStore.userId";

    String KEY_SP_DATASTORE_USER_ID = RegExUtils.removeFirst(KEY_DATASTORE_USER_ID, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_PASSWORD = "configuration.dataSet.dataStore.password";

    String KEY_SP_DATASTORE_PASSWORD = RegExUtils.removeFirst(KEY_DATASTORE_PASSWORD, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_DATABASE_MAPPING = "configuration.dataSet.dataStore.dbMapping";

    String KEY_SP_DATASTORE_DATABASE_MAPPING = RegExUtils.removeFirst(KEY_DATASTORE_DATABASE_MAPPING, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_USE_SHARED_DB_CONNECTION = "configuration.dataSet.dataStore.useSharedDBConnection";

    String KEY_SP_DATASTORE_USE_SHARED_DB_CONNECTION = RegExUtils.removeFirst(KEY_DATASTORE_USE_SHARED_DB_CONNECTION,
            JDBCSP_EXCLUSION);

    String KEY_DATASTORE_SHARED_DB_CONNECTION = "configuration.dataSet.dataStore.sharedDBConnectionName";

    String KEY_SP_DATASTORE_SHARED_DB_CONNECTION = RegExUtils.removeFirst(KEY_DATASTORE_SHARED_DB_CONNECTION, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_USE_DATASOURCE = "configuration.dataSet.dataStore.useDataSource";

    String KEY_SP_DATASTORE_USE_DATASOURCE = RegExUtils.removeFirst(KEY_DATASTORE_USE_DATASOURCE, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_DATASOURCE_ALIAS = "configuration.dataSet.dataStore.dataSourceAlias";

    String KEY_SP_DATASTORE_DATASOURCE_ALIAS = RegExUtils.removeFirst(KEY_DATASTORE_DATASOURCE_ALIAS, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_AUTHENTICATION_TYPE = "configuration.dataSet.dataStore.authenticationType";

    String KEY_SP_DATASTORE_AUTHENTICATION_TYPE = RegExUtils.removeFirst(KEY_DATASTORE_AUTHENTICATION_TYPE, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_USE_AUTO_COMMIT = "configuration.dataSet.dataStore.useAutoCommit";

    String KEY_SP_DATASTORE_USE_AUTO_COMMIT = RegExUtils.removeFirst(KEY_DATASTORE_USE_AUTO_COMMIT, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_AUTO_COMMIT = "configuration.dataSet.dataStore.autoCommit";

    String KEY_SP_DATASTORE_AUTO_COMMIT = RegExUtils.removeFirst(KEY_DATASTORE_AUTO_COMMIT, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_ENABLE_DB_TYPE = "configuration.dataSet.dataStore.enableDBType";

    String KEY_SP_DATASTORE_ENABLE_DB_TYPE = RegExUtils.removeFirst(KEY_DATASTORE_ENABLE_DB_TYPE, JDBCSP_EXCLUSION);

    String KEY_DATASTORE_DB_TYPE = "configuration.dataSet.dataStore.dbType";

    String KEY_SP_DATASTORE_DB_TYPE = RegExUtils.removeFirst(KEY_DATASTORE_DB_TYPE, JDBCSP_EXCLUSION);

    String KEY_DATASET_SQL_QUERY = "configuration.dataSet.sqlQuery";

    String KEY_DATASET_TABLE_NAME = "configuration.dataSet.tableName";

    String KEY_JDBC_DATASTORE_NAME = "JDBCDataStore";

    public String getDatabaseMappingFile();

    public boolean useSharedDBConnection();

    public String getSharedDBConnectionName();

    public boolean useDatasourceAlias();

    public String getDatasourceAlias();

    public String getAuthenticationType();

    public void setAuthenticationType(String paramName);

    public boolean useAutoCommit();
    
    public void setUseAutoCommit(boolean isUseAutoCommit);

    public boolean autoCommit();
    
    public void setAutoCommit(boolean isAutoCommit);

    public boolean enableDBType();
    
    public void setEnableDBType(boolean isEnable); 

    public List<Map<String, Object>> getDrivers();

    public Object getPropertyValue(String key);

} // TacokitDatabaseConnection
