/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.foundation.keysindexes.KeysindexesPackage;
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
 * <!-- end-user-doc --> <!-- begin-model-doc --> The concepts and ideas
 * implicit in the definition of the COBOL language?s DATA DIVISION were one of
 * the earliest (if not the first) formalizations of the ubiquitous record
 * model. A COBOL program contains much more than just record descriptions.
 * 
 * However, because neither CWM nor UML attempt to describe programming
 * languages directly, only the DATA DIVISION is described here. The model
 * presented here is compliant to the COBOL 85 language standard [COBOL].
 * 
 * The primary purpose of the COBOL DATA DIVISION metamodel extension package in
 * CWM is to allow the structure of DATA DIVISIONs to be captured so that their
 * usage of other model elements (such as RecordDefs and Fields) can be modeled.
 * This allows definition of files and databases created by COBOL programs as
 * well as direct support for tools that attempt to track the lineage and
 * determine the impact of proposed changes to COBOL application programs. The
 * metamodel does not, however, provide sufficient structure to support tools
 * that want to capture the structure of a DATA DIVISION source into a CWM
 * repository and then be able to faithfully reproduce the source on demand.
 * 
 * The COBOL DATA DIVISION metamodel extension also serves as an example of the
 * use of the CWM Record metamodel. The CWM Record package is intended as a
 * foundation upon which many record-oriented programming languages can be
 * described. The COBOL Data Division extension package is provided as example
 * demonstrating appropriate usage of CWM and UML classes in modeling the data
 * structure representation parts of this and similar programming language
 * environments.
 * 
 * The COBOL Data Division package depends on the following packages:
 * 
 * org.omg::CWM::ObjectModel::Core org.omg::CWM::Foundation::KeysIndexes
 * 
 * OCL Representation of COBOLData Constraints
 * 
 * [C-1] The presence of a padding character can be indicated either by a
 * constant (in the padLiteral attribute) or by a reference to another field via
 * the padField reference but not by both. context COBOLFD inv: self.padLiteral
 * <> "" implies self.padField->isEmpty
 * 
 * [C-2] Level 77 fields must be owned by the Working Storage or the Linkage
 * sections and may not have children. context COBOLField inv: self.level = 77
 * implies (self.classifier.oclIsKindOf(WorkingStorageSection) or
 * self.classifier.oclIsKindOf(LinkageSection) and self.type.feature->isEmpty
 * 
 * [C-3] Field level must be 01 to 49, 77. context COBOLField inv: (self.level
 * >= 1 and self.level <= 49) or self.level = 77
 * 
 * [C-4] A COBOLField can only be redefined by fields at the same level. context
 * COBOLField inv: self.redefinedByField->NotEmpty implies self.level =
 * self.redefinedByField.level
 * 
 * [C-5] The RecordDef instances defined within each COBOLFD in a FileSection
 * instance must belong to the FileSection instance. context FileSection inv:
 * self.cobolFD.record->exists(p | p = self.record)
 * 
 * [C-6] LinageInfo must either have a value or reference a COBOLItem, but not
 * both. context LinageInfo inv: self.value->isEmpty implies not
 * self.cobolItem->isEmpty <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.coboldata.CoboldataFactory
 * @model kind="package"
 * @generated
 */
public interface CoboldataPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "coboldata";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///orgomg/cwmx/resource/coboldata.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "orgomg.cwmx.resource.coboldata";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    CoboldataPackage eINSTANCE = orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl.init();

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl <em>COBOLFD</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getCOBOLFD()
     * @generated
     */
    int COBOLFD = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__NAME = CorePackage.CLASS__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__VISIBILITY = CorePackage.CLASS__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__SUPPLIER_DEPENDENCY = CorePackage.CLASS__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__NAMESPACE = CorePackage.CLASS__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__IMPORTER = CorePackage.CLASS__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__STEREOTYPE = CorePackage.CLASS__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__DOCUMENT = CorePackage.CLASS__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__DESCRIPTION = CorePackage.CLASS__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__RESPONSIBLE_PARTY = CorePackage.CLASS__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__ELEMENT_NODE = CorePackage.CLASS__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__SET = CorePackage.CLASS__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__RENDERED_OBJECT = CorePackage.CLASS__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__VOCABULARY_ELEMENT = CorePackage.CLASS__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__MEASUREMENT = CorePackage.CLASS__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__CHANGE_REQUEST = CorePackage.CLASS__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__DASDL_PROPERTY = CorePackage.CLASS__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__FEATURE = CorePackage.CLASS__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__STRUCTURAL_FEATURE = CorePackage.CLASS__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__PARAMETER = CorePackage.CLASS__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__GENERALIZATION = CorePackage.CLASS__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__SPECIALIZATION = CorePackage.CLASS__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__INSTANCE = CorePackage.CLASS__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__ALIAS = CorePackage.CLASS__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__EXPRESSION_NODE = CorePackage.CLASS__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__MAPPING_FROM = CorePackage.CLASS__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__MAPPING_TO = CorePackage.CLASS__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__CLASSIFIER_MAP = CorePackage.CLASS__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__CF_MAP = CorePackage.CLASS__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__DOMAIN = CorePackage.CLASS__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__SIMPLE_DIMENSION = CorePackage.CLASS__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__INDEX = CorePackage.CLASS__INDEX;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__IMPORTED_ELEMENT = CorePackage.CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__DATA_MANAGER = CorePackage.CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Self Describing</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__IS_SELF_DESCRIBING = CorePackage.CLASS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Record Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__RECORD_DELIMITER = CorePackage.CLASS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Skip Records</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__SKIP_RECORDS = CorePackage.CLASS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Record</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__RECORD = CorePackage.CLASS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Organization</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__ORGANIZATION = CorePackage.CLASS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Access Mode</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__ACCESS_MODE = CorePackage.CLASS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Is Optional</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__IS_OPTIONAL = CorePackage.CLASS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Reserve Areas</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__RESERVE_AREAS = CorePackage.CLASS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Assign To</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__ASSIGN_TO = CorePackage.CLASS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Code Set Lit</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__CODE_SET_LIT = CorePackage.CLASS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Block Size Unit</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__BLOCK_SIZE_UNIT = CorePackage.CLASS_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Min Blocks</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__MIN_BLOCKS = CorePackage.CLASS_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Max Blocks</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__MAX_BLOCKS = CorePackage.CLASS_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Min Records</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__MIN_RECORDS = CorePackage.CLASS_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Max Records</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__MAX_RECORDS = CorePackage.CLASS_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Label Kind</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__LABEL_KIND = CorePackage.CLASS_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Is External</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__IS_EXTERNAL = CorePackage.CLASS_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Is Global</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__IS_GLOBAL = CorePackage.CLASS_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Pad Literal</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__PAD_LITERAL = CorePackage.CLASS_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Status ID</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__STATUS_ID = CorePackage.CLASS_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Linage Info</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__LINAGE_INFO = CorePackage.CLASS_FEATURE_COUNT + 22;

    /**
     * The feature id for the '<em><b>File Section</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD__FILE_SECTION = CorePackage.CLASS_FEATURE_COUNT + 23;

    /**
     * The feature id for the '<em><b>Depends On</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__DEPENDS_ON = CorePackage.CLASS_FEATURE_COUNT + 24;

    /**
     * The feature id for the '<em><b>Pad Field</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__PAD_FIELD = CorePackage.CLASS_FEATURE_COUNT + 25;

    /**
     * The feature id for the '<em><b>Relative Field</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD__RELATIVE_FIELD = CorePackage.CLASS_FEATURE_COUNT + 26;

    /**
     * The number of structural features of the '<em>COBOLFD</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 27;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.coboldata.impl.COBOLItemImpl
     * <em>COBOL Item</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.coboldata.impl.COBOLItemImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getCOBOLItem()
     * @generated
     */
    int COBOL_ITEM = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__NAME = RecordPackage.FIELD__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__VISIBILITY = RecordPackage.FIELD__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__CLIENT_DEPENDENCY = RecordPackage.FIELD__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__SUPPLIER_DEPENDENCY = RecordPackage.FIELD__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__CONSTRAINT = RecordPackage.FIELD__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__NAMESPACE = RecordPackage.FIELD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__IMPORTER = RecordPackage.FIELD__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__STEREOTYPE = RecordPackage.FIELD__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__TAGGED_VALUE = RecordPackage.FIELD__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__DOCUMENT = RecordPackage.FIELD__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__DESCRIPTION = RecordPackage.FIELD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__RESPONSIBLE_PARTY = RecordPackage.FIELD__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__ELEMENT_NODE = RecordPackage.FIELD__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__SET = RecordPackage.FIELD__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__RENDERED_OBJECT = RecordPackage.FIELD__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__VOCABULARY_ELEMENT = RecordPackage.FIELD__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__MEASUREMENT = RecordPackage.FIELD__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__CHANGE_REQUEST = RecordPackage.FIELD__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__DASDL_PROPERTY = RecordPackage.FIELD__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__OWNER_SCOPE = RecordPackage.FIELD__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__OWNER = RecordPackage.FIELD__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__FEATURE_NODE = RecordPackage.FIELD__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__FEATURE_MAP = RecordPackage.FIELD__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__CF_MAP = RecordPackage.FIELD__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__CHANGEABILITY = RecordPackage.FIELD__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__MULTIPLICITY = RecordPackage.FIELD__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__ORDERING = RecordPackage.FIELD__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__TARGET_SCOPE = RecordPackage.FIELD__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__TYPE = RecordPackage.FIELD__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__SLOT = RecordPackage.FIELD__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__DISCRIMINATED_UNION = RecordPackage.FIELD__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__INDEXED_FEATURE = RecordPackage.FIELD__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__KEY_RELATIONSHIP = RecordPackage.FIELD__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__UNIQUE_KEY = RecordPackage.FIELD__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__DATA_ITEM = RecordPackage.FIELD__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__REMAP = RecordPackage.FIELD__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__INITIAL_VALUE = RecordPackage.FIELD__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__LENGTH = RecordPackage.FIELD__LENGTH;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__PRECISION = RecordPackage.FIELD__PRECISION;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__SCALE = RecordPackage.FIELD__SCALE;

    /**
     * The feature id for the '<em><b>Occurring Field</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__OCCURRING_FIELD = RecordPackage.FIELD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Status FD</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__STATUS_FD = RecordPackage.FIELD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Linage Info</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__LINAGE_INFO = RecordPackage.FIELD_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Depending FD</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM__DEPENDING_FD = RecordPackage.FIELD_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Padded FD</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__PADDED_FD = RecordPackage.FIELD_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Relative FD</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_ITEM__RELATIVE_FD = RecordPackage.FIELD_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>COBOL Item</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_ITEM_FEATURE_COUNT = RecordPackage.FIELD_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl
     * <em>COBOL Field</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getCOBOLField()
     * @generated
     */
    int COBOL_FIELD = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__NAME = COBOL_ITEM__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__VISIBILITY = COBOL_ITEM__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__CLIENT_DEPENDENCY = COBOL_ITEM__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__SUPPLIER_DEPENDENCY = COBOL_ITEM__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__CONSTRAINT = COBOL_ITEM__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__NAMESPACE = COBOL_ITEM__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__IMPORTER = COBOL_ITEM__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__STEREOTYPE = COBOL_ITEM__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__TAGGED_VALUE = COBOL_ITEM__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__DOCUMENT = COBOL_ITEM__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__DESCRIPTION = COBOL_ITEM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__RESPONSIBLE_PARTY = COBOL_ITEM__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__ELEMENT_NODE = COBOL_ITEM__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__SET = COBOL_ITEM__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__RENDERED_OBJECT = COBOL_ITEM__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__VOCABULARY_ELEMENT = COBOL_ITEM__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__MEASUREMENT = COBOL_ITEM__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__CHANGE_REQUEST = COBOL_ITEM__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__DASDL_PROPERTY = COBOL_ITEM__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__OWNER_SCOPE = COBOL_ITEM__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__OWNER = COBOL_ITEM__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__FEATURE_NODE = COBOL_ITEM__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__FEATURE_MAP = COBOL_ITEM__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__CF_MAP = COBOL_ITEM__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__CHANGEABILITY = COBOL_ITEM__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__MULTIPLICITY = COBOL_ITEM__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__ORDERING = COBOL_ITEM__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__TARGET_SCOPE = COBOL_ITEM__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__TYPE = COBOL_ITEM__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__SLOT = COBOL_ITEM__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__DISCRIMINATED_UNION = COBOL_ITEM__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__INDEXED_FEATURE = COBOL_ITEM__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__KEY_RELATIONSHIP = COBOL_ITEM__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__UNIQUE_KEY = COBOL_ITEM__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__DATA_ITEM = COBOL_ITEM__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__REMAP = COBOL_ITEM__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__INITIAL_VALUE = COBOL_ITEM__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__LENGTH = COBOL_ITEM__LENGTH;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__PRECISION = COBOL_ITEM__PRECISION;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__SCALE = COBOL_ITEM__SCALE;

    /**
     * The feature id for the '<em><b>Occurring Field</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__OCCURRING_FIELD = COBOL_ITEM__OCCURRING_FIELD;

    /**
     * The feature id for the '<em><b>Status FD</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__STATUS_FD = COBOL_ITEM__STATUS_FD;

    /**
     * The feature id for the '<em><b>Linage Info</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__LINAGE_INFO = COBOL_ITEM__LINAGE_INFO;

    /**
     * The feature id for the '<em><b>Depending FD</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__DEPENDING_FD = COBOL_ITEM__DEPENDING_FD;

    /**
     * The feature id for the '<em><b>Padded FD</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__PADDED_FD = COBOL_ITEM__PADDED_FD;

    /**
     * The feature id for the '<em><b>Relative FD</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__RELATIVE_FD = COBOL_ITEM__RELATIVE_FD;

    /**
     * The feature id for the '<em><b>Level</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__LEVEL = COBOL_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sign Kind</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__SIGN_KIND = COBOL_ITEM_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Filler</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__IS_FILLER = COBOL_ITEM_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is Justified Right</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__IS_JUSTIFIED_RIGHT = COBOL_ITEM_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Blank When Zero</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__IS_BLANK_WHEN_ZERO = COBOL_ITEM_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Is Synchronized</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__IS_SYNCHRONIZED = COBOL_ITEM_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Picture</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__PICTURE = COBOL_ITEM_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Occurs Lower</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__OCCURS_LOWER = COBOL_ITEM_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Occurs Upper</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__OCCURS_UPPER = COBOL_ITEM_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Index Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__INDEX_NAME = COBOL_ITEM_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Is External</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__IS_EXTERNAL = COBOL_ITEM_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Is Global</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__IS_GLOBAL = COBOL_ITEM_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Depending On Field</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__DEPENDING_ON_FIELD = COBOL_ITEM_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Redefined Field</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOL_FIELD__REDEFINED_FIELD = COBOL_ITEM_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Redefined By Field</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__REDEFINED_BY_FIELD = COBOL_ITEM_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Occurs Key Info</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__OCCURS_KEY_INFO = COBOL_ITEM_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Occurs Key Field Info</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__OCCURS_KEY_FIELD_INFO = COBOL_ITEM_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>First Renames</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__FIRST_RENAMES = COBOL_ITEM_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Thru Renames</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD__THRU_RENAMES = COBOL_ITEM_FEATURE_COUNT + 18;

    /**
     * The number of structural features of the '<em>COBOL Field</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOL_FIELD_FEATURE_COUNT = COBOL_ITEM_FEATURE_COUNT + 19;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.impl.RenamesImpl <em>Renames</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.impl.RenamesImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getRenames()
     * @generated
     */
    int RENAMES = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__NAME = COBOL_ITEM__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__VISIBILITY = COBOL_ITEM__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__CLIENT_DEPENDENCY = COBOL_ITEM__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__SUPPLIER_DEPENDENCY = COBOL_ITEM__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__CONSTRAINT = COBOL_ITEM__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__NAMESPACE = COBOL_ITEM__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__IMPORTER = COBOL_ITEM__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__STEREOTYPE = COBOL_ITEM__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__TAGGED_VALUE = COBOL_ITEM__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__DOCUMENT = COBOL_ITEM__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__DESCRIPTION = COBOL_ITEM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__RESPONSIBLE_PARTY = COBOL_ITEM__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__ELEMENT_NODE = COBOL_ITEM__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__SET = COBOL_ITEM__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__RENDERED_OBJECT = COBOL_ITEM__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__VOCABULARY_ELEMENT = COBOL_ITEM__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__MEASUREMENT = COBOL_ITEM__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__CHANGE_REQUEST = COBOL_ITEM__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__DASDL_PROPERTY = COBOL_ITEM__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__OWNER_SCOPE = COBOL_ITEM__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__OWNER = COBOL_ITEM__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__FEATURE_NODE = COBOL_ITEM__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__FEATURE_MAP = COBOL_ITEM__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__CF_MAP = COBOL_ITEM__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__CHANGEABILITY = COBOL_ITEM__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__MULTIPLICITY = COBOL_ITEM__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__ORDERING = COBOL_ITEM__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__TARGET_SCOPE = COBOL_ITEM__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__TYPE = COBOL_ITEM__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__SLOT = COBOL_ITEM__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__DISCRIMINATED_UNION = COBOL_ITEM__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__INDEXED_FEATURE = COBOL_ITEM__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__KEY_RELATIONSHIP = COBOL_ITEM__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__UNIQUE_KEY = COBOL_ITEM__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__DATA_ITEM = COBOL_ITEM__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__REMAP = COBOL_ITEM__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__INITIAL_VALUE = COBOL_ITEM__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__LENGTH = COBOL_ITEM__LENGTH;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__PRECISION = COBOL_ITEM__PRECISION;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__SCALE = COBOL_ITEM__SCALE;

    /**
     * The feature id for the '<em><b>Occurring Field</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__OCCURRING_FIELD = COBOL_ITEM__OCCURRING_FIELD;

    /**
     * The feature id for the '<em><b>Status FD</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__STATUS_FD = COBOL_ITEM__STATUS_FD;

    /**
     * The feature id for the '<em><b>Linage Info</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__LINAGE_INFO = COBOL_ITEM__LINAGE_INFO;

    /**
     * The feature id for the '<em><b>Depending FD</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMES__DEPENDING_FD = COBOL_ITEM__DEPENDING_FD;

    /**
     * The feature id for the '<em><b>Padded FD</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__PADDED_FD = COBOL_ITEM__PADDED_FD;

    /**
     * The feature id for the '<em><b>Relative FD</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__RELATIVE_FD = COBOL_ITEM__RELATIVE_FD;

    /**
     * The feature id for the '<em><b>First Field</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__FIRST_FIELD = COBOL_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Thru Field</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES__THRU_FIELD = COBOL_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Renames</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RENAMES_FEATURE_COUNT = COBOL_ITEM_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.impl.SectionImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getSection()
     * @generated
     */
    int SECTION = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__NAME = CorePackage.CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__VISIBILITY = CorePackage.CLASSIFIER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__CLIENT_DEPENDENCY = CorePackage.CLASSIFIER__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__SUPPLIER_DEPENDENCY = CorePackage.CLASSIFIER__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__CONSTRAINT = CorePackage.CLASSIFIER__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__NAMESPACE = CorePackage.CLASSIFIER__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__IMPORTER = CorePackage.CLASSIFIER__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__STEREOTYPE = CorePackage.CLASSIFIER__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__TAGGED_VALUE = CorePackage.CLASSIFIER__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__DOCUMENT = CorePackage.CLASSIFIER__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__DESCRIPTION = CorePackage.CLASSIFIER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__RESPONSIBLE_PARTY = CorePackage.CLASSIFIER__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__ELEMENT_NODE = CorePackage.CLASSIFIER__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__SET = CorePackage.CLASSIFIER__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__RENDERED_OBJECT = CorePackage.CLASSIFIER__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__VOCABULARY_ELEMENT = CorePackage.CLASSIFIER__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__MEASUREMENT = CorePackage.CLASSIFIER__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__CHANGE_REQUEST = CorePackage.CLASSIFIER__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__DASDL_PROPERTY = CorePackage.CLASSIFIER__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__OWNED_ELEMENT = CorePackage.CLASSIFIER__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__IS_ABSTRACT = CorePackage.CLASSIFIER__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__FEATURE = CorePackage.CLASSIFIER__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__STRUCTURAL_FEATURE = CorePackage.CLASSIFIER__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__PARAMETER = CorePackage.CLASSIFIER__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__GENERALIZATION = CorePackage.CLASSIFIER__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__SPECIALIZATION = CorePackage.CLASSIFIER__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__INSTANCE = CorePackage.CLASSIFIER__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__ALIAS = CorePackage.CLASSIFIER__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__EXPRESSION_NODE = CorePackage.CLASSIFIER__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__MAPPING_FROM = CorePackage.CLASSIFIER__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__MAPPING_TO = CorePackage.CLASSIFIER__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__CLASSIFIER_MAP = CorePackage.CLASSIFIER__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__CF_MAP = CorePackage.CLASSIFIER__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__DOMAIN = CorePackage.CLASSIFIER__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SECTION__SIMPLE_DIMENSION = CorePackage.CLASSIFIER__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Record</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION__RECORD = CorePackage.CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Section</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SECTION_FEATURE_COUNT = CorePackage.CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.impl.WorkingStorageSectionImpl <em>Working Storage Section</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.impl.WorkingStorageSectionImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getWorkingStorageSection()
     * @generated
     */
    int WORKING_STORAGE_SECTION = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__NAME = SECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__VISIBILITY = SECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__CLIENT_DEPENDENCY = SECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__SUPPLIER_DEPENDENCY = SECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__CONSTRAINT = SECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__NAMESPACE = SECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__IMPORTER = SECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__STEREOTYPE = SECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__TAGGED_VALUE = SECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__DOCUMENT = SECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__DESCRIPTION = SECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__RESPONSIBLE_PARTY = SECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__ELEMENT_NODE = SECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__SET = SECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__RENDERED_OBJECT = SECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__VOCABULARY_ELEMENT = SECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__MEASUREMENT = SECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__CHANGE_REQUEST = SECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__DASDL_PROPERTY = SECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__OWNED_ELEMENT = SECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__IS_ABSTRACT = SECTION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__FEATURE = SECTION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__STRUCTURAL_FEATURE = SECTION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__PARAMETER = SECTION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__GENERALIZATION = SECTION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__SPECIALIZATION = SECTION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__INSTANCE = SECTION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__ALIAS = SECTION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__EXPRESSION_NODE = SECTION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__MAPPING_FROM = SECTION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__MAPPING_TO = SECTION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__CLASSIFIER_MAP = SECTION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__CF_MAP = SECTION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__DOMAIN = SECTION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__SIMPLE_DIMENSION = SECTION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Record</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION__RECORD = SECTION__RECORD;

    /**
     * The number of structural features of the '<em>Working Storage Section</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKING_STORAGE_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.coboldata.impl.FileSectionImpl
     * <em>File Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.coboldata.impl.FileSectionImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getFileSection()
     * @generated
     */
    int FILE_SECTION = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__NAME = SECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__VISIBILITY = SECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__CLIENT_DEPENDENCY = SECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__SUPPLIER_DEPENDENCY = SECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__CONSTRAINT = SECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__NAMESPACE = SECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__IMPORTER = SECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__STEREOTYPE = SECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__TAGGED_VALUE = SECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__DOCUMENT = SECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__DESCRIPTION = SECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__RESPONSIBLE_PARTY = SECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__ELEMENT_NODE = SECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__SET = SECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__RENDERED_OBJECT = SECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__VOCABULARY_ELEMENT = SECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__MEASUREMENT = SECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__CHANGE_REQUEST = SECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__DASDL_PROPERTY = SECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__OWNED_ELEMENT = SECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__IS_ABSTRACT = SECTION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__FEATURE = SECTION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__STRUCTURAL_FEATURE = SECTION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__PARAMETER = SECTION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__GENERALIZATION = SECTION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__SPECIALIZATION = SECTION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__INSTANCE = SECTION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__ALIAS = SECTION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__EXPRESSION_NODE = SECTION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__MAPPING_FROM = SECTION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__MAPPING_TO = SECTION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__CLASSIFIER_MAP = SECTION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__CF_MAP = SECTION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__DOMAIN = SECTION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__SIMPLE_DIMENSION = SECTION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Record</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FILE_SECTION__RECORD = SECTION__RECORD;

    /**
     * The feature id for the '<em><b>Cobol FD</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION__COBOL_FD = SECTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>File Section</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.impl.ReportWriterSectionImpl <em>Report Writer Section</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.impl.ReportWriterSectionImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getReportWriterSection()
     * @generated
     */
    int REPORT_WRITER_SECTION = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__NAME = SECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__VISIBILITY = SECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__CLIENT_DEPENDENCY = SECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__SUPPLIER_DEPENDENCY = SECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__CONSTRAINT = SECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__NAMESPACE = SECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__IMPORTER = SECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__STEREOTYPE = SECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__TAGGED_VALUE = SECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__DOCUMENT = SECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__DESCRIPTION = SECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__RESPONSIBLE_PARTY = SECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__ELEMENT_NODE = SECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__SET = SECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__RENDERED_OBJECT = SECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__VOCABULARY_ELEMENT = SECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__MEASUREMENT = SECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__CHANGE_REQUEST = SECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__DASDL_PROPERTY = SECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__OWNED_ELEMENT = SECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__IS_ABSTRACT = SECTION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__FEATURE = SECTION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__STRUCTURAL_FEATURE = SECTION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__PARAMETER = SECTION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__GENERALIZATION = SECTION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__SPECIALIZATION = SECTION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__INSTANCE = SECTION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__ALIAS = SECTION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__EXPRESSION_NODE = SECTION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__MAPPING_FROM = SECTION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__MAPPING_TO = SECTION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__CLASSIFIER_MAP = SECTION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__CF_MAP = SECTION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__DOMAIN = SECTION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__SIMPLE_DIMENSION = SECTION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Record</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION__RECORD = SECTION__RECORD;

    /**
     * The number of structural features of the '<em>Report Writer Section</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_WRITER_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.impl.LinkageSectionImpl <em>Linkage Section</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.impl.LinkageSectionImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getLinkageSection()
     * @generated
     */
    int LINKAGE_SECTION = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__NAME = SECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__VISIBILITY = SECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__CLIENT_DEPENDENCY = SECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__SUPPLIER_DEPENDENCY = SECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__CONSTRAINT = SECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__NAMESPACE = SECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__IMPORTER = SECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__STEREOTYPE = SECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__TAGGED_VALUE = SECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__DOCUMENT = SECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__DESCRIPTION = SECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__RESPONSIBLE_PARTY = SECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__ELEMENT_NODE = SECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__SET = SECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__RENDERED_OBJECT = SECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__VOCABULARY_ELEMENT = SECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__MEASUREMENT = SECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__CHANGE_REQUEST = SECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__DASDL_PROPERTY = SECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__OWNED_ELEMENT = SECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__IS_ABSTRACT = SECTION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__FEATURE = SECTION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__STRUCTURAL_FEATURE = SECTION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__PARAMETER = SECTION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__GENERALIZATION = SECTION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__SPECIALIZATION = SECTION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__INSTANCE = SECTION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__ALIAS = SECTION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__EXPRESSION_NODE = SECTION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__MAPPING_FROM = SECTION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__MAPPING_TO = SECTION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__CLASSIFIER_MAP = SECTION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__CF_MAP = SECTION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__DOMAIN = SECTION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__SIMPLE_DIMENSION = SECTION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Record</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION__RECORD = SECTION__RECORD;

    /**
     * The number of structural features of the '<em>Linkage Section</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKAGE_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.coboldata.impl.OccursKeyImpl
     * <em>Occurs Key</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.coboldata.impl.OccursKeyImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getOccursKey()
     * @generated
     */
    int OCCURS_KEY = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Is Ascending</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__IS_ASCENDING = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Occurs Key Of</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY__OCCURS_KEY_OF = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Occurs Key Field</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OCCURS_KEY__OCCURS_KEY_FIELD = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Occurs Key</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCCURS_KEY_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.coboldata.impl.LinageInfoImpl
     * <em>Linage Info</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.coboldata.impl.LinageInfoImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getLinageInfo()
     * @generated
     */
    int LINAGE_INFO = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__VALUE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Cobol Item</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINAGE_INFO__COBOL_ITEM = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Cobol FD</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO__COBOL_FD = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Linage Info</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINAGE_INFO_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.coboldata.impl.COBOLFDIndexImpl
     * <em>COBOLFD Index</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.coboldata.impl.COBOLFDIndexImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getCOBOLFDIndex()
     * @generated
     */
    int COBOLFD_INDEX = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__NAME = KeysindexesPackage.INDEX__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__VISIBILITY = KeysindexesPackage.INDEX__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__CLIENT_DEPENDENCY = KeysindexesPackage.INDEX__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__SUPPLIER_DEPENDENCY = KeysindexesPackage.INDEX__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__CONSTRAINT = KeysindexesPackage.INDEX__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__NAMESPACE = KeysindexesPackage.INDEX__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__IMPORTER = KeysindexesPackage.INDEX__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__STEREOTYPE = KeysindexesPackage.INDEX__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__TAGGED_VALUE = KeysindexesPackage.INDEX__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__DOCUMENT = KeysindexesPackage.INDEX__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__DESCRIPTION = KeysindexesPackage.INDEX__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__RESPONSIBLE_PARTY = KeysindexesPackage.INDEX__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__ELEMENT_NODE = KeysindexesPackage.INDEX__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__SET = KeysindexesPackage.INDEX__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__RENDERED_OBJECT = KeysindexesPackage.INDEX__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__VOCABULARY_ELEMENT = KeysindexesPackage.INDEX__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__MEASUREMENT = KeysindexesPackage.INDEX__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__CHANGE_REQUEST = KeysindexesPackage.INDEX__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__DASDL_PROPERTY = KeysindexesPackage.INDEX__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Is Partitioning</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__IS_PARTITIONING = KeysindexesPackage.INDEX__IS_PARTITIONING;

    /**
     * The feature id for the '<em><b>Is Sorted</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__IS_SORTED = KeysindexesPackage.INDEX__IS_SORTED;

    /**
     * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__IS_UNIQUE = KeysindexesPackage.INDEX__IS_UNIQUE;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__INDEXED_FEATURE = KeysindexesPackage.INDEX__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Spanned Class</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__SPANNED_CLASS = KeysindexesPackage.INDEX__SPANNED_CLASS;

    /**
     * The feature id for the '<em><b>Is Alternate</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX__IS_ALTERNATE = KeysindexesPackage.INDEX_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>COBOLFD Index</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COBOLFD_INDEX_FEATURE_COUNT = KeysindexesPackage.INDEX_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.impl.UsageImpl <em>Usage</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.impl.UsageImpl
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getUsage()
     * @generated
     */
    int USAGE = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__NAME = CorePackage.DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__VISIBILITY = CorePackage.DATA_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__CLIENT_DEPENDENCY = CorePackage.DATA_TYPE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__SUPPLIER_DEPENDENCY = CorePackage.DATA_TYPE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__CONSTRAINT = CorePackage.DATA_TYPE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__NAMESPACE = CorePackage.DATA_TYPE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__IMPORTER = CorePackage.DATA_TYPE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__STEREOTYPE = CorePackage.DATA_TYPE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__TAGGED_VALUE = CorePackage.DATA_TYPE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__DOCUMENT = CorePackage.DATA_TYPE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__DESCRIPTION = CorePackage.DATA_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__RESPONSIBLE_PARTY = CorePackage.DATA_TYPE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__ELEMENT_NODE = CorePackage.DATA_TYPE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__SET = CorePackage.DATA_TYPE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__RENDERED_OBJECT = CorePackage.DATA_TYPE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__VOCABULARY_ELEMENT = CorePackage.DATA_TYPE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__MEASUREMENT = CorePackage.DATA_TYPE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__CHANGE_REQUEST = CorePackage.DATA_TYPE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__DASDL_PROPERTY = CorePackage.DATA_TYPE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__OWNED_ELEMENT = CorePackage.DATA_TYPE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__IS_ABSTRACT = CorePackage.DATA_TYPE__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__FEATURE = CorePackage.DATA_TYPE__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__STRUCTURAL_FEATURE = CorePackage.DATA_TYPE__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__PARAMETER = CorePackage.DATA_TYPE__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__GENERALIZATION = CorePackage.DATA_TYPE__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__SPECIALIZATION = CorePackage.DATA_TYPE__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__INSTANCE = CorePackage.DATA_TYPE__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__ALIAS = CorePackage.DATA_TYPE__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__EXPRESSION_NODE = CorePackage.DATA_TYPE__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__MAPPING_FROM = CorePackage.DATA_TYPE__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__MAPPING_TO = CorePackage.DATA_TYPE__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__CLASSIFIER_MAP = CorePackage.DATA_TYPE__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__CF_MAP = CorePackage.DATA_TYPE__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE__DOMAIN = CorePackage.DATA_TYPE__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USAGE__SIMPLE_DIMENSION = CorePackage.DATA_TYPE__SIMPLE_DIMENSION;

    /**
     * The number of structural features of the '<em>Usage</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int USAGE_FEATURE_COUNT = CorePackage.DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.AccessType <em>Access Type</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.AccessType
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getAccessType()
     * @generated
     */
    int ACCESS_TYPE = 13;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.BlockKind <em>Block Kind</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.BlockKind
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getBlockKind()
     * @generated
     */
    int BLOCK_KIND = 14;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.FileOrganization <em>File Organization</em>}' enum.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.FileOrganization
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getFileOrganization()
     * @generated
     */
    int FILE_ORGANIZATION = 15;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.LabelKind <em>Label Kind</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.LabelKind
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getLabelKind()
     * @generated
     */
    int LABEL_KIND = 16;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.coboldata.LinageInfoType <em>Linage Info Type</em>}' enum.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.coboldata.LinageInfoType
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getLinageInfoType()
     * @generated
     */
    int LINAGE_INFO_TYPE = 17;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.coboldata.SignKindType
     * <em>Sign Kind Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.coboldata.SignKindType
     * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getSignKindType()
     * @generated
     */
    int SIGN_KIND_TYPE = 18;

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.coboldata.COBOLFD <em>COBOLFD</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>COBOLFD</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD
     * @generated
     */
    EClass getCOBOLFD();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getOrganization <em>Organization</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Organization</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getOrganization()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_Organization();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getAccessMode <em>Access Mode</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Access Mode</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getAccessMode()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_AccessMode();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#isIsOptional <em>Is Optional</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Optional</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#isIsOptional()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_IsOptional();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getReserveAreas <em>Reserve Areas</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reserve Areas</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getReserveAreas()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_ReserveAreas();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getAssignTo <em>Assign To</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Assign To</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getAssignTo()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_AssignTo();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getCodeSetLit <em>Code Set Lit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Code Set Lit</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getCodeSetLit()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_CodeSetLit();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getBlockSizeUnit <em>Block Size Unit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Block Size Unit</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getBlockSizeUnit()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_BlockSizeUnit();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMinBlocks <em>Min Blocks</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Blocks</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getMinBlocks()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_MinBlocks();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMaxBlocks <em>Max Blocks</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Blocks</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getMaxBlocks()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_MaxBlocks();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMinRecords <em>Min Records</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Records</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getMinRecords()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_MinRecords();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMaxRecords <em>Max Records</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Records</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getMaxRecords()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_MaxRecords();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getLabelKind <em>Label Kind</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label Kind</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getLabelKind()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_LabelKind();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#isIsExternal <em>Is External</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is External</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#isIsExternal()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_IsExternal();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#isIsGlobal <em>Is Global</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Global</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#isIsGlobal()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_IsGlobal();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getPadLiteral <em>Pad Literal</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pad Literal</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getPadLiteral()
     * @see #getCOBOLFD()
     * @generated
     */
    EAttribute getCOBOLFD_PadLiteral();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getStatusID <em>Status ID</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Status ID</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getStatusID()
     * @see #getCOBOLFD()
     * @generated
     */
    EReference getCOBOLFD_StatusID();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getLinageInfo <em>Linage Info</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Linage Info</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getLinageInfo()
     * @see #getCOBOLFD()
     * @generated
     */
    EReference getCOBOLFD_LinageInfo();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getFileSection <em>File Section</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>File Section</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getFileSection()
     * @see #getCOBOLFD()
     * @generated
     */
    EReference getCOBOLFD_FileSection();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getDependsOn <em>Depends On</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Depends On</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getDependsOn()
     * @see #getCOBOLFD()
     * @generated
     */
    EReference getCOBOLFD_DependsOn();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getPadField <em>Pad Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Pad Field</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getPadField()
     * @see #getCOBOLFD()
     * @generated
     */
    EReference getCOBOLFD_PadField();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getRelativeField <em>Relative Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Relative Field</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getRelativeField()
     * @see #getCOBOLFD()
     * @generated
     */
    EReference getCOBOLFD_RelativeField();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.coboldata.COBOLItem <em>COBOL Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>COBOL Item</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLItem
     * @generated
     */
    EClass getCOBOLItem();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.coboldata.COBOLItem#getOccurringField <em>Occurring Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Occurring Field</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getOccurringField()
     * @see #getCOBOLItem()
     * @generated
     */
    EReference getCOBOLItem_OccurringField();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.coboldata.COBOLItem#getStatusFD <em>Status FD</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Status FD</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getStatusFD()
     * @see #getCOBOLItem()
     * @generated
     */
    EReference getCOBOLItem_StatusFD();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.coboldata.COBOLItem#getLinageInfo <em>Linage Info</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Linage Info</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getLinageInfo()
     * @see #getCOBOLItem()
     * @generated
     */
    EReference getCOBOLItem_LinageInfo();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.coboldata.COBOLItem#getDependingFD <em>Depending FD</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Depending FD</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getDependingFD()
     * @see #getCOBOLItem()
     * @generated
     */
    EReference getCOBOLItem_DependingFD();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.coboldata.COBOLItem#getPaddedFD <em>Padded FD</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Padded FD</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getPaddedFD()
     * @see #getCOBOLItem()
     * @generated
     */
    EReference getCOBOLItem_PaddedFD();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.coboldata.COBOLItem#getRelativeFD <em>Relative FD</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Relative FD</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getRelativeFD()
     * @see #getCOBOLItem()
     * @generated
     */
    EReference getCOBOLItem_RelativeFD();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.coboldata.COBOLField <em>COBOL Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>COBOL Field</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField
     * @generated
     */
    EClass getCOBOLField();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLField#getLevel <em>Level</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Level</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getLevel()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_Level();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLField#getSignKind <em>Sign Kind</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sign Kind</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getSignKind()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_SignKind();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsFiller <em>Is Filler</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Filler</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#isIsFiller()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_IsFiller();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#isIsJustifiedRight
     * <em>Is Justified Right</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Is Justified Right</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#isIsJustifiedRight()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_IsJustifiedRight();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#isIsBlankWhenZero
     * <em>Is Blank When Zero</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Is Blank When Zero</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#isIsBlankWhenZero()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_IsBlankWhenZero();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsSynchronized <em>Is Synchronized</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Synchronized</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#isIsSynchronized()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_IsSynchronized();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLField#getPicture <em>Picture</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Picture</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getPicture()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_Picture();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursLower <em>Occurs Lower</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Occurs Lower</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getOccursLower()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_OccursLower();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursUpper <em>Occurs Upper</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Occurs Upper</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getOccursUpper()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_OccursUpper();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLField#getIndexName <em>Index Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Index Name</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getIndexName()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_IndexName();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsExternal <em>Is External</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is External</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#isIsExternal()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_IsExternal();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLField#isIsGlobal <em>Is Global</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Global</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#isIsGlobal()
     * @see #getCOBOLField()
     * @generated
     */
    EAttribute getCOBOLField_IsGlobal();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#getDependingOnField
     * <em>Depending On Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Depending On Field</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getDependingOnField()
     * @see #getCOBOLField()
     * @generated
     */
    EReference getCOBOLField_DependingOnField();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedField <em>Redefined Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Redefined Field</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedField()
     * @see #getCOBOLField()
     * @generated
     */
    EReference getCOBOLField_RedefinedField();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedByField
     * <em>Redefined By Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference list '
     *         <em>Redefined By Field</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getRedefinedByField()
     * @see #getCOBOLField()
     * @generated
     */
    EReference getCOBOLField_RedefinedByField();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursKeyInfo <em>Occurs Key Info</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Occurs Key Info</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getOccursKeyInfo()
     * @see #getCOBOLField()
     * @generated
     */
    EReference getCOBOLField_OccursKeyInfo();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.coboldata.COBOLField#getOccursKeyFieldInfo <em>Occurs Key Field Info</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the reference list '<em>Occurs Key Field Info</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getOccursKeyFieldInfo()
     * @see #getCOBOLField()
     * @generated
     */
    EReference getCOBOLField_OccursKeyFieldInfo();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.coboldata.COBOLField#getFirstRenames <em>First Renames</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>First Renames</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getFirstRenames()
     * @see #getCOBOLField()
     * @generated
     */
    EReference getCOBOLField_FirstRenames();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.coboldata.COBOLField#getThruRenames <em>Thru Renames</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Thru Renames</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getThruRenames()
     * @see #getCOBOLField()
     * @generated
     */
    EReference getCOBOLField_ThruRenames();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.coboldata.Renames <em>Renames</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Renames</em>'.
     * @see orgomg.cwmx.resource.coboldata.Renames
     * @generated
     */
    EClass getRenames();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.coboldata.Renames#getFirstField <em>First Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>First Field</em>'.
     * @see orgomg.cwmx.resource.coboldata.Renames#getFirstField()
     * @see #getRenames()
     * @generated
     */
    EReference getRenames_FirstField();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.coboldata.Renames#getThruField <em>Thru Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Thru Field</em>'.
     * @see orgomg.cwmx.resource.coboldata.Renames#getThruField()
     * @see #getRenames()
     * @generated
     */
    EReference getRenames_ThruField();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.coboldata.Section <em>Section</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Section</em>'.
     * @see orgomg.cwmx.resource.coboldata.Section
     * @generated
     */
    EClass getSection();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.coboldata.Section#getRecord <em>Record</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Record</em>'.
     * @see orgomg.cwmx.resource.coboldata.Section#getRecord()
     * @see #getSection()
     * @generated
     */
    EReference getSection_Record();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.coboldata.WorkingStorageSection <em>Working Storage Section</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Working Storage Section</em>'.
     * @see orgomg.cwmx.resource.coboldata.WorkingStorageSection
     * @generated
     */
    EClass getWorkingStorageSection();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.coboldata.FileSection <em>File Section</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>File Section</em>'.
     * @see orgomg.cwmx.resource.coboldata.FileSection
     * @generated
     */
    EClass getFileSection();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.coboldata.FileSection#getCobolFD <em>Cobol FD</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Cobol FD</em>'.
     * @see orgomg.cwmx.resource.coboldata.FileSection#getCobolFD()
     * @see #getFileSection()
     * @generated
     */
    EReference getFileSection_CobolFD();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.coboldata.ReportWriterSection <em>Report Writer Section</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Report Writer Section</em>'.
     * @see orgomg.cwmx.resource.coboldata.ReportWriterSection
     * @generated
     */
    EClass getReportWriterSection();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.coboldata.LinkageSection <em>Linkage Section</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Linkage Section</em>'.
     * @see orgomg.cwmx.resource.coboldata.LinkageSection
     * @generated
     */
    EClass getLinkageSection();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.coboldata.OccursKey <em>Occurs Key</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Occurs Key</em>'.
     * @see orgomg.cwmx.resource.coboldata.OccursKey
     * @generated
     */
    EClass getOccursKey();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.OccursKey#isIsAscending <em>Is Ascending</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Ascending</em>'.
     * @see orgomg.cwmx.resource.coboldata.OccursKey#isIsAscending()
     * @see #getOccursKey()
     * @generated
     */
    EAttribute getOccursKey_IsAscending();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyOf <em>Occurs Key Of</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Occurs Key Of</em>'.
     * @see orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyOf()
     * @see #getOccursKey()
     * @generated
     */
    EReference getOccursKey_OccursKeyOf();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyField
     * <em>Occurs Key Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Occurs Key Field</em>'.
     * @see orgomg.cwmx.resource.coboldata.OccursKey#getOccursKeyField()
     * @see #getOccursKey()
     * @generated
     */
    EReference getOccursKey_OccursKeyField();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.coboldata.LinageInfo <em>Linage Info</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Linage Info</em>'.
     * @see orgomg.cwmx.resource.coboldata.LinageInfo
     * @generated
     */
    EClass getLinageInfo();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.LinageInfo#getValue <em>Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see orgomg.cwmx.resource.coboldata.LinageInfo#getValue()
     * @see #getLinageInfo()
     * @generated
     */
    EAttribute getLinageInfo_Value();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.LinageInfo#getType <em>Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see orgomg.cwmx.resource.coboldata.LinageInfo#getType()
     * @see #getLinageInfo()
     * @generated
     */
    EAttribute getLinageInfo_Type();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.coboldata.LinageInfo#getCobolItem <em>Cobol Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Cobol Item</em>'.
     * @see orgomg.cwmx.resource.coboldata.LinageInfo#getCobolItem()
     * @see #getLinageInfo()
     * @generated
     */
    EReference getLinageInfo_CobolItem();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.coboldata.LinageInfo#getCobolFD <em>Cobol FD</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Cobol FD</em>'.
     * @see orgomg.cwmx.resource.coboldata.LinageInfo#getCobolFD()
     * @see #getLinageInfo()
     * @generated
     */
    EReference getLinageInfo_CobolFD();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.coboldata.COBOLFDIndex <em>COBOLFD Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>COBOLFD Index</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFDIndex
     * @generated
     */
    EClass getCOBOLFDIndex();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.coboldata.COBOLFDIndex#isIsAlternate <em>Is Alternate</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Alternate</em>'.
     * @see orgomg.cwmx.resource.coboldata.COBOLFDIndex#isIsAlternate()
     * @see #getCOBOLFDIndex()
     * @generated
     */
    EAttribute getCOBOLFDIndex_IsAlternate();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.coboldata.Usage <em>Usage</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Usage</em>'.
     * @see orgomg.cwmx.resource.coboldata.Usage
     * @generated
     */
    EClass getUsage();

    /**
     * Returns the meta object for enum '{@link orgomg.cwmx.resource.coboldata.AccessType <em>Access Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>Access Type</em>'.
     * @see orgomg.cwmx.resource.coboldata.AccessType
     * @generated
     */
    EEnum getAccessType();

    /**
     * Returns the meta object for enum '{@link orgomg.cwmx.resource.coboldata.BlockKind <em>Block Kind</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>Block Kind</em>'.
     * @see orgomg.cwmx.resource.coboldata.BlockKind
     * @generated
     */
    EEnum getBlockKind();

    /**
     * Returns the meta object for enum '
     * {@link orgomg.cwmx.resource.coboldata.FileOrganization
     * <em>File Organization</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for enum '<em>File Organization</em>'.
     * @see orgomg.cwmx.resource.coboldata.FileOrganization
     * @generated
     */
    EEnum getFileOrganization();

    /**
     * Returns the meta object for enum '{@link orgomg.cwmx.resource.coboldata.LabelKind <em>Label Kind</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>Label Kind</em>'.
     * @see orgomg.cwmx.resource.coboldata.LabelKind
     * @generated
     */
    EEnum getLabelKind();

    /**
     * Returns the meta object for enum '
     * {@link orgomg.cwmx.resource.coboldata.LinageInfoType
     * <em>Linage Info Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for enum '<em>Linage Info Type</em>'.
     * @see orgomg.cwmx.resource.coboldata.LinageInfoType
     * @generated
     */
    EEnum getLinageInfoType();

    /**
     * Returns the meta object for enum '{@link orgomg.cwmx.resource.coboldata.SignKindType <em>Sign Kind Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>Sign Kind Type</em>'.
     * @see orgomg.cwmx.resource.coboldata.SignKindType
     * @generated
     */
    EEnum getSignKindType();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CoboldataFactory getCoboldataFactory();

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
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl
         * <em>COBOLFD</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getCOBOLFD()
         * @generated
         */
        EClass COBOLFD = eINSTANCE.getCOBOLFD();

        /**
         * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__ORGANIZATION = eINSTANCE.getCOBOLFD_Organization();

        /**
         * The meta object literal for the '<em><b>Access Mode</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__ACCESS_MODE = eINSTANCE.getCOBOLFD_AccessMode();

        /**
         * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__IS_OPTIONAL = eINSTANCE.getCOBOLFD_IsOptional();

        /**
         * The meta object literal for the '<em><b>Reserve Areas</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__RESERVE_AREAS = eINSTANCE.getCOBOLFD_ReserveAreas();

        /**
         * The meta object literal for the '<em><b>Assign To</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__ASSIGN_TO = eINSTANCE.getCOBOLFD_AssignTo();

        /**
         * The meta object literal for the '<em><b>Code Set Lit</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__CODE_SET_LIT = eINSTANCE.getCOBOLFD_CodeSetLit();

        /**
         * The meta object literal for the '<em><b>Block Size Unit</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__BLOCK_SIZE_UNIT = eINSTANCE.getCOBOLFD_BlockSizeUnit();

        /**
         * The meta object literal for the '<em><b>Min Blocks</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__MIN_BLOCKS = eINSTANCE.getCOBOLFD_MinBlocks();

        /**
         * The meta object literal for the '<em><b>Max Blocks</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__MAX_BLOCKS = eINSTANCE.getCOBOLFD_MaxBlocks();

        /**
         * The meta object literal for the '<em><b>Min Records</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__MIN_RECORDS = eINSTANCE.getCOBOLFD_MinRecords();

        /**
         * The meta object literal for the '<em><b>Max Records</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__MAX_RECORDS = eINSTANCE.getCOBOLFD_MaxRecords();

        /**
         * The meta object literal for the '<em><b>Label Kind</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__LABEL_KIND = eINSTANCE.getCOBOLFD_LabelKind();

        /**
         * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__IS_EXTERNAL = eINSTANCE.getCOBOLFD_IsExternal();

        /**
         * The meta object literal for the '<em><b>Is Global</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__IS_GLOBAL = eINSTANCE.getCOBOLFD_IsGlobal();

        /**
         * The meta object literal for the '<em><b>Pad Literal</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD__PAD_LITERAL = eINSTANCE.getCOBOLFD_PadLiteral();

        /**
         * The meta object literal for the '<em><b>Status ID</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOLFD__STATUS_ID = eINSTANCE.getCOBOLFD_StatusID();

        /**
         * The meta object literal for the '<em><b>Linage Info</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference COBOLFD__LINAGE_INFO = eINSTANCE.getCOBOLFD_LinageInfo();

        /**
         * The meta object literal for the '<em><b>File Section</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference COBOLFD__FILE_SECTION = eINSTANCE.getCOBOLFD_FileSection();

        /**
         * The meta object literal for the '<em><b>Depends On</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOLFD__DEPENDS_ON = eINSTANCE.getCOBOLFD_DependsOn();

        /**
         * The meta object literal for the '<em><b>Pad Field</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOLFD__PAD_FIELD = eINSTANCE.getCOBOLFD_PadField();

        /**
         * The meta object literal for the '<em><b>Relative Field</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOLFD__RELATIVE_FIELD = eINSTANCE.getCOBOLFD_RelativeField();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.impl.COBOLItemImpl <em>COBOL Item</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.impl.COBOLItemImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getCOBOLItem()
         * @generated
         */
        EClass COBOL_ITEM = eINSTANCE.getCOBOLItem();

        /**
         * The meta object literal for the '<em><b>Occurring Field</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_ITEM__OCCURRING_FIELD = eINSTANCE.getCOBOLItem_OccurringField();

        /**
         * The meta object literal for the '<em><b>Status FD</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_ITEM__STATUS_FD = eINSTANCE.getCOBOLItem_StatusFD();

        /**
         * The meta object literal for the '<em><b>Linage Info</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_ITEM__LINAGE_INFO = eINSTANCE.getCOBOLItem_LinageInfo();

        /**
         * The meta object literal for the '<em><b>Depending FD</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_ITEM__DEPENDING_FD = eINSTANCE.getCOBOLItem_DependingFD();

        /**
         * The meta object literal for the '<em><b>Padded FD</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_ITEM__PADDED_FD = eINSTANCE.getCOBOLItem_PaddedFD();

        /**
         * The meta object literal for the '<em><b>Relative FD</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_ITEM__RELATIVE_FD = eINSTANCE.getCOBOLItem_RelativeFD();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl <em>COBOL Field</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getCOBOLField()
         * @generated
         */
        EClass COBOL_FIELD = eINSTANCE.getCOBOLField();

        /**
         * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__LEVEL = eINSTANCE.getCOBOLField_Level();

        /**
         * The meta object literal for the '<em><b>Sign Kind</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__SIGN_KIND = eINSTANCE.getCOBOLField_SignKind();

        /**
         * The meta object literal for the '<em><b>Is Filler</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__IS_FILLER = eINSTANCE.getCOBOLField_IsFiller();

        /**
         * The meta object literal for the '<em><b>Is Justified Right</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__IS_JUSTIFIED_RIGHT = eINSTANCE.getCOBOLField_IsJustifiedRight();

        /**
         * The meta object literal for the '<em><b>Is Blank When Zero</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__IS_BLANK_WHEN_ZERO = eINSTANCE.getCOBOLField_IsBlankWhenZero();

        /**
         * The meta object literal for the '<em><b>Is Synchronized</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__IS_SYNCHRONIZED = eINSTANCE.getCOBOLField_IsSynchronized();

        /**
         * The meta object literal for the '<em><b>Picture</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__PICTURE = eINSTANCE.getCOBOLField_Picture();

        /**
         * The meta object literal for the '<em><b>Occurs Lower</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__OCCURS_LOWER = eINSTANCE.getCOBOLField_OccursLower();

        /**
         * The meta object literal for the '<em><b>Occurs Upper</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__OCCURS_UPPER = eINSTANCE.getCOBOLField_OccursUpper();

        /**
         * The meta object literal for the '<em><b>Index Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__INDEX_NAME = eINSTANCE.getCOBOLField_IndexName();

        /**
         * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__IS_EXTERNAL = eINSTANCE.getCOBOLField_IsExternal();

        /**
         * The meta object literal for the '<em><b>Is Global</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOL_FIELD__IS_GLOBAL = eINSTANCE.getCOBOLField_IsGlobal();

        /**
         * The meta object literal for the '<em><b>Depending On Field</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_FIELD__DEPENDING_ON_FIELD = eINSTANCE.getCOBOLField_DependingOnField();

        /**
         * The meta object literal for the '<em><b>Redefined Field</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_FIELD__REDEFINED_FIELD = eINSTANCE.getCOBOLField_RedefinedField();

        /**
         * The meta object literal for the '<em><b>Redefined By Field</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_FIELD__REDEFINED_BY_FIELD = eINSTANCE.getCOBOLField_RedefinedByField();

        /**
         * The meta object literal for the '<em><b>Occurs Key Info</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference COBOL_FIELD__OCCURS_KEY_INFO = eINSTANCE.getCOBOLField_OccursKeyInfo();

        /**
         * The meta object literal for the '
         * <em><b>Occurs Key Field Info</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference COBOL_FIELD__OCCURS_KEY_FIELD_INFO = eINSTANCE.getCOBOLField_OccursKeyFieldInfo();

        /**
         * The meta object literal for the '<em><b>First Renames</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_FIELD__FIRST_RENAMES = eINSTANCE.getCOBOLField_FirstRenames();

        /**
         * The meta object literal for the '<em><b>Thru Renames</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference COBOL_FIELD__THRU_RENAMES = eINSTANCE.getCOBOLField_ThruRenames();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.coboldata.impl.RenamesImpl
         * <em>Renames</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.coboldata.impl.RenamesImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getRenames()
         * @generated
         */
        EClass RENAMES = eINSTANCE.getRenames();

        /**
         * The meta object literal for the '<em><b>First Field</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RENAMES__FIRST_FIELD = eINSTANCE.getRenames_FirstField();

        /**
         * The meta object literal for the '<em><b>Thru Field</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RENAMES__THRU_FIELD = eINSTANCE.getRenames_ThruField();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.coboldata.impl.SectionImpl
         * <em>Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.coboldata.impl.SectionImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getSection()
         * @generated
         */
        EClass SECTION = eINSTANCE.getSection();

        /**
         * The meta object literal for the '<em><b>Record</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SECTION__RECORD = eINSTANCE.getSection_Record();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.impl.WorkingStorageSectionImpl <em>Working Storage Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.impl.WorkingStorageSectionImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getWorkingStorageSection()
         * @generated
         */
        EClass WORKING_STORAGE_SECTION = eINSTANCE.getWorkingStorageSection();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.impl.FileSectionImpl <em>File Section</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.impl.FileSectionImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getFileSection()
         * @generated
         */
        EClass FILE_SECTION = eINSTANCE.getFileSection();

        /**
         * The meta object literal for the '<em><b>Cobol FD</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference FILE_SECTION__COBOL_FD = eINSTANCE.getFileSection_CobolFD();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.impl.ReportWriterSectionImpl <em>Report Writer Section</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.impl.ReportWriterSectionImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getReportWriterSection()
         * @generated
         */
        EClass REPORT_WRITER_SECTION = eINSTANCE.getReportWriterSection();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.impl.LinkageSectionImpl <em>Linkage Section</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.impl.LinkageSectionImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getLinkageSection()
         * @generated
         */
        EClass LINKAGE_SECTION = eINSTANCE.getLinkageSection();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.impl.OccursKeyImpl <em>Occurs Key</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.impl.OccursKeyImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getOccursKey()
         * @generated
         */
        EClass OCCURS_KEY = eINSTANCE.getOccursKey();

        /**
         * The meta object literal for the '<em><b>Is Ascending</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute OCCURS_KEY__IS_ASCENDING = eINSTANCE.getOccursKey_IsAscending();

        /**
         * The meta object literal for the '<em><b>Occurs Key Of</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference OCCURS_KEY__OCCURS_KEY_OF = eINSTANCE.getOccursKey_OccursKeyOf();

        /**
         * The meta object literal for the '<em><b>Occurs Key Field</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference OCCURS_KEY__OCCURS_KEY_FIELD = eINSTANCE.getOccursKey_OccursKeyField();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.impl.LinageInfoImpl <em>Linage Info</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.impl.LinageInfoImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getLinageInfo()
         * @generated
         */
        EClass LINAGE_INFO = eINSTANCE.getLinageInfo();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINAGE_INFO__VALUE = eINSTANCE.getLinageInfo_Value();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINAGE_INFO__TYPE = eINSTANCE.getLinageInfo_Type();

        /**
         * The meta object literal for the '<em><b>Cobol Item</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference LINAGE_INFO__COBOL_ITEM = eINSTANCE.getLinageInfo_CobolItem();

        /**
         * The meta object literal for the '<em><b>Cobol FD</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference LINAGE_INFO__COBOL_FD = eINSTANCE.getLinageInfo_CobolFD();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDIndexImpl <em>COBOLFD Index</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.impl.COBOLFDIndexImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getCOBOLFDIndex()
         * @generated
         */
        EClass COBOLFD_INDEX = eINSTANCE.getCOBOLFDIndex();

        /**
         * The meta object literal for the '<em><b>Is Alternate</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COBOLFD_INDEX__IS_ALTERNATE = eINSTANCE.getCOBOLFDIndex_IsAlternate();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.impl.UsageImpl <em>Usage</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.impl.UsageImpl
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getUsage()
         * @generated
         */
        EClass USAGE = eINSTANCE.getUsage();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.AccessType <em>Access Type</em>}' enum.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.AccessType
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getAccessType()
         * @generated
         */
        EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.BlockKind <em>Block Kind</em>}' enum.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.BlockKind
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getBlockKind()
         * @generated
         */
        EEnum BLOCK_KIND = eINSTANCE.getBlockKind();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.FileOrganization <em>File Organization</em>}' enum.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.FileOrganization
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getFileOrganization()
         * @generated
         */
        EEnum FILE_ORGANIZATION = eINSTANCE.getFileOrganization();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.LabelKind <em>Label Kind</em>}' enum.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.LabelKind
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getLabelKind()
         * @generated
         */
        EEnum LABEL_KIND = eINSTANCE.getLabelKind();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.LinageInfoType <em>Linage Info Type</em>}' enum.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.LinageInfoType
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getLinageInfoType()
         * @generated
         */
        EEnum LINAGE_INFO_TYPE = eINSTANCE.getLinageInfoType();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.coboldata.SignKindType <em>Sign Kind Type</em>}' enum.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.coboldata.SignKindType
         * @see orgomg.cwmx.resource.coboldata.impl.CoboldataPackageImpl#getSignKindType()
         * @generated
         */
        EEnum SIGN_KIND_TYPE = eINSTANCE.getSignKindType();

    }

} // CoboldataPackage
