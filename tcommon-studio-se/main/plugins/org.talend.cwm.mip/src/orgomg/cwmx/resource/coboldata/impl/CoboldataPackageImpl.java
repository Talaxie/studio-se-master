/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata.impl;

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
import orgomg.cwmx.resource.coboldata.AccessType;
import orgomg.cwmx.resource.coboldata.BlockKind;
import orgomg.cwmx.resource.coboldata.COBOLFDIndex;
import orgomg.cwmx.resource.coboldata.COBOLField;
import orgomg.cwmx.resource.coboldata.COBOLItem;
import orgomg.cwmx.resource.coboldata.CoboldataFactory;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.FileOrganization;
import orgomg.cwmx.resource.coboldata.FileSection;
import orgomg.cwmx.resource.coboldata.LabelKind;
import orgomg.cwmx.resource.coboldata.LinageInfo;
import orgomg.cwmx.resource.coboldata.LinageInfoType;
import orgomg.cwmx.resource.coboldata.LinkageSection;
import orgomg.cwmx.resource.coboldata.OccursKey;
import orgomg.cwmx.resource.coboldata.Renames;
import orgomg.cwmx.resource.coboldata.ReportWriterSection;
import orgomg.cwmx.resource.coboldata.Section;
import orgomg.cwmx.resource.coboldata.SignKindType;
import orgomg.cwmx.resource.coboldata.Usage;
import orgomg.cwmx.resource.coboldata.WorkingStorageSection;
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
public class CoboldataPackageImpl extends EPackageImpl implements CoboldataPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass cobolfdEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass cobolItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass cobolFieldEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass renamesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass sectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass workingStorageSectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass fileSectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass reportWriterSectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass linkageSectionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass occursKeyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass linageInfoEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass cobolfdIndexEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass usageEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum accessTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum blockKindEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum fileOrganizationEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum labelKindEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum linageInfoTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum signKindTypeEEnum = null;

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
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CoboldataPackageImpl() {
        super(eNS_URI, CoboldataFactory.eINSTANCE);
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
     * This method is used to initialize {@link CoboldataPackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead,
     * they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CoboldataPackage init() {
        if (isInited)
            return (CoboldataPackage) EPackage.Registry.INSTANCE.getEPackage(CoboldataPackage.eNS_URI);

        // Obtain or create and register package
        CoboldataPackageImpl theCoboldataPackage = (CoboldataPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CoboldataPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new CoboldataPackageImpl());

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
        theCoboldataPackage.createPackageContents();
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
        theCoboldataPackage.initializePackageContents();
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
        theCoboldataPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CoboldataPackage.eNS_URI, theCoboldataPackage);
        return theCoboldataPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOBOLFD() {
        return cobolfdEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_Organization() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_AccessMode() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_IsOptional() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_ReserveAreas() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_AssignTo() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_CodeSetLit() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_BlockSizeUnit() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_MinBlocks() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_MaxBlocks() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_MinRecords() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_MaxRecords() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_LabelKind() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_IsExternal() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_IsGlobal() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFD_PadLiteral() {
        return (EAttribute) cobolfdEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLFD_StatusID() {
        return (EReference) cobolfdEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLFD_LinageInfo() {
        return (EReference) cobolfdEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLFD_FileSection() {
        return (EReference) cobolfdEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLFD_DependsOn() {
        return (EReference) cobolfdEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLFD_PadField() {
        return (EReference) cobolfdEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLFD_RelativeField() {
        return (EReference) cobolfdEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOBOLItem() {
        return cobolItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLItem_OccurringField() {
        return (EReference) cobolItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLItem_StatusFD() {
        return (EReference) cobolItemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLItem_LinageInfo() {
        return (EReference) cobolItemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLItem_DependingFD() {
        return (EReference) cobolItemEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLItem_PaddedFD() {
        return (EReference) cobolItemEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLItem_RelativeFD() {
        return (EReference) cobolItemEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOBOLField() {
        return cobolFieldEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_Level() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_SignKind() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_IsFiller() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_IsJustifiedRight() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_IsBlankWhenZero() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_IsSynchronized() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_Picture() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_OccursLower() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_OccursUpper() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_IndexName() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_IsExternal() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLField_IsGlobal() {
        return (EAttribute) cobolFieldEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLField_DependingOnField() {
        return (EReference) cobolFieldEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLField_RedefinedField() {
        return (EReference) cobolFieldEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLField_RedefinedByField() {
        return (EReference) cobolFieldEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLField_OccursKeyInfo() {
        return (EReference) cobolFieldEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLField_OccursKeyFieldInfo() {
        return (EReference) cobolFieldEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLField_FirstRenames() {
        return (EReference) cobolFieldEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getCOBOLField_ThruRenames() {
        return (EReference) cobolFieldEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getRenames() {
        return renamesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getRenames_FirstField() {
        return (EReference) renamesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getRenames_ThruField() {
        return (EReference) renamesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getSection() {
        return sectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getSection_Record() {
        return (EReference) sectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getWorkingStorageSection() {
        return workingStorageSectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileSection() {
        return fileSectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getFileSection_CobolFD() {
        return (EReference) fileSectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getReportWriterSection() {
        return reportWriterSectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinkageSection() {
        return linkageSectionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getOccursKey() {
        return occursKeyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOccursKey_IsAscending() {
        return (EAttribute) occursKeyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getOccursKey_OccursKeyOf() {
        return (EReference) occursKeyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getOccursKey_OccursKeyField() {
        return (EReference) occursKeyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinageInfo() {
        return linageInfoEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLinageInfo_Value() {
        return (EAttribute) linageInfoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLinageInfo_Type() {
        return (EAttribute) linageInfoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinageInfo_CobolItem() {
        return (EReference) linageInfoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinageInfo_CobolFD() {
        return (EReference) linageInfoEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getCOBOLFDIndex() {
        return cobolfdIndexEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCOBOLFDIndex_IsAlternate() {
        return (EAttribute) cobolfdIndexEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getUsage() {
        return usageEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAccessType() {
        return accessTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getBlockKind() {
        return blockKindEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getFileOrganization() {
        return fileOrganizationEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLabelKind() {
        return labelKindEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLinageInfoType() {
        return linageInfoTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSignKindType() {
        return signKindTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CoboldataFactory getCoboldataFactory() {
        return (CoboldataFactory) getEFactoryInstance();
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
        cobolfdEClass = createEClass(COBOLFD);
        createEAttribute(cobolfdEClass, COBOLFD__ORGANIZATION);
        createEAttribute(cobolfdEClass, COBOLFD__ACCESS_MODE);
        createEAttribute(cobolfdEClass, COBOLFD__IS_OPTIONAL);
        createEAttribute(cobolfdEClass, COBOLFD__RESERVE_AREAS);
        createEAttribute(cobolfdEClass, COBOLFD__ASSIGN_TO);
        createEAttribute(cobolfdEClass, COBOLFD__CODE_SET_LIT);
        createEAttribute(cobolfdEClass, COBOLFD__BLOCK_SIZE_UNIT);
        createEAttribute(cobolfdEClass, COBOLFD__MIN_BLOCKS);
        createEAttribute(cobolfdEClass, COBOLFD__MAX_BLOCKS);
        createEAttribute(cobolfdEClass, COBOLFD__MIN_RECORDS);
        createEAttribute(cobolfdEClass, COBOLFD__MAX_RECORDS);
        createEAttribute(cobolfdEClass, COBOLFD__LABEL_KIND);
        createEAttribute(cobolfdEClass, COBOLFD__IS_EXTERNAL);
        createEAttribute(cobolfdEClass, COBOLFD__IS_GLOBAL);
        createEAttribute(cobolfdEClass, COBOLFD__PAD_LITERAL);
        createEReference(cobolfdEClass, COBOLFD__STATUS_ID);
        createEReference(cobolfdEClass, COBOLFD__LINAGE_INFO);
        createEReference(cobolfdEClass, COBOLFD__FILE_SECTION);
        createEReference(cobolfdEClass, COBOLFD__DEPENDS_ON);
        createEReference(cobolfdEClass, COBOLFD__PAD_FIELD);
        createEReference(cobolfdEClass, COBOLFD__RELATIVE_FIELD);

        cobolItemEClass = createEClass(COBOL_ITEM);
        createEReference(cobolItemEClass, COBOL_ITEM__OCCURRING_FIELD);
        createEReference(cobolItemEClass, COBOL_ITEM__STATUS_FD);
        createEReference(cobolItemEClass, COBOL_ITEM__LINAGE_INFO);
        createEReference(cobolItemEClass, COBOL_ITEM__DEPENDING_FD);
        createEReference(cobolItemEClass, COBOL_ITEM__PADDED_FD);
        createEReference(cobolItemEClass, COBOL_ITEM__RELATIVE_FD);

        cobolFieldEClass = createEClass(COBOL_FIELD);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__LEVEL);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__SIGN_KIND);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__IS_FILLER);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__IS_JUSTIFIED_RIGHT);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__IS_BLANK_WHEN_ZERO);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__IS_SYNCHRONIZED);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__PICTURE);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__OCCURS_LOWER);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__OCCURS_UPPER);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__INDEX_NAME);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__IS_EXTERNAL);
        createEAttribute(cobolFieldEClass, COBOL_FIELD__IS_GLOBAL);
        createEReference(cobolFieldEClass, COBOL_FIELD__DEPENDING_ON_FIELD);
        createEReference(cobolFieldEClass, COBOL_FIELD__REDEFINED_FIELD);
        createEReference(cobolFieldEClass, COBOL_FIELD__REDEFINED_BY_FIELD);
        createEReference(cobolFieldEClass, COBOL_FIELD__OCCURS_KEY_INFO);
        createEReference(cobolFieldEClass, COBOL_FIELD__OCCURS_KEY_FIELD_INFO);
        createEReference(cobolFieldEClass, COBOL_FIELD__FIRST_RENAMES);
        createEReference(cobolFieldEClass, COBOL_FIELD__THRU_RENAMES);

        renamesEClass = createEClass(RENAMES);
        createEReference(renamesEClass, RENAMES__FIRST_FIELD);
        createEReference(renamesEClass, RENAMES__THRU_FIELD);

        sectionEClass = createEClass(SECTION);
        createEReference(sectionEClass, SECTION__RECORD);

        workingStorageSectionEClass = createEClass(WORKING_STORAGE_SECTION);

        fileSectionEClass = createEClass(FILE_SECTION);
        createEReference(fileSectionEClass, FILE_SECTION__COBOL_FD);

        reportWriterSectionEClass = createEClass(REPORT_WRITER_SECTION);

        linkageSectionEClass = createEClass(LINKAGE_SECTION);

        occursKeyEClass = createEClass(OCCURS_KEY);
        createEAttribute(occursKeyEClass, OCCURS_KEY__IS_ASCENDING);
        createEReference(occursKeyEClass, OCCURS_KEY__OCCURS_KEY_OF);
        createEReference(occursKeyEClass, OCCURS_KEY__OCCURS_KEY_FIELD);

        linageInfoEClass = createEClass(LINAGE_INFO);
        createEAttribute(linageInfoEClass, LINAGE_INFO__VALUE);
        createEAttribute(linageInfoEClass, LINAGE_INFO__TYPE);
        createEReference(linageInfoEClass, LINAGE_INFO__COBOL_ITEM);
        createEReference(linageInfoEClass, LINAGE_INFO__COBOL_FD);

        cobolfdIndexEClass = createEClass(COBOLFD_INDEX);
        createEAttribute(cobolfdIndexEClass, COBOLFD_INDEX__IS_ALTERNATE);

        usageEClass = createEClass(USAGE);

        // Create enums
        accessTypeEEnum = createEEnum(ACCESS_TYPE);
        blockKindEEnum = createEEnum(BLOCK_KIND);
        fileOrganizationEEnum = createEEnum(FILE_ORGANIZATION);
        labelKindEEnum = createEEnum(LABEL_KIND);
        linageInfoTypeEEnum = createEEnum(LINAGE_INFO_TYPE);
        signKindTypeEEnum = createEEnum(SIGN_KIND_TYPE);
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
        RecordPackage theRecordPackage = (RecordPackage) EPackage.Registry.INSTANCE.getEPackage(RecordPackage.eNS_URI);
        KeysindexesPackage theKeysindexesPackage = (KeysindexesPackage) EPackage.Registry.INSTANCE
                .getEPackage(KeysindexesPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        cobolfdEClass.getESuperTypes().add(theCorePackage.getClass_());
        cobolfdEClass.getESuperTypes().add(theRecordPackage.getRecordFile());
        cobolItemEClass.getESuperTypes().add(theRecordPackage.getField());
        cobolFieldEClass.getESuperTypes().add(this.getCOBOLItem());
        renamesEClass.getESuperTypes().add(this.getCOBOLItem());
        sectionEClass.getESuperTypes().add(theCorePackage.getClassifier());
        workingStorageSectionEClass.getESuperTypes().add(this.getSection());
        fileSectionEClass.getESuperTypes().add(this.getSection());
        reportWriterSectionEClass.getESuperTypes().add(this.getSection());
        linkageSectionEClass.getESuperTypes().add(this.getSection());
        occursKeyEClass.getESuperTypes().add(theCorePackage.getModelElement());
        linageInfoEClass.getESuperTypes().add(theCorePackage.getModelElement());
        cobolfdIndexEClass.getESuperTypes().add(theKeysindexesPackage.getIndex());
        usageEClass.getESuperTypes().add(theCorePackage.getDataType());

        // Initialize classes and features; add operations and parameters
        initEClass(cobolfdEClass, orgomg.cwmx.resource.coboldata.COBOLFD.class, "COBOLFD", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCOBOLFD_Organization(), this.getFileOrganization(), "organization", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_AccessMode(), this.getAccessType(), "accessMode", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_IsOptional(), theCorePackage.getBoolean(), "isOptional", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_ReserveAreas(), theCorePackage.getInteger(), "reserveAreas", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_AssignTo(), theCorePackage.getString(), "assignTo", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_CodeSetLit(), theCorePackage.getString(), "codeSetLit", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_BlockSizeUnit(), this.getBlockKind(), "blockSizeUnit", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_MinBlocks(), theCorePackage.getInteger(), "minBlocks", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_MaxBlocks(), theCorePackage.getInteger(), "maxBlocks", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_MinRecords(), theCorePackage.getInteger(), "minRecords", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_MaxRecords(), theCorePackage.getInteger(), "maxRecords", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_LabelKind(), this.getLabelKind(), "labelKind", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_IsExternal(), theCorePackage.getBoolean(), "isExternal", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_IsGlobal(), theCorePackage.getBoolean(), "isGlobal", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLFD_PadLiteral(), theCorePackage.getString(), "padLiteral", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLFD_StatusID(), this.getCOBOLItem(), this.getCOBOLItem_StatusFD(), "statusID", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLFD_LinageInfo(), this.getLinageInfo(), this.getLinageInfo_CobolFD(), "linageInfo", null, 0, 4,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLFD_FileSection(), this.getFileSection(), this.getFileSection_CobolFD(), "fileSection", null, 1, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLFD_DependsOn(), this.getCOBOLItem(), this.getCOBOLItem_DependingFD(), "dependsOn", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLFD_PadField(), this.getCOBOLItem(), this.getCOBOLItem_PaddedFD(), "padField", null, 0, 1,
                orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLFD_RelativeField(), this.getCOBOLItem(), this.getCOBOLItem_RelativeFD(), "relativeField", null, 0,
                1, orgomg.cwmx.resource.coboldata.COBOLFD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cobolItemEClass, COBOLItem.class, "COBOLItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCOBOLItem_OccurringField(), this.getCOBOLField(), this.getCOBOLField_DependingOnField(),
                "occurringField", null, 0, -1, COBOLItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLItem_StatusFD(), this.getCOBOLFD(), this.getCOBOLFD_StatusID(), "statusFD", null, 0, -1,
                COBOLItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLItem_LinageInfo(), this.getLinageInfo(), this.getLinageInfo_CobolItem(), "linageInfo", null, 0,
                -1, COBOLItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLItem_DependingFD(), this.getCOBOLFD(), this.getCOBOLFD_DependsOn(), "dependingFD", null, 0, -1,
                COBOLItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLItem_PaddedFD(), this.getCOBOLFD(), this.getCOBOLFD_PadField(), "paddedFD", null, 0, -1,
                COBOLItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLItem_RelativeFD(), this.getCOBOLFD(), this.getCOBOLFD_RelativeField(), "relativeFD", null, 0, -1,
                COBOLItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cobolFieldEClass, COBOLField.class, "COBOLField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCOBOLField_Level(), theCorePackage.getInteger(), "level", null, 0, 1, COBOLField.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLField_SignKind(), this.getSignKindType(), "signKind", null, 0, 1, COBOLField.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLField_IsFiller(), theCorePackage.getBoolean(), "isFiller", null, 0, 1, COBOLField.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLField_IsJustifiedRight(), theCorePackage.getBoolean(), "isJustifiedRight", null, 0, 1,
                COBOLField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getCOBOLField_IsBlankWhenZero(), theCorePackage.getBoolean(), "isBlankWhenZero", null, 0, 1,
                COBOLField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getCOBOLField_IsSynchronized(), theCorePackage.getBoolean(), "isSynchronized", null, 0, 1,
                COBOLField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getCOBOLField_Picture(), theCorePackage.getString(), "picture", null, 0, 1, COBOLField.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLField_OccursLower(), theCorePackage.getInteger(), "occursLower", null, 0, 1, COBOLField.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLField_OccursUpper(), theCorePackage.getInteger(), "occursUpper", null, 0, 1, COBOLField.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLField_IndexName(), theCorePackage.getString(), "indexName", null, 0, 1, COBOLField.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLField_IsExternal(), theCorePackage.getBoolean(), "isExternal", null, 0, 1, COBOLField.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCOBOLField_IsGlobal(), theCorePackage.getBoolean(), "isGlobal", null, 0, 1, COBOLField.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLField_DependingOnField(), this.getCOBOLItem(), this.getCOBOLItem_OccurringField(),
                "dependingOnField", null, 0, 1, COBOLField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLField_RedefinedField(), this.getCOBOLField(), this.getCOBOLField_RedefinedByField(),
                "redefinedField", null, 0, 1, COBOLField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLField_RedefinedByField(), this.getCOBOLField(), this.getCOBOLField_RedefinedField(),
                "redefinedByField", null, 0, -1, COBOLField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLField_OccursKeyInfo(), this.getOccursKey(), this.getOccursKey_OccursKeyOf(), "occursKeyInfo",
                null, 0, -1, COBOLField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLField_OccursKeyFieldInfo(), this.getOccursKey(), this.getOccursKey_OccursKeyField(),
                "occursKeyFieldInfo", null, 0, -1, COBOLField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLField_FirstRenames(), this.getRenames(), this.getRenames_FirstField(), "firstRenames", null, 0,
                -1, COBOLField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCOBOLField_ThruRenames(), this.getRenames(), this.getRenames_ThruField(), "thruRenames", null, 0, -1,
                COBOLField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(renamesEClass, Renames.class, "Renames", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRenames_FirstField(), this.getCOBOLField(), this.getCOBOLField_FirstRenames(), "firstField", null, 1,
                1, Renames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRenames_ThruField(), this.getCOBOLField(), this.getCOBOLField_ThruRenames(), "thruField", null, 0, 1,
                Renames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSection_Record(), theRecordPackage.getRecordDef(), theRecordPackage.getRecordDef_Section(), "record",
                null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(workingStorageSectionEClass, WorkingStorageSection.class, "WorkingStorageSection", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fileSectionEClass, FileSection.class, "FileSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFileSection_CobolFD(), this.getCOBOLFD(), this.getCOBOLFD_FileSection(), "cobolFD", null, 0, -1,
                FileSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(reportWriterSectionEClass, ReportWriterSection.class, "ReportWriterSection", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(linkageSectionEClass, LinkageSection.class, "LinkageSection", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(occursKeyEClass, OccursKey.class, "OccursKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOccursKey_IsAscending(), theCorePackage.getBoolean(), "isAscending", null, 0, 1, OccursKey.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOccursKey_OccursKeyOf(), this.getCOBOLField(), this.getCOBOLField_OccursKeyInfo(), "occursKeyOf", null,
                1, 1, OccursKey.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOccursKey_OccursKeyField(), this.getCOBOLField(), this.getCOBOLField_OccursKeyFieldInfo(),
                "occursKeyField", null, 1, 1, OccursKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(linageInfoEClass, LinageInfo.class, "LinageInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLinageInfo_Value(), theCorePackage.getInteger(), "value", null, 0, 1, LinageInfo.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLinageInfo_Type(), this.getLinageInfoType(), "type", null, 0, 1, LinageInfo.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLinageInfo_CobolItem(), this.getCOBOLItem(), this.getCOBOLItem_LinageInfo(), "cobolItem", null, 0, 1,
                LinageInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLinageInfo_CobolFD(), this.getCOBOLFD(), this.getCOBOLFD_LinageInfo(), "cobolFD", null, 1, 1,
                LinageInfo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cobolfdIndexEClass, COBOLFDIndex.class, "COBOLFDIndex", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCOBOLFDIndex_IsAlternate(), theCorePackage.getBoolean(), "isAlternate", null, 0, 1, COBOLFDIndex.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
        addEEnumLiteral(accessTypeEEnum, AccessType.AT_UNSPECIFIED);
        addEEnumLiteral(accessTypeEEnum, AccessType.AT_DYNAMIC);
        addEEnumLiteral(accessTypeEEnum, AccessType.AT_RANDOM);
        addEEnumLiteral(accessTypeEEnum, AccessType.AT_SEQUENTIAL);

        initEEnum(blockKindEEnum, BlockKind.class, "BlockKind");
        addEEnumLiteral(blockKindEEnum, BlockKind.BK_RECORDS);
        addEEnumLiteral(blockKindEEnum, BlockKind.BK_CHARACTERS);

        initEEnum(fileOrganizationEEnum, FileOrganization.class, "FileOrganization");
        addEEnumLiteral(fileOrganizationEEnum, FileOrganization.FO_UNSPECIFIED);
        addEEnumLiteral(fileOrganizationEEnum, FileOrganization.FO_INDEXED);
        addEEnumLiteral(fileOrganizationEEnum, FileOrganization.FO_RELATIVE);
        addEEnumLiteral(fileOrganizationEEnum, FileOrganization.FO_SEQUENTIAL);

        initEEnum(labelKindEEnum, LabelKind.class, "LabelKind");
        addEEnumLiteral(labelKindEEnum, LabelKind.LK_UNSPECIFIED);
        addEEnumLiteral(labelKindEEnum, LabelKind.LK_STANDARD);
        addEEnumLiteral(labelKindEEnum, LabelKind.LK_OMITTED);

        initEEnum(linageInfoTypeEEnum, LinageInfoType.class, "LinageInfoType");
        addEEnumLiteral(linageInfoTypeEEnum, LinageInfoType.LI_LINAGE);
        addEEnumLiteral(linageInfoTypeEEnum, LinageInfoType.LI_LINAGE_FOOTING);
        addEEnumLiteral(linageInfoTypeEEnum, LinageInfoType.LI_LINAGE_TOP);
        addEEnumLiteral(linageInfoTypeEEnum, LinageInfoType.LI_LINAGE_BOTTOM);

        initEEnum(signKindTypeEEnum, SignKindType.class, "SignKindType");
        addEEnumLiteral(signKindTypeEEnum, SignKindType.SK_UNSIGNED);
        addEEnumLiteral(signKindTypeEEnum, SignKindType.SK_LEADING_SIGN);
        addEEnumLiteral(signKindTypeEEnum, SignKindType.SK_TRAILING_SIGN);
        addEEnumLiteral(signKindTypeEEnum, SignKindType.SK_LEADING_SEP_SIGN);
        addEEnumLiteral(signKindTypeEEnum, SignKindType.SK_TRAILING_SEP_SIGN);

        // Create resource
        createResource(eNS_URI);
    }

} // CoboldataPackageImpl
