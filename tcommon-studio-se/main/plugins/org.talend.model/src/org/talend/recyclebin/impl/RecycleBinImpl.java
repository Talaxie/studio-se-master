/**
 */
package org.talend.recyclebin.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.talend.recyclebin.RecycleBin;
import org.talend.recyclebin.RecyclebinPackage;
import org.talend.recyclebin.TalendItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recycle Bin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.recyclebin.impl.RecycleBinImpl#getDeletedFolders <em>Deleted Folders</em>}</li>
 *   <li>{@link org.talend.recyclebin.impl.RecycleBinImpl#getDeletedItems <em>Deleted Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecycleBinImpl extends MinimalEObjectImpl.Container implements RecycleBin {
    /**
     * The cached value of the '{@link #getDeletedFolders() <em>Deleted Folders</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeletedFolders()
     * @generated
     * @ordered
     */
    protected EList<String> deletedFolders;

    /**
     * The cached value of the '{@link #getDeletedItems() <em>Deleted Items</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeletedItems()
     * @generated
     * @ordered
     */
    protected EList<TalendItem> deletedItems;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RecycleBinImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RecyclebinPackage.Literals.RECYCLE_BIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getDeletedFolders() {
        if (deletedFolders == null) {
            deletedFolders = new EDataTypeUniqueEList<String>(String.class, this, RecyclebinPackage.RECYCLE_BIN__DELETED_FOLDERS);
        }
        return deletedFolders;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TalendItem> getDeletedItems() {
        if (deletedItems == null) {
            deletedItems = new EObjectResolvingEList<TalendItem>(TalendItem.class, this, RecyclebinPackage.RECYCLE_BIN__DELETED_ITEMS);
        }
        return deletedItems;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RecyclebinPackage.RECYCLE_BIN__DELETED_FOLDERS:
                return getDeletedFolders();
            case RecyclebinPackage.RECYCLE_BIN__DELETED_ITEMS:
                return getDeletedItems();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RecyclebinPackage.RECYCLE_BIN__DELETED_FOLDERS:
                getDeletedFolders().clear();
                getDeletedFolders().addAll((Collection<? extends String>)newValue);
                return;
            case RecyclebinPackage.RECYCLE_BIN__DELETED_ITEMS:
                getDeletedItems().clear();
                getDeletedItems().addAll((Collection<? extends TalendItem>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case RecyclebinPackage.RECYCLE_BIN__DELETED_FOLDERS:
                getDeletedFolders().clear();
                return;
            case RecyclebinPackage.RECYCLE_BIN__DELETED_ITEMS:
                getDeletedItems().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case RecyclebinPackage.RECYCLE_BIN__DELETED_FOLDERS:
                return deletedFolders != null && !deletedFolders.isEmpty();
            case RecyclebinPackage.RECYCLE_BIN__DELETED_ITEMS:
                return deletedItems != null && !deletedItems.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (deletedFolders: ");
        result.append(deletedFolders);
        result.append(')');
        return result.toString();
    }

} //RecycleBinImpl
