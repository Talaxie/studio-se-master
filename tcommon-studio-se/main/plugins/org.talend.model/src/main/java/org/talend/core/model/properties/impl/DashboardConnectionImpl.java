/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.core.model.properties.DashboardConnection;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dashboard Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getDialect <em>Dialect</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getLogTable <em>Log Table</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getStatTable <em>Stat Table</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getFlowMeterTable <em>Flow Meter Table</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getAdditionnalsParams <em>Additionnals Params</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.DashboardConnectionImpl#getDatasource <em>Datasource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DashboardConnectionImpl extends EObjectImpl implements DashboardConnection {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDialect()
     * @generated
     * @ordered
     */
    protected static final String DIALECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDialect()
     * @generated
     * @ordered
     */
    protected String dialect = DIALECT_EDEFAULT;

    /**
     * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected static final String HOST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected String host = HOST_EDEFAULT;

    /**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected static final String PORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected String port = PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getDatabase() <em>Database</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatabase()
     * @generated
     * @ordered
     */
    protected static final String DATABASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDatabase() <em>Database</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatabase()
     * @generated
     * @ordered
     */
    protected String database = DATABASE_EDEFAULT;

    /**
     * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
    protected static final String USERNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
    protected String username = USERNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected static final String PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected String password = PASSWORD_EDEFAULT;

    /**
     * The default value of the '{@link #getLogTable() <em>Log Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogTable()
     * @generated
     * @ordered
     */
    protected static final String LOG_TABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogTable() <em>Log Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogTable()
     * @generated
     * @ordered
     */
    protected String logTable = LOG_TABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getStatTable() <em>Stat Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatTable()
     * @generated
     * @ordered
     */
    protected static final String STAT_TABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatTable() <em>Stat Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatTable()
     * @generated
     * @ordered
     */
    protected String statTable = STAT_TABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getFlowMeterTable() <em>Flow Meter Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowMeterTable()
     * @generated
     * @ordered
     */
    protected static final String FLOW_METER_TABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlowMeterTable() <em>Flow Meter Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowMeterTable()
     * @generated
     * @ordered
     */
    protected String flowMeterTable = FLOW_METER_TABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getAdditionnalsParams() <em>Additionnals Params</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditionnalsParams()
     * @generated
     * @ordered
     */
    protected static final String ADDITIONNALS_PARAMS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAdditionnalsParams() <em>Additionnals Params</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditionnalsParams()
     * @generated
     * @ordered
     */
    protected String additionnalsParams = ADDITIONNALS_PARAMS_EDEFAULT;

    /**
     * The default value of the '{@link #getDatasource() <em>Datasource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatasource()
     * @generated
     * @ordered
     */
    protected static final String DATASOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatasource()
     * @generated
     * @ordered
     */
    protected String datasource = DATASOURCE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DashboardConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.DASHBOARD_CONNECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDialect() {
        return dialect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDialect(String newDialect) {
        String oldDialect = dialect;
        dialect = newDialect;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__DIALECT, oldDialect, dialect));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHost() {
        return host;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHost(String newHost) {
        String oldHost = host;
        host = newHost;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__HOST, oldHost, host));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPort() {
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPort(String newPort) {
        String oldPort = port;
        port = newPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__PORT, oldPort, port));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDatabase() {
        return database;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDatabase(String newDatabase) {
        String oldDatabase = database;
        database = newDatabase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__DATABASE, oldDatabase, database));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsername(String newUsername) {
        String oldUsername = username;
        username = newUsername;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__USERNAME, oldUsername, username));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassword(String newPassword) {
        String oldPassword = password;
        password = newPassword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLogTable() {
        return logTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogTable(String newLogTable) {
        String oldLogTable = logTable;
        logTable = newLogTable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__LOG_TABLE, oldLogTable, logTable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStatTable() {
        return statTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatTable(String newStatTable) {
        String oldStatTable = statTable;
        statTable = newStatTable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__STAT_TABLE, oldStatTable, statTable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFlowMeterTable() {
        return flowMeterTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlowMeterTable(String newFlowMeterTable) {
        String oldFlowMeterTable = flowMeterTable;
        flowMeterTable = newFlowMeterTable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__FLOW_METER_TABLE, oldFlowMeterTable, flowMeterTable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAdditionnalsParams() {
        return additionnalsParams;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAdditionnalsParams(String newAdditionnalsParams) {
        String oldAdditionnalsParams = additionnalsParams;
        additionnalsParams = newAdditionnalsParams;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__ADDITIONNALS_PARAMS, oldAdditionnalsParams, additionnalsParams));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDatasource() {
        return datasource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDatasource(String newDatasource) {
        String oldDatasource = datasource;
        datasource = newDatasource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.DASHBOARD_CONNECTION__DATASOURCE, oldDatasource, datasource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.DASHBOARD_CONNECTION__ID:
                return new Integer(getId());
            case PropertiesPackage.DASHBOARD_CONNECTION__LABEL:
                return getLabel();
            case PropertiesPackage.DASHBOARD_CONNECTION__DIALECT:
                return getDialect();
            case PropertiesPackage.DASHBOARD_CONNECTION__HOST:
                return getHost();
            case PropertiesPackage.DASHBOARD_CONNECTION__PORT:
                return getPort();
            case PropertiesPackage.DASHBOARD_CONNECTION__DATABASE:
                return getDatabase();
            case PropertiesPackage.DASHBOARD_CONNECTION__USERNAME:
                return getUsername();
            case PropertiesPackage.DASHBOARD_CONNECTION__PASSWORD:
                return getPassword();
            case PropertiesPackage.DASHBOARD_CONNECTION__LOG_TABLE:
                return getLogTable();
            case PropertiesPackage.DASHBOARD_CONNECTION__STAT_TABLE:
                return getStatTable();
            case PropertiesPackage.DASHBOARD_CONNECTION__FLOW_METER_TABLE:
                return getFlowMeterTable();
            case PropertiesPackage.DASHBOARD_CONNECTION__ADDITIONNALS_PARAMS:
                return getAdditionnalsParams();
            case PropertiesPackage.DASHBOARD_CONNECTION__DATASOURCE:
                return getDatasource();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.DASHBOARD_CONNECTION__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__DIALECT:
                setDialect((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__HOST:
                setHost((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__PORT:
                setPort((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__DATABASE:
                setDatabase((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__USERNAME:
                setUsername((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__PASSWORD:
                setPassword((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__LOG_TABLE:
                setLogTable((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__STAT_TABLE:
                setStatTable((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__FLOW_METER_TABLE:
                setFlowMeterTable((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__ADDITIONNALS_PARAMS:
                setAdditionnalsParams((String)newValue);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__DATASOURCE:
                setDatasource((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PropertiesPackage.DASHBOARD_CONNECTION__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__DIALECT:
                setDialect(DIALECT_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__PORT:
                setPort(PORT_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__DATABASE:
                setDatabase(DATABASE_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__USERNAME:
                setUsername(USERNAME_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__LOG_TABLE:
                setLogTable(LOG_TABLE_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__STAT_TABLE:
                setStatTable(STAT_TABLE_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__FLOW_METER_TABLE:
                setFlowMeterTable(FLOW_METER_TABLE_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__ADDITIONNALS_PARAMS:
                setAdditionnalsParams(ADDITIONNALS_PARAMS_EDEFAULT);
                return;
            case PropertiesPackage.DASHBOARD_CONNECTION__DATASOURCE:
                setDatasource(DATASOURCE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PropertiesPackage.DASHBOARD_CONNECTION__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.DASHBOARD_CONNECTION__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.DASHBOARD_CONNECTION__DIALECT:
                return DIALECT_EDEFAULT == null ? dialect != null : !DIALECT_EDEFAULT.equals(dialect);
            case PropertiesPackage.DASHBOARD_CONNECTION__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case PropertiesPackage.DASHBOARD_CONNECTION__PORT:
                return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
            case PropertiesPackage.DASHBOARD_CONNECTION__DATABASE:
                return DATABASE_EDEFAULT == null ? database != null : !DATABASE_EDEFAULT.equals(database);
            case PropertiesPackage.DASHBOARD_CONNECTION__USERNAME:
                return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
            case PropertiesPackage.DASHBOARD_CONNECTION__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case PropertiesPackage.DASHBOARD_CONNECTION__LOG_TABLE:
                return LOG_TABLE_EDEFAULT == null ? logTable != null : !LOG_TABLE_EDEFAULT.equals(logTable);
            case PropertiesPackage.DASHBOARD_CONNECTION__STAT_TABLE:
                return STAT_TABLE_EDEFAULT == null ? statTable != null : !STAT_TABLE_EDEFAULT.equals(statTable);
            case PropertiesPackage.DASHBOARD_CONNECTION__FLOW_METER_TABLE:
                return FLOW_METER_TABLE_EDEFAULT == null ? flowMeterTable != null : !FLOW_METER_TABLE_EDEFAULT.equals(flowMeterTable);
            case PropertiesPackage.DASHBOARD_CONNECTION__ADDITIONNALS_PARAMS:
                return ADDITIONNALS_PARAMS_EDEFAULT == null ? additionnalsParams != null : !ADDITIONNALS_PARAMS_EDEFAULT.equals(additionnalsParams);
            case PropertiesPackage.DASHBOARD_CONNECTION__DATASOURCE:
                return DATASOURCE_EDEFAULT == null ? datasource != null : !DATASOURCE_EDEFAULT.equals(datasource);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (id: ");
        result.append(id);
        result.append(", label: ");
        result.append(label);
        result.append(", dialect: ");
        result.append(dialect);
        result.append(", host: ");
        result.append(host);
        result.append(", port: ");
        result.append(port);
        result.append(", database: ");
        result.append(database);
        result.append(", username: ");
        result.append(username);
        result.append(", password: ");
        result.append(password);
        result.append(", logTable: ");
        result.append(logTable);
        result.append(", statTable: ");
        result.append(statTable);
        result.append(", flowMeterTable: ");
        result.append(flowMeterTable);
        result.append(", additionnalsParams: ");
        result.append(additionnalsParams);
        result.append(", datasource: ");
        result.append(datasource);
        result.append(')');
        return result.toString();
    }

} //DashboardConnectionImpl
