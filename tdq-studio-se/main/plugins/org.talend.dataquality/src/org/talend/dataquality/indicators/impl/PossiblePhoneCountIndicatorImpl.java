/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.helpers.IndicatorHelper;
import org.talend.dataquality.indicators.IndicatorParameters;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.PossiblePhoneCountIndicator;
import org.talend.dataquality.indicators.TextParameters;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Possible Phone Count Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.PossiblePhoneCountIndicatorImpl#getPossiblePhoneCount <em>Possible Phone Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PossiblePhoneCountIndicatorImpl extends IndicatorImpl implements PossiblePhoneCountIndicator {

    /**
     * The default value of the '{@link #getPossiblePhoneCount() <em>Possible Phone Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPossiblePhoneCount()
     * @generated
     * @ordered
     */
    protected static final Long POSSIBLE_PHONE_COUNT_EDEFAULT = new Long(0L);

    /**
     * The cached value of the '{@link #getPossiblePhoneCount() <em>Possible Phone Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getPossiblePhoneCount()
     * @generated
     * @ordered
     */
    protected Long possiblePhoneCount = POSSIBLE_PHONE_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected PossiblePhoneCountIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.POSSIBLE_PHONE_COUNT_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Long getPossiblePhoneCount() {
        return possiblePhoneCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPossiblePhoneCount(Long newPossiblePhoneCount) {
        Long oldPossiblePhoneCount = possiblePhoneCount;
        possiblePhoneCount = newPossiblePhoneCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.POSSIBLE_PHONE_COUNT_INDICATOR__POSSIBLE_PHONE_COUNT, oldPossiblePhoneCount, possiblePhoneCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Set<Object> getPossiblePhoneValues() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.POSSIBLE_PHONE_COUNT_INDICATOR__POSSIBLE_PHONE_COUNT:
                return getPossiblePhoneCount();
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
            case IndicatorsPackage.POSSIBLE_PHONE_COUNT_INDICATOR__POSSIBLE_PHONE_COUNT:
                setPossiblePhoneCount((Long)newValue);
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
            case IndicatorsPackage.POSSIBLE_PHONE_COUNT_INDICATOR__POSSIBLE_PHONE_COUNT:
                setPossiblePhoneCount(POSSIBLE_PHONE_COUNT_EDEFAULT);
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
            case IndicatorsPackage.POSSIBLE_PHONE_COUNT_INDICATOR__POSSIBLE_PHONE_COUNT:
                return POSSIBLE_PHONE_COUNT_EDEFAULT == null ? possiblePhoneCount != null : !POSSIBLE_PHONE_COUNT_EDEFAULT.equals(possiblePhoneCount);
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
        result.append(" (possiblePhoneCount: ");
        result.append(possiblePhoneCount);
        result.append(')');
        return result.toString();
    }

    @Override
    public boolean reset() {
        this.possiblePhoneCount = POSSIBLE_PHONE_COUNT_EDEFAULT;
        drillDownValueCount = 0l;
        return super.reset();
    }

    @Override
    public Long getIntegerValue() {
        return this.getPossiblePhoneCount();
    }

    @Override
    public boolean handle(Object data) {
        super.handle(data);
        if (data == null) {
            return false;
        }
        try {
            PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
            IndicatorParameters indParameters = this.getParameters();
            TextParameters textParameters = indParameters == null ? null : indParameters.getTextParameter();
            String country = IndicatorHelper.getCountryCodeByParameter(textParameters);
            PhoneNumber phoneNumeber = phoneUtil.parse(data.toString(), country);
            // It only checks the length of phone numbers. In particular, it doesn't check starting digits of the
            // number.
            if (phoneUtil.isPossibleNumber(phoneNumeber)) {
                this.possiblePhoneCount++;
                if (checkMustStoreCurrentRow() || this.checkMustStoreCurrentRow(drillDownValueCount)) {
                    this.mustStoreRow = true;
                }
            }
        } catch (NumberParseException e) {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#handleDrillDownData(java.lang.Object, java.util.List)
     */
    @Override
    public void handleDrillDownData(Object masterObject, List<Object> inputRowList) {
        if (this.checkMustStoreCurrentRow()) {
            super.handleDrillDownData(masterObject, inputRowList);
        }
        // store drill dwon data for view values
        if (this.checkMustStoreCurrentRow(drillDownValueCount)) {
            if (!drillDownValuesSet.contains(masterObject)) {
                drillDownValueCount++;
                drillDownValuesSet.add(masterObject);
            }
        }
    }

} // PossiblePhoneCountIndicatorImpl
