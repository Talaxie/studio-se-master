/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.essbase.EssbasePackage
 * @generated
 */
public interface EssbaseFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EssbaseFactory eINSTANCE = orgomg.cwmx.resource.essbase.impl.EssbaseFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Alias</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Alias</em>'.
     * @generated
     */
    Alias createAlias();

    /**
     * Returns a new object of class '<em>Application</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Application</em>'.
     * @generated
     */
    Application createApplication();

    /**
     * Returns a new object of class '<em>Comment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Comment</em>'.
     * @generated
     */
    Comment createComment();

    /**
     * Returns a new object of class '<em>Consolidation</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Consolidation</em>'.
     * @generated
     */
    Consolidation createConsolidation();

    /**
     * Returns a new object of class '<em>Currency Conversion</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Currency Conversion</em>'.
     * @generated
     */
    CurrencyConversion createCurrencyConversion();

    /**
     * Returns a new object of class '<em>Data Storage</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Data Storage</em>'.
     * @generated
     */
    DataStorage createDataStorage();

    /**
     * Returns a new object of class '<em>Database</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Database</em>'.
     * @generated
     */
    Database createDatabase();

    /**
     * Returns a new object of class '<em>Dimension</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Dimension</em>'.
     * @generated
     */
    Dimension createDimension();

    /**
     * Returns a new object of class '<em>Formula</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Formula</em>'.
     * @generated
     */
    Formula createFormula();

    /**
     * Returns a new object of class '<em>Generation</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Generation</em>'.
     * @generated
     */
    Generation createGeneration();

    /**
     * Returns a new object of class '<em>Immediate Parent</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Immediate Parent</em>'.
     * @generated
     */
    ImmediateParent createImmediateParent();

    /**
     * Returns a new object of class '<em>Level</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Level</em>'.
     * @generated
     */
    Level createLevel();

    /**
     * Returns a new object of class '<em>Member Name</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Member Name</em>'.
     * @generated
     */
    MemberName createMemberName();

    /**
     * Returns a new object of class '<em>OLAP Server</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>OLAP Server</em>'.
     * @generated
     */
    OLAPServer createOLAPServer();

    /**
     * Returns a new object of class '<em>Outline</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Outline</em>'.
     * @generated
     */
    Outline createOutline();

    /**
     * Returns a new object of class '<em>Replicated Partition</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Replicated Partition</em>'.
     * @generated
     */
    ReplicatedPartition createReplicatedPartition();

    /**
     * Returns a new object of class '<em>Time Balance</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Time Balance</em>'.
     * @generated
     */
    TimeBalance createTimeBalance();

    /**
     * Returns a new object of class '<em>Transparent Partition</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Transparent Partition</em>'.
     * @generated
     */
    TransparentPartition createTransparentPartition();

    /**
     * Returns a new object of class '<em>Two Pass Calculation</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Two Pass Calculation</em>'.
     * @generated
     */
    TwoPassCalculation createTwoPassCalculation();

    /**
     * Returns a new object of class '<em>UDA</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>UDA</em>'.
     * @generated
     */
    UDA createUDA();

    /**
     * Returns a new object of class '<em>Variance Reporting</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Variance Reporting</em>'.
     * @generated
     */
    VarianceReporting createVarianceReporting();

    /**
     * Returns a new object of class '<em>Linked Partition</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Linked Partition</em>'.
     * @generated
     */
    LinkedPartition createLinkedPartition();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EssbasePackage getEssbasePackage();

} // EssbaseFactory
