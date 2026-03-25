/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;

import org.eclipse.emf.ecore.EObject;
import org.talend.dataquality.domain.Domain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicator Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.IndicatorParameters#getIndicatorValidDomain <em>Indicator Valid Domain</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.IndicatorParameters#getDataValidDomain <em>Data Valid Domain</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.IndicatorParameters#getBins <em>Bins</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.IndicatorParameters#getTextParameter <em>Text Parameter</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.IndicatorParameters#getDateParameters <em>Date Parameters</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.IndicatorParameters#getTopN <em>Top N</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getIndicatorParameters()
 * @model
 * @generated
 */
public interface IndicatorParameters extends EObject {
    /**
     * Returns the value of the '<em><b>Indicator Valid Domain</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Thresholds (or patterns) on indicators. Indicator that do not respect these thresholds are used to compute a quality indicator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Indicator Valid Domain</em>' containment reference.
     * @see #setIndicatorValidDomain(Domain)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getIndicatorParameters_IndicatorValidDomain()
     * @model containment="true"
     * @generated
     */
    Domain getIndicatorValidDomain();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.IndicatorParameters#getIndicatorValidDomain <em>Indicator Valid Domain</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Indicator Valid Domain</em>' containment reference.
     * @see #getIndicatorValidDomain()
     * @generated
     */
    void setIndicatorValidDomain(Domain value);

    /**
     * Returns the value of the '<em><b>Data Valid Domain</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The domain that defines the valid data. It can be patterns or thresholds, or more complex validation function. 
     * This is not a filter. Data that do not respect these domain are counted in the analysis but are used to compute a quality indicator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data Valid Domain</em>' containment reference.
     * @see #setDataValidDomain(Domain)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getIndicatorParameters_DataValidDomain()
     * @model containment="true"
     * @generated
     */
    Domain getDataValidDomain();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.IndicatorParameters#getDataValidDomain <em>Data Valid Domain</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Valid Domain</em>' containment reference.
     * @see #getDataValidDomain()
     * @generated
     */
    void setDataValidDomain(Domain value);

    /**
     * Returns the value of the '<em><b>Bins</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The bins definition (if any). Bins' definition is usually used for aggregating data into bins. 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bins</em>' containment reference.
     * @see #setBins(Domain)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getIndicatorParameters_Bins()
     * @model containment="true"
     * @generated
     */
    Domain getBins();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.IndicatorParameters#getBins <em>Bins</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bins</em>' containment reference.
     * @see #getBins()
     * @generated
     */
    void setBins(Domain value);

    /**
     * Returns the value of the '<em><b>Text Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text Parameter</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text Parameter</em>' containment reference.
     * @see #setTextParameter(TextParameters)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getIndicatorParameters_TextParameter()
     * @model containment="true"
     * @generated
     */
    TextParameters getTextParameter();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.IndicatorParameters#getTextParameter <em>Text Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text Parameter</em>' containment reference.
     * @see #getTextParameter()
     * @generated
     */
    void setTextParameter(TextParameters value);

    /**
     * Returns the value of the '<em><b>Date Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Parameters</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Parameters</em>' containment reference.
     * @see #setDateParameters(DateParameters)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getIndicatorParameters_DateParameters()
     * @model containment="true"
     * @generated
     */
    DateParameters getDateParameters();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.IndicatorParameters#getDateParameters <em>Date Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date Parameters</em>' containment reference.
     * @see #getDateParameters()
     * @generated
     */
    void setDateParameters(DateParameters value);

    /**
     * Returns the value of the '<em><b>Top N</b></em>' attribute.
     * The default value is <code>"10"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of values used in frequency tables
     * <!-- end-model-doc -->
     * @return the value of the '<em>Top N</em>' attribute.
     * @see #setTopN(int)
     * @see org.talend.dataquality.indicators.IndicatorsPackage#getIndicatorParameters_TopN()
     * @model default="10"
     * @generated
     */
    int getTopN();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.IndicatorParameters#getTopN <em>Top N</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Top N</em>' attribute.
     * @see #getTopN()
     * @generated
     */
    void setTopN(int value);

} // IndicatorParameters
