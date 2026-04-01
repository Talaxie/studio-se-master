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

import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.SpagoBiServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spago Bi Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.SpagoBiServerImpl#getEngineName <em>Engine Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SpagoBiServerImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SpagoBiServerImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SpagoBiServerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SpagoBiServerImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SpagoBiServerImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SpagoBiServerImpl#getApplicationContext <em>Application Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpagoBiServerImpl extends EObjectImpl implements SpagoBiServer {
    /**
     * The default value of the '{@link #getEngineName() <em>Engine Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEngineName()
     * @generated
     * @ordered
     */
    protected static final String ENGINE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEngineName() <em>Engine Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEngineName()
     * @generated
     * @ordered
     */
    protected String engineName = ENGINE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortDescription()
     * @generated
     * @ordered
     */
    protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortDescription()
     * @generated
     * @ordered
     */
    protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

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
     * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogin()
     * @generated
     * @ordered
     */
    protected static final String LOGIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogin()
     * @generated
     * @ordered
     */
    protected String login = LOGIN_EDEFAULT;

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
     * The default value of the '{@link #getApplicationContext() <em>Application Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationContext()
     * @generated
     * @ordered
     */
    protected static final String APPLICATION_CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApplicationContext() <em>Application Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationContext()
     * @generated
     * @ordered
     */
    protected String applicationContext = APPLICATION_CONTEXT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpagoBiServerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.SPAGO_BI_SERVER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEngineName() {
        return engineName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEngineName(String newEngineName) {
        String oldEngineName = engineName;
        engineName = newEngineName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SPAGO_BI_SERVER__ENGINE_NAME, oldEngineName, engineName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setShortDescription(String newShortDescription) {
        String oldShortDescription = shortDescription;
        shortDescription = newShortDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SPAGO_BI_SERVER__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SPAGO_BI_SERVER__HOST, oldHost, host));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SPAGO_BI_SERVER__PORT, oldPort, port));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLogin() {
        return login;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogin(String newLogin) {
        String oldLogin = login;
        login = newLogin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SPAGO_BI_SERVER__LOGIN, oldLogin, login));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SPAGO_BI_SERVER__PASSWORD, oldPassword, password));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getApplicationContext() {
        return applicationContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setApplicationContext(String newApplicationContext) {
        String oldApplicationContext = applicationContext;
        applicationContext = newApplicationContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SPAGO_BI_SERVER__APPLICATION_CONTEXT, oldApplicationContext, applicationContext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.SPAGO_BI_SERVER__ENGINE_NAME:
                return getEngineName();
            case PropertiesPackage.SPAGO_BI_SERVER__SHORT_DESCRIPTION:
                return getShortDescription();
            case PropertiesPackage.SPAGO_BI_SERVER__HOST:
                return getHost();
            case PropertiesPackage.SPAGO_BI_SERVER__PORT:
                return getPort();
            case PropertiesPackage.SPAGO_BI_SERVER__LOGIN:
                return getLogin();
            case PropertiesPackage.SPAGO_BI_SERVER__PASSWORD:
                return getPassword();
            case PropertiesPackage.SPAGO_BI_SERVER__APPLICATION_CONTEXT:
                return getApplicationContext();
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
            case PropertiesPackage.SPAGO_BI_SERVER__ENGINE_NAME:
                setEngineName((String)newValue);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__SHORT_DESCRIPTION:
                setShortDescription((String)newValue);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__HOST:
                setHost((String)newValue);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__PORT:
                setPort((String)newValue);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__LOGIN:
                setLogin((String)newValue);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__PASSWORD:
                setPassword((String)newValue);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__APPLICATION_CONTEXT:
                setApplicationContext((String)newValue);
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
            case PropertiesPackage.SPAGO_BI_SERVER__ENGINE_NAME:
                setEngineName(ENGINE_NAME_EDEFAULT);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__SHORT_DESCRIPTION:
                setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__HOST:
                setHost(HOST_EDEFAULT);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__PORT:
                setPort(PORT_EDEFAULT);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__LOGIN:
                setLogin(LOGIN_EDEFAULT);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__PASSWORD:
                setPassword(PASSWORD_EDEFAULT);
                return;
            case PropertiesPackage.SPAGO_BI_SERVER__APPLICATION_CONTEXT:
                setApplicationContext(APPLICATION_CONTEXT_EDEFAULT);
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
            case PropertiesPackage.SPAGO_BI_SERVER__ENGINE_NAME:
                return ENGINE_NAME_EDEFAULT == null ? engineName != null : !ENGINE_NAME_EDEFAULT.equals(engineName);
            case PropertiesPackage.SPAGO_BI_SERVER__SHORT_DESCRIPTION:
                return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
            case PropertiesPackage.SPAGO_BI_SERVER__HOST:
                return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
            case PropertiesPackage.SPAGO_BI_SERVER__PORT:
                return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
            case PropertiesPackage.SPAGO_BI_SERVER__LOGIN:
                return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
            case PropertiesPackage.SPAGO_BI_SERVER__PASSWORD:
                return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
            case PropertiesPackage.SPAGO_BI_SERVER__APPLICATION_CONTEXT:
                return APPLICATION_CONTEXT_EDEFAULT == null ? applicationContext != null : !APPLICATION_CONTEXT_EDEFAULT.equals(applicationContext);
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
        result.append(" (engineName: ");
        result.append(engineName);
        result.append(", shortDescription: ");
        result.append(shortDescription);
        result.append(", host: ");
        result.append(host);
        result.append(", port: ");
        result.append(port);
        result.append(", login: ");
        result.append(login);
        result.append(", password: ");
        result.append(password);
        result.append(", applicationContext: ");
        result.append(applicationContext);
        result.append(')');
        return result.toString();
    }

} //SpagoBiServerImpl