/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.analysis.olap.OlapPackage;
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
 * <!-- end-user-doc --> <!-- begin-model-doc --> The Hyperion Essbase package
 * represents the physical data model for a Hyperion Essbase Database. This
 * package extends the Multidimensional package and provides a specific metadata
 * representation for Hyperion?s Essbase multidimensional database.
 * 
 * The classes in this package can be used as either sources or targets of data
 * in the data warehouse, and are available to provide a physical implementation
 * of the OLAP data model.
 * 
 * The Essbase package depends on the following packages:
 * 
 * org.omg::CWM::ObjectModel::Core org.omg::CWM::Foundation::Expressions
 * org.omg::CWM::Foundation::SoftwareDeployment
 * org.omg::CWM::Resource::Multidimensional org.omg::CWM::Analysis::OLAP
 * 
 * Note that the Essbase metamodel is primarily dependent on classes of the
 * Multidimensional model.
 * 
 * OCL Representation of Essbase Constraints
 * 
 * [C-1] Restrict the cardinality of the namespace role to 1 so that a Database
 * must always be owned by an Application. context Database inv:
 * self.namespace->notEmpty and self.namespace.oclIsKindOf( Application )
 * 
 * [C-2] Essbase Dimensions are not composed from other Essbase dimensions.
 * context Dimension inv: self.component->isEmpty inv: self.composite->isEmpty
 * 
 * [C-3] The inclusion of certain DimensionedObjects is valid only for certain
 * DimensionTypes. context Dimension inv: self.dimensionedObject->includes(
 * TimeBalance ) implies self.type = #ess_accounts inv:
 * self.dimensionedObject->includes( VarianceReporting ) implies self.type =
 * #ess_accounts inv: self.dimensionedObject->includes( CurrencyConversion )
 * implies self.type = #ess_currencyPartition inv:
 * self.dimensionedObject->includes( UDA ) implies self.type = #ess_attribute
 * 
 * [C-4] The Outline name must be the same as the Database name. context Outline
 * inv: self.name = self.database.name
 * 
 * [C-5] Restrict the cardinality of the namespace role to 1 so that a Partition
 * must always be owned by a Database. context Partition inv:
 * self.namespace->notEmpty and self.namespace.oclIsKindOf( Database )
 * 
 * [C-6] Only a source Partition can be shared. context Partition inv:
 * self.isShared implies self.isSource <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.essbase.EssbaseFactory
 * @model kind="package"
 * @generated
 */
