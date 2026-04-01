/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Execution Task</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getExecutionServer <em>Execution Server</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getProject <em>Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getBranch <em>Branch</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getJobVersion <em>Job Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#isRegenerateJobOnChange <em>Regenerate Job On Change</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getLastScriptGenerationDate <em>Last Script Generation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getGeneratedSvnRevision <em>Generated Svn Revision</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getIdRemoteJob <em>Id Remote Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getIdRemoteJobExecution <em>Id Remote Job Execution</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getChecksumArchive <em>Checksum Archive</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getJobScriptArchiveFilename <em>Job Script Archive Filename</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getLastRunDate <em>Last Run Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getLastDeploymentDate <em>Last Deployment Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getLastEndedRunDate <em>Last Ended Run Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getCmdPrms <em>Cmd Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getEsbPropertiesPrms <em>Esb Properties Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getJobPrms <em>Job Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getJobId <em>Job Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getVirtualServer <em>Virtual Server</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getMaxConcurrentExecutions <em>Max Concurrent Executions</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getGeneratedProjectName <em>Generated Project Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getGeneratedJobName <em>Generated Job Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getGeneratedJobVersion <em>Generated Job Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#isApplyContextToChildren <em>Apply Context To Children</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getErrorStackTrace <em>Error Stack Trace</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getLastTriggeringDate <em>Last Triggering Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#isExecStatisticsEnabled <em>Exec Statistics Enabled</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#isAddStatisticsCodeEnabled <em>Add Statistics Code Enabled</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getOwnerSchedulerInstanceId <em>Owner Scheduler Instance Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getOnUnknownStateJob <em>On Unknown State Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#isUseLatestVersion <em>Use Latest Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getRepositoryName <em>Repository Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getFeaturesFileUrl <em>Features File Url</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getFeatureVersion <em>Feature Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getApplicationGroup <em>Application Group</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getBundleName <em>Bundle Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTask#getPropertyId <em>Property Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask()
 * @model
 * @generated
 */
public interface ExecutionTask extends ExecutionTriggerable {

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Execution Server</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Server</em>' reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Server</em>' reference.
     * @see #setExecutionServer(ExecutionServer)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_ExecutionServer()
     * @model
     * @generated
     */
    ExecutionServer getExecutionServer();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getExecutionServer <em>Execution Server</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Server</em>' reference.
     * @see #getExecutionServer()
     * @generated
     */
    void setExecutionServer(ExecutionServer value);

    /**
     * Returns the value of the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project</em>' reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project</em>' reference.
     * @see #setProject(Project)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_Project()
     * @model
     * @generated
     */
    Project getProject();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getProject <em>Project</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Project</em>' reference.
     * @see #getProject()
     * @generated
     */
    void setProject(Project value);

