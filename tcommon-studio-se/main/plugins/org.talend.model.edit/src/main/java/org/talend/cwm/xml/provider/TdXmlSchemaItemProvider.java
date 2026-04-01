/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.cwm.xml.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.talend.core.model.metadata.builder.connection.provider.MetadataEditPlugin;
import org.talend.cwm.relational.RelationalFactory;
import org.talend.cwm.softwaredeployment.SoftwaredeploymentFactory;
import org.talend.cwm.xml.TdXmlSchema;
import org.talend.cwm.xml.XmlFactory;
import org.talend.cwm.xml.XmlPackage;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.resource.xml.provider.SchemaItemProvider;

/**
 * This is the item provider adapter for a {@link org.talend.cwm.xml.TdXmlSchema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TdXmlSchemaItemProvider extends SchemaItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TdXmlSchemaItemProvider(AdapterFactory adapterFactory) {
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

            addXsdFilePathPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Xsd File Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXsdFilePathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_TdXmlSchema_xsdFilePath_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_TdXmlSchema_xsdFilePath_feature", "_UI_TdXmlSchema_type"),
                XmlPackage.Literals.TD_XML_SCHEMA__XSD_FILE_PATH, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null, null));
    }

    /**
     * This returns TdXmlSchema.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/TdXmlSchema"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((TdXmlSchema) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_TdXmlSchema_type") : getString("_UI_TdXmlSchema_type") + " "
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

        switch (notification.getFeatureID(TdXmlSchema.class)) {
        case XmlPackage.TD_XML_SCHEMA__XSD_FILE_PATH:
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

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                XmlFactory.eINSTANCE.createTdXmlElementType()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                XmlFactory.eINSTANCE.createTdXmlContent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                XmlFactory.eINSTANCE.createTdXmlSchema()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createMetadata()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createMetadataColumn()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createMetadataTable()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createDelimitedFileConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createPositionalFileConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createEbcdicConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createMDMConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createDatabaseConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createSAPConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createSAPFunctionUnit()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createSAPIDocUnit()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createSAPFunctionParameterColumn()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createSAPFunctionParameterTable()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createInputSAPFunctionParameterTable()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createOutputSAPFunctionParameterTable()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createRegexpFileConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createXmlFileConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createQuery()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createLdifFileConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createFileExcelConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createGenericSchemaConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createLDAPSchemaConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createWSDLSchemaConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createSalesforceSchemaConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createCDCType()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createSubscriberTable()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createSAPTestInputParameterTable()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createConcept()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createHL7Connection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createHeaderFooterConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createGenericPackage()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createFTPConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createBRMSConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ConnectionFactory.eINSTANCE.createValidationRulesConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RelationalFactory.eINSTANCE.createTdTable()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RelationalFactory.eINSTANCE.createTdView()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RelationalFactory.eINSTANCE.createTdColumn()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RelationalFactory.eINSTANCE.createTdSqlDataType()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RelationalFactory.eINSTANCE.createTdTrigger()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RelationalFactory.eINSTANCE.createTdProcedure()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                SoftwaredeploymentFactory.eINSTANCE.createTdDataManager()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                SoftwaredeploymentFactory.eINSTANCE.createTdSoftwareSystem()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                SoftwaredeploymentFactory.eINSTANCE.createTdMachine()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return MetadataEditPlugin.INSTANCE;
    }

}
