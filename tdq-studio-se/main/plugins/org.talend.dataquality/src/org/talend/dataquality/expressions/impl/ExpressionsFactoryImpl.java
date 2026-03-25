/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.dataquality.expressions.BooleanExpressionNode;
import org.talend.dataquality.expressions.ExpressionsFactory;
import org.talend.dataquality.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ExpressionsFactory init() {
        try {
            ExpressionsFactory theExpressionsFactory = (ExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://dataquality.expressions"); 
            if (theExpressionsFactory != null) {
                return theExpressionsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ExpressionsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ExpressionsPackage.BOOLEAN_EXPRESSION_NODE: return createBooleanExpressionNode();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BooleanExpressionNode createBooleanExpressionNode() {
        BooleanExpressionNodeImpl booleanExpressionNode = new BooleanExpressionNodeImpl();
        return booleanExpressionNode;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionsPackage getExpressionsPackage() {
        return (ExpressionsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ExpressionsPackage getPackage() {
        return ExpressionsPackage.eINSTANCE;
    }

} // ExpressionsFactoryImpl
