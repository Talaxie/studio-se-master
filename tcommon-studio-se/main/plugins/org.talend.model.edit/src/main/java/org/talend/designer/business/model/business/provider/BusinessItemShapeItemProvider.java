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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.talend.designer.business.model.business.BusinessItemShape;
import org.talend.designer.business.model.business.BusinessPackage;

/**
 * This is the item provider adapter for a {@link org.talend.designer.business.model.business.BusinessItemShape} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class BusinessItemShapeItemProvider extends BusinessItemItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BusinessItemShapeItemProvider(AdapterFactory adapterFactory) {
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

            addIncomingRelationshipsPropertyDescriptor(object);
            addOutgoingRelationshipsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Incoming Relationships feature. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated NOT
     */
    protected void addIncomingRelationshipsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BusinessItemShape_incomingRelationships_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_BusinessItemShape_incomingRelationships_feature", "_UI_BusinessItemShape_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BusinessPackage.Literals.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Outgoing Relationships feature. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated NOT
     */
    protected void addOutgoingRelationshipsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BusinessItemShape_outgoingRelationships_feature"), //$NON-NLS-1$
                 getString("_UI_PropertyDescriptor_description", "_UI_BusinessItemShape_outgoingRelationships_feature", "_UI_BusinessItemShape_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                 BusinessPackage.Literals.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public String getText(Object object) {
        String label = ((BusinessItemShape)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_BusinessItemShape_type") : //$NON-NLS-1$
            getString("_UI_BusinessItemShape_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

}
