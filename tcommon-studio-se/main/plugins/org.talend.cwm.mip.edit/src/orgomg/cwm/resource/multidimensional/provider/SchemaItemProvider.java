/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwm.resource.multidimensional.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;
import orgomg.cwm.objectmodel.core.provider.PackageItemProvider;
import orgomg.cwm.resource.multidimensional.MultidimensionalFactory;
import orgomg.cwm.resource.multidimensional.MultidimensionalPackage;
import orgomg.cwm.resource.multidimensional.Schema;
import orgomg.cwmx.resource.essbase.EssbaseFactory;
import orgomg.cwmx.resource.express.ExpressFactory;

/**
 * This is the item provider adapter for a {@link orgomg.cwm.resource.multidimensional.Schema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaItemProvider
    extends PackageItemProvider
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
    public SchemaItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT);
            childrenFeatures.add(MultidimensionalPackage.Literals.SCHEMA__DIMENSION);
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
     * This returns Schema.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Schema"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Schema)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Schema_type") :
            getString("_UI_Schema_type") + " " + label;
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

        switch (notification.getFeatureID(Schema.class)) {
            case MultidimensionalPackage.SCHEMA__DIMENSIONED_OBJECT:
            case MultidimensionalPackage.SCHEMA__DIMENSION:
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
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createAlias()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createComment()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createConsolidation()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createCurrencyConversion()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createDataStorage()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createFormula()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createGeneration()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createImmediateParent()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createLevel()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createMemberName()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createTimeBalance()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createTwoPassCalculation()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createUDA()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 EssbaseFactory.eINSTANCE.createVarianceReporting()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 ExpressFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 ExpressFactory.eINSTANCE.createFormula()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 ExpressFactory.eINSTANCE.createValueSet()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT,
                 ExpressFactory.eINSTANCE.createRelation()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSION,
                 MultidimensionalFactory.eINSTANCE.createDimension()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSION,
                 EssbaseFactory.eINSTANCE.createDimension()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSION,
                 ExpressFactory.eINSTANCE.createConjoint()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSION,
                 ExpressFactory.eINSTANCE.createComposite()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSION,
                 ExpressFactory.eINSTANCE.createSimpleDimension()));

        newChildDescriptors.add
            (createChildParameter
                (MultidimensionalPackage.Literals.SCHEMA__DIMENSION,
                 ExpressFactory.eINSTANCE.createAliasDimension()));
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
            childFeature == MultidimensionalPackage.Literals.SCHEMA__DIMENSION ||
            childFeature == MultidimensionalPackage.Literals.SCHEMA__DIMENSIONED_OBJECT;

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
