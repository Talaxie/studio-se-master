/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.schema.TableIndicator#getKeyCount <em>Key Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.TableIndicator#getIndexCount <em>Index Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.schema.SchemaPackage#getTableIndicator()
 * @model
 * @generated
 */
public interface TableIndicator extends AbstractTableIndicator {
    /**
     * Returns the value of the '<em><b>Key Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Number of Primary keys
     * <!-- end-model-doc -->
     * @return the value of the '<em>Key Count</em>' attribute.
     * @see #setKeyCount(int)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getTableIndicator_KeyCount()
     * @model
     * @generated
     */
    int getKeyCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.TableIndicator#getKeyCount <em>Key Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Count</em>' attribute.
     * @see #getKeyCount()
     * @generated
     */
    void setKeyCount(int value);

    /**
     * Returns the value of the '<em><b>Index Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Number of indices
     * <!-- end-model-doc -->
     * @return the value of the '<em>Index Count</em>' attribute.
     * @see #setIndexCount(int)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getTableIndicator_IndexCount()
     * @model
     * @generated
     */
    int getIndexCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.TableIndicator#getIndexCount <em>Index Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Index Count</em>' attribute.
     * @see #getIndexCount()
     * @generated
     */
    void setIndexCount(int value);

} // TableIndicator
