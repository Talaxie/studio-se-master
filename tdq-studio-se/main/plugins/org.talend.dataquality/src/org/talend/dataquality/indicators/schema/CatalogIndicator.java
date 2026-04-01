/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.schema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.schema.CatalogIndicator#getSchemaCount <em>Schema Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.CatalogIndicator#getSchemaIndicators <em>Schema Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.schema.SchemaPackage#getCatalogIndicator()
 * @model
 * @generated
 */
public interface CatalogIndicator extends SchemaIndicator {
    /**
     * Returns the value of the '<em><b>Schema Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Count</em>' attribute.
     * @see #setSchemaCount(int)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getCatalogIndicator_SchemaCount()
     * @model
     * @generated
     */
    int getSchemaCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.CatalogIndicator#getSchemaCount <em>Schema Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Count</em>' attribute.
     * @see #getSchemaCount()
     * @generated
     */
    void setSchemaCount(int value);

    /**
     * Returns the value of the '<em><b>Schema Indicators</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.schema.SchemaIndicator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Indicators</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Indicators</em>' containment reference list.
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getCatalogIndicator_SchemaIndicators()
     * @model containment="true"
     * @generated
     */
    EList<SchemaIndicator> getSchemaIndicators();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean addSchemaIndicator(SchemaIndicator schemaIndicator);

} // CatalogIndicator
