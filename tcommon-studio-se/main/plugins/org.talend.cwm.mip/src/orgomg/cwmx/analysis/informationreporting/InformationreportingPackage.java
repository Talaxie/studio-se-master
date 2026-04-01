/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationreporting;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.analysis.informationvisualization.InformationvisualizationPackage;
import orgomg.cwm.analysis.transformation.TransformationPackage;
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
 * <!-- end-user-doc --> <!-- begin-model-doc --> The CWM Information Reporting
 * metamodel extends the CWM Information Visualization metamodel for the purpose
 * of defining metadata representing formatted reports.
 * 
 * The Information Reporting package depends on the following packages:
 * 
 * org.omg::CWM::ObjectModel::Core org.omg::CWM::Foundation::DataTypes
 * org.omg::CWM::Analysis::Transformation
 * org.omg::CWM::Analysis::InformationVisualization
 * 
 * Report is a subclass of InformationVisualization::RenderedObject that
 * represents a formatted report. Reports are comprised of instances of
 * ReportGroup, which is also a subclass of RenderedObject. Thus, a Report is
 * composed from ReportGroups, and ReportGroups may be composed recursively from
 * other ReportGroups. Ultimately, the recursive definition of a ReportGroup
 * must terminate with one or more ReportFields as leaf-level components.
 * ReportField represents single-valued attributes of the Report that are
 * individually mapped to data sources (e.g., report queries) and rendered
 * (i.e., formatted) by associated instances of
 * InformationVisualization::Rendering.
 * 
 * Related Reports may be grouped together into a ReportPackage, a subclass of
 * formationVisualization::RenderedObjectSet. A Report may also have a related
 * ReportExecution, which is a subclass of TranformationMap that relates the
 * Report to both its data sources and procedures required to run the Report.
 * Each ReportGroup may also specify a separate QueryExpression which is
 * evaluated to yield the contents of fields within the ReportGroup. This
 * enables the specification of both derived, as well as retrieved, data values
 * for report fields.
 * 
 * Note that the Information Reporting metamodel makes extensive use of
 * associations and attributes inherited from Information Visualization. For
 * example, the formula attribute inherited from RenderedObject would be used by
 * an instance of ReportGroup to indicate its positioning within the overall
 * report layout. The inherited association "CompositesReferenceComponents" is
 * used to compose Reports from ReportGroups, as well as to compose ReportGroups
 * recursively from other ReportGroups and ReportFields. The inherited
 * association "NeighborsReferenceNeighbors" may be used to specify topological
 * relationships between instances of ReportGroup at the same level of
 * composition.
 * 
 * OCL Representation of Information Reporting Constraints
 * 
 * [C-1] Reports generally do not have neighbor relationships with other
 * reports. context Report inv: self.neighbor->isEmpty inv:
 * self.referencingNeighbor->isEmpty
 * 
 * [C-2] A ReportField is associated with precisely one ReportGroup. context
 * ReportField inv: self.composite->size = 1
 * 
 * [C-3] A ReportField may not have components. context ReportField inv:
 * self.component->isEmpty
 * 
 * [C-4] A ReportGroup is associated with precisely one Report. context
 * ReportGroup inv: self.composite->size = 1
 * 
 * 
 * <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.analysis.informationreporting.InformationreportingFactory
 * @model kind="package"
 * @generated
 */
