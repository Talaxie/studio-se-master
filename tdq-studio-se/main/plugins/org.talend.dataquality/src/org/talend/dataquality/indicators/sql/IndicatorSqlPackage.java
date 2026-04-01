/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.sql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
 * @see org.talend.dataquality.indicators.sql.IndicatorSqlFactory
 * @model kind="package"
 * @generated
 */
public interface IndicatorSqlPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "sql";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.indicators.sql";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.indicators.sql";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IndicatorSqlPackage eINSTANCE = org.talend.dataquality.indicators.sql.impl.IndicatorSqlPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.sql.impl.UserDefIndicatorImpl <em>User Def Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.sql.impl.UserDefIndicatorImpl
     * @see org.talend.dataquality.indicators.sql.impl.IndicatorSqlPackageImpl#getUserDefIndicator()
     * @generated
     */
    int USER_DEF_INDICATOR = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__NAME = IndicatorsPackage.INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__VISIBILITY = IndicatorsPackage.INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__CLIENT_DEPENDENCY = IndicatorsPackage.INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__SUPPLIER_DEPENDENCY = IndicatorsPackage.INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__CONSTRAINT = IndicatorsPackage.INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__NAMESPACE = IndicatorsPackage.INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__IMPORTER = IndicatorsPackage.INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__STEREOTYPE = IndicatorsPackage.INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__TAGGED_VALUE = IndicatorsPackage.INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__DOCUMENT = IndicatorsPackage.INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__DESCRIPTION = IndicatorsPackage.INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__RESPONSIBLE_PARTY = IndicatorsPackage.INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__ELEMENT_NODE = IndicatorsPackage.INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__SET = IndicatorsPackage.INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__RENDERED_OBJECT = IndicatorsPackage.INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__VOCABULARY_ELEMENT = IndicatorsPackage.INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__MEASUREMENT = IndicatorsPackage.INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__CHANGE_REQUEST = IndicatorsPackage.INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__DASDL_PROPERTY = IndicatorsPackage.INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__COUNT = IndicatorsPackage.INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__NULL_COUNT = IndicatorsPackage.INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__PARAMETERS = IndicatorsPackage.INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__ANALYZED_ELEMENT = IndicatorsPackage.INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__DATAMINING_TYPE = IndicatorsPackage.INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__INDICATOR_DEFINITION = IndicatorsPackage.INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__INSTANTIATED_EXPRESSIONS = IndicatorsPackage.INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__COMPUTED = IndicatorsPackage.INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__JOIN_CONDITIONS = IndicatorsPackage.INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__MAX_NUMBER_ROWS = IndicatorsPackage.INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__VALID_ROW = IndicatorsPackage.INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__IN_VALID_ROW = IndicatorsPackage.INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__STORE_DATA = IndicatorsPackage.INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = IndicatorsPackage.INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>User Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__USER_COUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__MATCHING_VALUE_COUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Not Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__NOT_MATCHING_VALUE_COUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Unique Values</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__UNIQUE_VALUES = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Distinct Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__DISTINCT_VALUE_COUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Unique Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__UNIQUE_VALUE_COUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Duplicate Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__DUPLICATE_VALUE_COUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Value To Freq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__VALUE_TO_FREQ = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__VALUE = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Datatype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR__DATATYPE = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>User Def Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEF_INDICATOR_FEATURE_COUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 10;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.sql.impl.WhereRuleIndicatorImpl <em>Where Rule Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.sql.impl.WhereRuleIndicatorImpl
     * @see org.talend.dataquality.indicators.sql.impl.IndicatorSqlPackageImpl#getWhereRuleIndicator()
     * @generated
     */
    int WHERE_RULE_INDICATOR = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__NAME = USER_DEF_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__VISIBILITY = USER_DEF_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__CLIENT_DEPENDENCY = USER_DEF_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__SUPPLIER_DEPENDENCY = USER_DEF_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__CONSTRAINT = USER_DEF_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__NAMESPACE = USER_DEF_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__IMPORTER = USER_DEF_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__STEREOTYPE = USER_DEF_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__TAGGED_VALUE = USER_DEF_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__DOCUMENT = USER_DEF_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__DESCRIPTION = USER_DEF_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__RESPONSIBLE_PARTY = USER_DEF_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__ELEMENT_NODE = USER_DEF_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__SET = USER_DEF_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__RENDERED_OBJECT = USER_DEF_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__VOCABULARY_ELEMENT = USER_DEF_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__MEASUREMENT = USER_DEF_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__CHANGE_REQUEST = USER_DEF_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__DASDL_PROPERTY = USER_DEF_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__COUNT = USER_DEF_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__NULL_COUNT = USER_DEF_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__PARAMETERS = USER_DEF_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__ANALYZED_ELEMENT = USER_DEF_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__DATAMINING_TYPE = USER_DEF_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__INDICATOR_DEFINITION = USER_DEF_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__INSTANTIATED_EXPRESSIONS = USER_DEF_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__COMPUTED = USER_DEF_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__JOIN_CONDITIONS = USER_DEF_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__MAX_NUMBER_ROWS = USER_DEF_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__VALID_ROW = USER_DEF_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__IN_VALID_ROW = USER_DEF_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__STORE_DATA = USER_DEF_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = USER_DEF_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>User Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__USER_COUNT = USER_DEF_INDICATOR__USER_COUNT;

    /**
     * The feature id for the '<em><b>Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__MATCHING_VALUE_COUNT = USER_DEF_INDICATOR__MATCHING_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Not Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__NOT_MATCHING_VALUE_COUNT = USER_DEF_INDICATOR__NOT_MATCHING_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Unique Values</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__UNIQUE_VALUES = USER_DEF_INDICATOR__UNIQUE_VALUES;

    /**
     * The feature id for the '<em><b>Distinct Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__DISTINCT_VALUE_COUNT = USER_DEF_INDICATOR__DISTINCT_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Unique Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__UNIQUE_VALUE_COUNT = USER_DEF_INDICATOR__UNIQUE_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Duplicate Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__DUPLICATE_VALUE_COUNT = USER_DEF_INDICATOR__DUPLICATE_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Value To Freq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__VALUE_TO_FREQ = USER_DEF_INDICATOR__VALUE_TO_FREQ;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__VALUE = USER_DEF_INDICATOR__VALUE;

    /**
     * The feature id for the '<em><b>Datatype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR__DATATYPE = USER_DEF_INDICATOR__DATATYPE;

    /**
     * The number of structural features of the '<em>Where Rule Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WHERE_RULE_INDICATOR_FEATURE_COUNT = USER_DEF_INDICATOR_FEATURE_COUNT + 0;


    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.sql.impl.JavaUserDefIndicatorImpl <em>Java User Def Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.sql.impl.JavaUserDefIndicatorImpl
     * @see org.talend.dataquality.indicators.sql.impl.IndicatorSqlPackageImpl#getJavaUserDefIndicator()
     * @generated
     */
    int JAVA_USER_DEF_INDICATOR = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__NAME = USER_DEF_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__VISIBILITY = USER_DEF_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__CLIENT_DEPENDENCY = USER_DEF_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__SUPPLIER_DEPENDENCY = USER_DEF_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__CONSTRAINT = USER_DEF_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__NAMESPACE = USER_DEF_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__IMPORTER = USER_DEF_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__STEREOTYPE = USER_DEF_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__TAGGED_VALUE = USER_DEF_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__DOCUMENT = USER_DEF_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__DESCRIPTION = USER_DEF_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__RESPONSIBLE_PARTY = USER_DEF_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__ELEMENT_NODE = USER_DEF_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__SET = USER_DEF_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__RENDERED_OBJECT = USER_DEF_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__VOCABULARY_ELEMENT = USER_DEF_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__MEASUREMENT = USER_DEF_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__CHANGE_REQUEST = USER_DEF_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__DASDL_PROPERTY = USER_DEF_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__COUNT = USER_DEF_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__NULL_COUNT = USER_DEF_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__PARAMETERS = USER_DEF_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__ANALYZED_ELEMENT = USER_DEF_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__DATAMINING_TYPE = USER_DEF_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__INDICATOR_DEFINITION = USER_DEF_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__INSTANTIATED_EXPRESSIONS = USER_DEF_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__COMPUTED = USER_DEF_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__JOIN_CONDITIONS = USER_DEF_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__MAX_NUMBER_ROWS = USER_DEF_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__VALID_ROW = USER_DEF_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__IN_VALID_ROW = USER_DEF_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__STORE_DATA = USER_DEF_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = USER_DEF_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>User Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__USER_COUNT = USER_DEF_INDICATOR__USER_COUNT;

    /**
     * The feature id for the '<em><b>Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__MATCHING_VALUE_COUNT = USER_DEF_INDICATOR__MATCHING_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Not Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__NOT_MATCHING_VALUE_COUNT = USER_DEF_INDICATOR__NOT_MATCHING_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Unique Values</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__UNIQUE_VALUES = USER_DEF_INDICATOR__UNIQUE_VALUES;

    /**
     * The feature id for the '<em><b>Distinct Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__DISTINCT_VALUE_COUNT = USER_DEF_INDICATOR__DISTINCT_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Unique Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__UNIQUE_VALUE_COUNT = USER_DEF_INDICATOR__UNIQUE_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Duplicate Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__DUPLICATE_VALUE_COUNT = USER_DEF_INDICATOR__DUPLICATE_VALUE_COUNT;

    /**
     * The feature id for the '<em><b>Value To Freq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__VALUE_TO_FREQ = USER_DEF_INDICATOR__VALUE_TO_FREQ;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__VALUE = USER_DEF_INDICATOR__VALUE;

    /**
     * The feature id for the '<em><b>Datatype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR__DATATYPE = USER_DEF_INDICATOR__DATATYPE;

    /**
     * The number of structural features of the '<em>Java User Def Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_USER_DEF_INDICATOR_FEATURE_COUNT = USER_DEF_INDICATOR_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.sql.UserDefIndicator <em>User Def Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>User Def Indicator</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator
     * @generated
     */
    EClass getUserDefIndicator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getUserCount <em>User Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User Count</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator#getUserCount()
     * @see #getUserDefIndicator()
     * @generated
     */
    EAttribute getUserDefIndicator_UserCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getMatchingValueCount <em>Matching Value Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Matching Value Count</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator#getMatchingValueCount()
     * @see #getUserDefIndicator()
     * @generated
     */
    EAttribute getUserDefIndicator_MatchingValueCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getNotMatchingValueCount <em>Not Matching Value Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Not Matching Value Count</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator#getNotMatchingValueCount()
     * @see #getUserDefIndicator()
     * @generated
     */
    EAttribute getUserDefIndicator_NotMatchingValueCount();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getUniqueValues <em>Unique Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Unique Values</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator#getUniqueValues()
     * @see #getUserDefIndicator()
     * @generated
     */
    EAttribute getUserDefIndicator_UniqueValues();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getDistinctValueCount <em>Distinct Value Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Distinct Value Count</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator#getDistinctValueCount()
     * @see #getUserDefIndicator()
     * @generated
     */
    EAttribute getUserDefIndicator_DistinctValueCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getUniqueValueCount <em>Unique Value Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unique Value Count</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator#getUniqueValueCount()
     * @see #getUserDefIndicator()
     * @generated
     */
    EAttribute getUserDefIndicator_UniqueValueCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getDuplicateValueCount <em>Duplicate Value Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Duplicate Value Count</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator#getDuplicateValueCount()
     * @see #getUserDefIndicator()
     * @generated
     */
    EAttribute getUserDefIndicator_DuplicateValueCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getValueToFreq <em>Value To Freq</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value To Freq</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator#getValueToFreq()
     * @see #getUserDefIndicator()
     * @generated
     */
    EAttribute getUserDefIndicator_ValueToFreq();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator#getValue()
     * @see #getUserDefIndicator()
     * @generated
     */
    EAttribute getUserDefIndicator_Value();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getDatatype <em>Datatype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datatype</em>'.
     * @see org.talend.dataquality.indicators.sql.UserDefIndicator#getDatatype()
     * @see #getUserDefIndicator()
     * @generated
     */
    EAttribute getUserDefIndicator_Datatype();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.sql.WhereRuleIndicator <em>Where Rule Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Where Rule Indicator</em>'.
     * @see org.talend.dataquality.indicators.sql.WhereRuleIndicator
     * @generated
     */
    EClass getWhereRuleIndicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.sql.JavaUserDefIndicator <em>Java User Def Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java User Def Indicator</em>'.
     * @see org.talend.dataquality.indicators.sql.JavaUserDefIndicator
     * @generated
     */
    EClass getJavaUserDefIndicator();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    IndicatorSqlFactory getIndicatorSqlFactory();

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
         * The meta object literal for the '{@link org.talend.dataquality.indicators.sql.impl.UserDefIndicatorImpl <em>User Def Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.sql.impl.UserDefIndicatorImpl
         * @see org.talend.dataquality.indicators.sql.impl.IndicatorSqlPackageImpl#getUserDefIndicator()
         * @generated
         */
        EClass USER_DEF_INDICATOR = eINSTANCE.getUserDefIndicator();

        /**
         * The meta object literal for the '<em><b>User Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEF_INDICATOR__USER_COUNT = eINSTANCE.getUserDefIndicator_UserCount();

        /**
         * The meta object literal for the '<em><b>Matching Value Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEF_INDICATOR__MATCHING_VALUE_COUNT = eINSTANCE.getUserDefIndicator_MatchingValueCount();

        /**
         * The meta object literal for the '<em><b>Not Matching Value Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEF_INDICATOR__NOT_MATCHING_VALUE_COUNT = eINSTANCE.getUserDefIndicator_NotMatchingValueCount();

        /**
         * The meta object literal for the '<em><b>Unique Values</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEF_INDICATOR__UNIQUE_VALUES = eINSTANCE.getUserDefIndicator_UniqueValues();

        /**
         * The meta object literal for the '<em><b>Distinct Value Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEF_INDICATOR__DISTINCT_VALUE_COUNT = eINSTANCE.getUserDefIndicator_DistinctValueCount();

        /**
         * The meta object literal for the '<em><b>Unique Value Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEF_INDICATOR__UNIQUE_VALUE_COUNT = eINSTANCE.getUserDefIndicator_UniqueValueCount();

        /**
         * The meta object literal for the '<em><b>Duplicate Value Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEF_INDICATOR__DUPLICATE_VALUE_COUNT = eINSTANCE.getUserDefIndicator_DuplicateValueCount();

        /**
         * The meta object literal for the '<em><b>Value To Freq</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEF_INDICATOR__VALUE_TO_FREQ = eINSTANCE.getUserDefIndicator_ValueToFreq();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEF_INDICATOR__VALUE = eINSTANCE.getUserDefIndicator_Value();

        /**
         * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEF_INDICATOR__DATATYPE = eINSTANCE.getUserDefIndicator_Datatype();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.sql.impl.WhereRuleIndicatorImpl <em>Where Rule Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.sql.impl.WhereRuleIndicatorImpl
         * @see org.talend.dataquality.indicators.sql.impl.IndicatorSqlPackageImpl#getWhereRuleIndicator()
         * @generated
         */
        EClass WHERE_RULE_INDICATOR = eINSTANCE.getWhereRuleIndicator();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.sql.impl.JavaUserDefIndicatorImpl <em>Java User Def Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.sql.impl.JavaUserDefIndicatorImpl
         * @see org.talend.dataquality.indicators.sql.impl.IndicatorSqlPackageImpl#getJavaUserDefIndicator()
         * @generated
         */
        EClass JAVA_USER_DEF_INDICATOR = eINSTANCE.getJavaUserDefIndicator();

    }

} //IndicatorSqlPackage
