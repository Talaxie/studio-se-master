/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.schema.provider;


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
import org.talend.dataquality.indicators.provider.CompositeIndicatorItemProvider;
import org.talend.dataquality.indicators.schema.SchemaFactory;
import org.talend.dataquality.indicators.schema.SchemaIndicator;
import org.talend.dataquality.indicators.schema.SchemaPackage;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.indicators.schema.SchemaIndicator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaIndicatorItemProvider
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
    public SchemaIndicatorItemProvider(AdapterFactory adapterFactory) {
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

            addTableCountPropertyDescriptor(object);
            addKeyCountPropertyDescriptor(object);
            addIndexCountPropertyDescriptor(object);
            addViewCountPropertyDescriptor(object);
            addTriggerCountPropertyDescriptor(object);
            addTableRowCountPropertyDescriptor(object);
            addViewRowCountPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add(SchemaPackage.Literals.SCHEMA_INDICATOR__TABLE_INDICATORS);
            childrenFeatures.add(SchemaPackage.Literals.SCHEMA_INDICATOR__VIEW_INDICATORS);
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
     * This adds a property descriptor for the Table Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTableCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SchemaIndicator_tableCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SchemaIndicator_tableCount_feature", "_UI_SchemaIndicator_type"),
                 SchemaPackage.Literals.SCHEMA_INDICATOR__TABLE_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Key Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeyCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SchemaIndicator_keyCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SchemaIndicator_keyCount_feature", "_UI_SchemaIndicator_type"),
                 SchemaPackage.Literals.SCHEMA_INDICATOR__KEY_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Index Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIndexCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SchemaIndicator_indexCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SchemaIndicator_indexCount_feature", "_UI_SchemaIndicator_type"),
                 SchemaPackage.Literals.SCHEMA_INDICATOR__INDEX_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the View Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addViewCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SchemaIndicator_viewCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SchemaIndicator_viewCount_feature", "_UI_SchemaIndicator_type"),
                 SchemaPackage.Literals.SCHEMA_INDICATOR__VIEW_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Trigger Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTriggerCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SchemaIndicator_triggerCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SchemaIndicator_triggerCount_feature", "_UI_SchemaIndicator_type"),
                 SchemaPackage.Literals.SCHEMA_INDICATOR__TRIGGER_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Table Row Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTableRowCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SchemaIndicator_tableRowCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SchemaIndicator_tableRowCount_feature", "_UI_SchemaIndicator_type"),
                 SchemaPackage.Literals.SCHEMA_INDICATOR__TABLE_ROW_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the View Row Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addViewRowCountPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SchemaIndicator_viewRowCount_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SchemaIndicator_viewRowCount_feature", "_UI_SchemaIndicator_type"),
                 SchemaPackage.Literals.SCHEMA_INDICATOR__VIEW_ROW_COUNT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns SchemaIndicator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SchemaIndicator"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((SchemaIndicator)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_SchemaIndicator_type") :
            getString("_UI_SchemaIndicator_type") + " " + label;
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

        switch (notification.getFeatureID(SchemaIndicator.class)) {
            case SchemaPackage.SCHEMA_INDICATOR__TABLE_COUNT:
            case SchemaPackage.SCHEMA_INDICATOR__KEY_COUNT:
            case SchemaPackage.SCHEMA_INDICATOR__INDEX_COUNT:
            case SchemaPackage.SCHEMA_INDICATOR__VIEW_COUNT:
            case SchemaPackage.SCHEMA_INDICATOR__TRIGGER_COUNT:
            case SchemaPackage.SCHEMA_INDICATOR__TABLE_ROW_COUNT:
            case SchemaPackage.SCHEMA_INDICATOR__VIEW_ROW_COUNT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SchemaPackage.SCHEMA_INDICATOR__TABLE_INDICATORS:
            case SchemaPackage.SCHEMA_INDICATOR__VIEW_INDICATORS:
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
                (SchemaPackage.Literals.SCHEMA_INDICATOR__TABLE_INDICATORS,
                 SchemaFactory.eINSTANCE.createTableIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (SchemaPackage.Literals.SCHEMA_INDICATOR__VIEW_INDICATORS,
                 SchemaFactory.eINSTANCE.createViewIndicator()));
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
