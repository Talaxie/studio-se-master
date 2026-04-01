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

import org.talend.core.model.properties.ExecutionPlanPartJobPrm;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.ExecutionPlanPartJobPrm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionPlanPartJobPrmItemProvider
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
    public ExecutionPlanPartJobPrmItemProvider(AdapterFactory adapterFactory) {
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
            addExecutionPlanPartPropertyDescriptor(object);
            addOverridePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addCustomValuePropertyDescriptor(object);
            addPartCustomValuePropertyDescriptor(object);
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
                 getString("_UI_ExecutionPlanPartJobPrm_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionPlanPartJobPrm_id_feature", "_UI_ExecutionPlanPartJobPrm_type"),
                 PropertiesPackage.Literals.EXECUTION_PLAN_PART_JOB_PRM__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Execution Plan Part feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionPlanPartPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionPlanPartJobPrm_executionPlanPart_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionPlanPartJobPrm_executionPlanPart_feature", "_UI_ExecutionPlanPartJobPrm_type"),
                 PropertiesPackage.Literals.EXECUTION_PLAN_PART_JOB_PRM__EXECUTION_PLAN_PART,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Override feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOverridePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionPlanPartJobPrm_override_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionPlanPartJobPrm_override_feature", "_UI_ExecutionPlanPartJobPrm_type"),
                 PropertiesPackage.Literals.EXECUTION_PLAN_PART_JOB_PRM__OVERRIDE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionPlanPartJobPrm_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionPlanPartJobPrm_name_feature", "_UI_ExecutionPlanPartJobPrm_type"),
                 PropertiesPackage.Literals.EXECUTION_PLAN_PART_JOB_PRM__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Custom Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionPlanPartJobPrm_customValue_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionPlanPartJobPrm_customValue_feature", "_UI_ExecutionPlanPartJobPrm_type"),
                 PropertiesPackage.Literals.EXECUTION_PLAN_PART_JOB_PRM__CUSTOM_VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Part Custom Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPartCustomValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionPlanPartJobPrm_partCustomValue_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionPlanPartJobPrm_partCustomValue_feature", "_UI_ExecutionPlanPartJobPrm_type"),
                 PropertiesPackage.Literals.EXECUTION_PLAN_PART_JOB_PRM__PART_CUSTOM_VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ExecutionPlanPartJobPrm.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ExecutionPlanPartJobPrm"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        String label = ((ExecutionPlanPartJobPrm)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_ExecutionPlanPartJobPrm_type") :
            getString("_UI_ExecutionPlanPartJobPrm_type") + " " + label;
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

        switch (notification.getFeatureID(ExecutionPlanPartJobPrm.class)) {
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__ID:
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__OVERRIDE:
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__NAME:
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__CUSTOM_VALUE:
            case PropertiesPackage.EXECUTION_PLAN_PART_JOB_PRM__PART_CUSTOM_VALUE:
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
