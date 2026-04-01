/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwm.management.warehouseprocess.provider;


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
import orgomg.cwm.management.warehouseprocess.WarehouseProcess;
import orgomg.cwm.management.warehouseprocess.WarehouseprocessPackage;
import orgomg.cwm.management.warehouseprocess.events.EventsFactory;
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;
import orgomg.cwm.objectmodel.core.provider.ModelElementItemProvider;

/**
 * This is the item provider adapter for a {@link orgomg.cwm.management.warehouseprocess.WarehouseProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WarehouseProcessItemProvider
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
    public WarehouseProcessItemProvider(AdapterFactory adapterFactory) {
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

            addStaticDefinitionPropertyDescriptor(object);
            addIsSequentialPropertyDescriptor(object);
            addInternalEventPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Static Definition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStaticDefinitionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_WarehouseProcess_staticDefinition_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_WarehouseProcess_staticDefinition_feature", "_UI_WarehouseProcess_type"),
                 WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__STATIC_DEFINITION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Sequential feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSequentialPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_WarehouseProcess_isSequential_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_WarehouseProcess_isSequential_feature", "_UI_WarehouseProcess_type"),
                 WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__IS_SEQUENTIAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Internal Event feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInternalEventPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_WarehouseProcess_internalEvent_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_WarehouseProcess_internalEvent_feature", "_UI_WarehouseProcess_type"),
                 WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__INTERNAL_EVENT,
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
            childrenFeatures.add(WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__WAREHOUSE_EVENT);
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((WarehouseProcess)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_WarehouseProcess_type") :
            getString("_UI_WarehouseProcess_type") + " " + label;
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

        switch (notification.getFeatureID(WarehouseProcess.class)) {
            case WarehouseprocessPackage.WAREHOUSE_PROCESS__STATIC_DEFINITION:
            case WarehouseprocessPackage.WAREHOUSE_PROCESS__IS_SEQUENTIAL:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case WarehouseprocessPackage.WAREHOUSE_PROCESS__WAREHOUSE_EVENT:
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
                (WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__WAREHOUSE_EVENT,
                 EventsFactory.eINSTANCE.createPointInTimeEvent()));

        newChildDescriptors.add
            (createChildParameter
                (WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__WAREHOUSE_EVENT,
                 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

        newChildDescriptors.add
            (createChildParameter
                (WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__WAREHOUSE_EVENT,
                 EventsFactory.eINSTANCE.createIntervalEvent()));

        newChildDescriptors.add
            (createChildParameter
                (WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__WAREHOUSE_EVENT,
                 EventsFactory.eINSTANCE.createExternalEvent()));

        newChildDescriptors.add
            (createChildParameter
                (WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__WAREHOUSE_EVENT,
                 EventsFactory.eINSTANCE.createInternalEvent()));

        newChildDescriptors.add
            (createChildParameter
                (WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__WAREHOUSE_EVENT,
                 EventsFactory.eINSTANCE.createCascadeEvent()));

        newChildDescriptors.add
            (createChildParameter
                (WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__WAREHOUSE_EVENT,
                 EventsFactory.eINSTANCE.createRetryEvent()));

        newChildDescriptors.add
            (createChildParameter
                (WarehouseprocessPackage.Literals.WAREHOUSE_PROCESS__WAREHOUSE_EVENT,
                 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));
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
