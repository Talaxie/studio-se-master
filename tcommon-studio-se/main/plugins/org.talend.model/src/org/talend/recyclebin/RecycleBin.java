/**
 */
package org.talend.recyclebin;

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
 *   <li>{@link org.talend.recyclebin.RecycleBin#getDeletedFolders <em>Deleted Folders</em>}</li>
 *   <li>{@link org.talend.recyclebin.RecycleBin#getDeletedItems <em>Deleted Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.recyclebin.RecyclebinPackage#getRecycleBin()
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
     * @see org.talend.recyclebin.RecyclebinPackage#getRecycleBin_DeletedFolders()
     * @model
     * @generated
     */
    EList<String> getDeletedFolders();

    /**
     * Returns the value of the '<em><b>Deleted Items</b></em>' reference list.
     * The list contents are of type {@link org.talend.recyclebin.TalendItem}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deleted Items</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deleted Items</em>' reference list.
     * @see org.talend.recyclebin.RecyclebinPackage#getRecycleBin_DeletedItems()
     * @model
     * @generated
     */
    EList<TalendItem> getDeletedItems();

} // RecycleBin
