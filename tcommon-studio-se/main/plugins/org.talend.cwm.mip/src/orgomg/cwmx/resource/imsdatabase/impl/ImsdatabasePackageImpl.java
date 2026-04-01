/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.impl.ExpressPackageImpl;
import orgomg.cwmx.resource.imsdatabase.AccessMethod;
import orgomg.cwmx.resource.imsdatabase.DBDLib;
import orgomg.cwmx.resource.imsdatabase.Dataset;
import orgomg.cwmx.resource.imsdatabase.Exit;
import orgomg.cwmx.resource.imsdatabase.Field;
import orgomg.cwmx.resource.imsdatabase.ImsdatabaseFactory;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.PSBLib;
import orgomg.cwmx.resource.imsdatabase.SecondaryIndex;
import orgomg.cwmx.resource.imsdatabase.Segment;
import orgomg.cwmx.resource.imsdatabase.SegmentComplex;
import orgomg.cwmx.resource.imsdatabase.SegmentLogical;
import orgomg.cwmx.resource.imsdatabase.SenField;
import orgomg.cwmx.resource.imsdatabase.SenSegment;
import orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage;
import orgomg.cwmx.resource.imsdatabase.imstypes.impl.ImstypesPackageImpl;
import orgomg.mof.model.ModelPackage;
import orgomg.mof.model.impl.ModelPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ImsdatabasePackageImpl extends EPackageImpl implements ImsdatabasePackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass dbdEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass psbEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass pcbEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass segmentEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass segmentComplexEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass segmentLogicalEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass fieldEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass datasetEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass senSegmentEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass senFieldEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass acblibEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass accessMethodEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass indexEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass hidamEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass dedbEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass hdamEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass msdbEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass secondaryIndexEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass exitEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass lchildEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass psbLibEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass dbdLibEClass = null;

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
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ImsdatabasePackageImpl() {
        super(eNS_URI, ImsdatabaseFactory.eINSTANCE);
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
     * This method is used to initialize {@link ImsdatabasePackage#eINSTANCE}
     * when that field is accessed. Clients should not invoke it directly.
     * Instead, they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ImsdatabasePackage init() {
        if (isInited)
            return (ImsdatabasePackage) EPackage.Registry.INSTANCE.getEPackage(ImsdatabasePackage.eNS_URI);

        // Obtain or create and register package
        ImsdatabasePackageImpl theImsdatabasePackage = (ImsdatabasePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImsdatabasePackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new ImsdatabasePackageImpl());

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
        theImsdatabasePackage.createPackageContents();
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
        theImstypesPackage.createPackageContents();
        theEssbasePackage.createPackageContents();
        theExpressPackage.createPackageContents();
        theInformationsetPackage.createPackageContents();
        theInformationreportingPackage.createPackageContents();
        theCwmmipPackage.createPackageContents();
        theModelPackage.createPackageContents();

        // Initialize created meta-data
        theImsdatabasePackage.initializePackageContents();
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
        theImstypesPackage.initializePackageContents();
        theEssbasePackage.initializePackageContents();
        theExpressPackage.initializePackageContents();
        theInformationsetPackage.initializePackageContents();
        theInformationreportingPackage.initializePackageContents();
        theCwmmipPackage.initializePackageContents();
        theModelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theImsdatabasePackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ImsdatabasePackage.eNS_URI, theImsdatabasePackage);
        return theImsdatabasePackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDBD() {
        return dbdEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDBD_DliAccess() {
        return (EAttribute) dbdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDBD_IsVSAM() {
        return (EAttribute) dbdEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDBD_PasswordFlag() {
        return (EAttribute) dbdEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDBD_VersionString() {
        return (EAttribute) dbdEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDBD_AccessMethod() {
        return (EReference) dbdEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDBD_Acblib() {
        return (EReference) dbdEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDBD_Dataset() {
        return (EReference) dbdEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDBD_Segment() {
        return (EReference) dbdEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDBD_Pcb() {
        return (EReference) dbdEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDBD_Exit() {
        return (EReference) dbdEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDBD_Library() {
        return (EReference) dbdEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getPSB() {
        return psbEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPSB_Compatibility() {
        return (EAttribute) psbEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPSB_IoErrorOption() {
        return (EAttribute) psbEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPSB_IoaSize() {
        return (EAttribute) psbEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPSB_Language() {
        return (EAttribute) psbEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPSB_LockMaximum() {
        return (EAttribute) psbEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPSB_MaximumQxCalls() {
        return (EAttribute) psbEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPSB_OnlineImageCopy() {
        return (EAttribute) psbEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPSB_SsaSize() {
        return (EAttribute) psbEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPSB_WriteToOperator() {
        return (EAttribute) psbEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPSB_Acblib() {
        return (EReference) psbEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPSB_Pcb() {
        return (EReference) psbEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPSB_Library() {
        return (EReference) psbEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getPCB() {
        return pcbEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_PcbType() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_List() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_KeyLength() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_ProcessingOptions() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_Positioning() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_SequentialBuffering() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_AlternateResponse() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_Express() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_Modify() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_SameTerminal() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_DestinationType() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPCB_LtermName() {
        return (EAttribute) pcbEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPCB_ProcSeq() {
        return (EReference) pcbEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPCB_Dbd() {
        return (EReference) pcbEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPCB_Psb() {
        return (EReference) pcbEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPCB_SenSegment() {
        return (EReference) pcbEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getSegment() {
        return segmentEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegment_ExitFlag() {
        return (EAttribute) segmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegment_Frequency() {
        return (EAttribute) segmentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegment_MaximumLength() {
        return (EAttribute) segmentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegment_MinimumLength() {
        return (EAttribute) segmentEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegment_Rules() {
        return (EAttribute) segmentEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegment_SubsetPointers() {
        return (EAttribute) segmentEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegment_DirectDependent() {
        return (EAttribute) segmentEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegment_PcPointer() {
        return (EAttribute) segmentEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegment_Logical() {
        return (EReference) segmentEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegment_Dbd() {
        return (EReference) segmentEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegment_Senseg() {
        return (EReference) segmentEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegment_Child() {
        return (EReference) segmentEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegment_Parent() {
        return (EReference) segmentEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegment_Exit() {
        return (EReference) segmentEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getSegmentComplex() {
        return segmentComplexEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegmentComplex_DeleteFlag() {
        return (EAttribute) segmentComplexEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegmentComplex_InsertFlag() {
        return (EAttribute) segmentComplexEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegmentComplex_ReplaceFlag() {
        return (EAttribute) segmentComplexEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegmentComplex_SegmPointer() {
        return (EAttribute) segmentComplexEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegmentComplex_DsGroup() {
        return (EAttribute) segmentComplexEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegmentComplex_SecondaryIndex() {
        return (EReference) segmentComplexEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegmentComplex_Lchild() {
        return (EReference) segmentComplexEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegmentComplex_SourcedIndex() {
        return (EReference) segmentComplexEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegmentComplex_Lparent() {
        return (EReference) segmentComplexEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegmentComplex_PairedLCHILD() {
        return (EReference) segmentComplexEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegmentComplex_Dataset() {
        return (EReference) segmentComplexEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getSegmentLogical() {
        return segmentLogicalEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegmentLogical_KeyData1() {
        return (EAttribute) segmentLogicalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSegmentLogical_KeyData2() {
        return (EAttribute) segmentLogicalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSegmentLogical_Physical() {
        return (EReference) segmentLogicalEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getField() {
        return fieldEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getField_SequenceField() {
        return (EAttribute) fieldEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getField_UniqueSequence() {
        return (EAttribute) fieldEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getField_FieldLength() {
        return (EAttribute) fieldEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getField_Generated() {
        return (EAttribute) fieldEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getField_SearchIndex() {
        return (EReference) fieldEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getField_DdataIndex() {
        return (EReference) fieldEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getField_SubseqIndex() {
        return (EReference) fieldEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getField_SenField() {
        return (EReference) fieldEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataset() {
        return datasetEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_Dd1name() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_Device() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_Model() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_Dd2name() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_Size1() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_Size2() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_RecordLength1() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_RecordLength2() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_BlockingFactor1() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_BlockingFactor2() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_DatasetLabel() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_FreeBlockFrequency() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_FreeSpacePercentage() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_RecordFormat() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_ScanCylinders() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_SearchAlgorithm() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_Root() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_RootOverflow() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_Uow() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataset_UowOverflow() {
        return (EAttribute) datasetEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataset_Dbd() {
        return (EReference) datasetEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataset_Segment() {
        return (EReference) datasetEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getSenSegment() {
        return senSegmentEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSenSegment_ProcoptSENSEG() {
        return (EAttribute) senSegmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSenSegment_SubsetPointers() {
        return (EAttribute) senSegmentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSenSegment_Pcb() {
        return (EReference) senSegmentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSenSegment_SenField() {
        return (EReference) senSegmentEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSenSegment_Segment() {
        return (EReference) senSegmentEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getSenField() {
        return senFieldEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSenField_Replace() {
        return (EAttribute) senFieldEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSenField_SenSegment() {
        return (EReference) senFieldEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSenField_Field() {
        return (EReference) senFieldEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getACBLIB() {
        return acblibEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getACBLIB_Psb() {
        return (EReference) acblibEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getACBLIB_Dbd() {
        return (EReference) acblibEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccessMethod() {
        return accessMethodEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getAccessMethod_Dbd() {
        return (EReference) accessMethodEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getINDEX() {
        return indexEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINDEX_DosCompatibility() {
        return (EAttribute) indexEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINDEX_Protect() {
        return (EAttribute) indexEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getINDEX_PrimaryTarget() {
        return (EReference) indexEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getINDEX_SecondaryTarget() {
        return (EReference) indexEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getINDEX_SharingIndex() {
        return (EReference) indexEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getINDEX_SharedIndex() {
        return (EReference) indexEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getINDEX_SequencedPCB() {
        return (EReference) indexEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getHIDAM() {
        return hidamEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getHIDAM_Index() {
        return (EReference) hidamEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDEDB() {
        return dedbEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDEDB_RmName() {
        return (EAttribute) dedbEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDEDB_Stage() {
        return (EAttribute) dedbEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDEDB_ExtendedCall() {
        return (EAttribute) dedbEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getHDAM() {
        return hdamEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDAM_RmName() {
        return (EAttribute) hdamEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDAM_RelativeBlockNumber() {
        return (EAttribute) hdamEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDAM_RootAnchorPoints() {
        return (EAttribute) hdamEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDAM_RootMaxBytes() {
        return (EAttribute) hdamEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getMSDB() {
        return msdbEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMSDB_MsdbField() {
        return (EAttribute) msdbEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMSDB_MsdbType() {
        return (EAttribute) msdbEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getSecondaryIndex() {
        return secondaryIndexEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSecondaryIndex_Constant() {
        return (EAttribute) secondaryIndexEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSecondaryIndex_ExitRoutine() {
        return (EAttribute) secondaryIndexEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSecondaryIndex_NullValue() {
        return (EAttribute) secondaryIndexEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSecondaryIndex_Index() {
        return (EReference) secondaryIndexEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSecondaryIndex_Segment() {
        return (EReference) secondaryIndexEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSecondaryIndex_SearchFields() {
        return (EReference) secondaryIndexEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSecondaryIndex_DdataFields() {
        return (EReference) secondaryIndexEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSecondaryIndex_SubseqFields() {
        return (EReference) secondaryIndexEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSecondaryIndex_IndexSource() {
        return (EReference) secondaryIndexEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getExit() {
        return exitEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExit_Key() {
        return (EAttribute) exitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExit_Data() {
        return (EAttribute) exitEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExit_Path() {
        return (EAttribute) exitEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExit_Log() {
        return (EAttribute) exitEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExit_Cascade() {
        return (EAttribute) exitEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExit_CascadeKey() {
        return (EAttribute) exitEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExit_CascadeData() {
        return (EAttribute) exitEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExit_CascadePath() {
        return (EAttribute) exitEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getExit_Dbd() {
        return (EReference) exitEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getExit_Segment() {
        return (EReference) exitEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLCHILD() {
        return lchildEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLCHILD_Counter() {
        return (EAttribute) lchildEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLCHILD_LcPointer() {
        return (EAttribute) lchildEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLCHILD_LparentFlag() {
        return (EAttribute) lchildEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLCHILD_Ltwin() {
        return (EAttribute) lchildEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLCHILD_Rules() {
        return (EAttribute) lchildEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLCHILD_VirtualParent() {
        return (EAttribute) lchildEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLCHILD_Lparent() {
        return (EReference) lchildEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLCHILD_Lchild() {
        return (EReference) lchildEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLCHILD_PairedSegment() {
        return (EReference) lchildEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getPSBLib() {
        return psbLibEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getPSBLib_Psb() {
        return (EReference) psbLibEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDBDLib() {
        return dbdLibEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getDBDLib_Dbd() {
        return (EReference) dbdLibEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ImsdatabaseFactory getImsdatabaseFactory() {
        return (ImsdatabaseFactory) getEFactoryInstance();
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
        dbdEClass = createEClass(DBD);
        createEAttribute(dbdEClass, DBD__DLI_ACCESS);
        createEAttribute(dbdEClass, DBD__IS_VSAM);
        createEAttribute(dbdEClass, DBD__PASSWORD_FLAG);
        createEAttribute(dbdEClass, DBD__VERSION_STRING);
        createEReference(dbdEClass, DBD__ACCESS_METHOD);
        createEReference(dbdEClass, DBD__ACBLIB);
        createEReference(dbdEClass, DBD__DATASET);
        createEReference(dbdEClass, DBD__SEGMENT);
        createEReference(dbdEClass, DBD__PCB);
        createEReference(dbdEClass, DBD__EXIT);
        createEReference(dbdEClass, DBD__LIBRARY);

        psbEClass = createEClass(PSB);
        createEAttribute(psbEClass, PSB__COMPATIBILITY);
        createEAttribute(psbEClass, PSB__IO_ERROR_OPTION);
        createEAttribute(psbEClass, PSB__IOA_SIZE);
        createEAttribute(psbEClass, PSB__LANGUAGE);
        createEAttribute(psbEClass, PSB__LOCK_MAXIMUM);
        createEAttribute(psbEClass, PSB__MAXIMUM_QX_CALLS);
        createEAttribute(psbEClass, PSB__ONLINE_IMAGE_COPY);
        createEAttribute(psbEClass, PSB__SSA_SIZE);
        createEAttribute(psbEClass, PSB__WRITE_TO_OPERATOR);
        createEReference(psbEClass, PSB__ACBLIB);
        createEReference(psbEClass, PSB__PCB);
        createEReference(psbEClass, PSB__LIBRARY);

        pcbEClass = createEClass(PCB);
        createEAttribute(pcbEClass, PCB__PCB_TYPE);
        createEAttribute(pcbEClass, PCB__LIST);
        createEAttribute(pcbEClass, PCB__KEY_LENGTH);
        createEAttribute(pcbEClass, PCB__PROCESSING_OPTIONS);
        createEAttribute(pcbEClass, PCB__POSITIONING);
        createEAttribute(pcbEClass, PCB__SEQUENTIAL_BUFFERING);
        createEAttribute(pcbEClass, PCB__ALTERNATE_RESPONSE);
        createEAttribute(pcbEClass, PCB__EXPRESS);
        createEAttribute(pcbEClass, PCB__MODIFY);
        createEAttribute(pcbEClass, PCB__SAME_TERMINAL);
        createEAttribute(pcbEClass, PCB__DESTINATION_TYPE);
        createEAttribute(pcbEClass, PCB__LTERM_NAME);
        createEReference(pcbEClass, PCB__PROC_SEQ);
        createEReference(pcbEClass, PCB__DBD);
        createEReference(pcbEClass, PCB__PSB);
        createEReference(pcbEClass, PCB__SEN_SEGMENT);

        segmentEClass = createEClass(SEGMENT);
        createEAttribute(segmentEClass, SEGMENT__EXIT_FLAG);
        createEAttribute(segmentEClass, SEGMENT__FREQUENCY);
        createEAttribute(segmentEClass, SEGMENT__MAXIMUM_LENGTH);
        createEAttribute(segmentEClass, SEGMENT__MINIMUM_LENGTH);
        createEAttribute(segmentEClass, SEGMENT__RULES);
        createEAttribute(segmentEClass, SEGMENT__SUBSET_POINTERS);
        createEAttribute(segmentEClass, SEGMENT__DIRECT_DEPENDENT);
        createEAttribute(segmentEClass, SEGMENT__PC_POINTER);
        createEReference(segmentEClass, SEGMENT__LOGICAL);
        createEReference(segmentEClass, SEGMENT__DBD);
        createEReference(segmentEClass, SEGMENT__SENSEG);
        createEReference(segmentEClass, SEGMENT__CHILD);
        createEReference(segmentEClass, SEGMENT__PARENT);
        createEReference(segmentEClass, SEGMENT__EXIT);

        segmentComplexEClass = createEClass(SEGMENT_COMPLEX);
        createEAttribute(segmentComplexEClass, SEGMENT_COMPLEX__DELETE_FLAG);
        createEAttribute(segmentComplexEClass, SEGMENT_COMPLEX__INSERT_FLAG);
        createEAttribute(segmentComplexEClass, SEGMENT_COMPLEX__REPLACE_FLAG);
        createEAttribute(segmentComplexEClass, SEGMENT_COMPLEX__SEGM_POINTER);
        createEAttribute(segmentComplexEClass, SEGMENT_COMPLEX__DS_GROUP);
        createEReference(segmentComplexEClass, SEGMENT_COMPLEX__SECONDARY_INDEX);
        createEReference(segmentComplexEClass, SEGMENT_COMPLEX__LCHILD);
        createEReference(segmentComplexEClass, SEGMENT_COMPLEX__SOURCED_INDEX);
        createEReference(segmentComplexEClass, SEGMENT_COMPLEX__LPARENT);
        createEReference(segmentComplexEClass, SEGMENT_COMPLEX__PAIRED_LCHILD);
        createEReference(segmentComplexEClass, SEGMENT_COMPLEX__DATASET);

        segmentLogicalEClass = createEClass(SEGMENT_LOGICAL);
        createEAttribute(segmentLogicalEClass, SEGMENT_LOGICAL__KEY_DATA1);
        createEAttribute(segmentLogicalEClass, SEGMENT_LOGICAL__KEY_DATA2);
        createEReference(segmentLogicalEClass, SEGMENT_LOGICAL__PHYSICAL);

        fieldEClass = createEClass(FIELD);
        createEAttribute(fieldEClass, FIELD__SEQUENCE_FIELD);
        createEAttribute(fieldEClass, FIELD__UNIQUE_SEQUENCE);
        createEAttribute(fieldEClass, FIELD__FIELD_LENGTH);
        createEAttribute(fieldEClass, FIELD__GENERATED);
        createEReference(fieldEClass, FIELD__SEARCH_INDEX);
        createEReference(fieldEClass, FIELD__DDATA_INDEX);
        createEReference(fieldEClass, FIELD__SUBSEQ_INDEX);
        createEReference(fieldEClass, FIELD__SEN_FIELD);

        datasetEClass = createEClass(DATASET);
        createEAttribute(datasetEClass, DATASET__DD1NAME);
        createEAttribute(datasetEClass, DATASET__DEVICE);
        createEAttribute(datasetEClass, DATASET__MODEL);
        createEAttribute(datasetEClass, DATASET__DD2NAME);
        createEAttribute(datasetEClass, DATASET__SIZE1);
        createEAttribute(datasetEClass, DATASET__SIZE2);
        createEAttribute(datasetEClass, DATASET__RECORD_LENGTH1);
        createEAttribute(datasetEClass, DATASET__RECORD_LENGTH2);
        createEAttribute(datasetEClass, DATASET__BLOCKING_FACTOR1);
        createEAttribute(datasetEClass, DATASET__BLOCKING_FACTOR2);
        createEAttribute(datasetEClass, DATASET__DATASET_LABEL);
        createEAttribute(datasetEClass, DATASET__FREE_BLOCK_FREQUENCY);
        createEAttribute(datasetEClass, DATASET__FREE_SPACE_PERCENTAGE);
        createEAttribute(datasetEClass, DATASET__RECORD_FORMAT);
        createEAttribute(datasetEClass, DATASET__SCAN_CYLINDERS);
        createEAttribute(datasetEClass, DATASET__SEARCH_ALGORITHM);
        createEAttribute(datasetEClass, DATASET__ROOT);
        createEAttribute(datasetEClass, DATASET__ROOT_OVERFLOW);
        createEAttribute(datasetEClass, DATASET__UOW);
        createEAttribute(datasetEClass, DATASET__UOW_OVERFLOW);
        createEReference(datasetEClass, DATASET__DBD);
        createEReference(datasetEClass, DATASET__SEGMENT);

        senSegmentEClass = createEClass(SEN_SEGMENT);
        createEAttribute(senSegmentEClass, SEN_SEGMENT__PROCOPT_SENSEG);
        createEAttribute(senSegmentEClass, SEN_SEGMENT__SUBSET_POINTERS);
        createEReference(senSegmentEClass, SEN_SEGMENT__PCB);
        createEReference(senSegmentEClass, SEN_SEGMENT__SEN_FIELD);
        createEReference(senSegmentEClass, SEN_SEGMENT__SEGMENT);

        senFieldEClass = createEClass(SEN_FIELD);
        createEAttribute(senFieldEClass, SEN_FIELD__REPLACE);
        createEReference(senFieldEClass, SEN_FIELD__SEN_SEGMENT);
        createEReference(senFieldEClass, SEN_FIELD__FIELD);

        acblibEClass = createEClass(ACBLIB);
        createEReference(acblibEClass, ACBLIB__PSB);
        createEReference(acblibEClass, ACBLIB__DBD);

        accessMethodEClass = createEClass(ACCESS_METHOD);
        createEReference(accessMethodEClass, ACCESS_METHOD__DBD);

        indexEClass = createEClass(INDEX);
        createEAttribute(indexEClass, INDEX__DOS_COMPATIBILITY);
        createEAttribute(indexEClass, INDEX__PROTECT);
        createEReference(indexEClass, INDEX__PRIMARY_TARGET);
        createEReference(indexEClass, INDEX__SECONDARY_TARGET);
        createEReference(indexEClass, INDEX__SHARING_INDEX);
        createEReference(indexEClass, INDEX__SHARED_INDEX);
        createEReference(indexEClass, INDEX__SEQUENCED_PCB);

        hidamEClass = createEClass(HIDAM);
        createEReference(hidamEClass, HIDAM__INDEX);

        dedbEClass = createEClass(DEDB);
        createEAttribute(dedbEClass, DEDB__RM_NAME);
        createEAttribute(dedbEClass, DEDB__STAGE);
        createEAttribute(dedbEClass, DEDB__EXTENDED_CALL);

        hdamEClass = createEClass(HDAM);
        createEAttribute(hdamEClass, HDAM__RM_NAME);
        createEAttribute(hdamEClass, HDAM__RELATIVE_BLOCK_NUMBER);
        createEAttribute(hdamEClass, HDAM__ROOT_ANCHOR_POINTS);
        createEAttribute(hdamEClass, HDAM__ROOT_MAX_BYTES);

        msdbEClass = createEClass(MSDB);
        createEAttribute(msdbEClass, MSDB__MSDB_FIELD);
        createEAttribute(msdbEClass, MSDB__MSDB_TYPE);

        secondaryIndexEClass = createEClass(SECONDARY_INDEX);
        createEAttribute(secondaryIndexEClass, SECONDARY_INDEX__CONSTANT);
        createEAttribute(secondaryIndexEClass, SECONDARY_INDEX__EXIT_ROUTINE);
        createEAttribute(secondaryIndexEClass, SECONDARY_INDEX__NULL_VALUE);
        createEReference(secondaryIndexEClass, SECONDARY_INDEX__INDEX);
        createEReference(secondaryIndexEClass, SECONDARY_INDEX__SEGMENT);
        createEReference(secondaryIndexEClass, SECONDARY_INDEX__SEARCH_FIELDS);
        createEReference(secondaryIndexEClass, SECONDARY_INDEX__DDATA_FIELDS);
        createEReference(secondaryIndexEClass, SECONDARY_INDEX__SUBSEQ_FIELDS);
        createEReference(secondaryIndexEClass, SECONDARY_INDEX__INDEX_SOURCE);

        exitEClass = createEClass(EXIT);
        createEAttribute(exitEClass, EXIT__KEY);
        createEAttribute(exitEClass, EXIT__DATA);
        createEAttribute(exitEClass, EXIT__PATH);
        createEAttribute(exitEClass, EXIT__LOG);
        createEAttribute(exitEClass, EXIT__CASCADE);
        createEAttribute(exitEClass, EXIT__CASCADE_KEY);
        createEAttribute(exitEClass, EXIT__CASCADE_DATA);
        createEAttribute(exitEClass, EXIT__CASCADE_PATH);
        createEReference(exitEClass, EXIT__DBD);
        createEReference(exitEClass, EXIT__SEGMENT);

        lchildEClass = createEClass(LCHILD);
        createEAttribute(lchildEClass, LCHILD__COUNTER);
        createEAttribute(lchildEClass, LCHILD__LC_POINTER);
        createEAttribute(lchildEClass, LCHILD__LPARENT_FLAG);
        createEAttribute(lchildEClass, LCHILD__LTWIN);
        createEAttribute(lchildEClass, LCHILD__RULES);
        createEAttribute(lchildEClass, LCHILD__VIRTUAL_PARENT);
        createEReference(lchildEClass, LCHILD__LPARENT);
        createEReference(lchildEClass, LCHILD__LCHILD);
        createEReference(lchildEClass, LCHILD__PAIRED_SEGMENT);

        psbLibEClass = createEClass(PSB_LIB);
        createEReference(psbLibEClass, PSB_LIB__PSB);

        dbdLibEClass = createEClass(DBD_LIB);
        createEReference(dbdLibEClass, DBD_LIB__DBD);
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
        ImstypesPackage theImstypesPackage = (ImstypesPackage) EPackage.Registry.INSTANCE.getEPackage(ImstypesPackage.eNS_URI);
        RecordPackage theRecordPackage = (RecordPackage) EPackage.Registry.INSTANCE.getEPackage(RecordPackage.eNS_URI);
        CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theImstypesPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        dbdEClass.getESuperTypes().add(theRecordPackage.getRecordFile());
        psbEClass.getESuperTypes().add(theRecordPackage.getRecordFile());
        pcbEClass.getESuperTypes().add(theRecordPackage.getRecordFile());
        segmentEClass.getESuperTypes().add(theRecordPackage.getRecordDef());
        segmentComplexEClass.getESuperTypes().add(this.getSegment());
        segmentLogicalEClass.getESuperTypes().add(this.getSegment());
        fieldEClass.getESuperTypes().add(theRecordPackage.getFixedOffsetField());
        datasetEClass.getESuperTypes().add(theCorePackage.getModelElement());
        senSegmentEClass.getESuperTypes().add(theRecordPackage.getRecordDef());
        senFieldEClass.getESuperTypes().add(theRecordPackage.getFixedOffsetField());
        acblibEClass.getESuperTypes().add(theCorePackage.getPackage());
        accessMethodEClass.getESuperTypes().add(theCorePackage.getModelElement());
        indexEClass.getESuperTypes().add(this.getAccessMethod());
        hidamEClass.getESuperTypes().add(this.getAccessMethod());
        dedbEClass.getESuperTypes().add(this.getAccessMethod());
        hdamEClass.getESuperTypes().add(this.getAccessMethod());
        msdbEClass.getESuperTypes().add(this.getAccessMethod());
        secondaryIndexEClass.getESuperTypes().add(theCorePackage.getModelElement());
        exitEClass.getESuperTypes().add(theCorePackage.getModelElement());
        lchildEClass.getESuperTypes().add(theCorePackage.getModelElement());
        psbLibEClass.getESuperTypes().add(theCorePackage.getPackage());
        dbdLibEClass.getESuperTypes().add(theCorePackage.getPackage());

        // Initialize classes and features; add operations and parameters
        initEClass(dbdEClass, orgomg.cwmx.resource.imsdatabase.DBD.class, "DBD", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDBD_DliAccess(), theImstypesPackage.getAccessMethodType(), "dliAccess", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDBD_IsVSAM(), theCorePackage.getBoolean(), "isVSAM", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDBD_PasswordFlag(), theCorePackage.getBoolean(), "passwordFlag", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDBD_VersionString(), theCorePackage.getString(), "versionString", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDBD_AccessMethod(), this.getAccessMethod(), this.getAccessMethod_Dbd(), "accessMethod", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDBD_Acblib(), this.getACBLIB(), this.getACBLIB_Dbd(), "acblib", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDBD_Dataset(), this.getDataset(), this.getDataset_Dbd(), "dataset", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDBD_Segment(), this.getSegment(), this.getSegment_Dbd(), "segment", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDBD_Pcb(), this.getPCB(), this.getPCB_Dbd(), "pcb", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDBD_Exit(), this.getExit(), this.getExit_Dbd(), "exit", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDBD_Library(), this.getDBDLib(), this.getDBDLib_Dbd(), "library", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.DBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(psbEClass, orgomg.cwmx.resource.imsdatabase.PSB.class, "PSB", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPSB_Compatibility(), theCorePackage.getBoolean(), "compatibility", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPSB_IoErrorOption(), theCorePackage.getInteger(), "ioErrorOption", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPSB_IoaSize(), theCorePackage.getInteger(), "ioaSize", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPSB_Language(), theImstypesPackage.getPSBLanguageType(), "language", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPSB_LockMaximum(), theCorePackage.getInteger(), "lockMaximum", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPSB_MaximumQxCalls(), theCorePackage.getInteger(), "maximumQxCalls", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPSB_OnlineImageCopy(), theCorePackage.getBoolean(), "onlineImageCopy", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPSB_SsaSize(), theCorePackage.getInteger(), "ssaSize", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPSB_WriteToOperator(), theCorePackage.getBoolean(), "writeToOperator", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPSB_Acblib(), this.getACBLIB(), this.getACBLIB_Psb(), "acblib", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPSB_Pcb(), this.getPCB(), this.getPCB_Psb(), "pcb", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPSB_Library(), this.getPSBLib(), this.getPSBLib_Psb(), "library", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.PSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pcbEClass, orgomg.cwmx.resource.imsdatabase.PCB.class, "PCB", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPCB_PcbType(), theImstypesPackage.getPCBType(), "pcbType", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_List(), theCorePackage.getBoolean(), "list", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_KeyLength(), theCorePackage.getInteger(), "keyLength", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_ProcessingOptions(), theCorePackage.getString(), "processingOptions", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_Positioning(), theImstypesPackage.getPositioningType(), "positioning", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_SequentialBuffering(), theCorePackage.getBoolean(), "sequentialBuffering", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_AlternateResponse(), theCorePackage.getBoolean(), "alternateResponse", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_Express(), theCorePackage.getBoolean(), "express", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_Modify(), theCorePackage.getBoolean(), "modify", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_SameTerminal(), theCorePackage.getBoolean(), "sameTerminal", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_DestinationType(), theImstypesPackage.getLTermType(), "destinationType", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPCB_LtermName(), theCorePackage.getString(), "ltermName", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPCB_ProcSeq(), this.getINDEX(), this.getINDEX_SequencedPCB(), "procSeq", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPCB_Dbd(), this.getDBD(), this.getDBD_Pcb(), "dbd", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPCB_Psb(), this.getPSB(), this.getPSB_Pcb(), "psb", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPCB_SenSegment(), this.getSenSegment(), this.getSenSegment_Pcb(), "senSegment", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.PCB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(segmentEClass, Segment.class, "Segment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSegment_ExitFlag(), theCorePackage.getBoolean(), "exitFlag", null, 0, 1, Segment.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSegment_Frequency(), theCorePackage.getString(), "frequency", null, 0, 1, Segment.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSegment_MaximumLength(), theCorePackage.getInteger(), "maximumLength", null, 0, 1, Segment.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSegment_MinimumLength(), theCorePackage.getInteger(), "minimumLength", null, 0, 1, Segment.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSegment_Rules(), theImstypesPackage.getRulesType(), "rules", null, 0, 1, Segment.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSegment_SubsetPointers(), theCorePackage.getString(), "subsetPointers", null, 0, 1, Segment.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSegment_DirectDependent(), theCorePackage.getBoolean(), "directDependent", null, 0, 1, Segment.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSegment_PcPointer(), theImstypesPackage.getChildPointerType(), "pcPointer", null, 0, 1, Segment.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSegment_Logical(), this.getSegmentLogical(), this.getSegmentLogical_Physical(), "logical", null, 0, -1,
                Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSegment_Dbd(), this.getDBD(), this.getDBD_Segment(), "dbd", null, 1, 1, Segment.class, IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEReference(getSegment_Senseg(), this.getSenSegment(), this.getSenSegment_Segment(), "senseg", null, 0, -1,
                Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSegment_Child(), this.getSegment(), this.getSegment_Parent(), "child", null, 0, -1, Segment.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getSegment_Parent(), this.getSegment(), this.getSegment_Child(), "parent", null, 0, 1, Segment.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getSegment_Exit(), this.getExit(), this.getExit_Segment(), "exit", null, 0, -1, Segment.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(segmentComplexEClass, SegmentComplex.class, "SegmentComplex", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSegmentComplex_DeleteFlag(), theImstypesPackage.getFlagsType(), "deleteFlag", "76", 0, 1,
                SegmentComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getSegmentComplex_InsertFlag(), theImstypesPackage.getFlagsType(), "insertFlag", "76", 0, 1,
                SegmentComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getSegmentComplex_ReplaceFlag(), theImstypesPackage.getFlagsType(), "replaceFlag", "76", 0, 1,
                SegmentComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getSegmentComplex_SegmPointer(), theImstypesPackage.getPointerType(), "segmPointer", null, 0, 1,
                SegmentComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getSegmentComplex_DsGroup(), theCorePackage.getString(), "dsGroup", "A", 0, 1, SegmentComplex.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSegmentComplex_SecondaryIndex(), this.getSecondaryIndex(), this.getSecondaryIndex_Segment(),
                "secondaryIndex", null, 0, 32, SegmentComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSegmentComplex_Lchild(), this.getLCHILD(), this.getLCHILD_Lparent(), "lchild", null, 0, -1,
                SegmentComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSegmentComplex_SourcedIndex(), this.getSecondaryIndex(), this.getSecondaryIndex_IndexSource(),
                "sourcedIndex", null, 0, -1, SegmentComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSegmentComplex_Lparent(), this.getLCHILD(), this.getLCHILD_Lchild(), "lparent", null, 0, 1,
                SegmentComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSegmentComplex_PairedLCHILD(), this.getLCHILD(), this.getLCHILD_PairedSegment(), "pairedLCHILD", null,
                0, 1, SegmentComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSegmentComplex_Dataset(), this.getDataset(), this.getDataset_Segment(), "dataset", null, 0, 1,
                SegmentComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(segmentLogicalEClass, SegmentLogical.class, "SegmentLogical", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSegmentLogical_KeyData1(), theCorePackage.getBoolean(), "keyData1", null, 0, 1, SegmentLogical.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSegmentLogical_KeyData2(), theCorePackage.getBoolean(), "keyData2", null, 0, 1, SegmentLogical.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSegmentLogical_Physical(), this.getSegment(), this.getSegment_Logical(), "physical", null, 0, 2,
                SegmentLogical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getField_SequenceField(), theCorePackage.getBoolean(), "sequenceField", null, 0, 1, Field.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getField_UniqueSequence(), theCorePackage.getBoolean(), "uniqueSequence", null, 0, 1, Field.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getField_FieldLength(), theCorePackage.getInteger(), "fieldLength", null, 0, 1, Field.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getField_Generated(), theCorePackage.getBoolean(), "generated", null, 0, 1, Field.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getField_SearchIndex(), this.getSecondaryIndex(), this.getSecondaryIndex_SearchFields(), "searchIndex",
                null, 0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getField_DdataIndex(), this.getSecondaryIndex(), this.getSecondaryIndex_DdataFields(), "ddataIndex", null,
                0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getField_SubseqIndex(), this.getSecondaryIndex(), this.getSecondaryIndex_SubseqFields(), "subseqIndex",
                null, 0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getField_SenField(), this.getSenField(), this.getSenField_Field(), "senField", null, 0, -1, Field.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDataset_Dd1name(), theCorePackage.getString(), "dd1name", null, 0, 1, Dataset.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_Device(), theImstypesPackage.getDeviceType(), "device", null, 0, 1, Dataset.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_Model(), theImstypesPackage.getModelType(), "model", null, 0, 1, Dataset.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_Dd2name(), theCorePackage.getString(), "dd2name", null, 0, 1, Dataset.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_Size1(), theCorePackage.getInteger(), "size1", null, 0, 1, Dataset.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_Size2(), theCorePackage.getInteger(), "size2", null, 0, 1, Dataset.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_RecordLength1(), theCorePackage.getInteger(), "recordLength1", null, 0, 1, Dataset.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_RecordLength2(), theCorePackage.getInteger(), "recordLength2", null, 0, 1, Dataset.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_BlockingFactor1(), theCorePackage.getInteger(), "blockingFactor1", null, 0, 1, Dataset.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_BlockingFactor2(), theCorePackage.getInteger(), "blockingFactor2", null, 0, 1, Dataset.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_DatasetLabel(), theCorePackage.getString(), "datasetLabel", null, 0, 1, Dataset.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_FreeBlockFrequency(), theCorePackage.getInteger(), "freeBlockFrequency", null, 0, 1,
                Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getDataset_FreeSpacePercentage(), theCorePackage.getInteger(), "freeSpacePercentage", null, 0, 1,
                Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getDataset_RecordFormat(), theImstypesPackage.getRECFMType(), "recordFormat", null, 0, 1, Dataset.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_ScanCylinders(), theCorePackage.getInteger(), "scanCylinders", null, 0, 1, Dataset.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_SearchAlgorithm(), theImstypesPackage.getAlgorithmType(), "searchAlgorithm", null, 0, 1,
                Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getDataset_Root(), theCorePackage.getInteger(), "root", null, 0, 1, Dataset.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_RootOverflow(), theCorePackage.getInteger(), "rootOverflow", null, 0, 1, Dataset.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_Uow(), theCorePackage.getInteger(), "uow", null, 0, 1, Dataset.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataset_UowOverflow(), theCorePackage.getInteger(), "uowOverflow", null, 0, 1, Dataset.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataset_Dbd(), this.getDBD(), this.getDBD_Dataset(), "dbd", null, 1, 1, Dataset.class, IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEReference(getDataset_Segment(), this.getSegmentComplex(), this.getSegmentComplex_Dataset(), "segment", null, 0, -1,
                Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(senSegmentEClass, SenSegment.class, "SenSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSenSegment_ProcoptSENSEG(), theCorePackage.getString(), "procoptSENSEG", null, 0, 1, SenSegment.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSenSegment_SubsetPointers(), theCorePackage.getString(), "subsetPointers", null, 0, 1,
                SenSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEReference(getSenSegment_Pcb(), this.getPCB(), this.getPCB_SenSegment(), "pcb", null, 1, 1, SenSegment.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getSenSegment_SenField(), this.getSenField(), this.getSenField_SenSegment(), "senField", null, 0, -1,
                SenSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSenSegment_Segment(), this.getSegment(), this.getSegment_Senseg(), "segment", null, 1, 1,
                SenSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(senFieldEClass, SenField.class, "SenField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSenField_Replace(), theCorePackage.getBoolean(), "replace", null, 0, 1, SenField.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSenField_SenSegment(), this.getSenSegment(), this.getSenSegment_SenField(), "senSegment", null, 1, 1,
                SenField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSenField_Field(), this.getField(), this.getField_SenField(), "field", null, 1, 1, SenField.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(acblibEClass, orgomg.cwmx.resource.imsdatabase.ACBLIB.class, "ACBLIB", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getACBLIB_Psb(), this.getPSB(), this.getPSB_Acblib(), "psb", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.ACBLIB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getACBLIB_Dbd(), this.getDBD(), this.getDBD_Acblib(), "dbd", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.ACBLIB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(accessMethodEClass, AccessMethod.class, "AccessMethod", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAccessMethod_Dbd(), this.getDBD(), this.getDBD_AccessMethod(), "dbd", null, 1, 1, AccessMethod.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(indexEClass, orgomg.cwmx.resource.imsdatabase.INDEX.class, "INDEX", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getINDEX_DosCompatibility(), theCorePackage.getBoolean(), "dosCompatibility", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.INDEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getINDEX_Protect(), theCorePackage.getBoolean(), "protect", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.INDEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getINDEX_PrimaryTarget(), this.getHIDAM(), this.getHIDAM_Index(), "primaryTarget", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.INDEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getINDEX_SecondaryTarget(), this.getSecondaryIndex(), this.getSecondaryIndex_Index(), "secondaryTarget",
                null, 0, 1, orgomg.cwmx.resource.imsdatabase.INDEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getINDEX_SharingIndex(), this.getINDEX(), this.getINDEX_SharedIndex(), "sharingIndex", null, 0, 16,
                orgomg.cwmx.resource.imsdatabase.INDEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getINDEX_SharedIndex(), this.getINDEX(), this.getINDEX_SharingIndex(), "sharedIndex", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.INDEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getINDEX_SequencedPCB(), this.getPCB(), this.getPCB_ProcSeq(), "sequencedPCB", null, 0, -1,
                orgomg.cwmx.resource.imsdatabase.INDEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hidamEClass, orgomg.cwmx.resource.imsdatabase.HIDAM.class, "HIDAM", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getHIDAM_Index(), this.getINDEX(), this.getINDEX_PrimaryTarget(), "index", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.HIDAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dedbEClass, orgomg.cwmx.resource.imsdatabase.DEDB.class, "DEDB", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDEDB_RmName(), theCorePackage.getString(), "rmName", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.DEDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDEDB_Stage(), theCorePackage.getInteger(), "stage", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.DEDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDEDB_ExtendedCall(), theCorePackage.getBoolean(), "extendedCall", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.DEDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hdamEClass, orgomg.cwmx.resource.imsdatabase.HDAM.class, "HDAM", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHDAM_RmName(), theCorePackage.getString(), "rmName", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.HDAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDAM_RelativeBlockNumber(), theCorePackage.getInteger(), "relativeBlockNumber", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.HDAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDAM_RootAnchorPoints(), theCorePackage.getInteger(), "rootAnchorPoints", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.HDAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDAM_RootMaxBytes(), theCorePackage.getInteger(), "rootMaxBytes", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.HDAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(msdbEClass, orgomg.cwmx.resource.imsdatabase.MSDB.class, "MSDB", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMSDB_MsdbField(), theCorePackage.getString(), "msdbField", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.MSDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMSDB_MsdbType(), theImstypesPackage.getMSDBtype(), "msdbType", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.MSDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(secondaryIndexEClass, SecondaryIndex.class, "SecondaryIndex", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSecondaryIndex_Constant(), theCorePackage.getString(), "constant", null, 0, 1, SecondaryIndex.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSecondaryIndex_ExitRoutine(), theCorePackage.getString(), "exitRoutine", null, 0, 1,
                SecondaryIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getSecondaryIndex_NullValue(), theCorePackage.getString(), "nullValue", null, 0, 1, SecondaryIndex.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSecondaryIndex_Index(), this.getINDEX(), this.getINDEX_SecondaryTarget(), "index", null, 1, 1,
                SecondaryIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSecondaryIndex_Segment(), this.getSegmentComplex(), this.getSegmentComplex_SecondaryIndex(), "segment",
                null, 1, 1, SecondaryIndex.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSecondaryIndex_SearchFields(), this.getField(), this.getField_SearchIndex(), "searchFields", null, 0,
                5, SecondaryIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSecondaryIndex_DdataFields(), this.getField(), this.getField_DdataIndex(), "ddataFields", null, 0, 5,
                SecondaryIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSecondaryIndex_SubseqFields(), this.getField(), this.getField_SubseqIndex(), "subseqFields", null, 0,
                5, SecondaryIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSecondaryIndex_IndexSource(), this.getSegmentComplex(), this.getSegmentComplex_SourcedIndex(),
                "indexSource", null, 0, 1, SecondaryIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(exitEClass, Exit.class, "Exit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExit_Key(), theCorePackage.getBoolean(), "key", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExit_Data(), theCorePackage.getBoolean(), "data", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExit_Path(), theCorePackage.getBoolean(), "path", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExit_Log(), theCorePackage.getBoolean(), "log", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExit_Cascade(), theCorePackage.getBoolean(), "cascade", null, 0, 1, Exit.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExit_CascadeKey(), theCorePackage.getBoolean(), "cascadeKey", null, 0, 1, Exit.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExit_CascadeData(), theCorePackage.getBoolean(), "cascadeData", null, 0, 1, Exit.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExit_CascadePath(), theCorePackage.getBoolean(), "cascadePath", null, 0, 1, Exit.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExit_Dbd(), this.getDBD(), this.getDBD_Exit(), "dbd", null, 0, 1, Exit.class, IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEReference(getExit_Segment(), this.getSegment(), this.getSegment_Exit(), "segment", null, 0, 1, Exit.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(lchildEClass, orgomg.cwmx.resource.imsdatabase.LCHILD.class, "LCHILD", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLCHILD_Counter(), theCorePackage.getBoolean(), "counter", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.LCHILD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLCHILD_LcPointer(), theImstypesPackage.getChildPointerType(), "lcPointer", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.LCHILD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLCHILD_LparentFlag(), theCorePackage.getBoolean(), "lparentFlag", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.LCHILD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLCHILD_Ltwin(), theImstypesPackage.getLPointerType(), "ltwin", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.LCHILD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLCHILD_Rules(), theImstypesPackage.getRulesType(), "rules", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.LCHILD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLCHILD_VirtualParent(), theImstypesPackage.getParentType(), "virtualParent", null, 0, 1,
                orgomg.cwmx.resource.imsdatabase.LCHILD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLCHILD_Lparent(), this.getSegmentComplex(), this.getSegmentComplex_Lchild(), "lparent", null, 1, 1,
                orgomg.cwmx.resource.imsdatabase.LCHILD.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLCHILD_Lchild(), this.getSegmentComplex(), this.getSegmentComplex_Lparent(), "lchild", null, 1, 1,
                orgomg.cwmx.resource.imsdatabase.LCHILD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLCHILD_PairedSegment(), this.getSegmentComplex(), this.getSegmentComplex_PairedLCHILD(),
                "pairedSegment", null, 0, 1, orgomg.cwmx.resource.imsdatabase.LCHILD.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(psbLibEClass, PSBLib.class, "PSBLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPSBLib_Psb(), this.getPSB(), this.getPSB_Library(), "psb", null, 0, -1, PSBLib.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(dbdLibEClass, DBDLib.class, "DBDLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDBDLib_Dbd(), this.getDBD(), this.getDBD_Library(), "dbd", null, 0, -1, DBDLib.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} // ImsdatabasePackageImpl
