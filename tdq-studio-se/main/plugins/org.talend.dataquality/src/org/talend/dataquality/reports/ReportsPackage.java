/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.reports;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.analysis.informationvisualization.InformationvisualizationPackage;
import orgomg.cwmx.analysis.informationreporting.InformationreportingPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.reports.ReportsFactory
 * @model kind="package"
 * @generated
 */
public interface ReportsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "reports";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.reports";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.reports";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ReportsPackage eINSTANCE = org.talend.dataquality.reports.impl.ReportsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.reports.impl.TdReportImpl <em>Td Report</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.reports.impl.TdReportImpl
     * @see org.talend.dataquality.reports.impl.ReportsPackageImpl#getTdReport()
     * @generated
     */
    int TD_REPORT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__NAME = InformationreportingPackage.REPORT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__VISIBILITY = InformationreportingPackage.REPORT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__CLIENT_DEPENDENCY = InformationreportingPackage.REPORT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__SUPPLIER_DEPENDENCY = InformationreportingPackage.REPORT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__CONSTRAINT = InformationreportingPackage.REPORT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__NAMESPACE = InformationreportingPackage.REPORT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__IMPORTER = InformationreportingPackage.REPORT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__STEREOTYPE = InformationreportingPackage.REPORT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__TAGGED_VALUE = InformationreportingPackage.REPORT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__DOCUMENT = InformationreportingPackage.REPORT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__DESCRIPTION = InformationreportingPackage.REPORT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__RESPONSIBLE_PARTY = InformationreportingPackage.REPORT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__ELEMENT_NODE = InformationreportingPackage.REPORT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__SET = InformationreportingPackage.REPORT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__RENDERED_OBJECT = InformationreportingPackage.REPORT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__VOCABULARY_ELEMENT = InformationreportingPackage.REPORT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__MEASUREMENT = InformationreportingPackage.REPORT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__CHANGE_REQUEST = InformationreportingPackage.REPORT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__DASDL_PROPERTY = InformationreportingPackage.REPORT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__OWNED_ELEMENT = InformationreportingPackage.REPORT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__IS_ABSTRACT = InformationreportingPackage.REPORT__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__FEATURE = InformationreportingPackage.REPORT__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__STRUCTURAL_FEATURE = InformationreportingPackage.REPORT__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__PARAMETER = InformationreportingPackage.REPORT__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__GENERALIZATION = InformationreportingPackage.REPORT__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__SPECIALIZATION = InformationreportingPackage.REPORT__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__INSTANCE = InformationreportingPackage.REPORT__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__ALIAS = InformationreportingPackage.REPORT__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__EXPRESSION_NODE = InformationreportingPackage.REPORT__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__MAPPING_FROM = InformationreportingPackage.REPORT__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__MAPPING_TO = InformationreportingPackage.REPORT__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__CLASSIFIER_MAP = InformationreportingPackage.REPORT__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__CF_MAP = InformationreportingPackage.REPORT__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__DOMAIN = InformationreportingPackage.REPORT__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__SIMPLE_DIMENSION = InformationreportingPackage.REPORT__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__FORMULA = InformationreportingPackage.REPORT__FORMULA;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__ACTION = InformationreportingPackage.REPORT__ACTION;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__FILE_NAME = InformationreportingPackage.REPORT__FILE_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__TYPE = InformationreportingPackage.REPORT__TYPE;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__URL = InformationreportingPackage.REPORT__URL;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__COMPOSITE = InformationreportingPackage.REPORT__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__COMPONENT = InformationreportingPackage.REPORT__COMPONENT;

    /**
     * The feature id for the '<em><b>Default Rendering</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__DEFAULT_RENDERING = InformationreportingPackage.REPORT__DEFAULT_RENDERING;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__MODEL_ELEMENT = InformationreportingPackage.REPORT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Neighbor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__NEIGHBOR = InformationreportingPackage.REPORT__NEIGHBOR;

    /**
     * The feature id for the '<em><b>Referencing Neighbor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__REFERENCING_NEIGHBOR = InformationreportingPackage.REPORT__REFERENCING_NEIGHBOR;

    /**
     * The feature id for the '<em><b>Presentation Params</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__PRESENTATION_PARAMS = InformationreportingPackage.REPORT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Creation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__CREATION_DATE = InformationreportingPackage.REPORT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Analysis Map</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__ANALYSIS_MAP = InformationreportingPackage.REPORT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Output Report Folder</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__OUTPUT_REPORT_FOLDER = InformationreportingPackage.REPORT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Exec Informations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__EXEC_INFORMATIONS = InformationreportingPackage.REPORT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Date From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TD_REPORT__DATE_FROM = InformationreportingPackage.REPORT_FEATURE_COUNT + 5;

				/**
     * The feature id for the '<em><b>Date To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TD_REPORT__DATE_TO = InformationreportingPackage.REPORT_FEATURE_COUNT + 6;

				/**
     * The feature id for the '<em><b>Logo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__LOGO = InformationreportingPackage.REPORT_FEATURE_COUNT + 7;

                /**
     * The feature id for the '<em><b>Input Jrxml</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__INPUT_JRXML = InformationreportingPackage.REPORT_FEATURE_COUNT + 8;

                /**
     * The feature id for the '<em><b>Report Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__REPORT_TYPE = InformationreportingPackage.REPORT_FEATURE_COUNT + 9;

                /**
     * The feature id for the '<em><b>Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__CONTEXT = InformationreportingPackage.REPORT_FEATURE_COUNT + 10;

                /**
     * The feature id for the '<em><b>Default Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT__DEFAULT_CONTEXT = InformationreportingPackage.REPORT_FEATURE_COUNT + 11;

                /**
     * The number of structural features of the '<em>Td Report</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TD_REPORT_FEATURE_COUNT = InformationreportingPackage.REPORT_FEATURE_COUNT + 12;


    /**
     * The meta object id for the '{@link org.talend.dataquality.reports.impl.PresentationParameterImpl <em>Presentation Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.reports.impl.PresentationParameterImpl
     * @see org.talend.dataquality.reports.impl.ReportsPackageImpl#getPresentationParameter()
     * @generated
     */
    int PRESENTATION_PARAMETER = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__NAME = InformationvisualizationPackage.RENDERING__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__VISIBILITY = InformationvisualizationPackage.RENDERING__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__CLIENT_DEPENDENCY = InformationvisualizationPackage.RENDERING__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__SUPPLIER_DEPENDENCY = InformationvisualizationPackage.RENDERING__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__CONSTRAINT = InformationvisualizationPackage.RENDERING__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__NAMESPACE = InformationvisualizationPackage.RENDERING__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__IMPORTER = InformationvisualizationPackage.RENDERING__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__STEREOTYPE = InformationvisualizationPackage.RENDERING__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__TAGGED_VALUE = InformationvisualizationPackage.RENDERING__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__DOCUMENT = InformationvisualizationPackage.RENDERING__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__DESCRIPTION = InformationvisualizationPackage.RENDERING__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__RESPONSIBLE_PARTY = InformationvisualizationPackage.RENDERING__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__ELEMENT_NODE = InformationvisualizationPackage.RENDERING__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__SET = InformationvisualizationPackage.RENDERING__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__RENDERED_OBJECT = InformationvisualizationPackage.RENDERING__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__VOCABULARY_ELEMENT = InformationvisualizationPackage.RENDERING__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__MEASUREMENT = InformationvisualizationPackage.RENDERING__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__CHANGE_REQUEST = InformationvisualizationPackage.RENDERING__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__DASDL_PROPERTY = InformationvisualizationPackage.RENDERING__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__OWNER_SCOPE = InformationvisualizationPackage.RENDERING__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__OWNER = InformationvisualizationPackage.RENDERING__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__FEATURE_NODE = InformationvisualizationPackage.RENDERING__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__FEATURE_MAP = InformationvisualizationPackage.RENDERING__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__CF_MAP = InformationvisualizationPackage.RENDERING__CF_MAP;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__FORMULA = InformationvisualizationPackage.RENDERING__FORMULA;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__ACTION = InformationvisualizationPackage.RENDERING__ACTION;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__FILE_NAME = InformationvisualizationPackage.RENDERING__FILE_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__TYPE = InformationvisualizationPackage.RENDERING__TYPE;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__URL = InformationvisualizationPackage.RENDERING__URL;

    /**
     * The feature id for the '<em><b>Defaulted Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__DEFAULTED_RENDERED_OBJECT = InformationvisualizationPackage.RENDERING__DEFAULTED_RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Rendered Object Set</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__RENDERED_OBJECT_SET = InformationvisualizationPackage.RENDERING__RENDERED_OBJECT_SET;

    /**
     * The feature id for the '<em><b>Plot Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__PLOT_TYPE = InformationvisualizationPackage.RENDERING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Indicator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER__INDICATOR = InformationvisualizationPackage.RENDERING_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Presentation Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_PARAMETER_FEATURE_COUNT = InformationvisualizationPackage.RENDERING_FEATURE_COUNT + 2;


    /**
     * The meta object id for the '{@link org.talend.dataquality.reports.impl.AnalysisMapImpl <em>Analysis Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.reports.impl.AnalysisMapImpl
     * @see org.talend.dataquality.reports.impl.ReportsPackageImpl#getAnalysisMap()
     * @generated
     */
    int ANALYSIS_MAP = 2;

    /**
     * The feature id for the '<em><b>Analysis</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_MAP__ANALYSIS = 0;

    /**
     * The feature id for the '<em><b>Must Refresh</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_MAP__MUST_REFRESH = 1;

    /**
     * The feature id for the '<em><b>Report Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_MAP__REPORT_TYPE = 2;

    /**
     * The feature id for the '<em><b>Jrxml Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_MAP__JRXML_SOURCE = 3;

    /**
     * The number of structural features of the '<em>Analysis Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_MAP_FEATURE_COUNT = 4;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.reports.TdReport <em>Td Report</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Td Report</em>'.
     * @see org.talend.dataquality.reports.TdReport
     * @generated
     */
    EClass getTdReport();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.reports.TdReport#getPresentationParams <em>Presentation Params</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Presentation Params</em>'.
     * @see org.talend.dataquality.reports.TdReport#getPresentationParams()
     * @see #getTdReport()
     * @generated
     */
    EReference getTdReport_PresentationParams();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.TdReport#getCreationDate <em>Creation Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Creation Date</em>'.
     * @see org.talend.dataquality.reports.TdReport#getCreationDate()
     * @see #getTdReport()
     * @generated
     */
    EAttribute getTdReport_CreationDate();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.reports.TdReport#getAnalysisMap <em>Analysis Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Analysis Map</em>'.
     * @see org.talend.dataquality.reports.TdReport#getAnalysisMap()
     * @see #getTdReport()
     * @generated
     */
    EReference getTdReport_AnalysisMap();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.TdReport#getOutputReportFolder <em>Output Report Folder</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Report Folder</em>'.
     * @see org.talend.dataquality.reports.TdReport#getOutputReportFolder()
     * @see #getTdReport()
     * @generated
     */
    EAttribute getTdReport_OutputReportFolder();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.reports.TdReport#getExecInformations <em>Exec Informations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Exec Informations</em>'.
     * @see org.talend.dataquality.reports.TdReport#getExecInformations()
     * @see #getTdReport()
     * @generated
     */
    EReference getTdReport_ExecInformations();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.TdReport#getDateFrom <em>Date From</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date From</em>'.
     * @see org.talend.dataquality.reports.TdReport#getDateFrom()
     * @see #getTdReport()
     * @generated
     */
	EAttribute getTdReport_DateFrom();

				/**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.TdReport#getDateTo <em>Date To</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date To</em>'.
     * @see org.talend.dataquality.reports.TdReport#getDateTo()
     * @see #getTdReport()
     * @generated
     */
	EAttribute getTdReport_DateTo();

				/**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.TdReport#getLogo <em>Logo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Logo</em>'.
     * @see org.talend.dataquality.reports.TdReport#getLogo()
     * @see #getTdReport()
     * @generated
     */
    EAttribute getTdReport_Logo();

                /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.TdReport#getInputJrxml <em>Input Jrxml</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Jrxml</em>'.
     * @see org.talend.dataquality.reports.TdReport#getInputJrxml()
     * @see #getTdReport()
     * @generated
     */
    EAttribute getTdReport_InputJrxml();

                /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.TdReport#getReportType <em>Report Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Report Type</em>'.
     * @see org.talend.dataquality.reports.TdReport#getReportType()
     * @see #getTdReport()
     * @generated
     */
    EAttribute getTdReport_ReportType();

                /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.reports.TdReport#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context</em>'.
     * @see org.talend.dataquality.reports.TdReport#getContext()
     * @see #getTdReport()
     * @generated
     */
    EReference getTdReport_Context();

                /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.TdReport#getDefaultContext <em>Default Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Context</em>'.
     * @see org.talend.dataquality.reports.TdReport#getDefaultContext()
     * @see #getTdReport()
     * @generated
     */
    EAttribute getTdReport_DefaultContext();

                /**
     * Returns the meta object for class '{@link org.talend.dataquality.reports.PresentationParameter <em>Presentation Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Presentation Parameter</em>'.
     * @see org.talend.dataquality.reports.PresentationParameter
     * @generated
     */
    EClass getPresentationParameter();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.PresentationParameter#getPlotType <em>Plot Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Plot Type</em>'.
     * @see org.talend.dataquality.reports.PresentationParameter#getPlotType()
     * @see #getPresentationParameter()
     * @generated
     */
    EAttribute getPresentationParameter_PlotType();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.reports.PresentationParameter#getIndicator <em>Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Indicator</em>'.
     * @see org.talend.dataquality.reports.PresentationParameter#getIndicator()
     * @see #getPresentationParameter()
     * @generated
     */
    EReference getPresentationParameter_Indicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.reports.AnalysisMap <em>Analysis Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Analysis Map</em>'.
     * @see org.talend.dataquality.reports.AnalysisMap
     * @generated
     */
    EClass getAnalysisMap();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.reports.AnalysisMap#getAnalysis <em>Analysis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Analysis</em>'.
     * @see org.talend.dataquality.reports.AnalysisMap#getAnalysis()
     * @see #getAnalysisMap()
     * @generated
     */
    EReference getAnalysisMap_Analysis();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.AnalysisMap#isMustRefresh <em>Must Refresh</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Must Refresh</em>'.
     * @see org.talend.dataquality.reports.AnalysisMap#isMustRefresh()
     * @see #getAnalysisMap()
     * @generated
     */
    EAttribute getAnalysisMap_MustRefresh();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.AnalysisMap#getReportType <em>Report Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Report Type</em>'.
     * @see org.talend.dataquality.reports.AnalysisMap#getReportType()
     * @see #getAnalysisMap()
     * @generated
     */
    EAttribute getAnalysisMap_ReportType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.reports.AnalysisMap#getJrxmlSource <em>Jrxml Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jrxml Source</em>'.
     * @see org.talend.dataquality.reports.AnalysisMap#getJrxmlSource()
     * @see #getAnalysisMap()
     * @generated
     */
    EAttribute getAnalysisMap_JrxmlSource();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ReportsFactory getReportsFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.dataquality.reports.impl.TdReportImpl <em>Td Report</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.reports.impl.TdReportImpl
         * @see org.talend.dataquality.reports.impl.ReportsPackageImpl#getTdReport()
         * @generated
         */
        EClass TD_REPORT = eINSTANCE.getTdReport();
        /**
         * The meta object literal for the '<em><b>Presentation Params</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TD_REPORT__PRESENTATION_PARAMS = eINSTANCE.getTdReport_PresentationParams();
        /**
         * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TD_REPORT__CREATION_DATE = eINSTANCE.getTdReport_CreationDate();
        /**
         * The meta object literal for the '<em><b>Analysis Map</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TD_REPORT__ANALYSIS_MAP = eINSTANCE.getTdReport_AnalysisMap();
        /**
         * The meta object literal for the '<em><b>Output Report Folder</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TD_REPORT__OUTPUT_REPORT_FOLDER = eINSTANCE.getTdReport_OutputReportFolder();
        /**
         * The meta object literal for the '<em><b>Exec Informations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TD_REPORT__EXEC_INFORMATIONS = eINSTANCE.getTdReport_ExecInformations();
        /**
         * The meta object literal for the '<em><b>Date From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TD_REPORT__DATE_FROM = eINSTANCE.getTdReport_DateFrom();
								/**
         * The meta object literal for the '<em><b>Date To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TD_REPORT__DATE_TO = eINSTANCE.getTdReport_DateTo();
								/**
         * The meta object literal for the '<em><b>Logo</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TD_REPORT__LOGO = eINSTANCE.getTdReport_Logo();
                                /**
         * The meta object literal for the '<em><b>Input Jrxml</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TD_REPORT__INPUT_JRXML = eINSTANCE.getTdReport_InputJrxml();
                                /**
         * The meta object literal for the '<em><b>Report Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TD_REPORT__REPORT_TYPE = eINSTANCE.getTdReport_ReportType();
                                /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TD_REPORT__CONTEXT = eINSTANCE.getTdReport_Context();
                                /**
         * The meta object literal for the '<em><b>Default Context</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TD_REPORT__DEFAULT_CONTEXT = eINSTANCE.getTdReport_DefaultContext();
                                /**
         * The meta object literal for the '{@link org.talend.dataquality.reports.impl.PresentationParameterImpl <em>Presentation Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.reports.impl.PresentationParameterImpl
         * @see org.talend.dataquality.reports.impl.ReportsPackageImpl#getPresentationParameter()
         * @generated
         */
        EClass PRESENTATION_PARAMETER = eINSTANCE.getPresentationParameter();
        /**
         * The meta object literal for the '<em><b>Plot Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRESENTATION_PARAMETER__PLOT_TYPE = eINSTANCE.getPresentationParameter_PlotType();
        /**
         * The meta object literal for the '<em><b>Indicator</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENTATION_PARAMETER__INDICATOR = eINSTANCE.getPresentationParameter_Indicator();
        /**
         * The meta object literal for the '{@link org.talend.dataquality.reports.impl.AnalysisMapImpl <em>Analysis Map</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.reports.impl.AnalysisMapImpl
         * @see org.talend.dataquality.reports.impl.ReportsPackageImpl#getAnalysisMap()
         * @generated
         */
        EClass ANALYSIS_MAP = eINSTANCE.getAnalysisMap();
        /**
         * The meta object literal for the '<em><b>Analysis</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_MAP__ANALYSIS = eINSTANCE.getAnalysisMap_Analysis();
        /**
         * The meta object literal for the '<em><b>Must Refresh</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS_MAP__MUST_REFRESH = eINSTANCE.getAnalysisMap_MustRefresh();
        /**
         * The meta object literal for the '<em><b>Report Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS_MAP__REPORT_TYPE = eINSTANCE.getAnalysisMap_ReportType();
        /**
         * The meta object literal for the '<em><b>Jrxml Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS_MAP__JRXML_SOURCE = eINSTANCE.getAnalysisMap_JrxmlSource();

    }

} //ReportsPackage
