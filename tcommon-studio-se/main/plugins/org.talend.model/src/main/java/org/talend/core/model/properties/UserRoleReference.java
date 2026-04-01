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
 * A representation of the model object '<em><b>User Role Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.UserRoleReference#getUser <em>User</em>}</li>
 *   <li>{@link org.talend.core.model.properties.UserRoleReference#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getUserRoleReference()
 * @model
 * @generated
 */
public interface UserRoleReference extends EObject {
    /**
     * Returns the value of the '<em><b>User</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User</em>' reference.
     * @see #setUser(User)
     * @see org.talend.core.model.properties.PropertiesPackage#getUserRoleReference_User()
     * @model required="true"
     * @generated
     */
    User getUser();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.UserRoleReference#getUser <em>User</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User</em>' reference.
     * @see #getUser()
     * @generated
     */
    void setUser(User value);

    /**
     * Returns the value of the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' reference.
     * @see #setRole(UserRole)
     * @see org.talend.core.model.properties.PropertiesPackage#getUserRoleReference_Role()
     * @model required="true"
     * @generated
     */
    UserRole getRole();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.UserRoleReference#getRole <em>Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' reference.
     * @see #getRole()
     * @generated
     */
    void setRole(UserRole value);

} // UserRoleReference
