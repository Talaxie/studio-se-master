/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.properties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import org.talend.dataquality.properties.PropertiesFactory;
import org.talend.dataquality.properties.PropertiesPackage;
import org.talend.dataquality.properties.TDQAnalysisItem;
import org.talend.dataquality.properties.TDQBusinessRuleItem;
import org.talend.dataquality.properties.TDQFileItem;
import org.talend.dataquality.properties.TDQIndicatorDefinitionItem;
import org.talend.dataquality.properties.TDQJrxmlItem;
import org.talend.dataquality.properties.TDQMatchRuleItem;
import org.talend.dataquality.properties.TDQPatternItem;
import org.talend.dataquality.properties.TDQReportItem;
import org.talend.dataquality.properties.TDQSourceFileItem;
import org.talend.dataquality.reports.ReportsPackage;
import org.talend.dataquality.reports.impl.ReportsPackageImpl;
import org.talend.dataquality.rules.RulesPackage;
import org.talend.dataquality.rules.impl.RulesPackageImpl;
import orgomg.cwmx.analysis.informationreporting.InformationreportingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class PropertiesPackageImpl extends EPackageImpl implements PropertiesPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tdqAnalysisItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tdqReportItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tdqIndicatorDefinitionItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tdqBusinessRuleItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tdqPatternItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdqFileItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdqJrxmlItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdqSourceFileItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdqMatchRuleItemEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
     * EPackage.Registry} by the package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.dataquality.properties.PropertiesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private PropertiesPackageImpl() {
        super(eNS_URI, PropertiesFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link PropertiesPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static PropertiesPackage init() {
        if (isInited) return (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);

        // Obtain or create and register package
        PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PropertiesPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        org.talend.core.model.properties.PropertiesPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI) instanceof AnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI) : AnalysisPackage.eINSTANCE);
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

        // Create package meta-data objects
        thePropertiesPackage.createPackageContents();
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

        // Initialize created meta-data
        thePropertiesPackage.initializePackageContents();
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

        // Mark meta-data to indicate it can't be changed
        thePropertiesPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PropertiesPackage.eNS_URI, thePropertiesPackage);
        return thePropertiesPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDQAnalysisItem() {
        return tdqAnalysisItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDQAnalysisItem_Analysis() {
        return (EReference)tdqAnalysisItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDQReportItem() {
        return tdqReportItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDQReportItem_Report() {
        return (EReference)tdqReportItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDQIndicatorDefinitionItem() {
        return tdqIndicatorDefinitionItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDQIndicatorDefinitionItem_IndicatorDefinition() {
        return (EReference)tdqIndicatorDefinitionItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDQBusinessRuleItem() {
        return tdqBusinessRuleItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDQBusinessRuleItem_Dqrule() {
        return (EReference)tdqBusinessRuleItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDQPatternItem() {
        return tdqPatternItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDQPatternItem_Pattern() {
        return (EReference)tdqPatternItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDQFileItem() {
        return tdqFileItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDQJrxmlItem() {
        return tdqJrxmlItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDQSourceFileItem() {
        return tdqSourceFileItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTDQMatchRuleItem() {
        return tdqMatchRuleItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTDQMatchRuleItem_MatchRule() {
        return (EReference)tdqMatchRuleItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PropertiesFactory getPropertiesFactory() {
        return (PropertiesFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        tdqAnalysisItemEClass = createEClass(TDQ_ANALYSIS_ITEM);
        createEReference(tdqAnalysisItemEClass, TDQ_ANALYSIS_ITEM__ANALYSIS);

        tdqReportItemEClass = createEClass(TDQ_REPORT_ITEM);
        createEReference(tdqReportItemEClass, TDQ_REPORT_ITEM__REPORT);

        tdqIndicatorDefinitionItemEClass = createEClass(TDQ_INDICATOR_DEFINITION_ITEM);
        createEReference(tdqIndicatorDefinitionItemEClass, TDQ_INDICATOR_DEFINITION_ITEM__INDICATOR_DEFINITION);

        tdqBusinessRuleItemEClass = createEClass(TDQ_BUSINESS_RULE_ITEM);
        createEReference(tdqBusinessRuleItemEClass, TDQ_BUSINESS_RULE_ITEM__DQRULE);

        tdqPatternItemEClass = createEClass(TDQ_PATTERN_ITEM);
        createEReference(tdqPatternItemEClass, TDQ_PATTERN_ITEM__PATTERN);

        tdqFileItemEClass = createEClass(TDQ_FILE_ITEM);

        tdqJrxmlItemEClass = createEClass(TDQ_JRXML_ITEM);

        tdqSourceFileItemEClass = createEClass(TDQ_SOURCE_FILE_ITEM);

        tdqMatchRuleItemEClass = createEClass(TDQ_MATCH_RULE_ITEM);
        createEReference(tdqMatchRuleItemEClass, TDQ_MATCH_RULE_ITEM__MATCH_RULE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
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
        org.talend.core.model.properties.PropertiesPackage thePropertiesPackage_1 = (org.talend.core.model.properties.PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(org.talend.core.model.properties.PropertiesPackage.eNS_URI);
        AnalysisPackage theAnalysisPackage = (AnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);
        InformationreportingPackage theInformationreportingPackage = (InformationreportingPackage)EPackage.Registry.INSTANCE.getEPackage(InformationreportingPackage.eNS_URI);
        DefinitionPackage theDefinitionPackage = (DefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(DefinitionPackage.eNS_URI);
        RulesPackage theRulesPackage = (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);
        PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        tdqAnalysisItemEClass.getESuperTypes().add(thePropertiesPackage_1.getTDQItem());
        tdqReportItemEClass.getESuperTypes().add(thePropertiesPackage_1.getTDQItem());
        tdqIndicatorDefinitionItemEClass.getESuperTypes().add(thePropertiesPackage_1.getTDQItem());
        tdqBusinessRuleItemEClass.getESuperTypes().add(thePropertiesPackage_1.getTDQItem());
        tdqPatternItemEClass.getESuperTypes().add(thePropertiesPackage_1.getTDQItem());
        tdqFileItemEClass.getESuperTypes().add(thePropertiesPackage_1.getTDQItem());
        tdqFileItemEClass.getESuperTypes().add(thePropertiesPackage_1.getFileItem());
        tdqJrxmlItemEClass.getESuperTypes().add(this.getTDQFileItem());
        tdqSourceFileItemEClass.getESuperTypes().add(this.getTDQFileItem());
        tdqMatchRuleItemEClass.getESuperTypes().add(thePropertiesPackage_1.getTDQItem());

        // Initialize classes and features; add operations and parameters
        initEClass(tdqAnalysisItemEClass, TDQAnalysisItem.class, "TDQAnalysisItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDQAnalysisItem_Analysis(), theAnalysisPackage.getAnalysis(), null, "analysis", null, 0, 1, TDQAnalysisItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tdqReportItemEClass, TDQReportItem.class, "TDQReportItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDQReportItem_Report(), theInformationreportingPackage.getReport(), null, "report", null, 0, 1, TDQReportItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tdqIndicatorDefinitionItemEClass, TDQIndicatorDefinitionItem.class, "TDQIndicatorDefinitionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDQIndicatorDefinitionItem_IndicatorDefinition(), theDefinitionPackage.getIndicatorDefinition(), null, "indicatorDefinition", null, 0, 1, TDQIndicatorDefinitionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tdqBusinessRuleItemEClass, TDQBusinessRuleItem.class, "TDQBusinessRuleItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDQBusinessRuleItem_Dqrule(), theRulesPackage.getDQRule(), null, "dqrule", null, 0, 1, TDQBusinessRuleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tdqPatternItemEClass, TDQPatternItem.class, "TDQPatternItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDQPatternItem_Pattern(), thePatternPackage.getPattern(), null, "pattern", null, 0, 1, TDQPatternItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tdqFileItemEClass, TDQFileItem.class, "TDQFileItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tdqJrxmlItemEClass, TDQJrxmlItem.class, "TDQJrxmlItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tdqSourceFileItemEClass, TDQSourceFileItem.class, "TDQSourceFileItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tdqMatchRuleItemEClass, TDQMatchRuleItem.class, "TDQMatchRuleItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTDQMatchRuleItem_MatchRule(), theRulesPackage.getMatchRuleDefinition(), null, "matchRule", null, 0, 1, TDQMatchRuleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} // PropertiesPackageImpl
