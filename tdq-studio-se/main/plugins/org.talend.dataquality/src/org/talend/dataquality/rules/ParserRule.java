/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules;

import java.util.List;

import org.talend.cwm.relational.TdExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parser Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.talend.dataquality.rules.RulesPackage#getParserRule()
 * @model
 * @generated
 */
public interface ParserRule extends DQRule {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" nameDataType="org.eclipse.emf.ecore.xml.type.String" typeDataType="org.eclipse.emf.ecore.xml.type.String" valueDataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    boolean addExpression(String name, String type, String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model nameDataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    TdExpression getExpression(String name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.talend.dataquality.rules.TdExpressionList"
     * @generated
     */
    List<TdExpression> getExpression();

} // ParserRule
