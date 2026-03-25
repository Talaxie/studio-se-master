/**
 * <copyright> </copyright>
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
import org.talend.dataquality.rules.MatchKeyDefinition;
import org.talend.dataquality.rules.MatchRule;
import org.talend.dataquality.rules.RulesPackage;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Match Rule</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.impl.MatchRuleImpl#getMatchKeys <em>Match Keys</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.MatchRuleImpl#getMatchInterval <em>Match Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchRuleImpl extends ModelElementImpl implements MatchRule {

    /**
     * The cached value of the '{@link #getMatchKeys() <em>Match Keys</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMatchKeys()
     * @generated
     * @ordered
     */
    protected EList<MatchKeyDefinition> matchKeys;

    /**
     * The default value of the '{@link #getMatchInterval() <em>Match Interval</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getMatchInterval()
     * @generated NOT
     * @ordered
     */
    protected static final double MATCH_INTERVAL_EDEFAULT = 0.85;

    /**
     * The cached value of the '{@link #getMatchInterval() <em>Match Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatchInterval()
     * @generated
     * @ordered
     */
    protected double matchInterval = MATCH_INTERVAL_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MatchRuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.MATCH_RULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<MatchKeyDefinition> getMatchKeys() {
        if (matchKeys == null) {
            matchKeys = new EObjectContainmentEList<MatchKeyDefinition>(MatchKeyDefinition.class, this, RulesPackage.MATCH_RULE__MATCH_KEYS);
        }
        return matchKeys;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getMatchInterval() {
        return matchInterval;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMatchInterval(double newMatchInterval) {
        double oldMatchInterval = matchInterval;
        matchInterval = newMatchInterval;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.MATCH_RULE__MATCH_INTERVAL, oldMatchInterval, matchInterval));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulesPackage.MATCH_RULE__MATCH_KEYS:
                return ((InternalEList<?>)getMatchKeys()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RulesPackage.MATCH_RULE__MATCH_KEYS:
                return getMatchKeys();
            case RulesPackage.MATCH_RULE__MATCH_INTERVAL:
                return getMatchInterval();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RulesPackage.MATCH_RULE__MATCH_KEYS:
                getMatchKeys().clear();
                getMatchKeys().addAll((Collection<? extends MatchKeyDefinition>)newValue);
                return;
            case RulesPackage.MATCH_RULE__MATCH_INTERVAL:
                setMatchInterval((Double)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case RulesPackage.MATCH_RULE__MATCH_KEYS:
                getMatchKeys().clear();
                return;
            case RulesPackage.MATCH_RULE__MATCH_INTERVAL:
                setMatchInterval(MATCH_INTERVAL_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case RulesPackage.MATCH_RULE__MATCH_KEYS:
                return matchKeys != null && !matchKeys.isEmpty();
            case RulesPackage.MATCH_RULE__MATCH_INTERVAL:
                return matchInterval != MATCH_INTERVAL_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (matchInterval: ");
        result.append(matchInterval);
        result.append(')');
        return result.toString();
    }

} // MatchRuleImpl
