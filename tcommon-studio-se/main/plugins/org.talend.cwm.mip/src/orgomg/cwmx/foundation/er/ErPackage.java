/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.foundation.keysindexes.KeysindexesPackage;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.relationships.RelationshipsPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc --> Entity Relationship (ER)
 * models are used frequently as a means of describing business processes and
 * the data on which they operate. The ER model was a precursor of today?s
 * object models and is probably the first data model to have the adjective
 * "semantic" applied to it.
 * 
 * Although the ER model is widely used to capture some aspects of application
 * logic and data structure, there have been surprisingly few implementations of
 * the model as data resources. Most development teams have preferred to map
 * their ER models to existing data systems such as relational database
 * management systems. This dearth of physical implementations has meant that
 * modelers have been free to elaborate the basic ER model in any (and all)
 * convenient directions with little or no impact on deployed information
 * systems. Consequently, variants of the ER model abound.
 * 
 * Because of its importance as a design and tool model, the CWM includes a
 * foundational ER model from which individual tool models may derive their
 * specific extensions. Doing so will improve the extent to which ER models can
 * be interchanged between various tooling environments.
 * 
 * The ER package depends on the following packages:
 * 
 * org.omg::CWM::Core org.omg::CWM::Relationships
 * org.omg::CWM::Foundation::Expressions org.omg::CWM::Foundation::KeysIndexes
 * 
 * Many ER model concepts map directly onto equivalent CWM concepts, making the
 * ER classes seem to be little more than renamings of CWM classes. However, the
 * renaming provided by deriving ER model classes from appropriate CWM classes
 * is considered valuable to promote understanding. In such cases, the
 * discussion of the role of ER classes has been kept minimal. However, when
 * important modeling choices were required, they are discussed in the following
 * class descriptions.
 * 
 * OCL Representation of Entity Relationship Constraints
 * 
 * [C-1] A Domain instance may not be its own base type. context Domain inv:
 * self.baseType <> self
 * 
 * <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.foundation.er.ErFactory
 * @model kind="package"
 * @generated
 */
