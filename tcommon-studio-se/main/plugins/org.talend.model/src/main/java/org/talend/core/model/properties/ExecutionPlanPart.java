/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Plan Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getTask <em>Task</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getExecutionPlan <em>Execution Plan</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getParent <em>Parent</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getType <em>Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getJvmPrms <em>Jvm Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getContextPrms <em>Context Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getStatus <em>Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#isUseParallel <em>Use Parallel</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPart#getMaxThreads <em>Max Threads</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart()
 * @model
 * @generated
 */
public interface ExecutionPlanPart extends EObject {
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
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Task</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task</em>' reference.
     * @see #setTask(ExecutionTask)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_Task()
     * @model
     * @generated
     */
    ExecutionTask getTask();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#getTask <em>Task</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task</em>' reference.
     * @see #getTask()
     * @generated
     */
    void setTask(ExecutionTask value);

    /**
     * Returns the value of the '<em><b>Execution Plan</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Plan</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Plan</em>' reference.
     * @see #setExecutionPlan(ExecutionPlan)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_ExecutionPlan()
     * @model
     * @generated
     */
    ExecutionPlan getExecutionPlan();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#getExecutionPlan <em>Execution Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Plan</em>' reference.
     * @see #getExecutionPlan()
     * @generated
     */
    void setExecutionPlan(ExecutionPlan value);

    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(ExecutionPlanPart)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_Parent()
     * @model
     * @generated
     */
    ExecutionPlanPart getParent();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(ExecutionPlanPart value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Jvm Prms</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ExecutionPlanPartCmdPrm}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Jvm Prms</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Jvm Prms</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_JvmPrms()
     * @model type="org.talend.core.model.properties.ExecutionPlanPartCmdPrm" containment="true" ordered="false"
     * @generated
     */
    EList getJvmPrms();

    /**
     * Returns the value of the '<em><b>Context Prms</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ExecutionPlanPartJobPrm}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Prms</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Prms</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_ContextPrms()
     * @model type="org.talend.core.model.properties.ExecutionPlanPartJobPrm" containment="true" ordered="false"
     * @generated
     */
    EList getContextPrms();

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
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_Status()
     * @model
     * @generated
     */
    String getStatus();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#getStatus <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' attribute.
     * @see #getStatus()
     * @generated
     */
    void setStatus(String value);

    /**
     * Returns the value of the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Date</em>' attribute.
     * @see #setStartDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_StartDate()
     * @model
     * @generated
     */
    Date getStartDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Date</em>' attribute.
     * @see #getStartDate()
     * @generated
     */
    void setStartDate(Date value);

    /**
     * Returns the value of the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Date</em>' attribute.
     * @see #setEndDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_EndDate()
     * @model
     * @generated
     */
    Date getEndDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Date</em>' attribute.
     * @see #getEndDate()
     * @generated
     */
    void setEndDate(Date value);

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
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_RequestId()
     * @model
     * @generated
     */
    String getRequestId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#getRequestId <em>Request Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Request Id</em>' attribute.
     * @see #getRequestId()
     * @generated
     */
    void setRequestId(String value);

    /**
     * Returns the value of the '<em><b>Use Parallel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Parallel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Parallel</em>' attribute.
     * @see #setUseParallel(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_UseParallel()
     * @model
     * @generated
     */
    boolean isUseParallel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#isUseParallel <em>Use Parallel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Parallel</em>' attribute.
     * @see #isUseParallel()
     * @generated
     */
    void setUseParallel(boolean value);

    /**
     * Returns the value of the '<em><b>Max Threads</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Threads</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Threads</em>' attribute.
     * @see #setMaxThreads(Integer)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPart_MaxThreads()
     * @model
     * @generated
     */
    Integer getMaxThreads();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPart#getMaxThreads <em>Max Threads</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Threads</em>' attribute.
     * @see #getMaxThreads()
     * @generated
     */
    void setMaxThreads(Integer value);

} // ExecutionPlanPart
