/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.provider;


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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.AnalyzedDataSet;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.analysis.AnalyzedDataSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalyzedDataSetItemProvider
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
    public AnalyzedDataSetItemProvider(AdapterFactory adapterFactory) {
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

            addDataCountPropertyDescriptor(object);
            addRecordSizePropertyDescriptor(object);
            addDataPropertyDescriptor(object);
            addPatternDataPropertyDescriptor(object);
            addFrequencyDataPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Data Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalyzedDataSet_dataCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalyzedDataSet_dataCount_feature", "_UI_AnalyzedDataSet_type"),
                 AnalysisPackage.Literals.ANALYZED_DATA_SET__DATA_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Record Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecordSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalyzedDataSet_recordSize_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalyzedDataSet_recordSize_feature", "_UI_AnalyzedDataSet_type"),
                 AnalysisPackage.Literals.ANALYZED_DATA_SET__RECORD_SIZE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Data feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalyzedDataSet_data_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalyzedDataSet_data_feature", "_UI_AnalyzedDataSet_type"),
                 AnalysisPackage.Literals.ANALYZED_DATA_SET__DATA,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pattern Data feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPatternDataPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalyzedDataSet_patternData_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalyzedDataSet_patternData_feature", "_UI_AnalyzedDataSet_type"),
                 AnalysisPackage.Literals.ANALYZED_DATA_SET__PATTERN_DATA,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Frequency Data feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFrequencyDataPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalyzedDataSet_frequencyData_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalyzedDataSet_frequencyData_feature", "_UI_AnalyzedDataSet_type"),
                 AnalysisPackage.Literals.ANALYZED_DATA_SET__FREQUENCY_DATA,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns AnalyzedDataSet.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/AnalyzedDataSet"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        AnalyzedDataSet analyzedDataSet = (AnalyzedDataSet)object;
        return getString("_UI_AnalyzedDataSet_type") + " " + analyzedDataSet.getDataCount();
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

        switch (notification.getFeatureID(AnalyzedDataSet.class)) {
            case AnalysisPackage.ANALYZED_DATA_SET__DATA_COUNT:
            case AnalysisPackage.ANALYZED_DATA_SET__RECORD_SIZE:
            case AnalysisPackage.ANALYZED_DATA_SET__DATA:
            case AnalysisPackage.ANALYZED_DATA_SET__PATTERN_DATA:
            case AnalysisPackage.ANALYZED_DATA_SET__FREQUENCY_DATA:
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
