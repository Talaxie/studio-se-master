/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.resource.record.impl.RecordDefImpl;
import orgomg.cwmx.resource.dmsii.DataSet;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.Set;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataSetImpl#isIsGlobal <em>Is Global</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataSetImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataSetImpl#getReorganize <em>Reorganize</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataSetImpl#isIsRequiredAll <em>Is Required All</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataSetImpl#getPartitioningSet <em>Partitioning Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSetImpl extends RecordDefImpl implements DataSet {

    /**
     * The default value of the '{@link #isIsGlobal() <em>Is Global</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsGlobal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_GLOBAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsGlobal() <em>Is Global</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsGlobal()
     * @generated
     * @ordered
     */
    protected boolean isGlobal = IS_GLOBAL_EDEFAULT;

    /**
     * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getOrganization()
     * @generated
     * @ordered
     */
    protected static final String ORGANIZATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOrganization()
     * @generated
     * @ordered
     */
    protected String organization = ORGANIZATION_EDEFAULT;

    /**
     * The default value of the '{@link #getReorganize() <em>Reorganize</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getReorganize()
     * @generated
     * @ordered
     */
    protected static final String REORGANIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReorganize() <em>Reorganize</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getReorganize()
     * @generated
     * @ordered
     */
    protected String reorganize = REORGANIZE_EDEFAULT;

    /**
     * The default value of the '{@link #isIsRequiredAll() <em>Is Required All</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsRequiredAll()
     * @generated
     * @ordered
     */
    protected static final boolean IS_REQUIRED_ALL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsRequiredAll() <em>Is Required All</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsRequiredAll()
     * @generated
     * @ordered
     */
    protected boolean isRequiredAll = IS_REQUIRED_ALL_EDEFAULT;

    /**
     * The cached value of the '{@link #getPartitioningSet() <em>Partitioning Set</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPartitioningSet()
     * @generated
     * @ordered
     */
    protected Set partitioningSet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected DataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmsiiPackage.Literals.DATA_SET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsGlobal() {
        return isGlobal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsGlobal(boolean newIsGlobal) {
        boolean oldIsGlobal = isGlobal;
        isGlobal = newIsGlobal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_SET__IS_GLOBAL, oldIsGlobal, isGlobal));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOrganization(String newOrganization) {
        String oldOrganization = organization;
        organization = newOrganization;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_SET__ORGANIZATION, oldOrganization,
                    organization));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getReorganize() {
        return reorganize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setReorganize(String newReorganize) {
        String oldReorganize = reorganize;
        reorganize = newReorganize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_SET__REORGANIZE, oldReorganize, reorganize));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsRequiredAll() {
        return isRequiredAll;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsRequiredAll(boolean newIsRequiredAll) {
        boolean oldIsRequiredAll = isRequiredAll;
        isRequiredAll = newIsRequiredAll;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_SET__IS_REQUIRED_ALL, oldIsRequiredAll,
                    isRequiredAll));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Set getPartitioningSet() {
        if (partitioningSet != null && partitioningSet.eIsProxy()) {
            InternalEObject oldPartitioningSet = (InternalEObject) partitioningSet;
            partitioningSet = (Set) eResolveProxy(oldPartitioningSet);
            if (partitioningSet != oldPartitioningSet) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmsiiPackage.DATA_SET__PARTITIONING_SET,
                            oldPartitioningSet, partitioningSet));
            }
        }
        return partitioningSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Set basicGetPartitioningSet() {
        return partitioningSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPartitioningSet(Set newPartitioningSet, NotificationChain msgs) {
        Set oldPartitioningSet = partitioningSet;
        partitioningSet = newPartitioningSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DmsiiPackage.DATA_SET__PARTITIONING_SET, oldPartitioningSet, newPartitioningSet);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPartitioningSet(Set newPartitioningSet) {
        if (newPartitioningSet != partitioningSet) {
            NotificationChain msgs = null;
            if (partitioningSet != null)
                msgs = ((InternalEObject) partitioningSet).eInverseRemove(this, DmsiiPackage.SET__PARTITIONED_DATA_SET,
                        Set.class, msgs);
            if (newPartitioningSet != null)
                msgs = ((InternalEObject) newPartitioningSet).eInverseAdd(this, DmsiiPackage.SET__PARTITIONED_DATA_SET,
                        Set.class, msgs);
            msgs = basicSetPartitioningSet(newPartitioningSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_SET__PARTITIONING_SET, newPartitioningSet,
                    newPartitioningSet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.DATA_SET__PARTITIONING_SET:
            if (partitioningSet != null)
                msgs = ((InternalEObject) partitioningSet).eInverseRemove(this, DmsiiPackage.SET__PARTITIONED_DATA_SET,
                        Set.class, msgs);
            return basicSetPartitioningSet((Set) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.DATA_SET__PARTITIONING_SET:
            return basicSetPartitioningSet(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DmsiiPackage.DATA_SET__IS_GLOBAL:
            return isIsGlobal();
        case DmsiiPackage.DATA_SET__ORGANIZATION:
            return getOrganization();
        case DmsiiPackage.DATA_SET__REORGANIZE:
            return getReorganize();
        case DmsiiPackage.DATA_SET__IS_REQUIRED_ALL:
            return isIsRequiredAll();
        case DmsiiPackage.DATA_SET__PARTITIONING_SET:
            if (resolve)
                return getPartitioningSet();
            return basicGetPartitioningSet();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DmsiiPackage.DATA_SET__IS_GLOBAL:
            setIsGlobal((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_SET__ORGANIZATION:
            setOrganization((String) newValue);
            return;
        case DmsiiPackage.DATA_SET__REORGANIZE:
            setReorganize((String) newValue);
            return;
        case DmsiiPackage.DATA_SET__IS_REQUIRED_ALL:
            setIsRequiredAll((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_SET__PARTITIONING_SET:
            setPartitioningSet((Set) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case DmsiiPackage.DATA_SET__IS_GLOBAL:
            setIsGlobal(IS_GLOBAL_EDEFAULT);
            return;
        case DmsiiPackage.DATA_SET__ORGANIZATION:
            setOrganization(ORGANIZATION_EDEFAULT);
            return;
        case DmsiiPackage.DATA_SET__REORGANIZE:
            setReorganize(REORGANIZE_EDEFAULT);
            return;
        case DmsiiPackage.DATA_SET__IS_REQUIRED_ALL:
            setIsRequiredAll(IS_REQUIRED_ALL_EDEFAULT);
            return;
        case DmsiiPackage.DATA_SET__PARTITIONING_SET:
            setPartitioningSet((Set) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DmsiiPackage.DATA_SET__IS_GLOBAL:
            return isGlobal != IS_GLOBAL_EDEFAULT;
        case DmsiiPackage.DATA_SET__ORGANIZATION:
            return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
        case DmsiiPackage.DATA_SET__REORGANIZE:
            return REORGANIZE_EDEFAULT == null ? reorganize != null : !REORGANIZE_EDEFAULT.equals(reorganize);
        case DmsiiPackage.DATA_SET__IS_REQUIRED_ALL:
            return isRequiredAll != IS_REQUIRED_ALL_EDEFAULT;
        case DmsiiPackage.DATA_SET__PARTITIONING_SET:
            return partitioningSet != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isGlobal: ");
        result.append(isGlobal);
        result.append(", organization: ");
        result.append(organization);
        result.append(", reorganize: ");
        result.append(reorganize);
        result.append(", isRequiredAll: ");
        result.append(isRequiredAll);
        result.append(')');
        return result.toString();
    }

} // DataSetImpl
