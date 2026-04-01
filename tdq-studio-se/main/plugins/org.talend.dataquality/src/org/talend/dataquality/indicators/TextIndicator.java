/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getAverageLengthIndicator <em>Average Length Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getMaxLengthIndicator <em>Max Length Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getMinLengthIndicator <em>Min Length Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getMinLengthWithBlankIndicator <em>Min Length With Blank Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getMinLengthWithNullIndicator <em>Min Length With Null Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getMinLengthWithBlankNullIndicator <em>Min Length With Blank Null Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getMaxLengthWithBlankIndicator <em>Max Length With Blank Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getMaxLengthWithNullIndicator <em>Max Length With Null Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getMaxLengthWithBlankNullIndicator <em>Max Length With Blank Null Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getAvgLengthWithBlankIndicator <em>Avg Length With Blank Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getAvgLengthWithNullIndicator <em>Avg Length With Null Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.TextIndicator#getAvgLengthWithBlankNullIndicator <em>Avg Length With Blank Null Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator()
 * @model
 * @generated
 */
public interface TextIndicator extends CompositeIndicator {

    /**
     * Returns the value of the '<em><b>Average Length Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Average Length Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Average Length Indicator</em>' containment reference.
     * @see #setAverageLengthIndicator(AverageLengthIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_AverageLengthIndicator()
     * @model containment="true"
     * @generated
     */
    AverageLengthIndicator getAverageLengthIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getAverageLengthIndicator <em>Average Length Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Average Length Indicator</em>' containment reference.
     * @see #getAverageLengthIndicator()
     * @generated
     */
    void setAverageLengthIndicator(AverageLengthIndicator value);

    /**
     * Returns the value of the '<em><b>Max Length Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Length Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Length Indicator</em>' containment reference.
     * @see #setMaxLengthIndicator(MaxLengthIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_MaxLengthIndicator()
     * @model containment="true"
     * @generated
     */
    MaxLengthIndicator getMaxLengthIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getMaxLengthIndicator <em>Max Length Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length Indicator</em>' containment reference.
     * @see #getMaxLengthIndicator()
     * @generated
     */
    void setMaxLengthIndicator(MaxLengthIndicator value);

    /**
     * Returns the value of the '<em><b>Min Length Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Length Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Length Indicator</em>' containment reference.
     * @see #setMinLengthIndicator(MinLengthIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_MinLengthIndicator()
     * @model containment="true"
     * @generated
     */
    MinLengthIndicator getMinLengthIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getMinLengthIndicator <em>Min Length Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Length Indicator</em>' containment reference.
     * @see #getMinLengthIndicator()
     * @generated
     */
    void setMinLengthIndicator(MinLengthIndicator value);

    /**
     * Returns the value of the '<em><b>Min Length With Blank Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Length With Blank Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Length With Blank Indicator</em>' containment reference.
     * @see #setMinLengthWithBlankIndicator(MinLengthWithBlankIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_MinLengthWithBlankIndicator()
     * @model containment="true"
     * @generated
     */
    MinLengthWithBlankIndicator getMinLengthWithBlankIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getMinLengthWithBlankIndicator <em>Min Length With Blank Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Length With Blank Indicator</em>' containment reference.
     * @see #getMinLengthWithBlankIndicator()
     * @generated
     */
    void setMinLengthWithBlankIndicator(MinLengthWithBlankIndicator value);

    /**
     * Returns the value of the '<em><b>Min Length With Null Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Length With Null Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Length With Null Indicator</em>' containment reference.
     * @see #setMinLengthWithNullIndicator(MinLengthWithNullIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_MinLengthWithNullIndicator()
     * @model containment="true"
     * @generated
     */
    MinLengthWithNullIndicator getMinLengthWithNullIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getMinLengthWithNullIndicator <em>Min Length With Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Length With Null Indicator</em>' containment reference.
     * @see #getMinLengthWithNullIndicator()
     * @generated
     */
    void setMinLengthWithNullIndicator(MinLengthWithNullIndicator value);

    /**
     * Returns the value of the '<em><b>Min Length With Blank Null Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Length With Blank Null Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Length With Blank Null Indicator</em>' containment reference.
     * @see #setMinLengthWithBlankNullIndicator(MinLengthWithBlankNullIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_MinLengthWithBlankNullIndicator()
     * @model containment="true"
     * @generated
     */
    MinLengthWithBlankNullIndicator getMinLengthWithBlankNullIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getMinLengthWithBlankNullIndicator <em>Min Length With Blank Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Length With Blank Null Indicator</em>' containment reference.
     * @see #getMinLengthWithBlankNullIndicator()
     * @generated
     */
    void setMinLengthWithBlankNullIndicator(MinLengthWithBlankNullIndicator value);

