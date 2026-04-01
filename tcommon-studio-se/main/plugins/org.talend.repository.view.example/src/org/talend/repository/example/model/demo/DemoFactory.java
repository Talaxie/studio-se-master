/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.example.model.demo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.repository.example.model.demo.DemoPackage
 * @generated
 */
public interface DemoFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DemoFactory eINSTANCE = org.talend.repository.example.model.demo.impl.DemoFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Example Demo Connection Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Example Demo Connection Item</em>'.
     * @generated
     */
    ExampleDemoConnectionItem createExampleDemoConnectionItem();

    /**
     * Returns a new object of class '<em>Example Demo Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Example Demo Connection</em>'.
     * @generated
     */
    ExampleDemoConnection createExampleDemoConnection();

    /**
     * Returns a new object of class '<em>Extended Example Demo Connection Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extended Example Demo Connection Item</em>'.
     * @generated
     */
    ExtendedExampleDemoConnectionItem createExtendedExampleDemoConnectionItem();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DemoPackage getDemoPackage();

} //DemoFactory
