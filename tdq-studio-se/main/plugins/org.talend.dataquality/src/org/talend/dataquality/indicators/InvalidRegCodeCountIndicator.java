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
 * A representation of the model object '<em><b>Invalid Reg Code Count Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.InvalidRegCodeCountIndicator#getInvalidRegCount <em>Invalid Reg Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getInvalidRegCodeCountIndicator()
 * @model
 * @generated
 */
public interface InvalidRegCodeCountIndicator extends Indicator {

    /**
     * Returns the value of the '<em><b>Invalid Reg Count</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Invalid Reg Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Invalid Reg Count</em>' attribute.
     * @see #setInvalidRegCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getInvalidRegCodeCountIndicator_InvalidRegCount()
     * @model default="0"
     * @generated
     */
    Long getInvalidRegCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.InvalidRegCodeCountIndicator#getInvalidRegCount <em>Invalid Reg Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Invalid Reg Count</em>' attribute.
     * @see #getInvalidRegCount()
     * @generated
     */
    void setInvalidRegCount(Long value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.talend.dataquality.indicators.JavaSet"
     * @generated
     */
    Set<Object> getInvalidRegValues();
} // InvalidRegCodeCountIndicator
