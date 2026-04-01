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
import org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LDAPSchemaConnectionItemProvider extends ConnectionItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LDAPSchemaConnectionItemProvider(AdapterFactory adapterFactory) {
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
            addProtocolPropertyDescriptor(object);
            addFilterPropertyDescriptor(object);
            addSeparatorPropertyDescriptor(object);
            addUseAdvancedPropertyDescriptor(object);
            addStorePathPropertyDescriptor(object);
            addUseLimitPropertyDescriptor(object);
            addUseAuthenPropertyDescriptor(object);
            addBindPrincipalPropertyDescriptor(object);
            addBindPasswordPropertyDescriptor(object);
            addLimitValuePropertyDescriptor(object);
            addEncryptionMethodNamePropertyDescriptor(object);
            addValuePropertyDescriptor(object);
            addSavePasswordPropertyDescriptor(object);
            addAliasesPropertyDescriptor(object);
            addReferralsPropertyDescriptor(object);
            addCountLimitPropertyDescriptor(object);
            addTimeOutLimitPropertyDescriptor(object);
            addBaseDNsPropertyDescriptor(object);
            addGetBaseDNsFromRootPropertyDescriptor(object);
            addReturnAttributesPropertyDescriptor(object);
            addSelectedDNPropertyDescriptor(object);
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
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_Host_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_Host_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__HOST, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Port feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPortPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_Port_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_Port_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__PORT, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Protocol feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProtocolPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_Protocol_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_Protocol_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__PROTOCOL, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Filter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFilterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_Filter_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_Filter_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__FILTER, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Separator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeparatorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_Separator_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_Separator_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__SEPARATOR, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Advanced feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseAdvancedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_UseAdvanced_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_UseAdvanced_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__USE_ADVANCED, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Store Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStorePathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_StorePath_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_StorePath_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__STORE_PATH, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseLimitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_UseLimit_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_UseLimit_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__USE_LIMIT, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Use Authen feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseAuthenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_UseAuthen_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_UseAuthen_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__USE_AUTHEN, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Bind Principal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBindPrincipalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_BindPrincipal_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_BindPrincipal_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__BIND_PRINCIPAL,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Bind Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBindPasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_BindPassword_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_BindPassword_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__BIND_PASSWORD, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Limit Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLimitValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_LimitValue_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_LimitValue_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__LIMIT_VALUE, true,
                false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Encryption Method Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEncryptionMethodNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_EncryptionMethodName_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_EncryptionMethodName_feature",
                        "_UI_LDAPSchemaConnection_type"),
                ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__ENCRYPTION_METHOD_NAME, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
                getString("_UI_LDAPSchemaConnection_Value_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_Value_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__VALUE, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Save Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSavePasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_SavePassword_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_SavePassword_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__SAVE_PASSWORD, true,
                false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Aliases feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAliasesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_Aliases_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_Aliases_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__ALIASES, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Referrals feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferralsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_Referrals_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_Referrals_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__REFERRALS, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Count Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCountLimitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_CountLimit_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_CountLimit_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__COUNT_LIMIT, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Time Out Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeOutLimitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_TimeOutLimit_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_TimeOutLimit_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__TIME_OUT_LIMIT,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Base DNs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBaseDNsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_BaseDNs_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_BaseDNs_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__BASE_DNS, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Get Base DNs From Root feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGetBaseDNsFromRootPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_GetBaseDNsFromRoot_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_GetBaseDNsFromRoot_feature",
                        "_UI_LDAPSchemaConnection_type"),
                ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__GET_BASE_DNS_FROM_ROOT, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Return Attributes feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReturnAttributesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_ReturnAttributes_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_ReturnAttributes_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__RETURN_ATTRIBUTES,
                true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Selected DN feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSelectedDNPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_LDAPSchemaConnection_SelectedDN_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_LDAPSchemaConnection_SelectedDN_feature",
                        "_UI_LDAPSchemaConnection_type"), ConnectionPackage.Literals.LDAP_SCHEMA_CONNECTION__SELECTED_DN, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns LDAPSchemaConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/LDAPSchemaConnection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((LDAPSchemaConnection) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_LDAPSchemaConnection_type")
                : getString("_UI_LDAPSchemaConnection_type") + " " + label;
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

        switch (notification.getFeatureID(LDAPSchemaConnection.class)) {
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__HOST:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__PORT:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__PROTOCOL:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__FILTER:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__SEPARATOR:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__USE_ADVANCED:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__STORE_PATH:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__USE_LIMIT:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__USE_AUTHEN:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__BIND_PRINCIPAL:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__BIND_PASSWORD:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__LIMIT_VALUE:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__ENCRYPTION_METHOD_NAME:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__VALUE:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__SAVE_PASSWORD:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__ALIASES:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__REFERRALS:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__COUNT_LIMIT:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__TIME_OUT_LIMIT:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__BASE_DNS:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__GET_BASE_DNS_FROM_ROOT:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__RETURN_ATTRIBUTES:
        case ConnectionPackage.LDAP_SCHEMA_CONNECTION__SELECTED_DN:
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
