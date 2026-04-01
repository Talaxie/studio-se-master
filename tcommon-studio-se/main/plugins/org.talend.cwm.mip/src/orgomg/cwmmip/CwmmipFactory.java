/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see orgomg.cwmmip.CwmmipPackage
 * @generated
 */
public interface CwmmipFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    CwmmipFactory eINSTANCE = orgomg.cwmmip.impl.CwmmipFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Unit Of Interchange</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Unit Of Interchange</em>'.
     * @generated
     */
    UnitOfInterchange createUnitOfInterchange();

    /**
     * Returns a new object of class '<em>Interchange Pattern</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Interchange Pattern</em>'.
     * @generated
     */
    InterchangePattern createInterchangePattern();

    /**
     * Returns a new object of class '<em>Modeled Semantic Context</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Modeled Semantic Context</em>'.
     * @generated
     */
    ModeledSemanticContext createModeledSemanticContext();

    /**
     * Returns a new object of class '<em>Semantic Context</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Semantic Context</em>'.
     * @generated
     */
    SemanticContext createSemanticContext();

    /**
     * Returns a new object of class '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Element</em>'.
     * @generated
     */
    Element createElement();

    /**
     * Returns a new object of class '<em>Graph Subset</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Graph Subset</em>'.
     * @generated
     */
    GraphSubset createGraphSubset();

    /**
     * Returns a new object of class '<em>Pattern Constraint</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Pattern Constraint</em>'.
     * @generated
     */
    PatternConstraint createPatternConstraint();

    /**
     * Returns a new object of class '<em>Modeled Graph Subset</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Modeled Graph Subset</em>'.
     * @generated
     */
    ModeledGraphSubset createModeledGraphSubset();

    /**
     * Returns a new object of class '<em>Restriction</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Restriction</em>'.
     * @generated
     */
    Restriction createRestriction();

    /**
     * Returns a new object of class '<em>Binding Parameter</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Binding Parameter</em>'.
     * @generated
     */
    BindingParameter createBindingParameter();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CwmmipPackage getCwmmipPackage();

} // CwmmipFactory
