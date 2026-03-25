/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.definition;

import org.eclipse.emf.common.util.EList;
import org.talend.cwm.relational.TdExpression;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Indicator Definition</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getAggregatedDefinitions <em>Aggregated Definitions</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getSqlGenericExpression <em>Sql Generic Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getAggregate1argFunctions <em>Aggregate1arg Functions</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getDate1argFunctions <em>Date1arg Functions</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getCharactersMapping <em>Characters Mapping</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getIndicatorDefinitionParameter <em>Indicator Definition Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinition()
 * @model
 * @generated
 */
public interface IndicatorDefinition extends ModelElement {

    /**
     * Returns the value of the '<em><b>Categories</b></em>' reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.definition.IndicatorCategory}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Categories</em>' reference list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Categories</em>' reference list.
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinition_Categories()
     * @model
     * @generated
     */
    EList<IndicatorCategory> getCategories();

    /**
     * Returns the value of the '<em><b>Aggregated Definitions</b></em>' reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.definition.IndicatorDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregated Definitions</em>' reference list isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregated Definitions</em>' reference list.
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinition_AggregatedDefinitions()
     * @model
     * @generated
     */
    EList<IndicatorDefinition> getAggregatedDefinitions();

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinition_Label()
     * @model id="true"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.definition.IndicatorDefinition#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> IMPORTANT: a label should not be changed, because it is used
     * in DefinitionHandler to map the indicator to its definition. <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Sub Categories</b></em>' reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.definition.IndicatorCategory}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Categories</em>' reference list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Categories</em>' reference list.
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinition_SubCategories()
     * @model
     * @generated
     */
    EList<IndicatorCategory> getSubCategories();

    /**
     * Returns the value of the '<em><b>Sql Generic Expression</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.cwm.relational.TdExpression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sql Generic Expression</em>' containment reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sql Generic Expression</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinition_SqlGenericExpression()
     * @model containment="true"
     * @generated
     */
    EList<TdExpression> getSqlGenericExpression();

    /**
     * Returns the value of the '<em><b>Aggregate1arg Functions</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.cwm.relational.TdExpression}.
     * <!-- begin-user-doc -->
     * <p>
     * Contains a list of aggregate functions (specific to each database language). There is only one expression for
     * each database language. The body of the expression can contain several functions. In that case, the functions are
     * separated by a semi-column ';'.
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregate1arg Functions</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinition_Aggregate1argFunctions()
     * @model containment="true"
     * @generated
     */
    EList<TdExpression> getAggregate1argFunctions();

    /**
     * Returns the value of the '<em><b>Date1arg Functions</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.cwm.relational.TdExpression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date1arg Functions</em>' containment reference list isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date1arg Functions</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinition_Date1argFunctions()
     * @model containment="true"
     * @generated
     */
    EList<TdExpression> getDate1argFunctions();

    /**
     * Returns the value of the '<em><b>Characters Mapping</b></em>' containment reference list. The list contents are
     * of type {@link org.talend.dataquality.indicators.definition.CharactersMapping}. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Useful for the Pattern Finder indicator definition. It gives a default
     * mapping of the characters to replace. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Characters Mapping</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinition_CharactersMapping()
     * @model containment="true"
     * @generated
     */
    EList<CharactersMapping> getCharactersMapping();

    /**
     * Returns the value of the '<em><b>Indicator Definition Parameter</b></em>' containment reference list. The list
     * contents are of type {@link org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indicator Definition Parameter</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Indicator Definition Parameter</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinition_IndicatorDefinitionParameter()
     * @model containment="true"
     * @generated
     */
    EList<IndicatorDefinitionParameter> getIndicatorDefinitionParameter();

} // IndicatorDefinition
