/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain;

import org.talend.dataquality.expressions.BooleanExpressionNode;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.RangeRestriction#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.RangeRestriction#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.RangeRestriction#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.DomainPackage#getRangeRestriction()
 * @model
 * @generated
 */
public interface RangeRestriction extends ModelElement {
    /**
     * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower Value</em>' containment reference.
     * @see #setLowerValue(LiteralValue)
     * @see org.talend.dataquality.domain.DomainPackage#getRangeRestriction_LowerValue()
     * @model containment="true"
     * @generated
     */
    LiteralValue getLowerValue();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.RangeRestriction#getLowerValue <em>Lower Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Value</em>' containment reference.
     * @see #getLowerValue()
     * @generated
     */
    void setLowerValue(LiteralValue value);

    /**
     * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper Value</em>' containment reference.
     * @see #setUpperValue(LiteralValue)
     * @see org.talend.dataquality.domain.DomainPackage#getRangeRestriction_UpperValue()
     * @model containment="true"
     * @generated
     */
    LiteralValue getUpperValue();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.RangeRestriction#getUpperValue <em>Upper Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper Value</em>' containment reference.
     * @see #getUpperValue()
     * @generated
     */
    void setUpperValue(LiteralValue value);

    /**
     * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expressions</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expressions</em>' containment reference.
     * @see #setExpressions(BooleanExpressionNode)
     * @see org.talend.dataquality.domain.DomainPackage#getRangeRestriction_Expressions()
     * @model containment="true"
     * @generated
     */
    BooleanExpressionNode getExpressions();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.RangeRestriction#getExpressions <em>Expressions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expressions</em>' containment reference.
     * @see #getExpressions()
     * @generated
     */
    void setExpressions(BooleanExpressionNode value);

} // RangeRestriction
