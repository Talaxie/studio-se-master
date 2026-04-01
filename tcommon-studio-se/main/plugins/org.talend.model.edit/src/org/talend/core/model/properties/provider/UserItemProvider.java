/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.User;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.User} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserItemProvider
    extends ItemProviderAdapter
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
    public UserItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addIdPropertyDescriptor(object);
            addLoginPropertyDescriptor(object);
            addPasswordPropertyDescriptor(object);
            addFirstNamePropertyDescriptor(object);
            addLastNamePropertyDescriptor(object);
            addCreationDatePropertyDescriptor(object);
            addDeleteDatePropertyDescriptor(object);
            addDeletedPropertyDescriptor(object);
            addAllowedToModifyComponentsPropertyDescriptor(object);
            addCommentPropertyDescriptor(object);
            addProjectAuthorizationPropertyDescriptor(object);
            addModuleAuthorizationPropertyDescriptor(object);
            addPreferredDashboardConnectionPropertyDescriptor(object);
            addLastAdminConnectionDatePropertyDescriptor(object);
            addLastStudioConnectionDatePropertyDescriptor(object);
            addFirstAdminConnectionDatePropertyDescriptor(object);
            addFirstStudioConnectionDatePropertyDescriptor(object);
            addAdminConnexionNumberPropertyDescriptor(object);
            addStudioConnexionNumberPropertyDescriptor(object);
            addAuthenticationInfoPropertyDescriptor(object);
            addLdapIdPropertyDescriptor(object);
            addLanguagePropertyDescriptor(object);
            addRolePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_id_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Login feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoginPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_login_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_login_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__LOGIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_password_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_password_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__PASSWORD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the First Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFirstNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_firstName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_firstName_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__FIRST_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_lastName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_lastName_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__LAST_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Creation Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCreationDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_creationDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_creationDate_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__CREATION_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Delete Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeleteDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_deleteDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_deleteDate_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__DELETE_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Deleted feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeletedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_deleted_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_deleted_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__DELETED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Allowed To Modify Components feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAllowedToModifyComponentsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_allowedToModifyComponents_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_allowedToModifyComponents_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__ALLOWED_TO_MODIFY_COMPONENTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Comment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCommentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_Comment_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_Comment_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__COMMENT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Role feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRolePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_role_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_role_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__ROLE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Project Authorization feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProjectAuthorizationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_projectAuthorization_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_projectAuthorization_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__PROJECT_AUTHORIZATION,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Module Authorization feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModuleAuthorizationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_moduleAuthorization_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_moduleAuthorization_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__MODULE_AUTHORIZATION,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Preferred Dashboard Connection feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPreferredDashboardConnectionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_preferredDashboardConnection_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_preferredDashboardConnection_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__PREFERRED_DASHBOARD_CONNECTION,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Admin Connection Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastAdminConnectionDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_lastAdminConnectionDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_lastAdminConnectionDate_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__LAST_ADMIN_CONNECTION_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Last Studio Connection Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLastStudioConnectionDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_lastStudioConnectionDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_lastStudioConnectionDate_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__LAST_STUDIO_CONNECTION_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the First Admin Connection Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFirstAdminConnectionDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_firstAdminConnectionDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_firstAdminConnectionDate_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__FIRST_ADMIN_CONNECTION_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the First Studio Connection Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFirstStudioConnectionDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_firstStudioConnectionDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_firstStudioConnectionDate_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__FIRST_STUDIO_CONNECTION_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Admin Connexion Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAdminConnexionNumberPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_adminConnexionNumber_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_adminConnexionNumber_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__ADMIN_CONNEXION_NUMBER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Studio Connexion Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStudioConnexionNumberPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_studioConnexionNumber_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_studioConnexionNumber_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__STUDIO_CONNEXION_NUMBER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Authentication Info feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuthenticationInfoPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_authenticationInfo_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_authenticationInfo_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__AUTHENTICATION_INFO,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Ldap Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLdapIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_ldapId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_ldapId_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__LDAP_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Language feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLanguagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_User_language_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_User_language_feature", "_UI_User_type"),
                 PropertiesPackage.Literals.USER__LANGUAGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns User.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/User"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        User user = (User)object;
        return getString("_UI_User_type") + " " + user.getId();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(User.class)) {
            case PropertiesPackage.USER__ID:
            case PropertiesPackage.USER__LOGIN:
            case PropertiesPackage.USER__PASSWORD:
            case PropertiesPackage.USER__FIRST_NAME:
            case PropertiesPackage.USER__LAST_NAME:
            case PropertiesPackage.USER__CREATION_DATE:
            case PropertiesPackage.USER__DELETE_DATE:
            case PropertiesPackage.USER__DELETED:
            case PropertiesPackage.USER__ALLOWED_TO_MODIFY_COMPONENTS:
            case PropertiesPackage.USER__COMMENT:
            case PropertiesPackage.USER__LAST_ADMIN_CONNECTION_DATE:
            case PropertiesPackage.USER__LAST_STUDIO_CONNECTION_DATE:
            case PropertiesPackage.USER__FIRST_ADMIN_CONNECTION_DATE:
            case PropertiesPackage.USER__FIRST_STUDIO_CONNECTION_DATE:
            case PropertiesPackage.USER__ADMIN_CONNEXION_NUMBER:
            case PropertiesPackage.USER__STUDIO_CONNEXION_NUMBER:
            case PropertiesPackage.USER__AUTHENTICATION_INFO:
            case PropertiesPackage.USER__LDAP_ID:
            case PropertiesPackage.USER__LANGUAGE:
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
    protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator() {
        return PropertiesEditPlugin.INSTANCE;
    }

}
