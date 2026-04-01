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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.talend.core.model.properties.Project;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.Project} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectItemProvider
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
    public ProjectItemProvider(AdapterFactory adapterFactory) {
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
            addLabelPropertyDescriptor(object);
            addDescriptionPropertyDescriptor(object);
            addLanguagePropertyDescriptor(object);
            addTechnicalLabelPropertyDescriptor(object);
            addLocalPropertyDescriptor(object);
            addDeletedPropertyDescriptor(object);
            addDeleteDatePropertyDescriptor(object);
            addCreationDatePropertyDescriptor(object);
            addAuthorPropertyDescriptor(object);
            addUserAuthorizationPropertyDescriptor(object);
            addAllowedComponentsPropertyDescriptor(object);
            addReferencedProjectsPropertyDescriptor(object);
            addAvailableRefProjectPropertyDescriptor(object);
            addMigrationTasksPropertyDescriptor(object);
            addMasterJobIdPropertyDescriptor(object);
            addProductVersionPropertyDescriptor(object);
            addUrlPropertyDescriptor(object);
            addStatAndLogsSettingsPropertyDescriptor(object);
            addImplicitContextSettingsPropertyDescriptor(object);
            addHidePasswordPropertyDescriptor(object);
            addReferencePropertyDescriptor(object);
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
                 getString("_UI_Project_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_id_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_label_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_label_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Description feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDescriptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_description_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_description_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__DESCRIPTION,
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
                 getString("_UI_Project_language_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_language_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__LANGUAGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Technical Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTechnicalLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_technicalLabel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_technicalLabel_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__TECHNICAL_LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Local feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_local_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_local_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__LOCAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                 getString("_UI_Project_deleted_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_deleted_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__DELETED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                 getString("_UI_Project_deleteDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_deleteDate_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__DELETE_DATE,
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
                 getString("_UI_Project_creationDate_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_creationDate_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__CREATION_DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Author feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuthorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_author_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_author_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__AUTHOR,
                 true,
                 false,
                 false,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the User Authorization feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUserAuthorizationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_userAuthorization_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_userAuthorization_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__USER_AUTHORIZATION,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Allowed Components feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAllowedComponentsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_allowedComponents_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_allowedComponents_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__ALLOWED_COMPONENTS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Referenced Projects feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferencedProjectsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_referencedProjects_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_referencedProjects_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__REFERENCED_PROJECTS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Available Ref Project feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAvailableRefProjectPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_availableRefProject_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_availableRefProject_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__AVAILABLE_REF_PROJECT,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Migration Tasks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMigrationTasksPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_migrationTasks_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_migrationTasks_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__MIGRATION_TASKS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Master Job Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMasterJobIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_masterJobId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_masterJobId_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__MASTER_JOB_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Product Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProductVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_productVersion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_productVersion_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__PRODUCT_VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Url feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUrlPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_url_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_url_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__URL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Stat And Logs Settings feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatAndLogsSettingsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_statAndLogsSettings_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_statAndLogsSettings_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__STAT_AND_LOGS_SETTINGS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Implicit Context Settings feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addImplicitContextSettingsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_implicitContextSettings_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_implicitContextSettings_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__IMPLICIT_CONTEXT_SETTINGS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Hide Password feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHidePasswordPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_hidePassword_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_hidePassword_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__HIDE_PASSWORD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferencePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Project_reference_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Project_reference_feature", "_UI_Project_type"),
                 PropertiesPackage.Literals.PROJECT__REFERENCE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
    public Collection getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(PropertiesPackage.Literals.PROJECT__TECHNICAL_STATUS);
            childrenFeatures.add(PropertiesPackage.Literals.PROJECT__DOCUMENTATION_STATUS);
            childrenFeatures.add(PropertiesPackage.Literals.PROJECT__FOLDERS);
            childrenFeatures.add(PropertiesPackage.Literals.PROJECT__SPAGO_BI_SERVER);
            childrenFeatures.add(PropertiesPackage.Literals.PROJECT__COMPONENTS_SETTINGS);
            childrenFeatures.add(PropertiesPackage.Literals.PROJECT__ITEMS_RELATIONS);
            childrenFeatures.add(PropertiesPackage.Literals.PROJECT__CUSTOM_COMPONENT_SETTINGS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Project.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Project"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        Project project = (Project)object;
        return getString("_UI_Project_type") + " " + project.getId();
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

        switch (notification.getFeatureID(Project.class)) {
            case PropertiesPackage.PROJECT__ID:
            case PropertiesPackage.PROJECT__LABEL:
            case PropertiesPackage.PROJECT__DESCRIPTION:
            case PropertiesPackage.PROJECT__LANGUAGE:
            case PropertiesPackage.PROJECT__TECHNICAL_LABEL:
            case PropertiesPackage.PROJECT__LOCAL:
            case PropertiesPackage.PROJECT__DELETED:
            case PropertiesPackage.PROJECT__DELETE_DATE:
            case PropertiesPackage.PROJECT__CREATION_DATE:
            case PropertiesPackage.PROJECT__AUTHOR:
            case PropertiesPackage.PROJECT__MIGRATION_TASKS:
            case PropertiesPackage.PROJECT__MASTER_JOB_ID:
            case PropertiesPackage.PROJECT__PRODUCT_VERSION:
            case PropertiesPackage.PROJECT__URL:
            case PropertiesPackage.PROJECT__HIDE_PASSWORD:
            case PropertiesPackage.PROJECT__REFERENCE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case PropertiesPackage.PROJECT__TECHNICAL_STATUS:
            case PropertiesPackage.PROJECT__DOCUMENTATION_STATUS:
            case PropertiesPackage.PROJECT__FOLDERS:
            case PropertiesPackage.PROJECT__SPAGO_BI_SERVER:
            case PropertiesPackage.PROJECT__COMPONENTS_SETTINGS:
            case PropertiesPackage.PROJECT__ITEMS_RELATIONS:
            case PropertiesPackage.PROJECT__CUSTOM_COMPONENT_SETTINGS:
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
    protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.PROJECT__TECHNICAL_STATUS,
                 PropertiesFactory.eINSTANCE.createStatus()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.PROJECT__DOCUMENTATION_STATUS,
                 PropertiesFactory.eINSTANCE.createStatus()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.PROJECT__FOLDERS,
                 PropertiesFactory.eINSTANCE.createFolderItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.PROJECT__SPAGO_BI_SERVER,
                 PropertiesFactory.eINSTANCE.createSpagoBiServer()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.PROJECT__COMPONENTS_SETTINGS,
                 PropertiesFactory.eINSTANCE.createComponentSetting()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.PROJECT__ITEMS_RELATIONS,
                 PropertiesFactory.eINSTANCE.createItemRelations()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.PROJECT__CUSTOM_COMPONENT_SETTINGS,
                 PropertiesFactory.eINSTANCE.createCustomComponentSetting()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == PropertiesPackage.Literals.PROJECT__TECHNICAL_STATUS ||
            childFeature == PropertiesPackage.Literals.PROJECT__DOCUMENTATION_STATUS;

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
    public ResourceLocator getResourceLocator() {
        return PropertiesEditPlugin.INSTANCE;
    }

}
