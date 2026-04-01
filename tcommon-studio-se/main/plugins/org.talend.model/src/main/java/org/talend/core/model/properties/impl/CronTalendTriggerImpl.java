/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.talend.core.model.properties.CronTalendTrigger;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cron Talaxie Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.CronTalendTriggerImpl#getCronExpression <em>Cron Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CronTalendTriggerImpl extends TalendTriggerImpl implements CronTalendTrigger {
    /**
     * The default value of the '{@link #getCronExpression() <em>Cron Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCronExpression()
     * @generated
     * @ordered
     */
    protected static final String CRON_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCronExpression() <em>Cron Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCronExpression()
     * @generated
     * @ordered
     */
    protected String cronExpression = CRON_EXPRESSION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CronTalendTriggerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.CRON_TALEND_TRIGGER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCronExpression(String newCronExpression) {
        String oldCronExpression = cronExpression;
        cronExpression = newCronExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CRON_TALEND_TRIGGER__CRON_EXPRESSION, oldCronExpression, cronExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.CRON_TALEND_TRIGGER__CRON_EXPRESSION:
                return getCronExpression();
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
            case PropertiesPackage.CRON_TALEND_TRIGGER__CRON_EXPRESSION:
                setCronExpression((String)newValue);
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
            case PropertiesPackage.CRON_TALEND_TRIGGER__CRON_EXPRESSION:
                setCronExpression(CRON_EXPRESSION_EDEFAULT);
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
            case PropertiesPackage.CRON_TALEND_TRIGGER__CRON_EXPRESSION:
                return CRON_EXPRESSION_EDEFAULT == null ? cronExpression != null : !CRON_EXPRESSION_EDEFAULT.equals(cronExpression);
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
        result.append(" (cronExpression: ");
        result.append(cronExpression);
        result.append(')');
        return result.toString();
    }

} //CronTalendTriggerImpl
