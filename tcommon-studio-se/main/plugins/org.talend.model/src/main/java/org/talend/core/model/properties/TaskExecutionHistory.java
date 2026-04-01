/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Task Execution History</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getBasicStatus <em>Basic Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getDetailedStatus <em>Detailed Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTaskLabel <em>Task Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTaskDescription <em>Task Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTalendJobName <em>Talaxie Job Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTalendJobId <em>Talaxie Job Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTalendJobVersion <em>Talaxie Job Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getContextName <em>Context Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getVirtualServerName <em>Virtual Server Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getExecutionServerName <em>Execution Server Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getExecutionServerHost <em>Execution Server Host</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getExecutionServerCmdPort <em>Execution Server Cmd Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getExecutionServerFilePort <em>Execution Server File Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getExecutionServerMonitoringPort <em>Execution Server Monitoring Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#isApplyContextToChildren <em>Apply Context To Children</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTriggerName <em>Trigger Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTriggerDescription <em>Trigger Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTaskErrorStackTrace <em>Task Error Stack Trace</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getIdQuartzJob <em>Id Quartz Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getIdQuartzTrigger <em>Id Quartz Trigger</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getLastJobGenerationDate <em>Last Job Generation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getJobArchiveFilename <em>Job Archive Filename</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getFileTriggerFileMask <em>File Trigger File Mask</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getFileTriggerFileName <em>File Trigger File Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getFileTriggerFolderPath <em>File Trigger Folder Path</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getFileTriggerTriggeredFilePath <em>File Trigger Triggered File Path</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getExpectedTriggeringDate <em>Expected Triggering Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTaskStartDate <em>Task Start Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getTaskEndDate <em>Task End Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getServerJobStartDate <em>Server Job Start Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getServerJobEndDate <em>Server Job End Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getIdRemoteJob <em>Id Remote Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getIdRemoteJobExecution <em>Id Remote Job Execution</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#isResumingMode <em>Resuming Mode</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getContextValues <em>Context Values</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getJvmValues <em>Jvm Values</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getParentTaskExecId <em>Parent Task Exec Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.TaskExecutionHistory#getParentPlanExecId <em>Parent Plan Exec Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory()
 * @model
 * @generated
 */
public interface TaskExecutionHistory extends EObject {

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Basic Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic Status</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Basic Status</em>' attribute.
     * @see #setBasicStatus(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_BasicStatus()
     * @model
     * @generated
     */
    String getBasicStatus();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getBasicStatus <em>Basic Status</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Basic Status</em>' attribute.
     * @see #getBasicStatus()
     * @generated
     */
    void setBasicStatus(String value);

    /**
     * Returns the value of the '<em><b>Detailed Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Detailed Status</em>' attribute.
     * @see #setDetailedStatus(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_DetailedStatus()
     * @model
     * @generated
     */
    String getDetailedStatus();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getDetailedStatus <em>Detailed Status</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Detailed Status</em>' attribute.
     * @see #getDetailedStatus()
     * @generated
     */
    void setDetailedStatus(String value);

    /**
     * Returns the value of the '<em><b>Task Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task Label</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task Label</em>' attribute.
     * @see #setTaskLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TaskLabel()
     * @model
     * @generated
     */
    String getTaskLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTaskLabel <em>Task Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Task Label</em>' attribute.
     * @see #getTaskLabel()
     * @generated
     */
    void setTaskLabel(String value);

    /**
     * Returns the value of the '<em><b>Task Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task Description</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task Description</em>' attribute.
     * @see #setTaskDescription(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TaskDescription()
     * @model
     * @generated
     */
    String getTaskDescription();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTaskDescription <em>Task Description</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Task Description</em>' attribute.
     * @see #getTaskDescription()
     * @generated
     */
    void setTaskDescription(String value);

    /**
     * Returns the value of the '<em><b>Project Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project Name</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project Name</em>' attribute.
     * @see #setProjectName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ProjectName()
     * @model
     * @generated
     */
    String getProjectName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getProjectName <em>Project Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Project Name</em>' attribute.
     * @see #getProjectName()
     * @generated
     */
    void setProjectName(String value);