    /**
     * Returns the value of the '<em><b>Branch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Branch</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Branch</em>' attribute.
     * @see #setBranch(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_Branch()
     * @model
     * @generated
     */
    String getBranch();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getBranch <em>Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Branch</em>' attribute.
     * @see #getBranch()
     * @generated
     */
    void setBranch(String value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' attribute.
     * @see #setContext(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_Context()
     * @model
     * @generated
     */
    String getContext();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getContext <em>Context</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' attribute.
     * @see #getContext()
     * @generated
     */
    void setContext(String value);

    /**
     * Returns the value of the '<em><b>Job Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Job Version</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Job Version</em>' attribute.
     * @see #setJobVersion(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_JobVersion()
     * @model
     * @generated
     */
    String getJobVersion();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getJobVersion <em>Job Version</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Job Version</em>' attribute.
     * @see #getJobVersion()
     * @generated
     */
    void setJobVersion(String value);

    /**
     * Returns the value of the '<em><b>Regenerate Job On Change</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regenerate Job On Change</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regenerate Job On Change</em>' attribute.
     * @see #setRegenerateJobOnChange(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_RegenerateJobOnChange()
     * @model
     * @generated
     */
    boolean isRegenerateJobOnChange();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#isRegenerateJobOnChange <em>Regenerate Job On Change</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regenerate Job On Change</em>' attribute.
     * @see #isRegenerateJobOnChange()
     * @generated
     */
    void setRegenerateJobOnChange(boolean value);

    /**
     * Returns the value of the '<em><b>Active</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Active</em>' attribute.
     * @see #setActive(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_Active()
     * @model default="true"
     * @generated
     */
    boolean isActive();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#isActive <em>Active</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Active</em>' attribute.
     * @see #isActive()
     * @generated
     */
    void setActive(boolean value);

    /**
     * Returns the value of the '<em><b>Last Script Generation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Script Generation Date</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Script Generation Date</em>' attribute.
     * @see #setLastScriptGenerationDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_LastScriptGenerationDate()
     * @model
     * @generated
     */
    Date getLastScriptGenerationDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getLastScriptGenerationDate <em>Last Script Generation Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Script Generation Date</em>' attribute.
     * @see #getLastScriptGenerationDate()
     * @generated
     */
    void setLastScriptGenerationDate(Date value);

    /**
     * Returns the value of the '<em><b>Generated Svn Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generated Svn Revision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generated Svn Revision</em>' attribute.
     * @see #setGeneratedSvnRevision(Long)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_GeneratedSvnRevision()
     * @model
     * @generated
     */
    Long getGeneratedSvnRevision();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getGeneratedSvnRevision <em>Generated Svn Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generated Svn Revision</em>' attribute.
     * @see #getGeneratedSvnRevision()
     * @generated
     */
    void setGeneratedSvnRevision(Long value);

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
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_IdRemoteJob()
     * @model
     * @generated
     */
    String getIdRemoteJob();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getIdRemoteJob <em>Id Remote Job</em>}' attribute.
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
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_IdRemoteJobExecution()
     * @model
     * @generated
     */
    String getIdRemoteJobExecution();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getIdRemoteJobExecution <em>Id Remote Job Execution</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Remote Job Execution</em>' attribute.
     * @see #getIdRemoteJobExecution()
     * @generated
     */
    void setIdRemoteJobExecution(String value);

    /**
     * Returns the value of the '<em><b>Checksum Archive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Checksum Archive</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Checksum Archive</em>' attribute.
     * @see #setChecksumArchive(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_ChecksumArchive()
     * @model
     * @generated
     */
    String getChecksumArchive();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getChecksumArchive <em>Checksum Archive</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Checksum Archive</em>' attribute.
     * @see #getChecksumArchive()
     * @generated
     */
    void setChecksumArchive(String value);

    /**
     * Returns the value of the '<em><b>Job Script Archive Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Job Script Archive Filename</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Job Script Archive Filename</em>' attribute.
     * @see #setJobScriptArchiveFilename(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_JobScriptArchiveFilename()
     * @model
     * @generated
     */
    String getJobScriptArchiveFilename();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getJobScriptArchiveFilename <em>Job Script Archive Filename</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Job Script Archive Filename</em>' attribute.
     * @see #getJobScriptArchiveFilename()
     * @generated
     */
    void setJobScriptArchiveFilename(String value);

    /**
     * Returns the value of the '<em><b>Last Run Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Run Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Run Date</em>' attribute.
     * @see #setLastRunDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_LastRunDate()
     * @model
     * @generated
     */
    Date getLastRunDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getLastRunDate <em>Last Run Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Run Date</em>' attribute.
     * @see #getLastRunDate()
     * @generated
     */
    void setLastRunDate(Date value);

    /**
     * Returns the value of the '<em><b>Last Deployment Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Deployment Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Deployment Date</em>' attribute.
     * @see #setLastDeploymentDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_LastDeploymentDate()
     * @model
     * @generated
     */
    Date getLastDeploymentDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getLastDeploymentDate <em>Last Deployment Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Deployment Date</em>' attribute.
     * @see #getLastDeploymentDate()
     * @generated
     */
    void setLastDeploymentDate(Date value);

