/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.schema;

import org.talend.dataquality.indicators.Indicator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Table Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.schema.AbstractTableIndicator#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.AbstractTableIndicator#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.schema.SchemaPackage#getAbstractTableIndicator()
 * @model
 * @generated
 */
public interface AbstractTableIndicator extends Indicator {
    /**
     * Returns the value of the '<em><b>Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Number of rows of the analyzed element (Table, View...)
     * <!-- end-model-doc -->
     * @return the value of the '<em>Row Count</em>' attribute.
     * @see #setRowCount(long)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getAbstractTableIndicator_RowCount()
     * @model
     * @generated
     */
    long getRowCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.AbstractTableIndicator#getRowCount <em>Row Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Row Count</em>' attribute.
     * @see #getRowCount()
     * @generated
     */
    void setRowCount(long value);

    /**
     * Returns the value of the '<em><b>Table Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table Name</em>' attribute.
     * @see #setTableName(String)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getAbstractTableIndicator_TableName()
     * @model
     * @generated
     */
    String getTableName();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.AbstractTableIndicator#getTableName <em>Table Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table Name</em>' attribute.
     * @see #getTableName()
     * @generated
     */
    void setTableName(String value);

} // AbstractTableIndicator
