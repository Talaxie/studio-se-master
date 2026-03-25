/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.sql;

import java.util.HashMap;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.talend.dataquality.indicators.Indicator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Def Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicator defined by the user. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getUserCount <em>User Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getMatchingValueCount <em>Matching Value Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getNotMatchingValueCount <em>Not Matching Value Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getUniqueValues <em>Unique Values</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getDistinctValueCount <em>Distinct Value Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getUniqueValueCount <em>Unique Value Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getDuplicateValueCount <em>Duplicate Value Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getValueToFreq <em>Value To Freq</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getValue <em>Value</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator()
 * @model
 * @generated
 */
public interface UserDefIndicator extends Indicator {

    /**
     * Returns the value of the '<em><b>User Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The count value associated to this user defined indicator
     * <!-- end-model-doc -->
     * @return the value of the '<em>User Count</em>' attribute.
     * @see #setUserCount(Long)
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator_UserCount()
     * @model
     * @generated
     */
    Long getUserCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getUserCount <em>User Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Count</em>' attribute.
     * @see #getUserCount()
     * @generated
     */
    void setUserCount(Long value);

    /**
     * Returns the value of the '<em><b>Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Matching Value Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matching Value Count</em>' attribute.
     * @see #setMatchingValueCount(Long)
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator_MatchingValueCount()
     * @model
     * @generated
     */
    Long getMatchingValueCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getMatchingValueCount <em>Matching Value Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Matching Value Count</em>' attribute.
     * @see #getMatchingValueCount()
     * @generated
     */
    void setMatchingValueCount(Long value);

    /**
     * Returns the value of the '<em><b>Not Matching Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Not Matching Value Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Not Matching Value Count</em>' attribute.
     * @see #setNotMatchingValueCount(Long)
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator_NotMatchingValueCount()
     * @model
     * @generated
     */
    Long getNotMatchingValueCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getNotMatchingValueCount <em>Not Matching Value Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Not Matching Value Count</em>' attribute.
     * @see #getNotMatchingValueCount()
     * @generated
     */
    void setNotMatchingValueCount(Long value);

    /**
     * Returns the value of the '<em><b>Unique Values</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Object}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique Values</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unique Values</em>' attribute list.
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator_UniqueValues()
     * @model
     * @generated
     */
    EList<Object> getUniqueValues();

    /**
     * Returns the value of the '<em><b>Distinct Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Distinct Value Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distinct Value Count</em>' attribute.
     * @see #setDistinctValueCount(Long)
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator_DistinctValueCount()
     * @model
     * @generated
     */
    Long getDistinctValueCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getDistinctValueCount <em>Distinct Value Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distinct Value Count</em>' attribute.
     * @see #getDistinctValueCount()
     * @generated
     */
    void setDistinctValueCount(Long value);

    /**
     * Returns the value of the '<em><b>Unique Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique Value Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unique Value Count</em>' attribute.
     * @see #setUniqueValueCount(Long)
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator_UniqueValueCount()
     * @model
     * @generated
     */
    Long getUniqueValueCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getUniqueValueCount <em>Unique Value Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unique Value Count</em>' attribute.
     * @see #getUniqueValueCount()
     * @generated
     */
    void setUniqueValueCount(Long value);

    /**
     * Returns the value of the '<em><b>Duplicate Value Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duplicate Value Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duplicate Value Count</em>' attribute.
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator_DuplicateValueCount()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    Long getDuplicateValueCount();

    /**
     * Returns the value of the '<em><b>Value To Freq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value To Freq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value To Freq</em>' attribute.
     * @see #setValueToFreq(HashMap)
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator_ValueToFreq()
     * @model dataType="org.talend.dataquality.indicators.JavaHashMap"
     * @generated
     */
    HashMap<Object, Long> getValueToFreq();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getValueToFreq <em>Value To Freq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value To Freq</em>' attribute.
     * @see #getValueToFreq()
     * @generated
     */
    void setValueToFreq(HashMap<Object, Long> value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

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
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getUserDefIndicator_Datatype()
     * @model
     * @generated
     */
    int getDatatype();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.sql.UserDefIndicator#getDatatype <em>Datatype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Datatype</em>' attribute.
     * @see #getDatatype()
     * @generated
     */
    void setDatatype(int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * returns the frequency (between 0 and 1)
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    Double getFrequency(Object dataValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.talend.dataquality.indicators.JavaSet"
     * @generated
     */
    Set<Object> getDistinctValues();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * returns the number of apparition of the given data.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    Long getCount(Object dataValue);
} // UserDefIndicator
