/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.util;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.talend.dataquality.analysis.*;
import org.talend.dataquality.analysis.Analysis;
import org.talend.dataquality.analysis.AnalysisContext;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.AnalysisParameters;
import org.talend.dataquality.analysis.AnalysisResult;
import org.talend.dataquality.analysis.AnalyzedDataSet;
import org.talend.dataquality.analysis.ExecutionInformations;
import org.talend.dataquality.indicators.Indicator;
import orgomg.cwm.analysis.informationvisualization.RenderedObject;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwmx.analysis.informationreporting.ReportGroup;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.analysis.AnalysisPackage
 * @generated
 */
public class AnalysisSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static AnalysisPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisSwitch() {
        if (modelPackage == null) {
            modelPackage = AnalysisPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case AnalysisPackage.ANALYSIS: {
                Analysis analysis = (Analysis)theEObject;
                T result = caseAnalysis(analysis);
                if (result == null) result = caseReportGroup(analysis);
                if (result == null) result = caseRenderedObject(analysis);
                if (result == null) result = caseClassifier(analysis);
                if (result == null) result = caseNamespace(analysis);
                if (result == null) result = caseModelElement(analysis);
                if (result == null) result = caseElement(analysis);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AnalysisPackage.ANALYSIS_CONTEXT: {
                AnalysisContext analysisContext = (AnalysisContext)theEObject;
                T result = caseAnalysisContext(analysisContext);
                if (result == null) result = caseReportGroup(analysisContext);
                if (result == null) result = caseRenderedObject(analysisContext);
                if (result == null) result = caseClassifier(analysisContext);
                if (result == null) result = caseNamespace(analysisContext);
                if (result == null) result = caseModelElement(analysisContext);
                if (result == null) result = caseElement(analysisContext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AnalysisPackage.ANALYSIS_PARAMETERS: {
                AnalysisParameters analysisParameters = (AnalysisParameters)theEObject;
                T result = caseAnalysisParameters(analysisParameters);
                if (result == null) result = caseReportGroup(analysisParameters);
                if (result == null) result = caseRenderedObject(analysisParameters);
                if (result == null) result = caseClassifier(analysisParameters);
                if (result == null) result = caseNamespace(analysisParameters);
                if (result == null) result = caseModelElement(analysisParameters);
                if (result == null) result = caseElement(analysisParameters);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AnalysisPackage.ANALYSIS_RESULT: {
                AnalysisResult analysisResult = (AnalysisResult)theEObject;
                T result = caseAnalysisResult(analysisResult);
                if (result == null) result = caseReportGroup(analysisResult);
                if (result == null) result = caseRenderedObject(analysisResult);
                if (result == null) result = caseClassifier(analysisResult);
                if (result == null) result = caseNamespace(analysisResult);
                if (result == null) result = caseModelElement(analysisResult);
                if (result == null) result = caseElement(analysisResult);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AnalysisPackage.EXECUTION_INFORMATIONS: {
                ExecutionInformations executionInformations = (ExecutionInformations)theEObject;
                T result = caseExecutionInformations(executionInformations);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AnalysisPackage.INDIC_TO_ROWS_MAP: {
                @SuppressWarnings("unchecked") Map.Entry<Indicator, AnalyzedDataSet> indicToRowsMap = (Map.Entry<Indicator, AnalyzedDataSet>)theEObject;
                T result = caseIndicToRowsMap(indicToRowsMap);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case AnalysisPackage.ANALYZED_DATA_SET: {
                AnalyzedDataSet analyzedDataSet = (AnalyzedDataSet)theEObject;
                T result = caseAnalyzedDataSet(analyzedDataSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analysis</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analysis</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalysis(Analysis object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalysisContext(AnalysisContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalysisParameters(AnalysisParameters object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Result</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalysisResult(AnalysisResult object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Execution Informations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Execution Informations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExecutionInformations(ExecutionInformations object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Indic To Rows Map</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Indic To Rows Map</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIndicToRowsMap(Map.Entry<Indicator, AnalyzedDataSet> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analyzed Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analyzed Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalyzedDataSet(AnalyzedDataSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElement(ModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamespace(Namespace object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassifier(Classifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rendered Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rendered Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRenderedObject(RenderedObject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Report Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Report Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReportGroup(ReportGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //AnalysisSwitch
