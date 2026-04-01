/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.analysis.olap.OlapPackage;
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc --> The InformationSet package
 * contains the metamodel of information sets that is an extension of the OLAP
 * package.
 * 
 * An important aspect of data warehousing is the collection of data from
 * external resources using, for example, application generated reports,
 * questionnaires or surveys. To allow for inter-operability of tools supporting
 * data collection, the metadata identifying the data to be collected must be
 * defined, together with metadata that can be used to ensure accuracy and
 * validity of data.
 * 
 * The InformationSet package is designed to enable interchange of common
 * metadata about InformationSet structures, rules (e.g. validation,
 * calculation), and, possibly, visual renderings.
 * 
 * The characteristics of the InformationSet are:
 * 
 * the definition of logical structures that define the data to be collected can
 * be both single and multi-dimensional (e.g. value of export by country and
 * product)
 * 
 * data can be derived both from either from non-human sources or from human
 * sources (e.g. questionnaire, report form).
 * 
 * instruments for data collection need to be designed in such a way that
 * relevant and accurate data is collected, and in some instances this means
 * that the designer needs control over the visual rendering of the collection
 * instrument. Validation and Navigation within the InformationSet is also
 * required in order to facilitate the collection/retrieval of accurate data.
 * 
 * The InformationSet package contains metamodel elements that support the
 * following functions:
 * 
 * Semantic definition of the InformationSet and its constituent parts Visual
 * rendering supporting different media Validation, navigation and calculation
 * based on data values entered/retrieved Via OLAP, the links to Nomenclatures
 * (LevelBasedHierarchy) that give the valid codes and multi lingual labels for
 * the Dimensions The InformationSet is a domain specific extension of the OLAP
 * model with some additional classes to support specific requirements of the
 * InformationSet (e.g. validation, rendering). All information to be collected
 * can be identified in terms of the OLAP model, thus supporting the definition
 * of both multidimensional and unidimensional Segments (the OLAP Cube).
 * 
 * In addition to the definition of multi-dimensional structures that comprise
 * the logical InformationSet, there is a need to:
 * 
 * ensure accuracy of the data by applying validation and navigation expressions
 * derive values from other values in the InformationSet provide visual
 * rendering capability to support data collection using visual media such as
 * forms or screens
 * 
 * The InformationSet package depends on the following packages:
 * 
 * org.omg::CWM::ObjectModel::Core org.omg::CWM::Foundation::BusinessInformation
 * org.omg::CWM::Foundation::Expressions org.omg::CWM::Analysis::OLAP
 * org.omg::CWM::Analysis::InformationVisualization
 * 
 * The core classes in the InformationSet package (InformationSet, Segment,
 * SegmentRegion) are derived from the OLAP package classes of Schema, Cube, and
 * CubeRegion. This means that each part of an InformationSet (the Segment) is
 * defined in terms of a multidimensional structure of Dimensions.
 * 
 * Rule, InfoSetAdministration, and InfoSetDate are derived from ModelElement.
 * 
 * InformationSet is the logical container of all elements comprising the
 * InformationSet metamodel. It is the root element of the metamodel hierarchy
 * and marks the entry point for navigating the metamodel.
 * 
 * OCL Representation of InformationSet Constraints
 * 
 * [C-1] One instance of Rule can be associated with only one of InformationSet,
 * Segment, SegmentRegion. context Rule inv: self.informationSet->isEmpty xor
 * self.segment->isEmpty xor self.segmentRegion-> isEmpty <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.analysis.informationset.InformationsetFactory
 * @model kind="package"
 * @generated
 */
