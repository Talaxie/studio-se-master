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
import org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SalesforceSchemaConnectionItemProvider extends ConnectionItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SalesforceSchemaConnectionItemProvider(AdapterFactory adapterFactory) {
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

            addWebServiceUrlPropertyDescriptor(object);
            addUserNamePropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
            addModuleNamePropertyDescriptor(object);
            addQueryConditionPropertyDescriptor(object);
            addUseCustomModuleNamePropertyDescriptor(object);
            addUseProxyPropertyDescriptor(object);
            addProxyHostPropertyDescriptor(object);
            addProxyPortPropertyDescriptor(object);
            addProxyUsernamePropertyDescriptor(object);
            addProxyPasswordPropertyDescriptor(object);
            addBatchSizePropertyDescriptor(object);
            addUseHttpProxyPropertyDescriptor(object);
            addUseAlphbetPropertyDescriptor(object);
            addTimeOutPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Web Service Url feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWebServiceUrlPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_webServiceUrl_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_webServiceUrl_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__WEB_SERVICE_URL, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the User Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUserNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_userName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_userName_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__USER_NAME, true, false, false,
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
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_password_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_password_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__PASSWORD, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Module Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModuleNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_moduleName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_moduleName_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__MODULE_NAME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Query Condition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQueryConditionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_queryCondition_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_queryCondition_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__QUERY_CONDITION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Custom Module Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseCustomModuleNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_useCustomModuleName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_useCustomModuleName_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__USE_CUSTOM_MODULE_NAME, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Proxy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseProxyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_useProxy_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_useProxy_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__USE_PROXY, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proxy Host feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProxyHostPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_proxyHost_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_proxyHost_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__PROXY_HOST, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proxy Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProxyPortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_proxyPort_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_proxyPort_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__PROXY_PORT, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proxy Username feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProxyUsernamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_proxyUsername_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_proxyUsername_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__PROXY_USERNAME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proxy Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProxyPasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_proxyPassword_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_proxyPassword_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__PROXY_PASSWORD, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Batch Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBatchSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_batchSize_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_batchSize_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__BATCH_SIZE, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Http Proxy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseHttpProxyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_useHttpProxy_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_useHttpProxy_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__USE_HTTP_PROXY, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Alphbet feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseAlphbetPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_useAlphbet_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_useAlphbet_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__USE_ALPHBET, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Time Out feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeOutPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_SalesforceSchemaConnection_timeOut_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_SalesforceSchemaConnection_timeOut_feature",
                        "_UI_SalesforceSchemaConnection_type"),
                ConnectionPackage.Literals.SALESFORCE_SCHEMA_CONNECTION__TIME_OUT, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns SalesforceSchemaConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SalesforceSchemaConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((SalesforceSchemaConnection) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_SalesforceSchemaConnection_type")
                : getString("_UI_SalesforceSchemaConnection_type") + " " + label;
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

        switch (notification.getFeatureID(SalesforceSchemaConnection.class)) {
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__WEB_SERVICE_URL:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__USER_NAME:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__PASSWORD:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__MODULE_NAME:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__QUERY_CONDITION:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__USE_CUSTOM_MODULE_NAME:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__USE_PROXY:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__PROXY_HOST:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__PROXY_PORT:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__PROXY_USERNAME:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__PROXY_PASSWORD:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__BATCH_SIZE:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__USE_HTTP_PROXY:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__USE_ALPHBET:
        case ConnectionPackage.SALESFORCE_SCHEMA_CONNECTION__TIME_OUT:
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