    /**
     * Returns the value of the '<em><b>Talaxie Job Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Talaxie Job Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Talaxie Job Name</em>' attribute.
     * @see #setTalendJobName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TalendJobName()
     * @model
     * @generated
     */
    String getTalendJobName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTalendJobName <em>Talaxie Job Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Talaxie Job Name</em>' attribute.
     * @see #getTalendJobName()
     * @generated
     */
    void setTalendJobName(String value);

    /**
     * Returns the value of the '<em><b>Talaxie Job Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Talaxie Job Id</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Talaxie Job Id</em>' attribute.
     * @see #setTalendJobId(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TalendJobId()
     * @model
     * @generated
     */
    String getTalendJobId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTalendJobId <em>Talaxie Job Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Talaxie Job Id</em>' attribute.
     * @see #getTalendJobId()
     * @generated
     */
    void setTalendJobId(String value);

    /**
     * Returns the value of the '<em><b>Talaxie Job Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Talaxie Job Version</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Talaxie Job Version</em>' attribute.
     * @see #setTalendJobVersion(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TalendJobVersion()
     * @model
     * @generated
     */
    String getTalendJobVersion();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTalendJobVersion <em>Talaxie Job Version</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Talaxie Job Version</em>' attribute.
     * @see #getTalendJobVersion()
     * @generated
     */
    void setTalendJobVersion(String value);

    /**
     * Returns the value of the '<em><b>Context Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Name</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Name</em>' attribute.
     * @see #setContextName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ContextName()
     * @model
     * @generated
     */
    String getContextName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getContextName <em>Context Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Name</em>' attribute.
     * @see #getContextName()
     * @generated
     */
    void setContextName(String value);

    /**
     * Returns the value of the '<em><b>Context Values</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Values</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Values</em>' attribute.
     * @see #setContextValues(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ContextValues()
     * @model
     * @generated
     */
    String getContextValues();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getContextValues <em>Context Values</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Values</em>' attribute.
     * @see #getContextValues()
     * @generated
     */
    void setContextValues(String value);

    /**
     * Returns the value of the '<em><b>Jvm Values</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Jvm Values</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Jvm Values</em>' attribute.
     * @see #setJvmValues(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_JvmValues()
     * @model
     * @generated
     */
    String getJvmValues();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getJvmValues <em>Jvm Values</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jvm Values</em>' attribute.
     * @see #getJvmValues()
     * @generated
     */
    void setJvmValues(String value);

    /**
     * Returns the value of the '<em><b>Parent Task Exec Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Task Exec Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Task Exec Id</em>' attribute.
     * @see #setParentTaskExecId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ParentTaskExecId()
     * @model unique="false"
     * @generated
     */
    int getParentTaskExecId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getParentTaskExecId <em>Parent Task Exec Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Task Exec Id</em>' attribute.
     * @see #getParentTaskExecId()
     * @generated
     */
    void setParentTaskExecId(int value);

    /**
     * Returns the value of the '<em><b>Parent Plan Exec Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Plan Exec Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Plan Exec Id</em>' attribute.
     * @see #setParentPlanExecId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ParentPlanExecId()
     * @model unique="false"
     * @generated
     */
    int getParentPlanExecId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getParentPlanExecId <em>Parent Plan Exec Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Plan Exec Id</em>' attribute.
     * @see #getParentPlanExecId()
     * @generated
     */
    void setParentPlanExecId(int value);

    /**
     * Returns the value of the '<em><b>Virtual Server Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Virtual Server Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Virtual Server Name</em>' attribute.
     * @see #setVirtualServerName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_VirtualServerName()
     * @model
     * @generated
     */
    String getVirtualServerName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getVirtualServerName <em>Virtual Server Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Virtual Server Name</em>' attribute.
     * @see #getVirtualServerName()
     * @generated
     */
    void setVirtualServerName(String value);

    /**
     * Returns the value of the '<em><b>Execution Server Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Server Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Server Name</em>' attribute.
     * @see #setExecutionServerName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ExecutionServerName()
     * @model
     * @generated
     */
    String getExecutionServerName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getExecutionServerName <em>Execution Server Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Server Name</em>' attribute.
     * @see #getExecutionServerName()
     * @generated
     */
    void setExecutionServerName(String value);

