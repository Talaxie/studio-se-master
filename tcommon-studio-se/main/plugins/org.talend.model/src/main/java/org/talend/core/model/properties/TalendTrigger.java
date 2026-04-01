/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Talaxie Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getExecutionTriggerable <em>Execution Triggerable</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getPreviousFireTime <em>Previous Fire Time</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getFinalFireTime <em>Final Fire Time</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getIdQuartzTrigger <em>Id Quartz Trigger</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#getResumePauseUpdated <em>Resume Pause Updated</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TalendTrigger#isPreviouslyPaused <em>Previously Paused</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger()
 * @model
 * @generated
 */
public interface TalendTrigger extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Active</em>' attribute.
     * @see #setActive(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_Active()
     * @model
     * @generated
     */
    boolean isActive();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#isActive <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Active</em>' attribute.
     * @see #isActive()
     * @generated
     */
    void setActive(boolean value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Type</em>' attribute.
     * @see #setTriggerType(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_TriggerType()
     * @model
     * @generated
     */
    String getTriggerType();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getTriggerType <em>Trigger Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Type</em>' attribute.
     * @see #getTriggerType()
     * @generated
     */
    void setTriggerType(String value);

    /**
     * Returns the value of the '<em><b>Execution Triggerable</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.ExecutionTriggerable#getTriggers <em>Triggers</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Triggerable</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Triggerable</em>' container reference.
     * @see #setExecutionTriggerable(ExecutionTriggerable)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_ExecutionTriggerable()
     * @see org.talend.core.model.properties.ExecutionTriggerable#getTriggers
     * @model opposite="triggers" transient="false"
     * @generated
     */
    ExecutionTriggerable getExecutionTriggerable();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getExecutionTriggerable <em>Execution Triggerable</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Triggerable</em>' container reference.
     * @see #getExecutionTriggerable()
     * @generated
     */
    void setExecutionTriggerable(ExecutionTriggerable value);

    /**
     * Returns the value of the '<em><b>Start Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Time</em>' attribute.
     * @see #setStartTime(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_StartTime()
     * @model
     * @generated
     */
    Date getStartTime();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getStartTime <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Time</em>' attribute.
     * @see #getStartTime()
     * @generated
     */
    void setStartTime(Date value);

    /**
     * Returns the value of the '<em><b>End Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Time</em>' attribute.
     * @see #setEndTime(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_EndTime()
     * @model
     * @generated
     */
    Date getEndTime();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getEndTime <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Time</em>' attribute.
     * @see #getEndTime()
     * @generated
     */
    void setEndTime(Date value);

    /**
     * Returns the value of the '<em><b>Previous Fire Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Previous Fire Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Previous Fire Time</em>' attribute.
     * @see #setPreviousFireTime(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_PreviousFireTime()
     * @model
     * @generated
     */
    Date getPreviousFireTime();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getPreviousFireTime <em>Previous Fire Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Previous Fire Time</em>' attribute.
     * @see #getPreviousFireTime()
     * @generated
     */
    void setPreviousFireTime(Date value);

    /**
     * Returns the value of the '<em><b>Final Fire Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Final Fire Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Final Fire Time</em>' attribute.
     * @see #setFinalFireTime(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_FinalFireTime()
     * @model
     * @generated
     */
    Date getFinalFireTime();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getFinalFireTime <em>Final Fire Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Final Fire Time</em>' attribute.
     * @see #getFinalFireTime()
     * @generated
     */
    void setFinalFireTime(Date value);

    /**
     * Returns the value of the '<em><b>Id Quartz Trigger</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Quartz Trigger</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Quartz Trigger</em>' attribute.
     * @see #setIdQuartzTrigger(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_IdQuartzTrigger()
     * @model
     * @generated
     */
    int getIdQuartzTrigger();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getIdQuartzTrigger <em>Id Quartz Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Quartz Trigger</em>' attribute.
     * @see #getIdQuartzTrigger()
     * @generated
     */
    void setIdQuartzTrigger(int value);

    /**
     * Returns the value of the '<em><b>Resume Pause Updated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resume Pause Updated</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resume Pause Updated</em>' attribute.
     * @see #setResumePauseUpdated(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_ResumePauseUpdated()
     * @model
     * @generated
     */
    Date getResumePauseUpdated();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#getResumePauseUpdated <em>Resume Pause Updated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resume Pause Updated</em>' attribute.
     * @see #getResumePauseUpdated()
     * @generated
     */
    void setResumePauseUpdated(Date value);

    /**
     * Returns the value of the '<em><b>Previously Paused</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Previously Paused</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Previously Paused</em>' attribute.
     * @see #setPreviouslyPaused(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getTalendTrigger_PreviouslyPaused()
     * @model
     * @generated
     */
    boolean isPreviouslyPaused();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TalendTrigger#isPreviouslyPaused <em>Previously Paused</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Previously Paused</em>' attribute.
     * @see #isPreviouslyPaused()
     * @generated
     */
    void setPreviouslyPaused(boolean value);

} // TalendTrigger
