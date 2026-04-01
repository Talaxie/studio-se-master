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

import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.SimpleTalendTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Talaxie Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.SimpleTalendTriggerImpl#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SimpleTalendTriggerImpl#getRepeatInterval <em>Repeat Interval</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SimpleTalendTriggerImpl#getTimesTriggered <em>Times Triggered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTalendTriggerImpl extends TalendTriggerImpl implements SimpleTalendTrigger {
    /**
     * The default value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepeatCount()
     * @generated
     * @ordered
     */
    protected static final Integer REPEAT_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepeatCount()
     * @generated
     * @ordered
     */
    protected Integer repeatCount = REPEAT_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getRepeatInterval() <em>Repeat Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepeatInterval()
     * @generated
     * @ordered
     */
    protected static final long REPEAT_INTERVAL_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRepeatInterval() <em>Repeat Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepeatInterval()
     * @generated
     * @ordered
     */
    protected long repeatInterval = REPEAT_INTERVAL_EDEFAULT;

    /**
     * The default value of the '{@link #getTimesTriggered() <em>Times Triggered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimesTriggered()
     * @generated
     * @ordered
     */
    protected static final int TIMES_TRIGGERED_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTimesTriggered() <em>Times Triggered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimesTriggered()
     * @generated
     * @ordered
     */
    protected int timesTriggered = TIMES_TRIGGERED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleTalendTriggerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.SIMPLE_TALEND_TRIGGER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getRepeatCount() {
        return repeatCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepeatCount(Integer newRepeatCount) {
        Integer oldRepeatCount = repeatCount;
        repeatCount = newRepeatCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SIMPLE_TALEND_TRIGGER__REPEAT_COUNT, oldRepeatCount, repeatCount));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getRepeatInterval() {
        return repeatInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepeatInterval(long newRepeatInterval) {
        long oldRepeatInterval = repeatInterval;
        repeatInterval = newRepeatInterval;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SIMPLE_TALEND_TRIGGER__REPEAT_INTERVAL, oldRepeatInterval, repeatInterval));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTimesTriggered() {
        return timesTriggered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimesTriggered(int newTimesTriggered) {
        int oldTimesTriggered = timesTriggered;
        timesTriggered = newTimesTriggered;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SIMPLE_TALEND_TRIGGER__TIMES_TRIGGERED, oldTimesTriggered, timesTriggered));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__REPEAT_COUNT:
                return getRepeatCount();
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__REPEAT_INTERVAL:
                return new Long(getRepeatInterval());
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__TIMES_TRIGGERED:
                return new Integer(getTimesTriggered());
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
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__REPEAT_COUNT:
                setRepeatCount((Integer)newValue);
                return;
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__REPEAT_INTERVAL:
                setRepeatInterval(((Long)newValue).longValue());
                return;
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__TIMES_TRIGGERED:
                setTimesTriggered(((Integer)newValue).intValue());
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
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__REPEAT_COUNT:
                setRepeatCount(REPEAT_COUNT_EDEFAULT);
                return;
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__REPEAT_INTERVAL:
                setRepeatInterval(REPEAT_INTERVAL_EDEFAULT);
                return;
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__TIMES_TRIGGERED:
                setTimesTriggered(TIMES_TRIGGERED_EDEFAULT);
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
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__REPEAT_COUNT:
                return REPEAT_COUNT_EDEFAULT == null ? repeatCount != null : !REPEAT_COUNT_EDEFAULT.equals(repeatCount);
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__REPEAT_INTERVAL:
                return repeatInterval != REPEAT_INTERVAL_EDEFAULT;
            case PropertiesPackage.SIMPLE_TALEND_TRIGGER__TIMES_TRIGGERED:
                return timesTriggered != TIMES_TRIGGERED_EDEFAULT;
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
        result.append(" (repeatCount: ");
        result.append(repeatCount);
        result.append(", repeatInterval: ");
        result.append(repeatInterval);
        result.append(", timesTriggered: ");
        result.append(timesTriggered);
        result.append(')');
        return result.toString();
    }

} //SimpleTalendTriggerImpl
