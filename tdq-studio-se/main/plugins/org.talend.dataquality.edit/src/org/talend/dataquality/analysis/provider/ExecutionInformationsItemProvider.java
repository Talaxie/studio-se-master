/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.provider;


import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.ExecutionInformations;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.analysis.ExecutionInformations} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionInformationsItemProvider
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
    public ExecutionInformationsItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addExecutionDatePropertyDescriptor(object);
            addExecutionDurationPropertyDescriptor(object);
            addMessagePropertyDescriptor(object);
            addExecutionNumberPropertyDescriptor(object);
            addLastRunOkPropertyDescriptor(object);
            addLastExecutionNumberOkPropertyDescriptor(object);
            addOutThresholdPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Execution Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionInformations_executionDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionInformations_executionDate_feature", "_UI_ExecutionInformations_type"),
                 AnalysisPackage.Literals.EXECUTION_INFORMATIONS__EXECUTION_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Execution Duration feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionDurationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionInformations_executionDuration_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionInformations_executionDuration_feature", "_UI_ExecutionInformations_type"),
                 AnalysisPackage.Literals.EXECUTION_INFORMATIONS__EXECUTION_DURATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Message feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMessagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionInformations_message_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionInformations_message_feature", "_UI_ExecutionInformations_type"),
                 AnalysisPackage.Literals.EXECUTION_INFORMATIONS__MESSAGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Execution Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionNumberPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionInformations_executionNumber_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionInformations_executionNumber_feature", "_UI_ExecutionInformations_type"),
                 AnalysisPackage.Literals.EXECUTION_INFORMATIONS__EXECUTION_NUMBER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Run Ok feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastRunOkPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionInformations_lastRunOk_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionInformations_lastRunOk_feature", "_UI_ExecutionInformations_type"),
                 AnalysisPackage.Literals.EXECUTION_INFORMATIONS__LAST_RUN_OK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Execution Number Ok feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastExecutionNumberOkPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionInformations_lastExecutionNumberOk_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionInformations_lastExecutionNumberOk_feature", "_UI_ExecutionInformations_type"),
                 AnalysisPackage.Literals.EXECUTION_INFORMATIONS__LAST_EXECUTION_NUMBER_OK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Out Threshold feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutThresholdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExecutionInformations_outThreshold_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionInformations_outThreshold_feature", "_UI_ExecutionInformations_type"),
                 AnalysisPackage.Literals.EXECUTION_INFORMATIONS__OUT_THRESHOLD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ExecutionInformations.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ExecutionInformations"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        Date labelValue = ((ExecutionInformations)object).getExecutionDate();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ?
            getString("_UI_ExecutionInformations_type") :
            getString("_UI_ExecutionInformations_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(ExecutionInformations.class)) {
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DATE:
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DURATION:
            case AnalysisPackage.EXECUTION_INFORMATIONS__MESSAGE:
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_NUMBER:
            case AnalysisPackage.EXECUTION_INFORMATIONS__LAST_RUN_OK:
            case AnalysisPackage.EXECUTION_INFORMATIONS__LAST_EXECUTION_NUMBER_OK:
            case AnalysisPackage.EXECUTION_INFORMATIONS__OUT_THRESHOLD:
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
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return DataqualityEditPlugin.INSTANCE;
    }

}