    /**
     * Returns the value of the '<em><b>Last Ended Run Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Ended Run Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Ended Run Date</em>' attribute.
     * @see #setLastEndedRunDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_LastEndedRunDate()
     * @model
     * @generated
     */
    Date getLastEndedRunDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getLastEndedRunDate <em>Last Ended Run Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Ended Run Date</em>' attribute.
     * @see #getLastEndedRunDate()
     * @generated
     */
    void setLastEndedRunDate(Date value);

    /**
     * Returns the value of the '<em><b>Cmd Prms</b></em>' containment reference list. The list contents are of type
     * {@link org.talend.core.model.properties.ExecutionTaskCmdPrm}. It is bidirectional and its opposite is '
     * {@link org.talend.core.model.properties.ExecutionTaskCmdPrm#getExecutionTask <em>Execution Task</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cmd Prms</em>' containment reference list isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Cmd Prms</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_CmdPrms()
     * @see org.talend.core.model.properties.ExecutionTaskCmdPrm#getExecutionTask
     * @model type="org.talend.core.model.properties.ExecutionTaskCmdPrm" opposite="executionTask" containment="true"
     * ordered="false"
     * @generated
     */
    EList getCmdPrms();

    /**
     * Returns the value of the '<em><b>Esb Properties Prms</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ExecutionTaskProperties}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.ExecutionTaskProperties#getExecutionTask <em>Execution Task</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Esb Properties Prms</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Esb Properties Prms</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_EsbPropertiesPrms()
     * @see org.talend.core.model.properties.ExecutionTaskProperties#getExecutionTask
     * @model type="org.talend.core.model.properties.ExecutionTaskProperties" opposite="executionTask" containment="true" ordered="false"
     * @generated
     */
    EList getEsbPropertiesPrms();

    /**
     * Returns the value of the '<em><b>Job Prms</b></em>' containment reference list. The list contents are of type
     * {@link org.talend.core.model.properties.ExecutionTaskJobPrm}. It is bidirectional and its opposite is '
     * {@link org.talend.core.model.properties.ExecutionTaskJobPrm#getExecutionTask <em>Execution Task</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Job Prms</em>' containment reference list isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Job Prms</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_JobPrms()
     * @see org.talend.core.model.properties.ExecutionTaskJobPrm#getExecutionTask
     * @model type="org.talend.core.model.properties.ExecutionTaskJobPrm" opposite="executionTask" containment="true"
     * ordered="false"
     * @generated
     */
    EList getJobPrms();

    /**
     * Returns the value of the '<em><b>Job Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Job Name</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Job Id</em>' attribute.
     * @see #setJobId(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_JobId()
     * @model
     * @generated
     */
    String getJobId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getJobId <em>Job Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Job Id</em>' attribute.
     * @see #getJobId()
     * @generated
     */
    void setJobId(String value);

    /**
     * Returns the value of the '<em><b>Virtual Server</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Virtual Server</em>' reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Virtual Server</em>' reference.
     * @see #setVirtualServer(ExecutionVirtualServer)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_VirtualServer()
     * @model
     * @generated
     */
    ExecutionVirtualServer getVirtualServer();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getVirtualServer <em>Virtual Server</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Virtual Server</em>' reference.
     * @see #getVirtualServer()
     * @generated
     */
    void setVirtualServer(ExecutionVirtualServer value);

    /**
     * Returns the value of the '<em><b>Max Concurrent Executions</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Concurrent Executions</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Concurrent Executions</em>' attribute.
     * @see #setMaxConcurrentExecutions(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_MaxConcurrentExecutions()
     * @model
     * @generated
     */
    int getMaxConcurrentExecutions();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getMaxConcurrentExecutions <em>Max Concurrent Executions</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Concurrent Executions</em>' attribute.
     * @see #getMaxConcurrentExecutions()
     * @generated
     */
    void setMaxConcurrentExecutions(int value);

    /**
     * Returns the value of the '<em><b>Generated Project Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generated Project Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generated Project Name</em>' attribute.
     * @see #setGeneratedProjectName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_GeneratedProjectName()
     * @model
     * @generated
     */
    String getGeneratedProjectName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getGeneratedProjectName <em>Generated Project Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Generated Project Name</em>' attribute.
     * @see #getGeneratedProjectName()
     * @generated
     */
    void setGeneratedProjectName(String value);

