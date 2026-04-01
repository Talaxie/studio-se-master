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
 * A representation of the model object '<em><b>Possible Phone Count Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.PossiblePhoneCountIndicator#getPossiblePhoneCount <em>Possible Phone Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getPossiblePhoneCountIndicator()
 * @model
 * @generated
 */
public interface PossiblePhoneCountIndicator extends Indicator {

    /**
     * Returns the value of the '<em><b>Possible Phone Count</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Possible Phone Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Possible Phone Count</em>' attribute.
     * @see #setPossiblePhoneCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getPossiblePhoneCountIndicator_PossiblePhoneCount()
     * @model default="0"
     * @generated
     */
    Long getPossiblePhoneCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.PossiblePhoneCountIndicator#getPossiblePhoneCount <em>Possible Phone Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Possible Phone Count</em>' attribute.
     * @see #getPossiblePhoneCount()
     * @generated
     */
    void setPossiblePhoneCount(Long value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.talend.dataquality.indicators.JavaSet"
     * @generated
     */
    Set<Object> getPossiblePhoneValues();
} // PossiblePhoneCountIndicator