public interface ErPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "er";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///orgomg/cwmx/foundation/er.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "orgomg.cwmx.foundation.er";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    ErPackage eINSTANCE = orgomg.cwmx.foundation.er.impl.ErPackageImpl.init();

    /**
     * The meta object id for the '{@link orgomg.cwmx.foundation.er.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.foundation.er.impl.EntityImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getEntity()
     * @generated
     */
    int ENTITY = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__NAME = CorePackage.CLASS__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__VISIBILITY = CorePackage.CLASS__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__SUPPLIER_DEPENDENCY = CorePackage.CLASS__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__NAMESPACE = CorePackage.CLASS__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__IMPORTER = CorePackage.CLASS__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__STEREOTYPE = CorePackage.CLASS__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__DOCUMENT = CorePackage.CLASS__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__DESCRIPTION = CorePackage.CLASS__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__RESPONSIBLE_PARTY = CorePackage.CLASS__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__ELEMENT_NODE = CorePackage.CLASS__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__SET = CorePackage.CLASS__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__RENDERED_OBJECT = CorePackage.CLASS__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__VOCABULARY_ELEMENT = CorePackage.CLASS__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__MEASUREMENT = CorePackage.CLASS__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__CHANGE_REQUEST = CorePackage.CLASS__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__DASDL_PROPERTY = CorePackage.CLASS__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__FEATURE = CorePackage.CLASS__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__STRUCTURAL_FEATURE = CorePackage.CLASS__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__PARAMETER = CorePackage.CLASS__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__GENERALIZATION = CorePackage.CLASS__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__SPECIALIZATION = CorePackage.CLASS__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__INSTANCE = CorePackage.CLASS__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__ALIAS = CorePackage.CLASS__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__EXPRESSION_NODE = CorePackage.CLASS__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__MAPPING_FROM = CorePackage.CLASS__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__MAPPING_TO = CorePackage.CLASS__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__CLASSIFIER_MAP = CorePackage.CLASS__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__CF_MAP = CorePackage.CLASS__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__DOMAIN = CorePackage.CLASS__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__SIMPLE_DIMENSION = CorePackage.CLASS__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY__INDEX = CorePackage.CLASS__INDEX;

    /**
     * The number of structural features of the '<em>Entity</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ENTITY_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.foundation.er.impl.NonuniqueKeyImpl
     * <em>Nonunique Key</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.foundation.er.impl.NonuniqueKeyImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getNonuniqueKey()
     * @generated
     */
    int NONUNIQUE_KEY = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__NAME = KeysindexesPackage.INDEX__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__VISIBILITY = KeysindexesPackage.INDEX__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__CLIENT_DEPENDENCY = KeysindexesPackage.INDEX__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__SUPPLIER_DEPENDENCY = KeysindexesPackage.INDEX__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__CONSTRAINT = KeysindexesPackage.INDEX__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__NAMESPACE = KeysindexesPackage.INDEX__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__IMPORTER = KeysindexesPackage.INDEX__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__STEREOTYPE = KeysindexesPackage.INDEX__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__TAGGED_VALUE = KeysindexesPackage.INDEX__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__DOCUMENT = KeysindexesPackage.INDEX__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__DESCRIPTION = KeysindexesPackage.INDEX__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__RESPONSIBLE_PARTY = KeysindexesPackage.INDEX__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__ELEMENT_NODE = KeysindexesPackage.INDEX__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__SET = KeysindexesPackage.INDEX__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__RENDERED_OBJECT = KeysindexesPackage.INDEX__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__VOCABULARY_ELEMENT = KeysindexesPackage.INDEX__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__MEASUREMENT = KeysindexesPackage.INDEX__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__CHANGE_REQUEST = KeysindexesPackage.INDEX__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__DASDL_PROPERTY = KeysindexesPackage.INDEX__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Is Partitioning</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__IS_PARTITIONING = KeysindexesPackage.INDEX__IS_PARTITIONING;

    /**
     * The feature id for the '<em><b>Is Sorted</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__IS_SORTED = KeysindexesPackage.INDEX__IS_SORTED;

    /**
     * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__IS_UNIQUE = KeysindexesPackage.INDEX__IS_UNIQUE;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__INDEXED_FEATURE = KeysindexesPackage.INDEX__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Spanned Class</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY__SPANNED_CLASS = KeysindexesPackage.INDEX__SPANNED_CLASS;

    /**
     * The number of structural features of the '<em>Nonunique Key</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NONUNIQUE_KEY_FEATURE_COUNT = KeysindexesPackage.INDEX_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.foundation.er.impl.CandidateKeyImpl
     * <em>Candidate Key</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.foundation.er.impl.CandidateKeyImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getCandidateKey()
     * @generated
     */
    int CANDIDATE_KEY = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__NAME = KeysindexesPackage.UNIQUE_KEY__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__VISIBILITY = KeysindexesPackage.UNIQUE_KEY__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__CLIENT_DEPENDENCY = KeysindexesPackage.UNIQUE_KEY__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__SUPPLIER_DEPENDENCY = KeysindexesPackage.UNIQUE_KEY__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__CONSTRAINT = KeysindexesPackage.UNIQUE_KEY__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__NAMESPACE = KeysindexesPackage.UNIQUE_KEY__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__IMPORTER = KeysindexesPackage.UNIQUE_KEY__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__STEREOTYPE = KeysindexesPackage.UNIQUE_KEY__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__TAGGED_VALUE = KeysindexesPackage.UNIQUE_KEY__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__DOCUMENT = KeysindexesPackage.UNIQUE_KEY__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__DESCRIPTION = KeysindexesPackage.UNIQUE_KEY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__RESPONSIBLE_PARTY = KeysindexesPackage.UNIQUE_KEY__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__ELEMENT_NODE = KeysindexesPackage.UNIQUE_KEY__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__SET = KeysindexesPackage.UNIQUE_KEY__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__RENDERED_OBJECT = KeysindexesPackage.UNIQUE_KEY__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__VOCABULARY_ELEMENT = KeysindexesPackage.UNIQUE_KEY__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__MEASUREMENT = KeysindexesPackage.UNIQUE_KEY__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__CHANGE_REQUEST = KeysindexesPackage.UNIQUE_KEY__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__DASDL_PROPERTY = KeysindexesPackage.UNIQUE_KEY__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__FEATURE = KeysindexesPackage.UNIQUE_KEY__FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__KEY_RELATIONSHIP = KeysindexesPackage.UNIQUE_KEY__KEY_RELATIONSHIP;

    /**
     * The number of structural features of the '<em>Candidate Key</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY_FEATURE_COUNT = KeysindexesPackage.UNIQUE_KEY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.foundation.er.impl.ForeignKeyImpl
     * <em>Foreign Key</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.foundation.er.impl.ForeignKeyImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getForeignKey()
     * @generated
     */
    int FOREIGN_KEY = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__NAME = KeysindexesPackage.KEY_RELATIONSHIP__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__VISIBILITY = KeysindexesPackage.KEY_RELATIONSHIP__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__CLIENT_DEPENDENCY = KeysindexesPackage.KEY_RELATIONSHIP__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__SUPPLIER_DEPENDENCY = KeysindexesPackage.KEY_RELATIONSHIP__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__CONSTRAINT = KeysindexesPackage.KEY_RELATIONSHIP__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__NAMESPACE = KeysindexesPackage.KEY_RELATIONSHIP__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__IMPORTER = KeysindexesPackage.KEY_RELATIONSHIP__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__STEREOTYPE = KeysindexesPackage.KEY_RELATIONSHIP__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__TAGGED_VALUE = KeysindexesPackage.KEY_RELATIONSHIP__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__DOCUMENT = KeysindexesPackage.KEY_RELATIONSHIP__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__DESCRIPTION = KeysindexesPackage.KEY_RELATIONSHIP__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__RESPONSIBLE_PARTY = KeysindexesPackage.KEY_RELATIONSHIP__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__ELEMENT_NODE = KeysindexesPackage.KEY_RELATIONSHIP__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__SET = KeysindexesPackage.KEY_RELATIONSHIP__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__RENDERED_OBJECT = KeysindexesPackage.KEY_RELATIONSHIP__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__VOCABULARY_ELEMENT = KeysindexesPackage.KEY_RELATIONSHIP__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__MEASUREMENT = KeysindexesPackage.KEY_RELATIONSHIP__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__CHANGE_REQUEST = KeysindexesPackage.KEY_RELATIONSHIP__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__DASDL_PROPERTY = KeysindexesPackage.KEY_RELATIONSHIP__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__FEATURE = KeysindexesPackage.KEY_RELATIONSHIP__FEATURE;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__UNIQUE_KEY = KeysindexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Relationship End</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__RELATIONSHIP_END = KeysindexesPackage.KEY_RELATIONSHIP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Foreign Key</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY_FEATURE_COUNT = KeysindexesPackage.KEY_RELATIONSHIP_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.foundation.er.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.foundation.er.impl.DomainImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getDomain()
     * @generated
     */
    int DOMAIN = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__NAME = CorePackage.CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__VISIBILITY = CorePackage.CLASSIFIER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__CLIENT_DEPENDENCY = CorePackage.CLASSIFIER__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__SUPPLIER_DEPENDENCY = CorePackage.CLASSIFIER__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__CONSTRAINT = CorePackage.CLASSIFIER__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__NAMESPACE = CorePackage.CLASSIFIER__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__IMPORTER = CorePackage.CLASSIFIER__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__STEREOTYPE = CorePackage.CLASSIFIER__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__TAGGED_VALUE = CorePackage.CLASSIFIER__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__DOCUMENT = CorePackage.CLASSIFIER__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__DESCRIPTION = CorePackage.CLASSIFIER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__RESPONSIBLE_PARTY = CorePackage.CLASSIFIER__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__ELEMENT_NODE = CorePackage.CLASSIFIER__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__SET = CorePackage.CLASSIFIER__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__RENDERED_OBJECT = CorePackage.CLASSIFIER__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__VOCABULARY_ELEMENT = CorePackage.CLASSIFIER__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__MEASUREMENT = CorePackage.CLASSIFIER__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__CHANGE_REQUEST = CorePackage.CLASSIFIER__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__DASDL_PROPERTY = CorePackage.CLASSIFIER__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__OWNED_ELEMENT = CorePackage.CLASSIFIER__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__IS_ABSTRACT = CorePackage.CLASSIFIER__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__FEATURE = CorePackage.CLASSIFIER__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__STRUCTURAL_FEATURE = CorePackage.CLASSIFIER__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__PARAMETER = CorePackage.CLASSIFIER__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__GENERALIZATION = CorePackage.CLASSIFIER__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__SPECIALIZATION = CorePackage.CLASSIFIER__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__INSTANCE = CorePackage.CLASSIFIER__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__ALIAS = CorePackage.CLASSIFIER__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__EXPRESSION_NODE = CorePackage.CLASSIFIER__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__MAPPING_FROM = CorePackage.CLASSIFIER__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__MAPPING_TO = CorePackage.CLASSIFIER__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__CLASSIFIER_MAP = CorePackage.CLASSIFIER__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__CF_MAP = CorePackage.CLASSIFIER__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__DOMAIN = CorePackage.CLASSIFIER__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__SIMPLE_DIMENSION = CorePackage.CLASSIFIER__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Default</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__DEFAULT = CorePackage.CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Validation Rule</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__VALIDATION_RULE = CorePackage.CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Base Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN__BASE_TYPE = CorePackage.CLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Domain</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOMAIN_FEATURE_COUNT = CorePackage.CLASSIFIER_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmx.foundation.er.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.foundation.er.impl.AttributeImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAME = CorePackage.ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__SUPPLIER_DEPENDENCY = CorePackage.ATTRIBUTE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__STEREOTYPE = CorePackage.ATTRIBUTE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DOCUMENT = CorePackage.ATTRIBUTE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DESCRIPTION = CorePackage.ATTRIBUTE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__RESPONSIBLE_PARTY = CorePackage.ATTRIBUTE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ELEMENT_NODE = CorePackage.ATTRIBUTE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__SET = CorePackage.ATTRIBUTE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__RENDERED_OBJECT = CorePackage.ATTRIBUTE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__VOCABULARY_ELEMENT = CorePackage.ATTRIBUTE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__MEASUREMENT = CorePackage.ATTRIBUTE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__CHANGE_REQUEST = CorePackage.ATTRIBUTE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DASDL_PROPERTY = CorePackage.ATTRIBUTE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__OWNER = CorePackage.ATTRIBUTE__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__FEATURE_NODE = CorePackage.ATTRIBUTE__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__FEATURE_MAP = CorePackage.ATTRIBUTE__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__CF_MAP = CorePackage.ATTRIBUTE__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TYPE = CorePackage.ATTRIBUTE__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__SLOT = CorePackage.ATTRIBUTE__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DISCRIMINATED_UNION = CorePackage.ATTRIBUTE__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__INDEXED_FEATURE = CorePackage.ATTRIBUTE__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__KEY_RELATIONSHIP = CorePackage.ATTRIBUTE__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__UNIQUE_KEY = CorePackage.ATTRIBUTE__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DATA_ITEM = CorePackage.ATTRIBUTE__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE__REMAP = CorePackage.ATTRIBUTE__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

    /**
     * The number of structural features of the '<em>Attribute</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.foundation.er.impl.RelationshipImpl
     * <em>Relationship</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.foundation.er.impl.RelationshipImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getRelationship()
     * @generated
     */
    int RELATIONSHIP = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__NAME = RelationshipsPackage.ASSOCIATION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__VISIBILITY = RelationshipsPackage.ASSOCIATION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__CLIENT_DEPENDENCY = RelationshipsPackage.ASSOCIATION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__SUPPLIER_DEPENDENCY = RelationshipsPackage.ASSOCIATION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__CONSTRAINT = RelationshipsPackage.ASSOCIATION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__NAMESPACE = RelationshipsPackage.ASSOCIATION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__IMPORTER = RelationshipsPackage.ASSOCIATION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__STEREOTYPE = RelationshipsPackage.ASSOCIATION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__TAGGED_VALUE = RelationshipsPackage.ASSOCIATION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__DOCUMENT = RelationshipsPackage.ASSOCIATION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__DESCRIPTION = RelationshipsPackage.ASSOCIATION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__RESPONSIBLE_PARTY = RelationshipsPackage.ASSOCIATION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__ELEMENT_NODE = RelationshipsPackage.ASSOCIATION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__SET = RelationshipsPackage.ASSOCIATION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__RENDERED_OBJECT = RelationshipsPackage.ASSOCIATION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__VOCABULARY_ELEMENT = RelationshipsPackage.ASSOCIATION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__MEASUREMENT = RelationshipsPackage.ASSOCIATION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__CHANGE_REQUEST = RelationshipsPackage.ASSOCIATION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__DASDL_PROPERTY = RelationshipsPackage.ASSOCIATION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__OWNED_ELEMENT = RelationshipsPackage.ASSOCIATION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__IS_ABSTRACT = RelationshipsPackage.ASSOCIATION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__FEATURE = RelationshipsPackage.ASSOCIATION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__STRUCTURAL_FEATURE = RelationshipsPackage.ASSOCIATION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__PARAMETER = RelationshipsPackage.ASSOCIATION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__GENERALIZATION = RelationshipsPackage.ASSOCIATION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__SPECIALIZATION = RelationshipsPackage.ASSOCIATION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__INSTANCE = RelationshipsPackage.ASSOCIATION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__ALIAS = RelationshipsPackage.ASSOCIATION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__EXPRESSION_NODE = RelationshipsPackage.ASSOCIATION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__MAPPING_FROM = RelationshipsPackage.ASSOCIATION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__MAPPING_TO = RelationshipsPackage.ASSOCIATION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__CLASSIFIER_MAP = RelationshipsPackage.ASSOCIATION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__CF_MAP = RelationshipsPackage.ASSOCIATION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__DOMAIN = RelationshipsPackage.ASSOCIATION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__SIMPLE_DIMENSION = RelationshipsPackage.ASSOCIATION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP__INDEX = RelationshipsPackage.ASSOCIATION__INDEX;

    /**
     * The number of structural features of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_FEATURE_COUNT = RelationshipsPackage.ASSOCIATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.foundation.er.impl.RelationshipEndImpl <em>Relationship End</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.foundation.er.impl.RelationshipEndImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getRelationshipEnd()
     * @generated
     */
    int RELATIONSHIP_END = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__NAME = RelationshipsPackage.ASSOCIATION_END__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__VISIBILITY = RelationshipsPackage.ASSOCIATION_END__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__CLIENT_DEPENDENCY = RelationshipsPackage.ASSOCIATION_END__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__SUPPLIER_DEPENDENCY = RelationshipsPackage.ASSOCIATION_END__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__CONSTRAINT = RelationshipsPackage.ASSOCIATION_END__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__NAMESPACE = RelationshipsPackage.ASSOCIATION_END__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__IMPORTER = RelationshipsPackage.ASSOCIATION_END__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__STEREOTYPE = RelationshipsPackage.ASSOCIATION_END__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__TAGGED_VALUE = RelationshipsPackage.ASSOCIATION_END__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__DOCUMENT = RelationshipsPackage.ASSOCIATION_END__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__DESCRIPTION = RelationshipsPackage.ASSOCIATION_END__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__RESPONSIBLE_PARTY = RelationshipsPackage.ASSOCIATION_END__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__ELEMENT_NODE = RelationshipsPackage.ASSOCIATION_END__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__SET = RelationshipsPackage.ASSOCIATION_END__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__RENDERED_OBJECT = RelationshipsPackage.ASSOCIATION_END__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__VOCABULARY_ELEMENT = RelationshipsPackage.ASSOCIATION_END__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__MEASUREMENT = RelationshipsPackage.ASSOCIATION_END__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__CHANGE_REQUEST = RelationshipsPackage.ASSOCIATION_END__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__DASDL_PROPERTY = RelationshipsPackage.ASSOCIATION_END__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__OWNER_SCOPE = RelationshipsPackage.ASSOCIATION_END__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__OWNER = RelationshipsPackage.ASSOCIATION_END__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__FEATURE_NODE = RelationshipsPackage.ASSOCIATION_END__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__FEATURE_MAP = RelationshipsPackage.ASSOCIATION_END__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__CF_MAP = RelationshipsPackage.ASSOCIATION_END__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__CHANGEABILITY = RelationshipsPackage.ASSOCIATION_END__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__MULTIPLICITY = RelationshipsPackage.ASSOCIATION_END__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__ORDERING = RelationshipsPackage.ASSOCIATION_END__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__TARGET_SCOPE = RelationshipsPackage.ASSOCIATION_END__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__TYPE = RelationshipsPackage.ASSOCIATION_END__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__SLOT = RelationshipsPackage.ASSOCIATION_END__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__DISCRIMINATED_UNION = RelationshipsPackage.ASSOCIATION_END__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__INDEXED_FEATURE = RelationshipsPackage.ASSOCIATION_END__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__KEY_RELATIONSHIP = RelationshipsPackage.ASSOCIATION_END__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__UNIQUE_KEY = RelationshipsPackage.ASSOCIATION_END__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__DATA_ITEM = RelationshipsPackage.ASSOCIATION_END__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__REMAP = RelationshipsPackage.ASSOCIATION_END__REMAP;

    /**
     * The feature id for the '<em><b>Aggregation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__AGGREGATION = RelationshipsPackage.ASSOCIATION_END__AGGREGATION;

    /**
     * The feature id for the '<em><b>Is Navigable</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__IS_NAVIGABLE = RelationshipsPackage.ASSOCIATION_END__IS_NAVIGABLE;

    /**
     * The feature id for the '<em><b>Delete</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__DELETE = RelationshipsPackage.ASSOCIATION_END_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Update</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__UPDATE = RelationshipsPackage.ASSOCIATION_END_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Insert</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__INSERT = RelationshipsPackage.ASSOCIATION_END_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Foreign Key</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__FOREIGN_KEY = RelationshipsPackage.ASSOCIATION_END_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Relationship End</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END_FEATURE_COUNT = RelationshipsPackage.ASSOCIATION_END_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.foundation.er.impl.ModelLibraryImpl
     * <em>Model Library</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.foundation.er.impl.ModelLibraryImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getModelLibrary()
     * @generated
     */
    int MODEL_LIBRARY = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__NAME = CorePackage.SUBSYSTEM__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__VISIBILITY = CorePackage.SUBSYSTEM__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__CLIENT_DEPENDENCY = CorePackage.SUBSYSTEM__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__SUPPLIER_DEPENDENCY = CorePackage.SUBSYSTEM__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__CONSTRAINT = CorePackage.SUBSYSTEM__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__NAMESPACE = CorePackage.SUBSYSTEM__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__IMPORTER = CorePackage.SUBSYSTEM__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__STEREOTYPE = CorePackage.SUBSYSTEM__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__TAGGED_VALUE = CorePackage.SUBSYSTEM__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__DOCUMENT = CorePackage.SUBSYSTEM__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__DESCRIPTION = CorePackage.SUBSYSTEM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__RESPONSIBLE_PARTY = CorePackage.SUBSYSTEM__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__ELEMENT_NODE = CorePackage.SUBSYSTEM__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__SET = CorePackage.SUBSYSTEM__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__RENDERED_OBJECT = CorePackage.SUBSYSTEM__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__VOCABULARY_ELEMENT = CorePackage.SUBSYSTEM__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__MEASUREMENT = CorePackage.SUBSYSTEM__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__CHANGE_REQUEST = CorePackage.SUBSYSTEM__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__DASDL_PROPERTY = CorePackage.SUBSYSTEM__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__OWNED_ELEMENT = CorePackage.SUBSYSTEM__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__IS_ABSTRACT = CorePackage.SUBSYSTEM__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__FEATURE = CorePackage.SUBSYSTEM__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__STRUCTURAL_FEATURE = CorePackage.SUBSYSTEM__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__PARAMETER = CorePackage.SUBSYSTEM__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__GENERALIZATION = CorePackage.SUBSYSTEM__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__SPECIALIZATION = CorePackage.SUBSYSTEM__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__INSTANCE = CorePackage.SUBSYSTEM__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__ALIAS = CorePackage.SUBSYSTEM__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__EXPRESSION_NODE = CorePackage.SUBSYSTEM__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__MAPPING_FROM = CorePackage.SUBSYSTEM__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__MAPPING_TO = CorePackage.SUBSYSTEM__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__CLASSIFIER_MAP = CorePackage.SUBSYSTEM__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__CF_MAP = CorePackage.SUBSYSTEM__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__DOMAIN = CorePackage.SUBSYSTEM__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__SIMPLE_DIMENSION = CorePackage.SUBSYSTEM__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__IMPORTED_ELEMENT = CorePackage.SUBSYSTEM__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY__DATA_MANAGER = CorePackage.SUBSYSTEM__DATA_MANAGER;

    /**
     * The number of structural features of the '<em>Model Library</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_LIBRARY_FEATURE_COUNT = CorePackage.SUBSYSTEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.foundation.er.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.foundation.er.impl.ModelImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getModel()
     * @generated
     */
    int MODEL = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__NAME = CorePackage.MODEL__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__VISIBILITY = CorePackage.MODEL__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__CLIENT_DEPENDENCY = CorePackage.MODEL__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__SUPPLIER_DEPENDENCY = CorePackage.MODEL__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__CONSTRAINT = CorePackage.MODEL__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__NAMESPACE = CorePackage.MODEL__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__IMPORTER = CorePackage.MODEL__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__STEREOTYPE = CorePackage.MODEL__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__TAGGED_VALUE = CorePackage.MODEL__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__DOCUMENT = CorePackage.MODEL__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__DESCRIPTION = CorePackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__RESPONSIBLE_PARTY = CorePackage.MODEL__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__ELEMENT_NODE = CorePackage.MODEL__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__SET = CorePackage.MODEL__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__RENDERED_OBJECT = CorePackage.MODEL__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__VOCABULARY_ELEMENT = CorePackage.MODEL__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__MEASUREMENT = CorePackage.MODEL__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__CHANGE_REQUEST = CorePackage.MODEL__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__DASDL_PROPERTY = CorePackage.MODEL__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__OWNED_ELEMENT = CorePackage.MODEL__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__IMPORTED_ELEMENT = CorePackage.MODEL__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__DATA_MANAGER = CorePackage.MODEL__DATA_MANAGER;

    /**
     * The number of structural features of the '<em>Model</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_FEATURE_COUNT = CorePackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.foundation.er.impl.SubjectAreaImpl
     * <em>Subject Area</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.foundation.er.impl.SubjectAreaImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getSubjectArea()
     * @generated
     */
    int SUBJECT_AREA = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__NAME = CorePackage.PACKAGE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__SUPPLIER_DEPENDENCY = CorePackage.PACKAGE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__IMPORTER = CorePackage.PACKAGE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__STEREOTYPE = CorePackage.PACKAGE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__DOCUMENT = CorePackage.PACKAGE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__DESCRIPTION = CorePackage.PACKAGE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__RESPONSIBLE_PARTY = CorePackage.PACKAGE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__ELEMENT_NODE = CorePackage.PACKAGE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__SET = CorePackage.PACKAGE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__RENDERED_OBJECT = CorePackage.PACKAGE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__VOCABULARY_ELEMENT = CorePackage.PACKAGE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__MEASUREMENT = CorePackage.PACKAGE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__CHANGE_REQUEST = CorePackage.PACKAGE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__DASDL_PROPERTY = CorePackage.PACKAGE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA__DATA_MANAGER = CorePackage.PACKAGE__DATA_MANAGER;

    /**
     * The number of structural features of the '<em>Subject Area</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_AREA_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.foundation.er.impl.PrimaryKeyImpl
     * <em>Primary Key</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.foundation.er.impl.PrimaryKeyImpl
     * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getPrimaryKey()
     * @generated
     */
    int PRIMARY_KEY = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__NAME = CANDIDATE_KEY__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__VISIBILITY = CANDIDATE_KEY__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__CLIENT_DEPENDENCY = CANDIDATE_KEY__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__SUPPLIER_DEPENDENCY = CANDIDATE_KEY__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__CONSTRAINT = CANDIDATE_KEY__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__NAMESPACE = CANDIDATE_KEY__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__IMPORTER = CANDIDATE_KEY__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__STEREOTYPE = CANDIDATE_KEY__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__TAGGED_VALUE = CANDIDATE_KEY__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__DOCUMENT = CANDIDATE_KEY__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__DESCRIPTION = CANDIDATE_KEY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__RESPONSIBLE_PARTY = CANDIDATE_KEY__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__ELEMENT_NODE = CANDIDATE_KEY__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__SET = CANDIDATE_KEY__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__RENDERED_OBJECT = CANDIDATE_KEY__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__VOCABULARY_ELEMENT = CANDIDATE_KEY__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__MEASUREMENT = CANDIDATE_KEY__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__CHANGE_REQUEST = CANDIDATE_KEY__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__DASDL_PROPERTY = CANDIDATE_KEY__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__FEATURE = CANDIDATE_KEY__FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__KEY_RELATIONSHIP = CANDIDATE_KEY__KEY_RELATIONSHIP;

    /**
     * The number of structural features of the '<em>Primary Key</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY_FEATURE_COUNT = CANDIDATE_KEY_FEATURE_COUNT + 0;

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.foundation.er.Entity <em>Entity</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Entity</em>'.
     * @see orgomg.cwmx.foundation.er.Entity
     * @generated
     */
    EClass getEntity();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.foundation.er.NonuniqueKey <em>Nonunique Key</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Nonunique Key</em>'.
     * @see orgomg.cwmx.foundation.er.NonuniqueKey
     * @generated
     */
    EClass getNonuniqueKey();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.foundation.er.CandidateKey <em>Candidate Key</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Candidate Key</em>'.
     * @see orgomg.cwmx.foundation.er.CandidateKey
     * @generated
     */
    EClass getCandidateKey();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.foundation.er.ForeignKey <em>Foreign Key</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Foreign Key</em>'.
     * @see orgomg.cwmx.foundation.er.ForeignKey
     * @generated
     */
    EClass getForeignKey();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.foundation.er.ForeignKey#getRelationshipEnd
     * <em>Relationship End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Relationship End</em>'.
     * @see orgomg.cwmx.foundation.er.ForeignKey#getRelationshipEnd()
     * @see #getForeignKey()
     * @generated
     */
    EReference getForeignKey_RelationshipEnd();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.foundation.er.Domain <em>Domain</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Domain</em>'.
     * @see orgomg.cwmx.foundation.er.Domain
     * @generated
     */
    EClass getDomain();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.foundation.er.Domain#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default</em>'.
     * @see orgomg.cwmx.foundation.er.Domain#getDefault()
     * @see #getDomain()
     * @generated
     */
    EReference getDomain_Default();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.foundation.er.Domain#getValidationRule <em>Validation Rule</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Validation Rule</em>'.
     * @see orgomg.cwmx.foundation.er.Domain#getValidationRule()
     * @see #getDomain()
     * @generated
     */
    EReference getDomain_ValidationRule();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.foundation.er.Domain#getBaseType <em>Base Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Type</em>'.
     * @see orgomg.cwmx.foundation.er.Domain#getBaseType()
     * @see #getDomain()
     * @generated
     */
    EReference getDomain_BaseType();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.foundation.er.Attribute <em>Attribute</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Attribute</em>'.
     * @see orgomg.cwmx.foundation.er.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.foundation.er.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Relationship</em>'.
     * @see orgomg.cwmx.foundation.er.Relationship
     * @generated
     */
    EClass getRelationship();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.foundation.er.RelationshipEnd
     * <em>Relationship End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Relationship End</em>'.
     * @see orgomg.cwmx.foundation.er.RelationshipEnd
     * @generated
     */
    EClass getRelationshipEnd();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.foundation.er.RelationshipEnd#getDelete <em>Delete</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Delete</em>'.
     * @see orgomg.cwmx.foundation.er.RelationshipEnd#getDelete()
     * @see #getRelationshipEnd()
     * @generated
     */
    EReference getRelationshipEnd_Delete();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.foundation.er.RelationshipEnd#getUpdate <em>Update</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Update</em>'.
     * @see orgomg.cwmx.foundation.er.RelationshipEnd#getUpdate()
     * @see #getRelationshipEnd()
     * @generated
     */
    EReference getRelationshipEnd_Update();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.foundation.er.RelationshipEnd#getInsert <em>Insert</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Insert</em>'.
     * @see orgomg.cwmx.foundation.er.RelationshipEnd#getInsert()
     * @see #getRelationshipEnd()
     * @generated
     */
    EReference getRelationshipEnd_Insert();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.foundation.er.RelationshipEnd#getForeignKey <em>Foreign Key</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Foreign Key</em>'.
     * @see orgomg.cwmx.foundation.er.RelationshipEnd#getForeignKey()
     * @see #getRelationshipEnd()
     * @generated
     */
    EReference getRelationshipEnd_ForeignKey();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.foundation.er.ModelLibrary <em>Model Library</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Library</em>'.
     * @see orgomg.cwmx.foundation.er.ModelLibrary
     * @generated
     */
    EClass getModelLibrary();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.foundation.er.Model <em>Model</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Model</em>'.
     * @see orgomg.cwmx.foundation.er.Model
     * @generated
     */
    EClass getModel();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.foundation.er.SubjectArea <em>Subject Area</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Subject Area</em>'.
     * @see orgomg.cwmx.foundation.er.SubjectArea
     * @generated
     */
    EClass getSubjectArea();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.foundation.er.PrimaryKey <em>Primary Key</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Primary Key</em>'.
     * @see orgomg.cwmx.foundation.er.PrimaryKey
     * @generated
     */
    EClass getPrimaryKey();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ErFactory getErFactory();

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
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.EntityImpl <em>Entity</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.EntityImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getEntity()
         * @generated
         */
        EClass ENTITY = eINSTANCE.getEntity();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.NonuniqueKeyImpl <em>Nonunique Key</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.NonuniqueKeyImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getNonuniqueKey()
         * @generated
         */
        EClass NONUNIQUE_KEY = eINSTANCE.getNonuniqueKey();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.CandidateKeyImpl <em>Candidate Key</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.CandidateKeyImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getCandidateKey()
         * @generated
         */
        EClass CANDIDATE_KEY = eINSTANCE.getCandidateKey();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.ForeignKeyImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getForeignKey()
         * @generated
         */
        EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

        /**
         * The meta object literal for the '<em><b>Relationship End</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference FOREIGN_KEY__RELATIONSHIP_END = eINSTANCE.getForeignKey_RelationshipEnd();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.DomainImpl <em>Domain</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.DomainImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getDomain()
         * @generated
         */
        EClass DOMAIN = eINSTANCE.getDomain();

        /**
         * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DOMAIN__DEFAULT = eINSTANCE.getDomain_Default();

        /**
         * The meta object literal for the '<em><b>Validation Rule</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference DOMAIN__VALIDATION_RULE = eINSTANCE.getDomain_ValidationRule();

        /**
         * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DOMAIN__BASE_TYPE = eINSTANCE.getDomain_BaseType();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.foundation.er.impl.AttributeImpl
         * <em>Attribute</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.foundation.er.impl.AttributeImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.RelationshipImpl <em>Relationship</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.RelationshipImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getRelationship()
         * @generated
         */
        EClass RELATIONSHIP = eINSTANCE.getRelationship();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.RelationshipEndImpl <em>Relationship End</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.RelationshipEndImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getRelationshipEnd()
         * @generated
         */
        EClass RELATIONSHIP_END = eINSTANCE.getRelationshipEnd();

        /**
         * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP_END__DELETE = eINSTANCE.getRelationshipEnd_Delete();

        /**
         * The meta object literal for the '<em><b>Update</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP_END__UPDATE = eINSTANCE.getRelationshipEnd_Update();

        /**
         * The meta object literal for the '<em><b>Insert</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP_END__INSERT = eINSTANCE.getRelationshipEnd_Insert();

        /**
         * The meta object literal for the '<em><b>Foreign Key</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP_END__FOREIGN_KEY = eINSTANCE.getRelationshipEnd_ForeignKey();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.ModelLibraryImpl <em>Model Library</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.ModelLibraryImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getModelLibrary()
         * @generated
         */
        EClass MODEL_LIBRARY = eINSTANCE.getModelLibrary();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.ModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.ModelImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getModel()
         * @generated
         */
        EClass MODEL = eINSTANCE.getModel();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.SubjectAreaImpl <em>Subject Area</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.SubjectAreaImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getSubjectArea()
         * @generated
         */
        EClass SUBJECT_AREA = eINSTANCE.getSubjectArea();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.foundation.er.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.foundation.er.impl.PrimaryKeyImpl
         * @see orgomg.cwmx.foundation.er.impl.ErPackageImpl#getPrimaryKey()
         * @generated
         */
        EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

    }

} // ErPackage
