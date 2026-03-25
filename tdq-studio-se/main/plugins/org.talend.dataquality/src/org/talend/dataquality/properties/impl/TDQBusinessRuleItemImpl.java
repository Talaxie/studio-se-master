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
import org.talend.commons.emf.FactoriesUtil;
import org.talend.core.model.properties.impl.TDQItemImpl;
import org.talend.dataquality.properties.PropertiesPackage;
import org.talend.dataquality.properties.TDQBusinessRuleItem;
import org.talend.dataquality.rules.DQRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDQ Business Rule Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.impl.TDQBusinessRuleItemImpl#getDqrule <em>Dqrule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDQBusinessRuleItemImpl extends TDQItemImpl implements TDQBusinessRuleItem {
    /**
     * The cached value of the '{@link #getDqrule() <em>Dqrule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDqrule()
     * @generated
     * @ordered
     */
    protected DQRule dqrule;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TDQBusinessRuleItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.TDQ_BUSINESS_RULE_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DQRule getDqrule() {
        if (dqrule != null && dqrule.eIsProxy()) {
            InternalEObject oldDqrule = (InternalEObject)dqrule;
            dqrule = (DQRule)eResolveProxy(oldDqrule);
            if (dqrule != oldDqrule) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.TDQ_BUSINESS_RULE_ITEM__DQRULE, oldDqrule, dqrule));
            }
        }
        return dqrule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DQRule basicGetDqrule() {
        return dqrule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDqrule(DQRule newDqrule) {
        DQRule oldDqrule = dqrule;
        dqrule = newDqrule;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TDQ_BUSINESS_RULE_ITEM__DQRULE, oldDqrule, dqrule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.TDQ_BUSINESS_RULE_ITEM__DQRULE:
                if (resolve) return getDqrule();
                return basicGetDqrule();
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
            case PropertiesPackage.TDQ_BUSINESS_RULE_ITEM__DQRULE:
                setDqrule((DQRule)newValue);
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
            case PropertiesPackage.TDQ_BUSINESS_RULE_ITEM__DQRULE:
                setDqrule((DQRule)null);
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
            case PropertiesPackage.TDQ_BUSINESS_RULE_ITEM__DQRULE:
                return dqrule != null;
        }
        return super.eIsSet(featureID);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getFileExtension(){
        return FactoriesUtil.DQRULE;
    }
    
} //TDQBusinessRuleItemImpl
