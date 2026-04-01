/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * <!-- end-user-doc -->
 * @see orgomg.cwmmip.CwmmipFactory
 * @model kind="package"
 * @generated
 */
public interface CwmmipPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cwmmip";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///orgomg/cwmmip.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "orgomg.cwmmip";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    CwmmipPackage eINSTANCE = orgomg.cwmmip.impl.CwmmipPackageImpl.init();

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.UnitOfInterchangeImpl <em>Unit Of Interchange</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmmip.impl.UnitOfInterchangeImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getUnitOfInterchange()
     * @generated
     */
    int UNIT_OF_INTERCHANGE = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__NAME = CorePackage.NAMESPACE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__VISIBILITY = CorePackage.NAMESPACE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__CLIENT_DEPENDENCY = CorePackage.NAMESPACE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__SUPPLIER_DEPENDENCY = CorePackage.NAMESPACE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__CONSTRAINT = CorePackage.NAMESPACE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__NAMESPACE = CorePackage.NAMESPACE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__IMPORTER = CorePackage.NAMESPACE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__STEREOTYPE = CorePackage.NAMESPACE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__TAGGED_VALUE = CorePackage.NAMESPACE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__DOCUMENT = CorePackage.NAMESPACE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__DESCRIPTION = CorePackage.NAMESPACE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__RESPONSIBLE_PARTY = CorePackage.NAMESPACE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__ELEMENT_NODE = CorePackage.NAMESPACE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__SET = CorePackage.NAMESPACE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__RENDERED_OBJECT = CorePackage.NAMESPACE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__VOCABULARY_ELEMENT = CorePackage.NAMESPACE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__MEASUREMENT = CorePackage.NAMESPACE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__CHANGE_REQUEST = CorePackage.NAMESPACE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__DASDL_PROPERTY = CorePackage.NAMESPACE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__OWNED_ELEMENT = CorePackage.NAMESPACE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Interchange Pattern</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN = CorePackage.NAMESPACE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Unit Of Interchange</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIT_OF_INTERCHANGE_FEATURE_COUNT = CorePackage.NAMESPACE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.InterchangePatternImpl <em>Interchange Pattern</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmmip.impl.InterchangePatternImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getInterchangePattern()
     * @generated
     */
    int INTERCHANGE_PATTERN = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERCHANGE_PATTERN__NAME = CorePackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERCHANGE_PATTERN__VERSION = CorePackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERCHANGE_PATTERN__URI = CorePackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Classification</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERCHANGE_PATTERN__CLASSIFICATION = CorePackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Category</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int INTERCHANGE_PATTERN__CATEGORY = CorePackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Projection</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCHANGE_PATTERN__PROJECTION = CorePackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Unit Of Interchange</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE = CorePackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Component Pattern</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCHANGE_PATTERN__COMPONENT_PATTERN = CorePackage.ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Composite Pattern</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCHANGE_PATTERN__COMPOSITE_PATTERN = CorePackage.ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Interchange Pattern</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERCHANGE_PATTERN_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.ProjectionImpl
     * <em>Projection</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmmip.impl.ProjectionImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getProjection()
     * @generated
     */
    int PROJECTION = 3;

    /**
     * The number of structural features of the '<em>Projection</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECTION_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.SemanticContextImpl <em>Semantic Context</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmmip.impl.SemanticContextImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getSemanticContext()
     * @generated
     */
    int SEMANTIC_CONTEXT = 4;

    /**
     * The feature id for the '<em><b>Element</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEMANTIC_CONTEXT__ELEMENT = PROJECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Association</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEMANTIC_CONTEXT__ASSOCIATION = PROJECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_CONTEXT__CONSTRAINT = PROJECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Anchor Element</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SEMANTIC_CONTEXT__ANCHOR_ELEMENT = PROJECTION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Semantic Context</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_CONTEXT_FEATURE_COUNT = PROJECTION_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.ModeledSemanticContextImpl <em>Modeled Semantic Context</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmmip.impl.ModeledSemanticContextImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getModeledSemanticContext()
     * @generated
     */
    int MODELED_SEMANTIC_CONTEXT = 2;

    /**
     * The feature id for the '<em><b>Element</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODELED_SEMANTIC_CONTEXT__ELEMENT = SEMANTIC_CONTEXT__ELEMENT;

    /**
     * The feature id for the '<em><b>Association</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODELED_SEMANTIC_CONTEXT__ASSOCIATION = SEMANTIC_CONTEXT__ASSOCIATION;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODELED_SEMANTIC_CONTEXT__CONSTRAINT = SEMANTIC_CONTEXT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Anchor Element</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODELED_SEMANTIC_CONTEXT__ANCHOR_ELEMENT = SEMANTIC_CONTEXT__ANCHOR_ELEMENT;

    /**
     * The feature id for the '<em><b>Mof Association</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODELED_SEMANTIC_CONTEXT__MOF_ASSOCIATION = SEMANTIC_CONTEXT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Mof Element</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODELED_SEMANTIC_CONTEXT__MOF_ELEMENT = SEMANTIC_CONTEXT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Mof Anchor Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODELED_SEMANTIC_CONTEXT__MOF_ANCHOR_ELEMENT = SEMANTIC_CONTEXT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Modeled Semantic Context</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MODELED_SEMANTIC_CONTEXT_FEATURE_COUNT = SEMANTIC_CONTEXT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmmip.impl.ElementImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 5;

    /**
     * The number of structural features of the '<em>Element</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.GraphSubsetImpl
     * <em>Graph Subset</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmmip.impl.GraphSubsetImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getGraphSubset()
     * @generated
     */
    int GRAPH_SUBSET = 6;

    /**
     * The feature id for the '<em><b>Element</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GRAPH_SUBSET__ELEMENT = PROJECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Deep Copy</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GRAPH_SUBSET__DEEP_COPY = PROJECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Copy Depth</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GRAPH_SUBSET__COPY_DEPTH = PROJECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Aggregations Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_SUBSET__AGGREGATIONS_ONLY = PROJECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Include Associations</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_SUBSET__INCLUDE_ASSOCIATIONS = PROJECTION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Graph Subset</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_SUBSET_FEATURE_COUNT = PROJECTION_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.PatternConstraintImpl <em>Pattern Constraint</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmmip.impl.PatternConstraintImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getPatternConstraint()
     * @generated
     */
    int PATTERN_CONSTRAINT = 7;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PATTERN_CONSTRAINT__BODY = CorePackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PATTERN_CONSTRAINT__LANGUAGE = CorePackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Pattern Constraint</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_CONSTRAINT_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.ModeledGraphSubsetImpl <em>Modeled Graph Subset</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmmip.impl.ModeledGraphSubsetImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getModeledGraphSubset()
     * @generated
     */
    int MODELED_GRAPH_SUBSET = 8;

    /**
     * The feature id for the '<em><b>Element</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODELED_GRAPH_SUBSET__ELEMENT = GRAPH_SUBSET__ELEMENT;

    /**
     * The feature id for the '<em><b>Deep Copy</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODELED_GRAPH_SUBSET__DEEP_COPY = GRAPH_SUBSET__DEEP_COPY;

    /**
     * The feature id for the '<em><b>Copy Depth</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODELED_GRAPH_SUBSET__COPY_DEPTH = GRAPH_SUBSET__COPY_DEPTH;

    /**
     * The feature id for the '<em><b>Aggregations Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODELED_GRAPH_SUBSET__AGGREGATIONS_ONLY = GRAPH_SUBSET__AGGREGATIONS_ONLY;

    /**
     * The feature id for the '<em><b>Include Associations</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODELED_GRAPH_SUBSET__INCLUDE_ASSOCIATIONS = GRAPH_SUBSET__INCLUDE_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Mof Element</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODELED_GRAPH_SUBSET__MOF_ELEMENT = GRAPH_SUBSET_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Modeled Graph Subset</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODELED_GRAPH_SUBSET_FEATURE_COUNT = GRAPH_SUBSET_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.RestrictionImpl
     * <em>Restriction</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmmip.impl.RestrictionImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getRestriction()
     * @generated
     */
    int RESTRICTION = 9;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RESTRICTION__BODY = PATTERN_CONSTRAINT__BODY;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RESTRICTION__LANGUAGE = PATTERN_CONSTRAINT__LANGUAGE;

    /**
     * The number of structural features of the '<em>Restriction</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESTRICTION_FEATURE_COUNT = PATTERN_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmmip.impl.BindingParameterImpl <em>Binding Parameter</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmmip.impl.BindingParameterImpl
     * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getBindingParameter()
     * @generated
     */
    int BINDING_PARAMETER = 10;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BINDING_PARAMETER__BODY = PATTERN_CONSTRAINT__BODY;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BINDING_PARAMETER__LANGUAGE = PATTERN_CONSTRAINT__LANGUAGE;

    /**
     * The number of structural features of the '<em>Binding Parameter</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINDING_PARAMETER_FEATURE_COUNT = PATTERN_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.UnitOfInterchange <em>Unit Of Interchange</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Unit Of Interchange</em>'.
     * @see orgomg.cwmmip.UnitOfInterchange
     * @generated
     */
    EClass getUnitOfInterchange();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmmip.UnitOfInterchange#getInterchangePattern
     * <em>Interchange Pattern</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Interchange Pattern</em>'.
     * @see orgomg.cwmmip.UnitOfInterchange#getInterchangePattern()
     * @see #getUnitOfInterchange()
     * @generated
     */
    EReference getUnitOfInterchange_InterchangePattern();

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.InterchangePattern <em>Interchange Pattern</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Interchange Pattern</em>'.
     * @see orgomg.cwmmip.InterchangePattern
     * @generated
     */
    EClass getInterchangePattern();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmmip.InterchangePattern#getName <em>Name</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see orgomg.cwmmip.InterchangePattern#getName()
     * @see #getInterchangePattern()
     * @generated
     */
    EAttribute getInterchangePattern_Name();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmmip.InterchangePattern#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see orgomg.cwmmip.InterchangePattern#getVersion()
     * @see #getInterchangePattern()
     * @generated
     */
    EAttribute getInterchangePattern_Version();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmmip.InterchangePattern#getUri <em>Uri</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Uri</em>'.
     * @see orgomg.cwmmip.InterchangePattern#getUri()
     * @see #getInterchangePattern()
     * @generated
     */
    EAttribute getInterchangePattern_Uri();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmmip.InterchangePattern#getClassification <em>Classification</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Classification</em>'.
     * @see orgomg.cwmmip.InterchangePattern#getClassification()
     * @see #getInterchangePattern()
     * @generated
     */
    EAttribute getInterchangePattern_Classification();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmmip.InterchangePattern#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Category</em>'.
     * @see orgomg.cwmmip.InterchangePattern#getCategory()
     * @see #getInterchangePattern()
     * @generated
     */
    EAttribute getInterchangePattern_Category();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmmip.InterchangePattern#getProjection <em>Projection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Projection</em>'.
     * @see orgomg.cwmmip.InterchangePattern#getProjection()
     * @see #getInterchangePattern()
     * @generated
     */
    EReference getInterchangePattern_Projection();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmmip.InterchangePattern#getUnitOfInterchange
     * <em>Unit Of Interchange</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference list '
     *         <em>Unit Of Interchange</em>'.
     * @see orgomg.cwmmip.InterchangePattern#getUnitOfInterchange()
     * @see #getInterchangePattern()
     * @generated
     */
    EReference getInterchangePattern_UnitOfInterchange();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmmip.InterchangePattern#getComponentPattern
     * <em>Component Pattern</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference list '
     *         <em>Component Pattern</em>'.
     * @see orgomg.cwmmip.InterchangePattern#getComponentPattern()
     * @see #getInterchangePattern()
     * @generated
     */
    EReference getInterchangePattern_ComponentPattern();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmmip.InterchangePattern#getCompositePattern
     * <em>Composite Pattern</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference list '
     *         <em>Composite Pattern</em>'.
     * @see orgomg.cwmmip.InterchangePattern#getCompositePattern()
     * @see #getInterchangePattern()
     * @generated
     */
    EReference getInterchangePattern_CompositePattern();

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.ModeledSemanticContext <em>Modeled Semantic Context</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Modeled Semantic Context</em>'.
     * @see orgomg.cwmmip.ModeledSemanticContext
     * @generated
     */
    EClass getModeledSemanticContext();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmmip.ModeledSemanticContext#getMofAssociation <em>Mof Association</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Mof Association</em>'.
     * @see orgomg.cwmmip.ModeledSemanticContext#getMofAssociation()
     * @see #getModeledSemanticContext()
     * @generated
     */
    EReference getModeledSemanticContext_MofAssociation();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmmip.ModeledSemanticContext#getMofElement <em>Mof Element</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Mof Element</em>'.
     * @see orgomg.cwmmip.ModeledSemanticContext#getMofElement()
     * @see #getModeledSemanticContext()
     * @generated
     */
    EReference getModeledSemanticContext_MofElement();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmmip.ModeledSemanticContext#getMofAnchorElement
     * <em>Mof Anchor Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference list '
     *         <em>Mof Anchor Element</em>'.
     * @see orgomg.cwmmip.ModeledSemanticContext#getMofAnchorElement()
     * @see #getModeledSemanticContext()
     * @generated
     */
    EReference getModeledSemanticContext_MofAnchorElement();

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.Projection <em>Projection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Projection</em>'.
     * @see orgomg.cwmmip.Projection
     * @generated
     */
    EClass getProjection();

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.SemanticContext
     * <em>Semantic Context</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Semantic Context</em>'.
     * @see orgomg.cwmmip.SemanticContext
     * @generated
     */
    EClass getSemanticContext();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmmip.SemanticContext#getElement <em>Element</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Element</em>'.
     * @see orgomg.cwmmip.SemanticContext#getElement()
     * @see #getSemanticContext()
     * @generated
     */
    EAttribute getSemanticContext_Element();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmmip.SemanticContext#getAssociation <em>Association</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Association</em>'.
     * @see orgomg.cwmmip.SemanticContext#getAssociation()
     * @see #getSemanticContext()
     * @generated
     */
    EAttribute getSemanticContext_Association();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmmip.SemanticContext#getConstraint <em>Constraint</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Constraint</em>'.
     * @see orgomg.cwmmip.SemanticContext#getConstraint()
     * @see #getSemanticContext()
     * @generated
     */
    EReference getSemanticContext_Constraint();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmmip.SemanticContext#getAnchorElement <em>Anchor Element</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Anchor Element</em>'.
     * @see orgomg.cwmmip.SemanticContext#getAnchorElement()
     * @see #getSemanticContext()
     * @generated
     */
    EAttribute getSemanticContext_AnchorElement();

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.Element <em>Element</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see orgomg.cwmmip.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.GraphSubset <em>Graph Subset</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Graph Subset</em>'.
     * @see orgomg.cwmmip.GraphSubset
     * @generated
     */
    EClass getGraphSubset();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmmip.GraphSubset#getElement <em>Element</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Element</em>'.
     * @see orgomg.cwmmip.GraphSubset#getElement()
     * @see #getGraphSubset()
     * @generated
     */
    EAttribute getGraphSubset_Element();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmmip.GraphSubset#isDeepCopy <em>Deep Copy</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Deep Copy</em>'.
     * @see orgomg.cwmmip.GraphSubset#isDeepCopy()
     * @see #getGraphSubset()
     * @generated
     */
    EAttribute getGraphSubset_DeepCopy();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmmip.GraphSubset#getCopyDepth <em>Copy Depth</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Copy Depth</em>'.
     * @see orgomg.cwmmip.GraphSubset#getCopyDepth()
     * @see #getGraphSubset()
     * @generated
     */
    EAttribute getGraphSubset_CopyDepth();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmmip.GraphSubset#isAggregationsOnly
     * <em>Aggregations Only</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Aggregations Only</em>'.
     * @see orgomg.cwmmip.GraphSubset#isAggregationsOnly()
     * @see #getGraphSubset()
     * @generated
     */
    EAttribute getGraphSubset_AggregationsOnly();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmmip.GraphSubset#isIncludeAssociations <em>Include Associations</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the attribute '<em>Include Associations</em>'.
     * @see orgomg.cwmmip.GraphSubset#isIncludeAssociations()
     * @see #getGraphSubset()
     * @generated
     */
    EAttribute getGraphSubset_IncludeAssociations();

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.PatternConstraint <em>Pattern Constraint</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Pattern Constraint</em>'.
     * @see orgomg.cwmmip.PatternConstraint
     * @generated
     */
    EClass getPatternConstraint();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmmip.PatternConstraint#getBody <em>Body</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Body</em>'.
     * @see orgomg.cwmmip.PatternConstraint#getBody()
     * @see #getPatternConstraint()
     * @generated
     */
    EAttribute getPatternConstraint_Body();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmmip.PatternConstraint#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see orgomg.cwmmip.PatternConstraint#getLanguage()
     * @see #getPatternConstraint()
     * @generated
     */
    EAttribute getPatternConstraint_Language();

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.ModeledGraphSubset <em>Modeled Graph Subset</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Modeled Graph Subset</em>'.
     * @see orgomg.cwmmip.ModeledGraphSubset
     * @generated
     */
    EClass getModeledGraphSubset();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmmip.ModeledGraphSubset#getMofElement <em>Mof Element</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Mof Element</em>'.
     * @see orgomg.cwmmip.ModeledGraphSubset#getMofElement()
     * @see #getModeledGraphSubset()
     * @generated
     */
    EReference getModeledGraphSubset_MofElement();

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.Restriction <em>Restriction</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Restriction</em>'.
     * @see orgomg.cwmmip.Restriction
     * @generated
     */
    EClass getRestriction();

    /**
     * Returns the meta object for class '{@link orgomg.cwmmip.BindingParameter
     * <em>Binding Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Binding Parameter</em>'.
     * @see orgomg.cwmmip.BindingParameter
     * @generated
     */
    EClass getBindingParameter();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CwmmipFactory getCwmmipFactory();

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
         * The meta object literal for the '{@link orgomg.cwmmip.impl.UnitOfInterchangeImpl <em>Unit Of Interchange</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmmip.impl.UnitOfInterchangeImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getUnitOfInterchange()
         * @generated
         */
        EClass UNIT_OF_INTERCHANGE = eINSTANCE.getUnitOfInterchange();

        /**
         * The meta object literal for the '<em><b>Interchange Pattern</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN = eINSTANCE.getUnitOfInterchange_InterchangePattern();

        /**
         * The meta object literal for the '{@link orgomg.cwmmip.impl.InterchangePatternImpl <em>Interchange Pattern</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmmip.impl.InterchangePatternImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getInterchangePattern()
         * @generated
         */
        EClass INTERCHANGE_PATTERN = eINSTANCE.getInterchangePattern();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERCHANGE_PATTERN__NAME = eINSTANCE.getInterchangePattern_Name();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERCHANGE_PATTERN__VERSION = eINSTANCE.getInterchangePattern_Version();

        /**
         * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERCHANGE_PATTERN__URI = eINSTANCE.getInterchangePattern_Uri();

        /**
         * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERCHANGE_PATTERN__CLASSIFICATION = eINSTANCE.getInterchangePattern_Classification();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERCHANGE_PATTERN__CATEGORY = eINSTANCE.getInterchangePattern_Category();

        /**
         * The meta object literal for the '<em><b>Projection</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference INTERCHANGE_PATTERN__PROJECTION = eINSTANCE.getInterchangePattern_Projection();

        /**
         * The meta object literal for the '<em><b>Unit Of Interchange</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE = eINSTANCE.getInterchangePattern_UnitOfInterchange();

        /**
         * The meta object literal for the '<em><b>Component Pattern</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INTERCHANGE_PATTERN__COMPONENT_PATTERN = eINSTANCE.getInterchangePattern_ComponentPattern();

        /**
         * The meta object literal for the '<em><b>Composite Pattern</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference INTERCHANGE_PATTERN__COMPOSITE_PATTERN = eINSTANCE.getInterchangePattern_CompositePattern();

        /**
         * The meta object literal for the '{@link orgomg.cwmmip.impl.ModeledSemanticContextImpl <em>Modeled Semantic Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see orgomg.cwmmip.impl.ModeledSemanticContextImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getModeledSemanticContext()
         * @generated
         */
        EClass MODELED_SEMANTIC_CONTEXT = eINSTANCE.getModeledSemanticContext();

        /**
         * The meta object literal for the '<em><b>Mof Association</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference MODELED_SEMANTIC_CONTEXT__MOF_ASSOCIATION = eINSTANCE.getModeledSemanticContext_MofAssociation();

        /**
         * The meta object literal for the '<em><b>Mof Element</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference MODELED_SEMANTIC_CONTEXT__MOF_ELEMENT = eINSTANCE.getModeledSemanticContext_MofElement();

        /**
         * The meta object literal for the '<em><b>Mof Anchor Element</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference MODELED_SEMANTIC_CONTEXT__MOF_ANCHOR_ELEMENT = eINSTANCE.getModeledSemanticContext_MofAnchorElement();

        /**
         * The meta object literal for the '{@link orgomg.cwmmip.impl.ProjectionImpl <em>Projection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmmip.impl.ProjectionImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getProjection()
         * @generated
         */
        EClass PROJECTION = eINSTANCE.getProjection();

        /**
         * The meta object literal for the '{@link orgomg.cwmmip.impl.SemanticContextImpl <em>Semantic Context</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmmip.impl.SemanticContextImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getSemanticContext()
         * @generated
         */
        EClass SEMANTIC_CONTEXT = eINSTANCE.getSemanticContext();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEMANTIC_CONTEXT__ELEMENT = eINSTANCE.getSemanticContext_Element();

        /**
         * The meta object literal for the '<em><b>Association</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEMANTIC_CONTEXT__ASSOCIATION = eINSTANCE.getSemanticContext_Association();

        /**
         * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference SEMANTIC_CONTEXT__CONSTRAINT = eINSTANCE.getSemanticContext_Constraint();

        /**
         * The meta object literal for the '<em><b>Anchor Element</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEMANTIC_CONTEXT__ANCHOR_ELEMENT = eINSTANCE.getSemanticContext_AnchorElement();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmmip.impl.ElementImpl <em>Element</em>}' class. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see orgomg.cwmmip.impl.ElementImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '{@link orgomg.cwmmip.impl.GraphSubsetImpl <em>Graph Subset</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmmip.impl.GraphSubsetImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getGraphSubset()
         * @generated
         */
        EClass GRAPH_SUBSET = eINSTANCE.getGraphSubset();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute GRAPH_SUBSET__ELEMENT = eINSTANCE.getGraphSubset_Element();

        /**
         * The meta object literal for the '<em><b>Deep Copy</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute GRAPH_SUBSET__DEEP_COPY = eINSTANCE.getGraphSubset_DeepCopy();

        /**
         * The meta object literal for the '<em><b>Copy Depth</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute GRAPH_SUBSET__COPY_DEPTH = eINSTANCE.getGraphSubset_CopyDepth();

        /**
         * The meta object literal for the '<em><b>Aggregations Only</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute GRAPH_SUBSET__AGGREGATIONS_ONLY = eINSTANCE.getGraphSubset_AggregationsOnly();

        /**
         * The meta object literal for the '<em><b>Include Associations</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute GRAPH_SUBSET__INCLUDE_ASSOCIATIONS = eINSTANCE.getGraphSubset_IncludeAssociations();

        /**
         * The meta object literal for the '{@link orgomg.cwmmip.impl.PatternConstraintImpl <em>Pattern Constraint</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmmip.impl.PatternConstraintImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getPatternConstraint()
         * @generated
         */
        EClass PATTERN_CONSTRAINT = eINSTANCE.getPatternConstraint();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PATTERN_CONSTRAINT__BODY = eINSTANCE.getPatternConstraint_Body();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PATTERN_CONSTRAINT__LANGUAGE = eINSTANCE.getPatternConstraint_Language();

        /**
         * The meta object literal for the '{@link orgomg.cwmmip.impl.ModeledGraphSubsetImpl <em>Modeled Graph Subset</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmmip.impl.ModeledGraphSubsetImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getModeledGraphSubset()
         * @generated
         */
        EClass MODELED_GRAPH_SUBSET = eINSTANCE.getModeledGraphSubset();

        /**
         * The meta object literal for the '<em><b>Mof Element</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference MODELED_GRAPH_SUBSET__MOF_ELEMENT = eINSTANCE.getModeledGraphSubset_MofElement();

        /**
         * The meta object literal for the '{@link orgomg.cwmmip.impl.RestrictionImpl <em>Restriction</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmmip.impl.RestrictionImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getRestriction()
         * @generated
         */
        EClass RESTRICTION = eINSTANCE.getRestriction();

        /**
         * The meta object literal for the '{@link orgomg.cwmmip.impl.BindingParameterImpl <em>Binding Parameter</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmmip.impl.BindingParameterImpl
         * @see orgomg.cwmmip.impl.CwmmipPackageImpl#getBindingParameter()
         * @generated
         */
        EClass BINDING_PARAMETER = eINSTANCE.getBindingParameter();

    }

} // CwmmipPackage
