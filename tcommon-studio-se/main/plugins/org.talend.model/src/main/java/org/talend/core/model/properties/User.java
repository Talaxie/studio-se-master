/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.User#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getLogin <em>Login</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getPassword <em>Password</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getDeleteDate <em>Delete Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#isAllowedToModifyComponents <em>Allowed To Modify Components</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getComment <em>Comment</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getProjectAuthorization <em>Project Authorization</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getModuleAuthorization <em>Module Authorization</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getPreferredDashboardConnection <em>Preferred Dashboard Connection</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getLastAdminConnectionDate <em>Last Admin Connection Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getLastStudioConnectionDate <em>Last Studio Connection Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getFirstAdminConnectionDate <em>First Admin Connection Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getFirstStudioConnectionDate <em>First Studio Connection Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getAdminConnexionNumber <em>Admin Connexion Number</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getStudioConnexionNumber <em>Studio Connexion Number</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getAuthenticationInfo <em>Authentication Info</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getLdapLogin <em>Ldap Login</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getLdapId <em>Ldap Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getType <em>Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#getAdditionnalData <em>Additionnal Data</em>}</li>
 *   <li>{@link org.talend.core.model.properties.User#isTechnical <em>Technical</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #setId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_Id()
     * @model unsettable="true" id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Unsets the value of the '{@link org.talend.core.model.properties.User#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetId()
     * @see #getId()
     * @see #setId(int)
     * @generated
     */
    void unsetId();

    /**
     * Returns whether the value of the '{@link org.talend.core.model.properties.User#getId <em>Id</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Id</em>' attribute is set.
     * @see #unsetId()
     * @see #getId()
     * @see #setId(int)
     * @generated
     */
    boolean isSetId();

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
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_Login()
     * @model required="true"
     * @generated
     */
    String getLogin();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getLogin <em>Login</em>}' attribute.
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
     * @see #setPassword(byte[])
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_Password()
     * @model unique="false" required="true"
     * @generated
     */
    byte[] getPassword();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(byte[] value);

    /**
     * Returns the value of the '<em><b>First Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>First Name</em>' attribute.
     * @see #setFirstName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_FirstName()
     * @model unique="false" required="true"
     * @generated
     */
    String getFirstName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getFirstName <em>First Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First Name</em>' attribute.
     * @see #getFirstName()
     * @generated
     */
    void setFirstName(String value);

    /**
     * Returns the value of the '<em><b>Last Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Name</em>' attribute.
     * @see #setLastName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_LastName()
     * @model unique="false" required="true"
     * @generated
     */
    String getLastName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getLastName <em>Last Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Name</em>' attribute.
     * @see #getLastName()
     * @generated
     */
    void setLastName(String value);

    /**
     * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Creation Date</em>' attribute.
     * @see #setCreationDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_CreationDate()
     * @model unique="false" required="true"
     * @generated
     */
    Date getCreationDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getCreationDate <em>Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Creation Date</em>' attribute.
     * @see #getCreationDate()
     * @generated
     */
    void setCreationDate(Date value);

    /**
     * Returns the value of the '<em><b>Delete Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delete Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delete Date</em>' attribute.
     * @see #setDeleteDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_DeleteDate()
     * @model unique="false"
     * @generated
     */
    Date getDeleteDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getDeleteDate <em>Delete Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete Date</em>' attribute.
     * @see #getDeleteDate()
     * @generated
     */
    void setDeleteDate(Date value);

    /**
     * Returns the value of the '<em><b>Deleted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deleted</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deleted</em>' attribute.
     * @see #isSetDeleted()
     * @see #unsetDeleted()
     * @see #setDeleted(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_Deleted()
     * @model unique="false" unsettable="true"
     * @generated
     */
    boolean isDeleted();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#isDeleted <em>Deleted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deleted</em>' attribute.
     * @see #isSetDeleted()
     * @see #unsetDeleted()
     * @see #isDeleted()
     * @generated
     */
    void setDeleted(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.core.model.properties.User#isDeleted <em>Deleted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDeleted()
     * @see #isDeleted()
     * @see #setDeleted(boolean)
     * @generated
     */
    void unsetDeleted();

    /**
     * Returns whether the value of the '{@link org.talend.core.model.properties.User#isDeleted <em>Deleted</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Deleted</em>' attribute is set.
     * @see #unsetDeleted()
     * @see #isDeleted()
     * @see #setDeleted(boolean)
     * @generated
     */
    boolean isSetDeleted();

    /**
     * Returns the value of the '<em><b>Allowed To Modify Components</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allowed To Modify Components</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allowed To Modify Components</em>' attribute.
     * @see #setAllowedToModifyComponents(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_AllowedToModifyComponents()
     * @model unique="false"
     * @generated
     */
    boolean isAllowedToModifyComponents();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#isAllowedToModifyComponents <em>Allowed To Modify Components</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Allowed To Modify Components</em>' attribute.
     * @see #isAllowedToModifyComponents()
     * @generated
     */
    void setAllowedToModifyComponents(boolean value);

    /**
     * Returns the value of the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Comment</em>' attribute.
     * @see #setComment(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_Comment()
     * @model unique="false"
     * @generated
     */
    String getComment();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @see #getComment()
     * @generated
     */
    void setComment(String value);

    /**
     * Returns the value of the '<em><b>Project Authorization</b></em>' reference list.
     * The list contents are of type {@link org.talend.core.model.properties.UserProjectAuthorization}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.UserProjectAuthorization#getUser <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project Authorization</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project Authorization</em>' reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_ProjectAuthorization()
     * @see org.talend.core.model.properties.UserProjectAuthorization#getUser
     * @model type="org.talend.core.model.properties.UserProjectAuthorization" opposite="user" ordered="false"
     * @generated
     */
    EList getProjectAuthorization();

    /**
     * Returns the value of the '<em><b>Module Authorization</b></em>' reference list.
     * The list contents are of type {@link org.talend.core.model.properties.UserModuleAuthorization}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.UserModuleAuthorization#getUser <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Module Authorization</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Module Authorization</em>' reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_ModuleAuthorization()
     * @see org.talend.core.model.properties.UserModuleAuthorization#getUser
     * @model type="org.talend.core.model.properties.UserModuleAuthorization" opposite="user" ordered="false"
     * @generated
     */
    EList getModuleAuthorization();

    /**
     * Returns the value of the '<em><b>Preferred Dashboard Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preferred Dashboard Connection</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preferred Dashboard Connection</em>' reference.
     * @see #setPreferredDashboardConnection(DashboardConnection)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_PreferredDashboardConnection()
     * @model
     * @generated
     */
    DashboardConnection getPreferredDashboardConnection();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getPreferredDashboardConnection <em>Preferred Dashboard Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preferred Dashboard Connection</em>' reference.
     * @see #getPreferredDashboardConnection()
     * @generated
     */
    void setPreferredDashboardConnection(DashboardConnection value);

    /**
     * Returns the value of the '<em><b>Last Admin Connection Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Admin Connection Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Admin Connection Date</em>' attribute.
     * @see #setLastAdminConnectionDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_LastAdminConnectionDate()
     * @model unique="false"
     * @generated
     */
    Date getLastAdminConnectionDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getLastAdminConnectionDate <em>Last Admin Connection Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Admin Connection Date</em>' attribute.
     * @see #getLastAdminConnectionDate()
     * @generated
     */
    void setLastAdminConnectionDate(Date value);

    /**
     * Returns the value of the '<em><b>Last Studio Connection Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Studio Connection Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Studio Connection Date</em>' attribute.
     * @see #setLastStudioConnectionDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_LastStudioConnectionDate()
     * @model unique="false"
     * @generated
     */
    Date getLastStudioConnectionDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getLastStudioConnectionDate <em>Last Studio Connection Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Studio Connection Date</em>' attribute.
     * @see #getLastStudioConnectionDate()
     * @generated
     */
    void setLastStudioConnectionDate(Date value);

    /**
     * Returns the value of the '<em><b>First Admin Connection Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Admin Connection Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>First Admin Connection Date</em>' attribute.
     * @see #setFirstAdminConnectionDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_FirstAdminConnectionDate()
     * @model unique="false"
     * @generated
     */
    Date getFirstAdminConnectionDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getFirstAdminConnectionDate <em>First Admin Connection Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First Admin Connection Date</em>' attribute.
     * @see #getFirstAdminConnectionDate()
     * @generated
     */
    void setFirstAdminConnectionDate(Date value);

    /**
     * Returns the value of the '<em><b>First Studio Connection Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Studio Connection Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>First Studio Connection Date</em>' attribute.
     * @see #setFirstStudioConnectionDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_FirstStudioConnectionDate()
     * @model unique="false"
     * @generated
     */
    Date getFirstStudioConnectionDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getFirstStudioConnectionDate <em>First Studio Connection Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First Studio Connection Date</em>' attribute.
     * @see #getFirstStudioConnectionDate()
     * @generated
     */
    void setFirstStudioConnectionDate(Date value);

    /**
     * Returns the value of the '<em><b>Admin Connexion Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Admin Connexion Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Admin Connexion Number</em>' attribute.
     * @see #isSetAdminConnexionNumber()
     * @see #unsetAdminConnexionNumber()
     * @see #setAdminConnexionNumber(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_AdminConnexionNumber()
     * @model unsettable="true"
     * @generated
     */
    int getAdminConnexionNumber();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getAdminConnexionNumber <em>Admin Connexion Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Admin Connexion Number</em>' attribute.
     * @see #isSetAdminConnexionNumber()
     * @see #unsetAdminConnexionNumber()
     * @see #getAdminConnexionNumber()
     * @generated
     */
    void setAdminConnexionNumber(int value);

    /**
     * Unsets the value of the '{@link org.talend.core.model.properties.User#getAdminConnexionNumber <em>Admin Connexion Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAdminConnexionNumber()
     * @see #getAdminConnexionNumber()
     * @see #setAdminConnexionNumber(int)
     * @generated
     */
    void unsetAdminConnexionNumber();

    /**
     * Returns whether the value of the '{@link org.talend.core.model.properties.User#getAdminConnexionNumber <em>Admin Connexion Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Admin Connexion Number</em>' attribute is set.
     * @see #unsetAdminConnexionNumber()
     * @see #getAdminConnexionNumber()
     * @see #setAdminConnexionNumber(int)
     * @generated
     */
    boolean isSetAdminConnexionNumber();

    /**
     * Returns the value of the '<em><b>Studio Connexion Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Studio Connexion Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Studio Connexion Number</em>' attribute.
     * @see #isSetStudioConnexionNumber()
     * @see #unsetStudioConnexionNumber()
     * @see #setStudioConnexionNumber(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_StudioConnexionNumber()
     * @model unsettable="true"
     * @generated
     */
    int getStudioConnexionNumber();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getStudioConnexionNumber <em>Studio Connexion Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Studio Connexion Number</em>' attribute.
     * @see #isSetStudioConnexionNumber()
     * @see #unsetStudioConnexionNumber()
     * @see #getStudioConnexionNumber()
     * @generated
     */
    void setStudioConnexionNumber(int value);

    /**
     * Unsets the value of the '{@link org.talend.core.model.properties.User#getStudioConnexionNumber <em>Studio Connexion Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStudioConnexionNumber()
     * @see #getStudioConnexionNumber()
     * @see #setStudioConnexionNumber(int)
     * @generated
     */
    void unsetStudioConnexionNumber();

    /**
     * Returns whether the value of the '{@link org.talend.core.model.properties.User#getStudioConnexionNumber <em>Studio Connexion Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Studio Connexion Number</em>' attribute is set.
     * @see #unsetStudioConnexionNumber()
     * @see #getStudioConnexionNumber()
     * @see #setStudioConnexionNumber(int)
     * @generated
     */
    boolean isSetStudioConnexionNumber();

    /**
     * Returns the value of the '<em><b>Authentication Info</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authentication Info</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Authentication Info</em>' attribute.
     * @see #setAuthenticationInfo(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_AuthenticationInfo()
     * @model unique="false"
     * @generated
     */
    String getAuthenticationInfo();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getAuthenticationInfo <em>Authentication Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authentication Info</em>' attribute.
     * @see #getAuthenticationInfo()
     * @generated
     */
    void setAuthenticationInfo(String value);
    
    String getGitAuthenticationInfo();
    
    void setGitAuthenticationInfo(String value);

    /**
     * Returns the value of the '<em><b>Ldap Login</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ldap Login</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ldap Login</em>' attribute.
     * @see #setLdapLogin(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_LdapLogin()
     * @model unique="false"
     * @generated
     */
    String getLdapLogin();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getLdapLogin <em>Ldap Login</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ldap Login</em>' attribute.
     * @see #getLdapLogin()
     * @generated
     */
    void setLdapLogin(String value);

    /**
     * Returns the value of the '<em><b>Ldap Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ldap Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ldap Id</em>' attribute.
     * @see #setLdapId(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_LdapId()
     * @model
     * @generated
     */
    String getLdapId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getLdapId <em>Ldap Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ldap Id</em>' attribute.
     * @see #getLdapId()
     * @generated
     */
    void setLdapId(String value);

    /**
     * Returns the value of the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Language</em>' attribute.
     * @see #setLanguage(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_Language()
     * @model unique="false"
     * @generated
     */
    String getLanguage();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' attribute.
     * @see #getLanguage()
     * @generated
     */
    void setLanguage(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_Type()
     * @model unique="false"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Additionnal Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Additionnal Data</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Additionnal Data</em>' attribute.
     * @see #setAdditionnalData(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_AdditionnalData()
     * @model unique="false"
     * @generated
     */
    String getAdditionnalData();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#getAdditionnalData <em>Additionnal Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Additionnal Data</em>' attribute.
     * @see #getAdditionnalData()
     * @generated
     */
    void setAdditionnalData(String value);

    /**
     * Returns the value of the '<em><b>Technical</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Technical</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Technical</em>' attribute.
     * @see #isSetTechnical()
     * @see #unsetTechnical()
     * @see #setTechnical(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getUser_Technical()
     * @model unsettable="true" transient="true"
     * @generated
     */
    boolean isTechnical();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.User#isTechnical <em>Technical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Technical</em>' attribute.
     * @see #isSetTechnical()
     * @see #unsetTechnical()
     * @see #isTechnical()
     * @generated
     */
    void setTechnical(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.core.model.properties.User#isTechnical <em>Technical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTechnical()
     * @see #isTechnical()
     * @see #setTechnical(boolean)
     * @generated
     */
    void unsetTechnical();

    /**
     * Returns whether the value of the '{@link org.talend.core.model.properties.User#isTechnical <em>Technical</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Technical</em>' attribute is set.
     * @see #unsetTechnical()
     * @see #isTechnical()
     * @see #setTechnical(boolean)
     * @generated
     */
    boolean isSetTechnical();

} // User