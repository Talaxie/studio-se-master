/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.core.model.properties.impl.TDQItemImpl;
import org.talend.dataquality.properties.PropertiesPackage;
import org.talend.dataquality.properties.TDQMatchRuleItem;
import org.talend.dataquality.rules.MatchRuleDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDQ Match Rule Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.impl.TDQMatchRuleItemImpl#getMatchRule <em>Match Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDQMatchRuleItemImpl extends TDQItemImpl implements TDQMatchRuleItem {
    /**
     * The cached value of the '{@link #getMatchRule() <em>Match Rule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatchRule()
     * @generated
     * @ordered
     */
    protected MatchRuleDefinition matchRule;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TDQMatchRuleItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.TDQ_MATCH_RULE_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatchRuleDefinition getMatchRule() {
        if (matchRule != null && matchRule.eIsProxy()) {
            InternalEObject oldMatchRule = (InternalEObject)matchRule;
            matchRule = (MatchRuleDefinition)eResolveProxy(oldMatchRule);
            if (matchRule != oldMatchRule) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.TDQ_MATCH_RULE_ITEM__MATCH_RULE, oldMatchRule, matchRule));
            }
        }
        return matchRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatchRuleDefinition basicGetMatchRule() {
        return matchRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMatchRule(MatchRuleDefinition newMatchRule) {
        MatchRuleDefinition oldMatchRule = matchRule;
        matchRule = newMatchRule;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TDQ_MATCH_RULE_ITEM__MATCH_RULE, oldMatchRule, matchRule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.TDQ_MATCH_RULE_ITEM__MATCH_RULE:
                if (resolve) return getMatchRule();
                return basicGetMatchRule();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.TDQ_MATCH_RULE_ITEM__MATCH_RULE:
                setMatchRule((MatchRuleDefinition)newValue);
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
            case PropertiesPackage.TDQ_MATCH_RULE_ITEM__MATCH_RULE:
                setMatchRule((MatchRuleDefinition)null);
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
            case PropertiesPackage.TDQ_MATCH_RULE_ITEM__MATCH_RULE:
                return matchRule != null;
        }
        return super.eIsSet(featureID);
    }

} //TDQMatchRuleItemImpl
