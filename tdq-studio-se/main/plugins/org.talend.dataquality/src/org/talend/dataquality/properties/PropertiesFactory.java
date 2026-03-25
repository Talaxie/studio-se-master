/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.properties.PropertiesPackage
 * @generated
 */
public interface PropertiesFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PropertiesFactory eINSTANCE = org.talend.dataquality.properties.impl.PropertiesFactoryImpl.init();

    /**
     * Returns a new object of class '<em>TDQ Analysis Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDQ Analysis Item</em>'.
     * @generated
     */
    TDQAnalysisItem createTDQAnalysisItem();

    /**
     * Returns a new object of class '<em>TDQ Report Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDQ Report Item</em>'.
     * @generated
     */
    TDQReportItem createTDQReportItem();

    /**
     * Returns a new object of class '<em>TDQ Indicator Definition Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDQ Indicator Definition Item</em>'.
     * @generated
     */
    TDQIndicatorDefinitionItem createTDQIndicatorDefinitionItem();

    /**
     * Returns a new object of class '<em>TDQ Business Rule Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDQ Business Rule Item</em>'.
     * @generated
     */
    TDQBusinessRuleItem createTDQBusinessRuleItem();

    /**
     * Returns a new object of class '<em>TDQ Pattern Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDQ Pattern Item</em>'.
     * @generated
     */
    TDQPatternItem createTDQPatternItem();

    /**
     * Returns a new object of class '<em>TDQ File Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDQ File Item</em>'.
     * @generated
     */
    TDQFileItem createTDQFileItem();

    /**
     * Returns a new object of class '<em>TDQ Jrxml Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDQ Jrxml Item</em>'.
     * @generated
     */
    TDQJrxmlItem createTDQJrxmlItem();

    /**
     * Returns a new object of class '<em>TDQ Source File Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDQ Source File Item</em>'.
     * @generated
     */
    TDQSourceFileItem createTDQSourceFileItem();

    /**
     * Returns a new object of class '<em>TDQ Match Rule Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TDQ Match Rule Item</em>'.
     * @generated
     */
    TDQMatchRuleItem createTDQMatchRuleItem();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    PropertiesPackage getPropertiesPackage();

} //PropertiesFactory
