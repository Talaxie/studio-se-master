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
 * A representation of the model object '<em><b>User Module Authorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.UserModuleAuthorization#getUser <em>User</em>}</li>
 *   <li>{@link org.talend.core.model.properties.UserModuleAuthorization#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getUserModuleAuthorization()
 * @model
 * @generated
 */
public interface UserModuleAuthorization extends EObject {
    /**
     * Returns the value of the '<em><b>User</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.User#getModuleAuthorization <em>Module Authorization</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User</em>' reference.
     * @see #setUser(User)
     * @see org.talend.core.model.properties.PropertiesPackage#getUserModuleAuthorization_User()
     * @see org.talend.core.model.properties.User#getModuleAuthorization
     * @model opposite="moduleAuthorization"
     * @generated
     */
    User getUser();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.UserModuleAuthorization#getUser <em>User</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User</em>' reference.
     * @see #getUser()
     * @generated
     */
    void setUser(User value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"Scheduler"</code>.
     * The literals are from the enumeration {@link org.talend.core.model.properties.UserModuleAuthorizationType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.talend.core.model.properties.UserModuleAuthorizationType
     * @see #setType(UserModuleAuthorizationType)
     * @see org.talend.core.model.properties.PropertiesPackage#getUserModuleAuthorization_Type()
     * @model default="Scheduler" unique="false"
     * @generated
     */
    UserModuleAuthorizationType getType();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.UserModuleAuthorization#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.talend.core.model.properties.UserModuleAuthorizationType
     * @see #getType()
     * @generated
     */
    void setType(UserModuleAuthorizationType value);

} // UserModuleAuthorization