public interface EssbasePackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "essbase";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///orgomg/cwmx/resource/essbase.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "orgomg.cwmx.resource.essbase";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EssbasePackage eINSTANCE = orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl.init();

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.AliasImpl <em>Alias</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.AliasImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getAlias()
     * @generated
     */
    int ALIAS = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIAS__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Alias</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ALIAS_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.essbase.impl.ApplicationImpl
     * <em>Application</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.essbase.impl.ApplicationImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getApplication()
     * @generated
     */
    int APPLICATION = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int APPLICATION__NAME = CorePackage.PACKAGE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int APPLICATION__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__SUPPLIER_DEPENDENCY = CorePackage.PACKAGE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int APPLICATION__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int APPLICATION__IMPORTER = CorePackage.PACKAGE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int APPLICATION__STEREOTYPE = CorePackage.PACKAGE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int APPLICATION__DOCUMENT = CorePackage.PACKAGE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int APPLICATION__DESCRIPTION = CorePackage.PACKAGE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__RESPONSIBLE_PARTY = CorePackage.PACKAGE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__ELEMENT_NODE = CorePackage.PACKAGE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int APPLICATION__SET = CorePackage.PACKAGE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__RENDERED_OBJECT = CorePackage.PACKAGE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__VOCABULARY_ELEMENT = CorePackage.PACKAGE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int APPLICATION__MEASUREMENT = CorePackage.PACKAGE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__CHANGE_REQUEST = CorePackage.PACKAGE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__DASDL_PROPERTY = CorePackage.PACKAGE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__DATA_MANAGER = CorePackage.PACKAGE__DATA_MANAGER;

    /**
     * The number of structural features of the '<em>Application</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.CommentImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getComment()
     * @generated
     */
    int COMMENT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Comment</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int COMMENT_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.essbase.impl.ConsolidationImpl
     * <em>Consolidation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.essbase.impl.ConsolidationImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getConsolidation()
     * @generated
     */
    int CONSOLIDATION = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CONSOLIDATION__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Consolidation</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSOLIDATION_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.CurrencyConversionImpl <em>Currency Conversion</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.CurrencyConversionImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getCurrencyConversion()
     * @generated
     */
    int CURRENCY_CONVERSION = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Currency Conversion</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_CONVERSION_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.essbase.impl.DataStorageImpl
     * <em>Data Storage</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.essbase.impl.DataStorageImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getDataStorage()
     * @generated
     */
    int DATA_STORAGE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_STORAGE__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Data Storage</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORAGE_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.DatabaseImpl <em>Database</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.DatabaseImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getDatabase()
     * @generated
     */
    int DATABASE = 6;

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
     * The feature id for the '<em><b>Is Currency</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__IS_CURRENCY = MultidimensionalPackage.SCHEMA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outline</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__OUTLINE = MultidimensionalPackage.SCHEMA_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Database</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_FEATURE_COUNT = MultidimensionalPackage.SCHEMA_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.DimensionImpl <em>Dimension</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.DimensionImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getDimension()
     * @generated
     */
    int DIMENSION = 7;

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
     * The feature id for the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__TYPE = MultidimensionalPackage.DIMENSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Dense</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__IS_DENSE = MultidimensionalPackage.DIMENSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Outline</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION__OUTLINE = MultidimensionalPackage.DIMENSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Dimension</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DIMENSION_FEATURE_COUNT = MultidimensionalPackage.DIMENSION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.FormulaImpl <em>Formula</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.FormulaImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getFormula()
     * @generated
     */
    int FORMULA = 8;

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
     * The number of structural features of the '<em>Formula</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FORMULA_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.essbase.impl.GenerationImpl
     * <em>Generation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.essbase.impl.GenerationImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getGeneration()
     * @generated
     */
    int GENERATION = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GENERATION__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Generation</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERATION_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.ImmediateParentImpl <em>Immediate Parent</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.ImmediateParentImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getImmediateParent()
     * @generated
     */
    int IMMEDIATE_PARENT = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Immediate Parent</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMMEDIATE_PARENT_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.LevelImpl <em>Level</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.LevelImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getLevel()
     * @generated
     */
    int LEVEL = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Level</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LEVEL_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.essbase.impl.MemberNameImpl
     * <em>Member Name</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.essbase.impl.MemberNameImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getMemberName()
     * @generated
     */
    int MEMBER_NAME = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEMBER_NAME__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Member Name</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_NAME_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.essbase.impl.OLAPServerImpl
     * <em>OLAP Server</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.essbase.impl.OLAPServerImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getOLAPServer()
     * @generated
     */
    int OLAP_SERVER = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__NAME = SoftwaredeploymentPackage.DATA_MANAGER__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__VISIBILITY = SoftwaredeploymentPackage.DATA_MANAGER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__CLIENT_DEPENDENCY = SoftwaredeploymentPackage.DATA_MANAGER__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__SUPPLIER_DEPENDENCY = SoftwaredeploymentPackage.DATA_MANAGER__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__CONSTRAINT = SoftwaredeploymentPackage.DATA_MANAGER__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__NAMESPACE = SoftwaredeploymentPackage.DATA_MANAGER__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__IMPORTER = SoftwaredeploymentPackage.DATA_MANAGER__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__STEREOTYPE = SoftwaredeploymentPackage.DATA_MANAGER__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__TAGGED_VALUE = SoftwaredeploymentPackage.DATA_MANAGER__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__DOCUMENT = SoftwaredeploymentPackage.DATA_MANAGER__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__DESCRIPTION = SoftwaredeploymentPackage.DATA_MANAGER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__RESPONSIBLE_PARTY = SoftwaredeploymentPackage.DATA_MANAGER__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__ELEMENT_NODE = SoftwaredeploymentPackage.DATA_MANAGER__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__SET = SoftwaredeploymentPackage.DATA_MANAGER__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__RENDERED_OBJECT = SoftwaredeploymentPackage.DATA_MANAGER__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__VOCABULARY_ELEMENT = SoftwaredeploymentPackage.DATA_MANAGER__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__MEASUREMENT = SoftwaredeploymentPackage.DATA_MANAGER__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__CHANGE_REQUEST = SoftwaredeploymentPackage.DATA_MANAGER__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__DASDL_PROPERTY = SoftwaredeploymentPackage.DATA_MANAGER__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__OWNED_ELEMENT = SoftwaredeploymentPackage.DATA_MANAGER__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__IMPORTED_ELEMENT = SoftwaredeploymentPackage.DATA_MANAGER__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__DATA_MANAGER = SoftwaredeploymentPackage.DATA_MANAGER__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__PATHNAME = SoftwaredeploymentPackage.DATA_MANAGER__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__MACHINE = SoftwaredeploymentPackage.DATA_MANAGER__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__DEPLOYED_SOFTWARE_SYSTEM = SoftwaredeploymentPackage.DATA_MANAGER__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OLAP_SERVER__COMPONENT = SoftwaredeploymentPackage.DATA_MANAGER__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__IS_CASE_SENSITIVE = SoftwaredeploymentPackage.DATA_MANAGER__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__CLIENT_CONNECTION = SoftwaredeploymentPackage.DATA_MANAGER__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER__DATA_PACKAGE = SoftwaredeploymentPackage.DATA_MANAGER__DATA_PACKAGE;

    /**
     * The number of structural features of the '<em>OLAP Server</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OLAP_SERVER_FEATURE_COUNT = SoftwaredeploymentPackage.DATA_MANAGER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.OutlineImpl <em>Outline</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.OutlineImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getOutline()
     * @generated
     */
    int OUTLINE = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__NAME = CorePackage.NAMESPACE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__VISIBILITY = CorePackage.NAMESPACE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__CLIENT_DEPENDENCY = CorePackage.NAMESPACE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__SUPPLIER_DEPENDENCY = CorePackage.NAMESPACE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__CONSTRAINT = CorePackage.NAMESPACE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__NAMESPACE = CorePackage.NAMESPACE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__IMPORTER = CorePackage.NAMESPACE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__STEREOTYPE = CorePackage.NAMESPACE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__TAGGED_VALUE = CorePackage.NAMESPACE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__DOCUMENT = CorePackage.NAMESPACE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__DESCRIPTION = CorePackage.NAMESPACE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__RESPONSIBLE_PARTY = CorePackage.NAMESPACE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__ELEMENT_NODE = CorePackage.NAMESPACE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__SET = CorePackage.NAMESPACE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__RENDERED_OBJECT = CorePackage.NAMESPACE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__VOCABULARY_ELEMENT = CorePackage.NAMESPACE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__MEASUREMENT = CorePackage.NAMESPACE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__CHANGE_REQUEST = CorePackage.NAMESPACE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__DASDL_PROPERTY = CorePackage.NAMESPACE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__OWNED_ELEMENT = CorePackage.NAMESPACE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Alias Table Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__ALIAS_TABLE_NAME = CorePackage.NAMESPACE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Database</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTLINE__DATABASE = CorePackage.NAMESPACE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE__DIMENSION = CorePackage.NAMESPACE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Outline</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTLINE_FEATURE_COUNT = CorePackage.NAMESPACE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.PartitionImpl <em>Partition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.PartitionImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getPartition()
     * @generated
     */
    int PARTITION = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__NAME = OlapPackage.CUBE_REGION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__VISIBILITY = OlapPackage.CUBE_REGION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__CLIENT_DEPENDENCY = OlapPackage.CUBE_REGION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__SUPPLIER_DEPENDENCY = OlapPackage.CUBE_REGION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__CONSTRAINT = OlapPackage.CUBE_REGION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__NAMESPACE = OlapPackage.CUBE_REGION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__IMPORTER = OlapPackage.CUBE_REGION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__STEREOTYPE = OlapPackage.CUBE_REGION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__TAGGED_VALUE = OlapPackage.CUBE_REGION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__DOCUMENT = OlapPackage.CUBE_REGION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__DESCRIPTION = OlapPackage.CUBE_REGION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__RESPONSIBLE_PARTY = OlapPackage.CUBE_REGION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__ELEMENT_NODE = OlapPackage.CUBE_REGION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__SET = OlapPackage.CUBE_REGION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__RENDERED_OBJECT = OlapPackage.CUBE_REGION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__VOCABULARY_ELEMENT = OlapPackage.CUBE_REGION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__MEASUREMENT = OlapPackage.CUBE_REGION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__CHANGE_REQUEST = OlapPackage.CUBE_REGION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__DASDL_PROPERTY = OlapPackage.CUBE_REGION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__OWNED_ELEMENT = OlapPackage.CUBE_REGION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__IS_ABSTRACT = OlapPackage.CUBE_REGION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__FEATURE = OlapPackage.CUBE_REGION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__STRUCTURAL_FEATURE = OlapPackage.CUBE_REGION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__PARAMETER = OlapPackage.CUBE_REGION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__GENERALIZATION = OlapPackage.CUBE_REGION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__SPECIALIZATION = OlapPackage.CUBE_REGION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__INSTANCE = OlapPackage.CUBE_REGION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__ALIAS = OlapPackage.CUBE_REGION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__EXPRESSION_NODE = OlapPackage.CUBE_REGION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__MAPPING_FROM = OlapPackage.CUBE_REGION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__MAPPING_TO = OlapPackage.CUBE_REGION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__CLASSIFIER_MAP = OlapPackage.CUBE_REGION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__CF_MAP = OlapPackage.CUBE_REGION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__DOMAIN = OlapPackage.CUBE_REGION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__SIMPLE_DIMENSION = OlapPackage.CUBE_REGION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__INDEX = OlapPackage.CUBE_REGION__INDEX;

    /**
     * The feature id for the '<em><b>Is Read Only</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__IS_READ_ONLY = OlapPackage.CUBE_REGION__IS_READ_ONLY;

    /**
     * The feature id for the '<em><b>Is Fully Realized</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__IS_FULLY_REALIZED = OlapPackage.CUBE_REGION__IS_FULLY_REALIZED;

    /**
     * The feature id for the '<em><b>Cube</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__CUBE = OlapPackage.CUBE_REGION__CUBE;

    /**
     * The feature id for the '<em><b>Member Selection Group</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__MEMBER_SELECTION_GROUP = OlapPackage.CUBE_REGION__MEMBER_SELECTION_GROUP;

    /**
     * The feature id for the '<em><b>Cube Deployment</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__CUBE_DEPLOYMENT = OlapPackage.CUBE_REGION__CUBE_DEPLOYMENT;

    /**
     * The feature id for the '<em><b>Is Source</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__IS_SOURCE = OlapPackage.CUBE_REGION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Shared</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION__IS_SHARED = OlapPackage.CUBE_REGION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION__FORMULA = OlapPackage.CUBE_REGION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Partition</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PARTITION_FEATURE_COUNT = OlapPackage.CUBE_REGION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.ReplicatedPartitionImpl <em>Replicated Partition</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.ReplicatedPartitionImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getReplicatedPartition()
     * @generated
     */
    int REPLICATED_PARTITION = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__NAME = PARTITION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__VISIBILITY = PARTITION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__CLIENT_DEPENDENCY = PARTITION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__SUPPLIER_DEPENDENCY = PARTITION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__CONSTRAINT = PARTITION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__NAMESPACE = PARTITION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__IMPORTER = PARTITION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__STEREOTYPE = PARTITION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__TAGGED_VALUE = PARTITION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__DOCUMENT = PARTITION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__DESCRIPTION = PARTITION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__RESPONSIBLE_PARTY = PARTITION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__ELEMENT_NODE = PARTITION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__SET = PARTITION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__RENDERED_OBJECT = PARTITION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__VOCABULARY_ELEMENT = PARTITION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__MEASUREMENT = PARTITION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__CHANGE_REQUEST = PARTITION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__DASDL_PROPERTY = PARTITION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__OWNED_ELEMENT = PARTITION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__IS_ABSTRACT = PARTITION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__FEATURE = PARTITION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__STRUCTURAL_FEATURE = PARTITION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__PARAMETER = PARTITION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__GENERALIZATION = PARTITION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__SPECIALIZATION = PARTITION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__INSTANCE = PARTITION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__ALIAS = PARTITION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__EXPRESSION_NODE = PARTITION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__MAPPING_FROM = PARTITION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__MAPPING_TO = PARTITION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__CLASSIFIER_MAP = PARTITION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__CF_MAP = PARTITION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__DOMAIN = PARTITION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__SIMPLE_DIMENSION = PARTITION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__INDEX = PARTITION__INDEX;

    /**
     * The feature id for the '<em><b>Is Read Only</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__IS_READ_ONLY = PARTITION__IS_READ_ONLY;

    /**
     * The feature id for the '<em><b>Is Fully Realized</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__IS_FULLY_REALIZED = PARTITION__IS_FULLY_REALIZED;

    /**
     * The feature id for the '<em><b>Cube</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__CUBE = PARTITION__CUBE;

    /**
     * The feature id for the '<em><b>Member Selection Group</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__MEMBER_SELECTION_GROUP = PARTITION__MEMBER_SELECTION_GROUP;

    /**
     * The feature id for the '<em><b>Cube Deployment</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__CUBE_DEPLOYMENT = PARTITION__CUBE_DEPLOYMENT;

    /**
     * The feature id for the '<em><b>Is Source</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__IS_SOURCE = PARTITION__IS_SOURCE;

    /**
     * The feature id for the '<em><b>Is Shared</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__IS_SHARED = PARTITION__IS_SHARED;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION__FORMULA = PARTITION__FORMULA;

    /**
     * The number of structural features of the '<em>Replicated Partition</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPLICATED_PARTITION_FEATURE_COUNT = PARTITION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.essbase.impl.TimeBalanceImpl
     * <em>Time Balance</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.essbase.impl.TimeBalanceImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getTimeBalance()
     * @generated
     */
    int TIME_BALANCE = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_BALANCE__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Time Balance</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_BALANCE_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.TransparentPartitionImpl <em>Transparent Partition</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.TransparentPartitionImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getTransparentPartition()
     * @generated
     */
    int TRANSPARENT_PARTITION = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__NAME = PARTITION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__VISIBILITY = PARTITION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__CLIENT_DEPENDENCY = PARTITION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__SUPPLIER_DEPENDENCY = PARTITION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__CONSTRAINT = PARTITION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__NAMESPACE = PARTITION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__IMPORTER = PARTITION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__STEREOTYPE = PARTITION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__TAGGED_VALUE = PARTITION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__DOCUMENT = PARTITION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__DESCRIPTION = PARTITION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__RESPONSIBLE_PARTY = PARTITION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__ELEMENT_NODE = PARTITION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__SET = PARTITION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__RENDERED_OBJECT = PARTITION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__VOCABULARY_ELEMENT = PARTITION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__MEASUREMENT = PARTITION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__CHANGE_REQUEST = PARTITION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__DASDL_PROPERTY = PARTITION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__OWNED_ELEMENT = PARTITION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__IS_ABSTRACT = PARTITION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__FEATURE = PARTITION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__STRUCTURAL_FEATURE = PARTITION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__PARAMETER = PARTITION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__GENERALIZATION = PARTITION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__SPECIALIZATION = PARTITION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__INSTANCE = PARTITION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__ALIAS = PARTITION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__EXPRESSION_NODE = PARTITION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__MAPPING_FROM = PARTITION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__MAPPING_TO = PARTITION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__CLASSIFIER_MAP = PARTITION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__CF_MAP = PARTITION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__DOMAIN = PARTITION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__SIMPLE_DIMENSION = PARTITION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__INDEX = PARTITION__INDEX;

    /**
     * The feature id for the '<em><b>Is Read Only</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__IS_READ_ONLY = PARTITION__IS_READ_ONLY;

    /**
     * The feature id for the '<em><b>Is Fully Realized</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__IS_FULLY_REALIZED = PARTITION__IS_FULLY_REALIZED;

    /**
     * The feature id for the '<em><b>Cube</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__CUBE = PARTITION__CUBE;

    /**
     * The feature id for the '<em><b>Member Selection Group</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__MEMBER_SELECTION_GROUP = PARTITION__MEMBER_SELECTION_GROUP;

    /**
     * The feature id for the '<em><b>Cube Deployment</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__CUBE_DEPLOYMENT = PARTITION__CUBE_DEPLOYMENT;

    /**
     * The feature id for the '<em><b>Is Source</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__IS_SOURCE = PARTITION__IS_SOURCE;

    /**
     * The feature id for the '<em><b>Is Shared</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__IS_SHARED = PARTITION__IS_SHARED;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION__FORMULA = PARTITION__FORMULA;

    /**
     * The number of structural features of the '<em>Transparent Partition</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_PARTITION_FEATURE_COUNT = PARTITION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.TwoPassCalculationImpl <em>Two Pass Calculation</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.TwoPassCalculationImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getTwoPassCalculation()
     * @generated
     */
    int TWO_PASS_CALCULATION = 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Two Pass Calculation</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TWO_PASS_CALCULATION_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.UDAImpl <em>UDA</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.UDAImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getUDA()
     * @generated
     */
    int UDA = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UDA__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>UDA</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int UDA_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.VarianceReportingImpl <em>Variance Reporting</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.VarianceReportingImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getVarianceReporting()
     * @generated
     */
    int VARIANCE_REPORTING = 21;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__NAME = MultidimensionalPackage.DIMENSIONED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__VISIBILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__CLIENT_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__SUPPLIER_DEPENDENCY = MultidimensionalPackage.DIMENSIONED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__CONSTRAINT = MultidimensionalPackage.DIMENSIONED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__NAMESPACE = MultidimensionalPackage.DIMENSIONED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__IMPORTER = MultidimensionalPackage.DIMENSIONED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__STEREOTYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__TAGGED_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__DOCUMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__DESCRIPTION = MultidimensionalPackage.DIMENSIONED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__RESPONSIBLE_PARTY = MultidimensionalPackage.DIMENSIONED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__ELEMENT_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__SET = MultidimensionalPackage.DIMENSIONED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__RENDERED_OBJECT = MultidimensionalPackage.DIMENSIONED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__VOCABULARY_ELEMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__MEASUREMENT = MultidimensionalPackage.DIMENSIONED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__CHANGE_REQUEST = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__DASDL_PROPERTY = MultidimensionalPackage.DIMENSIONED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__OWNER_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__OWNER = MultidimensionalPackage.DIMENSIONED_OBJECT__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__FEATURE_NODE = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__FEATURE_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__CF_MAP = MultidimensionalPackage.DIMENSIONED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__CHANGEABILITY = MultidimensionalPackage.DIMENSIONED_OBJECT__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__MULTIPLICITY = MultidimensionalPackage.DIMENSIONED_OBJECT__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__ORDERING = MultidimensionalPackage.DIMENSIONED_OBJECT__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__TARGET_SCOPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__TYPE = MultidimensionalPackage.DIMENSIONED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__SLOT = MultidimensionalPackage.DIMENSIONED_OBJECT__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__DISCRIMINATED_UNION = MultidimensionalPackage.DIMENSIONED_OBJECT__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__INDEXED_FEATURE = MultidimensionalPackage.DIMENSIONED_OBJECT__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__KEY_RELATIONSHIP = MultidimensionalPackage.DIMENSIONED_OBJECT__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__UNIQUE_KEY = MultidimensionalPackage.DIMENSIONED_OBJECT__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__DATA_ITEM = MultidimensionalPackage.DIMENSIONED_OBJECT__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__REMAP = MultidimensionalPackage.DIMENSIONED_OBJECT__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__INITIAL_VALUE = MultidimensionalPackage.DIMENSIONED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Dimension</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__DIMENSION = MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING__SCHEMA = MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA;

    /**
     * The number of structural features of the '<em>Variance Reporting</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIANCE_REPORTING_FEATURE_COUNT = MultidimensionalPackage.DIMENSIONED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.essbase.impl.LinkedPartitionImpl <em>Linked Partition</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.essbase.impl.LinkedPartitionImpl
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getLinkedPartition()
     * @generated
     */
    int LINKED_PARTITION = 22;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__NAME = PARTITION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__VISIBILITY = PARTITION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__CLIENT_DEPENDENCY = PARTITION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__SUPPLIER_DEPENDENCY = PARTITION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__CONSTRAINT = PARTITION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__NAMESPACE = PARTITION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__IMPORTER = PARTITION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__STEREOTYPE = PARTITION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__TAGGED_VALUE = PARTITION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__DOCUMENT = PARTITION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__DESCRIPTION = PARTITION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__RESPONSIBLE_PARTY = PARTITION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__ELEMENT_NODE = PARTITION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__SET = PARTITION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__RENDERED_OBJECT = PARTITION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__VOCABULARY_ELEMENT = PARTITION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__MEASUREMENT = PARTITION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__CHANGE_REQUEST = PARTITION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__DASDL_PROPERTY = PARTITION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__OWNED_ELEMENT = PARTITION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__IS_ABSTRACT = PARTITION__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__FEATURE = PARTITION__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__STRUCTURAL_FEATURE = PARTITION__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__PARAMETER = PARTITION__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__GENERALIZATION = PARTITION__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__SPECIALIZATION = PARTITION__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__INSTANCE = PARTITION__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__ALIAS = PARTITION__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__EXPRESSION_NODE = PARTITION__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__MAPPING_FROM = PARTITION__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__MAPPING_TO = PARTITION__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__CLASSIFIER_MAP = PARTITION__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__CF_MAP = PARTITION__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__DOMAIN = PARTITION__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__SIMPLE_DIMENSION = PARTITION__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__INDEX = PARTITION__INDEX;

    /**
     * The feature id for the '<em><b>Is Read Only</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__IS_READ_ONLY = PARTITION__IS_READ_ONLY;

    /**
     * The feature id for the '<em><b>Is Fully Realized</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__IS_FULLY_REALIZED = PARTITION__IS_FULLY_REALIZED;

    /**
     * The feature id for the '<em><b>Cube</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__CUBE = PARTITION__CUBE;

    /**
     * The feature id for the '<em><b>Member Selection Group</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__MEMBER_SELECTION_GROUP = PARTITION__MEMBER_SELECTION_GROUP;

    /**
     * The feature id for the '<em><b>Cube Deployment</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__CUBE_DEPLOYMENT = PARTITION__CUBE_DEPLOYMENT;

    /**
     * The feature id for the '<em><b>Is Source</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__IS_SOURCE = PARTITION__IS_SOURCE;

    /**
     * The feature id for the '<em><b>Is Shared</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__IS_SHARED = PARTITION__IS_SHARED;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION__FORMULA = PARTITION__FORMULA;

    /**
     * The number of structural features of the '<em>Linked Partition</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PARTITION_FEATURE_COUNT = PARTITION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.essbase.DimensionType
     * <em>Dimension Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.essbase.DimensionType
     * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getDimensionType()
     * @generated
     */
    int DIMENSION_TYPE = 23;

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.Alias <em>Alias</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Alias</em>'.
     * @see orgomg.cwmx.resource.essbase.Alias
     * @generated
     */
    EClass getAlias();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.essbase.Application <em>Application</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Application</em>'.
     * @see orgomg.cwmx.resource.essbase.Application
     * @generated
     */
    EClass getApplication();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.Comment <em>Comment</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Comment</em>'.
     * @see orgomg.cwmx.resource.essbase.Comment
     * @generated
     */
    EClass getComment();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.essbase.Consolidation <em>Consolidation</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Consolidation</em>'.
     * @see orgomg.cwmx.resource.essbase.Consolidation
     * @generated
     */
    EClass getConsolidation();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.CurrencyConversion
     * <em>Currency Conversion</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Currency Conversion</em>'.
     * @see orgomg.cwmx.resource.essbase.CurrencyConversion
     * @generated
     */
    EClass getCurrencyConversion();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.essbase.DataStorage <em>Data Storage</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Storage</em>'.
     * @see orgomg.cwmx.resource.essbase.DataStorage
     * @generated
     */
    EClass getDataStorage();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.Database <em>Database</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Database</em>'.
     * @see orgomg.cwmx.resource.essbase.Database
     * @generated
     */
    EClass getDatabase();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.essbase.Database#isIsCurrency <em>Is Currency</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Currency</em>'.
     * @see orgomg.cwmx.resource.essbase.Database#isIsCurrency()
     * @see #getDatabase()
     * @generated
     */
    EAttribute getDatabase_IsCurrency();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.resource.essbase.Database#getOutline <em>Outline</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Outline</em>'.
     * @see orgomg.cwmx.resource.essbase.Database#getOutline()
     * @see #getDatabase()
     * @generated
     */
    EReference getDatabase_Outline();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.Dimension <em>Dimension</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Dimension</em>'.
     * @see orgomg.cwmx.resource.essbase.Dimension
     * @generated
     */
    EClass getDimension();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.essbase.Dimension#getType <em>Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see orgomg.cwmx.resource.essbase.Dimension#getType()
     * @see #getDimension()
     * @generated
     */
    EAttribute getDimension_Type();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.essbase.Dimension#isIsDense <em>Is Dense</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Dense</em>'.
     * @see orgomg.cwmx.resource.essbase.Dimension#isIsDense()
     * @see #getDimension()
     * @generated
     */
    EAttribute getDimension_IsDense();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.essbase.Dimension#getOutline <em>Outline</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Outline</em>'.
     * @see orgomg.cwmx.resource.essbase.Dimension#getOutline()
     * @see #getDimension()
     * @generated
     */
    EReference getDimension_Outline();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.Formula <em>Formula</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Formula</em>'.
     * @see orgomg.cwmx.resource.essbase.Formula
     * @generated
     */
    EClass getFormula();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.essbase.Generation <em>Generation</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Generation</em>'.
     * @see orgomg.cwmx.resource.essbase.Generation
     * @generated
     */
    EClass getGeneration();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.ImmediateParent
     * <em>Immediate Parent</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Immediate Parent</em>'.
     * @see orgomg.cwmx.resource.essbase.ImmediateParent
     * @generated
     */
    EClass getImmediateParent();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.Level <em>Level</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Level</em>'.
     * @see orgomg.cwmx.resource.essbase.Level
     * @generated
     */
    EClass getLevel();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.essbase.MemberName <em>Member Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Member Name</em>'.
     * @see orgomg.cwmx.resource.essbase.MemberName
     * @generated
     */
    EClass getMemberName();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.essbase.OLAPServer <em>OLAP Server</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>OLAP Server</em>'.
     * @see orgomg.cwmx.resource.essbase.OLAPServer
     * @generated
     */
    EClass getOLAPServer();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.Outline <em>Outline</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Outline</em>'.
     * @see orgomg.cwmx.resource.essbase.Outline
     * @generated
     */
    EClass getOutline();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.essbase.Outline#getAliasTableName
     * <em>Alias Table Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Alias Table Name</em>'.
     * @see orgomg.cwmx.resource.essbase.Outline#getAliasTableName()
     * @see #getOutline()
     * @generated
     */
    EAttribute getOutline_AliasTableName();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.essbase.Outline#getDatabase <em>Database</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Database</em>'.
     * @see orgomg.cwmx.resource.essbase.Outline#getDatabase()
     * @see #getOutline()
     * @generated
     */
    EReference getOutline_Database();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.essbase.Outline#getDimension <em>Dimension</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Dimension</em>'.
     * @see orgomg.cwmx.resource.essbase.Outline#getDimension()
     * @see #getOutline()
     * @generated
     */
    EReference getOutline_Dimension();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.Partition <em>Partition</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Partition</em>'.
     * @see orgomg.cwmx.resource.essbase.Partition
     * @generated
     */
    EClass getPartition();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.essbase.Partition#isIsSource <em>Is Source</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Source</em>'.
     * @see orgomg.cwmx.resource.essbase.Partition#isIsSource()
     * @see #getPartition()
     * @generated
     */
    EAttribute getPartition_IsSource();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.essbase.Partition#isIsShared <em>Is Shared</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Shared</em>'.
     * @see orgomg.cwmx.resource.essbase.Partition#isIsShared()
     * @see #getPartition()
     * @generated
     */
    EAttribute getPartition_IsShared();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.resource.essbase.Partition#getFormula <em>Formula</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Formula</em>'.
     * @see orgomg.cwmx.resource.essbase.Partition#getFormula()
     * @see #getPartition()
     * @generated
     */
    EReference getPartition_Formula();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.essbase.ReplicatedPartition <em>Replicated Partition</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Replicated Partition</em>'.
     * @see orgomg.cwmx.resource.essbase.ReplicatedPartition
     * @generated
     */
    EClass getReplicatedPartition();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.essbase.TimeBalance <em>Time Balance</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Balance</em>'.
     * @see orgomg.cwmx.resource.essbase.TimeBalance
     * @generated
     */
    EClass getTimeBalance();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.essbase.TransparentPartition <em>Transparent Partition</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Transparent Partition</em>'.
     * @see orgomg.cwmx.resource.essbase.TransparentPartition
     * @generated
     */
    EClass getTransparentPartition();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.essbase.TwoPassCalculation <em>Two Pass Calculation</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Two Pass Calculation</em>'.
     * @see orgomg.cwmx.resource.essbase.TwoPassCalculation
     * @generated
     */
    EClass getTwoPassCalculation();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.UDA <em>UDA</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>UDA</em>'.
     * @see orgomg.cwmx.resource.essbase.UDA
     * @generated
     */
    EClass getUDA();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.VarianceReporting
     * <em>Variance Reporting</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Variance Reporting</em>'.
     * @see orgomg.cwmx.resource.essbase.VarianceReporting
     * @generated
     */
    EClass getVarianceReporting();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.essbase.LinkedPartition
     * <em>Linked Partition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Linked Partition</em>'.
     * @see orgomg.cwmx.resource.essbase.LinkedPartition
     * @generated
     */
    EClass getLinkedPartition();

    /**
     * Returns the meta object for enum '{@link orgomg.cwmx.resource.essbase.DimensionType <em>Dimension Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>Dimension Type</em>'.
     * @see orgomg.cwmx.resource.essbase.DimensionType
     * @generated
     */
    EEnum getDimensionType();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EssbaseFactory getEssbaseFactory();

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
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.AliasImpl <em>Alias</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.AliasImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getAlias()
         * @generated
         */
        EClass ALIAS = eINSTANCE.getAlias();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.ApplicationImpl <em>Application</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.ApplicationImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getApplication()
         * @generated
         */
        EClass APPLICATION = eINSTANCE.getApplication();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.essbase.impl.CommentImpl
         * <em>Comment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.essbase.impl.CommentImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getComment()
         * @generated
         */
        EClass COMMENT = eINSTANCE.getComment();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.ConsolidationImpl <em>Consolidation</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.ConsolidationImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getConsolidation()
         * @generated
         */
        EClass CONSOLIDATION = eINSTANCE.getConsolidation();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.CurrencyConversionImpl <em>Currency Conversion</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.CurrencyConversionImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getCurrencyConversion()
         * @generated
         */
        EClass CURRENCY_CONVERSION = eINSTANCE.getCurrencyConversion();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.DataStorageImpl <em>Data Storage</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.DataStorageImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getDataStorage()
         * @generated
         */
        EClass DATA_STORAGE = eINSTANCE.getDataStorage();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.essbase.impl.DatabaseImpl
         * <em>Database</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.essbase.impl.DatabaseImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getDatabase()
         * @generated
         */
        EClass DATABASE = eINSTANCE.getDatabase();

        /**
         * The meta object literal for the '<em><b>Is Currency</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE__IS_CURRENCY = eINSTANCE.getDatabase_IsCurrency();

        /**
         * The meta object literal for the '<em><b>Outline</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DATABASE__OUTLINE = eINSTANCE.getDatabase_Outline();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.essbase.impl.DimensionImpl
         * <em>Dimension</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.essbase.impl.DimensionImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getDimension()
         * @generated
         */
        EClass DIMENSION = eINSTANCE.getDimension();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIMENSION__TYPE = eINSTANCE.getDimension_Type();

        /**
         * The meta object literal for the '<em><b>Is Dense</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIMENSION__IS_DENSE = eINSTANCE.getDimension_IsDense();

        /**
         * The meta object literal for the '<em><b>Outline</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DIMENSION__OUTLINE = eINSTANCE.getDimension_Outline();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.essbase.impl.FormulaImpl
         * <em>Formula</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.essbase.impl.FormulaImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getFormula()
         * @generated
         */
        EClass FORMULA = eINSTANCE.getFormula();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.GenerationImpl <em>Generation</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.GenerationImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getGeneration()
         * @generated
         */
        EClass GENERATION = eINSTANCE.getGeneration();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.ImmediateParentImpl <em>Immediate Parent</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.ImmediateParentImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getImmediateParent()
         * @generated
         */
        EClass IMMEDIATE_PARENT = eINSTANCE.getImmediateParent();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.LevelImpl <em>Level</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.LevelImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getLevel()
         * @generated
         */
        EClass LEVEL = eINSTANCE.getLevel();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.MemberNameImpl <em>Member Name</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.MemberNameImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getMemberName()
         * @generated
         */
        EClass MEMBER_NAME = eINSTANCE.getMemberName();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.OLAPServerImpl <em>OLAP Server</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.OLAPServerImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getOLAPServer()
         * @generated
         */
        EClass OLAP_SERVER = eINSTANCE.getOLAPServer();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.essbase.impl.OutlineImpl
         * <em>Outline</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.essbase.impl.OutlineImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getOutline()
         * @generated
         */
        EClass OUTLINE = eINSTANCE.getOutline();

        /**
         * The meta object literal for the '<em><b>Alias Table Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTLINE__ALIAS_TABLE_NAME = eINSTANCE.getOutline_AliasTableName();

        /**
         * The meta object literal for the '<em><b>Database</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference OUTLINE__DATABASE = eINSTANCE.getOutline_Database();

        /**
         * The meta object literal for the '<em><b>Dimension</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference OUTLINE__DIMENSION = eINSTANCE.getOutline_Dimension();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.essbase.impl.PartitionImpl
         * <em>Partition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.essbase.impl.PartitionImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getPartition()
         * @generated
         */
        EClass PARTITION = eINSTANCE.getPartition();

        /**
         * The meta object literal for the '<em><b>Is Source</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARTITION__IS_SOURCE = eINSTANCE.getPartition_IsSource();

        /**
         * The meta object literal for the '<em><b>Is Shared</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARTITION__IS_SHARED = eINSTANCE.getPartition_IsShared();

        /**
         * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference PARTITION__FORMULA = eINSTANCE.getPartition_Formula();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.ReplicatedPartitionImpl <em>Replicated Partition</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.ReplicatedPartitionImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getReplicatedPartition()
         * @generated
         */
        EClass REPLICATED_PARTITION = eINSTANCE.getReplicatedPartition();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.TimeBalanceImpl <em>Time Balance</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.TimeBalanceImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getTimeBalance()
         * @generated
         */
        EClass TIME_BALANCE = eINSTANCE.getTimeBalance();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.TransparentPartitionImpl <em>Transparent Partition</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.TransparentPartitionImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getTransparentPartition()
         * @generated
         */
        EClass TRANSPARENT_PARTITION = eINSTANCE.getTransparentPartition();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.TwoPassCalculationImpl <em>Two Pass Calculation</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.TwoPassCalculationImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getTwoPassCalculation()
         * @generated
         */
        EClass TWO_PASS_CALCULATION = eINSTANCE.getTwoPassCalculation();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.UDAImpl <em>UDA</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.UDAImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getUDA()
         * @generated
         */
        EClass UDA = eINSTANCE.getUDA();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.VarianceReportingImpl <em>Variance Reporting</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.VarianceReportingImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getVarianceReporting()
         * @generated
         */
        EClass VARIANCE_REPORTING = eINSTANCE.getVarianceReporting();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.impl.LinkedPartitionImpl <em>Linked Partition</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.impl.LinkedPartitionImpl
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getLinkedPartition()
         * @generated
         */
        EClass LINKED_PARTITION = eINSTANCE.getLinkedPartition();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.essbase.DimensionType <em>Dimension Type</em>}' enum.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.essbase.DimensionType
         * @see orgomg.cwmx.resource.essbase.impl.EssbasePackageImpl#getDimensionType()
         * @generated
         */
        EEnum DIMENSION_TYPE = eINSTANCE.getDimensionType();

    }

} // EssbasePackage
