/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.expressions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "expressions";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.expressions";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.expressions";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ExpressionsPackage eINSTANCE = org.talend.dataquality.expressions.impl.ExpressionsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.expressions.impl.BooleanExpressionNodeImpl <em>Boolean Expression Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.expressions.impl.BooleanExpressionNodeImpl
     * @see org.talend.dataquality.expressions.impl.ExpressionsPackageImpl#getBooleanExpressionNode()
     * @generated
     */
    int BOOLEAN_EXPRESSION_NODE = 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_EXPRESSION_NODE__EXPRESSION = orgomg.cwm.foundation.expressions.ExpressionsPackage.EXPRESSION_NODE__EXPRESSION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_EXPRESSION_NODE__TYPE = orgomg.cwm.foundation.expressions.ExpressionsPackage.EXPRESSION_NODE__TYPE;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_EXPRESSION_NODE__FEATURE_NODE = orgomg.cwm.foundation.expressions.ExpressionsPackage.EXPRESSION_NODE__FEATURE_NODE;

    /**
     * The number of structural features of the '<em>Boolean Expression Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_EXPRESSION_NODE_FEATURE_COUNT = orgomg.cwm.foundation.expressions.ExpressionsPackage.EXPRESSION_NODE_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.expressions.BooleanExpressionNode <em>Boolean Expression Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Expression Node</em>'.
     * @see org.talend.dataquality.expressions.BooleanExpressionNode
     * @generated
     */
    EClass getBooleanExpressionNode();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ExpressionsFactory getExpressionsFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.dataquality.expressions.impl.BooleanExpressionNodeImpl <em>Boolean Expression Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.expressions.impl.BooleanExpressionNodeImpl
         * @see org.talend.dataquality.expressions.impl.ExpressionsPackageImpl#getBooleanExpressionNode()
         * @generated
         */
        EClass BOOLEAN_EXPRESSION_NODE = eINSTANCE.getBooleanExpressionNode();

    }

} //ExpressionsPackage
