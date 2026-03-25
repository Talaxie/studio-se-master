/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.MatchingIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Matching Indicator</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.dataquality.indicators.impl.MatchingIndicatorImpl#getMatchingValueCount <em>Matching Value
 * Count</em>}</li>
 * <li>{@link org.talend.dataquality.indicators.impl.MatchingIndicatorImpl#getNotMatchingValueCount <em>Not Matching
 * Value Count</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class MatchingIndicatorImpl extends IndicatorImpl implements MatchingIndicator {

    /**
     * The default value of the '{@link #getMatchingValueCount() <em>Matching Value Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMatchingValueCount()
     * @generated NOT
     * @ordered
     */
    protected static final Long MATCHING_VALUE_COUNT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMatchingValueCount() <em>Matching Value Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMatchingValueCount()
     * @generated
     * @ordered
     */
    protected Long matchingValueCount = MATCHING_VALUE_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getNotMatchingValueCount() <em>Not Matching Value Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNotMatchingValueCount()
     * @generated NOT
     * @ordered
     */
    protected static final Long NOT_MATCHING_VALUE_COUNT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNotMatchingValueCount() <em>Not Matching Value Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNotMatchingValueCount()
     * @generated
     * @ordered
     */
    protected Long notMatchingValueCount = NOT_MATCHING_VALUE_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MatchingIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.MATCHING_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Long getMatchingValueCount() {
        return matchingValueCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMatchingValueCount(Long newMatchingValueCount) {
        Long oldMatchingValueCount = matchingValueCount;
        matchingValueCount = newMatchingValueCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.MATCHING_INDICATOR__MATCHING_VALUE_COUNT, oldMatchingValueCount, matchingValueCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Long getNotMatchingValueCount() {
        return notMatchingValueCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNotMatchingValueCount(Long newNotMatchingValueCount) {
        Long oldNotMatchingValueCount = notMatchingValueCount;
        notMatchingValueCount = newNotMatchingValueCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.MATCHING_INDICATOR__NOT_MATCHING_VALUE_COUNT, oldNotMatchingValueCount, notMatchingValueCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.MATCHING_INDICATOR__MATCHING_VALUE_COUNT:
                return getMatchingValueCount();
            case IndicatorsPackage.MATCHING_INDICATOR__NOT_MATCHING_VALUE_COUNT:
                return getNotMatchingValueCount();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case IndicatorsPackage.MATCHING_INDICATOR__MATCHING_VALUE_COUNT:
                setMatchingValueCount((Long)newValue);
                return;
            case IndicatorsPackage.MATCHING_INDICATOR__NOT_MATCHING_VALUE_COUNT:
                setNotMatchingValueCount((Long)newValue);
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
            case IndicatorsPackage.MATCHING_INDICATOR__MATCHING_VALUE_COUNT:
                setMatchingValueCount(MATCHING_VALUE_COUNT_EDEFAULT);
                return;
            case IndicatorsPackage.MATCHING_INDICATOR__NOT_MATCHING_VALUE_COUNT:
                setNotMatchingValueCount(NOT_MATCHING_VALUE_COUNT_EDEFAULT);
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
            case IndicatorsPackage.MATCHING_INDICATOR__MATCHING_VALUE_COUNT:
                return MATCHING_VALUE_COUNT_EDEFAULT == null ? matchingValueCount != null : !MATCHING_VALUE_COUNT_EDEFAULT.equals(matchingValueCount);
            case IndicatorsPackage.MATCHING_INDICATOR__NOT_MATCHING_VALUE_COUNT:
                return NOT_MATCHING_VALUE_COUNT_EDEFAULT == null ? notMatchingValueCount != null : !NOT_MATCHING_VALUE_COUNT_EDEFAULT.equals(notMatchingValueCount);
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
        result.append(" (matchingValueCount: ");
        result.append(matchingValueCount);
        result.append(", notMatchingValueCount: ");
        result.append(notMatchingValueCount);
        result.append(')');
        return result.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#reset()
     */
    @Override
    public boolean reset() {
        this.matchingValueCount = MATCHING_VALUE_COUNT_EDEFAULT;
        this.notMatchingValueCount = NOT_MATCHING_VALUE_COUNT_EDEFAULT;
        return super.reset();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#isUsedMapDBMode()
     */
    @Override
    public boolean isUsedMapDBMode() {
        return false;
    }

} // MatchingIndicatorImpl
