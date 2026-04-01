/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.columnset.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.talend.dataquality.indicators.IndicatorsFactory;
import org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator;
import org.talend.dataquality.indicators.columnset.ColumnsetPackage;
import org.talend.dataquality.indicators.provider.CompositeIndicatorItemProvider;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnSetMultiValueIndicatorItemProvider
    extends CompositeIndicatorItemProvider
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
    public ColumnSetMultiValueIndicatorItemProvider(AdapterFactory adapterFactory) {
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

            addAnalyzedColumnsPropertyDescriptor(object);
            addListRowsPropertyDescriptor(object);
            addNumericFunctionsPropertyDescriptor(object);
            addNominalColumnsPropertyDescriptor(object);
            addNumericColumnsPropertyDescriptor(object);
            addColumnHeadersPropertyDescriptor(object);
            addDateFunctionsPropertyDescriptor(object);
            addDateColumnsPropertyDescriptor(object);
            addUniqueCountPropertyDescriptor(object);
            addDistinctCountPropertyDescriptor(object);
            addDuplicateCountPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Analyzed Columns feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAnalyzedColumnsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_analyzedColumns_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_analyzedColumns_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the List Rows feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addListRowsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_listRows_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_listRows_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Numeric Functions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNumericFunctionsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_numericFunctions_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_numericFunctions_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Nominal Columns feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalColumnsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_nominalColumns_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_nominalColumns_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS,
                 false,
                 false,
                 false,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Numeric Columns feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNumericColumnsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_numericColumns_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_numericColumns_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS,
                 false,
                 false,
                 false,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Column Headers feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addColumnHeadersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_columnHeaders_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_columnHeaders_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Date Functions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDateFunctionsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_dateFunctions_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_dateFunctions_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Date Columns feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDateColumnsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_dateColumns_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_dateColumns_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Unique Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUniqueCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_uniqueCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_uniqueCount_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Distinct Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDistinctCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_distinctCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_distinctCount_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Duplicate Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDuplicateCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ColumnSetMultiValueIndicator_duplicateCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ColumnSetMultiValueIndicator_duplicateCount_feature", "_UI_ColumnSetMultiValueIndicator_type"),
                 ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT,
                 false,
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
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR);
            childrenFeatures.add(ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR);
            childrenFeatures.add(ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR);
            childrenFeatures.add(ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ColumnSetMultiValueIndicator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ColumnSetMultiValueIndicator"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ColumnSetMultiValueIndicator)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_ColumnSetMultiValueIndicator_type") :
            getString("_UI_ColumnSetMultiValueIndicator_type") + " " + label;
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

        switch (notification.getFeatureID(ColumnSetMultiValueIndicator.class)) {
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS:
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS:
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS:
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS:
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT:
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT:
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR:
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR:
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR:
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR:
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
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createRowCountIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createUniqueCountIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createDistinctCountIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (ColumnsetPackage.Literals.COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR,
                 IndicatorsFactory.eINSTANCE.createDuplicateCountIndicator()));
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
