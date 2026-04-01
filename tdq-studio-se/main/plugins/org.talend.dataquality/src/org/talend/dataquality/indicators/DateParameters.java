/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.DateParameters#getDateAggregationType <em>Date Aggregation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getDateParameters()
 * @model
 * @generated
 */
public interface DateParameters extends EObject {
    /**
     * Returns the value of the '<em><b>Date Aggregation Type</b></em>' attribute.
     * The default value is <code>"year"</code>.
     * The literals are from the enumeration {@link org.talend.dataquality.indicators.DateGrain}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Aggregation Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Aggregation Type</em>' attribute.
     * @see org.talend.dataquality.indicators.DateGrain
     * @see #setDateAggregationType(DateGrain)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getDateParameters_DateAggregationType()
     * @model default="year"
     * @generated
     */
    DateGrain getDateAggregationType();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.DateParameters#getDateAggregationType <em>Date Aggregation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date Aggregation Type</em>' attribute.
     * @see org.talend.dataquality.indicators.DateGrain
     * @see #getDateAggregationType()
     * @generated
     */
    void setDateAggregationType(DateGrain value);

} // DateParameters
