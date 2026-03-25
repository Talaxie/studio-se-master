/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.schema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.talend.dataquality.indicators.schema.SchemaFactory
 * @model kind="package"
 * @generated
 */
public interface SchemaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "schema";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.indicators.schema";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.indicators.schema";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SchemaPackage eINSTANCE = org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl <em>Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl
     * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getSchemaIndicator()
     * @generated
     */
    int SCHEMA_INDICATOR = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__NAME = IndicatorsPackage.COMPOSITE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__VISIBILITY = IndicatorsPackage.COMPOSITE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__CLIENT_DEPENDENCY = IndicatorsPackage.COMPOSITE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__SUPPLIER_DEPENDENCY = IndicatorsPackage.COMPOSITE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__CONSTRAINT = IndicatorsPackage.COMPOSITE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__NAMESPACE = IndicatorsPackage.COMPOSITE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__IMPORTER = IndicatorsPackage.COMPOSITE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__STEREOTYPE = IndicatorsPackage.COMPOSITE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__TAGGED_VALUE = IndicatorsPackage.COMPOSITE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__DOCUMENT = IndicatorsPackage.COMPOSITE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__DESCRIPTION = IndicatorsPackage.COMPOSITE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__RESPONSIBLE_PARTY = IndicatorsPackage.COMPOSITE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__ELEMENT_NODE = IndicatorsPackage.COMPOSITE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__SET = IndicatorsPackage.COMPOSITE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__RENDERED_OBJECT = IndicatorsPackage.COMPOSITE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__VOCABULARY_ELEMENT = IndicatorsPackage.COMPOSITE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__MEASUREMENT = IndicatorsPackage.COMPOSITE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__CHANGE_REQUEST = IndicatorsPackage.COMPOSITE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__DASDL_PROPERTY = IndicatorsPackage.COMPOSITE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__COUNT = IndicatorsPackage.COMPOSITE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__NULL_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__PARAMETERS = IndicatorsPackage.COMPOSITE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__ANALYZED_ELEMENT = IndicatorsPackage.COMPOSITE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__DATAMINING_TYPE = IndicatorsPackage.COMPOSITE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__INDICATOR_DEFINITION = IndicatorsPackage.COMPOSITE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__INSTANTIATED_EXPRESSIONS = IndicatorsPackage.COMPOSITE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__COMPUTED = IndicatorsPackage.COMPOSITE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__JOIN_CONDITIONS = IndicatorsPackage.COMPOSITE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__MAX_NUMBER_ROWS = IndicatorsPackage.COMPOSITE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__VALID_ROW = IndicatorsPackage.COMPOSITE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__IN_VALID_ROW = IndicatorsPackage.COMPOSITE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__STORE_DATA = IndicatorsPackage.COMPOSITE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = IndicatorsPackage.COMPOSITE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Table Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__TABLE_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Key Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__KEY_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Index Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__INDEX_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>View Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__VIEW_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Trigger Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__TRIGGER_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Table Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__TABLE_ROW_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Table Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__TABLE_INDICATORS = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>View Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__VIEW_ROW_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>View Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR__VIEW_INDICATORS = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_INDICATOR_FEATURE_COUNT = IndicatorsPackage.COMPOSITE_INDICATOR_FEATURE_COUNT + 9;


    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.schema.impl.TableIndicatorImpl <em>Table Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.schema.impl.TableIndicatorImpl
     * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getTableIndicator()
     * @generated
     */
    int TABLE_INDICATOR = 1;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.schema.impl.ConnectionIndicatorImpl <em>Connection Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.schema.impl.ConnectionIndicatorImpl
     * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getConnectionIndicator()
     * @generated
     */
    int CONNECTION_INDICATOR = 2;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.schema.impl.CatalogIndicatorImpl <em>Catalog Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.schema.impl.CatalogIndicatorImpl
     * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getCatalogIndicator()
     * @generated
     */
    int CATALOG_INDICATOR = 3;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.schema.impl.AbstractTableIndicatorImpl <em>Abstract Table Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.schema.impl.AbstractTableIndicatorImpl
     * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getAbstractTableIndicator()
     * @generated
     */
    int ABSTRACT_TABLE_INDICATOR = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__NAME = IndicatorsPackage.INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__VISIBILITY = IndicatorsPackage.INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__CLIENT_DEPENDENCY = IndicatorsPackage.INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__SUPPLIER_DEPENDENCY = IndicatorsPackage.INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__CONSTRAINT = IndicatorsPackage.INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__NAMESPACE = IndicatorsPackage.INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__IMPORTER = IndicatorsPackage.INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__STEREOTYPE = IndicatorsPackage.INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__TAGGED_VALUE = IndicatorsPackage.INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__DOCUMENT = IndicatorsPackage.INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__DESCRIPTION = IndicatorsPackage.INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__RESPONSIBLE_PARTY = IndicatorsPackage.INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__ELEMENT_NODE = IndicatorsPackage.INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__SET = IndicatorsPackage.INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__RENDERED_OBJECT = IndicatorsPackage.INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__VOCABULARY_ELEMENT = IndicatorsPackage.INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__MEASUREMENT = IndicatorsPackage.INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__CHANGE_REQUEST = IndicatorsPackage.INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__DASDL_PROPERTY = IndicatorsPackage.INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__COUNT = IndicatorsPackage.INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__NULL_COUNT = IndicatorsPackage.INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__PARAMETERS = IndicatorsPackage.INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__ANALYZED_ELEMENT = IndicatorsPackage.INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__DATAMINING_TYPE = IndicatorsPackage.INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__INDICATOR_DEFINITION = IndicatorsPackage.INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__INSTANTIATED_EXPRESSIONS = IndicatorsPackage.INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__COMPUTED = IndicatorsPackage.INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__JOIN_CONDITIONS = IndicatorsPackage.INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__MAX_NUMBER_ROWS = IndicatorsPackage.INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__VALID_ROW = IndicatorsPackage.INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__IN_VALID_ROW = IndicatorsPackage.INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__STORE_DATA = IndicatorsPackage.INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = IndicatorsPackage.INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__ROW_COUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Table Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR__TABLE_NAME = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Abstract Table Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_TABLE_INDICATOR_FEATURE_COUNT = IndicatorsPackage.INDICATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__NAME = ABSTRACT_TABLE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__VISIBILITY = ABSTRACT_TABLE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__CLIENT_DEPENDENCY = ABSTRACT_TABLE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__SUPPLIER_DEPENDENCY = ABSTRACT_TABLE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__CONSTRAINT = ABSTRACT_TABLE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__NAMESPACE = ABSTRACT_TABLE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__IMPORTER = ABSTRACT_TABLE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__STEREOTYPE = ABSTRACT_TABLE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__TAGGED_VALUE = ABSTRACT_TABLE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__DOCUMENT = ABSTRACT_TABLE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__DESCRIPTION = ABSTRACT_TABLE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__RESPONSIBLE_PARTY = ABSTRACT_TABLE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__ELEMENT_NODE = ABSTRACT_TABLE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__SET = ABSTRACT_TABLE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__RENDERED_OBJECT = ABSTRACT_TABLE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__VOCABULARY_ELEMENT = ABSTRACT_TABLE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__MEASUREMENT = ABSTRACT_TABLE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__CHANGE_REQUEST = ABSTRACT_TABLE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__DASDL_PROPERTY = ABSTRACT_TABLE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__COUNT = ABSTRACT_TABLE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__NULL_COUNT = ABSTRACT_TABLE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__PARAMETERS = ABSTRACT_TABLE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__ANALYZED_ELEMENT = ABSTRACT_TABLE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__DATAMINING_TYPE = ABSTRACT_TABLE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__INDICATOR_DEFINITION = ABSTRACT_TABLE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__INSTANTIATED_EXPRESSIONS = ABSTRACT_TABLE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__COMPUTED = ABSTRACT_TABLE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__JOIN_CONDITIONS = ABSTRACT_TABLE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__MAX_NUMBER_ROWS = ABSTRACT_TABLE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__VALID_ROW = ABSTRACT_TABLE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__IN_VALID_ROW = ABSTRACT_TABLE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__STORE_DATA = ABSTRACT_TABLE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = ABSTRACT_TABLE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__ROW_COUNT = ABSTRACT_TABLE_INDICATOR__ROW_COUNT;

    /**
     * The feature id for the '<em><b>Table Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__TABLE_NAME = ABSTRACT_TABLE_INDICATOR__TABLE_NAME;

    /**
     * The feature id for the '<em><b>Key Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__KEY_COUNT = ABSTRACT_TABLE_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Index Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR__INDEX_COUNT = ABSTRACT_TABLE_INDICATOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Table Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_INDICATOR_FEATURE_COUNT = ABSTRACT_TABLE_INDICATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__NAME = SCHEMA_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__VISIBILITY = SCHEMA_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__CLIENT_DEPENDENCY = SCHEMA_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__SUPPLIER_DEPENDENCY = SCHEMA_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__CONSTRAINT = SCHEMA_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__NAMESPACE = SCHEMA_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__IMPORTER = SCHEMA_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__STEREOTYPE = SCHEMA_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__TAGGED_VALUE = SCHEMA_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__DOCUMENT = SCHEMA_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__DESCRIPTION = SCHEMA_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__RESPONSIBLE_PARTY = SCHEMA_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__ELEMENT_NODE = SCHEMA_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__SET = SCHEMA_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__RENDERED_OBJECT = SCHEMA_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__VOCABULARY_ELEMENT = SCHEMA_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__MEASUREMENT = SCHEMA_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__CHANGE_REQUEST = SCHEMA_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__DASDL_PROPERTY = SCHEMA_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__COUNT = SCHEMA_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__NULL_COUNT = SCHEMA_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__PARAMETERS = SCHEMA_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__ANALYZED_ELEMENT = SCHEMA_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__DATAMINING_TYPE = SCHEMA_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__INDICATOR_DEFINITION = SCHEMA_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__INSTANTIATED_EXPRESSIONS = SCHEMA_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__COMPUTED = SCHEMA_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__JOIN_CONDITIONS = SCHEMA_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__MAX_NUMBER_ROWS = SCHEMA_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__VALID_ROW = SCHEMA_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__IN_VALID_ROW = SCHEMA_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__STORE_DATA = SCHEMA_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = SCHEMA_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Table Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__TABLE_COUNT = SCHEMA_INDICATOR__TABLE_COUNT;

    /**
     * The feature id for the '<em><b>Key Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__KEY_COUNT = SCHEMA_INDICATOR__KEY_COUNT;

    /**
     * The feature id for the '<em><b>Index Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__INDEX_COUNT = SCHEMA_INDICATOR__INDEX_COUNT;

    /**
     * The feature id for the '<em><b>View Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__VIEW_COUNT = SCHEMA_INDICATOR__VIEW_COUNT;

    /**
     * The feature id for the '<em><b>Trigger Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__TRIGGER_COUNT = SCHEMA_INDICATOR__TRIGGER_COUNT;

    /**
     * The feature id for the '<em><b>Table Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__TABLE_ROW_COUNT = SCHEMA_INDICATOR__TABLE_ROW_COUNT;

    /**
     * The feature id for the '<em><b>Table Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__TABLE_INDICATORS = SCHEMA_INDICATOR__TABLE_INDICATORS;

    /**
     * The feature id for the '<em><b>View Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__VIEW_ROW_COUNT = SCHEMA_INDICATOR__VIEW_ROW_COUNT;

    /**
     * The feature id for the '<em><b>View Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__VIEW_INDICATORS = SCHEMA_INDICATOR__VIEW_INDICATORS;

    /**
     * The feature id for the '<em><b>Schema Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__SCHEMA_COUNT = SCHEMA_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schema Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR__SCHEMA_INDICATORS = SCHEMA_INDICATOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Catalog Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATALOG_INDICATOR_FEATURE_COUNT = SCHEMA_INDICATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__NAME = CATALOG_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__VISIBILITY = CATALOG_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__CLIENT_DEPENDENCY = CATALOG_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__SUPPLIER_DEPENDENCY = CATALOG_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__CONSTRAINT = CATALOG_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__NAMESPACE = CATALOG_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__IMPORTER = CATALOG_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__STEREOTYPE = CATALOG_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__TAGGED_VALUE = CATALOG_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__DOCUMENT = CATALOG_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__DESCRIPTION = CATALOG_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__RESPONSIBLE_PARTY = CATALOG_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__ELEMENT_NODE = CATALOG_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__SET = CATALOG_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__RENDERED_OBJECT = CATALOG_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__VOCABULARY_ELEMENT = CATALOG_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__MEASUREMENT = CATALOG_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__CHANGE_REQUEST = CATALOG_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__DASDL_PROPERTY = CATALOG_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__COUNT = CATALOG_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__NULL_COUNT = CATALOG_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__PARAMETERS = CATALOG_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__ANALYZED_ELEMENT = CATALOG_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__DATAMINING_TYPE = CATALOG_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__INDICATOR_DEFINITION = CATALOG_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__INSTANTIATED_EXPRESSIONS = CATALOG_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__COMPUTED = CATALOG_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__JOIN_CONDITIONS = CATALOG_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__MAX_NUMBER_ROWS = CATALOG_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__VALID_ROW = CATALOG_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__IN_VALID_ROW = CATALOG_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__STORE_DATA = CATALOG_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = CATALOG_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Table Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__TABLE_COUNT = CATALOG_INDICATOR__TABLE_COUNT;

    /**
     * The feature id for the '<em><b>Key Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__KEY_COUNT = CATALOG_INDICATOR__KEY_COUNT;

    /**
     * The feature id for the '<em><b>Index Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__INDEX_COUNT = CATALOG_INDICATOR__INDEX_COUNT;

    /**
     * The feature id for the '<em><b>View Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__VIEW_COUNT = CATALOG_INDICATOR__VIEW_COUNT;

    /**
     * The feature id for the '<em><b>Trigger Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__TRIGGER_COUNT = CATALOG_INDICATOR__TRIGGER_COUNT;

    /**
     * The feature id for the '<em><b>Table Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__TABLE_ROW_COUNT = CATALOG_INDICATOR__TABLE_ROW_COUNT;

    /**
     * The feature id for the '<em><b>Table Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__TABLE_INDICATORS = CATALOG_INDICATOR__TABLE_INDICATORS;

    /**
     * The feature id for the '<em><b>View Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__VIEW_ROW_COUNT = CATALOG_INDICATOR__VIEW_ROW_COUNT;

    /**
     * The feature id for the '<em><b>View Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__VIEW_INDICATORS = CATALOG_INDICATOR__VIEW_INDICATORS;

    /**
     * The feature id for the '<em><b>Schema Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__SCHEMA_COUNT = CATALOG_INDICATOR__SCHEMA_COUNT;

    /**
     * The feature id for the '<em><b>Schema Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__SCHEMA_INDICATORS = CATALOG_INDICATOR__SCHEMA_INDICATORS;

    /**
     * The feature id for the '<em><b>Catalog Indicators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__CATALOG_INDICATORS = CATALOG_INDICATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Catalog Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR__CATALOG_COUNT = CATALOG_INDICATOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Connection Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_INDICATOR_FEATURE_COUNT = CATALOG_INDICATOR_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.schema.impl.ViewIndicatorImpl <em>View Indicator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.schema.impl.ViewIndicatorImpl
     * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getViewIndicator()
     * @generated
     */
    int VIEW_INDICATOR = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__NAME = ABSTRACT_TABLE_INDICATOR__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__VISIBILITY = ABSTRACT_TABLE_INDICATOR__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__CLIENT_DEPENDENCY = ABSTRACT_TABLE_INDICATOR__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__SUPPLIER_DEPENDENCY = ABSTRACT_TABLE_INDICATOR__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__CONSTRAINT = ABSTRACT_TABLE_INDICATOR__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__NAMESPACE = ABSTRACT_TABLE_INDICATOR__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__IMPORTER = ABSTRACT_TABLE_INDICATOR__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__STEREOTYPE = ABSTRACT_TABLE_INDICATOR__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__TAGGED_VALUE = ABSTRACT_TABLE_INDICATOR__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__DOCUMENT = ABSTRACT_TABLE_INDICATOR__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__DESCRIPTION = ABSTRACT_TABLE_INDICATOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__RESPONSIBLE_PARTY = ABSTRACT_TABLE_INDICATOR__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__ELEMENT_NODE = ABSTRACT_TABLE_INDICATOR__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__SET = ABSTRACT_TABLE_INDICATOR__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__RENDERED_OBJECT = ABSTRACT_TABLE_INDICATOR__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__VOCABULARY_ELEMENT = ABSTRACT_TABLE_INDICATOR__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__MEASUREMENT = ABSTRACT_TABLE_INDICATOR__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__CHANGE_REQUEST = ABSTRACT_TABLE_INDICATOR__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__DASDL_PROPERTY = ABSTRACT_TABLE_INDICATOR__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__COUNT = ABSTRACT_TABLE_INDICATOR__COUNT;

    /**
     * The feature id for the '<em><b>Null Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__NULL_COUNT = ABSTRACT_TABLE_INDICATOR__NULL_COUNT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__PARAMETERS = ABSTRACT_TABLE_INDICATOR__PARAMETERS;

    /**
     * The feature id for the '<em><b>Analyzed Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__ANALYZED_ELEMENT = ABSTRACT_TABLE_INDICATOR__ANALYZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Datamining Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__DATAMINING_TYPE = ABSTRACT_TABLE_INDICATOR__DATAMINING_TYPE;

    /**
     * The feature id for the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__INDICATOR_DEFINITION = ABSTRACT_TABLE_INDICATOR__INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Instantiated Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__INSTANTIATED_EXPRESSIONS = ABSTRACT_TABLE_INDICATOR__INSTANTIATED_EXPRESSIONS;

    /**
     * The feature id for the '<em><b>Computed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__COMPUTED = ABSTRACT_TABLE_INDICATOR__COMPUTED;

    /**
     * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__JOIN_CONDITIONS = ABSTRACT_TABLE_INDICATOR__JOIN_CONDITIONS;

    /**
     * The feature id for the '<em><b>Max Number Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__MAX_NUMBER_ROWS = ABSTRACT_TABLE_INDICATOR__MAX_NUMBER_ROWS;

    /**
     * The feature id for the '<em><b>Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__VALID_ROW = ABSTRACT_TABLE_INDICATOR__VALID_ROW;

    /**
     * The feature id for the '<em><b>In Valid Row</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__IN_VALID_ROW = ABSTRACT_TABLE_INDICATOR__IN_VALID_ROW;

    /**
     * The feature id for the '<em><b>Store Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__STORE_DATA = ABSTRACT_TABLE_INDICATOR__STORE_DATA;

    /**
     * The feature id for the '<em><b>Built In Indicator Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__BUILT_IN_INDICATOR_DEFINITION = ABSTRACT_TABLE_INDICATOR__BUILT_IN_INDICATOR_DEFINITION;

    /**
     * The feature id for the '<em><b>Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__ROW_COUNT = ABSTRACT_TABLE_INDICATOR__ROW_COUNT;

    /**
     * The feature id for the '<em><b>Table Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR__TABLE_NAME = ABSTRACT_TABLE_INDICATOR__TABLE_NAME;

    /**
     * The number of structural features of the '<em>View Indicator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_INDICATOR_FEATURE_COUNT = ABSTRACT_TABLE_INDICATOR_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.schema.SchemaIndicator <em>Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Indicator</em>'.
     * @see org.talend.dataquality.indicators.schema.SchemaIndicator
     * @generated
     */
    EClass getSchemaIndicator();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTableIndicators <em>Table Indicators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Table Indicators</em>'.
     * @see org.talend.dataquality.indicators.schema.SchemaIndicator#getTableIndicators()
     * @see #getSchemaIndicator()
     * @generated
     */
    EReference getSchemaIndicator_TableIndicators();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getViewRowCount <em>View Row Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>View Row Count</em>'.
     * @see org.talend.dataquality.indicators.schema.SchemaIndicator#getViewRowCount()
     * @see #getSchemaIndicator()
     * @generated
     */
    EAttribute getSchemaIndicator_ViewRowCount();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getViewIndicators <em>View Indicators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>View Indicators</em>'.
     * @see org.talend.dataquality.indicators.schema.SchemaIndicator#getViewIndicators()
     * @see #getSchemaIndicator()
     * @generated
     */
    EReference getSchemaIndicator_ViewIndicators();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.schema.TableIndicator <em>Table Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Table Indicator</em>'.
     * @see org.talend.dataquality.indicators.schema.TableIndicator
     * @generated
     */
    EClass getTableIndicator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.TableIndicator#getKeyCount <em>Key Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key Count</em>'.
     * @see org.talend.dataquality.indicators.schema.TableIndicator#getKeyCount()
     * @see #getTableIndicator()
     * @generated
     */
    EAttribute getTableIndicator_KeyCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.TableIndicator#getIndexCount <em>Index Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Index Count</em>'.
     * @see org.talend.dataquality.indicators.schema.TableIndicator#getIndexCount()
     * @see #getTableIndicator()
     * @generated
     */
    EAttribute getTableIndicator_IndexCount();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.schema.ConnectionIndicator <em>Connection Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Indicator</em>'.
     * @see org.talend.dataquality.indicators.schema.ConnectionIndicator
     * @generated
     */
    EClass getConnectionIndicator();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.schema.ConnectionIndicator#getCatalogIndicators <em>Catalog Indicators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Catalog Indicators</em>'.
     * @see org.talend.dataquality.indicators.schema.ConnectionIndicator#getCatalogIndicators()
     * @see #getConnectionIndicator()
     * @generated
     */
    EReference getConnectionIndicator_CatalogIndicators();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.ConnectionIndicator#getCatalogCount <em>Catalog Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Catalog Count</em>'.
     * @see org.talend.dataquality.indicators.schema.ConnectionIndicator#getCatalogCount()
     * @see #getConnectionIndicator()
     * @generated
     */
    EAttribute getConnectionIndicator_CatalogCount();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.schema.CatalogIndicator <em>Catalog Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Catalog Indicator</em>'.
     * @see org.talend.dataquality.indicators.schema.CatalogIndicator
     * @generated
     */
    EClass getCatalogIndicator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.CatalogIndicator#getSchemaCount <em>Schema Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schema Count</em>'.
     * @see org.talend.dataquality.indicators.schema.CatalogIndicator#getSchemaCount()
     * @see #getCatalogIndicator()
     * @generated
     */
    EAttribute getCatalogIndicator_SchemaCount();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.schema.CatalogIndicator#getSchemaIndicators <em>Schema Indicators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Schema Indicators</em>'.
     * @see org.talend.dataquality.indicators.schema.CatalogIndicator#getSchemaIndicators()
     * @see #getCatalogIndicator()
     * @generated
     */
    EReference getCatalogIndicator_SchemaIndicators();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.schema.ViewIndicator <em>View Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>View Indicator</em>'.
     * @see org.talend.dataquality.indicators.schema.ViewIndicator
     * @generated
     */
    EClass getViewIndicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.schema.AbstractTableIndicator <em>Abstract Table Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Table Indicator</em>'.
     * @see org.talend.dataquality.indicators.schema.AbstractTableIndicator
     * @generated
     */
    EClass getAbstractTableIndicator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.AbstractTableIndicator#getRowCount <em>Row Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Row Count</em>'.
     * @see org.talend.dataquality.indicators.schema.AbstractTableIndicator#getRowCount()
     * @see #getAbstractTableIndicator()
     * @generated
     */
    EAttribute getAbstractTableIndicator_RowCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.AbstractTableIndicator#getTableName <em>Table Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Table Name</em>'.
     * @see org.talend.dataquality.indicators.schema.AbstractTableIndicator#getTableName()
     * @see #getAbstractTableIndicator()
     * @generated
     */
    EAttribute getAbstractTableIndicator_TableName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTableCount <em>Table Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Table Count</em>'.
     * @see org.talend.dataquality.indicators.schema.SchemaIndicator#getTableCount()
     * @see #getSchemaIndicator()
     * @generated
     */
    EAttribute getSchemaIndicator_TableCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getKeyCount <em>Key Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key Count</em>'.
     * @see org.talend.dataquality.indicators.schema.SchemaIndicator#getKeyCount()
     * @see #getSchemaIndicator()
     * @generated
     */
    EAttribute getSchemaIndicator_KeyCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getIndexCount <em>Index Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Index Count</em>'.
     * @see org.talend.dataquality.indicators.schema.SchemaIndicator#getIndexCount()
     * @see #getSchemaIndicator()
     * @generated
     */
    EAttribute getSchemaIndicator_IndexCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getViewCount <em>View Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>View Count</em>'.
     * @see org.talend.dataquality.indicators.schema.SchemaIndicator#getViewCount()
     * @see #getSchemaIndicator()
     * @generated
     */
    EAttribute getSchemaIndicator_ViewCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTriggerCount <em>Trigger Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Trigger Count</em>'.
     * @see org.talend.dataquality.indicators.schema.SchemaIndicator#getTriggerCount()
     * @see #getSchemaIndicator()
     * @generated
     */
    EAttribute getSchemaIndicator_TriggerCount();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTableRowCount <em>Table Row Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Table Row Count</em>'.
     * @see org.talend.dataquality.indicators.schema.SchemaIndicator#getTableRowCount()
     * @see #getSchemaIndicator()
     * @generated
     */
    EAttribute getSchemaIndicator_TableRowCount();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SchemaFactory getSchemaFactory();

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
         * The meta object literal for the '{@link org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl <em>Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl
         * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getSchemaIndicator()
         * @generated
         */
        EClass SCHEMA_INDICATOR = eINSTANCE.getSchemaIndicator();

        /**
         * The meta object literal for the '<em><b>Table Indicators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_INDICATOR__TABLE_INDICATORS = eINSTANCE.getSchemaIndicator_TableIndicators();

        /**
         * The meta object literal for the '<em><b>View Row Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_INDICATOR__VIEW_ROW_COUNT = eINSTANCE.getSchemaIndicator_ViewRowCount();

        /**
         * The meta object literal for the '<em><b>View Indicators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_INDICATOR__VIEW_INDICATORS = eINSTANCE.getSchemaIndicator_ViewIndicators();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.schema.impl.TableIndicatorImpl <em>Table Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.schema.impl.TableIndicatorImpl
         * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getTableIndicator()
         * @generated
         */
        EClass TABLE_INDICATOR = eINSTANCE.getTableIndicator();

        /**
         * The meta object literal for the '<em><b>Key Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TABLE_INDICATOR__KEY_COUNT = eINSTANCE.getTableIndicator_KeyCount();

        /**
         * The meta object literal for the '<em><b>Index Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TABLE_INDICATOR__INDEX_COUNT = eINSTANCE.getTableIndicator_IndexCount();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.schema.impl.ConnectionIndicatorImpl <em>Connection Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.schema.impl.ConnectionIndicatorImpl
         * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getConnectionIndicator()
         * @generated
         */
        EClass CONNECTION_INDICATOR = eINSTANCE.getConnectionIndicator();

        /**
         * The meta object literal for the '<em><b>Catalog Indicators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTION_INDICATOR__CATALOG_INDICATORS = eINSTANCE.getConnectionIndicator_CatalogIndicators();

        /**
         * The meta object literal for the '<em><b>Catalog Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_INDICATOR__CATALOG_COUNT = eINSTANCE.getConnectionIndicator_CatalogCount();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.schema.impl.CatalogIndicatorImpl <em>Catalog Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.schema.impl.CatalogIndicatorImpl
         * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getCatalogIndicator()
         * @generated
         */
        EClass CATALOG_INDICATOR = eINSTANCE.getCatalogIndicator();

        /**
         * The meta object literal for the '<em><b>Schema Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CATALOG_INDICATOR__SCHEMA_COUNT = eINSTANCE.getCatalogIndicator_SchemaCount();

        /**
         * The meta object literal for the '<em><b>Schema Indicators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CATALOG_INDICATOR__SCHEMA_INDICATORS = eINSTANCE.getCatalogIndicator_SchemaIndicators();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.schema.impl.ViewIndicatorImpl <em>View Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.schema.impl.ViewIndicatorImpl
         * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getViewIndicator()
         * @generated
         */
        EClass VIEW_INDICATOR = eINSTANCE.getViewIndicator();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.schema.impl.AbstractTableIndicatorImpl <em>Abstract Table Indicator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.schema.impl.AbstractTableIndicatorImpl
         * @see org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl#getAbstractTableIndicator()
         * @generated
         */
        EClass ABSTRACT_TABLE_INDICATOR = eINSTANCE.getAbstractTableIndicator();

        /**
         * The meta object literal for the '<em><b>Row Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_TABLE_INDICATOR__ROW_COUNT = eINSTANCE.getAbstractTableIndicator_RowCount();

        /**
         * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_TABLE_INDICATOR__TABLE_NAME = eINSTANCE.getAbstractTableIndicator_TableName();

        /**
         * The meta object literal for the '<em><b>Table Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_INDICATOR__TABLE_COUNT = eINSTANCE.getSchemaIndicator_TableCount();

        /**
         * The meta object literal for the '<em><b>Key Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_INDICATOR__KEY_COUNT = eINSTANCE.getSchemaIndicator_KeyCount();

        /**
         * The meta object literal for the '<em><b>Index Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_INDICATOR__INDEX_COUNT = eINSTANCE.getSchemaIndicator_IndexCount();

        /**
         * The meta object literal for the '<em><b>View Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_INDICATOR__VIEW_COUNT = eINSTANCE.getSchemaIndicator_ViewCount();

        /**
         * The meta object literal for the '<em><b>Trigger Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_INDICATOR__TRIGGER_COUNT = eINSTANCE.getSchemaIndicator_TriggerCount();

        /**
         * The meta object literal for the '<em><b>Table Row Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_INDICATOR__TABLE_ROW_COUNT = eINSTANCE.getSchemaIndicator_TableRowCount();

    }

} //SchemaPackage