public interface InformationsetPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "informationset";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///orgomg/cwmx/analysis/informationset.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "orgomg.cwmx.analysis.informationset";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    InformationsetPackage eINSTANCE = orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl.init();

    /**
     * The meta object id for the '{@link orgomg.cwmx.analysis.informationset.impl.InformationSetImpl <em>Information Set</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.analysis.informationset.impl.InformationSetImpl
     * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getInformationSet()
     * @generated
     */
    int INFORMATION_SET = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__NAME = OlapPackage.SCHEMA__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__VISIBILITY = OlapPackage.SCHEMA__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__CLIENT_DEPENDENCY = OlapPackage.SCHEMA__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__SUPPLIER_DEPENDENCY = OlapPackage.SCHEMA__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__CONSTRAINT = OlapPackage.SCHEMA__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__NAMESPACE = OlapPackage.SCHEMA__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__IMPORTER = OlapPackage.SCHEMA__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__STEREOTYPE = OlapPackage.SCHEMA__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__TAGGED_VALUE = OlapPackage.SCHEMA__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__DOCUMENT = OlapPackage.SCHEMA__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__DESCRIPTION = OlapPackage.SCHEMA__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__RESPONSIBLE_PARTY = OlapPackage.SCHEMA__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__ELEMENT_NODE = OlapPackage.SCHEMA__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__SET = OlapPackage.SCHEMA__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__RENDERED_OBJECT = OlapPackage.SCHEMA__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__VOCABULARY_ELEMENT = OlapPackage.SCHEMA__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__MEASUREMENT = OlapPackage.SCHEMA__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__CHANGE_REQUEST = OlapPackage.SCHEMA__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__DASDL_PROPERTY = OlapPackage.SCHEMA__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__OWNED_ELEMENT = OlapPackage.SCHEMA__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__IMPORTED_ELEMENT = OlapPackage.SCHEMA__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__DATA_MANAGER = OlapPackage.SCHEMA__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Cube</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__CUBE = OlapPackage.SCHEMA__CUBE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__DIMENSION = OlapPackage.SCHEMA__DIMENSION;

    /**
     * The feature id for the '<em><b>Deployment Group</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__DEPLOYMENT_GROUP = OlapPackage.SCHEMA__DEPLOYMENT_GROUP;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__VERSION = OlapPackage.SCHEMA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Rule</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFORMATION_SET__RULE = OlapPackage.SCHEMA_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Info Set Admin</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET__INFO_SET_ADMIN = OlapPackage.SCHEMA_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Information Set</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SET_FEATURE_COUNT = OlapPackage.SCHEMA_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmx.analysis.informationset.impl.SegmentImpl <em>Segment</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.analysis.informationset.impl.SegmentImpl
     * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getSegment()
     * @generated
     */
    int SEGMENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__NAME = OlapPackage.CUBE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__VISIBILITY = OlapPackage.CUBE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__CLIENT_DEPENDENCY = OlapPackage.CUBE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__SUPPLIER_DEPENDENCY = OlapPackage.CUBE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__CONSTRAINT = OlapPackage.CUBE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__NAMESPACE = OlapPackage.CUBE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__IMPORTER = OlapPackage.CUBE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__STEREOTYPE = OlapPackage.CUBE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__TAGGED_VALUE = OlapPackage.CUBE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__DOCUMENT = OlapPackage.CUBE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__DESCRIPTION = OlapPackage.CUBE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__RESPONSIBLE_PARTY = OlapPackage.CUBE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__ELEMENT_NODE = OlapPackage.CUBE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__SET = OlapPackage.CUBE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__RENDERED_OBJECT = OlapPackage.CUBE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__VOCABULARY_ELEMENT = OlapPackage.CUBE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__MEASUREMENT = OlapPackage.CUBE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__CHANGE_REQUEST = OlapPackage.CUBE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__DASDL_PROPERTY = OlapPackage.CUBE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__OWNED_ELEMENT = OlapPackage.CUBE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__IS_ABSTRACT = OlapPackage.CUBE__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__FEATURE = OlapPackage.CUBE__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__STRUCTURAL_FEATURE = OlapPackage.CUBE__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__PARAMETER = OlapPackage.CUBE__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__GENERALIZATION = OlapPackage.CUBE__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__SPECIALIZATION = OlapPackage.CUBE__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__INSTANCE = OlapPackage.CUBE__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__ALIAS = OlapPackage.CUBE__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__EXPRESSION_NODE = OlapPackage.CUBE__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__MAPPING_FROM = OlapPackage.CUBE__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__MAPPING_TO = OlapPackage.CUBE__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__CLASSIFIER_MAP = OlapPackage.CUBE__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__CF_MAP = OlapPackage.CUBE__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__DOMAIN = OlapPackage.CUBE__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__SIMPLE_DIMENSION = OlapPackage.CUBE__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__INDEX = OlapPackage.CUBE__INDEX;

    /**
     * The feature id for the '<em><b>Is Virtual</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__IS_VIRTUAL = OlapPackage.CUBE__IS_VIRTUAL;

    /**
     * The feature id for the '<em><b>Cube Dimension Association</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__CUBE_DIMENSION_ASSOCIATION = OlapPackage.CUBE__CUBE_DIMENSION_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__SCHEMA = OlapPackage.CUBE__SCHEMA;

    /**
     * The feature id for the '<em><b>Cube Region</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__CUBE_REGION = OlapPackage.CUBE__CUBE_REGION;

    /**
     * The feature id for the '<em><b>Region Sequence</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT__REGION_SEQUENCE = OlapPackage.CUBE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Rule</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT__RULE = OlapPackage.CUBE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Segment</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_FEATURE_COUNT = OlapPackage.CUBE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link orgomg.cwmx.analysis.informationset.impl.SegmentRegionImpl <em>Segment Region</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.analysis.informationset.impl.SegmentRegionImpl
     * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getSegmentRegion()
     * @generated
     */
    int SEGMENT_REGION = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__NAME = OlapPackage.CUBE_REGION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__VISIBILITY = OlapPackage.CUBE_REGION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__CLIENT_DEPENDENCY = OlapPackage.CUBE_REGION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__SUPPLIER_DEPENDENCY = OlapPackage.CUBE_REGION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__CONSTRAINT = OlapPackage.CUBE_REGION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__NAMESPACE = OlapPackage.CUBE_REGION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__IMPORTER = OlapPackage.CUBE_REGION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__STEREOTYPE = OlapPackage.CUBE_REGION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__TAGGED_VALUE = OlapPackage.CUBE_REGION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__DOCUMENT = OlapPackage.CUBE_REGION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__DESCRIPTION = OlapPackage.CUBE_REGION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__RESPONSIBLE_PARTY = OlapPackage.CUBE_REGION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__ELEMENT_NODE = OlapPackage.CUBE_REGION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__SET = OlapPackage.CUBE_REGION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__RENDERED_OBJECT = OlapPackage.CUBE_REGION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__VOCABULARY_ELEMENT = OlapPackage.CUBE_REGION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__MEASUREMENT = OlapPackage.CUBE_REGION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__CHANGE_REQUEST = OlapPackage.CUBE_REGION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__DASDL_PROPERTY = OlapPackage.CUBE_REGION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__OWNED_ELEMENT = OlapPackage.CUBE_REGION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__IS_ABSTRACT = OlapPackage.CUBE_REGION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__FEATURE = OlapPackage.CUBE_REGION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__STRUCTURAL_FEATURE = OlapPackage.CUBE_REGION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__PARAMETER = OlapPackage.CUBE_REGION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__GENERALIZATION = OlapPackage.CUBE_REGION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__SPECIALIZATION = OlapPackage.CUBE_REGION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__INSTANCE = OlapPackage.CUBE_REGION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__ALIAS = OlapPackage.CUBE_REGION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__EXPRESSION_NODE = OlapPackage.CUBE_REGION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__MAPPING_FROM = OlapPackage.CUBE_REGION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__MAPPING_TO = OlapPackage.CUBE_REGION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__CLASSIFIER_MAP = OlapPackage.CUBE_REGION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__CF_MAP = OlapPackage.CUBE_REGION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__DOMAIN = OlapPackage.CUBE_REGION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__SIMPLE_DIMENSION = OlapPackage.CUBE_REGION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__INDEX = OlapPackage.CUBE_REGION__INDEX;

    /**
     * The feature id for the '<em><b>Is Read Only</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__IS_READ_ONLY = OlapPackage.CUBE_REGION__IS_READ_ONLY;

    /**
     * The feature id for the '<em><b>Is Fully Realized</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__IS_FULLY_REALIZED = OlapPackage.CUBE_REGION__IS_FULLY_REALIZED;

    /**
     * The feature id for the '<em><b>Cube</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__CUBE = OlapPackage.CUBE_REGION__CUBE;

    /**
     * The feature id for the '<em><b>Member Selection Group</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__MEMBER_SELECTION_GROUP = OlapPackage.CUBE_REGION__MEMBER_SELECTION_GROUP;

    /**
     * The feature id for the '<em><b>Cube Deployment</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__CUBE_DEPLOYMENT = OlapPackage.CUBE_REGION__CUBE_DEPLOYMENT;

    /**
     * The feature id for the '<em><b>Rule</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEGMENT_REGION__RULE = OlapPackage.CUBE_REGION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Segment Region</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_REGION_FEATURE_COUNT = OlapPackage.CUBE_REGION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.analysis.informationset.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.analysis.informationset.impl.RuleImpl
     * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getRule()
     * @generated
     */
    int RULE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Rule Expression</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__RULE_EXPRESSION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Information Set</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__INFORMATION_SET = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Segment</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__SEGMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Segment Region</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE__SEGMENT_REGION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Rule</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RULE_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link orgomg.cwmx.analysis.informationset.impl.InfoSetAdministrationImpl <em>Info Set Administration</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.analysis.informationset.impl.InfoSetAdministrationImpl
     * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getInfoSetAdministration()
     * @generated
     */
    int INFO_SET_ADMINISTRATION = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__PRIORITY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Acknowledgement</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__ACKNOWLEDGEMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Information Set</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__INFORMATION_SET = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Date</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION__DATE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Info Set Administration</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_ADMINISTRATION_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.analysis.informationset.impl.InfoSetDateImpl
     * <em>Info Set Date</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.analysis.informationset.impl.InfoSetDateImpl
     * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getInfoSetDate()
     * @generated
     */
    int INFO_SET_DATE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__FORMAT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Date Time</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__DATE_TIME = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Info Set Admin</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE__INFO_SET_ADMIN = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Info Set Date</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFO_SET_DATE_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.analysis.informationset.InformationSet <em>Information Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Information Set</em>'.
     * @see orgomg.cwmx.analysis.informationset.InformationSet
     * @generated
     */
    EClass getInformationSet();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.analysis.informationset.InformationSet#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see orgomg.cwmx.analysis.informationset.InformationSet#getVersion()
     * @see #getInformationSet()
     * @generated
     */
    EAttribute getInformationSet_Version();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.analysis.informationset.InformationSet#getRule <em>Rule</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Rule</em>'.
     * @see orgomg.cwmx.analysis.informationset.InformationSet#getRule()
     * @see #getInformationSet()
     * @generated
     */
    EReference getInformationSet_Rule();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.analysis.informationset.InformationSet#getInfoSetAdmin <em>Info Set Admin</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Info Set Admin</em>'.
     * @see orgomg.cwmx.analysis.informationset.InformationSet#getInfoSetAdmin()
     * @see #getInformationSet()
     * @generated
     */
    EReference getInformationSet_InfoSetAdmin();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.analysis.informationset.Segment <em>Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Segment</em>'.
     * @see orgomg.cwmx.analysis.informationset.Segment
     * @generated
     */
    EClass getSegment();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.analysis.informationset.Segment#getRegionSequence <em>Region Sequence</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Region Sequence</em>'.
     * @see orgomg.cwmx.analysis.informationset.Segment#getRegionSequence()
     * @see #getSegment()
     * @generated
     */
    EReference getSegment_RegionSequence();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.analysis.informationset.Segment#getRule <em>Rule</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Rule</em>'.
     * @see orgomg.cwmx.analysis.informationset.Segment#getRule()
     * @see #getSegment()
     * @generated
     */
    EReference getSegment_Rule();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.analysis.informationset.SegmentRegion <em>Segment Region</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Segment Region</em>'.
     * @see orgomg.cwmx.analysis.informationset.SegmentRegion
     * @generated
     */
    EClass getSegmentRegion();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.analysis.informationset.SegmentRegion#getRule <em>Rule</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Rule</em>'.
     * @see orgomg.cwmx.analysis.informationset.SegmentRegion#getRule()
     * @see #getSegmentRegion()
     * @generated
     */
    EReference getSegmentRegion_Rule();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.analysis.informationset.Rule <em>Rule</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Rule</em>'.
     * @see orgomg.cwmx.analysis.informationset.Rule
     * @generated
     */
    EClass getRule();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.analysis.informationset.Rule#getRuleExpression <em>Rule Expression</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rule Expression</em>'.
     * @see orgomg.cwmx.analysis.informationset.Rule#getRuleExpression()
     * @see #getRule()
     * @generated
     */
    EReference getRule_RuleExpression();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.analysis.informationset.Rule#getType <em>Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see orgomg.cwmx.analysis.informationset.Rule#getType()
     * @see #getRule()
     * @generated
     */
    EAttribute getRule_Type();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.analysis.informationset.Rule#getInformationSet <em>Information Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Information Set</em>'.
     * @see orgomg.cwmx.analysis.informationset.Rule#getInformationSet()
     * @see #getRule()
     * @generated
     */
    EReference getRule_InformationSet();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.analysis.informationset.Rule#getSegment <em>Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Segment</em>'.
     * @see orgomg.cwmx.analysis.informationset.Rule#getSegment()
     * @see #getRule()
     * @generated
     */
    EReference getRule_Segment();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.analysis.informationset.Rule#getSegmentRegion <em>Segment Region</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Segment Region</em>'.
     * @see orgomg.cwmx.analysis.informationset.Rule#getSegmentRegion()
     * @see #getRule()
     * @generated
     */
    EReference getRule_SegmentRegion();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration <em>Info Set Administration</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Info Set Administration</em>'.
     * @see orgomg.cwmx.analysis.informationset.InfoSetAdministration
     * @generated
     */
    EClass getInfoSetAdministration();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see orgomg.cwmx.analysis.informationset.InfoSetAdministration#getPriority()
     * @see #getInfoSetAdministration()
     * @generated
     */
    EAttribute getInfoSetAdministration_Priority();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#isAcknowledgement <em>Acknowledgement</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Acknowledgement</em>'.
     * @see orgomg.cwmx.analysis.informationset.InfoSetAdministration#isAcknowledgement()
     * @see #getInfoSetAdministration()
     * @generated
     */
    EAttribute getInfoSetAdministration_Acknowledgement();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#getInformationSet <em>Information Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Information Set</em>'.
     * @see orgomg.cwmx.analysis.informationset.InfoSetAdministration#getInformationSet()
     * @see #getInfoSetAdministration()
     * @generated
     */
    EReference getInfoSetAdministration_InformationSet();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#getDate <em>Date</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Date</em>'.
     * @see orgomg.cwmx.analysis.informationset.InfoSetAdministration#getDate()
     * @see #getInfoSetAdministration()
     * @generated
     */
    EReference getInfoSetAdministration_Date();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.analysis.informationset.InfoSetDate <em>Info Set Date</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Info Set Date</em>'.
     * @see orgomg.cwmx.analysis.informationset.InfoSetDate
     * @generated
     */
    EClass getInfoSetDate();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.analysis.informationset.InfoSetDate#getType <em>Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see orgomg.cwmx.analysis.informationset.InfoSetDate#getType()
     * @see #getInfoSetDate()
     * @generated
     */
    EAttribute getInfoSetDate_Type();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.analysis.informationset.InfoSetDate#getFormat <em>Format</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Format</em>'.
     * @see orgomg.cwmx.analysis.informationset.InfoSetDate#getFormat()
     * @see #getInfoSetDate()
     * @generated
     */
    EAttribute getInfoSetDate_Format();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.analysis.informationset.InfoSetDate#getDateTime <em>Date Time</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date Time</em>'.
     * @see orgomg.cwmx.analysis.informationset.InfoSetDate#getDateTime()
     * @see #getInfoSetDate()
     * @generated
     */
    EAttribute getInfoSetDate_DateTime();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.analysis.informationset.InfoSetDate#getInfoSetAdmin <em>Info Set Admin</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Info Set Admin</em>'.
     * @see orgomg.cwmx.analysis.informationset.InfoSetDate#getInfoSetAdmin()
     * @see #getInfoSetDate()
     * @generated
     */
    EReference getInfoSetDate_InfoSetAdmin();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    InformationsetFactory getInformationsetFactory();

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
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationset.impl.InformationSetImpl <em>Information Set</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.analysis.informationset.impl.InformationSetImpl
         * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getInformationSet()
         * @generated
         */
        EClass INFORMATION_SET = eINSTANCE.getInformationSet();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFORMATION_SET__VERSION = eINSTANCE.getInformationSet_Version();

        /**
         * The meta object literal for the '<em><b>Rule</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INFORMATION_SET__RULE = eINSTANCE.getInformationSet_Rule();

        /**
         * The meta object literal for the '<em><b>Info Set Admin</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference INFORMATION_SET__INFO_SET_ADMIN = eINSTANCE.getInformationSet_InfoSetAdmin();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.analysis.informationset.impl.SegmentImpl
         * <em>Segment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.analysis.informationset.impl.SegmentImpl
         * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getSegment()
         * @generated
         */
        EClass SEGMENT = eINSTANCE.getSegment();

        /**
         * The meta object literal for the '<em><b>Region Sequence</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference SEGMENT__REGION_SEQUENCE = eINSTANCE.getSegment_RegionSequence();

        /**
         * The meta object literal for the '<em><b>Rule</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT__RULE = eINSTANCE.getSegment_Rule();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationset.impl.SegmentRegionImpl <em>Segment Region</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.analysis.informationset.impl.SegmentRegionImpl
         * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getSegmentRegion()
         * @generated
         */
        EClass SEGMENT_REGION = eINSTANCE.getSegmentRegion();

        /**
         * The meta object literal for the '<em><b>Rule</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SEGMENT_REGION__RULE = eINSTANCE.getSegmentRegion_Rule();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationset.impl.RuleImpl <em>Rule</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.analysis.informationset.impl.RuleImpl
         * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getRule()
         * @generated
         */
        EClass RULE = eINSTANCE.getRule();

        /**
         * The meta object literal for the '<em><b>Rule Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference RULE__RULE_EXPRESSION = eINSTANCE.getRule_RuleExpression();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE__TYPE = eINSTANCE.getRule_Type();

        /**
         * The meta object literal for the '<em><b>Information Set</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RULE__INFORMATION_SET = eINSTANCE.getRule_InformationSet();

        /**
         * The meta object literal for the '<em><b>Segment</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RULE__SEGMENT = eINSTANCE.getRule_Segment();

        /**
         * The meta object literal for the '<em><b>Segment Region</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RULE__SEGMENT_REGION = eINSTANCE.getRule_SegmentRegion();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationset.impl.InfoSetAdministrationImpl <em>Info Set Administration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see orgomg.cwmx.analysis.informationset.impl.InfoSetAdministrationImpl
         * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getInfoSetAdministration()
         * @generated
         */
        EClass INFO_SET_ADMINISTRATION = eINSTANCE.getInfoSetAdministration();

        /**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFO_SET_ADMINISTRATION__PRIORITY = eINSTANCE.getInfoSetAdministration_Priority();

        /**
         * The meta object literal for the '<em><b>Acknowledgement</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFO_SET_ADMINISTRATION__ACKNOWLEDGEMENT = eINSTANCE.getInfoSetAdministration_Acknowledgement();

        /**
         * The meta object literal for the '<em><b>Information Set</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference INFO_SET_ADMINISTRATION__INFORMATION_SET = eINSTANCE.getInfoSetAdministration_InformationSet();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INFO_SET_ADMINISTRATION__DATE = eINSTANCE.getInfoSetAdministration_Date();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationset.impl.InfoSetDateImpl <em>Info Set Date</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.analysis.informationset.impl.InfoSetDateImpl
         * @see orgomg.cwmx.analysis.informationset.impl.InformationsetPackageImpl#getInfoSetDate()
         * @generated
         */
        EClass INFO_SET_DATE = eINSTANCE.getInfoSetDate();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFO_SET_DATE__TYPE = eINSTANCE.getInfoSetDate_Type();

        /**
         * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFO_SET_DATE__FORMAT = eINSTANCE.getInfoSetDate_Format();

        /**
         * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFO_SET_DATE__DATE_TIME = eINSTANCE.getInfoSetDate_DateTime();

        /**
         * The meta object literal for the '<em><b>Info Set Admin</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INFO_SET_DATE__INFO_SET_ADMIN = eINSTANCE.getInfoSetDate_InfoSetAdmin();

    }

} // InformationsetPackage