    /**
     * Returns the value of the '<em><b>Execution Server Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Server Host</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Server Host</em>' attribute.
     * @see #setExecutionServerHost(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ExecutionServerHost()
     * @model
     * @generated
     */
    String getExecutionServerHost();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getExecutionServerHost <em>Execution Server Host</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Server Host</em>' attribute.
     * @see #getExecutionServerHost()
     * @generated
     */
    void setExecutionServerHost(String value);

    /**
     * Returns the value of the '<em><b>Execution Server Cmd Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Server Cmd Port</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Server Cmd Port</em>' attribute.
     * @see #setExecutionServerCmdPort(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ExecutionServerCmdPort()
     * @model
     * @generated
     */
    int getExecutionServerCmdPort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getExecutionServerCmdPort <em>Execution Server Cmd Port</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Server Cmd Port</em>' attribute.
     * @see #getExecutionServerCmdPort()
     * @generated
     */
    void setExecutionServerCmdPort(int value);

    /**
     * Returns the value of the '<em><b>Execution Server File Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Server File Port</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Server File Port</em>' attribute.
     * @see #setExecutionServerFilePort(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ExecutionServerFilePort()
     * @model
     * @generated
     */
    int getExecutionServerFilePort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getExecutionServerFilePort <em>Execution Server File Port</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Server File Port</em>' attribute.
     * @see #getExecutionServerFilePort()
     * @generated
     */
    void setExecutionServerFilePort(int value);

    /**
     * Returns the value of the '<em><b>Execution Server Monitoring Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Server Monitoring Port</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Server Monitoring Port</em>' attribute.
     * @see #setExecutionServerMonitoringPort(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ExecutionServerMonitoringPort()
     * @model
     * @generated
     */
    int getExecutionServerMonitoringPort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getExecutionServerMonitoringPort <em>Execution Server Monitoring Port</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Server Monitoring Port</em>' attribute.
     * @see #getExecutionServerMonitoringPort()
     * @generated
     */
    void setExecutionServerMonitoringPort(int value);

    /**
     * Returns the value of the '<em><b>Apply Context To Children</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Apply Context To Children</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Apply Context To Children</em>' attribute.
     * @see #setApplyContextToChildren(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ApplyContextToChildren()
     * @model
     * @generated
     */
    boolean isApplyContextToChildren();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#isApplyContextToChildren <em>Apply Context To Children</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Apply Context To Children</em>' attribute.
     * @see #isApplyContextToChildren()
     * @generated
     */
    void setApplyContextToChildren(boolean value);

    /**
     * Returns the value of the '<em><b>Triggered By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Triggered By</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Triggered By</em>' attribute.
     * @see #setTriggeredBy(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TriggeredBy()
     * @model
     * @generated
     */
    String getTriggeredBy();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTriggeredBy <em>Triggered By</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Triggered By</em>' attribute.
     * @see #getTriggeredBy()
     * @generated
     */
    void setTriggeredBy(String value);

    /**
     * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Type</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Type</em>' attribute.
     * @see #setTriggerType(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TriggerType()
     * @model
     * @generated
     */
    String getTriggerType();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTriggerType <em>Trigger Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Type</em>' attribute.
     * @see #getTriggerType()
     * @generated
     */
    void setTriggerType(String value);

    /**
     * Returns the value of the '<em><b>Trigger Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Name</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Name</em>' attribute.
     * @see #setTriggerName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TriggerName()
     * @model
     * @generated
     */
    String getTriggerName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTriggerName <em>Trigger Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Name</em>' attribute.
     * @see #getTriggerName()
     * @generated
     */
    void setTriggerName(String value);

    /**
     * Returns the value of the '<em><b>Trigger Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Description</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Description</em>' attribute.
     * @see #setTriggerDescription(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TriggerDescription()
     * @model
     * @generated
     */
    String getTriggerDescription();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTriggerDescription <em>Trigger Description</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Description</em>' attribute.
     * @see #getTriggerDescription()
     * @generated
     */
    void setTriggerDescription(String value);

    /**
     * Returns the value of the '<em><b>Task Error Stack Trace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task Error Stack Trace</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task Error Stack Trace</em>' attribute.
     * @see #setTaskErrorStackTrace(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TaskErrorStackTrace()
     * @model
     * @generated
     */
    String getTaskErrorStackTrace();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTaskErrorStackTrace <em>Task Error Stack Trace</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Task Error Stack Trace</em>' attribute.
     * @see #getTaskErrorStackTrace()
     * @generated
     */
    void setTaskErrorStackTrace(String value);

