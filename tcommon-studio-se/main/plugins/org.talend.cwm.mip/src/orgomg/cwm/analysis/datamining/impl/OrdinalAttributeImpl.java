/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.OrderType;
import orgomg.cwm.analysis.datamining.OrdinalAttribute;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ordinal Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.OrdinalAttributeImpl#isIsCyclic <em>Is Cyclic</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.OrdinalAttributeImpl#getOrderingType <em>Ordering Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrdinalAttributeImpl extends CategoricalAttributeImpl implements OrdinalAttribute {

    /**
     * The default value of the '{@link #isIsCyclic() <em>Is Cyclic</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsCyclic()
     * @generated
     * @ordered
     */
    protected static final boolean IS_CYCLIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsCyclic() <em>Is Cyclic</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsCyclic()
     * @generated
     * @ordered
     */
    protected boolean isCyclic = IS_CYCLIC_EDEFAULT;

    /**
     * The default value of the '{@link #getOrderingType() <em>Ordering Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getOrderingType()
     * @generated
     * @ordered
     */
    protected static final OrderType ORDERING_TYPE_EDEFAULT = OrderType.ALPHABETIC;

    /**
     * The cached value of the '{@link #getOrderingType() <em>Ordering Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getOrderingType()
     * @generated
     * @ordered
     */
    protected OrderType orderingType = ORDERING_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected OrdinalAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.ORDINAL_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsCyclic() {
        return isCyclic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsCyclic(boolean newIsCyclic) {
        boolean oldIsCyclic = isCyclic;
        isCyclic = newIsCyclic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.ORDINAL_ATTRIBUTE__IS_CYCLIC, oldIsCyclic,
                    isCyclic));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public OrderType getOrderingType() {
        return orderingType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOrderingType(OrderType newOrderingType) {
        OrderType oldOrderingType = orderingType;
        orderingType = newOrderingType == null ? ORDERING_TYPE_EDEFAULT : newOrderingType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.ORDINAL_ATTRIBUTE__ORDERING_TYPE,
                    oldOrderingType, orderingType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DataminingPackage.ORDINAL_ATTRIBUTE__IS_CYCLIC:
            return isIsCyclic();
        case DataminingPackage.ORDINAL_ATTRIBUTE__ORDERING_TYPE:
            return getOrderingType();
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
        case DataminingPackage.ORDINAL_ATTRIBUTE__IS_CYCLIC:
            setIsCyclic((Boolean) newValue);
            return;
        case DataminingPackage.ORDINAL_ATTRIBUTE__ORDERING_TYPE:
            setOrderingType((OrderType) newValue);
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
        case DataminingPackage.ORDINAL_ATTRIBUTE__IS_CYCLIC:
            setIsCyclic(IS_CYCLIC_EDEFAULT);
            return;
        case DataminingPackage.ORDINAL_ATTRIBUTE__ORDERING_TYPE:
            setOrderingType(ORDERING_TYPE_EDEFAULT);
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
        case DataminingPackage.ORDINAL_ATTRIBUTE__IS_CYCLIC:
            return isCyclic != IS_CYCLIC_EDEFAULT;
        case DataminingPackage.ORDINAL_ATTRIBUTE__ORDERING_TYPE:
            return orderingType != ORDERING_TYPE_EDEFAULT;
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
        result.append(" (isCyclic: ");
        result.append(isCyclic);
        result.append(", orderingType: ");
        result.append(orderingType);
        result.append(')');
        return result.toString();
    }

} // OrdinalAttributeImpl
