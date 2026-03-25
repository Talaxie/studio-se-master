/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.dataquality.rules.JoinElement;
import org.talend.dataquality.rules.RulesPackage;
import org.talend.dataquality.rules.WhereRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.impl.WhereRuleImpl#getWhereExpression <em>Where Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.WhereRuleImpl#getJoinExpression <em>Join Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.WhereRuleImpl#getJoins <em>Joins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhereRuleImpl extends SpecifiedDQRuleImpl implements WhereRule {
    /**
     * The default value of the '{@link #getWhereExpression() <em>Where Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhereExpression()
     * @generated
     * @ordered
     */
    protected static final String WHERE_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWhereExpression() <em>Where Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhereExpression()
     * @generated
     * @ordered
     */
    protected String whereExpression = WHERE_EXPRESSION_EDEFAULT;

    /**
     * The default value of the '{@link #getJoinExpression() <em>Join Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJoinExpression()
     * @generated
     * @ordered
     */
    protected static final String JOIN_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJoinExpression() <em>Join Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJoinExpression()
     * @generated
     * @ordered
     */
    protected String joinExpression = JOIN_EXPRESSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getJoins() <em>Joins</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJoins()
     * @generated
     * @ordered
     */
    protected EList<JoinElement> joins;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WhereRuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.WHERE_RULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWhereExpression() {
        return whereExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWhereExpression(String newWhereExpression) {
        String oldWhereExpression = whereExpression;
        whereExpression = newWhereExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.WHERE_RULE__WHERE_EXPRESSION, oldWhereExpression, whereExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJoinExpression() {
        return joinExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJoinExpression(String newJoinExpression) {
        String oldJoinExpression = joinExpression;
        joinExpression = newJoinExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.WHERE_RULE__JOIN_EXPRESSION, oldJoinExpression, joinExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<JoinElement> getJoins() {
        if (joins == null) {
            joins = new EObjectContainmentEList<JoinElement>(JoinElement.class, this, RulesPackage.WHERE_RULE__JOINS);
        }
        return joins;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulesPackage.WHERE_RULE__JOINS:
                return ((InternalEList<?>)getJoins()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RulesPackage.WHERE_RULE__WHERE_EXPRESSION:
                return getWhereExpression();
            case RulesPackage.WHERE_RULE__JOIN_EXPRESSION:
                return getJoinExpression();
            case RulesPackage.WHERE_RULE__JOINS:
                return getJoins();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RulesPackage.WHERE_RULE__WHERE_EXPRESSION:
                setWhereExpression((String)newValue);
                return;
            case RulesPackage.WHERE_RULE__JOIN_EXPRESSION:
                setJoinExpression((String)newValue);
                return;
            case RulesPackage.WHERE_RULE__JOINS:
                getJoins().clear();
                getJoins().addAll((Collection<? extends JoinElement>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case RulesPackage.WHERE_RULE__WHERE_EXPRESSION:
                setWhereExpression(WHERE_EXPRESSION_EDEFAULT);
                return;
            case RulesPackage.WHERE_RULE__JOIN_EXPRESSION:
                setJoinExpression(JOIN_EXPRESSION_EDEFAULT);
                return;
            case RulesPackage.WHERE_RULE__JOINS:
                getJoins().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case RulesPackage.WHERE_RULE__WHERE_EXPRESSION:
                return WHERE_EXPRESSION_EDEFAULT == null ? whereExpression != null : !WHERE_EXPRESSION_EDEFAULT.equals(whereExpression);
            case RulesPackage.WHERE_RULE__JOIN_EXPRESSION:
                return JOIN_EXPRESSION_EDEFAULT == null ? joinExpression != null : !JOIN_EXPRESSION_EDEFAULT.equals(joinExpression);
            case RulesPackage.WHERE_RULE__JOINS:
                return joins != null && !joins.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (whereExpression: ");
        result.append(whereExpression);
        result.append(", joinExpression: ");
        result.append(joinExpression);
        result.append(')');
        return result.toString();
    }

} //WhereRuleImpl
