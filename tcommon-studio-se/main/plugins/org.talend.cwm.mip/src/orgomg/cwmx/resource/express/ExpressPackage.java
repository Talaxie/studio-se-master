/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.resource.multidimensional.MultidimensionalPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc --> The Oracle Express package is
 * an extension of the Multidimensional package. It represents the physical data
 * model for an Oracle Express Database.
 * 
 * The classes in this package can be used as either sources or targets of data
 * in the data warehouse, and are available to provide a physical implementation
 * of the OLAP data model.
 * 
 * The Express package depends on the following packages:
 * 
 * org.omg::CWM::ObjectModel::Core org.omg::CWM::Foundation::SoftwareDeployment
 * org.omg::CWM::Resource::Multidimensional
 * 
 * OCL Representation of Express Constraints
 * 
 * [C-1] An AggMap must be owned by a Database context AggMap inv:
 * self.namespace->size = 1 and self.namespace.oclIsKindOf(Database)
 * 
 * [C-2] A Model must be owned by a Database context Model inv:
 * self.namespace->size = 1 and self.namespace.oclIsKindOf(Database)
 * 
 * [C-3] A Program must be owned by a Database context Program inv:
 * self.namespace->size = 1 and self.namespace.oclIsKindOf(Database)
 * 
 * [C-4] A Worksheet must be owned by a Database context Wor ksheet inv:
 * self.namespace->size = 1 and self.namespace.oclIsKindOf(Database)
 * 
 * <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.express.ExpressFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "express";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///orgomg/cwmx/resource/express.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "orgomg.cwmx.resource.express";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    ExpressPackage eINSTANCE = orgomg.cwmx.resource.express.impl.ExpressPackageImpl.init();

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.DimensionImpl <em>Dimension</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.DimensionImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getDimension()
     * @generated
     */
    int DIMENSION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__NAME = MultidimensionalPackage.DIMENSION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__VISIBILITY = MultidimensionalPackage.DIMENSION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__CONSTRAINT = MultidimensionalPackage.DIMENSION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__NAMESPACE = MultidimensionalPackage.DIMENSION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__IMPORTER = MultidimensionalPackage.DIMENSION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__STEREOTYPE = MultidimensionalPackage.DIMENSION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__TAGGED_VALUE = MultidimensionalPackage.DIMENSION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__DOCUMENT = MultidimensionalPackage.DIMENSION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__DESCRIPTION = MultidimensionalPackage.DIMENSION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__ELEMENT_NODE = MultidimensionalPackage.DIMENSION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__SET = MultidimensionalPackage.DIMENSION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__RENDERED_OBJECT = MultidimensionalPackage.DIMENSION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__MEASUREMENT = MultidimensionalPackage.DIMENSION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__CHANGE_REQUEST = MultidimensionalPackage.DIMENSION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__DASDL_PROPERTY = MultidimensionalPackage.DIMENSION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__OWNED_ELEMENT = MultidimensionalPackage.DIMENSION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__IS_ABSTRACT = MultidimensionalPackage.DIMENSION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__FEATURE = MultidimensionalPackage.DIMENSION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__STRUCTURAL_FEATURE = MultidimensionalPackage.DIMENSION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__PARAMETER = MultidimensionalPackage.DIMENSION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__GENERALIZATION = MultidimensionalPackage.DIMENSION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__SPECIALIZATION = MultidimensionalPackage.DIMENSION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__INSTANCE = MultidimensionalPackage.DIMENSION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__ALIAS = MultidimensionalPackage.DIMENSION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__EXPRESSION_NODE = MultidimensionalPackage.DIMENSION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__MAPPING_FROM = MultidimensionalPackage.DIMENSION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__MAPPING_TO = MultidimensionalPackage.DIMENSION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__CLASSIFIER_MAP = MultidimensionalPackage.DIMENSION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__CF_MAP = MultidimensionalPackage.DIMENSION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__DOMAIN = MultidimensionalPackage.DIMENSION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__SIMPLE_DIMENSION = MultidimensionalPackage.DIMENSION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__INDEX = MultidimensionalPackage.DIMENSION__INDEX;

    /**
     * The feature id for the '<em><b>Dimensioned Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__DIMENSIONED_OBJECT = MultidimensionalPackage.DIMENSION__DIMENSIONED_OBJECT;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__COMPOSITE = MultidimensionalPackage.DIMENSION__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__COMPONENT = MultidimensionalPackage.DIMENSION__COMPONENT;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__SCHEMA = MultidimensionalPackage.DIMENSION__SCHEMA;

    /**
     * The feature id for the '<em><b>Member Set</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__MEMBER_SET = MultidimensionalPackage.DIMENSION__MEMBER_SET;

    /**
     * The feature id for the '<em><b>Relation</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__RELATION = MultidimensionalPackage.DIMENSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Column Dimension In Worksheet</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET = MultidimensionalPackage.DIMENSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Row Dimension In Worksheet</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__ROW_DIMENSION_IN_WORKSHEET = MultidimensionalPackage.DIMENSION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Value Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__VALUE_SET = MultidimensionalPackage.DIMENSION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Agg Map Component</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__AGG_MAP_COMPONENT = MultidimensionalPackage.DIMENSION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Dimension</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION_FEATURE_COUNT = MultidimensionalPackage.DIMENSION_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.DatabaseImpl <em>Database</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.DatabaseImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getDatabase()
     * @generated
     */
    int DATABASE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__NAME = MultidimensionalPackage.SCHEMA__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__VISIBILITY = MultidimensionalPackage.SCHEMA__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__CLIENT_DEPENDENCY = MultidimensionalPackage.SCHEMA__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__SUPPLIER_DEPENDENCY = MultidimensionalPackage.SCHEMA__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__CONSTRAINT = MultidimensionalPackage.SCHEMA__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__NAMESPACE = MultidimensionalPackage.SCHEMA__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__IMPORTER = MultidimensionalPackage.SCHEMA__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__STEREOTYPE = MultidimensionalPackage.SCHEMA__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__TAGGED_VALUE = MultidimensionalPackage.SCHEMA__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__DOCUMENT = MultidimensionalPackage.SCHEMA__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__DESCRIPTION = MultidimensionalPackage.SCHEMA__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__RESPONSIBLE_PARTY = MultidimensionalPackage.SCHEMA__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__ELEMENT_NODE = MultidimensionalPackage.SCHEMA__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__SET = MultidimensionalPackage.SCHEMA__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__RENDERED_OBJECT = MultidimensionalPackage.SCHEMA__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__VOCABULARY_ELEMENT = MultidimensionalPackage.SCHEMA__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__MEASUREMENT = MultidimensionalPackage.SCHEMA__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__CHANGE_REQUEST = MultidimensionalPackage.SCHEMA__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__DASDL_PROPERTY = MultidimensionalPackage.SCHEMA__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__OWNED_ELEMENT = MultidimensionalPackage.SCHEMA__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__IMPORTED_ELEMENT = MultidimensionalPackage.SCHEMA__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__DATA_MANAGER = MultidimensionalPackage.SCHEMA__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Dimensioned Object</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__DIMENSIONED_OBJECT = MultidimensionalPackage.SCHEMA__DIMENSIONED_OBJECT;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__DIMENSION = MultidimensionalPackage.SCHEMA__DIMENSION;

    /**
     * The number of structural features of the '<em>Database</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_FEATURE_COUNT = MultidimensionalPackage.SCHEMA_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.ConjointImpl <em>Conjoint</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.ConjointImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getConjoint()
     * @generated
     */
    int CONJOINT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__NAME = DIMENSION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__VISIBILITY = DIMENSION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__CLIENT_DEPENDENCY = DIMENSION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__SUPPLIER_DEPENDENCY = DIMENSION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__CONSTRAINT = DIMENSION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__NAMESPACE = DIMENSION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__IMPORTER = DIMENSION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__STEREOTYPE = DIMENSION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__TAGGED_VALUE = DIMENSION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__DOCUMENT = DIMENSION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__DESCRIPTION = DIMENSION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__RESPONSIBLE_PARTY = DIMENSION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__ELEMENT_NODE = DIMENSION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__SET = DIMENSION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__RENDERED_OBJECT = DIMENSION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__VOCABULARY_ELEMENT = DIMENSION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__MEASUREMENT = DIMENSION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__CHANGE_REQUEST = DIMENSION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__DASDL_PROPERTY = DIMENSION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__OWNED_ELEMENT = DIMENSION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__IS_ABSTRACT = DIMENSION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__FEATURE = DIMENSION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__STRUCTURAL_FEATURE = DIMENSION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__PARAMETER = DIMENSION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__GENERALIZATION = DIMENSION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__SPECIALIZATION = DIMENSION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__INSTANCE = DIMENSION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__ALIAS = DIMENSION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__EXPRESSION_NODE = DIMENSION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__MAPPING_FROM = DIMENSION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__MAPPING_TO = DIMENSION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__CLASSIFIER_MAP = DIMENSION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__CF_MAP = DIMENSION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__DOMAIN = DIMENSION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__SIMPLE_DIMENSION = DIMENSION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__INDEX = DIMENSION__INDEX;

    /**
     * The feature id for the '<em><b>Dimensioned Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__DIMENSIONED_OBJECT = DIMENSION__DIMENSIONED_OBJECT;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__COMPOSITE = DIMENSION__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__COMPONENT = DIMENSION__COMPONENT;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__SCHEMA = DIMENSION__SCHEMA;

    /**
     * The feature id for the '<em><b>Member Set</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__MEMBER_SET = DIMENSION__MEMBER_SET;

    /**
     * The feature id for the '<em><b>Relation</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__RELATION = DIMENSION__RELATION;

    /**
     * The feature id for the '<em><b>Column Dimension In Worksheet</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__COLUMN_DIMENSION_IN_WORKSHEET = DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET;

    /**
     * The feature id for the '<em><b>Row Dimension In Worksheet</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__ROW_DIMENSION_IN_WORKSHEET = DIMENSION__ROW_DIMENSION_IN_WORKSHEET;

    /**
     * The feature id for the '<em><b>Value Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__VALUE_SET = DIMENSION__VALUE_SET;

    /**
     * The feature id for the '<em><b>Agg Map Component</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJOINT__AGG_MAP_COMPONENT = DIMENSION__AGG_MAP_COMPONENT;

    /**
     * The feature id for the '<em><b>Search Algorithm</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__SEARCH_ALGORITHM = DIMENSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page Space</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT__PAGE_SPACE = DIMENSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Conjoint</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONJOINT_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.ProgramImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getProgram()
     * @generated
     */
    int PROGRAM = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__NAME = SoftwaredeploymentPackage.COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__VISIBILITY = SoftwaredeploymentPackage.COMPONENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__CLIENT_DEPENDENCY = SoftwaredeploymentPackage.COMPONENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__SUPPLIER_DEPENDENCY = SoftwaredeploymentPackage.COMPONENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__CONSTRAINT = SoftwaredeploymentPackage.COMPONENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__NAMESPACE = SoftwaredeploymentPackage.COMPONENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__IMPORTER = SoftwaredeploymentPackage.COMPONENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__STEREOTYPE = SoftwaredeploymentPackage.COMPONENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__TAGGED_VALUE = SoftwaredeploymentPackage.COMPONENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__DOCUMENT = SoftwaredeploymentPackage.COMPONENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__DESCRIPTION = SoftwaredeploymentPackage.COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__RESPONSIBLE_PARTY = SoftwaredeploymentPackage.COMPONENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__ELEMENT_NODE = SoftwaredeploymentPackage.COMPONENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__SET = SoftwaredeploymentPackage.COMPONENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__RENDERED_OBJECT = SoftwaredeploymentPackage.COMPONENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__VOCABULARY_ELEMENT = SoftwaredeploymentPackage.COMPONENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__MEASUREMENT = SoftwaredeploymentPackage.COMPONENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__CHANGE_REQUEST = SoftwaredeploymentPackage.COMPONENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__DASDL_PROPERTY = SoftwaredeploymentPackage.COMPONENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__OWNED_ELEMENT = SoftwaredeploymentPackage.COMPONENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__IS_ABSTRACT = SoftwaredeploymentPackage.COMPONENT__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__FEATURE = SoftwaredeploymentPackage.COMPONENT__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__STRUCTURAL_FEATURE = SoftwaredeploymentPackage.COMPONENT__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__PARAMETER = SoftwaredeploymentPackage.COMPONENT__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__GENERALIZATION = SoftwaredeploymentPackage.COMPONENT__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__SPECIALIZATION = SoftwaredeploymentPackage.COMPONENT__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__INSTANCE = SoftwaredeploymentPackage.COMPONENT__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__ALIAS = SoftwaredeploymentPackage.COMPONENT__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__EXPRESSION_NODE = SoftwaredeploymentPackage.COMPONENT__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__MAPPING_FROM = SoftwaredeploymentPackage.COMPONENT__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__MAPPING_TO = SoftwaredeploymentPackage.COMPONENT__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__CLASSIFIER_MAP = SoftwaredeploymentPackage.COMPONENT__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__CF_MAP = SoftwaredeploymentPackage.COMPONENT__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__DOMAIN = SoftwaredeploymentPackage.COMPONENT__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROGRAM__SIMPLE_DIMENSION = SoftwaredeploymentPackage.COMPONENT__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Deployment</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__DEPLOYMENT = SoftwaredeploymentPackage.COMPONENT__DEPLOYMENT;

    /**
     * The feature id for the '<em><b>Program</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__PROGRAM = SoftwaredeploymentPackage.COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Return Dimension</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM__RETURN_DIMENSION = SoftwaredeploymentPackage.COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Program</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROGRAM_FEATURE_COUNT = SoftwaredeploymentPackage.COMPONENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.ModelImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getModel()
     * @generated
     */
    int MODEL = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__NAME = SoftwaredeploymentPackage.COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__VISIBILITY = SoftwaredeploymentPackage.COMPONENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__CLIENT_DEPENDENCY = SoftwaredeploymentPackage.COMPONENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__SUPPLIER_DEPENDENCY = SoftwaredeploymentPackage.COMPONENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__CONSTRAINT = SoftwaredeploymentPackage.COMPONENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__NAMESPACE = SoftwaredeploymentPackage.COMPONENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__IMPORTER = SoftwaredeploymentPackage.COMPONENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__STEREOTYPE = SoftwaredeploymentPackage.COMPONENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__TAGGED_VALUE = SoftwaredeploymentPackage.COMPONENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__DOCUMENT = SoftwaredeploymentPackage.COMPONENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__DESCRIPTION = SoftwaredeploymentPackage.COMPONENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__RESPONSIBLE_PARTY = SoftwaredeploymentPackage.COMPONENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__ELEMENT_NODE = SoftwaredeploymentPackage.COMPONENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__SET = SoftwaredeploymentPackage.COMPONENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__RENDERED_OBJECT = SoftwaredeploymentPackage.COMPONENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__VOCABULARY_ELEMENT = SoftwaredeploymentPackage.COMPONENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__MEASUREMENT = SoftwaredeploymentPackage.COMPONENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__CHANGE_REQUEST = SoftwaredeploymentPackage.COMPONENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__DASDL_PROPERTY = SoftwaredeploymentPackage.COMPONENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__OWNED_ELEMENT = SoftwaredeploymentPackage.COMPONENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__IS_ABSTRACT = SoftwaredeploymentPackage.COMPONENT__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__FEATURE = SoftwaredeploymentPackage.COMPONENT__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__STRUCTURAL_FEATURE = SoftwaredeploymentPackage.COMPONENT__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__PARAMETER = SoftwaredeploymentPackage.COMPONENT__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__GENERALIZATION = SoftwaredeploymentPackage.COMPONENT__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__SPECIALIZATION = SoftwaredeploymentPackage.COMPONENT__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__INSTANCE = SoftwaredeploymentPackage.COMPONENT__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__ALIAS = SoftwaredeploymentPackage.COMPONENT__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__EXPRESSION_NODE = SoftwaredeploymentPackage.COMPONENT__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__MAPPING_FROM = SoftwaredeploymentPackage.COMPONENT__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__MAPPING_TO = SoftwaredeploymentPackage.COMPONENT__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__CLASSIFIER_MAP = SoftwaredeploymentPackage.COMPONENT__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__CF_MAP = SoftwaredeploymentPackage.COMPONENT__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__DOMAIN = SoftwaredeploymentPackage.COMPONENT__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__SIMPLE_DIMENSION = SoftwaredeploymentPackage.COMPONENT__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Deployment</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__DEPLOYMENT = SoftwaredeploymentPackage.COMPONENT__DEPLOYMENT;

    /**
     * The feature id for the '<em><b>Content</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL__CONTENT = SoftwaredeploymentPackage.COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Model</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_FEATURE_COUNT = SoftwaredeploymentPackage.COMPONENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.VariableImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getVariable()
     * @generated
     */
    int VARIABLE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The feature id for the '<em><b>Storage Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__STORAGE_TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page Space</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__PAGE_SPACE = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE__WIDTH = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Variable</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.FormulaImpl <em>Formula</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.FormulaImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getFormula()
     * @generated
     */
    int FORMULA = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMULA__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA__EXPRESSION = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Formula</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.ValueSetImpl <em>Value Set</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.ValueSetImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getValueSet()
     * @generated
     */
    int VALUE_SET = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The feature id for the '<em><b>Is Temp</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET__IS_TEMP = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Reference Dimension</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_SET__REFERENCE_DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Value Set</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VALUE_SET_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.RelationImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getRelation()
     * @generated
     */
    int RELATION = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The feature id for the '<em><b>Is Temp</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__IS_TEMP = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page Space</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION__PAGE_SPACE = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Reference Dimension</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__REFERENCE_DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Agg Map Component</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__AGG_MAP_COMPONENT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Relation</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RELATION_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.WorksheetImpl <em>Worksheet</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.WorksheetImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getWorksheet()
     * @generated
     */
    int WORKSHEET = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__NAME = CorePackage.CLASS__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__VISIBILITY = CorePackage.CLASS__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__SUPPLIER_DEPENDENCY = CorePackage.CLASS__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__NAMESPACE = CorePackage.CLASS__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__IMPORTER = CorePackage.CLASS__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__STEREOTYPE = CorePackage.CLASS__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__DOCUMENT = CorePackage.CLASS__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__DESCRIPTION = CorePackage.CLASS__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__RESPONSIBLE_PARTY = CorePackage.CLASS__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__ELEMENT_NODE = CorePackage.CLASS__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__SET = CorePackage.CLASS__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__RENDERED_OBJECT = CorePackage.CLASS__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__VOCABULARY_ELEMENT = CorePackage.CLASS__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__MEASUREMENT = CorePackage.CLASS__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__CHANGE_REQUEST = CorePackage.CLASS__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__DASDL_PROPERTY = CorePackage.CLASS__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__FEATURE = CorePackage.CLASS__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__STRUCTURAL_FEATURE = CorePackage.CLASS__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__PARAMETER = CorePackage.CLASS__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__GENERALIZATION = CorePackage.CLASS__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__SPECIALIZATION = CorePackage.CLASS__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__INSTANCE = CorePackage.CLASS__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__ALIAS = CorePackage.CLASS__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__EXPRESSION_NODE = CorePackage.CLASS__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__MAPPING_FROM = CorePackage.CLASS__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__MAPPING_TO = CorePackage.CLASS__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__CLASSIFIER_MAP = CorePackage.CLASS__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__CF_MAP = CorePackage.CLASS__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__DOMAIN = CorePackage.CLASS__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKSHEET__SIMPLE_DIMENSION = CorePackage.CLASS__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__INDEX = CorePackage.CLASS__INDEX;

    /**
     * The feature id for the '<em><b>Is Temp</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__IS_TEMP = CorePackage.CLASS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Column Dimension</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__COLUMN_DIMENSION = CorePackage.CLASS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Row Dimension</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET__ROW_DIMENSION = CorePackage.CLASS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Worksheet</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WORKSHEET_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.CompositeImpl <em>Composite</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.CompositeImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getComposite()
     * @generated
     */
    int COMPOSITE = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__NAME = DIMENSION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__VISIBILITY = DIMENSION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__CLIENT_DEPENDENCY = DIMENSION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__SUPPLIER_DEPENDENCY = DIMENSION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__CONSTRAINT = DIMENSION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__NAMESPACE = DIMENSION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__IMPORTER = DIMENSION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__STEREOTYPE = DIMENSION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__TAGGED_VALUE = DIMENSION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__DOCUMENT = DIMENSION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__DESCRIPTION = DIMENSION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__RESPONSIBLE_PARTY = DIMENSION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__ELEMENT_NODE = DIMENSION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__SET = DIMENSION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__RENDERED_OBJECT = DIMENSION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__VOCABULARY_ELEMENT = DIMENSION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__MEASUREMENT = DIMENSION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__CHANGE_REQUEST = DIMENSION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__DASDL_PROPERTY = DIMENSION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__OWNED_ELEMENT = DIMENSION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__IS_ABSTRACT = DIMENSION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__FEATURE = DIMENSION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__STRUCTURAL_FEATURE = DIMENSION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__PARAMETER = DIMENSION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__GENERALIZATION = DIMENSION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__SPECIALIZATION = DIMENSION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__INSTANCE = DIMENSION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__ALIAS = DIMENSION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__EXPRESSION_NODE = DIMENSION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__MAPPING_FROM = DIMENSION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__MAPPING_TO = DIMENSION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__CLASSIFIER_MAP = DIMENSION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__CF_MAP = DIMENSION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__DOMAIN = DIMENSION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__SIMPLE_DIMENSION = DIMENSION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__INDEX = DIMENSION__INDEX;

    /**
     * The feature id for the '<em><b>Dimensioned Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__DIMENSIONED_OBJECT = DIMENSION__DIMENSIONED_OBJECT;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__COMPOSITE = DIMENSION__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__COMPONENT = DIMENSION__COMPONENT;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__SCHEMA = DIMENSION__SCHEMA;

    /**
     * The feature id for the '<em><b>Member Set</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__MEMBER_SET = DIMENSION__MEMBER_SET;

    /**
     * The feature id for the '<em><b>Relation</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__RELATION = DIMENSION__RELATION;

    /**
     * The feature id for the '<em><b>Column Dimension In Worksheet</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__COLUMN_DIMENSION_IN_WORKSHEET = DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET;

    /**
     * The feature id for the '<em><b>Row Dimension In Worksheet</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__ROW_DIMENSION_IN_WORKSHEET = DIMENSION__ROW_DIMENSION_IN_WORKSHEET;

    /**
     * The feature id for the '<em><b>Value Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__VALUE_SET = DIMENSION__VALUE_SET;

    /**
     * The feature id for the '<em><b>Agg Map Component</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE__AGG_MAP_COMPONENT = DIMENSION__AGG_MAP_COMPONENT;

    /**
     * The feature id for the '<em><b>Search Algorithm</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__SEARCH_ALGORITHM = DIMENSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page Space</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE__PAGE_SPACE = DIMENSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Composite</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMPOSITE_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl <em>Simple Dimension</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.SimpleDimensionImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getSimpleDimension()
     * @generated
     */
    int SIMPLE_DIMENSION = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__NAME = DIMENSION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__VISIBILITY = DIMENSION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__CLIENT_DEPENDENCY = DIMENSION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__SUPPLIER_DEPENDENCY = DIMENSION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__CONSTRAINT = DIMENSION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__NAMESPACE = DIMENSION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__IMPORTER = DIMENSION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__STEREOTYPE = DIMENSION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__TAGGED_VALUE = DIMENSION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__DOCUMENT = DIMENSION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__DESCRIPTION = DIMENSION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__RESPONSIBLE_PARTY = DIMENSION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__ELEMENT_NODE = DIMENSION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__SET = DIMENSION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__RENDERED_OBJECT = DIMENSION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__VOCABULARY_ELEMENT = DIMENSION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__MEASUREMENT = DIMENSION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__CHANGE_REQUEST = DIMENSION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__DASDL_PROPERTY = DIMENSION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__OWNED_ELEMENT = DIMENSION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__IS_ABSTRACT = DIMENSION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__FEATURE = DIMENSION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__STRUCTURAL_FEATURE = DIMENSION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__PARAMETER = DIMENSION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__GENERALIZATION = DIMENSION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__SPECIALIZATION = DIMENSION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__INSTANCE = DIMENSION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__ALIAS = DIMENSION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__EXPRESSION_NODE = DIMENSION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__MAPPING_FROM = DIMENSION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__MAPPING_TO = DIMENSION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__CLASSIFIER_MAP = DIMENSION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__CF_MAP = DIMENSION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__DOMAIN = DIMENSION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__SIMPLE_DIMENSION = DIMENSION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__INDEX = DIMENSION__INDEX;

    /**
     * The feature id for the '<em><b>Dimensioned Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__DIMENSIONED_OBJECT = DIMENSION__DIMENSIONED_OBJECT;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__COMPOSITE = DIMENSION__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__COMPONENT = DIMENSION__COMPONENT;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__SCHEMA = DIMENSION__SCHEMA;

    /**
     * The feature id for the '<em><b>Member Set</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__MEMBER_SET = DIMENSION__MEMBER_SET;

    /**
     * The feature id for the '<em><b>Relation</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__RELATION = DIMENSION__RELATION;

    /**
     * The feature id for the '<em><b>Column Dimension In Worksheet</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET = DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET;

    /**
     * The feature id for the '<em><b>Row Dimension In Worksheet</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__ROW_DIMENSION_IN_WORKSHEET = DIMENSION__ROW_DIMENSION_IN_WORKSHEET;

    /**
     * The feature id for the '<em><b>Value Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__VALUE_SET = DIMENSION__VALUE_SET;

    /**
     * The feature id for the '<em><b>Agg Map Component</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__AGG_MAP_COMPONENT = DIMENSION__AGG_MAP_COMPONENT;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__WIDTH = DIMENSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Time</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__IS_TIME = DIMENSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Multiple</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__MULTIPLE = DIMENSION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Beginning Phase</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__BEGINNING_PHASE = DIMENSION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ending Phase</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__ENDING_PHASE = DIMENSION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Search Algorithm</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__SEARCH_ALGORITHM = DIMENSION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Page Space</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__PAGE_SPACE = DIMENSION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Alias Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__ALIAS_DIMENSION = DIMENSION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION__DATA_TYPE = DIMENSION_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Simple Dimension</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_DIMENSION_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.AliasDimensionImpl <em>Alias Dimension</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.AliasDimensionImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getAliasDimension()
     * @generated
     */
    int ALIAS_DIMENSION = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__NAME = DIMENSION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__VISIBILITY = DIMENSION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__CLIENT_DEPENDENCY = DIMENSION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__SUPPLIER_DEPENDENCY = DIMENSION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__CONSTRAINT = DIMENSION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__NAMESPACE = DIMENSION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__IMPORTER = DIMENSION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__STEREOTYPE = DIMENSION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__TAGGED_VALUE = DIMENSION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__DOCUMENT = DIMENSION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__DESCRIPTION = DIMENSION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__RESPONSIBLE_PARTY = DIMENSION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__ELEMENT_NODE = DIMENSION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__SET = DIMENSION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__RENDERED_OBJECT = DIMENSION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__VOCABULARY_ELEMENT = DIMENSION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__MEASUREMENT = DIMENSION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__CHANGE_REQUEST = DIMENSION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__DASDL_PROPERTY = DIMENSION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__OWNED_ELEMENT = DIMENSION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__IS_ABSTRACT = DIMENSION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__FEATURE = DIMENSION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__STRUCTURAL_FEATURE = DIMENSION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__PARAMETER = DIMENSION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__GENERALIZATION = DIMENSION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__SPECIALIZATION = DIMENSION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__INSTANCE = DIMENSION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__ALIAS = DIMENSION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__EXPRESSION_NODE = DIMENSION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__MAPPING_FROM = DIMENSION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__MAPPING_TO = DIMENSION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__CLASSIFIER_MAP = DIMENSION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__CF_MAP = DIMENSION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__DOMAIN = DIMENSION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__SIMPLE_DIMENSION = DIMENSION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__INDEX = DIMENSION__INDEX;

    /**
     * The feature id for the '<em><b>Dimensioned Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__DIMENSIONED_OBJECT = DIMENSION__DIMENSIONED_OBJECT;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__COMPOSITE = DIMENSION__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__COMPONENT = DIMENSION__COMPONENT;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__SCHEMA = DIMENSION__SCHEMA;

    /**
     * The feature id for the '<em><b>Member Set</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__MEMBER_SET = DIMENSION__MEMBER_SET;

    /**
     * The feature id for the '<em><b>Relation</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__RELATION = DIMENSION__RELATION;

    /**
     * The feature id for the '<em><b>Column Dimension In Worksheet</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET = DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET;

    /**
     * The feature id for the '<em><b>Row Dimension In Worksheet</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__ROW_DIMENSION_IN_WORKSHEET = DIMENSION__ROW_DIMENSION_IN_WORKSHEET;

    /**
     * The feature id for the '<em><b>Value Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__VALUE_SET = DIMENSION__VALUE_SET;

    /**
     * The feature id for the '<em><b>Agg Map Component</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__AGG_MAP_COMPONENT = DIMENSION__AGG_MAP_COMPONENT;

    /**
     * The feature id for the '<em><b>Base Dimension</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION__BASE_DIMENSION = DIMENSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Alias Dimension</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS_DIMENSION_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.AggMapImpl <em>Agg Map</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.AggMapImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getAggMap()
     * @generated
     */
    int AGG_MAP = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__NAME = CorePackage.CLASS__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__VISIBILITY = CorePackage.CLASS__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__SUPPLIER_DEPENDENCY = CorePackage.CLASS__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__NAMESPACE = CorePackage.CLASS__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__IMPORTER = CorePackage.CLASS__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__STEREOTYPE = CorePackage.CLASS__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__DOCUMENT = CorePackage.CLASS__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__DESCRIPTION = CorePackage.CLASS__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__RESPONSIBLE_PARTY = CorePackage.CLASS__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__ELEMENT_NODE = CorePackage.CLASS__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__SET = CorePackage.CLASS__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__RENDERED_OBJECT = CorePackage.CLASS__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__VOCABULARY_ELEMENT = CorePackage.CLASS__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__MEASUREMENT = CorePackage.CLASS__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__CHANGE_REQUEST = CorePackage.CLASS__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__DASDL_PROPERTY = CorePackage.CLASS__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__FEATURE = CorePackage.CLASS__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__STRUCTURAL_FEATURE = CorePackage.CLASS__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__PARAMETER = CorePackage.CLASS__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__GENERALIZATION = CorePackage.CLASS__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__SPECIALIZATION = CorePackage.CLASS__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__INSTANCE = CorePackage.CLASS__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__ALIAS = CorePackage.CLASS__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__EXPRESSION_NODE = CorePackage.CLASS__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__MAPPING_FROM = CorePackage.CLASS__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__MAPPING_TO = CorePackage.CLASS__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__CLASSIFIER_MAP = CorePackage.CLASS__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__CF_MAP = CorePackage.CLASS__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__DOMAIN = CorePackage.CLASS__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__SIMPLE_DIMENSION = CorePackage.CLASS__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP__INDEX = CorePackage.CLASS__INDEX;

    /**
     * The feature id for the '<em><b>Agg Map Component</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP__AGG_MAP_COMPONENT = CorePackage.CLASS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Agg Map</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.AggMapComponentImpl <em>Agg Map Component</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.AggMapComponentImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getAggMapComponent()
     * @generated
     */
    int AGG_MAP_COMPONENT = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Agg Operator</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__AGG_OPERATOR = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Relation</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__RELATION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__DIMENSION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Compute Clause</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__COMPUTE_CLAUSE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Agg Map</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT__AGG_MAP = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Agg Map Component</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AGG_MAP_COMPONENT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.express.impl.PreComputeClauseImpl <em>Pre Compute Clause</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.express.impl.PreComputeClauseImpl
     * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getPreComputeClause()
     * @generated
     */
    int PRE_COMPUTE_CLAUSE = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Status List</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__STATUS_LIST = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Agg Map Component</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Pre Compute Clause</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRE_COMPUTE_CLAUSE_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.Dimension <em>Dimension</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Dimension</em>'.
     * @see orgomg.cwmx.resource.express.Dimension
     * @generated
     */
    EClass getDimension();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.express.Dimension#getRelation <em>Relation</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Relation</em>'.
     * @see orgomg.cwmx.resource.express.Dimension#getRelation()
     * @see #getDimension()
     * @generated
     */
    EReference getDimension_Relation();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.express.Dimension#getColumnDimensionInWorksheet <em>Column Dimension In Worksheet</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the reference list '<em>Column Dimension In Worksheet</em>'.
     * @see orgomg.cwmx.resource.express.Dimension#getColumnDimensionInWorksheet()
     * @see #getDimension()
     * @generated
     */
    EReference getDimension_ColumnDimensionInWorksheet();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.express.Dimension#getRowDimensionInWorksheet <em>Row Dimension In Worksheet</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the reference list '<em>Row Dimension In Worksheet</em>'.
     * @see orgomg.cwmx.resource.express.Dimension#getRowDimensionInWorksheet()
     * @see #getDimension()
     * @generated
     */
    EReference getDimension_RowDimensionInWorksheet();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.express.Dimension#getValueSet <em>Value Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Value Set</em>'.
     * @see orgomg.cwmx.resource.express.Dimension#getValueSet()
     * @see #getDimension()
     * @generated
     */
    EReference getDimension_ValueSet();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmx.resource.express.Dimension#getAggMapComponent
     * <em>Agg Map Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference list '
     *         <em>Agg Map Component</em>'.
     * @see orgomg.cwmx.resource.express.Dimension#getAggMapComponent()
     * @see #getDimension()
     * @generated
     */
    EReference getDimension_AggMapComponent();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.Database <em>Database</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Database</em>'.
     * @see orgomg.cwmx.resource.express.Database
     * @generated
     */
    EClass getDatabase();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.Conjoint <em>Conjoint</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Conjoint</em>'.
     * @see orgomg.cwmx.resource.express.Conjoint
     * @generated
     */
    EClass getConjoint();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.express.Conjoint#getSearchAlgorithm
     * <em>Search Algorithm</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Search Algorithm</em>'.
     * @see orgomg.cwmx.resource.express.Conjoint#getSearchAlgorithm()
     * @see #getConjoint()
     * @generated
     */
    EAttribute getConjoint_SearchAlgorithm();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Conjoint#getPageSpace <em>Page Space</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Page Space</em>'.
     * @see orgomg.cwmx.resource.express.Conjoint#getPageSpace()
     * @see #getConjoint()
     * @generated
     */
    EAttribute getConjoint_PageSpace();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.Program <em>Program</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Program</em>'.
     * @see orgomg.cwmx.resource.express.Program
     * @generated
     */
    EClass getProgram();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Program#getProgram <em>Program</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Program</em>'.
     * @see orgomg.cwmx.resource.express.Program#getProgram()
     * @see #getProgram()
     * @generated
     */
    EAttribute getProgram_Program();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.express.Program#getReturnDimension
     * <em>Return Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Return Dimension</em>'.
     * @see orgomg.cwmx.resource.express.Program#getReturnDimension()
     * @see #getProgram()
     * @generated
     */
    EAttribute getProgram_ReturnDimension();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.Model <em>Model</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Model</em>'.
     * @see orgomg.cwmx.resource.express.Model
     * @generated
     */
    EClass getModel();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Model#getContent <em>Content</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Content</em>'.
     * @see orgomg.cwmx.resource.express.Model#getContent()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Content();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.Variable <em>Variable</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Variable</em>'.
     * @see orgomg.cwmx.resource.express.Variable
     * @generated
     */
    EClass getVariable();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Variable#getStorageType <em>Storage Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Storage Type</em>'.
     * @see orgomg.cwmx.resource.express.Variable#getStorageType()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_StorageType();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Variable#getPageSpace <em>Page Space</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Page Space</em>'.
     * @see orgomg.cwmx.resource.express.Variable#getPageSpace()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_PageSpace();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Variable#getWidth <em>Width</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Width</em>'.
     * @see orgomg.cwmx.resource.express.Variable#getWidth()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_Width();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.Formula <em>Formula</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Formula</em>'.
     * @see orgomg.cwmx.resource.express.Formula
     * @generated
     */
    EClass getFormula();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Formula#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see orgomg.cwmx.resource.express.Formula#getExpression()
     * @see #getFormula()
     * @generated
     */
    EAttribute getFormula_Expression();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.ValueSet <em>Value Set</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Value Set</em>'.
     * @see orgomg.cwmx.resource.express.ValueSet
     * @generated
     */
    EClass getValueSet();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.ValueSet#isIsTemp <em>Is Temp</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Temp</em>'.
     * @see orgomg.cwmx.resource.express.ValueSet#isIsTemp()
     * @see #getValueSet()
     * @generated
     */
    EAttribute getValueSet_IsTemp();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.resource.express.ValueSet#getReferenceDimension
     * <em>Reference Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Reference Dimension</em>'.
     * @see orgomg.cwmx.resource.express.ValueSet#getReferenceDimension()
     * @see #getValueSet()
     * @generated
     */
    EReference getValueSet_ReferenceDimension();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.Relation <em>Relation</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Relation</em>'.
     * @see orgomg.cwmx.resource.express.Relation
     * @generated
     */
    EClass getRelation();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Relation#isIsTemp <em>Is Temp</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Temp</em>'.
     * @see orgomg.cwmx.resource.express.Relation#isIsTemp()
     * @see #getRelation()
     * @generated
     */
    EAttribute getRelation_IsTemp();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Relation#getPageSpace <em>Page Space</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Page Space</em>'.
     * @see orgomg.cwmx.resource.express.Relation#getPageSpace()
     * @see #getRelation()
     * @generated
     */
    EAttribute getRelation_PageSpace();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.resource.express.Relation#getReferenceDimension
     * <em>Reference Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Reference Dimension</em>'.
     * @see orgomg.cwmx.resource.express.Relation#getReferenceDimension()
     * @see #getRelation()
     * @generated
     */
    EReference getRelation_ReferenceDimension();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmx.resource.express.Relation#getAggMapComponent
     * <em>Agg Map Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference list '
     *         <em>Agg Map Component</em>'.
     * @see orgomg.cwmx.resource.express.Relation#getAggMapComponent()
     * @see #getRelation()
     * @generated
     */
    EReference getRelation_AggMapComponent();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.Worksheet <em>Worksheet</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Worksheet</em>'.
     * @see orgomg.cwmx.resource.express.Worksheet
     * @generated
     */
    EClass getWorksheet();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Worksheet#isIsTemp <em>Is Temp</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Temp</em>'.
     * @see orgomg.cwmx.resource.express.Worksheet#isIsTemp()
     * @see #getWorksheet()
     * @generated
     */
    EAttribute getWorksheet_IsTemp();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.resource.express.Worksheet#getColumnDimension
     * <em>Column Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Column Dimension</em>'.
     * @see orgomg.cwmx.resource.express.Worksheet#getColumnDimension()
     * @see #getWorksheet()
     * @generated
     */
    EReference getWorksheet_ColumnDimension();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.express.Worksheet#getRowDimension <em>Row Dimension</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Row Dimension</em>'.
     * @see orgomg.cwmx.resource.express.Worksheet#getRowDimension()
     * @see #getWorksheet()
     * @generated
     */
    EReference getWorksheet_RowDimension();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.Composite <em>Composite</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Composite</em>'.
     * @see orgomg.cwmx.resource.express.Composite
     * @generated
     */
    EClass getComposite();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.express.Composite#getSearchAlgorithm
     * <em>Search Algorithm</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Search Algorithm</em>'.
     * @see orgomg.cwmx.resource.express.Composite#getSearchAlgorithm()
     * @see #getComposite()
     * @generated
     */
    EAttribute getComposite_SearchAlgorithm();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.Composite#getPageSpace <em>Page Space</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Page Space</em>'.
     * @see orgomg.cwmx.resource.express.Composite#getPageSpace()
     * @see #getComposite()
     * @generated
     */
    EAttribute getComposite_PageSpace();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.SimpleDimension
     * <em>Simple Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Simple Dimension</em>'.
     * @see orgomg.cwmx.resource.express.SimpleDimension
     * @generated
     */
    EClass getSimpleDimension();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.SimpleDimension#getWidth <em>Width</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Width</em>'.
     * @see orgomg.cwmx.resource.express.SimpleDimension#getWidth()
     * @see #getSimpleDimension()
     * @generated
     */
    EAttribute getSimpleDimension_Width();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.SimpleDimension#isIsTime <em>Is Time</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Time</em>'.
     * @see orgomg.cwmx.resource.express.SimpleDimension#isIsTime()
     * @see #getSimpleDimension()
     * @generated
     */
    EAttribute getSimpleDimension_IsTime();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.SimpleDimension#getMultiple <em>Multiple</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiple</em>'.
     * @see orgomg.cwmx.resource.express.SimpleDimension#getMultiple()
     * @see #getSimpleDimension()
     * @generated
     */
    EAttribute getSimpleDimension_Multiple();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.SimpleDimension#getBeginningPhase <em>Beginning Phase</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Beginning Phase</em>'.
     * @see orgomg.cwmx.resource.express.SimpleDimension#getBeginningPhase()
     * @see #getSimpleDimension()
     * @generated
     */
    EAttribute getSimpleDimension_BeginningPhase();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.SimpleDimension#getEndingPhase <em>Ending Phase</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ending Phase</em>'.
     * @see orgomg.cwmx.resource.express.SimpleDimension#getEndingPhase()
     * @see #getSimpleDimension()
     * @generated
     */
    EAttribute getSimpleDimension_EndingPhase();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.express.SimpleDimension#getSearchAlgorithm
     * <em>Search Algorithm</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Search Algorithm</em>'.
     * @see orgomg.cwmx.resource.express.SimpleDimension#getSearchAlgorithm()
     * @see #getSimpleDimension()
     * @generated
     */
    EAttribute getSimpleDimension_SearchAlgorithm();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.SimpleDimension#getPageSpace <em>Page Space</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Page Space</em>'.
     * @see orgomg.cwmx.resource.express.SimpleDimension#getPageSpace()
     * @see #getSimpleDimension()
     * @generated
     */
    EAttribute getSimpleDimension_PageSpace();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.express.SimpleDimension#getAliasDimension <em>Alias Dimension</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Alias Dimension</em>'.
     * @see orgomg.cwmx.resource.express.SimpleDimension#getAliasDimension()
     * @see #getSimpleDimension()
     * @generated
     */
    EReference getSimpleDimension_AliasDimension();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.express.SimpleDimension#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Type</em>'.
     * @see orgomg.cwmx.resource.express.SimpleDimension#getDataType()
     * @see #getSimpleDimension()
     * @generated
     */
    EReference getSimpleDimension_DataType();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.express.AliasDimension <em>Alias Dimension</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Alias Dimension</em>'.
     * @see orgomg.cwmx.resource.express.AliasDimension
     * @generated
     */
    EClass getAliasDimension();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.express.AliasDimension#getBaseDimension <em>Base Dimension</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base Dimension</em>'.
     * @see orgomg.cwmx.resource.express.AliasDimension#getBaseDimension()
     * @see #getAliasDimension()
     * @generated
     */
    EReference getAliasDimension_BaseDimension();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.AggMap <em>Agg Map</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Agg Map</em>'.
     * @see orgomg.cwmx.resource.express.AggMap
     * @generated
     */
    EClass getAggMap();

    /**
     * Returns the meta object for the containment reference list '
     * {@link orgomg.cwmx.resource.express.AggMap#getAggMapComponent
     * <em>Agg Map Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the containment reference list '
     *         <em>Agg Map Component</em>'.
     * @see orgomg.cwmx.resource.express.AggMap#getAggMapComponent()
     * @see #getAggMap()
     * @generated
     */
    EReference getAggMap_AggMapComponent();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.AggMapComponent
     * <em>Agg Map Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Agg Map Component</em>'.
     * @see orgomg.cwmx.resource.express.AggMapComponent
     * @generated
     */
    EClass getAggMapComponent();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.AggMapComponent#getAggOperator <em>Agg Operator</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Agg Operator</em>'.
     * @see orgomg.cwmx.resource.express.AggMapComponent#getAggOperator()
     * @see #getAggMapComponent()
     * @generated
     */
    EAttribute getAggMapComponent_AggOperator();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.express.AggMapComponent#getRelation <em>Relation</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Relation</em>'.
     * @see orgomg.cwmx.resource.express.AggMapComponent#getRelation()
     * @see #getAggMapComponent()
     * @generated
     */
    EReference getAggMapComponent_Relation();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.express.AggMapComponent#getDimension <em>Dimension</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Dimension</em>'.
     * @see orgomg.cwmx.resource.express.AggMapComponent#getDimension()
     * @see #getAggMapComponent()
     * @generated
     */
    EReference getAggMapComponent_Dimension();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.resource.express.AggMapComponent#getComputeClause <em>Compute Clause</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Compute Clause</em>'.
     * @see orgomg.cwmx.resource.express.AggMapComponent#getComputeClause()
     * @see #getAggMapComponent()
     * @generated
     */
    EReference getAggMapComponent_ComputeClause();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.express.AggMapComponent#getAggMap <em>Agg Map</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Agg Map</em>'.
     * @see orgomg.cwmx.resource.express.AggMapComponent#getAggMap()
     * @see #getAggMapComponent()
     * @generated
     */
    EReference getAggMapComponent_AggMap();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.express.PreComputeClause
     * <em>Pre Compute Clause</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Pre Compute Clause</em>'.
     * @see orgomg.cwmx.resource.express.PreComputeClause
     * @generated
     */
    EClass getPreComputeClause();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.express.PreComputeClause#getStatusList <em>Status List</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Status List</em>'.
     * @see orgomg.cwmx.resource.express.PreComputeClause#getStatusList()
     * @see #getPreComputeClause()
     * @generated
     */
    EAttribute getPreComputeClause_StatusList();

    /**
     * Returns the meta object for the container reference '
     * {@link orgomg.cwmx.resource.express.PreComputeClause#getAggMapComponent
     * <em>Agg Map Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the container reference '
     *         <em>Agg Map Component</em>'.
     * @see orgomg.cwmx.resource.express.PreComputeClause#getAggMapComponent()
     * @see #getPreComputeClause()
     * @generated
     */
    EReference getPreComputeClause_AggMapComponent();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ExpressFactory getExpressFactory();

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
         * {@link orgomg.cwmx.resource.express.impl.DimensionImpl
         * <em>Dimension</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.express.impl.DimensionImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getDimension()
         * @generated
         */
        EClass DIMENSION = eINSTANCE.getDimension();

        /**
         * The meta object literal for the '<em><b>Relation</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DIMENSION__RELATION = eINSTANCE.getDimension_Relation();

        /**
         * The meta object literal for the '<em><b>Column Dimension In Worksheet</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET = eINSTANCE.getDimension_ColumnDimensionInWorksheet();

        /**
         * The meta object literal for the '<em><b>Row Dimension In Worksheet</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DIMENSION__ROW_DIMENSION_IN_WORKSHEET = eINSTANCE.getDimension_RowDimensionInWorksheet();

        /**
         * The meta object literal for the '<em><b>Value Set</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DIMENSION__VALUE_SET = eINSTANCE.getDimension_ValueSet();

        /**
         * The meta object literal for the '<em><b>Agg Map Component</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DIMENSION__AGG_MAP_COMPONENT = eINSTANCE.getDimension_AggMapComponent();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.express.impl.DatabaseImpl
         * <em>Database</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.express.impl.DatabaseImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getDatabase()
         * @generated
         */
        EClass DATABASE = eINSTANCE.getDatabase();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.express.impl.ConjointImpl
         * <em>Conjoint</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.express.impl.ConjointImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getConjoint()
         * @generated
         */
        EClass CONJOINT = eINSTANCE.getConjoint();

        /**
         * The meta object literal for the '<em><b>Search Algorithm</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONJOINT__SEARCH_ALGORITHM = eINSTANCE.getConjoint_SearchAlgorithm();

        /**
         * The meta object literal for the '<em><b>Page Space</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONJOINT__PAGE_SPACE = eINSTANCE.getConjoint_PageSpace();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.express.impl.ProgramImpl
         * <em>Program</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.express.impl.ProgramImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getProgram()
         * @generated
         */
        EClass PROGRAM = eINSTANCE.getProgram();

        /**
         * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROGRAM__PROGRAM = eINSTANCE.getProgram_Program();

        /**
         * The meta object literal for the '<em><b>Return Dimension</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROGRAM__RETURN_DIMENSION = eINSTANCE.getProgram_ReturnDimension();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.express.impl.ModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.express.impl.ModelImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getModel()
         * @generated
         */
        EClass MODEL = eINSTANCE.getModel();

        /**
         * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__CONTENT = eINSTANCE.getModel_Content();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.express.impl.VariableImpl
         * <em>Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.express.impl.VariableImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getVariable()
         * @generated
         */
        EClass VARIABLE = eINSTANCE.getVariable();

        /**
         * The meta object literal for the '<em><b>Storage Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE__STORAGE_TYPE = eINSTANCE.getVariable_StorageType();

        /**
         * The meta object literal for the '<em><b>Page Space</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE__PAGE_SPACE = eINSTANCE.getVariable_PageSpace();

        /**
         * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE__WIDTH = eINSTANCE.getVariable_Width();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.express.impl.FormulaImpl
         * <em>Formula</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.express.impl.FormulaImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getFormula()
         * @generated
         */
        EClass FORMULA = eINSTANCE.getFormula();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FORMULA__EXPRESSION = eINSTANCE.getFormula_Expression();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.express.impl.ValueSetImpl
         * <em>Value Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.express.impl.ValueSetImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getValueSet()
         * @generated
         */
        EClass VALUE_SET = eINSTANCE.getValueSet();

        /**
         * The meta object literal for the '<em><b>Is Temp</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_SET__IS_TEMP = eINSTANCE.getValueSet_IsTemp();

        /**
         * The meta object literal for the '<em><b>Reference Dimension</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_SET__REFERENCE_DIMENSION = eINSTANCE.getValueSet_ReferenceDimension();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.express.impl.RelationImpl
         * <em>Relation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.express.impl.RelationImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getRelation()
         * @generated
         */
        EClass RELATION = eINSTANCE.getRelation();

        /**
         * The meta object literal for the '<em><b>Is Temp</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATION__IS_TEMP = eINSTANCE.getRelation_IsTemp();

        /**
         * The meta object literal for the '<em><b>Page Space</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATION__PAGE_SPACE = eINSTANCE.getRelation_PageSpace();

        /**
         * The meta object literal for the '<em><b>Reference Dimension</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION__REFERENCE_DIMENSION = eINSTANCE.getRelation_ReferenceDimension();

        /**
         * The meta object literal for the '<em><b>Agg Map Component</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION__AGG_MAP_COMPONENT = eINSTANCE.getRelation_AggMapComponent();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.express.impl.WorksheetImpl
         * <em>Worksheet</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.express.impl.WorksheetImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getWorksheet()
         * @generated
         */
        EClass WORKSHEET = eINSTANCE.getWorksheet();

        /**
         * The meta object literal for the '<em><b>Is Temp</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute WORKSHEET__IS_TEMP = eINSTANCE.getWorksheet_IsTemp();

        /**
         * The meta object literal for the '<em><b>Column Dimension</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference WORKSHEET__COLUMN_DIMENSION = eINSTANCE.getWorksheet_ColumnDimension();

        /**
         * The meta object literal for the '<em><b>Row Dimension</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference WORKSHEET__ROW_DIMENSION = eINSTANCE.getWorksheet_RowDimension();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.express.impl.CompositeImpl
         * <em>Composite</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.express.impl.CompositeImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getComposite()
         * @generated
         */
        EClass COMPOSITE = eINSTANCE.getComposite();

        /**
         * The meta object literal for the '<em><b>Search Algorithm</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPOSITE__SEARCH_ALGORITHM = eINSTANCE.getComposite_SearchAlgorithm();

        /**
         * The meta object literal for the '<em><b>Page Space</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPOSITE__PAGE_SPACE = eINSTANCE.getComposite_PageSpace();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl <em>Simple Dimension</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.express.impl.SimpleDimensionImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getSimpleDimension()
         * @generated
         */
        EClass SIMPLE_DIMENSION = eINSTANCE.getSimpleDimension();

        /**
         * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_DIMENSION__WIDTH = eINSTANCE.getSimpleDimension_Width();

        /**
         * The meta object literal for the '<em><b>Is Time</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_DIMENSION__IS_TIME = eINSTANCE.getSimpleDimension_IsTime();

        /**
         * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_DIMENSION__MULTIPLE = eINSTANCE.getSimpleDimension_Multiple();

        /**
         * The meta object literal for the '<em><b>Beginning Phase</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_DIMENSION__BEGINNING_PHASE = eINSTANCE.getSimpleDimension_BeginningPhase();

        /**
         * The meta object literal for the '<em><b>Ending Phase</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_DIMENSION__ENDING_PHASE = eINSTANCE.getSimpleDimension_EndingPhase();

        /**
         * The meta object literal for the '<em><b>Search Algorithm</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_DIMENSION__SEARCH_ALGORITHM = eINSTANCE.getSimpleDimension_SearchAlgorithm();

        /**
         * The meta object literal for the '<em><b>Page Space</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_DIMENSION__PAGE_SPACE = eINSTANCE.getSimpleDimension_PageSpace();

        /**
         * The meta object literal for the '<em><b>Alias Dimension</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SIMPLE_DIMENSION__ALIAS_DIMENSION = eINSTANCE.getSimpleDimension_AliasDimension();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SIMPLE_DIMENSION__DATA_TYPE = eINSTANCE.getSimpleDimension_DataType();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.express.impl.AliasDimensionImpl <em>Alias Dimension</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.express.impl.AliasDimensionImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getAliasDimension()
         * @generated
         */
        EClass ALIAS_DIMENSION = eINSTANCE.getAliasDimension();

        /**
         * The meta object literal for the '<em><b>Base Dimension</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference ALIAS_DIMENSION__BASE_DIMENSION = eINSTANCE.getAliasDimension_BaseDimension();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.express.impl.AggMapImpl <em>Agg Map</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.express.impl.AggMapImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getAggMap()
         * @generated
         */
        EClass AGG_MAP = eINSTANCE.getAggMap();

        /**
         * The meta object literal for the '<em><b>Agg Map Component</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference AGG_MAP__AGG_MAP_COMPONENT = eINSTANCE.getAggMap_AggMapComponent();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.express.impl.AggMapComponentImpl <em>Agg Map Component</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.express.impl.AggMapComponentImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getAggMapComponent()
         * @generated
         */
        EClass AGG_MAP_COMPONENT = eINSTANCE.getAggMapComponent();

        /**
         * The meta object literal for the '<em><b>Agg Operator</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute AGG_MAP_COMPONENT__AGG_OPERATOR = eINSTANCE.getAggMapComponent_AggOperator();

        /**
         * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference AGG_MAP_COMPONENT__RELATION = eINSTANCE.getAggMapComponent_Relation();

        /**
         * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference AGG_MAP_COMPONENT__DIMENSION = eINSTANCE.getAggMapComponent_Dimension();

        /**
         * The meta object literal for the '<em><b>Compute Clause</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference AGG_MAP_COMPONENT__COMPUTE_CLAUSE = eINSTANCE.getAggMapComponent_ComputeClause();

        /**
         * The meta object literal for the '<em><b>Agg Map</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference AGG_MAP_COMPONENT__AGG_MAP = eINSTANCE.getAggMapComponent_AggMap();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.express.impl.PreComputeClauseImpl <em>Pre Compute Clause</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.express.impl.PreComputeClauseImpl
         * @see orgomg.cwmx.resource.express.impl.ExpressPackageImpl#getPreComputeClause()
         * @generated
         */
        EClass PRE_COMPUTE_CLAUSE = eINSTANCE.getPreComputeClause();

        /**
         * The meta object literal for the '<em><b>Status List</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRE_COMPUTE_CLAUSE__STATUS_LIST = eINSTANCE.getPreComputeClause_StatusList();

        /**
         * The meta object literal for the '<em><b>Agg Map Component</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT = eINSTANCE.getPreComputeClause_AggMapComponent();

    }

} // ExpressPackage
