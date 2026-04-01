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
import orgomg.cwm.analysis.datamining.NumericAttribute;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numeric Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.NumericAttributeImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.NumericAttributeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.NumericAttributeImpl#isIsCyclic <em>Is Cyclic</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.NumericAttributeImpl#isIsDiscrete <em>Is Discrete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericAttributeImpl extends MiningAttributeImpl implements NumericAttribute {

    /**
     * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLowerBound()
     * @generated
     * @ordered
     */
    protected static final String LOWER_BOUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLowerBound()
     * @generated
     * @ordered
     */
    protected String lowerBound = LOWER_BOUND_EDEFAULT;

    /**
     * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getUpperBound()
     * @generated
     * @ordered
     */
    protected static final String UPPER_BOUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getUpperBound()
     * @generated
     * @ordered
     */
    protected String upperBound = UPPER_BOUND_EDEFAULT;

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
     * The default value of the '{@link #isIsDiscrete() <em>Is Discrete</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsDiscrete()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DISCRETE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsDiscrete() <em>Is Discrete</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsDiscrete()
     * @generated
     * @ordered
     */
    protected boolean isDiscrete = IS_DISCRETE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected NumericAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.NUMERIC_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getLowerBound() {
        return lowerBound;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLowerBound(String newLowerBound) {
        String oldLowerBound = lowerBound;
        lowerBound = newLowerBound;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.NUMERIC_ATTRIBUTE__LOWER_BOUND,
                    oldLowerBound, lowerBound));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getUpperBound() {
        return upperBound;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setUpperBound(String newUpperBound) {
        String oldUpperBound = upperBound;
        upperBound = newUpperBound;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.NUMERIC_ATTRIBUTE__UPPER_BOUND,
                    oldUpperBound, upperBound));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.NUMERIC_ATTRIBUTE__IS_CYCLIC, oldIsCyclic,
                    isCyclic));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsDiscrete() {
        return isDiscrete;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsDiscrete(boolean newIsDiscrete) {
        boolean oldIsDiscrete = isDiscrete;
        isDiscrete = newIsDiscrete;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.NUMERIC_ATTRIBUTE__IS_DISCRETE,
                    oldIsDiscrete, isDiscrete));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DataminingPackage.NUMERIC_ATTRIBUTE__LOWER_BOUND:
            return getLowerBound();
        case DataminingPackage.NUMERIC_ATTRIBUTE__UPPER_BOUND:
            return getUpperBound();
        case DataminingPackage.NUMERIC_ATTRIBUTE__IS_CYCLIC:
            return isIsCyclic();
        case DataminingPackage.NUMERIC_ATTRIBUTE__IS_DISCRETE:
            return isIsDiscrete();
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
        case DataminingPackage.NUMERIC_ATTRIBUTE__LOWER_BOUND:
            setLowerBound((String) newValue);
            return;
        case DataminingPackage.NUMERIC_ATTRIBUTE__UPPER_BOUND:
            setUpperBound((String) newValue);
            return;
        case DataminingPackage.NUMERIC_ATTRIBUTE__IS_CYCLIC:
            setIsCyclic((Boolean) newValue);
            return;
        case DataminingPackage.NUMERIC_ATTRIBUTE__IS_DISCRETE:
            setIsDiscrete((Boolean) newValue);
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
        case DataminingPackage.NUMERIC_ATTRIBUTE__LOWER_BOUND:
            setLowerBound(LOWER_BOUND_EDEFAULT);
            return;
        case DataminingPackage.NUMERIC_ATTRIBUTE__UPPER_BOUND:
            setUpperBound(UPPER_BOUND_EDEFAULT);
            return;
        case DataminingPackage.NUMERIC_ATTRIBUTE__IS_CYCLIC:
            setIsCyclic(IS_CYCLIC_EDEFAULT);
            return;
        case DataminingPackage.NUMERIC_ATTRIBUTE__IS_DISCRETE:
            setIsDiscrete(IS_DISCRETE_EDEFAULT);
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
        case DataminingPackage.NUMERIC_ATTRIBUTE__LOWER_BOUND:
            return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
        case DataminingPackage.NUMERIC_ATTRIBUTE__UPPER_BOUND:
            return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
        case DataminingPackage.NUMERIC_ATTRIBUTE__IS_CYCLIC:
            return isCyclic != IS_CYCLIC_EDEFAULT;
        case DataminingPackage.NUMERIC_ATTRIBUTE__IS_DISCRETE:
            return isDiscrete != IS_DISCRETE_EDEFAULT;
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
        result.append(" (lowerBound: ");
        result.append(lowerBound);
        result.append(", upperBound: ");
        result.append(upperBound);
        result.append(", isCyclic: ");
        result.append(isCyclic);
        result.append(", isDiscrete: ");
        result.append(isDiscrete);
        result.append(')');
        return result.toString();
    }

} // NumericAttributeImpl
