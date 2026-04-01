/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.TaskExecutionHistory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Task Execution History</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getBasicStatus <em>Basic Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getDetailedStatus <em>Detailed Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTaskLabel <em>Task Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTaskDescription <em>Task Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTalendJobName <em>Talaxie Job Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTalendJobId <em>Talaxie Job Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTalendJobVersion <em>Talaxie Job Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getContextName <em>Context Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getVirtualServerName <em>Virtual Server Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getExecutionServerName <em>Execution Server Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getExecutionServerHost <em>Execution Server Host</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getExecutionServerCmdPort <em>Execution Server Cmd Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getExecutionServerFilePort <em>Execution Server File Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getExecutionServerMonitoringPort <em>Execution Server Monitoring Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#isApplyContextToChildren <em>Apply Context To Children</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTriggerName <em>Trigger Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTriggerDescription <em>Trigger Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTaskErrorStackTrace <em>Task Error Stack Trace</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getIdQuartzJob <em>Id Quartz Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getIdQuartzTrigger <em>Id Quartz Trigger</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getLastJobGenerationDate <em>Last Job Generation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getJobArchiveFilename <em>Job Archive Filename</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getFileTriggerFileMask <em>File Trigger File Mask</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getFileTriggerFileName <em>File Trigger File Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getFileTriggerFolderPath <em>File Trigger Folder Path</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getFileTriggerTriggeredFilePath <em>File Trigger Triggered File Path</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getExpectedTriggeringDate <em>Expected Triggering Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTaskStartDate <em>Task Start Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getTaskEndDate <em>Task End Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getServerJobStartDate <em>Server Job Start Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getServerJobEndDate <em>Server Job End Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getIdRemoteJob <em>Id Remote Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getIdRemoteJobExecution <em>Id Remote Job Execution</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#isResumingMode <em>Resuming Mode</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getContextValues <em>Context Values</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getJvmValues <em>Jvm Values</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getParentTaskExecId <em>Parent Task Exec Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.TaskExecutionHistoryImpl#getParentPlanExecId <em>Parent Plan Exec Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskExecutionHistoryImpl extends EObjectImpl implements TaskExecutionHistory {

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getBasicStatus() <em>Basic Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasicStatus()
     * @generated
     * @ordered
     */
    protected static final String BASIC_STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBasicStatus() <em>Basic Status</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBasicStatus()
     * @generated
     * @ordered
     */
    protected String basicStatus = BASIC_STATUS_EDEFAULT;

    /**
     * The default value of the '{@link #getDetailedStatus() <em>Detailed Status</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getDetailedStatus()
     * @generated
     * @ordered
     */
    protected static final String DETAILED_STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDetailedStatus() <em>Detailed Status</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getDetailedStatus()
     * @generated
     * @ordered
     */
    protected String detailedStatus = DETAILED_STATUS_EDEFAULT;

    /**
     * The default value of the '{@link #getTaskLabel() <em>Task Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getTaskLabel()
     * @generated
     * @ordered
     */
    protected static final String TASK_LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTaskLabel() <em>Task Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getTaskLabel()
     * @generated
     * @ordered
     */
    protected String taskLabel = TASK_LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getTaskDescription() <em>Task Description</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getTaskDescription()
     * @generated
     * @ordered
     */
    protected static final String TASK_DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTaskDescription() <em>Task Description</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getTaskDescription()
     * @generated
     * @ordered
     */
    protected String taskDescription = TASK_DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProjectName()
     * @generated
     * @ordered
     */
    protected static final String PROJECT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getProjectName()
     * @generated
     * @ordered
     */
    protected String projectName = PROJECT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTalendJobName() <em>Talaxie Job Name</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getTalendJobName()
     * @generated
     * @ordered
     */
    protected static final String TALEND_JOB_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTalendJobName() <em>Talaxie Job Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTalendJobName()
     * @generated
     * @ordered
     */
    protected String talendJobName = TALEND_JOB_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTalendJobId() <em>Talaxie Job Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTalendJobId()
     * @generated
     * @ordered
     */
    protected static final String TALEND_JOB_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTalendJobId() <em>Talaxie Job Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTalendJobId()
     * @generated
     * @ordered
     */
    protected String talendJobId = TALEND_JOB_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getTalendJobVersion() <em>Talaxie Job Version</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTalendJobVersion()
     * @generated
     * @ordered
     */
    protected static final String TALEND_JOB_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTalendJobVersion() <em>Talaxie Job Version</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTalendJobVersion()
     * @generated
     * @ordered
     */
    protected String talendJobVersion = TALEND_JOB_VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextName()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getContextName()
     * @generated
     * @ordered
     */
    protected String contextName = CONTEXT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getVirtualServerName() <em>Virtual Server Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVirtualServerName()
     * @generated
     * @ordered
     */
    protected static final String VIRTUAL_SERVER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVirtualServerName() <em>Virtual Server Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVirtualServerName()
     * @generated
     * @ordered
     */
    protected String virtualServerName = VIRTUAL_SERVER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getExecutionServerName() <em>Execution Server Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getExecutionServerName()
     * @generated
     * @ordered
     */
    protected static final String EXECUTION_SERVER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExecutionServerName() <em>Execution Server Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getExecutionServerName()
     * @generated
     * @ordered
     */
    protected String executionServerName = EXECUTION_SERVER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getExecutionServerHost() <em>Execution Server Host</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getExecutionServerHost()
     * @generated
     * @ordered
     */
    protected static final String EXECUTION_SERVER_HOST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExecutionServerHost() <em>Execution Server Host</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getExecutionServerHost()
     * @generated
     * @ordered
     */
    protected String executionServerHost = EXECUTION_SERVER_HOST_EDEFAULT;

    /**
     * The default value of the '{@link #getExecutionServerCmdPort() <em>Execution Server Cmd Port</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getExecutionServerCmdPort()
     * @generated
     * @ordered
     */
    protected static final int EXECUTION_SERVER_CMD_PORT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getExecutionServerCmdPort() <em>Execution Server Cmd Port</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getExecutionServerCmdPort()
     * @generated
     * @ordered
     */
    protected int executionServerCmdPort = EXECUTION_SERVER_CMD_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getExecutionServerFilePort() <em>Execution Server File Port</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getExecutionServerFilePort()
     * @generated
     * @ordered
     */
    protected static final int EXECUTION_SERVER_FILE_PORT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getExecutionServerFilePort() <em>Execution Server File Port</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getExecutionServerFilePort()
     * @generated
     * @ordered
     */
    protected int executionServerFilePort = EXECUTION_SERVER_FILE_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getExecutionServerMonitoringPort() <em>Execution Server Monitoring Port</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getExecutionServerMonitoringPort()
     * @generated
     * @ordered
     */
    protected static final int EXECUTION_SERVER_MONITORING_PORT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getExecutionServerMonitoringPort() <em>Execution Server Monitoring Port</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getExecutionServerMonitoringPort()
     * @generated
     * @ordered
     */
    protected int executionServerMonitoringPort = EXECUTION_SERVER_MONITORING_PORT_EDEFAULT;

    /**
     * The default value of the '{@link #isApplyContextToChildren() <em>Apply Context To Children</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isApplyContextToChildren()
     * @generated
     * @ordered
     */
    protected static final boolean APPLY_CONTEXT_TO_CHILDREN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isApplyContextToChildren() <em>Apply Context To Children</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isApplyContextToChildren()
     * @generated
     * @ordered
     */
    protected boolean applyContextToChildren = APPLY_CONTEXT_TO_CHILDREN_EDEFAULT;

    /**
     * The default value of the '{@link #getTriggeredBy() <em>Triggered By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggeredBy()
     * @generated
     * @ordered
     */
    protected static final String TRIGGERED_BY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTriggeredBy() <em>Triggered By</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getTriggeredBy()
     * @generated
     * @ordered
     */
    protected String triggeredBy = TRIGGERED_BY_EDEFAULT;

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
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getTriggerType()
     * @generated
     * @ordered
     */
    protected String triggerType = TRIGGER_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getTriggerName() <em>Trigger Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerName()
     * @generated
     * @ordered
     */
    protected static final String TRIGGER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTriggerName() <em>Trigger Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getTriggerName()
     * @generated
     * @ordered
     */
    protected String triggerName = TRIGGER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTriggerDescription() <em>Trigger Description</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTriggerDescription()
     * @generated
     * @ordered
     */
    protected static final String TRIGGER_DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTriggerDescription() <em>Trigger Description</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTriggerDescription()
     * @generated
     * @ordered
     */
    protected String triggerDescription = TRIGGER_DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getTaskErrorStackTrace() <em>Task Error Stack Trace</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTaskErrorStackTrace()
     * @generated
     * @ordered
     */
    protected static final String TASK_ERROR_STACK_TRACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTaskErrorStackTrace() <em>Task Error Stack Trace</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTaskErrorStackTrace()
     * @generated
     * @ordered
     */
    protected String taskErrorStackTrace = TASK_ERROR_STACK_TRACE_EDEFAULT;

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
     * The default value of the '{@link #getIdQuartzTrigger() <em>Id Quartz Trigger</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getIdQuartzTrigger()
     * @generated
     * @ordered
     */
    protected static final Integer ID_QUARTZ_TRIGGER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdQuartzTrigger() <em>Id Quartz Trigger</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getIdQuartzTrigger()
     * @generated
     * @ordered
     */
    protected Integer idQuartzTrigger = ID_QUARTZ_TRIGGER_EDEFAULT;

    /**
     * The default value of the '{@link #getLastJobGenerationDate() <em>Last Job Generation Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLastJobGenerationDate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_JOB_GENERATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastJobGenerationDate() <em>Last Job Generation Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLastJobGenerationDate()
     * @generated
     * @ordered
     */
    protected Date lastJobGenerationDate = LAST_JOB_GENERATION_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getJobArchiveFilename() <em>Job Archive Filename</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getJobArchiveFilename()
     * @generated
     * @ordered
     */
    protected static final String JOB_ARCHIVE_FILENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJobArchiveFilename() <em>Job Archive Filename</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getJobArchiveFilename()
     * @generated
     * @ordered
     */
    protected String jobArchiveFilename = JOB_ARCHIVE_FILENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFileTriggerFileMask() <em>File Trigger File Mask</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFileTriggerFileMask()
     * @generated
     * @ordered
     */
    protected static final String FILE_TRIGGER_FILE_MASK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileTriggerFileMask() <em>File Trigger File Mask</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFileTriggerFileMask()
     * @generated
     * @ordered
     */
    protected String fileTriggerFileMask = FILE_TRIGGER_FILE_MASK_EDEFAULT;

    /**
     * The default value of the '{@link #getFileTriggerFileName() <em>File Trigger File Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFileTriggerFileName()
     * @generated
     * @ordered
     */
    protected static final String FILE_TRIGGER_FILE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileTriggerFileName() <em>File Trigger File Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFileTriggerFileName()
     * @generated
     * @ordered
     */
    protected String fileTriggerFileName = FILE_TRIGGER_FILE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFileTriggerFolderPath() <em>File Trigger Folder Path</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFileTriggerFolderPath()
     * @generated
     * @ordered
     */
    protected static final String FILE_TRIGGER_FOLDER_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileTriggerFolderPath() <em>File Trigger Folder Path</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFileTriggerFolderPath()
     * @generated
     * @ordered
     */
    protected String fileTriggerFolderPath = FILE_TRIGGER_FOLDER_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getFileTriggerTriggeredFilePath() <em>File Trigger Triggered File Path</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFileTriggerTriggeredFilePath()
     * @generated
     * @ordered
     */
    protected static final String FILE_TRIGGER_TRIGGERED_FILE_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileTriggerTriggeredFilePath() <em>File Trigger Triggered File Path</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFileTriggerTriggeredFilePath()
     * @generated
     * @ordered
     */
    protected String fileTriggerTriggeredFilePath = FILE_TRIGGER_TRIGGERED_FILE_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getExpectedTriggeringDate() <em>Expected Triggering Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getExpectedTriggeringDate()
     * @generated
     * @ordered
     */
    protected static final Date EXPECTED_TRIGGERING_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExpectedTriggeringDate() <em>Expected Triggering Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getExpectedTriggeringDate()
     * @generated
     * @ordered
     */
    protected Date expectedTriggeringDate = EXPECTED_TRIGGERING_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getTaskStartDate() <em>Task Start Date</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getTaskStartDate()
     * @generated
     * @ordered
     */
    protected static final Date TASK_START_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTaskStartDate() <em>Task Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaskStartDate()
     * @generated
     * @ordered
     */
    protected Date taskStartDate = TASK_START_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getTaskEndDate() <em>Task End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaskEndDate()
     * @generated
     * @ordered
     */
    protected static final Date TASK_END_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTaskEndDate() <em>Task End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaskEndDate()
     * @generated
     * @ordered
     */
    protected Date taskEndDate = TASK_END_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getServerJobStartDate() <em>Server Job Start Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getServerJobStartDate()
     * @generated
     * @ordered
     */
    protected static final Date SERVER_JOB_START_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServerJobStartDate() <em>Server Job Start Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getServerJobStartDate()
     * @generated
     * @ordered
     */
    protected Date serverJobStartDate = SERVER_JOB_START_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getServerJobEndDate() <em>Server Job End Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getServerJobEndDate()
     * @generated
     * @ordered
     */
    protected static final Date SERVER_JOB_END_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServerJobEndDate() <em>Server Job End Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getServerJobEndDate()
     * @generated
     * @ordered
     */
    protected Date serverJobEndDate = SERVER_JOB_END_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getIdRemoteJob() <em>Id Remote Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdRemoteJob()
     * @generated
     * @ordered
     */
    protected static final String ID_REMOTE_JOB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdRemoteJob() <em>Id Remote Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdRemoteJob()
     * @generated
     * @ordered
     */
    protected String idRemoteJob = ID_REMOTE_JOB_EDEFAULT;

    /**
     * The default value of the '{@link #getIdRemoteJobExecution() <em>Id Remote Job Execution</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getIdRemoteJobExecution()
     * @generated
     * @ordered
     */
    protected static final String ID_REMOTE_JOB_EXECUTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdRemoteJobExecution() <em>Id Remote Job Execution</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getIdRemoteJobExecution()
     * @generated
     * @ordered
     */
    protected String idRemoteJobExecution = ID_REMOTE_JOB_EXECUTION_EDEFAULT;

    /**
     * The default value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRequestId()
     * @generated
     * @ordered
     */
    protected static final String REQUEST_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRequestId()
     * @generated
     * @ordered
     */
    protected String requestId = REQUEST_ID_EDEFAULT;

    /**
     * The default value of the '{@link #isResumingMode() <em>Resuming Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isResumingMode()
     * @generated
     * @ordered
     */
    protected static final boolean RESUMING_MODE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isResumingMode() <em>Resuming Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isResumingMode()
     * @generated
     * @ordered
     */
    protected boolean resumingMode = RESUMING_MODE_EDEFAULT;

    /**
     * The default value of the '{@link #getContextValues() <em>Context Values</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextValues()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_VALUES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContextValues() <em>Context Values</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextValues()
     * @generated
     * @ordered
     */
    protected String contextValues = CONTEXT_VALUES_EDEFAULT;

    /**
     * The default value of the '{@link #getJvmValues() <em>Jvm Values</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJvmValues()
     * @generated
     * @ordered
     */
    protected static final String JVM_VALUES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJvmValues() <em>Jvm Values</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJvmValues()
     * @generated
     * @ordered
     */
    protected String jvmValues = JVM_VALUES_EDEFAULT;

    /**
     * The default value of the '{@link #getParentTaskExecId() <em>Parent Task Exec Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentTaskExecId()
     * @generated
     * @ordered
     */
    protected static final int PARENT_TASK_EXEC_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getParentTaskExecId() <em>Parent Task Exec Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentTaskExecId()
     * @generated
     * @ordered
     */
    protected int parentTaskExecId = PARENT_TASK_EXEC_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getParentPlanExecId() <em>Parent Plan Exec Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentPlanExecId()
     * @generated
     * @ordered
     */
    protected static final int PARENT_PLAN_EXEC_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getParentPlanExecId() <em>Parent Plan Exec Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentPlanExecId()
     * @generated
     * @ordered
     */
    protected int parentPlanExecId = PARENT_PLAN_EXEC_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected TaskExecutionHistoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID:
                return new Integer(getId());
            case PropertiesPackage.TASK_EXECUTION_HISTORY__BASIC_STATUS:
                return getBasicStatus();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__DETAILED_STATUS:
                return getDetailedStatus();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_LABEL:
                return getTaskLabel();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_DESCRIPTION:
                return getTaskDescription();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PROJECT_NAME:
                return getProjectName();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_NAME:
                return getTalendJobName();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_ID:
                return getTalendJobId();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_VERSION:
                return getTalendJobVersion();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_NAME:
                return getContextName();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__VIRTUAL_SERVER_NAME:
                return getVirtualServerName();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_NAME:
                return getExecutionServerName();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_HOST:
                return getExecutionServerHost();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_CMD_PORT:
                return new Integer(getExecutionServerCmdPort());
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_FILE_PORT:
                return new Integer(getExecutionServerFilePort());
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_MONITORING_PORT:
                return new Integer(getExecutionServerMonitoringPort());
            case PropertiesPackage.TASK_EXECUTION_HISTORY__APPLY_CONTEXT_TO_CHILDREN:
                return isApplyContextToChildren() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGERED_BY:
                return getTriggeredBy();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_TYPE:
                return getTriggerType();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_NAME:
                return getTriggerName();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_DESCRIPTION:
                return getTriggerDescription();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_ERROR_STACK_TRACE:
                return getTaskErrorStackTrace();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_JOB:
                return new Integer(getIdQuartzJob());
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_TRIGGER:
                return getIdQuartzTrigger();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__LAST_JOB_GENERATION_DATE:
                return getLastJobGenerationDate();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__JOB_ARCHIVE_FILENAME:
                return getJobArchiveFilename();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_MASK:
                return getFileTriggerFileMask();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_NAME:
                return getFileTriggerFileName();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FOLDER_PATH:
                return getFileTriggerFolderPath();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_TRIGGERED_FILE_PATH:
                return getFileTriggerTriggeredFilePath();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXPECTED_TRIGGERING_DATE:
                return getExpectedTriggeringDate();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_START_DATE:
                return getTaskStartDate();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_END_DATE:
                return getTaskEndDate();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_START_DATE:
                return getServerJobStartDate();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_END_DATE:
                return getServerJobEndDate();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB:
                return getIdRemoteJob();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB_EXECUTION:
                return getIdRemoteJobExecution();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__REQUEST_ID:
                return getRequestId();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__RESUMING_MODE:
                return isResumingMode() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_VALUES:
                return getContextValues();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__JVM_VALUES:
                return getJvmValues();
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_TASK_EXEC_ID:
                return new Integer(getParentTaskExecId());
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_PLAN_EXEC_ID:
                return new Integer(getParentPlanExecId());
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__BASIC_STATUS:
                return BASIC_STATUS_EDEFAULT == null ? basicStatus != null : !BASIC_STATUS_EDEFAULT.equals(basicStatus);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__DETAILED_STATUS:
                return DETAILED_STATUS_EDEFAULT == null ? detailedStatus != null : !DETAILED_STATUS_EDEFAULT.equals(detailedStatus);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_LABEL:
                return TASK_LABEL_EDEFAULT == null ? taskLabel != null : !TASK_LABEL_EDEFAULT.equals(taskLabel);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_DESCRIPTION:
                return TASK_DESCRIPTION_EDEFAULT == null ? taskDescription != null : !TASK_DESCRIPTION_EDEFAULT.equals(taskDescription);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PROJECT_NAME:
                return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_NAME:
                return TALEND_JOB_NAME_EDEFAULT == null ? talendJobName != null : !TALEND_JOB_NAME_EDEFAULT.equals(talendJobName);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_ID:
                return TALEND_JOB_ID_EDEFAULT == null ? talendJobId != null : !TALEND_JOB_ID_EDEFAULT.equals(talendJobId);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_VERSION:
                return TALEND_JOB_VERSION_EDEFAULT == null ? talendJobVersion != null : !TALEND_JOB_VERSION_EDEFAULT.equals(talendJobVersion);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_NAME:
                return CONTEXT_NAME_EDEFAULT == null ? contextName != null : !CONTEXT_NAME_EDEFAULT.equals(contextName);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__VIRTUAL_SERVER_NAME:
                return VIRTUAL_SERVER_NAME_EDEFAULT == null ? virtualServerName != null : !VIRTUAL_SERVER_NAME_EDEFAULT.equals(virtualServerName);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_NAME:
                return EXECUTION_SERVER_NAME_EDEFAULT == null ? executionServerName != null : !EXECUTION_SERVER_NAME_EDEFAULT.equals(executionServerName);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_HOST:
                return EXECUTION_SERVER_HOST_EDEFAULT == null ? executionServerHost != null : !EXECUTION_SERVER_HOST_EDEFAULT.equals(executionServerHost);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_CMD_PORT:
                return executionServerCmdPort != EXECUTION_SERVER_CMD_PORT_EDEFAULT;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_FILE_PORT:
                return executionServerFilePort != EXECUTION_SERVER_FILE_PORT_EDEFAULT;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_MONITORING_PORT:
                return executionServerMonitoringPort != EXECUTION_SERVER_MONITORING_PORT_EDEFAULT;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__APPLY_CONTEXT_TO_CHILDREN:
                return applyContextToChildren != APPLY_CONTEXT_TO_CHILDREN_EDEFAULT;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGERED_BY:
                return TRIGGERED_BY_EDEFAULT == null ? triggeredBy != null : !TRIGGERED_BY_EDEFAULT.equals(triggeredBy);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_TYPE:
                return TRIGGER_TYPE_EDEFAULT == null ? triggerType != null : !TRIGGER_TYPE_EDEFAULT.equals(triggerType);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_NAME:
                return TRIGGER_NAME_EDEFAULT == null ? triggerName != null : !TRIGGER_NAME_EDEFAULT.equals(triggerName);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_DESCRIPTION:
                return TRIGGER_DESCRIPTION_EDEFAULT == null ? triggerDescription != null : !TRIGGER_DESCRIPTION_EDEFAULT.equals(triggerDescription);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_ERROR_STACK_TRACE:
                return TASK_ERROR_STACK_TRACE_EDEFAULT == null ? taskErrorStackTrace != null : !TASK_ERROR_STACK_TRACE_EDEFAULT.equals(taskErrorStackTrace);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_JOB:
                return idQuartzJob != ID_QUARTZ_JOB_EDEFAULT;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_TRIGGER:
                return ID_QUARTZ_TRIGGER_EDEFAULT == null ? idQuartzTrigger != null : !ID_QUARTZ_TRIGGER_EDEFAULT.equals(idQuartzTrigger);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__LAST_JOB_GENERATION_DATE:
                return LAST_JOB_GENERATION_DATE_EDEFAULT == null ? lastJobGenerationDate != null : !LAST_JOB_GENERATION_DATE_EDEFAULT.equals(lastJobGenerationDate);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__JOB_ARCHIVE_FILENAME:
                return JOB_ARCHIVE_FILENAME_EDEFAULT == null ? jobArchiveFilename != null : !JOB_ARCHIVE_FILENAME_EDEFAULT.equals(jobArchiveFilename);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_MASK:
                return FILE_TRIGGER_FILE_MASK_EDEFAULT == null ? fileTriggerFileMask != null : !FILE_TRIGGER_FILE_MASK_EDEFAULT.equals(fileTriggerFileMask);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_NAME:
                return FILE_TRIGGER_FILE_NAME_EDEFAULT == null ? fileTriggerFileName != null : !FILE_TRIGGER_FILE_NAME_EDEFAULT.equals(fileTriggerFileName);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FOLDER_PATH:
                return FILE_TRIGGER_FOLDER_PATH_EDEFAULT == null ? fileTriggerFolderPath != null : !FILE_TRIGGER_FOLDER_PATH_EDEFAULT.equals(fileTriggerFolderPath);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_TRIGGERED_FILE_PATH:
                return FILE_TRIGGER_TRIGGERED_FILE_PATH_EDEFAULT == null ? fileTriggerTriggeredFilePath != null : !FILE_TRIGGER_TRIGGERED_FILE_PATH_EDEFAULT.equals(fileTriggerTriggeredFilePath);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXPECTED_TRIGGERING_DATE:
                return EXPECTED_TRIGGERING_DATE_EDEFAULT == null ? expectedTriggeringDate != null : !EXPECTED_TRIGGERING_DATE_EDEFAULT.equals(expectedTriggeringDate);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_START_DATE:
                return TASK_START_DATE_EDEFAULT == null ? taskStartDate != null : !TASK_START_DATE_EDEFAULT.equals(taskStartDate);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_END_DATE:
                return TASK_END_DATE_EDEFAULT == null ? taskEndDate != null : !TASK_END_DATE_EDEFAULT.equals(taskEndDate);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_START_DATE:
                return SERVER_JOB_START_DATE_EDEFAULT == null ? serverJobStartDate != null : !SERVER_JOB_START_DATE_EDEFAULT.equals(serverJobStartDate);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_END_DATE:
                return SERVER_JOB_END_DATE_EDEFAULT == null ? serverJobEndDate != null : !SERVER_JOB_END_DATE_EDEFAULT.equals(serverJobEndDate);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB:
                return ID_REMOTE_JOB_EDEFAULT == null ? idRemoteJob != null : !ID_REMOTE_JOB_EDEFAULT.equals(idRemoteJob);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB_EXECUTION:
                return ID_REMOTE_JOB_EXECUTION_EDEFAULT == null ? idRemoteJobExecution != null : !ID_REMOTE_JOB_EXECUTION_EDEFAULT.equals(idRemoteJobExecution);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__REQUEST_ID:
                return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__RESUMING_MODE:
                return resumingMode != RESUMING_MODE_EDEFAULT;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_VALUES:
                return CONTEXT_VALUES_EDEFAULT == null ? contextValues != null : !CONTEXT_VALUES_EDEFAULT.equals(contextValues);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__JVM_VALUES:
                return JVM_VALUES_EDEFAULT == null ? jvmValues != null : !JVM_VALUES_EDEFAULT.equals(jvmValues);
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_TASK_EXEC_ID:
                return parentTaskExecId != PARENT_TASK_EXEC_ID_EDEFAULT;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_PLAN_EXEC_ID:
                return parentPlanExecId != PARENT_PLAN_EXEC_ID_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__BASIC_STATUS:
                setBasicStatus((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__DETAILED_STATUS:
                setDetailedStatus((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_LABEL:
                setTaskLabel((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_DESCRIPTION:
                setTaskDescription((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PROJECT_NAME:
                setProjectName((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_NAME:
                setTalendJobName((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_ID:
                setTalendJobId((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_VERSION:
                setTalendJobVersion((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_NAME:
                setContextName((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__VIRTUAL_SERVER_NAME:
                setVirtualServerName((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_NAME:
                setExecutionServerName((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_HOST:
                setExecutionServerHost((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_CMD_PORT:
                setExecutionServerCmdPort(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_FILE_PORT:
                setExecutionServerFilePort(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_MONITORING_PORT:
                setExecutionServerMonitoringPort(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__APPLY_CONTEXT_TO_CHILDREN:
                setApplyContextToChildren(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGERED_BY:
                setTriggeredBy((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_TYPE:
                setTriggerType((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_NAME:
                setTriggerName((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_DESCRIPTION:
                setTriggerDescription((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_ERROR_STACK_TRACE:
                setTaskErrorStackTrace((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_JOB:
                setIdQuartzJob(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_TRIGGER:
                setIdQuartzTrigger((Integer)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__LAST_JOB_GENERATION_DATE:
                setLastJobGenerationDate((Date)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__JOB_ARCHIVE_FILENAME:
                setJobArchiveFilename((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_MASK:
                setFileTriggerFileMask((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_NAME:
                setFileTriggerFileName((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FOLDER_PATH:
                setFileTriggerFolderPath((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_TRIGGERED_FILE_PATH:
                setFileTriggerTriggeredFilePath((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXPECTED_TRIGGERING_DATE:
                setExpectedTriggeringDate((Date)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_START_DATE:
                setTaskStartDate((Date)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_END_DATE:
                setTaskEndDate((Date)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_START_DATE:
                setServerJobStartDate((Date)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_END_DATE:
                setServerJobEndDate((Date)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB:
                setIdRemoteJob((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB_EXECUTION:
                setIdRemoteJobExecution((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__REQUEST_ID:
                setRequestId((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__RESUMING_MODE:
                setResumingMode(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_VALUES:
                setContextValues((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__JVM_VALUES:
                setJvmValues((String)newValue);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_TASK_EXEC_ID:
                setParentTaskExecId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_PLAN_EXEC_ID:
                setParentPlanExecId(((Integer)newValue).intValue());
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.TASK_EXECUTION_HISTORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__BASIC_STATUS:
                setBasicStatus(BASIC_STATUS_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__DETAILED_STATUS:
                setDetailedStatus(DETAILED_STATUS_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_LABEL:
                setTaskLabel(TASK_LABEL_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_DESCRIPTION:
                setTaskDescription(TASK_DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PROJECT_NAME:
                setProjectName(PROJECT_NAME_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_NAME:
                setTalendJobName(TALEND_JOB_NAME_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_ID:
                setTalendJobId(TALEND_JOB_ID_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_VERSION:
                setTalendJobVersion(TALEND_JOB_VERSION_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_NAME:
                setContextName(CONTEXT_NAME_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__VIRTUAL_SERVER_NAME:
                setVirtualServerName(VIRTUAL_SERVER_NAME_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_NAME:
                setExecutionServerName(EXECUTION_SERVER_NAME_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_HOST:
                setExecutionServerHost(EXECUTION_SERVER_HOST_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_CMD_PORT:
                setExecutionServerCmdPort(EXECUTION_SERVER_CMD_PORT_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_FILE_PORT:
                setExecutionServerFilePort(EXECUTION_SERVER_FILE_PORT_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_MONITORING_PORT:
                setExecutionServerMonitoringPort(EXECUTION_SERVER_MONITORING_PORT_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__APPLY_CONTEXT_TO_CHILDREN:
                setApplyContextToChildren(APPLY_CONTEXT_TO_CHILDREN_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGERED_BY:
                setTriggeredBy(TRIGGERED_BY_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_TYPE:
                setTriggerType(TRIGGER_TYPE_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_NAME:
                setTriggerName(TRIGGER_NAME_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_DESCRIPTION:
                setTriggerDescription(TRIGGER_DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_ERROR_STACK_TRACE:
                setTaskErrorStackTrace(TASK_ERROR_STACK_TRACE_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_JOB:
                setIdQuartzJob(ID_QUARTZ_JOB_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_TRIGGER:
                setIdQuartzTrigger(ID_QUARTZ_TRIGGER_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__LAST_JOB_GENERATION_DATE:
                setLastJobGenerationDate(LAST_JOB_GENERATION_DATE_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__JOB_ARCHIVE_FILENAME:
                setJobArchiveFilename(JOB_ARCHIVE_FILENAME_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_MASK:
                setFileTriggerFileMask(FILE_TRIGGER_FILE_MASK_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_NAME:
                setFileTriggerFileName(FILE_TRIGGER_FILE_NAME_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FOLDER_PATH:
                setFileTriggerFolderPath(FILE_TRIGGER_FOLDER_PATH_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_TRIGGERED_FILE_PATH:
                setFileTriggerTriggeredFilePath(FILE_TRIGGER_TRIGGERED_FILE_PATH_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXPECTED_TRIGGERING_DATE:
                setExpectedTriggeringDate(EXPECTED_TRIGGERING_DATE_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_START_DATE:
                setTaskStartDate(TASK_START_DATE_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_END_DATE:
                setTaskEndDate(TASK_END_DATE_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_START_DATE:
                setServerJobStartDate(SERVER_JOB_START_DATE_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_END_DATE:
                setServerJobEndDate(SERVER_JOB_END_DATE_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB:
                setIdRemoteJob(ID_REMOTE_JOB_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB_EXECUTION:
                setIdRemoteJobExecution(ID_REMOTE_JOB_EXECUTION_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__REQUEST_ID:
                setRequestId(REQUEST_ID_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__RESUMING_MODE:
                setResumingMode(RESUMING_MODE_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_VALUES:
                setContextValues(CONTEXT_VALUES_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__JVM_VALUES:
                setJvmValues(JVM_VALUES_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_TASK_EXEC_ID:
                setParentTaskExecId(PARENT_TASK_EXEC_ID_EDEFAULT);
                return;
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_PLAN_EXEC_ID:
                setParentPlanExecId(PARENT_PLAN_EXEC_ID_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getBasicStatus() {
        return basicStatus;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getContextName() {
        return contextName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getContextValues() {
        return contextValues;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDetailedStatus() {
        return detailedStatus;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getExecutionServerName() {
        return executionServerName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getExpectedTriggeringDate() {
        return expectedTriggeringDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getFileTriggerFileMask() {
        return fileTriggerFileMask;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getFileTriggerFileName() {
        return fileTriggerFileName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getFileTriggerFolderPath() {
        return fileTriggerFolderPath;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getFileTriggerTriggeredFilePath() {
        return fileTriggerTriggeredFilePath;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getIdQuartzJob() {
        return idQuartzJob;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Integer getIdQuartzTrigger() {
        return idQuartzTrigger;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getIdRemoteJob() {
        return idRemoteJob;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getIdRemoteJobExecution() {
        return idRemoteJobExecution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getJobArchiveFilename() {
        return jobArchiveFilename;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getLastJobGenerationDate() {
        return lastJobGenerationDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getServerJobEndDate() {
        return serverJobEndDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getServerJobStartDate() {
        return serverJobStartDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getTalendJobId() {
        return talendJobId;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getTalendJobName() {
        return talendJobName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getTalendJobVersion() {
        return talendJobVersion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getTaskEndDate() {
        return taskEndDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getTaskErrorStackTrace() {
        return taskErrorStackTrace;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getTaskLabel() {
        return taskLabel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getTaskStartDate() {
        return taskStartDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getTriggerDescription() {
        return triggerDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getTriggeredBy() {
        return triggeredBy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getVirtualServerName() {
        return virtualServerName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isApplyContextToChildren() {
        return applyContextToChildren;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isResumingMode() {
        return resumingMode;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setApplyContextToChildren(boolean newApplyContextToChildren) {
        boolean oldApplyContextToChildren = applyContextToChildren;
        applyContextToChildren = newApplyContextToChildren;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__APPLY_CONTEXT_TO_CHILDREN, oldApplyContextToChildren, applyContextToChildren));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setBasicStatus(String newBasicStatus) {
        String oldBasicStatus = basicStatus;
        basicStatus = newBasicStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__BASIC_STATUS, oldBasicStatus, basicStatus));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setContextName(String newContextName) {
        String oldContextName = contextName;
        contextName = newContextName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_NAME, oldContextName, contextName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setContextValues(String newContextValues) {
        String oldContextValues = contextValues;
        contextValues = newContextValues;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_VALUES, oldContextValues, contextValues));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJvmValues() {
        return jvmValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJvmValues(String newJvmValues) {
        String oldJvmValues = jvmValues;
        jvmValues = newJvmValues;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__JVM_VALUES, oldJvmValues, jvmValues));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getParentTaskExecId() {
        return parentTaskExecId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentTaskExecId(int newParentTaskExecId) {
        int oldParentTaskExecId = parentTaskExecId;
        parentTaskExecId = newParentTaskExecId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_TASK_EXEC_ID, oldParentTaskExecId, parentTaskExecId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getParentPlanExecId() {
        return parentPlanExecId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentPlanExecId(int newParentPlanExecId) {
        int oldParentPlanExecId = parentPlanExecId;
        parentPlanExecId = newParentPlanExecId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_PLAN_EXEC_ID, oldParentPlanExecId, parentPlanExecId));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDetailedStatus(String newDetailedStatus) {
        String oldDetailedStatus = detailedStatus;
        detailedStatus = newDetailedStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__DETAILED_STATUS, oldDetailedStatus, detailedStatus));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionServerName(String newExecutionServerName) {
        String oldExecutionServerName = executionServerName;
        executionServerName = newExecutionServerName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_NAME, oldExecutionServerName, executionServerName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getExecutionServerHost() {
        return executionServerHost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionServerHost(String newExecutionServerHost) {
        String oldExecutionServerHost = executionServerHost;
        executionServerHost = newExecutionServerHost;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_HOST, oldExecutionServerHost, executionServerHost));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getExecutionServerCmdPort() {
        return executionServerCmdPort;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionServerCmdPort(int newExecutionServerCmdPort) {
        int oldExecutionServerCmdPort = executionServerCmdPort;
        executionServerCmdPort = newExecutionServerCmdPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_CMD_PORT, oldExecutionServerCmdPort, executionServerCmdPort));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getExecutionServerFilePort() {
        return executionServerFilePort;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionServerFilePort(int newExecutionServerFilePort) {
        int oldExecutionServerFilePort = executionServerFilePort;
        executionServerFilePort = newExecutionServerFilePort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_FILE_PORT, oldExecutionServerFilePort, executionServerFilePort));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getExecutionServerMonitoringPort() {
        return executionServerMonitoringPort;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionServerMonitoringPort(int newExecutionServerMonitoringPort) {
        int oldExecutionServerMonitoringPort = executionServerMonitoringPort;
        executionServerMonitoringPort = newExecutionServerMonitoringPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_MONITORING_PORT, oldExecutionServerMonitoringPort, executionServerMonitoringPort));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExpectedTriggeringDate(Date newExpectedTriggeringDate) {
        Date oldExpectedTriggeringDate = expectedTriggeringDate;
        expectedTriggeringDate = newExpectedTriggeringDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__EXPECTED_TRIGGERING_DATE, oldExpectedTriggeringDate, expectedTriggeringDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFileTriggerFileMask(String newFileTriggerFileMask) {
        String oldFileTriggerFileMask = fileTriggerFileMask;
        fileTriggerFileMask = newFileTriggerFileMask;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_MASK, oldFileTriggerFileMask, fileTriggerFileMask));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFileTriggerFileName(String newFileTriggerFileName) {
        String oldFileTriggerFileName = fileTriggerFileName;
        fileTriggerFileName = newFileTriggerFileName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_NAME, oldFileTriggerFileName, fileTriggerFileName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFileTriggerFolderPath(String newFileTriggerFolderPath) {
        String oldFileTriggerFolderPath = fileTriggerFolderPath;
        fileTriggerFolderPath = newFileTriggerFolderPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FOLDER_PATH, oldFileTriggerFolderPath, fileTriggerFolderPath));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFileTriggerTriggeredFilePath(String newFileTriggerTriggeredFilePath) {
        String oldFileTriggerTriggeredFilePath = fileTriggerTriggeredFilePath;
        fileTriggerTriggeredFilePath = newFileTriggerTriggeredFilePath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_TRIGGERED_FILE_PATH, oldFileTriggerTriggeredFilePath, fileTriggerTriggeredFilePath));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIdQuartzJob(int newIdQuartzJob) {
        int oldIdQuartzJob = idQuartzJob;
        idQuartzJob = newIdQuartzJob;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_JOB, oldIdQuartzJob, idQuartzJob));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIdQuartzTrigger(Integer newIdQuartzTrigger) {
        Integer oldIdQuartzTrigger = idQuartzTrigger;
        idQuartzTrigger = newIdQuartzTrigger;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_TRIGGER, oldIdQuartzTrigger, idQuartzTrigger));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIdRemoteJob(String newIdRemoteJob) {
        String oldIdRemoteJob = idRemoteJob;
        idRemoteJob = newIdRemoteJob;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB, oldIdRemoteJob, idRemoteJob));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIdRemoteJobExecution(String newIdRemoteJobExecution) {
        String oldIdRemoteJobExecution = idRemoteJobExecution;
        idRemoteJobExecution = newIdRemoteJobExecution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB_EXECUTION, oldIdRemoteJobExecution, idRemoteJobExecution));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setJobArchiveFilename(String newJobArchiveFilename) {
        String oldJobArchiveFilename = jobArchiveFilename;
        jobArchiveFilename = newJobArchiveFilename;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__JOB_ARCHIVE_FILENAME, oldJobArchiveFilename, jobArchiveFilename));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLastJobGenerationDate(Date newLastJobGenerationDate) {
        Date oldLastJobGenerationDate = lastJobGenerationDate;
        lastJobGenerationDate = newLastJobGenerationDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__LAST_JOB_GENERATION_DATE, oldLastJobGenerationDate, lastJobGenerationDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setProjectName(String newProjectName) {
        String oldProjectName = projectName;
        projectName = newProjectName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__PROJECT_NAME, oldProjectName, projectName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRequestId(String newRequestId) {
        String oldRequestId = requestId;
        requestId = newRequestId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__REQUEST_ID, oldRequestId, requestId));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setResumingMode(boolean newResumingMode) {
        boolean oldResumingMode = resumingMode;
        resumingMode = newResumingMode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__RESUMING_MODE, oldResumingMode, resumingMode));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setServerJobEndDate(Date newServerJobEndDate) {
        Date oldServerJobEndDate = serverJobEndDate;
        serverJobEndDate = newServerJobEndDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_END_DATE, oldServerJobEndDate, serverJobEndDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setServerJobStartDate(Date newServerJobStartDate) {
        Date oldServerJobStartDate = serverJobStartDate;
        serverJobStartDate = newServerJobStartDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_START_DATE, oldServerJobStartDate, serverJobStartDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTalendJobId(String newTalendJobId) {
        String oldTalendJobId = talendJobId;
        talendJobId = newTalendJobId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_ID, oldTalendJobId, talendJobId));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTalendJobName(String newTalendJobName) {
        String oldTalendJobName = talendJobName;
        talendJobName = newTalendJobName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_NAME, oldTalendJobName, talendJobName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTalendJobVersion(String newTalendJobVersion) {
        String oldTalendJobVersion = talendJobVersion;
        talendJobVersion = newTalendJobVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_VERSION, oldTalendJobVersion, talendJobVersion));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTaskDescription(String newTaskDescription) {
        String oldTaskDescription = taskDescription;
        taskDescription = newTaskDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_DESCRIPTION, oldTaskDescription, taskDescription));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTaskEndDate(Date newTaskEndDate) {
        Date oldTaskEndDate = taskEndDate;
        taskEndDate = newTaskEndDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_END_DATE, oldTaskEndDate, taskEndDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTaskErrorStackTrace(String newTaskErrorStackTrace) {
        String oldTaskErrorStackTrace = taskErrorStackTrace;
        taskErrorStackTrace = newTaskErrorStackTrace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_ERROR_STACK_TRACE, oldTaskErrorStackTrace, taskErrorStackTrace));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTaskLabel(String newTaskLabel) {
        String oldTaskLabel = taskLabel;
        taskLabel = newTaskLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_LABEL, oldTaskLabel, taskLabel));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTaskStartDate(Date newTaskStartDate) {
        Date oldTaskStartDate = taskStartDate;
        taskStartDate = newTaskStartDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_START_DATE, oldTaskStartDate, taskStartDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerDescription(String newTriggerDescription) {
        String oldTriggerDescription = triggerDescription;
        triggerDescription = newTriggerDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_DESCRIPTION, oldTriggerDescription, triggerDescription));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTriggeredBy(String newTriggeredBy) {
        String oldTriggeredBy = triggeredBy;
        triggeredBy = newTriggeredBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGERED_BY, oldTriggeredBy, triggeredBy));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerName(String newTriggerName) {
        String oldTriggerName = triggerName;
        triggerName = newTriggerName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_NAME, oldTriggerName, triggerName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerType(String newTriggerType) {
        String oldTriggerType = triggerType;
        triggerType = newTriggerType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_TYPE, oldTriggerType, triggerType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVirtualServerName(String newVirtualServerName) {
        String oldVirtualServerName = virtualServerName;
        virtualServerName = newVirtualServerName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TASK_EXECUTION_HISTORY__VIRTUAL_SERVER_NAME, oldVirtualServerName, virtualServerName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (id: ");
        result.append(id);
        result.append(", basicStatus: ");
        result.append(basicStatus);
        result.append(", detailedStatus: ");
        result.append(detailedStatus);
        result.append(", taskLabel: ");
        result.append(taskLabel);
        result.append(", taskDescription: ");
        result.append(taskDescription);
        result.append(", projectName: ");
        result.append(projectName);
        result.append(", talendJobName: ");
        result.append(talendJobName);
        result.append(", talendJobId: ");
        result.append(talendJobId);
        result.append(", talendJobVersion: ");
        result.append(talendJobVersion);
        result.append(", contextName: ");
        result.append(contextName);
        result.append(", virtualServerName: ");
        result.append(virtualServerName);
        result.append(", executionServerName: ");
        result.append(executionServerName);
        result.append(", executionServerHost: ");
        result.append(executionServerHost);
        result.append(", executionServerCmdPort: ");
        result.append(executionServerCmdPort);
        result.append(", executionServerFilePort: ");
        result.append(executionServerFilePort);
        result.append(", executionServerMonitoringPort: ");
        result.append(executionServerMonitoringPort);
        result.append(", applyContextToChildren: ");
        result.append(applyContextToChildren);
        result.append(", triggeredBy: ");
        result.append(triggeredBy);
        result.append(", triggerType: ");
        result.append(triggerType);
        result.append(", triggerName: ");
        result.append(triggerName);
        result.append(", triggerDescription: ");
        result.append(triggerDescription);
        result.append(", taskErrorStackTrace: ");
        result.append(taskErrorStackTrace);
        result.append(", idQuartzJob: ");
        result.append(idQuartzJob);
        result.append(", idQuartzTrigger: ");
        result.append(idQuartzTrigger);
        result.append(", lastJobGenerationDate: ");
        result.append(lastJobGenerationDate);
        result.append(", jobArchiveFilename: ");
        result.append(jobArchiveFilename);
        result.append(", fileTriggerFileMask: ");
        result.append(fileTriggerFileMask);
        result.append(", fileTriggerFileName: ");
        result.append(fileTriggerFileName);
        result.append(", fileTriggerFolderPath: ");
        result.append(fileTriggerFolderPath);
        result.append(", fileTriggerTriggeredFilePath: ");
        result.append(fileTriggerTriggeredFilePath);
        result.append(", expectedTriggeringDate: ");
        result.append(expectedTriggeringDate);
        result.append(", taskStartDate: ");
        result.append(taskStartDate);
        result.append(", taskEndDate: ");
        result.append(taskEndDate);
        result.append(", serverJobStartDate: ");
        result.append(serverJobStartDate);
        result.append(", serverJobEndDate: ");
        result.append(serverJobEndDate);
        result.append(", idRemoteJob: ");
        result.append(idRemoteJob);
        result.append(", idRemoteJobExecution: ");
        result.append(idRemoteJobExecution);
        result.append(", requestId: ");
        result.append(requestId);
        result.append(", resumingMode: ");
        result.append(resumingMode);
        result.append(", contextValues: ");
        result.append(contextValues);
        result.append(", jvmValues: ");
        result.append(jvmValues);
        result.append(", parentTaskExecId: ");
        result.append(parentTaskExecId);
        result.append(", parentPlanExecId: ");
        result.append(parentPlanExecId);
        result.append(')');
        return result.toString();
    }

} // TaskExecutionHistoryImpl
