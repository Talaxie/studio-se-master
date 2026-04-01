/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwmx.resource.imsdatabase.*;
import orgomg.cwmx.resource.imsdatabase.ACBLIB;
import orgomg.cwmx.resource.imsdatabase.AccessMethod;
import orgomg.cwmx.resource.imsdatabase.DBD;
import orgomg.cwmx.resource.imsdatabase.DBDLib;
import orgomg.cwmx.resource.imsdatabase.DEDB;
import orgomg.cwmx.resource.imsdatabase.Dataset;
import orgomg.cwmx.resource.imsdatabase.Exit;
import orgomg.cwmx.resource.imsdatabase.Field;
import orgomg.cwmx.resource.imsdatabase.HDAM;
import orgomg.cwmx.resource.imsdatabase.HIDAM;
import orgomg.cwmx.resource.imsdatabase.INDEX;
import orgomg.cwmx.resource.imsdatabase.ImsdatabaseFactory;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.LCHILD;
import orgomg.cwmx.resource.imsdatabase.MSDB;
import orgomg.cwmx.resource.imsdatabase.PCB;
import orgomg.cwmx.resource.imsdatabase.PSB;
import orgomg.cwmx.resource.imsdatabase.PSBLib;
import orgomg.cwmx.resource.imsdatabase.SecondaryIndex;
import orgomg.cwmx.resource.imsdatabase.Segment;
import orgomg.cwmx.resource.imsdatabase.SegmentComplex;
import orgomg.cwmx.resource.imsdatabase.SegmentLogical;
import orgomg.cwmx.resource.imsdatabase.SenField;
import orgomg.cwmx.resource.imsdatabase.SenSegment;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ImsdatabaseFactoryImpl extends EFactoryImpl implements ImsdatabaseFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static ImsdatabaseFactory init() {
        try {
            ImsdatabaseFactory theImsdatabaseFactory = (ImsdatabaseFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwmx/resource/imsdatabase.ecore");
            if (theImsdatabaseFactory != null) {
                return theImsdatabaseFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ImsdatabaseFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public ImsdatabaseFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ImsdatabasePackage.DBD:
            return createDBD();
        case ImsdatabasePackage.PSB:
            return createPSB();
        case ImsdatabasePackage.PCB:
            return createPCB();
        case ImsdatabasePackage.SEGMENT:
            return createSegment();
        case ImsdatabasePackage.SEGMENT_COMPLEX:
            return createSegmentComplex();
        case ImsdatabasePackage.SEGMENT_LOGICAL:
            return createSegmentLogical();
        case ImsdatabasePackage.FIELD:
            return createField();
        case ImsdatabasePackage.DATASET:
            return createDataset();
        case ImsdatabasePackage.SEN_SEGMENT:
            return createSenSegment();
        case ImsdatabasePackage.SEN_FIELD:
            return createSenField();
        case ImsdatabasePackage.ACBLIB:
            return createACBLIB();
        case ImsdatabasePackage.ACCESS_METHOD:
            return createAccessMethod();
        case ImsdatabasePackage.INDEX:
            return createINDEX();
        case ImsdatabasePackage.HIDAM:
            return createHIDAM();
        case ImsdatabasePackage.DEDB:
            return createDEDB();
        case ImsdatabasePackage.HDAM:
            return createHDAM();
        case ImsdatabasePackage.MSDB:
            return createMSDB();
        case ImsdatabasePackage.SECONDARY_INDEX:
            return createSecondaryIndex();
        case ImsdatabasePackage.EXIT:
            return createExit();
        case ImsdatabasePackage.LCHILD:
            return createLCHILD();
        case ImsdatabasePackage.PSB_LIB:
            return createPSBLib();
        case ImsdatabasePackage.DBD_LIB:
            return createDBDLib();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DBD createDBD() {
        DBDImpl dbd = new DBDImpl();
        return dbd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PSB createPSB() {
        PSBImpl psb = new PSBImpl();
        return psb;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PCB createPCB() {
        PCBImpl pcb = new PCBImpl();
        return pcb;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Segment createSegment() {
        SegmentImpl segment = new SegmentImpl();
        return segment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentComplex createSegmentComplex() {
        SegmentComplexImpl segmentComplex = new SegmentComplexImpl();
        return segmentComplex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentLogical createSegmentLogical() {
        SegmentLogicalImpl segmentLogical = new SegmentLogicalImpl();
        return segmentLogical;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Field createField() {
        FieldImpl field = new FieldImpl();
        return field;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dataset createDataset() {
        DatasetImpl dataset = new DatasetImpl();
        return dataset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SenSegment createSenSegment() {
        SenSegmentImpl senSegment = new SenSegmentImpl();
        return senSegment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SenField createSenField() {
        SenFieldImpl senField = new SenFieldImpl();
        return senField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ACBLIB createACBLIB() {
        ACBLIBImpl acblib = new ACBLIBImpl();
        return acblib;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AccessMethod createAccessMethod() {
        AccessMethodImpl accessMethod = new AccessMethodImpl();
        return accessMethod;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public INDEX createINDEX() {
        INDEXImpl index = new INDEXImpl();
        return index;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public HIDAM createHIDAM() {
        HIDAMImpl hidam = new HIDAMImpl();
        return hidam;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DEDB createDEDB() {
        DEDBImpl dedb = new DEDBImpl();
        return dedb;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public HDAM createHDAM() {
        HDAMImpl hdam = new HDAMImpl();
        return hdam;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MSDB createMSDB() {
        MSDBImpl msdb = new MSDBImpl();
        return msdb;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SecondaryIndex createSecondaryIndex() {
        SecondaryIndexImpl secondaryIndex = new SecondaryIndexImpl();
        return secondaryIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Exit createExit() {
        ExitImpl exit = new ExitImpl();
        return exit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LCHILD createLCHILD() {
        LCHILDImpl lchild = new LCHILDImpl();
        return lchild;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PSBLib createPSBLib() {
        PSBLibImpl psbLib = new PSBLibImpl();
        return psbLib;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DBDLib createDBDLib() {
        DBDLibImpl dbdLib = new DBDLibImpl();
        return dbdLib;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ImsdatabasePackage getImsdatabasePackage() {
        return (ImsdatabasePackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ImsdatabasePackage getPackage() {
        return ImsdatabasePackage.eINSTANCE;
    }

} // ImsdatabaseFactoryImpl
