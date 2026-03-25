/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.talend.dataquality.indicators.definition.impl.IndicatorDefinitionImpl;
import org.talend.dataquality.rules.DQRule;
import org.talend.dataquality.rules.RulesPackage;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DQ Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.impl.DQRuleImpl#getCriticalityLevel <em>Criticality Level</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.DQRuleImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DQRuleImpl extends IndicatorDefinitionImpl implements DQRule {
    /**
     * The default value of the '{@link #getCriticalityLevel() <em>Criticality Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCriticalityLevel()
     * @generated
     * @ordered
     */
    protected static final int CRITICALITY_LEVEL_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCriticalityLevel() <em>Criticality Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCriticalityLevel()
     * @generated
     * @ordered
     */
    protected int criticalityLevel = CRITICALITY_LEVEL_EDEFAULT;

    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected EList<ModelElement> elements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DQRuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.DQ_RULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCriticalityLevel() {
        return criticalityLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCriticalityLevel(int newCriticalityLevel) {
        int oldCriticalityLevel = criticalityLevel;
        criticalityLevel = newCriticalityLevel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.DQ_RULE__CRITICALITY_LEVEL, oldCriticalityLevel, criticalityLevel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelElement> getElements() {
        if (elements == null) {
            elements = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, RulesPackage.DQ_RULE__ELEMENTS);
        }
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RulesPackage.DQ_RULE__CRITICALITY_LEVEL:
                return getCriticalityLevel();
            case RulesPackage.DQ_RULE__ELEMENTS:
                return getElements();
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
            case RulesPackage.DQ_RULE__CRITICALITY_LEVEL:
                setCriticalityLevel((Integer)newValue);
                return;
            case RulesPackage.DQ_RULE__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends ModelElement>)newValue);
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
            case RulesPackage.DQ_RULE__CRITICALITY_LEVEL:
                setCriticalityLevel(CRITICALITY_LEVEL_EDEFAULT);
                return;
            case RulesPackage.DQ_RULE__ELEMENTS:
                getElements().clear();
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
            case RulesPackage.DQ_RULE__CRITICALITY_LEVEL:
                return criticalityLevel != CRITICALITY_LEVEL_EDEFAULT;
            case RulesPackage.DQ_RULE__ELEMENTS:
                return elements != null && !elements.isEmpty();
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
        result.append(" (criticalityLevel: ");
        result.append(criticalityLevel);
        result.append(')');
        return result.toString();
    }

} //DQRuleImpl
