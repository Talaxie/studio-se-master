/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.SumIndicator#getSumStr <em>Sum Str</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.SumIndicator#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getSumIndicator()
 * @model
 * @generated
 */
public interface SumIndicator extends Indicator {

    /**
     * Returns the value of the '<em><b>Sum Str</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sum Str</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sum Str</em>' attribute.
     * @see #setSumStr(String)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getSumIndicator_SumStr()
     * @model
     * @generated
     */
    String getSumStr();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.SumIndicator#getSumStr <em>Sum Str</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sum Str</em>' attribute.
     * @see #getSumStr()
     * @generated
     */
    void setSumStr(String value);

    /**
     * Returns the value of the '<em><b>Datatype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Java data type of the summed data
     * <!-- end-model-doc -->
     * @return the value of the '<em>Datatype</em>' attribute.
     * @see #setDatatype(int)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getSumIndicator_Datatype()
     * @model
     * @generated
     */
    int getDatatype();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.SumIndicator#getDatatype <em>Datatype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Datatype</em>' attribute.
     * @see #getDatatype()
     * @generated
     */
    void setDatatype(int value);
} // SumIndicator
