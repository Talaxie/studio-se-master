/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Average Length Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.AverageLengthIndicator#getSumLength <em>Sum Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getAverageLengthIndicator()
 * @model
 * @generated
 */
public interface AverageLengthIndicator extends LengthIndicator {
    /**
     * Returns the value of the '<em><b>Sum Length</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sum Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sum Length</em>' attribute.
     * @see #setSumLength(Double)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getAverageLengthIndicator_SumLength()
     * @model default="0"
     * @generated
     */
    Double getSumLength();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.AverageLengthIndicator#getSumLength <em>Sum Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sum Length</em>' attribute.
     * @see #getSumLength()
     * @generated
     */
    void setSumLength(Double value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    double getAverageLength();

} // AverageLengthIndicator
