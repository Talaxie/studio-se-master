/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
import org.talend.dataquality.indicators.columnset.ColumnsetPackage;
import org.talend.dataquality.indicators.columnset.impl.ColumnsetPackageImpl;
import org.talend.dataquality.indicators.definition.CharactersMapping;
import org.talend.dataquality.indicators.definition.DefinitionFactory;
import org.talend.dataquality.indicators.definition.DefinitionPackage;
import org.talend.dataquality.indicators.definition.IndicatorCategory;
import org.talend.dataquality.indicators.definition.IndicatorDefinition;
import org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter;
import org.talend.dataquality.indicators.definition.IndicatorsDefinitions;
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
import orgomg.mof.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionPackageImpl extends EPackageImpl implements DefinitionPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass indicatorsDefinitionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass indicatorDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass indicatorCategoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass charactersMappingEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass indicatorDefinitionParameterEClass = null;

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
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DefinitionPackageImpl() {
        super(eNS_URI, DefinitionFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DefinitionPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DefinitionPackage init() {
        if (isInited) return (DefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(DefinitionPackage.eNS_URI);

        // Obtain or create and register package
        DefinitionPackageImpl theDefinitionPackage = (DefinitionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DefinitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DefinitionPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PropertiesPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI) instanceof AnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI) : AnalysisPackage.eINSTANCE);
        CategoryPackageImpl theCategoryPackage = (CategoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI) instanceof CategoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI) : CategoryPackage.eINSTANCE);
        ReportsPackageImpl theReportsPackage = (ReportsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportsPackage.eNS_URI) instanceof ReportsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportsPackage.eNS_URI) : ReportsPackage.eINSTANCE);
        IndicatorsPackageImpl theIndicatorsPackage = (IndicatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI) instanceof IndicatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI) : IndicatorsPackage.eINSTANCE);
        SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) instanceof SchemaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) : SchemaPackage.eINSTANCE);
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
        theDefinitionPackage.createPackageContents();
        theAnalysisPackage.createPackageContents();
        theCategoryPackage.createPackageContents();
        theReportsPackage.createPackageContents();
        theIndicatorsPackage.createPackageContents();
        theSchemaPackage.createPackageContents();
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
        theDefinitionPackage.initializePackageContents();
        theAnalysisPackage.initializePackageContents();
        theCategoryPackage.initializePackageContents();
        theReportsPackage.initializePackageContents();
        theIndicatorsPackage.initializePackageContents();
        theSchemaPackage.initializePackageContents();
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
        theDefinitionPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DefinitionPackage.eNS_URI, theDefinitionPackage);
        return theDefinitionPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIndicatorsDefinitions() {
        return indicatorsDefinitionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicatorsDefinitions_IndicatorDefinitions() {
        return (EReference)indicatorsDefinitionsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicatorsDefinitions_Categories() {
        return (EReference)indicatorsDefinitionsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIndicatorDefinition() {
        return indicatorDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicatorDefinition_Categories() {
        return (EReference)indicatorDefinitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicatorDefinition_AggregatedDefinitions() {
        return (EReference)indicatorDefinitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIndicatorDefinition_Label() {
        return (EAttribute)indicatorDefinitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicatorDefinition_SubCategories() {
        return (EReference)indicatorDefinitionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicatorDefinition_SqlGenericExpression() {
        return (EReference)indicatorDefinitionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicatorDefinition_Aggregate1argFunctions() {
        return (EReference)indicatorDefinitionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicatorDefinition_Date1argFunctions() {
        return (EReference)indicatorDefinitionEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIndicatorDefinition_CharactersMapping() {
        return (EReference)indicatorDefinitionEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIndicatorDefinition_IndicatorDefinitionParameter() {
        return (EReference)indicatorDefinitionEClass.getEStructuralFeatures().get(8);
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIndicatorCategory() {
        return indicatorCategoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIndicatorCategory_Label() {
        return (EAttribute)indicatorCategoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCharactersMapping() {
        return charactersMappingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCharactersMapping_Language() {
        return (EAttribute)charactersMappingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCharactersMapping_CharactersToReplace() {
        return (EAttribute)charactersMappingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCharactersMapping_ReplacementCharacters() {
        return (EAttribute)charactersMappingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIndicatorDefinitionParameter() {
        return indicatorDefinitionParameterEClass;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIndicatorDefinitionParameter_Key() {
        return (EAttribute)indicatorDefinitionParameterEClass.getEStructuralFeatures().get(0);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIndicatorDefinitionParameter_Value() {
        return (EAttribute)indicatorDefinitionParameterEClass.getEStructuralFeatures().get(1);
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefinitionFactory getDefinitionFactory() {
        return (DefinitionFactory)getEFactoryInstance();
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
        indicatorsDefinitionsEClass = createEClass(INDICATORS_DEFINITIONS);
        createEReference(indicatorsDefinitionsEClass, INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS);
        createEReference(indicatorsDefinitionsEClass, INDICATORS_DEFINITIONS__CATEGORIES);

        indicatorDefinitionEClass = createEClass(INDICATOR_DEFINITION);
        createEReference(indicatorDefinitionEClass, INDICATOR_DEFINITION__CATEGORIES);
        createEReference(indicatorDefinitionEClass, INDICATOR_DEFINITION__AGGREGATED_DEFINITIONS);
        createEAttribute(indicatorDefinitionEClass, INDICATOR_DEFINITION__LABEL);
        createEReference(indicatorDefinitionEClass, INDICATOR_DEFINITION__SUB_CATEGORIES);
        createEReference(indicatorDefinitionEClass, INDICATOR_DEFINITION__SQL_GENERIC_EXPRESSION);
        createEReference(indicatorDefinitionEClass, INDICATOR_DEFINITION__AGGREGATE1ARG_FUNCTIONS);
        createEReference(indicatorDefinitionEClass, INDICATOR_DEFINITION__DATE1ARG_FUNCTIONS);
        createEReference(indicatorDefinitionEClass, INDICATOR_DEFINITION__CHARACTERS_MAPPING);
        createEReference(indicatorDefinitionEClass, INDICATOR_DEFINITION__INDICATOR_DEFINITION_PARAMETER);

        indicatorCategoryEClass = createEClass(INDICATOR_CATEGORY);
        createEAttribute(indicatorCategoryEClass, INDICATOR_CATEGORY__LABEL);

        charactersMappingEClass = createEClass(CHARACTERS_MAPPING);
        createEAttribute(charactersMappingEClass, CHARACTERS_MAPPING__LANGUAGE);
        createEAttribute(charactersMappingEClass, CHARACTERS_MAPPING__CHARACTERS_TO_REPLACE);
        createEAttribute(charactersMappingEClass, CHARACTERS_MAPPING__REPLACEMENT_CHARACTERS);

        indicatorDefinitionParameterEClass = createEClass(INDICATOR_DEFINITION_PARAMETER);
        createEAttribute(indicatorDefinitionParameterEClass, INDICATOR_DEFINITION_PARAMETER__KEY);
        createEAttribute(indicatorDefinitionParameterEClass, INDICATOR_DEFINITION_PARAMETER__VALUE);
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
        UserdefinePackage theUserdefinePackage = (UserdefinePackage)EPackage.Registry.INSTANCE.getEPackage(UserdefinePackage.eNS_URI);
        CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
        RelationalPackage theRelationalPackage = (RelationalPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalPackage.eNS_URI);
        ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theUserdefinePackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        indicatorsDefinitionsEClass.getESuperTypes().add(theCorePackage.getModelElement());
        indicatorDefinitionEClass.getESuperTypes().add(theCorePackage.getModelElement());
        indicatorCategoryEClass.getESuperTypes().add(theCorePackage.getModelElement());
        charactersMappingEClass.getESuperTypes().add(theCorePackage.getModelElement());
        indicatorDefinitionParameterEClass.getESuperTypes().add(theModelPackage.getModelElement());

        // Initialize classes and features; add operations and parameters
        initEClass(indicatorsDefinitionsEClass, IndicatorsDefinitions.class, "IndicatorsDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIndicatorsDefinitions_IndicatorDefinitions(), this.getIndicatorDefinition(), null, "indicatorDefinitions", null, 0, -1, IndicatorsDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIndicatorsDefinitions_Categories(), this.getIndicatorCategory(), null, "categories", null, 0, -1, IndicatorsDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(indicatorDefinitionEClass, IndicatorDefinition.class, "IndicatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIndicatorDefinition_Categories(), this.getIndicatorCategory(), null, "categories", null, 0, -1, IndicatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIndicatorDefinition_AggregatedDefinitions(), this.getIndicatorDefinition(), null, "aggregatedDefinitions", null, 0, -1, IndicatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIndicatorDefinition_Label(), ecorePackage.getEString(), "label", null, 0, 1, IndicatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIndicatorDefinition_SubCategories(), this.getIndicatorCategory(), null, "subCategories", null, 0, -1, IndicatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIndicatorDefinition_SqlGenericExpression(), theRelationalPackage.getTdExpression(), null, "sqlGenericExpression", null, 0, -1, IndicatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIndicatorDefinition_Aggregate1argFunctions(), theRelationalPackage.getTdExpression(), null, "aggregate1argFunctions", null, 0, -1, IndicatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIndicatorDefinition_Date1argFunctions(), theRelationalPackage.getTdExpression(), null, "date1argFunctions", null, 0, -1, IndicatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIndicatorDefinition_CharactersMapping(), this.getCharactersMapping(), null, "charactersMapping", null, 0, -1, IndicatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIndicatorDefinition_IndicatorDefinitionParameter(), this.getIndicatorDefinitionParameter(), null, "indicatorDefinitionParameter", null, 0, -1, IndicatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(indicatorCategoryEClass, IndicatorCategory.class, "IndicatorCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIndicatorCategory_Label(), ecorePackage.getEString(), "label", null, 0, 1, IndicatorCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(charactersMappingEClass, CharactersMapping.class, "CharactersMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCharactersMapping_Language(), theCorePackage.getName_(), "language", null, 0, 1, CharactersMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCharactersMapping_CharactersToReplace(), theCorePackage.getString(), "charactersToReplace", null, 0, 1, CharactersMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCharactersMapping_ReplacementCharacters(), theCorePackage.getString(), "replacementCharacters", null, 0, 1, CharactersMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(indicatorDefinitionParameterEClass, IndicatorDefinitionParameter.class, "IndicatorDefinitionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIndicatorDefinitionParameter_Key(), ecorePackage.getEString(), "key", null, 0, 1, IndicatorDefinitionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIndicatorDefinitionParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, IndicatorDefinitionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //DefinitionPackageImpl
