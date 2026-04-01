/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.provider;


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
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;
import orgomg.cwmx.resource.imsdatabase.ImsdatabaseFactory;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.SegmentComplex;

/**
 * This is the item provider adapter for a {@link orgomg.cwmx.resource.imsdatabase.SegmentComplex} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SegmentComplexItemProvider
    extends SegmentItemProvider
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
    public SegmentComplexItemProvider(AdapterFactory adapterFactory) {
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

            addDeleteFlagPropertyDescriptor(object);
            addInsertFlagPropertyDescriptor(object);
            addReplaceFlagPropertyDescriptor(object);
            addSegmPointerPropertyDescriptor(object);
            addDsGroupPropertyDescriptor(object);
            addSourcedIndexPropertyDescriptor(object);
            addLparentPropertyDescriptor(object);
            addPairedLCHILDPropertyDescriptor(object);
            addDatasetPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Delete Flag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeleteFlagPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SegmentComplex_deleteFlag_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SegmentComplex_deleteFlag_feature", "_UI_SegmentComplex_type"),
                 ImsdatabasePackage.Literals.SEGMENT_COMPLEX__DELETE_FLAG,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Insert Flag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInsertFlagPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SegmentComplex_insertFlag_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SegmentComplex_insertFlag_feature", "_UI_SegmentComplex_type"),
                 ImsdatabasePackage.Literals.SEGMENT_COMPLEX__INSERT_FLAG,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Replace Flag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReplaceFlagPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SegmentComplex_replaceFlag_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SegmentComplex_replaceFlag_feature", "_UI_SegmentComplex_type"),
                 ImsdatabasePackage.Literals.SEGMENT_COMPLEX__REPLACE_FLAG,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Segm Pointer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSegmPointerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SegmentComplex_segmPointer_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SegmentComplex_segmPointer_feature", "_UI_SegmentComplex_type"),
                 ImsdatabasePackage.Literals.SEGMENT_COMPLEX__SEGM_POINTER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ds Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDsGroupPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SegmentComplex_dsGroup_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SegmentComplex_dsGroup_feature", "_UI_SegmentComplex_type"),
                 ImsdatabasePackage.Literals.SEGMENT_COMPLEX__DS_GROUP,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sourced Index feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSourcedIndexPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SegmentComplex_sourcedIndex_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SegmentComplex_sourcedIndex_feature", "_UI_SegmentComplex_type"),
                 ImsdatabasePackage.Literals.SEGMENT_COMPLEX__SOURCED_INDEX,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Lparent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLparentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SegmentComplex_lparent_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SegmentComplex_lparent_feature", "_UI_SegmentComplex_type"),
                 ImsdatabasePackage.Literals.SEGMENT_COMPLEX__LPARENT,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Paired LCHILD feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPairedLCHILDPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SegmentComplex_pairedLCHILD_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SegmentComplex_pairedLCHILD_feature", "_UI_SegmentComplex_type"),
                 ImsdatabasePackage.Literals.SEGMENT_COMPLEX__PAIRED_LCHILD,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Dataset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatasetPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SegmentComplex_dataset_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SegmentComplex_dataset_feature", "_UI_SegmentComplex_type"),
                 ImsdatabasePackage.Literals.SEGMENT_COMPLEX__DATASET,
                 true,
                 false,
                 true,
                 null,
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
            childrenFeatures.add(ImsdatabasePackage.Literals.SEGMENT_COMPLEX__SECONDARY_INDEX);
            childrenFeatures.add(ImsdatabasePackage.Literals.SEGMENT_COMPLEX__LCHILD);
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
     * This returns SegmentComplex.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SegmentComplex"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((SegmentComplex)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_SegmentComplex_type") :
            getString("_UI_SegmentComplex_type") + " " + label;
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

        switch (notification.getFeatureID(SegmentComplex.class)) {
            case ImsdatabasePackage.SEGMENT_COMPLEX__DELETE_FLAG:
            case ImsdatabasePackage.SEGMENT_COMPLEX__INSERT_FLAG:
            case ImsdatabasePackage.SEGMENT_COMPLEX__REPLACE_FLAG:
            case ImsdatabasePackage.SEGMENT_COMPLEX__SEGM_POINTER:
            case ImsdatabasePackage.SEGMENT_COMPLEX__DS_GROUP:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ImsdatabasePackage.SEGMENT_COMPLEX__SECONDARY_INDEX:
            case ImsdatabasePackage.SEGMENT_COMPLEX__LCHILD:
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
                (ImsdatabasePackage.Literals.SEGMENT_COMPLEX__SECONDARY_INDEX,
                 ImsdatabaseFactory.eINSTANCE.createSecondaryIndex()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.SEGMENT_COMPLEX__LCHILD,
                 ImsdatabaseFactory.eINSTANCE.createLCHILD()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == CorePackage.Literals.NAMESPACE__OWNED_ELEMENT ||
            childFeature == CorePackage.Literals.CLASSIFIER__FEATURE ||
            childFeature == ImsdatabasePackage.Literals.SEGMENT_COMPLEX__SECONDARY_INDEX ||
            childFeature == ImsdatabasePackage.Literals.SEGMENT__EXIT ||
            childFeature == ImsdatabasePackage.Literals.SEGMENT_COMPLEX__LCHILD;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
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
