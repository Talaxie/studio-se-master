/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition.userdefine;

import org.eclipse.emf.common.util.EList;
import org.talend.cwm.relational.TdExpression;
import org.talend.dataquality.indicators.definition.IndicatorDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UD Indicator Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewInvalidRowsExpression <em>View Invalid Rows Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewValidRowsExpression <em>View Valid Rows Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewInvalidValuesExpression <em>View Invalid Values Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewValidValuesExpression <em>View Valid Values Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition#getViewRowsExpression <em>View Rows Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.definition.userdefine.UserdefinePackage#getUDIndicatorDefinition()
 * @model
 * @generated
 */
public interface UDIndicatorDefinition extends IndicatorDefinition {
    /**
     * Returns the value of the '<em><b>View Invalid Rows Expression</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.cwm.relational.TdExpression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>View Invalid Rows Expression</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Invalid Rows Expression</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.userdefine.UserdefinePackage#getUDIndicatorDefinition_ViewInvalidRowsExpression()
     * @model containment="true"
     * @generated
     */
    EList<TdExpression> getViewInvalidRowsExpression();

    /**
     * Returns the value of the '<em><b>View Valid Rows Expression</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.cwm.relational.TdExpression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>View Valid Rows Expression</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Valid Rows Expression</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.userdefine.UserdefinePackage#getUDIndicatorDefinition_ViewValidRowsExpression()
     * @model containment="true"
     * @generated
     */
    EList<TdExpression> getViewValidRowsExpression();

    /**
     * Returns the value of the '<em><b>View Invalid Values Expression</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.cwm.relational.TdExpression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>View Invalid Values Expression</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Invalid Values Expression</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.userdefine.UserdefinePackage#getUDIndicatorDefinition_ViewInvalidValuesExpression()
     * @model containment="true"
     * @generated
     */
    EList<TdExpression> getViewInvalidValuesExpression();

    /**
     * Returns the value of the '<em><b>View Valid Values Expression</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.cwm.relational.TdExpression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>View Valid Values Expression</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Valid Values Expression</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.userdefine.UserdefinePackage#getUDIndicatorDefinition_ViewValidValuesExpression()
     * @model containment="true"
     * @generated
     */
    EList<TdExpression> getViewValidValuesExpression();

    /**
     * Returns the value of the '<em><b>View Rows Expression</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.cwm.relational.TdExpression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>View Rows Expression</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Rows Expression</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.userdefine.UserdefinePackage#getUDIndicatorDefinition_ViewRowsExpression()
     * @model containment="true"
     * @generated
     */
    EList<TdExpression> getViewRowsExpression();

} // UDIndicatorDefinition
