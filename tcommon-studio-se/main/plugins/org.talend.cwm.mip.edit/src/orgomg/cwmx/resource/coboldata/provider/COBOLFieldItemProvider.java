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
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;
import orgomg.cwmx.resource.coboldata.COBOLField;
import orgomg.cwmx.resource.coboldata.CoboldataFactory;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;

/**
 * This is the item provider adapter for a {@link orgomg.cwmx.resource.coboldata.COBOLField} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class COBOLFieldItemProvider
    extends COBOLItemItemProvider
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
    public COBOLFieldItemProvider(AdapterFactory adapterFactory) {
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

            addLevelPropertyDescriptor(object);
            addSignKindPropertyDescriptor(object);
            addIsFillerPropertyDescriptor(object);
            addIsJustifiedRightPropertyDescriptor(object);
            addIsBlankWhenZeroPropertyDescriptor(object);
            addIsSynchronizedPropertyDescriptor(object);
            addPicturePropertyDescriptor(object);
            addOccursLowerPropertyDescriptor(object);
            addOccursUpperPropertyDescriptor(object);
            addIndexNamePropertyDescriptor(object);
            addIsExternalPropertyDescriptor(object);
            addIsGlobalPropertyDescriptor(object);
            addDependingOnFieldPropertyDescriptor(object);
            addRedefinedFieldPropertyDescriptor(object);
            addRedefinedByFieldPropertyDescriptor(object);
            addOccursKeyFieldInfoPropertyDescriptor(object);
            addFirstRenamesPropertyDescriptor(object);
            addThruRenamesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLevelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_level_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_level_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__LEVEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sign Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSignKindPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_signKind_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_signKind_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__SIGN_KIND,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Filler feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsFillerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_isFiller_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_isFiller_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__IS_FILLER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Justified Right feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsJustifiedRightPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_isJustifiedRight_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_isJustifiedRight_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__IS_JUSTIFIED_RIGHT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Blank When Zero feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsBlankWhenZeroPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_isBlankWhenZero_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_isBlankWhenZero_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__IS_BLANK_WHEN_ZERO,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Synchronized feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSynchronizedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_isSynchronized_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_isSynchronized_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__IS_SYNCHRONIZED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Picture feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPicturePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_picture_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_picture_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__PICTURE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Occurs Lower feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOccursLowerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_occursLower_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_occursLower_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__OCCURS_LOWER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Occurs Upper feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOccursUpperPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_occursUpper_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_occursUpper_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__OCCURS_UPPER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Index Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIndexNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_indexName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_indexName_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__INDEX_NAME,
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
                 getString("_UI_COBOLField_isExternal_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_isExternal_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__IS_EXTERNAL,
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
                 getString("_UI_COBOLField_isGlobal_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_isGlobal_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__IS_GLOBAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Depending On Field feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDependingOnFieldPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_dependingOnField_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_dependingOnField_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__DEPENDING_ON_FIELD,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Redefined Field feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRedefinedFieldPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_redefinedField_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_redefinedField_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__REDEFINED_FIELD,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Redefined By Field feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRedefinedByFieldPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_redefinedByField_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_redefinedByField_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__REDEFINED_BY_FIELD,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Occurs Key Field Info feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOccursKeyFieldInfoPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_occursKeyFieldInfo_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_occursKeyFieldInfo_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__OCCURS_KEY_FIELD_INFO,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the First Renames feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFirstRenamesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_firstRenames_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_firstRenames_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__FIRST_RENAMES,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Thru Renames feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThruRenamesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_COBOLField_thruRenames_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_COBOLField_thruRenames_feature", "_UI_COBOLField_type"),
                 CoboldataPackage.Literals.COBOL_FIELD__THRU_RENAMES,
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
            childrenFeatures.add(CoboldataPackage.Literals.COBOL_FIELD__OCCURS_KEY_INFO);
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
     * This returns COBOLField.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/COBOLField"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((COBOLField)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_COBOLField_type") :
            getString("_UI_COBOLField_type") + " " + label;
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

        switch (notification.getFeatureID(COBOLField.class)) {
            case CoboldataPackage.COBOL_FIELD__LEVEL:
            case CoboldataPackage.COBOL_FIELD__SIGN_KIND:
            case CoboldataPackage.COBOL_FIELD__IS_FILLER:
            case CoboldataPackage.COBOL_FIELD__IS_JUSTIFIED_RIGHT:
            case CoboldataPackage.COBOL_FIELD__IS_BLANK_WHEN_ZERO:
            case CoboldataPackage.COBOL_FIELD__IS_SYNCHRONIZED:
            case CoboldataPackage.COBOL_FIELD__PICTURE:
            case CoboldataPackage.COBOL_FIELD__OCCURS_LOWER:
            case CoboldataPackage.COBOL_FIELD__OCCURS_UPPER:
            case CoboldataPackage.COBOL_FIELD__INDEX_NAME:
            case CoboldataPackage.COBOL_FIELD__IS_EXTERNAL:
            case CoboldataPackage.COBOL_FIELD__IS_GLOBAL:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_INFO:
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
                (CoboldataPackage.Literals.COBOL_FIELD__OCCURS_KEY_INFO,
                 CoboldataFactory.eINSTANCE.createOccursKey()));
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
