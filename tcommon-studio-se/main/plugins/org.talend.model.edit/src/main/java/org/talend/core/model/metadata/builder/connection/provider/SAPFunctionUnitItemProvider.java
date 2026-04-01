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
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.SAPFunctionUnit;
import org.talend.cwm.relational.RelationalFactory;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SAPFunctionUnitItemProvider extends AbstractMetadataObjectItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFunctionUnitItemProvider(AdapterFactory adapterFactory) {
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

            addOutputTypePropertyDescriptor(object);
            addOutputTableNamePropertyDescriptor(object);
            addInputParameterTablePropertyDescriptor(object);
            addOutputParameterTablePropertyDescriptor(object);
            addMetadataTablePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Output Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SAPFunctionUnit_OutputType_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPFunctionUnit_OutputType_feature",
                        "_UI_SAPFunctionUnit_type"), ConnectionPackage.Literals.SAP_FUNCTION_UNIT__OUTPUT_TYPE, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Output Table Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputTableNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SAPFunctionUnit_OutputTableName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPFunctionUnit_OutputTableName_feature",
                        "_UI_SAPFunctionUnit_type"), ConnectionPackage.Literals.SAP_FUNCTION_UNIT__OUTPUT_TABLE_NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Input Parameter Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputParameterTablePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SAPFunctionUnit_InputParameterTable_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPFunctionUnit_InputParameterTable_feature",
                        "_UI_SAPFunctionUnit_type"), ConnectionPackage.Literals.SAP_FUNCTION_UNIT__INPUT_PARAMETER_TABLE, true,
                false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Output Parameter Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputParameterTablePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SAPFunctionUnit_OutputParameterTable_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPFunctionUnit_OutputParameterTable_feature",
                        "_UI_SAPFunctionUnit_type"), ConnectionPackage.Literals.SAP_FUNCTION_UNIT__OUTPUT_PARAMETER_TABLE, true,
                false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Metadata Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMetadataTablePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SAPFunctionUnit_MetadataTable_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPFunctionUnit_MetadataTable_feature",
                        "_UI_SAPFunctionUnit_type"), ConnectionPackage.Literals.SAP_FUNCTION_UNIT__METADATA_TABLE, true, false,
                true, null, null, null));
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
            childrenFeatures.add(ConnectionPackage.Literals.SAP_FUNCTION_UNIT__TABLES);
            childrenFeatures.add(ConnectionPackage.Literals.SAP_FUNCTION_UNIT__TEST_INPUT_PARAMETER_TABLE);
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
     * This returns SAPFunctionUnit.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SAPFunctionUnit"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((SAPFunctionUnit) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_SAPFunctionUnit_type")
                : getString("_UI_SAPFunctionUnit_type") + " " + label;
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

        switch (notification.getFeatureID(SAPFunctionUnit.class)) {
        case ConnectionPackage.SAP_FUNCTION_UNIT__OUTPUT_TYPE:
        case ConnectionPackage.SAP_FUNCTION_UNIT__OUTPUT_TABLE_NAME:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ConnectionPackage.SAP_FUNCTION_UNIT__TABLES:
        case ConnectionPackage.SAP_FUNCTION_UNIT__TEST_INPUT_PARAMETER_TABLE:
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

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.SAP_FUNCTION_UNIT__TABLES,
                ConnectionFactory.eINSTANCE.createMetadataTable()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.SAP_FUNCTION_UNIT__TABLES,
                ConnectionFactory.eINSTANCE.createSubscriberTable()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.SAP_FUNCTION_UNIT__TABLES,
                ConnectionFactory.eINSTANCE.createConcept()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.SAP_FUNCTION_UNIT__TABLES,
                RelationalFactory.eINSTANCE.createTdTable()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.SAP_FUNCTION_UNIT__TABLES,
                RelationalFactory.eINSTANCE.createTdView()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.SAP_FUNCTION_UNIT__TEST_INPUT_PARAMETER_TABLE,
                ConnectionFactory.eINSTANCE.createSAPTestInputParameterTable()));
    }

}
