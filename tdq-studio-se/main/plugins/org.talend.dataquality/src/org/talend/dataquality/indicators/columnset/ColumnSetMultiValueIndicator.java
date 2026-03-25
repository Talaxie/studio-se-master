/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.columnset;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.talend.dataquality.indicators.CompositeIndicator;
import org.talend.dataquality.indicators.DistinctCountIndicator;
import org.talend.dataquality.indicators.DuplicateCountIndicator;
import org.talend.dataquality.indicators.RowCountIndicator;
import org.talend.dataquality.indicators.UniqueCountIndicator;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Column Set Multi Value Indicator</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getAnalyzedColumns <em>Analyzed Columns</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getListRows <em>List Rows</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getNumericFunctions <em>Numeric Functions</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getNominalColumns <em>Nominal Columns</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getNumericColumns <em>Numeric Columns</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getColumnHeaders <em>Column Headers</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDateFunctions <em>Date Functions</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDateColumns <em>Date Columns</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getUniqueCount <em>Unique Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDistinctCount <em>Distinct Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDuplicateCount <em>Duplicate Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getRowCountIndicator <em>Row Count Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getUniqueCountIndicator <em>Unique Count Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDistinctCountIndicator <em>Distinct Count Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDuplicateCountIndicator <em>Duplicate Count Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator()
 * @model
 * @generated
 */
public interface ColumnSetMultiValueIndicator extends CompositeIndicator {

    /**
     * Returns the value of the '<em><b>Analyzed Columns</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwm.objectmodel.core.ModelElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analyzed Columns</em>' reference list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analyzed Columns</em>' reference list.
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_AnalyzedColumns()
     * @model
     * @generated
     */
    EList<ModelElement> getAnalyzedColumns();

    /**
     * Returns the value of the '<em><b>List Rows</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * Returns the result set of the executed query. The size of the list is the number of rows returned by the query.
     * The length of the array is the number of columns of the result set. The header of each column can be obtained
     * with the {@link #getColumnHeaders()} method.
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>List Rows</em>' attribute.
     * @see #setListRows(List)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_ListRows()
     * @model dataType="org.talend.dataquality.indicators.ObjectArray"
     * @generated
     */
    List<Object[]> getListRows();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getListRows <em>List Rows</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>List Rows</em>' attribute.
     * @see #getListRows()
     * @generated
     */
    void setListRows(List<Object[]> value);

    /**
     * Returns the value of the '<em><b>Numeric Functions</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Numeric Functions</em>' attribute list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Numeric Functions</em>' attribute list.
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_NumericFunctions()
     * @model
     * @generated
     */
    EList<String> getNumericFunctions();

    /**
     * Returns the value of the '<em><b>Nominal Columns</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwm.objectmodel.core.ModelElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nominal Columns</em>' reference list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nominal Columns</em>' reference list.
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_NominalColumns()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    EList<ModelElement> getNominalColumns();

    /**
     * Returns the value of the '<em><b>Numeric Columns</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwm.objectmodel.core.ModelElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Numeric Columns</em>' reference list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Numeric Columns</em>' reference list.
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_NumericColumns()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    EList<ModelElement> getNumericColumns();

    /**
     * Returns the value of the '<em><b>Column Headers</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * Returns the headers of the result set computed by this indicator. These headers are for presentation purpose
     * only. It's not safe to use them in a real query.
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Column Headers</em>' attribute list.
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_ColumnHeaders()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    EList<String> getColumnHeaders();

    /**
     * Returns the value of the '<em><b>Date Functions</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Functions</em>' attribute list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Functions</em>' attribute list.
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_DateFunctions()
     * @model
     * @generated
     */
    EList<String> getDateFunctions();

    /**
     * Returns the value of the '<em><b>Date Columns</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwm.objectmodel.core.ModelElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Columns</em>' reference list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Columns</em>' reference list.
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_DateColumns()
     * @model
     * @generated
     */
    EList<ModelElement> getDateColumns();

    /**
     * Returns the value of the '<em><b>Unique Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique Count</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unique Count</em>' attribute.
     * @see #setUniqueCount(Long)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_UniqueCount()
     * @model
     * @generated
     */
    Long getUniqueCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getUniqueCount <em>Unique Count</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Unique Count</em>' attribute.
     * @see #getUniqueCount()
     * @generated
     */
    void setUniqueCount(Long value);

    /**
     * Returns the value of the '<em><b>Distinct Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Distinct Count</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distinct Count</em>' attribute.
     * @see #setDistinctCount(Long)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_DistinctCount()
     * @model
     * @generated
     */
    Long getDistinctCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDistinctCount <em>Distinct Count</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Distinct Count</em>' attribute.
     * @see #getDistinctCount()
     * @generated
     */
    void setDistinctCount(Long value);

    /**
     * Returns the value of the '<em><b>Duplicate Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duplicate Count</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duplicate Count</em>' attribute.
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_DuplicateCount()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    Long getDuplicateCount();

    /**
     * Returns the value of the '<em><b>Row Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Row Count Indicator</em>' containment reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Row Count Indicator</em>' containment reference.
     * @see #setRowCountIndicator(RowCountIndicator)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_RowCountIndicator()
     * @model containment="true"
     * @generated
     */
    RowCountIndicator getRowCountIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getRowCountIndicator <em>Row Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Row Count Indicator</em>' containment reference.
     * @see #getRowCountIndicator()
     * @generated
     */
    void setRowCountIndicator(RowCountIndicator value);

    /**
     * Returns the value of the '<em><b>Unique Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique Count Indicator</em>' containment reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unique Count Indicator</em>' containment reference.
     * @see #setUniqueCountIndicator(UniqueCountIndicator)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_UniqueCountIndicator()
     * @model containment="true"
     * @generated
     */
    UniqueCountIndicator getUniqueCountIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getUniqueCountIndicator <em>Unique Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Unique Count Indicator</em>' containment reference.
     * @see #getUniqueCountIndicator()
     * @generated
     */
    void setUniqueCountIndicator(UniqueCountIndicator value);

    /**
     * Returns the value of the '<em><b>Distinct Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Distinct Count Indicator</em>' containment reference isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distinct Count Indicator</em>' containment reference.
     * @see #setDistinctCountIndicator(DistinctCountIndicator)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_DistinctCountIndicator()
     * @model containment="true"
     * @generated
     */
    DistinctCountIndicator getDistinctCountIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDistinctCountIndicator <em>Distinct Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Distinct Count Indicator</em>' containment reference.
     * @see #getDistinctCountIndicator()
     * @generated
     */
    void setDistinctCountIndicator(DistinctCountIndicator value);

    /**
     * Returns the value of the '<em><b>Duplicate Count Indicator</b></em>' containment reference.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Duplicate Count Indicator</em>' containment reference isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duplicate Count Indicator</em>' containment reference.
     * @see #setDuplicateCountIndicator(DuplicateCountIndicator)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnSetMultiValueIndicator_DuplicateCountIndicator()
     * @model containment="true"
     * @generated
     */
    DuplicateCountIndicator getDuplicateCountIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator#getDuplicateCountIndicator <em>Duplicate Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Duplicate Count Indicator</em>' containment reference.
     * @see #getDuplicateCountIndicator()
     * @generated
     */
    void setDuplicateCountIndicator(DuplicateCountIndicator value);

    /**
     * Method "getCountAll".
     * 
     * @return "COUNT(*)"
     */
    public String getCountAll();

} // ColumnSetMultiValueIndicator
