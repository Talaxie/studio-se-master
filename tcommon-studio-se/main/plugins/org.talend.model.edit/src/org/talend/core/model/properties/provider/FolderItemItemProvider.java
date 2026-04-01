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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.talend.core.model.properties.FolderItem;
import org.talend.core.model.properties.FolderType;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.properties.FolderItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FolderItemItemProvider
    extends ItemItemProvider
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
    public FolderItemItemProvider(AdapterFactory adapterFactory) {
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

            addTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FolderItem_type_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FolderItem_type_feature", "_UI_FolderItem_type"),
                 PropertiesPackage.Literals.FOLDER_ITEM__TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            childrenFeatures.add(PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN);
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
     * This returns FolderItem.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/FolderItem"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object) {
        FolderType labelValue = ((FolderItem)object).getType();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ?
            getString("_UI_FolderItem_type") :
            getString("_UI_FolderItem_type") + " " + label;
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

        switch (notification.getFeatureID(FolderItem.class)) {
            case PropertiesPackage.FOLDER_ITEM__TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case PropertiesPackage.FOLDER_ITEM__CHILDREN:
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
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createLinkDocumentationItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createBusinessProcessItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createDocumentationItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createRoutineItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createSnippetItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createDelimitedFileConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createPositionalFileConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createRegExFileConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createCSVFileConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createDatabaseConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createSAPConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createXmlFileConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createLdifFileConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createExcelFileConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createEbcdicConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createMDMConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createProcessItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createFolderItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createContextItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createGenericSchemaConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createLDAPSchemaConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createSalesforceSchemaConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createJobletProcessItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createJobDocumentationItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createJobletDocumentationItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createWSDLSchemaConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createSQLPatternItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createRulesItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createSVGBusinessProcessItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createLinkRulesItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createHL7ConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createHeaderFooterConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createFTPConnectionItem()));

        newChildDescriptors.add
            (createChildParameter
                (PropertiesPackage.Literals.FOLDER_ITEM__CHILDREN,
                 PropertiesFactory.eINSTANCE.createTDQItem()));
    }

}
