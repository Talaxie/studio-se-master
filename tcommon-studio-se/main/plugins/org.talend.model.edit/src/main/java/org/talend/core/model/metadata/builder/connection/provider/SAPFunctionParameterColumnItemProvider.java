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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SAPFunctionParameterColumnItemProvider extends AbstractMetadataObjectItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
        IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFunctionParameterColumnItemProvider(AdapterFactory adapterFactory) {
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

            addParameterTypePropertyDescriptor(object);
            addStructureOrTableNamePropertyDescriptor(object);
            addDataTypePropertyDescriptor(object);
            addLengthPropertyDescriptor(object);
            addValuePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Parameter Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParameterTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SAPFunctionParameterColumn_ParameterType_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPFunctionParameterColumn_ParameterType_feature",
                        "_UI_SAPFunctionParameterColumn_type"),
                ConnectionPackage.Literals.SAP_FUNCTION_PARAMETER_COLUMN__PARAMETER_TYPE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Structure Or Table Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStructureOrTableNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SAPFunctionParameterColumn_StructureOrTableName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPFunctionParameterColumn_StructureOrTableName_feature",
                        "_UI_SAPFunctionParameterColumn_type"),
                ConnectionPackage.Literals.SAP_FUNCTION_PARAMETER_COLUMN__STRUCTURE_OR_TABLE_NAME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Data Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SAPFunctionParameterColumn_DataType_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPFunctionParameterColumn_DataType_feature",
                        "_UI_SAPFunctionParameterColumn_type"),
                ConnectionPackage.Literals.SAP_FUNCTION_PARAMETER_COLUMN__DATA_TYPE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Length feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLengthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SAPFunctionParameterColumn_Length_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPFunctionParameterColumn_Length_feature",
                        "_UI_SAPFunctionParameterColumn_type"), ConnectionPackage.Literals.SAP_FUNCTION_PARAMETER_COLUMN__LENGTH,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SAPFunctionParameterColumn_Value_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPFunctionParameterColumn_Value_feature",
                        "_UI_SAPFunctionParameterColumn_type"), ConnectionPackage.Literals.SAP_FUNCTION_PARAMETER_COLUMN__VALUE,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns SAPFunctionParameterColumn.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SAPFunctionParameterColumn"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((SAPFunctionParameterColumn) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_SAPFunctionParameterColumn_type")
                : getString("_UI_SAPFunctionParameterColumn_type") + " " + label;
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

        switch (notification.getFeatureID(SAPFunctionParameterColumn.class)) {
        case ConnectionPackage.SAP_FUNCTION_PARAMETER_COLUMN__PARAMETER_TYPE:
        case ConnectionPackage.SAP_FUNCTION_PARAMETER_COLUMN__STRUCTURE_OR_TABLE_NAME:
        case ConnectionPackage.SAP_FUNCTION_PARAMETER_COLUMN__DATA_TYPE:
        case ConnectionPackage.SAP_FUNCTION_PARAMETER_COLUMN__LENGTH:
        case ConnectionPackage.SAP_FUNCTION_PARAMETER_COLUMN__VALUE:
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

}
