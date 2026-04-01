/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.core.model.properties.ExecutionPlan;
import org.talend.core.model.properties.ExecutionPlanPart;
import org.talend.core.model.properties.ExecutionPlanPrm;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.TalendTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#getIdQuartzJob <em>Id Quartz Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#getErrorStatus <em>Error Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#isConcurrentExecution <em>Concurrent Execution</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#isProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#getExecPlanParts <em>Exec Plan Parts</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#getExecPlanPrms <em>Exec Plan Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionPlanImpl extends EObjectImpl implements ExecutionPlan {
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
     * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggers()
     * @generated
     * @ordered
     */
    protected EList triggers;

    /**
     * The default value of the '{@link #getIdQuartzJob() <em>Id Quartz Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdQuartzJob()
     * @generated
     * @ordered
     */
    protected static final int ID_QUARTZ_JOB_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getIdQuartzJob() <em>Id Quartz Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdQuartzJob()
     * @generated
     * @ordered
     */
    protected int idQuartzJob = ID_QUARTZ_JOB_EDEFAULT;

    /**
     * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected static final String STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected String status = STATUS_EDEFAULT;

    /**
     * The default value of the '{@link #getErrorStatus() <em>Error Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorStatus()
     * @generated
     * @ordered
     */
    protected static final String ERROR_STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getErrorStatus() <em>Error Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorStatus()
     * @generated
     * @ordered
     */
    protected String errorStatus = ERROR_STATUS_EDEFAULT;

    /**
     * The default value of the '{@link #isConcurrentExecution() <em>Concurrent Execution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConcurrentExecution()
     * @generated
     * @ordered
     */
    protected static final boolean CONCURRENT_EXECUTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConcurrentExecution() <em>Concurrent Execution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConcurrentExecution()
     * @generated
     * @ordered
     */
    protected boolean concurrentExecution = CONCURRENT_EXECUTION_EDEFAULT;

    /**
     * The default value of the '{@link #isProcessingState() <em>Processing State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isProcessingState()
     * @generated
     * @ordered
     */
    protected static final boolean PROCESSING_STATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isProcessingState() <em>Processing State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isProcessingState()
     * @generated
     * @ordered
     */
    protected boolean processingState = PROCESSING_STATE_EDEFAULT;

    /**
     * The default value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequestId()
     * @generated
     * @ordered
     */
    protected static final String REQUEST_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequestId()
     * @generated
     * @ordered
     */
    protected String requestId = REQUEST_ID_EDEFAULT;

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
     * The cached value of the '{@link #getExecPlanParts() <em>Exec Plan Parts</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecPlanParts()
     * @generated
     * @ordered
     */
    protected EList execPlanParts;

    /**
     * The cached value of the '{@link #getExecPlanPrms() <em>Exec Plan Prms</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecPlanPrms()
     * @generated
     * @ordered
     */
    protected EList execPlanPrms;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionPlanImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.EXECUTION_PLAN;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getExecPlanParts() {
        if (execPlanParts == null) {
            execPlanParts = new EObjectContainmentEList(ExecutionPlanPart.class, this, PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PARTS);
        }
        return execPlanParts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getExecPlanPrms() {
        if (execPlanPrms == null) {
            execPlanPrms = new EObjectContainmentEList(ExecutionPlanPrm.class, this, PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PRMS);
        }
        return execPlanPrms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_PLAN__TRIGGERS:
                return ((InternalEList)getTriggers()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getIdQuartzJob() {
        return idQuartzJob;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdQuartzJob(int newIdQuartzJob) {
        int oldIdQuartzJob = idQuartzJob;
        idQuartzJob = newIdQuartzJob;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN__ID_QUARTZ_JOB, oldIdQuartzJob, idQuartzJob));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatus(String newStatus) {
        String oldStatus = status;
        status = newStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN__STATUS, oldStatus, status));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getErrorStatus() {
        return errorStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setErrorStatus(String newErrorStatus) {
        String oldErrorStatus = errorStatus;
        errorStatus = newErrorStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN__ERROR_STATUS, oldErrorStatus, errorStatus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getTriggers() {
        if (triggers == null) {
            triggers = new EObjectContainmentWithInverseEList(TalendTrigger.class, this, PropertiesPackage.EXECUTION_PLAN__TRIGGERS, PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE);
        }
        return triggers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConcurrentExecution() {
        return concurrentExecution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConcurrentExecution(boolean newConcurrentExecution) {
        boolean oldConcurrentExecution = concurrentExecution;
        concurrentExecution = newConcurrentExecution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN__CONCURRENT_EXECUTION, oldConcurrentExecution, concurrentExecution));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isProcessingState() {
        return processingState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessingState(boolean newProcessingState) {
        boolean oldProcessingState = processingState;
        processingState = newProcessingState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN__PROCESSING_STATE, oldProcessingState, processingState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequestId(String newRequestId) {
        String oldRequestId = requestId;
        requestId = newRequestId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN__REQUEST_ID, oldRequestId, requestId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_PLAN__TRIGGERS:
                return ((InternalEList)getTriggers()).basicRemove(otherEnd, msgs);
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PARTS:
                return ((InternalEList)getExecPlanParts()).basicRemove(otherEnd, msgs);
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PRMS:
                return ((InternalEList)getExecPlanPrms()).basicRemove(otherEnd, msgs);
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
            case PropertiesPackage.EXECUTION_PLAN__ID:
                return new Integer(getId());
            case PropertiesPackage.EXECUTION_PLAN__TRIGGERS:
                return getTriggers();
            case PropertiesPackage.EXECUTION_PLAN__ID_QUARTZ_JOB:
                return new Integer(getIdQuartzJob());
            case PropertiesPackage.EXECUTION_PLAN__STATUS:
                return getStatus();
            case PropertiesPackage.EXECUTION_PLAN__ERROR_STATUS:
                return getErrorStatus();
            case PropertiesPackage.EXECUTION_PLAN__CONCURRENT_EXECUTION:
                return isConcurrentExecution() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_PLAN__PROCESSING_STATE:
                return isProcessingState() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_PLAN__REQUEST_ID:
                return getRequestId();
            case PropertiesPackage.EXECUTION_PLAN__LABEL:
                return getLabel();
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PARTS:
                return getExecPlanParts();
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PRMS:
                return getExecPlanPrms();
            case PropertiesPackage.EXECUTION_PLAN__DESCRIPTION:
                return getDescription();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_PLAN__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_PLAN__TRIGGERS:
                getTriggers().clear();
                getTriggers().addAll((Collection)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN__ID_QUARTZ_JOB:
                setIdQuartzJob(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_PLAN__STATUS:
                setStatus((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN__ERROR_STATUS:
                setErrorStatus((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN__CONCURRENT_EXECUTION:
                setConcurrentExecution(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_PLAN__PROCESSING_STATE:
                setProcessingState(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_PLAN__REQUEST_ID:
                setRequestId((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PARTS:
                getExecPlanParts().clear();
                getExecPlanParts().addAll((Collection)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PRMS:
                getExecPlanPrms().clear();
                getExecPlanPrms().addAll((Collection)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN__DESCRIPTION:
                setDescription((String)newValue);
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
            case PropertiesPackage.EXECUTION_PLAN__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN__TRIGGERS:
                getTriggers().clear();
                return;
            case PropertiesPackage.EXECUTION_PLAN__ID_QUARTZ_JOB:
                setIdQuartzJob(ID_QUARTZ_JOB_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN__STATUS:
                setStatus(STATUS_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN__ERROR_STATUS:
                setErrorStatus(ERROR_STATUS_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN__CONCURRENT_EXECUTION:
                setConcurrentExecution(CONCURRENT_EXECUTION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN__PROCESSING_STATE:
                setProcessingState(PROCESSING_STATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN__REQUEST_ID:
                setRequestId(REQUEST_ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PARTS:
                getExecPlanParts().clear();
                return;
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PRMS:
                getExecPlanPrms().clear();
                return;
            case PropertiesPackage.EXECUTION_PLAN__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
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
            case PropertiesPackage.EXECUTION_PLAN__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.EXECUTION_PLAN__TRIGGERS:
                return triggers != null && !triggers.isEmpty();
            case PropertiesPackage.EXECUTION_PLAN__ID_QUARTZ_JOB:
                return idQuartzJob != ID_QUARTZ_JOB_EDEFAULT;
            case PropertiesPackage.EXECUTION_PLAN__STATUS:
                return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
            case PropertiesPackage.EXECUTION_PLAN__ERROR_STATUS:
                return ERROR_STATUS_EDEFAULT == null ? errorStatus != null : !ERROR_STATUS_EDEFAULT.equals(errorStatus);
            case PropertiesPackage.EXECUTION_PLAN__CONCURRENT_EXECUTION:
                return concurrentExecution != CONCURRENT_EXECUTION_EDEFAULT;
            case PropertiesPackage.EXECUTION_PLAN__PROCESSING_STATE:
                return processingState != PROCESSING_STATE_EDEFAULT;
            case PropertiesPackage.EXECUTION_PLAN__REQUEST_ID:
                return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
            case PropertiesPackage.EXECUTION_PLAN__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PARTS:
                return execPlanParts != null && !execPlanParts.isEmpty();
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PRMS:
                return execPlanPrms != null && !execPlanPrms.isEmpty();
            case PropertiesPackage.EXECUTION_PLAN__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
        result.append(", idQuartzJob: ");
        result.append(idQuartzJob);
        result.append(", status: ");
        result.append(status);
        result.append(", errorStatus: ");
        result.append(errorStatus);
        result.append(", concurrentExecution: ");
        result.append(concurrentExecution);
        result.append(", processingState: ");
        result.append(processingState);
        result.append(", requestId: ");
        result.append(requestId);
        result.append(", label: ");
        result.append(label);
        result.append(", description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //ExecutionPlanImpl
