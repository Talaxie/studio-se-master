/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.analysis.AnalysisPackage
 * @generated
 */
public interface AnalysisFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AnalysisFactory eINSTANCE = org.talend.dataquality.analysis.impl.AnalysisFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Analysis</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analysis</em>'.
     * @generated
     */
    Analysis createAnalysis();

    /**
     * Returns a new object of class '<em>Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context</em>'.
     * @generated
     */
    AnalysisContext createAnalysisContext();

    /**
     * Returns a new object of class '<em>Parameters</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameters</em>'.
     * @generated
     */
    AnalysisParameters createAnalysisParameters();

    /**
     * Returns a new object of class '<em>Result</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Result</em>'.
     * @generated
     */
    AnalysisResult createAnalysisResult();

    /**
     * Returns a new object of class '<em>Execution Informations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Informations</em>'.
     * @generated
     */
    ExecutionInformations createExecutionInformations();

    /**
     * Returns a new object of class '<em>Analyzed Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analyzed Data Set</em>'.
     * @generated
     */
    AnalyzedDataSet createAnalyzedDataSet();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AnalysisPackage getAnalysisPackage();

} //AnalysisFactory
