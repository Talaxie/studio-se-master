/**
 */
package org.talend.model.recyclebin;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recycle Bin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.model.recyclebin.RecycleBin#getDeletedFolders <em>Deleted Folders</em>}</li>
 *   <li>{@link org.talend.model.recyclebin.RecycleBin#getDeletedItems <em>Deleted Items</em>}</li>
 *   <li>{@link org.talend.model.recyclebin.RecycleBin#getLastUpdate <em>Last Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.model.recyclebin.RecycleBinPackage#getRecycleBin()
 * @model
 * @generated
 */
public interface RecycleBin extends EObject {
    /**
     * Returns the value of the '<em><b>Deleted Folders</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deleted Folders</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deleted Folders</em>' attribute list.
     * @see org.talend.model.recyclebin.RecycleBinPackage#getRecycleBin_DeletedFolders()
     * @model
     * @generated
     */
    EList<String> getDeletedFolders();

    /**
     * Returns the value of the '<em><b>Deleted Items</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.model.recyclebin.TalendItem}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deleted Items</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deleted Items</em>' containment reference list.
     * @see org.talend.model.recyclebin.RecycleBinPackage#getRecycleBin_DeletedItems()
     * @model containment="true"
     * @generated
     */
    EList<TalendItem> getDeletedItems();

    /**
     * Returns the value of the '<em><b>Last Update</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Update</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Update</em>' attribute.
     * @see #setLastUpdate(Date)
     * @see org.talend.model.recyclebin.RecycleBinPackage#getRecycleBin_LastUpdate()
     * @model
     * @generated
     */
    Date getLastUpdate();

    /**
     * Sets the value of the '{@link org.talend.model.recyclebin.RecycleBin#getLastUpdate <em>Last Update</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Update</em>' attribute.
     * @see #getLastUpdate()
     * @generated
     */
    void setLastUpdate(Date value);

} // RecycleBin
