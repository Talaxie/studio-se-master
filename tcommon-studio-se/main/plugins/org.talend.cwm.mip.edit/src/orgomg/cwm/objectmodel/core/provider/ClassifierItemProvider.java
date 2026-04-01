/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwm.objectmodel.core.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import orgomg.cwm.analysis.datamining.DataminingFactory;
import orgomg.cwm.analysis.informationvisualization.InformationvisualizationFactory;
import orgomg.cwm.analysis.olap.OlapFactory;
import orgomg.cwm.foundation.datatypes.DatatypesFactory;
import orgomg.cwm.objectmodel.behavioral.BehavioralFactory;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.CoreFactory;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.relationships.RelationshipsFactory;
import orgomg.cwm.resource.multidimensional.MultidimensionalFactory;
import orgomg.cwm.resource.record.RecordFactory;
import orgomg.cwm.resource.relational.RelationalFactory;
import orgomg.cwm.resource.xml.XmlFactory;
import orgomg.cwmx.analysis.informationreporting.InformationreportingFactory;
import orgomg.cwmx.foundation.er.ErFactory;
import orgomg.cwmx.resource.coboldata.CoboldataFactory;
import orgomg.cwmx.resource.dmsii.DmsiiFactory;
import orgomg.cwmx.resource.essbase.EssbaseFactory;
import orgomg.cwmx.resource.express.ExpressFactory;
import orgomg.cwmx.resource.imsdatabase.ImsdatabaseFactory;

/**
 * This is the item provider adapter for a {@link orgomg.cwm.objectmodel.core.Classifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifierItemProvider
    extends NamespaceItemProvider
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
    public ClassifierItemProvider(AdapterFactory adapterFactory) {
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

            addIsAbstractPropertyDescriptor(object);
            addStructuralFeaturePropertyDescriptor(object);
            addParameterPropertyDescriptor(object);
            addGeneralizationPropertyDescriptor(object);
            addSpecializationPropertyDescriptor(object);
            addInstancePropertyDescriptor(object);
            addAliasPropertyDescriptor(object);
            addExpressionNodePropertyDescriptor(object);
            addMappingFromPropertyDescriptor(object);
            addMappingToPropertyDescriptor(object);
            addClassifierMapPropertyDescriptor(object);
            addCfMapPropertyDescriptor(object);
            addDomainPropertyDescriptor(object);
            addSimpleDimensionPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Is Abstract feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsAbstractPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_isAbstract_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_isAbstract_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__IS_ABSTRACT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Structural Feature feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStructuralFeaturePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_structuralFeature_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_structuralFeature_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__STRUCTURAL_FEATURE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Parameter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParameterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_parameter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_parameter_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__PARAMETER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Generalization feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGeneralizationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_generalization_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_generalization_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__GENERALIZATION,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Specialization feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpecializationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_specialization_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_specialization_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__SPECIALIZATION,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Instance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInstancePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_instance_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_instance_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__INSTANCE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Alias feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAliasPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_alias_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_alias_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__ALIAS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Expression Node feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExpressionNodePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_expressionNode_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_expressionNode_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__EXPRESSION_NODE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Mapping From feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMappingFromPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_mappingFrom_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_mappingFrom_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__MAPPING_FROM,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Mapping To feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMappingToPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_mappingTo_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_mappingTo_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__MAPPING_TO,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Classifier Map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClassifierMapPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_classifierMap_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_classifierMap_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__CLASSIFIER_MAP,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Cf Map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCfMapPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_cfMap_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_cfMap_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__CF_MAP,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Domain feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDomainPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_domain_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_domain_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__DOMAIN,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Simple Dimension feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSimpleDimensionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Classifier_simpleDimension_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_simpleDimension_feature", "_UI_Classifier_type"),
                 CorePackage.Literals.CLASSIFIER__SIMPLE_DIMENSION,
                 true,
                 false,
                 true,
                 null,
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
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(CorePackage.Literals.CLASSIFIER__FEATURE);
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Classifier)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Classifier_type") :
            getString("_UI_Classifier_type") + " " + label;
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

        switch (notification.getFeatureID(Classifier.class)) {
            case CorePackage.CLASSIFIER__IS_ABSTRACT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case CorePackage.CLASSIFIER__FEATURE:
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

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 CoreFactory.eINSTANCE.createAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 BehavioralFactory.eINSTANCE.createMethod()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 BehavioralFactory.eINSTANCE.createOperation()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DatatypesFactory.eINSTANCE.createUnionMember()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 RelationalFactory.eINSTANCE.createColumn()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 RelationalFactory.eINSTANCE.createProcedure()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 RecordFactory.eINSTANCE.createField()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 RecordFactory.eINSTANCE.createFixedOffsetField()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 XmlFactory.eINSTANCE.createAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 XmlFactory.eINSTANCE.createElementTypeReference()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 XmlFactory.eINSTANCE.createText()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 OlapFactory.eINSTANCE.createMeasure()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DataminingFactory.eINSTANCE.createMiningAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DataminingFactory.eINSTANCE.createNumericAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DataminingFactory.eINSTANCE.createCategoricalAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DataminingFactory.eINSTANCE.createOrdinalAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DataminingFactory.eINSTANCE.createApplicationAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 InformationvisualizationFactory.eINSTANCE.createRendering()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 InformationvisualizationFactory.eINSTANCE.createXSLRendering()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 ErFactory.eINSTANCE.createAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 ErFactory.eINSTANCE.createRelationshipEnd()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 CoboldataFactory.eINSTANCE.createCOBOLField()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 CoboldataFactory.eINSTANCE.createRenames()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createDatabase()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createDataItem()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createSetStructure()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createSet()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createAccess()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createSubset()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createAutomaticSubset()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createRemapItem()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createRemark()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createPhysicalDataSetOverride()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createPhysicalSetOverride()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 DmsiiFactory.eINSTANCE.createPhysicalAccessOverride()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 ImsdatabaseFactory.eINSTANCE.createField()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 ImsdatabaseFactory.eINSTANCE.createSenField()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createAlias()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createComment()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createConsolidation()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createCurrencyConversion()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createDataStorage()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createFormula()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createGeneration()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createImmediateParent()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createLevel()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createMemberName()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createTimeBalance()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createTwoPassCalculation()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createUDA()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 EssbaseFactory.eINSTANCE.createVarianceReporting()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 ExpressFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 ExpressFactory.eINSTANCE.createFormula()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 ExpressFactory.eINSTANCE.createValueSet()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 ExpressFactory.eINSTANCE.createRelation()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 InformationreportingFactory.eINSTANCE.createReportAttribute()));
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

        boolean qualify =
            childFeature == CorePackage.Literals.NAMESPACE__OWNED_ELEMENT ||
            childFeature == CorePackage.Literals.CLASSIFIER__FEATURE;

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
    @Override
    public ResourceLocator getResourceLocator() {
        return Cwm_mipEditPlugin.INSTANCE;
    }

}
