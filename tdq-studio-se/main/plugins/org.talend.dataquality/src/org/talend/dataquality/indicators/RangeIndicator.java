/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.RangeIndicator#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.RangeIndicator#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.RangeIndicator#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.RangeIndicator#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getRangeIndicator()
 * @model
 * @generated
 */
public interface RangeIndicator extends CompositeIndicator {
    /**
     * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower Value</em>' containment reference.
     * @see #setLowerValue(MinValueIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getRangeIndicator_LowerValue()
     * @model containment="true"
     * @generated
     */
    MinValueIndicator getLowerValue();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.RangeIndicator#getLowerValue <em>Lower Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Value</em>' containment reference.
     * @see #getLowerValue()
     * @generated
     */
    void setLowerValue(MinValueIndicator value);

    /**
     * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper Value</em>' containment reference.
     * @see #setUpperValue(MaxValueIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getRangeIndicator_UpperValue()
     * @model containment="true"
     * @generated
     */
    MaxValueIndicator getUpperValue();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.RangeIndicator#getUpperValue <em>Upper Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper Value</em>' containment reference.
     * @see #getUpperValue()
     * @generated
     */
    void setUpperValue(MaxValueIndicator value);

    /**
     * Returns the value of the '<em><b>Datatype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Datatype</em>' attribute.
     * @see #setDatatype(int)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getRangeIndicator_Datatype()
     * @model
     * @generated
     */
    int getDatatype();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.RangeIndicator#getDatatype <em>Datatype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Datatype</em>' attribute.
     * @see #getDatatype()
     * @generated
     */
    void setDatatype(int value);

    /**
     * Returns the value of the '<em><b>Range</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Range</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Range</em>' attribute.
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getRangeIndicator_Range()
     * @model default="" transient="true" changeable="false" volatile="true"
     * @generated
     */
    String getRange();

} // RangeIndicator
