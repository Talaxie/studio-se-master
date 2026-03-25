/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.expressions.ExpressionsPackage
 * @generated
 */
public interface ExpressionsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ExpressionsFactory eINSTANCE = org.talend.dataquality.expressions.impl.ExpressionsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Boolean Expression Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean Expression Node</em>'.
     * @generated
     */
    BooleanExpressionNode createBooleanExpressionNode();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ExpressionsPackage getExpressionsPackage();

} //ExpressionsFactory
