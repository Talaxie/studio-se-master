/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import orgomg.cwm.analysis.businessnomenclature.BusinessnomenclaturePackage;
import orgomg.cwm.analysis.businessnomenclature.impl.BusinessnomenclaturePackageImpl;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.impl.DataminingPackageImpl;
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
import orgomg.cwmx.resource.essbase.Alias;
import orgomg.cwmx.resource.essbase.Application;
import orgomg.cwmx.resource.essbase.Comment;
import orgomg.cwmx.resource.essbase.Consolidation;
import orgomg.cwmx.resource.essbase.CurrencyConversion;
import orgomg.cwmx.resource.essbase.DataStorage;
import orgomg.cwmx.resource.essbase.Database;
import orgomg.cwmx.resource.essbase.Dimension;
import orgomg.cwmx.resource.essbase.DimensionType;
import orgomg.cwmx.resource.essbase.EssbaseFactory;
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.essbase.Formula;
import orgomg.cwmx.resource.essbase.Generation;
import orgomg.cwmx.resource.essbase.ImmediateParent;
import orgomg.cwmx.resource.essbase.Level;
import orgomg.cwmx.resource.essbase.LinkedPartition;
import orgomg.cwmx.resource.essbase.MemberName;
import orgomg.cwmx.resource.essbase.OLAPServer;
import orgomg.cwmx.resource.essbase.Outline;
import orgomg.cwmx.resource.essbase.Partition;
import orgomg.cwmx.resource.essbase.ReplicatedPartition;
import orgomg.cwmx.resource.essbase.TimeBalance;
import orgomg.cwmx.resource.essbase.TransparentPartition;
import orgomg.cwmx.resource.essbase.TwoPassCalculation;
import orgomg.cwmx.resource.essbase.VarianceReporting;
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
public class EssbasePackageImpl extends EPackageImpl implements EssbasePackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass aliasEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass commentEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass consolidationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass currencyConversionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass dataStorageEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass databaseEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass dimensionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass formulaEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass generationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass immediateParentEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass levelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass memberNameEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass olapServerEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass outlineEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass partitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass replicatedPartitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass timeBalanceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass transparentPartitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass twoPassCalculationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass udaEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass varianceReportingEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass linkedPartitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum dimensionTypeEEnum = null;

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
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private EssbasePackageImpl() {
        super(eNS_URI, EssbaseFactory.eINSTANCE);
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
     * This method is used to initialize {@link EssbasePackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead,
     * they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static EssbasePackage init() {
        if (isInited)
            return (EssbasePackage) EPackage.Registry.INSTANCE.getEPackage(EssbasePackage.eNS_URI);

        // Obtain or create and register package
        EssbasePackageImpl theEssbasePackage = (EssbasePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EssbasePackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new EssbasePackageImpl());

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
        DataminingPackageImpl theDataminingPackage = (DataminingPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(DataminingPackage.eNS_URI) instanceof DataminingPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(DataminingPackage.eNS_URI) : DataminingPackage.eINSTANCE);
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
        theEssbasePackage.createPackageContents();
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
        theDataminingPackage.createPackageContents();
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
        theExpressPackage.createPackageContents();
        theInformationsetPackage.createPackageContents();
        theInformationreportingPackage.createPackageContents();
        theCwmmipPackage.createPackageContents();
        theModelPackage.createPackageContents();

        // Initialize created meta-data
        theEssbasePackage.initializePackageContents();
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
        theDataminingPackage.initializePackageContents();
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
        theExpressPackage.initializePackageContents();
        theInformationsetPackage.initializePackageContents();
        theInformationreportingPackage.initializePackageContents();
        theCwmmipPackage.initializePackageContents();
        theModelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theEssbasePackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(EssbasePackage.eNS_URI, theEssbasePackage);
        return theEssbasePackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getAlias() {
        return aliasEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getApplication() {
        return applicationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getComment() {
        return commentEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getConsolidation() {
        return consolidationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCurrencyConversion() {
        return currencyConversionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataStorage() {
        return dataStorageEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatabase() {
        return databaseEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatabase_IsCurrency() {
        return (EAttribute) databaseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatabase_Outline() {
        return (EReference) databaseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDimension() {
        return dimensionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDimension_Type() {
        return (EAttribute) dimensionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDimension_IsDense() {
        return (EAttribute) dimensionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDimension_Outline() {
        return (EReference) dimensionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getFormula() {
        return formulaEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getGeneration() {
        return generationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getImmediateParent() {
        return immediateParentEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLevel() {
        return levelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMemberName() {
        return memberNameEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getOLAPServer() {
        return olapServerEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutline() {
        return outlineEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutline_AliasTableName() {
        return (EAttribute) outlineEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getOutline_Database() {
        return (EReference) outlineEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getOutline_Dimension() {
        return (EReference) outlineEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getPartition() {
        return partitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartition_IsSource() {
        return (EAttribute) partitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartition_IsShared() {
        return (EAttribute) partitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPartition_Formula() {
        return (EReference) partitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getReplicatedPartition() {
        return replicatedPartitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeBalance() {
        return timeBalanceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTransparentPartition() {
        return transparentPartitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTwoPassCalculation() {
        return twoPassCalculationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getUDA() {
        return udaEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getVarianceReporting() {
        return varianceReportingEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinkedPartition() {
        return linkedPartitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDimensionType() {
        return dimensionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EssbaseFactory getEssbaseFactory() {
        return (EssbaseFactory) getEFactoryInstance();
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
        aliasEClass = createEClass(ALIAS);

        applicationEClass = createEClass(APPLICATION);

        commentEClass = createEClass(COMMENT);

        consolidationEClass = createEClass(CONSOLIDATION);

        currencyConversionEClass = createEClass(CURRENCY_CONVERSION);

        dataStorageEClass = createEClass(DATA_STORAGE);

        databaseEClass = createEClass(DATABASE);
        createEAttribute(databaseEClass, DATABASE__IS_CURRENCY);
        createEReference(databaseEClass, DATABASE__OUTLINE);

        dimensionEClass = createEClass(DIMENSION);
        createEAttribute(dimensionEClass, DIMENSION__TYPE);
        createEAttribute(dimensionEClass, DIMENSION__IS_DENSE);
        createEReference(dimensionEClass, DIMENSION__OUTLINE);

        formulaEClass = createEClass(FORMULA);

        generationEClass = createEClass(GENERATION);

        immediateParentEClass = createEClass(IMMEDIATE_PARENT);

        levelEClass = createEClass(LEVEL);

        memberNameEClass = createEClass(MEMBER_NAME);

        olapServerEClass = createEClass(OLAP_SERVER);

        outlineEClass = createEClass(OUTLINE);
        createEAttribute(outlineEClass, OUTLINE__ALIAS_TABLE_NAME);
        createEReference(outlineEClass, OUTLINE__DATABASE);
        createEReference(outlineEClass, OUTLINE__DIMENSION);

        partitionEClass = createEClass(PARTITION);
        createEAttribute(partitionEClass, PARTITION__IS_SOURCE);
        createEAttribute(partitionEClass, PARTITION__IS_SHARED);
        createEReference(partitionEClass, PARTITION__FORMULA);

        replicatedPartitionEClass = createEClass(REPLICATED_PARTITION);

        timeBalanceEClass = createEClass(TIME_BALANCE);

        transparentPartitionEClass = createEClass(TRANSPARENT_PARTITION);

        twoPassCalculationEClass = createEClass(TWO_PASS_CALCULATION);

        udaEClass = createEClass(UDA);

        varianceReportingEClass = createEClass(VARIANCE_REPORTING);

        linkedPartitionEClass = createEClass(LINKED_PARTITION);

        // Create enums
        dimensionTypeEEnum = createEEnum(DIMENSION_TYPE);
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
        MultidimensionalPackage theMultidimensionalPackage = (MultidimensionalPackage) EPackage.Registry.INSTANCE
                .getEPackage(MultidimensionalPackage.eNS_URI);
        CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
        SoftwaredeploymentPackage theSoftwaredeploymentPackage = (SoftwaredeploymentPackage) EPackage.Registry.INSTANCE
                .getEPackage(SoftwaredeploymentPackage.eNS_URI);
        OlapPackage theOlapPackage = (OlapPackage) EPackage.Registry.INSTANCE.getEPackage(OlapPackage.eNS_URI);
        ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
                .getEPackage(ExpressionsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        aliasEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        applicationEClass.getESuperTypes().add(theCorePackage.getPackage());
        commentEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        consolidationEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        currencyConversionEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        dataStorageEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        databaseEClass.getESuperTypes().add(theMultidimensionalPackage.getSchema());
        dimensionEClass.getESuperTypes().add(theMultidimensionalPackage.getDimension());
        formulaEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        generationEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        immediateParentEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        levelEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        memberNameEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        olapServerEClass.getESuperTypes().add(theSoftwaredeploymentPackage.getDataManager());
        outlineEClass.getESuperTypes().add(theCorePackage.getNamespace());
        partitionEClass.getESuperTypes().add(theOlapPackage.getCubeRegion());
        replicatedPartitionEClass.getESuperTypes().add(this.getPartition());
        timeBalanceEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        transparentPartitionEClass.getESuperTypes().add(this.getPartition());
        twoPassCalculationEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        udaEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        varianceReportingEClass.getESuperTypes().add(theMultidimensionalPackage.getDimensionedObject());
        linkedPartitionEClass.getESuperTypes().add(this.getPartition());

        // Initialize classes and features; add operations and parameters
        initEClass(aliasEClass, Alias.class, "Alias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(consolidationEClass, Consolidation.class, "Consolidation", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(currencyConversionEClass, CurrencyConversion.class, "CurrencyConversion", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(dataStorageEClass, DataStorage.class, "DataStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDatabase_IsCurrency(), theCorePackage.getBoolean(), "isCurrency", null, 0, 1, Database.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDatabase_Outline(), this.getOutline(), this.getOutline_Database(), "outline", null, 1, 1,
                Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDimension_Type(), this.getDimensionType(), "type", null, 0, 1, Dimension.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDimension_IsDense(), theCorePackage.getBoolean(), "isDense", null, 0, 1, Dimension.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDimension_Outline(), this.getOutline(), this.getOutline_Dimension(), "outline", null, 1, 1,
                Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(formulaEClass, Formula.class, "Formula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(generationEClass, Generation.class, "Generation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(immediateParentEClass, ImmediateParent.class, "ImmediateParent", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(levelEClass, Level.class, "Level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(memberNameEClass, MemberName.class, "MemberName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(olapServerEClass, OLAPServer.class, "OLAPServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(outlineEClass, Outline.class, "Outline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOutline_AliasTableName(), theCorePackage.getString(), "aliasTableName", null, 0, 1, Outline.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOutline_Database(), this.getDatabase(), this.getDatabase_Outline(), "database", null, 1, 1,
                Outline.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOutline_Dimension(), this.getDimension(), this.getDimension_Outline(), "dimension", null, 0, -1,
                Outline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(partitionEClass, Partition.class, "Partition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPartition_IsSource(), theCorePackage.getBoolean(), "isSource", null, 0, 1, Partition.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPartition_IsShared(), theCorePackage.getBoolean(), "isShared", null, 0, 1, Partition.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPartition_Formula(), theExpressionsPackage.getExpressionNode(), null, "formula", null, 0, 1,
                Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(replicatedPartitionEClass, ReplicatedPartition.class, "ReplicatedPartition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(timeBalanceEClass, TimeBalance.class, "TimeBalance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(transparentPartitionEClass, TransparentPartition.class, "TransparentPartition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(twoPassCalculationEClass, TwoPassCalculation.class, "TwoPassCalculation", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(udaEClass, orgomg.cwmx.resource.essbase.UDA.class, "UDA", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(varianceReportingEClass, VarianceReporting.class, "VarianceReporting", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(linkedPartitionEClass, LinkedPartition.class, "LinkedPartition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(dimensionTypeEEnum, DimensionType.class, "DimensionType");
        addEEnumLiteral(dimensionTypeEEnum, DimensionType.ESS_NONE);
        addEEnumLiteral(dimensionTypeEEnum, DimensionType.ESS_ACCOUNTS);
        addEEnumLiteral(dimensionTypeEEnum, DimensionType.ESS_TIME);
        addEEnumLiteral(dimensionTypeEEnum, DimensionType.ESS_COUNTRY);
        addEEnumLiteral(dimensionTypeEEnum, DimensionType.ESS_CURRENCY_PARTITION);
        addEEnumLiteral(dimensionTypeEEnum, DimensionType.ESS_ATTRIBUTE);

        // Create resource
        createResource(eNS_URI);
    }

} // EssbasePackageImpl