    /**
     * Returns the value of the '<em><b>Generated Job Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generated Job Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generated Job Name</em>' attribute.
     * @see #setGeneratedJobName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_GeneratedJobName()
     * @model
     * @generated
     */
    String getGeneratedJobName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getGeneratedJobName <em>Generated Job Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Generated Job Name</em>' attribute.
     * @see #getGeneratedJobName()
     * @generated
     */
    void setGeneratedJobName(String value);

    /**
     * Returns the value of the '<em><b>Generated Job Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generated Job Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generated Job Version</em>' attribute.
     * @see #setGeneratedJobVersion(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_GeneratedJobVersion()
     * @model
     * @generated
     */
    String getGeneratedJobVersion();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getGeneratedJobVersion <em>Generated Job Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generated Job Version</em>' attribute.
     * @see #getGeneratedJobVersion()
     * @generated
     */
    void setGeneratedJobVersion(String value);

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
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_ApplyContextToChildren()
     * @model
     * @generated
     */
    boolean isApplyContextToChildren();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#isApplyContextToChildren <em>Apply Context To Children</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Apply Context To Children</em>' attribute.
     * @see #isApplyContextToChildren()
     * @generated
     */
    void setApplyContextToChildren(boolean value);

    /**
     * Returns the value of the '<em><b>Error Stack Trace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error Stack Trace</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error Stack Trace</em>' attribute.
     * @see #setErrorStackTrace(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_ErrorStackTrace()
     * @model
     * @generated
     */
    String getErrorStackTrace();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getErrorStackTrace <em>Error Stack Trace</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Stack Trace</em>' attribute.
     * @see #getErrorStackTrace()
     * @generated
     */
    void setErrorStackTrace(String value);

    /**
     * Returns the value of the '<em><b>Last Triggering Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Triggering Date</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Triggering Date</em>' attribute.
     * @see #setLastTriggeringDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_LastTriggeringDate()
     * @model
     * @generated
     */
    Date getLastTriggeringDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getLastTriggeringDate <em>Last Triggering Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Triggering Date</em>' attribute.
     * @see #getLastTriggeringDate()
     * @generated
     */
    void setLastTriggeringDate(Date value);

    /**
     * Returns the value of the '<em><b>Exec Statistics Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exec Statistics Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exec Statistics Enabled</em>' attribute.
     * @see #setExecStatisticsEnabled(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_ExecStatisticsEnabled()
     * @model
     * @generated
     */
    boolean isExecStatisticsEnabled();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#isExecStatisticsEnabled <em>Exec Statistics Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exec Statistics Enabled</em>' attribute.
     * @see #isExecStatisticsEnabled()
     * @generated
     */
    void setExecStatisticsEnabled(boolean value);

    /**
     * Returns the value of the '<em><b>Add Statistics Code Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Add Statistics Code Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Add Statistics Code Enabled</em>' attribute.
     * @see #setAddStatisticsCodeEnabled(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_AddStatisticsCodeEnabled()
     * @model
     * @generated
     */
    boolean isAddStatisticsCodeEnabled();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#isAddStatisticsCodeEnabled <em>Add Statistics Code Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Add Statistics Code Enabled</em>' attribute.
     * @see #isAddStatisticsCodeEnabled()
     * @generated
     */
    void setAddStatisticsCodeEnabled(boolean value);

    /**
     * Returns the value of the '<em><b>Owner Scheduler Instance Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner Scheduler Instance Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner Scheduler Instance Id</em>' attribute.
     * @see #setOwnerSchedulerInstanceId(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_OwnerSchedulerInstanceId()
     * @model
     * @generated
     */
    String getOwnerSchedulerInstanceId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getOwnerSchedulerInstanceId <em>Owner Scheduler Instance Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner Scheduler Instance Id</em>' attribute.
     * @see #getOwnerSchedulerInstanceId()
     * @generated
     */
    void setOwnerSchedulerInstanceId(String value);