    /**
     * Returns the value of the '<em><b>Id Quartz Job</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Quartz Job</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Quartz Job</em>' attribute.
     * @see #setIdQuartzJob(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_IdQuartzJob()
     * @model
     * @generated
     */
    int getIdQuartzJob();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getIdQuartzJob <em>Id Quartz Job</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Quartz Job</em>' attribute.
     * @see #getIdQuartzJob()
     * @generated
     */
    void setIdQuartzJob(int value);

    /**
     * Returns the value of the '<em><b>Id Quartz Trigger</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Quartz Trigger</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Quartz Trigger</em>' attribute.
     * @see #setIdQuartzTrigger(Integer)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_IdQuartzTrigger()
     * @model
     * @generated
     */
    Integer getIdQuartzTrigger();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getIdQuartzTrigger <em>Id Quartz Trigger</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Quartz Trigger</em>' attribute.
     * @see #getIdQuartzTrigger()
     * @generated
     */
    void setIdQuartzTrigger(Integer value);

    /**
     * Returns the value of the '<em><b>Last Job Generation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Job Generation Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Job Generation Date</em>' attribute.
     * @see #setLastJobGenerationDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_LastJobGenerationDate()
     * @model
     * @generated
     */
    Date getLastJobGenerationDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getLastJobGenerationDate <em>Last Job Generation Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Job Generation Date</em>' attribute.
     * @see #getLastJobGenerationDate()
     * @generated
     */
    void setLastJobGenerationDate(Date value);

    /**
     * Returns the value of the '<em><b>Job Archive Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Job Archive Filename</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Job Archive Filename</em>' attribute.
     * @see #setJobArchiveFilename(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_JobArchiveFilename()
     * @model
     * @generated
     */
    String getJobArchiveFilename();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getJobArchiveFilename <em>Job Archive Filename</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Job Archive Filename</em>' attribute.
     * @see #getJobArchiveFilename()
     * @generated
     */
    void setJobArchiveFilename(String value);

    /**
     * Returns the value of the '<em><b>File Trigger File Mask</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Trigger File Mask</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Trigger File Mask</em>' attribute.
     * @see #setFileTriggerFileMask(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_FileTriggerFileMask()
     * @model
     * @generated
     */
    String getFileTriggerFileMask();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getFileTriggerFileMask <em>File Trigger File Mask</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>File Trigger File Mask</em>' attribute.
     * @see #getFileTriggerFileMask()
     * @generated
     */
    void setFileTriggerFileMask(String value);

    /**
     * Returns the value of the '<em><b>File Trigger File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Trigger File Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Trigger File Name</em>' attribute.
     * @see #setFileTriggerFileName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_FileTriggerFileName()
     * @model
     * @generated
     */
    String getFileTriggerFileName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getFileTriggerFileName <em>File Trigger File Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>File Trigger File Name</em>' attribute.
     * @see #getFileTriggerFileName()
     * @generated
     */
    void setFileTriggerFileName(String value);

    /**
     * Returns the value of the '<em><b>File Trigger Folder Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Trigger Folder Path</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Trigger Folder Path</em>' attribute.
     * @see #setFileTriggerFolderPath(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_FileTriggerFolderPath()
     * @model
     * @generated
     */
    String getFileTriggerFolderPath();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getFileTriggerFolderPath <em>File Trigger Folder Path</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>File Trigger Folder Path</em>' attribute.
     * @see #getFileTriggerFolderPath()
     * @generated
     */
    void setFileTriggerFolderPath(String value);

    /**
     * Returns the value of the '<em><b>File Trigger Triggered File Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Trigger Triggered File Path</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Trigger Triggered File Path</em>' attribute.
     * @see #setFileTriggerTriggeredFilePath(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_FileTriggerTriggeredFilePath()
     * @model
     * @generated
     */
    String getFileTriggerTriggeredFilePath();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getFileTriggerTriggeredFilePath <em>File Trigger Triggered File Path</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>File Trigger Triggered File Path</em>' attribute.
     * @see #getFileTriggerTriggeredFilePath()
     * @generated
     */
    void setFileTriggerTriggeredFilePath(String value);

