/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business.provider;

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
import org.talend.designer.business.model.business.BusinessPackage;
import org.talend.designer.business.model.business.TalendItem;

/**
 * This is the item provider adapter for a {@link org.talend.designer.business.model.business.TalendItem} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TalendItemItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TalendItemItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public List getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addIdPropertyDescriptor(object);
            addLabelPropertyDescriptor(object);
            addAuthorPropertyDescriptor(object);
            addVersionPropertyDescriptor(object);
            addCommentPropertyDescriptor(object);
            addAssignmentsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    protected void addIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendItem_id_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendItem_id_feature", "_UI_TalendItem_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BusinessPackage.Literals.TALEND_ITEM__ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Label feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    protected void addLabelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendItem_label_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendItem_label_feature", "_UI_TalendItem_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BusinessPackage.Literals.TALEND_ITEM__LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Author feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    protected void addAuthorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendItem_author_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendItem_author_feature", "_UI_TalendItem_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BusinessPackage.Literals.TALEND_ITEM__AUTHOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Version feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    protected void addVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendItem_version_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendItem_version_feature", "_UI_TalendItem_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BusinessPackage.Literals.TALEND_ITEM__VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Comment feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    protected void addCommentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendItem_comment_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendItem_comment_feature", "_UI_TalendItem_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BusinessPackage.Literals.TALEND_ITEM__COMMENT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Assignments feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    protected void addAssignmentsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_TalendItem_assignments_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_TalendItem_assignments_feature", "_UI_TalendItem_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BusinessPackage.Literals.TALEND_ITEM__ASSIGNMENTS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns TalendItem.gif.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TalendItem")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public String getText(Object object) {
        TalendItem talendItem = (TalendItem) object;
        return talendItem.getLabel();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
     * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(TalendItem.class)) {
            case BusinessPackage.TALEND_ITEM__ID:
            case BusinessPackage.TALEND_ITEM__LABEL:
            case BusinessPackage.TALEND_ITEM__AUTHOR:
            case BusinessPackage.TALEND_ITEM__VERSION:
            case BusinessPackage.TALEND_ITEM__COMMENT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator() {
        return BusinessEditPlugin.INSTANCE;
    }

}
