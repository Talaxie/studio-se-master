/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;

import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Reg Code Count Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.ValidRegCodeCountIndicator#getValidRegCount <em>Valid Reg Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getValidRegCodeCountIndicator()
 * @model
 * @generated
 */
public interface ValidRegCodeCountIndicator extends Indicator {

    /**
     * Returns the value of the '<em><b>Valid Reg Count</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valid Reg Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Valid Reg Count</em>' attribute.
     * @see #setValidRegCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getValidRegCodeCountIndicator_ValidRegCount()
     * @model default="0"
     * @generated
     */
    Long getValidRegCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.ValidRegCodeCountIndicator#getValidRegCount <em>Valid Reg Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valid Reg Count</em>' attribute.
     * @see #getValidRegCount()
     * @generated
     */
    void setValidRegCount(Long value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.talend.dataquality.indicators.JavaSet"
     * @generated
     */
    Set<Object> getValidRegValues();
} // ValidRegCodeCountIndicator
