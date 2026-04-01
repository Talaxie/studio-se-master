/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationreporting;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see orgomg.cwmx.analysis.informationreporting.InformationreportingPackage
 * @generated
 */
public interface InformationreportingFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    InformationreportingFactory eINSTANCE = orgomg.cwmx.analysis.informationreporting.impl.InformationreportingFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Report</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Report</em>'.
     * @generated
     */
    Report createReport();

    /**
     * Returns a new object of class '<em>Report Attribute</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Report Attribute</em>'.
     * @generated
     */
    ReportAttribute createReportAttribute();

    /**
     * Returns a new object of class '<em>Report Execution</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Report Execution</em>'.
     * @generated
     */
    ReportExecution createReportExecution();

    /**
     * Returns a new object of class '<em>Report Field</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Report Field</em>'.
     * @generated
     */
    ReportField createReportField();

    /**
     * Returns a new object of class '<em>Report Group</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Report Group</em>'.
     * @generated
     */
    ReportGroup createReportGroup();

    /**
     * Returns a new object of class '<em>Report Package</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Report Package</em>'.
     * @generated
     */
    ReportPackage createReportPackage();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InformationreportingPackage getInformationreportingPackage();

} // InformationreportingFactory
