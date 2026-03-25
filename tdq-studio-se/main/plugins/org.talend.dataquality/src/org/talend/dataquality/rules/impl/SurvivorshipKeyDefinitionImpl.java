/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.rules.AlgorithmDefinition;
import org.talend.dataquality.rules.RulesPackage;
import org.talend.dataquality.rules.SurvivorshipKeyDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survivorship Key Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.impl.SurvivorshipKeyDefinitionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.SurvivorshipKeyDefinitionImpl#isAllowManualResolution <em>Allow Manual Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurvivorshipKeyDefinitionImpl extends KeyDefinitionImpl implements SurvivorshipKeyDefinition {
    /**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected AlgorithmDefinition function;

    /**
     * The default value of the '{@link #isAllowManualResolution() <em>Allow Manual Resolution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllowManualResolution()
     * @generated
     * @ordered
     */
    protected static final boolean ALLOW_MANUAL_RESOLUTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAllowManualResolution() <em>Allow Manual Resolution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllowManualResolution()
     * @generated
     * @ordered
     */
    protected boolean allowManualResolution = ALLOW_MANUAL_RESOLUTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SurvivorshipKeyDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.SURVIVORSHIP_KEY_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlgorithmDefinition getFunction() {
        return function;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFunction(AlgorithmDefinition newFunction, NotificationChain msgs) {
        AlgorithmDefinition oldFunction = function;
        function = newFunction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.SURVIVORSHIP_KEY_DEFINITION__FUNCTION, oldFunction, newFunction);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFunction(AlgorithmDefinition newFunction) {
        if (newFunction != function) {
            NotificationChain msgs = null;
            if (function != null)
                msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.SURVIVORSHIP_KEY_DEFINITION__FUNCTION, null, msgs);
            if (newFunction != null)
                msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.SURVIVORSHIP_KEY_DEFINITION__FUNCTION, null, msgs);
            msgs = basicSetFunction(newFunction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.SURVIVORSHIP_KEY_DEFINITION__FUNCTION, newFunction, newFunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAllowManualResolution() {
        return allowManualResolution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAllowManualResolution(boolean newAllowManualResolution) {
        boolean oldAllowManualResolution = allowManualResolution;
        allowManualResolution = newAllowManualResolution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.SURVIVORSHIP_KEY_DEFINITION__ALLOW_MANUAL_RESOLUTION, oldAllowManualResolution, allowManualResolution));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulesPackage.SURVIVORSHIP_KEY_DEFINITION__FUNCTION:
                return basicSetFunction(null, msgs);
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
            case RulesPackage.SURVIVORSHIP_KEY_DEFINITION__FUNCTION:
                return getFunction();
            case RulesPackage.SURVIVORSHIP_KEY_DEFINITION__ALLOW_MANUAL_RESOLUTION:
                return isAllowManualResolution();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RulesPackage.SURVIVORSHIP_KEY_DEFINITION__FUNCTION:
                setFunction((AlgorithmDefinition)newValue);
                return;
            case RulesPackage.SURVIVORSHIP_KEY_DEFINITION__ALLOW_MANUAL_RESOLUTION:
                setAllowManualResolution((Boolean)newValue);
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
            case RulesPackage.SURVIVORSHIP_KEY_DEFINITION__FUNCTION:
                setFunction((AlgorithmDefinition)null);
                return;
            case RulesPackage.SURVIVORSHIP_KEY_DEFINITION__ALLOW_MANUAL_RESOLUTION:
                setAllowManualResolution(ALLOW_MANUAL_RESOLUTION_EDEFAULT);
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
            case RulesPackage.SURVIVORSHIP_KEY_DEFINITION__FUNCTION:
                return function != null;
            case RulesPackage.SURVIVORSHIP_KEY_DEFINITION__ALLOW_MANUAL_RESOLUTION:
                return allowManualResolution != ALLOW_MANUAL_RESOLUTION_EDEFAULT;
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
        result.append(" (allowManualResolution: ");
        result.append(allowManualResolution);
        result.append(')');
        return result.toString();
    }

} //SurvivorshipKeyDefinitionImpl
