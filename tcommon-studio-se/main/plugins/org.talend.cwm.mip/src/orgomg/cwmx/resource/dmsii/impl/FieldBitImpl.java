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
import org.eclipse.emf.ecore.util.EcoreUtil;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;
import orgomg.cwmx.resource.dmsii.DataItem;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.FieldBit;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Field Bit</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.FieldBitImpl#getDataItem <em>Data Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldBitImpl extends ModelElementImpl implements FieldBit {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected FieldBitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmsiiPackage.Literals.FIELD_BIT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataItem getDataItem() {
        if (eContainerFeatureID() != DmsiiPackage.FIELD_BIT__DATA_ITEM)
            return null;
        return (DataItem) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataItem(DataItem newDataItem, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newDataItem, DmsiiPackage.FIELD_BIT__DATA_ITEM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDataItem(DataItem newDataItem) {
        if (newDataItem != eInternalContainer()
                || (eContainerFeatureID() != DmsiiPackage.FIELD_BIT__DATA_ITEM && newDataItem != null)) {
            if (EcoreUtil.isAncestor(this, newDataItem))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDataItem != null)
                msgs = ((InternalEObject) newDataItem).eInverseAdd(this, DmsiiPackage.DATA_ITEM__FIELD_BIT, DataItem.class, msgs);
            msgs = basicSetDataItem(newDataItem, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.FIELD_BIT__DATA_ITEM, newDataItem, newDataItem));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.FIELD_BIT__DATA_ITEM:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetDataItem((DataItem) otherEnd, msgs);
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
        case DmsiiPackage.FIELD_BIT__DATA_ITEM:
            return basicSetDataItem(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case DmsiiPackage.FIELD_BIT__DATA_ITEM:
            return eInternalContainer().eInverseRemove(this, DmsiiPackage.DATA_ITEM__FIELD_BIT, DataItem.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DmsiiPackage.FIELD_BIT__DATA_ITEM:
            return getDataItem();
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
        case DmsiiPackage.FIELD_BIT__DATA_ITEM:
            setDataItem((DataItem) newValue);
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
        case DmsiiPackage.FIELD_BIT__DATA_ITEM:
            setDataItem((DataItem) null);
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
        case DmsiiPackage.FIELD_BIT__DATA_ITEM:
            return getDataItem() != null;
        }
        return super.eIsSet(featureID);
    }

} // FieldBitImpl
