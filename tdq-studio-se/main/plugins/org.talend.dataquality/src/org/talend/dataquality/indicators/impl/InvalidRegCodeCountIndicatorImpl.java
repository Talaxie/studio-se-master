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
import org.talend.dataquality.indicators.InvalidRegCodeCountIndicator;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Invalid Reg Code Count Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.InvalidRegCodeCountIndicatorImpl#getInvalidRegCount <em>Invalid Reg Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvalidRegCodeCountIndicatorImpl extends IndicatorImpl implements InvalidRegCodeCountIndicator {

    /**
     * The default value of the '{@link #getInvalidRegCount() <em>Invalid Reg Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getInvalidRegCount()
     * @generated
     * @ordered
     */
    protected static final Long INVALID_REG_COUNT_EDEFAULT = new Long(0L);

    /**
     * The cached value of the '{@link #getInvalidRegCount() <em>Invalid Reg Count</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getInvalidRegCount()
     * @generated
     * @ordered
     */
    protected Long invalidRegCount = INVALID_REG_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected InvalidRegCodeCountIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.INVALID_REG_CODE_COUNT_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Long getInvalidRegCount() {
        return invalidRegCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInvalidRegCount(Long newInvalidRegCount) {
        Long oldInvalidRegCount = invalidRegCount;
        invalidRegCount = newInvalidRegCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.INVALID_REG_CODE_COUNT_INDICATOR__INVALID_REG_COUNT, oldInvalidRegCount, invalidRegCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Set<Object> getInvalidRegValues() {
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
            case IndicatorsPackage.INVALID_REG_CODE_COUNT_INDICATOR__INVALID_REG_COUNT:
                return getInvalidRegCount();
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
            case IndicatorsPackage.INVALID_REG_CODE_COUNT_INDICATOR__INVALID_REG_COUNT:
                setInvalidRegCount((Long)newValue);
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
            case IndicatorsPackage.INVALID_REG_CODE_COUNT_INDICATOR__INVALID_REG_COUNT:
                setInvalidRegCount(INVALID_REG_COUNT_EDEFAULT);
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
            case IndicatorsPackage.INVALID_REG_CODE_COUNT_INDICATOR__INVALID_REG_COUNT:
                return INVALID_REG_COUNT_EDEFAULT == null ? invalidRegCount != null : !INVALID_REG_COUNT_EDEFAULT.equals(invalidRegCount);
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
        result.append(" (invalidRegCount: ");
        result.append(invalidRegCount);
        result.append(')');
        return result.toString();
    }

    @Override
    public boolean handle(Object data) {
        super.handle(data);
        if (data == null) {
            this.invalidRegCount++;
            setMustStoreRow();
            return false;
        }
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        boolean parseSuccess = true;
        String regionCodeForNumber = null;
        try {
            // the parameter defualtRegion is null at here, it will get an region code when the data is guaranteed to
            // start with a '+' followed by the country calling code. e.g. "+86 13521588311", "+8613521588311",
            // "+86 1352 1588 311". or else, it will throw Exception as an invalid Region Code.
            PhoneNumber phhoneNum = phoneUtil.parse(data.toString(), null);
            regionCodeForNumber = phoneUtil.getRegionCodeForNumber(phhoneNum);
        } catch (NumberParseException e) {
            parseSuccess = false;
        }
        Set<String> supportedCountries = phoneUtil.getSupportedRegions();

        if (!parseSuccess || (!supportedCountries.contains(regionCodeForNumber))) {
            this.invalidRegCount++;
            setMustStoreRow();
        }
        return true;
    }

    /**
     * DOC qiongli Comment method "setMustStoreRow".
     */
    private void setMustStoreRow() {
        if (checkMustStoreCurrentRow() || checkMustStoreCurrentRow(drillDownValueCount)) {
            this.mustStoreRow = true;
        }
    }

    @Override
    public boolean reset() {
        this.invalidRegCount = INVALID_REG_COUNT_EDEFAULT;
        drillDownValueCount = 0l;
        return super.reset();
    }

    @Override
    public Long getIntegerValue() {
        return this.getInvalidRegCount();
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

} // InvalidRegCodeCountIndicatorImpl
