/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicator Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorCategory#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorCategory()
 * @model
 * @generated
 */
public interface IndicatorCategory extends ModelElement {
    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorCategory_Label()
     * @model id="true"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.definition.IndicatorCategory#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

} // IndicatorCategory
