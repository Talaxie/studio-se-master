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
import org.talend.core.model.metadata.builder.connection.SAPIDocUnit;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.SAPIDocUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SAPIDocUnitItemProvider extends AbstractMetadataObjectItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPIDocUnitItemProvider(AdapterFactory adapterFactory) {
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

            addConnectionPropertyDescriptor(object);
            addProgramIdPropertyDescriptor(object);
            addGatewayServicePropertyDescriptor(object);
            addUseXmlOutputPropertyDescriptor(object);
            addXmlFilePropertyDescriptor(object);
            addUseHtmlOutputPropertyDescriptor(object);
            addHtmlFilePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Connection feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_SAPIDocUnit_connection_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPIDocUnit_connection_feature", "_UI_SAPIDocUnit_type"),
                ConnectionPackage.Literals.SAPI_DOC_UNIT__CONNECTION, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Program Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProgramIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_SAPIDocUnit_programId_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPIDocUnit_programId_feature", "_UI_SAPIDocUnit_type"),
                ConnectionPackage.Literals.SAPI_DOC_UNIT__PROGRAM_ID, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Gateway Service feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGatewayServicePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_SAPIDocUnit_gatewayService_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_SAPIDocUnit_gatewayService_feature",
                                "_UI_SAPIDocUnit_type"), ConnectionPackage.Literals.SAPI_DOC_UNIT__GATEWAY_SERVICE, true, false,
                        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Xml Output feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseXmlOutputPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_SAPIDocUnit_useXmlOutput_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPIDocUnit_useXmlOutput_feature", "_UI_SAPIDocUnit_type"),
                ConnectionPackage.Literals.SAPI_DOC_UNIT__USE_XML_OUTPUT, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Xml File feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXmlFilePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_SAPIDocUnit_xmlFile_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPIDocUnit_xmlFile_feature", "_UI_SAPIDocUnit_type"),
                ConnectionPackage.Literals.SAPI_DOC_UNIT__XML_FILE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Html Output feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseHtmlOutputPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_SAPIDocUnit_useHtmlOutput_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPIDocUnit_useHtmlOutput_feature", "_UI_SAPIDocUnit_type"),
                ConnectionPackage.Literals.SAPI_DOC_UNIT__USE_HTML_OUTPUT, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Html File feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHtmlFilePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_SAPIDocUnit_htmlFile_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SAPIDocUnit_htmlFile_feature", "_UI_SAPIDocUnit_type"),
                ConnectionPackage.Literals.SAPI_DOC_UNIT__HTML_FILE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns SAPIDocUnit.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SAPIDocUnit"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((SAPIDocUnit) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_SAPIDocUnit_type") : getString("_UI_SAPIDocUnit_type") + " "
                + label;
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

        switch (notification.getFeatureID(SAPIDocUnit.class)) {
        case ConnectionPackage.SAPI_DOC_UNIT__PROGRAM_ID:
        case ConnectionPackage.SAPI_DOC_UNIT__GATEWAY_SERVICE:
        case ConnectionPackage.SAPI_DOC_UNIT__USE_XML_OUTPUT:
        case ConnectionPackage.SAPI_DOC_UNIT__XML_FILE:
        case ConnectionPackage.SAPI_DOC_UNIT__USE_HTML_OUTPUT:
        case ConnectionPackage.SAPI_DOC_UNIT__HTML_FILE:
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
