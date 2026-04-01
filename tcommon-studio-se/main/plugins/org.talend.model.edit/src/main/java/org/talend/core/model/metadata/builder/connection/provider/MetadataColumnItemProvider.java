/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.metadata.builder.connection.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.MetadataColumn;
import org.talend.cwm.relational.RelationalFactory;
import orgomg.cwm.foundation.datatypes.DatatypesFactory;
import orgomg.cwm.objectmodel.core.CoreFactory;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.resource.record.RecordPackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.MetadataColumn} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataColumnItemProvider extends AbstractMetadataObjectItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MetadataColumnItemProvider(AdapterFactory adapterFactory) {
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

            addOwnerScopePropertyDescriptor(object);
            addFeatureNodePropertyDescriptor(object);
            addFeatureMapPropertyDescriptor(object);
            addCfMapPropertyDescriptor(object);
            addChangeabilityPropertyDescriptor(object);
            addOrderingPropertyDescriptor(object);
            addTargetScopePropertyDescriptor(object);
            addTypePropertyDescriptor(object);
            addSlotPropertyDescriptor(object);
            addDiscriminatedUnionPropertyDescriptor(object);
            addIndexedFeaturePropertyDescriptor(object);
            addKeyRelationshipPropertyDescriptor(object);
            addUniqueKeyPropertyDescriptor(object);
            addDataItemPropertyDescriptor(object);
            addRemapPropertyDescriptor(object);
            addLengthPropertyDescriptor(object);
            addPrecisionPropertyDescriptor(object);
            addScalePropertyDescriptor(object);
            addSourceTypePropertyDescriptor(object);
            addDefaultValuePropertyDescriptor(object);
            addTalendTypePropertyDescriptor(object);
            addKeyPropertyDescriptor(object);
            addNullablePropertyDescriptor(object);
            addOriginalFieldPropertyDescriptor(object);
            addPatternPropertyDescriptor(object);
            addDisplayFieldPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Owner Scope feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOwnerScopePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Feature_ownerScope_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Feature_ownerScope_feature", "_UI_Feature_type"),
                CorePackage.Literals.FEATURE__OWNER_SCOPE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
                null));
    }

    /**
     * This adds a property descriptor for the Feature Node feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeatureNodePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Feature_featureNode_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Feature_featureNode_feature", "_UI_Feature_type"),
                CorePackage.Literals.FEATURE__FEATURE_NODE, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Feature Map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeatureMapPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Feature_featureMap_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Feature_featureMap_feature", "_UI_Feature_type"),
                CorePackage.Literals.FEATURE__FEATURE_MAP, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Cf Map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCfMapPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Feature_cfMap_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Feature_cfMap_feature", "_UI_Feature_type"),
                CorePackage.Literals.FEATURE__CF_MAP, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Changeability feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChangeabilityPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_changeability_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_changeability_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__CHANGEABILITY, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Ordering feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOrderingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_ordering_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_ordering_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__ORDERING, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Target Scope feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetScopePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_targetScope_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_targetScope_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__TARGET_SCOPE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_type_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_type_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__TYPE, true, false, true, null,
                null, null));
    }

    /**
     * This adds a property descriptor for the Slot feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSlotPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_slot_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_slot_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__SLOT, true, false, true, null,
                null, null));
    }

    /**
     * This adds a property descriptor for the Discriminated Union feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiscriminatedUnionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_discriminatedUnion_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_discriminatedUnion_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__DISCRIMINATED_UNION, true, false,
                true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Indexed Feature feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIndexedFeaturePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_indexedFeature_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_indexedFeature_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__INDEXED_FEATURE, true, false,
                true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Key Relationship feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeyRelationshipPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_keyRelationship_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_keyRelationship_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__KEY_RELATIONSHIP, true, false,
                true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Unique Key feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUniqueKeyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_uniqueKey_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_uniqueKey_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__UNIQUE_KEY, true, false, true,
                null, null, null));
    }

    /**
     * This adds a property descriptor for the Data Item feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataItemPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_dataItem_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_dataItem_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__DATA_ITEM, true, false, true,
                null, null, null));
    }

    /**
     * This adds a property descriptor for the Remap feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemapPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_StructuralFeature_remap_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_StructuralFeature_remap_feature",
                        "_UI_StructuralFeature_type"), CorePackage.Literals.STRUCTURAL_FEATURE__REMAP, true, false, true, null,
                null, null));
    }

    /**
     * This adds a property descriptor for the Length feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLengthPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Field_length_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Field_length_feature", "_UI_Field_type"),
                        RecordPackage.Literals.FIELD__LENGTH, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                        null, null));
    }

    /**
     * This adds a property descriptor for the Precision feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrecisionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Field_precision_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Field_precision_feature", "_UI_Field_type"),
                RecordPackage.Literals.FIELD__PRECISION, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null,
                null));
    }

    /**
     * This adds a property descriptor for the Scale feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScalePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Field_scale_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Field_scale_feature", "_UI_Field_type"),
                        RecordPackage.Literals.FIELD__SCALE, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                        null, null));
    }

    /**
     * This adds a property descriptor for the Source Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSourceTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MetadataColumn_sourceType_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_MetadataColumn_sourceType_feature",
                        "_UI_MetadataColumn_type"), ConnectionPackage.Literals.METADATA_COLUMN__SOURCE_TYPE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Default Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefaultValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MetadataColumn_defaultValue_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_MetadataColumn_defaultValue_feature",
                        "_UI_MetadataColumn_type"), ConnectionPackage.Literals.METADATA_COLUMN__DEFAULT_VALUE, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Talaxie Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTalendTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MetadataColumn_talendType_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_MetadataColumn_talendType_feature",
                        "_UI_MetadataColumn_type"), ConnectionPackage.Literals.METADATA_COLUMN__TALEND_TYPE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Key feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_MetadataColumn_key_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_MetadataColumn_key_feature", "_UI_MetadataColumn_type"),
                ConnectionPackage.Literals.METADATA_COLUMN__KEY, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Nullable feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNullablePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_MetadataColumn_nullable_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_MetadataColumn_nullable_feature",
                                "_UI_MetadataColumn_type"), ConnectionPackage.Literals.METADATA_COLUMN__NULLABLE, true, false,
                        false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Original Field feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOriginalFieldPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MetadataColumn_originalField_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_MetadataColumn_originalField_feature",
                        "_UI_MetadataColumn_type"), ConnectionPackage.Literals.METADATA_COLUMN__ORIGINAL_FIELD, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Pattern feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPatternPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_MetadataColumn_pattern_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_MetadataColumn_pattern_feature", "_UI_MetadataColumn_type"),
                ConnectionPackage.Literals.METADATA_COLUMN__PATTERN, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Display Field feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDisplayFieldPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_MetadataColumn_displayField_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_MetadataColumn_displayField_feature",
                        "_UI_MetadataColumn_type"), ConnectionPackage.Literals.METADATA_COLUMN__DISPLAY_FIELD, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(CorePackage.Literals.STRUCTURAL_FEATURE__MULTIPLICITY);
            childrenFeatures.add(CorePackage.Literals.ATTRIBUTE__INITIAL_VALUE);
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
     * This returns MetadataColumn.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/MetadataColumn"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((MetadataColumn) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_MetadataColumn_type") : getString("_UI_MetadataColumn_type")
                + " " + label;
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

        switch (notification.getFeatureID(MetadataColumn.class)) {
        case ConnectionPackage.METADATA_COLUMN__OWNER_SCOPE:
        case ConnectionPackage.METADATA_COLUMN__CHANGEABILITY:
        case ConnectionPackage.METADATA_COLUMN__ORDERING:
        case ConnectionPackage.METADATA_COLUMN__TARGET_SCOPE:
        case ConnectionPackage.METADATA_COLUMN__LENGTH:
        case ConnectionPackage.METADATA_COLUMN__PRECISION:
        case ConnectionPackage.METADATA_COLUMN__SCALE:
        case ConnectionPackage.METADATA_COLUMN__SOURCE_TYPE:
        case ConnectionPackage.METADATA_COLUMN__DEFAULT_VALUE:
        case ConnectionPackage.METADATA_COLUMN__TALEND_TYPE:
        case ConnectionPackage.METADATA_COLUMN__KEY:
        case ConnectionPackage.METADATA_COLUMN__NULLABLE:
        case ConnectionPackage.METADATA_COLUMN__ORIGINAL_FIELD:
        case ConnectionPackage.METADATA_COLUMN__PATTERN:
        case ConnectionPackage.METADATA_COLUMN__DISPLAY_FIELD:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ConnectionPackage.METADATA_COLUMN__MULTIPLICITY:
        case ConnectionPackage.METADATA_COLUMN__INITIAL_VALUE:
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

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.STRUCTURAL_FEATURE__MULTIPLICITY,
                CoreFactory.eINSTANCE.createMultiplicity()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.ATTRIBUTE__INITIAL_VALUE,
                RelationalFactory.eINSTANCE.createTdExpression()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.ATTRIBUTE__INITIAL_VALUE,
                CoreFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.ATTRIBUTE__INITIAL_VALUE,
                CoreFactory.eINSTANCE.createBooleanExpression()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.ATTRIBUTE__INITIAL_VALUE,
                CoreFactory.eINSTANCE.createProcedureExpression()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.ATTRIBUTE__INITIAL_VALUE,
                DatatypesFactory.eINSTANCE.createQueryExpression()));
    }

}
