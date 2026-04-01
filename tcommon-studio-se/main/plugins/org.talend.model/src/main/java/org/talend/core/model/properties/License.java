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
 * A representation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.License#getLicense <em>License</em>}</li>
 *   <li>{@link org.talend.core.model.properties.License#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.License#getParams <em>Params</em>}</li>
 *   <li>{@link org.talend.core.model.properties.License#getToken <em>Token</em>}</li>
 *   <li>{@link org.talend.core.model.properties.License#getDateTokenCheck <em>Date Token Check</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getLicense()
 * @model
 * @generated
 */
public interface License extends EObject {
    /**
     * Returns the value of the '<em><b>License</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>License</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>License</em>' attribute.
     * @see #setLicense(byte[])
     * @see org.talend.core.model.properties.PropertiesPackage#getLicense_License()
     * @model
     * @generated
     */
    byte[] getLicense();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.License#getLicense <em>License</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>License</em>' attribute.
     * @see #getLicense()
     * @generated
     */
    void setLicense(byte[] value);

    /**
     * Returns the value of the '<em><b>Customer Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Name</em>' attribute.
     * @see #setCustomerName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getLicense_CustomerName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getCustomerName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.License#getCustomerName <em>Customer Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer Name</em>' attribute.
     * @see #getCustomerName()
     * @generated
     */
    void setCustomerName(String value);

    /**
     * Returns the value of the '<em><b>Params</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Params</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Params</em>' attribute.
     * @see #setParams(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getLicense_Params()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getParams();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.License#getParams <em>Params</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Params</em>' attribute.
     * @see #getParams()
     * @generated
     */
    void setParams(String value);

    /**
     * Returns the value of the '<em><b>Token</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Token</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Token</em>' attribute.
     * @see #setToken(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getLicense_Token()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getToken();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.License#getToken <em>Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Token</em>' attribute.
     * @see #getToken()
     * @generated
     */
    void setToken(String value);

    /**
     * Returns the value of the '<em><b>Date Token Check</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Token Check</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Token Check</em>' attribute.
     * @see #setDateTokenCheck(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getLicense_DateTokenCheck()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getDateTokenCheck();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.License#getDateTokenCheck <em>Date Token Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date Token Check</em>' attribute.
     * @see #getDateTokenCheck()
     * @generated
     */
    void setDateTokenCheck(String value);

} // License