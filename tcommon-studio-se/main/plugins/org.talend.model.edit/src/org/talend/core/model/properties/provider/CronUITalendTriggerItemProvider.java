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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.talend.core.model.properties.CronUITalendTrigger;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.CronUITalendTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CronUITalendTriggerItemProvider
    extends TalendTriggerItemProvider
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
    public CronUITalendTriggerItemProvider(AdapterFactory adapterFactory) {
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

            addListDaysOfWeekPropertyDescriptor(object);
            addListDaysOfMonthPropertyDescriptor(object);
            addListMonthsPropertyDescriptor(object);
            addListYearsPropertyDescriptor(object);
            addListHoursPropertyDescriptor(object);
            addListMinutesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the List Days Of Week feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addListDaysOfWeekPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CronUITalendTrigger_listDaysOfWeek_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CronUITalendTrigger_listDaysOfWeek_feature", "_UI_CronUITalendTrigger_type"),
                 PropertiesPackage.Literals.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_WEEK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the List Days Of Month feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addListDaysOfMonthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CronUITalendTrigger_listDaysOfMonth_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CronUITalendTrigger_listDaysOfMonth_feature", "_UI_CronUITalendTrigger_type"),
                 PropertiesPackage.Literals.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_MONTH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the List Months feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addListMonthsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CronUITalendTrigger_listMonths_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CronUITalendTrigger_listMonths_feature", "_UI_CronUITalendTrigger_type"),
                 PropertiesPackage.Literals.CRON_UI_TALEND_TRIGGER__LIST_MONTHS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the List Years feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addListYearsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CronUITalendTrigger_listYears_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CronUITalendTrigger_listYears_feature", "_UI_CronUITalendTrigger_type"),
                 PropertiesPackage.Literals.CRON_UI_TALEND_TRIGGER__LIST_YEARS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the List Hours feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addListHoursPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CronUITalendTrigger_listHours_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CronUITalendTrigger_listHours_feature", "_UI_CronUITalendTrigger_type"),
                 PropertiesPackage.Literals.CRON_UI_TALEND_TRIGGER__LIST_HOURS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the List Minutes feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addListMinutesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CronUITalendTrigger_listMinutes_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CronUITalendTrigger_listMinutes_feature", "_UI_CronUITalendTrigger_type"),
                 PropertiesPackage.Literals.CRON_UI_TALEND_TRIGGER__LIST_MINUTES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CronUITalendTrigger.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CronUITalendTrigger"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        CronUITalendTrigger cronUITalendTrigger = (CronUITalendTrigger)object;
        return getString("_UI_CronUITalendTrigger_type") + " " + cronUITalendTrigger.getId();
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

        switch (notification.getFeatureID(CronUITalendTrigger.class)) {
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_WEEK:
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_MONTH:
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MONTHS:
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_YEARS:
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_HOURS:
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MINUTES:
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

}
