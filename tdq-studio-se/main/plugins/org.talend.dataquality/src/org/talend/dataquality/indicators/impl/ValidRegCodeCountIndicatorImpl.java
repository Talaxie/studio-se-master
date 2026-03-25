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
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.ValidRegCodeCountIndicator;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Valid Reg Code Count Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.ValidRegCodeCountIndicatorImpl#getValidRegCount <em>Valid Reg Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidRegCodeCountIndicatorImpl extends IndicatorImpl implements ValidRegCodeCountIndicator {

    /**
     * The default value of the '{@link #getValidRegCount() <em>Valid Reg Count</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getValidRegCount()
     * @generated
     * @ordered
     */
    protected static final Long VALID_REG_COUNT_EDEFAULT = new Long(0L);

    /**
     * The cached value of the '{@link #getValidRegCount() <em>Valid Reg Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidRegCount()
     * @generated
     * @ordered
     */
    protected Long validRegCount = VALID_REG_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ValidRegCodeCountIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.VALID_REG_CODE_COUNT_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Long getValidRegCount() {
        return validRegCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValidRegCount(Long newValidRegCount) {
        Long oldValidRegCount = validRegCount;
        validRegCount = newValidRegCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.VALID_REG_CODE_COUNT_INDICATOR__VALID_REG_COUNT, oldValidRegCount, validRegCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Set<Object> getValidRegValues() {
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
            case IndicatorsPackage.VALID_REG_CODE_COUNT_INDICATOR__VALID_REG_COUNT:
                return getValidRegCount();
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
            case IndicatorsPackage.VALID_REG_CODE_COUNT_INDICATOR__VALID_REG_COUNT:
                setValidRegCount((Long)newValue);
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
            case IndicatorsPackage.VALID_REG_CODE_COUNT_INDICATOR__VALID_REG_COUNT:
                setValidRegCount(VALID_REG_COUNT_EDEFAULT);
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
            case IndicatorsPackage.VALID_REG_CODE_COUNT_INDICATOR__VALID_REG_COUNT:
                return VALID_REG_COUNT_EDEFAULT == null ? validRegCount != null : !VALID_REG_COUNT_EDEFAULT.equals(validRegCount);
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
        result.append(" (validRegCount: ");
        result.append(validRegCount);
        result.append(')');
        return result.toString();
    }

    /*
     * (non-Jsdoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#handle(java.lang.Object)
     */
    @Override
    public boolean handle(Object data) {
        super.handle(data);
        if (data == null) {
            return false;
        }
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        // }

        // the parameter defualtRegion is null at here, it will get an region code when the data is guaranteed to
        // start with a '+' followed by the country calling code. e.g. "+86 13521588311", "+8613521588311",
        // "+86 1352 1588 311". or else, it will throw Exception and as a invalid Region Code.
        boolean parseSuccess = true;
        String regionCodeForNumber = null;
        try {
            PhoneNumber phhoneNum = phoneUtil.parse(data.toString(), null);
            regionCodeForNumber = phoneUtil.getRegionCodeForNumber(phhoneNum);
        } catch (NumberParseException e) {
            parseSuccess = false;
        }
        Set<String> supportedCountries = phoneUtil.getSupportedRegions();
        if (parseSuccess && supportedCountries.contains(regionCodeForNumber)) {
            this.validRegCount++;
            if (checkMustStoreCurrentRow() || checkMustStoreCurrentRow(drillDownValueCount)) {
                this.mustStoreRow = true;
            }
        }

        return true;
    }

    @Override
    public boolean reset() {
        this.validRegCount = VALID_REG_COUNT_EDEFAULT;
        drillDownValueCount = 0l;
        return super.reset();
    }

    @Override
    public Long getIntegerValue() {
        return this.getValidRegCount();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#handleDrillDownData(java.lang.Object, java.util.List)
     */
    @Override
    public void handleDrillDownData(Object masterObject, List<Object> inputRowList) {
        if (checkMustStoreCurrentRow()) {
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

} // ValidRegCodeCountIndicatorImpl
