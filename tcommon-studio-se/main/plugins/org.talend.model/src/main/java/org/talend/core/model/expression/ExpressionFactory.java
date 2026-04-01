/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.expression;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see org.talend.core.model.expression.ExpressionPackage
 * @generated
 */
public interface ExpressionFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    ExpressionFactory eINSTANCE = org.talend.core.model.expression.impl.ExpressionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>EMF Expression</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>EMF Expression</em>'.
     * @generated
     */
    EMFExpression createEMFExpression();

    /**
     * Returns a new object of class '<em>EMF Variable</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>EMF Variable</em>'.
     * @generated
     */
    EMFVariable createEMFVariable();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ExpressionPackage getExpressionPackage();

} // ExpressionFactory
