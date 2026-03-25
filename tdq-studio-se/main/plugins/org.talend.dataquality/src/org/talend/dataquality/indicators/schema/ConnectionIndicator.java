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
 * A representation of the model object '<em><b>Connection Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.schema.ConnectionIndicator#getCatalogIndicators <em>Catalog Indicators</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.ConnectionIndicator#getCatalogCount <em>Catalog Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.schema.SchemaPackage#getConnectionIndicator()
 * @model
 * @generated
 */
public interface ConnectionIndicator extends CatalogIndicator {
    /**
     * Returns the value of the '<em><b>Catalog Indicators</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.schema.CatalogIndicator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Catalog Indicators</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Catalog Indicators</em>' containment reference list.
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getConnectionIndicator_CatalogIndicators()
     * @model containment="true"
     * @generated
     */
    EList<CatalogIndicator> getCatalogIndicators();

    /**
     * Returns the value of the '<em><b>Catalog Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Catalog Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Catalog Count</em>' attribute.
     * @see #setCatalogCount(int)
     * @see org.talend.dataquality.indicators.schema.SchemaPackage#getConnectionIndicator_CatalogCount()
     * @model
     * @generated
     */
    int getCatalogCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.schema.ConnectionIndicator#getCatalogCount <em>Catalog Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Catalog Count</em>' attribute.
     * @see #getCatalogCount()
     * @generated
     */
    void setCatalogCount(int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean addCatalogIndicator(CatalogIndicator catalogIndicator);

} // ConnectionIndicator
