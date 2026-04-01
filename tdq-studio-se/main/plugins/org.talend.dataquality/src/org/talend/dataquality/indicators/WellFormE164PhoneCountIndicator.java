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
 * A representation of the model object '<em><b>Well Form E164 Phone Count Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.WellFormE164PhoneCountIndicator#getWellFormE164PhoneCount <em>Well Form E164 Phone Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getWellFormE164PhoneCountIndicator()
 * @model
 * @generated
 */
public interface WellFormE164PhoneCountIndicator extends Indicator {

    /**
     * Returns the value of the '<em><b>Well Form E164 Phone Count</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Well Form E164 Phone Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Well Form E164 Phone Count</em>' attribute.
     * @see #setWellFormE164PhoneCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getWellFormE164PhoneCountIndicator_WellFormE164PhoneCount()
     * @model default="0"
     * @generated
     */
    Long getWellFormE164PhoneCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.WellFormE164PhoneCountIndicator#getWellFormE164PhoneCount <em>Well Form E164 Phone Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Well Form E164 Phone Count</em>' attribute.
     * @see #getWellFormE164PhoneCount()
     * @generated
     */
    void setWellFormE164PhoneCount(Long value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.talend.dataquality.indicators.JavaSet"
     * @generated
     */
    Set<Object> getWellFormE164PhoneValues();
} // WellFormE164PhoneCountIndicator
