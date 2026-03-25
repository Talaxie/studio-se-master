/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.talend.dataquality.indicators.Indicator;
import orgomg.cwmx.analysis.informationreporting.ReportGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisResult#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisResult#getResultMetadata <em>Result Metadata</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisResult#getIndicators <em>Indicators</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisResult#getIndicToRowMap <em>Indic To Row Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisResult()
 * @model
 * @generated
 */
public interface AnalysisResult extends ReportGroup {
    /**
     * Returns the value of the '<em><b>Analysis</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.dataquality.analysis.Analysis#getResults <em>Results</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analysis</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analysis</em>' container reference.
     * @see #setAnalysis(Analysis)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisResult_Analysis()
     * @see org.talend.dataquality.analysis.Analysis#getResults
     * @model opposite="results" transient="false"
     * @generated
     */
    Analysis getAnalysis();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.AnalysisResult#getAnalysis <em>Analysis</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analysis</em>' container reference.
     * @see #getAnalysis()
     * @generated
     */
    void setAnalysis(Analysis value);

    /**
     * Returns the value of the '<em><b>Result Metadata</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result Metadata</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result Metadata</em>' containment reference.
     * @see #setResultMetadata(ExecutionInformations)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisResult_ResultMetadata()
     * @model containment="true"
     * @generated
     */
    ExecutionInformations getResultMetadata();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.AnalysisResult#getResultMetadata <em>Result Metadata</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result Metadata</em>' containment reference.
     * @see #getResultMetadata()
     * @generated
     */
    void setResultMetadata(ExecutionInformations value);

    /**
     * Returns the value of the '<em><b>Indicators</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.Indicator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indicators</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indicators</em>' containment reference list.
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisResult_Indicators()
     * @model containment="true"
     * @generated
     */
    EList<Indicator> getIndicators();

    /**
     * Returns the value of the '<em><b>Indic To Row Map</b></em>' map.
     * The key is of type {@link org.talend.dataquality.indicators.Indicator},
     * and the value is of type {@link org.talend.dataquality.analysis.AnalyzedDataSet},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indic To Row Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indic To Row Map</em>' map.
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisResult_IndicToRowMap()
     * @model mapType="org.talend.dataquality.analysis.IndicToRowsMap<org.talend.dataquality.indicators.Indicator, org.talend.dataquality.analysis.AnalyzedDataSet>" transient="true"
     * @generated
     */
    EMap<Indicator, AnalyzedDataSet> getIndicToRowMap();

} // AnalysisResult
