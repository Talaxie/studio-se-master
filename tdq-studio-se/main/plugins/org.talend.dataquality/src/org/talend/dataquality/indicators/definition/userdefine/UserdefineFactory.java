/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition.userdefine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.definition.userdefine.UserdefinePackage
 * @generated
 */
public interface UserdefineFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UserdefineFactory eINSTANCE = org.talend.dataquality.indicators.definition.userdefine.impl.UserdefineFactoryImpl.init();

    /**
     * Returns a new object of class '<em>UD Indicator Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>UD Indicator Definition</em>'.
     * @generated
     */
    UDIndicatorDefinition createUDIndicatorDefinition();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    UserdefinePackage getUserdefinePackage();

} //UserdefineFactory
