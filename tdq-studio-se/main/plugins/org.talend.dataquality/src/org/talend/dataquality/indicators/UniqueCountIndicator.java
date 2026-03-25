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
 * A representation of the model object '<em><b>Unique Count Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.UniqueCountIndicator#getUniqueValueCount <em>Unique Value Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getUniqueCountIndicator()
 * @model
 * @generated
 */
public interface UniqueCountIndicator extends Indicator {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.talend.dataquality.indicators.JavaSet"
     * @generated
     */
    Set<Object> getUniqueValues();

    /**
     * Returns the value of the '<em><b>Unique Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unique Value Count</em>' attribute.
     * @see #setUniqueValueCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getUniqueCountIndicator_UniqueValueCount()
     * @model
     * @generated
     */
    Long getUniqueValueCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.UniqueCountIndicator#getUniqueValueCount <em>Unique Value Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unique Value Count</em>' attribute.
     * @see #getUniqueValueCount()
     * @generated
     */
    void setUniqueValueCount(Long value);
} // UniqueCountIndicator
