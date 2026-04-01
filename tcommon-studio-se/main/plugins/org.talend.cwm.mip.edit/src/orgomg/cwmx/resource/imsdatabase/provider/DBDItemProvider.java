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
import orgomg.cwm.resource.record.provider.RecordFileItemProvider;
import orgomg.cwmx.resource.imsdatabase.DBD;
import orgomg.cwmx.resource.imsdatabase.ImsdatabaseFactory;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;

/**
 * This is the item provider adapter for a {@link orgomg.cwmx.resource.imsdatabase.DBD} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DBDItemProvider
    extends RecordFileItemProvider
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
    public DBDItemProvider(AdapterFactory adapterFactory) {
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

            addDliAccessPropertyDescriptor(object);
            addIsVSAMPropertyDescriptor(object);
            addPasswordFlagPropertyDescriptor(object);
            addVersionStringPropertyDescriptor(object);
            addAcblibPropertyDescriptor(object);
            addPcbPropertyDescriptor(object);
            addLibraryPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dli Access feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDliAccessPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DBD_dliAccess_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DBD_dliAccess_feature", "_UI_DBD_type"),
                 ImsdatabasePackage.Literals.DBD__DLI_ACCESS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is VSAM feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsVSAMPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DBD_isVSAM_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DBD_isVSAM_feature", "_UI_DBD_type"),
                 ImsdatabasePackage.Literals.DBD__IS_VSAM,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Password Flag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPasswordFlagPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DBD_passwordFlag_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DBD_passwordFlag_feature", "_UI_DBD_type"),
                 ImsdatabasePackage.Literals.DBD__PASSWORD_FLAG,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Version String feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVersionStringPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DBD_versionString_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DBD_versionString_feature", "_UI_DBD_type"),
                 ImsdatabasePackage.Literals.DBD__VERSION_STRING,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Acblib feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAcblibPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DBD_acblib_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DBD_acblib_feature", "_UI_DBD_type"),
                 ImsdatabasePackage.Literals.DBD__ACBLIB,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pcb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPcbPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DBD_pcb_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DBD_pcb_feature", "_UI_DBD_type"),
                 ImsdatabasePackage.Literals.DBD__PCB,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Library feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLibraryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DBD_library_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DBD_library_feature", "_UI_DBD_type"),
                 ImsdatabasePackage.Literals.DBD__LIBRARY,
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
            childrenFeatures.add(ImsdatabasePackage.Literals.DBD__ACCESS_METHOD);
            childrenFeatures.add(ImsdatabasePackage.Literals.DBD__DATASET);
            childrenFeatures.add(ImsdatabasePackage.Literals.DBD__SEGMENT);
            childrenFeatures.add(ImsdatabasePackage.Literals.DBD__EXIT);
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
     * This returns DBD.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DBD"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((DBD)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_DBD_type") :
            getString("_UI_DBD_type") + " " + label;
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

        switch (notification.getFeatureID(DBD.class)) {
            case ImsdatabasePackage.DBD__DLI_ACCESS:
            case ImsdatabasePackage.DBD__IS_VSAM:
            case ImsdatabasePackage.DBD__PASSWORD_FLAG:
            case ImsdatabasePackage.DBD__VERSION_STRING:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ImsdatabasePackage.DBD__ACCESS_METHOD:
            case ImsdatabasePackage.DBD__DATASET:
            case ImsdatabasePackage.DBD__SEGMENT:
            case ImsdatabasePackage.DBD__EXIT:
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
                (ImsdatabasePackage.Literals.DBD__ACCESS_METHOD,
                 ImsdatabaseFactory.eINSTANCE.createAccessMethod()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.DBD__ACCESS_METHOD,
                 ImsdatabaseFactory.eINSTANCE.createINDEX()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.DBD__ACCESS_METHOD,
                 ImsdatabaseFactory.eINSTANCE.createHIDAM()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.DBD__ACCESS_METHOD,
                 ImsdatabaseFactory.eINSTANCE.createDEDB()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.DBD__ACCESS_METHOD,
                 ImsdatabaseFactory.eINSTANCE.createHDAM()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.DBD__ACCESS_METHOD,
                 ImsdatabaseFactory.eINSTANCE.createMSDB()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.DBD__DATASET,
                 ImsdatabaseFactory.eINSTANCE.createDataset()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.DBD__SEGMENT,
                 ImsdatabaseFactory.eINSTANCE.createSegment()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.DBD__SEGMENT,
                 ImsdatabaseFactory.eINSTANCE.createSegmentComplex()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.DBD__SEGMENT,
                 ImsdatabaseFactory.eINSTANCE.createSegmentLogical()));

        newChildDescriptors.add
            (createChildParameter
                (ImsdatabasePackage.Literals.DBD__EXIT,
                 ImsdatabaseFactory.eINSTANCE.createExit()));
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
            childFeature == ImsdatabasePackage.Literals.DBD__SEGMENT ||
            childFeature == ImsdatabasePackage.Literals.DBD__DATASET ||
            childFeature == ImsdatabasePackage.Literals.DBD__ACCESS_METHOD ||
            childFeature == ImsdatabasePackage.Literals.DBD__EXIT;

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
