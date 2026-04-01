/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.core.model.properties.ExecutionServer;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Execution Server</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getFileTransfertPort <em>File Transfert Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getMonitoringPort <em>Monitoring Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getTimeoutUnknownState <em>Timeout Unknown State</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getJmxUrl <em>Jmx Url</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getWebConsoleUrl <em>Web Console Url</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#isTalendRuntime <em>Talaxie Runtime</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getMgmtServerPort <em>Mgmt Server Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getMgmtRegPort <em>Mgmt Reg Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getAdminConsolePort <em>Admin Console Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#isUseSSL <em>Use SSL</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionServerImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionServerImpl extends EObjectImpl implements ExecutionServer {

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected static final String HOST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHost() <em>Host</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected String host = HOST_EDEFAULT;

    /**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected static final int PORT_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected int port = PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getFileTransfertPort() <em>File Transfert Port</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFileTransfertPort()
     * @generated
     * @ordered
     */
    protected static final int FILE_TRANSFERT_PORT_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getFileTransfertPort() <em>File Transfert Port</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFileTransfertPort()
     * @generated
     * @ordered
     */
    protected int fileTransfertPort = FILE_TRANSFERT_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean ACTIVE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected boolean active = ACTIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getMonitoringPort() <em>Monitoring Port</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getMonitoringPort()
     * @generated
     * @ordered
     */
    protected static final int MONITORING_PORT_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getMonitoringPort() <em>Monitoring Port</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getMonitoringPort()
     * @generated
     * @ordered
     */
    protected int monitoringPort = MONITORING_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getTimeoutUnknownState() <em>Timeout Unknown State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeoutUnknownState()
     * @generated
     * @ordered
     */
    protected static final int TIMEOUT_UNKNOWN_STATE_EDEFAULT = 120;

    /**
     * The cached value of the '{@link #getTimeoutUnknownState() <em>Timeout Unknown State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeoutUnknownState()
     * @generated
     * @ordered
     */
    protected int timeoutUnknownState = TIMEOUT_UNKNOWN_STATE_EDEFAULT;

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
     * The default value of the '{@link #getJmxUrl() <em>Jmx Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJmxUrl()
     * @generated
     * @ordered
     */
    protected static final String JMX_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJmxUrl() <em>Jmx Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJmxUrl()
     * @generated
     * @ordered
     */
    protected String jmxUrl = JMX_URL_EDEFAULT;

    /**
     * The default value of the '{@link #getWebConsoleUrl() <em>Web Console Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWebConsoleUrl()
     * @generated
     * @ordered
     */
    protected static final String WEB_CONSOLE_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWebConsoleUrl() <em>Web Console Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWebConsoleUrl()
     * @generated
     * @ordered
     */
    protected String webConsoleUrl = WEB_CONSOLE_URL_EDEFAULT;

    /**
     * The default value of the '{@link #isTalendRuntime() <em>Talaxie Runtime</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTalendRuntime()
     * @generated
     * @ordered
     */
    protected static final boolean TALEND_RUNTIME_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTalendRuntime() <em>Talaxie Runtime</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTalendRuntime()
     * @generated
     * @ordered
     */
    protected boolean talendRuntime = TALEND_RUNTIME_EDEFAULT;

    /**
     * The default value of the '{@link #getMgmtServerPort() <em>Mgmt Server Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMgmtServerPort()
     * @generated
     * @ordered
     */
    protected static final int MGMT_SERVER_PORT_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getMgmtServerPort() <em>Mgmt Server Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMgmtServerPort()
     * @generated
     * @ordered
     */
    protected int mgmtServerPort = MGMT_SERVER_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getMgmtRegPort() <em>Mgmt Reg Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMgmtRegPort()
     * @generated
     * @ordered
     */
    protected static final int MGMT_REG_PORT_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getMgmtRegPort() <em>Mgmt Reg Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMgmtRegPort()
     * @generated
     * @ordered
     */
    protected int mgmtRegPort = MGMT_REG_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getAdminConsolePort() <em>Admin Console Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdminConsolePort()
     * @generated
     * @ordered
     */
    protected static final int ADMIN_CONSOLE_PORT_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getAdminConsolePort() <em>Admin Console Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdminConsolePort()
     * @generated
     * @ordered
     */
    protected int adminConsolePort = ADMIN_CONSOLE_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #isUseSSL() <em>Use SSL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseSSL()
     * @generated
     * @ordered
     */
    protected static final boolean USE_SSL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUseSSL() <em>Use SSL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseSSL()
     * @generated
     * @ordered
     */
    protected boolean useSSL = USE_SSL_EDEFAULT;

    /**
     * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstance()
     * @generated
     * @ordered
     */
    protected static final String INSTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInstance() <em>Instance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstance()
     * @generated
     * @ordered
     */
    protected String instance = INSTANCE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionServerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.EXECUTION_SERVER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getHost() {
        return host;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setHost(String newHost) {
        String oldHost = host;
        host = newHost;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__HOST, oldHost, host));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getPort() {
        return port;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPort(int newPort) {
        int oldPort = port;
        port = newPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__PORT, oldPort, port));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getFileTransfertPort() {
        return fileTransfertPort;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFileTransfertPort(int newFileTransfertPort) {
        int oldFileTransfertPort = fileTransfertPort;
        fileTransfertPort = newFileTransfertPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__FILE_TRANSFERT_PORT, oldFileTransfertPort, fileTransfertPort));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isActive() {
        return active;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setActive(boolean newActive) {
        boolean oldActive = active;
        active = newActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__ACTIVE, oldActive, active));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getMonitoringPort() {
        return monitoringPort;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMonitoringPort(int newMonitoringPort) {
        int oldMonitoringPort = monitoringPort;
        monitoringPort = newMonitoringPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__MONITORING_PORT, oldMonitoringPort, monitoringPort));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTimeoutUnknownState() {
        return timeoutUnknownState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeoutUnknownState(int newTimeoutUnknownState) {
        int oldTimeoutUnknownState = timeoutUnknownState;
        timeoutUnknownState = newTimeoutUnknownState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__TIMEOUT_UNKNOWN_STATE, oldTimeoutUnknownState, timeoutUnknownState));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__USERNAME, oldUsername, username));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJmxUrl() {
        return jmxUrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJmxUrl(String newJmxUrl) {
        String oldJmxUrl = jmxUrl;
        jmxUrl = newJmxUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__JMX_URL, oldJmxUrl, jmxUrl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWebConsoleUrl() {
        return webConsoleUrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWebConsoleUrl(String newWebConsoleUrl) {
        String oldWebConsoleUrl = webConsoleUrl;
        webConsoleUrl = newWebConsoleUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__WEB_CONSOLE_URL, oldWebConsoleUrl, webConsoleUrl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTalendRuntime() {
        return talendRuntime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTalendRuntime(boolean newTalendRuntime) {
        boolean oldTalendRuntime = talendRuntime;
        talendRuntime = newTalendRuntime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__TALEND_RUNTIME, oldTalendRuntime, talendRuntime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMgmtServerPort() {
        return mgmtServerPort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMgmtServerPort(int newMgmtServerPort) {
        int oldMgmtServerPort = mgmtServerPort;
        mgmtServerPort = newMgmtServerPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__MGMT_SERVER_PORT, oldMgmtServerPort, mgmtServerPort));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMgmtRegPort() {
        return mgmtRegPort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMgmtRegPort(int newMgmtRegPort) {
        int oldMgmtRegPort = mgmtRegPort;
        mgmtRegPort = newMgmtRegPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__MGMT_REG_PORT, oldMgmtRegPort, mgmtRegPort));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAdminConsolePort() {
        return adminConsolePort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAdminConsolePort(int newAdminConsolePort) {
        int oldAdminConsolePort = adminConsolePort;
        adminConsolePort = newAdminConsolePort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__ADMIN_CONSOLE_PORT, oldAdminConsolePort, adminConsolePort));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseSSL() {
        return useSSL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseSSL(boolean newUseSSL) {
        boolean oldUseSSL = useSSL;
        useSSL = newUseSSL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__USE_SSL, oldUseSSL, useSSL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInstance() {
        return instance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstance(String newInstance) {
        String oldInstance = instance;
        instance = newInstance;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_SERVER__INSTANCE, oldInstance, instance));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_SERVER__ID:
                return new Integer(getId());
            case PropertiesPackage.EXECUTION_SERVER__LABEL:
                return getLabel();
            case PropertiesPackage.EXECUTION_SERVER__DESCRIPTION:
                return getDescription();
            case PropertiesPackage.EXECUTION_SERVER__HOST:
                return getHost();
            case PropertiesPackage.EXECUTION_SERVER__PORT:
                return new Integer(getPort());
            case PropertiesPackage.EXECUTION_SERVER__FILE_TRANSFERT_PORT:
                return new Integer(getFileTransfertPort());
            case PropertiesPackage.EXECUTION_SERVER__ACTIVE:
                return isActive() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_SERVER__MONITORING_PORT:
                return new Integer(getMonitoringPort());
            case PropertiesPackage.EXECUTION_SERVER__TIMEOUT_UNKNOWN_STATE:
                return new Integer(getTimeoutUnknownState());
            case PropertiesPackage.EXECUTION_SERVER__USERNAME:
                return getUsername();
            case PropertiesPackage.EXECUTION_SERVER__PASSWORD:
                return getPassword();
            case PropertiesPackage.EXECUTION_SERVER__JMX_URL:
                return getJmxUrl();
            case PropertiesPackage.EXECUTION_SERVER__WEB_CONSOLE_URL:
                return getWebConsoleUrl();
            case PropertiesPackage.EXECUTION_SERVER__TALEND_RUNTIME:
                return isTalendRuntime() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_SERVER__MGMT_SERVER_PORT:
                return new Integer(getMgmtServerPort());
            case PropertiesPackage.EXECUTION_SERVER__MGMT_REG_PORT:
                return new Integer(getMgmtRegPort());
            case PropertiesPackage.EXECUTION_SERVER__ADMIN_CONSOLE_PORT:
                return new Integer(getAdminConsolePort());
            case PropertiesPackage.EXECUTION_SERVER__USE_SSL:
                return isUseSSL() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_SERVER__INSTANCE:
                return getInstance();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_SERVER__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_SERVER__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_SERVER__HOST:
                setHost((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_SERVER__PORT:
                setPort(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__FILE_TRANSFERT_PORT:
                setFileTransfertPort(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__ACTIVE:
                setActive(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__MONITORING_PORT:
                setMonitoringPort(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__TIMEOUT_UNKNOWN_STATE:
                setTimeoutUnknownState(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__USERNAME:
                setUsername((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_SERVER__PASSWORD:
                setPassword((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_SERVER__JMX_URL:
                setJmxUrl((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_SERVER__WEB_CONSOLE_URL:
                setWebConsoleUrl((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_SERVER__TALEND_RUNTIME:
                setTalendRuntime(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__MGMT_SERVER_PORT:
                setMgmtServerPort(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__MGMT_REG_PORT:
                setMgmtRegPort(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__ADMIN_CONSOLE_PORT:
                setAdminConsolePort(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__USE_SSL:
                setUseSSL(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_SERVER__INSTANCE:
                setInstance((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_SERVER__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__PORT:
                setPort(PORT_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__FILE_TRANSFERT_PORT:
                setFileTransfertPort(FILE_TRANSFERT_PORT_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__ACTIVE:
                setActive(ACTIVE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__MONITORING_PORT:
                setMonitoringPort(MONITORING_PORT_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__TIMEOUT_UNKNOWN_STATE:
                setTimeoutUnknownState(TIMEOUT_UNKNOWN_STATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__USERNAME:
                setUsername(USERNAME_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__JMX_URL:
                setJmxUrl(JMX_URL_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__WEB_CONSOLE_URL:
                setWebConsoleUrl(WEB_CONSOLE_URL_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__TALEND_RUNTIME:
                setTalendRuntime(TALEND_RUNTIME_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__MGMT_SERVER_PORT:
                setMgmtServerPort(MGMT_SERVER_PORT_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__MGMT_REG_PORT:
                setMgmtRegPort(MGMT_REG_PORT_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__ADMIN_CONSOLE_PORT:
                setAdminConsolePort(ADMIN_CONSOLE_PORT_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__USE_SSL:
                setUseSSL(USE_SSL_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_SERVER__INSTANCE:
                setInstance(INSTANCE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_SERVER__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.EXECUTION_SERVER__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case PropertiesPackage.EXECUTION_SERVER__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case PropertiesPackage.EXECUTION_SERVER__PORT:
                return port != PORT_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__FILE_TRANSFERT_PORT:
                return fileTransfertPort != FILE_TRANSFERT_PORT_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__ACTIVE:
                return active != ACTIVE_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__MONITORING_PORT:
                return monitoringPort != MONITORING_PORT_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__TIMEOUT_UNKNOWN_STATE:
                return timeoutUnknownState != TIMEOUT_UNKNOWN_STATE_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__USERNAME:
                return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
            case PropertiesPackage.EXECUTION_SERVER__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case PropertiesPackage.EXECUTION_SERVER__JMX_URL:
                return JMX_URL_EDEFAULT == null ? jmxUrl != null : !JMX_URL_EDEFAULT.equals(jmxUrl);
            case PropertiesPackage.EXECUTION_SERVER__WEB_CONSOLE_URL:
                return WEB_CONSOLE_URL_EDEFAULT == null ? webConsoleUrl != null : !WEB_CONSOLE_URL_EDEFAULT.equals(webConsoleUrl);
            case PropertiesPackage.EXECUTION_SERVER__TALEND_RUNTIME:
                return talendRuntime != TALEND_RUNTIME_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__MGMT_SERVER_PORT:
                return mgmtServerPort != MGMT_SERVER_PORT_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__MGMT_REG_PORT:
                return mgmtRegPort != MGMT_REG_PORT_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__ADMIN_CONSOLE_PORT:
                return adminConsolePort != ADMIN_CONSOLE_PORT_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__USE_SSL:
                return useSSL != USE_SSL_EDEFAULT;
            case PropertiesPackage.EXECUTION_SERVER__INSTANCE:
                return INSTANCE_EDEFAULT == null ? instance != null : !INSTANCE_EDEFAULT.equals(instance);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
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
        result.append(", description: ");
        result.append(description);
        result.append(", host: ");
        result.append(host);
        result.append(", port: ");
        result.append(port);
        result.append(", fileTransfertPort: ");
        result.append(fileTransfertPort);
        result.append(", active: ");
        result.append(active);
        result.append(", monitoringPort: ");
        result.append(monitoringPort);
        result.append(", timeoutUnknownState: ");
        result.append(timeoutUnknownState);
        result.append(", username: ");
        result.append(username);
        result.append(", password: ");
        result.append(password);
        result.append(", jmxUrl: ");
        result.append(jmxUrl);
        result.append(", webConsoleUrl: ");
        result.append(webConsoleUrl);
        result.append(", talendRuntime: ");
        result.append(talendRuntime);
        result.append(", mgmtServerPort: ");
        result.append(mgmtServerPort);
        result.append(", mgmtRegPort: ");
        result.append(mgmtRegPort);
        result.append(", adminConsolePort: ");
        result.append(adminConsolePort);
        result.append(", useSSL: ");
        result.append(useSSL);
        result.append(", instance: ");
        result.append(instance);
        result.append(')');
        return result.toString();
    }

} // ExecutionServerImpl
