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
 * A representation of the model object '<em><b>User Project Authorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.UserProjectAuthorization#getUser <em>User</em>}</li>
 *   <li>{@link org.talend.core.model.properties.UserProjectAuthorization#getProject <em>Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.UserProjectAuthorization#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getUserProjectAuthorization()
 * @model
 * @generated
 */
public interface UserProjectAuthorization extends EObject {
    /**
     * Returns the value of the '<em><b>User</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.User#getProjectAuthorization <em>Project Authorization</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User</em>' reference.
     * @see #setUser(User)
     * @see org.talend.core.model.properties.PropertiesPackage#getUserProjectAuthorization_User()
     * @see org.talend.core.model.properties.User#getProjectAuthorization
     * @model opposite="projectAuthorization"
     * @generated
     */
    User getUser();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.UserProjectAuthorization#getUser <em>User</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User</em>' reference.
     * @see #getUser()
     * @generated
     */
    void setUser(User value);

    /**
     * Returns the value of the '<em><b>Project</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.Project#getUserAuthorization <em>User Authorization</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project</em>' reference.
     * @see #setProject(Project)
     * @see org.talend.core.model.properties.PropertiesPackage#getUserProjectAuthorization_Project()
     * @see org.talend.core.model.properties.Project#getUserAuthorization
     * @model opposite="userAuthorization"
     * @generated
     */
    Project getProject();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.UserProjectAuthorization#getProject <em>Project</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Project</em>' reference.
     * @see #getProject()
     * @generated
     */
    void setProject(Project value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"ReadWrite"</code>.
     * The literals are from the enumeration {@link org.talend.core.model.properties.UserProjectAuthorizationType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.talend.core.model.properties.UserProjectAuthorizationType
     * @see #setType(UserProjectAuthorizationType)
     * @see org.talend.core.model.properties.PropertiesPackage#getUserProjectAuthorization_Type()
     * @model default="ReadWrite" unique="false"
     * @generated
     */
    UserProjectAuthorizationType getType();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.UserProjectAuthorization#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.talend.core.model.properties.UserProjectAuthorizationType
     * @see #getType()
     * @generated
     */
    void setType(UserProjectAuthorizationType value);

} // UserProjectAuthorization