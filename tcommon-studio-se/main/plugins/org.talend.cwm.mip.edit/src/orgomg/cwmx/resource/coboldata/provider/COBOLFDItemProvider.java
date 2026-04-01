/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwmx.resource.coboldata.provider;


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
import orgomg.cwm.objectmodel.core.provider.ClassItemProvider;
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;
import orgomg.cwm.resource.record.RecordPackage;
import orgomg.cwmx.resource.coboldata.COBOLFD;
import orgomg.cwmx.resource.coboldata.CoboldataFactory;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;

/**
 * This is the item provider adapter for a {@link orgomg.cwmx.resource.coboldata.COBOLFD} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class COBOLFDItemProvider
    extends ClassItemProvider
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
    public COBOLFDItemProvider(AdapterFactory adapterFactory) {
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

            addImportedElementPropertyDescriptor(object);
            addDataManagerPropertyDescriptor(object);
            addIsSelfDescribingPropertyDescriptor(object);
            addRecordDelimiterPropertyDescriptor(object);
            addSkipRecordsPropertyDescriptor(object);
            addRecordPropertyDescriptor(object);
            addOrganizationPropertyDescriptor(object);
            addAccessModePropertyDescriptor(object);
            addIsOptionalPropertyDescriptor(object);
            addReserveAreasPropertyDescriptor(object);
            addAssignToPropertyDescriptor(object);
            addCodeSetLitPropertyDescriptor(object);
            addBlockSizeUnitPropertyDescriptor(object);
            addMinBlocksPropertyDescriptor(object);
            addMaxBlocksPropertyDescriptor(object);
            addMinRecordsPropertyDescriptor(object);
            addMaxRecordsPropertyDescriptor(object);
            addLabelKindPropertyDescriptor(object);
            addIsExternalPropertyDescriptor(object);
            addIsGlobalPropertyDescriptor(object);
            addPadLiteralPropertyDescriptor(object);
            addStatusIDPropertyDescriptor(object);
            addDependsOnPropertyDescriptor(object);
            addPadFieldPropertyDescriptor(object);
            addRelativeFieldPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Imported Element feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addImportedElementPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Package_importedElement_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Package_importedElement_feature", "_UI_Package_type"),
                 CorePackage.Literals.PACKAGE__IMPORTED_ELEMENT,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Data Manager feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataManagerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Package_dataManager_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Package_dataManager_feature", "_UI_Package_type"),
                 CorePackage.Literals.PACKAGE__DATA_MANAGER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Self Describing feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSelfDescribingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecordFile_isSelfDescribing_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecordFile_isSelfDescribing_feature", "_UI_RecordFile_type"),
                 RecordPackage.Literals.RECORD_FILE__IS_SELF_DESCRIBING,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Record Delimiter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecordDelimiterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecordFile_recordDelimiter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecordFile_recordDelimiter_feature", "_UI_RecordFile_type"),
                 RecordPackage.Literals.RECORD_FILE__RECORD_DELIMITER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Skip Records feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSkipRecordsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecordFile_skipRecords_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecordFile_skipRecords_feature", "_UI_RecordFile_type"),
                 RecordPackage.Literals.RECORD_FILE__SKIP_RECORDS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Record feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RecordFile_record_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RecordFile_record_feature", "_UI_RecordFile_type"),
                 RecordPackage.Literals.RECORD_FILE__RECORD,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Organization feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOrganizationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_organization_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_organization_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__ORGANIZATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Access Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAccessModePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_accessMode_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_accessMode_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__ACCESS_MODE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Optional feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsOptionalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_isOptional_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_isOptional_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__IS_OPTIONAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Reserve Areas feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReserveAreasPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_reserveAreas_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_reserveAreas_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__RESERVE_AREAS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Assign To feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssignToPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_assignTo_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_assignTo_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__ASSIGN_TO,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Code Set Lit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCodeSetLitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_codeSetLit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_codeSetLit_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__CODE_SET_LIT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Block Size Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBlockSizeUnitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_blockSizeUnit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_blockSizeUnit_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__BLOCK_SIZE_UNIT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Min Blocks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinBlocksPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_minBlocks_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_minBlocks_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__MIN_BLOCKS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Blocks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxBlocksPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_maxBlocks_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_maxBlocks_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__MAX_BLOCKS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Min Records feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinRecordsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_minRecords_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_minRecords_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__MIN_RECORDS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Records feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxRecordsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_maxRecords_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_maxRecords_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__MAX_RECORDS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Label Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLabelKindPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_labelKind_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_labelKind_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__LABEL_KIND,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is External feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsExternalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_isExternal_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_isExternal_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__IS_EXTERNAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Global feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsGlobalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_isGlobal_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_isGlobal_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__IS_GLOBAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pad Literal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPadLiteralPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_padLiteral_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_padLiteral_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__PAD_LITERAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Status ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatusIDPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_statusID_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_statusID_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__STATUS_ID,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Depends On feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDependsOnPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_dependsOn_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_dependsOn_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__DEPENDS_ON,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pad Field feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPadFieldPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_padField_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_padField_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__PAD_FIELD,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Relative Field feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRelativeFieldPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLFD_relativeField_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLFD_relativeField_feature", "_UI_COBOLFD_type"),
                 CoboldataPackage.Literals.COBOLFD__RELATIVE_FIELD,
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
            childrenFeatures.add(CoboldataPackage.Literals.COBOLFD__LINAGE_INFO);
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
     * This returns COBOLFD.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/COBOLFD"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((COBOLFD)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_COBOLFD_type") :
            getString("_UI_COBOLFD_type") + " " + label;
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

        switch (notification.getFeatureID(COBOLFD.class)) {
            case CoboldataPackage.COBOLFD__IS_SELF_DESCRIBING:
            case CoboldataPackage.COBOLFD__RECORD_DELIMITER:
            case CoboldataPackage.COBOLFD__SKIP_RECORDS:
            case CoboldataPackage.COBOLFD__ORGANIZATION:
            case CoboldataPackage.COBOLFD__ACCESS_MODE:
            case CoboldataPackage.COBOLFD__IS_OPTIONAL:
            case CoboldataPackage.COBOLFD__RESERVE_AREAS:
            case CoboldataPackage.COBOLFD__ASSIGN_TO:
            case CoboldataPackage.COBOLFD__CODE_SET_LIT:
            case CoboldataPackage.COBOLFD__BLOCK_SIZE_UNIT:
            case CoboldataPackage.COBOLFD__MIN_BLOCKS:
            case CoboldataPackage.COBOLFD__MAX_BLOCKS:
            case CoboldataPackage.COBOLFD__MIN_RECORDS:
            case CoboldataPackage.COBOLFD__MAX_RECORDS:
            case CoboldataPackage.COBOLFD__LABEL_KIND:
            case CoboldataPackage.COBOLFD__IS_EXTERNAL:
            case CoboldataPackage.COBOLFD__IS_GLOBAL:
            case CoboldataPackage.COBOLFD__PAD_LITERAL:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case CoboldataPackage.COBOLFD__LINAGE_INFO:
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
                (CoboldataPackage.Literals.COBOLFD__LINAGE_INFO,
                 CoboldataFactory.eINSTANCE.createLinageInfo()));
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
            childFeature == CoboldataPackage.Literals.COBOLFD__LINAGE_INFO;

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
