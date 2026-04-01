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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.core.model.metadata.builder.connection.AbstractMetadataObject;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import orgomg.cwm.objectmodel.core.provider.ModelElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.AbstractMetadataObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractMetadataObjectItemProvider extends ModelElementItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractMetadataObjectItemProvider(AdapterFactory adapterFactory) {
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

            addPropertiesPropertyDescriptor(object);
            addIdPropertyDescriptor(object);
            addCommentPropertyDescriptor(object);
            addLabelPropertyDescriptor(object);
            addReadOnlyPropertyDescriptor(object);
            addSynchronisedPropertyDescriptor(object);
            addDivergencyPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Properties feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPropertiesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_AbstractMetadataObject_properties_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_AbstractMetadataObject_properties_feature",
                        "_UI_AbstractMetadataObject_type"), ConnectionPackage.Literals.ABSTRACT_METADATA_OBJECT__PROPERTIES,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_AbstractMetadataObject_id_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_AbstractMetadataObject_id_feature",
                        "_UI_AbstractMetadataObject_type"), ConnectionPackage.Literals.ABSTRACT_METADATA_OBJECT__ID, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Comment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCommentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_AbstractMetadataObject_comment_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_AbstractMetadataObject_comment_feature",
                        "_UI_AbstractMetadataObject_type"), ConnectionPackage.Literals.ABSTRACT_METADATA_OBJECT__COMMENT, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_AbstractMetadataObject_label_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_AbstractMetadataObject_label_feature",
                        "_UI_AbstractMetadataObject_type"), ConnectionPackage.Literals.ABSTRACT_METADATA_OBJECT__LABEL, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Read Only feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadOnlyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_AbstractMetadataObject_readOnly_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_AbstractMetadataObject_readOnly_feature",
                        "_UI_AbstractMetadataObject_type"), ConnectionPackage.Literals.ABSTRACT_METADATA_OBJECT__READ_ONLY, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Synchronised feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSynchronisedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_AbstractMetadataObject_synchronised_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_AbstractMetadataObject_synchronised_feature",
                        "_UI_AbstractMetadataObject_type"), ConnectionPackage.Literals.ABSTRACT_METADATA_OBJECT__SYNCHRONISED,
                true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Divergency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDivergencyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_AbstractMetadataObject_divergency_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_AbstractMetadataObject_divergency_feature",
                        "_UI_AbstractMetadataObject_type"), ConnectionPackage.Literals.ABSTRACT_METADATA_OBJECT__DIVERGENCY,
                true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((AbstractMetadataObject) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_AbstractMetadataObject_type")
                : getString("_UI_AbstractMetadataObject_type") + " " + label;
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

        switch (notification.getFeatureID(AbstractMetadataObject.class)) {
        case ConnectionPackage.ABSTRACT_METADATA_OBJECT__PROPERTIES:
        case ConnectionPackage.ABSTRACT_METADATA_OBJECT__ID:
        case ConnectionPackage.ABSTRACT_METADATA_OBJECT__COMMENT:
        case ConnectionPackage.ABSTRACT_METADATA_OBJECT__LABEL:
        case ConnectionPackage.ABSTRACT_METADATA_OBJECT__READ_ONLY:
        case ConnectionPackage.ABSTRACT_METADATA_OBJECT__SYNCHRONISED:
        case ConnectionPackage.ABSTRACT_METADATA_OBJECT__DIVERGENCY:
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
        return ((IChildCreationExtender) adapterFactory).getResourceLocator();
    }

}
