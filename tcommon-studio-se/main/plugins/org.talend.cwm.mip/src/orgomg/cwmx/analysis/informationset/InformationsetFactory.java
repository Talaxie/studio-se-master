/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see orgomg.cwmx.analysis.informationset.InformationsetPackage
 * @generated
 */
public interface InformationsetFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    InformationsetFactory eINSTANCE = orgomg.cwmx.analysis.informationset.impl.InformationsetFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Information Set</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Information Set</em>'.
     * @generated
     */
    InformationSet createInformationSet();

    /**
     * Returns a new object of class '<em>Segment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Segment</em>'.
     * @generated
     */
    Segment createSegment();

    /**
     * Returns a new object of class '<em>Segment Region</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Segment Region</em>'.
     * @generated
     */
    SegmentRegion createSegmentRegion();

    /**
     * Returns a new object of class '<em>Rule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rule</em>'.
     * @generated
     */
    Rule createRule();

    /**
     * Returns a new object of class '<em>Info Set Administration</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Info Set Administration</em>'.
     * @generated
     */
    InfoSetAdministration createInfoSetAdministration();

    /**
     * Returns a new object of class '<em>Info Set Date</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Info Set Date</em>'.
     * @generated
     */
    InfoSetDate createInfoSetDate();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InformationsetPackage getInformationsetPackage();

} // InformationsetFactory
