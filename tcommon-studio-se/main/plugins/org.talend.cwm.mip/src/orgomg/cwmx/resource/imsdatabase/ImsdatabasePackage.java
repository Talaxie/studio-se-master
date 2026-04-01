/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.resource.record.RecordPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc --> This package contains a model
 * for IMS database definitions that is an extension of the Record package. This
 * package also uses classes found in the ObjectModel Core package.
 * 
 * The fundamental objects in IMS databases are DBD (Data Base Definition), PCB
 * (Process Contol Block) and PSB (Program Specification Block).
 * 
 * PSBs are the connection between an IMS system and application programs. PSBs
 * contain PCBs which come in three varieties:
 * 
 * TP (Teleprocessing) PCBs describe a connection to a terminal GSAM PCBs
 * connect a PSB to a input or output file. DB PCBs connect a PSB to the data
 * defined by a DBD.
 * 
 * DBDs describe the organization of data and the pathways by which an
 * application program can retrieve or store Records. A Record within a DBD is
 * called a Segment. Segments are connected by parent-child relationships to
 * create the information hierarchy.
 * 
 * A Segment can be fully described through the Fields contained within it.
 * However, it is also valid for the Segments within a DBD to contain only a
 * single key field. In this case, the detailed layout of information within
 * Records is described by data structures used by the application program.
 * 
 * Most Data Warehouse applications are concerned only with Segments and Fields.
 * This model contains classes to cover the rest of IMS to support potential
 * tools that might export more of the IMS structure.
 * 
 * The IMS package depends on the following packages:
 * 
 * org.omg::CWM::ObjectModel::Core org.omg::CWM::Resource::Record
 * 
 * OCL Representation of IMS Constraints
 * 
 * (None)
 * 
 * <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabaseFactory
 * @model kind="package"
 * @generated
 */
