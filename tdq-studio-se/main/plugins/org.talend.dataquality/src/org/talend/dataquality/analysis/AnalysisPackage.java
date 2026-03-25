/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * @see org.talend.dataquality.analysis.AnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface AnalysisPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "analysis";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.analysis";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.analysis";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AnalysisPackage eINSTANCE = org.talend.dataquality.analysis.impl.AnalysisPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.impl.AnalysisImpl <em>Analysis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.impl.AnalysisImpl
     * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalysis()
     * @generated
     */
    int ANALYSIS = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__NAME = InformationreportingPackage.REPORT_GROUP__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__VISIBILITY = InformationreportingPackage.REPORT_GROUP__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__CLIENT_DEPENDENCY = InformationreportingPackage.REPORT_GROUP__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__SUPPLIER_DEPENDENCY = InformationreportingPackage.REPORT_GROUP__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__CONSTRAINT = InformationreportingPackage.REPORT_GROUP__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__NAMESPACE = InformationreportingPackage.REPORT_GROUP__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__IMPORTER = InformationreportingPackage.REPORT_GROUP__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__STEREOTYPE = InformationreportingPackage.REPORT_GROUP__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__TAGGED_VALUE = InformationreportingPackage.REPORT_GROUP__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__DOCUMENT = InformationreportingPackage.REPORT_GROUP__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__DESCRIPTION = InformationreportingPackage.REPORT_GROUP__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__RESPONSIBLE_PARTY = InformationreportingPackage.REPORT_GROUP__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__ELEMENT_NODE = InformationreportingPackage.REPORT_GROUP__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__SET = InformationreportingPackage.REPORT_GROUP__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__RENDERED_OBJECT = InformationreportingPackage.REPORT_GROUP__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__VOCABULARY_ELEMENT = InformationreportingPackage.REPORT_GROUP__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__MEASUREMENT = InformationreportingPackage.REPORT_GROUP__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__CHANGE_REQUEST = InformationreportingPackage.REPORT_GROUP__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__DASDL_PROPERTY = InformationreportingPackage.REPORT_GROUP__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__OWNED_ELEMENT = InformationreportingPackage.REPORT_GROUP__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__IS_ABSTRACT = InformationreportingPackage.REPORT_GROUP__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__FEATURE = InformationreportingPackage.REPORT_GROUP__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__STRUCTURAL_FEATURE = InformationreportingPackage.REPORT_GROUP__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__PARAMETER = InformationreportingPackage.REPORT_GROUP__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__GENERALIZATION = InformationreportingPackage.REPORT_GROUP__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__SPECIALIZATION = InformationreportingPackage.REPORT_GROUP__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__INSTANCE = InformationreportingPackage.REPORT_GROUP__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__ALIAS = InformationreportingPackage.REPORT_GROUP__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__EXPRESSION_NODE = InformationreportingPackage.REPORT_GROUP__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__MAPPING_FROM = InformationreportingPackage.REPORT_GROUP__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__MAPPING_TO = InformationreportingPackage.REPORT_GROUP__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__CLASSIFIER_MAP = InformationreportingPackage.REPORT_GROUP__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__CF_MAP = InformationreportingPackage.REPORT_GROUP__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__DOMAIN = InformationreportingPackage.REPORT_GROUP__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__SIMPLE_DIMENSION = InformationreportingPackage.REPORT_GROUP__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__FORMULA = InformationreportingPackage.REPORT_GROUP__FORMULA;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__ACTION = InformationreportingPackage.REPORT_GROUP__ACTION;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__FILE_NAME = InformationreportingPackage.REPORT_GROUP__FILE_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__TYPE = InformationreportingPackage.REPORT_GROUP__TYPE;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__URL = InformationreportingPackage.REPORT_GROUP__URL;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__COMPOSITE = InformationreportingPackage.REPORT_GROUP__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__COMPONENT = InformationreportingPackage.REPORT_GROUP__COMPONENT;

    /**
     * The feature id for the '<em><b>Default Rendering</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__DEFAULT_RENDERING = InformationreportingPackage.REPORT_GROUP__DEFAULT_RENDERING;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__MODEL_ELEMENT = InformationreportingPackage.REPORT_GROUP__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Neighbor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__NEIGHBOR = InformationreportingPackage.REPORT_GROUP__NEIGHBOR;

    /**
     * The feature id for the '<em><b>Referencing Neighbor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__REFERENCING_NEIGHBOR = InformationreportingPackage.REPORT_GROUP__REFERENCING_NEIGHBOR;

    /**
     * The feature id for the '<em><b>Group Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__GROUP_TYPE = InformationreportingPackage.REPORT_GROUP__GROUP_TYPE;

    /**
     * The feature id for the '<em><b>Report Query</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__REPORT_QUERY = InformationreportingPackage.REPORT_GROUP__REPORT_QUERY;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__CONTEXT = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Results</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__RESULTS = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__PARAMETERS = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Creation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__CREATION_DATE = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Context Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__CONTEXT_TYPE = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Default Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS__DEFAULT_CONTEXT = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Analysis</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_FEATURE_COUNT = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.impl.AnalysisContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.impl.AnalysisContextImpl
     * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalysisContext()
     * @generated
     */
    int ANALYSIS_CONTEXT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__NAME = InformationreportingPackage.REPORT_GROUP__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__VISIBILITY = InformationreportingPackage.REPORT_GROUP__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__CLIENT_DEPENDENCY = InformationreportingPackage.REPORT_GROUP__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__SUPPLIER_DEPENDENCY = InformationreportingPackage.REPORT_GROUP__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__CONSTRAINT = InformationreportingPackage.REPORT_GROUP__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__NAMESPACE = InformationreportingPackage.REPORT_GROUP__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__IMPORTER = InformationreportingPackage.REPORT_GROUP__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__STEREOTYPE = InformationreportingPackage.REPORT_GROUP__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__TAGGED_VALUE = InformationreportingPackage.REPORT_GROUP__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__DOCUMENT = InformationreportingPackage.REPORT_GROUP__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__DESCRIPTION = InformationreportingPackage.REPORT_GROUP__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__RESPONSIBLE_PARTY = InformationreportingPackage.REPORT_GROUP__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__ELEMENT_NODE = InformationreportingPackage.REPORT_GROUP__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__SET = InformationreportingPackage.REPORT_GROUP__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__RENDERED_OBJECT = InformationreportingPackage.REPORT_GROUP__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__VOCABULARY_ELEMENT = InformationreportingPackage.REPORT_GROUP__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__MEASUREMENT = InformationreportingPackage.REPORT_GROUP__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__CHANGE_REQUEST = InformationreportingPackage.REPORT_GROUP__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__DASDL_PROPERTY = InformationreportingPackage.REPORT_GROUP__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__OWNED_ELEMENT = InformationreportingPackage.REPORT_GROUP__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__IS_ABSTRACT = InformationreportingPackage.REPORT_GROUP__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__FEATURE = InformationreportingPackage.REPORT_GROUP__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__STRUCTURAL_FEATURE = InformationreportingPackage.REPORT_GROUP__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__PARAMETER = InformationreportingPackage.REPORT_GROUP__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__GENERALIZATION = InformationreportingPackage.REPORT_GROUP__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__SPECIALIZATION = InformationreportingPackage.REPORT_GROUP__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__INSTANCE = InformationreportingPackage.REPORT_GROUP__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__ALIAS = InformationreportingPackage.REPORT_GROUP__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__EXPRESSION_NODE = InformationreportingPackage.REPORT_GROUP__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__MAPPING_FROM = InformationreportingPackage.REPORT_GROUP__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__MAPPING_TO = InformationreportingPackage.REPORT_GROUP__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__CLASSIFIER_MAP = InformationreportingPackage.REPORT_GROUP__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__CF_MAP = InformationreportingPackage.REPORT_GROUP__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__DOMAIN = InformationreportingPackage.REPORT_GROUP__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__SIMPLE_DIMENSION = InformationreportingPackage.REPORT_GROUP__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__FORMULA = InformationreportingPackage.REPORT_GROUP__FORMULA;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__ACTION = InformationreportingPackage.REPORT_GROUP__ACTION;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__FILE_NAME = InformationreportingPackage.REPORT_GROUP__FILE_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__TYPE = InformationreportingPackage.REPORT_GROUP__TYPE;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__URL = InformationreportingPackage.REPORT_GROUP__URL;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__COMPOSITE = InformationreportingPackage.REPORT_GROUP__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__COMPONENT = InformationreportingPackage.REPORT_GROUP__COMPONENT;

    /**
     * The feature id for the '<em><b>Default Rendering</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__DEFAULT_RENDERING = InformationreportingPackage.REPORT_GROUP__DEFAULT_RENDERING;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__MODEL_ELEMENT = InformationreportingPackage.REPORT_GROUP__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Neighbor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__NEIGHBOR = InformationreportingPackage.REPORT_GROUP__NEIGHBOR;

    /**
     * The feature id for the '<em><b>Referencing Neighbor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__REFERENCING_NEIGHBOR = InformationreportingPackage.REPORT_GROUP__REFERENCING_NEIGHBOR;

    /**
     * The feature id for the '<em><b>Group Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__GROUP_TYPE = InformationreportingPackage.REPORT_GROUP__GROUP_TYPE;

    /**
     * The feature id for the '<em><b>Report Query</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__REPORT_QUERY = InformationreportingPackage.REPORT_GROUP__REPORT_QUERY;

    /**
     * The feature id for the '<em><b>Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__CONNECTION = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Analysed Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__ANALYSED_ELEMENTS = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT_FEATURE_COUNT = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl <em>Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.impl.AnalysisParametersImpl
     * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalysisParameters()
     * @generated
     */
    int ANALYSIS_PARAMETERS = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__NAME = InformationreportingPackage.REPORT_GROUP__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__VISIBILITY = InformationreportingPackage.REPORT_GROUP__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__CLIENT_DEPENDENCY = InformationreportingPackage.REPORT_GROUP__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__SUPPLIER_DEPENDENCY = InformationreportingPackage.REPORT_GROUP__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__CONSTRAINT = InformationreportingPackage.REPORT_GROUP__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__NAMESPACE = InformationreportingPackage.REPORT_GROUP__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__IMPORTER = InformationreportingPackage.REPORT_GROUP__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__STEREOTYPE = InformationreportingPackage.REPORT_GROUP__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__TAGGED_VALUE = InformationreportingPackage.REPORT_GROUP__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__DOCUMENT = InformationreportingPackage.REPORT_GROUP__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__DESCRIPTION = InformationreportingPackage.REPORT_GROUP__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__RESPONSIBLE_PARTY = InformationreportingPackage.REPORT_GROUP__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__ELEMENT_NODE = InformationreportingPackage.REPORT_GROUP__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__SET = InformationreportingPackage.REPORT_GROUP__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__RENDERED_OBJECT = InformationreportingPackage.REPORT_GROUP__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__VOCABULARY_ELEMENT = InformationreportingPackage.REPORT_GROUP__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__MEASUREMENT = InformationreportingPackage.REPORT_GROUP__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__CHANGE_REQUEST = InformationreportingPackage.REPORT_GROUP__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__DASDL_PROPERTY = InformationreportingPackage.REPORT_GROUP__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__OWNED_ELEMENT = InformationreportingPackage.REPORT_GROUP__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__IS_ABSTRACT = InformationreportingPackage.REPORT_GROUP__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__FEATURE = InformationreportingPackage.REPORT_GROUP__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__STRUCTURAL_FEATURE = InformationreportingPackage.REPORT_GROUP__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__PARAMETER = InformationreportingPackage.REPORT_GROUP__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__GENERALIZATION = InformationreportingPackage.REPORT_GROUP__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__SPECIALIZATION = InformationreportingPackage.REPORT_GROUP__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__INSTANCE = InformationreportingPackage.REPORT_GROUP__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__ALIAS = InformationreportingPackage.REPORT_GROUP__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__EXPRESSION_NODE = InformationreportingPackage.REPORT_GROUP__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__MAPPING_FROM = InformationreportingPackage.REPORT_GROUP__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__MAPPING_TO = InformationreportingPackage.REPORT_GROUP__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__CLASSIFIER_MAP = InformationreportingPackage.REPORT_GROUP__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__CF_MAP = InformationreportingPackage.REPORT_GROUP__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__DOMAIN = InformationreportingPackage.REPORT_GROUP__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__SIMPLE_DIMENSION = InformationreportingPackage.REPORT_GROUP__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__FORMULA = InformationreportingPackage.REPORT_GROUP__FORMULA;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__ACTION = InformationreportingPackage.REPORT_GROUP__ACTION;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__FILE_NAME = InformationreportingPackage.REPORT_GROUP__FILE_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__TYPE = InformationreportingPackage.REPORT_GROUP__TYPE;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__URL = InformationreportingPackage.REPORT_GROUP__URL;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__COMPOSITE = InformationreportingPackage.REPORT_GROUP__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__COMPONENT = InformationreportingPackage.REPORT_GROUP__COMPONENT;

    /**
     * The feature id for the '<em><b>Default Rendering</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__DEFAULT_RENDERING = InformationreportingPackage.REPORT_GROUP__DEFAULT_RENDERING;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__MODEL_ELEMENT = InformationreportingPackage.REPORT_GROUP__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Neighbor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__NEIGHBOR = InformationreportingPackage.REPORT_GROUP__NEIGHBOR;

    /**
     * The feature id for the '<em><b>Referencing Neighbor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__REFERENCING_NEIGHBOR = InformationreportingPackage.REPORT_GROUP__REFERENCING_NEIGHBOR;

    /**
     * The feature id for the '<em><b>Group Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__GROUP_TYPE = InformationreportingPackage.REPORT_GROUP__GROUP_TYPE;

    /**
     * The feature id for the '<em><b>Report Query</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__REPORT_QUERY = InformationreportingPackage.REPORT_GROUP__REPORT_QUERY;

    /**
     * The feature id for the '<em><b>Data Filter</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__DATA_FILTER = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Indicator Validation Domains</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__INDICATOR_VALIDATION_DOMAINS = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Validation Domains</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__DATA_VALIDATION_DOMAINS = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Analysis Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__ANALYSIS_TYPE = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Deactivated Indicators</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__DEACTIVATED_INDICATORS = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Execution Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__EXECUTION_LANGUAGE = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__STORE_DATA = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__MAX_NUMBER_ROWS = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Sample Data Show Way</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS__SAMPLE_DATA_SHOW_WAY = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_PARAMETERS_FEATURE_COUNT = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 9;


    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.impl.AnalysisResultImpl <em>Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.impl.AnalysisResultImpl
     * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalysisResult()
     * @generated
     */
    int ANALYSIS_RESULT = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__NAME = InformationreportingPackage.REPORT_GROUP__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__VISIBILITY = InformationreportingPackage.REPORT_GROUP__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__CLIENT_DEPENDENCY = InformationreportingPackage.REPORT_GROUP__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__SUPPLIER_DEPENDENCY = InformationreportingPackage.REPORT_GROUP__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__CONSTRAINT = InformationreportingPackage.REPORT_GROUP__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__NAMESPACE = InformationreportingPackage.REPORT_GROUP__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__IMPORTER = InformationreportingPackage.REPORT_GROUP__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__STEREOTYPE = InformationreportingPackage.REPORT_GROUP__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__TAGGED_VALUE = InformationreportingPackage.REPORT_GROUP__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__DOCUMENT = InformationreportingPackage.REPORT_GROUP__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__DESCRIPTION = InformationreportingPackage.REPORT_GROUP__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__RESPONSIBLE_PARTY = InformationreportingPackage.REPORT_GROUP__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__ELEMENT_NODE = InformationreportingPackage.REPORT_GROUP__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__SET = InformationreportingPackage.REPORT_GROUP__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__RENDERED_OBJECT = InformationreportingPackage.REPORT_GROUP__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__VOCABULARY_ELEMENT = InformationreportingPackage.REPORT_GROUP__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__MEASUREMENT = InformationreportingPackage.REPORT_GROUP__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__CHANGE_REQUEST = InformationreportingPackage.REPORT_GROUP__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__DASDL_PROPERTY = InformationreportingPackage.REPORT_GROUP__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__OWNED_ELEMENT = InformationreportingPackage.REPORT_GROUP__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__IS_ABSTRACT = InformationreportingPackage.REPORT_GROUP__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__FEATURE = InformationreportingPackage.REPORT_GROUP__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__STRUCTURAL_FEATURE = InformationreportingPackage.REPORT_GROUP__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__PARAMETER = InformationreportingPackage.REPORT_GROUP__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__GENERALIZATION = InformationreportingPackage.REPORT_GROUP__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__SPECIALIZATION = InformationreportingPackage.REPORT_GROUP__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__INSTANCE = InformationreportingPackage.REPORT_GROUP__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__ALIAS = InformationreportingPackage.REPORT_GROUP__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__EXPRESSION_NODE = InformationreportingPackage.REPORT_GROUP__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__MAPPING_FROM = InformationreportingPackage.REPORT_GROUP__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__MAPPING_TO = InformationreportingPackage.REPORT_GROUP__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__CLASSIFIER_MAP = InformationreportingPackage.REPORT_GROUP__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__CF_MAP = InformationreportingPackage.REPORT_GROUP__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__DOMAIN = InformationreportingPackage.REPORT_GROUP__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__SIMPLE_DIMENSION = InformationreportingPackage.REPORT_GROUP__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__FORMULA = InformationreportingPackage.REPORT_GROUP__FORMULA;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__ACTION = InformationreportingPackage.REPORT_GROUP__ACTION;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__FILE_NAME = InformationreportingPackage.REPORT_GROUP__FILE_NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__TYPE = InformationreportingPackage.REPORT_GROUP__TYPE;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__URL = InformationreportingPackage.REPORT_GROUP__URL;

    /**
     * The feature id for the '<em><b>Composite</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__COMPOSITE = InformationreportingPackage.REPORT_GROUP__COMPOSITE;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__COMPONENT = InformationreportingPackage.REPORT_GROUP__COMPONENT;

    /**
     * The feature id for the '<em><b>Default Rendering</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__DEFAULT_RENDERING = InformationreportingPackage.REPORT_GROUP__DEFAULT_RENDERING;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__MODEL_ELEMENT = InformationreportingPackage.REPORT_GROUP__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Neighbor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__NEIGHBOR = InformationreportingPackage.REPORT_GROUP__NEIGHBOR;

    /**
     * The feature id for the '<em><b>Referencing Neighbor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__REFERENCING_NEIGHBOR = InformationreportingPackage.REPORT_GROUP__REFERENCING_NEIGHBOR;

    /**
     * The feature id for the '<em><b>Group Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__GROUP_TYPE = InformationreportingPackage.REPORT_GROUP__GROUP_TYPE;

    /**
     * The feature id for the '<em><b>Report Query</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__REPORT_QUERY = InformationreportingPackage.REPORT_GROUP__REPORT_QUERY;

    /**
     * The feature id for the '<em><b>Analysis</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__ANALYSIS = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Result Metadata</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__RESULT_METADATA = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__INDICATORS = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Indic To Row Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT__INDIC_TO_ROW_MAP = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_RESULT_FEATURE_COUNT = InformationreportingPackage.REPORT_GROUP_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.impl.ExecutionInformationsImpl <em>Execution Informations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.impl.ExecutionInformationsImpl
     * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getExecutionInformations()
     * @generated
     */
    int EXECUTION_INFORMATIONS = 4;

    /**
     * The feature id for the '<em><b>Execution Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_INFORMATIONS__EXECUTION_DATE = 0;

    /**
     * The feature id for the '<em><b>Execution Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_INFORMATIONS__EXECUTION_DURATION = 1;

    /**
     * The feature id for the '<em><b>Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_INFORMATIONS__MESSAGE = 2;

    /**
     * The feature id for the '<em><b>Execution Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_INFORMATIONS__EXECUTION_NUMBER = 3;

    /**
     * The feature id for the '<em><b>Last Run Ok</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_INFORMATIONS__LAST_RUN_OK = 4;

    /**
     * The feature id for the '<em><b>Last Execution Number Ok</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_INFORMATIONS__LAST_EXECUTION_NUMBER_OK = 5;

    /**
     * The feature id for the '<em><b>Out Threshold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_INFORMATIONS__OUT_THRESHOLD = 6;

    /**
     * The number of structural features of the '<em>Execution Informations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_INFORMATIONS_FEATURE_COUNT = 7;


    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.impl.IndicToRowsMapImpl <em>Indic To Rows Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.impl.IndicToRowsMapImpl
     * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getIndicToRowsMap()
     * @generated
     */
    int INDIC_TO_ROWS_MAP = 5;

    /**
     * The feature id for the '<em><b>Key</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDIC_TO_ROWS_MAP__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDIC_TO_ROWS_MAP__VALUE = 1;

    /**
     * The number of structural features of the '<em>Indic To Rows Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDIC_TO_ROWS_MAP_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.impl.AnalyzedDataSetImpl <em>Analyzed Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.impl.AnalyzedDataSetImpl
     * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalyzedDataSet()
     * @generated
     */
    int ANALYZED_DATA_SET = 6;

    /**
     * The feature id for the '<em><b>Data Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZED_DATA_SET__DATA_COUNT = 0;

    /**
     * The feature id for the '<em><b>Record Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZED_DATA_SET__RECORD_SIZE = 1;

    /**
     * The feature id for the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZED_DATA_SET__DATA = 2;

    /**
     * The feature id for the '<em><b>Pattern Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZED_DATA_SET__PATTERN_DATA = 3;

    /**
     * The feature id for the '<em><b>Frequency Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZED_DATA_SET__FREQUENCY_DATA = 4;

    /**
     * The number of structural features of the '<em>Analyzed Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYZED_DATA_SET_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.AnalysisType <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.AnalysisType
     * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalysisType()
     * @generated
     */
    int ANALYSIS_TYPE = 7;


    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.ExecutionLanguage <em>Execution Language</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.ExecutionLanguage
     * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getExecutionLanguage()
     * @generated
     */
    int EXECUTION_LANGUAGE = 8;


    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.SampleDataShowWay <em>Sample Data Show Way</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.SampleDataShowWay
     * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getSampleDataShowWay()
     * @generated
     */
    int SAMPLE_DATA_SHOW_WAY = 9;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.analysis.Analysis <em>Analysis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Analysis</em>'.
     * @see org.talend.dataquality.analysis.Analysis
     * @generated
     */
    EClass getAnalysis();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.analysis.Analysis#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context</em>'.
     * @see org.talend.dataquality.analysis.Analysis#getContext()
     * @see #getAnalysis()
     * @generated
     */
    EReference getAnalysis_Context();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.analysis.Analysis#getResults <em>Results</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Results</em>'.
     * @see org.talend.dataquality.analysis.Analysis#getResults()
     * @see #getAnalysis()
     * @generated
     */
    EReference getAnalysis_Results();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.analysis.Analysis#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameters</em>'.
     * @see org.talend.dataquality.analysis.Analysis#getParameters()
     * @see #getAnalysis()
     * @generated
     */
    EReference getAnalysis_Parameters();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.Analysis#getCreationDate <em>Creation Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Creation Date</em>'.
     * @see org.talend.dataquality.analysis.Analysis#getCreationDate()
     * @see #getAnalysis()
     * @generated
     */
    EAttribute getAnalysis_CreationDate();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.analysis.Analysis#getContextType <em>Context Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context Type</em>'.
     * @see org.talend.dataquality.analysis.Analysis#getContextType()
     * @see #getAnalysis()
     * @generated
     */
    EReference getAnalysis_ContextType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.Analysis#getDefaultContext <em>Default Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Context</em>'.
     * @see org.talend.dataquality.analysis.Analysis#getDefaultContext()
     * @see #getAnalysis()
     * @generated
     */
    EAttribute getAnalysis_DefaultContext();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.analysis.AnalysisContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context</em>'.
     * @see org.talend.dataquality.analysis.AnalysisContext
     * @generated
     */
    EClass getAnalysisContext();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.analysis.AnalysisContext#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Connection</em>'.
     * @see org.talend.dataquality.analysis.AnalysisContext#getConnection()
     * @see #getAnalysisContext()
     * @generated
     */
    EReference getAnalysisContext_Connection();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.analysis.AnalysisContext#getAnalysedElements <em>Analysed Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Analysed Elements</em>'.
     * @see org.talend.dataquality.analysis.AnalysisContext#getAnalysedElements()
     * @see #getAnalysisContext()
     * @generated
     */
    EReference getAnalysisContext_AnalysedElements();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.analysis.AnalysisParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameters</em>'.
     * @see org.talend.dataquality.analysis.AnalysisParameters
     * @generated
     */
    EClass getAnalysisParameters();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.analysis.AnalysisParameters#getDataFilter <em>Data Filter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Data Filter</em>'.
     * @see org.talend.dataquality.analysis.AnalysisParameters#getDataFilter()
     * @see #getAnalysisParameters()
     * @generated
     */
    EReference getAnalysisParameters_DataFilter();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.analysis.AnalysisParameters#getIndicatorValidationDomains <em>Indicator Validation Domains</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Indicator Validation Domains</em>'.
     * @see org.talend.dataquality.analysis.AnalysisParameters#getIndicatorValidationDomains()
     * @see #getAnalysisParameters()
     * @generated
     */
    EReference getAnalysisParameters_IndicatorValidationDomains();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.analysis.AnalysisParameters#getDataValidationDomains <em>Data Validation Domains</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Data Validation Domains</em>'.
     * @see org.talend.dataquality.analysis.AnalysisParameters#getDataValidationDomains()
     * @see #getAnalysisParameters()
     * @generated
     */
    EReference getAnalysisParameters_DataValidationDomains();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.AnalysisParameters#getAnalysisType <em>Analysis Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Analysis Type</em>'.
     * @see org.talend.dataquality.analysis.AnalysisParameters#getAnalysisType()
     * @see #getAnalysisParameters()
     * @generated
     */
    EAttribute getAnalysisParameters_AnalysisType();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.analysis.AnalysisParameters#getDeactivatedIndicators <em>Deactivated Indicators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Deactivated Indicators</em>'.
     * @see org.talend.dataquality.analysis.AnalysisParameters#getDeactivatedIndicators()
     * @see #getAnalysisParameters()
     * @generated
     */
    EReference getAnalysisParameters_DeactivatedIndicators();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.AnalysisParameters#getExecutionLanguage <em>Execution Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Execution Language</em>'.
     * @see org.talend.dataquality.analysis.AnalysisParameters#getExecutionLanguage()
     * @see #getAnalysisParameters()
     * @generated
     */
    EAttribute getAnalysisParameters_ExecutionLanguage();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.AnalysisParameters#isStoreData <em>Store Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Store Data</em>'.
     * @see org.talend.dataquality.analysis.AnalysisParameters#isStoreData()
     * @see #getAnalysisParameters()
     * @generated
     */
    EAttribute getAnalysisParameters_StoreData();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.AnalysisParameters#getMaxNumberRows <em>Max Number Rows</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Number Rows</em>'.
     * @see org.talend.dataquality.analysis.AnalysisParameters#getMaxNumberRows()
     * @see #getAnalysisParameters()
     * @generated
     */
    EAttribute getAnalysisParameters_MaxNumberRows();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.AnalysisParameters#getSampleDataShowWay <em>Sample Data Show Way</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sample Data Show Way</em>'.
     * @see org.talend.dataquality.analysis.AnalysisParameters#getSampleDataShowWay()
     * @see #getAnalysisParameters()
     * @generated
     */
    EAttribute getAnalysisParameters_SampleDataShowWay();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.analysis.AnalysisResult <em>Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result</em>'.
     * @see org.talend.dataquality.analysis.AnalysisResult
     * @generated
     */
    EClass getAnalysisResult();

    /**
     * Returns the meta object for the container reference '{@link org.talend.dataquality.analysis.AnalysisResult#getAnalysis <em>Analysis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Analysis</em>'.
     * @see org.talend.dataquality.analysis.AnalysisResult#getAnalysis()
     * @see #getAnalysisResult()
     * @generated
     */
    EReference getAnalysisResult_Analysis();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.analysis.AnalysisResult#getResultMetadata <em>Result Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Result Metadata</em>'.
     * @see org.talend.dataquality.analysis.AnalysisResult#getResultMetadata()
     * @see #getAnalysisResult()
     * @generated
     */
    EReference getAnalysisResult_ResultMetadata();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.analysis.AnalysisResult#getIndicators <em>Indicators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Indicators</em>'.
     * @see org.talend.dataquality.analysis.AnalysisResult#getIndicators()
     * @see #getAnalysisResult()
     * @generated
     */
    EReference getAnalysisResult_Indicators();

    /**
     * Returns the meta object for the map '{@link org.talend.dataquality.analysis.AnalysisResult#getIndicToRowMap <em>Indic To Row Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Indic To Row Map</em>'.
     * @see org.talend.dataquality.analysis.AnalysisResult#getIndicToRowMap()
     * @see #getAnalysisResult()
     * @generated
     */
    EReference getAnalysisResult_IndicToRowMap();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.analysis.ExecutionInformations <em>Execution Informations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Execution Informations</em>'.
     * @see org.talend.dataquality.analysis.ExecutionInformations
     * @generated
     */
    EClass getExecutionInformations();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.ExecutionInformations#getExecutionDate <em>Execution Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Execution Date</em>'.
     * @see org.talend.dataquality.analysis.ExecutionInformations#getExecutionDate()
     * @see #getExecutionInformations()
     * @generated
     */
    EAttribute getExecutionInformations_ExecutionDate();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.ExecutionInformations#getExecutionDuration <em>Execution Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Execution Duration</em>'.
     * @see org.talend.dataquality.analysis.ExecutionInformations#getExecutionDuration()
     * @see #getExecutionInformations()
     * @generated
     */
    EAttribute getExecutionInformations_ExecutionDuration();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.ExecutionInformations#getMessage <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message</em>'.
     * @see org.talend.dataquality.analysis.ExecutionInformations#getMessage()
     * @see #getExecutionInformations()
     * @generated
     */
    EAttribute getExecutionInformations_Message();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.ExecutionInformations#getExecutionNumber <em>Execution Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Execution Number</em>'.
     * @see org.talend.dataquality.analysis.ExecutionInformations#getExecutionNumber()
     * @see #getExecutionInformations()
     * @generated
     */
    EAttribute getExecutionInformations_ExecutionNumber();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.ExecutionInformations#isLastRunOk <em>Last Run Ok</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Run Ok</em>'.
     * @see org.talend.dataquality.analysis.ExecutionInformations#isLastRunOk()
     * @see #getExecutionInformations()
     * @generated
     */
    EAttribute getExecutionInformations_LastRunOk();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.ExecutionInformations#getLastExecutionNumberOk <em>Last Execution Number Ok</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Execution Number Ok</em>'.
     * @see org.talend.dataquality.analysis.ExecutionInformations#getLastExecutionNumberOk()
     * @see #getExecutionInformations()
     * @generated
     */
    EAttribute getExecutionInformations_LastExecutionNumberOk();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.ExecutionInformations#isOutThreshold <em>Out Threshold</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Out Threshold</em>'.
     * @see org.talend.dataquality.analysis.ExecutionInformations#isOutThreshold()
     * @see #getExecutionInformations()
     * @generated
     */
    EAttribute getExecutionInformations_OutThreshold();

    /**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>Indic To Rows Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Indic To Rows Map</em>'.
     * @see java.util.Map.Entry
     * @model keyType="org.talend.dataquality.indicators.Indicator" keyRequired="true"
     *        valueType="org.talend.dataquality.analysis.AnalyzedDataSet"
     * @generated
     */
    EClass getIndicToRowsMap();

    /**
     * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Key</em>'.
     * @see java.util.Map.Entry
     * @see #getIndicToRowsMap()
     * @generated
     */
    EReference getIndicToRowsMap_Key();

    /**
     * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Value</em>'.
     * @see java.util.Map.Entry
     * @see #getIndicToRowsMap()
     * @generated
     */
    EReference getIndicToRowsMap_Value();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.analysis.AnalyzedDataSet <em>Analyzed Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Analyzed Data Set</em>'.
     * @see org.talend.dataquality.analysis.AnalyzedDataSet
     * @generated
     */
    EClass getAnalyzedDataSet();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.AnalyzedDataSet#getDataCount <em>Data Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Count</em>'.
     * @see org.talend.dataquality.analysis.AnalyzedDataSet#getDataCount()
     * @see #getAnalyzedDataSet()
     * @generated
     */
    EAttribute getAnalyzedDataSet_DataCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.AnalyzedDataSet#getRecordSize <em>Record Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Record Size</em>'.
     * @see org.talend.dataquality.analysis.AnalyzedDataSet#getRecordSize()
     * @see #getAnalyzedDataSet()
     * @generated
     */
    EAttribute getAnalyzedDataSet_RecordSize();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.AnalyzedDataSet#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data</em>'.
     * @see org.talend.dataquality.analysis.AnalyzedDataSet#getData()
     * @see #getAnalyzedDataSet()
     * @generated
     */
    EAttribute getAnalyzedDataSet_Data();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.AnalyzedDataSet#getPatternData <em>Pattern Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern Data</em>'.
     * @see org.talend.dataquality.analysis.AnalyzedDataSet#getPatternData()
     * @see #getAnalyzedDataSet()
     * @generated
     */
    EAttribute getAnalyzedDataSet_PatternData();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.AnalyzedDataSet#getFrequencyData <em>Frequency Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Frequency Data</em>'.
     * @see org.talend.dataquality.analysis.AnalyzedDataSet#getFrequencyData()
     * @see #getAnalyzedDataSet()
     * @generated
     */
    EAttribute getAnalyzedDataSet_FrequencyData();

    /**
     * Returns the meta object for enum '{@link org.talend.dataquality.analysis.AnalysisType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Type</em>'.
     * @see org.talend.dataquality.analysis.AnalysisType
     * @generated
     */
    EEnum getAnalysisType();

    /**
     * Returns the meta object for enum '{@link org.talend.dataquality.analysis.ExecutionLanguage <em>Execution Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Execution Language</em>'.
     * @see org.talend.dataquality.analysis.ExecutionLanguage
     * @generated
     */
    EEnum getExecutionLanguage();

    /**
     * Returns the meta object for enum '{@link org.talend.dataquality.analysis.SampleDataShowWay <em>Sample Data Show Way</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Sample Data Show Way</em>'.
     * @see org.talend.dataquality.analysis.SampleDataShowWay
     * @generated
     */
    EEnum getSampleDataShowWay();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AnalysisFactory getAnalysisFactory();

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
         * The meta object literal for the '{@link org.talend.dataquality.analysis.impl.AnalysisImpl <em>Analysis</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.impl.AnalysisImpl
         * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalysis()
         * @generated
         */
        EClass ANALYSIS = eINSTANCE.getAnalysis();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS__CONTEXT = eINSTANCE.getAnalysis_Context();

        /**
         * The meta object literal for the '<em><b>Results</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS__RESULTS = eINSTANCE.getAnalysis_Results();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS__PARAMETERS = eINSTANCE.getAnalysis_Parameters();

        /**
         * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS__CREATION_DATE = eINSTANCE.getAnalysis_CreationDate();

        /**
         * The meta object literal for the '<em><b>Context Type</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS__CONTEXT_TYPE = eINSTANCE.getAnalysis_ContextType();

        /**
         * The meta object literal for the '<em><b>Default Context</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS__DEFAULT_CONTEXT = eINSTANCE.getAnalysis_DefaultContext();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.impl.AnalysisContextImpl <em>Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.impl.AnalysisContextImpl
         * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalysisContext()
         * @generated
         */
        EClass ANALYSIS_CONTEXT = eINSTANCE.getAnalysisContext();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_CONTEXT__CONNECTION = eINSTANCE.getAnalysisContext_Connection();

        /**
         * The meta object literal for the '<em><b>Analysed Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_CONTEXT__ANALYSED_ELEMENTS = eINSTANCE.getAnalysisContext_AnalysedElements();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl <em>Parameters</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.impl.AnalysisParametersImpl
         * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalysisParameters()
         * @generated
         */
        EClass ANALYSIS_PARAMETERS = eINSTANCE.getAnalysisParameters();

        /**
         * The meta object literal for the '<em><b>Data Filter</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_PARAMETERS__DATA_FILTER = eINSTANCE.getAnalysisParameters_DataFilter();

        /**
         * The meta object literal for the '<em><b>Indicator Validation Domains</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_PARAMETERS__INDICATOR_VALIDATION_DOMAINS = eINSTANCE.getAnalysisParameters_IndicatorValidationDomains();

        /**
         * The meta object literal for the '<em><b>Data Validation Domains</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_PARAMETERS__DATA_VALIDATION_DOMAINS = eINSTANCE.getAnalysisParameters_DataValidationDomains();

        /**
         * The meta object literal for the '<em><b>Analysis Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS_PARAMETERS__ANALYSIS_TYPE = eINSTANCE.getAnalysisParameters_AnalysisType();

        /**
         * The meta object literal for the '<em><b>Deactivated Indicators</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_PARAMETERS__DEACTIVATED_INDICATORS = eINSTANCE.getAnalysisParameters_DeactivatedIndicators();

        /**
         * The meta object literal for the '<em><b>Execution Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS_PARAMETERS__EXECUTION_LANGUAGE = eINSTANCE.getAnalysisParameters_ExecutionLanguage();

        /**
         * The meta object literal for the '<em><b>Store Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS_PARAMETERS__STORE_DATA = eINSTANCE.getAnalysisParameters_StoreData();

        /**
         * The meta object literal for the '<em><b>Max Number Rows</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS_PARAMETERS__MAX_NUMBER_ROWS = eINSTANCE.getAnalysisParameters_MaxNumberRows();

        /**
         * The meta object literal for the '<em><b>Sample Data Show Way</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS_PARAMETERS__SAMPLE_DATA_SHOW_WAY = eINSTANCE.getAnalysisParameters_SampleDataShowWay();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.impl.AnalysisResultImpl <em>Result</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.impl.AnalysisResultImpl
         * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalysisResult()
         * @generated
         */
        EClass ANALYSIS_RESULT = eINSTANCE.getAnalysisResult();

        /**
         * The meta object literal for the '<em><b>Analysis</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_RESULT__ANALYSIS = eINSTANCE.getAnalysisResult_Analysis();

        /**
         * The meta object literal for the '<em><b>Result Metadata</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_RESULT__RESULT_METADATA = eINSTANCE.getAnalysisResult_ResultMetadata();

        /**
         * The meta object literal for the '<em><b>Indicators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_RESULT__INDICATORS = eINSTANCE.getAnalysisResult_Indicators();

        /**
         * The meta object literal for the '<em><b>Indic To Row Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_RESULT__INDIC_TO_ROW_MAP = eINSTANCE.getAnalysisResult_IndicToRowMap();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.impl.ExecutionInformationsImpl <em>Execution Informations</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.impl.ExecutionInformationsImpl
         * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getExecutionInformations()
         * @generated
         */
        EClass EXECUTION_INFORMATIONS = eINSTANCE.getExecutionInformations();

        /**
         * The meta object literal for the '<em><b>Execution Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXECUTION_INFORMATIONS__EXECUTION_DATE = eINSTANCE.getExecutionInformations_ExecutionDate();

        /**
         * The meta object literal for the '<em><b>Execution Duration</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXECUTION_INFORMATIONS__EXECUTION_DURATION = eINSTANCE.getExecutionInformations_ExecutionDuration();

        /**
         * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXECUTION_INFORMATIONS__MESSAGE = eINSTANCE.getExecutionInformations_Message();

        /**
         * The meta object literal for the '<em><b>Execution Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXECUTION_INFORMATIONS__EXECUTION_NUMBER = eINSTANCE.getExecutionInformations_ExecutionNumber();

        /**
         * The meta object literal for the '<em><b>Last Run Ok</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXECUTION_INFORMATIONS__LAST_RUN_OK = eINSTANCE.getExecutionInformations_LastRunOk();

        /**
         * The meta object literal for the '<em><b>Last Execution Number Ok</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXECUTION_INFORMATIONS__LAST_EXECUTION_NUMBER_OK = eINSTANCE.getExecutionInformations_LastExecutionNumberOk();

        /**
         * The meta object literal for the '<em><b>Out Threshold</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXECUTION_INFORMATIONS__OUT_THRESHOLD = eINSTANCE.getExecutionInformations_OutThreshold();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.impl.IndicToRowsMapImpl <em>Indic To Rows Map</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.impl.IndicToRowsMapImpl
         * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getIndicToRowsMap()
         * @generated
         */
        EClass INDIC_TO_ROWS_MAP = eINSTANCE.getIndicToRowsMap();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDIC_TO_ROWS_MAP__KEY = eINSTANCE.getIndicToRowsMap_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDIC_TO_ROWS_MAP__VALUE = eINSTANCE.getIndicToRowsMap_Value();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.impl.AnalyzedDataSetImpl <em>Analyzed Data Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.impl.AnalyzedDataSetImpl
         * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalyzedDataSet()
         * @generated
         */
        EClass ANALYZED_DATA_SET = eINSTANCE.getAnalyzedDataSet();

        /**
         * The meta object literal for the '<em><b>Data Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYZED_DATA_SET__DATA_COUNT = eINSTANCE.getAnalyzedDataSet_DataCount();

        /**
         * The meta object literal for the '<em><b>Record Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYZED_DATA_SET__RECORD_SIZE = eINSTANCE.getAnalyzedDataSet_RecordSize();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYZED_DATA_SET__DATA = eINSTANCE.getAnalyzedDataSet_Data();

        /**
         * The meta object literal for the '<em><b>Pattern Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYZED_DATA_SET__PATTERN_DATA = eINSTANCE.getAnalyzedDataSet_PatternData();

        /**
         * The meta object literal for the '<em><b>Frequency Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYZED_DATA_SET__FREQUENCY_DATA = eINSTANCE.getAnalyzedDataSet_FrequencyData();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.AnalysisType <em>Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.AnalysisType
         * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getAnalysisType()
         * @generated
         */
        EEnum ANALYSIS_TYPE = eINSTANCE.getAnalysisType();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.ExecutionLanguage <em>Execution Language</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.ExecutionLanguage
         * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getExecutionLanguage()
         * @generated
         */
        EEnum EXECUTION_LANGUAGE = eINSTANCE.getExecutionLanguage();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.SampleDataShowWay <em>Sample Data Show Way</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.SampleDataShowWay
         * @see org.talend.dataquality.analysis.impl.AnalysisPackageImpl#getSampleDataShowWay()
         * @generated
         */
        EEnum SAMPLE_DATA_SHOW_WAY = eINSTANCE.getSampleDataShowWay();

    }

} //AnalysisPackage
