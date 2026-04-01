/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.ModeIndicator#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getModeIndicator()
 * @model
 * @generated
 */
public interface ModeIndicator extends FrequencyIndicator {
    /**
     * Returns the value of the '<em><b>Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * most frequent value
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mode</em>' attribute.
     * @see #setMode(Object)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getModeIndicator_Mode()
     * @model
     * @generated
     */
    Object getMode();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.ModeIndicator#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see #getMode()
     * @generated
     */
    void setMode(Object value);

} // ModeIndicator
