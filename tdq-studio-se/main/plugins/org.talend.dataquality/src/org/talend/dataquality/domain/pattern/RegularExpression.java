/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.pattern;

import org.talend.cwm.relational.TdExpression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.pattern.RegularExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.pattern.RegularExpression#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.pattern.PatternPackage#getRegularExpression()
 * @model
 * @generated
 */
public interface RegularExpression extends PatternComponent {

    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(TdExpression)
     * @see org.talend.dataquality.domain.pattern.PatternPackage#getRegularExpression_Expression()
     * @model containment="true"
     * @generated
     */
    TdExpression getExpression();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.pattern.RegularExpression#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(TdExpression value);

    /**
     * Returns the value of the '<em><b>Expression Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of regular expression: can be either "regexp" or "sql like" to differentiate between the regular patterns and the SQL expressions available for the LIKE clause.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Expression Type</em>' attribute.
     * @see #setExpressionType(String)
     * @see org.talend.dataquality.domain.pattern.PatternPackage#getRegularExpression_ExpressionType()
     * @model
     * @generated
     */
    String getExpressionType();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.pattern.RegularExpression#getExpressionType <em>Expression Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression Type</em>' attribute.
     * @see #getExpressionType()
     * @generated
     */
    void setExpressionType(String value);
} // RegularExpression
