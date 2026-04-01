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
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.cwm.relational.RelationalFactory;
import org.talend.cwm.softwaredeployment.SoftwaredeploymentFactory;
import org.talend.cwm.xml.XmlFactory;
import orgomg.cwm.analysis.businessnomenclature.BusinessnomenclatureFactory;
import orgomg.cwm.analysis.datamining.DataminingFactory;
import orgomg.cwm.analysis.informationvisualization.InformationvisualizationFactory;
import orgomg.cwm.analysis.olap.OlapFactory;
import orgomg.cwm.analysis.transformation.TransformationFactory;
import orgomg.cwm.foundation.businessinformation.BusinessinformationFactory;
import orgomg.cwm.foundation.datatypes.DatatypesFactory;
import orgomg.cwm.foundation.keysindexes.KeysindexesFactory;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.foundation.typemapping.TypemappingFactory;
import orgomg.cwm.management.warehouseoperation.WarehouseoperationFactory;
import orgomg.cwm.management.warehouseprocess.WarehouseprocessFactory;
import orgomg.cwm.management.warehouseprocess.events.EventsFactory;
import orgomg.cwm.objectmodel.behavioral.BehavioralFactory;
import orgomg.cwm.objectmodel.core.CoreFactory;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.instance.InstanceFactory;
import orgomg.cwm.objectmodel.relationships.RelationshipsFactory;
import orgomg.cwm.resource.multidimensional.MultidimensionalFactory;
import orgomg.cwm.resource.record.RecordFactory;
import orgomg.cwmmip.CwmmipFactory;
import orgomg.cwmx.analysis.informationreporting.InformationreportingFactory;
import orgomg.cwmx.analysis.informationset.InformationsetFactory;
import orgomg.cwmx.foundation.er.ErFactory;
import orgomg.cwmx.resource.coboldata.CoboldataFactory;
import orgomg.cwmx.resource.dmsii.DmsiiFactory;
import orgomg.cwmx.resource.essbase.EssbaseFactory;
import orgomg.cwmx.resource.express.ExpressFactory;
import orgomg.cwmx.resource.imsdatabase.ImsdatabaseFactory;

