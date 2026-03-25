/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition.userdefine;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.talend.dataquality.indicators.definition.DefinitionPackage;

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
 * @see org.talend.dataquality.indicators.definition.userdefine.UserdefineFactory
 * @model kind="package"
 * @generated
 */
public interface UserdefinePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "userdefine";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.indicators.definition.userdefine";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.indicators.definition.userdefine";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UserdefinePackage eINSTANCE = org.talend.dataquality.indicators.definition.userdefine.impl.UserdefinePackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.indicators.definition.userdefine.impl.UDIndicatorDefinitionImpl <em>UD Indicator Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.indicators.definition.userdefine.impl.UDIndicatorDefinitionImpl
     * @see org.talend.dataquality.indicators.definition.userdefine.impl.UserdefinePackageImpl#getUDIndicatorDefinition()
     * @generated
     */
    int UD_INDICATOR_DEFINITION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__NAME = DefinitionPackage.INDICATOR_DEFINITION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__VISIBILITY = DefinitionPackage.INDICATOR_DEFINITION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__CLIENT_DEPENDENCY = DefinitionPackage.INDICATOR_DEFINITION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__SUPPLIER_DEPENDENCY = DefinitionPackage.INDICATOR_DEFINITION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__CONSTRAINT = DefinitionPackage.INDICATOR_DEFINITION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__NAMESPACE = DefinitionPackage.INDICATOR_DEFINITION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__IMPORTER = DefinitionPackage.INDICATOR_DEFINITION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__STEREOTYPE = DefinitionPackage.INDICATOR_DEFINITION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__TAGGED_VALUE = DefinitionPackage.INDICATOR_DEFINITION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__DOCUMENT = DefinitionPackage.INDICATOR_DEFINITION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__DESCRIPTION = DefinitionPackage.INDICATOR_DEFINITION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__RESPONSIBLE_PARTY = DefinitionPackage.INDICATOR_DEFINITION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__ELEMENT_NODE = DefinitionPackage.INDICATOR_DEFINITION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__SET = DefinitionPackage.INDICATOR_DEFINITION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__RENDERED_OBJECT = DefinitionPackage.INDICATOR_DEFINITION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__VOCABULARY_ELEMENT = DefinitionPackage.INDICATOR_DEFINITION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__MEASUREMENT = DefinitionPackage.INDICATOR_DEFINITION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__CHANGE_REQUEST = DefinitionPackage.INDICATOR_DEFINITION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__DASDL_PROPERTY = DefinitionPackage.INDICATOR_DEFINITION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Categories</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__CATEGORIES = DefinitionPackage.INDICATOR_DEFINITION__CATEGORIES;

    /**
     * The feature id for the '<em><b>Aggregated Definitions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__AGGREGATED_DEFINITIONS = DefinitionPackage.INDICATOR_DEFINITION__AGGREGATED_DEFINITIONS;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__LABEL = DefinitionPackage.INDICATOR_DEFINITION__LABEL;

    /**
     * The feature id for the '<em><b>Sub Categories</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__SUB_CATEGORIES = DefinitionPackage.INDICATOR_DEFINITION__SUB_CATEGORIES;

    /**
     * The feature id for the '<em><b>Sql Generic Expression</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__SQL_GENERIC_EXPRESSION = DefinitionPackage.INDICATOR_DEFINITION__SQL_GENERIC_EXPRESSION;

    /**
     * The feature id for the '<em><b>Aggregate1arg Functions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__AGGREGATE1ARG_FUNCTIONS = DefinitionPackage.INDICATOR_DEFINITION__AGGREGATE1ARG_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Date1arg Functions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__DATE1ARG_FUNCTIONS = DefinitionPackage.INDICATOR_DEFINITION__DATE1ARG_FUNCTIONS;

    /**
     * The feature id for the '<em><b>Characters Mapping</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__CHARACTERS_MAPPING = DefinitionPackage.INDICATOR_DEFINITION__CHARACTERS_MAPPING;

    /**
     * The feature id for the '<em><b>Indicator Definition Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__INDICATOR_DEFINITION_PARAMETER = DefinitionPackage.INDICATOR_DEFINITION__INDICATOR_DEFINITION_PARAMETER;

    /**
     * The feature id for the '<em><b>View Invalid Rows Expression</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__VIEW_INVALID_ROWS_EXPRESSION = DefinitionPackage.INDICATOR_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>View Valid Rows Expression</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__VIEW_VALID_ROWS_EXPRESSION = DefinitionPackage.INDICATOR_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>View Invalid Values Expression</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__VIEW_INVALID_VALUES_EXPRESSION = DefinitionPackage.INDICATOR_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>View Valid Values Expression</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__VIEW_VALID_VALUES_EXPRESSION = DefinitionPackage.INDICATOR_DEFINITION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>View Rows Expression</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION__VIEW_ROWS_EXPRESSION = DefinitionPackage.INDICATOR_DEFINITION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>UD Indicator Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UD_INDICATOR_DEFINITION_FEATURE_COUNT = DefinitionPackage.INDICATOR_DEFINITION_FEATURE_COUNT + 5;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition <em>UD Indicator Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>UD Indicator Definition</em>'.
     * @see org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition
     * @generated
     */
    EClass getUDIndicatorDefinition();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewInvalidRowsExpression <em>View Invalid Rows Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>View Invalid Rows Expression</em>'.
     * @see org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewInvalidRowsExpression()
     * @see #getUDIndicatorDefinition()
     * @generated
     */
    EReference getUDIndicatorDefinition_ViewInvalidRowsExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewValidRowsExpression <em>View Valid Rows Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>View Valid Rows Expression</em>'.
     * @see org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewValidRowsExpression()
     * @see #getUDIndicatorDefinition()
     * @generated
     */
    EReference getUDIndicatorDefinition_ViewValidRowsExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewInvalidValuesExpression <em>View Invalid Values Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>View Invalid Values Expression</em>'.
     * @see org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewInvalidValuesExpression()
     * @see #getUDIndicatorDefinition()
     * @generated
     */
    EReference getUDIndicatorDefinition_ViewInvalidValuesExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewValidValuesExpression <em>View Valid Values Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>View Valid Values Expression</em>'.
     * @see org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewValidValuesExpression()
     * @see #getUDIndicatorDefinition()
     * @generated
     */
    EReference getUDIndicatorDefinition_ViewValidValuesExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewRowsExpression <em>View Rows Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>View Rows Expression</em>'.
     * @see org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewRowsExpression()
     * @see #getUDIndicatorDefinition()
     * @generated
     */
    EReference getUDIndicatorDefinition_ViewRowsExpression();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    UserdefineFactory getUserdefineFactory();

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
         * The meta object literal for the '{@link org.talend.dataquality.indicators.definition.userdefine.impl.UDIndicatorDefinitionImpl <em>UD Indicator Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.indicators.definition.userdefine.impl.UDIndicatorDefinitionImpl
         * @see org.talend.dataquality.indicators.definition.userdefine.impl.UserdefinePackageImpl#getUDIndicatorDefinition()
         * @generated
         */
        EClass UD_INDICATOR_DEFINITION = eINSTANCE.getUDIndicatorDefinition();

        /**
         * The meta object literal for the '<em><b>View Invalid Rows Expression</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UD_INDICATOR_DEFINITION__VIEW_INVALID_ROWS_EXPRESSION = eINSTANCE.getUDIndicatorDefinition_ViewInvalidRowsExpression();

        /**
         * The meta object literal for the '<em><b>View Valid Rows Expression</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UD_INDICATOR_DEFINITION__VIEW_VALID_ROWS_EXPRESSION = eINSTANCE.getUDIndicatorDefinition_ViewValidRowsExpression();

        /**
         * The meta object literal for the '<em><b>View Invalid Values Expression</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UD_INDICATOR_DEFINITION__VIEW_INVALID_VALUES_EXPRESSION = eINSTANCE.getUDIndicatorDefinition_ViewInvalidValuesExpression();

        /**
         * The meta object literal for the '<em><b>View Valid Values Expression</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UD_INDICATOR_DEFINITION__VIEW_VALID_VALUES_EXPRESSION = eINSTANCE.getUDIndicatorDefinition_ViewValidValuesExpression();

        /**
         * The meta object literal for the '<em><b>View Rows Expression</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UD_INDICATOR_DEFINITION__VIEW_ROWS_EXPRESSION = eINSTANCE.getUDIndicatorDefinition_ViewRowsExpression();

    }

} //UserdefinePackage