public interface ImsdatabasePackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "imsdatabase";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///orgomg/cwmx/resource/imsdatabase.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "orgomg.cwmx.resource.imsdatabase";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    ImsdatabasePackage eINSTANCE = orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl.init();

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl <em>DBD</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.DBDImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getDBD()
     * @generated
     */
    int DBD = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__NAME = RecordPackage.RECORD_FILE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__VISIBILITY = RecordPackage.RECORD_FILE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__CLIENT_DEPENDENCY = RecordPackage.RECORD_FILE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__SUPPLIER_DEPENDENCY = RecordPackage.RECORD_FILE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__CONSTRAINT = RecordPackage.RECORD_FILE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__NAMESPACE = RecordPackage.RECORD_FILE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__IMPORTER = RecordPackage.RECORD_FILE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__STEREOTYPE = RecordPackage.RECORD_FILE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__TAGGED_VALUE = RecordPackage.RECORD_FILE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__DOCUMENT = RecordPackage.RECORD_FILE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__DESCRIPTION = RecordPackage.RECORD_FILE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__RESPONSIBLE_PARTY = RecordPackage.RECORD_FILE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__ELEMENT_NODE = RecordPackage.RECORD_FILE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__SET = RecordPackage.RECORD_FILE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__RENDERED_OBJECT = RecordPackage.RECORD_FILE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__VOCABULARY_ELEMENT = RecordPackage.RECORD_FILE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__MEASUREMENT = RecordPackage.RECORD_FILE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__CHANGE_REQUEST = RecordPackage.RECORD_FILE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__DASDL_PROPERTY = RecordPackage.RECORD_FILE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__OWNED_ELEMENT = RecordPackage.RECORD_FILE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__IMPORTED_ELEMENT = RecordPackage.RECORD_FILE__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__DATA_MANAGER = RecordPackage.RECORD_FILE__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Is Self Describing</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__IS_SELF_DESCRIBING = RecordPackage.RECORD_FILE__IS_SELF_DESCRIBING;

    /**
     * The feature id for the '<em><b>Record Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__RECORD_DELIMITER = RecordPackage.RECORD_FILE__RECORD_DELIMITER;

    /**
     * The feature id for the '<em><b>Skip Records</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__SKIP_RECORDS = RecordPackage.RECORD_FILE__SKIP_RECORDS;

    /**
     * The feature id for the '<em><b>Record</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__RECORD = RecordPackage.RECORD_FILE__RECORD;

    /**
     * The feature id for the '<em><b>Dli Access</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__DLI_ACCESS = RecordPackage.RECORD_FILE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is VSAM</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__IS_VSAM = RecordPackage.RECORD_FILE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Password Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__PASSWORD_FLAG = RecordPackage.RECORD_FILE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Version String</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__VERSION_STRING = RecordPackage.RECORD_FILE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Access Method</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__ACCESS_METHOD = RecordPackage.RECORD_FILE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Acblib</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__ACBLIB = RecordPackage.RECORD_FILE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__DATASET = RecordPackage.RECORD_FILE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Segment</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__SEGMENT = RecordPackage.RECORD_FILE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Pcb</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__PCB = RecordPackage.RECORD_FILE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Exit</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD__EXIT = RecordPackage.RECORD_FILE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Library</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD__LIBRARY = RecordPackage.RECORD_FILE_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>DBD</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_FEATURE_COUNT = RecordPackage.RECORD_FILE_FEATURE_COUNT + 11;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl <em>PSB</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.PSBImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getPSB()
     * @generated
     */
    int PSB = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__NAME = RecordPackage.RECORD_FILE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__VISIBILITY = RecordPackage.RECORD_FILE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__CLIENT_DEPENDENCY = RecordPackage.RECORD_FILE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__SUPPLIER_DEPENDENCY = RecordPackage.RECORD_FILE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__CONSTRAINT = RecordPackage.RECORD_FILE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__NAMESPACE = RecordPackage.RECORD_FILE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__IMPORTER = RecordPackage.RECORD_FILE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__STEREOTYPE = RecordPackage.RECORD_FILE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__TAGGED_VALUE = RecordPackage.RECORD_FILE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__DOCUMENT = RecordPackage.RECORD_FILE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__DESCRIPTION = RecordPackage.RECORD_FILE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__RESPONSIBLE_PARTY = RecordPackage.RECORD_FILE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__ELEMENT_NODE = RecordPackage.RECORD_FILE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__SET = RecordPackage.RECORD_FILE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__RENDERED_OBJECT = RecordPackage.RECORD_FILE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__VOCABULARY_ELEMENT = RecordPackage.RECORD_FILE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__MEASUREMENT = RecordPackage.RECORD_FILE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__CHANGE_REQUEST = RecordPackage.RECORD_FILE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__DASDL_PROPERTY = RecordPackage.RECORD_FILE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__OWNED_ELEMENT = RecordPackage.RECORD_FILE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__IMPORTED_ELEMENT = RecordPackage.RECORD_FILE__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__DATA_MANAGER = RecordPackage.RECORD_FILE__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Is Self Describing</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__IS_SELF_DESCRIBING = RecordPackage.RECORD_FILE__IS_SELF_DESCRIBING;

    /**
     * The feature id for the '<em><b>Record Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__RECORD_DELIMITER = RecordPackage.RECORD_FILE__RECORD_DELIMITER;

    /**
     * The feature id for the '<em><b>Skip Records</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__SKIP_RECORDS = RecordPackage.RECORD_FILE__SKIP_RECORDS;

    /**
     * The feature id for the '<em><b>Record</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__RECORD = RecordPackage.RECORD_FILE__RECORD;

    /**
     * The feature id for the '<em><b>Compatibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__COMPATIBILITY = RecordPackage.RECORD_FILE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Io Error Option</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__IO_ERROR_OPTION = RecordPackage.RECORD_FILE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ioa Size</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__IOA_SIZE = RecordPackage.RECORD_FILE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__LANGUAGE = RecordPackage.RECORD_FILE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Lock Maximum</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__LOCK_MAXIMUM = RecordPackage.RECORD_FILE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Maximum Qx Calls</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__MAXIMUM_QX_CALLS = RecordPackage.RECORD_FILE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Online Image Copy</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__ONLINE_IMAGE_COPY = RecordPackage.RECORD_FILE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Ssa Size</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__SSA_SIZE = RecordPackage.RECORD_FILE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Write To Operator</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB__WRITE_TO_OPERATOR = RecordPackage.RECORD_FILE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Acblib</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__ACBLIB = RecordPackage.RECORD_FILE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Pcb</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__PCB = RecordPackage.RECORD_FILE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Library</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB__LIBRARY = RecordPackage.RECORD_FILE_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>PSB</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_FEATURE_COUNT = RecordPackage.RECORD_FILE_FEATURE_COUNT + 12;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl <em>PCB</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.PCBImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getPCB()
     * @generated
     */
    int PCB = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__NAME = RecordPackage.RECORD_FILE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__VISIBILITY = RecordPackage.RECORD_FILE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__CLIENT_DEPENDENCY = RecordPackage.RECORD_FILE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__SUPPLIER_DEPENDENCY = RecordPackage.RECORD_FILE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__CONSTRAINT = RecordPackage.RECORD_FILE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__NAMESPACE = RecordPackage.RECORD_FILE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__IMPORTER = RecordPackage.RECORD_FILE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__STEREOTYPE = RecordPackage.RECORD_FILE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__TAGGED_VALUE = RecordPackage.RECORD_FILE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__DOCUMENT = RecordPackage.RECORD_FILE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__DESCRIPTION = RecordPackage.RECORD_FILE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__RESPONSIBLE_PARTY = RecordPackage.RECORD_FILE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__ELEMENT_NODE = RecordPackage.RECORD_FILE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__SET = RecordPackage.RECORD_FILE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__RENDERED_OBJECT = RecordPackage.RECORD_FILE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__VOCABULARY_ELEMENT = RecordPackage.RECORD_FILE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__MEASUREMENT = RecordPackage.RECORD_FILE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__CHANGE_REQUEST = RecordPackage.RECORD_FILE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__DASDL_PROPERTY = RecordPackage.RECORD_FILE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__OWNED_ELEMENT = RecordPackage.RECORD_FILE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__IMPORTED_ELEMENT = RecordPackage.RECORD_FILE__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__DATA_MANAGER = RecordPackage.RECORD_FILE__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Is Self Describing</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__IS_SELF_DESCRIBING = RecordPackage.RECORD_FILE__IS_SELF_DESCRIBING;

    /**
     * The feature id for the '<em><b>Record Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__RECORD_DELIMITER = RecordPackage.RECORD_FILE__RECORD_DELIMITER;

    /**
     * The feature id for the '<em><b>Skip Records</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__SKIP_RECORDS = RecordPackage.RECORD_FILE__SKIP_RECORDS;

    /**
     * The feature id for the '<em><b>Record</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__RECORD = RecordPackage.RECORD_FILE__RECORD;

    /**
     * The feature id for the '<em><b>Pcb Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__PCB_TYPE = RecordPackage.RECORD_FILE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>List</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__LIST = RecordPackage.RECORD_FILE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Key Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__KEY_LENGTH = RecordPackage.RECORD_FILE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Processing Options</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__PROCESSING_OPTIONS = RecordPackage.RECORD_FILE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Positioning</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__POSITIONING = RecordPackage.RECORD_FILE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Sequential Buffering</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__SEQUENTIAL_BUFFERING = RecordPackage.RECORD_FILE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Alternate Response</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__ALTERNATE_RESPONSE = RecordPackage.RECORD_FILE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Express</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__EXPRESS = RecordPackage.RECORD_FILE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Modify</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__MODIFY = RecordPackage.RECORD_FILE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Same Terminal</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__SAME_TERMINAL = RecordPackage.RECORD_FILE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Destination Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__DESTINATION_TYPE = RecordPackage.RECORD_FILE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Lterm Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__LTERM_NAME = RecordPackage.RECORD_FILE_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Proc Seq</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__PROC_SEQ = RecordPackage.RECORD_FILE_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__DBD = RecordPackage.RECORD_FILE_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Psb</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB__PSB = RecordPackage.RECORD_FILE_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Sen Segment</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PCB__SEN_SEGMENT = RecordPackage.RECORD_FILE_FEATURE_COUNT + 15;

    /**
     * The number of structural features of the '<em>PCB</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PCB_FEATURE_COUNT = RecordPackage.RECORD_FILE_FEATURE_COUNT + 16;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl <em>Segment</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSegment()
     * @generated
     */
    int SEGMENT = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__NAME = RecordPackage.RECORD_DEF__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__VISIBILITY = RecordPackage.RECORD_DEF__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__CLIENT_DEPENDENCY = RecordPackage.RECORD_DEF__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__SUPPLIER_DEPENDENCY = RecordPackage.RECORD_DEF__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__CONSTRAINT = RecordPackage.RECORD_DEF__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__NAMESPACE = RecordPackage.RECORD_DEF__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__IMPORTER = RecordPackage.RECORD_DEF__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__STEREOTYPE = RecordPackage.RECORD_DEF__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__TAGGED_VALUE = RecordPackage.RECORD_DEF__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__DOCUMENT = RecordPackage.RECORD_DEF__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__DESCRIPTION = RecordPackage.RECORD_DEF__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__RESPONSIBLE_PARTY = RecordPackage.RECORD_DEF__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__ELEMENT_NODE = RecordPackage.RECORD_DEF__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__SET = RecordPackage.RECORD_DEF__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__RENDERED_OBJECT = RecordPackage.RECORD_DEF__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__VOCABULARY_ELEMENT = RecordPackage.RECORD_DEF__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__MEASUREMENT = RecordPackage.RECORD_DEF__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__CHANGE_REQUEST = RecordPackage.RECORD_DEF__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__DASDL_PROPERTY = RecordPackage.RECORD_DEF__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__OWNED_ELEMENT = RecordPackage.RECORD_DEF__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__IS_ABSTRACT = RecordPackage.RECORD_DEF__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__FEATURE = RecordPackage.RECORD_DEF__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__STRUCTURAL_FEATURE = RecordPackage.RECORD_DEF__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__PARAMETER = RecordPackage.RECORD_DEF__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__GENERALIZATION = RecordPackage.RECORD_DEF__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__SPECIALIZATION = RecordPackage.RECORD_DEF__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__INSTANCE = RecordPackage.RECORD_DEF__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__ALIAS = RecordPackage.RECORD_DEF__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__EXPRESSION_NODE = RecordPackage.RECORD_DEF__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__MAPPING_FROM = RecordPackage.RECORD_DEF__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__MAPPING_TO = RecordPackage.RECORD_DEF__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__CLASSIFIER_MAP = RecordPackage.RECORD_DEF__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__CF_MAP = RecordPackage.RECORD_DEF__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__DOMAIN = RecordPackage.RECORD_DEF__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__SIMPLE_DIMENSION = RecordPackage.RECORD_DEF__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__INDEX = RecordPackage.RECORD_DEF__INDEX;

    /**
     * The feature id for the '<em><b>Field Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__FIELD_DELIMITER = RecordPackage.RECORD_DEF__FIELD_DELIMITER;

    /**
     * The feature id for the '<em><b>Is Fixed Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__IS_FIXED_WIDTH = RecordPackage.RECORD_DEF__IS_FIXED_WIDTH;

    /**
     * The feature id for the '<em><b>Text Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__TEXT_DELIMITER = RecordPackage.RECORD_DEF__TEXT_DELIMITER;

    /**
     * The feature id for the '<em><b>File</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__FILE = RecordPackage.RECORD_DEF__FILE;

    /**
     * The feature id for the '<em><b>Section</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__SECTION = RecordPackage.RECORD_DEF__SECTION;

    /**
     * The feature id for the '<em><b>Exit Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__EXIT_FLAG = RecordPackage.RECORD_DEF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Frequency</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__FREQUENCY = RecordPackage.RECORD_DEF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Maximum Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__MAXIMUM_LENGTH = RecordPackage.RECORD_DEF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Minimum Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__MINIMUM_LENGTH = RecordPackage.RECORD_DEF_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Rules</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__RULES = RecordPackage.RECORD_DEF_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Subset Pointers</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__SUBSET_POINTERS = RecordPackage.RECORD_DEF_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Direct Dependent</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__DIRECT_DEPENDENT = RecordPackage.RECORD_DEF_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Pc Pointer</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__PC_POINTER = RecordPackage.RECORD_DEF_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Logical</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__LOGICAL = RecordPackage.RECORD_DEF_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__DBD = RecordPackage.RECORD_DEF_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Senseg</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__SENSEG = RecordPackage.RECORD_DEF_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Child</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__CHILD = RecordPackage.RECORD_DEF_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__PARENT = RecordPackage.RECORD_DEF_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Exit</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__EXIT = RecordPackage.RECORD_DEF_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Segment</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_FEATURE_COUNT = RecordPackage.RECORD_DEF_FEATURE_COUNT + 14;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl <em>Segment Complex</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSegmentComplex()
     * @generated
     */
    int SEGMENT_COMPLEX = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__NAME = SEGMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__VISIBILITY = SEGMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__CLIENT_DEPENDENCY = SEGMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__SUPPLIER_DEPENDENCY = SEGMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__CONSTRAINT = SEGMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__NAMESPACE = SEGMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__IMPORTER = SEGMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__STEREOTYPE = SEGMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__TAGGED_VALUE = SEGMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__DOCUMENT = SEGMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__DESCRIPTION = SEGMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__RESPONSIBLE_PARTY = SEGMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__ELEMENT_NODE = SEGMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__SET = SEGMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__RENDERED_OBJECT = SEGMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__VOCABULARY_ELEMENT = SEGMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__MEASUREMENT = SEGMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__CHANGE_REQUEST = SEGMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__DASDL_PROPERTY = SEGMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__OWNED_ELEMENT = SEGMENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__IS_ABSTRACT = SEGMENT__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__FEATURE = SEGMENT__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__STRUCTURAL_FEATURE = SEGMENT__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__PARAMETER = SEGMENT__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__GENERALIZATION = SEGMENT__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__SPECIALIZATION = SEGMENT__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__INSTANCE = SEGMENT__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__ALIAS = SEGMENT__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__EXPRESSION_NODE = SEGMENT__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__MAPPING_FROM = SEGMENT__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__MAPPING_TO = SEGMENT__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__CLASSIFIER_MAP = SEGMENT__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__CF_MAP = SEGMENT__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__DOMAIN = SEGMENT__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__SIMPLE_DIMENSION = SEGMENT__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__INDEX = SEGMENT__INDEX;

    /**
     * The feature id for the '<em><b>Field Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__FIELD_DELIMITER = SEGMENT__FIELD_DELIMITER;

    /**
     * The feature id for the '<em><b>Is Fixed Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__IS_FIXED_WIDTH = SEGMENT__IS_FIXED_WIDTH;

    /**
     * The feature id for the '<em><b>Text Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__TEXT_DELIMITER = SEGMENT__TEXT_DELIMITER;

    /**
     * The feature id for the '<em><b>File</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__FILE = SEGMENT__FILE;

    /**
     * The feature id for the '<em><b>Section</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__SECTION = SEGMENT__SECTION;

    /**
     * The feature id for the '<em><b>Exit Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__EXIT_FLAG = SEGMENT__EXIT_FLAG;

    /**
     * The feature id for the '<em><b>Frequency</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__FREQUENCY = SEGMENT__FREQUENCY;

    /**
     * The feature id for the '<em><b>Maximum Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__MAXIMUM_LENGTH = SEGMENT__MAXIMUM_LENGTH;

    /**
     * The feature id for the '<em><b>Minimum Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__MINIMUM_LENGTH = SEGMENT__MINIMUM_LENGTH;

    /**
     * The feature id for the '<em><b>Rules</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__RULES = SEGMENT__RULES;

    /**
     * The feature id for the '<em><b>Subset Pointers</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__SUBSET_POINTERS = SEGMENT__SUBSET_POINTERS;

    /**
     * The feature id for the '<em><b>Direct Dependent</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__DIRECT_DEPENDENT = SEGMENT__DIRECT_DEPENDENT;

    /**
     * The feature id for the '<em><b>Pc Pointer</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__PC_POINTER = SEGMENT__PC_POINTER;

    /**
     * The feature id for the '<em><b>Logical</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__LOGICAL = SEGMENT__LOGICAL;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__DBD = SEGMENT__DBD;

    /**
     * The feature id for the '<em><b>Senseg</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__SENSEG = SEGMENT__SENSEG;

    /**
     * The feature id for the '<em><b>Child</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__CHILD = SEGMENT__CHILD;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__PARENT = SEGMENT__PARENT;

    /**
     * The feature id for the '<em><b>Exit</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__EXIT = SEGMENT__EXIT;

    /**
     * The feature id for the '<em><b>Delete Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__DELETE_FLAG = SEGMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Insert Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__INSERT_FLAG = SEGMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Replace Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__REPLACE_FLAG = SEGMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Segm Pointer</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__SEGM_POINTER = SEGMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ds Group</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__DS_GROUP = SEGMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Secondary Index</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__SECONDARY_INDEX = SEGMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Lchild</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__LCHILD = SEGMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Sourced Index</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__SOURCED_INDEX = SEGMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Lparent</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__LPARENT = SEGMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Paired LCHILD</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__PAIRED_LCHILD = SEGMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Dataset</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX__DATASET = SEGMENT_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Segment Complex</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_COMPLEX_FEATURE_COUNT = SEGMENT_FEATURE_COUNT + 11;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentLogicalImpl <em>Segment Logical</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.SegmentLogicalImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSegmentLogical()
     * @generated
     */
    int SEGMENT_LOGICAL = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__NAME = SEGMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__VISIBILITY = SEGMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__CLIENT_DEPENDENCY = SEGMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__SUPPLIER_DEPENDENCY = SEGMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__CONSTRAINT = SEGMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__NAMESPACE = SEGMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__IMPORTER = SEGMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__STEREOTYPE = SEGMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__TAGGED_VALUE = SEGMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__DOCUMENT = SEGMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__DESCRIPTION = SEGMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__RESPONSIBLE_PARTY = SEGMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__ELEMENT_NODE = SEGMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__SET = SEGMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__RENDERED_OBJECT = SEGMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__VOCABULARY_ELEMENT = SEGMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__MEASUREMENT = SEGMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__CHANGE_REQUEST = SEGMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__DASDL_PROPERTY = SEGMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__OWNED_ELEMENT = SEGMENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__IS_ABSTRACT = SEGMENT__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__FEATURE = SEGMENT__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__STRUCTURAL_FEATURE = SEGMENT__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__PARAMETER = SEGMENT__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__GENERALIZATION = SEGMENT__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__SPECIALIZATION = SEGMENT__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__INSTANCE = SEGMENT__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__ALIAS = SEGMENT__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__EXPRESSION_NODE = SEGMENT__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__MAPPING_FROM = SEGMENT__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__MAPPING_TO = SEGMENT__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__CLASSIFIER_MAP = SEGMENT__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__CF_MAP = SEGMENT__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__DOMAIN = SEGMENT__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__SIMPLE_DIMENSION = SEGMENT__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__INDEX = SEGMENT__INDEX;

    /**
     * The feature id for the '<em><b>Field Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__FIELD_DELIMITER = SEGMENT__FIELD_DELIMITER;

    /**
     * The feature id for the '<em><b>Is Fixed Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__IS_FIXED_WIDTH = SEGMENT__IS_FIXED_WIDTH;

    /**
     * The feature id for the '<em><b>Text Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__TEXT_DELIMITER = SEGMENT__TEXT_DELIMITER;

    /**
     * The feature id for the '<em><b>File</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__FILE = SEGMENT__FILE;

    /**
     * The feature id for the '<em><b>Section</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__SECTION = SEGMENT__SECTION;

    /**
     * The feature id for the '<em><b>Exit Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__EXIT_FLAG = SEGMENT__EXIT_FLAG;

    /**
     * The feature id for the '<em><b>Frequency</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__FREQUENCY = SEGMENT__FREQUENCY;

    /**
     * The feature id for the '<em><b>Maximum Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__MAXIMUM_LENGTH = SEGMENT__MAXIMUM_LENGTH;

    /**
     * The feature id for the '<em><b>Minimum Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__MINIMUM_LENGTH = SEGMENT__MINIMUM_LENGTH;

    /**
     * The feature id for the '<em><b>Rules</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__RULES = SEGMENT__RULES;

    /**
     * The feature id for the '<em><b>Subset Pointers</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__SUBSET_POINTERS = SEGMENT__SUBSET_POINTERS;

    /**
     * The feature id for the '<em><b>Direct Dependent</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__DIRECT_DEPENDENT = SEGMENT__DIRECT_DEPENDENT;

    /**
     * The feature id for the '<em><b>Pc Pointer</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__PC_POINTER = SEGMENT__PC_POINTER;

    /**
     * The feature id for the '<em><b>Logical</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__LOGICAL = SEGMENT__LOGICAL;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__DBD = SEGMENT__DBD;

    /**
     * The feature id for the '<em><b>Senseg</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__SENSEG = SEGMENT__SENSEG;

    /**
     * The feature id for the '<em><b>Child</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__CHILD = SEGMENT__CHILD;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__PARENT = SEGMENT__PARENT;

    /**
     * The feature id for the '<em><b>Exit</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__EXIT = SEGMENT__EXIT;

    /**
     * The feature id for the '<em><b>Key Data1</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__KEY_DATA1 = SEGMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Key Data2</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__KEY_DATA2 = SEGMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Physical</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL__PHYSICAL = SEGMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Segment Logical</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_LOGICAL_FEATURE_COUNT = SEGMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.FieldImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getField()
     * @generated
     */
    int FIELD = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__NAME = RecordPackage.FIXED_OFFSET_FIELD__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__VISIBILITY = RecordPackage.FIXED_OFFSET_FIELD__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__CLIENT_DEPENDENCY = RecordPackage.FIXED_OFFSET_FIELD__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__SUPPLIER_DEPENDENCY = RecordPackage.FIXED_OFFSET_FIELD__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__CONSTRAINT = RecordPackage.FIXED_OFFSET_FIELD__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__NAMESPACE = RecordPackage.FIXED_OFFSET_FIELD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__IMPORTER = RecordPackage.FIXED_OFFSET_FIELD__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__STEREOTYPE = RecordPackage.FIXED_OFFSET_FIELD__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__TAGGED_VALUE = RecordPackage.FIXED_OFFSET_FIELD__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__DOCUMENT = RecordPackage.FIXED_OFFSET_FIELD__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__DESCRIPTION = RecordPackage.FIXED_OFFSET_FIELD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__RESPONSIBLE_PARTY = RecordPackage.FIXED_OFFSET_FIELD__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__ELEMENT_NODE = RecordPackage.FIXED_OFFSET_FIELD__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__SET = RecordPackage.FIXED_OFFSET_FIELD__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__RENDERED_OBJECT = RecordPackage.FIXED_OFFSET_FIELD__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__VOCABULARY_ELEMENT = RecordPackage.FIXED_OFFSET_FIELD__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__MEASUREMENT = RecordPackage.FIXED_OFFSET_FIELD__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__CHANGE_REQUEST = RecordPackage.FIXED_OFFSET_FIELD__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__DASDL_PROPERTY = RecordPackage.FIXED_OFFSET_FIELD__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__OWNER_SCOPE = RecordPackage.FIXED_OFFSET_FIELD__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__OWNER = RecordPackage.FIXED_OFFSET_FIELD__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__FEATURE_NODE = RecordPackage.FIXED_OFFSET_FIELD__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__FEATURE_MAP = RecordPackage.FIXED_OFFSET_FIELD__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__CF_MAP = RecordPackage.FIXED_OFFSET_FIELD__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__CHANGEABILITY = RecordPackage.FIXED_OFFSET_FIELD__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__MULTIPLICITY = RecordPackage.FIXED_OFFSET_FIELD__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__ORDERING = RecordPackage.FIXED_OFFSET_FIELD__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__TARGET_SCOPE = RecordPackage.FIXED_OFFSET_FIELD__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__TYPE = RecordPackage.FIXED_OFFSET_FIELD__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__SLOT = RecordPackage.FIXED_OFFSET_FIELD__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__DISCRIMINATED_UNION = RecordPackage.FIXED_OFFSET_FIELD__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__INDEXED_FEATURE = RecordPackage.FIXED_OFFSET_FIELD__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__KEY_RELATIONSHIP = RecordPackage.FIXED_OFFSET_FIELD__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__UNIQUE_KEY = RecordPackage.FIXED_OFFSET_FIELD__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__DATA_ITEM = RecordPackage.FIXED_OFFSET_FIELD__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__REMAP = RecordPackage.FIXED_OFFSET_FIELD__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__INITIAL_VALUE = RecordPackage.FIXED_OFFSET_FIELD__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__LENGTH = RecordPackage.FIXED_OFFSET_FIELD__LENGTH;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__PRECISION = RecordPackage.FIXED_OFFSET_FIELD__PRECISION;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__SCALE = RecordPackage.FIXED_OFFSET_FIELD__SCALE;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__OFFSET = RecordPackage.FIXED_OFFSET_FIELD__OFFSET;

    /**
     * The feature id for the '<em><b>Offset Unit Bits</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__OFFSET_UNIT_BITS = RecordPackage.FIXED_OFFSET_FIELD__OFFSET_UNIT_BITS;

    /**
     * The feature id for the '<em><b>Sequence Field</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__SEQUENCE_FIELD = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Unique Sequence</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__UNIQUE_SEQUENCE = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Field Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__FIELD_LENGTH = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Generated</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__GENERATED = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Search Index</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__SEARCH_INDEX = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Ddata Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__DDATA_INDEX = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Subseq Index</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__SUBSEQ_INDEX = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Sen Field</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD__SEN_FIELD = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Field</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_FEATURE_COUNT = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl <em>Dataset</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getDataset()
     * @generated
     */
    int DATASET = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Dd1name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__DD1NAME = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Device</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__DEVICE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Model</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__MODEL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Dd2name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__DD2NAME = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Size1</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__SIZE1 = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Size2</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__SIZE2 = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Record Length1</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__RECORD_LENGTH1 = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Record Length2</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__RECORD_LENGTH2 = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Blocking Factor1</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__BLOCKING_FACTOR1 = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Blocking Factor2</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__BLOCKING_FACTOR2 = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Dataset Label</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__DATASET_LABEL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Free Block Frequency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__FREE_BLOCK_FREQUENCY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Free Space Percentage</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATASET__FREE_SPACE_PERCENTAGE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Record Format</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__RECORD_FORMAT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Scan Cylinders</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__SCAN_CYLINDERS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Search Algorithm</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__SEARCH_ALGORITHM = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Root</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__ROOT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Root Overflow</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__ROOT_OVERFLOW = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Uow</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__UOW = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Uow Overflow</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__UOW_OVERFLOW = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__DBD = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Segment</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET__SEGMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 21;

    /**
     * The number of structural features of the '<em>Dataset</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATASET_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 22;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.imsdatabase.impl.SenSegmentImpl
     * <em>Sen Segment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.imsdatabase.impl.SenSegmentImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSenSegment()
     * @generated
     */
    int SEN_SEGMENT = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__NAME = RecordPackage.RECORD_DEF__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__VISIBILITY = RecordPackage.RECORD_DEF__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__CLIENT_DEPENDENCY = RecordPackage.RECORD_DEF__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__SUPPLIER_DEPENDENCY = RecordPackage.RECORD_DEF__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__CONSTRAINT = RecordPackage.RECORD_DEF__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__NAMESPACE = RecordPackage.RECORD_DEF__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__IMPORTER = RecordPackage.RECORD_DEF__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__STEREOTYPE = RecordPackage.RECORD_DEF__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__TAGGED_VALUE = RecordPackage.RECORD_DEF__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__DOCUMENT = RecordPackage.RECORD_DEF__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__DESCRIPTION = RecordPackage.RECORD_DEF__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__RESPONSIBLE_PARTY = RecordPackage.RECORD_DEF__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__ELEMENT_NODE = RecordPackage.RECORD_DEF__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__SET = RecordPackage.RECORD_DEF__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__RENDERED_OBJECT = RecordPackage.RECORD_DEF__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__VOCABULARY_ELEMENT = RecordPackage.RECORD_DEF__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__MEASUREMENT = RecordPackage.RECORD_DEF__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__CHANGE_REQUEST = RecordPackage.RECORD_DEF__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__DASDL_PROPERTY = RecordPackage.RECORD_DEF__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__OWNED_ELEMENT = RecordPackage.RECORD_DEF__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__IS_ABSTRACT = RecordPackage.RECORD_DEF__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__FEATURE = RecordPackage.RECORD_DEF__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__STRUCTURAL_FEATURE = RecordPackage.RECORD_DEF__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__PARAMETER = RecordPackage.RECORD_DEF__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__GENERALIZATION = RecordPackage.RECORD_DEF__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__SPECIALIZATION = RecordPackage.RECORD_DEF__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__INSTANCE = RecordPackage.RECORD_DEF__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__ALIAS = RecordPackage.RECORD_DEF__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__EXPRESSION_NODE = RecordPackage.RECORD_DEF__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__MAPPING_FROM = RecordPackage.RECORD_DEF__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__MAPPING_TO = RecordPackage.RECORD_DEF__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__CLASSIFIER_MAP = RecordPackage.RECORD_DEF__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__CF_MAP = RecordPackage.RECORD_DEF__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__DOMAIN = RecordPackage.RECORD_DEF__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__SIMPLE_DIMENSION = RecordPackage.RECORD_DEF__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__INDEX = RecordPackage.RECORD_DEF__INDEX;

    /**
     * The feature id for the '<em><b>Field Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__FIELD_DELIMITER = RecordPackage.RECORD_DEF__FIELD_DELIMITER;

    /**
     * The feature id for the '<em><b>Is Fixed Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__IS_FIXED_WIDTH = RecordPackage.RECORD_DEF__IS_FIXED_WIDTH;

    /**
     * The feature id for the '<em><b>Text Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__TEXT_DELIMITER = RecordPackage.RECORD_DEF__TEXT_DELIMITER;

    /**
     * The feature id for the '<em><b>File</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__FILE = RecordPackage.RECORD_DEF__FILE;

    /**
     * The feature id for the '<em><b>Section</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__SECTION = RecordPackage.RECORD_DEF__SECTION;

    /**
     * The feature id for the '<em><b>Procopt SENSEG</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__PROCOPT_SENSEG = RecordPackage.RECORD_DEF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Subset Pointers</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__SUBSET_POINTERS = RecordPackage.RECORD_DEF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Pcb</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__PCB = RecordPackage.RECORD_DEF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sen Field</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__SEN_FIELD = RecordPackage.RECORD_DEF_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Segment</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_SEGMENT__SEGMENT = RecordPackage.RECORD_DEF_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Sen Segment</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_SEGMENT_FEATURE_COUNT = RecordPackage.RECORD_DEF_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.SenFieldImpl <em>Sen Field</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.SenFieldImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSenField()
     * @generated
     */
    int SEN_FIELD = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__NAME = RecordPackage.FIXED_OFFSET_FIELD__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__VISIBILITY = RecordPackage.FIXED_OFFSET_FIELD__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__CLIENT_DEPENDENCY = RecordPackage.FIXED_OFFSET_FIELD__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__SUPPLIER_DEPENDENCY = RecordPackage.FIXED_OFFSET_FIELD__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__CONSTRAINT = RecordPackage.FIXED_OFFSET_FIELD__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__NAMESPACE = RecordPackage.FIXED_OFFSET_FIELD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__IMPORTER = RecordPackage.FIXED_OFFSET_FIELD__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__STEREOTYPE = RecordPackage.FIXED_OFFSET_FIELD__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__TAGGED_VALUE = RecordPackage.FIXED_OFFSET_FIELD__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__DOCUMENT = RecordPackage.FIXED_OFFSET_FIELD__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__DESCRIPTION = RecordPackage.FIXED_OFFSET_FIELD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__RESPONSIBLE_PARTY = RecordPackage.FIXED_OFFSET_FIELD__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__ELEMENT_NODE = RecordPackage.FIXED_OFFSET_FIELD__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__SET = RecordPackage.FIXED_OFFSET_FIELD__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__RENDERED_OBJECT = RecordPackage.FIXED_OFFSET_FIELD__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__VOCABULARY_ELEMENT = RecordPackage.FIXED_OFFSET_FIELD__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__MEASUREMENT = RecordPackage.FIXED_OFFSET_FIELD__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__CHANGE_REQUEST = RecordPackage.FIXED_OFFSET_FIELD__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__DASDL_PROPERTY = RecordPackage.FIXED_OFFSET_FIELD__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__OWNER_SCOPE = RecordPackage.FIXED_OFFSET_FIELD__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__OWNER = RecordPackage.FIXED_OFFSET_FIELD__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__FEATURE_NODE = RecordPackage.FIXED_OFFSET_FIELD__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__FEATURE_MAP = RecordPackage.FIXED_OFFSET_FIELD__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__CF_MAP = RecordPackage.FIXED_OFFSET_FIELD__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__CHANGEABILITY = RecordPackage.FIXED_OFFSET_FIELD__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__MULTIPLICITY = RecordPackage.FIXED_OFFSET_FIELD__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__ORDERING = RecordPackage.FIXED_OFFSET_FIELD__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__TARGET_SCOPE = RecordPackage.FIXED_OFFSET_FIELD__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__TYPE = RecordPackage.FIXED_OFFSET_FIELD__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__SLOT = RecordPackage.FIXED_OFFSET_FIELD__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__DISCRIMINATED_UNION = RecordPackage.FIXED_OFFSET_FIELD__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__INDEXED_FEATURE = RecordPackage.FIXED_OFFSET_FIELD__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__KEY_RELATIONSHIP = RecordPackage.FIXED_OFFSET_FIELD__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__UNIQUE_KEY = RecordPackage.FIXED_OFFSET_FIELD__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__DATA_ITEM = RecordPackage.FIXED_OFFSET_FIELD__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__REMAP = RecordPackage.FIXED_OFFSET_FIELD__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__INITIAL_VALUE = RecordPackage.FIXED_OFFSET_FIELD__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__LENGTH = RecordPackage.FIXED_OFFSET_FIELD__LENGTH;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__PRECISION = RecordPackage.FIXED_OFFSET_FIELD__PRECISION;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__SCALE = RecordPackage.FIXED_OFFSET_FIELD__SCALE;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__OFFSET = RecordPackage.FIXED_OFFSET_FIELD__OFFSET;

    /**
     * The feature id for the '<em><b>Offset Unit Bits</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__OFFSET_UNIT_BITS = RecordPackage.FIXED_OFFSET_FIELD__OFFSET_UNIT_BITS;

    /**
     * The feature id for the '<em><b>Replace</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__REPLACE = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sen Segment</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEN_FIELD__SEN_SEGMENT = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Field</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD__FIELD = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sen Field</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEN_FIELD_FEATURE_COUNT = RecordPackage.FIXED_OFFSET_FIELD_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.ACBLIBImpl <em>ACBLIB</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.ACBLIBImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getACBLIB()
     * @generated
     */
    int ACBLIB = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__NAME = CorePackage.PACKAGE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__SUPPLIER_DEPENDENCY = CorePackage.PACKAGE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__IMPORTER = CorePackage.PACKAGE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__STEREOTYPE = CorePackage.PACKAGE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__DOCUMENT = CorePackage.PACKAGE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__DESCRIPTION = CorePackage.PACKAGE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__RESPONSIBLE_PARTY = CorePackage.PACKAGE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__ELEMENT_NODE = CorePackage.PACKAGE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__SET = CorePackage.PACKAGE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__RENDERED_OBJECT = CorePackage.PACKAGE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__VOCABULARY_ELEMENT = CorePackage.PACKAGE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__MEASUREMENT = CorePackage.PACKAGE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__CHANGE_REQUEST = CorePackage.PACKAGE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__DASDL_PROPERTY = CorePackage.PACKAGE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACBLIB__DATA_MANAGER = CorePackage.PACKAGE__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Psb</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__PSB = CorePackage.PACKAGE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB__DBD = CorePackage.PACKAGE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>ACBLIB</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACBLIB_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.imsdatabase.impl.AccessMethodImpl
     * <em>Access Method</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.imsdatabase.impl.AccessMethodImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getAccessMethod()
     * @generated
     */
    int ACCESS_METHOD = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_METHOD__DBD = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Access Method</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_METHOD_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl <em>INDEX</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getINDEX()
     * @generated
     */
    int INDEX = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__NAME = ACCESS_METHOD__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__VISIBILITY = ACCESS_METHOD__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__CLIENT_DEPENDENCY = ACCESS_METHOD__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__SUPPLIER_DEPENDENCY = ACCESS_METHOD__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__CONSTRAINT = ACCESS_METHOD__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__NAMESPACE = ACCESS_METHOD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__IMPORTER = ACCESS_METHOD__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__STEREOTYPE = ACCESS_METHOD__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__TAGGED_VALUE = ACCESS_METHOD__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__DOCUMENT = ACCESS_METHOD__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__DESCRIPTION = ACCESS_METHOD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__RESPONSIBLE_PARTY = ACCESS_METHOD__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__ELEMENT_NODE = ACCESS_METHOD__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__SET = ACCESS_METHOD__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__RENDERED_OBJECT = ACCESS_METHOD__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__VOCABULARY_ELEMENT = ACCESS_METHOD__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__MEASUREMENT = ACCESS_METHOD__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__CHANGE_REQUEST = ACCESS_METHOD__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__DASDL_PROPERTY = ACCESS_METHOD__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__DBD = ACCESS_METHOD__DBD;

    /**
     * The feature id for the '<em><b>Dos Compatibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__DOS_COMPATIBILITY = ACCESS_METHOD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Protect</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__PROTECT = ACCESS_METHOD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Primary Target</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__PRIMARY_TARGET = ACCESS_METHOD_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Secondary Target</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__SECONDARY_TARGET = ACCESS_METHOD_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Sharing Index</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__SHARING_INDEX = ACCESS_METHOD_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Shared Index</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX__SHARED_INDEX = ACCESS_METHOD_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Sequenced PCB</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__SEQUENCED_PCB = ACCESS_METHOD_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>INDEX</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INDEX_FEATURE_COUNT = ACCESS_METHOD_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.HIDAMImpl <em>HIDAM</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.HIDAMImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getHIDAM()
     * @generated
     */
    int HIDAM = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__NAME = ACCESS_METHOD__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__VISIBILITY = ACCESS_METHOD__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIDAM__CLIENT_DEPENDENCY = ACCESS_METHOD__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIDAM__SUPPLIER_DEPENDENCY = ACCESS_METHOD__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__CONSTRAINT = ACCESS_METHOD__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIDAM__NAMESPACE = ACCESS_METHOD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__IMPORTER = ACCESS_METHOD__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__STEREOTYPE = ACCESS_METHOD__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIDAM__TAGGED_VALUE = ACCESS_METHOD__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__DOCUMENT = ACCESS_METHOD__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__DESCRIPTION = ACCESS_METHOD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIDAM__RESPONSIBLE_PARTY = ACCESS_METHOD__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIDAM__ELEMENT_NODE = ACCESS_METHOD__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__SET = ACCESS_METHOD__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIDAM__RENDERED_OBJECT = ACCESS_METHOD__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIDAM__VOCABULARY_ELEMENT = ACCESS_METHOD__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__MEASUREMENT = ACCESS_METHOD__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIDAM__CHANGE_REQUEST = ACCESS_METHOD__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIDAM__DASDL_PROPERTY = ACCESS_METHOD__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__DBD = ACCESS_METHOD__DBD;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM__INDEX = ACCESS_METHOD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>HIDAM</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HIDAM_FEATURE_COUNT = ACCESS_METHOD_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.DEDBImpl <em>DEDB</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.DEDBImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getDEDB()
     * @generated
     */
    int DEDB = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__NAME = ACCESS_METHOD__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__VISIBILITY = ACCESS_METHOD__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEDB__CLIENT_DEPENDENCY = ACCESS_METHOD__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEDB__SUPPLIER_DEPENDENCY = ACCESS_METHOD__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__CONSTRAINT = ACCESS_METHOD__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEDB__NAMESPACE = ACCESS_METHOD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__IMPORTER = ACCESS_METHOD__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__STEREOTYPE = ACCESS_METHOD__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEDB__TAGGED_VALUE = ACCESS_METHOD__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__DOCUMENT = ACCESS_METHOD__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__DESCRIPTION = ACCESS_METHOD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEDB__RESPONSIBLE_PARTY = ACCESS_METHOD__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEDB__ELEMENT_NODE = ACCESS_METHOD__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__SET = ACCESS_METHOD__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEDB__RENDERED_OBJECT = ACCESS_METHOD__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEDB__VOCABULARY_ELEMENT = ACCESS_METHOD__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__MEASUREMENT = ACCESS_METHOD__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEDB__CHANGE_REQUEST = ACCESS_METHOD__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEDB__DASDL_PROPERTY = ACCESS_METHOD__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__DBD = ACCESS_METHOD__DBD;

    /**
     * The feature id for the '<em><b>Rm Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__RM_NAME = ACCESS_METHOD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Stage</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__STAGE = ACCESS_METHOD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Extended Call</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB__EXTENDED_CALL = ACCESS_METHOD_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>DEDB</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DEDB_FEATURE_COUNT = ACCESS_METHOD_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.HDAMImpl <em>HDAM</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.HDAMImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getHDAM()
     * @generated
     */
    int HDAM = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__NAME = ACCESS_METHOD__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__VISIBILITY = ACCESS_METHOD__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__CLIENT_DEPENDENCY = ACCESS_METHOD__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__SUPPLIER_DEPENDENCY = ACCESS_METHOD__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__CONSTRAINT = ACCESS_METHOD__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__NAMESPACE = ACCESS_METHOD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__IMPORTER = ACCESS_METHOD__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__STEREOTYPE = ACCESS_METHOD__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__TAGGED_VALUE = ACCESS_METHOD__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__DOCUMENT = ACCESS_METHOD__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__DESCRIPTION = ACCESS_METHOD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__RESPONSIBLE_PARTY = ACCESS_METHOD__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__ELEMENT_NODE = ACCESS_METHOD__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__SET = ACCESS_METHOD__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__RENDERED_OBJECT = ACCESS_METHOD__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__VOCABULARY_ELEMENT = ACCESS_METHOD__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__MEASUREMENT = ACCESS_METHOD__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__CHANGE_REQUEST = ACCESS_METHOD__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__DASDL_PROPERTY = ACCESS_METHOD__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__DBD = ACCESS_METHOD__DBD;

    /**
     * The feature id for the '<em><b>Rm Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__RM_NAME = ACCESS_METHOD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Relative Block Number</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__RELATIVE_BLOCK_NUMBER = ACCESS_METHOD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Root Anchor Points</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDAM__ROOT_ANCHOR_POINTS = ACCESS_METHOD_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Root Max Bytes</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM__ROOT_MAX_BYTES = ACCESS_METHOD_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>HDAM</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HDAM_FEATURE_COUNT = ACCESS_METHOD_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.MSDBImpl <em>MSDB</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.MSDBImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getMSDB()
     * @generated
     */
    int MSDB = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__NAME = ACCESS_METHOD__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__VISIBILITY = ACCESS_METHOD__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MSDB__CLIENT_DEPENDENCY = ACCESS_METHOD__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MSDB__SUPPLIER_DEPENDENCY = ACCESS_METHOD__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__CONSTRAINT = ACCESS_METHOD__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MSDB__NAMESPACE = ACCESS_METHOD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__IMPORTER = ACCESS_METHOD__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__STEREOTYPE = ACCESS_METHOD__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MSDB__TAGGED_VALUE = ACCESS_METHOD__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__DOCUMENT = ACCESS_METHOD__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__DESCRIPTION = ACCESS_METHOD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MSDB__RESPONSIBLE_PARTY = ACCESS_METHOD__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MSDB__ELEMENT_NODE = ACCESS_METHOD__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__SET = ACCESS_METHOD__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MSDB__RENDERED_OBJECT = ACCESS_METHOD__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MSDB__VOCABULARY_ELEMENT = ACCESS_METHOD__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__MEASUREMENT = ACCESS_METHOD__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MSDB__CHANGE_REQUEST = ACCESS_METHOD__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MSDB__DASDL_PROPERTY = ACCESS_METHOD__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__DBD = ACCESS_METHOD__DBD;

    /**
     * The feature id for the '<em><b>Msdb Field</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__MSDB_FIELD = ACCESS_METHOD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Msdb Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB__MSDB_TYPE = ACCESS_METHOD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>MSDB</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MSDB_FEATURE_COUNT = ACCESS_METHOD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl <em>Secondary Index</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSecondaryIndex()
     * @generated
     */
    int SECONDARY_INDEX = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__CONSTANT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Exit Routine</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__EXIT_ROUTINE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Null Value</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__NULL_VALUE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__INDEX = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Segment</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__SEGMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Search Fields</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__SEARCH_FIELDS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Ddata Fields</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__DDATA_FIELDS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Subseq Fields</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__SUBSEQ_FIELDS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Index Source</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX__INDEX_SOURCE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Secondary Index</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECONDARY_INDEX_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl <em>Exit</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.ExitImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getExit()
     * @generated
     */
    int EXIT = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__KEY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__DATA = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__PATH = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Log</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__LOG = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Cascade</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__CASCADE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Cascade Key</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__CASCADE_KEY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Cascade Data</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__CASCADE_DATA = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Cascade Path</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__CASCADE_PATH = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT__DBD = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Segment</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__SEGMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Exit</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EXIT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl <em>LCHILD</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getLCHILD()
     * @generated
     */
    int LCHILD = 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Counter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__COUNTER = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Lc Pointer</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__LC_POINTER = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Lparent Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__LPARENT_FLAG = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ltwin</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__LTWIN = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Rules</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__RULES = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Virtual Parent</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__VIRTUAL_PARENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Lparent</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LCHILD__LPARENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Lchild</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__LCHILD = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Paired Segment</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD__PAIRED_SEGMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>LCHILD</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LCHILD_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.PSBLibImpl <em>PSB Lib</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.PSBLibImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getPSBLib()
     * @generated
     */
    int PSB_LIB = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB__NAME = CorePackage.PACKAGE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__SUPPLIER_DEPENDENCY = CorePackage.PACKAGE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB__IMPORTER = CorePackage.PACKAGE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB__STEREOTYPE = CorePackage.PACKAGE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB__DOCUMENT = CorePackage.PACKAGE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB__DESCRIPTION = CorePackage.PACKAGE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__RESPONSIBLE_PARTY = CorePackage.PACKAGE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__ELEMENT_NODE = CorePackage.PACKAGE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB__SET = CorePackage.PACKAGE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__RENDERED_OBJECT = CorePackage.PACKAGE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__VOCABULARY_ELEMENT = CorePackage.PACKAGE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB__MEASUREMENT = CorePackage.PACKAGE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__CHANGE_REQUEST = CorePackage.PACKAGE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__DASDL_PROPERTY = CorePackage.PACKAGE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PSB_LIB__DATA_MANAGER = CorePackage.PACKAGE__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Psb</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB__PSB = CorePackage.PACKAGE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>PSB Lib</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PSB_LIB_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.imsdatabase.impl.DBDLibImpl <em>DBD Lib</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.imsdatabase.impl.DBDLibImpl
     * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getDBDLib()
     * @generated
     */
    int DBD_LIB = 21;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB__NAME = CorePackage.PACKAGE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__SUPPLIER_DEPENDENCY = CorePackage.PACKAGE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB__IMPORTER = CorePackage.PACKAGE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB__STEREOTYPE = CorePackage.PACKAGE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB__DOCUMENT = CorePackage.PACKAGE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB__DESCRIPTION = CorePackage.PACKAGE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__RESPONSIBLE_PARTY = CorePackage.PACKAGE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__ELEMENT_NODE = CorePackage.PACKAGE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB__SET = CorePackage.PACKAGE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__RENDERED_OBJECT = CorePackage.PACKAGE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__VOCABULARY_ELEMENT = CorePackage.PACKAGE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB__MEASUREMENT = CorePackage.PACKAGE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__CHANGE_REQUEST = CorePackage.PACKAGE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__DASDL_PROPERTY = CorePackage.PACKAGE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DBD_LIB__DATA_MANAGER = CorePackage.PACKAGE__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Dbd</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB__DBD = CorePackage.PACKAGE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>DBD Lib</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DBD_LIB_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.DBD <em>DBD</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>DBD</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD
     * @generated
     */
    EClass getDBD();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.DBD#getDliAccess <em>Dli Access</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dli Access</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getDliAccess()
     * @see #getDBD()
     * @generated
     */
    EAttribute getDBD_DliAccess();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.DBD#isIsVSAM <em>Is VSAM</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is VSAM</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#isIsVSAM()
     * @see #getDBD()
     * @generated
     */
    EAttribute getDBD_IsVSAM();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.DBD#isPasswordFlag <em>Password Flag</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password Flag</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#isPasswordFlag()
     * @see #getDBD()
     * @generated
     */
    EAttribute getDBD_PasswordFlag();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.DBD#getVersionString <em>Version String</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version String</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getVersionString()
     * @see #getDBD()
     * @generated
     */
    EAttribute getDBD_VersionString();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.resource.imsdatabase.DBD#getAccessMethod <em>Access Method</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Access Method</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getAccessMethod()
     * @see #getDBD()
     * @generated
     */
    EReference getDBD_AccessMethod();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.DBD#getAcblib <em>Acblib</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Acblib</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getAcblib()
     * @see #getDBD()
     * @generated
     */
    EReference getDBD_Acblib();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.imsdatabase.DBD#getDataset <em>Dataset</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dataset</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getDataset()
     * @see #getDBD()
     * @generated
     */
    EReference getDBD_Dataset();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.imsdatabase.DBD#getSegment <em>Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Segment</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getSegment()
     * @see #getDBD()
     * @generated
     */
    EReference getDBD_Segment();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmx.resource.imsdatabase.DBD#getPcb <em>Pcb</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Pcb</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getPcb()
     * @see #getDBD()
     * @generated
     */
    EReference getDBD_Pcb();

    /**
     * Returns the meta object for the containment reference list '
     * {@link orgomg.cwmx.resource.imsdatabase.DBD#getExit <em>Exit</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Exit</em>
     *         '.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getExit()
     * @see #getDBD()
     * @generated
     */
    EReference getDBD_Exit();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.DBD#getLibrary <em>Library</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Library</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getLibrary()
     * @see #getDBD()
     * @generated
     */
    EReference getDBD_Library();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.PSB <em>PSB</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>PSB</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB
     * @generated
     */
    EClass getPSB();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PSB#isCompatibility <em>Compatibility</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Compatibility</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#isCompatibility()
     * @see #getPSB()
     * @generated
     */
    EAttribute getPSB_Compatibility();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PSB#getIoErrorOption <em>Io Error Option</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Io Error Option</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getIoErrorOption()
     * @see #getPSB()
     * @generated
     */
    EAttribute getPSB_IoErrorOption();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PSB#getIoaSize <em>Ioa Size</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ioa Size</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getIoaSize()
     * @see #getPSB()
     * @generated
     */
    EAttribute getPSB_IoaSize();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PSB#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getLanguage()
     * @see #getPSB()
     * @generated
     */
    EAttribute getPSB_Language();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PSB#getLockMaximum <em>Lock Maximum</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lock Maximum</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getLockMaximum()
     * @see #getPSB()
     * @generated
     */
    EAttribute getPSB_LockMaximum();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.PSB#getMaximumQxCalls
     * <em>Maximum Qx Calls</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Maximum Qx Calls</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getMaximumQxCalls()
     * @see #getPSB()
     * @generated
     */
    EAttribute getPSB_MaximumQxCalls();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.PSB#isOnlineImageCopy
     * <em>Online Image Copy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Online Image Copy</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#isOnlineImageCopy()
     * @see #getPSB()
     * @generated
     */
    EAttribute getPSB_OnlineImageCopy();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PSB#getSsaSize <em>Ssa Size</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ssa Size</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getSsaSize()
     * @see #getPSB()
     * @generated
     */
    EAttribute getPSB_SsaSize();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.PSB#isWriteToOperator
     * <em>Write To Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Write To Operator</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#isWriteToOperator()
     * @see #getPSB()
     * @generated
     */
    EAttribute getPSB_WriteToOperator();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.PSB#getAcblib <em>Acblib</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Acblib</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getAcblib()
     * @see #getPSB()
     * @generated
     */
    EReference getPSB_Acblib();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmx.resource.imsdatabase.PSB#getPcb <em>Pcb</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Pcb</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getPcb()
     * @see #getPSB()
     * @generated
     */
    EReference getPSB_Pcb();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.PSB#getLibrary <em>Library</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Library</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getLibrary()
     * @see #getPSB()
     * @generated
     */
    EReference getPSB_Library();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.PCB <em>PCB</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>PCB</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB
     * @generated
     */
    EClass getPCB();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PCB#getPcbType <em>Pcb Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pcb Type</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getPcbType()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_PcbType();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.PCB#isList <em>List</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>List</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#isList()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_List();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PCB#getKeyLength <em>Key Length</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key Length</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getKeyLength()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_KeyLength();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.PCB#getProcessingOptions
     * <em>Processing Options</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Processing Options</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getProcessingOptions()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_ProcessingOptions();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PCB#getPositioning <em>Positioning</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Positioning</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getPositioning()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_Positioning();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PCB#isSequentialBuffering <em>Sequential Buffering</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the attribute '<em>Sequential Buffering</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#isSequentialBuffering()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_SequentialBuffering();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.PCB#isAlternateResponse
     * <em>Alternate Response</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Alternate Response</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#isAlternateResponse()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_AlternateResponse();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PCB#isExpress <em>Express</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Express</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#isExpress()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_Express();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PCB#isModify <em>Modify</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modify</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#isModify()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_Modify();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PCB#isSameTerminal <em>Same Terminal</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Same Terminal</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#isSameTerminal()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_SameTerminal();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.PCB#getDestinationType
     * <em>Destination Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Destination Type</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getDestinationType()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_DestinationType();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.PCB#getLtermName <em>Lterm Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lterm Name</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getLtermName()
     * @see #getPCB()
     * @generated
     */
    EAttribute getPCB_LtermName();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.PCB#getProcSeq <em>Proc Seq</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Proc Seq</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getProcSeq()
     * @see #getPCB()
     * @generated
     */
    EReference getPCB_ProcSeq();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.resource.imsdatabase.PCB#getDbd <em>Dbd</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Dbd</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getDbd()
     * @see #getPCB()
     * @generated
     */
    EReference getPCB_Dbd();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmx.resource.imsdatabase.PCB#getPsb <em>Psb</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Psb</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getPsb()
     * @see #getPCB()
     * @generated
     */
    EReference getPCB_Psb();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.imsdatabase.PCB#getSenSegment <em>Sen Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sen Segment</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getSenSegment()
     * @see #getPCB()
     * @generated
     */
    EReference getPCB_SenSegment();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.Segment <em>Segment</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Segment</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment
     * @generated
     */
    EClass getSegment();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Segment#isExitFlag <em>Exit Flag</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exit Flag</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#isExitFlag()
     * @see #getSegment()
     * @generated
     */
    EAttribute getSegment_ExitFlag();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Segment#getFrequency <em>Frequency</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Frequency</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getFrequency()
     * @see #getSegment()
     * @generated
     */
    EAttribute getSegment_Frequency();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Segment#getMaximumLength <em>Maximum Length</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maximum Length</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getMaximumLength()
     * @see #getSegment()
     * @generated
     */
    EAttribute getSegment_MaximumLength();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Segment#getMinimumLength <em>Minimum Length</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Minimum Length</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getMinimumLength()
     * @see #getSegment()
     * @generated
     */
    EAttribute getSegment_MinimumLength();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Segment#getRules <em>Rules</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rules</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getRules()
     * @see #getSegment()
     * @generated
     */
    EAttribute getSegment_Rules();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Segment#getSubsetPointers <em>Subset Pointers</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Subset Pointers</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getSubsetPointers()
     * @see #getSegment()
     * @generated
     */
    EAttribute getSegment_SubsetPointers();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.Segment#isDirectDependent
     * <em>Direct Dependent</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Direct Dependent</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#isDirectDependent()
     * @see #getSegment()
     * @generated
     */
    EAttribute getSegment_DirectDependent();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Segment#getPcPointer <em>Pc Pointer</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pc Pointer</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getPcPointer()
     * @see #getSegment()
     * @generated
     */
    EAttribute getSegment_PcPointer();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.Segment#getLogical <em>Logical</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Logical</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getLogical()
     * @see #getSegment()
     * @generated
     */
    EReference getSegment_Logical();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.imsdatabase.Segment#getDbd <em>Dbd</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Dbd</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getDbd()
     * @see #getSegment()
     * @generated
     */
    EReference getSegment_Dbd();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.Segment#getSenseg <em>Senseg</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Senseg</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getSenseg()
     * @see #getSegment()
     * @generated
     */
    EReference getSegment_Senseg();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.Segment#getChild <em>Child</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Child</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getChild()
     * @see #getSegment()
     * @generated
     */
    EReference getSegment_Child();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.Segment#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parent</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getParent()
     * @see #getSegment()
     * @generated
     */
    EReference getSegment_Parent();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.imsdatabase.Segment#getExit <em>Exit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Exit</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getExit()
     * @see #getSegment()
     * @generated
     */
    EReference getSegment_Exit();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex <em>Segment Complex</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Segment Complex</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex
     * @generated
     */
    EClass getSegmentComplex();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDeleteFlag <em>Delete Flag</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete Flag</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDeleteFlag()
     * @see #getSegmentComplex()
     * @generated
     */
    EAttribute getSegmentComplex_DeleteFlag();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getInsertFlag <em>Insert Flag</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Insert Flag</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getInsertFlag()
     * @see #getSegmentComplex()
     * @generated
     */
    EAttribute getSegmentComplex_InsertFlag();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getReplaceFlag <em>Replace Flag</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Replace Flag</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getReplaceFlag()
     * @see #getSegmentComplex()
     * @generated
     */
    EAttribute getSegmentComplex_ReplaceFlag();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSegmPointer <em>Segm Pointer</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Segm Pointer</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSegmPointer()
     * @see #getSegmentComplex()
     * @generated
     */
    EAttribute getSegmentComplex_SegmPointer();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDsGroup <em>Ds Group</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Group</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDsGroup()
     * @see #getSegmentComplex()
     * @generated
     */
    EAttribute getSegmentComplex_DsGroup();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSecondaryIndex <em>Secondary Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Secondary Index</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSecondaryIndex()
     * @see #getSegmentComplex()
     * @generated
     */
    EReference getSegmentComplex_SecondaryIndex();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLchild <em>Lchild</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Lchild</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLchild()
     * @see #getSegmentComplex()
     * @generated
     */
    EReference getSegmentComplex_Lchild();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSourcedIndex <em>Sourced Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sourced Index</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSourcedIndex()
     * @see #getSegmentComplex()
     * @generated
     */
    EReference getSegmentComplex_SourcedIndex();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLparent <em>Lparent</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Lparent</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLparent()
     * @see #getSegmentComplex()
     * @generated
     */
    EReference getSegmentComplex_Lparent();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getPairedLCHILD <em>Paired LCHILD</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Paired LCHILD</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getPairedLCHILD()
     * @see #getSegmentComplex()
     * @generated
     */
    EReference getSegmentComplex_PairedLCHILD();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDataset <em>Dataset</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Dataset</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDataset()
     * @see #getSegmentComplex()
     * @generated
     */
    EReference getSegmentComplex_Dataset();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.imsdatabase.SegmentLogical <em>Segment Logical</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Segment Logical</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentLogical
     * @generated
     */
    EClass getSegmentLogical();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SegmentLogical#isKeyData1 <em>Key Data1</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key Data1</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentLogical#isKeyData1()
     * @see #getSegmentLogical()
     * @generated
     */
    EAttribute getSegmentLogical_KeyData1();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SegmentLogical#isKeyData2 <em>Key Data2</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key Data2</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentLogical#isKeyData2()
     * @see #getSegmentLogical()
     * @generated
     */
    EAttribute getSegmentLogical_KeyData2();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.SegmentLogical#getPhysical <em>Physical</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Physical</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SegmentLogical#getPhysical()
     * @see #getSegmentLogical()
     * @generated
     */
    EReference getSegmentLogical_Physical();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.Field <em>Field</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Field</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Field
     * @generated
     */
    EClass getField();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Field#isSequenceField <em>Sequence Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sequence Field</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Field#isSequenceField()
     * @see #getField()
     * @generated
     */
    EAttribute getField_SequenceField();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Field#isUniqueSequence <em>Unique Sequence</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unique Sequence</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Field#isUniqueSequence()
     * @see #getField()
     * @generated
     */
    EAttribute getField_UniqueSequence();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Field#getFieldLength <em>Field Length</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field Length</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Field#getFieldLength()
     * @see #getField()
     * @generated
     */
    EAttribute getField_FieldLength();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Field#isGenerated <em>Generated</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Generated</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Field#isGenerated()
     * @see #getField()
     * @generated
     */
    EAttribute getField_Generated();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.Field#getSearchIndex <em>Search Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Search Index</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Field#getSearchIndex()
     * @see #getField()
     * @generated
     */
    EReference getField_SearchIndex();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.Field#getDdataIndex <em>Ddata Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Ddata Index</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Field#getDdataIndex()
     * @see #getField()
     * @generated
     */
    EReference getField_DdataIndex();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.Field#getSubseqIndex <em>Subseq Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Subseq Index</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Field#getSubseqIndex()
     * @see #getField()
     * @generated
     */
    EReference getField_SubseqIndex();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.Field#getSenField <em>Sen Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sen Field</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Field#getSenField()
     * @see #getField()
     * @generated
     */
    EReference getField_SenField();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.Dataset <em>Dataset</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Dataset</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset
     * @generated
     */
    EClass getDataset();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDd1name <em>Dd1name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dd1name</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getDd1name()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_Dd1name();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDevice <em>Device</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Device</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getDevice()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_Device();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getModel <em>Model</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Model</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getModel()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_Model();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDd2name <em>Dd2name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dd2name</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getDd2name()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_Dd2name();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getSize1 <em>Size1</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size1</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getSize1()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_Size1();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getSize2 <em>Size2</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size2</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getSize2()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_Size2();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRecordLength1 <em>Record Length1</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Record Length1</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getRecordLength1()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_RecordLength1();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRecordLength2 <em>Record Length2</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Record Length2</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getRecordLength2()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_RecordLength2();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.Dataset#getBlockingFactor1
     * <em>Blocking Factor1</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Blocking Factor1</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getBlockingFactor1()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_BlockingFactor1();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.Dataset#getBlockingFactor2
     * <em>Blocking Factor2</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Blocking Factor2</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getBlockingFactor2()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_BlockingFactor2();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDatasetLabel <em>Dataset Label</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dataset Label</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getDatasetLabel()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_DatasetLabel();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getFreeBlockFrequency <em>Free Block Frequency</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the attribute '<em>Free Block Frequency</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getFreeBlockFrequency()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_FreeBlockFrequency();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getFreeSpacePercentage <em>Free Space Percentage</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the attribute '<em>Free Space Percentage</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getFreeSpacePercentage()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_FreeSpacePercentage();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRecordFormat <em>Record Format</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Record Format</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getRecordFormat()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_RecordFormat();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getScanCylinders <em>Scan Cylinders</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scan Cylinders</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getScanCylinders()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_ScanCylinders();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.Dataset#getSearchAlgorithm
     * <em>Search Algorithm</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Search Algorithm</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getSearchAlgorithm()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_SearchAlgorithm();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRoot <em>Root</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Root</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getRoot()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_Root();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRootOverflow <em>Root Overflow</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Root Overflow</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getRootOverflow()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_RootOverflow();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getUow <em>Uow</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uow</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getUow()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_Uow();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getUowOverflow <em>Uow Overflow</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uow Overflow</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getUowOverflow()
     * @see #getDataset()
     * @generated
     */
    EAttribute getDataset_UowOverflow();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDbd <em>Dbd</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Dbd</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getDbd()
     * @see #getDataset()
     * @generated
     */
    EReference getDataset_Dbd();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getSegment <em>Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Segment</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getSegment()
     * @see #getDataset()
     * @generated
     */
    EReference getDataset_Segment();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.imsdatabase.SenSegment <em>Sen Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Sen Segment</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SenSegment
     * @generated
     */
    EClass getSenSegment();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getProcoptSENSEG <em>Procopt SENSEG</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Procopt SENSEG</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SenSegment#getProcoptSENSEG()
     * @see #getSenSegment()
     * @generated
     */
    EAttribute getSenSegment_ProcoptSENSEG();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getSubsetPointers <em>Subset Pointers</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Subset Pointers</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SenSegment#getSubsetPointers()
     * @see #getSenSegment()
     * @generated
     */
    EAttribute getSenSegment_SubsetPointers();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getPcb <em>Pcb</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Pcb</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SenSegment#getPcb()
     * @see #getSenSegment()
     * @generated
     */
    EReference getSenSegment_Pcb();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getSenField <em>Sen Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sen Field</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SenSegment#getSenField()
     * @see #getSenSegment()
     * @generated
     */
    EReference getSenSegment_SenField();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getSegment <em>Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Segment</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SenSegment#getSegment()
     * @see #getSenSegment()
     * @generated
     */
    EReference getSenSegment_Segment();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.imsdatabase.SenField <em>Sen Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Sen Field</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SenField
     * @generated
     */
    EClass getSenField();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SenField#isReplace <em>Replace</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Replace</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SenField#isReplace()
     * @see #getSenField()
     * @generated
     */
    EAttribute getSenField_Replace();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.imsdatabase.SenField#getSenSegment <em>Sen Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Sen Segment</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SenField#getSenSegment()
     * @see #getSenField()
     * @generated
     */
    EReference getSenField_SenSegment();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.SenField#getField <em>Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Field</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SenField#getField()
     * @see #getSenField()
     * @generated
     */
    EReference getSenField_Field();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.ACBLIB <em>ACBLIB</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>ACBLIB</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.ACBLIB
     * @generated
     */
    EClass getACBLIB();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.ACBLIB#getPsb <em>Psb</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Psb</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.ACBLIB#getPsb()
     * @see #getACBLIB()
     * @generated
     */
    EReference getACBLIB_Psb();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.ACBLIB#getDbd <em>Dbd</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Dbd</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.ACBLIB#getDbd()
     * @see #getACBLIB()
     * @generated
     */
    EReference getACBLIB_Dbd();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.imsdatabase.AccessMethod <em>Access Method</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Access Method</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.AccessMethod
     * @generated
     */
    EClass getAccessMethod();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.imsdatabase.AccessMethod#getDbd <em>Dbd</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Dbd</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.AccessMethod#getDbd()
     * @see #getAccessMethod()
     * @generated
     */
    EReference getAccessMethod_Dbd();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.INDEX <em>INDEX</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>INDEX</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.INDEX
     * @generated
     */
    EClass getINDEX();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.INDEX#isDosCompatibility
     * <em>Dos Compatibility</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Dos Compatibility</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#isDosCompatibility()
     * @see #getINDEX()
     * @generated
     */
    EAttribute getINDEX_DosCompatibility();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.INDEX#isProtect <em>Protect</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Protect</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#isProtect()
     * @see #getINDEX()
     * @generated
     */
    EAttribute getINDEX_Protect();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getPrimaryTarget <em>Primary Target</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Primary Target</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#getPrimaryTarget()
     * @see #getINDEX()
     * @generated
     */
    EReference getINDEX_PrimaryTarget();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.resource.imsdatabase.INDEX#getSecondaryTarget
     * <em>Secondary Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Secondary Target</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#getSecondaryTarget()
     * @see #getINDEX()
     * @generated
     */
    EReference getINDEX_SecondaryTarget();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSharingIndex <em>Sharing Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sharing Index</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#getSharingIndex()
     * @see #getINDEX()
     * @generated
     */
    EReference getINDEX_SharingIndex();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSharedIndex <em>Shared Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Shared Index</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#getSharedIndex()
     * @see #getINDEX()
     * @generated
     */
    EReference getINDEX_SharedIndex();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSequencedPCB <em>Sequenced PCB</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sequenced PCB</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#getSequencedPCB()
     * @see #getINDEX()
     * @generated
     */
    EReference getINDEX_SequencedPCB();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.HIDAM <em>HIDAM</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>HIDAM</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.HIDAM
     * @generated
     */
    EClass getHIDAM();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.HIDAM#getIndex <em>Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Index</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.HIDAM#getIndex()
     * @see #getHIDAM()
     * @generated
     */
    EReference getHIDAM_Index();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.DEDB <em>DEDB</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>DEDB</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DEDB
     * @generated
     */
    EClass getDEDB();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.DEDB#getRmName <em>Rm Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rm Name</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DEDB#getRmName()
     * @see #getDEDB()
     * @generated
     */
    EAttribute getDEDB_RmName();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.DEDB#getStage <em>Stage</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stage</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DEDB#getStage()
     * @see #getDEDB()
     * @generated
     */
    EAttribute getDEDB_Stage();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.DEDB#isExtendedCall <em>Extended Call</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Extended Call</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DEDB#isExtendedCall()
     * @see #getDEDB()
     * @generated
     */
    EAttribute getDEDB_ExtendedCall();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.HDAM <em>HDAM</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>HDAM</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.HDAM
     * @generated
     */
    EClass getHDAM();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRmName <em>Rm Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rm Name</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.HDAM#getRmName()
     * @see #getHDAM()
     * @generated
     */
    EAttribute getHDAM_RmName();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRelativeBlockNumber <em>Relative Block Number</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the attribute '<em>Relative Block Number</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.HDAM#getRelativeBlockNumber()
     * @see #getHDAM()
     * @generated
     */
    EAttribute getHDAM_RelativeBlockNumber();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.HDAM#getRootAnchorPoints
     * <em>Root Anchor Points</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Root Anchor Points</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.HDAM#getRootAnchorPoints()
     * @see #getHDAM()
     * @generated
     */
    EAttribute getHDAM_RootAnchorPoints();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.HDAM#getRootMaxBytes <em>Root Max Bytes</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Root Max Bytes</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.HDAM#getRootMaxBytes()
     * @see #getHDAM()
     * @generated
     */
    EAttribute getHDAM_RootMaxBytes();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.MSDB <em>MSDB</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>MSDB</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.MSDB
     * @generated
     */
    EClass getMSDB();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.MSDB#getMsdbField <em>Msdb Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Msdb Field</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.MSDB#getMsdbField()
     * @see #getMSDB()
     * @generated
     */
    EAttribute getMSDB_MsdbField();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.MSDB#getMsdbType <em>Msdb Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Msdb Type</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.MSDB#getMsdbType()
     * @see #getMSDB()
     * @generated
     */
    EAttribute getMSDB_MsdbType();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex <em>Secondary Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Secondary Index</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex
     * @generated
     */
    EClass getSecondaryIndex();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getConstant <em>Constant</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Constant</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getConstant()
     * @see #getSecondaryIndex()
     * @generated
     */
    EAttribute getSecondaryIndex_Constant();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getExitRoutine <em>Exit Routine</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exit Routine</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getExitRoutine()
     * @see #getSecondaryIndex()
     * @generated
     */
    EAttribute getSecondaryIndex_ExitRoutine();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getNullValue <em>Null Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Null Value</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getNullValue()
     * @see #getSecondaryIndex()
     * @generated
     */
    EAttribute getSecondaryIndex_NullValue();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndex <em>Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Index</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndex()
     * @see #getSecondaryIndex()
     * @generated
     */
    EReference getSecondaryIndex_Index();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSegment <em>Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Segment</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSegment()
     * @see #getSecondaryIndex()
     * @generated
     */
    EReference getSecondaryIndex_Segment();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSearchFields <em>Search Fields</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Search Fields</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSearchFields()
     * @see #getSecondaryIndex()
     * @generated
     */
    EReference getSecondaryIndex_SearchFields();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getDdataFields <em>Ddata Fields</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Ddata Fields</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getDdataFields()
     * @see #getSecondaryIndex()
     * @generated
     */
    EReference getSecondaryIndex_DdataFields();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSubseqFields <em>Subseq Fields</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Subseq Fields</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSubseqFields()
     * @see #getSecondaryIndex()
     * @generated
     */
    EReference getSecondaryIndex_SubseqFields();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndexSource <em>Index Source</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Index Source</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndexSource()
     * @see #getSecondaryIndex()
     * @generated
     */
    EReference getSecondaryIndex_IndexSource();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.Exit <em>Exit</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Exit</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit
     * @generated
     */
    EClass getExit();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.Exit#isKey <em>Key</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit#isKey()
     * @see #getExit()
     * @generated
     */
    EAttribute getExit_Key();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.Exit#isData <em>Data</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Data</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit#isData()
     * @see #getExit()
     * @generated
     */
    EAttribute getExit_Data();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.Exit#isPath <em>Path</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit#isPath()
     * @see #getExit()
     * @generated
     */
    EAttribute getExit_Path();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.imsdatabase.Exit#isLog <em>Log</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Log</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit#isLog()
     * @see #getExit()
     * @generated
     */
    EAttribute getExit_Log();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascade <em>Cascade</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cascade</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit#isCascade()
     * @see #getExit()
     * @generated
     */
    EAttribute getExit_Cascade();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascadeKey <em>Cascade Key</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cascade Key</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit#isCascadeKey()
     * @see #getExit()
     * @generated
     */
    EAttribute getExit_CascadeKey();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascadeData <em>Cascade Data</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cascade Data</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit#isCascadeData()
     * @see #getExit()
     * @generated
     */
    EAttribute getExit_CascadeData();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascadePath <em>Cascade Path</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cascade Path</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit#isCascadePath()
     * @see #getExit()
     * @generated
     */
    EAttribute getExit_CascadePath();

    /**
     * Returns the meta object for the container reference '
     * {@link orgomg.cwmx.resource.imsdatabase.Exit#getDbd <em>Dbd</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Dbd</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit#getDbd()
     * @see #getExit()
     * @generated
     */
    EReference getExit_Dbd();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.imsdatabase.Exit#getSegment <em>Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Segment</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.Exit#getSegment()
     * @see #getExit()
     * @generated
     */
    EReference getExit_Segment();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.LCHILD <em>LCHILD</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>LCHILD</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD
     * @generated
     */
    EClass getLCHILD();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#isCounter <em>Counter</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Counter</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#isCounter()
     * @see #getLCHILD()
     * @generated
     */
    EAttribute getLCHILD_Counter();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLcPointer <em>Lc Pointer</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lc Pointer</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#getLcPointer()
     * @see #getLCHILD()
     * @generated
     */
    EAttribute getLCHILD_LcPointer();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#isLparentFlag <em>Lparent Flag</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lparent Flag</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#isLparentFlag()
     * @see #getLCHILD()
     * @generated
     */
    EAttribute getLCHILD_LparentFlag();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLtwin <em>Ltwin</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ltwin</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#getLtwin()
     * @see #getLCHILD()
     * @generated
     */
    EAttribute getLCHILD_Ltwin();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getRules <em>Rules</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rules</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#getRules()
     * @see #getLCHILD()
     * @generated
     */
    EAttribute getLCHILD_Rules();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getVirtualParent <em>Virtual Parent</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Virtual Parent</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#getVirtualParent()
     * @see #getLCHILD()
     * @generated
     */
    EAttribute getLCHILD_VirtualParent();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLparent <em>Lparent</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Lparent</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#getLparent()
     * @see #getLCHILD()
     * @generated
     */
    EReference getLCHILD_Lparent();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLchild <em>Lchild</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Lchild</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#getLchild()
     * @see #getLCHILD()
     * @generated
     */
    EReference getLCHILD_Lchild();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getPairedSegment <em>Paired Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Paired Segment</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#getPairedSegment()
     * @see #getLCHILD()
     * @generated
     */
    EReference getLCHILD_PairedSegment();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.PSBLib <em>PSB Lib</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>PSB Lib</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSBLib
     * @generated
     */
    EClass getPSBLib();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.PSBLib#getPsb <em>Psb</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Psb</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.PSBLib#getPsb()
     * @see #getPSBLib()
     * @generated
     */
    EReference getPSBLib_Psb();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.imsdatabase.DBDLib <em>DBD Lib</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>DBD Lib</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBDLib
     * @generated
     */
    EClass getDBDLib();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.imsdatabase.DBDLib#getDbd <em>Dbd</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Dbd</em>'.
     * @see orgomg.cwmx.resource.imsdatabase.DBDLib#getDbd()
     * @see #getDBDLib()
     * @generated
     */
    EReference getDBDLib_Dbd();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ImsdatabaseFactory getImsdatabaseFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that
     * represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl <em>DBD</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.DBDImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getDBD()
         * @generated
         */
        EClass DBD = eINSTANCE.getDBD();

        /**
         * The meta object literal for the '<em><b>Dli Access</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DBD__DLI_ACCESS = eINSTANCE.getDBD_DliAccess();

        /**
         * The meta object literal for the '<em><b>Is VSAM</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DBD__IS_VSAM = eINSTANCE.getDBD_IsVSAM();

        /**
         * The meta object literal for the '<em><b>Password Flag</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DBD__PASSWORD_FLAG = eINSTANCE.getDBD_PasswordFlag();

        /**
         * The meta object literal for the '<em><b>Version String</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DBD__VERSION_STRING = eINSTANCE.getDBD_VersionString();

        /**
         * The meta object literal for the '<em><b>Access Method</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference DBD__ACCESS_METHOD = eINSTANCE.getDBD_AccessMethod();

        /**
         * The meta object literal for the '<em><b>Acblib</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DBD__ACBLIB = eINSTANCE.getDBD_Acblib();

        /**
         * The meta object literal for the '<em><b>Dataset</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DBD__DATASET = eINSTANCE.getDBD_Dataset();

        /**
         * The meta object literal for the '<em><b>Segment</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DBD__SEGMENT = eINSTANCE.getDBD_Segment();

        /**
         * The meta object literal for the '<em><b>Pcb</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DBD__PCB = eINSTANCE.getDBD_Pcb();

        /**
         * The meta object literal for the '<em><b>Exit</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DBD__EXIT = eINSTANCE.getDBD_Exit();

        /**
         * The meta object literal for the '<em><b>Library</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DBD__LIBRARY = eINSTANCE.getDBD_Library();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl <em>PSB</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.PSBImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getPSB()
         * @generated
         */
        EClass PSB = eINSTANCE.getPSB();

        /**
         * The meta object literal for the '<em><b>Compatibility</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PSB__COMPATIBILITY = eINSTANCE.getPSB_Compatibility();

        /**
         * The meta object literal for the '<em><b>Io Error Option</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PSB__IO_ERROR_OPTION = eINSTANCE.getPSB_IoErrorOption();

        /**
         * The meta object literal for the '<em><b>Ioa Size</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PSB__IOA_SIZE = eINSTANCE.getPSB_IoaSize();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PSB__LANGUAGE = eINSTANCE.getPSB_Language();

        /**
         * The meta object literal for the '<em><b>Lock Maximum</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PSB__LOCK_MAXIMUM = eINSTANCE.getPSB_LockMaximum();

        /**
         * The meta object literal for the '<em><b>Maximum Qx Calls</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PSB__MAXIMUM_QX_CALLS = eINSTANCE.getPSB_MaximumQxCalls();

        /**
         * The meta object literal for the '<em><b>Online Image Copy</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PSB__ONLINE_IMAGE_COPY = eINSTANCE.getPSB_OnlineImageCopy();

        /**
         * The meta object literal for the '<em><b>Ssa Size</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PSB__SSA_SIZE = eINSTANCE.getPSB_SsaSize();

        /**
         * The meta object literal for the '<em><b>Write To Operator</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PSB__WRITE_TO_OPERATOR = eINSTANCE.getPSB_WriteToOperator();

        /**
         * The meta object literal for the '<em><b>Acblib</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference PSB__ACBLIB = eINSTANCE.getPSB_Acblib();

        /**
         * The meta object literal for the '<em><b>Pcb</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference PSB__PCB = eINSTANCE.getPSB_Pcb();

        /**
         * The meta object literal for the '<em><b>Library</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference PSB__LIBRARY = eINSTANCE.getPSB_Library();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl <em>PCB</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.PCBImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getPCB()
         * @generated
         */
        EClass PCB = eINSTANCE.getPCB();

        /**
         * The meta object literal for the '<em><b>Pcb Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__PCB_TYPE = eINSTANCE.getPCB_PcbType();

        /**
         * The meta object literal for the '<em><b>List</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__LIST = eINSTANCE.getPCB_List();

        /**
         * The meta object literal for the '<em><b>Key Length</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__KEY_LENGTH = eINSTANCE.getPCB_KeyLength();

        /**
         * The meta object literal for the '<em><b>Processing Options</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__PROCESSING_OPTIONS = eINSTANCE.getPCB_ProcessingOptions();

        /**
         * The meta object literal for the '<em><b>Positioning</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__POSITIONING = eINSTANCE.getPCB_Positioning();

        /**
         * The meta object literal for the '<em><b>Sequential Buffering</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__SEQUENTIAL_BUFFERING = eINSTANCE.getPCB_SequentialBuffering();

        /**
         * The meta object literal for the '<em><b>Alternate Response</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__ALTERNATE_RESPONSE = eINSTANCE.getPCB_AlternateResponse();

        /**
         * The meta object literal for the '<em><b>Express</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__EXPRESS = eINSTANCE.getPCB_Express();

        /**
         * The meta object literal for the '<em><b>Modify</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__MODIFY = eINSTANCE.getPCB_Modify();

        /**
         * The meta object literal for the '<em><b>Same Terminal</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__SAME_TERMINAL = eINSTANCE.getPCB_SameTerminal();

        /**
         * The meta object literal for the '<em><b>Destination Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__DESTINATION_TYPE = eINSTANCE.getPCB_DestinationType();

        /**
         * The meta object literal for the '<em><b>Lterm Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PCB__LTERM_NAME = eINSTANCE.getPCB_LtermName();

        /**
         * The meta object literal for the '<em><b>Proc Seq</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference PCB__PROC_SEQ = eINSTANCE.getPCB_ProcSeq();

        /**
         * The meta object literal for the '<em><b>Dbd</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference PCB__DBD = eINSTANCE.getPCB_Dbd();

        /**
         * The meta object literal for the '<em><b>Psb</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference PCB__PSB = eINSTANCE.getPCB_Psb();

        /**
         * The meta object literal for the '<em><b>Sen Segment</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference PCB__SEN_SEGMENT = eINSTANCE.getPCB_SenSegment();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl
         * <em>Segment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSegment()
         * @generated
         */
        EClass SEGMENT = eINSTANCE.getSegment();

        /**
         * The meta object literal for the '<em><b>Exit Flag</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT__EXIT_FLAG = eINSTANCE.getSegment_ExitFlag();

        /**
         * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT__FREQUENCY = eINSTANCE.getSegment_Frequency();

        /**
         * The meta object literal for the '<em><b>Maximum Length</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT__MAXIMUM_LENGTH = eINSTANCE.getSegment_MaximumLength();

        /**
         * The meta object literal for the '<em><b>Minimum Length</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT__MINIMUM_LENGTH = eINSTANCE.getSegment_MinimumLength();

        /**
         * The meta object literal for the '<em><b>Rules</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT__RULES = eINSTANCE.getSegment_Rules();

        /**
         * The meta object literal for the '<em><b>Subset Pointers</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT__SUBSET_POINTERS = eINSTANCE.getSegment_SubsetPointers();

        /**
         * The meta object literal for the '<em><b>Direct Dependent</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT__DIRECT_DEPENDENT = eINSTANCE.getSegment_DirectDependent();

        /**
         * The meta object literal for the '<em><b>Pc Pointer</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT__PC_POINTER = eINSTANCE.getSegment_PcPointer();

        /**
         * The meta object literal for the '<em><b>Logical</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT__LOGICAL = eINSTANCE.getSegment_Logical();

        /**
         * The meta object literal for the '<em><b>Dbd</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT__DBD = eINSTANCE.getSegment_Dbd();

        /**
         * The meta object literal for the '<em><b>Senseg</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT__SENSEG = eINSTANCE.getSegment_Senseg();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT__CHILD = eINSTANCE.getSegment_Child();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT__PARENT = eINSTANCE.getSegment_Parent();

        /**
         * The meta object literal for the '<em><b>Exit</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT__EXIT = eINSTANCE.getSegment_Exit();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl <em>Segment Complex</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSegmentComplex()
         * @generated
         */
        EClass SEGMENT_COMPLEX = eINSTANCE.getSegmentComplex();

        /**
         * The meta object literal for the '<em><b>Delete Flag</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT_COMPLEX__DELETE_FLAG = eINSTANCE.getSegmentComplex_DeleteFlag();

        /**
         * The meta object literal for the '<em><b>Insert Flag</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT_COMPLEX__INSERT_FLAG = eINSTANCE.getSegmentComplex_InsertFlag();

        /**
         * The meta object literal for the '<em><b>Replace Flag</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT_COMPLEX__REPLACE_FLAG = eINSTANCE.getSegmentComplex_ReplaceFlag();

        /**
         * The meta object literal for the '<em><b>Segm Pointer</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT_COMPLEX__SEGM_POINTER = eINSTANCE.getSegmentComplex_SegmPointer();

        /**
         * The meta object literal for the '<em><b>Ds Group</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT_COMPLEX__DS_GROUP = eINSTANCE.getSegmentComplex_DsGroup();

        /**
         * The meta object literal for the '<em><b>Secondary Index</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference SEGMENT_COMPLEX__SECONDARY_INDEX = eINSTANCE.getSegmentComplex_SecondaryIndex();

        /**
         * The meta object literal for the '<em><b>Lchild</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT_COMPLEX__LCHILD = eINSTANCE.getSegmentComplex_Lchild();

        /**
         * The meta object literal for the '<em><b>Sourced Index</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT_COMPLEX__SOURCED_INDEX = eINSTANCE.getSegmentComplex_SourcedIndex();

        /**
         * The meta object literal for the '<em><b>Lparent</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT_COMPLEX__LPARENT = eINSTANCE.getSegmentComplex_Lparent();

        /**
         * The meta object literal for the '<em><b>Paired LCHILD</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT_COMPLEX__PAIRED_LCHILD = eINSTANCE.getSegmentComplex_PairedLCHILD();

        /**
         * The meta object literal for the '<em><b>Dataset</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT_COMPLEX__DATASET = eINSTANCE.getSegmentComplex_Dataset();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentLogicalImpl <em>Segment Logical</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.SegmentLogicalImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSegmentLogical()
         * @generated
         */
        EClass SEGMENT_LOGICAL = eINSTANCE.getSegmentLogical();

        /**
         * The meta object literal for the '<em><b>Key Data1</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT_LOGICAL__KEY_DATA1 = eINSTANCE.getSegmentLogical_KeyData1();

        /**
         * The meta object literal for the '<em><b>Key Data2</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEGMENT_LOGICAL__KEY_DATA2 = eINSTANCE.getSegmentLogical_KeyData2();

        /**
         * The meta object literal for the '<em><b>Physical</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT_LOGICAL__PHYSICAL = eINSTANCE.getSegmentLogical_Physical();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.FieldImpl <em>Field</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.FieldImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getField()
         * @generated
         */
        EClass FIELD = eINSTANCE.getField();

        /**
         * The meta object literal for the '<em><b>Sequence Field</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIELD__SEQUENCE_FIELD = eINSTANCE.getField_SequenceField();

        /**
         * The meta object literal for the '<em><b>Unique Sequence</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIELD__UNIQUE_SEQUENCE = eINSTANCE.getField_UniqueSequence();

        /**
         * The meta object literal for the '<em><b>Field Length</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIELD__FIELD_LENGTH = eINSTANCE.getField_FieldLength();

        /**
         * The meta object literal for the '<em><b>Generated</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIELD__GENERATED = eINSTANCE.getField_Generated();

        /**
         * The meta object literal for the '<em><b>Search Index</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference FIELD__SEARCH_INDEX = eINSTANCE.getField_SearchIndex();

        /**
         * The meta object literal for the '<em><b>Ddata Index</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference FIELD__DDATA_INDEX = eINSTANCE.getField_DdataIndex();

        /**
         * The meta object literal for the '<em><b>Subseq Index</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference FIELD__SUBSEQ_INDEX = eINSTANCE.getField_SubseqIndex();

        /**
         * The meta object literal for the '<em><b>Sen Field</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference FIELD__SEN_FIELD = eINSTANCE.getField_SenField();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl
         * <em>Dataset</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getDataset()
         * @generated
         */
        EClass DATASET = eINSTANCE.getDataset();

        /**
         * The meta object literal for the '<em><b>Dd1name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__DD1NAME = eINSTANCE.getDataset_Dd1name();

        /**
         * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__DEVICE = eINSTANCE.getDataset_Device();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__MODEL = eINSTANCE.getDataset_Model();

        /**
         * The meta object literal for the '<em><b>Dd2name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__DD2NAME = eINSTANCE.getDataset_Dd2name();

        /**
         * The meta object literal for the '<em><b>Size1</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__SIZE1 = eINSTANCE.getDataset_Size1();

        /**
         * The meta object literal for the '<em><b>Size2</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__SIZE2 = eINSTANCE.getDataset_Size2();

        /**
         * The meta object literal for the '<em><b>Record Length1</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__RECORD_LENGTH1 = eINSTANCE.getDataset_RecordLength1();

        /**
         * The meta object literal for the '<em><b>Record Length2</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__RECORD_LENGTH2 = eINSTANCE.getDataset_RecordLength2();

        /**
         * The meta object literal for the '<em><b>Blocking Factor1</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__BLOCKING_FACTOR1 = eINSTANCE.getDataset_BlockingFactor1();

        /**
         * The meta object literal for the '<em><b>Blocking Factor2</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__BLOCKING_FACTOR2 = eINSTANCE.getDataset_BlockingFactor2();

        /**
         * The meta object literal for the '<em><b>Dataset Label</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__DATASET_LABEL = eINSTANCE.getDataset_DatasetLabel();

        /**
         * The meta object literal for the '<em><b>Free Block Frequency</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__FREE_BLOCK_FREQUENCY = eINSTANCE.getDataset_FreeBlockFrequency();

        /**
         * The meta object literal for the '
         * <em><b>Free Space Percentage</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute DATASET__FREE_SPACE_PERCENTAGE = eINSTANCE.getDataset_FreeSpacePercentage();

        /**
         * The meta object literal for the '<em><b>Record Format</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__RECORD_FORMAT = eINSTANCE.getDataset_RecordFormat();

        /**
         * The meta object literal for the '<em><b>Scan Cylinders</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__SCAN_CYLINDERS = eINSTANCE.getDataset_ScanCylinders();

        /**
         * The meta object literal for the '<em><b>Search Algorithm</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__SEARCH_ALGORITHM = eINSTANCE.getDataset_SearchAlgorithm();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__ROOT = eINSTANCE.getDataset_Root();

        /**
         * The meta object literal for the '<em><b>Root Overflow</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__ROOT_OVERFLOW = eINSTANCE.getDataset_RootOverflow();

        /**
         * The meta object literal for the '<em><b>Uow</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__UOW = eINSTANCE.getDataset_Uow();

        /**
         * The meta object literal for the '<em><b>Uow Overflow</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATASET__UOW_OVERFLOW = eINSTANCE.getDataset_UowOverflow();

        /**
         * The meta object literal for the '<em><b>Dbd</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DATASET__DBD = eINSTANCE.getDataset_Dbd();

        /**
         * The meta object literal for the '<em><b>Segment</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DATASET__SEGMENT = eINSTANCE.getDataset_Segment();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.SenSegmentImpl <em>Sen Segment</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.SenSegmentImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSenSegment()
         * @generated
         */
        EClass SEN_SEGMENT = eINSTANCE.getSenSegment();

        /**
         * The meta object literal for the '<em><b>Procopt SENSEG</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEN_SEGMENT__PROCOPT_SENSEG = eINSTANCE.getSenSegment_ProcoptSENSEG();

        /**
         * The meta object literal for the '<em><b>Subset Pointers</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEN_SEGMENT__SUBSET_POINTERS = eINSTANCE.getSenSegment_SubsetPointers();

        /**
         * The meta object literal for the '<em><b>Pcb</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEN_SEGMENT__PCB = eINSTANCE.getSenSegment_Pcb();

        /**
         * The meta object literal for the '<em><b>Sen Field</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference SEN_SEGMENT__SEN_FIELD = eINSTANCE.getSenSegment_SenField();

        /**
         * The meta object literal for the '<em><b>Segment</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEN_SEGMENT__SEGMENT = eINSTANCE.getSenSegment_Segment();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.imsdatabase.impl.SenFieldImpl
         * <em>Sen Field</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.imsdatabase.impl.SenFieldImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSenField()
         * @generated
         */
        EClass SEN_FIELD = eINSTANCE.getSenField();

        /**
         * The meta object literal for the '<em><b>Replace</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEN_FIELD__REPLACE = eINSTANCE.getSenField_Replace();

        /**
         * The meta object literal for the '<em><b>Sen Segment</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference SEN_FIELD__SEN_SEGMENT = eINSTANCE.getSenField_SenSegment();

        /**
         * The meta object literal for the '<em><b>Field</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEN_FIELD__FIELD = eINSTANCE.getSenField_Field();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.imsdatabase.impl.ACBLIBImpl
         * <em>ACBLIB</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.imsdatabase.impl.ACBLIBImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getACBLIB()
         * @generated
         */
        EClass ACBLIB = eINSTANCE.getACBLIB();

        /**
         * The meta object literal for the '<em><b>Psb</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference ACBLIB__PSB = eINSTANCE.getACBLIB_Psb();

        /**
         * The meta object literal for the '<em><b>Dbd</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference ACBLIB__DBD = eINSTANCE.getACBLIB_Dbd();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.AccessMethodImpl <em>Access Method</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.AccessMethodImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getAccessMethod()
         * @generated
         */
        EClass ACCESS_METHOD = eINSTANCE.getAccessMethod();

        /**
         * The meta object literal for the '<em><b>Dbd</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference ACCESS_METHOD__DBD = eINSTANCE.getAccessMethod_Dbd();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl <em>INDEX</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getINDEX()
         * @generated
         */
        EClass INDEX = eINSTANCE.getINDEX();

        /**
         * The meta object literal for the '<em><b>Dos Compatibility</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INDEX__DOS_COMPATIBILITY = eINSTANCE.getINDEX_DosCompatibility();

        /**
         * The meta object literal for the '<em><b>Protect</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INDEX__PROTECT = eINSTANCE.getINDEX_Protect();

        /**
         * The meta object literal for the '<em><b>Primary Target</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INDEX__PRIMARY_TARGET = eINSTANCE.getINDEX_PrimaryTarget();

        /**
         * The meta object literal for the '<em><b>Secondary Target</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INDEX__SECONDARY_TARGET = eINSTANCE.getINDEX_SecondaryTarget();

        /**
         * The meta object literal for the '<em><b>Sharing Index</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INDEX__SHARING_INDEX = eINSTANCE.getINDEX_SharingIndex();

        /**
         * The meta object literal for the '<em><b>Shared Index</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INDEX__SHARED_INDEX = eINSTANCE.getINDEX_SharedIndex();

        /**
         * The meta object literal for the '<em><b>Sequenced PCB</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INDEX__SEQUENCED_PCB = eINSTANCE.getINDEX_SequencedPCB();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.HIDAMImpl <em>HIDAM</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.HIDAMImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getHIDAM()
         * @generated
         */
        EClass HIDAM = eINSTANCE.getHIDAM();

        /**
         * The meta object literal for the '<em><b>Index</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference HIDAM__INDEX = eINSTANCE.getHIDAM_Index();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.DEDBImpl <em>DEDB</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.DEDBImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getDEDB()
         * @generated
         */
        EClass DEDB = eINSTANCE.getDEDB();

        /**
         * The meta object literal for the '<em><b>Rm Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEDB__RM_NAME = eINSTANCE.getDEDB_RmName();

        /**
         * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEDB__STAGE = eINSTANCE.getDEDB_Stage();

        /**
         * The meta object literal for the '<em><b>Extended Call</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEDB__EXTENDED_CALL = eINSTANCE.getDEDB_ExtendedCall();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.HDAMImpl <em>HDAM</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.HDAMImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getHDAM()
         * @generated
         */
        EClass HDAM = eINSTANCE.getHDAM();

        /**
         * The meta object literal for the '<em><b>Rm Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDAM__RM_NAME = eINSTANCE.getHDAM_RmName();

        /**
         * The meta object literal for the '
         * <em><b>Relative Block Number</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute HDAM__RELATIVE_BLOCK_NUMBER = eINSTANCE.getHDAM_RelativeBlockNumber();

        /**
         * The meta object literal for the '<em><b>Root Anchor Points</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDAM__ROOT_ANCHOR_POINTS = eINSTANCE.getHDAM_RootAnchorPoints();

        /**
         * The meta object literal for the '<em><b>Root Max Bytes</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDAM__ROOT_MAX_BYTES = eINSTANCE.getHDAM_RootMaxBytes();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.MSDBImpl <em>MSDB</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.MSDBImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getMSDB()
         * @generated
         */
        EClass MSDB = eINSTANCE.getMSDB();

        /**
         * The meta object literal for the '<em><b>Msdb Field</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute MSDB__MSDB_FIELD = eINSTANCE.getMSDB_MsdbField();

        /**
         * The meta object literal for the '<em><b>Msdb Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute MSDB__MSDB_TYPE = eINSTANCE.getMSDB_MsdbType();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl <em>Secondary Index</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getSecondaryIndex()
         * @generated
         */
        EClass SECONDARY_INDEX = eINSTANCE.getSecondaryIndex();

        /**
         * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SECONDARY_INDEX__CONSTANT = eINSTANCE.getSecondaryIndex_Constant();

        /**
         * The meta object literal for the '<em><b>Exit Routine</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SECONDARY_INDEX__EXIT_ROUTINE = eINSTANCE.getSecondaryIndex_ExitRoutine();

        /**
         * The meta object literal for the '<em><b>Null Value</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SECONDARY_INDEX__NULL_VALUE = eINSTANCE.getSecondaryIndex_NullValue();

        /**
         * The meta object literal for the '<em><b>Index</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SECONDARY_INDEX__INDEX = eINSTANCE.getSecondaryIndex_Index();

        /**
         * The meta object literal for the '<em><b>Segment</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SECONDARY_INDEX__SEGMENT = eINSTANCE.getSecondaryIndex_Segment();

        /**
         * The meta object literal for the '<em><b>Search Fields</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SECONDARY_INDEX__SEARCH_FIELDS = eINSTANCE.getSecondaryIndex_SearchFields();

        /**
         * The meta object literal for the '<em><b>Ddata Fields</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SECONDARY_INDEX__DDATA_FIELDS = eINSTANCE.getSecondaryIndex_DdataFields();

        /**
         * The meta object literal for the '<em><b>Subseq Fields</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SECONDARY_INDEX__SUBSEQ_FIELDS = eINSTANCE.getSecondaryIndex_SubseqFields();

        /**
         * The meta object literal for the '<em><b>Index Source</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SECONDARY_INDEX__INDEX_SOURCE = eINSTANCE.getSecondaryIndex_IndexSource();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl <em>Exit</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.imsdatabase.impl.ExitImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getExit()
         * @generated
         */
        EClass EXIT = eINSTANCE.getExit();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXIT__KEY = eINSTANCE.getExit_Key();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXIT__DATA = eINSTANCE.getExit_Data();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXIT__PATH = eINSTANCE.getExit_Path();

        /**
         * The meta object literal for the '<em><b>Log</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXIT__LOG = eINSTANCE.getExit_Log();

        /**
         * The meta object literal for the '<em><b>Cascade</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXIT__CASCADE = eINSTANCE.getExit_Cascade();

        /**
         * The meta object literal for the '<em><b>Cascade Key</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXIT__CASCADE_KEY = eINSTANCE.getExit_CascadeKey();

        /**
         * The meta object literal for the '<em><b>Cascade Data</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXIT__CASCADE_DATA = eINSTANCE.getExit_CascadeData();

        /**
         * The meta object literal for the '<em><b>Cascade Path</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXIT__CASCADE_PATH = eINSTANCE.getExit_CascadePath();

        /**
         * The meta object literal for the '<em><b>Dbd</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference EXIT__DBD = eINSTANCE.getExit_Dbd();

        /**
         * The meta object literal for the '<em><b>Segment</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference EXIT__SEGMENT = eINSTANCE.getExit_Segment();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl
         * <em>LCHILD</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getLCHILD()
         * @generated
         */
        EClass LCHILD = eINSTANCE.getLCHILD();

        /**
         * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute LCHILD__COUNTER = eINSTANCE.getLCHILD_Counter();

        /**
         * The meta object literal for the '<em><b>Lc Pointer</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute LCHILD__LC_POINTER = eINSTANCE.getLCHILD_LcPointer();

        /**
         * The meta object literal for the '<em><b>Lparent Flag</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute LCHILD__LPARENT_FLAG = eINSTANCE.getLCHILD_LparentFlag();

        /**
         * The meta object literal for the '<em><b>Ltwin</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute LCHILD__LTWIN = eINSTANCE.getLCHILD_Ltwin();

        /**
         * The meta object literal for the '<em><b>Rules</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute LCHILD__RULES = eINSTANCE.getLCHILD_Rules();

        /**
         * The meta object literal for the '<em><b>Virtual Parent</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute LCHILD__VIRTUAL_PARENT = eINSTANCE.getLCHILD_VirtualParent();

        /**
         * The meta object literal for the '<em><b>Lparent</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference LCHILD__LPARENT = eINSTANCE.getLCHILD_Lparent();

        /**
         * The meta object literal for the '<em><b>Lchild</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference LCHILD__LCHILD = eINSTANCE.getLCHILD_Lchild();

        /**
         * The meta object literal for the '<em><b>Paired Segment</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference LCHILD__PAIRED_SEGMENT = eINSTANCE.getLCHILD_PairedSegment();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.imsdatabase.impl.PSBLibImpl
         * <em>PSB Lib</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.imsdatabase.impl.PSBLibImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getPSBLib()
         * @generated
         */
        EClass PSB_LIB = eINSTANCE.getPSBLib();

        /**
         * The meta object literal for the '<em><b>Psb</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference PSB_LIB__PSB = eINSTANCE.getPSBLib_Psb();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.imsdatabase.impl.DBDLibImpl
         * <em>DBD Lib</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.imsdatabase.impl.DBDLibImpl
         * @see orgomg.cwmx.resource.imsdatabase.impl.ImsdatabasePackageImpl#getDBDLib()
         * @generated
         */
        EClass DBD_LIB = eINSTANCE.getDBDLib();

        /**
         * The meta object literal for the '<em><b>Dbd</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DBD_LIB__DBD = eINSTANCE.getDBDLib_Dbd();

    }

} // ImsdatabasePackage
