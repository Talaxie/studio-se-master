/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.dataquality.analysis.*;
import org.talend.dataquality.analysis.Analysis;
import org.talend.dataquality.analysis.AnalysisContext;
import org.talend.dataquality.analysis.AnalysisFactory;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.AnalysisParameters;
import org.talend.dataquality.analysis.AnalysisResult;
import org.talend.dataquality.analysis.AnalysisType;
import org.talend.dataquality.analysis.AnalyzedDataSet;
import org.talend.dataquality.analysis.ExecutionInformations;
import org.talend.dataquality.analysis.ExecutionLanguage;
import org.talend.dataquality.indicators.Indicator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisFactoryImpl extends EFactoryImpl implements AnalysisFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AnalysisFactory init() {
        try {
            AnalysisFactory theAnalysisFactory = (AnalysisFactory)EPackage.Registry.INSTANCE.getEFactory(AnalysisPackage.eNS_URI);
            if (theAnalysisFactory != null) {
                return theAnalysisFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new AnalysisFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case AnalysisPackage.ANALYSIS: return createAnalysis();
            case AnalysisPackage.ANALYSIS_CONTEXT: return createAnalysisContext();
            case AnalysisPackage.ANALYSIS_PARAMETERS: return createAnalysisParameters();
            case AnalysisPackage.ANALYSIS_RESULT: return createAnalysisResult();
            case AnalysisPackage.EXECUTION_INFORMATIONS: return createExecutionInformations();
            case AnalysisPackage.INDIC_TO_ROWS_MAP: return (EObject)createIndicToRowsMap();
            case AnalysisPackage.ANALYZED_DATA_SET: return createAnalyzedDataSet();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case AnalysisPackage.ANALYSIS_TYPE:
                return createAnalysisTypeFromString(eDataType, initialValue);
            case AnalysisPackage.EXECUTION_LANGUAGE:
                return createExecutionLanguageFromString(eDataType, initialValue);
            case AnalysisPackage.SAMPLE_DATA_SHOW_WAY:
                return createSampleDataShowWayFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case AnalysisPackage.ANALYSIS_TYPE:
                return convertAnalysisTypeToString(eDataType, instanceValue);
            case AnalysisPackage.EXECUTION_LANGUAGE:
                return convertExecutionLanguageToString(eDataType, instanceValue);
            case AnalysisPackage.SAMPLE_DATA_SHOW_WAY:
                return convertSampleDataShowWayToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Analysis createAnalysis() {
        AnalysisImpl analysis = new AnalysisImpl();
        return analysis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisContext createAnalysisContext() {
        AnalysisContextImpl analysisContext = new AnalysisContextImpl();
        return analysisContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisParameters createAnalysisParameters() {
        AnalysisParametersImpl analysisParameters = new AnalysisParametersImpl();
        return analysisParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisResult createAnalysisResult() {
        AnalysisResultImpl analysisResult = new AnalysisResultImpl();
        return analysisResult;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionInformations createExecutionInformations() {
        ExecutionInformationsImpl executionInformations = new ExecutionInformationsImpl();
        return executionInformations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<Indicator, AnalyzedDataSet> createIndicToRowsMap() {
        IndicToRowsMapImpl indicToRowsMap = new IndicToRowsMapImpl();
        return indicToRowsMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalyzedDataSet createAnalyzedDataSet() {
        AnalyzedDataSetImpl analyzedDataSet = new AnalyzedDataSetImpl();
        return analyzedDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisType createAnalysisTypeFromString(EDataType eDataType, String initialValue) {
        AnalysisType result = AnalysisType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAnalysisTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionLanguage createExecutionLanguageFromString(EDataType eDataType, String initialValue) {
        ExecutionLanguage result = ExecutionLanguage.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExecutionLanguageToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SampleDataShowWay createSampleDataShowWayFromString(EDataType eDataType, String initialValue) {
        SampleDataShowWay result = SampleDataShowWay.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSampleDataShowWayToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisPackage getAnalysisPackage() {
        return (AnalysisPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static AnalysisPackage getPackage() {
        return AnalysisPackage.eINSTANCE;
    }

} //AnalysisFactoryImpl
