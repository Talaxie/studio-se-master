/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getHost <em>Host</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getPort <em>Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getFileTransfertPort <em>File Transfert Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getMonitoringPort <em>Monitoring Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getTimeoutUnknownState <em>Timeout Unknown State</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getUsername <em>Username</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getPassword <em>Password</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getJmxUrl <em>Jmx Url</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getWebConsoleUrl <em>Web Console Url</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#isTalendRuntime <em>Talaxie Runtime</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getMgmtServerPort <em>Mgmt Server Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getMgmtRegPort <em>Mgmt Reg Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getAdminConsolePort <em>Admin Console Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#isUseSSL <em>Use SSL</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionServer#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer()
 * @model
 * @generated
 */
public interface ExecutionServer extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Host</em>' attribute.
     * @see #setHost(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_Host()
     * @model
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getHost <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host</em>' attribute.
     * @see #getHost()
     * @generated
     */
    void setHost(String value);

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_Port()
     * @model default="-1"
     * @generated
     */
    int getPort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(int value);

    /**
     * Returns the value of the '<em><b>File Transfert Port</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Transfert Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Transfert Port</em>' attribute.
     * @see #setFileTransfertPort(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_FileTransfertPort()
     * @model default="-1"
     * @generated
     */
    int getFileTransfertPort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getFileTransfertPort <em>File Transfert Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Transfert Port</em>' attribute.
     * @see #getFileTransfertPort()
     * @generated
     */
    void setFileTransfertPort(int value);

    /**
     * Returns the value of the '<em><b>Active</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Active</em>' attribute.
     * @see #setActive(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_Active()
     * @model default="true"
     * @generated
     */
    boolean isActive();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#isActive <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Active</em>' attribute.
     * @see #isActive()
     * @generated
     */
    void setActive(boolean value);

    /**
     * Returns the value of the '<em><b>Monitoring Port</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitoring Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitoring Port</em>' attribute.
     * @see #setMonitoringPort(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_MonitoringPort()
     * @model default="-1"
     * @generated
     */
    int getMonitoringPort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getMonitoringPort <em>Monitoring Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monitoring Port</em>' attribute.
     * @see #getMonitoringPort()
     * @generated
     */
    void setMonitoringPort(int value);

    /**
     * Returns the value of the '<em><b>Timeout Unknown State</b></em>' attribute.
     * The default value is <code>"120"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timeout Unknown State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timeout Unknown State</em>' attribute.
     * @see #setTimeoutUnknownState(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_TimeoutUnknownState()
     * @model default="120"
     * @generated
     */
    int getTimeoutUnknownState();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getTimeoutUnknownState <em>Timeout Unknown State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timeout Unknown State</em>' attribute.
     * @see #getTimeoutUnknownState()
     * @generated
     */
    void setTimeoutUnknownState(int value);

    /**
     * Returns the value of the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Username</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Username</em>' attribute.
     * @see #setUsername(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_Username()
     * @model
     * @generated
     */
    String getUsername();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getUsername <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Username</em>' attribute.
     * @see #getUsername()
     * @generated
     */
    void setUsername(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_Password()
     * @model
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Jmx Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Jmx Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Jmx Url</em>' attribute.
     * @see #setJmxUrl(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_JmxUrl()
     * @model
     * @generated
     */
    String getJmxUrl();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getJmxUrl <em>Jmx Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jmx Url</em>' attribute.
     * @see #getJmxUrl()
     * @generated
     */
    void setJmxUrl(String value);

    /**
     * Returns the value of the '<em><b>Web Console Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Web Console Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Web Console Url</em>' attribute.
     * @see #setWebConsoleUrl(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_WebConsoleUrl()
     * @model
     * @generated
     */
    String getWebConsoleUrl();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getWebConsoleUrl <em>Web Console Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Web Console Url</em>' attribute.
     * @see #getWebConsoleUrl()
     * @generated
     */
    void setWebConsoleUrl(String value);

    /**
     * Returns the value of the '<em><b>Talaxie Runtime</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Talaxie Runtime</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Talaxie Runtime</em>' attribute.
     * @see #setTalendRuntime(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_TalendRuntime()
     * @model
     * @generated
     */
    boolean isTalendRuntime();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#isTalendRuntime <em>Talaxie Runtime</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Talaxie Runtime</em>' attribute.
     * @see #isTalendRuntime()
     * @generated
     */
    void setTalendRuntime(boolean value);

    /**
     * Returns the value of the '<em><b>Mgmt Server Port</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mgmt Server Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mgmt Server Port</em>' attribute.
     * @see #setMgmtServerPort(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_MgmtServerPort()
     * @model default="-1"
     * @generated
     */
    int getMgmtServerPort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getMgmtServerPort <em>Mgmt Server Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mgmt Server Port</em>' attribute.
     * @see #getMgmtServerPort()
     * @generated
     */
    void setMgmtServerPort(int value);

    /**
     * Returns the value of the '<em><b>Mgmt Reg Port</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mgmt Reg Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mgmt Reg Port</em>' attribute.
     * @see #setMgmtRegPort(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_MgmtRegPort()
     * @model default="-1"
     * @generated
     */
    int getMgmtRegPort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getMgmtRegPort <em>Mgmt Reg Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mgmt Reg Port</em>' attribute.
     * @see #getMgmtRegPort()
     * @generated
     */
    void setMgmtRegPort(int value);

    /**
     * Returns the value of the '<em><b>Admin Console Port</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Admin Console Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Admin Console Port</em>' attribute.
     * @see #setAdminConsolePort(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_AdminConsolePort()
     * @model default="-1"
     * @generated
     */
    int getAdminConsolePort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getAdminConsolePort <em>Admin Console Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Admin Console Port</em>' attribute.
     * @see #getAdminConsolePort()
     * @generated
     */
    void setAdminConsolePort(int value);

    /**
     * Returns the value of the '<em><b>Use SSL</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use SSL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use SSL</em>' attribute.
     * @see #setUseSSL(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_UseSSL()
     * @model default="false"
     * @generated
     */
    boolean isUseSSL();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#isUseSSL <em>Use SSL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use SSL</em>' attribute.
     * @see #isUseSSL()
     * @generated
     */
    void setUseSSL(boolean value);

    /**
     * Returns the value of the '<em><b>Instance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instance</em>' attribute.
     * @see #setInstance(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionServer_Instance()
     * @model
     * @generated
     */
    String getInstance();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionServer#getInstance <em>Instance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instance</em>' attribute.
     * @see #getInstance()
     * @generated
     */
    void setInstance(String value);

} // ExecutionServer
