/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.columnset;

import org.talend.cwm.relational.TdColumn;
import org.talend.dataquality.indicators.Indicator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Dependency Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getColumnA <em>Column A</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getColumnB <em>Column B</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getACount <em>ACount</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getDistinctACount <em>Distinct ACount</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getDependencyFactor <em>Dependency Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnDependencyIndicator()
 * @model extendedMetaData="name='ColumnDependencyIndicator'"
 * @generated
 */
public interface ColumnDependencyIndicator extends Indicator {
    /**
     * Returns the value of the '<em><b>Column A</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Column A</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Column A</em>' reference.
     * @see #setColumnA(TdColumn)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnDependencyIndicator_ColumnA()
     * @model
     * @generated
     */
    TdColumn getColumnA();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getColumnA <em>Column A</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Column A</em>' reference.
     * @see #getColumnA()
     * @generated
     */
    void setColumnA(TdColumn value);

    /**
     * Returns the value of the '<em><b>Column B</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Column B</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Column B</em>' reference.
     * @see #setColumnB(TdColumn)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnDependencyIndicator_ColumnB()
     * @model
     * @generated
     */
    TdColumn getColumnB();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getColumnB <em>Column B</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Column B</em>' reference.
     * @see #getColumnB()
     * @generated
     */
    void setColumnB(TdColumn value);

    /**
     * Returns the value of the '<em><b>ACount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ACount</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ACount</em>' attribute.
     * @see #setACount(Long)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnDependencyIndicator_ACount()
     * @model
     * @generated
     */
    Long getACount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getACount <em>ACount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ACount</em>' attribute.
     * @see #getACount()
     * @generated
     */
    void setACount(Long value);

    /**
     * Returns the value of the '<em><b>Distinct ACount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Distinct ACount</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distinct ACount</em>' attribute.
     * @see #setDistinctACount(Long)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnDependencyIndicator_DistinctACount()
     * @model
     * @generated
     */
    Long getDistinctACount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator#getDistinctACount <em>Distinct ACount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distinct ACount</em>' attribute.
     * @see #getDistinctACount()
     * @generated
     */
    void setDistinctACount(Long value);

    /**
     * Returns the value of the '<em><b>Dependency Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependency Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dependency Factor</em>' attribute.
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getColumnDependencyIndicator_DependencyFactor()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    Double getDependencyFactor();

} // ColumnDependencyIndicator
