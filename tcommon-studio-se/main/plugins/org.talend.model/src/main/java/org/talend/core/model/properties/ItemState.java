/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Item State</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ItemState#getPath <em>Path</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ItemState#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ItemState#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ItemState#getLocker <em>Locker</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ItemState#getLockDate <em>Lock Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ItemState#getCommitDate <em>Commit Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getItemState()
 * @model
 * @generated
 */
public interface ItemState extends EObject {

    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getItemState_Path()
     * @model
     * @generated
     */
    String getPath();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ItemState#getPath <em>Path</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath(String value);

    /**
     * Returns the value of the '<em><b>Deleted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deleted</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deleted</em>' attribute.
     * @see #setDeleted(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getItemState_Deleted()
     * @model
     * @generated
     */
    boolean isDeleted();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ItemState#isDeleted <em>Deleted</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Deleted</em>' attribute.
     * @see #isDeleted()
     * @generated
     */
    void setDeleted(boolean value);

    /**
     * Returns the value of the '<em><b>Locked</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Locked</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Locked</em>' attribute.
     * @see #setLocked(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getItemState_Locked()
     * @model
     * @generated
     */
    boolean isLocked();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ItemState#isLocked <em>Locked</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Locked</em>' attribute.
     * @see #isLocked()
     * @generated
     */
    void setLocked(boolean value);

    /**
     * Returns the value of the '<em><b>Locker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Locker</em>' reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Locker</em>' reference.
     * @see #setLocker(User)
     * @see org.talend.core.model.properties.PropertiesPackage#getItemState_Locker()
     * @model
     * @generated
     */
    User getLocker();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ItemState#getLocker <em>Locker</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Locker</em>' reference.
     * @see #getLocker()
     * @generated
     */
    void setLocker(User value);

    /**
     * Returns the value of the '<em><b>Lock Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lock Date</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lock Date</em>' attribute.
     * @see #setLockDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getItemState_LockDate()
     * @model
     * @generated
     */
    Date getLockDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ItemState#getLockDate <em>Lock Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Lock Date</em>' attribute.
     * @see #getLockDate()
     * @generated
     */
    void setLockDate(Date value);

    /**
     * Returns the value of the '<em><b>Commit Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Commit Date</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Commit Date</em>' attribute.
     * @see #setCommitDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getItemState_CommitDate()
     * @model
     * @generated
     */
    Date getCommitDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ItemState#getCommitDate <em>Commit Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Commit Date</em>' attribute.
     * @see #getCommitDate()
     * @generated
     */
    void setCommitDate(Date value);

    /**
     * @generated NOT
     */
    void setItemRelated(Item item);
} // ItemState
