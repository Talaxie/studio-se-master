/**
 */
package org.talend.model.recyclebin.impl;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.model.recyclebin.RecycleBin;
import org.talend.model.recyclebin.RecycleBinPackage;
import org.talend.model.recyclebin.TalendItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recycle Bin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.model.recyclebin.impl.RecycleBinImpl#getDeletedFolders <em>Deleted Folders</em>}</li>
 *   <li>{@link org.talend.model.recyclebin.impl.RecycleBinImpl#getDeletedItems <em>Deleted Items</em>}</li>
 *   <li>{@link org.talend.model.recyclebin.impl.RecycleBinImpl#getLastUpdate <em>Last Update</em>}</li>
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
     * The cached value of the '{@link #getDeletedItems() <em>Deleted Items</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeletedItems()
     * @generated
     * @ordered
     */
    protected EList<TalendItem> deletedItems;

    /**
     * The default value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastUpdate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_UPDATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastUpdate()
     * @generated
     * @ordered
     */
    protected Date lastUpdate = LAST_UPDATE_EDEFAULT;

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
        return RecycleBinPackage.Literals.RECYCLE_BIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getDeletedFolders() {
        if (deletedFolders == null) {
            deletedFolders = new EDataTypeUniqueEList<String>(String.class, this, RecycleBinPackage.RECYCLE_BIN__DELETED_FOLDERS);
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
            deletedItems = new EObjectContainmentEList<TalendItem>(TalendItem.class, this, RecycleBinPackage.RECYCLE_BIN__DELETED_ITEMS);
        }
        return deletedItems;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastUpdate(Date newLastUpdate) {
        Date oldLastUpdate = lastUpdate;
        lastUpdate = newLastUpdate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RecycleBinPackage.RECYCLE_BIN__LAST_UPDATE, oldLastUpdate, lastUpdate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RecycleBinPackage.RECYCLE_BIN__DELETED_ITEMS:
                return ((InternalEList<?>)getDeletedItems()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RecycleBinPackage.RECYCLE_BIN__DELETED_FOLDERS:
                return getDeletedFolders();
            case RecycleBinPackage.RECYCLE_BIN__DELETED_ITEMS:
                return getDeletedItems();
            case RecycleBinPackage.RECYCLE_BIN__LAST_UPDATE:
                return getLastUpdate();
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
            case RecycleBinPackage.RECYCLE_BIN__DELETED_FOLDERS:
                getDeletedFolders().clear();
                getDeletedFolders().addAll((Collection<? extends String>)newValue);
                return;
            case RecycleBinPackage.RECYCLE_BIN__DELETED_ITEMS:
                getDeletedItems().clear();
                getDeletedItems().addAll((Collection<? extends TalendItem>)newValue);
                return;
            case RecycleBinPackage.RECYCLE_BIN__LAST_UPDATE:
                setLastUpdate((Date)newValue);
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
            case RecycleBinPackage.RECYCLE_BIN__DELETED_FOLDERS:
                getDeletedFolders().clear();
                return;
            case RecycleBinPackage.RECYCLE_BIN__DELETED_ITEMS:
                getDeletedItems().clear();
                return;
            case RecycleBinPackage.RECYCLE_BIN__LAST_UPDATE:
                setLastUpdate(LAST_UPDATE_EDEFAULT);
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
            case RecycleBinPackage.RECYCLE_BIN__DELETED_FOLDERS:
                return deletedFolders != null && !deletedFolders.isEmpty();
            case RecycleBinPackage.RECYCLE_BIN__DELETED_ITEMS:
                return deletedItems != null && !deletedItems.isEmpty();
            case RecycleBinPackage.RECYCLE_BIN__LAST_UPDATE:
                return LAST_UPDATE_EDEFAULT == null ? lastUpdate != null : !LAST_UPDATE_EDEFAULT.equals(lastUpdate);
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
        result.append(", lastUpdate: ");
        result.append(lastUpdate);
        result.append(')');
        return result.toString();
    }

} //RecycleBinImpl
