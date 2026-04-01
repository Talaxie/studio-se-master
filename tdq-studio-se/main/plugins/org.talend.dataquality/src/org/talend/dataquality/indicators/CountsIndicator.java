/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counts Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.CountsIndicator#getBlankCountIndicator <em>Blank Count Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.CountsIndicator#getRowCountIndicator <em>Row Count Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.CountsIndicator#getNullCountIndicator <em>Null Count Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.CountsIndicator#getUniqueCountIndicator <em>Unique Count Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.CountsIndicator#getDistinctCountIndicator <em>Distinct Count Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.CountsIndicator#getDuplicateCountIndicator <em>Duplicate Count Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.CountsIndicator#getDefaultValueIndicator <em>Default Value Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getCountsIndicator()
 * @model
 * @generated
 */
public interface CountsIndicator extends CompositeIndicator {
    /**
     * Returns the value of the '<em><b>Blank Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Blank Count Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Blank Count Indicator</em>' containment reference.
     * @see #setBlankCountIndicator(BlankCountIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getCountsIndicator_BlankCountIndicator()
     * @model containment="true"
     * @generated
     */
    BlankCountIndicator getBlankCountIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.CountsIndicator#getBlankCountIndicator <em>Blank Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Blank Count Indicator</em>' containment reference.
     * @see #getBlankCountIndicator()
     * @generated
     */
    void setBlankCountIndicator(BlankCountIndicator value);

    /**
     * Returns the value of the '<em><b>Row Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Row Count Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Row Count Indicator</em>' containment reference.
     * @see #setRowCountIndicator(RowCountIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getCountsIndicator_RowCountIndicator()
     * @model containment="true"
     * @generated
     */
    RowCountIndicator getRowCountIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.CountsIndicator#getRowCountIndicator <em>Row Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Row Count Indicator</em>' containment reference.
     * @see #getRowCountIndicator()
     * @generated
     */
    void setRowCountIndicator(RowCountIndicator value);

    /**
     * Returns the value of the '<em><b>Null Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Null Count Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Null Count Indicator</em>' containment reference.
     * @see #setNullCountIndicator(NullCountIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getCountsIndicator_NullCountIndicator()
     * @model containment="true"
     * @generated
     */
    NullCountIndicator getNullCountIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.CountsIndicator#getNullCountIndicator <em>Null Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Null Count Indicator</em>' containment reference.
     * @see #getNullCountIndicator()
     * @generated
     */
    void setNullCountIndicator(NullCountIndicator value);

    /**
     * Returns the value of the '<em><b>Unique Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique Count Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unique Count Indicator</em>' containment reference.
     * @see #setUniqueCountIndicator(UniqueCountIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getCountsIndicator_UniqueCountIndicator()
     * @model containment="true"
     * @generated
     */
    UniqueCountIndicator getUniqueCountIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.CountsIndicator#getUniqueCountIndicator <em>Unique Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unique Count Indicator</em>' containment reference.
     * @see #getUniqueCountIndicator()
     * @generated
     */
    void setUniqueCountIndicator(UniqueCountIndicator value);

    /**
     * Returns the value of the '<em><b>Distinct Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Distinct Count Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distinct Count Indicator</em>' containment reference.
     * @see #setDistinctCountIndicator(DistinctCountIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getCountsIndicator_DistinctCountIndicator()
     * @model containment="true"
     * @generated
     */
    DistinctCountIndicator getDistinctCountIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.CountsIndicator#getDistinctCountIndicator <em>Distinct Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distinct Count Indicator</em>' containment reference.
     * @see #getDistinctCountIndicator()
     * @generated
     */
    void setDistinctCountIndicator(DistinctCountIndicator value);

    /**
     * Returns the value of the '<em><b>Duplicate Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duplicate Count Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duplicate Count Indicator</em>' containment reference.
     * @see #setDuplicateCountIndicator(DuplicateCountIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getCountsIndicator_DuplicateCountIndicator()
     * @model containment="true"
     * @generated
     */
    DuplicateCountIndicator getDuplicateCountIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.CountsIndicator#getDuplicateCountIndicator <em>Duplicate Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duplicate Count Indicator</em>' containment reference.
     * @see #getDuplicateCountIndicator()
     * @generated
     */
    void setDuplicateCountIndicator(DuplicateCountIndicator value);

    /**
     * Returns the value of the '<em><b>Default Value Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value Indicator</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value Indicator</em>' containment reference.
     * @see #setDefaultValueIndicator(DefValueCountIndicator)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getCountsIndicator_DefaultValueIndicator()
     * @model containment="true"
     * @generated
     */
    DefValueCountIndicator getDefaultValueIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.CountsIndicator#getDefaultValueIndicator <em>Default Value Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value Indicator</em>' containment reference.
     * @see #getDefaultValueIndicator()
     * @generated
     */
    void setDefaultValueIndicator(DefValueCountIndicator value);

} // CountsIndicator
