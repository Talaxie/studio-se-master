/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;

import java.util.HashMap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soundex Freq Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.SoundexFreqIndicator#getValueToDistinctFreq <em>Value To Distinct Freq</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getSoundexFreqIndicator()
 * @model
 * @generated
 */
public interface SoundexFreqIndicator extends FrequencyIndicator {

    /**
     * Returns the value of the '<em><b>Value To Distinct Freq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value To Distinct Freq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value To Distinct Freq</em>' attribute.
     * @see #setValueToDistinctFreq(HashMap)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getSoundexFreqIndicator_ValueToDistinctFreq()
     * @model dataType="org.talend.dataquality.indicators.JavaHashMap"
     * @generated
     */
    HashMap<Object, Long> getValueToDistinctFreq();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.SoundexFreqIndicator#getValueToDistinctFreq <em>Value To Distinct Freq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value To Distinct Freq</em>' attribute.
     * @see #getValueToDistinctFreq()
     * @generated
     */
    void setValueToDistinctFreq(HashMap<Object, Long> value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    Long getDistinctCount(Object dataValue);
} // SoundexFreqIndicator
