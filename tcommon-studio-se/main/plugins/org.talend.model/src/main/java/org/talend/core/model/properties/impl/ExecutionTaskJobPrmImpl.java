/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.talend.core.model.properties.ExecutionTask;
import org.talend.core.model.properties.ExecutionTaskJobPrm;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Task Job Prm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskJobPrmImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskJobPrmImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskJobPrmImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskJobPrmImpl#getExecutionTask <em>Execution Task</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskJobPrmImpl#getOriginalValue <em>Original Value</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskJobPrmImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskJobPrmImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionTaskJobPrmImpl extends EObjectImpl implements ExecutionTaskJobPrm {
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
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

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
     * The default value of the '{@link #getOriginalValue() <em>Original Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalValue()
     * @generated
     * @ordered
     */
    protected static final String ORIGINAL_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOriginalValue() <em>Original Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalValue()
     * @generated
     * @ordered
     */
    protected String originalValue = ORIGINAL_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemType()
     * @generated
     * @ordered
     */
    protected static final String ITEM_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemType()
     * @generated
     * @ordered
     */
    protected String itemType = ITEM_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionTaskJobPrmImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.EXECUTION_TASK_JOB_PRM;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK_JOB_PRM__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK_JOB_PRM__LABEL, oldLabel, label));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK_JOB_PRM__OVERRIDE, oldOverride, override));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionTask getExecutionTask() {
        if (eContainerFeatureID() != PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK) return null;
        return (ExecutionTask)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExecutionTask(ExecutionTask newExecutionTask, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newExecutionTask, PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionTask(ExecutionTask newExecutionTask) {
        if (newExecutionTask != eInternalContainer() || (eContainerFeatureID() != PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK && newExecutionTask != null)) {
            if (EcoreUtil.isAncestor(this, newExecutionTask))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newExecutionTask != null)
                msgs = ((InternalEObject)newExecutionTask).eInverseAdd(this, PropertiesPackage.EXECUTION_TASK__JOB_PRMS, ExecutionTask.class, msgs);
            msgs = basicSetExecutionTask(newExecutionTask, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK, newExecutionTask, newExecutionTask));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOriginalValue() {
        return originalValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOriginalValue(String newOriginalValue) {
        String oldOriginalValue = originalValue;
        originalValue = newOriginalValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK_JOB_PRM__ORIGINAL_VALUE, oldOriginalValue, originalValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultValue(String newDefaultValue) {
        String oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK_JOB_PRM__DEFAULT_VALUE, oldDefaultValue, defaultValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setItemType(String newItemType) {
        String oldItemType = itemType;
        itemType = newItemType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK_JOB_PRM__ITEM_TYPE, oldItemType, itemType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetExecutionTask((ExecutionTask)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK:
                return basicSetExecutionTask(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK:
                return eInternalContainer().eInverseRemove(this, PropertiesPackage.EXECUTION_TASK__JOB_PRMS, ExecutionTask.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ID:
                return new Integer(getId());
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__LABEL:
                return getLabel();
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__OVERRIDE:
                return isOverride() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK:
                return getExecutionTask();
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ORIGINAL_VALUE:
                return getOriginalValue();
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__DEFAULT_VALUE:
                return getDefaultValue();
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ITEM_TYPE:
                return getItemType();
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
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__OVERRIDE:
                setOverride(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK:
                setExecutionTask((ExecutionTask)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ORIGINAL_VALUE:
                setOriginalValue((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__DEFAULT_VALUE:
                setDefaultValue((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ITEM_TYPE:
                setItemType((String)newValue);
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
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__OVERRIDE:
                setOverride(OVERRIDE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK:
                setExecutionTask((ExecutionTask)null);
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ORIGINAL_VALUE:
                setOriginalValue(ORIGINAL_VALUE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__DEFAULT_VALUE:
                setDefaultValue(DEFAULT_VALUE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ITEM_TYPE:
                setItemType(ITEM_TYPE_EDEFAULT);
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
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__OVERRIDE:
                return override != OVERRIDE_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK:
                return getExecutionTask() != null;
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ORIGINAL_VALUE:
                return ORIGINAL_VALUE_EDEFAULT == null ? originalValue != null : !ORIGINAL_VALUE_EDEFAULT.equals(originalValue);
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__DEFAULT_VALUE:
                return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
            case PropertiesPackage.EXECUTION_TASK_JOB_PRM__ITEM_TYPE:
                return ITEM_TYPE_EDEFAULT == null ? itemType != null : !ITEM_TYPE_EDEFAULT.equals(itemType);
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
        result.append(", label: ");
        result.append(label);
        result.append(", override: ");
        result.append(override);
        result.append(", originalValue: ");
        result.append(originalValue);
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(", itemType: ");
        result.append(itemType);
        result.append(')');
        return result.toString();
    }

} //ExecutionTaskJobPrmImpl
