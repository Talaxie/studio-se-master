/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.talend.core.model.properties.PropertiesPackage;
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
import org.talend.dataquality.analysis.SampleDataShowWay;
import org.talend.dataquality.analysis.category.CategoryPackage;
import org.talend.dataquality.analysis.category.impl.CategoryPackageImpl;
import org.talend.dataquality.domain.DomainPackage;
import org.talend.dataquality.domain.impl.DomainPackageImpl;
import org.talend.dataquality.domain.pattern.PatternPackage;
import org.talend.dataquality.domain.pattern.impl.PatternPackageImpl;
import org.talend.dataquality.domain.sql.SQLPackage;
import org.talend.dataquality.domain.sql.impl.SQLPackageImpl;
import org.talend.dataquality.expressions.ExpressionsPackage;
import org.talend.dataquality.expressions.impl.ExpressionsPackageImpl;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.columnset.ColumnsetPackage;
import org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl;
import org.talend.dataquality.indicators.definition.DefinitionPackage;
import org.talend.dataquality.indicators.definition.impl.DefinitionPackageImpl;
import org.talend.dataquality.indicators.definition.userdefine.UserdefinePackage;
import org.talend.dataquality.indicators.definition.userdefine.impl.UserdefinePackageImpl;
import org.talend.dataquality.indicators.impl.IndicatorsPackageImpl;
import org.talend.dataquality.indicators.schema.SchemaPackage;
import org.talend.dataquality.indicators.schema.impl.SchemaPackageImpl;
import org.talend.dataquality.indicators.sql.IndicatorSqlPackage;
import org.talend.dataquality.indicators.sql.impl.IndicatorSqlPackageImpl;
import org.talend.dataquality.properties.impl.PropertiesPackageImpl;
import org.talend.dataquality.reports.ReportsPackage;
import org.talend.dataquality.reports.impl.ReportsPackageImpl;
import org.talend.dataquality.rules.RulesPackage;
import org.talend.dataquality.rules.impl.RulesPackageImpl;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwmx.analysis.informationreporting.InformationreportingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisPackageImpl extends EPackageImpl implements AnalysisPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass analysisEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass analysisContextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass analysisParametersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass analysisResultEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass executionInformationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass indicToRowsMapEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass analyzedDataSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum analysisTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum executionLanguageEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum sampleDataShowWayEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.dataquality.analysis.AnalysisPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private AnalysisPackageImpl() {
        super(eNS_URI, AnalysisFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link AnalysisPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static AnalysisPackage init() {
        if (isInited) return (AnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);

        // Obtain or create and register package
        AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnalysisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnalysisPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PropertiesPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        CategoryPackageImpl theCategoryPackage = (CategoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI) instanceof CategoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI) : CategoryPackage.eINSTANCE);
        ReportsPackageImpl theReportsPackage = (ReportsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportsPackage.eNS_URI) instanceof ReportsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportsPackage.eNS_URI) : ReportsPackage.eINSTANCE);
        IndicatorsPackageImpl theIndicatorsPackage = (IndicatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI) instanceof IndicatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI) : IndicatorsPackage.eINSTANCE);
        SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) instanceof SchemaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) : SchemaPackage.eINSTANCE);
        DefinitionPackageImpl theDefinitionPackage = (DefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DefinitionPackage.eNS_URI) instanceof DefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DefinitionPackage.eNS_URI) : DefinitionPackage.eINSTANCE);
        UserdefinePackageImpl theUserdefinePackage = (UserdefinePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UserdefinePackage.eNS_URI) instanceof UserdefinePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UserdefinePackage.eNS_URI) : UserdefinePackage.eINSTANCE);
        IndicatorSqlPackageImpl theIndicatorSqlPackage = (IndicatorSqlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndicatorSqlPackage.eNS_URI) instanceof IndicatorSqlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndicatorSqlPackage.eNS_URI) : IndicatorSqlPackage.eINSTANCE);
        ColumnsetPackageImpl theColumnsetPackage = (ColumnsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnsetPackage.eNS_URI) instanceof ColumnsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnsetPackage.eNS_URI) : ColumnsetPackage.eINSTANCE);
        ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
        DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        SQLPackageImpl theSQLPackage = (SQLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLPackage.eNS_URI) instanceof SQLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLPackage.eNS_URI) : SQLPackage.eINSTANCE);
        RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
        PropertiesPackageImpl thePropertiesPackage_1 = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.talend.dataquality.properties.PropertiesPackage.eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.talend.dataquality.properties.PropertiesPackage.eNS_URI) : org.talend.dataquality.properties.PropertiesPackage.eINSTANCE);

        // Create package meta-data objects
        theAnalysisPackage.createPackageContents();
        theCategoryPackage.createPackageContents();
        theReportsPackage.createPackageContents();
        theIndicatorsPackage.createPackageContents();
        theSchemaPackage.createPackageContents();
        theDefinitionPackage.createPackageContents();
        theUserdefinePackage.createPackageContents();
        theIndicatorSqlPackage.createPackageContents();
        theColumnsetPackage.createPackageContents();
        theExpressionsPackage.createPackageContents();
        theDomainPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theSQLPackage.createPackageContents();
        theRulesPackage.createPackageContents();
        thePropertiesPackage_1.createPackageContents();

        // Initialize created meta-data
        theAnalysisPackage.initializePackageContents();
        theCategoryPackage.initializePackageContents();
        theReportsPackage.initializePackageContents();
        theIndicatorsPackage.initializePackageContents();
        theSchemaPackage.initializePackageContents();
        theDefinitionPackage.initializePackageContents();
        theUserdefinePackage.initializePackageContents();
        theIndicatorSqlPackage.initializePackageContents();
        theColumnsetPackage.initializePackageContents();
        theExpressionsPackage.initializePackageContents();
        theDomainPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theSQLPackage.initializePackageContents();
        theRulesPackage.initializePackageContents();
        thePropertiesPackage_1.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theAnalysisPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(AnalysisPackage.eNS_URI, theAnalysisPackage);
        return theAnalysisPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnalysis() {
        return analysisEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysis_Context() {
        return (EReference)analysisEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysis_Results() {
        return (EReference)analysisEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysis_Parameters() {
        return (EReference)analysisEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalysis_CreationDate() {
        return (EAttribute)analysisEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysis_ContextType() {
        return (EReference)analysisEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalysis_DefaultContext() {
        return (EAttribute)analysisEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnalysisContext() {
        return analysisContextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysisContext_Connection() {
        return (EReference)analysisContextEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysisContext_AnalysedElements() {
        return (EReference)analysisContextEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnalysisParameters() {
        return analysisParametersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysisParameters_DataFilter() {
        return (EReference)analysisParametersEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysisParameters_IndicatorValidationDomains() {
        return (EReference)analysisParametersEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysisParameters_DataValidationDomains() {
        return (EReference)analysisParametersEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalysisParameters_AnalysisType() {
        return (EAttribute)analysisParametersEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysisParameters_DeactivatedIndicators() {
        return (EReference)analysisParametersEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalysisParameters_ExecutionLanguage() {
        return (EAttribute)analysisParametersEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalysisParameters_StoreData() {
        return (EAttribute)analysisParametersEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalysisParameters_MaxNumberRows() {
        return (EAttribute)analysisParametersEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalysisParameters_SampleDataShowWay() {
        return (EAttribute)analysisParametersEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnalysisResult() {
        return analysisResultEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysisResult_Analysis() {
        return (EReference)analysisResultEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysisResult_ResultMetadata() {
        return (EReference)analysisResultEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysisResult_Indicators() {
        return (EReference)analysisResultEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnalysisResult_IndicToRowMap() {
        return (EReference)analysisResultEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExecutionInformations() {
        return executionInformationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExecutionInformations_ExecutionDate() {
        return (EAttribute)executionInformationsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExecutionInformations_ExecutionDuration() {
        return (EAttribute)executionInformationsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExecutionInformations_Message() {
        return (EAttribute)executionInformationsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExecutionInformations_ExecutionNumber() {
        return (EAttribute)executionInformationsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExecutionInformations_LastRunOk() {
        return (EAttribute)executionInformationsEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExecutionInformations_LastExecutionNumberOk() {
        return (EAttribute)executionInformationsEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExecutionInformations_OutThreshold() {
        return (EAttribute)executionInformationsEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIndicToRowsMap() {
        return indicToRowsMapEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicToRowsMap_Key() {
        return (EReference)indicToRowsMapEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicToRowsMap_Value() {
        return (EReference)indicToRowsMapEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnalyzedDataSet() {
        return analyzedDataSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalyzedDataSet_DataCount() {
        return (EAttribute)analyzedDataSetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalyzedDataSet_RecordSize() {
        return (EAttribute)analyzedDataSetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalyzedDataSet_Data() {
        return (EAttribute)analyzedDataSetEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalyzedDataSet_PatternData() {
        return (EAttribute)analyzedDataSetEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnalyzedDataSet_FrequencyData() {
        return (EAttribute)analyzedDataSetEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAnalysisType() {
        return analysisTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getExecutionLanguage() {
        return executionLanguageEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSampleDataShowWay() {
        return sampleDataShowWayEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisFactory getAnalysisFactory() {
        return (AnalysisFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        analysisEClass = createEClass(ANALYSIS);
        createEReference(analysisEClass, ANALYSIS__CONTEXT);
        createEReference(analysisEClass, ANALYSIS__RESULTS);
        createEReference(analysisEClass, ANALYSIS__PARAMETERS);
        createEAttribute(analysisEClass, ANALYSIS__CREATION_DATE);
        createEReference(analysisEClass, ANALYSIS__CONTEXT_TYPE);
        createEAttribute(analysisEClass, ANALYSIS__DEFAULT_CONTEXT);

        analysisContextEClass = createEClass(ANALYSIS_CONTEXT);
        createEReference(analysisContextEClass, ANALYSIS_CONTEXT__CONNECTION);
        createEReference(analysisContextEClass, ANALYSIS_CONTEXT__ANALYSED_ELEMENTS);

        analysisParametersEClass = createEClass(ANALYSIS_PARAMETERS);
        createEReference(analysisParametersEClass, ANALYSIS_PARAMETERS__DATA_FILTER);
        createEReference(analysisParametersEClass, ANALYSIS_PARAMETERS__INDICATOR_VALIDATION_DOMAINS);
        createEReference(analysisParametersEClass, ANALYSIS_PARAMETERS__DATA_VALIDATION_DOMAINS);
        createEAttribute(analysisParametersEClass, ANALYSIS_PARAMETERS__ANALYSIS_TYPE);
        createEReference(analysisParametersEClass, ANALYSIS_PARAMETERS__DEACTIVATED_INDICATORS);
        createEAttribute(analysisParametersEClass, ANALYSIS_PARAMETERS__EXECUTION_LANGUAGE);
        createEAttribute(analysisParametersEClass, ANALYSIS_PARAMETERS__STORE_DATA);
        createEAttribute(analysisParametersEClass, ANALYSIS_PARAMETERS__MAX_NUMBER_ROWS);
        createEAttribute(analysisParametersEClass, ANALYSIS_PARAMETERS__SAMPLE_DATA_SHOW_WAY);

        analysisResultEClass = createEClass(ANALYSIS_RESULT);
        createEReference(analysisResultEClass, ANALYSIS_RESULT__ANALYSIS);
        createEReference(analysisResultEClass, ANALYSIS_RESULT__RESULT_METADATA);
        createEReference(analysisResultEClass, ANALYSIS_RESULT__INDICATORS);
        createEReference(analysisResultEClass, ANALYSIS_RESULT__INDIC_TO_ROW_MAP);

        executionInformationsEClass = createEClass(EXECUTION_INFORMATIONS);
        createEAttribute(executionInformationsEClass, EXECUTION_INFORMATIONS__EXECUTION_DATE);
        createEAttribute(executionInformationsEClass, EXECUTION_INFORMATIONS__EXECUTION_DURATION);
        createEAttribute(executionInformationsEClass, EXECUTION_INFORMATIONS__MESSAGE);
        createEAttribute(executionInformationsEClass, EXECUTION_INFORMATIONS__EXECUTION_NUMBER);
        createEAttribute(executionInformationsEClass, EXECUTION_INFORMATIONS__LAST_RUN_OK);
        createEAttribute(executionInformationsEClass, EXECUTION_INFORMATIONS__LAST_EXECUTION_NUMBER_OK);
        createEAttribute(executionInformationsEClass, EXECUTION_INFORMATIONS__OUT_THRESHOLD);

        indicToRowsMapEClass = createEClass(INDIC_TO_ROWS_MAP);
        createEReference(indicToRowsMapEClass, INDIC_TO_ROWS_MAP__KEY);
        createEReference(indicToRowsMapEClass, INDIC_TO_ROWS_MAP__VALUE);

        analyzedDataSetEClass = createEClass(ANALYZED_DATA_SET);
        createEAttribute(analyzedDataSetEClass, ANALYZED_DATA_SET__DATA_COUNT);
        createEAttribute(analyzedDataSetEClass, ANALYZED_DATA_SET__RECORD_SIZE);
        createEAttribute(analyzedDataSetEClass, ANALYZED_DATA_SET__DATA);
        createEAttribute(analyzedDataSetEClass, ANALYZED_DATA_SET__PATTERN_DATA);
        createEAttribute(analyzedDataSetEClass, ANALYZED_DATA_SET__FREQUENCY_DATA);

        // Create enums
        analysisTypeEEnum = createEEnum(ANALYSIS_TYPE);
        executionLanguageEEnum = createEEnum(EXECUTION_LANGUAGE);
        sampleDataShowWayEEnum = createEEnum(SAMPLE_DATA_SHOW_WAY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        CategoryPackage theCategoryPackage = (CategoryPackage)EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI);
        InformationreportingPackage theInformationreportingPackage = (InformationreportingPackage)EPackage.Registry.INSTANCE.getEPackage(InformationreportingPackage.eNS_URI);
        TalendFilePackage theTalendFilePackage = (TalendFilePackage)EPackage.Registry.INSTANCE.getEPackage(TalendFilePackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
        SoftwaredeploymentPackage theSoftwaredeploymentPackage = (SoftwaredeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwaredeploymentPackage.eNS_URI);
        CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
        DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
        IndicatorsPackage theIndicatorsPackage = (IndicatorsPackage)EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI);
        ColumnsetPackage theColumnsetPackage = (ColumnsetPackage)EPackage.Registry.INSTANCE.getEPackage(ColumnsetPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theCategoryPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        analysisEClass.getESuperTypes().add(theInformationreportingPackage.getReportGroup());
        analysisContextEClass.getESuperTypes().add(theInformationreportingPackage.getReportGroup());
        analysisParametersEClass.getESuperTypes().add(theInformationreportingPackage.getReportGroup());
        analysisResultEClass.getESuperTypes().add(theInformationreportingPackage.getReportGroup());

        // Initialize classes and features; add operations and parameters
        initEClass(analysisEClass, Analysis.class, "Analysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnalysis_Context(), this.getAnalysisContext(), null, "context", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnalysis_Results(), this.getAnalysisResult(), this.getAnalysisResult_Analysis(), "results", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnalysis_Parameters(), this.getAnalysisParameters(), null, "parameters", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnalysis_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnalysis_ContextType(), theTalendFilePackage.getContextType(), null, "contextType", null, 0, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnalysis_DefaultContext(), theXMLTypePackage.getString(), "defaultContext", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(analysisContextEClass, AnalysisContext.class, "AnalysisContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnalysisContext_Connection(), theSoftwaredeploymentPackage.getDataManager(), null, "connection", null, 0, 1, AnalysisContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnalysisContext_AnalysedElements(), theCorePackage.getModelElement(), null, "analysedElements", null, 0, -1, AnalysisContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(analysisParametersEClass, AnalysisParameters.class, "AnalysisParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnalysisParameters_DataFilter(), theDomainPackage.getDomain(), null, "dataFilter", null, 0, -1, AnalysisParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnalysisParameters_IndicatorValidationDomains(), theDomainPackage.getDomain(), null, "indicatorValidationDomains", null, 0, -1, AnalysisParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnalysisParameters_DataValidationDomains(), theDomainPackage.getDomain(), null, "dataValidationDomains", null, 0, -1, AnalysisParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnalysisParameters_AnalysisType(), this.getAnalysisType(), "analysisType", "", 0, 1, AnalysisParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnalysisParameters_DeactivatedIndicators(), theIndicatorsPackage.getIndicator(), null, "deactivatedIndicators", null, 0, -1, AnalysisParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnalysisParameters_ExecutionLanguage(), this.getExecutionLanguage(), "executionLanguage", null, 0, 1, AnalysisParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnalysisParameters_StoreData(), ecorePackage.getEBoolean(), "storeData", "true", 0, 1, AnalysisParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnalysisParameters_MaxNumberRows(), ecorePackage.getEInt(), "maxNumberRows", "50", 0, 1, AnalysisParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnalysisParameters_SampleDataShowWay(), this.getSampleDataShowWay(), "sampleDataShowWay", "", 0, 1, AnalysisParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(analysisResultEClass, AnalysisResult.class, "AnalysisResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnalysisResult_Analysis(), this.getAnalysis(), this.getAnalysis_Results(), "analysis", null, 0, 1, AnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnalysisResult_ResultMetadata(), this.getExecutionInformations(), null, "resultMetadata", null, 0, 1, AnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnalysisResult_Indicators(), theIndicatorsPackage.getIndicator(), null, "indicators", null, 0, -1, AnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnalysisResult_IndicToRowMap(), this.getIndicToRowsMap(), null, "indicToRowMap", null, 0, -1, AnalysisResult.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(executionInformationsEClass, ExecutionInformations.class, "ExecutionInformations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExecutionInformations_ExecutionDate(), ecorePackage.getEDate(), "executionDate", null, 0, 1, ExecutionInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExecutionInformations_ExecutionDuration(), ecorePackage.getEInt(), "executionDuration", null, 0, 1, ExecutionInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExecutionInformations_Message(), ecorePackage.getEString(), "message", null, 0, 1, ExecutionInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExecutionInformations_ExecutionNumber(), ecorePackage.getEInt(), "executionNumber", null, 0, 1, ExecutionInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExecutionInformations_LastRunOk(), ecorePackage.getEBoolean(), "lastRunOk", null, 0, 1, ExecutionInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExecutionInformations_LastExecutionNumberOk(), ecorePackage.getEInt(), "lastExecutionNumberOk", null, 0, 1, ExecutionInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExecutionInformations_OutThreshold(), ecorePackage.getEBoolean(), "outThreshold", null, 0, 1, ExecutionInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(indicToRowsMapEClass, Map.Entry.class, "IndicToRowsMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIndicToRowsMap_Key(), theIndicatorsPackage.getIndicator(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIndicToRowsMap_Value(), this.getAnalyzedDataSet(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(analyzedDataSetEClass, AnalyzedDataSet.class, "AnalyzedDataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAnalyzedDataSet_DataCount(), ecorePackage.getEInt(), "dataCount", null, 0, 1, AnalyzedDataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnalyzedDataSet_RecordSize(), ecorePackage.getEInt(), "recordSize", null, 0, 1, AnalyzedDataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnalyzedDataSet_Data(), theIndicatorsPackage.getObjectArray(), "data", null, 0, 1, AnalyzedDataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnalyzedDataSet_PatternData(), theColumnsetPackage.getListObject(), "patternData", null, 0, 1, AnalyzedDataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(theIndicatorsPackage.getObjectArray());
        g1.getETypeArguments().add(g2);
        initEAttribute(getAnalyzedDataSet_FrequencyData(), g1, "frequencyData", null, 0, 1, AnalyzedDataSet.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(analysisTypeEEnum, AnalysisType.class, "AnalysisType");
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.COLUMN);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.COLUMNS_COMPARISON);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.TABLE);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.TABLE_COMPARISON);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.TABLE_FUNCTIONAL_DEPENDENCY);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.CONNECTION);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.SCHEMA);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.MULTIPLE_COLUMN);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.CATALOG);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.COLUMN_CORRELATION);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.COLUMN_SET);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.BUSINESS_RULE);
        addEEnumLiteral(analysisTypeEEnum, AnalysisType.MATCH_ANALYSIS);

        initEEnum(executionLanguageEEnum, ExecutionLanguage.class, "ExecutionLanguage");
        addEEnumLiteral(executionLanguageEEnum, ExecutionLanguage.SQL);
        addEEnumLiteral(executionLanguageEEnum, ExecutionLanguage.JAVA);

        initEEnum(sampleDataShowWayEEnum, SampleDataShowWay.class, "SampleDataShowWay");
        addEEnumLiteral(sampleDataShowWayEEnum, SampleDataShowWay.FIRST);
        addEEnumLiteral(sampleDataShowWayEEnum, SampleDataShowWay.RANDOM);

        // Create resource
        createResource(eNS_URI);
    }

} //AnalysisPackageImpl