public interface InformationreportingPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "informationreporting";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///orgomg/cwmx/analysis/informationreporting.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "orgomg.cwmx.analysis.informationreporting";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    InformationreportingPackage eINSTANCE = orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl.init();

    /**
     * The meta object id for the '{@link orgomg.cwmx.analysis.informationreporting.impl.ReportImpl <em>Report</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.analysis.informationreporting.impl.ReportImpl
     * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReport()
     * @generated
     */
    int REPORT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__NAME = InformationvisualizationPackage.RENDERED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__VISIBILITY = InformationvisualizationPackage.RENDERED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__CLIENT_DEPENDENCY = InformationvisualizationPackage.RENDERED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__SUPPLIER_DEPENDENCY = InformationvisualizationPackage.RENDERED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__CONSTRAINT = InformationvisualizationPackage.RENDERED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__NAMESPACE = InformationvisualizationPackage.RENDERED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__IMPORTER = InformationvisualizationPackage.RENDERED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__STEREOTYPE = InformationvisualizationPackage.RENDERED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__TAGGED_VALUE = InformationvisualizationPackage.RENDERED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__DOCUMENT = InformationvisualizationPackage.RENDERED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__DESCRIPTION = InformationvisualizationPackage.RENDERED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__RESPONSIBLE_PARTY = InformationvisualizationPackage.RENDERED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__ELEMENT_NODE = InformationvisualizationPackage.RENDERED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__SET = InformationvisualizationPackage.RENDERED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__RENDERED_OBJECT = InformationvisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__VOCABULARY_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__MEASUREMENT = InformationvisualizationPackage.RENDERED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__CHANGE_REQUEST = InformationvisualizationPackage.RENDERED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__DASDL_PROPERTY = InformationvisualizationPackage.RENDERED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__OWNED_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__IS_ABSTRACT = InformationvisualizationPackage.RENDERED_OBJECT__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__FEATURE = InformationvisualizationPackage.RENDERED_OBJECT__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__STRUCTURAL_FEATURE = InformationvisualizationPackage.RENDERED_OBJECT__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__PARAMETER = InformationvisualizationPackage.RENDERED_OBJECT__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__GENERALIZATION = InformationvisualizationPackage.RENDERED_OBJECT__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__SPECIALIZATION = InformationvisualizationPackage.RENDERED_OBJECT__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__INSTANCE = InformationvisualizationPackage.RENDERED_OBJECT__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__ALIAS = InformationvisualizationPackage.RENDERED_OBJECT__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__EXPRESSION_NODE = InformationvisualizationPackage.RENDERED_OBJECT__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__MAPPING_FROM = InformationvisualizationPackage.RENDERED_OBJECT__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__MAPPING_TO = InformationvisualizationPackage.RENDERED_OBJECT__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__CLASSIFIER_MAP = InformationvisualizationPackage.RENDERED_OBJECT__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__CF_MAP = InformationvisualizationPackage.RENDERED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__DOMAIN = InformationvisualizationPackage.RENDERED_OBJECT__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__SIMPLE_DIMENSION = InformationvisualizationPackage.RENDERED_OBJECT__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__FORMULA = InformationvisualizationPackage.RENDERED_OBJECT__FORMULA;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__ACTION = InformationvisualizationPackage.RENDERED_OBJECT__ACTION;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__FILE_NAME = InformationvisualizationPackage.RENDERED_OBJECT__FILE_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__TYPE = InformationvisualizationPackage.RENDERED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__URL = InformationvisualizationPackage.RENDERED_OBJECT__URL;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__COMPOSITE = InformationvisualizationPackage.RENDERED_OBJECT__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__COMPONENT = InformationvisualizationPackage.RENDERED_OBJECT__COMPONENT;

    /**
     * The feature id for the '<em><b>Default Rendering</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__DEFAULT_RENDERING = InformationvisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__MODEL_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Neighbor</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT__NEIGHBOR = InformationvisualizationPackage.RENDERED_OBJECT__NEIGHBOR;

    /**
     * The feature id for the '<em><b>Referencing Neighbor</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT__REFERENCING_NEIGHBOR = InformationvisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR;

    /**
     * The number of structural features of the '<em>Report</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FEATURE_COUNT = InformationvisualizationPackage.RENDERED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.analysis.informationreporting.impl.ReportAttributeImpl <em>Report Attribute</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.analysis.informationreporting.impl.ReportAttributeImpl
     * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportAttribute()
     * @generated
     */
    int REPORT_ATTRIBUTE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__NAME = CorePackage.ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__SUPPLIER_DEPENDENCY = CorePackage.ATTRIBUTE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__STEREOTYPE = CorePackage.ATTRIBUTE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__DOCUMENT = CorePackage.ATTRIBUTE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__DESCRIPTION = CorePackage.ATTRIBUTE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__RESPONSIBLE_PARTY = CorePackage.ATTRIBUTE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__ELEMENT_NODE = CorePackage.ATTRIBUTE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__SET = CorePackage.ATTRIBUTE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__RENDERED_OBJECT = CorePackage.ATTRIBUTE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__VOCABULARY_ELEMENT = CorePackage.ATTRIBUTE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__MEASUREMENT = CorePackage.ATTRIBUTE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__CHANGE_REQUEST = CorePackage.ATTRIBUTE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__DASDL_PROPERTY = CorePackage.ATTRIBUTE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__OWNER = CorePackage.ATTRIBUTE__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__FEATURE_NODE = CorePackage.ATTRIBUTE__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__FEATURE_MAP = CorePackage.ATTRIBUTE__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__CF_MAP = CorePackage.ATTRIBUTE__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__TYPE = CorePackage.ATTRIBUTE__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__SLOT = CorePackage.ATTRIBUTE__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__DISCRIMINATED_UNION = CorePackage.ATTRIBUTE__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__INDEXED_FEATURE = CorePackage.ATTRIBUTE__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__KEY_RELATIONSHIP = CorePackage.ATTRIBUTE__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__UNIQUE_KEY = CorePackage.ATTRIBUTE__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__DATA_ITEM = CorePackage.ATTRIBUTE__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__REMAP = CorePackage.ATTRIBUTE__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

    /**
     * The number of structural features of the '<em>Report Attribute</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_ATTRIBUTE_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.analysis.informationreporting.impl.ReportExecutionImpl <em>Report Execution</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.analysis.informationreporting.impl.ReportExecutionImpl
     * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportExecution()
     * @generated
     */
    int REPORT_EXECUTION = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__NAME = TransformationPackage.TRANSFORMATION_MAP__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__VISIBILITY = TransformationPackage.TRANSFORMATION_MAP__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__CLIENT_DEPENDENCY = TransformationPackage.TRANSFORMATION_MAP__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__SUPPLIER_DEPENDENCY = TransformationPackage.TRANSFORMATION_MAP__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__CONSTRAINT = TransformationPackage.TRANSFORMATION_MAP__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__NAMESPACE = TransformationPackage.TRANSFORMATION_MAP__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__IMPORTER = TransformationPackage.TRANSFORMATION_MAP__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__STEREOTYPE = TransformationPackage.TRANSFORMATION_MAP__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__TAGGED_VALUE = TransformationPackage.TRANSFORMATION_MAP__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__DOCUMENT = TransformationPackage.TRANSFORMATION_MAP__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__DESCRIPTION = TransformationPackage.TRANSFORMATION_MAP__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__RESPONSIBLE_PARTY = TransformationPackage.TRANSFORMATION_MAP__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__ELEMENT_NODE = TransformationPackage.TRANSFORMATION_MAP__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__SET = TransformationPackage.TRANSFORMATION_MAP__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__RENDERED_OBJECT = TransformationPackage.TRANSFORMATION_MAP__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__VOCABULARY_ELEMENT = TransformationPackage.TRANSFORMATION_MAP__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__MEASUREMENT = TransformationPackage.TRANSFORMATION_MAP__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__CHANGE_REQUEST = TransformationPackage.TRANSFORMATION_MAP__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__DASDL_PROPERTY = TransformationPackage.TRANSFORMATION_MAP__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__OWNED_ELEMENT = TransformationPackage.TRANSFORMATION_MAP__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Function</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__FUNCTION = TransformationPackage.TRANSFORMATION_MAP__FUNCTION;

    /**
     * The feature id for the '<em><b>Function Description</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__FUNCTION_DESCRIPTION = TransformationPackage.TRANSFORMATION_MAP__FUNCTION_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Is Primary</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__IS_PRIMARY = TransformationPackage.TRANSFORMATION_MAP__IS_PRIMARY;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__SOURCE = TransformationPackage.TRANSFORMATION_MAP__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__TARGET = TransformationPackage.TRANSFORMATION_MAP__TARGET;

    /**
     * The feature id for the '<em><b>Task</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION__TASK = TransformationPackage.TRANSFORMATION_MAP__TASK;

    /**
     * The number of structural features of the '<em>Report Execution</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_EXECUTION_FEATURE_COUNT = TransformationPackage.TRANSFORMATION_MAP_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.analysis.informationreporting.impl.ReportFieldImpl
     * <em>Report Field</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.analysis.informationreporting.impl.ReportFieldImpl
     * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportField()
     * @generated
     */
    int REPORT_FIELD = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__NAME = InformationvisualizationPackage.RENDERED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__VISIBILITY = InformationvisualizationPackage.RENDERED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__CLIENT_DEPENDENCY = InformationvisualizationPackage.RENDERED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__SUPPLIER_DEPENDENCY = InformationvisualizationPackage.RENDERED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__CONSTRAINT = InformationvisualizationPackage.RENDERED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__NAMESPACE = InformationvisualizationPackage.RENDERED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__IMPORTER = InformationvisualizationPackage.RENDERED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__STEREOTYPE = InformationvisualizationPackage.RENDERED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__TAGGED_VALUE = InformationvisualizationPackage.RENDERED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__DOCUMENT = InformationvisualizationPackage.RENDERED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__DESCRIPTION = InformationvisualizationPackage.RENDERED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__RESPONSIBLE_PARTY = InformationvisualizationPackage.RENDERED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__ELEMENT_NODE = InformationvisualizationPackage.RENDERED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__SET = InformationvisualizationPackage.RENDERED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__RENDERED_OBJECT = InformationvisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__VOCABULARY_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__MEASUREMENT = InformationvisualizationPackage.RENDERED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__CHANGE_REQUEST = InformationvisualizationPackage.RENDERED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__DASDL_PROPERTY = InformationvisualizationPackage.RENDERED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__OWNED_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__IS_ABSTRACT = InformationvisualizationPackage.RENDERED_OBJECT__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__FEATURE = InformationvisualizationPackage.RENDERED_OBJECT__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__STRUCTURAL_FEATURE = InformationvisualizationPackage.RENDERED_OBJECT__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__PARAMETER = InformationvisualizationPackage.RENDERED_OBJECT__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__GENERALIZATION = InformationvisualizationPackage.RENDERED_OBJECT__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__SPECIALIZATION = InformationvisualizationPackage.RENDERED_OBJECT__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__INSTANCE = InformationvisualizationPackage.RENDERED_OBJECT__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__ALIAS = InformationvisualizationPackage.RENDERED_OBJECT__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__EXPRESSION_NODE = InformationvisualizationPackage.RENDERED_OBJECT__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__MAPPING_FROM = InformationvisualizationPackage.RENDERED_OBJECT__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__MAPPING_TO = InformationvisualizationPackage.RENDERED_OBJECT__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__CLASSIFIER_MAP = InformationvisualizationPackage.RENDERED_OBJECT__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__CF_MAP = InformationvisualizationPackage.RENDERED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__DOMAIN = InformationvisualizationPackage.RENDERED_OBJECT__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__SIMPLE_DIMENSION = InformationvisualizationPackage.RENDERED_OBJECT__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__FORMULA = InformationvisualizationPackage.RENDERED_OBJECT__FORMULA;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__ACTION = InformationvisualizationPackage.RENDERED_OBJECT__ACTION;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__FILE_NAME = InformationvisualizationPackage.RENDERED_OBJECT__FILE_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__TYPE = InformationvisualizationPackage.RENDERED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__URL = InformationvisualizationPackage.RENDERED_OBJECT__URL;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__COMPOSITE = InformationvisualizationPackage.RENDERED_OBJECT__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__COMPONENT = InformationvisualizationPackage.RENDERED_OBJECT__COMPONENT;

    /**
     * The feature id for the '<em><b>Default Rendering</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__DEFAULT_RENDERING = InformationvisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__MODEL_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Neighbor</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_FIELD__NEIGHBOR = InformationvisualizationPackage.RENDERED_OBJECT__NEIGHBOR;

    /**
     * The feature id for the '<em><b>Referencing Neighbor</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD__REFERENCING_NEIGHBOR = InformationvisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR;

    /**
     * The number of structural features of the '<em>Report Field</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_FIELD_FEATURE_COUNT = InformationvisualizationPackage.RENDERED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.analysis.informationreporting.impl.ReportGroupImpl
     * <em>Report Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.analysis.informationreporting.impl.ReportGroupImpl
     * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportGroup()
     * @generated
     */
    int REPORT_GROUP = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__NAME = InformationvisualizationPackage.RENDERED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__VISIBILITY = InformationvisualizationPackage.RENDERED_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__CLIENT_DEPENDENCY = InformationvisualizationPackage.RENDERED_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__SUPPLIER_DEPENDENCY = InformationvisualizationPackage.RENDERED_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__CONSTRAINT = InformationvisualizationPackage.RENDERED_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__NAMESPACE = InformationvisualizationPackage.RENDERED_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__IMPORTER = InformationvisualizationPackage.RENDERED_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__STEREOTYPE = InformationvisualizationPackage.RENDERED_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__TAGGED_VALUE = InformationvisualizationPackage.RENDERED_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__DOCUMENT = InformationvisualizationPackage.RENDERED_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__DESCRIPTION = InformationvisualizationPackage.RENDERED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__RESPONSIBLE_PARTY = InformationvisualizationPackage.RENDERED_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__ELEMENT_NODE = InformationvisualizationPackage.RENDERED_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__SET = InformationvisualizationPackage.RENDERED_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__RENDERED_OBJECT = InformationvisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__VOCABULARY_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__MEASUREMENT = InformationvisualizationPackage.RENDERED_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__CHANGE_REQUEST = InformationvisualizationPackage.RENDERED_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__DASDL_PROPERTY = InformationvisualizationPackage.RENDERED_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__OWNED_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__IS_ABSTRACT = InformationvisualizationPackage.RENDERED_OBJECT__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__FEATURE = InformationvisualizationPackage.RENDERED_OBJECT__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__STRUCTURAL_FEATURE = InformationvisualizationPackage.RENDERED_OBJECT__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__PARAMETER = InformationvisualizationPackage.RENDERED_OBJECT__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__GENERALIZATION = InformationvisualizationPackage.RENDERED_OBJECT__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__SPECIALIZATION = InformationvisualizationPackage.RENDERED_OBJECT__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__INSTANCE = InformationvisualizationPackage.RENDERED_OBJECT__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__ALIAS = InformationvisualizationPackage.RENDERED_OBJECT__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__EXPRESSION_NODE = InformationvisualizationPackage.RENDERED_OBJECT__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__MAPPING_FROM = InformationvisualizationPackage.RENDERED_OBJECT__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__MAPPING_TO = InformationvisualizationPackage.RENDERED_OBJECT__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__CLASSIFIER_MAP = InformationvisualizationPackage.RENDERED_OBJECT__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__CF_MAP = InformationvisualizationPackage.RENDERED_OBJECT__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__DOMAIN = InformationvisualizationPackage.RENDERED_OBJECT__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__SIMPLE_DIMENSION = InformationvisualizationPackage.RENDERED_OBJECT__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__FORMULA = InformationvisualizationPackage.RENDERED_OBJECT__FORMULA;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__ACTION = InformationvisualizationPackage.RENDERED_OBJECT__ACTION;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__FILE_NAME = InformationvisualizationPackage.RENDERED_OBJECT__FILE_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__TYPE = InformationvisualizationPackage.RENDERED_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__URL = InformationvisualizationPackage.RENDERED_OBJECT__URL;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__COMPOSITE = InformationvisualizationPackage.RENDERED_OBJECT__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__COMPONENT = InformationvisualizationPackage.RENDERED_OBJECT__COMPONENT;

    /**
     * The feature id for the '<em><b>Default Rendering</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__DEFAULT_RENDERING = InformationvisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__MODEL_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Neighbor</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__NEIGHBOR = InformationvisualizationPackage.RENDERED_OBJECT__NEIGHBOR;

    /**
     * The feature id for the '<em><b>Referencing Neighbor</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__REFERENCING_NEIGHBOR = InformationvisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR;

    /**
     * The feature id for the '<em><b>Group Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_GROUP__GROUP_TYPE = InformationvisualizationPackage.RENDERED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Report Query</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP__REPORT_QUERY = InformationvisualizationPackage.RENDERED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Report Group</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_GROUP_FEATURE_COUNT = InformationvisualizationPackage.RENDERED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link orgomg.cwmx.analysis.informationreporting.impl.ReportPackageImpl <em>Report Package</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.analysis.informationreporting.impl.ReportPackageImpl
     * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportPackage()
     * @generated
     */
    int REPORT_PACKAGE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__NAME = InformationvisualizationPackage.RENDERED_OBJECT_SET__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__VISIBILITY = InformationvisualizationPackage.RENDERED_OBJECT_SET__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__CLIENT_DEPENDENCY = InformationvisualizationPackage.RENDERED_OBJECT_SET__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__SUPPLIER_DEPENDENCY = InformationvisualizationPackage.RENDERED_OBJECT_SET__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__CONSTRAINT = InformationvisualizationPackage.RENDERED_OBJECT_SET__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__NAMESPACE = InformationvisualizationPackage.RENDERED_OBJECT_SET__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__IMPORTER = InformationvisualizationPackage.RENDERED_OBJECT_SET__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__STEREOTYPE = InformationvisualizationPackage.RENDERED_OBJECT_SET__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__TAGGED_VALUE = InformationvisualizationPackage.RENDERED_OBJECT_SET__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__DOCUMENT = InformationvisualizationPackage.RENDERED_OBJECT_SET__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__DESCRIPTION = InformationvisualizationPackage.RENDERED_OBJECT_SET__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__RESPONSIBLE_PARTY = InformationvisualizationPackage.RENDERED_OBJECT_SET__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__ELEMENT_NODE = InformationvisualizationPackage.RENDERED_OBJECT_SET__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__SET = InformationvisualizationPackage.RENDERED_OBJECT_SET__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__RENDERED_OBJECT = InformationvisualizationPackage.RENDERED_OBJECT_SET__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__VOCABULARY_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT_SET__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__MEASUREMENT = InformationvisualizationPackage.RENDERED_OBJECT_SET__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__CHANGE_REQUEST = InformationvisualizationPackage.RENDERED_OBJECT_SET__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__DASDL_PROPERTY = InformationvisualizationPackage.RENDERED_OBJECT_SET__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__OWNED_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT_SET__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__IMPORTED_ELEMENT = InformationvisualizationPackage.RENDERED_OBJECT_SET__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__DATA_MANAGER = InformationvisualizationPackage.RENDERED_OBJECT_SET__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Rendering</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE__RENDERING = InformationvisualizationPackage.RENDERED_OBJECT_SET__RENDERING;

    /**
     * The number of structural features of the '<em>Report Package</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PACKAGE_FEATURE_COUNT = InformationvisualizationPackage.RENDERED_OBJECT_SET_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.analysis.informationreporting.ReportGroupType <em>Report Group Type</em>}' enum.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.analysis.informationreporting.ReportGroupType
     * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportGroupType()
     * @generated
     */
    int REPORT_GROUP_TYPE = 6;

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.analysis.informationreporting.Report <em>Report</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Report</em>'.
     * @see orgomg.cwmx.analysis.informationreporting.Report
     * @generated
     */
    EClass getReport();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.analysis.informationreporting.ReportAttribute
     * <em>Report Attribute</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Report Attribute</em>'.
     * @see orgomg.cwmx.analysis.informationreporting.ReportAttribute
     * @generated
     */
    EClass getReportAttribute();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.analysis.informationreporting.ReportExecution
     * <em>Report Execution</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Report Execution</em>'.
     * @see orgomg.cwmx.analysis.informationreporting.ReportExecution
     * @generated
     */
    EClass getReportExecution();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.analysis.informationreporting.ReportField <em>Report Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Report Field</em>'.
     * @see orgomg.cwmx.analysis.informationreporting.ReportField
     * @generated
     */
    EClass getReportField();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.analysis.informationreporting.ReportGroup <em>Report Group</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Report Group</em>'.
     * @see orgomg.cwmx.analysis.informationreporting.ReportGroup
     * @generated
     */
    EClass getReportGroup();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.analysis.informationreporting.ReportGroup#getGroupType <em>Group Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Type</em>'.
     * @see orgomg.cwmx.analysis.informationreporting.ReportGroup#getGroupType()
     * @see #getReportGroup()
     * @generated
     */
    EAttribute getReportGroup_GroupType();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.analysis.informationreporting.ReportGroup#getReportQuery <em>Report Query</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Report Query</em>'.
     * @see orgomg.cwmx.analysis.informationreporting.ReportGroup#getReportQuery()
     * @see #getReportGroup()
     * @generated
     */
    EReference getReportGroup_ReportQuery();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.analysis.informationreporting.ReportPackage <em>Report Package</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Report Package</em>'.
     * @see orgomg.cwmx.analysis.informationreporting.ReportPackage
     * @generated
     */
    EClass getReportPackage();

    /**
     * Returns the meta object for enum '
     * {@link orgomg.cwmx.analysis.informationreporting.ReportGroupType
     * <em>Report Group Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for enum '<em>Report Group Type</em>'.
     * @see orgomg.cwmx.analysis.informationreporting.ReportGroupType
     * @generated
     */
    EEnum getReportGroupType();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    InformationreportingFactory getInformationreportingFactory();

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
         * {@link orgomg.cwmx.analysis.informationreporting.impl.ReportImpl
         * <em>Report</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.analysis.informationreporting.impl.ReportImpl
         * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReport()
         * @generated
         */
        EClass REPORT = eINSTANCE.getReport();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationreporting.impl.ReportAttributeImpl <em>Report Attribute</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.analysis.informationreporting.impl.ReportAttributeImpl
         * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportAttribute()
         * @generated
         */
        EClass REPORT_ATTRIBUTE = eINSTANCE.getReportAttribute();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationreporting.impl.ReportExecutionImpl <em>Report Execution</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.analysis.informationreporting.impl.ReportExecutionImpl
         * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportExecution()
         * @generated
         */
        EClass REPORT_EXECUTION = eINSTANCE.getReportExecution();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationreporting.impl.ReportFieldImpl <em>Report Field</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.analysis.informationreporting.impl.ReportFieldImpl
         * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportField()
         * @generated
         */
        EClass REPORT_FIELD = eINSTANCE.getReportField();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationreporting.impl.ReportGroupImpl <em>Report Group</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.analysis.informationreporting.impl.ReportGroupImpl
         * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportGroup()
         * @generated
         */
        EClass REPORT_GROUP = eINSTANCE.getReportGroup();

        /**
         * The meta object literal for the '<em><b>Group Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REPORT_GROUP__GROUP_TYPE = eINSTANCE.getReportGroup_GroupType();

        /**
         * The meta object literal for the '<em><b>Report Query</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference REPORT_GROUP__REPORT_QUERY = eINSTANCE.getReportGroup_ReportQuery();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationreporting.impl.ReportPackageImpl <em>Report Package</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.analysis.informationreporting.impl.ReportPackageImpl
         * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportPackage()
         * @generated
         */
        EClass REPORT_PACKAGE = eINSTANCE.getReportPackage();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.analysis.informationreporting.ReportGroupType <em>Report Group Type</em>}' enum.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.analysis.informationreporting.ReportGroupType
         * @see orgomg.cwmx.analysis.informationreporting.impl.InformationreportingPackageImpl#getReportGroupType()
         * @generated
         */
        EEnum REPORT_GROUP_TYPE = eINSTANCE.getReportGroupType();

    }

} // InformationreportingPackage
