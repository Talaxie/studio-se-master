/**
 * <copyright> </copyright>
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.core.model.properties.ExecutionServer;
import org.talend.core.model.properties.ExecutionTask;
import org.talend.core.model.properties.ExecutionTaskCmdPrm;
import org.talend.core.model.properties.ExecutionTaskJobPrm;
import org.talend.core.model.properties.ExecutionTaskProperties;
import org.talend.core.model.properties.ExecutionVirtualServer;
import org.talend.core.model.properties.Project;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.TalendTrigger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Execution Task</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getIdQuartzJob <em>Id Quartz Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getErrorStatus <em>Error Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#isConcurrentExecution <em>Concurrent Execution</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#isProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getExecutionServer <em>Execution Server</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getJobVersion <em>Job Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#isRegenerateJobOnChange <em>Regenerate Job On Change</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getLastScriptGenerationDate <em>Last Script Generation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getGeneratedSvnRevision <em>Generated Svn Revision</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getIdRemoteJob <em>Id Remote Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getIdRemoteJobExecution <em>Id Remote Job Execution</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getChecksumArchive <em>Checksum Archive</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getJobScriptArchiveFilename <em>Job Script Archive Filename</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getLastRunDate <em>Last Run Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getLastDeploymentDate <em>Last Deployment Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getLastEndedRunDate <em>Last Ended Run Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getCmdPrms <em>Cmd Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getEsbPropertiesPrms <em>Esb Properties Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getJobPrms <em>Job Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getJobId <em>Job Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getVirtualServer <em>Virtual Server</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getMaxConcurrentExecutions <em>Max Concurrent Executions</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getGeneratedProjectName <em>Generated Project Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getGeneratedJobName <em>Generated Job Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getGeneratedJobVersion <em>Generated Job Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#isApplyContextToChildren <em>Apply Context To Children</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getErrorStackTrace <em>Error Stack Trace</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getLastTriggeringDate <em>Last Triggering Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#isExecStatisticsEnabled <em>Exec Statistics Enabled</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#isAddStatisticsCodeEnabled <em>Add Statistics Code Enabled</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getOwnerSchedulerInstanceId <em>Owner Scheduler Instance Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getOnUnknownStateJob <em>On Unknown State Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#isUseLatestVersion <em>Use Latest Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getRepositoryName <em>Repository Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getFeaturesFileUrl <em>Features File Url</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getFeatureVersion <em>Feature Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getApplicationGroup <em>Application Group</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getBundleName <em>Bundle Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getPropertyId <em>Property Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionTaskImpl extends EObjectImpl implements ExecutionTask {

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
     * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
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
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected static final String STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
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
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getErrorStatus()
     * @generated
     * @ordered
     */
    protected String errorStatus = ERROR_STATUS_EDEFAULT;

    /**
     * The default value of the '{@link #isConcurrentExecution() <em>Concurrent Execution</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isConcurrentExecution()
     * @generated
     * @ordered
     */
    protected static final boolean CONCURRENT_EXECUTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConcurrentExecution() <em>Concurrent Execution</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isConcurrentExecution()
     * @generated
     * @ordered
     */
    protected boolean concurrentExecution = CONCURRENT_EXECUTION_EDEFAULT;

    /**
     * The default value of the '{@link #isProcessingState() <em>Processing State</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #isProcessingState()
     * @generated
     * @ordered
     */
    protected static final boolean PROCESSING_STATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isProcessingState() <em>Processing State</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
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
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getExecutionServer() <em>Execution Server</em>}' reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getExecutionServer()
     * @generated
     * @ordered
     */
    protected ExecutionServer executionServer;

    /**
     * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getProject()
     * @generated
     * @ordered
     */
    protected Project project;

    /**
     * The default value of the '{@link #getBranch() <em>Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranch()
     * @generated
     * @ordered
     */
    protected static final String BRANCH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBranch() <em>Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranch()
     * @generated
     * @ordered
     */
    protected String branch = BRANCH_EDEFAULT;

    /**
     * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected String context = CONTEXT_EDEFAULT;

    /**
     * The default value of the '{@link #getJobVersion() <em>Job Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getJobVersion()
     * @generated
     * @ordered
     */
    protected static final String JOB_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJobVersion() <em>Job Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getJobVersion()
     * @generated
     * @ordered
     */
    protected String jobVersion = JOB_VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #isRegenerateJobOnChange() <em>Regenerate Job On Change</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRegenerateJobOnChange()
     * @generated
     * @ordered
     */
    protected static final boolean REGENERATE_JOB_ON_CHANGE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRegenerateJobOnChange() <em>Regenerate Job On Change</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRegenerateJobOnChange()
     * @generated
     * @ordered
     */
    protected boolean regenerateJobOnChange = REGENERATE_JOB_ON_CHANGE_EDEFAULT;

    /**
     * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean ACTIVE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected boolean active = ACTIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getLastScriptGenerationDate() <em>Last Script Generation Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLastScriptGenerationDate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_SCRIPT_GENERATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastScriptGenerationDate() <em>Last Script Generation Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLastScriptGenerationDate()
     * @generated
     * @ordered
     */
    protected Date lastScriptGenerationDate = LAST_SCRIPT_GENERATION_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getGeneratedSvnRevision() <em>Generated Svn Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneratedSvnRevision()
     * @generated
     * @ordered
     */
    protected static final Long GENERATED_SVN_REVISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGeneratedSvnRevision() <em>Generated Svn Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneratedSvnRevision()
     * @generated
     * @ordered
     */
    protected Long generatedSvnRevision = GENERATED_SVN_REVISION_EDEFAULT;

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
     * The default value of the '{@link #getChecksumArchive() <em>Checksum Archive</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getChecksumArchive()
     * @generated
     * @ordered
     */
    protected static final String CHECKSUM_ARCHIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChecksumArchive() <em>Checksum Archive</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getChecksumArchive()
     * @generated
     * @ordered
     */
    protected String checksumArchive = CHECKSUM_ARCHIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getJobScriptArchiveFilename() <em>Job Script Archive Filename</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getJobScriptArchiveFilename()
     * @generated
     * @ordered
     */
    protected static final String JOB_SCRIPT_ARCHIVE_FILENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJobScriptArchiveFilename() <em>Job Script Archive Filename</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getJobScriptArchiveFilename()
     * @generated
     * @ordered
     */
    protected String jobScriptArchiveFilename = JOB_SCRIPT_ARCHIVE_FILENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getLastRunDate() <em>Last Run Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastRunDate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_RUN_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastRunDate() <em>Last Run Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastRunDate()
     * @generated
     * @ordered
     */
    protected Date lastRunDate = LAST_RUN_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getLastDeploymentDate() <em>Last Deployment Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLastDeploymentDate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_DEPLOYMENT_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastDeploymentDate() <em>Last Deployment Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLastDeploymentDate()
     * @generated
     * @ordered
     */
    protected Date lastDeploymentDate = LAST_DEPLOYMENT_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getLastEndedRunDate() <em>Last Ended Run Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLastEndedRunDate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_ENDED_RUN_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastEndedRunDate() <em>Last Ended Run Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLastEndedRunDate()
     * @generated
     * @ordered
     */
    protected Date lastEndedRunDate = LAST_ENDED_RUN_DATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getCmdPrms() <em>Cmd Prms</em>}' containment reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getCmdPrms()
     * @generated
     * @ordered
     */
    protected EList cmdPrms;

    /**
     * The cached value of the '{@link #getEsbPropertiesPrms() <em>Esb Properties Prms</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEsbPropertiesPrms()
     * @generated
     * @ordered
     */
    protected EList esbPropertiesPrms;

    /**
     * The cached value of the '{@link #getJobPrms() <em>Job Prms</em>}' containment reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getJobPrms()
     * @generated
     * @ordered
     */
    protected EList jobPrms;

    /**
     * The default value of the '{@link #getJobId() <em>Job Id</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getJobId()
     * @generated
     * @ordered
     */
    protected static final String JOB_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJobId() <em>Job Id</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getJobId()
     * @generated
     * @ordered
     */
    protected String jobId = JOB_ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getVirtualServer() <em>Virtual Server</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVirtualServer()
     * @generated
     * @ordered
     */
    protected ExecutionVirtualServer virtualServer;

    /**
     * The default value of the '{@link #getMaxConcurrentExecutions() <em>Max Concurrent Executions</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMaxConcurrentExecutions()
     * @generated
     * @ordered
     */
    protected static final int MAX_CONCURRENT_EXECUTIONS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaxConcurrentExecutions() <em>Max Concurrent Executions</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMaxConcurrentExecutions()
     * @generated
     * @ordered
     */
    protected int maxConcurrentExecutions = MAX_CONCURRENT_EXECUTIONS_EDEFAULT;

    /**
     * The default value of the '{@link #getGeneratedProjectName() <em>Generated Project Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getGeneratedProjectName()
     * @generated
     * @ordered
     */
    protected static final String GENERATED_PROJECT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGeneratedProjectName() <em>Generated Project Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getGeneratedProjectName()
     * @generated
     * @ordered
     */
    protected String generatedProjectName = GENERATED_PROJECT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getGeneratedJobName() <em>Generated Job Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getGeneratedJobName()
     * @generated
     * @ordered
     */
    protected static final String GENERATED_JOB_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGeneratedJobName() <em>Generated Job Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getGeneratedJobName()
     * @generated
     * @ordered
     */
    protected String generatedJobName = GENERATED_JOB_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getGeneratedJobVersion() <em>Generated Job Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneratedJobVersion()
     * @generated
     * @ordered
     */
    protected static final String GENERATED_JOB_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGeneratedJobVersion() <em>Generated Job Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneratedJobVersion()
     * @generated
     * @ordered
     */
    protected String generatedJobVersion = GENERATED_JOB_VERSION_EDEFAULT;

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
     * The default value of the '{@link #getErrorStackTrace() <em>Error Stack Trace</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getErrorStackTrace()
     * @generated
     * @ordered
     */
    protected static final String ERROR_STACK_TRACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getErrorStackTrace() <em>Error Stack Trace</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getErrorStackTrace()
     * @generated
     * @ordered
     */
    protected String errorStackTrace = ERROR_STACK_TRACE_EDEFAULT;

    /**
     * The default value of the '{@link #getLastTriggeringDate() <em>Last Triggering Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLastTriggeringDate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_TRIGGERING_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastTriggeringDate() <em>Last Triggering Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLastTriggeringDate()
     * @generated
     * @ordered
     */
    protected Date lastTriggeringDate = LAST_TRIGGERING_DATE_EDEFAULT;

    protected static final boolean EXEC_STATISTICS_ENABLED_EDEFAULT = false;

    protected boolean execStatisticsEnabled = EXEC_STATISTICS_ENABLED_EDEFAULT;

    /**
     * The default value of the '{@link #isAddStatisticsCodeEnabled() <em>Add Statistics Code Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAddStatisticsCodeEnabled()
     * @generated
     * @ordered
     */
    protected static final boolean ADD_STATISTICS_CODE_ENABLED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAddStatisticsCodeEnabled() <em>Add Statistics Code Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAddStatisticsCodeEnabled()
     * @generated
     * @ordered
     */
    protected boolean addStatisticsCodeEnabled = ADD_STATISTICS_CODE_ENABLED_EDEFAULT;

    /**
     * The default value of the '{@link #getOwnerSchedulerInstanceId() <em>Owner Scheduler Instance Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnerSchedulerInstanceId()
     * @generated
     * @ordered
     */
    protected static final String OWNER_SCHEDULER_INSTANCE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOwnerSchedulerInstanceId() <em>Owner Scheduler Instance Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnerSchedulerInstanceId()
     * @generated
     * @ordered
     */
    protected String ownerSchedulerInstanceId = OWNER_SCHEDULER_INSTANCE_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getOnUnknownStateJob() <em>On Unknown State Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnUnknownStateJob()
     * @generated
     * @ordered
     */
    protected static final String ON_UNKNOWN_STATE_JOB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnUnknownStateJob() <em>On Unknown State Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnUnknownStateJob()
     * @generated
     * @ordered
     */
    protected String onUnknownStateJob = ON_UNKNOWN_STATE_JOB_EDEFAULT;

    /**
     * The default value of the '{@link #isUseLatestVersion() <em>Use Latest Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseLatestVersion()
     * @generated
     * @ordered
     */
    protected static final boolean USE_LATEST_VERSION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUseLatestVersion() <em>Use Latest Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUseLatestVersion()
     * @generated
     * @ordered
     */
    protected boolean useLatestVersion = USE_LATEST_VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationType()
     * @generated
     * @ordered
     */
    protected static final String APPLICATION_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationType()
     * @generated
     * @ordered
     */
    protected String applicationType = APPLICATION_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getRepositoryName() <em>Repository Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepositoryName()
     * @generated
     * @ordered
     */
    protected static final String REPOSITORY_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRepositoryName() <em>Repository Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepositoryName()
     * @generated
     * @ordered
     */
    protected String repositoryName = REPOSITORY_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFeaturesFileUrl() <em>Features File Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeaturesFileUrl()
     * @generated
     * @ordered
     */
    protected static final String FEATURES_FILE_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeaturesFileUrl() <em>Features File Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeaturesFileUrl()
     * @generated
     * @ordered
     */
    protected String featuresFileUrl = FEATURES_FILE_URL_EDEFAULT;

    /**
     * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureName()
     * @generated
     * @ordered
     */
    protected static final String FEATURE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureName()
     * @generated
     * @ordered
     */
    protected String featureName = FEATURE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFeatureVersion() <em>Feature Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureVersion()
     * @generated
     * @ordered
     */
    protected static final String FEATURE_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeatureVersion() <em>Feature Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureVersion()
     * @generated
     * @ordered
     */
    protected String featureVersion = FEATURE_VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getApplicationGroup() <em>Application Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationGroup()
     * @generated
     * @ordered
     */
    protected static final String APPLICATION_GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApplicationGroup() <em>Application Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicationGroup()
     * @generated
     * @ordered
     */
    protected String applicationGroup = APPLICATION_GROUP_EDEFAULT;

    /**
     * The default value of the '{@link #getBundleName() <em>Bundle Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBundleName()
     * @generated
     * @ordered
     */
    protected static final String BUNDLE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBundleName() <em>Bundle Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBundleName()
     * @generated
     * @ordered
     */
    protected String bundleName = BUNDLE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPropertyId() <em>Property Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertyId()
     * @generated
     * @ordered
     */
    protected static final String PROPERTY_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPropertyId() <em>Property Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertyId()
     * @generated
     * @ordered
     */
    protected String propertyId = PROPERTY_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.EXECUTION_TASK;
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
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExecutionServer getExecutionServer() {
        if (executionServer != null && executionServer.eIsProxy()) {
            InternalEObject oldExecutionServer = (InternalEObject)executionServer;
            executionServer = (ExecutionServer)eResolveProxy(oldExecutionServer);
            if (executionServer != oldExecutionServer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER, oldExecutionServer, executionServer));
            }
        }
        return executionServer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExecutionServer basicGetExecutionServer() {
        return executionServer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionServer(ExecutionServer newExecutionServer) {
        ExecutionServer oldExecutionServer = executionServer;
        executionServer = newExecutionServer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER, oldExecutionServer, executionServer));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Project getProject() {
        if (project != null && project.eIsProxy()) {
            InternalEObject oldProject = (InternalEObject)project;
            project = (Project)eResolveProxy(oldProject);
            if (project != oldProject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.EXECUTION_TASK__PROJECT, oldProject, project));
            }
        }
        return project;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Project basicGetProject() {
        return project;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setProject(Project newProject) {
        Project oldProject = project;
        project = newProject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__PROJECT, oldProject, project));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBranch() {
        return branch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBranch(String newBranch) {
        String oldBranch = branch;
        branch = newBranch;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__BRANCH, oldBranch, branch));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getContext() {
        return context;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setContext(String newContext) {
        String oldContext = context;
        context = newContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__CONTEXT, oldContext, context));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getJobVersion() {
        return jobVersion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setJobVersion(String newJobVersion) {
        String oldJobVersion = jobVersion;
        jobVersion = newJobVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__JOB_VERSION, oldJobVersion, jobVersion));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRegenerateJobOnChange() {
        return regenerateJobOnChange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRegenerateJobOnChange(boolean newRegenerateJobOnChange) {
        boolean oldRegenerateJobOnChange = regenerateJobOnChange;
        regenerateJobOnChange = newRegenerateJobOnChange;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__REGENERATE_JOB_ON_CHANGE, oldRegenerateJobOnChange, regenerateJobOnChange));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isActive() {
        return active;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setActive(boolean newActive) {
        boolean oldActive = active;
        active = newActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ACTIVE, oldActive, active));
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
    public void setIdQuartzJob(int newIdQuartzJob) {
        int oldIdQuartzJob = idQuartzJob;
        idQuartzJob = newIdQuartzJob;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB, oldIdQuartzJob, idQuartzJob));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getLastScriptGenerationDate() {
        return lastScriptGenerationDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLastScriptGenerationDate(Date newLastScriptGenerationDate) {
        Date oldLastScriptGenerationDate = lastScriptGenerationDate;
        lastScriptGenerationDate = newLastScriptGenerationDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE, oldLastScriptGenerationDate, lastScriptGenerationDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Long getGeneratedSvnRevision() {
        return generatedSvnRevision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeneratedSvnRevision(Long newGeneratedSvnRevision) {
        Long oldGeneratedSvnRevision = generatedSvnRevision;
        generatedSvnRevision = newGeneratedSvnRevision;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__GENERATED_SVN_REVISION, oldGeneratedSvnRevision, generatedSvnRevision));
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
    public void setIdRemoteJob(String newIdRemoteJob) {
        String oldIdRemoteJob = idRemoteJob;
        idRemoteJob = newIdRemoteJob;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB, oldIdRemoteJob, idRemoteJob));
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
    public void setIdRemoteJobExecution(String newIdRemoteJobExecution) {
        String oldIdRemoteJobExecution = idRemoteJobExecution;
        idRemoteJobExecution = newIdRemoteJobExecution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION, oldIdRemoteJobExecution, idRemoteJobExecution));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getChecksumArchive() {
        return checksumArchive;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setChecksumArchive(String newChecksumArchive) {
        String oldChecksumArchive = checksumArchive;
        checksumArchive = newChecksumArchive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE, oldChecksumArchive, checksumArchive));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getJobScriptArchiveFilename() {
        return jobScriptArchiveFilename;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setJobScriptArchiveFilename(String newJobScriptArchiveFilename) {
        String oldJobScriptArchiveFilename = jobScriptArchiveFilename;
        jobScriptArchiveFilename = newJobScriptArchiveFilename;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE_FILENAME, oldJobScriptArchiveFilename, jobScriptArchiveFilename));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setStatus(String newStatus) {
        String oldStatus = status;
        status = newStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__STATUS, oldStatus, status));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isProcessingState() {
        return processingState;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setProcessingState(boolean newProcessingState) {
        boolean oldProcessingState = processingState;
        processingState = newProcessingState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE, oldProcessingState, processingState));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__REQUEST_ID, oldRequestId, requestId));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getErrorStatus() {
        return errorStatus;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setErrorStatus(String newErrorStatus) {
        String oldErrorStatus = errorStatus;
        errorStatus = newErrorStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ERROR_STATUS, oldErrorStatus, errorStatus));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getLastRunDate() {
        return lastRunDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLastRunDate(Date newLastRunDate) {
        Date oldLastRunDate = lastRunDate;
        lastRunDate = newLastRunDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__LAST_RUN_DATE, oldLastRunDate, lastRunDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getLastDeploymentDate() {
        return lastDeploymentDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLastDeploymentDate(Date newLastDeploymentDate) {
        Date oldLastDeploymentDate = lastDeploymentDate;
        lastDeploymentDate = newLastDeploymentDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__LAST_DEPLOYMENT_DATE, oldLastDeploymentDate, lastDeploymentDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getLastEndedRunDate() {
        return lastEndedRunDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLastEndedRunDate(Date newLastEndedRunDate) {
        Date oldLastEndedRunDate = lastEndedRunDate;
        lastEndedRunDate = newLastEndedRunDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__LAST_ENDED_RUN_DATE, oldLastEndedRunDate, lastEndedRunDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getTriggers() {
        if (triggers == null) {
            triggers = new EObjectContainmentWithInverseEList(TalendTrigger.class, this, PropertiesPackage.EXECUTION_TASK__TRIGGERS, PropertiesPackage.TALEND_TRIGGER__EXECUTION_TRIGGERABLE);
        }
        return triggers;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getCmdPrms() {
        if (cmdPrms == null) {
            cmdPrms = new EObjectContainmentWithInverseEList(ExecutionTaskCmdPrm.class, this, PropertiesPackage.EXECUTION_TASK__CMD_PRMS, PropertiesPackage.EXECUTION_TASK_CMD_PRM__EXECUTION_TASK);
        }
        return cmdPrms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getEsbPropertiesPrms() {
        if (esbPropertiesPrms == null) {
            esbPropertiesPrms = new EObjectContainmentWithInverseEList(ExecutionTaskProperties.class, this, PropertiesPackage.EXECUTION_TASK__ESB_PROPERTIES_PRMS, PropertiesPackage.EXECUTION_TASK_PROPERTIES__EXECUTION_TASK);
        }
        return esbPropertiesPrms;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getJobPrms() {
        if (jobPrms == null) {
            jobPrms = new EObjectContainmentWithInverseEList(ExecutionTaskJobPrm.class, this, PropertiesPackage.EXECUTION_TASK__JOB_PRMS, PropertiesPackage.EXECUTION_TASK_JOB_PRM__EXECUTION_TASK);
        }
        return jobPrms;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setJobId(String newJobId) {
        String oldJobId = jobId;
        jobId = newJobId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__JOB_ID, oldJobId, jobId));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExecutionVirtualServer getVirtualServer() {
        if (virtualServer != null && virtualServer.eIsProxy()) {
            InternalEObject oldVirtualServer = (InternalEObject)virtualServer;
            virtualServer = (ExecutionVirtualServer)eResolveProxy(oldVirtualServer);
            if (virtualServer != oldVirtualServer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.EXECUTION_TASK__VIRTUAL_SERVER, oldVirtualServer, virtualServer));
            }
        }
        return virtualServer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExecutionVirtualServer basicGetVirtualServer() {
        return virtualServer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVirtualServer(ExecutionVirtualServer newVirtualServer) {
        ExecutionVirtualServer oldVirtualServer = virtualServer;
        virtualServer = newVirtualServer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__VIRTUAL_SERVER, oldVirtualServer, virtualServer));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isConcurrentExecution() {
        return concurrentExecution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setConcurrentExecution(boolean newConcurrentExecution) {
        boolean oldConcurrentExecution = concurrentExecution;
        concurrentExecution = newConcurrentExecution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__CONCURRENT_EXECUTION, oldConcurrentExecution, concurrentExecution));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getMaxConcurrentExecutions() {
        return maxConcurrentExecutions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMaxConcurrentExecutions(int newMaxConcurrentExecutions) {
        int oldMaxConcurrentExecutions = maxConcurrentExecutions;
        maxConcurrentExecutions = newMaxConcurrentExecutions;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__MAX_CONCURRENT_EXECUTIONS, oldMaxConcurrentExecutions, maxConcurrentExecutions));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getGeneratedProjectName() {
        return generatedProjectName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setGeneratedProjectName(String newGeneratedProjectName) {
        String oldGeneratedProjectName = generatedProjectName;
        generatedProjectName = newGeneratedProjectName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__GENERATED_PROJECT_NAME, oldGeneratedProjectName, generatedProjectName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getGeneratedJobName() {
        return generatedJobName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setGeneratedJobName(String newGeneratedJobName) {
        String oldGeneratedJobName = generatedJobName;
        generatedJobName = newGeneratedJobName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_NAME, oldGeneratedJobName, generatedJobName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGeneratedJobVersion() {
        return generatedJobVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeneratedJobVersion(String newGeneratedJobVersion) {
        String oldGeneratedJobVersion = generatedJobVersion;
        generatedJobVersion = newGeneratedJobVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_VERSION, oldGeneratedJobVersion, generatedJobVersion));
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
    public void setApplyContextToChildren(boolean newApplyContextToChildren) {
        boolean oldApplyContextToChildren = applyContextToChildren;
        applyContextToChildren = newApplyContextToChildren;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__APPLY_CONTEXT_TO_CHILDREN, oldApplyContextToChildren, applyContextToChildren));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getErrorStackTrace() {
        return errorStackTrace;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setErrorStackTrace(String newErrorStackTrace) {
        String oldErrorStackTrace = errorStackTrace;
        errorStackTrace = newErrorStackTrace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ERROR_STACK_TRACE, oldErrorStackTrace, errorStackTrace));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getLastTriggeringDate() {
        return lastTriggeringDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLastTriggeringDate(Date newLastTriggeringDate) {
        Date oldLastTriggeringDate = lastTriggeringDate;
        lastTriggeringDate = newLastTriggeringDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__LAST_TRIGGERING_DATE, oldLastTriggeringDate, lastTriggeringDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isExecStatisticsEnabled() {
        return execStatisticsEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecStatisticsEnabled(boolean newExecStatisticsEnabled) {
        boolean oldExecStatisticsEnabled = execStatisticsEnabled;
        execStatisticsEnabled = newExecStatisticsEnabled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__EXEC_STATISTICS_ENABLED, oldExecStatisticsEnabled, execStatisticsEnabled));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAddStatisticsCodeEnabled() {
        return addStatisticsCodeEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddStatisticsCodeEnabled(boolean newAddStatisticsCodeEnabled) {
        boolean oldAddStatisticsCodeEnabled = addStatisticsCodeEnabled;
        addStatisticsCodeEnabled = newAddStatisticsCodeEnabled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ADD_STATISTICS_CODE_ENABLED, oldAddStatisticsCodeEnabled, addStatisticsCodeEnabled));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOwnerSchedulerInstanceId() {
        return ownerSchedulerInstanceId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwnerSchedulerInstanceId(String newOwnerSchedulerInstanceId) {
        String oldOwnerSchedulerInstanceId = ownerSchedulerInstanceId;
        ownerSchedulerInstanceId = newOwnerSchedulerInstanceId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__OWNER_SCHEDULER_INSTANCE_ID, oldOwnerSchedulerInstanceId, ownerSchedulerInstanceId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnUnknownStateJob() {
        return onUnknownStateJob;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnUnknownStateJob(String newOnUnknownStateJob) {
        String oldOnUnknownStateJob = onUnknownStateJob;
        onUnknownStateJob = newOnUnknownStateJob;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ON_UNKNOWN_STATE_JOB, oldOnUnknownStateJob, onUnknownStateJob));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUseLatestVersion() {
        return useLatestVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUseLatestVersion(boolean newUseLatestVersion) {
        boolean oldUseLatestVersion = useLatestVersion;
        useLatestVersion = newUseLatestVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__USE_LATEST_VERSION, oldUseLatestVersion, useLatestVersion));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setApplicationType(String newApplicationType) {
        String oldApplicationType = applicationType;
        applicationType = newApplicationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__APPLICATION_TYPE, oldApplicationType, applicationType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepositoryName(String newRepositoryName) {
        String oldRepositoryName = repositoryName;
        repositoryName = newRepositoryName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__REPOSITORY_NAME, oldRepositoryName, repositoryName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFeaturesFileUrl() {
        return featuresFileUrl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeaturesFileUrl(String newFeaturesFileUrl) {
        String oldFeaturesFileUrl = featuresFileUrl;
        featuresFileUrl = newFeaturesFileUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__FEATURES_FILE_URL, oldFeaturesFileUrl, featuresFileUrl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getApplicationGroup() {
        return applicationGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setApplicationGroup(String newApplicationGroup) {
        String oldApplicationGroup = applicationGroup;
        applicationGroup = newApplicationGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__APPLICATION_GROUP, oldApplicationGroup, applicationGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBundleName() {
        return bundleName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBundleName(String newBundleName) {
        String oldBundleName = bundleName;
        bundleName = newBundleName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__BUNDLE_NAME, oldBundleName, bundleName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPropertyId(String newPropertyId) {
        String oldPropertyId = propertyId;
        propertyId = newPropertyId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__PROPERTY_ID, oldPropertyId, propertyId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeatureName(String newFeatureName) {
        String oldFeatureName = featureName;
        featureName = newFeatureName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__FEATURE_NAME, oldFeatureName, featureName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFeatureVersion() {
        return featureVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeatureVersion(String newFeatureVersion) {
        String oldFeatureVersion = featureVersion;
        featureVersion = newFeatureVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__FEATURE_VERSION, oldFeatureVersion, featureVersion));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK__TRIGGERS:
                return ((InternalEList)getTriggers()).basicAdd(otherEnd, msgs);
            case PropertiesPackage.EXECUTION_TASK__CMD_PRMS:
                return ((InternalEList)getCmdPrms()).basicAdd(otherEnd, msgs);
            case PropertiesPackage.EXECUTION_TASK__ESB_PROPERTIES_PRMS:
                return ((InternalEList)getEsbPropertiesPrms()).basicAdd(otherEnd, msgs);
            case PropertiesPackage.EXECUTION_TASK__JOB_PRMS:
                return ((InternalEList)getJobPrms()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK__TRIGGERS:
                return ((InternalEList)getTriggers()).basicRemove(otherEnd, msgs);
            case PropertiesPackage.EXECUTION_TASK__CMD_PRMS:
                return ((InternalEList)getCmdPrms()).basicRemove(otherEnd, msgs);
            case PropertiesPackage.EXECUTION_TASK__ESB_PROPERTIES_PRMS:
                return ((InternalEList)getEsbPropertiesPrms()).basicRemove(otherEnd, msgs);
            case PropertiesPackage.EXECUTION_TASK__JOB_PRMS:
                return ((InternalEList)getJobPrms()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK__ID:
                return new Integer(getId());
            case PropertiesPackage.EXECUTION_TASK__TRIGGERS:
                return getTriggers();
            case PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB:
                return new Integer(getIdQuartzJob());
            case PropertiesPackage.EXECUTION_TASK__STATUS:
                return getStatus();
            case PropertiesPackage.EXECUTION_TASK__ERROR_STATUS:
                return getErrorStatus();
            case PropertiesPackage.EXECUTION_TASK__CONCURRENT_EXECUTION:
                return isConcurrentExecution() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE:
                return isProcessingState() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK__REQUEST_ID:
                return getRequestId();
            case PropertiesPackage.EXECUTION_TASK__LABEL:
                return getLabel();
            case PropertiesPackage.EXECUTION_TASK__DESCRIPTION:
                return getDescription();
            case PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER:
                if (resolve) return getExecutionServer();
                return basicGetExecutionServer();
            case PropertiesPackage.EXECUTION_TASK__PROJECT:
                if (resolve) return getProject();
                return basicGetProject();
            case PropertiesPackage.EXECUTION_TASK__BRANCH:
                return getBranch();
            case PropertiesPackage.EXECUTION_TASK__CONTEXT:
                return getContext();
            case PropertiesPackage.EXECUTION_TASK__JOB_VERSION:
                return getJobVersion();
            case PropertiesPackage.EXECUTION_TASK__REGENERATE_JOB_ON_CHANGE:
                return isRegenerateJobOnChange() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK__ACTIVE:
                return isActive() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE:
                return getLastScriptGenerationDate();
            case PropertiesPackage.EXECUTION_TASK__GENERATED_SVN_REVISION:
                return getGeneratedSvnRevision();
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB:
                return getIdRemoteJob();
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION:
                return getIdRemoteJobExecution();
            case PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE:
                return getChecksumArchive();
            case PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE_FILENAME:
                return getJobScriptArchiveFilename();
            case PropertiesPackage.EXECUTION_TASK__LAST_RUN_DATE:
                return getLastRunDate();
            case PropertiesPackage.EXECUTION_TASK__LAST_DEPLOYMENT_DATE:
                return getLastDeploymentDate();
            case PropertiesPackage.EXECUTION_TASK__LAST_ENDED_RUN_DATE:
                return getLastEndedRunDate();
            case PropertiesPackage.EXECUTION_TASK__CMD_PRMS:
                return getCmdPrms();
            case PropertiesPackage.EXECUTION_TASK__ESB_PROPERTIES_PRMS:
                return getEsbPropertiesPrms();
            case PropertiesPackage.EXECUTION_TASK__JOB_PRMS:
                return getJobPrms();
            case PropertiesPackage.EXECUTION_TASK__JOB_ID:
                return getJobId();
            case PropertiesPackage.EXECUTION_TASK__VIRTUAL_SERVER:
                if (resolve) return getVirtualServer();
                return basicGetVirtualServer();
            case PropertiesPackage.EXECUTION_TASK__MAX_CONCURRENT_EXECUTIONS:
                return new Integer(getMaxConcurrentExecutions());
            case PropertiesPackage.EXECUTION_TASK__GENERATED_PROJECT_NAME:
                return getGeneratedProjectName();
            case PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_NAME:
                return getGeneratedJobName();
            case PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_VERSION:
                return getGeneratedJobVersion();
            case PropertiesPackage.EXECUTION_TASK__APPLY_CONTEXT_TO_CHILDREN:
                return isApplyContextToChildren() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK__ERROR_STACK_TRACE:
                return getErrorStackTrace();
            case PropertiesPackage.EXECUTION_TASK__LAST_TRIGGERING_DATE:
                return getLastTriggeringDate();
            case PropertiesPackage.EXECUTION_TASK__EXEC_STATISTICS_ENABLED:
                return isExecStatisticsEnabled() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK__ADD_STATISTICS_CODE_ENABLED:
                return isAddStatisticsCodeEnabled() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK__OWNER_SCHEDULER_INSTANCE_ID:
                return getOwnerSchedulerInstanceId();
            case PropertiesPackage.EXECUTION_TASK__ON_UNKNOWN_STATE_JOB:
                return getOnUnknownStateJob();
            case PropertiesPackage.EXECUTION_TASK__USE_LATEST_VERSION:
                return isUseLatestVersion() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK__APPLICATION_TYPE:
                return getApplicationType();
            case PropertiesPackage.EXECUTION_TASK__REPOSITORY_NAME:
                return getRepositoryName();
            case PropertiesPackage.EXECUTION_TASK__FEATURES_FILE_URL:
                return getFeaturesFileUrl();
            case PropertiesPackage.EXECUTION_TASK__FEATURE_NAME:
                return getFeatureName();
            case PropertiesPackage.EXECUTION_TASK__FEATURE_VERSION:
                return getFeatureVersion();
            case PropertiesPackage.EXECUTION_TASK__APPLICATION_GROUP:
                return getApplicationGroup();
            case PropertiesPackage.EXECUTION_TASK__BUNDLE_NAME:
                return getBundleName();
            case PropertiesPackage.EXECUTION_TASK__PROPERTY_ID:
                return getPropertyId();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__TRIGGERS:
                getTriggers().clear();
                getTriggers().addAll((Collection)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB:
                setIdQuartzJob(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__STATUS:
                setStatus((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__ERROR_STATUS:
                setErrorStatus((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__CONCURRENT_EXECUTION:
                setConcurrentExecution(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE:
                setProcessingState(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__REQUEST_ID:
                setRequestId((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER:
                setExecutionServer((ExecutionServer)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROJECT:
                setProject((Project)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__BRANCH:
                setBranch((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__CONTEXT:
                setContext((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_VERSION:
                setJobVersion((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__REGENERATE_JOB_ON_CHANGE:
                setRegenerateJobOnChange(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__ACTIVE:
                setActive(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE:
                setLastScriptGenerationDate((Date)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__GENERATED_SVN_REVISION:
                setGeneratedSvnRevision((Long)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB:
                setIdRemoteJob((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION:
                setIdRemoteJobExecution((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE:
                setChecksumArchive((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE_FILENAME:
                setJobScriptArchiveFilename((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_RUN_DATE:
                setLastRunDate((Date)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_DEPLOYMENT_DATE:
                setLastDeploymentDate((Date)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_ENDED_RUN_DATE:
                setLastEndedRunDate((Date)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__CMD_PRMS:
                getCmdPrms().clear();
                getCmdPrms().addAll((Collection)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__ESB_PROPERTIES_PRMS:
                getEsbPropertiesPrms().clear();
                getEsbPropertiesPrms().addAll((Collection)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_PRMS:
                getJobPrms().clear();
                getJobPrms().addAll((Collection)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_ID:
                setJobId((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__VIRTUAL_SERVER:
                setVirtualServer((ExecutionVirtualServer)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__MAX_CONCURRENT_EXECUTIONS:
                setMaxConcurrentExecutions(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__GENERATED_PROJECT_NAME:
                setGeneratedProjectName((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_NAME:
                setGeneratedJobName((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_VERSION:
                setGeneratedJobVersion((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__APPLY_CONTEXT_TO_CHILDREN:
                setApplyContextToChildren(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__ERROR_STACK_TRACE:
                setErrorStackTrace((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_TRIGGERING_DATE:
                setLastTriggeringDate((Date)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__EXEC_STATISTICS_ENABLED:
                setExecStatisticsEnabled(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__ADD_STATISTICS_CODE_ENABLED:
                setAddStatisticsCodeEnabled(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__OWNER_SCHEDULER_INSTANCE_ID:
                setOwnerSchedulerInstanceId((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__ON_UNKNOWN_STATE_JOB:
                setOnUnknownStateJob((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__USE_LATEST_VERSION:
                setUseLatestVersion(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__APPLICATION_TYPE:
                setApplicationType((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__REPOSITORY_NAME:
                setRepositoryName((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__FEATURES_FILE_URL:
                setFeaturesFileUrl((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__FEATURE_NAME:
                setFeatureName((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__FEATURE_VERSION:
                setFeatureVersion((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__APPLICATION_GROUP:
                setApplicationGroup((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__BUNDLE_NAME:
                setBundleName((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROPERTY_ID:
                setPropertyId((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__TRIGGERS:
                getTriggers().clear();
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB:
                setIdQuartzJob(ID_QUARTZ_JOB_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__STATUS:
                setStatus(STATUS_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ERROR_STATUS:
                setErrorStatus(ERROR_STATUS_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__CONCURRENT_EXECUTION:
                setConcurrentExecution(CONCURRENT_EXECUTION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE:
                setProcessingState(PROCESSING_STATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__REQUEST_ID:
                setRequestId(REQUEST_ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER:
                setExecutionServer((ExecutionServer)null);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROJECT:
                setProject((Project)null);
                return;
            case PropertiesPackage.EXECUTION_TASK__BRANCH:
                setBranch(BRANCH_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__CONTEXT:
                setContext(CONTEXT_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_VERSION:
                setJobVersion(JOB_VERSION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__REGENERATE_JOB_ON_CHANGE:
                setRegenerateJobOnChange(REGENERATE_JOB_ON_CHANGE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ACTIVE:
                setActive(ACTIVE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE:
                setLastScriptGenerationDate(LAST_SCRIPT_GENERATION_DATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__GENERATED_SVN_REVISION:
                setGeneratedSvnRevision(GENERATED_SVN_REVISION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB:
                setIdRemoteJob(ID_REMOTE_JOB_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION:
                setIdRemoteJobExecution(ID_REMOTE_JOB_EXECUTION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE:
                setChecksumArchive(CHECKSUM_ARCHIVE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE_FILENAME:
                setJobScriptArchiveFilename(JOB_SCRIPT_ARCHIVE_FILENAME_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_RUN_DATE:
                setLastRunDate(LAST_RUN_DATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_DEPLOYMENT_DATE:
                setLastDeploymentDate(LAST_DEPLOYMENT_DATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_ENDED_RUN_DATE:
                setLastEndedRunDate(LAST_ENDED_RUN_DATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__CMD_PRMS:
                getCmdPrms().clear();
                return;
            case PropertiesPackage.EXECUTION_TASK__ESB_PROPERTIES_PRMS:
                getEsbPropertiesPrms().clear();
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_PRMS:
                getJobPrms().clear();
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_ID:
                setJobId(JOB_ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__VIRTUAL_SERVER:
                setVirtualServer((ExecutionVirtualServer)null);
                return;
            case PropertiesPackage.EXECUTION_TASK__MAX_CONCURRENT_EXECUTIONS:
                setMaxConcurrentExecutions(MAX_CONCURRENT_EXECUTIONS_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__GENERATED_PROJECT_NAME:
                setGeneratedProjectName(GENERATED_PROJECT_NAME_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_NAME:
                setGeneratedJobName(GENERATED_JOB_NAME_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_VERSION:
                setGeneratedJobVersion(GENERATED_JOB_VERSION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__APPLY_CONTEXT_TO_CHILDREN:
                setApplyContextToChildren(APPLY_CONTEXT_TO_CHILDREN_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ERROR_STACK_TRACE:
                setErrorStackTrace(ERROR_STACK_TRACE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_TRIGGERING_DATE:
                setLastTriggeringDate(LAST_TRIGGERING_DATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__EXEC_STATISTICS_ENABLED:
                setExecStatisticsEnabled(EXEC_STATISTICS_ENABLED_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ADD_STATISTICS_CODE_ENABLED:
                setAddStatisticsCodeEnabled(ADD_STATISTICS_CODE_ENABLED_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__OWNER_SCHEDULER_INSTANCE_ID:
                setOwnerSchedulerInstanceId(OWNER_SCHEDULER_INSTANCE_ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ON_UNKNOWN_STATE_JOB:
                setOnUnknownStateJob(ON_UNKNOWN_STATE_JOB_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__USE_LATEST_VERSION:
                setUseLatestVersion(USE_LATEST_VERSION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__APPLICATION_TYPE:
                setApplicationType(APPLICATION_TYPE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__REPOSITORY_NAME:
                setRepositoryName(REPOSITORY_NAME_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__FEATURES_FILE_URL:
                setFeaturesFileUrl(FEATURES_FILE_URL_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__FEATURE_NAME:
                setFeatureName(FEATURE_NAME_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__FEATURE_VERSION:
                setFeatureVersion(FEATURE_VERSION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__APPLICATION_GROUP:
                setApplicationGroup(APPLICATION_GROUP_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__BUNDLE_NAME:
                setBundleName(BUNDLE_NAME_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROPERTY_ID:
                setPropertyId(PROPERTY_ID_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__TRIGGERS:
                return triggers != null && !triggers.isEmpty();
            case PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB:
                return idQuartzJob != ID_QUARTZ_JOB_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__STATUS:
                return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
            case PropertiesPackage.EXECUTION_TASK__ERROR_STATUS:
                return ERROR_STATUS_EDEFAULT == null ? errorStatus != null : !ERROR_STATUS_EDEFAULT.equals(errorStatus);
            case PropertiesPackage.EXECUTION_TASK__CONCURRENT_EXECUTION:
                return concurrentExecution != CONCURRENT_EXECUTION_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE:
                return processingState != PROCESSING_STATE_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__REQUEST_ID:
                return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
            case PropertiesPackage.EXECUTION_TASK__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.EXECUTION_TASK__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER:
                return executionServer != null;
            case PropertiesPackage.EXECUTION_TASK__PROJECT:
                return project != null;
            case PropertiesPackage.EXECUTION_TASK__BRANCH:
                return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
            case PropertiesPackage.EXECUTION_TASK__CONTEXT:
                return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
            case PropertiesPackage.EXECUTION_TASK__JOB_VERSION:
                return JOB_VERSION_EDEFAULT == null ? jobVersion != null : !JOB_VERSION_EDEFAULT.equals(jobVersion);
            case PropertiesPackage.EXECUTION_TASK__REGENERATE_JOB_ON_CHANGE:
                return regenerateJobOnChange != REGENERATE_JOB_ON_CHANGE_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__ACTIVE:
                return active != ACTIVE_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE:
                return LAST_SCRIPT_GENERATION_DATE_EDEFAULT == null ? lastScriptGenerationDate != null : !LAST_SCRIPT_GENERATION_DATE_EDEFAULT.equals(lastScriptGenerationDate);
            case PropertiesPackage.EXECUTION_TASK__GENERATED_SVN_REVISION:
                return GENERATED_SVN_REVISION_EDEFAULT == null ? generatedSvnRevision != null : !GENERATED_SVN_REVISION_EDEFAULT.equals(generatedSvnRevision);
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB:
                return ID_REMOTE_JOB_EDEFAULT == null ? idRemoteJob != null : !ID_REMOTE_JOB_EDEFAULT.equals(idRemoteJob);
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION:
                return ID_REMOTE_JOB_EXECUTION_EDEFAULT == null ? idRemoteJobExecution != null : !ID_REMOTE_JOB_EXECUTION_EDEFAULT.equals(idRemoteJobExecution);
            case PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE:
                return CHECKSUM_ARCHIVE_EDEFAULT == null ? checksumArchive != null : !CHECKSUM_ARCHIVE_EDEFAULT.equals(checksumArchive);
            case PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE_FILENAME:
                return JOB_SCRIPT_ARCHIVE_FILENAME_EDEFAULT == null ? jobScriptArchiveFilename != null : !JOB_SCRIPT_ARCHIVE_FILENAME_EDEFAULT.equals(jobScriptArchiveFilename);
            case PropertiesPackage.EXECUTION_TASK__LAST_RUN_DATE:
                return LAST_RUN_DATE_EDEFAULT == null ? lastRunDate != null : !LAST_RUN_DATE_EDEFAULT.equals(lastRunDate);
            case PropertiesPackage.EXECUTION_TASK__LAST_DEPLOYMENT_DATE:
                return LAST_DEPLOYMENT_DATE_EDEFAULT == null ? lastDeploymentDate != null : !LAST_DEPLOYMENT_DATE_EDEFAULT.equals(lastDeploymentDate);
            case PropertiesPackage.EXECUTION_TASK__LAST_ENDED_RUN_DATE:
                return LAST_ENDED_RUN_DATE_EDEFAULT == null ? lastEndedRunDate != null : !LAST_ENDED_RUN_DATE_EDEFAULT.equals(lastEndedRunDate);
            case PropertiesPackage.EXECUTION_TASK__CMD_PRMS:
                return cmdPrms != null && !cmdPrms.isEmpty();
            case PropertiesPackage.EXECUTION_TASK__ESB_PROPERTIES_PRMS:
                return esbPropertiesPrms != null && !esbPropertiesPrms.isEmpty();
            case PropertiesPackage.EXECUTION_TASK__JOB_PRMS:
                return jobPrms != null && !jobPrms.isEmpty();
            case PropertiesPackage.EXECUTION_TASK__JOB_ID:
                return JOB_ID_EDEFAULT == null ? jobId != null : !JOB_ID_EDEFAULT.equals(jobId);
            case PropertiesPackage.EXECUTION_TASK__VIRTUAL_SERVER:
                return virtualServer != null;
            case PropertiesPackage.EXECUTION_TASK__MAX_CONCURRENT_EXECUTIONS:
                return maxConcurrentExecutions != MAX_CONCURRENT_EXECUTIONS_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__GENERATED_PROJECT_NAME:
                return GENERATED_PROJECT_NAME_EDEFAULT == null ? generatedProjectName != null : !GENERATED_PROJECT_NAME_EDEFAULT.equals(generatedProjectName);
            case PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_NAME:
                return GENERATED_JOB_NAME_EDEFAULT == null ? generatedJobName != null : !GENERATED_JOB_NAME_EDEFAULT.equals(generatedJobName);
            case PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_VERSION:
                return GENERATED_JOB_VERSION_EDEFAULT == null ? generatedJobVersion != null : !GENERATED_JOB_VERSION_EDEFAULT.equals(generatedJobVersion);
            case PropertiesPackage.EXECUTION_TASK__APPLY_CONTEXT_TO_CHILDREN:
                return applyContextToChildren != APPLY_CONTEXT_TO_CHILDREN_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__ERROR_STACK_TRACE:
                return ERROR_STACK_TRACE_EDEFAULT == null ? errorStackTrace != null : !ERROR_STACK_TRACE_EDEFAULT.equals(errorStackTrace);
            case PropertiesPackage.EXECUTION_TASK__LAST_TRIGGERING_DATE:
                return LAST_TRIGGERING_DATE_EDEFAULT == null ? lastTriggeringDate != null : !LAST_TRIGGERING_DATE_EDEFAULT.equals(lastTriggeringDate);
            case PropertiesPackage.EXECUTION_TASK__EXEC_STATISTICS_ENABLED:
                return execStatisticsEnabled != EXEC_STATISTICS_ENABLED_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__ADD_STATISTICS_CODE_ENABLED:
                return addStatisticsCodeEnabled != ADD_STATISTICS_CODE_ENABLED_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__OWNER_SCHEDULER_INSTANCE_ID:
                return OWNER_SCHEDULER_INSTANCE_ID_EDEFAULT == null ? ownerSchedulerInstanceId != null : !OWNER_SCHEDULER_INSTANCE_ID_EDEFAULT.equals(ownerSchedulerInstanceId);
            case PropertiesPackage.EXECUTION_TASK__ON_UNKNOWN_STATE_JOB:
                return ON_UNKNOWN_STATE_JOB_EDEFAULT == null ? onUnknownStateJob != null : !ON_UNKNOWN_STATE_JOB_EDEFAULT.equals(onUnknownStateJob);
            case PropertiesPackage.EXECUTION_TASK__USE_LATEST_VERSION:
                return useLatestVersion != USE_LATEST_VERSION_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__APPLICATION_TYPE:
                return APPLICATION_TYPE_EDEFAULT == null ? applicationType != null : !APPLICATION_TYPE_EDEFAULT.equals(applicationType);
            case PropertiesPackage.EXECUTION_TASK__REPOSITORY_NAME:
                return REPOSITORY_NAME_EDEFAULT == null ? repositoryName != null : !REPOSITORY_NAME_EDEFAULT.equals(repositoryName);
            case PropertiesPackage.EXECUTION_TASK__FEATURES_FILE_URL:
                return FEATURES_FILE_URL_EDEFAULT == null ? featuresFileUrl != null : !FEATURES_FILE_URL_EDEFAULT.equals(featuresFileUrl);
            case PropertiesPackage.EXECUTION_TASK__FEATURE_NAME:
                return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
            case PropertiesPackage.EXECUTION_TASK__FEATURE_VERSION:
                return FEATURE_VERSION_EDEFAULT == null ? featureVersion != null : !FEATURE_VERSION_EDEFAULT.equals(featureVersion);
            case PropertiesPackage.EXECUTION_TASK__APPLICATION_GROUP:
                return APPLICATION_GROUP_EDEFAULT == null ? applicationGroup != null : !APPLICATION_GROUP_EDEFAULT.equals(applicationGroup);
            case PropertiesPackage.EXECUTION_TASK__BUNDLE_NAME:
                return BUNDLE_NAME_EDEFAULT == null ? bundleName != null : !BUNDLE_NAME_EDEFAULT.equals(bundleName);
            case PropertiesPackage.EXECUTION_TASK__PROPERTY_ID:
                return PROPERTY_ID_EDEFAULT == null ? propertyId != null : !PROPERTY_ID_EDEFAULT.equals(propertyId);
        }
        return super.eIsSet(featureID);
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
        result.append(", branch: ");
        result.append(branch);
        result.append(", context: ");
        result.append(context);
        result.append(", jobVersion: ");
        result.append(jobVersion);
        result.append(", regenerateJobOnChange: ");
        result.append(regenerateJobOnChange);
        result.append(", active: ");
        result.append(active);
        result.append(", lastScriptGenerationDate: ");
        result.append(lastScriptGenerationDate);
        result.append(", generatedSvnRevision: ");
        result.append(generatedSvnRevision);
        result.append(", idRemoteJob: ");
        result.append(idRemoteJob);
        result.append(", idRemoteJobExecution: ");
        result.append(idRemoteJobExecution);
        result.append(", checksumArchive: ");
        result.append(checksumArchive);
        result.append(", jobScriptArchiveFilename: ");
        result.append(jobScriptArchiveFilename);
        result.append(", lastRunDate: ");
        result.append(lastRunDate);
        result.append(", lastDeploymentDate: ");
        result.append(lastDeploymentDate);
        result.append(", lastEndedRunDate: ");
        result.append(lastEndedRunDate);
        result.append(", jobId: ");
        result.append(jobId);
        result.append(", maxConcurrentExecutions: ");
        result.append(maxConcurrentExecutions);
        result.append(", generatedProjectName: ");
        result.append(generatedProjectName);
        result.append(", generatedJobName: ");
        result.append(generatedJobName);
        result.append(", generatedJobVersion: ");
        result.append(generatedJobVersion);
        result.append(", applyContextToChildren: ");
        result.append(applyContextToChildren);
        result.append(", errorStackTrace: ");
        result.append(errorStackTrace);
        result.append(", lastTriggeringDate: ");
        result.append(lastTriggeringDate);
        result.append(", execStatisticsEnabled: ");
        result.append(execStatisticsEnabled);
        result.append(", addStatisticsCodeEnabled: ");
        result.append(addStatisticsCodeEnabled);
        result.append(", ownerSchedulerInstanceId: ");
        result.append(ownerSchedulerInstanceId);
        result.append(", onUnknownStateJob: ");
        result.append(onUnknownStateJob);
        result.append(", useLatestVersion: ");
        result.append(useLatestVersion);
        result.append(", applicationType: ");
        result.append(applicationType);
        result.append(", repositoryName: ");
        result.append(repositoryName);
        result.append(", featuresFileUrl: ");
        result.append(featuresFileUrl);
        result.append(", featureName: ");
        result.append(featureName);
        result.append(", featureVersion: ");
        result.append(featureVersion);
        result.append(", applicationGroup: ");
        result.append(applicationGroup);
        result.append(", bundleName: ");
        result.append(bundleName);
        result.append(", propertyId: ");
        result.append(propertyId);
        result.append(')');
        return result.toString();
    }

} // ExecutionTaskImpl