/**
 * This is the item provider adapter for a {@link org.talend.core.model.metadata.builder.connection.Connection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionItemProvider extends AbstractMetadataObjectItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionItemProvider(AdapterFactory adapterFactory) {
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

            addImportedElementPropertyDescriptor(object);
            addDataManagerPropertyDescriptor(object);
            addPathnamePropertyDescriptor(object);
            addDeployedSoftwareSystemPropertyDescriptor(object);
            addComponentPropertyDescriptor(object);
            addIsCaseSensitivePropertyDescriptor(object);
            addClientConnectionPropertyDescriptor(object);
            addDataPackagePropertyDescriptor(object);
            addVersionPropertyDescriptor(object);
            addContextModePropertyDescriptor(object);
            addContextIdPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Imported Element feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addImportedElementPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Package_importedElement_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Package_importedElement_feature", "_UI_Package_type"),
                CorePackage.Literals.PACKAGE__IMPORTED_ELEMENT, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Data Manager feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataManagerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Package_dataManager_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Package_dataManager_feature", "_UI_Package_type"),
                CorePackage.Literals.PACKAGE__DATA_MANAGER, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Pathname feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPathnamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DeployedComponent_pathname_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DeployedComponent_pathname_feature",
                        "_UI_DeployedComponent_type"), SoftwaredeploymentPackage.Literals.DEPLOYED_COMPONENT__PATHNAME, true,
                false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Deployed Software System feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeployedSoftwareSystemPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DeployedComponent_deployedSoftwareSystem_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DeployedComponent_deployedSoftwareSystem_feature",
                        "_UI_DeployedComponent_type"),
                SoftwaredeploymentPackage.Literals.DEPLOYED_COMPONENT__DEPLOYED_SOFTWARE_SYSTEM, true, false, true, null, null,
                null));
    }

    /**
     * This adds a property descriptor for the Component feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addComponentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DeployedComponent_component_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DeployedComponent_component_feature",
                        "_UI_DeployedComponent_type"), SoftwaredeploymentPackage.Literals.DEPLOYED_COMPONENT__COMPONENT, true,
                false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Is Case Sensitive feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsCaseSensitivePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_DataManager_isCaseSensitive_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_DataManager_isCaseSensitive_feature",
                                "_UI_DataManager_type"), SoftwaredeploymentPackage.Literals.DATA_MANAGER__IS_CASE_SENSITIVE,
                        true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Client Connection feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClientConnectionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_DataManager_clientConnection_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DataManager_clientConnection_feature",
                        "_UI_DataManager_type"), SoftwaredeploymentPackage.Literals.DATA_MANAGER__CLIENT_CONNECTION, true, false,
                true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Data Package feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataPackagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_DataManager_dataPackage_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_DataManager_dataPackage_feature", "_UI_DataManager_type"),
                SoftwaredeploymentPackage.Literals.DATA_MANAGER__DATA_PACKAGE, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Connection_version_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Connection_version_feature", "_UI_Connection_type"),
                ConnectionPackage.Literals.CONNECTION__VERSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Context Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextModePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Connection_ContextMode_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Connection_ContextMode_feature", "_UI_Connection_type"),
                ConnectionPackage.Literals.CONNECTION__CONTEXT_MODE, true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Context Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Connection_ContextId_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Connection_ContextId_feature", "_UI_Connection_type"),
                ConnectionPackage.Literals.CONNECTION__CONTEXT_ID, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT);
            childrenFeatures.add(SoftwaredeploymentPackage.Literals.DATA_PROVIDER__RESOURCE_CONNECTION);
            childrenFeatures.add(ConnectionPackage.Literals.CONNECTION__QUERIES);
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
     * This returns Connection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Connection"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Connection) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Connection_type") : getString("_UI_Connection_type") + " "
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

        switch (notification.getFeatureID(Connection.class)) {
        case ConnectionPackage.CONNECTION__PATHNAME:
        case ConnectionPackage.CONNECTION__IS_CASE_SENSITIVE:
        case ConnectionPackage.CONNECTION__VERSION:
        case ConnectionPackage.CONNECTION__CONTEXT_MODE:
        case ConnectionPackage.CONNECTION__CONTEXT_ID:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ConnectionPackage.CONNECTION__OWNED_ELEMENT:
        case ConnectionPackage.CONNECTION__RESOURCE_CONNECTION:
        case ConnectionPackage.CONNECTION__QUERIES:
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

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                XmlFactory.eINSTANCE.createTdXmlElementType()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                XmlFactory.eINSTANCE.createTdXmlContent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                XmlFactory.eINSTANCE.createTdXmlSchema()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoreFactory.eINSTANCE.createClass()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoreFactory.eINSTANCE.createDataType()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoreFactory.eINSTANCE.createPackage()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoreFactory.eINSTANCE.createSubsystem()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoreFactory.eINSTANCE.createModel()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoreFactory.eINSTANCE.createAttribute()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoreFactory.eINSTANCE.createConstraint()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoreFactory.eINSTANCE.createDependency()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoreFactory.eINSTANCE.createStereotype()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BehavioralFactory.eINSTANCE.createArgument()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BehavioralFactory.eINSTANCE.createCallAction()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BehavioralFactory.eINSTANCE.createEvent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BehavioralFactory.eINSTANCE.createInterface()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BehavioralFactory.eINSTANCE.createMethod()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BehavioralFactory.eINSTANCE.createOperation()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BehavioralFactory.eINSTANCE.createParameter()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RelationshipsFactory.eINSTANCE.createAssociation()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RelationshipsFactory.eINSTANCE.createAssociationEnd()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RelationshipsFactory.eINSTANCE.createGeneralization()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InstanceFactory.eINSTANCE.createSlot()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InstanceFactory.eINSTANCE.createDataValue()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InstanceFactory.eINSTANCE.createObject()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InstanceFactory.eINSTANCE.createExtent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessinformationFactory.eINSTANCE.createResponsibleParty()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessinformationFactory.eINSTANCE.createTelephone()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessinformationFactory.eINSTANCE.createEmail()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessinformationFactory.eINSTANCE.createLocation()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessinformationFactory.eINSTANCE.createContact()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessinformationFactory.eINSTANCE.createDescription()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessinformationFactory.eINSTANCE.createDocument()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessinformationFactory.eINSTANCE.createResourceLocator()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DatatypesFactory.eINSTANCE.createEnumeration()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DatatypesFactory.eINSTANCE.createEnumerationLiteral()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DatatypesFactory.eINSTANCE.createTypeAlias()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DatatypesFactory.eINSTANCE.createUnion()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DatatypesFactory.eINSTANCE.createUnionMember()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                KeysindexesFactory.eINSTANCE.createUniqueKey()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                KeysindexesFactory.eINSTANCE.createIndex()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                KeysindexesFactory.eINSTANCE.createKeyRelationship()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                KeysindexesFactory.eINSTANCE.createIndexedFeature()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createSite()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createMachine()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createSoftwareSystem()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createDeployedComponent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createDataManager()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createDataProvider()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createProviderConnection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createComponent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createPackageUsage()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TypemappingFactory.eINSTANCE.createTypeMapping()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TypemappingFactory.eINSTANCE.createTypeSystem()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createCatalog()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createSchema()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createColumnSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createNamedColumnSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createTable()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createView()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createQueryColumnSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createSQLDistinctType()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createSQLSimpleType()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createSQLStructuredType()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createColumn()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createProcedure()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createTrigger()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createSQLIndex()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createUniqueConstraint()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createForeignKey()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createSQLIndexColumn()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createPrimaryKey()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createRow()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createColumnValue()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createCheckConstraint()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createRowSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.relational.RelationalFactory.eINSTANCE.createSQLParameter()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RecordFactory.eINSTANCE.createField()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RecordFactory.eINSTANCE.createRecordDef()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RecordFactory.eINSTANCE.createFixedOffsetField()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RecordFactory.eINSTANCE.createRecordFile()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RecordFactory.eINSTANCE.createFieldValue()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RecordFactory.eINSTANCE.createRecord()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RecordFactory.eINSTANCE.createRecordSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                RecordFactory.eINSTANCE.createGroup()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                MultidimensionalFactory.eINSTANCE.createDimension()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                MultidimensionalFactory.eINSTANCE.createMember()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                MultidimensionalFactory.eINSTANCE.createMemberSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                MultidimensionalFactory.eINSTANCE.createMemberValue()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                MultidimensionalFactory.eINSTANCE.createSchema()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.xml.XmlFactory.eINSTANCE.createSchema()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.xml.XmlFactory.eINSTANCE.createElementType()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.xml.XmlFactory.eINSTANCE.createAttribute()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.xml.XmlFactory.eINSTANCE.createContent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.xml.XmlFactory.eINSTANCE.createElementContent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.xml.XmlFactory.eINSTANCE.createMixedContent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.xml.XmlFactory.eINSTANCE.createElementTypeReference()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.xml.XmlFactory.eINSTANCE.createText()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.xml.XmlFactory.eINSTANCE.createElement()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                orgomg.cwm.resource.xml.XmlFactory.eINSTANCE.createDocument()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createTransformation()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createDataObjectSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createTransformationTask()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createTransformationStep()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createTransformationActivity()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createPrecedenceConstraint()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createTransformationUse()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createTransformationMap()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createTransformationTree()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createClassifierMap()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createFeatureMap()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createStepPrecedence()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                TransformationFactory.eINSTANCE.createClassifierFeatureMap()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createContentMap()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createCube()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createCubeDeployment()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createCubeRegion()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createDeploymentGroup()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createDimension()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createDimensionDeployment()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createMemberSelectionGroup()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createMemberSelection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createSchema()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createValueBasedHierarchy()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createLevel()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createCodedLevel()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createMeasure()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                OlapFactory.eINSTANCE.createStructureMap()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createApplicationInputSpecification()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createAttributeUsageRelation()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createCategory()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createCategoryHierarchy()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createCostMatrix()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createMiningAttribute()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createMiningDataSpecification()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createMiningModel()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createMiningModelResult()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createNumericAttribute()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createSupervisedMiningModel()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createCategoricalAttribute()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createOrdinalAttribute()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createMiningSettings()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createClusteringSettings()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createStatisticsSettings()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createSupervisedMiningSettings()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createClassificationSettings()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createRegressionSettings()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createAssociationRulesSettings()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DataminingFactory.eINSTANCE.createApplicationAttribute()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationvisualizationFactory.eINSTANCE.createRenderedObject()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationvisualizationFactory.eINSTANCE.createRenderedObjectSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationvisualizationFactory.eINSTANCE.createRendering()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationvisualizationFactory.eINSTANCE.createXSLRendering()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessnomenclatureFactory.eINSTANCE.createVocabularyElement()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessnomenclatureFactory.eINSTANCE.createNomenclature()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessnomenclatureFactory.eINSTANCE.createTaxonomy()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessnomenclatureFactory.eINSTANCE.createGlossary()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessnomenclatureFactory.eINSTANCE.createBusinessDomain()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessnomenclatureFactory.eINSTANCE.createConcept()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                BusinessnomenclatureFactory.eINSTANCE.createTerm()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                WarehouseprocessFactory.eINSTANCE.createWarehouseStep()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                WarehouseprocessFactory.eINSTANCE.createProcessPackage()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                WarehouseprocessFactory.eINSTANCE.createWarehouseActivity()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EventsFactory.eINSTANCE.createPointInTimeEvent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EventsFactory.eINSTANCE.createCustomCalendarEvent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EventsFactory.eINSTANCE.createCustomCalendar()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EventsFactory.eINSTANCE.createCalendarDate()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EventsFactory.eINSTANCE.createIntervalEvent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EventsFactory.eINSTANCE.createExternalEvent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EventsFactory.eINSTANCE.createInternalEvent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EventsFactory.eINSTANCE.createCascadeEvent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EventsFactory.eINSTANCE.createRetryEvent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                WarehouseoperationFactory.eINSTANCE.createMeasurement()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                WarehouseoperationFactory.eINSTANCE.createChangeRequest()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                WarehouseoperationFactory.eINSTANCE.createTransformationExecution()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                WarehouseoperationFactory.eINSTANCE.createActivityExecution()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                WarehouseoperationFactory.eINSTANCE.createStepExecution()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createEntity()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createNonuniqueKey()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createCandidateKey()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createForeignKey()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createDomain()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createAttribute()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createRelationship()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createRelationshipEnd()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createModelLibrary()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createModel()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createSubjectArea()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ErFactory.eINSTANCE.createPrimaryKey()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createCOBOLFD()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createCOBOLField()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createRenames()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createSection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createWorkingStorageSection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createFileSection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createReportWriterSection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createLinkageSection()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createOccursKey()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createLinageInfo()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createCOBOLFDIndex()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CoboldataFactory.eINSTANCE.createUsage()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createDatabase()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createRemap()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createDataSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createDataItem()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createVariableFormatPart()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createSetStructure()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createAccess()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createSubset()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createAutomaticSubset()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createKeyItem()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createRemapItem()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createFieldBit()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createRemark()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createPhysicalDatabase()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createPhysicalDataSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createDASDLComment()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createPhysicalSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createPhysicalDataSetOverride()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createPhysicalSetOverride()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createPhysicalAccessOverride()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                DmsiiFactory.eINSTANCE.createDASDLProperty()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createDBD()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createPSB()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createPCB()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createSegment()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createSegmentComplex()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createSegmentLogical()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createField()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createDataset()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createSenSegment()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createSenField()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createACBLIB()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createAccessMethod()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createINDEX()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createHIDAM()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createDEDB()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createHDAM()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createMSDB()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createSecondaryIndex()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createExit()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createLCHILD()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createPSBLib()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ImsdatabaseFactory.eINSTANCE.createDBDLib()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createAlias()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createApplication()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createComment()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createConsolidation()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createCurrencyConversion()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createDataStorage()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createDatabase()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createDimension()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createFormula()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createGeneration()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createImmediateParent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createLevel()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createMemberName()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createOLAPServer()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createOutline()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createReplicatedPartition()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createTimeBalance()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createTransparentPartition()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createTwoPassCalculation()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createUDA()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createVarianceReporting()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                EssbaseFactory.eINSTANCE.createLinkedPartition()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createDatabase()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createConjoint()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createProgram()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createModel()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createFormula()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createValueSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createRelation()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createWorksheet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createComposite()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createSimpleDimension()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createAliasDimension()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createAggMap()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createAggMapComponent()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                ExpressFactory.eINSTANCE.createPreComputeClause()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationsetFactory.eINSTANCE.createInformationSet()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationsetFactory.eINSTANCE.createSegment()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationsetFactory.eINSTANCE.createSegmentRegion()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationsetFactory.eINSTANCE.createRule()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationsetFactory.eINSTANCE.createInfoSetAdministration()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationsetFactory.eINSTANCE.createInfoSetDate()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationreportingFactory.eINSTANCE.createReport()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationreportingFactory.eINSTANCE.createReportAttribute()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationreportingFactory.eINSTANCE.createReportExecution()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationreportingFactory.eINSTANCE.createReportField()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationreportingFactory.eINSTANCE.createReportGroup()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                InformationreportingFactory.eINSTANCE.createReportPackage()));

        newChildDescriptors.add(createChildParameter(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                CwmmipFactory.eINSTANCE.createUnitOfInterchange()));

        newChildDescriptors.add(createChildParameter(SoftwaredeploymentPackage.Literals.DATA_PROVIDER__RESOURCE_CONNECTION,
                orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentFactory.eINSTANCE.createProviderConnection()));

        newChildDescriptors.add(createChildParameter(ConnectionPackage.Literals.CONNECTION__QUERIES,
                ConnectionFactory.eINSTANCE.createQueriesConnection()));
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
