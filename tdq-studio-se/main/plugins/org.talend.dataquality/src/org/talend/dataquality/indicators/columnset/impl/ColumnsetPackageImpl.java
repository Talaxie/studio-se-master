/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.columnset.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.cwm.relational.RelationalPackage;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.category.CategoryPackage;
import org.talend.dataquality.analysis.category.impl.CategoryPackageImpl;
import org.talend.dataquality.analysis.impl.AnalysisPackageImpl;
import org.talend.dataquality.domain.DomainPackage;
import org.talend.dataquality.domain.impl.DomainPackageImpl;
import org.talend.dataquality.domain.pattern.PatternPackage;
import org.talend.dataquality.domain.pattern.impl.PatternPackageImpl;
import org.talend.dataquality.domain.sql.SQLPackage;
import org.talend.dataquality.domain.sql.impl.SQLPackageImpl;
import org.talend.dataquality.expressions.ExpressionsPackage;
import org.talend.dataquality.expressions.impl.ExpressionsPackageImpl;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.columnset.AllMatchIndicator;
import org.talend.dataquality.indicators.columnset.BlockKeyIndicator;
import org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator;
import org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator;
import org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator;
import org.talend.dataquality.indicators.columnset.ColumnsetFactory;
import org.talend.dataquality.indicators.columnset.ColumnsetPackage;
import org.talend.dataquality.indicators.columnset.CountAvgNullIndicator;
import org.talend.dataquality.indicators.columnset.MinMaxDateIndicator;
import org.talend.dataquality.indicators.columnset.RecordMatchingIndicator;
import org.talend.dataquality.indicators.columnset.RowMatchingIndicator;
import org.talend.dataquality.indicators.columnset.SimpleStatIndicator;
import org.talend.dataquality.indicators.columnset.ValueMatchingIndicator;
import org.talend.dataquality.indicators.columnset.WeakCorrelationIndicator;
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
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnsetPackageImpl extends EPackageImpl implements ColumnsetPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass columnsCompareIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valueMatchingIndicatorEClass = null;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rowMatchingIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass columnSetMultiValueIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass allMatchIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass countAvgNullIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass minMaxDateIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass weakCorrelationIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass columnDependencyIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleStatIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass blockKeyIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass recordMatchingIndicatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType listObjectEDataType = null;

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
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ColumnsetPackageImpl() {
        super(eNS_URI, ColumnsetFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ColumnsetPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ColumnsetPackage init() {
        if (isInited) return (ColumnsetPackage)EPackage.Registry.INSTANCE.getEPackage(ColumnsetPackage.eNS_URI);

        // Obtain or create and register package
        ColumnsetPackageImpl theColumnsetPackage = (ColumnsetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ColumnsetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ColumnsetPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PropertiesPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI) instanceof AnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI) : AnalysisPackage.eINSTANCE);
        CategoryPackageImpl theCategoryPackage = (CategoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI) instanceof CategoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI) : CategoryPackage.eINSTANCE);
        ReportsPackageImpl theReportsPackage = (ReportsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportsPackage.eNS_URI) instanceof ReportsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportsPackage.eNS_URI) : ReportsPackage.eINSTANCE);
        IndicatorsPackageImpl theIndicatorsPackage = (IndicatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI) instanceof IndicatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI) : IndicatorsPackage.eINSTANCE);
        SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) instanceof SchemaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) : SchemaPackage.eINSTANCE);
        DefinitionPackageImpl theDefinitionPackage = (DefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DefinitionPackage.eNS_URI) instanceof DefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DefinitionPackage.eNS_URI) : DefinitionPackage.eINSTANCE);
        UserdefinePackageImpl theUserdefinePackage = (UserdefinePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UserdefinePackage.eNS_URI) instanceof UserdefinePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UserdefinePackage.eNS_URI) : UserdefinePackage.eINSTANCE);
        IndicatorSqlPackageImpl theIndicatorSqlPackage = (IndicatorSqlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndicatorSqlPackage.eNS_URI) instanceof IndicatorSqlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndicatorSqlPackage.eNS_URI) : IndicatorSqlPackage.eINSTANCE);
        ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
        DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        SQLPackageImpl theSQLPackage = (SQLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLPackage.eNS_URI) instanceof SQLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLPackage.eNS_URI) : SQLPackage.eINSTANCE);
        RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
        PropertiesPackageImpl thePropertiesPackage_1 = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.talend.dataquality.properties.PropertiesPackage.eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.talend.dataquality.properties.PropertiesPackage.eNS_URI) : org.talend.dataquality.properties.PropertiesPackage.eINSTANCE);

        // Create package meta-data objects
        theColumnsetPackage.createPackageContents();
        theAnalysisPackage.createPackageContents();
        theCategoryPackage.createPackageContents();
        theReportsPackage.createPackageContents();
        theIndicatorsPackage.createPackageContents();
        theSchemaPackage.createPackageContents();
        theDefinitionPackage.createPackageContents();
        theUserdefinePackage.createPackageContents();
        theIndicatorSqlPackage.createPackageContents();
        theExpressionsPackage.createPackageContents();
        theDomainPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theSQLPackage.createPackageContents();
        theRulesPackage.createPackageContents();
        thePropertiesPackage_1.createPackageContents();

        // Initialize created meta-data
        theColumnsetPackage.initializePackageContents();
        theAnalysisPackage.initializePackageContents();
        theCategoryPackage.initializePackageContents();
        theReportsPackage.initializePackageContents();
        theIndicatorsPackage.initializePackageContents();
        theSchemaPackage.initializePackageContents();
        theDefinitionPackage.initializePackageContents();
        theUserdefinePackage.initializePackageContents();
        theIndicatorSqlPackage.initializePackageContents();
        theExpressionsPackage.initializePackageContents();
        theDomainPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theSQLPackage.initializePackageContents();
        theRulesPackage.initializePackageContents();
        thePropertiesPackage_1.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theColumnsetPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ColumnsetPackage.eNS_URI, theColumnsetPackage);
        return theColumnsetPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColumnsCompareIndicator() {
        return columnsCompareIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnsCompareIndicator_ColumnSetA() {
        return (EReference)columnsCompareIndicatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnsCompareIndicator_ColumnSetB() {
        return (EReference)columnsCompareIndicatorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getValueMatchingIndicator() {
        return valueMatchingIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRowMatchingIndicator() {
        return rowMatchingIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColumnSetMultiValueIndicator() {
        return columnSetMultiValueIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnSetMultiValueIndicator_AnalyzedColumns() {
        return (EReference)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnSetMultiValueIndicator_ListRows() {
        return (EAttribute)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnSetMultiValueIndicator_NumericFunctions() {
        return (EAttribute)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnSetMultiValueIndicator_NominalColumns() {
        return (EReference)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnSetMultiValueIndicator_NumericColumns() {
        return (EReference)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnSetMultiValueIndicator_ColumnHeaders() {
        return (EAttribute)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnSetMultiValueIndicator_DateFunctions() {
        return (EAttribute)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnSetMultiValueIndicator_DateColumns() {
        return (EReference)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnSetMultiValueIndicator_UniqueCount() {
        return (EAttribute)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnSetMultiValueIndicator_DistinctCount() {
        return (EAttribute)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnSetMultiValueIndicator_DuplicateCount() {
        return (EAttribute)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnSetMultiValueIndicator_RowCountIndicator() {
        return (EReference)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnSetMultiValueIndicator_UniqueCountIndicator() {
        return (EReference)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnSetMultiValueIndicator_DistinctCountIndicator() {
        return (EReference)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnSetMultiValueIndicator_DuplicateCountIndicator() {
        return (EReference)columnSetMultiValueIndicatorEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAllMatchIndicator() {
        return allMatchIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAllMatchIndicator_CompositeRegexMatchingIndicators() {
        return (EReference)allMatchIndicatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCountAvgNullIndicator() {
        return countAvgNullIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMinMaxDateIndicator() {
        return minMaxDateIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWeakCorrelationIndicator() {
        return weakCorrelationIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColumnDependencyIndicator() {
        return columnDependencyIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnDependencyIndicator_ColumnA() {
        return (EReference)columnDependencyIndicatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnDependencyIndicator_ColumnB() {
        return (EReference)columnDependencyIndicatorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnDependencyIndicator_ACount() {
        return (EAttribute)columnDependencyIndicatorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnDependencyIndicator_DistinctACount() {
        return (EAttribute)columnDependencyIndicatorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnDependencyIndicator_DependencyFactor() {
        return (EAttribute)columnDependencyIndicatorEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleStatIndicator() {
        return simpleStatIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBlockKeyIndicator() {
        return blockKeyIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBlockKeyIndicator_BlockSize2frequency() {
        return (EAttribute)blockKeyIndicatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRecordMatchingIndicator() {
        return recordMatchingIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordMatchingIndicator_GroupSize2groupFrequency() {
        return (EAttribute)recordMatchingIndicatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordMatchingIndicator_MatchedRecordCount() {
        return (EAttribute)recordMatchingIndicatorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecordMatchingIndicator_SuspectRecordCount() {
        return (EAttribute)recordMatchingIndicatorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecordMatchingIndicator_BuiltInMatchRuleDefinition() {
        return (EReference)recordMatchingIndicatorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getListObject() {
        return listObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColumnsetFactory getColumnsetFactory() {
        return (ColumnsetFactory)getEFactoryInstance();
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
        columnsCompareIndicatorEClass = createEClass(COLUMNS_COMPARE_INDICATOR);
        createEReference(columnsCompareIndicatorEClass, COLUMNS_COMPARE_INDICATOR__COLUMN_SET_A);
        createEReference(columnsCompareIndicatorEClass, COLUMNS_COMPARE_INDICATOR__COLUMN_SET_B);

        valueMatchingIndicatorEClass = createEClass(VALUE_MATCHING_INDICATOR);

        rowMatchingIndicatorEClass = createEClass(ROW_MATCHING_INDICATOR);

        columnSetMultiValueIndicatorEClass = createEClass(COLUMN_SET_MULTI_VALUE_INDICATOR);
        createEReference(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__ANALYZED_COLUMNS);
        createEAttribute(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__LIST_ROWS);
        createEAttribute(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_FUNCTIONS);
        createEReference(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__NOMINAL_COLUMNS);
        createEReference(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__NUMERIC_COLUMNS);
        createEAttribute(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__COLUMN_HEADERS);
        createEAttribute(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_FUNCTIONS);
        createEReference(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__DATE_COLUMNS);
        createEAttribute(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT);
        createEAttribute(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT);
        createEAttribute(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT);
        createEReference(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__ROW_COUNT_INDICATOR);
        createEReference(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__UNIQUE_COUNT_INDICATOR);
        createEReference(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__DISTINCT_COUNT_INDICATOR);
        createEReference(columnSetMultiValueIndicatorEClass, COLUMN_SET_MULTI_VALUE_INDICATOR__DUPLICATE_COUNT_INDICATOR);

        allMatchIndicatorEClass = createEClass(ALL_MATCH_INDICATOR);
        createEReference(allMatchIndicatorEClass, ALL_MATCH_INDICATOR__COMPOSITE_REGEX_MATCHING_INDICATORS);

        countAvgNullIndicatorEClass = createEClass(COUNT_AVG_NULL_INDICATOR);

        minMaxDateIndicatorEClass = createEClass(MIN_MAX_DATE_INDICATOR);

        weakCorrelationIndicatorEClass = createEClass(WEAK_CORRELATION_INDICATOR);

        columnDependencyIndicatorEClass = createEClass(COLUMN_DEPENDENCY_INDICATOR);
        createEReference(columnDependencyIndicatorEClass, COLUMN_DEPENDENCY_INDICATOR__COLUMN_A);
        createEReference(columnDependencyIndicatorEClass, COLUMN_DEPENDENCY_INDICATOR__COLUMN_B);
        createEAttribute(columnDependencyIndicatorEClass, COLUMN_DEPENDENCY_INDICATOR__ACOUNT);
        createEAttribute(columnDependencyIndicatorEClass, COLUMN_DEPENDENCY_INDICATOR__DISTINCT_ACOUNT);
        createEAttribute(columnDependencyIndicatorEClass, COLUMN_DEPENDENCY_INDICATOR__DEPENDENCY_FACTOR);

        simpleStatIndicatorEClass = createEClass(SIMPLE_STAT_INDICATOR);

        blockKeyIndicatorEClass = createEClass(BLOCK_KEY_INDICATOR);
        createEAttribute(blockKeyIndicatorEClass, BLOCK_KEY_INDICATOR__BLOCK_SIZE2FREQUENCY);

        recordMatchingIndicatorEClass = createEClass(RECORD_MATCHING_INDICATOR);
        createEAttribute(recordMatchingIndicatorEClass, RECORD_MATCHING_INDICATOR__GROUP_SIZE2GROUP_FREQUENCY);
        createEAttribute(recordMatchingIndicatorEClass, RECORD_MATCHING_INDICATOR__MATCHED_RECORD_COUNT);
        createEAttribute(recordMatchingIndicatorEClass, RECORD_MATCHING_INDICATOR__SUSPECT_RECORD_COUNT);
        createEReference(recordMatchingIndicatorEClass, RECORD_MATCHING_INDICATOR__BUILT_IN_MATCH_RULE_DEFINITION);

        // Create data types
        listObjectEDataType = createEDataType(LIST_OBJECT);
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
        IndicatorsPackage theIndicatorsPackage = (IndicatorsPackage)EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI);
        RelationalPackage theRelationalPackage = (RelationalPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalPackage.eNS_URI);
        CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
        RulesPackage theRulesPackage = (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        columnsCompareIndicatorEClass.getESuperTypes().add(theIndicatorsPackage.getMatchingIndicator());
        valueMatchingIndicatorEClass.getESuperTypes().add(this.getColumnsCompareIndicator());
        rowMatchingIndicatorEClass.getESuperTypes().add(this.getColumnsCompareIndicator());
        columnSetMultiValueIndicatorEClass.getESuperTypes().add(theIndicatorsPackage.getCompositeIndicator());
        allMatchIndicatorEClass.getESuperTypes().add(this.getColumnSetMultiValueIndicator());
        allMatchIndicatorEClass.getESuperTypes().add(theIndicatorsPackage.getRegexpMatchingIndicator());
        countAvgNullIndicatorEClass.getESuperTypes().add(this.getColumnSetMultiValueIndicator());
        minMaxDateIndicatorEClass.getESuperTypes().add(this.getColumnSetMultiValueIndicator());
        weakCorrelationIndicatorEClass.getESuperTypes().add(this.getColumnSetMultiValueIndicator());
        columnDependencyIndicatorEClass.getESuperTypes().add(theIndicatorsPackage.getIndicator());
        simpleStatIndicatorEClass.getESuperTypes().add(this.getColumnSetMultiValueIndicator());
        blockKeyIndicatorEClass.getESuperTypes().add(this.getColumnSetMultiValueIndicator());
        recordMatchingIndicatorEClass.getESuperTypes().add(this.getColumnSetMultiValueIndicator());

        // Initialize classes and features; add operations and parameters
        initEClass(columnsCompareIndicatorEClass, ColumnsCompareIndicator.class, "ColumnsCompareIndicator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getColumnsCompareIndicator_ColumnSetA(), theRelationalPackage.getTdColumn(), null, "columnSetA", null, 0, -1, ColumnsCompareIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumnsCompareIndicator_ColumnSetB(), theRelationalPackage.getTdColumn(), null, "columnSetB", null, 0, -1, ColumnsCompareIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(valueMatchingIndicatorEClass, ValueMatchingIndicator.class, "ValueMatchingIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rowMatchingIndicatorEClass, RowMatchingIndicator.class, "RowMatchingIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(columnSetMultiValueIndicatorEClass, ColumnSetMultiValueIndicator.class, "ColumnSetMultiValueIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getColumnSetMultiValueIndicator_AnalyzedColumns(), theCorePackage.getModelElement(), null, "analyzedColumns", null, 0, -1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnSetMultiValueIndicator_ListRows(), theIndicatorsPackage.getObjectArray(), "listRows", null, 0, 1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnSetMultiValueIndicator_NumericFunctions(), ecorePackage.getEString(), "numericFunctions", null, 0, -1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumnSetMultiValueIndicator_NominalColumns(), theCorePackage.getModelElement(), null, "nominalColumns", null, 0, -1, ColumnSetMultiValueIndicator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumnSetMultiValueIndicator_NumericColumns(), theCorePackage.getModelElement(), null, "numericColumns", null, 0, -1, ColumnSetMultiValueIndicator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnSetMultiValueIndicator_ColumnHeaders(), ecorePackage.getEString(), "columnHeaders", null, 0, -1, ColumnSetMultiValueIndicator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnSetMultiValueIndicator_DateFunctions(), ecorePackage.getEString(), "dateFunctions", null, 0, -1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumnSetMultiValueIndicator_DateColumns(), theCorePackage.getModelElement(), null, "dateColumns", null, 0, -1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnSetMultiValueIndicator_UniqueCount(), ecorePackage.getELongObject(), "uniqueCount", null, 0, 1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnSetMultiValueIndicator_DistinctCount(), ecorePackage.getELongObject(), "distinctCount", null, 0, 1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnSetMultiValueIndicator_DuplicateCount(), ecorePackage.getELongObject(), "duplicateCount", null, 0, 1, ColumnSetMultiValueIndicator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumnSetMultiValueIndicator_RowCountIndicator(), theIndicatorsPackage.getRowCountIndicator(), null, "rowCountIndicator", null, 0, 1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumnSetMultiValueIndicator_UniqueCountIndicator(), theIndicatorsPackage.getUniqueCountIndicator(), null, "uniqueCountIndicator", null, 0, 1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumnSetMultiValueIndicator_DistinctCountIndicator(), theIndicatorsPackage.getDistinctCountIndicator(), null, "distinctCountIndicator", null, 0, 1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumnSetMultiValueIndicator_DuplicateCountIndicator(), theIndicatorsPackage.getDuplicateCountIndicator(), null, "duplicateCountIndicator", null, 0, 1, ColumnSetMultiValueIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(allMatchIndicatorEClass, AllMatchIndicator.class, "AllMatchIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAllMatchIndicator_CompositeRegexMatchingIndicators(), theIndicatorsPackage.getRegexpMatchingIndicator(), null, "compositeRegexMatchingIndicators", null, 0, -1, AllMatchIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(countAvgNullIndicatorEClass, CountAvgNullIndicator.class, "CountAvgNullIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(minMaxDateIndicatorEClass, MinMaxDateIndicator.class, "MinMaxDateIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(weakCorrelationIndicatorEClass, WeakCorrelationIndicator.class, "WeakCorrelationIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(columnDependencyIndicatorEClass, ColumnDependencyIndicator.class, "ColumnDependencyIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getColumnDependencyIndicator_ColumnA(), theRelationalPackage.getTdColumn(), null, "columnA", null, 0, 1, ColumnDependencyIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumnDependencyIndicator_ColumnB(), theRelationalPackage.getTdColumn(), null, "columnB", null, 0, 1, ColumnDependencyIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnDependencyIndicator_ACount(), ecorePackage.getELongObject(), "aCount", null, 0, 1, ColumnDependencyIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnDependencyIndicator_DistinctACount(), ecorePackage.getELongObject(), "distinctACount", null, 0, 1, ColumnDependencyIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnDependencyIndicator_DependencyFactor(), ecorePackage.getEDoubleObject(), "dependencyFactor", null, 0, 1, ColumnDependencyIndicator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(simpleStatIndicatorEClass, SimpleStatIndicator.class, "SimpleStatIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(blockKeyIndicatorEClass, BlockKeyIndicator.class, "BlockKeyIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBlockKeyIndicator_BlockSize2frequency(), theIndicatorsPackage.getJavaTreeMap(), "blockSize2frequency", null, 0, 1, BlockKeyIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(recordMatchingIndicatorEClass, RecordMatchingIndicator.class, "RecordMatchingIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRecordMatchingIndicator_GroupSize2groupFrequency(), theIndicatorsPackage.getJavaTreeMap(), "groupSize2groupFrequency", null, 0, 1, RecordMatchingIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRecordMatchingIndicator_MatchedRecordCount(), theEcorePackage.getELong(), "matchedRecordCount", null, 0, 1, RecordMatchingIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRecordMatchingIndicator_SuspectRecordCount(), theEcorePackage.getELong(), "suspectRecordCount", null, 0, 1, RecordMatchingIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRecordMatchingIndicator_BuiltInMatchRuleDefinition(), theRulesPackage.getMatchRuleDefinition(), null, "builtInMatchRuleDefinition", null, 0, 1, RecordMatchingIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(listObjectEDataType, List.class, "ListObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<Object>");

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
        addAnnotation
          (columnDependencyIndicatorEClass, 
           source, 
           new String[] {
             "name", "ColumnDependencyIndicator"
           });
    }

} //ColumnsetPackageImpl
