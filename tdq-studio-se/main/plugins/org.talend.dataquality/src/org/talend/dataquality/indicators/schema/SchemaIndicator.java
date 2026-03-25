/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.schema;

import org.eclipse.emf.common.util.EList;
import org.talend.dataquality.indicators.CompositeIndicator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getKeyCount <em>Key Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getIndexCount <em>Index Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getViewCount <em>View Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTriggerCount <em>Trigger Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTableRowCount <em>Table Row Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTableIndicators <em>Table Indicators</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getViewRowCount <em>View Row Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getViewIndicators <em>View Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.schema.SchemaPackage#getSchemaIndicator()
 * @model
 * @generated
 */
public interface SchemaIndicator extends CompositeIndicator {
    /**
     * Returns the value of the '<em><b>Table Indicators</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.schema.TableIndicator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Table Indicators</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table Indicators</em>' containment reference list.
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getSchemaIndicator_TableIndicators()
     * @model containment="true"
     * @generated
     */
    EList<TableIndicator> getTableIndicators();

    /**
     * Returns the value of the '<em><b>View Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of rows of the analyzed views.
     * <!-- end-model-doc -->
     * @return the value of the '<em>View Row Count</em>' attribute.
     * @see #setViewRowCount(long)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getSchemaIndicator_ViewRowCount()
     * @model
     * @generated
     */
    long getViewRowCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getViewRowCount <em>View Row Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>View Row Count</em>' attribute.
     * @see #getViewRowCount()
     * @generated
     */
    void setViewRowCount(long value);

    /**
     * Returns the value of the '<em><b>View Indicators</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.schema.ViewIndicator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>View Indicators</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Indicators</em>' containment reference list.
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getSchemaIndicator_ViewIndicators()
     * @model containment="true"
     * @generated
     */
    EList<ViewIndicator> getViewIndicators();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean addTableIndicator(TableIndicator tableIndicator);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean addViewIndicator(ViewIndicator viewIndicator);

    /**
     * Returns the value of the '<em><b>Table Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Table Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table Count</em>' attribute.
     * @see #setTableCount(int)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getSchemaIndicator_TableCount()
     * @model
     * @generated
     */
    int getTableCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTableCount <em>Table Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table Count</em>' attribute.
     * @see #getTableCount()
     * @generated
     */
    void setTableCount(int value);

    /**
     * Returns the value of the '<em><b>Key Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key Count</em>' attribute.
     * @see #setKeyCount(int)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getSchemaIndicator_KeyCount()
     * @model
     * @generated
     */
    int getKeyCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getKeyCount <em>Key Count</em>}' attribute.
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
     * <p>
     * If the meaning of the '<em>Index Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Index Count</em>' attribute.
     * @see #setIndexCount(int)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getSchemaIndicator_IndexCount()
     * @model
     * @generated
     */
    int getIndexCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getIndexCount <em>Index Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Index Count</em>' attribute.
     * @see #getIndexCount()
     * @generated
     */
    void setIndexCount(int value);

    /**
     * Returns the value of the '<em><b>View Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>View Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Count</em>' attribute.
     * @see #setViewCount(int)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getSchemaIndicator_ViewCount()
     * @model
     * @generated
     */
    int getViewCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getViewCount <em>View Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>View Count</em>' attribute.
     * @see #getViewCount()
     * @generated
     */
    void setViewCount(int value);

    /**
     * Returns the value of the '<em><b>Trigger Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Count</em>' attribute.
     * @see #setTriggerCount(int)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getSchemaIndicator_TriggerCount()
     * @model
     * @generated
     */
    int getTriggerCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTriggerCount <em>Trigger Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Count</em>' attribute.
     * @see #getTriggerCount()
     * @generated
     */
    void setTriggerCount(int value);

    /**
     * Returns the value of the '<em><b>Table Row Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of rows of the analyzed tables.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Table Row Count</em>' attribute.
     * @see #setTableRowCount(long)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getSchemaIndicator_TableRowCount()
     * @model
     * @generated
     */
    long getTableRowCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.SchemaIndicator#getTableRowCount <em>Table Row Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table Row Count</em>' attribute.
     * @see #getTableRowCount()
     * @generated
     */
    void setTableRowCount(long value);

} // SchemaIndicator
