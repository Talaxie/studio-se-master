/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwmx.foundation.er.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;
import orgomg.cwm.foundation.expressions.ExpressionsFactory;
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;
import orgomg.cwm.objectmodel.relationships.provider.AssociationEndItemProvider;
import orgomg.cwmx.foundation.er.ErPackage;
import orgomg.cwmx.foundation.er.RelationshipEnd;

/**
 * This is the item provider adapter for a {@link orgomg.cwmx.foundation.er.RelationshipEnd} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationshipEndItemProvider
    extends AssociationEndItemProvider
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
    public RelationshipEndItemProvider(AdapterFactory adapterFactory) {
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

            addForeignKeyPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Foreign Key feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addForeignKeyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RelationshipEnd_foreignKey_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RelationshipEnd_foreignKey_feature", "_UI_RelationshipEnd_type"),
                 ErPackage.Literals.RELATIONSHIP_END__FOREIGN_KEY,
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
            childrenFeatures.add(ErPackage.Literals.RELATIONSHIP_END__DELETE);
            childrenFeatures.add(ErPackage.Literals.RELATIONSHIP_END__UPDATE);
            childrenFeatures.add(ErPackage.Literals.RELATIONSHIP_END__INSERT);
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
     * This returns RelationshipEnd.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/RelationshipEnd"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((RelationshipEnd)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_RelationshipEnd_type") :
            getString("_UI_RelationshipEnd_type") + " " + label;
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

        switch (notification.getFeatureID(RelationshipEnd.class)) {
            case ErPackage.RELATIONSHIP_END__DELETE:
            case ErPackage.RELATIONSHIP_END__UPDATE:
            case ErPackage.RELATIONSHIP_END__INSERT:
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
                (ErPackage.Literals.RELATIONSHIP_END__DELETE,
                 ExpressionsFactory.eINSTANCE.createExpressionNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__DELETE,
                 ExpressionsFactory.eINSTANCE.createConstantNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__DELETE,
                 ExpressionsFactory.eINSTANCE.createElementNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__DELETE,
                 ExpressionsFactory.eINSTANCE.createFeatureNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__UPDATE,
                 ExpressionsFactory.eINSTANCE.createExpressionNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__UPDATE,
                 ExpressionsFactory.eINSTANCE.createConstantNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__UPDATE,
                 ExpressionsFactory.eINSTANCE.createElementNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__UPDATE,
                 ExpressionsFactory.eINSTANCE.createFeatureNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__INSERT,
                 ExpressionsFactory.eINSTANCE.createExpressionNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__INSERT,
                 ExpressionsFactory.eINSTANCE.createConstantNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__INSERT,
                 ExpressionsFactory.eINSTANCE.createElementNode()));

        newChildDescriptors.add
            (createChildParameter
                (ErPackage.Literals.RELATIONSHIP_END__INSERT,
                 ExpressionsFactory.eINSTANCE.createFeatureNode()));
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
            childFeature == ErPackage.Literals.RELATIONSHIP_END__DELETE ||
            childFeature == ErPackage.Literals.RELATIONSHIP_END__UPDATE ||
            childFeature == ErPackage.Literals.RELATIONSHIP_END__INSERT;

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
