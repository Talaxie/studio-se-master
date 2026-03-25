/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Duplicate Count Indicator</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.DuplicateCountIndicator#getDuplicateValueCount <em>Duplicate Value Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getDuplicateCountIndicator()
 * @model
 * @generated
 */
public interface DuplicateCountIndicator extends Indicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @model kind="operation" dataType="org.talend.dataquality.indicators.JavaSet"
     * @generated
     */
    Set<Object> getDuplicateValues();

    /**
     * Returns the value of the '<em><b>Duplicate Value Count</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the value of the '<em>Duplicate Value Count</em>' attribute.
     * @see #setDuplicateValueCount(Long)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getDuplicateCountIndicator_DuplicateValueCount()
     * @model
     * @generated
     */
    Long getDuplicateValueCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.DuplicateCountIndicator#getDuplicateValueCount <em>Duplicate Value Count</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Duplicate Value Count</em>' attribute.
     * @see #getDuplicateValueCount()
     * @generated
     */
    void setDuplicateValueCount(Long value);

    /**
     * store the whole row in the map to avoid lose the first duplicate one.
     * 
     * @param colValue the analyzed column's value
     * @param resultSet the result wich can fetch the whole row
     * @param columnSize the col size of one row
     * @throws SQLException
     */
    void handle(Object colValue, ResultSet resultSet, int columnSize) throws SQLException;

    /**
     * get the duplicate result, after handle the whole resultset, the result is in this map, it must be gotten and
     * handled.
     * 
     * @return
     */
    Map<Object, List<Object>> getDuplicateMap();

    /**
     * DOC yyin Comment method "handle".
     * 
     * @param object
     * @param rowValues
     */
    void handle(Object object, String[] rowValues);
} // DuplicateCountIndicator
