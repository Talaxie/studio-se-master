/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwmmip.provider;


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
import orgomg.cwm.objectmodel.core.provider.ElementItemProvider;
import orgomg.cwmmip.CwmmipFactory;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.InterchangePattern;

/**
 * This is the item provider adapter for a {@link orgomg.cwmmip.InterchangePattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterchangePatternItemProvider
    extends ElementItemProvider
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
    public InterchangePatternItemProvider(AdapterFactory adapterFactory) {
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

            addNamePropertyDescriptor(object);
            addVersionPropertyDescriptor(object);
            addUriPropertyDescriptor(object);
            addClassificationPropertyDescriptor(object);
            addCategoryPropertyDescriptor(object);
            addUnitOfInterchangePropertyDescriptor(object);
            addComponentPatternPropertyDescriptor(object);
            addCompositePatternPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InterchangePattern_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InterchangePattern_name_feature", "_UI_InterchangePattern_type"),
                 CwmmipPackage.Literals.INTERCHANGE_PATTERN__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InterchangePattern_version_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InterchangePattern_version_feature", "_UI_InterchangePattern_type"),
                 CwmmipPackage.Literals.INTERCHANGE_PATTERN__VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Uri feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUriPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InterchangePattern_uri_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InterchangePattern_uri_feature", "_UI_InterchangePattern_type"),
                 CwmmipPackage.Literals.INTERCHANGE_PATTERN__URI,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Classification feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClassificationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InterchangePattern_classification_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InterchangePattern_classification_feature", "_UI_InterchangePattern_type"),
                 CwmmipPackage.Literals.INTERCHANGE_PATTERN__CLASSIFICATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Category feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCategoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InterchangePattern_category_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InterchangePattern_category_feature", "_UI_InterchangePattern_type"),
                 CwmmipPackage.Literals.INTERCHANGE_PATTERN__CATEGORY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Unit Of Interchange feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnitOfInterchangePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InterchangePattern_unitOfInterchange_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InterchangePattern_unitOfInterchange_feature", "_UI_InterchangePattern_type"),
                 CwmmipPackage.Literals.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Component Pattern feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addComponentPatternPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InterchangePattern_componentPattern_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InterchangePattern_componentPattern_feature", "_UI_InterchangePattern_type"),
                 CwmmipPackage.Literals.INTERCHANGE_PATTERN__COMPONENT_PATTERN,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Composite Pattern feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCompositePatternPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InterchangePattern_compositePattern_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InterchangePattern_compositePattern_feature", "_UI_InterchangePattern_type"),
                 CwmmipPackage.Literals.INTERCHANGE_PATTERN__COMPOSITE_PATTERN,
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
            childrenFeatures.add(CwmmipPackage.Literals.INTERCHANGE_PATTERN__PROJECTION);
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
     * This returns InterchangePattern.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/InterchangePattern"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((InterchangePattern)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_InterchangePattern_type") :
            getString("_UI_InterchangePattern_type") + " " + label;
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

        switch (notification.getFeatureID(InterchangePattern.class)) {
            case CwmmipPackage.INTERCHANGE_PATTERN__NAME:
            case CwmmipPackage.INTERCHANGE_PATTERN__VERSION:
            case CwmmipPackage.INTERCHANGE_PATTERN__URI:
            case CwmmipPackage.INTERCHANGE_PATTERN__CLASSIFICATION:
            case CwmmipPackage.INTERCHANGE_PATTERN__CATEGORY:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case CwmmipPackage.INTERCHANGE_PATTERN__PROJECTION:
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
                (CwmmipPackage.Literals.INTERCHANGE_PATTERN__PROJECTION,
                 CwmmipFactory.eINSTANCE.createSemanticContext()));

        newChildDescriptors.add
            (createChildParameter
                (CwmmipPackage.Literals.INTERCHANGE_PATTERN__PROJECTION,
                 CwmmipFactory.eINSTANCE.createModeledSemanticContext()));

        newChildDescriptors.add
            (createChildParameter
                (CwmmipPackage.Literals.INTERCHANGE_PATTERN__PROJECTION,
                 CwmmipFactory.eINSTANCE.createGraphSubset()));

        newChildDescriptors.add
            (createChildParameter
                (CwmmipPackage.Literals.INTERCHANGE_PATTERN__PROJECTION,
                 CwmmipFactory.eINSTANCE.createModeledGraphSubset()));
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
