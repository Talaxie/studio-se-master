/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format Freq Pie Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.FormatFreqPieIndicator#getWellFormE164Count <em>Well Form E164 Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.FormatFreqPieIndicator#getWellFormInteCount <em>Well Form Inte Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.FormatFreqPieIndicator#getWellFormNatiCount <em>Well Form Nati Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.FormatFreqPieIndicator#getInvalidFormCount <em>Invalid Form Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.FormatFreqPieIndicator#getCurrentKey <em>Current Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getFormatFreqPieIndicator()
 * @model
 * @generated
 */
public interface FormatFreqPieIndicator extends FrequencyIndicator {
    /**
     * Returns the value of the '<em><b>Well Form E164 Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Well Form E164 Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Well Form E164 Count</em>' attribute.
     * @see #setWellFormE164Count(long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getFormatFreqPieIndicator_WellFormE164Count()
     * @model
     * @generated
     */
    long getWellFormE164Count();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.FormatFreqPieIndicator#getWellFormE164Count <em>Well Form E164 Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Well Form E164 Count</em>' attribute.
     * @see #getWellFormE164Count()
     * @generated
     */
    void setWellFormE164Count(long value);

    /**
     * Returns the value of the '<em><b>Well Form Inte Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Well Form Inte Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Well Form Inte Count</em>' attribute.
     * @see #setWellFormInteCount(long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getFormatFreqPieIndicator_WellFormInteCount()
     * @model
     * @generated
     */
    long getWellFormInteCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.FormatFreqPieIndicator#getWellFormInteCount <em>Well Form Inte Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Well Form Inte Count</em>' attribute.
     * @see #getWellFormInteCount()
     * @generated
     */
    void setWellFormInteCount(long value);

    /**
     * Returns the value of the '<em><b>Well Form Nati Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Well Form Nati Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Well Form Nati Count</em>' attribute.
     * @see #setWellFormNatiCount(long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getFormatFreqPieIndicator_WellFormNatiCount()
     * @model
     * @generated
     */
    long getWellFormNatiCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.FormatFreqPieIndicator#getWellFormNatiCount <em>Well Form Nati Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Well Form Nati Count</em>' attribute.
     * @see #getWellFormNatiCount()
     * @generated
     */
    void setWellFormNatiCount(long value);

    /**
     * Returns the value of the '<em><b>Invalid Form Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Invalid Form Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Invalid Form Count</em>' attribute.
     * @see #setInvalidFormCount(long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getFormatFreqPieIndicator_InvalidFormCount()
     * @model
     * @generated
     */
    long getInvalidFormCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.FormatFreqPieIndicator#getInvalidFormCount <em>Invalid Form Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Invalid Form Count</em>' attribute.
     * @see #getInvalidFormCount()
     * @generated
     */
    void setInvalidFormCount(long value);

    /**
     * Returns the value of the '<em><b>Current Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Key</em>' attribute.
     * @see #setCurrentKey(String)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getFormatFreqPieIndicator_CurrentKey()
     * @model
     * @generated
     */
    String getCurrentKey();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.FormatFreqPieIndicator#getCurrentKey <em>Current Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Key</em>' attribute.
     * @see #getCurrentKey()
     * @generated
     */
    void setCurrentKey(String value);

} // FormatFreqPieIndicator
