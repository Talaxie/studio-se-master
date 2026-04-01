/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.core.model.properties.ExecutionPlan;
import org.talend.core.model.properties.ExecutionPlanPart;
import org.talend.core.model.properties.ExecutionPlanPartCmdPrm;
import org.talend.core.model.properties.ExecutionPlanPartJobPrm;
import org.talend.core.model.properties.ExecutionTask;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Plan Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getExecutionPlan <em>Execution Plan</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getJvmPrms <em>Jvm Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getContextPrms <em>Context Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#isUseParallel <em>Use Parallel</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionPlanPartImpl#getMaxThreads <em>Max Threads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionPlanPartImpl extends EObjectImpl implements ExecutionPlanPart {
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
     * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTask()
     * @generated
     * @ordered
     */
    protected ExecutionTask task;

    /**
     * The cached value of the '{@link #getExecutionPlan() <em>Execution Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionPlan()
     * @generated
     * @ordered
     */
    protected ExecutionPlan executionPlan;

    /**
     * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected ExecutionPlanPart parent;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getJvmPrms() <em>Jvm Prms</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJvmPrms()
     * @generated
     * @ordered
     */
    protected EList jvmPrms;

    /**
     * The cached value of the '{@link #getContextPrms() <em>Context Prms</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextPrms()
     * @generated
     * @ordered
     */
    protected EList contextPrms;

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
     * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected static final Date START_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected Date startDate = START_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDate()
     * @generated
     * @ordered
     */
    protected static final Date END_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDate()
     * @generated
     * @ordered
     */
    protected Date endDate = END_DATE_EDEFAULT;

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
     * The default value of the '{@link #isUseParallel() <em>Use Parallel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseParallel()
     * @generated
     * @ordered
     */
    protected static final boolean USE_PARALLEL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUseParallel() <em>Use Parallel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseParallel()
     * @generated
     * @ordered
     */
    protected boolean useParallel = USE_PARALLEL_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxThreads() <em>Max Threads</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxThreads()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_THREADS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxThreads() <em>Max Threads</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxThreads()
     * @generated
     * @ordered
     */
    protected Integer maxThreads = MAX_THREADS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionPlanPartImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.EXECUTION_PLAN_PART;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionTask getTask() {
        if (task != null && task.eIsProxy()) {
            InternalEObject oldTask = (InternalEObject)task;
            task = (ExecutionTask)eResolveProxy(oldTask);
            if (task != oldTask) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.EXECUTION_PLAN_PART__TASK, oldTask, task));
            }
        }
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionTask basicGetTask() {
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTask(ExecutionTask newTask) {
        ExecutionTask oldTask = task;
        task = newTask;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__TASK, oldTask, task));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionPlan getExecutionPlan() {
        if (executionPlan != null && executionPlan.eIsProxy()) {
            InternalEObject oldExecutionPlan = (InternalEObject)executionPlan;
            executionPlan = (ExecutionPlan)eResolveProxy(oldExecutionPlan);
            if (executionPlan != oldExecutionPlan) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.EXECUTION_PLAN_PART__EXECUTION_PLAN, oldExecutionPlan, executionPlan));
            }
        }
        return executionPlan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionPlan basicGetExecutionPlan() {
        return executionPlan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionPlan(ExecutionPlan newExecutionPlan) {
        ExecutionPlan oldExecutionPlan = executionPlan;
        executionPlan = newExecutionPlan;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__EXECUTION_PLAN, oldExecutionPlan, executionPlan));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionPlanPart getParent() {
        if (parent != null && parent.eIsProxy()) {
            InternalEObject oldParent = (InternalEObject)parent;
            parent = (ExecutionPlanPart)eResolveProxy(oldParent);
            if (parent != oldParent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.EXECUTION_PLAN_PART__PARENT, oldParent, parent));
            }
        }
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionPlanPart basicGetParent() {
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(ExecutionPlanPart newParent) {
        ExecutionPlanPart oldParent = parent;
        parent = newParent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__PARENT, oldParent, parent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getJvmPrms() {
        if (jvmPrms == null) {
            jvmPrms = new EObjectContainmentEList(ExecutionPlanPartCmdPrm.class, this, PropertiesPackage.EXECUTION_PLAN_PART__JVM_PRMS);
        }
        return jvmPrms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getContextPrms() {
        if (contextPrms == null) {
            contextPrms = new EObjectContainmentEList(ExecutionPlanPartJobPrm.class, this, PropertiesPackage.EXECUTION_PLAN_PART__CONTEXT_PRMS);
        }
        return contextPrms;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__STATUS, oldStatus, status));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartDate(Date newStartDate) {
        Date oldStartDate = startDate;
        startDate = newStartDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__START_DATE, oldStartDate, startDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndDate(Date newEndDate) {
        Date oldEndDate = endDate;
        endDate = newEndDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__END_DATE, oldEndDate, endDate));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__REQUEST_ID, oldRequestId, requestId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseParallel() {
        return useParallel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseParallel(boolean newUseParallel) {
        boolean oldUseParallel = useParallel;
        useParallel = newUseParallel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__USE_PARALLEL, oldUseParallel, useParallel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getMaxThreads() {
        return maxThreads;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxThreads(Integer newMaxThreads) {
        Integer oldMaxThreads = maxThreads;
        maxThreads = newMaxThreads;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_PLAN_PART__MAX_THREADS, oldMaxThreads, maxThreads));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_PLAN_PART__JVM_PRMS:
                return ((InternalEList)getJvmPrms()).basicRemove(otherEnd, msgs);
            case PropertiesPackage.EXECUTION_PLAN_PART__CONTEXT_PRMS:
                return ((InternalEList)getContextPrms()).basicRemove(otherEnd, msgs);
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
            case PropertiesPackage.EXECUTION_PLAN_PART__ID:
                return new Integer(getId());
            case PropertiesPackage.EXECUTION_PLAN_PART__TASK:
                if (resolve) return getTask();
                return basicGetTask();
            case PropertiesPackage.EXECUTION_PLAN_PART__EXECUTION_PLAN:
                if (resolve) return getExecutionPlan();
                return basicGetExecutionPlan();
            case PropertiesPackage.EXECUTION_PLAN_PART__PARENT:
                if (resolve) return getParent();
                return basicGetParent();
            case PropertiesPackage.EXECUTION_PLAN_PART__TYPE:
                return getType();
            case PropertiesPackage.EXECUTION_PLAN_PART__JVM_PRMS:
                return getJvmPrms();
            case PropertiesPackage.EXECUTION_PLAN_PART__CONTEXT_PRMS:
                return getContextPrms();
            case PropertiesPackage.EXECUTION_PLAN_PART__STATUS:
                return getStatus();
            case PropertiesPackage.EXECUTION_PLAN_PART__START_DATE:
                return getStartDate();
            case PropertiesPackage.EXECUTION_PLAN_PART__END_DATE:
                return getEndDate();
            case PropertiesPackage.EXECUTION_PLAN_PART__REQUEST_ID:
                return getRequestId();
            case PropertiesPackage.EXECUTION_PLAN_PART__USE_PARALLEL:
                return isUseParallel() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_PLAN_PART__MAX_THREADS:
                return getMaxThreads();
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
            case PropertiesPackage.EXECUTION_PLAN_PART__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__TASK:
                setTask((ExecutionTask)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__EXECUTION_PLAN:
                setExecutionPlan((ExecutionPlan)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__PARENT:
                setParent((ExecutionPlanPart)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__TYPE:
                setType((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__JVM_PRMS:
                getJvmPrms().clear();
                getJvmPrms().addAll((Collection)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__CONTEXT_PRMS:
                getContextPrms().clear();
                getContextPrms().addAll((Collection)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__STATUS:
                setStatus((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__START_DATE:
                setStartDate((Date)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__END_DATE:
                setEndDate((Date)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__REQUEST_ID:
                setRequestId((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__USE_PARALLEL:
                setUseParallel(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__MAX_THREADS:
                setMaxThreads((Integer)newValue);
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
            case PropertiesPackage.EXECUTION_PLAN_PART__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__TASK:
                setTask((ExecutionTask)null);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__EXECUTION_PLAN:
                setExecutionPlan((ExecutionPlan)null);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__PARENT:
                setParent((ExecutionPlanPart)null);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__JVM_PRMS:
                getJvmPrms().clear();
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__CONTEXT_PRMS:
                getContextPrms().clear();
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__STATUS:
                setStatus(STATUS_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__START_DATE:
                setStartDate(START_DATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__END_DATE:
                setEndDate(END_DATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__REQUEST_ID:
                setRequestId(REQUEST_ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__USE_PARALLEL:
                setUseParallel(USE_PARALLEL_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_PLAN_PART__MAX_THREADS:
                setMaxThreads(MAX_THREADS_EDEFAULT);
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
            case PropertiesPackage.EXECUTION_PLAN_PART__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.EXECUTION_PLAN_PART__TASK:
                return task != null;
            case PropertiesPackage.EXECUTION_PLAN_PART__EXECUTION_PLAN:
                return executionPlan != null;
            case PropertiesPackage.EXECUTION_PLAN_PART__PARENT:
                return parent != null;
            case PropertiesPackage.EXECUTION_PLAN_PART__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case PropertiesPackage.EXECUTION_PLAN_PART__JVM_PRMS:
                return jvmPrms != null && !jvmPrms.isEmpty();
            case PropertiesPackage.EXECUTION_PLAN_PART__CONTEXT_PRMS:
                return contextPrms != null && !contextPrms.isEmpty();
            case PropertiesPackage.EXECUTION_PLAN_PART__STATUS:
                return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
            case PropertiesPackage.EXECUTION_PLAN_PART__START_DATE:
                return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
            case PropertiesPackage.EXECUTION_PLAN_PART__END_DATE:
                return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
            case PropertiesPackage.EXECUTION_PLAN_PART__REQUEST_ID:
                return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
            case PropertiesPackage.EXECUTION_PLAN_PART__USE_PARALLEL:
                return useParallel != USE_PARALLEL_EDEFAULT;
            case PropertiesPackage.EXECUTION_PLAN_PART__MAX_THREADS:
                return MAX_THREADS_EDEFAULT == null ? maxThreads != null : !MAX_THREADS_EDEFAULT.equals(maxThreads);
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
        result.append(", type: ");
        result.append(type);
        result.append(", status: ");
        result.append(status);
        result.append(", startDate: ");
        result.append(startDate);
        result.append(", endDate: ");
        result.append(endDate);
        result.append(", requestId: ");
        result.append(requestId);
        result.append(", useParallel: ");
        result.append(useParallel);
        result.append(", maxThreads: ");
        result.append(maxThreads);
        result.append(')');
        return result.toString();
    }

} //ExecutionPlanPartImpl
