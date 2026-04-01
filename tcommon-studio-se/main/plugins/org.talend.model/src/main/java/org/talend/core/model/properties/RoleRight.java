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
 * A representation of the model object '<em><b>Role Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.RoleRight#getRole <em>Role</em>}</li>
 *   <li>{@link org.talend.core.model.properties.RoleRight#getUserRight <em>User Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getRoleRight()
 * @model
 * @generated
 */
public interface RoleRight extends EObject {
    /**
     * Returns the value of the '<em><b>Role</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.UserRole#getRolesRights <em>Roles Rights</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' reference.
     * @see #setRole(UserRole)
     * @see org.talend.core.model.properties.PropertiesPackage#getRoleRight_Role()
     * @see org.talend.core.model.properties.UserRole#getRolesRights
     * @model opposite="rolesRights"
     * @generated
     */
    UserRole getRole();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.RoleRight#getRole <em>Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' reference.
     * @see #getRole()
     * @generated
     */
    void setRole(UserRole value);

    /**
     * Returns the value of the '<em><b>User Right</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.UserRight#getRolesRights <em>Roles Rights</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Right</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Right</em>' reference.
     * @see #setUserRight(UserRight)
     * @see org.talend.core.model.properties.PropertiesPackage#getRoleRight_UserRight()
     * @see org.talend.core.model.properties.UserRight#getRolesRights
     * @model opposite="rolesRights"
     * @generated
     */
    UserRight getUserRight();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.RoleRight#getUserRight <em>User Right</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Right</em>' reference.
     * @see #getUserRight()
     * @generated
     */
    void setUserRight(UserRight value);

} // RoleRight
