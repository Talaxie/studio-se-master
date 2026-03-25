/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.definition.DefinitionPackage
 * @generated
 */
public interface DefinitionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DefinitionFactory eINSTANCE = org.talend.dataquality.indicators.definition.impl.DefinitionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Indicators Definitions</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Indicators Definitions</em>'.
     * @generated
     */
    IndicatorsDefinitions createIndicatorsDefinitions();

    /**
     * Returns a new object of class '<em>Indicator Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Indicator Definition</em>'.
     * @generated
     */
    IndicatorDefinition createIndicatorDefinition();

    /**
     * Returns a new object of class '<em>Indicator Category</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Indicator Category</em>'.
     * @generated
     */
    IndicatorCategory createIndicatorCategory();

    /**
     * Returns a new object of class '<em>Characters Mapping</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Characters Mapping</em>'.
     * @generated
     */
    CharactersMapping createCharactersMapping();

    /**
     * Returns a new object of class '<em>Indicator Definition Parameter</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Indicator Definition Parameter</em>'.
     * @generated
     */
	IndicatorDefinitionParameter createIndicatorDefinitionParameter();

				/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DefinitionPackage getDefinitionPackage();

} //DefinitionFactory
