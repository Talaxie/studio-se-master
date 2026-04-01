/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.core.model.properties.ExecutionPlanPart;
import org.talend.core.model.properties.ExecutionPlanPartJobPrm;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Plan Part Job Prm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartJobPrmImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartJobPrmImpl#getExecutionPlanPart <em>Execution Plan Part</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartJobPrmImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartJobPrmImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartJobPrmImpl#getCustomValue <em>Custom Value</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartJobPrmImpl#getPartCustomValue <em>Part Custom Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionPlanPartJobPrmImpl extends EObjectImpl implements ExecutionPlanPartJobPrm {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getExecutionPlanPart() <em>Execution Plan Part</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionPlanPart()
     * @generated
     * @ordered
     */
    protected ExecutionPlanPart executionPlanPart;

    /**
     * The default value of the '{@link #isOverride() <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOverride()
     * @generated
     * @ordered
     */
    protected static final boolean OVERRIDE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOverride() <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOverride()
     * @generated
     * @ordered
     */
    protected boolean override = OVERRIDE_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCustomValue() <em>Custom Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomValue()
     * @generated
     * @ordered
     */
    protected static final String CUSTOM_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomValue() <em>Custom Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomValue()
     * @generated
     * @ordered
     */
    protected String customValue = CUSTOM_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getPartCustomValue() <em>Part Custom Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartCustomValue()
     * @generated
     * @ordered
     */
    protected static final String PART_CUSTOM_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPartCustomValue() <em>Part Custom Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartCustomValue()
     * @generated
     * @ordered
     */
    protected String partCustomValue = PART_CUSTOM_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionPlanPartJobPrmImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.EXECUTION_PLAN_PART_JOB_PRM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionPlanPart getExecutionPlanPart() {
        if (executionPlanPart != null && executionPlanPart.eIsProxy()) {
            InternalEObject oldExecutionPlanPart = (InternalEObject)executionPlanPart;
            executionPlanPart = (ExecutionPlanPart)eResolveProxy(oldExecutionPlanPart);
            if (executionPlanPart != oldExecutionPlanPart) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__EXECUTION_PLAN_PART, oldExecutionPlanPart, executionPlanPart));
            }
        }
        return executionPlanPart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionPlanPart basicGetExecutionPlanPart() {
        return executionPlanPart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionPlanPart(ExecutionPlanPart newExecutionPlanPart) {
        ExecutionPlanPart oldExecutionPlanPart = executionPlanPart;
        executionPlanPart = newExecutionPlanPart;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__EXECUTION_PLAN_PART, oldExecutionPlanPart, executionPlanPart));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isOverride() {
        return override;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOverride(boolean newOverride) {
        boolean oldOverride = override;
        override = newOverride;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__OVERRIDE, oldOverride, override));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCustomValue() {
        return customValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCustomValue(String newCustomValue) {
        String oldCustomValue = customValue;
        customValue = newCustomValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__CUSTOM_VALUE, oldCustomValue, customValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPartCustomValue() {
        return partCustomValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPartCustomValue(String newPartCustomValue) {
        String oldPartCustomValue = partCustomValue;
        partCustomValue = newPartCustomValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__PART_CUSTOM_VALUE, oldPartCustomValue, partCustomValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__ID:
                return new Integer(getId());
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__EXECUTION_PLAN_PART:
                if (resolve) return getExecutionPlanPart();
                return basicGetExecutionPlanPart();
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__OVERRIDE:
                return isOverride() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__NAME:
                return getName();
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__CUSTOM_VALUE:
                return getCustomValue();
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__PART_CUSTOM_VALUE:
                return getPartCustomValue();
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
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__EXECUTION_PLAN_PART:
                setExecutionPlanPart((ExecutionPlanPart)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__OVERRIDE:
                setOverride(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__NAME:
                setName((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__CUSTOM_VALUE:
                setCustomValue((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__PART_CUSTOM_VALUE:
                setPartCustomValue((String)newValue);
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
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__EXECUTION_PLAN_PART:
                setExecutionPlanPart((ExecutionPlanPart)null);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__OVERRIDE:
                setOverride(OVERRIDE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__NAME:
                setName(NAME_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__CUSTOM_VALUE:
                setCustomValue(CUSTOM_VALUE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__PART_CUSTOM_VALUE:
                setPartCustomValue(PART_CUSTOM_VALUE_EDEFAULT);
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
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__EXECUTION_PLAN_PART:
                return executionPlanPart != null;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__OVERRIDE:
                return override != OVERRIDE_EDEFAULT;
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__CUSTOM_VALUE:
                return CUSTOM_VALUE_EDEFAULT == null ? customValue != null : !CUSTOM_VALUE_EDEFAULT.equals(customValue);
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__PART_CUSTOM_VALUE:
                return PART_CUSTOM_VALUE_EDEFAULT == null ? partCustomValue != null : !PART_CUSTOM_VALUE_EDEFAULT.equals(partCustomValue);
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
        result.append(" (id: ");
        result.append(id);
        result.append(", override: ");
        result.append(override);
        result.append(", name: ");
        result.append(name);
        result.append(", customValue: ");
        result.append(customValue);
        result.append(", partCustomValue: ");
        result.append(partCustomValue);
        result.append(')');
        return result.toString();
    }

} //ExecutionPlanPartJobPrmImpl