    /**
     * Returns the value of the '<em><b>On Unknown State Job</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>On Unknown State Job</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>On Unknown State Job</em>' attribute.
     * @see #setOnUnknownStateJob(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_OnUnknownStateJob()
     * @model
     * @generated
     */
    String getOnUnknownStateJob();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getOnUnknownStateJob <em>On Unknown State Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>On Unknown State Job</em>' attribute.
     * @see #getOnUnknownStateJob()
     * @generated
     */
    void setOnUnknownStateJob(String value);

    /**
     * Returns the value of the '<em><b>Use Latest Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Latest Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Latest Version</em>' attribute.
     * @see #setUseLatestVersion(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_UseLatestVersion()
     * @model
     * @generated
     */
    boolean isUseLatestVersion();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#isUseLatestVersion <em>Use Latest Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Latest Version</em>' attribute.
     * @see #isUseLatestVersion()
     * @generated
     */
    void setUseLatestVersion(boolean value);

    /**
     * Returns the value of the '<em><b>Application Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Application Type</em>' attribute.
     * @see #setApplicationType(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_ApplicationType()
     * @model
     * @generated
     */
    String getApplicationType();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getApplicationType <em>Application Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Application Type</em>' attribute.
     * @see #getApplicationType()
     * @generated
     */
    void setApplicationType(String value);

    /**
     * Returns the value of the '<em><b>Repository Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Repository Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Repository Name</em>' attribute.
     * @see #setRepositoryName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_RepositoryName()
     * @model
     * @generated
     */
    String getRepositoryName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getRepositoryName <em>Repository Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Repository Name</em>' attribute.
     * @see #getRepositoryName()
     * @generated
     */
    void setRepositoryName(String value);

    /**
     * Returns the value of the '<em><b>Features File Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Feature URL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Features File Url</em>' attribute.
     * @see #setFeaturesFileUrl(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_FeaturesFileUrl()
     * @model
     * @generated
     */
    String getFeaturesFileUrl();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getFeaturesFileUrl <em>Features File Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Features File Url</em>' attribute.
     * @see #getFeaturesFileUrl()
     * @generated
     */
    void setFeaturesFileUrl(String value);

    /**
     * Returns the value of the '<em><b>Application Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Group</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Application Group</em>' attribute.
     * @see #setApplicationGroup(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_ApplicationGroup()
     * @model
     * @generated
     */
    String getApplicationGroup();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getApplicationGroup <em>Application Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Application Group</em>' attribute.
     * @see #getApplicationGroup()
     * @generated
     */
    void setApplicationGroup(String value);

    /**
     * Returns the value of the '<em><b>Bundle Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Bundle Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bundle Name</em>' attribute.
     * @see #setBundleName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_BundleName()
     * @model
     * @generated
     */
    String getBundleName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getBundleName <em>Bundle Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bundle Name</em>' attribute.
     * @see #getBundleName()
     * @generated
     */
    void setBundleName(String value);

    /**
     * Returns the value of the '<em><b>Property Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Id</em>' attribute.
     * @see #setPropertyId(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_PropertyId()
     * @model
     * @generated
     */
    String getPropertyId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getPropertyId <em>Property Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Id</em>' attribute.
     * @see #getPropertyId()
     * @generated
     */
    void setPropertyId(String value);

    /**
     * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature Name</em>' attribute.
     * @see #setFeatureName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_FeatureName()
     * @model
     * @generated
     */
    String getFeatureName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getFeatureName <em>Feature Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feature Name</em>' attribute.
     * @see #getFeatureName()
     * @generated
     */
    void setFeatureName(String value);

    /**
     * Returns the value of the '<em><b>Feature Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature Version</em>' attribute.
     * @see #setFeatureVersion(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTask_FeatureVersion()
     * @model
     * @generated
     */
    String getFeatureVersion();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTask#getFeatureVersion <em>Feature Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feature Version</em>' attribute.
     * @see #getFeatureVersion()
     * @generated
     */
    void setFeatureVersion(String value);

} // ExecutionTask
