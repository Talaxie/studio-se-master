/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.express.ExpressPackage
 * @generated
 */
public interface ExpressFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    ExpressFactory eINSTANCE = orgomg.cwmx.resource.express.impl.ExpressFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Database</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Database</em>'.
     * @generated
     */
    Database createDatabase();

    /**
     * Returns a new object of class '<em>Conjoint</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Conjoint</em>'.
     * @generated
     */
    Conjoint createConjoint();

    /**
     * Returns a new object of class '<em>Program</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Program</em>'.
     * @generated
     */
    Program createProgram();

    /**
     * Returns a new object of class '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model</em>'.
     * @generated
     */
    Model createModel();

    /**
     * Returns a new object of class '<em>Variable</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Variable</em>'.
     * @generated
     */
    Variable createVariable();

    /**
     * Returns a new object of class '<em>Formula</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Formula</em>'.
     * @generated
     */
    Formula createFormula();

    /**
     * Returns a new object of class '<em>Value Set</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Value Set</em>'.
     * @generated
     */
    ValueSet createValueSet();

    /**
     * Returns a new object of class '<em>Relation</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Relation</em>'.
     * @generated
     */
    Relation createRelation();

    /**
     * Returns a new object of class '<em>Worksheet</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Worksheet</em>'.
     * @generated
     */
    Worksheet createWorksheet();

    /**
     * Returns a new object of class '<em>Composite</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Composite</em>'.
     * @generated
     */
    Composite createComposite();

    /**
     * Returns a new object of class '<em>Simple Dimension</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Simple Dimension</em>'.
     * @generated
     */
    SimpleDimension createSimpleDimension();

    /**
     * Returns a new object of class '<em>Alias Dimension</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Alias Dimension</em>'.
     * @generated
     */
    AliasDimension createAliasDimension();

    /**
     * Returns a new object of class '<em>Agg Map</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Agg Map</em>'.
     * @generated
     */
    AggMap createAggMap();

    /**
     * Returns a new object of class '<em>Agg Map Component</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Agg Map Component</em>'.
     * @generated
     */
    AggMapComponent createAggMapComponent();

    /**
     * Returns a new object of class '<em>Pre Compute Clause</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Pre Compute Clause</em>'.
     * @generated
     */
    PreComputeClause createPreComputeClause();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ExpressPackage getExpressPackage();

} // ExpressFactory
