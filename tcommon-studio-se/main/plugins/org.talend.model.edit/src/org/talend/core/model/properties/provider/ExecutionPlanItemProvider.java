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

import org.talend.core.model.properties.ExecutionPlan;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.ExecutionPlan} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionPlanItemProvider
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
    public ExecutionPlanItemProvider(AdapterFactory adapterFactory) {
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
                 getString("_UI_ExecutionPlan_label_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionPlan_label_feature", "_UI_ExecutionPlan_type"),
                 PropertiesPackage.Literals.EXECUTION_PLAN__LABEL,
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
                 getString("_UI_ExecutionPlan_description_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionPlan_description_feature", "_UI_ExecutionPlan_type"),
                 PropertiesPackage.Literals.EXECUTION_PLAN__DESCRIPTION,
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
            childrenFeatures.add(PropertiesPackage.Literals.EXECUTION_TRIGGERABLE__TRIGGERS);
            childrenFeatures.add(PropertiesPackage.Literals.EXECUTION_PLAN__EXEC_PLAN_PARTS);
            childrenFeatures.add(PropertiesPackage.Literals.EXECUTION_PLAN__EXEC_PLAN_PRMS);
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
     * This returns ExecutionPlan.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ExecutionPlan"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        ExecutionPlan executionPlan = (ExecutionPlan)object;
        return getString("_UI_ExecutionPlan_type") + " " + executionPlan.getId();
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

        switch (notification.getFeatureID(ExecutionPlan.class)) {
            case PropertiesPackage.EXECUTION_PLAN__ID:
            case PropertiesPackage.EXECUTION_PLAN__ID_QUARTZ_JOB:
            case PropertiesPackage.EXECUTION_PLAN__STATUS:
            case PropertiesPackage.EXECUTION_PLAN__ERROR_STATUS:
            case PropertiesPackage.EXECUTION_PLAN__CONCURRENT_EXECUTION:
            case PropertiesPackage.EXECUTION_PLAN__PROCESSING_STATE:
            case PropertiesPackage.EXECUTION_PLAN__LABEL:
            case PropertiesPackage.EXECUTION_PLAN__DESCRIPTION:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case PropertiesPackage.EXECUTION_PLAN__TRIGGERS:
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PARTS:
            case PropertiesPackage.EXECUTION_PLAN__EXEC_PLAN_PRMS:
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
                (PropertiesPackage.Literals.EXECUTION_PLAN__EXEC_PLAN_PARTS,
                 PropertiesFactory.eINSTANCE.createExecutionPlanPart()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.EXECUTION_PLAN__EXEC_PLAN_PRMS,
                 PropertiesFactory.eINSTANCE.createExecutionPlanPrm()));
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
