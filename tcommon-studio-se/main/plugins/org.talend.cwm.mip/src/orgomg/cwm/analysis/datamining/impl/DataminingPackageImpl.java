/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import orgomg.cwm.analysis.businessnomenclature.BusinessnomenclaturePackage;
import orgomg.cwm.analysis.businessnomenclature.impl.BusinessnomenclaturePackageImpl;
import orgomg.cwm.analysis.datamining.ApplicationAttribute;
import orgomg.cwm.analysis.datamining.ApplicationInputSpecification;
import orgomg.cwm.analysis.datamining.AssociationRulesSettings;
import orgomg.cwm.analysis.datamining.AttributeType;
import orgomg.cwm.analysis.datamining.AttributeUsage;
import orgomg.cwm.analysis.datamining.AttributeUsageRelation;
import orgomg.cwm.analysis.datamining.CategoricalAttribute;
import orgomg.cwm.analysis.datamining.Category;
import orgomg.cwm.analysis.datamining.CategoryHierarchy;
import orgomg.cwm.analysis.datamining.CategoryProperty;
import orgomg.cwm.analysis.datamining.ClassificationSettings;
import orgomg.cwm.analysis.datamining.ClusteringSettings;
import orgomg.cwm.analysis.datamining.CostMatrix;
import orgomg.cwm.analysis.datamining.DataminingFactory;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningAttribute;
import orgomg.cwm.analysis.datamining.MiningDataSpecification;
import orgomg.cwm.analysis.datamining.MiningModel;
import orgomg.cwm.analysis.datamining.MiningModelResult;
import orgomg.cwm.analysis.datamining.MiningSettings;
import orgomg.cwm.analysis.datamining.NumericAttribute;
import orgomg.cwm.analysis.datamining.OrderType;
import orgomg.cwm.analysis.datamining.OrdinalAttribute;
import orgomg.cwm.analysis.datamining.RegressionSettings;
import orgomg.cwm.analysis.datamining.StatisticsSettings;
import orgomg.cwm.analysis.datamining.SupervisedMiningModel;
import orgomg.cwm.analysis.datamining.SupervisedMiningSettings;
import orgomg.cwm.analysis.informationvisualization.InformationvisualizationPackage;
import orgomg.cwm.analysis.informationvisualization.impl.InformationvisualizationPackageImpl;
import orgomg.cwm.analysis.olap.OlapPackage;
import orgomg.cwm.analysis.olap.impl.OlapPackageImpl;
import orgomg.cwm.analysis.transformation.TransformationPackage;
import orgomg.cwm.analysis.transformation.impl.TransformationPackageImpl;
import orgomg.cwm.foundation.businessinformation.BusinessinformationPackage;
import orgomg.cwm.foundation.businessinformation.impl.BusinessinformationPackageImpl;
import orgomg.cwm.foundation.datatypes.DatatypesPackage;
import orgomg.cwm.foundation.datatypes.impl.DatatypesPackageImpl;
import orgomg.cwm.foundation.expressions.ExpressionsPackage;
import orgomg.cwm.foundation.expressions.impl.ExpressionsPackageImpl;
import orgomg.cwm.foundation.keysindexes.KeysindexesPackage;
import orgomg.cwm.foundation.keysindexes.impl.KeysindexesPackageImpl;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.foundation.softwaredeployment.impl.SoftwaredeploymentPackageImpl;
import orgomg.cwm.foundation.typemapping.TypemappingPackage;
import orgomg.cwm.foundation.typemapping.impl.TypemappingPackageImpl;
import orgomg.cwm.management.warehouseoperation.WarehouseoperationPackage;
import orgomg.cwm.management.warehouseoperation.impl.WarehouseoperationPackageImpl;
import orgomg.cwm.management.warehouseprocess.WarehouseprocessPackage;
import orgomg.cwm.management.warehouseprocess.datatype.DatatypePackage;
import orgomg.cwm.management.warehouseprocess.datatype.impl.DatatypePackageImpl;
import orgomg.cwm.management.warehouseprocess.events.EventsPackage;
import orgomg.cwm.management.warehouseprocess.events.impl.EventsPackageImpl;
import orgomg.cwm.management.warehouseprocess.impl.WarehouseprocessPackageImpl;
import orgomg.cwm.objectmodel.behavioral.BehavioralPackage;
import orgomg.cwm.objectmodel.behavioral.impl.BehavioralPackageImpl;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.core.impl.CorePackageImpl;
import orgomg.cwm.objectmodel.instance.InstancePackage;
import orgomg.cwm.objectmodel.instance.impl.InstancePackageImpl;
import orgomg.cwm.objectmodel.relationships.RelationshipsPackage;
import orgomg.cwm.objectmodel.relationships.impl.RelationshipsPackageImpl;
import orgomg.cwm.resource.multidimensional.MultidimensionalPackage;
import orgomg.cwm.resource.multidimensional.impl.MultidimensionalPackageImpl;
import orgomg.cwm.resource.record.RecordPackage;
import orgomg.cwm.resource.record.impl.RecordPackageImpl;
import orgomg.cwm.resource.relational.RelationalPackage;
import orgomg.cwm.resource.relational.enumerations.EnumerationsPackage;
import orgomg.cwm.resource.relational.enumerations.impl.EnumerationsPackageImpl;
import orgomg.cwm.resource.relational.impl.RelationalPackageImpl;
import orgomg.cwm.resource.xml.XmlPackage;
import orgomg.cwm.resource.xml.impl.XmlPackageImpl;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.impl.CwmmipPackageImpl;
import orgomg.cwmx.analysis.informationreporting.InformationreportingPackage;
import orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl;
import orgomg.cwmx.analysis.informationset.InformationsetPackage;
import orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl;
import orgomg.cwmx.foundation.er.ErPackage;
import orgomg.cwmx.foundation.er.impl.ErPackageImpl;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl;
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.impl.ExpressPackageImpl;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl;
import orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage;
import orgomg.cwmx.resource.imsdatabase.imstypes.impl.ImstypesPackageImpl;
import orgomg.mof.model.ModelPackage;
import orgomg.mof.model.impl.ModelPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DataminingPackageImpl extends EPackageImpl implements DataminingPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationInputSpecificationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeUsageRelationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass categoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass categoryHierarchyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass costMatrixEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass miningAttributeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass miningDataSpecificationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass miningModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass miningModelResultEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass numericAttributeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass supervisedMiningModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass categoricalAttributeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass ordinalAttributeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass miningSettingsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass clusteringSettingsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass statisticsSettingsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass supervisedMiningSettingsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass classificationSettingsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass regressionSettingsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass associationRulesSettingsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationAttributeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum attributeTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum attributeUsageEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum categoryPropertyEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum orderTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
     * package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory
     * method {@link #init init()}, which also performs initialization of the
     * package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DataminingPackageImpl() {
        super(eNS_URI, DataminingFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model,
     * and for any others upon which it depends.
     * 
     * <p>
     * This method is used to initialize {@link DataminingPackage#eINSTANCE}
     * when that field is accessed. Clients should not invoke it directly.
     * Instead, they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DataminingPackage init() {
        if (isInited)
            return (DataminingPackage) EPackage.Registry.INSTANCE.getEPackage(DataminingPackage.eNS_URI);

        // Obtain or create and register package
        DataminingPackageImpl theDataminingPackage = (DataminingPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataminingPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new DataminingPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        CorePackageImpl theCorePackage = (CorePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
        BehavioralPackageImpl theBehavioralPackage = (BehavioralPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(BehavioralPackage.eNS_URI) instanceof BehavioralPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(BehavioralPackage.eNS_URI) : BehavioralPackage.eINSTANCE);
        RelationshipsPackageImpl theRelationshipsPackage = (RelationshipsPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(RelationshipsPackage.eNS_URI) instanceof RelationshipsPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(RelationshipsPackage.eNS_URI) : RelationshipsPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        BusinessinformationPackageImpl theBusinessinformationPackage = (BusinessinformationPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(BusinessinformationPackage.eNS_URI) instanceof BusinessinformationPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(BusinessinformationPackage.eNS_URI) : BusinessinformationPackage.eINSTANCE);
        DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
        ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
        KeysindexesPackageImpl theKeysindexesPackage = (KeysindexesPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(KeysindexesPackage.eNS_URI) instanceof KeysindexesPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(KeysindexesPackage.eNS_URI) : KeysindexesPackage.eINSTANCE);
        SoftwaredeploymentPackageImpl theSoftwaredeploymentPackage = (SoftwaredeploymentPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(SoftwaredeploymentPackage.eNS_URI) instanceof SoftwaredeploymentPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(SoftwaredeploymentPackage.eNS_URI) : SoftwaredeploymentPackage.eINSTANCE);
        TypemappingPackageImpl theTypemappingPackage = (TypemappingPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(TypemappingPackage.eNS_URI) instanceof TypemappingPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(TypemappingPackage.eNS_URI) : TypemappingPackage.eINSTANCE);
        RelationalPackageImpl theRelationalPackage = (RelationalPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(RelationalPackage.eNS_URI) instanceof RelationalPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(RelationalPackage.eNS_URI) : RelationalPackage.eINSTANCE);
        EnumerationsPackageImpl theEnumerationsPackage = (EnumerationsPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(EnumerationsPackage.eNS_URI) instanceof EnumerationsPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(EnumerationsPackage.eNS_URI) : EnumerationsPackage.eINSTANCE);
        RecordPackageImpl theRecordPackage = (RecordPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(RecordPackage.eNS_URI) instanceof RecordPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(RecordPackage.eNS_URI) : RecordPackage.eINSTANCE);
        MultidimensionalPackageImpl theMultidimensionalPackage = (MultidimensionalPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(MultidimensionalPackage.eNS_URI) instanceof MultidimensionalPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(MultidimensionalPackage.eNS_URI) : MultidimensionalPackage.eINSTANCE);
        XmlPackageImpl theXmlPackage = (XmlPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(XmlPackage.eNS_URI) instanceof XmlPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(XmlPackage.eNS_URI) : XmlPackage.eINSTANCE);
        TransformationPackageImpl theTransformationPackage = (TransformationPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(TransformationPackage.eNS_URI) instanceof TransformationPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(TransformationPackage.eNS_URI) : TransformationPackage.eINSTANCE);
        OlapPackageImpl theOlapPackage = (OlapPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(OlapPackage.eNS_URI) instanceof OlapPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(OlapPackage.eNS_URI) : OlapPackage.eINSTANCE);
        InformationvisualizationPackageImpl theInformationvisualizationPackage = (InformationvisualizationPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(InformationvisualizationPackage.eNS_URI) instanceof InformationvisualizationPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(InformationvisualizationPackage.eNS_URI) : InformationvisualizationPackage.eINSTANCE);
        BusinessnomenclaturePackageImpl theBusinessnomenclaturePackage = (BusinessnomenclaturePackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(BusinessnomenclaturePackage.eNS_URI) instanceof BusinessnomenclaturePackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(BusinessnomenclaturePackage.eNS_URI) : BusinessnomenclaturePackage.eINSTANCE);
        WarehouseprocessPackageImpl theWarehouseprocessPackage = (WarehouseprocessPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(WarehouseprocessPackage.eNS_URI) instanceof WarehouseprocessPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(WarehouseprocessPackage.eNS_URI) : WarehouseprocessPackage.eINSTANCE);
        DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
        EventsPackageImpl theEventsPackage = (EventsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
        WarehouseoperationPackageImpl theWarehouseoperationPackage = (WarehouseoperationPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(WarehouseoperationPackage.eNS_URI) instanceof WarehouseoperationPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(WarehouseoperationPackage.eNS_URI) : WarehouseoperationPackage.eINSTANCE);
        ErPackageImpl theErPackage = (ErPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ErPackage.eNS_URI) instanceof ErPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(ErPackage.eNS_URI) : ErPackage.eINSTANCE);
        CoboldataPackageImpl theCoboldataPackage = (CoboldataPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(CoboldataPackage.eNS_URI) instanceof CoboldataPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(CoboldataPackage.eNS_URI) : CoboldataPackage.eINSTANCE);
        DmsiiPackageImpl theDmsiiPackage = (DmsiiPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(DmsiiPackage.eNS_URI) instanceof DmsiiPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(DmsiiPackage.eNS_URI) : DmsiiPackage.eINSTANCE);
        ImsdatabasePackageImpl theImsdatabasePackage = (ImsdatabasePackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ImsdatabasePackage.eNS_URI) instanceof ImsdatabasePackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(ImsdatabasePackage.eNS_URI) : ImsdatabasePackage.eINSTANCE);
        ImstypesPackageImpl theImstypesPackage = (ImstypesPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ImstypesPackage.eNS_URI) instanceof ImstypesPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(ImstypesPackage.eNS_URI) : ImstypesPackage.eINSTANCE);
        EssbasePackageImpl theEssbasePackage = (EssbasePackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(EssbasePackage.eNS_URI) instanceof EssbasePackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(EssbasePackage.eNS_URI) : EssbasePackage.eINSTANCE);
        ExpressPackageImpl theExpressPackage = (ExpressPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ExpressPackage.eNS_URI) instanceof ExpressPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(ExpressPackage.eNS_URI) : ExpressPackage.eINSTANCE);
        InformationsetPackageImpl theInformationsetPackage = (InformationsetPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(InformationsetPackage.eNS_URI) instanceof InformationsetPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(InformationsetPackage.eNS_URI) : InformationsetPackage.eINSTANCE);
        InformationreportingPackageImpl theInformationreportingPackage = (InformationreportingPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(InformationreportingPackage.eNS_URI) instanceof InformationreportingPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(InformationreportingPackage.eNS_URI) : InformationreportingPackage.eINSTANCE);
        CwmmipPackageImpl theCwmmipPackage = (CwmmipPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CwmmipPackage.eNS_URI) instanceof CwmmipPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(CwmmipPackage.eNS_URI) : CwmmipPackage.eINSTANCE);
        ModelPackageImpl theModelPackage = (ModelPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);

        // Create package meta-data objects
        theDataminingPackage.createPackageContents();
        theCorePackage.createPackageContents();
        theBehavioralPackage.createPackageContents();
        theRelationshipsPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theBusinessinformationPackage.createPackageContents();
        theDatatypesPackage.createPackageContents();
        theExpressionsPackage.createPackageContents();
        theKeysindexesPackage.createPackageContents();
        theSoftwaredeploymentPackage.createPackageContents();
        theTypemappingPackage.createPackageContents();
        theRelationalPackage.createPackageContents();
        theEnumerationsPackage.createPackageContents();
        theRecordPackage.createPackageContents();
        theMultidimensionalPackage.createPackageContents();
        theXmlPackage.createPackageContents();
        theTransformationPackage.createPackageContents();
        theOlapPackage.createPackageContents();
        theInformationvisualizationPackage.createPackageContents();
        theBusinessnomenclaturePackage.createPackageContents();
        theWarehouseprocessPackage.createPackageContents();
        theDatatypePackage.createPackageContents();
        theEventsPackage.createPackageContents();
        theWarehouseoperationPackage.createPackageContents();
        theErPackage.createPackageContents();
        theCoboldataPackage.createPackageContents();
        theDmsiiPackage.createPackageContents();
        theImsdatabasePackage.createPackageContents();
        theImstypesPackage.createPackageContents();
        theEssbasePackage.createPackageContents();
        theExpressPackage.createPackageContents();
        theInformationsetPackage.createPackageContents();
        theInformationreportingPackage.createPackageContents();
        theCwmmipPackage.createPackageContents();
        theModelPackage.createPackageContents();

        // Initialize created meta-data
        theDataminingPackage.initializePackageContents();
        theCorePackage.initializePackageContents();
        theBehavioralPackage.initializePackageContents();
        theRelationshipsPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theBusinessinformationPackage.initializePackageContents();
        theDatatypesPackage.initializePackageContents();
        theExpressionsPackage.initializePackageContents();
        theKeysindexesPackage.initializePackageContents();
        theSoftwaredeploymentPackage.initializePackageContents();
        theTypemappingPackage.initializePackageContents();
        theRelationalPackage.initializePackageContents();
        theEnumerationsPackage.initializePackageContents();
        theRecordPackage.initializePackageContents();
        theMultidimensionalPackage.initializePackageContents();
        theXmlPackage.initializePackageContents();
        theTransformationPackage.initializePackageContents();
        theOlapPackage.initializePackageContents();
        theInformationvisualizationPackage.initializePackageContents();
        theBusinessnomenclaturePackage.initializePackageContents();
        theWarehouseprocessPackage.initializePackageContents();
        theDatatypePackage.initializePackageContents();
        theEventsPackage.initializePackageContents();
        theWarehouseoperationPackage.initializePackageContents();
        theErPackage.initializePackageContents();
        theCoboldataPackage.initializePackageContents();
        theDmsiiPackage.initializePackageContents();
        theImsdatabasePackage.initializePackageContents();
        theImstypesPackage.initializePackageContents();
        theEssbasePackage.initializePackageContents();
        theExpressPackage.initializePackageContents();
        theInformationsetPackage.initializePackageContents();
        theInformationreportingPackage.initializePackageContents();
        theCwmmipPackage.initializePackageContents();
        theModelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDataminingPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DataminingPackage.eNS_URI, theDataminingPackage);
        return theDataminingPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getApplicationInputSpecification() {
        return applicationInputSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getApplicationInputSpecification_InputAttribute() {
        return (EReference) applicationInputSpecificationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getApplicationInputSpecification_MiningModel() {
        return (EReference) applicationInputSpecificationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeUsageRelation() {
        return attributeUsageRelationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeUsageRelation_UsageType() {
        return (EAttribute) attributeUsageRelationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeUsageRelation_IncludeInApplyResult() {
        return (EAttribute) attributeUsageRelationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeUsageRelation_Weight() {
        return (EAttribute) attributeUsageRelationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeUsageRelation_SuppressNormalization() {
        return (EAttribute) attributeUsageRelationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeUsageRelation_Settings() {
        return (EReference) attributeUsageRelationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeUsageRelation_Attribute() {
        return (EReference) attributeUsageRelationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCategory() {
        return categoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCategory_DisplayValue() {
        return (EAttribute) categoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCategory_Property() {
        return (EAttribute) categoryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCategory_Value() {
        return (EAttribute) categoryEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategory_CategoricalAttribute() {
        return (EReference) categoryEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCategoryHierarchy() {
        return categoryHierarchyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategoryHierarchy_CategoricalAttribute() {
        return (EReference) categoryHierarchyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCostMatrix() {
        return costMatrixEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCostMatrix_Settings() {
        return (EReference) costMatrixEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMiningAttribute() {
        return miningAttributeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningAttribute_DataSpecification() {
        return (EReference) miningAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningAttribute_AttributeUsage() {
        return (EReference) miningAttributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningAttribute_Settings() {
        return (EReference) miningAttributeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMiningDataSpecification() {
        return miningDataSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningDataSpecification_Attribute() {
        return (EReference) miningDataSpecificationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningDataSpecification_Settings() {
        return (EReference) miningDataSpecificationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMiningModel() {
        return miningModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiningModel_Function() {
        return (EAttribute) miningModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiningModel_Algorithm() {
        return (EAttribute) miningModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningModel_Settings() {
        return (EReference) miningModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningModel_MiningResult() {
        return (EReference) miningModelEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningModel_InputSpec() {
        return (EReference) miningModelEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMiningModelResult() {
        return miningModelResultEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiningModelResult_Type() {
        return (EAttribute) miningModelResultEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningModelResult_Model() {
        return (EReference) miningModelResultEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getNumericAttribute() {
        return numericAttributeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericAttribute_LowerBound() {
        return (EAttribute) numericAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericAttribute_UpperBound() {
        return (EAttribute) numericAttributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericAttribute_IsCyclic() {
        return (EAttribute) numericAttributeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNumericAttribute_IsDiscrete() {
        return (EAttribute) numericAttributeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getSupervisedMiningModel() {
        return supervisedMiningModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSupervisedMiningModel_Target() {
        return (EReference) supervisedMiningModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCategoricalAttribute() {
        return categoricalAttributeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategoricalAttribute_Taxonomy() {
        return (EReference) categoricalAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategoricalAttribute_Category() {
        return (EReference) categoricalAttributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getOrdinalAttribute() {
        return ordinalAttributeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOrdinalAttribute_IsCyclic() {
        return (EAttribute) ordinalAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOrdinalAttribute_OrderingType() {
        return (EAttribute) ordinalAttributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMiningSettings() {
        return miningSettingsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiningSettings_Function() {
        return (EAttribute) miningSettingsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiningSettings_Algorithm() {
        return (EAttribute) miningSettingsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningSettings_MiningModel() {
        return (EReference) miningSettingsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningSettings_AttributeUsage() {
        return (EReference) miningSettingsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getMiningSettings_DataSpecification() {
        return (EReference) miningSettingsEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getClusteringSettings() {
        return clusteringSettingsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClusteringSettings_MaxNumberOfClusters() {
        return (EAttribute) clusteringSettingsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClusteringSettings_ClusterIdAttributeName() {
        return (EAttribute) clusteringSettingsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getStatisticsSettings() {
        return statisticsSettingsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getSupervisedMiningSettings() {
        return supervisedMiningSettingsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSupervisedMiningSettings_ConfidenceAttributeName() {
        return (EAttribute) supervisedMiningSettingsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSupervisedMiningSettings_PredictedAttributeName() {
        return (EAttribute) supervisedMiningSettingsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSupervisedMiningSettings_CostFunction() {
        return (EAttribute) supervisedMiningSettingsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getClassificationSettings() {
        return classificationSettingsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassificationSettings_CostMatrix() {
        return (EReference) classificationSettingsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getRegressionSettings() {
        return regressionSettingsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssociationRulesSettings() {
        return associationRulesSettingsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssociationRulesSettings_MinimumSupport() {
        return (EAttribute) associationRulesSettingsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssociationRulesSettings_MinimumConfidence() {
        return (EAttribute) associationRulesSettingsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociationRulesSettings_ItemId() {
        return (EReference) associationRulesSettingsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getApplicationAttribute() {
        return applicationAttributeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getApplicationAttribute_UsageType() {
        return (EAttribute) applicationAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getApplicationAttribute_AttributeType() {
        return (EAttribute) applicationAttributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getApplicationAttribute_InputSpec() {
        return (EReference) applicationAttributeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getApplicationAttribute_SupervisedMiningModel() {
        return (EReference) applicationAttributeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAttributeType() {
        return attributeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAttributeUsage() {
        return attributeUsageEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCategoryProperty() {
        return categoryPropertyEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOrderType() {
        return orderTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataminingFactory getDataminingFactory() {
        return (DataminingFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        applicationInputSpecificationEClass = createEClass(APPLICATION_INPUT_SPECIFICATION);
        createEReference(applicationInputSpecificationEClass, APPLICATION_INPUT_SPECIFICATION__INPUT_ATTRIBUTE);
        createEReference(applicationInputSpecificationEClass, APPLICATION_INPUT_SPECIFICATION__MINING_MODEL);

        attributeUsageRelationEClass = createEClass(ATTRIBUTE_USAGE_RELATION);
        createEAttribute(attributeUsageRelationEClass, ATTRIBUTE_USAGE_RELATION__USAGE_TYPE);
        createEAttribute(attributeUsageRelationEClass, ATTRIBUTE_USAGE_RELATION__INCLUDE_IN_APPLY_RESULT);
        createEAttribute(attributeUsageRelationEClass, ATTRIBUTE_USAGE_RELATION__WEIGHT);
        createEAttribute(attributeUsageRelationEClass, ATTRIBUTE_USAGE_RELATION__SUPPRESS_NORMALIZATION);
        createEReference(attributeUsageRelationEClass, ATTRIBUTE_USAGE_RELATION__SETTINGS);
        createEReference(attributeUsageRelationEClass, ATTRIBUTE_USAGE_RELATION__ATTRIBUTE);

        categoryEClass = createEClass(CATEGORY);
        createEAttribute(categoryEClass, CATEGORY__DISPLAY_VALUE);
        createEAttribute(categoryEClass, CATEGORY__PROPERTY);
        createEAttribute(categoryEClass, CATEGORY__VALUE);
        createEReference(categoryEClass, CATEGORY__CATEGORICAL_ATTRIBUTE);

        categoryHierarchyEClass = createEClass(CATEGORY_HIERARCHY);
        createEReference(categoryHierarchyEClass, CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE);

        costMatrixEClass = createEClass(COST_MATRIX);
        createEReference(costMatrixEClass, COST_MATRIX__SETTINGS);

        miningAttributeEClass = createEClass(MINING_ATTRIBUTE);
        createEReference(miningAttributeEClass, MINING_ATTRIBUTE__DATA_SPECIFICATION);
        createEReference(miningAttributeEClass, MINING_ATTRIBUTE__ATTRIBUTE_USAGE);
        createEReference(miningAttributeEClass, MINING_ATTRIBUTE__SETTINGS);

        miningDataSpecificationEClass = createEClass(MINING_DATA_SPECIFICATION);
        createEReference(miningDataSpecificationEClass, MINING_DATA_SPECIFICATION__ATTRIBUTE);
        createEReference(miningDataSpecificationEClass, MINING_DATA_SPECIFICATION__SETTINGS);

        miningModelEClass = createEClass(MINING_MODEL);
        createEAttribute(miningModelEClass, MINING_MODEL__FUNCTION);
        createEAttribute(miningModelEClass, MINING_MODEL__ALGORITHM);
        createEReference(miningModelEClass, MINING_MODEL__SETTINGS);
        createEReference(miningModelEClass, MINING_MODEL__MINING_RESULT);
        createEReference(miningModelEClass, MINING_MODEL__INPUT_SPEC);

        miningModelResultEClass = createEClass(MINING_MODEL_RESULT);
        createEAttribute(miningModelResultEClass, MINING_MODEL_RESULT__TYPE);
        createEReference(miningModelResultEClass, MINING_MODEL_RESULT__MODEL);

        numericAttributeEClass = createEClass(NUMERIC_ATTRIBUTE);
        createEAttribute(numericAttributeEClass, NUMERIC_ATTRIBUTE__LOWER_BOUND);
        createEAttribute(numericAttributeEClass, NUMERIC_ATTRIBUTE__UPPER_BOUND);
        createEAttribute(numericAttributeEClass, NUMERIC_ATTRIBUTE__IS_CYCLIC);
        createEAttribute(numericAttributeEClass, NUMERIC_ATTRIBUTE__IS_DISCRETE);

        supervisedMiningModelEClass = createEClass(SUPERVISED_MINING_MODEL);
        createEReference(supervisedMiningModelEClass, SUPERVISED_MINING_MODEL__TARGET);

        categoricalAttributeEClass = createEClass(CATEGORICAL_ATTRIBUTE);
        createEReference(categoricalAttributeEClass, CATEGORICAL_ATTRIBUTE__TAXONOMY);
        createEReference(categoricalAttributeEClass, CATEGORICAL_ATTRIBUTE__CATEGORY);

        ordinalAttributeEClass = createEClass(ORDINAL_ATTRIBUTE);
        createEAttribute(ordinalAttributeEClass, ORDINAL_ATTRIBUTE__IS_CYCLIC);
        createEAttribute(ordinalAttributeEClass, ORDINAL_ATTRIBUTE__ORDERING_TYPE);

        miningSettingsEClass = createEClass(MINING_SETTINGS);
        createEAttribute(miningSettingsEClass, MINING_SETTINGS__FUNCTION);
        createEAttribute(miningSettingsEClass, MINING_SETTINGS__ALGORITHM);
        createEReference(miningSettingsEClass, MINING_SETTINGS__MINING_MODEL);
        createEReference(miningSettingsEClass, MINING_SETTINGS__ATTRIBUTE_USAGE);
        createEReference(miningSettingsEClass, MINING_SETTINGS__DATA_SPECIFICATION);

        clusteringSettingsEClass = createEClass(CLUSTERING_SETTINGS);
        createEAttribute(clusteringSettingsEClass, CLUSTERING_SETTINGS__MAX_NUMBER_OF_CLUSTERS);
        createEAttribute(clusteringSettingsEClass, CLUSTERING_SETTINGS__CLUSTER_ID_ATTRIBUTE_NAME);

        statisticsSettingsEClass = createEClass(STATISTICS_SETTINGS);

        supervisedMiningSettingsEClass = createEClass(SUPERVISED_MINING_SETTINGS);
        createEAttribute(supervisedMiningSettingsEClass, SUPERVISED_MINING_SETTINGS__CONFIDENCE_ATTRIBUTE_NAME);
        createEAttribute(supervisedMiningSettingsEClass, SUPERVISED_MINING_SETTINGS__PREDICTED_ATTRIBUTE_NAME);
        createEAttribute(supervisedMiningSettingsEClass, SUPERVISED_MINING_SETTINGS__COST_FUNCTION);

        classificationSettingsEClass = createEClass(CLASSIFICATION_SETTINGS);
        createEReference(classificationSettingsEClass, CLASSIFICATION_SETTINGS__COST_MATRIX);

        regressionSettingsEClass = createEClass(REGRESSION_SETTINGS);

        associationRulesSettingsEClass = createEClass(ASSOCIATION_RULES_SETTINGS);
        createEAttribute(associationRulesSettingsEClass, ASSOCIATION_RULES_SETTINGS__MINIMUM_SUPPORT);
        createEAttribute(associationRulesSettingsEClass, ASSOCIATION_RULES_SETTINGS__MINIMUM_CONFIDENCE);
        createEReference(associationRulesSettingsEClass, ASSOCIATION_RULES_SETTINGS__ITEM_ID);

        applicationAttributeEClass = createEClass(APPLICATION_ATTRIBUTE);
        createEAttribute(applicationAttributeEClass, APPLICATION_ATTRIBUTE__USAGE_TYPE);
        createEAttribute(applicationAttributeEClass, APPLICATION_ATTRIBUTE__ATTRIBUTE_TYPE);
        createEReference(applicationAttributeEClass, APPLICATION_ATTRIBUTE__INPUT_SPEC);
        createEReference(applicationAttributeEClass, APPLICATION_ATTRIBUTE__SUPERVISED_MINING_MODEL);

        // Create enums
        attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
        attributeUsageEEnum = createEEnum(ATTRIBUTE_USAGE);
        categoryPropertyEEnum = createEEnum(CATEGORY_PROPERTY);
        orderTypeEEnum = createEEnum(ORDER_TYPE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This
     * method is guarded to have no affect on any invocation but its first. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        applicationInputSpecificationEClass.getESuperTypes().add(theCorePackage.getClass_());
        attributeUsageRelationEClass.getESuperTypes().add(theCorePackage.getModelElement());
        categoryEClass.getESuperTypes().add(theCorePackage.getModelElement());
        categoryHierarchyEClass.getESuperTypes().add(theCorePackage.getClass_());
        costMatrixEClass.getESuperTypes().add(theCorePackage.getClass_());
        miningAttributeEClass.getESuperTypes().add(theCorePackage.getAttribute());
        miningDataSpecificationEClass.getESuperTypes().add(theCorePackage.getClass_());
        miningModelEClass.getESuperTypes().add(theCorePackage.getClass_());
        miningModelResultEClass.getESuperTypes().add(theCorePackage.getClass_());
        numericAttributeEClass.getESuperTypes().add(this.getMiningAttribute());
        supervisedMiningModelEClass.getESuperTypes().add(this.getMiningModel());
        categoricalAttributeEClass.getESuperTypes().add(this.getMiningAttribute());
        ordinalAttributeEClass.getESuperTypes().add(this.getCategoricalAttribute());
        miningSettingsEClass.getESuperTypes().add(theCorePackage.getClass_());
        clusteringSettingsEClass.getESuperTypes().add(this.getMiningSettings());
        statisticsSettingsEClass.getESuperTypes().add(this.getMiningSettings());
        supervisedMiningSettingsEClass.getESuperTypes().add(this.getMiningSettings());
        classificationSettingsEClass.getESuperTypes().add(this.getSupervisedMiningSettings());
        regressionSettingsEClass.getESuperTypes().add(this.getSupervisedMiningSettings());
        associationRulesSettingsEClass.getESuperTypes().add(this.getMiningSettings());
        applicationAttributeEClass.getESuperTypes().add(theCorePackage.getAttribute());

        // Initialize classes and features; add operations and parameters
        initEClass(applicationInputSpecificationEClass, ApplicationInputSpecification.class, "ApplicationInputSpecification",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getApplicationInputSpecification_InputAttribute(), this.getApplicationAttribute(),
                this.getApplicationAttribute_InputSpec(), "inputAttribute", null, 1, -1, ApplicationInputSpecification.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getApplicationInputSpecification_MiningModel(), this.getMiningModel(), this.getMiningModel_InputSpec(),
                "miningModel", null, 0, 1, ApplicationInputSpecification.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeUsageRelationEClass, AttributeUsageRelation.class, "AttributeUsageRelation", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttributeUsageRelation_UsageType(), this.getAttributeUsage(), "usageType", null, 0, 1,
                AttributeUsageRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributeUsageRelation_IncludeInApplyResult(), theCorePackage.getBoolean(), "includeInApplyResult",
                null, 0, 1, AttributeUsageRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributeUsageRelation_Weight(), theCorePackage.getFloat(), "weight", null, 0, 1,
                AttributeUsageRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributeUsageRelation_SuppressNormalization(), theCorePackage.getBoolean(), "suppressNormalization",
                null, 0, 1, AttributeUsageRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeUsageRelation_Settings(), this.getMiningSettings(), this.getMiningSettings_AttributeUsage(),
                "settings", null, 1, 1, AttributeUsageRelation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeUsageRelation_Attribute(), this.getMiningAttribute(),
                this.getMiningAttribute_AttributeUsage(), "attribute", null, 1, 1, AttributeUsageRelation.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCategory_DisplayValue(), theCorePackage.getString(), "displayValue", null, 0, 1, Category.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCategory_Property(), this.getCategoryProperty(), "property", null, 0, 1, Category.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCategory_Value(), theCorePackage.getAny(), "value", null, 0, 1, Category.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCategory_CategoricalAttribute(), this.getCategoricalAttribute(),
                this.getCategoricalAttribute_Category(), "categoricalAttribute", null, 0, 1, Category.class, IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(categoryHierarchyEClass, CategoryHierarchy.class, "CategoryHierarchy", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCategoryHierarchy_CategoricalAttribute(), this.getCategoricalAttribute(),
                this.getCategoricalAttribute_Taxonomy(), "categoricalAttribute", null, 0, -1, CategoryHierarchy.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(costMatrixEClass, CostMatrix.class, "CostMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCostMatrix_Settings(), this.getClassificationSettings(), this.getClassificationSettings_CostMatrix(),
                "settings", null, 0, -1, CostMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(miningAttributeEClass, MiningAttribute.class, "MiningAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMiningAttribute_DataSpecification(), this.getMiningDataSpecification(),
                this.getMiningDataSpecification_Attribute(), "dataSpecification", null, 1, 1, MiningAttribute.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getMiningAttribute_AttributeUsage(), this.getAttributeUsageRelation(),
                this.getAttributeUsageRelation_Attribute(), "attributeUsage", null, 0, -1, MiningAttribute.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEReference(getMiningAttribute_Settings(), this.getAssociationRulesSettings(),
                this.getAssociationRulesSettings_ItemId(), "settings", null, 0, -1, MiningAttribute.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(miningDataSpecificationEClass, MiningDataSpecification.class, "MiningDataSpecification", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMiningDataSpecification_Attribute(), this.getMiningAttribute(),
                this.getMiningAttribute_DataSpecification(), "attribute", null, 1, -1, MiningDataSpecification.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getMiningDataSpecification_Settings(), this.getMiningSettings(),
                this.getMiningSettings_DataSpecification(), "settings", null, 0, -1, MiningDataSpecification.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(miningModelEClass, MiningModel.class, "MiningModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMiningModel_Function(), theCorePackage.getString(), "function", null, 0, 1, MiningModel.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiningModel_Algorithm(), theCorePackage.getString(), "algorithm", null, 0, 1, MiningModel.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMiningModel_Settings(), this.getMiningSettings(), this.getMiningSettings_MiningModel(), "settings",
                null, 0, 1, MiningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMiningModel_MiningResult(), this.getMiningModelResult(), this.getMiningModelResult_Model(),
                "miningResult", null, 0, -1, MiningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMiningModel_InputSpec(), this.getApplicationInputSpecification(),
                this.getApplicationInputSpecification_MiningModel(), "inputSpec", null, 1, -1, MiningModel.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(miningModelResultEClass, MiningModelResult.class, "MiningModelResult", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMiningModelResult_Type(), theCorePackage.getString(), "type", null, 0, 1, MiningModelResult.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMiningModelResult_Model(), this.getMiningModel(), this.getMiningModel_MiningResult(), "model", null, 1,
                1, MiningModelResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(numericAttributeEClass, NumericAttribute.class, "NumericAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNumericAttribute_LowerBound(), theCorePackage.getFloat(), "lowerBound", null, 0, 1,
                NumericAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericAttribute_UpperBound(), theCorePackage.getFloat(), "upperBound", null, 0, 1,
                NumericAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericAttribute_IsCyclic(), theCorePackage.getBoolean(), "isCyclic", null, 0, 1,
                NumericAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericAttribute_IsDiscrete(), theCorePackage.getBoolean(), "isDiscrete", null, 0, 1,
                NumericAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(supervisedMiningModelEClass, SupervisedMiningModel.class, "SupervisedMiningModel", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSupervisedMiningModel_Target(), this.getApplicationAttribute(),
                this.getApplicationAttribute_SupervisedMiningModel(), "target", null, 1, 1, SupervisedMiningModel.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(categoricalAttributeEClass, CategoricalAttribute.class, "CategoricalAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCategoricalAttribute_Taxonomy(), this.getCategoryHierarchy(),
                this.getCategoryHierarchy_CategoricalAttribute(), "taxonomy", null, 0, 1, CategoricalAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getCategoricalAttribute_Category(), this.getCategory(), this.getCategory_CategoricalAttribute(),
                "category", null, 0, -1, CategoricalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ordinalAttributeEClass, OrdinalAttribute.class, "OrdinalAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOrdinalAttribute_IsCyclic(), theCorePackage.getBoolean(), "isCyclic", null, 0, 1,
                OrdinalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOrdinalAttribute_OrderingType(), this.getOrderType(), "orderingType", null, 0, 1,
                OrdinalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(miningSettingsEClass, MiningSettings.class, "MiningSettings", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMiningSettings_Function(), theCorePackage.getString(), "function", null, 0, 1, MiningSettings.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiningSettings_Algorithm(), theCorePackage.getString(), "algorithm", null, 0, 1, MiningSettings.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMiningSettings_MiningModel(), this.getMiningModel(), this.getMiningModel_Settings(), "miningModel",
                null, 1, 1, MiningSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMiningSettings_AttributeUsage(), this.getAttributeUsageRelation(),
                this.getAttributeUsageRelation_Settings(), "attributeUsage", null, 1, -1, MiningSettings.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEReference(getMiningSettings_DataSpecification(), this.getMiningDataSpecification(),
                this.getMiningDataSpecification_Settings(), "dataSpecification", null, 1, 1, MiningSettings.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(clusteringSettingsEClass, ClusteringSettings.class, "ClusteringSettings", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getClusteringSettings_MaxNumberOfClusters(), theCorePackage.getInteger(), "maxNumberOfClusters", null, 0,
                1, ClusteringSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getClusteringSettings_ClusterIdAttributeName(), theCorePackage.getString(), "clusterIdAttributeName",
                null, 0, 1, ClusteringSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(statisticsSettingsEClass, StatisticsSettings.class, "StatisticsSettings", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(supervisedMiningSettingsEClass, SupervisedMiningSettings.class, "SupervisedMiningSettings", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSupervisedMiningSettings_ConfidenceAttributeName(), theCorePackage.getString(),
                "confidenceAttributeName", null, 0, 1, SupervisedMiningSettings.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSupervisedMiningSettings_PredictedAttributeName(), theCorePackage.getString(),
                "predictedAttributeName", null, 0, 1, SupervisedMiningSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSupervisedMiningSettings_CostFunction(), theCorePackage.getString(), "costFunction", null, 0, 1,
                SupervisedMiningSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(classificationSettingsEClass, ClassificationSettings.class, "ClassificationSettings", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClassificationSettings_CostMatrix(), this.getCostMatrix(), this.getCostMatrix_Settings(), "costMatrix",
                null, 0, 1, ClassificationSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(regressionSettingsEClass, RegressionSettings.class, "RegressionSettings", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(associationRulesSettingsEClass, AssociationRulesSettings.class, "AssociationRulesSettings", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAssociationRulesSettings_MinimumSupport(), theCorePackage.getFloat(), "minimumSupport", null, 0, 1,
                AssociationRulesSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociationRulesSettings_MinimumConfidence(), theCorePackage.getFloat(), "minimumConfidence", null, 0,
                1, AssociationRulesSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociationRulesSettings_ItemId(), this.getMiningAttribute(), this.getMiningAttribute_Settings(),
                "itemId", null, 1, 1, AssociationRulesSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(applicationAttributeEClass, ApplicationAttribute.class, "ApplicationAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getApplicationAttribute_UsageType(), this.getAttributeUsage(), "usageType", null, 0, 1,
                ApplicationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getApplicationAttribute_AttributeType(), this.getAttributeType(), "attributeType", null, 0, 1,
                ApplicationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getApplicationAttribute_InputSpec(), this.getApplicationInputSpecification(),
                this.getApplicationInputSpecification_InputAttribute(), "inputSpec", null, 1, 1, ApplicationAttribute.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getApplicationAttribute_SupervisedMiningModel(), this.getSupervisedMiningModel(),
                this.getSupervisedMiningModel_Target(), "supervisedMiningModel", null, 0, -1, ApplicationAttribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
        addEEnumLiteral(attributeTypeEEnum, AttributeType.CATEGORICAL);
        addEEnumLiteral(attributeTypeEEnum, AttributeType.NUMERICAL);

        initEEnum(attributeUsageEEnum, AttributeUsage.class, "AttributeUsage");
        addEEnumLiteral(attributeUsageEEnum, AttributeUsage.ACTIVE);
        addEEnumLiteral(attributeUsageEEnum, AttributeUsage.INACTIVE);
        addEEnumLiteral(attributeUsageEEnum, AttributeUsage.SUPPLEMENTARY);

        initEEnum(categoryPropertyEEnum, CategoryProperty.class, "CategoryProperty");
        addEEnumLiteral(categoryPropertyEEnum, CategoryProperty.MISSING);
        addEEnumLiteral(categoryPropertyEEnum, CategoryProperty.INVALID);
        addEEnumLiteral(categoryPropertyEEnum, CategoryProperty.VALID);
        addEEnumLiteral(categoryPropertyEEnum, CategoryProperty.POSITIVE);
        addEEnumLiteral(categoryPropertyEEnum, CategoryProperty.NEGATIVE);

        initEEnum(orderTypeEEnum, OrderType.class, "OrderType");
        addEEnumLiteral(orderTypeEEnum, OrderType.ALPHABETIC);
        addEEnumLiteral(orderTypeEEnum, OrderType.DATE);
        addEEnumLiteral(orderTypeEEnum, OrderType.NUMERIC);
        addEEnumLiteral(orderTypeEEnum, OrderType.IN_SEQUENCE);

        // Create resource
        createResource(eNS_URI);
    }

} // DataminingPackageImpl
