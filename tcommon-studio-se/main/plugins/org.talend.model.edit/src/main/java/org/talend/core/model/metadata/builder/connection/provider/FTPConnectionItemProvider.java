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
import org.talend.core.model.metadata.builder.connection.FTPConnection;

import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;

import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.FTPConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FTPConnectionItemProvider extends ConnectionItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FTPConnectionItemProvider(AdapterFactory adapterFactory) {
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

            addHostPropertyDescriptor(object);
            addPortPropertyDescriptor(object);
            addUsernamePropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
            addModePropertyDescriptor(object);
            addEcodingPropertyDescriptor(object);
            addSFTPPropertyDescriptor(object);
            addFTPSPropertyDescriptor(object);
            addMethodPropertyDescriptor(object);
            addKeystoreFilePropertyDescriptor(object);
            addKeystorePasswordPropertyDescriptor(object);
            addUsesocksPropertyDescriptor(object);
            addProxyhostPropertyDescriptor(object);
            addProxyportPropertyDescriptor(object);
            addProxyuserPropertyDescriptor(object);
            addProxypasswordPropertyDescriptor(object);
            addCustomEncodePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Host feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHostPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Host_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Host_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__HOST, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Port_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Port_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__PORT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Username feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsernamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Username_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Username_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__USERNAME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Password_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Password_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__PASSWORD, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Mode_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Mode_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__MODE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Ecoding feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEcodingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Ecoding_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Ecoding_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__ECODING, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the SFTP feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSFTPPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_SFTP_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_SFTP_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__SFTP, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the FTPS feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFTPSPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_FTPS_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_FTPS_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__FTPS, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Method feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMethodPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Method_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Method_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__METHOD, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Keystore File feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeystoreFilePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FTPConnection_KeystoreFile_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_KeystoreFile_feature",
                        "_UI_FTPConnection_type"), ConnectionPackage.Literals.FTP_CONNECTION__KEYSTORE_FILE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Keystore Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKeystorePasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FTPConnection_KeystorePassword_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_KeystorePassword_feature",
                        "_UI_FTPConnection_type"), ConnectionPackage.Literals.FTP_CONNECTION__KEYSTORE_PASSWORD, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Usesocks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsesocksPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Usesocks_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Usesocks_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__USESOCKS, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proxyhost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProxyhostPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Proxyhost_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Proxyhost_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__PROXYHOST, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proxyport feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProxyportPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Proxyport_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Proxyport_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__PROXYPORT, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proxyuser feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProxyuserPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_FTPConnection_Proxyuser_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Proxyuser_feature", "_UI_FTPConnection_type"),
                ConnectionPackage.Literals.FTP_CONNECTION__PROXYUSER, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proxypassword feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProxypasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FTPConnection_Proxypassword_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_Proxypassword_feature",
                        "_UI_FTPConnection_type"), ConnectionPackage.Literals.FTP_CONNECTION__PROXYPASSWORD, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Custom Encode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomEncodePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_FTPConnection_CustomEncode_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_FTPConnection_CustomEncode_feature",
                        "_UI_FTPConnection_type"), ConnectionPackage.Literals.FTP_CONNECTION__CUSTOM_ENCODE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns FTPConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/FTPConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((FTPConnection) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_FTPConnection_type") : getString("_UI_FTPConnection_type")
                + " " + label;
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

        switch (notification.getFeatureID(FTPConnection.class)) {
        case ConnectionPackage.FTP_CONNECTION__HOST:
        case ConnectionPackage.FTP_CONNECTION__PORT:
        case ConnectionPackage.FTP_CONNECTION__USERNAME:
        case ConnectionPackage.FTP_CONNECTION__PASSWORD:
        case ConnectionPackage.FTP_CONNECTION__MODE:
        case ConnectionPackage.FTP_CONNECTION__ECODING:
        case ConnectionPackage.FTP_CONNECTION__SFTP:
        case ConnectionPackage.FTP_CONNECTION__FTPS:
        case ConnectionPackage.FTP_CONNECTION__METHOD:
        case ConnectionPackage.FTP_CONNECTION__KEYSTORE_FILE:
        case ConnectionPackage.FTP_CONNECTION__KEYSTORE_PASSWORD:
        case ConnectionPackage.FTP_CONNECTION__USESOCKS:
        case ConnectionPackage.FTP_CONNECTION__PROXYHOST:
        case ConnectionPackage.FTP_CONNECTION__PROXYPORT:
        case ConnectionPackage.FTP_CONNECTION__PROXYUSER:
        case ConnectionPackage.FTP_CONNECTION__PROXYPASSWORD:
        case ConnectionPackage.FTP_CONNECTION__CUSTOM_ENCODE:
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
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == CorePackage.Literals.NAMESPACE__OWNED_ELEMENT
                || childFeature == SoftwaredeploymentPackage.Literals.DATA_PROVIDER__RESOURCE_CONNECTION;

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
