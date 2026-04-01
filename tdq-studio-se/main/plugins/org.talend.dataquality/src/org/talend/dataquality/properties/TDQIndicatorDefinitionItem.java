/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties;

import org.talend.core.model.properties.TDQItem;
import org.talend.dataquality.indicators.definition.IndicatorDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDQ Indicator Definition Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.TDQIndicatorDefinitionItem#getIndicatorDefinition <em>Indicator Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.properties.PropertiesPackage#getTDQIndicatorDefinitionItem()
 * @model
 * @generated
 */
public interface TDQIndicatorDefinitionItem extends TDQItem {
    /**
     * Returns the value of the '<em><b>Indicator Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indicator Definition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indicator Definition</em>' reference.
     * @see #setIndicatorDefinition(IndicatorDefinition)
     * @see org.talend.dataquality.properties.PropertiesPackage#getTDQIndicatorDefinitionItem_IndicatorDefinition()
     * @model
     * @generated
     */
    IndicatorDefinition getIndicatorDefinition();

    /**
     * Sets the value of the '{@link org.talend.dataquality.properties.TDQIndicatorDefinitionItem#getIndicatorDefinition <em>Indicator Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Indicator Definition</em>' reference.
     * @see #getIndicatorDefinition()
     * @generated
     */
    void setIndicatorDefinition(IndicatorDefinition value);

} // TDQIndicatorDefinitionItem
