/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.reports;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.reports.ReportsPackage
 * @generated
 */
public interface ReportsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ReportsFactory eINSTANCE = org.talend.dataquality.reports.impl.ReportsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Td Report</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Td Report</em>'.
     * @generated
     */
    TdReport createTdReport();

    /**
     * Returns a new object of class '<em>Presentation Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Presentation Parameter</em>'.
     * @generated
     */
    PresentationParameter createPresentationParameter();

    /**
     * Returns a new object of class '<em>Analysis Map</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analysis Map</em>'.
     * @generated
     */
    AnalysisMap createAnalysisMap();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ReportsPackage getReportsPackage();

} //ReportsFactory
