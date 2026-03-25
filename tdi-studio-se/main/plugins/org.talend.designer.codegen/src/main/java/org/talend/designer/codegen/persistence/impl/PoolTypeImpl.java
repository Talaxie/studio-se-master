/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.codegen.persistence.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.designer.codegen.i18n.Messages;
import org.talend.designer.codegen.persistence.EmittersPoolPackage;
import org.talend.designer.codegen.persistence.PoolType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pool Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.designer.codegen.persistence.impl.PoolTypeImpl#getPersistentPool <em>Persistent Pool</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PoolTypeImpl extends EObjectImpl implements PoolType {

    /**
     * The default value of the '{@link #getPersistentPool() <em>Persistent Pool</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getPersistentPool()
     * @generated
     * @ordered
     */
    protected static final byte[] PERSISTENT_POOL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPersistentPool() <em>Persistent Pool</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getPersistentPool()
     * @generated
     * @ordered
     */
    protected byte[] persistentPool = PERSISTENT_POOL_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PoolTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EClass eStaticClass() {
        return EmittersPoolPackage.Literals.POOL_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public byte[] getPersistentPool() {
        return persistentPool;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPersistentPool(byte[] newPersistentPool) {
        byte[] oldPersistentPool = persistentPool;
        persistentPool = newPersistentPool;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmittersPoolPackage.POOL_TYPE__PERSISTENT_POOL,
                    oldPersistentPool, persistentPool));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EmittersPoolPackage.POOL_TYPE__PERSISTENT_POOL:
            return getPersistentPool();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case EmittersPoolPackage.POOL_TYPE__PERSISTENT_POOL:
            setPersistentPool((byte[]) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
        case EmittersPoolPackage.POOL_TYPE__PERSISTENT_POOL:
            setPersistentPool(PERSISTENT_POOL_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case EmittersPoolPackage.POOL_TYPE__PERSISTENT_POOL:
            return PERSISTENT_POOL_EDEFAULT == null ? persistentPool != null : !PERSISTENT_POOL_EDEFAULT
                    .equals(persistentPool);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(Messages.getString("PoolTypeImpl.persistentPool", persistentPool)); //$NON-NLS-1$
        return result.toString();
    }

} // PoolTypeImpl
