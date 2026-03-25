/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.LengthIndicator#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getLengthIndicator()
 * @model
 * @generated
 */
public interface LengthIndicator extends Indicator {
    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #setLength(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getLengthIndicator_Length()
     * @model
     * @generated
     */
    Long getLength();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.LengthIndicator#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(Long value);

} // LengthIndicator
