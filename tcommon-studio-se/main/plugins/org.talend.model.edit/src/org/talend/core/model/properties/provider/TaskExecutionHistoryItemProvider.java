/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.TaskExecutionHistory;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.TaskExecutionHistory} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskExecutionHistoryItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TaskExecutionHistoryItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addIdPropertyDescriptor(object);
            addBasicStatusPropertyDescriptor(object);
            addDetailedStatusPropertyDescriptor(object);
            addTaskLabelPropertyDescriptor(object);
            addTaskDescriptionPropertyDescriptor(object);
            addProjectNamePropertyDescriptor(object);
            addTalendJobNamePropertyDescriptor(object);
            addTalendJobIdPropertyDescriptor(object);
            addTalendJobVersionPropertyDescriptor(object);
            addContextNamePropertyDescriptor(object);
            addVirtualServerNamePropertyDescriptor(object);
            addExecutionServerNamePropertyDescriptor(object);
            addExecutionServerHostPropertyDescriptor(object);
            addExecutionServerCmdPortPropertyDescriptor(object);
            addExecutionServerFilePortPropertyDescriptor(object);
            addExecutionServerMonitoringPortPropertyDescriptor(object);
            addApplyContextToChildrenPropertyDescriptor(object);
            addTriggeredByPropertyDescriptor(object);
            addTriggerTypePropertyDescriptor(object);
            addTriggerNamePropertyDescriptor(object);
            addTriggerDescriptionPropertyDescriptor(object);
            addTaskErrorStackTracePropertyDescriptor(object);
            addIdQuartzJobPropertyDescriptor(object);
            addIdQuartzTriggerPropertyDescriptor(object);
            addLastJobGenerationDatePropertyDescriptor(object);
            addJobArchiveFilenamePropertyDescriptor(object);
            addFileTriggerFileMaskPropertyDescriptor(object);
            addFileTriggerFileNamePropertyDescriptor(object);
            addFileTriggerFolderPathPropertyDescriptor(object);
            addFileTriggerTriggeredFilePathPropertyDescriptor(object);
            addExpectedTriggeringDatePropertyDescriptor(object);
            addTaskStartDatePropertyDescriptor(object);
            addTaskEndDatePropertyDescriptor(object);
            addAdminJobStartDatePropertyDescriptor(object);
            addAdminJobEndDatePropertyDescriptor(object);
            addServerJobStartDatePropertyDescriptor(object);
            addServerJobEndDatePropertyDescriptor(object);
            addIdRemoteJobPropertyDescriptor(object);
            addIdRemoteJobExecutionPropertyDescriptor(object);
            addRequestIdPropertyDescriptor(object);
            addResumingModePropertyDescriptor(object);
            addContextValuesPropertyDescriptor(object);
            addJvmValuesPropertyDescriptor(object);
            addParentTaskExecIdPropertyDescriptor(object);
            addParentPlanExecIdPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_id_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Basic Status feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBasicStatusPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_basicStatus_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_basicStatus_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__BASIC_STATUS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Detailed Status feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDetailedStatusPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_detailedStatus_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_detailedStatus_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__DETAILED_STATUS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Task Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaskLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_taskLabel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_taskLabel_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TASK_LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Task Description feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaskDescriptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_taskDescription_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_taskDescription_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TASK_DESCRIPTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Project Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProjectNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_projectName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_projectName_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__PROJECT_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Talaxie Job Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTalendJobNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_talendJobName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_talendJobName_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TALEND_JOB_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Talaxie Job Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTalendJobIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_talendJobId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_talendJobId_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TALEND_JOB_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Talaxie Job Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTalendJobVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_talendJobVersion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_talendJobVersion_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TALEND_JOB_VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Context Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_contextName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_contextName_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__CONTEXT_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Virtual Server Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVirtualServerNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_virtualServerName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_virtualServerName_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__VIRTUAL_SERVER_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Execution Server Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionServerNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_executionServerName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_executionServerName_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Execution Server Host feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionServerHostPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_executionServerHost_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_executionServerHost_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_HOST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Execution Server Cmd Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionServerCmdPortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_executionServerCmdPort_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_executionServerCmdPort_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_CMD_PORT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Execution Server File Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionServerFilePortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_executionServerFilePort_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_executionServerFilePort_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_FILE_PORT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Execution Server Monitoring Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionServerMonitoringPortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_executionServerMonitoringPort_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_executionServerMonitoringPort_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_MONITORING_PORT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Apply Context To Children feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addApplyContextToChildrenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_applyContextToChildren_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_applyContextToChildren_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__APPLY_CONTEXT_TO_CHILDREN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Triggered By feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTriggeredByPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_triggeredBy_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_triggeredBy_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TRIGGERED_BY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Trigger Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTriggerTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_triggerType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_triggerType_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TRIGGER_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Trigger Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTriggerNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_triggerName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_triggerName_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TRIGGER_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Trigger Description feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTriggerDescriptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_triggerDescription_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_triggerDescription_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TRIGGER_DESCRIPTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Task Error Stack Trace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaskErrorStackTracePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_taskErrorStackTrace_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_taskErrorStackTrace_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TASK_ERROR_STACK_TRACE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Id Quartz Job feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdQuartzJobPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_idQuartzJob_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_idQuartzJob_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__ID_QUARTZ_JOB,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Id Quartz Trigger feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdQuartzTriggerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_idQuartzTrigger_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_idQuartzTrigger_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__ID_QUARTZ_TRIGGER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Job Generation Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastJobGenerationDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_lastJobGenerationDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_lastJobGenerationDate_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__LAST_JOB_GENERATION_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Job Archive Filename feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJobArchiveFilenamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_jobArchiveFilename_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_jobArchiveFilename_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__JOB_ARCHIVE_FILENAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the File Trigger File Mask feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileTriggerFileMaskPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_fileTriggerFileMask_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_fileTriggerFileMask_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_MASK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the File Trigger File Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileTriggerFileNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_fileTriggerFileName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_fileTriggerFileName_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the File Trigger Folder Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileTriggerFolderPathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_fileTriggerFolderPath_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_fileTriggerFolderPath_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FOLDER_PATH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the File Trigger Triggered File Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileTriggerTriggeredFilePathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_fileTriggerTriggeredFilePath_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_fileTriggerTriggeredFilePath_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__FILE_TRIGGER_TRIGGERED_FILE_PATH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Expected Triggering Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExpectedTriggeringDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_expectedTriggeringDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_expectedTriggeringDate_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__EXPECTED_TRIGGERING_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Task Start Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaskStartDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_taskStartDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_taskStartDate_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TASK_START_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Task End Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaskEndDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_taskEndDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_taskEndDate_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__TASK_END_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Admin Job Start Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAdminJobStartDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_adminJobStartDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_adminJobStartDate_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__ADMIN_JOB_START_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Admin Job End Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAdminJobEndDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_adminJobEndDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_adminJobEndDate_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__ADMIN_JOB_END_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Server Job Start Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServerJobStartDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_serverJobStartDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_serverJobStartDate_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__SERVER_JOB_START_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Server Job End Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServerJobEndDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_serverJobEndDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_serverJobEndDate_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__SERVER_JOB_END_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Id Remote Job feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdRemoteJobPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_idRemoteJob_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_idRemoteJob_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Id Remote Job Execution feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdRemoteJobExecutionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_idRemoteJobExecution_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_idRemoteJobExecution_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB_EXECUTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Request Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRequestIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_requestId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_requestId_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__REQUEST_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Resuming Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addResumingModePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_resumingMode_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_resumingMode_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__RESUMING_MODE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Context Values feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextValuesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_contextValues_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_contextValues_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__CONTEXT_VALUES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Jvm Values feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJvmValuesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_jvmValues_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_jvmValues_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__JVM_VALUES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Parent Task Exec Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParentTaskExecIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_parentTaskExecId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_parentTaskExecId_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__PARENT_TASK_EXEC_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Parent Plan Exec Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParentPlanExecIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TaskExecutionHistory_parentPlanExecId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TaskExecutionHistory_parentPlanExecId_feature", "_UI_TaskExecutionHistory_type"),
                 PropertiesPackage.Literals.TASK_EXECUTION_HISTORY__PARENT_PLAN_EXEC_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns TaskExecutionHistory.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskExecutionHistory"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        TaskExecutionHistory taskExecutionHistory = (TaskExecutionHistory)object;
        return getString("_UI_TaskExecutionHistory_type") + " " + taskExecutionHistory.getId();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(TaskExecutionHistory.class)) {
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__BASIC_STATUS:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__DETAILED_STATUS:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_LABEL:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_DESCRIPTION:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PROJECT_NAME:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_NAME:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_ID:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TALEND_JOB_VERSION:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_NAME:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__VIRTUAL_SERVER_NAME:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_NAME:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_HOST:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_CMD_PORT:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_FILE_PORT:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXECUTION_SERVER_MONITORING_PORT:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__APPLY_CONTEXT_TO_CHILDREN:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGERED_BY:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_TYPE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_NAME:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TRIGGER_DESCRIPTION:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_ERROR_STACK_TRACE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_JOB:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_QUARTZ_TRIGGER:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__LAST_JOB_GENERATION_DATE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__JOB_ARCHIVE_FILENAME:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_MASK:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FILE_NAME:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_FOLDER_PATH:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__FILE_TRIGGER_TRIGGERED_FILE_PATH:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__EXPECTED_TRIGGERING_DATE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_START_DATE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__TASK_END_DATE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ADMIN_JOB_START_DATE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ADMIN_JOB_END_DATE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_START_DATE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__SERVER_JOB_END_DATE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__ID_REMOTE_JOB_EXECUTION:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__REQUEST_ID:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__RESUMING_MODE:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__CONTEXT_VALUES:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__JVM_VALUES:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_TASK_EXEC_ID:
            case PropertiesPackage.TASK_EXECUTION_HISTORY__PARENT_PLAN_EXEC_ID:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator() {
        return PropertiesEditPlugin.INSTANCE;
    }

}
