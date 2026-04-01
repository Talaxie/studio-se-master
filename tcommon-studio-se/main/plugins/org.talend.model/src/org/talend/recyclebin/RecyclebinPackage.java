/**
 */
package org.talend.recyclebin;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.recyclebin.RecyclebinFactory
 * @model kind="package"
 * @generated
 */
public interface RecyclebinPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "recyclebin";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.talend.org/recyclebin";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "recyclebin";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RecyclebinPackage eINSTANCE = org.talend.recyclebin.impl.RecyclebinPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.recyclebin.impl.RecycleBinImpl <em>Recycle Bin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.recyclebin.impl.RecycleBinImpl
     * @see org.talend.recyclebin.impl.RecyclebinPackageImpl#getRecycleBin()
     * @generated
     */
    int RECYCLE_BIN = 0;

    /**
     * The feature id for the '<em><b>Deleted Folders</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECYCLE_BIN__DELETED_FOLDERS = 0;

    /**
     * The feature id for the '<em><b>Deleted Items</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECYCLE_BIN__DELETED_ITEMS = 1;

    /**
     * The number of structural features of the '<em>Recycle Bin</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECYCLE_BIN_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Recycle Bin</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECYCLE_BIN_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.talend.recyclebin.impl.TalendItemImpl <em>Talaxie Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.recyclebin.impl.TalendItemImpl
     * @see org.talend.recyclebin.impl.RecyclebinPackageImpl#getTalendItem()
     * @generated
     */
    int TALEND_ITEM = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__ID = 0;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__PATH = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__TYPE = 2;

    /**
     * The number of structural features of the '<em>Talaxie Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Talaxie Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.talend.recyclebin.RecycleBin <em>Recycle Bin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Recycle Bin</em>'.
     * @see org.talend.recyclebin.RecycleBin
     * @generated
     */
    EClass getRecycleBin();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.recyclebin.RecycleBin#getDeletedFolders <em>Deleted Folders</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Deleted Folders</em>'.
     * @see org.talend.recyclebin.RecycleBin#getDeletedFolders()
     * @see #getRecycleBin()
     * @generated
     */
    EAttribute getRecycleBin_DeletedFolders();

    /**
     * Returns the meta object for the reference list '{@link org.talend.recyclebin.RecycleBin#getDeletedItems <em>Deleted Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Deleted Items</em>'.
     * @see org.talend.recyclebin.RecycleBin#getDeletedItems()
     * @see #getRecycleBin()
     * @generated
     */
    EReference getRecycleBin_DeletedItems();

    /**
     * Returns the meta object for class '{@link org.talend.recyclebin.TalendItem <em>Talaxie Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Talaxie Item</em>'.
     * @see org.talend.recyclebin.TalendItem
     * @generated
     */
    EClass getTalendItem();

    /**
     * Returns the meta object for the attribute '{@link org.talend.recyclebin.TalendItem#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.talend.recyclebin.TalendItem#getId()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Id();

    /**
     * Returns the meta object for the attribute '{@link org.talend.recyclebin.TalendItem#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.talend.recyclebin.TalendItem#getPath()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Path();

    /**
     * Returns the meta object for the attribute '{@link org.talend.recyclebin.TalendItem#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.talend.recyclebin.TalendItem#getType()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Type();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    RecyclebinFactory getRecyclebinFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.recyclebin.impl.RecycleBinImpl <em>Recycle Bin</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.recyclebin.impl.RecycleBinImpl
         * @see org.talend.recyclebin.impl.RecyclebinPackageImpl#getRecycleBin()
         * @generated
         */
        EClass RECYCLE_BIN = eINSTANCE.getRecycleBin();

        /**
         * The meta object literal for the '<em><b>Deleted Folders</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RECYCLE_BIN__DELETED_FOLDERS = eINSTANCE.getRecycleBin_DeletedFolders();

        /**
         * The meta object literal for the '<em><b>Deleted Items</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RECYCLE_BIN__DELETED_ITEMS = eINSTANCE.getRecycleBin_DeletedItems();

        /**
         * The meta object literal for the '{@link org.talend.recyclebin.impl.TalendItemImpl <em>Talaxie Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.recyclebin.impl.TalendItemImpl
         * @see org.talend.recyclebin.impl.RecyclebinPackageImpl#getTalendItem()
         * @generated
         */
        EClass TALEND_ITEM = eINSTANCE.getTalendItem();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__ID = eINSTANCE.getTalendItem_Id();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__PATH = eINSTANCE.getTalendItem_Path();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__TYPE = eINSTANCE.getTalendItem_Type();

    }

} //RecyclebinPackage
