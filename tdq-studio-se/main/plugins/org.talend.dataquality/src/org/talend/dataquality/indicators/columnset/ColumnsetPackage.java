/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.columnset;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.talend.dataquality.indicators.IndicatorsPackage;

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
 * @see org.talend.dataquality.indicators.columnset.ColumnsetFactory
 * @model kind="package"
 * @generated
 */
public interface ColumnsetPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "columnset";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.indicators.columnset";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.indicators.columnset";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ColumnsetPackage eINSTANCE = org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.ColumnsCompareIndicatorImpl <em>Columns Compare Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsCompareIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getColumnsCompareIndicator()
     * @generated
     */
    int COLUMNS_COMPARE_INDICATOR = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__NAME = IndicatorsPackage.MATCHING_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__VISIBILITY = IndicatorsPackage.MATCHING_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__CLIENT_DEPENDENCY = IndicatorsPackage.MATCHING_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__SUPPLIER_DEPENDENCY = IndicatorsPackage.MATCHING_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__CONSTRAINT = IndicatorsPackage.MATCHING_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__NAMESPACE = IndicatorsPackage.MATCHING_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__IMPORTER = IndicatorsPackage.MATCHING_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__STEREOTYPE = IndicatorsPackage.MATCHING_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__TAGGED_VALUE = IndicatorsPackage.MATCHING_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__DOCUMENT = IndicatorsPackage.MATCHING_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__DESCRIPTION = IndicatorsPackage.MATCHING_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__RESPONSIBLE_PARTY = IndicatorsPackage.MATCHING_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__ELEMENT_NODE = IndicatorsPackage.MATCHING_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__SET = IndicatorsPackage.MATCHING_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__RENDERED_OBJECT = IndicatorsPackage.MATCHING_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__VOCABULARY_ELEMENT = IndicatorsPackage.MATCHING_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__MEASUREMENT = IndicatorsPackage.MATCHING_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__CHANGE_REQUEST = IndicatorsPackage.MATCHING_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__DASDL_PROPERTY = IndicatorsPackage.MATCHING_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__COUNT = IndicatorsPackage.MATCHING_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__NULL_COUNT = IndicatorsPackage.MATCHING_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__PARAMETERS = IndicatorsPackage.MATCHING_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__ANALYZED_ELEMENT = IndicatorsPackage.MATCHING_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__DATAMINING_TYPE = IndicatorsPackage.MATCHING_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__INDICATOR_DEFINITION = IndicatorsPackage.MATCHING_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__INSTANTIATED_EXPRESSIONS = IndicatorsPackage.MATCHING_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__COMPUTED = IndicatorsPackage.MATCHING_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__JOIN_CONDITIONS = IndicatorsPackage.MATCHING_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__MAX_NUMBER_ROWS = IndicatorsPackage.MATCHING_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__VALID_ROW = IndicatorsPackage.MATCHING_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__IN_VALID_ROW = IndicatorsPackage.MATCHING_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__STORE_DATA = IndicatorsPackage.MATCHING_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = IndicatorsPackage.MATCHING_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__MATCHING_VALUE_COUNT = IndicatorsPackage.MATCHING_INDICATOR__MATCHING_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Not Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__NOT_MATCHING_VALUE_COUNT = IndicatorsPackage.MATCHING_INDICATOR__NOT_MATCHING_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Column Set A</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__COLUMN_SET_A = IndicatorsPackage.MATCHING_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Column Set B</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR__COLUMN_SET_B = IndicatorsPackage.MATCHING_INDICATOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Columns Compare Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMNS_COMPARE_INDICATOR_FEATURE_COUNT = IndicatorsPackage.MATCHING_INDICATOR_FEATURE_COUNT + 2;


    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.ValueMatchingIndicatorImpl <em>Value Matching Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.ValueMatchingIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getValueMatchingIndicator()
     * @generated
     */
    int VALUE_MATCHING_INDICATOR = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__NAME = COLUMNS_COMPARE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__VISIBILITY = COLUMNS_COMPARE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__CLIENT_DEPENDENCY = COLUMNS_COMPARE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__SUPPLIER_DEPENDENCY = COLUMNS_COMPARE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__CONSTRAINT = COLUMNS_COMPARE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__NAMESPACE = COLUMNS_COMPARE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__IMPORTER = COLUMNS_COMPARE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__STEREOTYPE = COLUMNS_COMPARE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__TAGGED_VALUE = COLUMNS_COMPARE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__DOCUMENT = COLUMNS_COMPARE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__DESCRIPTION = COLUMNS_COMPARE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__RESPONSIBLE_PARTY = COLUMNS_COMPARE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__ELEMENT_NODE = COLUMNS_COMPARE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__SET = COLUMNS_COMPARE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__RENDERED_OBJECT = COLUMNS_COMPARE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__VOCABULARY_ELEMENT = COLUMNS_COMPARE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__MEASUREMENT = COLUMNS_COMPARE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__CHANGE_REQUEST = COLUMNS_COMPARE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__DASDL_PROPERTY = COLUMNS_COMPARE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__COUNT = COLUMNS_COMPARE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__NULL_COUNT = COLUMNS_COMPARE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__PARAMETERS = COLUMNS_COMPARE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__ANALYZED_ELEMENT = COLUMNS_COMPARE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__DATAMINING_TYPE = COLUMNS_COMPARE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__INDICATOR_DEFINITION = COLUMNS_COMPARE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__INSTANTIATED_EXPRESSIONS = COLUMNS_COMPARE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__COMPUTED = COLUMNS_COMPARE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__JOIN_CONDITIONS = COLUMNS_COMPARE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__MAX_NUMBER_ROWS = COLUMNS_COMPARE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__VALID_ROW = COLUMNS_COMPARE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__IN_VALID_ROW = COLUMNS_COMPARE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__STORE_DATA = COLUMNS_COMPARE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = COLUMNS_COMPARE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__MATCHING_VALUE_COUNT = COLUMNS_COMPARE_INDICATOR__MATCHING_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Not Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__NOT_MATCHING_VALUE_COUNT = COLUMNS_COMPARE_INDICATOR__NOT_MATCHING_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Column Set A</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__COLUMN_SET_A = COLUMNS_COMPARE_INDICATOR__COLUMN_SET_A;

    /**
     * The feature id for the '<em><b>Column Set B</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR__COLUMN_SET_B = COLUMNS_COMPARE_INDICATOR__COLUMN_SET_B;

    /**
     * The number of structural features of the '<em>Value Matching Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_MATCHING_INDICATOR_FEATURE_COUNT = COLUMNS_COMPARE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.RowMatchingIndicatorImpl <em>Row Matching Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.RowMatchingIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getRowMatchingIndicator()
     * @generated
     */
    int ROW_MATCHING_INDICATOR = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__NAME = COLUMNS_COMPARE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__VISIBILITY = COLUMNS_COMPARE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__CLIENT_DEPENDENCY = COLUMNS_COMPARE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__SUPPLIER_DEPENDENCY = COLUMNS_COMPARE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__CONSTRAINT = COLUMNS_COMPARE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__NAMESPACE = COLUMNS_COMPARE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__IMPORTER = COLUMNS_COMPARE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__STEREOTYPE = COLUMNS_COMPARE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__TAGGED_VALUE = COLUMNS_COMPARE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__DOCUMENT = COLUMNS_COMPARE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__DESCRIPTION = COLUMNS_COMPARE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__RESPONSIBLE_PARTY = COLUMNS_COMPARE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__ELEMENT_NODE = COLUMNS_COMPARE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__SET = COLUMNS_COMPARE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__RENDERED_OBJECT = COLUMNS_COMPARE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__VOCABULARY_ELEMENT = COLUMNS_COMPARE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__MEASUREMENT = COLUMNS_COMPARE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__CHANGE_REQUEST = COLUMNS_COMPARE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__DASDL_PROPERTY = COLUMNS_COMPARE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__COUNT = COLUMNS_COMPARE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__NULL_COUNT = COLUMNS_COMPARE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__PARAMETERS = COLUMNS_COMPARE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__ANALYZED_ELEMENT = COLUMNS_COMPARE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__DATAMINING_TYPE = COLUMNS_COMPARE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__INDICATOR_DEFINITION = COLUMNS_COMPARE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__INSTANTIATED_EXPRESSIONS = COLUMNS_COMPARE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__COMPUTED = COLUMNS_COMPARE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__JOIN_CONDITIONS = COLUMNS_COMPARE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__MAX_NUMBER_ROWS = COLUMNS_COMPARE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__VALID_ROW = COLUMNS_COMPARE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__IN_VALID_ROW = COLUMNS_COMPARE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__STORE_DATA = COLUMNS_COMPARE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = COLUMNS_COMPARE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__MATCHING_VALUE_COUNT = COLUMNS_COMPARE_INDICATOR__MATCHING_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Not Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__NOT_MATCHING_VALUE_COUNT = COLUMNS_COMPARE_INDICATOR__NOT_MATCHING_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Column Set A</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__COLUMN_SET_A = COLUMNS_COMPARE_INDICATOR__COLUMN_SET_A;

    /**
     * The feature id for the '<em><b>Column Set B</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR__COLUMN_SET_B = COLUMNS_COMPARE_INDICATOR__COLUMN_SET_B;

    /**
     * The number of structural features of the '<em>Row Matching Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROW_MATCHING_INDICATOR_FEATURE_COUNT = COLUMNS_COMPARE_INDICATOR_FEATURE_COUNT + 0;


    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.ColumnSetMultiValueIndicatorImpl <em>Column Set Multi Value Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnSetMultiValueIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getColumnSetMultiValueIndicator()
     * @generated
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__NAME = IndicatorsPackage.COMPOSITE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__VISIBILITY = IndicatorsPackage.COMPOSITE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__CLIENT_DEPENDENCY = IndicatorsPackage.COMPOSITE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__SUPPLIER_DEPENDENCY = IndicatorsPackage.COMPOSITE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__CONSTRAINT = IndicatorsPackage.COMPOSITE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__NAMESPACE = IndicatorsPackage.COMPOSITE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__IMPORTER = IndicatorsPackage.COMPOSITE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__STEREOTYPE = IndicatorsPackage.COMPOSITE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__TAGGED_VALUE = IndicatorsPackage.COMPOSITE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__DOCUMENT = IndicatorsPackage.COMPOSITE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__DESCRIPTION = IndicatorsPackage.COMPOSITE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__RESPONSIBLE_PARTY = IndicatorsPackage.COMPOSITE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__ELEMENT_NODE = IndicatorsPackage.COMPOSITE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__SET = IndicatorsPackage.COMPOSITE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__RENDERED_OBJECT = IndicatorsPackage.COMPOSITE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__VOCABULARY_ELEMENT = IndicatorsPackage.COMPOSITE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__MEASUREMENT = IndicatorsPackage.COMPOSITE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__CHANGE_REQUEST = IndicatorsPackage.COMPOSITE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__DASDL_PROPERTY = IndicatorsPackage.COMPOSITE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__COUNT = IndicatorsPackage.COMPOSITE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__NULL_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__PARAMETERS = IndicatorsPackage.COMPOSITE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_ELEMENT = IndicatorsPackage.COMPOSITE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__DATAMINING_TYPE = IndicatorsPackage.COMPOSITE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__INDICATOR_DEFINITION = IndicatorsPackage.COMPOSITE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__INSTANTIATED_EXPRESSIONS = IndicatorsPackage.COMPOSITE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__COMPUTED = IndicatorsPackage.COMPOSITE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__JOIN_CONDITIONS = IndicatorsPackage.COMPOSITE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__MAX_NUMBER_ROWS = IndicatorsPackage.COMPOSITE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__VALID_ROW = IndicatorsPackage.COMPOSITE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__IN_VALID_ROW = IndicatorsPackage.COMPOSITE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__STORE_DATA = IndicatorsPackage.COMPOSITE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = IndicatorsPackage.COMPOSITE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Analyzed Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>List Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Numeric Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Nominal Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Numeric Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Column Headers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Date Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Date Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Unique Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Distinct Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Duplicate Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Row Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Unique Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Distinct Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Duplicate Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>Column Set Multi Value Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 15;


    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.AllMatchIndicatorImpl <em>All Match Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.AllMatchIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getAllMatchIndicator()
     * @generated
     */
    int ALL_MATCH_INDICATOR = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__NAME = COLUMN_SET_MULTI_VALUE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__VISIBILITY = COLUMN_SET_MULTI_VALUE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__CLIENT_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__SUPPLIER_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__CONSTRAINT = COLUMN_SET_MULTI_VALUE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__NAMESPACE = COLUMN_SET_MULTI_VALUE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__IMPORTER = COLUMN_SET_MULTI_VALUE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__STEREOTYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__TAGGED_VALUE = COLUMN_SET_MULTI_VALUE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__DOCUMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__DESCRIPTION = COLUMN_SET_MULTI_VALUE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__RESPONSIBLE_PARTY = COLUMN_SET_MULTI_VALUE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__ELEMENT_NODE = COLUMN_SET_MULTI_VALUE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__SET = COLUMN_SET_MULTI_VALUE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__RENDERED_OBJECT = COLUMN_SET_MULTI_VALUE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__VOCABULARY_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__MEASUREMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__CHANGE_REQUEST = COLUMN_SET_MULTI_VALUE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__DASDL_PROPERTY = COLUMN_SET_MULTI_VALUE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__NULL_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__PARAMETERS = COLUMN_SET_MULTI_VALUE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__ANALYZED_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__DATAMINING_TYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__INSTANTIATED_EXPRESSIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__COMPUTED = COLUMN_SET_MULTI_VALUE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__JOIN_CONDITIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__MAX_NUMBER_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__IN_VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__STORE_DATA = COLUMN_SET_MULTI_VALUE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Analyzed Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__ANALYZED_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS;

    /**
     * The feature id for the '<em><b>List Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__LIST_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS;

    /**
     * The feature id for the '<em><b>Numeric Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__NUMERIC_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Nominal Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__NOMINAL_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS;

    /**
     * The feature id for the '<em><b>Numeric Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__NUMERIC_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS;

    /**
     * The feature id for the '<em><b>Column Headers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__COLUMN_HEADERS = COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS;

    /**
     * The feature id for the '<em><b>Date Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__DATE_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Date Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__DATE_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS;

    /**
     * The feature id for the '<em><b>Unique Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__UNIQUE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT;

    /**
     * The feature id for the '<em><b>Distinct Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__DISTINCT_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT;

    /**
     * The feature id for the '<em><b>Duplicate Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__DUPLICATE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT;

    /**
     * The feature id for the '<em><b>Row Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__ROW_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Unique Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__UNIQUE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Distinct Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__DISTINCT_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Duplicate Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__DUPLICATE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__MATCHING_VALUE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Not Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__NOT_MATCHING_VALUE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Composite Regex Matching Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR__COMPOSITE_REGEX_MATCHING_INDICATORS = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>All Match Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALL_MATCH_INDICATOR_FEATURE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.CountAvgNullIndicatorImpl <em>Count Avg Null Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.CountAvgNullIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getCountAvgNullIndicator()
     * @generated
     */
    int COUNT_AVG_NULL_INDICATOR = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__NAME = COLUMN_SET_MULTI_VALUE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__VISIBILITY = COLUMN_SET_MULTI_VALUE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__CLIENT_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__SUPPLIER_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__CONSTRAINT = COLUMN_SET_MULTI_VALUE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__NAMESPACE = COLUMN_SET_MULTI_VALUE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__IMPORTER = COLUMN_SET_MULTI_VALUE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__STEREOTYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__TAGGED_VALUE = COLUMN_SET_MULTI_VALUE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__DOCUMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__DESCRIPTION = COLUMN_SET_MULTI_VALUE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__RESPONSIBLE_PARTY = COLUMN_SET_MULTI_VALUE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__ELEMENT_NODE = COLUMN_SET_MULTI_VALUE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__SET = COLUMN_SET_MULTI_VALUE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__RENDERED_OBJECT = COLUMN_SET_MULTI_VALUE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__VOCABULARY_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__MEASUREMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__CHANGE_REQUEST = COLUMN_SET_MULTI_VALUE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__DASDL_PROPERTY = COLUMN_SET_MULTI_VALUE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__NULL_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__PARAMETERS = COLUMN_SET_MULTI_VALUE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__ANALYZED_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__DATAMINING_TYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__INSTANTIATED_EXPRESSIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__COMPUTED = COLUMN_SET_MULTI_VALUE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__JOIN_CONDITIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__MAX_NUMBER_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__IN_VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__STORE_DATA = COLUMN_SET_MULTI_VALUE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Analyzed Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__ANALYZED_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS;

    /**
     * The feature id for the '<em><b>List Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__LIST_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS;

    /**
     * The feature id for the '<em><b>Numeric Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__NUMERIC_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Nominal Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__NOMINAL_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS;

    /**
     * The feature id for the '<em><b>Numeric Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__NUMERIC_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS;

    /**
     * The feature id for the '<em><b>Column Headers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__COLUMN_HEADERS = COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS;

    /**
     * The feature id for the '<em><b>Date Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__DATE_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Date Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__DATE_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS;

    /**
     * The feature id for the '<em><b>Unique Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__UNIQUE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT;

    /**
     * The feature id for the '<em><b>Distinct Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__DISTINCT_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT;

    /**
     * The feature id for the '<em><b>Duplicate Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__DUPLICATE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT;

    /**
     * The feature id for the '<em><b>Row Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__ROW_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Unique Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__UNIQUE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Distinct Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__DISTINCT_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Duplicate Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR__DUPLICATE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR;

    /**
     * The number of structural features of the '<em>Count Avg Null Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNT_AVG_NULL_INDICATOR_FEATURE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.MinMaxDateIndicatorImpl <em>Min Max Date Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.MinMaxDateIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getMinMaxDateIndicator()
     * @generated
     */
    int MIN_MAX_DATE_INDICATOR = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__NAME = COLUMN_SET_MULTI_VALUE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__VISIBILITY = COLUMN_SET_MULTI_VALUE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__CLIENT_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__SUPPLIER_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__CONSTRAINT = COLUMN_SET_MULTI_VALUE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__NAMESPACE = COLUMN_SET_MULTI_VALUE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__IMPORTER = COLUMN_SET_MULTI_VALUE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__STEREOTYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__TAGGED_VALUE = COLUMN_SET_MULTI_VALUE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__DOCUMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__DESCRIPTION = COLUMN_SET_MULTI_VALUE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__RESPONSIBLE_PARTY = COLUMN_SET_MULTI_VALUE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__ELEMENT_NODE = COLUMN_SET_MULTI_VALUE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__SET = COLUMN_SET_MULTI_VALUE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__RENDERED_OBJECT = COLUMN_SET_MULTI_VALUE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__VOCABULARY_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__MEASUREMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__CHANGE_REQUEST = COLUMN_SET_MULTI_VALUE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__DASDL_PROPERTY = COLUMN_SET_MULTI_VALUE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__NULL_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__PARAMETERS = COLUMN_SET_MULTI_VALUE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__ANALYZED_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__DATAMINING_TYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__INSTANTIATED_EXPRESSIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__COMPUTED = COLUMN_SET_MULTI_VALUE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__JOIN_CONDITIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__MAX_NUMBER_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__IN_VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__STORE_DATA = COLUMN_SET_MULTI_VALUE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Analyzed Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__ANALYZED_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS;

    /**
     * The feature id for the '<em><b>List Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__LIST_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS;

    /**
     * The feature id for the '<em><b>Numeric Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__NUMERIC_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Nominal Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__NOMINAL_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS;

    /**
     * The feature id for the '<em><b>Numeric Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__NUMERIC_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS;

    /**
     * The feature id for the '<em><b>Column Headers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__COLUMN_HEADERS = COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS;

    /**
     * The feature id for the '<em><b>Date Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__DATE_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Date Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__DATE_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS;

    /**
     * The feature id for the '<em><b>Unique Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__UNIQUE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT;

    /**
     * The feature id for the '<em><b>Distinct Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__DISTINCT_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT;

    /**
     * The feature id for the '<em><b>Duplicate Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__DUPLICATE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT;

    /**
     * The feature id for the '<em><b>Row Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__ROW_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Unique Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__UNIQUE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Distinct Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__DISTINCT_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Duplicate Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR__DUPLICATE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR;

    /**
     * The number of structural features of the '<em>Min Max Date Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_MAX_DATE_INDICATOR_FEATURE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.WeakCorrelationIndicatorImpl <em>Weak Correlation Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.WeakCorrelationIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getWeakCorrelationIndicator()
     * @generated
     */
    int WEAK_CORRELATION_INDICATOR = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__NAME = COLUMN_SET_MULTI_VALUE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__VISIBILITY = COLUMN_SET_MULTI_VALUE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__CLIENT_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__SUPPLIER_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__CONSTRAINT = COLUMN_SET_MULTI_VALUE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__NAMESPACE = COLUMN_SET_MULTI_VALUE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__IMPORTER = COLUMN_SET_MULTI_VALUE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__STEREOTYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__TAGGED_VALUE = COLUMN_SET_MULTI_VALUE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__DOCUMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__DESCRIPTION = COLUMN_SET_MULTI_VALUE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__RESPONSIBLE_PARTY = COLUMN_SET_MULTI_VALUE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__ELEMENT_NODE = COLUMN_SET_MULTI_VALUE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__SET = COLUMN_SET_MULTI_VALUE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__RENDERED_OBJECT = COLUMN_SET_MULTI_VALUE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__VOCABULARY_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__MEASUREMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__CHANGE_REQUEST = COLUMN_SET_MULTI_VALUE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__DASDL_PROPERTY = COLUMN_SET_MULTI_VALUE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__NULL_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__PARAMETERS = COLUMN_SET_MULTI_VALUE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__ANALYZED_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__DATAMINING_TYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__INSTANTIATED_EXPRESSIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__COMPUTED = COLUMN_SET_MULTI_VALUE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__JOIN_CONDITIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__MAX_NUMBER_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__IN_VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__STORE_DATA = COLUMN_SET_MULTI_VALUE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Analyzed Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__ANALYZED_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS;

    /**
     * The feature id for the '<em><b>List Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__LIST_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS;

    /**
     * The feature id for the '<em><b>Numeric Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__NUMERIC_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Nominal Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__NOMINAL_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS;

    /**
     * The feature id for the '<em><b>Numeric Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__NUMERIC_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS;

    /**
     * The feature id for the '<em><b>Column Headers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__COLUMN_HEADERS = COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS;

    /**
     * The feature id for the '<em><b>Date Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__DATE_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Date Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__DATE_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS;

    /**
     * The feature id for the '<em><b>Unique Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__UNIQUE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT;

    /**
     * The feature id for the '<em><b>Distinct Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__DISTINCT_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT;

    /**
     * The feature id for the '<em><b>Duplicate Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__DUPLICATE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT;

    /**
     * The feature id for the '<em><b>Row Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__ROW_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Unique Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__UNIQUE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Distinct Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__DISTINCT_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Duplicate Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR__DUPLICATE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR;

    /**
     * The number of structural features of the '<em>Weak Correlation Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEAK_CORRELATION_INDICATOR_FEATURE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.ColumnDependencyIndicatorImpl <em>Column Dependency Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnDependencyIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getColumnDependencyIndicator()
     * @generated
     */
    int COLUMN_DEPENDENCY_INDICATOR = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__NAME = IndicatorsPackage.INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__VISIBILITY = IndicatorsPackage.INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__CLIENT_DEPENDENCY = IndicatorsPackage.INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__SUPPLIER_DEPENDENCY = IndicatorsPackage.INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__CONSTRAINT = IndicatorsPackage.INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__NAMESPACE = IndicatorsPackage.INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__IMPORTER = IndicatorsPackage.INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__STEREOTYPE = IndicatorsPackage.INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__TAGGED_VALUE = IndicatorsPackage.INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__DOCUMENT = IndicatorsPackage.INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__DESCRIPTION = IndicatorsPackage.INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__RESPONSIBLE_PARTY = IndicatorsPackage.INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__ELEMENT_NODE = IndicatorsPackage.INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__SET = IndicatorsPackage.INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__RENDERED_OBJECT = IndicatorsPackage.INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__VOCABULARY_ELEMENT = IndicatorsPackage.INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__MEASUREMENT = IndicatorsPackage.INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__CHANGE_REQUEST = IndicatorsPackage.INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__DASDL_PROPERTY = IndicatorsPackage.INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__COUNT = IndicatorsPackage.INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__NULL_COUNT = IndicatorsPackage.INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__PARAMETERS = IndicatorsPackage.INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__ANALYZED_ELEMENT = IndicatorsPackage.INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__DATAMINING_TYPE = IndicatorsPackage.INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__INDICATOR_DEFINITION = IndicatorsPackage.INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__INSTANTIATED_EXPRESSIONS = IndicatorsPackage.INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__COMPUTED = IndicatorsPackage.INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__JOIN_CONDITIONS = IndicatorsPackage.INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__MAX_NUMBER_ROWS = IndicatorsPackage.INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__VALID_ROW = IndicatorsPackage.INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__IN_VALID_ROW = IndicatorsPackage.INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__STORE_DATA = IndicatorsPackage.INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = IndicatorsPackage.INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Column A</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__COLUMN_A = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Column B</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__COLUMN_B = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>ACount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__ACOUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Distinct ACount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__DISTINCT_ACOUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Dependency Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR__DEPENDENCY_FACTOR = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Column Dependency Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEPENDENCY_INDICATOR_FEATURE_COUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.SimpleStatIndicatorImpl <em>Simple Stat Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.SimpleStatIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getSimpleStatIndicator()
     * @generated
     */
    int SIMPLE_STAT_INDICATOR = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__NAME = COLUMN_SET_MULTI_VALUE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__VISIBILITY = COLUMN_SET_MULTI_VALUE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__CLIENT_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__SUPPLIER_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__CONSTRAINT = COLUMN_SET_MULTI_VALUE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__NAMESPACE = COLUMN_SET_MULTI_VALUE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__IMPORTER = COLUMN_SET_MULTI_VALUE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__STEREOTYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__TAGGED_VALUE = COLUMN_SET_MULTI_VALUE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__DOCUMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__DESCRIPTION = COLUMN_SET_MULTI_VALUE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__RESPONSIBLE_PARTY = COLUMN_SET_MULTI_VALUE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__ELEMENT_NODE = COLUMN_SET_MULTI_VALUE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__SET = COLUMN_SET_MULTI_VALUE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__RENDERED_OBJECT = COLUMN_SET_MULTI_VALUE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__VOCABULARY_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__MEASUREMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__CHANGE_REQUEST = COLUMN_SET_MULTI_VALUE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__DASDL_PROPERTY = COLUMN_SET_MULTI_VALUE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__NULL_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__PARAMETERS = COLUMN_SET_MULTI_VALUE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__ANALYZED_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__DATAMINING_TYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__INSTANTIATED_EXPRESSIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__COMPUTED = COLUMN_SET_MULTI_VALUE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__JOIN_CONDITIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__MAX_NUMBER_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__IN_VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__STORE_DATA = COLUMN_SET_MULTI_VALUE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Analyzed Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__ANALYZED_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS;

    /**
     * The feature id for the '<em><b>List Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__LIST_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS;

    /**
     * The feature id for the '<em><b>Numeric Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__NUMERIC_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Nominal Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__NOMINAL_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS;

    /**
     * The feature id for the '<em><b>Numeric Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__NUMERIC_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS;

    /**
     * The feature id for the '<em><b>Column Headers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__COLUMN_HEADERS = COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS;

    /**
     * The feature id for the '<em><b>Date Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__DATE_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Date Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__DATE_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS;

    /**
     * The feature id for the '<em><b>Unique Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__UNIQUE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT;

    /**
     * The feature id for the '<em><b>Distinct Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__DISTINCT_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT;

    /**
     * The feature id for the '<em><b>Duplicate Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__DUPLICATE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT;

    /**
     * The feature id for the '<em><b>Row Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__ROW_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Unique Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__UNIQUE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Distinct Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__DISTINCT_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Duplicate Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR__DUPLICATE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR;

    /**
     * The number of structural features of the '<em>Simple Stat Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_STAT_INDICATOR_FEATURE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.BlockKeyIndicatorImpl <em>Block Key Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.BlockKeyIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getBlockKeyIndicator()
     * @generated
     */
    int BLOCK_KEY_INDICATOR = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__NAME = COLUMN_SET_MULTI_VALUE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__VISIBILITY = COLUMN_SET_MULTI_VALUE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__CLIENT_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__SUPPLIER_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__CONSTRAINT = COLUMN_SET_MULTI_VALUE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__NAMESPACE = COLUMN_SET_MULTI_VALUE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__IMPORTER = COLUMN_SET_MULTI_VALUE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__STEREOTYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__TAGGED_VALUE = COLUMN_SET_MULTI_VALUE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__DOCUMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__DESCRIPTION = COLUMN_SET_MULTI_VALUE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__RESPONSIBLE_PARTY = COLUMN_SET_MULTI_VALUE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__ELEMENT_NODE = COLUMN_SET_MULTI_VALUE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__SET = COLUMN_SET_MULTI_VALUE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__RENDERED_OBJECT = COLUMN_SET_MULTI_VALUE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__VOCABULARY_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__MEASUREMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__CHANGE_REQUEST = COLUMN_SET_MULTI_VALUE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__DASDL_PROPERTY = COLUMN_SET_MULTI_VALUE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__NULL_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__PARAMETERS = COLUMN_SET_MULTI_VALUE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__ANALYZED_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__DATAMINING_TYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__INSTANTIATED_EXPRESSIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__COMPUTED = COLUMN_SET_MULTI_VALUE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__JOIN_CONDITIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__MAX_NUMBER_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__IN_VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__STORE_DATA = COLUMN_SET_MULTI_VALUE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Analyzed Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__ANALYZED_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS;

    /**
     * The feature id for the '<em><b>List Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__LIST_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS;

    /**
     * The feature id for the '<em><b>Numeric Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__NUMERIC_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Nominal Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__NOMINAL_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS;

    /**
     * The feature id for the '<em><b>Numeric Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__NUMERIC_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS;

    /**
     * The feature id for the '<em><b>Column Headers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__COLUMN_HEADERS = COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS;

    /**
     * The feature id for the '<em><b>Date Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__DATE_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Date Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__DATE_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS;

    /**
     * The feature id for the '<em><b>Unique Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__UNIQUE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT;

    /**
     * The feature id for the '<em><b>Distinct Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__DISTINCT_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT;

    /**
     * The feature id for the '<em><b>Duplicate Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__DUPLICATE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT;

    /**
     * The feature id for the '<em><b>Row Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__ROW_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Unique Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__UNIQUE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Distinct Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__DISTINCT_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Duplicate Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__DUPLICATE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Block Size2frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR__BLOCK_SIZE2FREQUENCY = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Block Key Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_KEY_INDICATOR_FEATURE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.columnset.impl.RecordMatchingIndicatorImpl <em>Record Matching Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.columnset.impl.RecordMatchingIndicatorImpl
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getRecordMatchingIndicator()
     * @generated
     */
    int RECORD_MATCHING_INDICATOR = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__NAME = COLUMN_SET_MULTI_VALUE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__VISIBILITY = COLUMN_SET_MULTI_VALUE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__CLIENT_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__SUPPLIER_DEPENDENCY = COLUMN_SET_MULTI_VALUE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__CONSTRAINT = COLUMN_SET_MULTI_VALUE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__NAMESPACE = COLUMN_SET_MULTI_VALUE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__IMPORTER = COLUMN_SET_MULTI_VALUE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__STEREOTYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__TAGGED_VALUE = COLUMN_SET_MULTI_VALUE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__DOCUMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__DESCRIPTION = COLUMN_SET_MULTI_VALUE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__RESPONSIBLE_PARTY = COLUMN_SET_MULTI_VALUE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__ELEMENT_NODE = COLUMN_SET_MULTI_VALUE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__SET = COLUMN_SET_MULTI_VALUE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__RENDERED_OBJECT = COLUMN_SET_MULTI_VALUE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__VOCABULARY_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__MEASUREMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__CHANGE_REQUEST = COLUMN_SET_MULTI_VALUE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__DASDL_PROPERTY = COLUMN_SET_MULTI_VALUE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__NULL_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__PARAMETERS = COLUMN_SET_MULTI_VALUE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__ANALYZED_ELEMENT = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__DATAMINING_TYPE = COLUMN_SET_MULTI_VALUE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__INSTANTIATED_EXPRESSIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__COMPUTED = COLUMN_SET_MULTI_VALUE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__JOIN_CONDITIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__MAX_NUMBER_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__IN_VALID_ROW = COLUMN_SET_MULTI_VALUE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__STORE_DATA = COLUMN_SET_MULTI_VALUE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Analyzed Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__ANALYZED_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS;

    /**
     * The feature id for the '<em><b>List Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__LIST_ROWS = COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS;

    /**
     * The feature id for the '<em><b>Numeric Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__NUMERIC_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Nominal Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__NOMINAL_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS;

    /**
     * The feature id for the '<em><b>Numeric Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__NUMERIC_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS;

    /**
     * The feature id for the '<em><b>Column Headers</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__COLUMN_HEADERS = COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS;

    /**
     * The feature id for the '<em><b>Date Functions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__DATE_FUNCTIONS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Date Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__DATE_COLUMNS = COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS;

    /**
     * The feature id for the '<em><b>Unique Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__UNIQUE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT;

    /**
     * The feature id for the '<em><b>Distinct Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__DISTINCT_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT;

    /**
     * The feature id for the '<em><b>Duplicate Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__DUPLICATE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT;

    /**
     * The feature id for the '<em><b>Row Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__ROW_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Unique Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__UNIQUE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Distinct Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__DISTINCT_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Duplicate Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__DUPLICATE_COUNT_INDICATOR = COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR;

    /**
     * The feature id for the '<em><b>Group Size2group Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__GROUP_SIZE2GROUP_FREQUENCY = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Matched Record Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__MATCHED_RECORD_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Suspect Record Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__SUSPECT_RECORD_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Built In Match Rule Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR__BUILT_IN_MATCH_RULE_DEFINITION = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Record Matching Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECORD_MATCHING_INDICATOR_FEATURE_COUNT = COLUMN_SET_MULTI_VALUE_INDICATOR_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '<em>List Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getListObject()
     * @generated
     */
    int LIST_OBJECT = 12;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator <em>Columns Compare Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Columns Compare Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator
     * @generated
     */
    EClass getColumnsCompareIndicator();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator#getColumnSetA <em>Column Set A</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Column Set A</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator#getColumnSetA()
     * @see #getColumnsCompareIndicator()
     * @generated
     */
    EReference getColumnsCompareIndicator_ColumnSetA();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator#getColumnSetB <em>Column Set B</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Column Set B</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator#getColumnSetB()
     * @see #getColumnsCompareIndicator()
     * @generated
     */
    EReference getColumnsCompareIndicator_ColumnSetB();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.ValueMatchingIndicator <em>Value Matching Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Matching Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.ValueMatchingIndicator
     * @generated
     */
    EClass getValueMatchingIndicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.RowMatchingIndicator <em>Row Matching Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Row Matching Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.RowMatchingIndicator
     * @generated
     */
    EClass getRowMatchingIndicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator <em>Column Set Multi Value Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Column Set Multi Value Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator
     * @generated
     */
    EClass getColumnSetMultiValueIndicator();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getAnalyzedColumns <em>Analyzed Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Analyzed Columns</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getAnalyzedColumns()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EReference getColumnSetMultiValueIndicator_AnalyzedColumns();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getListRows <em>List Rows</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>List Rows</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getListRows()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EAttribute getColumnSetMultiValueIndicator_ListRows();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getNumericFunctions <em>Numeric Functions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Numeric Functions</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getNumericFunctions()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EAttribute getColumnSetMultiValueIndicator_NumericFunctions();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getNominalColumns <em>Nominal Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Nominal Columns</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getNominalColumns()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EReference getColumnSetMultiValueIndicator_NominalColumns();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getNumericColumns <em>Numeric Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Numeric Columns</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getNumericColumns()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EReference getColumnSetMultiValueIndicator_NumericColumns();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getColumnHeaders <em>Column Headers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Column Headers</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getColumnHeaders()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EAttribute getColumnSetMultiValueIndicator_ColumnHeaders();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDateFunctions <em>Date Functions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Date Functions</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDateFunctions()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EAttribute getColumnSetMultiValueIndicator_DateFunctions();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDateColumns <em>Date Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Date Columns</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDateColumns()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EReference getColumnSetMultiValueIndicator_DateColumns();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getUniqueCount <em>Unique Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unique Count</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getUniqueCount()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EAttribute getColumnSetMultiValueIndicator_UniqueCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDistinctCount <em>Distinct Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Distinct Count</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDistinctCount()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EAttribute getColumnSetMultiValueIndicator_DistinctCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDuplicateCount <em>Duplicate Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Duplicate Count</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDuplicateCount()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EAttribute getColumnSetMultiValueIndicator_DuplicateCount();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getRowCountIndicator <em>Row Count Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Row Count Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getRowCountIndicator()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EReference getColumnSetMultiValueIndicator_RowCountIndicator();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getUniqueCountIndicator <em>Unique Count Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Unique Count Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getUniqueCountIndicator()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EReference getColumnSetMultiValueIndicator_UniqueCountIndicator();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDistinctCountIndicator <em>Distinct Count Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Distinct Count Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDistinctCountIndicator()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EReference getColumnSetMultiValueIndicator_DistinctCountIndicator();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDuplicateCountIndicator <em>Duplicate Count Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Duplicate Count Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDuplicateCountIndicator()
     * @see #getColumnSetMultiValueIndicator()
     * @generated
     */
    EReference getColumnSetMultiValueIndicator_DuplicateCountIndicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.AllMatchIndicator <em>All Match Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>All Match Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.AllMatchIndicator
     * @generated
     */
    EClass getAllMatchIndicator();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.columnset.AllMatchIndicator#getCompositeRegexMatchingIndicators <em>Composite Regex Matching Indicators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Composite Regex Matching Indicators</em>'.
     * @see org.talend.dataquality.indicators.columnset.AllMatchIndicator#getCompositeRegexMatchingIndicators()
     * @see #getAllMatchIndicator()
     * @generated
     */
    EReference getAllMatchIndicator_CompositeRegexMatchingIndicators();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.CountAvgNullIndicator <em>Count Avg Null Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Count Avg Null Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.CountAvgNullIndicator
     * @generated
     */
    EClass getCountAvgNullIndicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.MinMaxDateIndicator <em>Min Max Date Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Min Max Date Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.MinMaxDateIndicator
     * @generated
     */
    EClass getMinMaxDateIndicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.WeakCorrelationIndicator <em>Weak Correlation Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Weak Correlation Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.WeakCorrelationIndicator
     * @generated
     */
    EClass getWeakCorrelationIndicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator <em>Column Dependency Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Column Dependency Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator
     * @generated
     */
    EClass getColumnDependencyIndicator();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getColumnA <em>Column A</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Column A</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getColumnA()
     * @see #getColumnDependencyIndicator()
     * @generated
     */
    EReference getColumnDependencyIndicator_ColumnA();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getColumnB <em>Column B</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Column B</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getColumnB()
     * @see #getColumnDependencyIndicator()
     * @generated
     */
    EReference getColumnDependencyIndicator_ColumnB();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getACount <em>ACount</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ACount</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getACount()
     * @see #getColumnDependencyIndicator()
     * @generated
     */
    EAttribute getColumnDependencyIndicator_ACount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getDistinctACount <em>Distinct ACount</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Distinct ACount</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getDistinctACount()
     * @see #getColumnDependencyIndicator()
     * @generated
     */
    EAttribute getColumnDependencyIndicator_DistinctACount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getDependencyFactor <em>Dependency Factor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dependency Factor</em>'.
     * @see org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getDependencyFactor()
     * @see #getColumnDependencyIndicator()
     * @generated
     */
    EAttribute getColumnDependencyIndicator_DependencyFactor();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.SimpleStatIndicator <em>Simple Stat Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Stat Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.SimpleStatIndicator
     * @generated
     */
    EClass getSimpleStatIndicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.BlockKeyIndicator <em>Block Key Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Block Key Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.BlockKeyIndicator
     * @generated
     */
    EClass getBlockKeyIndicator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.BlockKeyIndicator#getBlockSize2frequency <em>Block Size2frequency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Block Size2frequency</em>'.
     * @see org.talend.dataquality.indicators.columnset.BlockKeyIndicator#getBlockSize2frequency()
     * @see #getBlockKeyIndicator()
     * @generated
     */
    EAttribute getBlockKeyIndicator_BlockSize2frequency();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator <em>Record Matching Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Record Matching Indicator</em>'.
     * @see org.talend.dataquality.indicators.columnset.RecordMatchingIndicator
     * @generated
     */
    EClass getRecordMatchingIndicator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getGroupSize2groupFrequency <em>Group Size2group Frequency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Size2group Frequency</em>'.
     * @see org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getGroupSize2groupFrequency()
     * @see #getRecordMatchingIndicator()
     * @generated
     */
    EAttribute getRecordMatchingIndicator_GroupSize2groupFrequency();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getMatchedRecordCount <em>Matched Record Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Matched Record Count</em>'.
     * @see org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getMatchedRecordCount()
     * @see #getRecordMatchingIndicator()
     * @generated
     */
    EAttribute getRecordMatchingIndicator_MatchedRecordCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getSuspectRecordCount <em>Suspect Record Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Suspect Record Count</em>'.
     * @see org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getSuspectRecordCount()
     * @see #getRecordMatchingIndicator()
     * @generated
     */
    EAttribute getRecordMatchingIndicator_SuspectRecordCount();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getBuiltInMatchRuleDefinition <em>Built In Match Rule Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Built In Match Rule Definition</em>'.
     * @see org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getBuiltInMatchRuleDefinition()
     * @see #getRecordMatchingIndicator()
     * @generated
     */
    EReference getRecordMatchingIndicator_BuiltInMatchRuleDefinition();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>List Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>List Object</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List<java.lang.Object>"
     * @generated
     */
    EDataType getListObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ColumnsetFactory getColumnsetFactory();

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
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.ColumnsCompareIndicatorImpl <em>Columns Compare Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsCompareIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getColumnsCompareIndicator()
         * @generated
         */
        EClass COLUMNS_COMPARE_INDICATOR = eINSTANCE.getColumnsCompareIndicator();

        /**
         * The meta object literal for the '<em><b>Column Set A</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMNS_COMPARE_INDICATOR__COLUMN_SET_A = eINSTANCE.getColumnsCompareIndicator_ColumnSetA();

        /**
         * The meta object literal for the '<em><b>Column Set B</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMNS_COMPARE_INDICATOR__COLUMN_SET_B = eINSTANCE.getColumnsCompareIndicator_ColumnSetB();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.ValueMatchingIndicatorImpl <em>Value Matching Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.ValueMatchingIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getValueMatchingIndicator()
         * @generated
         */
        EClass VALUE_MATCHING_INDICATOR = eINSTANCE.getValueMatchingIndicator();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.RowMatchingIndicatorImpl <em>Row Matching Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.RowMatchingIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getRowMatchingIndicator()
         * @generated
         */
        EClass ROW_MATCHING_INDICATOR = eINSTANCE.getRowMatchingIndicator();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.ColumnSetMultiValueIndicatorImpl <em>Column Set Multi Value Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnSetMultiValueIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getColumnSetMultiValueIndicator()
         * @generated
         */
        EClass COLUMN_SET_MULTI_VALUE_INDICATOR = eINSTANCE.getColumnSetMultiValueIndicator();

        /**
         * The meta object literal for the '<em><b>Analyzed Columns</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS = eINSTANCE.getColumnSetMultiValueIndicator_AnalyzedColumns();

        /**
         * The meta object literal for the '<em><b>List Rows</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS = eINSTANCE.getColumnSetMultiValueIndicator_ListRows();

        /**
         * The meta object literal for the '<em><b>Numeric Functions</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS = eINSTANCE.getColumnSetMultiValueIndicator_NumericFunctions();

        /**
         * The meta object literal for the '<em><b>Nominal Columns</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS = eINSTANCE.getColumnSetMultiValueIndicator_NominalColumns();

        /**
         * The meta object literal for the '<em><b>Numeric Columns</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS = eINSTANCE.getColumnSetMultiValueIndicator_NumericColumns();

        /**
         * The meta object literal for the '<em><b>Column Headers</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS = eINSTANCE.getColumnSetMultiValueIndicator_ColumnHeaders();

        /**
         * The meta object literal for the '<em><b>Date Functions</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS = eINSTANCE.getColumnSetMultiValueIndicator_DateFunctions();

        /**
         * The meta object literal for the '<em><b>Date Columns</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS = eINSTANCE.getColumnSetMultiValueIndicator_DateColumns();

        /**
         * The meta object literal for the '<em><b>Unique Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT = eINSTANCE.getColumnSetMultiValueIndicator_UniqueCount();

        /**
         * The meta object literal for the '<em><b>Distinct Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT = eINSTANCE.getColumnSetMultiValueIndicator_DistinctCount();

        /**
         * The meta object literal for the '<em><b>Duplicate Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT = eINSTANCE.getColumnSetMultiValueIndicator_DuplicateCount();

        /**
         * The meta object literal for the '<em><b>Row Count Indicator</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR = eINSTANCE.getColumnSetMultiValueIndicator_RowCountIndicator();

        /**
         * The meta object literal for the '<em><b>Unique Count Indicator</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR = eINSTANCE.getColumnSetMultiValueIndicator_UniqueCountIndicator();

        /**
         * The meta object literal for the '<em><b>Distinct Count Indicator</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR = eINSTANCE.getColumnSetMultiValueIndicator_DistinctCountIndicator();

        /**
         * The meta object literal for the '<em><b>Duplicate Count Indicator</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR = eINSTANCE.getColumnSetMultiValueIndicator_DuplicateCountIndicator();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.AllMatchIndicatorImpl <em>All Match Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.AllMatchIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getAllMatchIndicator()
         * @generated
         */
        EClass ALL_MATCH_INDICATOR = eINSTANCE.getAllMatchIndicator();

        /**
         * The meta object literal for the '<em><b>Composite Regex Matching Indicators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ALL_MATCH_INDICATOR__COMPOSITE_REGEX_MATCHING_INDICATORS = eINSTANCE.getAllMatchIndicator_CompositeRegexMatchingIndicators();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.CountAvgNullIndicatorImpl <em>Count Avg Null Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.CountAvgNullIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getCountAvgNullIndicator()
         * @generated
         */
        EClass COUNT_AVG_NULL_INDICATOR = eINSTANCE.getCountAvgNullIndicator();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.MinMaxDateIndicatorImpl <em>Min Max Date Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.MinMaxDateIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getMinMaxDateIndicator()
         * @generated
         */
        EClass MIN_MAX_DATE_INDICATOR = eINSTANCE.getMinMaxDateIndicator();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.WeakCorrelationIndicatorImpl <em>Weak Correlation Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.WeakCorrelationIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getWeakCorrelationIndicator()
         * @generated
         */
        EClass WEAK_CORRELATION_INDICATOR = eINSTANCE.getWeakCorrelationIndicator();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.ColumnDependencyIndicatorImpl <em>Column Dependency Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnDependencyIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getColumnDependencyIndicator()
         * @generated
         */
        EClass COLUMN_DEPENDENCY_INDICATOR = eINSTANCE.getColumnDependencyIndicator();

        /**
         * The meta object literal for the '<em><b>Column A</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_DEPENDENCY_INDICATOR__COLUMN_A = eINSTANCE.getColumnDependencyIndicator_ColumnA();

        /**
         * The meta object literal for the '<em><b>Column B</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_DEPENDENCY_INDICATOR__COLUMN_B = eINSTANCE.getColumnDependencyIndicator_ColumnB();

        /**
         * The meta object literal for the '<em><b>ACount</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_DEPENDENCY_INDICATOR__ACOUNT = eINSTANCE.getColumnDependencyIndicator_ACount();

        /**
         * The meta object literal for the '<em><b>Distinct ACount</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_DEPENDENCY_INDICATOR__DISTINCT_ACOUNT = eINSTANCE.getColumnDependencyIndicator_DistinctACount();

        /**
         * The meta object literal for the '<em><b>Dependency Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_DEPENDENCY_INDICATOR__DEPENDENCY_FACTOR = eINSTANCE.getColumnDependencyIndicator_DependencyFactor();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.SimpleStatIndicatorImpl <em>Simple Stat Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.SimpleStatIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getSimpleStatIndicator()
         * @generated
         */
        EClass SIMPLE_STAT_INDICATOR = eINSTANCE.getSimpleStatIndicator();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.BlockKeyIndicatorImpl <em>Block Key Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.BlockKeyIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getBlockKeyIndicator()
         * @generated
         */
        EClass BLOCK_KEY_INDICATOR = eINSTANCE.getBlockKeyIndicator();

        /**
         * The meta object literal for the '<em><b>Block Size2frequency</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BLOCK_KEY_INDICATOR__BLOCK_SIZE2FREQUENCY = eINSTANCE.getBlockKeyIndicator_BlockSize2frequency();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.columnset.impl.RecordMatchingIndicatorImpl <em>Record Matching Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.columnset.impl.RecordMatchingIndicatorImpl
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getRecordMatchingIndicator()
         * @generated
         */
        EClass RECORD_MATCHING_INDICATOR = eINSTANCE.getRecordMatchingIndicator();

        /**
         * The meta object literal for the '<em><b>Group Size2group Frequency</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RECORD_MATCHING_INDICATOR__GROUP_SIZE2GROUP_FREQUENCY = eINSTANCE.getRecordMatchingIndicator_GroupSize2groupFrequency();

        /**
         * The meta object literal for the '<em><b>Matched Record Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RECORD_MATCHING_INDICATOR__MATCHED_RECORD_COUNT = eINSTANCE.getRecordMatchingIndicator_MatchedRecordCount();

        /**
         * The meta object literal for the '<em><b>Suspect Record Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RECORD_MATCHING_INDICATOR__SUSPECT_RECORD_COUNT = eINSTANCE.getRecordMatchingIndicator_SuspectRecordCount();

        /**
         * The meta object literal for the '<em><b>Built In Match Rule Definition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RECORD_MATCHING_INDICATOR__BUILT_IN_MATCH_RULE_DEFINITION = eINSTANCE.getRecordMatchingIndicator_BuiltInMatchRuleDefinition();

        /**
         * The meta object literal for the '<em>List Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl#getListObject()
         * @generated
         */
        EDataType LIST_OBJECT = eINSTANCE.getListObject();

    }

} //ColumnsetPackage
