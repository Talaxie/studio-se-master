/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.BoxIndicator#getIQR <em>IQR</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.BoxIndicator#getRangeIndicator <em>Range Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.BoxIndicator#getMeanIndicator <em>Mean Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.BoxIndicator#getMedianIndicator <em>Median Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getBoxIndicator()
 * @model
 * @generated
 */
public interface BoxIndicator extends CompositeIndicator {
    /**
     * Returns the value of the '<em><b>IQR</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IQR</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IQR</em>' containment reference.
     * @see #setIQR(IQRIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getBoxIndicator_IQR()
     * @model containment="true"
     * @generated
     */
    IQRIndicator getIQR();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.BoxIndicator#getIQR <em>IQR</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IQR</em>' containment reference.
     * @see #getIQR()
     * @generated
     */
    void setIQR(IQRIndicator value);

    /**
     * Returns the value of the '<em><b>Range Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Range Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Range Indicator</em>' containment reference.
     * @see #setRangeIndicator(RangeIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getBoxIndicator_RangeIndicator()
     * @model containment="true"
     * @generated
     */
    RangeIndicator getRangeIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.BoxIndicator#getRangeIndicator <em>Range Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Range Indicator</em>' containment reference.
     * @see #getRangeIndicator()
     * @generated
     */
    void setRangeIndicator(RangeIndicator value);

    /**
     * Returns the value of the '<em><b>Mean Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mean Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mean Indicator</em>' containment reference.
     * @see #setMeanIndicator(MeanIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getBoxIndicator_MeanIndicator()
     * @model containment="true"
     * @generated
     */
    MeanIndicator getMeanIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.BoxIndicator#getMeanIndicator <em>Mean Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mean Indicator</em>' containment reference.
     * @see #getMeanIndicator()
     * @generated
     */
    void setMeanIndicator(MeanIndicator value);

    /**
     * Returns the value of the '<em><b>Median Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Median Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Median Indicator</em>' containment reference.
     * @see #setMedianIndicator(MedianIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getBoxIndicator_MedianIndicator()
     * @model containment="true"
     * @generated
     */
    MedianIndicator getMedianIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.BoxIndicator#getMedianIndicator <em>Median Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Median Indicator</em>' containment reference.
     * @see #getMedianIndicator()
     * @generated
     */
    void setMedianIndicator(MedianIndicator value);

} // BoxIndicator
