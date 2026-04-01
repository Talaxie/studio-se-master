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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;
import orgomg.cwm.objectmodel.core.provider.ModelElementItemProvider;
import orgomg.cwmx.resource.imsdatabase.Dataset;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;

/**
 * This is the item provider adapter for a {@link orgomg.cwmx.resource.imsdatabase.Dataset} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetItemProvider
    extends ModelElementItemProvider
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
    public DatasetItemProvider(AdapterFactory adapterFactory) {
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

            addDd1namePropertyDescriptor(object);
            addDevicePropertyDescriptor(object);
            addModelPropertyDescriptor(object);
            addDd2namePropertyDescriptor(object);
            addSize1PropertyDescriptor(object);
            addSize2PropertyDescriptor(object);
            addRecordLength1PropertyDescriptor(object);
            addRecordLength2PropertyDescriptor(object);
            addBlockingFactor1PropertyDescriptor(object);
            addBlockingFactor2PropertyDescriptor(object);
            addDatasetLabelPropertyDescriptor(object);
            addFreeBlockFrequencyPropertyDescriptor(object);
            addFreeSpacePercentagePropertyDescriptor(object);
            addRecordFormatPropertyDescriptor(object);
            addScanCylindersPropertyDescriptor(object);
            addSearchAlgorithmPropertyDescriptor(object);
            addRootPropertyDescriptor(object);
            addRootOverflowPropertyDescriptor(object);
            addUowPropertyDescriptor(object);
            addUowOverflowPropertyDescriptor(object);
            addSegmentPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dd1name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDd1namePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_dd1name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_dd1name_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__DD1NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Device feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDevicePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_device_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_device_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__DEVICE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Model feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_model_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_model_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__MODEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Dd2name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDd2namePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_dd2name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_dd2name_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__DD2NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Size1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSize1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_size1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_size1_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__SIZE1,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Size2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSize2PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_size2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_size2_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__SIZE2,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Record Length1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecordLength1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_recordLength1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_recordLength1_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__RECORD_LENGTH1,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Record Length2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecordLength2PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_recordLength2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_recordLength2_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__RECORD_LENGTH2,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Blocking Factor1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBlockingFactor1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_blockingFactor1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_blockingFactor1_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__BLOCKING_FACTOR1,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Blocking Factor2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBlockingFactor2PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_blockingFactor2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_blockingFactor2_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__BLOCKING_FACTOR2,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Dataset Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatasetLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_datasetLabel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_datasetLabel_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__DATASET_LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Free Block Frequency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFreeBlockFrequencyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_freeBlockFrequency_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_freeBlockFrequency_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__FREE_BLOCK_FREQUENCY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Free Space Percentage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFreeSpacePercentagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_freeSpacePercentage_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_freeSpacePercentage_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__FREE_SPACE_PERCENTAGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Record Format feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecordFormatPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_recordFormat_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_recordFormat_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__RECORD_FORMAT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Scan Cylinders feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScanCylindersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_scanCylinders_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_scanCylinders_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__SCAN_CYLINDERS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Search Algorithm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSearchAlgorithmPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_searchAlgorithm_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_searchAlgorithm_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__SEARCH_ALGORITHM,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Root feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRootPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_root_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_root_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__ROOT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Root Overflow feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRootOverflowPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_rootOverflow_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_rootOverflow_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__ROOT_OVERFLOW,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Uow feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUowPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_uow_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_uow_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__UOW,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Uow Overflow feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUowOverflowPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_uowOverflow_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_uowOverflow_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__UOW_OVERFLOW,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Segment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSegmentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Dataset_segment_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Dataset_segment_feature", "_UI_Dataset_type"),
                 ImsdatabasePackage.Literals.DATASET__SEGMENT,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns Dataset.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Dataset"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Dataset)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Dataset_type") :
            getString("_UI_Dataset_type") + " " + label;
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

        switch (notification.getFeatureID(Dataset.class)) {
            case ImsdatabasePackage.DATASET__DD1NAME:
            case ImsdatabasePackage.DATASET__DEVICE:
            case ImsdatabasePackage.DATASET__MODEL:
            case ImsdatabasePackage.DATASET__DD2NAME:
            case ImsdatabasePackage.DATASET__SIZE1:
            case ImsdatabasePackage.DATASET__SIZE2:
            case ImsdatabasePackage.DATASET__RECORD_LENGTH1:
            case ImsdatabasePackage.DATASET__RECORD_LENGTH2:
            case ImsdatabasePackage.DATASET__BLOCKING_FACTOR1:
            case ImsdatabasePackage.DATASET__BLOCKING_FACTOR2:
            case ImsdatabasePackage.DATASET__DATASET_LABEL:
            case ImsdatabasePackage.DATASET__FREE_BLOCK_FREQUENCY:
            case ImsdatabasePackage.DATASET__FREE_SPACE_PERCENTAGE:
            case ImsdatabasePackage.DATASET__RECORD_FORMAT:
            case ImsdatabasePackage.DATASET__SCAN_CYLINDERS:
            case ImsdatabasePackage.DATASET__SEARCH_ALGORITHM:
            case ImsdatabasePackage.DATASET__ROOT:
            case ImsdatabasePackage.DATASET__ROOT_OVERFLOW:
            case ImsdatabasePackage.DATASET__UOW:
            case ImsdatabasePackage.DATASET__UOW_OVERFLOW:
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
