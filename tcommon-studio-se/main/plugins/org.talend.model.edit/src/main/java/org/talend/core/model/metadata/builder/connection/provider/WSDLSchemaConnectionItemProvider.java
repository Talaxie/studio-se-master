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
import org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WSDLSchemaConnectionItemProvider extends ConnectionItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WSDLSchemaConnectionItemProvider(AdapterFactory adapterFactory) {
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

            addWSDLPropertyDescriptor(object);
            addNeedAuthPropertyDescriptor(object);
            addMethodNamePropertyDescriptor(object);
            addParametersPropertyDescriptor(object);
            addUserNamePropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
            addUseProxyPropertyDescriptor(object);
            addProxyHostPropertyDescriptor(object);
            addProxyPortPropertyDescriptor(object);
            addProxyUserPropertyDescriptor(object);
            addProxyPasswordPropertyDescriptor(object);
            addValuePropertyDescriptor(object);
            addEndpointURIPropertyDescriptor(object);
            addEncodingPropertyDescriptor(object);
            addTimeOutPropertyDescriptor(object);
            addIsInputModelPropertyDescriptor(object);
            addServerNameSpacePropertyDescriptor(object);
            addServerNamePropertyDescriptor(object);
            addPortNameSpacePropertyDescriptor(object);
            addPortNamePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the WSDL feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWSDLPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_WSDL_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_WSDL_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__WSDL, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Need Auth feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNeedAuthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_needAuth_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_needAuth_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__NEED_AUTH, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Method Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMethodNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_methodName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_methodName_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__METHOD_NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Parameters feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParametersPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_parameters_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_parameters_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PARAMETERS, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
                getString("_UI_WSDLSchemaConnection_UserName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_UserName_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__USER_NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
                getString("_UI_WSDLSchemaConnection_Password_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_Password_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PASSWORD, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
                getString("_UI_WSDLSchemaConnection_useProxy_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_useProxy_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__USE_PROXY, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
                getString("_UI_WSDLSchemaConnection_proxyHost_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_proxyHost_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PROXY_HOST, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
                getString("_UI_WSDLSchemaConnection_proxyPort_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_proxyPort_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PROXY_PORT, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Proxy User feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProxyUserPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_proxyUser_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_proxyUser_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PROXY_USER, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
                getString("_UI_WSDLSchemaConnection_proxyPassword_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_proxyPassword_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PROXY_PASSWORD,
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
                getString("_UI_WSDLSchemaConnection_Value_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_Value_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__VALUE, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Endpoint URI feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndpointURIPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_EndpointURI_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_EndpointURI_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__ENDPOINT_URI, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Encoding feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEncodingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_Encoding_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_Encoding_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__ENCODING, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
                getString("_UI_WSDLSchemaConnection_timeOut_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_timeOut_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__TIME_OUT, true,
                false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is Input Model feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsInputModelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_isInputModel_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_isInputModel_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__IS_INPUT_MODEL,
                true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Server Name Space feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServerNameSpacePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_serverNameSpace_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_serverNameSpace_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__SERVER_NAME_SPACE,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Server Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServerNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_serverName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_serverName_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__SERVER_NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Port Name Space feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPortNameSpacePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_portNameSpace_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_portNameSpace_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PORT_NAME_SPACE,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Port Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPortNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_WSDLSchemaConnection_portName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_WSDLSchemaConnection_portName_feature",
                        "_UI_WSDLSchemaConnection_type"), ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PORT_NAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PARAMETER_VALUE);
            childrenFeatures.add(ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__OUTPUT_PARAMETER);
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
     * This returns WSDLSchemaConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/WSDLSchemaConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((WSDLSchemaConnection) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_WSDLSchemaConnection_type")
                : getString("_UI_WSDLSchemaConnection_type") + " " + label;
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

        switch (notification.getFeatureID(WSDLSchemaConnection.class)) {
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__WSDL:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__NEED_AUTH:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__METHOD_NAME:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__PARAMETERS:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__USER_NAME:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__PASSWORD:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__USE_PROXY:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__PROXY_HOST:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__PROXY_PORT:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__PROXY_USER:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__PROXY_PASSWORD:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__VALUE:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__ENDPOINT_URI:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__ENCODING:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__TIME_OUT:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__IS_INPUT_MODEL:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__SERVER_NAME_SPACE:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__SERVER_NAME:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__PORT_NAME_SPACE:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__PORT_NAME:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__PARAMETER_VALUE:
        case ConnectionPackage.WSDL_SCHEMA_CONNECTION__OUTPUT_PARAMETER:
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

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PARAMETER_VALUE,
                ConnectionFactory.eINSTANCE.createWSDLParameter()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__OUTPUT_PARAMETER,
                ConnectionFactory.eINSTANCE.createWSDLParameter()));
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
                || childFeature == SoftwaredeploymentPackage.Literals.DATA_PROVIDER__RESOURCE_CONNECTION
                || childFeature == ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__PARAMETER_VALUE
                || childFeature == ConnectionPackage.Literals.WSDL_SCHEMA_CONNECTION__OUTPUT_PARAMETER;

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
