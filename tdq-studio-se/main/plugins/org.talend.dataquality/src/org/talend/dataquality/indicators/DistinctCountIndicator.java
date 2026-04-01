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
 * A representation of the model object '<em><b>Distinct Count Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.DistinctCountIndicator#getDistinctValueCount <em>Distinct Value Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getDistinctCountIndicator()
 * @model
 * @generated
 */
public interface DistinctCountIndicator extends Indicator {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Returns the set of distinct values. (This set is larger than the Unique values set).
     * <!-- end-model-doc -->
     * @model kind="operation" dataType="org.talend.dataquality.indicators.JavaSet"
     * @generated
     */
    Set<Object> getDistinctValues();

    /**
     * Returns the value of the '<em><b>Distinct Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distinct Value Count</em>' attribute.
     * @see #setDistinctValueCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getDistinctCountIndicator_DistinctValueCount()
     * @model
     * @generated
     */
    Long getDistinctValueCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.DistinctCountIndicator#getDistinctValueCount <em>Distinct Value Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distinct Value Count</em>' attribute.
     * @see #getDistinctValueCount()
     * @generated
     */
    void setDistinctValueCount(Long value);
} // DistinctCountIndicator
