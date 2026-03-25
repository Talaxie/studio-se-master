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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.dataquality.rules.AlgorithmDefinition;
import org.talend.dataquality.rules.DefaultSurvivorshipDefinition;
import org.talend.dataquality.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Survivorship Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.impl.DefaultSurvivorshipDefinitionImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.DefaultSurvivorshipDefinitionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultSurvivorshipDefinitionImpl extends EObjectImpl implements DefaultSurvivorshipDefinition {
    /**
     * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected static final String DATA_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected String dataType = DATA_TYPE_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DefaultSurvivorshipDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.DEFAULT_SURVIVORSHIP_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataType(String newDataType) {
        String oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__DATA_TYPE, oldDataType, dataType));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__FUNCTION, oldFunction, newFunction);
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
                msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__FUNCTION, null, msgs);
            if (newFunction != null)
                msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__FUNCTION, null, msgs);
            msgs = basicSetFunction(newFunction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__FUNCTION, newFunction, newFunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__FUNCTION:
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
            case RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__DATA_TYPE:
                return getDataType();
            case RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__FUNCTION:
                return getFunction();
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
            case RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__DATA_TYPE:
                setDataType((String)newValue);
                return;
            case RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__FUNCTION:
                setFunction((AlgorithmDefinition)newValue);
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
            case RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__DATA_TYPE:
                setDataType(DATA_TYPE_EDEFAULT);
                return;
            case RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__FUNCTION:
                setFunction((AlgorithmDefinition)null);
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
            case RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__DATA_TYPE:
                return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
            case RulesPackage.DEFAULT_SURVIVORSHIP_DEFINITION__FUNCTION:
                return function != null;
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
        result.append(" (dataType: ");
        result.append(dataType);
        result.append(')');
        return result.toString();
    }

} //DefaultSurvivorshipDefinitionImpl
