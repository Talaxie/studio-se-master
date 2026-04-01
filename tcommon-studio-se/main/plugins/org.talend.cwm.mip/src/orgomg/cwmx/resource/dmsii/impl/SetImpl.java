/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwmx.resource.dmsii.DataItem;
import orgomg.cwmx.resource.dmsii.DataSet;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.Set;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.SetImpl#getSetType <em>Set Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.SetImpl#getReorganize <em>Reorganize</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.SetImpl#getKeyDataItem <em>Key Data Item</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.SetImpl#getPartitionedSet <em>Partitioned Set</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.SetImpl#getPartitioningSet <em>Partitioning Set</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.SetImpl#getPartitionedDataSet <em>Partitioned Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetImpl extends SetStructureImpl implements Set {

    /**
     * The default value of the '{@link #getSetType() <em>Set Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSetType()
     * @generated
     * @ordered
     */
    protected static final String SET_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSetType() <em>Set Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSetType()
     * @generated
     * @ordered
     */
    protected String setType = SET_TYPE_EDEFAULT;

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
     * The cached value of the '{@link #getKeyDataItem() <em>Key Data Item</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getKeyDataItem()
     * @generated
     * @ordered
     */
    protected EList<DataItem> keyDataItem;

    /**
     * The cached value of the '{@link #getPartitionedSet() <em>Partitioned Set</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPartitionedSet()
     * @generated
     * @ordered
     */
    protected EList<Set> partitionedSet;

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
     * The cached value of the '{@link #getPartitionedDataSet() <em>Partitioned Data Set</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPartitionedDataSet()
     * @generated
     * @ordered
     */
    protected DataSet partitionedDataSet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmsiiPackage.Literals.SET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getSetType() {
        return setType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSetType(String newSetType) {
        String oldSetType = setType;
        setType = newSetType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.SET__SET_TYPE, oldSetType, setType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.SET__REORGANIZE, oldReorganize, reorganize));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<DataItem> getKeyDataItem() {
        if (keyDataItem == null) {
            keyDataItem = new EObjectWithInverseResolvingEList.ManyInverse<DataItem>(DataItem.class, this,
                    DmsiiPackage.SET__KEY_DATA_ITEM, DmsiiPackage.DATA_ITEM__KEY_DATA_SET);
        }
        return keyDataItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Set> getPartitionedSet() {
        if (partitionedSet == null) {
            partitionedSet = new EObjectWithInverseResolvingEList<Set>(Set.class, this, DmsiiPackage.SET__PARTITIONED_SET,
                    DmsiiPackage.SET__PARTITIONING_SET);
        }
        return partitionedSet;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmsiiPackage.SET__PARTITIONING_SET,
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmsiiPackage.SET__PARTITIONING_SET,
                    oldPartitioningSet, newPartitioningSet);
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
                msgs = ((InternalEObject) partitioningSet).eInverseRemove(this, DmsiiPackage.SET__PARTITIONED_SET, Set.class,
                        msgs);
            if (newPartitioningSet != null)
                msgs = ((InternalEObject) newPartitioningSet).eInverseAdd(this, DmsiiPackage.SET__PARTITIONED_SET, Set.class,
                        msgs);
            msgs = basicSetPartitioningSet(newPartitioningSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.SET__PARTITIONING_SET, newPartitioningSet,
                    newPartitioningSet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataSet getPartitionedDataSet() {
        if (partitionedDataSet != null && partitionedDataSet.eIsProxy()) {
            InternalEObject oldPartitionedDataSet = (InternalEObject) partitionedDataSet;
            partitionedDataSet = (DataSet) eResolveProxy(oldPartitionedDataSet);
            if (partitionedDataSet != oldPartitionedDataSet) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmsiiPackage.SET__PARTITIONED_DATA_SET,
                            oldPartitionedDataSet, partitionedDataSet));
            }
        }
        return partitionedDataSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataSet basicGetPartitionedDataSet() {
        return partitionedDataSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPartitionedDataSet(DataSet newPartitionedDataSet, NotificationChain msgs) {
        DataSet oldPartitionedDataSet = partitionedDataSet;
        partitionedDataSet = newPartitionedDataSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DmsiiPackage.SET__PARTITIONED_DATA_SET, oldPartitionedDataSet, newPartitionedDataSet);
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
    public void setPartitionedDataSet(DataSet newPartitionedDataSet) {
        if (newPartitionedDataSet != partitionedDataSet) {
            NotificationChain msgs = null;
            if (partitionedDataSet != null)
                msgs = ((InternalEObject) partitionedDataSet).eInverseRemove(this, DmsiiPackage.DATA_SET__PARTITIONING_SET,
                        DataSet.class, msgs);
            if (newPartitionedDataSet != null)
                msgs = ((InternalEObject) newPartitionedDataSet).eInverseAdd(this, DmsiiPackage.DATA_SET__PARTITIONING_SET,
                        DataSet.class, msgs);
            msgs = basicSetPartitionedDataSet(newPartitionedDataSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.SET__PARTITIONED_DATA_SET, newPartitionedDataSet,
                    newPartitionedDataSet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.SET__KEY_DATA_ITEM:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getKeyDataItem()).basicAdd(otherEnd, msgs);
        case DmsiiPackage.SET__PARTITIONED_SET:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getPartitionedSet()).basicAdd(otherEnd, msgs);
        case DmsiiPackage.SET__PARTITIONING_SET:
            if (partitioningSet != null)
                msgs = ((InternalEObject) partitioningSet).eInverseRemove(this, DmsiiPackage.SET__PARTITIONED_SET, Set.class,
                        msgs);
            return basicSetPartitioningSet((Set) otherEnd, msgs);
        case DmsiiPackage.SET__PARTITIONED_DATA_SET:
            if (partitionedDataSet != null)
                msgs = ((InternalEObject) partitionedDataSet).eInverseRemove(this, DmsiiPackage.DATA_SET__PARTITIONING_SET,
                        DataSet.class, msgs);
            return basicSetPartitionedDataSet((DataSet) otherEnd, msgs);
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
        case DmsiiPackage.SET__KEY_DATA_ITEM:
            return ((InternalEList<?>) getKeyDataItem()).basicRemove(otherEnd, msgs);
        case DmsiiPackage.SET__PARTITIONED_SET:
            return ((InternalEList<?>) getPartitionedSet()).basicRemove(otherEnd, msgs);
        case DmsiiPackage.SET__PARTITIONING_SET:
            return basicSetPartitioningSet(null, msgs);
        case DmsiiPackage.SET__PARTITIONED_DATA_SET:
            return basicSetPartitionedDataSet(null, msgs);
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
        case DmsiiPackage.SET__SET_TYPE:
            return getSetType();
        case DmsiiPackage.SET__REORGANIZE:
            return getReorganize();
        case DmsiiPackage.SET__KEY_DATA_ITEM:
            return getKeyDataItem();
        case DmsiiPackage.SET__PARTITIONED_SET:
            return getPartitionedSet();
        case DmsiiPackage.SET__PARTITIONING_SET:
            if (resolve)
                return getPartitioningSet();
            return basicGetPartitioningSet();
        case DmsiiPackage.SET__PARTITIONED_DATA_SET:
            if (resolve)
                return getPartitionedDataSet();
            return basicGetPartitionedDataSet();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DmsiiPackage.SET__SET_TYPE:
            setSetType((String) newValue);
            return;
        case DmsiiPackage.SET__REORGANIZE:
            setReorganize((String) newValue);
            return;
        case DmsiiPackage.SET__KEY_DATA_ITEM:
            getKeyDataItem().clear();
            getKeyDataItem().addAll((Collection<? extends DataItem>) newValue);
            return;
        case DmsiiPackage.SET__PARTITIONED_SET:
            getPartitionedSet().clear();
            getPartitionedSet().addAll((Collection<? extends Set>) newValue);
            return;
        case DmsiiPackage.SET__PARTITIONING_SET:
            setPartitioningSet((Set) newValue);
            return;
        case DmsiiPackage.SET__PARTITIONED_DATA_SET:
            setPartitionedDataSet((DataSet) newValue);
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
        case DmsiiPackage.SET__SET_TYPE:
            setSetType(SET_TYPE_EDEFAULT);
            return;
        case DmsiiPackage.SET__REORGANIZE:
            setReorganize(REORGANIZE_EDEFAULT);
            return;
        case DmsiiPackage.SET__KEY_DATA_ITEM:
            getKeyDataItem().clear();
            return;
        case DmsiiPackage.SET__PARTITIONED_SET:
            getPartitionedSet().clear();
            return;
        case DmsiiPackage.SET__PARTITIONING_SET:
            setPartitioningSet((Set) null);
            return;
        case DmsiiPackage.SET__PARTITIONED_DATA_SET:
            setPartitionedDataSet((DataSet) null);
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
        case DmsiiPackage.SET__SET_TYPE:
            return SET_TYPE_EDEFAULT == null ? setType != null : !SET_TYPE_EDEFAULT.equals(setType);
        case DmsiiPackage.SET__REORGANIZE:
            return REORGANIZE_EDEFAULT == null ? reorganize != null : !REORGANIZE_EDEFAULT.equals(reorganize);
        case DmsiiPackage.SET__KEY_DATA_ITEM:
            return keyDataItem != null && !keyDataItem.isEmpty();
        case DmsiiPackage.SET__PARTITIONED_SET:
            return partitionedSet != null && !partitionedSet.isEmpty();
        case DmsiiPackage.SET__PARTITIONING_SET:
            return partitioningSet != null;
        case DmsiiPackage.SET__PARTITIONED_DATA_SET:
            return partitionedDataSet != null;
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
        result.append(" (setType: ");
        result.append(setType);
        result.append(", reorganize: ");
        result.append(reorganize);
        result.append(')');
        return result.toString();
    }

} // SetImpl
