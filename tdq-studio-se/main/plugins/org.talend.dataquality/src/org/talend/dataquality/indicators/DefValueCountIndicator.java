/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Value Count Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An indicator that gives the number of rows of a column that have the default value set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.DefValueCountIndicator#getDefaultValCount <em>Default Val Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getDefValueCountIndicator()
 * @model
 * @generated
 */
public interface DefValueCountIndicator extends Indicator {
    /**
     * Returns the value of the '<em><b>Default Val Count</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Val Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Val Count</em>' attribute.
     * @see #setDefaultValCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getDefValueCountIndicator_DefaultValCount()
     * @model default="0"
     * @generated
     */
    Long getDefaultValCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.DefValueCountIndicator#getDefaultValCount <em>Default Val Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Val Count</em>' attribute.
     * @see #getDefaultValCount()
     * @generated
     */
    void setDefaultValCount(Long value);

} // DefValueCountIndicator
