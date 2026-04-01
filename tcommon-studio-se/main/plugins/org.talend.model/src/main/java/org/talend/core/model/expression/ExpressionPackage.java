/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.expression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.talend.core.model.expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "expression";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///expression.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "expression";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ExpressionPackage eINSTANCE = org.talend.core.model.expression.impl.ExpressionPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.core.model.expression.impl.EMFExpressionImpl <em>EMF Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.expression.impl.EMFExpressionImpl
     * @see org.talend.core.model.expression.impl.ExpressionPackageImpl#getEMFExpression()
     * @generated
     */
    int EMF_EXPRESSION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_EXPRESSION__ID = 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_EXPRESSION__EXPRESSION = 1;

    /**
     * The feature id for the '<em><b>Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_EXPRESSION__VARIABLES = 2;

    /**
     * The number of structural features of the '<em>EMF Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_EXPRESSION_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.core.model.expression.impl.EMFVariableImpl <em>EMF Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.expression.impl.EMFVariableImpl
     * @see org.talend.core.model.expression.impl.ExpressionPackageImpl#getEMFVariable()
     * @generated
     */
    int EMF_VARIABLE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_VARIABLE__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_VARIABLE__VALUE = 1;

    /**
     * The feature id for the '<em><b>Talaxie Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_VARIABLE__TALEND_TYPE = 2;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_VARIABLE__NULLABLE = 3;

    /**
     * The number of structural features of the '<em>EMF Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_VARIABLE_FEATURE_COUNT = 4;


    /**
     * Returns the meta object for class '{@link org.talend.core.model.expression.EMFExpression <em>EMF Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EMF Expression</em>'.
     * @see org.talend.core.model.expression.EMFExpression
     * @generated
     */
    EClass getEMFExpression();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.expression.EMFExpression#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.talend.core.model.expression.EMFExpression#getId()
     * @see #getEMFExpression()
     * @generated
     */
    EAttribute getEMFExpression_Id();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.expression.EMFExpression#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see org.talend.core.model.expression.EMFExpression#getExpression()
     * @see #getEMFExpression()
     * @generated
     */
    EAttribute getEMFExpression_Expression();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.expression.EMFExpression#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variables</em>'.
     * @see org.talend.core.model.expression.EMFExpression#getVariables()
     * @see #getEMFExpression()
     * @generated
     */
    EReference getEMFExpression_Variables();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.expression.EMFVariable <em>EMF Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EMF Variable</em>'.
     * @see org.talend.core.model.expression.EMFVariable
     * @generated
     */
    EClass getEMFVariable();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.expression.EMFVariable#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.core.model.expression.EMFVariable#getName()
     * @see #getEMFVariable()
     * @generated
     */
    EAttribute getEMFVariable_Name();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.expression.EMFVariable#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.core.model.expression.EMFVariable#getValue()
     * @see #getEMFVariable()
     * @generated
     */
    EAttribute getEMFVariable_Value();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.expression.EMFVariable#getTalendType <em>Talaxie Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Talaxie Type</em>'.
     * @see org.talend.core.model.expression.EMFVariable#getTalendType()
     * @see #getEMFVariable()
     * @generated
     */
    EAttribute getEMFVariable_TalendType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.expression.EMFVariable#isNullable <em>Nullable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nullable</em>'.
     * @see org.talend.core.model.expression.EMFVariable#isNullable()
     * @see #getEMFVariable()
     * @generated
     */
    EAttribute getEMFVariable_Nullable();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ExpressionFactory getExpressionFactory();

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
         * The meta object literal for the '{@link org.talend.core.model.expression.impl.EMFExpressionImpl <em>EMF Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.expression.impl.EMFExpressionImpl
         * @see org.talend.core.model.expression.impl.ExpressionPackageImpl#getEMFExpression()
         * @generated
         */
        EClass EMF_EXPRESSION = eINSTANCE.getEMFExpression();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_EXPRESSION__ID = eINSTANCE.getEMFExpression_Id();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_EXPRESSION__EXPRESSION = eINSTANCE.getEMFExpression_Expression();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMF_EXPRESSION__VARIABLES = eINSTANCE.getEMFExpression_Variables();

        /**
         * The meta object literal for the '{@link org.talend.core.model.expression.impl.EMFVariableImpl <em>EMF Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.expression.impl.EMFVariableImpl
         * @see org.talend.core.model.expression.impl.ExpressionPackageImpl#getEMFVariable()
         * @generated
         */
        EClass EMF_VARIABLE = eINSTANCE.getEMFVariable();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_VARIABLE__NAME = eINSTANCE.getEMFVariable_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_VARIABLE__VALUE = eINSTANCE.getEMFVariable_Value();

        /**
         * The meta object literal for the '<em><b>Talaxie Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_VARIABLE__TALEND_TYPE = eINSTANCE.getEMFVariable_TalendType();

        /**
         * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_VARIABLE__NULLABLE = eINSTANCE.getEMFVariable_Nullable();

    }

} //ExpressionPackage
