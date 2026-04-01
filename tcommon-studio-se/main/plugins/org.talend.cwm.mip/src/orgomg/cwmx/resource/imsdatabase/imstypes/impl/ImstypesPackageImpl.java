/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.imstypes.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
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
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl;
import orgomg.cwmx.resource.imsdatabase.imstypes.AccessMethodType;
import orgomg.cwmx.resource.imsdatabase.imstypes.AlgorithmType;
import orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.DeviceType;
import orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType;
import orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesFactory;
import orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage;
import orgomg.cwmx.resource.imsdatabase.imstypes.LPointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.LTermType;
import orgomg.cwmx.resource.imsdatabase.imstypes.MSDBtype;
import orgomg.cwmx.resource.imsdatabase.imstypes.ModelType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PCBType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PSBLanguageType;
import orgomg.cwmx.resource.imsdatabase.imstypes.ParentType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PositioningType;
import orgomg.cwmx.resource.imsdatabase.imstypes.RECFMType;
import orgomg.cwmx.resource.imsdatabase.imstypes.RulesType;
import orgomg.mof.model.ModelPackage;
import orgomg.mof.model.impl.ModelPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ImstypesPackageImpl extends EPackageImpl implements ImstypesPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum accessMethodTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum psbLanguageTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum pcbTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum positioningTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum lTermTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum rulesTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum childPointerTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum flagsTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum pointerTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum deviceTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum modelTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum recfmTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum algorithmTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum lPointerTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum msdBtypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum parentTypeEEnum = null;

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
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ImstypesPackageImpl() {
        super(eNS_URI, ImstypesFactory.eINSTANCE);
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
     * This method is used to initialize {@link ImstypesPackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead,
     * they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ImstypesPackage init() {
        if (isInited)
            return (ImstypesPackage) EPackage.Registry.INSTANCE.getEPackage(ImstypesPackage.eNS_URI);

        // Obtain or create and register package
        ImstypesPackageImpl theImstypesPackage = (ImstypesPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImstypesPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new ImstypesPackageImpl());

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
        theImstypesPackage.createPackageContents();
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
        theEssbasePackage.createPackageContents();
        theExpressPackage.createPackageContents();
        theInformationsetPackage.createPackageContents();
        theInformationreportingPackage.createPackageContents();
        theCwmmipPackage.createPackageContents();
        theModelPackage.createPackageContents();

        // Initialize created meta-data
        theImstypesPackage.initializePackageContents();
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
        theEssbasePackage.initializePackageContents();
        theExpressPackage.initializePackageContents();
        theInformationsetPackage.initializePackageContents();
        theInformationreportingPackage.initializePackageContents();
        theCwmmipPackage.initializePackageContents();
        theModelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theImstypesPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ImstypesPackage.eNS_URI, theImstypesPackage);
        return theImstypesPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAccessMethodType() {
        return accessMethodTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPSBLanguageType() {
        return psbLanguageTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPCBType() {
        return pcbTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPositioningType() {
        return positioningTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLTermType() {
        return lTermTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRulesType() {
        return rulesTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getChildPointerType() {
        return childPointerTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getFlagsType() {
        return flagsTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPointerType() {
        return pointerTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDeviceType() {
        return deviceTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getModelType() {
        return modelTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRECFMType() {
        return recfmTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAlgorithmType() {
        return algorithmTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLPointerType() {
        return lPointerTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMSDBtype() {
        return msdBtypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getParentType() {
        return parentTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ImstypesFactory getImstypesFactory() {
        return (ImstypesFactory) getEFactoryInstance();
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

        // Create enums
        accessMethodTypeEEnum = createEEnum(ACCESS_METHOD_TYPE);
        psbLanguageTypeEEnum = createEEnum(PSB_LANGUAGE_TYPE);
        pcbTypeEEnum = createEEnum(PCB_TYPE);
        positioningTypeEEnum = createEEnum(POSITIONING_TYPE);
        lTermTypeEEnum = createEEnum(LTERM_TYPE);
        rulesTypeEEnum = createEEnum(RULES_TYPE);
        childPointerTypeEEnum = createEEnum(CHILD_POINTER_TYPE);
        flagsTypeEEnum = createEEnum(FLAGS_TYPE);
        pointerTypeEEnum = createEEnum(POINTER_TYPE);
        deviceTypeEEnum = createEEnum(DEVICE_TYPE);
        modelTypeEEnum = createEEnum(MODEL_TYPE);
        recfmTypeEEnum = createEEnum(RECFM_TYPE);
        algorithmTypeEEnum = createEEnum(ALGORITHM_TYPE);
        lPointerTypeEEnum = createEEnum(LPOINTER_TYPE);
        msdBtypeEEnum = createEEnum(MSD_BTYPE);
        parentTypeEEnum = createEEnum(PARENT_TYPE);
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

        // Initialize enums and add enum literals
        initEEnum(accessMethodTypeEEnum, AccessMethodType.class, "AccessMethodType");
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_DEDB);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_GSAM);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_HDAM);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_HIDAM);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_HISAM);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_HSAM);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_INDEX);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_LOGICAL);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_MSDB);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_PSINDEX);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_PHDAM);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_PHIDAM);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_SHSAM);
        addEEnumLiteral(accessMethodTypeEEnum, AccessMethodType.IMSAM_SHISAM);

        initEEnum(psbLanguageTypeEEnum, PSBLanguageType.class, "PSBLanguageType");
        addEEnumLiteral(psbLanguageTypeEEnum, PSBLanguageType.IMSLT_ASSEM);
        addEEnumLiteral(psbLanguageTypeEEnum, PSBLanguageType.IMSLT_C);
        addEEnumLiteral(psbLanguageTypeEEnum, PSBLanguageType.IMSLT_COBOL);
        addEEnumLiteral(psbLanguageTypeEEnum, PSBLanguageType.IMSLT_PLI);
        addEEnumLiteral(psbLanguageTypeEEnum, PSBLanguageType.IMSLT_PASCAL);

        initEEnum(pcbTypeEEnum, PCBType.class, "PCBType");
        addEEnumLiteral(pcbTypeEEnum, PCBType.IMSPT_DB);
        addEEnumLiteral(pcbTypeEEnum, PCBType.IMSPT_GSAM);
        addEEnumLiteral(pcbTypeEEnum, PCBType.IMSPT_TP);

        initEEnum(positioningTypeEEnum, PositioningType.class, "PositioningType");
        addEEnumLiteral(positioningTypeEEnum, PositioningType.IMSPS_SINGLE);
        addEEnumLiteral(positioningTypeEEnum, PositioningType.IMSPS_MULTIPLE);

        initEEnum(lTermTypeEEnum, LTermType.class, "LTermType");
        addEEnumLiteral(lTermTypeEEnum, LTermType.IMSTP_LTERM);
        addEEnumLiteral(lTermTypeEEnum, LTermType.IMSTP_NAME);

        initEEnum(rulesTypeEEnum, RulesType.class, "RulesType");
        addEEnumLiteral(rulesTypeEEnum, RulesType.IMSRT_FIRST);
        addEEnumLiteral(rulesTypeEEnum, RulesType.IMSRT_LAST);
        addEEnumLiteral(rulesTypeEEnum, RulesType.IMSRT_HERE);

        initEEnum(childPointerTypeEEnum, ChildPointerType.class, "ChildPointerType");
        addEEnumLiteral(childPointerTypeEEnum, ChildPointerType.IMSCP_SNGL);
        addEEnumLiteral(childPointerTypeEEnum, ChildPointerType.IMSCP_DBLE);
        addEEnumLiteral(childPointerTypeEEnum, ChildPointerType.IMSCP_NONE);

        initEEnum(flagsTypeEEnum, FlagsType.class, "FlagsType");
        addEEnumLiteral(flagsTypeEEnum, FlagsType.IMSFT_P);
        addEEnumLiteral(flagsTypeEEnum, FlagsType.IMSFT_L);
        addEEnumLiteral(flagsTypeEEnum, FlagsType.IMSFT_V);
        addEEnumLiteral(flagsTypeEEnum, FlagsType.IMDFT_B);

        initEEnum(pointerTypeEEnum, PointerType.class, "PointerType");
        addEEnumLiteral(pointerTypeEEnum, PointerType.IMSPN_NOTWIN);
        addEEnumLiteral(pointerTypeEEnum, PointerType.IMSPN_TWIN);
        addEEnumLiteral(pointerTypeEEnum, PointerType.IMSPN_HIER);
        addEEnumLiteral(pointerTypeEEnum, PointerType.IMSPN_TWINBWD);
        addEEnumLiteral(pointerTypeEEnum, PointerType.IMSPN_HIERBWD);

        initEEnum(deviceTypeEEnum, DeviceType.class, "DeviceType");
        addEEnumLiteral(deviceTypeEEnum, DeviceType.IMSDT_2305);
        addEEnumLiteral(deviceTypeEEnum, DeviceType.IMSDT_2319);
        addEEnumLiteral(deviceTypeEEnum, DeviceType.IMSDT_3330);
        addEEnumLiteral(deviceTypeEEnum, DeviceType.IMSDT_3350);
        addEEnumLiteral(deviceTypeEEnum, DeviceType.IMSDT_3375);
        addEEnumLiteral(deviceTypeEEnum, DeviceType.IMSDT_3380);
        addEEnumLiteral(deviceTypeEEnum, DeviceType.IMSDT_3390);
        addEEnumLiteral(deviceTypeEEnum, DeviceType.IMSDT_2400);
        addEEnumLiteral(deviceTypeEEnum, DeviceType.IMSDT_3400);
        addEEnumLiteral(deviceTypeEEnum, DeviceType.IMSDT_TAPE);

        initEEnum(modelTypeEEnum, ModelType.class, "ModelType");
        addEEnumLiteral(modelTypeEEnum, ModelType.IMSDT_1);
        addEEnumLiteral(modelTypeEEnum, ModelType.IMSDT_2);
        addEEnumLiteral(modelTypeEEnum, ModelType.IMSDT_11);

        initEEnum(recfmTypeEEnum, RECFMType.class, "RECFMType");
        addEEnumLiteral(recfmTypeEEnum, RECFMType.IMSRF_F);
        addEEnumLiteral(recfmTypeEEnum, RECFMType.IMSRF_FB);
        addEEnumLiteral(recfmTypeEEnum, RECFMType.IMSRF_V);
        addEEnumLiteral(recfmTypeEEnum, RECFMType.IMSRF_VB);
        addEEnumLiteral(recfmTypeEEnum, RECFMType.IMSRF_U);

        initEEnum(algorithmTypeEEnum, AlgorithmType.class, "AlgorithmType");
        addEEnumLiteral(algorithmTypeEEnum, AlgorithmType.IMSAT_0);
        addEEnumLiteral(algorithmTypeEEnum, AlgorithmType.IMSAT_1);
        addEEnumLiteral(algorithmTypeEEnum, AlgorithmType.IMSAT_2);

        initEEnum(lPointerTypeEEnum, LPointerType.class, "LPointerType");
        addEEnumLiteral(lPointerTypeEEnum, LPointerType.IMSLP_LTWIN);
        addEEnumLiteral(lPointerTypeEEnum, LPointerType.IMSLP_LTWINBWD);

        initEEnum(msdBtypeEEnum, MSDBtype.class, "MSDBtype");
        addEEnumLiteral(msdBtypeEEnum, MSDBtype.IMSMT_NO);
        addEEnumLiteral(msdBtypeEEnum, MSDBtype.IMSMT_TERM);
        addEEnumLiteral(msdBtypeEEnum, MSDBtype.IMSMT_FIXED);
        addEEnumLiteral(msdBtypeEEnum, MSDBtype.IMSMT_DYNAMIC);

        initEEnum(parentTypeEEnum, ParentType.class, "ParentType");
        addEEnumLiteral(parentTypeEEnum, ParentType.IMS_VIRTUAL);
        addEEnumLiteral(parentTypeEEnum, ParentType.IMS_PHYSICAL);
    }

} // ImstypesPackageImpl
