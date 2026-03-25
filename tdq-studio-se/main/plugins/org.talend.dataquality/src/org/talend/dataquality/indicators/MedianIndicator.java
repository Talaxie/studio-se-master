/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators;

import java.util.Date;
import java.util.TreeMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Median Indicator</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO model the frequency table
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.MedianIndicator#getMedian <em>Median</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.MedianIndicator#getFrequenceTable <em>Frequence Table</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.MedianIndicator#getDateMedian <em>Date Median</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getMedianIndicator()
 * @model
 * @generated
 */
public interface MedianIndicator extends Indicator {

    /**
     * Returns the value of the '<em><b>Median</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The median value
     * <!-- end-model-doc -->
     * @return the value of the '<em>Median</em>' attribute.
     * @see #isSetMedian()
     * @see #unsetMedian()
     * @see #setMedian(Double)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getMedianIndicator_Median()
     * @model unsettable="true"
     * @generated
     */
    Double getMedian();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.MedianIndicator#getMedian <em>Median</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Median</em>' attribute.
     * @see #isSetMedian()
     * @see #unsetMedian()
     * @see #getMedian()
     * @generated
     */
    void setMedian(Double value);

    /**
     * Unsets the value of the '{@link org.talend.dataquality.indicators.MedianIndicator#getMedian <em>Median</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMedian()
     * @see #getMedian()
     * @see #setMedian(Double)
     * @generated
     */
    void unsetMedian();

    /**
     * Returns whether the value of the '{@link org.talend.dataquality.indicators.MedianIndicator#getMedian <em>Median</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Median</em>' attribute is set.
     * @see #unsetMedian()
     * @see #getMedian()
     * @see #setMedian(Double)
     * @generated
     */
    boolean isSetMedian();

    /**
     * Returns the value of the '<em><b>Frequence Table</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Frequence Table</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Frequence Table</em>' attribute.
     * @see #setFrequenceTable(TreeMap)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getMedianIndicator_FrequenceTable()
     * @model dataType="org.talend.dataquality.indicators.JavaTreeMap"
     * @generated
     */
    TreeMap<Object, Long> getFrequenceTable();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.MedianIndicator#getFrequenceTable <em>Frequence Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Frequence Table</em>' attribute.
     * @see #getFrequenceTable()
     * @generated
     */
    void setFrequenceTable(TreeMap<Object, Long> value);

    /**
     * Returns the value of the '<em><b>Date Median</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * When computing median on date columns, this method returns the median as a date. The method this.getMedian() returns the date as a numeric value instead.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Date Median</em>' attribute.
     * @see #setDateMedian(Date)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getMedianIndicator_DateMedian()
     * @model
     * @generated
     */
    Date getDateMedian();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.MedianIndicator#getDateMedian <em>Date Median</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date Median</em>' attribute.
     * @see #getDateMedian()
     * @generated
     */
    void setDateMedian(Date value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * computes the median and update attribute "median".
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean computeMedian();

} // MedianIndicator
