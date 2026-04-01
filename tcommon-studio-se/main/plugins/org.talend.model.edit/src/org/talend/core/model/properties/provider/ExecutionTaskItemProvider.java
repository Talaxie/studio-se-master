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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.talend.core.model.properties.ExecutionTask;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.ExecutionTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionTaskItemProvider
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
    public ExecutionTaskItemProvider(AdapterFactory adapterFactory) {
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
            addIdQuartzJobPropertyDescriptor(object);
            addStatusPropertyDescriptor(object);
            addErrorStatusPropertyDescriptor(object);
            addConcurrentExecutionPropertyDescriptor(object);
            addProcessingStatePropertyDescriptor(object);
            addLabelPropertyDescriptor(object);
            addDescriptionPropertyDescriptor(object);
            addExecutionServerPropertyDescriptor(object);
            addProjectPropertyDescriptor(object);
            addBranchPropertyDescriptor(object);
            addContextPropertyDescriptor(object);
            addJobVersionPropertyDescriptor(object);
            addRegenerateJobOnChangePropertyDescriptor(object);
            addActivePropertyDescriptor(object);
            addLastScriptGenerationDatePropertyDescriptor(object);
            addGeneratedSvnRevisionPropertyDescriptor(object);
            addIdRemoteJobPropertyDescriptor(object);
            addIdRemoteJobExecutionPropertyDescriptor(object);
            addChecksumArchivePropertyDescriptor(object);
            addJobScriptArchiveFilenamePropertyDescriptor(object);
            addLastRunDatePropertyDescriptor(object);
            addLastDeploymentDatePropertyDescriptor(object);
            addLastEndedRunDatePropertyDescriptor(object);
            addJobIdPropertyDescriptor(object);
            addVirtualServerPropertyDescriptor(object);
            addMaxConcurrentExecutionsPropertyDescriptor(object);
            addGeneratedProjectNamePropertyDescriptor(object);
            addGeneratedJobNamePropertyDescriptor(object);
            addGeneratedJobVersionPropertyDescriptor(object);
            addApplyContextToChildrenPropertyDescriptor(object);
            addErrorStackTracePropertyDescriptor(object);
            addLastTriggeringDatePropertyDescriptor(object);
            addExecStatisticsEnabledPropertyDescriptor(object);
            addAddStatisticsCodeEnabledPropertyDescriptor(object);
            addOwnerSchedulerInstanceIdPropertyDescriptor(object);
            addOnUnknownStateJobPropertyDescriptor(object);
            addUseLatestVersionPropertyDescriptor(object);
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
                 getString("_UI_ExecutionTriggerable_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTriggerable_id_feature", "_UI_ExecutionTriggerable_type"),
                 PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_label_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_label_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Description feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDescriptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_description_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_description_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__DESCRIPTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Execution Server feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionServerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_executionServer_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_executionServer_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__EXECUTION_SERVER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Project feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProjectPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_project_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_project_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__PROJECT,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Branch feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBranchPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_branch_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_branch_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__BRANCH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Context feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_context_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_context_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__CONTEXT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Job Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJobVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_jobVersion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_jobVersion_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__JOB_VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Regenerate Job On Change feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegenerateJobOnChangePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_regenerateJobOnChange_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_regenerateJobOnChange_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__REGENERATE_JOB_ON_CHANGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Active feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActivePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_active_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_active_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__ACTIVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                 getString("_UI_ExecutionTriggerable_idQuartzJob_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTriggerable_idQuartzJob_feature", "_UI_ExecutionTriggerable_type"),
                 PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__ID_QUARTZ_JOB,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Script Generation Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastScriptGenerationDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_lastScriptGenerationDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_lastScriptGenerationDate_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Generated Svn Revision feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGeneratedSvnRevisionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_generatedSvnRevision_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_generatedSvnRevision_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__GENERATED_SVN_REVISION,
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
                 getString("_UI_ExecutionTask_idRemoteJob_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_idRemoteJob_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__ID_REMOTE_JOB,
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
                 getString("_UI_ExecutionTask_idRemoteJobExecution_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_idRemoteJobExecution_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Checksum Archive feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChecksumArchivePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_checksumArchive_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_checksumArchive_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__CHECKSUM_ARCHIVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Job Script Archive Filename feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJobScriptArchiveFilenamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_jobScriptArchiveFilename_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_jobScriptArchiveFilename_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE_FILENAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Status feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatusPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTriggerable_status_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTriggerable_status_feature", "_UI_ExecutionTriggerable_type"),
                 PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__STATUS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Processing State feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcessingStatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTriggerable_processingState_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTriggerable_processingState_feature", "_UI_ExecutionTriggerable_type"),
                 PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__PROCESSING_STATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Error Status feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addErrorStatusPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTriggerable_errorStatus_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTriggerable_errorStatus_feature", "_UI_ExecutionTriggerable_type"),
                 PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__ERROR_STATUS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Run Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastRunDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_lastRunDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_lastRunDate_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__LAST_RUN_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Deployment Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastDeploymentDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_lastDeploymentDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_lastDeploymentDate_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__LAST_DEPLOYMENT_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Ended Run Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastEndedRunDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_lastEndedRunDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_lastEndedRunDate_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__LAST_ENDED_RUN_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Job Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJobIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_jobId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_jobId_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__JOB_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Virtual Server feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVirtualServerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_virtualServer_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_virtualServer_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__VIRTUAL_SERVER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Concurrent Execution feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConcurrentExecutionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTriggerable_concurrentExecution_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTriggerable_concurrentExecution_feature", "_UI_ExecutionTriggerable_type"),
                 PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__CONCURRENT_EXECUTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Concurrent Executions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxConcurrentExecutionsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_maxConcurrentExecutions_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_maxConcurrentExecutions_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__MAX_CONCURRENT_EXECUTIONS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Generated Project Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGeneratedProjectNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_generatedProjectName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_generatedProjectName_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__GENERATED_PROJECT_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Generated Job Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGeneratedJobNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_generatedJobName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_generatedJobName_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__GENERATED_JOB_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Generated Job Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGeneratedJobVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_generatedJobVersion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_generatedJobVersion_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__GENERATED_JOB_VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_ExecutionTask_applyContextToChildren_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_applyContextToChildren_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__APPLY_CONTEXT_TO_CHILDREN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Error Stack Trace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addErrorStackTracePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_errorStackTrace_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_errorStackTrace_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__ERROR_STACK_TRACE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Triggering Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastTriggeringDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_lastTriggeringDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_lastTriggeringDate_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__LAST_TRIGGERING_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Exec Statistics Enabled feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecStatisticsEnabledPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_execStatisticsEnabled_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_execStatisticsEnabled_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__EXEC_STATISTICS_ENABLED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Add Statistics Code Enabled feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAddStatisticsCodeEnabledPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_addStatisticsCodeEnabled_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_addStatisticsCodeEnabled_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__ADD_STATISTICS_CODE_ENABLED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Owner Scheduler Instance Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOwnerSchedulerInstanceIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_ownerSchedulerInstanceId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_ownerSchedulerInstanceId_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__OWNER_SCHEDULER_INSTANCE_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the On Unknown State Job feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOnUnknownStateJobPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_onUnknownStateJob_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_onUnknownStateJob_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__ON_UNKNOWN_STATE_JOB,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use Latest Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseLatestVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionTask_useLatestVersion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionTask_useLatestVersion_feature", "_UI_ExecutionTask_type"),
                 PropertiesPackage.Literals.EXECUTION_TASK__USE_LATEST_VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collection getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__TRIGGERS);
            childrenFeatures.add(PropertiesPackage.Literals.EXECUTION_TASK__CMD_PRMS);
            childrenFeatures.add(PropertiesPackage.Literals.EXECUTION_TASK__JOB_PRMS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ExecutionTask.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ExecutionTask"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        ExecutionTask executionTask = (ExecutionTask)object;
        return getString("_UI_ExecutionTask_type") + " " + executionTask.getId();
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

        switch (notification.getFeatureID(ExecutionTask.class)) {
            case PropertiesPackage.EXECUTION_TASK__ID:
            case PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB:
            case PropertiesPackage.EXECUTION_TASK__STATUS:
            case PropertiesPackage.EXECUTION_TASK__ERROR_STATUS:
            case PropertiesPackage.EXECUTION_TASK__CONCURRENT_EXECUTION:
            case PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE:
            case PropertiesPackage.EXECUTION_TASK__LABEL:
            case PropertiesPackage.EXECUTION_TASK__DESCRIPTION:
            case PropertiesPackage.EXECUTION_TASK__BRANCH:
            case PropertiesPackage.EXECUTION_TASK__CONTEXT:
            case PropertiesPackage.EXECUTION_TASK__JOB_VERSION:
            case PropertiesPackage.EXECUTION_TASK__REGENERATE_JOB_ON_CHANGE:
            case PropertiesPackage.EXECUTION_TASK__ACTIVE:
            case PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE:
            case PropertiesPackage.EXECUTION_TASK__GENERATED_SVN_REVISION:
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB:
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION:
            case PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE:
            case PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE_FILENAME:
            case PropertiesPackage.EXECUTION_TASK__LAST_RUN_DATE:
            case PropertiesPackage.EXECUTION_TASK__LAST_DEPLOYMENT_DATE:
            case PropertiesPackage.EXECUTION_TASK__LAST_ENDED_RUN_DATE:
            case PropertiesPackage.EXECUTION_TASK__JOB_ID:
            case PropertiesPackage.EXECUTION_TASK__MAX_CONCURRENT_EXECUTIONS:
            case PropertiesPackage.EXECUTION_TASK__GENERATED_PROJECT_NAME:
            case PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_NAME:
            case PropertiesPackage.EXECUTION_TASK__GENERATED_JOB_VERSION:
            case PropertiesPackage.EXECUTION_TASK__APPLY_CONTEXT_TO_CHILDREN:
            case PropertiesPackage.EXECUTION_TASK__ERROR_STACK_TRACE:
            case PropertiesPackage.EXECUTION_TASK__LAST_TRIGGERING_DATE:
            case PropertiesPackage.EXECUTION_TASK__EXEC_STATISTICS_ENABLED:
            case PropertiesPackage.EXECUTION_TASK__ADD_STATISTICS_CODE_ENABLED:
            case PropertiesPackage.EXECUTION_TASK__OWNER_SCHEDULER_INSTANCE_ID:
            case PropertiesPackage.EXECUTION_TASK__ON_UNKNOWN_STATE_JOB:
            case PropertiesPackage.EXECUTION_TASK__USE_LATEST_VERSION:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case PropertiesPackage.EXECUTION_TASK__TRIGGERS:
            case PropertiesPackage.EXECUTION_TASK__CMD_PRMS:
            case PropertiesPackage.EXECUTION_TASK__JOB_PRMS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__TRIGGERS,
                 PropertiesFactory.eINSTANCE.createTalendTrigger()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__TRIGGERS,
                 PropertiesFactory.eINSTANCE.createCronTalendTrigger()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__TRIGGERS,
                 PropertiesFactory.eINSTANCE.createCronUITalendTrigger()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__TRIGGERS,
                 PropertiesFactory.eINSTANCE.createSimpleTalendTrigger()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__TRIGGERS,
                 PropertiesFactory.eINSTANCE.createFileTrigger()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.EXECUTION_TASK__CMD_PRMS,
                 PropertiesFactory.eINSTANCE.createExecutionTaskCmdPrm()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.EXECUTION_TASK__JOB_PRMS,
                 PropertiesFactory.eINSTANCE.createExecutionTaskJobPrm()));
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
