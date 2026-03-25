/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.mof.model.ModelPackage;

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
 * @see org.talend.dataquality.indicators.definition.DefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface DefinitionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "definition";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.indicators.definition";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.indicators.definition";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DefinitionPackage eINSTANCE = org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.definition.impl.IndicatorsDefinitionsImpl <em>Indicators Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.definition.impl.IndicatorsDefinitionsImpl
     * @see org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl#getIndicatorsDefinitions()
     * @generated
     */
    int INDICATORS_DEFINITIONS = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Indicator Definitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Categories</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS__CATEGORIES = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Indicators Definitions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATORS_DEFINITIONS_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.definition.impl.IndicatorDefinitionImpl <em>Indicator Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.definition.impl.IndicatorDefinitionImpl
     * @see org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl#getIndicatorDefinition()
     * @generated
     */
    int INDICATOR_DEFINITION = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Categories</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__CATEGORIES = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Aggregated Definitions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__AGGREGATED_DEFINITIONS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__LABEL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sub Categories</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__SUB_CATEGORIES = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Sql Generic Expression</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__SQL_GENERIC_EXPRESSION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Aggregate1arg Functions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__AGGREGATE1ARG_FUNCTIONS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Date1arg Functions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__DATE1ARG_FUNCTIONS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Characters Mapping</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION__CHARACTERS_MAPPING = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Indicator Definition Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INDICATOR_DEFINITION__INDICATOR_DEFINITION_PARAMETER = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

				/**
     * The number of structural features of the '<em>Indicator Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_DEFINITION_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.definition.impl.IndicatorCategoryImpl <em>Indicator Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.definition.impl.IndicatorCategoryImpl
     * @see org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl#getIndicatorCategory()
     * @generated
     */
    int INDICATOR_CATEGORY = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY__LABEL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Indicator Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDICATOR_CATEGORY_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;


    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.definition.impl.CharactersMappingImpl <em>Characters Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.definition.impl.CharactersMappingImpl
     * @see org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl#getCharactersMapping()
     * @generated
     */
    int CHARACTERS_MAPPING = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__LANGUAGE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Characters To Replace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__CHARACTERS_TO_REPLACE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Replacement Characters</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING__REPLACEMENT_CHARACTERS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Characters Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERS_MAPPING_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;


    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.definition.impl.IndicatorDefinitionParameterImpl <em>Indicator Definition Parameter</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.definition.impl.IndicatorDefinitionParameterImpl
     * @see org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl#getIndicatorDefinitionParameter()
     * @generated
     */
	int INDICATOR_DEFINITION_PARAMETER = 4;

				/**
     * The feature id for the '<em><b>Modeled Graph Subset</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INDICATOR_DEFINITION_PARAMETER__MODELED_GRAPH_SUBSET = ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET;

				/**
     * The feature id for the '<em><b>Modeled Projection</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INDICATOR_DEFINITION_PARAMETER__MODELED_PROJECTION = ModelPackage.MODEL_ELEMENT__MODELED_PROJECTION;

				/**
     * The feature id for the '<em><b>Modeled Semantic Context</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INDICATOR_DEFINITION_PARAMETER__MODELED_SEMANTIC_CONTEXT = ModelPackage.MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT;

				/**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INDICATOR_DEFINITION_PARAMETER__KEY = ModelPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

				/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INDICATOR_DEFINITION_PARAMETER__VALUE = ModelPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

				/**
     * The number of structural features of the '<em>Indicator Definition Parameter</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INDICATOR_DEFINITION_PARAMETER_FEATURE_COUNT = ModelPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;


				/**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.definition.IndicatorsDefinitions <em>Indicators Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Indicators Definitions</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorsDefinitions
     * @generated
     */
    EClass getIndicatorsDefinitions();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.IndicatorsDefinitions#getIndicatorDefinitions <em>Indicator Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Indicator Definitions</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorsDefinitions#getIndicatorDefinitions()
     * @see #getIndicatorsDefinitions()
     * @generated
     */
    EReference getIndicatorsDefinitions_IndicatorDefinitions();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.IndicatorsDefinitions#getCategories <em>Categories</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Categories</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorsDefinitions#getCategories()
     * @see #getIndicatorsDefinitions()
     * @generated
     */
    EReference getIndicatorsDefinitions_Categories();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition <em>Indicator Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Indicator Definition</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinition
     * @generated
     */
    EClass getIndicatorDefinition();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getCategories <em>Categories</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Categories</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinition#getCategories()
     * @see #getIndicatorDefinition()
     * @generated
     */
    EReference getIndicatorDefinition_Categories();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getAggregatedDefinitions <em>Aggregated Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Aggregated Definitions</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinition#getAggregatedDefinitions()
     * @see #getIndicatorDefinition()
     * @generated
     */
    EReference getIndicatorDefinition_AggregatedDefinitions();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinition#getLabel()
     * @see #getIndicatorDefinition()
     * @generated
     */
    EAttribute getIndicatorDefinition_Label();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getSubCategories <em>Sub Categories</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sub Categories</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinition#getSubCategories()
     * @see #getIndicatorDefinition()
     * @generated
     */
    EReference getIndicatorDefinition_SubCategories();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getSqlGenericExpression <em>Sql Generic Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sql Generic Expression</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinition#getSqlGenericExpression()
     * @see #getIndicatorDefinition()
     * @generated
     */
    EReference getIndicatorDefinition_SqlGenericExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getAggregate1argFunctions <em>Aggregate1arg Functions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Aggregate1arg Functions</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinition#getAggregate1argFunctions()
     * @see #getIndicatorDefinition()
     * @generated
     */
    EReference getIndicatorDefinition_Aggregate1argFunctions();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getDate1argFunctions <em>Date1arg Functions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Date1arg Functions</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinition#getDate1argFunctions()
     * @see #getIndicatorDefinition()
     * @generated
     */
    EReference getIndicatorDefinition_Date1argFunctions();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getCharactersMapping <em>Characters Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Characters Mapping</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinition#getCharactersMapping()
     * @see #getIndicatorDefinition()
     * @generated
     */
    EReference getIndicatorDefinition_CharactersMapping();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getIndicatorDefinitionParameter <em>Indicator Definition Parameter</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Indicator Definition Parameter</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinition#getIndicatorDefinitionParameter()
     * @see #getIndicatorDefinition()
     * @generated
     */
	EReference getIndicatorDefinition_IndicatorDefinitionParameter();

				/**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.definition.IndicatorCategory <em>Indicator Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Indicator Category</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorCategory
     * @generated
     */
    EClass getIndicatorCategory();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.definition.IndicatorCategory#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorCategory#getLabel()
     * @see #getIndicatorCategory()
     * @generated
     */
    EAttribute getIndicatorCategory_Label();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.definition.CharactersMapping <em>Characters Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Characters Mapping</em>'.
     * @see org.talend.dataquality.indicators.definition.CharactersMapping
     * @generated
     */
    EClass getCharactersMapping();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.definition.CharactersMapping#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see org.talend.dataquality.indicators.definition.CharactersMapping#getLanguage()
     * @see #getCharactersMapping()
     * @generated
     */
    EAttribute getCharactersMapping_Language();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.definition.CharactersMapping#getCharactersToReplace <em>Characters To Replace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Characters To Replace</em>'.
     * @see org.talend.dataquality.indicators.definition.CharactersMapping#getCharactersToReplace()
     * @see #getCharactersMapping()
     * @generated
     */
    EAttribute getCharactersMapping_CharactersToReplace();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.definition.CharactersMapping#getReplacementCharacters <em>Replacement Characters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Replacement Characters</em>'.
     * @see org.talend.dataquality.indicators.definition.CharactersMapping#getReplacementCharacters()
     * @see #getCharactersMapping()
     * @generated
     */
    EAttribute getCharactersMapping_ReplacementCharacters();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter <em>Indicator Definition Parameter</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Indicator Definition Parameter</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter
     * @generated
     */
	EClass getIndicatorDefinitionParameter();

				/**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter#getKey()
     * @see #getIndicatorDefinitionParameter()
     * @generated
     */
	EAttribute getIndicatorDefinitionParameter_Key();

				/**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter#getValue()
     * @see #getIndicatorDefinitionParameter()
     * @generated
     */
	EAttribute getIndicatorDefinitionParameter_Value();

				/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DefinitionFactory getDefinitionFactory();

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
         * The meta object literal for the '{@link org.talend.dataquality.indicators.definition.impl.IndicatorsDefinitionsImpl <em>Indicators Definitions</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.definition.impl.IndicatorsDefinitionsImpl
         * @see org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl#getIndicatorsDefinitions()
         * @generated
         */
        EClass INDICATORS_DEFINITIONS = eINSTANCE.getIndicatorsDefinitions();

        /**
         * The meta object literal for the '<em><b>Indicator Definitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS = eINSTANCE.getIndicatorsDefinitions_IndicatorDefinitions();

        /**
         * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDICATORS_DEFINITIONS__CATEGORIES = eINSTANCE.getIndicatorsDefinitions_Categories();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.definition.impl.IndicatorDefinitionImpl <em>Indicator Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.definition.impl.IndicatorDefinitionImpl
         * @see org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl#getIndicatorDefinition()
         * @generated
         */
        EClass INDICATOR_DEFINITION = eINSTANCE.getIndicatorDefinition();

        /**
         * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDICATOR_DEFINITION__CATEGORIES = eINSTANCE.getIndicatorDefinition_Categories();

        /**
         * The meta object literal for the '<em><b>Aggregated Definitions</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDICATOR_DEFINITION__AGGREGATED_DEFINITIONS = eINSTANCE.getIndicatorDefinition_AggregatedDefinitions();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INDICATOR_DEFINITION__LABEL = eINSTANCE.getIndicatorDefinition_Label();

        /**
         * The meta object literal for the '<em><b>Sub Categories</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDICATOR_DEFINITION__SUB_CATEGORIES = eINSTANCE.getIndicatorDefinition_SubCategories();

        /**
         * The meta object literal for the '<em><b>Sql Generic Expression</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDICATOR_DEFINITION__SQL_GENERIC_EXPRESSION = eINSTANCE.getIndicatorDefinition_SqlGenericExpression();

        /**
         * The meta object literal for the '<em><b>Aggregate1arg Functions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDICATOR_DEFINITION__AGGREGATE1ARG_FUNCTIONS = eINSTANCE.getIndicatorDefinition_Aggregate1argFunctions();

        /**
         * The meta object literal for the '<em><b>Date1arg Functions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDICATOR_DEFINITION__DATE1ARG_FUNCTIONS = eINSTANCE.getIndicatorDefinition_Date1argFunctions();

        /**
         * The meta object literal for the '<em><b>Characters Mapping</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDICATOR_DEFINITION__CHARACTERS_MAPPING = eINSTANCE.getIndicatorDefinition_CharactersMapping();

        /**
         * The meta object literal for the '<em><b>Indicator Definition Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference INDICATOR_DEFINITION__INDICATOR_DEFINITION_PARAMETER = eINSTANCE.getIndicatorDefinition_IndicatorDefinitionParameter();

								/**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.definition.impl.IndicatorCategoryImpl <em>Indicator Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.definition.impl.IndicatorCategoryImpl
         * @see org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl#getIndicatorCategory()
         * @generated
         */
        EClass INDICATOR_CATEGORY = eINSTANCE.getIndicatorCategory();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INDICATOR_CATEGORY__LABEL = eINSTANCE.getIndicatorCategory_Label();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.definition.impl.CharactersMappingImpl <em>Characters Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.definition.impl.CharactersMappingImpl
         * @see org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl#getCharactersMapping()
         * @generated
         */
        EClass CHARACTERS_MAPPING = eINSTANCE.getCharactersMapping();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHARACTERS_MAPPING__LANGUAGE = eINSTANCE.getCharactersMapping_Language();

        /**
         * The meta object literal for the '<em><b>Characters To Replace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHARACTERS_MAPPING__CHARACTERS_TO_REPLACE = eINSTANCE.getCharactersMapping_CharactersToReplace();

        /**
         * The meta object literal for the '<em><b>Replacement Characters</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHARACTERS_MAPPING__REPLACEMENT_CHARACTERS = eINSTANCE.getCharactersMapping_ReplacementCharacters();

								/**
         * The meta object literal for the '{@link org.talend.dataquality.indicators.definition.impl.IndicatorDefinitionParameterImpl <em>Indicator Definition Parameter</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.definition.impl.IndicatorDefinitionParameterImpl
         * @see org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl#getIndicatorDefinitionParameter()
         * @generated
         */
		EClass INDICATOR_DEFINITION_PARAMETER = eINSTANCE.getIndicatorDefinitionParameter();

								/**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute INDICATOR_DEFINITION_PARAMETER__KEY = eINSTANCE.getIndicatorDefinitionParameter_Key();

								/**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute INDICATOR_DEFINITION_PARAMETER__VALUE = eINSTANCE.getIndicatorDefinitionParameter_Value();

    }

} //DefinitionPackage