    /**
     * Returns the value of the '<em><b>Expected Triggering Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expected Triggering Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expected Triggering Date</em>' attribute.
     * @see #setExpectedTriggeringDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ExpectedTriggeringDate()
     * @model
     * @generated
     */
    Date getExpectedTriggeringDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getExpectedTriggeringDate <em>Expected Triggering Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Expected Triggering Date</em>' attribute.
     * @see #getExpectedTriggeringDate()
     * @generated
     */
    void setExpectedTriggeringDate(Date value);

    /**
     * Returns the value of the '<em><b>Task Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task Start Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task Start Date</em>' attribute.
     * @see #setTaskStartDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TaskStartDate()
     * @model
     * @generated
     */
    Date getTaskStartDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTaskStartDate <em>Task Start Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Task Start Date</em>' attribute.
     * @see #getTaskStartDate()
     * @generated
     */
    void setTaskStartDate(Date value);

    /**
     * Returns the value of the '<em><b>Task End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task End Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task End Date</em>' attribute.
     * @see #setTaskEndDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_TaskEndDate()
     * @model
     * @generated
     */
    Date getTaskEndDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getTaskEndDate <em>Task End Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Task End Date</em>' attribute.
     * @see #getTaskEndDate()
     * @generated
     */
    void setTaskEndDate(Date value);

    /**
     * Returns the value of the '<em><b>Server Job Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server Job Start Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Server Job Start Date</em>' attribute.
     * @see #setServerJobStartDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ServerJobStartDate()
     * @model
     * @generated
     */
    Date getServerJobStartDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getServerJobStartDate <em>Server Job Start Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Server Job Start Date</em>' attribute.
     * @see #getServerJobStartDate()
     * @generated
     */
    void setServerJobStartDate(Date value);

    /**
     * Returns the value of the '<em><b>Server Job End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server Job End Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Server Job End Date</em>' attribute.
     * @see #setServerJobEndDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ServerJobEndDate()
     * @model
     * @generated
     */
    Date getServerJobEndDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getServerJobEndDate <em>Server Job End Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Server Job End Date</em>' attribute.
     * @see #getServerJobEndDate()
     * @generated
     */
    void setServerJobEndDate(Date value);

    /**
     * Returns the value of the '<em><b>Id Remote Job</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Remote Job</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Remote Job</em>' attribute.
     * @see #setIdRemoteJob(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_IdRemoteJob()
     * @model
     * @generated
     */
    String getIdRemoteJob();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getIdRemoteJob <em>Id Remote Job</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Remote Job</em>' attribute.
     * @see #getIdRemoteJob()
     * @generated
     */
    void setIdRemoteJob(String value);

    /**
     * Returns the value of the '<em><b>Id Remote Job Execution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Remote Job Execution</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Remote Job Execution</em>' attribute.
     * @see #setIdRemoteJobExecution(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_IdRemoteJobExecution()
     * @model
     * @generated
     */
    String getIdRemoteJobExecution();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getIdRemoteJobExecution <em>Id Remote Job Execution</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Remote Job Execution</em>' attribute.
     * @see #getIdRemoteJobExecution()
     * @generated
     */
    void setIdRemoteJobExecution(String value);

    /**
     * Returns the value of the '<em><b>Request Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Request Id</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Request Id</em>' attribute.
     * @see #setRequestId(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_RequestId()
     * @model
     * @generated
     */
    String getRequestId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#getRequestId <em>Request Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Request Id</em>' attribute.
     * @see #getRequestId()
     * @generated
     */
    void setRequestId(String value);

    /**
     * Returns the value of the '<em><b>Resuming Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resuming Mode</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resuming Mode</em>' attribute.
     * @see #setResumingMode(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getTaskExecutionHistory_ResumingMode()
     * @model
     * @generated
     */
    boolean isResumingMode();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.TaskExecutionHistory#isResumingMode <em>Resuming Mode</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Resuming Mode</em>' attribute.
     * @see #isResumingMode()
     * @generated
     */
    void setResumingMode(boolean value);

} // TaskExecutionHistory
