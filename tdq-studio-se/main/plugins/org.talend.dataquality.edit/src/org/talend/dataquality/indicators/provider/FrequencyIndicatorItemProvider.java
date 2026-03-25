/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.dataquality.indicators.FrequencyIndicator;
import org.talend.dataquality.indicators.IndicatorsPackage;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.indicators.FrequencyIndicator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FrequencyIndicatorItemProvider
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
    public FrequencyIndicatorItemProvider(AdapterFactory adapterFactory) {
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

            addUniqueValuesPropertyDescriptor(object);
            addDistinctValueCountPropertyDescriptor(object);
            addUniqueValueCountPropertyDescriptor(object);
            addDuplicateValueCountPropertyDescriptor(object);
            addValueToFreqPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                 getString("_UI_FrequencyIndicator_uniqueValues_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FrequencyIndicator_uniqueValues_feature", "_UI_FrequencyIndicator_type"),
                 IndicatorsPackage.Literals.FREQUENCY_INDICATOR__UNIQUE_VALUES,
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
                 getString("_UI_FrequencyIndicator_distinctValueCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FrequencyIndicator_distinctValueCount_feature", "_UI_FrequencyIndicator_type"),
                 IndicatorsPackage.Literals.FREQUENCY_INDICATOR__DISTINCT_VALUE_COUNT,
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
                 getString("_UI_FrequencyIndicator_uniqueValueCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FrequencyIndicator_uniqueValueCount_feature", "_UI_FrequencyIndicator_type"),
                 IndicatorsPackage.Literals.FREQUENCY_INDICATOR__UNIQUE_VALUE_COUNT,
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
                 getString("_UI_FrequencyIndicator_duplicateValueCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FrequencyIndicator_duplicateValueCount_feature", "_UI_FrequencyIndicator_type"),
                 IndicatorsPackage.Literals.FREQUENCY_INDICATOR__DUPLICATE_VALUE_COUNT,
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
                 getString("_UI_FrequencyIndicator_valueToFreq_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FrequencyIndicator_valueToFreq_feature", "_UI_FrequencyIndicator_type"),
                 IndicatorsPackage.Literals.FREQUENCY_INDICATOR__VALUE_TO_FREQ,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns FrequencyIndicator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/FrequencyIndicator"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((FrequencyIndicator)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_FrequencyIndicator_type") :
            getString("_UI_FrequencyIndicator_type") + " " + label;
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

        switch (notification.getFeatureID(FrequencyIndicator.class)) {
            case IndicatorsPackage.FREQUENCY_INDICATOR__UNIQUE_VALUES:
            case IndicatorsPackage.FREQUENCY_INDICATOR__DISTINCT_VALUE_COUNT:
            case IndicatorsPackage.FREQUENCY_INDICATOR__UNIQUE_VALUE_COUNT:
            case IndicatorsPackage.FREQUENCY_INDICATOR__DUPLICATE_VALUE_COUNT:
            case IndicatorsPackage.FREQUENCY_INDICATOR__VALUE_TO_FREQ:
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

}
