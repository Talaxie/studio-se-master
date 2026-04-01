/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spago Bi Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.SpagoBiServer#getEngineName <em>Engine Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SpagoBiServer#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SpagoBiServer#getHost <em>Host</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SpagoBiServer#getPort <em>Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SpagoBiServer#getLogin <em>Login</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SpagoBiServer#getPassword <em>Password</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SpagoBiServer#getApplicationContext <em>Application Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getSpagoBiServer()
 * @model
 * @generated
 */
public interface SpagoBiServer extends EObject {
    
    public static final String SPAGOBI_SERVER = "org.talend.repository.properties.spagobiserver"; //$NON-NLS-1$
    
    /**
     * Returns the value of the '<em><b>Engine Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Engine Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Engine Name</em>' attribute.
     * @see #setEngineName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSpagoBiServer_EngineName()
     * @model id="true" required="true"
     * @generated
     */
    String getEngineName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SpagoBiServer#getEngineName <em>Engine Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Engine Name</em>' attribute.
     * @see #getEngineName()
     * @generated
     */
    void setEngineName(String value);

    /**
     * Returns the value of the '<em><b>Short Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Short Description</em>' attribute.
     * @see #setShortDescription(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSpagoBiServer_ShortDescription()
     * @model
     * @generated
     */
    String getShortDescription();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SpagoBiServer#getShortDescription <em>Short Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Description</em>' attribute.
     * @see #getShortDescription()
     * @generated
     */
    void setShortDescription(String value);

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
     * @see org.talend.core.model.properties.PropertiesPackage#getSpagoBiServer_Host()
     * @model
     * @generated
     */
    String getHost();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SpagoBiServer#getHost <em>Host</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Host</em>' attribute.
     * @see #getHost()
     * @generated
     */
    void setHost(String value);

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSpagoBiServer_Port()
     * @model
     * @generated
     */
    String getPort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SpagoBiServer#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(String value);

    /**
     * Returns the value of the '<em><b>Login</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Login</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Login</em>' attribute.
     * @see #setLogin(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSpagoBiServer_Login()
     * @model
     * @generated
     */
    String getLogin();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SpagoBiServer#getLogin <em>Login</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Login</em>' attribute.
     * @see #getLogin()
     * @generated
     */
    void setLogin(String value);

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
     * @see org.talend.core.model.properties.PropertiesPackage#getSpagoBiServer_Password()
     * @model
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SpagoBiServer#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

    /**
     * Returns the value of the '<em><b>Application Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Context</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Application Context</em>' attribute.
     * @see #setApplicationContext(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSpagoBiServer_ApplicationContext()
     * @model
     * @generated
     */
    String getApplicationContext();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SpagoBiServer#getApplicationContext <em>Application Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Application Context</em>' attribute.
     * @see #getApplicationContext()
     * @generated
     */
    void setApplicationContext(String value);

} // SpagoBiServer