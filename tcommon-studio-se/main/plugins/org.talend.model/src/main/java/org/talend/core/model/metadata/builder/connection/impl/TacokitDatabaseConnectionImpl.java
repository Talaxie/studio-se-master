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
package org.talend.core.model.metadata.builder.connection.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.commons.runtime.service.ITaCoKitService;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.TacokitDatabaseConnection;
import org.talend.cwm.helper.StudioEncryptionHelper;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Tacokit Database Connection</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class TacokitDatabaseConnectionImpl extends DatabaseConnectionImpl implements TacokitDatabaseConnection {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TacokitDatabaseConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConnectionPackage.Literals.TACOKIT_DATABASE_CONNECTION;
    }

    @Override
    public List<Map<String, Object>> getDrivers() {
        String jdbcDriverData = (String) this.getProperties().get(KEY_DRIVER);
        List<Map<String, Object>> driverList = new ArrayList<Map<String, Object>>();
        ITaCoKitService service = getTaCoKitService();
        if (service != null) {
            driverList = service.convertToTable(jdbcDriverData);
        }
        return driverList;
    }

    public ITaCoKitService getTaCoKitService() {
        if (Platform.isRunning()) {
            return ITaCoKitService.getInstance();
        }

        // TDQ-21221: the follows is for DQ tDqReportRun component
        final String serviceClassName = "org.talend.sdk.component.studio.service.TaCoKitService"; //$NON-NLS-1$
        try {
            return (ITaCoKitService) Class.forName(serviceClassName).newInstance();
        } catch (InstantiationException e) {
            EcorePlugin.INSTANCE.log(e);
        } catch (IllegalAccessException e) {
            EcorePlugin.INSTANCE.log(e);
        } catch (ClassNotFoundException e) {
            EcorePlugin.INSTANCE.log(e);
        }
        return null;
    }

    /**
     * @generated NOT
     */
    @Override
    public String getDriverJarPath() {
        List<Map<String, Object>> drivers = getDrivers();
        StringBuffer jarPath = new StringBuffer();
        for (int i = 0; i < drivers.size(); i++) {
            if (i != 0) {
                jarPath.append(";");
            }
            Map<String, Object> map = drivers.get(i);
            String path = (String) map.get(KEY_DRIVER_PATH);
            if (StringUtils.isNotBlank(path)) {
                jarPath.append(path);
            }
        }
        return jarPath.toString();
    }

    /**
     * @generated NOT
     */
    @Override
    public void setDriverJarPath(String value) {
        if (value == null) {
            return;
        }
        // normally this used for create / clone, list might be empty
        List<Map<String, Object>> drivers = getDrivers();
        // TODO later consider add name in method parameter or remove name column
        for (String driverJar : value.split(";")) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put(KEY_DRIVER_PATH, driverJar);
            map.put(KEY_DRIVER_NAME, null);
            // TDQ-21562: fix add twice when import the project from login
            if (!drivers.contains(map)) {
                drivers.add(map);
            }
        }
        this.getProperties().put(KEY_DRIVER, drivers.toString());
    }

    /**
     * @generated NOT
     */
    @Override
    public String getDriverClass() {
        return (String) this.getProperties().get(KEY_DRIVER_CLASS);
    }

    /**
     * @generated NOT
     */
    @Override
    public void setDriverClass(String value) {
        String oldValue = getDriverClass();
        this.getProperties().put(KEY_DRIVER_CLASS, value);
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.DATABASE_CONNECTION__DRIVER_CLASS,
                    oldValue, value));
    }

    /**
     * @generated NOT
     */
    @Override
    public String getURL() {
        return (String) this.getProperties().get(KEY_URL);
    }

    /**
     * @generated NOT
     */
    @Override
    public void setURL(String value) {
        String oldValue = getURL();
        this.getProperties().put(KEY_URL, value);
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.DATABASE_CONNECTION__URL, oldValue, value));
    }

    /**
     * @generated NOT
     */
    @Override
    public String getPort() {
        return (String) this.getProperties().get(KEY_PORT);
    }

    /**
     * @generated NOT
     */
    @Override
    public void setPort(String value) {
        String oldValue = getPort();
        this.getProperties().put(KEY_PORT, value);
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.DATABASE_CONNECTION__PORT, oldValue, value));
    }

    /**
     * @generated NOT
     */
    @Override
    public String getUsername() {
        return (String) this.getProperties().get(KEY_USER_ID);
    }

    /**
     * @generated NOT
     */
    @Override
    public void setUsername(String value) {
        String oldValue = getUsername();
        this.getProperties().put(KEY_USER_ID, value);
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.DATABASE_CONNECTION__USERNAME, oldValue,
                    value));

    }

    @Override
    public void setPassword(String newPassword) {
        String oldValue = getPassword();
        this.getProperties().put(KEY_PASSWORD, newPassword);
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.DATABASE_CONNECTION__PASSWORD, oldValue,
                    newPassword));
        
    }

    @Override
    public void setRawPassword(String value) {
        if (value != null && StudioEncryptionHelper.isLatestEncryptionKey(getPassword()) && value.equals(getRawPassword())) {
            return;
        }
        setPassword(getValue(value, true));
    }

    /**
     * @generated NOT
     */
    @Override
    public String getPassword() {
        return (String) this.getProperties().get(KEY_PASSWORD);
    }

    /**
     * @generated NOT
     */
    @Override
    public String getRawPassword() {
        return getValueIgnoreContextMode(getPassword(), false);
    }

    /**
     * @generated NOT
     */
    @Override
    public String getDatabaseMappingFile() {
        if (this.getProperties().containsKey(KEY_DATABASE_MAPPING)) {
            return (String) this.getProperties().get(KEY_DATABASE_MAPPING);
        }
        return null;
    }

    /**
     * @generated NOT
     */
    @Override
    public String getDbmsId() {
        String mappingFile = getDatabaseMappingFile();
        if ("null".equals(mappingFile)) {
            return null;
        }
        return mappingFile;
    }

    /**
     * @generated NOT
     */
    @Override
    public void setDbmsId(String newDbmsId) {
        String oldValue = getDbmsId();
        this.getProperties().put(KEY_DATABASE_MAPPING, newDbmsId);
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.DATABASE_CONNECTION__DBMS_ID, oldValue,
                    newDbmsId));
    }

    /**
     * @generated NOT
     */
    @Override
    public boolean useSharedDBConnection() {
        if (this.getProperties().containsKey(KEY_USE_SHARED_DB_CONNECTION)) {
            return Boolean.valueOf(this.getProperties().get(KEY_USE_SHARED_DB_CONNECTION).toString());
        }
        return false;
    }

    /**
     * @generated NOT
     */
    @Override
    public String getSharedDBConnectionName() {
        if (this.getProperties().containsKey(KEY_SHARED_DB_CONNECTION)) {
            return (String) this.getProperties().get(KEY_SHARED_DB_CONNECTION);
        }
        return null;
    }

    /**
     * @generated NOT
     */
    @Override
    public boolean useDatasourceAlias() {
        if (this.getProperties().containsKey(KEY_USE_DATASOURCE)) {
            return Boolean.valueOf(this.getProperties().get(KEY_USE_DATASOURCE).toString());
        }
        return false;
    }

    /**
     * @generated NOT
     */
    @Override
    public String getDatasourceAlias() {
        if (this.getProperties().containsKey(KEY_DATASOURCE_ALIAS)) {
            return (String) this.getProperties().get(KEY_DATASOURCE_ALIAS);
        }
        return null;
    }

    /**
     * @generated NOT
     */
    @Override
    public String getAuthenticationType() {
        if (this.getProperties().containsKey(KEY_AUTHENTICATION_TYPE)) {
            return (String) this.getProperties().get(KEY_AUTHENTICATION_TYPE);
        }
        return null;
    }

    /**
     * @generated NOT
     */
    @Override
    public void setAuthenticationType(String authenticationType) {
        this.getProperties().put(KEY_AUTHENTICATION_TYPE, authenticationType);
    }

    /**
     * @generated NOT
     */
    @Override
    public boolean useAutoCommit() {
        if (this.getProperties().containsKey(KEY_USE_AUTO_COMMIT)) {
            return Boolean.valueOf(this.getProperties().get(KEY_USE_AUTO_COMMIT).toString());
        }
        return false;
    }
    
    /**
     * @generated NOT
     */
    @Override
    public void setUseAutoCommit(boolean isUseAutoCommit) {
        this.getProperties().put(KEY_USE_AUTO_COMMIT, isUseAutoCommit);
    }

    /**
     * @generated NOT
     */
    @Override
    public boolean autoCommit() {
        if (this.getProperties().containsKey(KEY_AUTO_COMMIT)) {
            return Boolean.valueOf(this.getProperties().get(KEY_AUTO_COMMIT).toString());
        }
        return false;
    }
    
    /**
     * @generated NOT
     */
    @Override
    public void setAutoCommit(boolean isAutoCommit) {
        this.getProperties().put(KEY_AUTO_COMMIT, isAutoCommit);      
    }

    @Override
    public String getServerName() {
        if (this.getProperties().containsKey(KEY_HOST)) {
            return (String) this.getProperties().get(KEY_HOST);
        }
        return null;
    }

    @Override
    public void setServerName(String newServerName) {
        String oldValue = getServerName();
        this.getProperties().put(KEY_HOST, newServerName);
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConnectionPackage.DATABASE_CONNECTION__SERVER_NAME,
                    oldValue, newServerName));
    }

    @Override
    public boolean enableDBType() {
        if (this.getProperties().containsKey(KEY_ENABLE_DB_TYPE)) {
            return Boolean.valueOf(this.getProperties().get(KEY_ENABLE_DB_TYPE).toString());
        }
        return false;
    }
    
    public void setEnableDBType(boolean isEnable) {
        this.getProperties().put(KEY_ENABLE_DB_TYPE, String.valueOf(isEnable));
    }

    @Override
    public Object getPropertyValue(String key) {
        return this.getProperties().get(key);
    }

    public static void main(String[] args) {
        TacokitDatabaseConnectionImpl c = new TacokitDatabaseConnectionImpl();
        String driverPath = "mvn:com.mysql/mysql-connector-j/8.0.33/jar;mvn:net.minidev/accessors-smart/1.1/jar;mvn:javax.activation/activation/1.1.1/jar";
        c.setDriverJarPath(driverPath);
        System.out.println(c.getDriverJarPath());
    }



} // TacokitDatabaseConnectionImpl
