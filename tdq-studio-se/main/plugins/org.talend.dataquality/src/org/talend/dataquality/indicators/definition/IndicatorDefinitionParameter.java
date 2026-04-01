/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition;

import orgomg.mof.model.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicator Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter#getKey <em>Key</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinitionParameter()
 * @model
 * @generated
 */
public interface IndicatorDefinitionParameter extends ModelElement {
	/**
     * Returns the value of the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Contains the name of the TaggedValue. This name determines the semantics that are applicable to the contents of the value attribute.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Key</em>' attribute.
     * @see #setKey(String)
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinitionParameter_Key()
     * @model
     * @generated
     */
	String getKey();

	/**
     * Sets the value of the '{@link org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter#getKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' attribute.
     * @see #getKey()
     * @generated
     */
	void setKey(String value);

	/**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Contains the current value of the TaggedValue.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorDefinitionParameter_Value()
     * @model
     * @generated
     */
	String getValue();

	/**
     * Sets the value of the '{@link org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
	void setValue(String value);

	/**
	 * @return a clone IndicatorDefinitionParameter
	 * @generated NOT
	 */
	public IndicatorDefinitionParameter clone();

} // IndicatorDefinitionParameter