    /**
     * Returns the value of the '<em><b>Max Length With Blank Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Length With Blank Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Length With Blank Indicator</em>' containment reference.
     * @see #setMaxLengthWithBlankIndicator(MaxLengthWithBlankIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_MaxLengthWithBlankIndicator()
     * @model containment="true"
     * @generated
     */
    MaxLengthWithBlankIndicator getMaxLengthWithBlankIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getMaxLengthWithBlankIndicator <em>Max Length With Blank Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length With Blank Indicator</em>' containment reference.
     * @see #getMaxLengthWithBlankIndicator()
     * @generated
     */
    void setMaxLengthWithBlankIndicator(MaxLengthWithBlankIndicator value);

    /**
     * Returns the value of the '<em><b>Max Length With Null Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Length With Null Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Length With Null Indicator</em>' containment reference.
     * @see #setMaxLengthWithNullIndicator(MaxLengthWithNullIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_MaxLengthWithNullIndicator()
     * @model containment="true"
     * @generated
     */
    MaxLengthWithNullIndicator getMaxLengthWithNullIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getMaxLengthWithNullIndicator <em>Max Length With Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length With Null Indicator</em>' containment reference.
     * @see #getMaxLengthWithNullIndicator()
     * @generated
     */
    void setMaxLengthWithNullIndicator(MaxLengthWithNullIndicator value);

    /**
     * Returns the value of the '<em><b>Max Length With Blank Null Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Length With Blank Null Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Length With Blank Null Indicator</em>' containment reference.
     * @see #setMaxLengthWithBlankNullIndicator(MaxLengthWithBlankNullIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_MaxLengthWithBlankNullIndicator()
     * @model containment="true"
     * @generated
     */
    MaxLengthWithBlankNullIndicator getMaxLengthWithBlankNullIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getMaxLengthWithBlankNullIndicator <em>Max Length With Blank Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length With Blank Null Indicator</em>' containment reference.
     * @see #getMaxLengthWithBlankNullIndicator()
     * @generated
     */
    void setMaxLengthWithBlankNullIndicator(MaxLengthWithBlankNullIndicator value);

    /**
     * Returns the value of the '<em><b>Avg Length With Blank Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Avg Length With Blank Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Avg Length With Blank Indicator</em>' containment reference.
     * @see #setAvgLengthWithBlankIndicator(AvgLengthWithBlankIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_AvgLengthWithBlankIndicator()
     * @model containment="true"
     * @generated
     */
    AvgLengthWithBlankIndicator getAvgLengthWithBlankIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getAvgLengthWithBlankIndicator <em>Avg Length With Blank Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Avg Length With Blank Indicator</em>' containment reference.
     * @see #getAvgLengthWithBlankIndicator()
     * @generated
     */
    void setAvgLengthWithBlankIndicator(AvgLengthWithBlankIndicator value);

    /**
     * Returns the value of the '<em><b>Avg Length With Null Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Avg Length With Null Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Avg Length With Null Indicator</em>' containment reference.
     * @see #setAvgLengthWithNullIndicator(AvgLengthWithNullIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_AvgLengthWithNullIndicator()
     * @model containment="true"
     * @generated
     */
    AvgLengthWithNullIndicator getAvgLengthWithNullIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getAvgLengthWithNullIndicator <em>Avg Length With Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Avg Length With Null Indicator</em>' containment reference.
     * @see #getAvgLengthWithNullIndicator()
     * @generated
     */
    void setAvgLengthWithNullIndicator(AvgLengthWithNullIndicator value);

    /**
     * Returns the value of the '<em><b>Avg Length With Blank Null Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Avg Length With Blank Null Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Avg Length With Blank Null Indicator</em>' containment reference.
     * @see #setAvgLengthWithBlankNullIndicator(AvgLengthWithBlankNullIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getTextIndicator_AvgLengthWithBlankNullIndicator()
     * @model containment="true"
     * @generated
     */
    AvgLengthWithBlankNullIndicator getAvgLengthWithBlankNullIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.TextIndicator#getAvgLengthWithBlankNullIndicator <em>Avg Length With Blank Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Avg Length With Blank Null Indicator</em>' containment reference.
     * @see #getAvgLengthWithBlankNullIndicator()
     * @generated
     */
    void setAvgLengthWithBlankNullIndicator(AvgLengthWithBlankNullIndicator value);
} // TextIndicator
