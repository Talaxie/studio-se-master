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
import org.talend.core.model.properties.TalendTrigger;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.TalendTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TalendTriggerItemProvider
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
    public TalendTriggerItemProvider(AdapterFactory adapterFactory) {
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
            addActivePropertyDescriptor(object);
            addLabelPropertyDescriptor(object);
            addDescriptionPropertyDescriptor(object);
            addTriggerTypePropertyDescriptor(object);
            addStartTimePropertyDescriptor(object);
            addEndTimePropertyDescriptor(object);
            addPreviousFireTimePropertyDescriptor(object);
            addFinalFireTimePropertyDescriptor(object);
            addIdQuartzTriggerPropertyDescriptor(object);
            addResumePauseUpdatedPropertyDescriptor(object);
            addPreviouslyPausedPropertyDescriptor(object);
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
                 getString("_UI_TalendTrigger_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_id_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
                 getString("_UI_TalendTrigger_active_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_active_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__ACTIVE,
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
                 getString("_UI_TalendTrigger_label_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_label_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__LABEL,
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
                 getString("_UI_TalendTrigger_description_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_description_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__DESCRIPTION,
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
                 getString("_UI_TalendTrigger_triggerType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_triggerType_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__TRIGGER_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Start Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartTimePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendTrigger_startTime_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_startTime_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__START_TIME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the End Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndTimePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendTrigger_endTime_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_endTime_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__END_TIME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Previous Fire Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPreviousFireTimePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendTrigger_previousFireTime_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_previousFireTime_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__PREVIOUS_FIRE_TIME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Final Fire Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFinalFireTimePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendTrigger_finalFireTime_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_finalFireTime_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__FINAL_FIRE_TIME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                 getString("_UI_TalendTrigger_idQuartzTrigger_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_idQuartzTrigger_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__ID_QUARTZ_TRIGGER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Resume Pause Updated feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addResumePauseUpdatedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendTrigger_resumePauseUpdated_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_resumePauseUpdated_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__RESUME_PAUSE_UPDATED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Previously Paused feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPreviouslyPausedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendTrigger_previouslyPaused_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendTrigger_previouslyPaused_feature", "_UI_TalendTrigger_type"),
                 PropertiesPackage.Literals.TALEND_TRIGGER__PREVIOUSLY_PAUSED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns TalendTrigger.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TalendTrigger"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        TalendTrigger talendTrigger = (TalendTrigger)object;
        return getString("_UI_TalendTrigger_type") + " " + talendTrigger.getId();
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

        switch (notification.getFeatureID(TalendTrigger.class)) {
            case PropertiesPackage.TALEND_TRIGGER__ID:
            case PropertiesPackage.TALEND_TRIGGER__ACTIVE:
            case PropertiesPackage.TALEND_TRIGGER__LABEL:
            case PropertiesPackage.TALEND_TRIGGER__DESCRIPTION:
            case PropertiesPackage.TALEND_TRIGGER__TRIGGER_TYPE:
            case PropertiesPackage.TALEND_TRIGGER__START_TIME:
            case PropertiesPackage.TALEND_TRIGGER__END_TIME:
            case PropertiesPackage.TALEND_TRIGGER__PREVIOUS_FIRE_TIME:
            case PropertiesPackage.TALEND_TRIGGER__FINAL_FIRE_TIME:
            case PropertiesPackage.TALEND_TRIGGER__ID_QUARTZ_TRIGGER:
            case PropertiesPackage.TALEND_TRIGGER__RESUME_PAUSE_UPDATED:
            case PropertiesPackage.TALEND_TRIGGER__PREVIOUSLY_PAUSED:
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
