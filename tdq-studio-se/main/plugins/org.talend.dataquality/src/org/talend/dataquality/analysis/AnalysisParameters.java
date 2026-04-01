/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis;

import org.eclipse.emf.common.util.EList;
import org.talend.dataquality.domain.Domain;
import org.talend.dataquality.indicators.Indicator;
import orgomg.cwmx.analysis.informationreporting.ReportGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisParameters#getDataFilter <em>Data Filter</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisParameters#getIndicatorValidationDomains <em>Indicator Validation Domains</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisParameters#getDataValidationDomains <em>Data Validation Domains</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisParameters#getAnalysisType <em>Analysis Type</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisParameters#getDeactivatedIndicators <em>Deactivated Indicators</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisParameters#getExecutionLanguage <em>Execution Language</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisParameters#isStoreData <em>Store Data</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisParameters#getMaxNumberRows <em>Max Number Rows</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisParameters#getSampleDataShowWay <em>Sample Data Show Way</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisParameters()
 * @model
 * @generated
 */
public interface AnalysisParameters extends ReportGroup {
    /**
     * Returns the value of the '<em><b>Data Filter</b></em>' reference list.
     * The list contents are of type {@link org.talend.dataquality.domain.Domain}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Data filtered from the analysis. Data outside this domain are not taken into account for the analysis.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data Filter</em>' reference list.
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisParameters_DataFilter()
     * @model
     * @generated
     */
    EList<Domain> getDataFilter();

    /**
     * Returns the value of the '<em><b>Indicator Validation Domains</b></em>' reference list.
     * The list contents are of type {@link org.talend.dataquality.domain.Domain}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * @deprecated (is now on indicator) 
     * FIXME scorreia remove this method in model.
     * Thresholds (or patterns) on indicators. Indicator that do not respect these thresholds are used to compute a quality indicator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Indicator Validation Domains</em>' reference list.
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisParameters_IndicatorValidationDomains()
     * @model
     * @generated
     */
    EList<Domain> getIndicatorValidationDomains();

    /**
     * Returns the value of the '<em><b>Data Validation Domains</b></em>' reference list.
     * The list contents are of type {@link org.talend.dataquality.domain.Domain}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * @deprecated (is now on indicator) 
     * FIXME scorreia remove this method in model.
     * The domain that defines the valid data. It can be patterns or thresholds, or more complex validation function. 
     * This is not a filter. Data that do not respect these domain are counted in the analysis but are used to compute a quality indicator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data Validation Domains</em>' reference list.
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisParameters_DataValidationDomains()
     * @model
     * @generated
     */
    EList<Domain> getDataValidationDomains();

    /**
     * Returns the value of the '<em><b>Analysis Type</b></em>' attribute.
     * The default value is <code>""</code>.
     * The literals are from the enumeration {@link org.talend.dataquality.analysis.AnalysisType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analysis Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analysis Type</em>' attribute.
     * @see org.talend.dataquality.analysis.AnalysisType
     * @see #setAnalysisType(AnalysisType)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisParameters_AnalysisType()
     * @model default=""
     * @generated
     */
    AnalysisType getAnalysisType();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.AnalysisParameters#getAnalysisType <em>Analysis Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analysis Type</em>' attribute.
     * @see org.talend.dataquality.analysis.AnalysisType
     * @see #getAnalysisType()
     * @generated
     */
    void setAnalysisType(AnalysisType value);

    /**
     * Returns the value of the '<em><b>Deactivated Indicators</b></em>' reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.Indicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gives a list of indicators that must not be evaluated. This is mainly useful in Comparison analyses when two indicators are always created but only one needs to be computed sometimes. 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Deactivated Indicators</em>' reference list.
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisParameters_DeactivatedIndicators()
     * @model
     * @generated
     */
    EList<Indicator> getDeactivatedIndicators();

    /**
     * Returns the value of the '<em><b>Execution Language</b></em>' attribute.
     * The literals are from the enumeration {@link org.talend.dataquality.analysis.ExecutionLanguage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The execution language: either analysis is computed by using SQL queries or by using Java code.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Execution Language</em>' attribute.
     * @see org.talend.dataquality.analysis.ExecutionLanguage
     * @see #setExecutionLanguage(ExecutionLanguage)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisParameters_ExecutionLanguage()
     * @model
     * @generated
     */
    ExecutionLanguage getExecutionLanguage();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.AnalysisParameters#getExecutionLanguage <em>Execution Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Language</em>' attribute.
     * @see org.talend.dataquality.analysis.ExecutionLanguage
     * @see #getExecutionLanguage()
     * @generated
     */
    void setExecutionLanguage(ExecutionLanguage value);

    /**
     * Returns the value of the '<em><b>Store Data</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * when true, the data must be stored in the analyzedDataSets.
     * when false, the data are not kept during the analysis with the java engine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Store Data</em>' attribute.
     * @see #setStoreData(boolean)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisParameters_StoreData()
     * @model default="true"
     * @generated
     */
    boolean isStoreData();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.AnalysisParameters#isStoreData <em>Store Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Store Data</em>' attribute.
     * @see #isStoreData()
     * @generated
     */
    void setStoreData(boolean value);

    /**
     * Returns the value of the '<em><b>Max Number Rows</b></em>' attribute.
     * The default value is <code>"50"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum number of rows kept in each indicator when analyzing data with the Java engine. 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Number Rows</em>' attribute.
     * @see #setMaxNumberRows(int)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisParameters_MaxNumberRows()
     * @model default="50"
     * @generated
     */
    int getMaxNumberRows();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.AnalysisParameters#getMaxNumberRows <em>Max Number Rows</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Number Rows</em>' attribute.
     * @see #getMaxNumberRows()
     * @generated
     */
    void setMaxNumberRows(int value);

    /**
     * Returns the value of the '<em><b>Sample Data Show Way</b></em>' attribute.
     * The default value is <code>""</code>.
     * The literals are from the enumeration {@link org.talend.dataquality.analysis.SampleDataShowWay}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The sample data show way:  the analysis sample data show data either first rows or random rows
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sample Data Show Way</em>' attribute.
     * @see org.talend.dataquality.analysis.SampleDataShowWay
     * @see #setSampleDataShowWay(SampleDataShowWay)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisParameters_SampleDataShowWay()
     * @model default=""
     * @generated
     */
    SampleDataShowWay getSampleDataShowWay();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.AnalysisParameters#getSampleDataShowWay <em>Sample Data Show Way</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sample Data Show Way</em>' attribute.
     * @see org.talend.dataquality.analysis.SampleDataShowWay
     * @see #getSampleDataShowWay()
     * @generated
     */
    void setSampleDataShowWay(SampleDataShowWay value);

} // AnalysisParameters
