/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.talend.cwm.relational.RelationalFactory;
import org.talend.cwm.relational.TdExpression;
import org.talend.dataquality.rules.ParserRule;
import org.talend.dataquality.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parser Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParserRuleImpl extends DQRuleImpl implements ParserRule {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParserRuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.PARSER_RULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean addExpression(String name, String type, String value) {
        if(name==null){
            return false;
        }
        TdExpression tdExpression = getExpression(name);
        if (tdExpression == null) {
            tdExpression = RelationalFactory.eINSTANCE.createTdExpression();
        }
        tdExpression.setBody(value == null ? "" : value);
        tdExpression.setLanguage(type);
        tdExpression.setName(name);
        return this.getExpression().add(tdExpression);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public TdExpression getExpression(String name) {
        if (name == null) {
            return null;
        }
        for (TdExpression tdExpression : this.getExpression()) {
            if (name.equals(tdExpression.getName())) {
                return tdExpression;
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public List<TdExpression> getExpression() {
        return this.getSqlGenericExpression();
    }

} //ParserRuleImpl
