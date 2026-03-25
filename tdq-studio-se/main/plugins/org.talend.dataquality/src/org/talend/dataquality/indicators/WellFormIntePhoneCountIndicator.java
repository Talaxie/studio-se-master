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
 * A representation of the model object '<em><b>Well Form Inte Phone Count Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.WellFormIntePhoneCountIndicator#getWellFormIntePhoneCount <em>Well Form Inte Phone Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getWellFormIntePhoneCountIndicator()
 * @model
 * @generated
 */
public interface WellFormIntePhoneCountIndicator extends Indicator {

    /**
     * Returns the value of the '<em><b>Well Form Inte Phone Count</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Well Form Inte Phone Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Well Form Inte Phone Count</em>' attribute.
     * @see #setWellFormIntePhoneCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getWellFormIntePhoneCountIndicator_WellFormIntePhoneCount()
     * @model default="0"
     * @generated
     */
    Long getWellFormIntePhoneCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.WellFormIntePhoneCountIndicator#getWellFormIntePhoneCount <em>Well Form Inte Phone Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Well Form Inte Phone Count</em>' attribute.
     * @see #getWellFormIntePhoneCount()
     * @generated
     */
    void setWellFormIntePhoneCount(Long value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.talend.dataquality.indicators.JavaSet"
     * @generated
     */
    Set<Object> getWellFormIntePhoneValues();
} // WellFormIntePhoneCountIndicator
