/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.sql.provider;


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
import org.talend.dataquality.analysis.provider.DataqualityEditPlugin;
import org.talend.dataquality.indicators.provider.IndicatorItemProvider;
import org.talend.dataquality.indicators.sql.IndicatorSqlPackage;
import org.talend.dataquality.indicators.sql.UserDefIndicator;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.indicators.sql.UserDefIndicator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserDefIndicatorItemProvider
    extends IndicatorItemProvider
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
    public UserDefIndicatorItemProvider(AdapterFactory adapterFactory) {
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

            addUserCountPropertyDescriptor(object);
            addMatchingValueCountPropertyDescriptor(object);
            addNotMatchingValueCountPropertyDescriptor(object);
            addUniqueValuesPropertyDescriptor(object);
            addDistinctValueCountPropertyDescriptor(object);
            addUniqueValueCountPropertyDescriptor(object);
            addDuplicateValueCountPropertyDescriptor(object);
            addValueToFreqPropertyDescriptor(object);
            addValuePropertyDescriptor(object);
            addDatatypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the User Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUserCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_UserDefIndicator_userCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UserDefIndicator_userCount_feature", "_UI_UserDefIndicator_type"),
                 IndicatorSqlPackage.Literals.USER_DEF_INDICATOR__USER_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Matching Value Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMatchingValueCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_UserDefIndicator_matchingValueCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UserDefIndicator_matchingValueCount_feature", "_UI_UserDefIndicator_type"),
                 IndicatorSqlPackage.Literals.USER_DEF_INDICATOR__MATCHING_VALUE_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Not Matching Value Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNotMatchingValueCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_UserDefIndicator_notMatchingValueCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UserDefIndicator_notMatchingValueCount_feature", "_UI_UserDefIndicator_type"),
                 IndicatorSqlPackage.Literals.USER_DEF_INDICATOR__NOT_MATCHING_VALUE_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Unique Values feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUniqueValuesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_UserDefIndicator_uniqueValues_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UserDefIndicator_uniqueValues_feature", "_UI_UserDefIndicator_type"),
                 IndicatorSqlPackage.Literals.USER_DEF_INDICATOR__UNIQUE_VALUES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Distinct Value Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDistinctValueCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_UserDefIndicator_distinctValueCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UserDefIndicator_distinctValueCount_feature", "_UI_UserDefIndicator_type"),
                 IndicatorSqlPackage.Literals.USER_DEF_INDICATOR__DISTINCT_VALUE_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Unique Value Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUniqueValueCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_UserDefIndicator_uniqueValueCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UserDefIndicator_uniqueValueCount_feature", "_UI_UserDefIndicator_type"),
                 IndicatorSqlPackage.Literals.USER_DEF_INDICATOR__UNIQUE_VALUE_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Duplicate Value Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDuplicateValueCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_UserDefIndicator_duplicateValueCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UserDefIndicator_duplicateValueCount_feature", "_UI_UserDefIndicator_type"),
                 IndicatorSqlPackage.Literals.USER_DEF_INDICATOR__DUPLICATE_VALUE_COUNT,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Value To Freq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValueToFreqPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_UserDefIndicator_valueToFreq_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UserDefIndicator_valueToFreq_feature", "_UI_UserDefIndicator_type"),
                 IndicatorSqlPackage.Literals.USER_DEF_INDICATOR__VALUE_TO_FREQ,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_UserDefIndicator_value_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UserDefIndicator_value_feature", "_UI_UserDefIndicator_type"),
                 IndicatorSqlPackage.Literals.USER_DEF_INDICATOR__VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Datatype feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatatypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_UserDefIndicator_datatype_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_UserDefIndicator_datatype_feature", "_UI_UserDefIndicator_type"),
                 IndicatorSqlPackage.Literals.USER_DEF_INDICATOR__DATATYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns UserDefIndicator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/UserDefIndicator"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((UserDefIndicator)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_UserDefIndicator_type") :
            getString("_UI_UserDefIndicator_type") + " " + label;
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

        switch (notification.getFeatureID(UserDefIndicator.class)) {
            case IndicatorSqlPackage.USER_DEF_INDICATOR__USER_COUNT:
            case IndicatorSqlPackage.USER_DEF_INDICATOR__MATCHING_VALUE_COUNT:
            case IndicatorSqlPackage.USER_DEF_INDICATOR__NOT_MATCHING_VALUE_COUNT:
            case IndicatorSqlPackage.USER_DEF_INDICATOR__UNIQUE_VALUES:
            case IndicatorSqlPackage.USER_DEF_INDICATOR__DISTINCT_VALUE_COUNT:
            case IndicatorSqlPackage.USER_DEF_INDICATOR__UNIQUE_VALUE_COUNT:
            case IndicatorSqlPackage.USER_DEF_INDICATOR__DUPLICATE_VALUE_COUNT:
            case IndicatorSqlPackage.USER_DEF_INDICATOR__VALUE_TO_FREQ:
            case IndicatorSqlPackage.USER_DEF_INDICATOR__VALUE:
            case IndicatorSqlPackage.USER_DEF_INDICATOR__DATATYPE:
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
