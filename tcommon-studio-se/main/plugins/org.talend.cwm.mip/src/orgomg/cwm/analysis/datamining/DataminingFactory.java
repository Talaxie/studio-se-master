/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see orgomg.cwm.analysis.datamining.DataminingPackage
 * @generated
 */
public interface DataminingFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    DataminingFactory eINSTANCE = orgomg.cwm.analysis.datamining.impl.DataminingFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Application Input Specification</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Application Input Specification</em>'.
     * @generated
     */
    ApplicationInputSpecification createApplicationInputSpecification();

    /**
     * Returns a new object of class '<em>Attribute Usage Relation</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Attribute Usage Relation</em>'.
     * @generated
     */
    AttributeUsageRelation createAttributeUsageRelation();

    /**
     * Returns a new object of class '<em>Category</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Category</em>'.
     * @generated
     */
    Category createCategory();

    /**
     * Returns a new object of class '<em>Category Hierarchy</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Category Hierarchy</em>'.
     * @generated
     */
    CategoryHierarchy createCategoryHierarchy();

    /**
     * Returns a new object of class '<em>Cost Matrix</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Cost Matrix</em>'.
     * @generated
     */
    CostMatrix createCostMatrix();

    /**
     * Returns a new object of class '<em>Mining Attribute</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Mining Attribute</em>'.
     * @generated
     */
    MiningAttribute createMiningAttribute();

    /**
     * Returns a new object of class '<em>Mining Data Specification</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Mining Data Specification</em>'.
     * @generated
     */
    MiningDataSpecification createMiningDataSpecification();

    /**
     * Returns a new object of class '<em>Mining Model</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Mining Model</em>'.
     * @generated
     */
    MiningModel createMiningModel();

    /**
     * Returns a new object of class '<em>Mining Model Result</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Mining Model Result</em>'.
     * @generated
     */
    MiningModelResult createMiningModelResult();

    /**
     * Returns a new object of class '<em>Numeric Attribute</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Numeric Attribute</em>'.
     * @generated
     */
    NumericAttribute createNumericAttribute();

    /**
     * Returns a new object of class '<em>Supervised Mining Model</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Supervised Mining Model</em>'.
     * @generated
     */
    SupervisedMiningModel createSupervisedMiningModel();

    /**
     * Returns a new object of class '<em>Categorical Attribute</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Categorical Attribute</em>'.
     * @generated
     */
    CategoricalAttribute createCategoricalAttribute();

    /**
     * Returns a new object of class '<em>Ordinal Attribute</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Ordinal Attribute</em>'.
     * @generated
     */
    OrdinalAttribute createOrdinalAttribute();

    /**
     * Returns a new object of class '<em>Mining Settings</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Mining Settings</em>'.
     * @generated
     */
    MiningSettings createMiningSettings();

    /**
     * Returns a new object of class '<em>Clustering Settings</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Clustering Settings</em>'.
     * @generated
     */
    ClusteringSettings createClusteringSettings();

    /**
     * Returns a new object of class '<em>Statistics Settings</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Statistics Settings</em>'.
     * @generated
     */
    StatisticsSettings createStatisticsSettings();

    /**
     * Returns a new object of class '<em>Supervised Mining Settings</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Supervised Mining Settings</em>'.
     * @generated
     */
    SupervisedMiningSettings createSupervisedMiningSettings();

    /**
     * Returns a new object of class '<em>Classification Settings</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Classification Settings</em>'.
     * @generated
     */
    ClassificationSettings createClassificationSettings();

    /**
     * Returns a new object of class '<em>Regression Settings</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Regression Settings</em>'.
     * @generated
     */
    RegressionSettings createRegressionSettings();

    /**
     * Returns a new object of class '<em>Association Rules Settings</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Association Rules Settings</em>'.
     * @generated
     */
    AssociationRulesSettings createAssociationRulesSettings();

    /**
     * Returns a new object of class '<em>Application Attribute</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Application Attribute</em>'.
     * @generated
     */
    ApplicationAttribute createApplicationAttribute();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DataminingPackage getDataminingPackage();

} // DataminingFactory
