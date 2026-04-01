/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwm.management.warehouseprocess.events.provider;


import java.util.Collection;
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
import org.eclipse.emf.edit.provider.ViewerNotification;
import orgomg.cwm.management.warehouseprocess.events.EventsPackage;
import orgomg.cwm.management.warehouseprocess.events.RecurringPointInTimeEvent;
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;

/**
 * This is the item provider adapter for a {@link orgomg.cwm.management.warehouseprocess.events.RecurringPointInTimeEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RecurringPointInTimeEventItemProvider
    extends PointInTimeEventItemProvider
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
    public RecurringPointInTimeEventItemProvider(AdapterFactory adapterFactory) {
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

            addRecurringTypePropertyDescriptor(object);
            addFrequencyFactorPropertyDescriptor(object);
            addMonthPropertyDescriptor(object);
            addDayOfMonthPropertyDescriptor(object);
            addDayOfWeekPropertyDescriptor(object);
            addHourPropertyDescriptor(object);
            addMinutePropertyDescriptor(object);
            addSecondPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Recurring Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecurringTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecurringPointInTimeEvent_recurringType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecurringPointInTimeEvent_recurringType_feature", "_UI_RecurringPointInTimeEvent_type"),
                 EventsPackage.Literals.RECURRING_POINT_IN_TIME_EVENT__RECURRING_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Frequency Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFrequencyFactorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecurringPointInTimeEvent_frequencyFactor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecurringPointInTimeEvent_frequencyFactor_feature", "_UI_RecurringPointInTimeEvent_type"),
                 EventsPackage.Literals.RECURRING_POINT_IN_TIME_EVENT__FREQUENCY_FACTOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Month feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMonthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecurringPointInTimeEvent_month_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecurringPointInTimeEvent_month_feature", "_UI_RecurringPointInTimeEvent_type"),
                 EventsPackage.Literals.RECURRING_POINT_IN_TIME_EVENT__MONTH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Day Of Month feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDayOfMonthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecurringPointInTimeEvent_dayOfMonth_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecurringPointInTimeEvent_dayOfMonth_feature", "_UI_RecurringPointInTimeEvent_type"),
                 EventsPackage.Literals.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_MONTH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Day Of Week feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDayOfWeekPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecurringPointInTimeEvent_dayOfWeek_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecurringPointInTimeEvent_dayOfWeek_feature", "_UI_RecurringPointInTimeEvent_type"),
                 EventsPackage.Literals.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_WEEK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Hour feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHourPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecurringPointInTimeEvent_hour_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecurringPointInTimeEvent_hour_feature", "_UI_RecurringPointInTimeEvent_type"),
                 EventsPackage.Literals.RECURRING_POINT_IN_TIME_EVENT__HOUR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Minute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinutePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecurringPointInTimeEvent_minute_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecurringPointInTimeEvent_minute_feature", "_UI_RecurringPointInTimeEvent_type"),
                 EventsPackage.Literals.RECURRING_POINT_IN_TIME_EVENT__MINUTE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Second feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSecondPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecurringPointInTimeEvent_second_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecurringPointInTimeEvent_second_feature", "_UI_RecurringPointInTimeEvent_type"),
                 EventsPackage.Literals.RECURRING_POINT_IN_TIME_EVENT__SECOND,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns RecurringPointInTimeEvent.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/RecurringPointInTimeEvent"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((RecurringPointInTimeEvent)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_RecurringPointInTimeEvent_type") :
            getString("_UI_RecurringPointInTimeEvent_type") + " " + label;
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

        switch (notification.getFeatureID(RecurringPointInTimeEvent.class)) {
            case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__RECURRING_TYPE:
            case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__FREQUENCY_FACTOR:
            case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MONTH:
            case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_MONTH:
            case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_WEEK:
            case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__HOUR:
            case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MINUTE:
            case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__SECOND:
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
        return Cwm_mipEditPlugin.INSTANCE;
    }

}
