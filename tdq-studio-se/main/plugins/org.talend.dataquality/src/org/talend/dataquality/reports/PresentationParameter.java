/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.reports;

import org.talend.dataquality.indicators.Indicator;
import orgomg.cwm.analysis.informationvisualization.Rendering;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.reports.PresentationParameter#getPlotType <em>Plot Type</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.PresentationParameter#getIndicator <em>Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.reports.ReportsPackage#getPresentationParameter()
 * @model
 * @generated
 */
public interface PresentationParameter extends Rendering {
    /**
     * Returns the value of the '<em><b>Plot Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A string indicating the type of the plot that is used to display the indicator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plot Type</em>' attribute.
     * @see #setPlotType(String)
     * @see org.talend.dataquality.reports.ReportsPackage#getPresentationParameter_PlotType()
     * @model
     * @generated
     */
    String getPlotType();

    /**
     * Sets the value of the '{@link org.talend.dataquality.reports.PresentationParameter#getPlotType <em>Plot Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plot Type</em>' attribute.
     * @see #getPlotType()
     * @generated
     */
    void setPlotType(String value);

    /**
     * Returns the value of the '<em><b>Indicator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indicator</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indicator</em>' reference.
     * @see #setIndicator(Indicator)
     * @see org.talend.dataquality.reports.ReportsPackage#getPresentationParameter_Indicator()
     * @model
     * @generated
     */
    Indicator getIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.reports.PresentationParameter#getIndicator <em>Indicator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Indicator</em>' reference.
     * @see #getIndicator()
     * @generated
     */
    void setIndicator(Indicator value);

} // PresentationParameter
