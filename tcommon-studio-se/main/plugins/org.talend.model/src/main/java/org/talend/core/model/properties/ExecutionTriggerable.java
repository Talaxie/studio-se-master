/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Triggerable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ExecutionTriggerable#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTriggerable#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTriggerable#getIdQuartzJob <em>Id Quartz Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTriggerable#getStatus <em>Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTriggerable#getErrorStatus <em>Error Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTriggerable#isConcurrentExecution <em>Concurrent Execution</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTriggerable#isProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTriggerable#getRequestId <em>Request Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTriggerable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExecutionTriggerable extends EObject {
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
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTriggerable_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTriggerable#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.TalendTrigger}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.TalendTrigger#getExecutionTriggerable <em>Execution Triggerable</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Triggers</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTriggerable_Triggers()
     * @see org.talend.core.model.properties.TalendTrigger#getExecutionTriggerable
     * @model type="org.talend.core.model.properties.TalendTrigger" opposite="executionTriggerable" containment="true" ordered="false"
     * @generated
     */
    EList getTriggers();

    /**
     * Returns the value of the '<em><b>Id Quartz Job</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Quartz Job</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Quartz Job</em>' attribute.
     * @see #setIdQuartzJob(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTriggerable_IdQuartzJob()
     * @model
     * @generated
     */
    int getIdQuartzJob();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTriggerable#getIdQuartzJob <em>Id Quartz Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Quartz Job</em>' attribute.
     * @see #getIdQuartzJob()
     * @generated
     */
    void setIdQuartzJob(int value);

    /**
     * Returns the value of the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status</em>' attribute.
     * @see #setStatus(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTriggerable_Status()
     * @model
     * @generated
     */
    String getStatus();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTriggerable#getStatus <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' attribute.
     * @see #getStatus()
     * @generated
     */
    void setStatus(String value);

    /**
     * Returns the value of the '<em><b>Error Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error Status</em>' attribute.
     * @see #setErrorStatus(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTriggerable_ErrorStatus()
     * @model
     * @generated
     */
    String getErrorStatus();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTriggerable#getErrorStatus <em>Error Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Status</em>' attribute.
     * @see #getErrorStatus()
     * @generated
     */
    void setErrorStatus(String value);

    /**
     * Returns the value of the '<em><b>Concurrent Execution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concurrent Execution</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concurrent Execution</em>' attribute.
     * @see #setConcurrentExecution(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTriggerable_ConcurrentExecution()
     * @model
     * @generated
     */
    boolean isConcurrentExecution();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTriggerable#isConcurrentExecution <em>Concurrent Execution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concurrent Execution</em>' attribute.
     * @see #isConcurrentExecution()
     * @generated
     */
    void setConcurrentExecution(boolean value);

    /**
     * Returns the value of the '<em><b>Processing State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processing State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Processing State</em>' attribute.
     * @see #setProcessingState(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTriggerable_ProcessingState()
     * @model
     * @generated
     */
    boolean isProcessingState();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTriggerable#isProcessingState <em>Processing State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Processing State</em>' attribute.
     * @see #isProcessingState()
     * @generated
     */
    void setProcessingState(boolean value);

    /**
     * Returns the value of the '<em><b>Request Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Request Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Request Id</em>' attribute.
     * @see #setRequestId(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTriggerable_RequestId()
     * @model
     * @generated
     */
    String getRequestId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTriggerable#getRequestId <em>Request Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Request Id</em>' attribute.
     * @see #getRequestId()
     * @generated
     */
    void setRequestId(String value);

} // ExecutionTriggerable
