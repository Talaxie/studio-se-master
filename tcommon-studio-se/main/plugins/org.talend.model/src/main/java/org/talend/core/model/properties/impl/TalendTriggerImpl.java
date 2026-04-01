/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.talend.core.model.properties.ExecutionTriggerable;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.TalendTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Talaxie Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getExecutionTriggerable <em>Execution Triggerable</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getPreviousFireTime <em>Previous Fire Time</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getFinalFireTime <em>Final Fire Time</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getIdQuartzTrigger <em>Id Quartz Trigger</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#getResumePauseUpdated <em>Resume Pause Updated</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TalendTriggerImpl#isPreviouslyPaused <em>Previously Paused</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TalendTriggerImpl extends EObjectImpl implements TalendTrigger {
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
     * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean ACTIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected boolean active = ACTIVE_EDEFAULT;

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
     * The default value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerType()
     * @generated
     * @ordered
     */
    protected static final String TRIGGER_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerType()
     * @generated
     * @ordered
     */
    protected String triggerType = TRIGGER_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected static final Date START_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected Date startTime = START_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndTime()
     * @generated
     * @ordered
     */
    protected static final Date END_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndTime()
     * @generated
     * @ordered
     */
    protected Date endTime = END_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getPreviousFireTime() <em>Previous Fire Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreviousFireTime()
     * @generated
     * @ordered
     */
    protected static final Date PREVIOUS_FIRE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPreviousFireTime() <em>Previous Fire Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreviousFireTime()
     * @generated
     * @ordered
     */
    protected Date previousFireTime = PREVIOUS_FIRE_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getFinalFireTime() <em>Final Fire Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalFireTime()
     * @generated
     * @ordered
     */
    protected static final Date FINAL_FIRE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFinalFireTime() <em>Final Fire Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalFireTime()
     * @generated
     * @ordered
     */
    protected Date finalFireTime = FINAL_FIRE_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getIdQuartzTrigger() <em>Id Quartz Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdQuartzTrigger()
     * @generated
     * @ordered
     */
    protected static final int ID_QUARTZ_TRIGGER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getIdQuartzTrigger() <em>Id Quartz Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdQuartzTrigger()
     * @generated
     * @ordered
     */
    protected int idQuartzTrigger = ID_QUARTZ_TRIGGER_EDEFAULT;

    /**
     * The default value of the '{@link #getResumePauseUpdated() <em>Resume Pause Updated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResumePauseUpdated()
     * @generated
     * @ordered
     */
    protected static final Date RESUME_PAUSE_UPDATED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResumePauseUpdated() <em>Resume Pause Updated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResumePauseUpdated()
     * @generated
     * @ordered
     */
    protected Date resumePauseUpdated = RESUME_PAUSE_UPDATED_EDEFAULT;

    /**
     * The default value of the '{@link #isPreviouslyPaused() <em>Previously Paused</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPreviouslyPaused()
     * @generated
     * @ordered
     */
    protected static final boolean PREVIOUSLY_PAUSED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPreviouslyPaused() <em>Previously Paused</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPreviouslyPaused()
     * @generated
     * @ordered
     */
    protected boolean previouslyPaused = PREVIOUSLY_PAUSED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TalendTriggerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.TALEND_TRIGGER;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isActive() {
        return active;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActive(boolean newActive) {
        boolean oldActive = active;
        active = newActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__ACTIVE, oldActive, active));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__LABEL, oldLabel, label));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerType(String newTriggerType) {
        String oldTriggerType = triggerType;
        triggerType = newTriggerType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__TRIGGER_TYPE, oldTriggerType, triggerType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionTriggerable getExecutionTriggerable() {
        if (eContainerFeatureID() != PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE) return null;
        return (ExecutionTriggerable)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExecutionTriggerable(ExecutionTriggerable newExecutionTriggerable, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newExecutionTriggerable, PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionTriggerable(ExecutionTriggerable newExecutionTriggerable) {
        if (newExecutionTriggerable != eInternalContainer() || (eContainerFeatureID() != PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE && newExecutionTriggerable != null)) {
            if (EcoreUtil.isAncestor(this, newExecutionTriggerable))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newExecutionTriggerable != null)
                msgs = ((InternalEObject)newExecutionTriggerable).eInverseAdd(this, PropertiesPackage.EXECUTION_TRIGGERABLE__TRIGGERS, ExecutionTriggerable.class, msgs);
            msgs = basicSetExecutionTriggerable(newExecutionTriggerable, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE, newExecutionTriggerable, newExecutionTriggerable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartTime(Date newStartTime) {
        Date oldStartTime = startTime;
        startTime = newStartTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__START_TIME, oldStartTime, startTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndTime(Date newEndTime) {
        Date oldEndTime = endTime;
        endTime = newEndTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__END_TIME, oldEndTime, endTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getPreviousFireTime() {
        return previousFireTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreviousFireTime(Date newPreviousFireTime) {
        Date oldPreviousFireTime = previousFireTime;
        previousFireTime = newPreviousFireTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__PREVIOUS_FIRE_TIME, oldPreviousFireTime, previousFireTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getFinalFireTime() {
        return finalFireTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFinalFireTime(Date newFinalFireTime) {
        Date oldFinalFireTime = finalFireTime;
        finalFireTime = newFinalFireTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__FINAL_FIRE_TIME, oldFinalFireTime, finalFireTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getIdQuartzTrigger() {
        return idQuartzTrigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdQuartzTrigger(int newIdQuartzTrigger) {
        int oldIdQuartzTrigger = idQuartzTrigger;
        idQuartzTrigger = newIdQuartzTrigger;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__ID_QUARTZ_TRIGGER, oldIdQuartzTrigger, idQuartzTrigger));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getResumePauseUpdated() {
        return resumePauseUpdated;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResumePauseUpdated(Date newResumePauseUpdated) {
        Date oldResumePauseUpdated = resumePauseUpdated;
        resumePauseUpdated = newResumePauseUpdated;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__RESUME_PAUSE_UPDATED, oldResumePauseUpdated, resumePauseUpdated));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isPreviouslyPaused() {
        return previouslyPaused;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreviouslyPaused(boolean newPreviouslyPaused) {
        boolean oldPreviouslyPaused = previouslyPaused;
        previouslyPaused = newPreviouslyPaused;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TALEND_TRIGGER__PREVIOUSLY_PAUSED, oldPreviouslyPaused, previouslyPaused));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetExecutionTriggerable((ExecutionTriggerable)otherEnd, msgs);
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
            case PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE:
                return basicSetExecutionTriggerable(null, msgs);
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
            case PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE:
                return eInternalContainer().eInverseRemove(this, PropertiesPackage.EXECUTION_TRIGGERABLE__TRIGGERS, ExecutionTriggerable.class, msgs);
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
            case PropertiesPackage.TALEND_TRIGGER__ID:
                return new Integer(getId());
            case PropertiesPackage.TALEND_TRIGGER__ACTIVE:
                return isActive() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.TALEND_TRIGGER__LABEL:
                return getLabel();
            case PropertiesPackage.TALEND_TRIGGER__DESCRIPTION:
                return getDescription();
            case PropertiesPackage.TALEND_TRIGGER__TRIGGER_TYPE:
                return getTriggerType();
            case PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE:
                return getExecutionTriggerable();
            case PropertiesPackage.TALEND_TRIGGER__START_TIME:
                return getStartTime();
            case PropertiesPackage.TALEND_TRIGGER__END_TIME:
                return getEndTime();
            case PropertiesPackage.TALEND_TRIGGER__PREVIOUS_FIRE_TIME:
                return getPreviousFireTime();
            case PropertiesPackage.TALEND_TRIGGER__FINAL_FIRE_TIME:
                return getFinalFireTime();
            case PropertiesPackage.TALEND_TRIGGER__ID_QUARTZ_TRIGGER:
                return new Integer(getIdQuartzTrigger());
            case PropertiesPackage.TALEND_TRIGGER__RESUME_PAUSE_UPDATED:
                return getResumePauseUpdated();
            case PropertiesPackage.TALEND_TRIGGER__PREVIOUSLY_PAUSED:
                return isPreviouslyPaused() ? Boolean.TRUE : Boolean.FALSE;
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
            case PropertiesPackage.TALEND_TRIGGER__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.TALEND_TRIGGER__ACTIVE:
                setActive(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.TALEND_TRIGGER__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.TALEND_TRIGGER__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case PropertiesPackage.TALEND_TRIGGER__TRIGGER_TYPE:
                setTriggerType((String)newValue);
                return;
            case PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE:
                setExecutionTriggerable((ExecutionTriggerable)newValue);
                return;
            case PropertiesPackage.TALEND_TRIGGER__START_TIME:
                setStartTime((Date)newValue);
                return;
            case PropertiesPackage.TALEND_TRIGGER__END_TIME:
                setEndTime((Date)newValue);
                return;
            case PropertiesPackage.TALEND_TRIGGER__PREVIOUS_FIRE_TIME:
                setPreviousFireTime((Date)newValue);
                return;
            case PropertiesPackage.TALEND_TRIGGER__FINAL_FIRE_TIME:
                setFinalFireTime((Date)newValue);
                return;
            case PropertiesPackage.TALEND_TRIGGER__ID_QUARTZ_TRIGGER:
                setIdQuartzTrigger(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.TALEND_TRIGGER__RESUME_PAUSE_UPDATED:
                setResumePauseUpdated((Date)newValue);
                return;
            case PropertiesPackage.TALEND_TRIGGER__PREVIOUSLY_PAUSED:
                setPreviouslyPaused(((Boolean)newValue).booleanValue());
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
            case PropertiesPackage.TALEND_TRIGGER__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__ACTIVE:
                setActive(ACTIVE_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__TRIGGER_TYPE:
                setTriggerType(TRIGGER_TYPE_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE:
                setExecutionTriggerable((ExecutionTriggerable)null);
                return;
            case PropertiesPackage.TALEND_TRIGGER__START_TIME:
                setStartTime(START_TIME_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__END_TIME:
                setEndTime(END_TIME_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__PREVIOUS_FIRE_TIME:
                setPreviousFireTime(PREVIOUS_FIRE_TIME_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__FINAL_FIRE_TIME:
                setFinalFireTime(FINAL_FIRE_TIME_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__ID_QUARTZ_TRIGGER:
                setIdQuartzTrigger(ID_QUARTZ_TRIGGER_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__RESUME_PAUSE_UPDATED:
                setResumePauseUpdated(RESUME_PAUSE_UPDATED_EDEFAULT);
                return;
            case PropertiesPackage.TALEND_TRIGGER__PREVIOUSLY_PAUSED:
                setPreviouslyPaused(PREVIOUSLY_PAUSED_EDEFAULT);
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
            case PropertiesPackage.TALEND_TRIGGER__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.TALEND_TRIGGER__ACTIVE:
                return active != ACTIVE_EDEFAULT;
            case PropertiesPackage.TALEND_TRIGGER__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.TALEND_TRIGGER__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case PropertiesPackage.TALEND_TRIGGER__TRIGGER_TYPE:
                return TRIGGER_TYPE_EDEFAULT == null ? triggerType != null : !TRIGGER_TYPE_EDEFAULT.equals(triggerType);
            case PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE:
                return getExecutionTriggerable() != null;
            case PropertiesPackage.TALEND_TRIGGER__START_TIME:
                return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
            case PropertiesPackage.TALEND_TRIGGER__END_TIME:
                return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
            case PropertiesPackage.TALEND_TRIGGER__PREVIOUS_FIRE_TIME:
                return PREVIOUS_FIRE_TIME_EDEFAULT == null ? previousFireTime != null : !PREVIOUS_FIRE_TIME_EDEFAULT.equals(previousFireTime);
            case PropertiesPackage.TALEND_TRIGGER__FINAL_FIRE_TIME:
                return FINAL_FIRE_TIME_EDEFAULT == null ? finalFireTime != null : !FINAL_FIRE_TIME_EDEFAULT.equals(finalFireTime);
            case PropertiesPackage.TALEND_TRIGGER__ID_QUARTZ_TRIGGER:
                return idQuartzTrigger != ID_QUARTZ_TRIGGER_EDEFAULT;
            case PropertiesPackage.TALEND_TRIGGER__RESUME_PAUSE_UPDATED:
                return RESUME_PAUSE_UPDATED_EDEFAULT == null ? resumePauseUpdated != null : !RESUME_PAUSE_UPDATED_EDEFAULT.equals(resumePauseUpdated);
            case PropertiesPackage.TALEND_TRIGGER__PREVIOUSLY_PAUSED:
                return previouslyPaused != PREVIOUSLY_PAUSED_EDEFAULT;
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
        result.append(", active: ");
        result.append(active);
        result.append(", label: ");
        result.append(label);
        result.append(", description: ");
        result.append(description);
        result.append(", triggerType: ");
        result.append(triggerType);
        result.append(", startTime: ");
        result.append(startTime);
        result.append(", endTime: ");
        result.append(endTime);
        result.append(", previousFireTime: ");
        result.append(previousFireTime);
        result.append(", finalFireTime: ");
        result.append(finalFireTime);
        result.append(", idQuartzTrigger: ");
        result.append(idQuartzTrigger);
        result.append(", resumePauseUpdated: ");
        result.append(resumePauseUpdated);
        result.append(", previouslyPaused: ");
        result.append(previouslyPaused);
        result.append(')');
        return result.toString();
    }

} //TalendTriggerImpl
