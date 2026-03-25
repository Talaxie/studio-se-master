/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.MatchingIndicator#getMatchingValueCount <em>Matching Value Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.MatchingIndicator#getNotMatchingValueCount <em>Not Matching Value Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getMatchingIndicator()
 * @model abstract="true"
 * @generated
 */
public interface MatchingIndicator extends Indicator {
    /**
     * Returns the value of the '<em><b>Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Matching Value Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matching Value Count</em>' attribute.
     * @see #setMatchingValueCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getMatchingIndicator_MatchingValueCount()
     * @model
     * @generated
     */
    Long getMatchingValueCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.MatchingIndicator#getMatchingValueCount <em>Matching Value Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Matching Value Count</em>' attribute.
     * @see #getMatchingValueCount()
     * @generated
     */
    void setMatchingValueCount(Long value);

    /**
     * Returns the value of the '<em><b>Not Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Not Matching Value Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Not Matching Value Count</em>' attribute.
     * @see #setNotMatchingValueCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getMatchingIndicator_NotMatchingValueCount()
     * @model
     * @generated
     */
    Long getNotMatchingValueCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.MatchingIndicator#getNotMatchingValueCount <em>Not Matching Value Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Not Matching Value Count</em>' attribute.
     * @see #getNotMatchingValueCount()
     * @generated
     */
    void setNotMatchingValueCount(Long value);

} // MatchingIndicator
