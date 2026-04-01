/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.core.model.properties.FolderItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.Project;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.User;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Item State</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.core.model.properties.impl.ItemStateImpl#getPath <em>Path</em>}</li>
 * <li>{@link org.talend.core.model.properties.impl.ItemStateImpl#isDeleted <em>Deleted</em>}</li>
 * <li>{@link org.talend.core.model.properties.impl.ItemStateImpl#isLocked <em>Locked</em>}</li>
 * <li>{@link org.talend.core.model.properties.impl.ItemStateImpl#getLocker <em>Locker</em>}</li>
 * <li>{@link org.talend.core.model.properties.impl.ItemStateImpl#getLockDate <em>Lock Date</em>}</li>
 * <li>{@link org.talend.core.model.properties.impl.ItemStateImpl#getCommitDate <em>Commit Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemStateImpl extends EObjectImpl implements ItemState {

    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected static final String PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected String path = PATH_EDEFAULT;

    /**
     * The default value of the '{@link #isDeleted() <em>Deleted</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isDeleted()
     * @generated
     * @ordered
     */
    protected static final boolean DELETED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDeleted() <em>Deleted</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isDeleted()
     * @generated
     * @ordered
     */
    protected boolean deleted = DELETED_EDEFAULT;

    /**
     * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isLocked()
     * @generated
     * @ordered
     */
    protected static final boolean LOCKED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #isLocked()
     * @generated
     * @ordered
     */
    protected boolean locked = LOCKED_EDEFAULT;

    /**
     * The cached value of the '{@link #getLocker() <em>Locker</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getLocker()
     * @generated
     * @ordered
     */
    protected User locker;

    /**
     * The default value of the '{@link #getLockDate() <em>Lock Date</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getLockDate()
     * @generated
     * @ordered
     */
    protected static final Date LOCK_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLockDate() <em>Lock Date</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getLockDate()
     * @generated
     * @ordered
     */
    protected Date lockDate = LOCK_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getCommitDate() <em>Commit Date</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getCommitDate()
     * @generated
     * @ordered
     */
    protected static final Date COMMIT_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCommitDate() <em>Commit Date</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getCommitDate()
     * @generated
     * @ordered
     */
    protected Date commitDate = COMMIT_DATE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ItemStateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.ITEM_STATE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getPath() {
        return path;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPath(String newPath) {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM_STATE__PATH, oldPath, path));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public boolean isDeleted() {
        if (relatedItem != null && relatedItem instanceof FolderItem) {
            FolderItem folder = (FolderItem) relatedItem;

            String completePath = folder.getProperty().getLabel();
            if (folder.getParent() == null) {
                return false;
            }
            while (!(folder.getParent() instanceof Project)) {
                folder = (FolderItem) folder.getParent();
                if (folder.getParent() == null) {
                    return false;
                }
                completePath = folder.getProperty().getLabel() + "/" + completePath;
            }
            Project project = (Project) folder.getParent();

            if (project.getDeletedFolders().contains(completePath)) {
                return true;
            } else {
                return false;
            }
        }
        return deleted;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public void setDeleted(boolean newDeleted) {
        if (relatedItem != null && relatedItem instanceof FolderItem) {
            FolderItem folder = (FolderItem) relatedItem;

            String completePath = folder.getProperty().getLabel();
            if (folder.getParent() != null) {
                while (!(folder.getParent() instanceof Project)) {
                    folder = (FolderItem) folder.getParent();
                    if (folder.getParent() == null) {
                        return;
                    }
                    completePath = folder.getProperty().getLabel() + "/" + completePath;
                }
                Project project = (Project) folder.getParent();

                if (newDeleted) {
                    if (!project.getDeletedFolders().contains(completePath)) {
                        project.getDeletedFolders().add(completePath);
                    }
                } else {
                    project.getDeletedFolders().remove(completePath);
                }
            }
        }
        boolean oldDeleted = deleted;
        deleted = newDeleted;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM_STATE__DELETED, oldDeleted, deleted));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLocked(boolean newLocked) {
        boolean oldLocked = locked;
        locked = newLocked;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM_STATE__LOCKED, oldLocked, locked));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public User getLocker() {
        if (locker != null && locker.eIsProxy()) {
            InternalEObject oldLocker = (InternalEObject) locker;
            locker = (User) eResolveProxy(oldLocker);
            if (locker != oldLocker) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.ITEM_STATE__LOCKER, oldLocker,
                            locker));
            }
        }
        return locker;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public User basicGetLocker() {
        return locker;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLocker(User newLocker) {
        User oldLocker = locker;
        locker = newLocker;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM_STATE__LOCKER, oldLocker, locker));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Date getLockDate() {
        return lockDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLockDate(Date newLockDate) {
        Date oldLockDate = lockDate;
        lockDate = newLockDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM_STATE__LOCK_DATE, oldLockDate, lockDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Date getCommitDate() {
        return commitDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setCommitDate(Date newCommitDate) {
        Date oldCommitDate = commitDate;
        commitDate = newCommitDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM_STATE__COMMIT_DATE, oldCommitDate,
                    commitDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case PropertiesPackage.ITEM_STATE__PATH:
            return getPath();
        case PropertiesPackage.ITEM_STATE__DELETED:
            return isDeleted() ? Boolean.TRUE : Boolean.FALSE;
        case PropertiesPackage.ITEM_STATE__LOCKED:
            return isLocked() ? Boolean.TRUE : Boolean.FALSE;
        case PropertiesPackage.ITEM_STATE__LOCKER:
            if (resolve)
                return getLocker();
            return basicGetLocker();
        case PropertiesPackage.ITEM_STATE__LOCK_DATE:
            return getLockDate();
        case PropertiesPackage.ITEM_STATE__COMMIT_DATE:
            return getCommitDate();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case PropertiesPackage.ITEM_STATE__PATH:
            setPath((String) newValue);
            return;
        case PropertiesPackage.ITEM_STATE__DELETED:
            setDeleted(((Boolean) newValue).booleanValue());
            return;
        case PropertiesPackage.ITEM_STATE__LOCKED:
            setLocked(((Boolean) newValue).booleanValue());
            return;
        case PropertiesPackage.ITEM_STATE__LOCKER:
            setLocker((User) newValue);
            return;
        case PropertiesPackage.ITEM_STATE__LOCK_DATE:
            setLockDate((Date) newValue);
            return;
        case PropertiesPackage.ITEM_STATE__COMMIT_DATE:
            setCommitDate((Date) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case PropertiesPackage.ITEM_STATE__PATH:
            setPath(PATH_EDEFAULT);
            return;
        case PropertiesPackage.ITEM_STATE__DELETED:
            setDeleted(DELETED_EDEFAULT);
            return;
        case PropertiesPackage.ITEM_STATE__LOCKED:
            setLocked(LOCKED_EDEFAULT);
            return;
        case PropertiesPackage.ITEM_STATE__LOCKER:
            setLocker((User) null);
            return;
        case PropertiesPackage.ITEM_STATE__LOCK_DATE:
            setLockDate(LOCK_DATE_EDEFAULT);
            return;
        case PropertiesPackage.ITEM_STATE__COMMIT_DATE:
            setCommitDate(COMMIT_DATE_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case PropertiesPackage.ITEM_STATE__PATH:
            return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
        case PropertiesPackage.ITEM_STATE__DELETED:
            return deleted != DELETED_EDEFAULT;
        case PropertiesPackage.ITEM_STATE__LOCKED:
            return locked != LOCKED_EDEFAULT;
        case PropertiesPackage.ITEM_STATE__LOCKER:
            return locker != null;
        case PropertiesPackage.ITEM_STATE__LOCK_DATE:
            return LOCK_DATE_EDEFAULT == null ? lockDate != null : !LOCK_DATE_EDEFAULT.equals(lockDate);
        case PropertiesPackage.ITEM_STATE__COMMIT_DATE:
            return COMMIT_DATE_EDEFAULT == null ? commitDate != null : !COMMIT_DATE_EDEFAULT.equals(commitDate);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (path: ");
        result.append(path);
        result.append(", deleted: ");
        result.append(deleted);
        result.append(", locked: ");
        result.append(locked);
        result.append(", lockDate: ");
        result.append(lockDate);
        result.append(", commitDate: ");
        result.append(commitDate);
        result.append(')');
        return result.toString();
    }

    private Item relatedItem;

    /**
     * @generated NOT
     */
    public void setItemRelated(Item item) {
        relatedItem = item;
    }
} // ItemStateImpl
