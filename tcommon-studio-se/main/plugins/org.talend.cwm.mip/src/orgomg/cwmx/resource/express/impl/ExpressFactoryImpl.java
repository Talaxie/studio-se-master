/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwmx.resource.express.*;
import orgomg.cwmx.resource.express.AggMap;
import orgomg.cwmx.resource.express.AggMapComponent;
import orgomg.cwmx.resource.express.AliasDimension;
import orgomg.cwmx.resource.express.Composite;
import orgomg.cwmx.resource.express.Conjoint;
import orgomg.cwmx.resource.express.Database;
import orgomg.cwmx.resource.express.ExpressFactory;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.Formula;
import orgomg.cwmx.resource.express.Model;
import orgomg.cwmx.resource.express.PreComputeClause;
import orgomg.cwmx.resource.express.Program;
import orgomg.cwmx.resource.express.Relation;
import orgomg.cwmx.resource.express.SimpleDimension;
import orgomg.cwmx.resource.express.ValueSet;
import orgomg.cwmx.resource.express.Variable;
import orgomg.cwmx.resource.express.Worksheet;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ExpressFactoryImpl extends EFactoryImpl implements ExpressFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static ExpressFactory init() {
        try {
            ExpressFactory theExpressFactory = (ExpressFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwmx/resource/express.ecore");
            if (theExpressFactory != null) {
                return theExpressFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ExpressFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public ExpressFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ExpressPackage.DATABASE:
            return createDatabase();
        case ExpressPackage.CONJOINT:
            return createConjoint();
        case ExpressPackage.PROGRAM:
            return createProgram();
        case ExpressPackage.MODEL:
            return createModel();
        case ExpressPackage.VARIABLE:
            return createVariable();
        case ExpressPackage.FORMULA:
            return createFormula();
        case ExpressPackage.VALUE_SET:
            return createValueSet();
        case ExpressPackage.RELATION:
            return createRelation();
        case ExpressPackage.WORKSHEET:
            return createWorksheet();
        case ExpressPackage.COMPOSITE:
            return createComposite();
        case ExpressPackage.SIMPLE_DIMENSION:
            return createSimpleDimension();
        case ExpressPackage.ALIAS_DIMENSION:
            return createAliasDimension();
        case ExpressPackage.AGG_MAP:
            return createAggMap();
        case ExpressPackage.AGG_MAP_COMPONENT:
            return createAggMapComponent();
        case ExpressPackage.PRE_COMPUTE_CLAUSE:
            return createPreComputeClause();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Database createDatabase() {
        DatabaseImpl database = new DatabaseImpl();
        return database;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Conjoint createConjoint() {
        ConjointImpl conjoint = new ConjointImpl();
        return conjoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Program createProgram() {
        ProgramImpl program = new ProgramImpl();
        return program;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Model createModel() {
        ModelImpl model = new ModelImpl();
        return model;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Variable createVariable() {
        VariableImpl variable = new VariableImpl();
        return variable;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Formula createFormula() {
        FormulaImpl formula = new FormulaImpl();
        return formula;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ValueSet createValueSet() {
        ValueSetImpl valueSet = new ValueSetImpl();
        return valueSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Relation createRelation() {
        RelationImpl relation = new RelationImpl();
        return relation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Worksheet createWorksheet() {
        WorksheetImpl worksheet = new WorksheetImpl();
        return worksheet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Composite createComposite() {
        CompositeImpl composite = new CompositeImpl();
        return composite;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SimpleDimension createSimpleDimension() {
        SimpleDimensionImpl simpleDimension = new SimpleDimensionImpl();
        return simpleDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AliasDimension createAliasDimension() {
        AliasDimensionImpl aliasDimension = new AliasDimensionImpl();
        return aliasDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AggMap createAggMap() {
        AggMapImpl aggMap = new AggMapImpl();
        return aggMap;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AggMapComponent createAggMapComponent() {
        AggMapComponentImpl aggMapComponent = new AggMapComponentImpl();
        return aggMapComponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PreComputeClause createPreComputeClause() {
        PreComputeClauseImpl preComputeClause = new PreComputeClauseImpl();
        return preComputeClause;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressPackage getExpressPackage() {
        return (ExpressPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ExpressPackage getPackage() {
        return ExpressPackage.eINSTANCE;
    }

} // ExpressFactoryImpl
