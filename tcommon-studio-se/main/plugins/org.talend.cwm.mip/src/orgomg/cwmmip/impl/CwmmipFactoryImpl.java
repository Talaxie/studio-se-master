/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwmmip.*;
import orgomg.cwmmip.BindingParameter;
import orgomg.cwmmip.CwmmipFactory;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.Element;
import orgomg.cwmmip.GraphSubset;
import orgomg.cwmmip.InterchangePattern;
import orgomg.cwmmip.ModeledGraphSubset;
import orgomg.cwmmip.ModeledSemanticContext;
import orgomg.cwmmip.PatternConstraint;
import orgomg.cwmmip.Restriction;
import orgomg.cwmmip.SemanticContext;
import orgomg.cwmmip.UnitOfInterchange;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CwmmipFactoryImpl extends EFactoryImpl implements CwmmipFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static CwmmipFactory init() {
        try {
            CwmmipFactory theCwmmipFactory = (CwmmipFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwmmip.ecore");
            if (theCwmmipFactory != null) {
                return theCwmmipFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CwmmipFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public CwmmipFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case CwmmipPackage.UNIT_OF_INTERCHANGE:
            return createUnitOfInterchange();
        case CwmmipPackage.INTERCHANGE_PATTERN:
            return createInterchangePattern();
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT:
            return createModeledSemanticContext();
        case CwmmipPackage.SEMANTIC_CONTEXT:
            return createSemanticContext();
        case CwmmipPackage.ELEMENT:
            return createElement();
        case CwmmipPackage.GRAPH_SUBSET:
            return createGraphSubset();
        case CwmmipPackage.PATTERN_CONSTRAINT:
            return createPatternConstraint();
        case CwmmipPackage.MODELED_GRAPH_SUBSET:
            return createModeledGraphSubset();
        case CwmmipPackage.RESTRICTION:
            return createRestriction();
        case CwmmipPackage.BINDING_PARAMETER:
            return createBindingParameter();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public UnitOfInterchange createUnitOfInterchange() {
        UnitOfInterchangeImpl unitOfInterchange = new UnitOfInterchangeImpl();
        return unitOfInterchange;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InterchangePattern createInterchangePattern() {
        InterchangePatternImpl interchangePattern = new InterchangePatternImpl();
        return interchangePattern;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ModeledSemanticContext createModeledSemanticContext() {
        ModeledSemanticContextImpl modeledSemanticContext = new ModeledSemanticContextImpl();
        return modeledSemanticContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SemanticContext createSemanticContext() {
        SemanticContextImpl semanticContext = new SemanticContextImpl();
        return semanticContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Element createElement() {
        ElementImpl element = new ElementImpl();
        return element;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public GraphSubset createGraphSubset() {
        GraphSubsetImpl graphSubset = new GraphSubsetImpl();
        return graphSubset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PatternConstraint createPatternConstraint() {
        PatternConstraintImpl patternConstraint = new PatternConstraintImpl();
        return patternConstraint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ModeledGraphSubset createModeledGraphSubset() {
        ModeledGraphSubsetImpl modeledGraphSubset = new ModeledGraphSubsetImpl();
        return modeledGraphSubset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Restriction createRestriction() {
        RestrictionImpl restriction = new RestrictionImpl();
        return restriction;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BindingParameter createBindingParameter() {
        BindingParameterImpl bindingParameter = new BindingParameterImpl();
        return bindingParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CwmmipPackage getCwmmipPackage() {
        return (CwmmipPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CwmmipPackage getPackage() {
        return CwmmipPackage.eINSTANCE;
    }

} // CwmmipFactoryImpl
