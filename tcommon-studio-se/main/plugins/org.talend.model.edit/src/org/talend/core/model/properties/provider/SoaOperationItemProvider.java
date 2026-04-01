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

import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.SoaOperation;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.SoaOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoaOperationItemProvider
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
    public SoaOperationItemProvider(AdapterFactory adapterFactory) {
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
            addLabelPropertyDescriptor(object);
            addDescriptionPropertyDescriptor(object);
            addProjectPropertyDescriptor(object);
            addContextPropertyDescriptor(object);
            addJobVersionPropertyDescriptor(object);
            addJobNamePropertyDescriptor(object);
            addActivePropertyDescriptor(object);
            addLastScriptGenerationDatePropertyDescriptor(object);
            addJobIdPropertyDescriptor(object);
            addApplyContextToChildrenPropertyDescriptor(object);
            addJvmParametersPropertyDescriptor(object);
            addXmsPropertyDescriptor(object);
            addXmxPropertyDescriptor(object);
            addMinJobInstancesPropertyDescriptor(object);
            addMaxJobInstancesPropertyDescriptor(object);
            addIdleTTL_forAllInstancesPropertyDescriptor(object);
            addIdleTTL_forAdditionalInstancesPropertyDescriptor(object);
            addQueueMaxSizePropertyDescriptor(object);
            addRequestInQueueTTLPropertyDescriptor(object);
            addServicePropertyDescriptor(object);
            addReturnStylePropertyDescriptor(object);
            addBranchPropertyDescriptor(object);
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
                 getString("_UI_SoaOperation_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_id_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__ID,
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
                 getString("_UI_SoaOperation_label_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_label_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__LABEL,
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
                 getString("_UI_SoaOperation_description_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_description_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__DESCRIPTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_SoaOperation_project_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_project_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__PROJECT,
                 true,
                 false,
                 true,
                 null,
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
                 getString("_UI_SoaOperation_context_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_context_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__CONTEXT,
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
                 getString("_UI_SoaOperation_jobVersion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_jobVersion_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__JOB_VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Job Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJobNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_jobName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_jobName_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__JOB_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_SoaOperation_active_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_active_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__ACTIVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                 getString("_UI_SoaOperation_lastScriptGenerationDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_lastScriptGenerationDate_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__LAST_SCRIPT_GENERATION_DATE,
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
                 getString("_UI_SoaOperation_jobId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_jobId_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__JOB_ID,
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
                 getString("_UI_SoaOperation_applyContextToChildren_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_applyContextToChildren_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__APPLY_CONTEXT_TO_CHILDREN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Jvm Parameters feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJvmParametersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_jvmParameters_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_jvmParameters_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__JVM_PARAMETERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Xms feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXmsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_xms_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_xms_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__XMS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Xmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXmxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_xmx_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_xmx_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__XMX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Min Job Instances feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinJobInstancesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_minJobInstances_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_minJobInstances_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__MIN_JOB_INSTANCES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Job Instances feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxJobInstancesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_maxJobInstances_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_maxJobInstances_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__MAX_JOB_INSTANCES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Idle TTL for All Instances feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdleTTL_forAllInstancesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_idleTTL_forAllInstances_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_idleTTL_forAllInstances_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__IDLE_TTL_FOR_ALL_INSTANCES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Idle TTL for Additional Instances feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdleTTL_forAdditionalInstancesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_idleTTL_forAdditionalInstances_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_idleTTL_forAdditionalInstances_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__IDLE_TTL_FOR_ADDITIONAL_INSTANCES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Queue Max Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQueueMaxSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_queueMaxSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_queueMaxSize_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__QUEUE_MAX_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Request In Queue TTL feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRequestInQueueTTLPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_requestInQueueTTL_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_requestInQueueTTL_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__REQUEST_IN_QUEUE_TTL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Service feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServicePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_service_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_service_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__SERVICE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Return Style feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReturnStylePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SoaOperation_returnStyle_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_returnStyle_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__RETURN_STYLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_SoaOperation_branch_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SoaOperation_branch_feature", "_UI_SoaOperation_type"),
                 PropertiesPackage.Literals.SOA_OPERATION__BRANCH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            childrenFeatures.add(PropertiesPackage.Literals.SOA_OPERATION__INPUT_PARAMETERS);
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
     * This returns SoaOperation.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SoaOperation"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        SoaOperation soaOperation = (SoaOperation)object;
        return getString("_UI_SoaOperation_type") + " " + soaOperation.getId();
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

        switch (notification.getFeatureID(SoaOperation.class)) {
            case PropertiesPackage.SOA_OPERATION__ID:
            case PropertiesPackage.SOA_OPERATION__LABEL:
            case PropertiesPackage.SOA_OPERATION__DESCRIPTION:
            case PropertiesPackage.SOA_OPERATION__CONTEXT:
            case PropertiesPackage.SOA_OPERATION__JOB_VERSION:
            case PropertiesPackage.SOA_OPERATION__JOB_NAME:
            case PropertiesPackage.SOA_OPERATION__ACTIVE:
            case PropertiesPackage.SOA_OPERATION__LAST_SCRIPT_GENERATION_DATE:
            case PropertiesPackage.SOA_OPERATION__JOB_ID:
            case PropertiesPackage.SOA_OPERATION__APPLY_CONTEXT_TO_CHILDREN:
            case PropertiesPackage.SOA_OPERATION__JVM_PARAMETERS:
            case PropertiesPackage.SOA_OPERATION__XMS:
            case PropertiesPackage.SOA_OPERATION__XMX:
            case PropertiesPackage.SOA_OPERATION__MIN_JOB_INSTANCES:
            case PropertiesPackage.SOA_OPERATION__MAX_JOB_INSTANCES:
            case PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ALL_INSTANCES:
            case PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ADDITIONAL_INSTANCES:
            case PropertiesPackage.SOA_OPERATION__QUEUE_MAX_SIZE:
            case PropertiesPackage.SOA_OPERATION__REQUEST_IN_QUEUE_TTL:
            case PropertiesPackage.SOA_OPERATION__RETURN_STYLE:
            case PropertiesPackage.SOA_OPERATION__BRANCH:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case PropertiesPackage.SOA_OPERATION__INPUT_PARAMETERS:
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
                (PropertiesPackage.Literals.SOA_OPERATION__INPUT_PARAMETERS,
                 PropertiesFactory.eINSTANCE.createSoaInputParameter()));
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
