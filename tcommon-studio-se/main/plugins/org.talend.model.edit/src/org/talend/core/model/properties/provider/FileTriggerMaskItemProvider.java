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

import org.talend.core.model.properties.FileTriggerMask;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.FileTriggerMask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileTriggerMaskItemProvider
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
    public FileTriggerMaskItemProvider(AdapterFactory adapterFactory) {
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
            addActivePropertyDescriptor(object);
            addLabelPropertyDescriptor(object);
            addDescriptionPropertyDescriptor(object);
            addFileTriggerPropertyDescriptor(object);
            addFolderPathPropertyDescriptor(object);
            addFileMaskPropertyDescriptor(object);
            addContextParameterBaseNamePropertyDescriptor(object);
            addCheckFileServerPropertyDescriptor(object);
            addExistPropertyDescriptor(object);
            addCreatedPropertyDescriptor(object);
            addModifiedPropertyDescriptor(object);
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
                 getString("_UI_FileTriggerMask_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_id_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Active feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActivePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FileTriggerMask_active_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_active_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__ACTIVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                 getString("_UI_FileTriggerMask_label_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_label_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__LABEL,
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
                 getString("_UI_FileTriggerMask_description_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_description_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__DESCRIPTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the File Trigger feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileTriggerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FileTriggerMask_fileTrigger_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_fileTrigger_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__FILE_TRIGGER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Folder Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFolderPathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FileTriggerMask_folderPath_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_folderPath_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__FOLDER_PATH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the File Mask feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFileMaskPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FileTriggerMask_fileMask_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_fileMask_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__FILE_MASK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Context Parameter Base Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextParameterBaseNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FileTriggerMask_contextParameterBaseName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_contextParameterBaseName_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__CONTEXT_PARAMETER_BASE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Check File Server feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCheckFileServerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FileTriggerMask_checkFileServer_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_checkFileServer_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__CHECK_FILE_SERVER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Exist feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExistPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FileTriggerMask_exist_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_exist_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__EXIST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Created feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCreatedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FileTriggerMask_created_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_created_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__CREATED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Modified feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModifiedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FileTriggerMask_modified_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FileTriggerMask_modified_feature", "_UI_FileTriggerMask_type"),
                 PropertiesPackage.Literals.FILE_TRIGGER_MASK__MODIFIED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns FileTriggerMask.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/FileTriggerMask"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        FileTriggerMask fileTriggerMask = (FileTriggerMask)object;
        return getString("_UI_FileTriggerMask_type") + " " + fileTriggerMask.getId();
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

        switch (notification.getFeatureID(FileTriggerMask.class)) {
            case PropertiesPackage.FILE_TRIGGER_MASK__ID:
            case PropertiesPackage.FILE_TRIGGER_MASK__ACTIVE:
            case PropertiesPackage.FILE_TRIGGER_MASK__LABEL:
            case PropertiesPackage.FILE_TRIGGER_MASK__DESCRIPTION:
            case PropertiesPackage.FILE_TRIGGER_MASK__FOLDER_PATH:
            case PropertiesPackage.FILE_TRIGGER_MASK__FILE_MASK:
            case PropertiesPackage.FILE_TRIGGER_MASK__CONTEXT_PARAMETER_BASE_NAME:
            case PropertiesPackage.FILE_TRIGGER_MASK__EXIST:
            case PropertiesPackage.FILE_TRIGGER_MASK__CREATED:
            case PropertiesPackage.FILE_TRIGGER_MASK__MODIFIED:
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
