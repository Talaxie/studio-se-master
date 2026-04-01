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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.Metadata;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.Metadata} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataItemProvider extends AbstractMetadataObjectItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MetadataItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add(ConnectionPackage.Literals.METADATA__CONNECTIONS);
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
     * This returns Metadata.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Metadata"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Metadata) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Metadata_type") : getString("_UI_Metadata_type") + " "
                + label;
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

        switch (notification.getFeatureID(Metadata.class)) {
        case ConnectionPackage.METADATA__CONNECTIONS:
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

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createDelimitedFileConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createPositionalFileConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createEbcdicConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createMDMConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createDatabaseConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createSAPConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createRegexpFileConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createXmlFileConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createLdifFileConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createFileExcelConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createGenericSchemaConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createLDAPSchemaConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createWSDLSchemaConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createSalesforceSchemaConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createHL7Connection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createHeaderFooterConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createFTPConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createBRMSConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.METADATA__CONNECTIONS,
                ConnectionFactory.eINSTANCE.createValidationRulesConnection()));
    }

}
