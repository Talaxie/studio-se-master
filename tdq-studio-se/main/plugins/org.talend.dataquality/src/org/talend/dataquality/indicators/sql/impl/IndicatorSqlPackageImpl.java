/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.sql.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.talend.core.model.properties.PropertiesPackage;
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
import org.talend.dataquality.indicators.sql.IndicatorSqlFactory;
import org.talend.dataquality.indicators.sql.IndicatorSqlPackage;
import org.talend.dataquality.indicators.sql.JavaUserDefIndicator;
import org.talend.dataquality.indicators.sql.UserDefIndicator;
import org.talend.dataquality.indicators.sql.WhereRuleIndicator;
import org.talend.dataquality.properties.impl.PropertiesPackageImpl;
import org.talend.dataquality.reports.ReportsPackage;
import org.talend.dataquality.reports.impl.ReportsPackageImpl;
import org.talend.dataquality.rules.RulesPackage;
import org.talend.dataquality.rules.impl.RulesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class IndicatorSqlPackageImpl extends EPackageImpl implements IndicatorSqlPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass userDefIndicatorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass whereRuleIndicatorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass javaUserDefIndicatorEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
     * EPackage.Registry} by the package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private IndicatorSqlPackageImpl() {
        super(eNS_URI, IndicatorSqlFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>
     * This method is used to initialize {@link IndicatorSqlPackage#eINSTANCE} when that field is accessed. Clients
     * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static IndicatorSqlPackage init() {
        if (isInited) return (IndicatorSqlPackage)EPackage.Registry.INSTANCE.getEPackage(IndicatorSqlPackage.eNS_URI);

        // Obtain or create and register package
        IndicatorSqlPackageImpl theIndicatorSqlPackage = (IndicatorSqlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IndicatorSqlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IndicatorSqlPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PropertiesPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI) instanceof AnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI) : AnalysisPackage.eINSTANCE);
        CategoryPackageImpl theCategoryPackage = (CategoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI) instanceof CategoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI) : CategoryPackage.eINSTANCE);
        ReportsPackageImpl theReportsPackage = (ReportsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportsPackage.eNS_URI) instanceof ReportsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportsPackage.eNS_URI) : ReportsPackage.eINSTANCE);
        IndicatorsPackageImpl theIndicatorsPackage = (IndicatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI) instanceof IndicatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI) : IndicatorsPackage.eINSTANCE);
        SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) instanceof SchemaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) : SchemaPackage.eINSTANCE);
        DefinitionPackageImpl theDefinitionPackage = (DefinitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DefinitionPackage.eNS_URI) instanceof DefinitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DefinitionPackage.eNS_URI) : DefinitionPackage.eINSTANCE);
        UserdefinePackageImpl theUserdefinePackage = (UserdefinePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UserdefinePackage.eNS_URI) instanceof UserdefinePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UserdefinePackage.eNS_URI) : UserdefinePackage.eINSTANCE);
        ColumnsetPackageImpl theColumnsetPackage = (ColumnsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnsetPackage.eNS_URI) instanceof ColumnsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnsetPackage.eNS_URI) : ColumnsetPackage.eINSTANCE);
        ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
        DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        SQLPackageImpl theSQLPackage = (SQLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLPackage.eNS_URI) instanceof SQLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLPackage.eNS_URI) : SQLPackage.eINSTANCE);
        RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
        PropertiesPackageImpl thePropertiesPackage_1 = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.talend.dataquality.properties.PropertiesPackage.eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.talend.dataquality.properties.PropertiesPackage.eNS_URI) : org.talend.dataquality.properties.PropertiesPackage.eINSTANCE);

        // Create package meta-data objects
        theIndicatorSqlPackage.createPackageContents();
        theAnalysisPackage.createPackageContents();
        theCategoryPackage.createPackageContents();
        theReportsPackage.createPackageContents();
        theIndicatorsPackage.createPackageContents();
        theSchemaPackage.createPackageContents();
        theDefinitionPackage.createPackageContents();
        theUserdefinePackage.createPackageContents();
        theColumnsetPackage.createPackageContents();
        theExpressionsPackage.createPackageContents();
        theDomainPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theSQLPackage.createPackageContents();
        theRulesPackage.createPackageContents();
        thePropertiesPackage_1.createPackageContents();

        // Initialize created meta-data
        theIndicatorSqlPackage.initializePackageContents();
        theAnalysisPackage.initializePackageContents();
        theCategoryPackage.initializePackageContents();
        theReportsPackage.initializePackageContents();
        theIndicatorsPackage.initializePackageContents();
        theSchemaPackage.initializePackageContents();
        theDefinitionPackage.initializePackageContents();
        theUserdefinePackage.initializePackageContents();
        theColumnsetPackage.initializePackageContents();
        theExpressionsPackage.initializePackageContents();
        theDomainPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theSQLPackage.initializePackageContents();
        theRulesPackage.initializePackageContents();
        thePropertiesPackage_1.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theIndicatorSqlPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(IndicatorSqlPackage.eNS_URI, theIndicatorSqlPackage);
        return theIndicatorSqlPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUserDefIndicator() {
        return userDefIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUserDefIndicator_UserCount() {
        return (EAttribute)userDefIndicatorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUserDefIndicator_MatchingValueCount() {
        return (EAttribute)userDefIndicatorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUserDefIndicator_NotMatchingValueCount() {
        return (EAttribute)userDefIndicatorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUserDefIndicator_UniqueValues() {
        return (EAttribute)userDefIndicatorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUserDefIndicator_DistinctValueCount() {
        return (EAttribute)userDefIndicatorEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUserDefIndicator_UniqueValueCount() {
        return (EAttribute)userDefIndicatorEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUserDefIndicator_DuplicateValueCount() {
        return (EAttribute)userDefIndicatorEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUserDefIndicator_ValueToFreq() {
        return (EAttribute)userDefIndicatorEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUserDefIndicator_Value() {
        return (EAttribute)userDefIndicatorEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUserDefIndicator_Datatype() {
        return (EAttribute)userDefIndicatorEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getWhereRuleIndicator() {
        return whereRuleIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJavaUserDefIndicator() {
        return javaUserDefIndicatorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IndicatorSqlFactory getIndicatorSqlFactory() {
        return (IndicatorSqlFactory)getEFactoryInstance();
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
        userDefIndicatorEClass = createEClass(USER_DEF_INDICATOR);
        createEAttribute(userDefIndicatorEClass, USER_DEF_INDICATOR__USER_COUNT);
        createEAttribute(userDefIndicatorEClass, USER_DEF_INDICATOR__MATCHING_VALUE_COUNT);
        createEAttribute(userDefIndicatorEClass, USER_DEF_INDICATOR__NOT_MATCHING_VALUE_COUNT);
        createEAttribute(userDefIndicatorEClass, USER_DEF_INDICATOR__UNIQUE_VALUES);
        createEAttribute(userDefIndicatorEClass, USER_DEF_INDICATOR__DISTINCT_VALUE_COUNT);
        createEAttribute(userDefIndicatorEClass, USER_DEF_INDICATOR__UNIQUE_VALUE_COUNT);
        createEAttribute(userDefIndicatorEClass, USER_DEF_INDICATOR__DUPLICATE_VALUE_COUNT);
        createEAttribute(userDefIndicatorEClass, USER_DEF_INDICATOR__VALUE_TO_FREQ);
        createEAttribute(userDefIndicatorEClass, USER_DEF_INDICATOR__VALUE);
        createEAttribute(userDefIndicatorEClass, USER_DEF_INDICATOR__DATATYPE);

        whereRuleIndicatorEClass = createEClass(WHERE_RULE_INDICATOR);

        javaUserDefIndicatorEClass = createEClass(JAVA_USER_DEF_INDICATOR);
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
        IndicatorsPackage theIndicatorsPackage = (IndicatorsPackage)EPackage.Registry.INSTANCE.getEPackage(IndicatorsPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
        AnalysisPackage theAnalysisPackage = (AnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        userDefIndicatorEClass.getESuperTypes().add(theIndicatorsPackage.getIndicator());
        whereRuleIndicatorEClass.getESuperTypes().add(this.getUserDefIndicator());
        javaUserDefIndicatorEClass.getESuperTypes().add(this.getUserDefIndicator());

        // Initialize classes and features; add operations and parameters
        initEClass(userDefIndicatorEClass, UserDefIndicator.class, "UserDefIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUserDefIndicator_UserCount(), ecorePackage.getELongObject(), "userCount", null, 0, 1, UserDefIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUserDefIndicator_MatchingValueCount(), ecorePackage.getELongObject(), "matchingValueCount", null, 0, 1, UserDefIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUserDefIndicator_NotMatchingValueCount(), ecorePackage.getELongObject(), "notMatchingValueCount", null, 0, 1, UserDefIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUserDefIndicator_UniqueValues(), ecorePackage.getEJavaObject(), "uniqueValues", null, 0, -1, UserDefIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUserDefIndicator_DistinctValueCount(), ecorePackage.getELongObject(), "distinctValueCount", null, 0, 1, UserDefIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUserDefIndicator_UniqueValueCount(), ecorePackage.getELongObject(), "uniqueValueCount", null, 0, 1, UserDefIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUserDefIndicator_DuplicateValueCount(), ecorePackage.getELongObject(), "duplicateValueCount", null, 0, 1, UserDefIndicator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUserDefIndicator_ValueToFreq(), theIndicatorsPackage.getJavaHashMap(), "valueToFreq", null, 0, 1, UserDefIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUserDefIndicator_Value(), ecorePackage.getEString(), "value", null, 0, 1, UserDefIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUserDefIndicator_Datatype(), ecorePackage.getEInt(), "datatype", null, 0, 1, UserDefIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = addEOperation(userDefIndicatorEClass, ecorePackage.getEDoubleObject(), "getFrequency", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEJavaObject(), "dataValue", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(userDefIndicatorEClass, theIndicatorsPackage.getJavaSet(), "getDistinctValues", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(userDefIndicatorEClass, ecorePackage.getELongObject(), "getCount", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEJavaObject(), "dataValue", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(whereRuleIndicatorEClass, WhereRuleIndicator.class, "WhereRuleIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(whereRuleIndicatorEClass, theXMLTypePackage.getBoolean(), "setCount", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theIndicatorsPackage.getObjectArray(), "objects", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(javaUserDefIndicatorEClass, JavaUserDefIndicator.class, "JavaUserDefIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(javaUserDefIndicatorEClass, null, "setJavaUserDefObject", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getUserDefIndicator(), "javaUDIObj", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(javaUserDefIndicatorEClass, null, "setExecuteEngine", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theAnalysisPackage.getExecutionLanguage(), "executionLanguage", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(javaUserDefIndicatorEClass, this.getUserDefIndicator(), "getJavaUserDefObject", 0, 1, IS_UNIQUE, IS_ORDERED);
    }

} // IndicatorSqlPackageImpl
