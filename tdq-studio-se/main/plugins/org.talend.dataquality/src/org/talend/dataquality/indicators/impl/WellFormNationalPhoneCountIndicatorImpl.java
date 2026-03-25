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
import org.talend.dataquality.indicators.TextParameters;
import org.talend.dataquality.indicators.WellFormNationalPhoneCountIndicator;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Well Form National Phone Count Indicator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.WellFormNationalPhoneCountIndicatorImpl#getWellFormNatiPhoneCount <em>Well Form Nati Phone Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WellFormNationalPhoneCountIndicatorImpl extends IndicatorImpl implements WellFormNationalPhoneCountIndicator {

    /**
     * The default value of the '{@link #getWellFormNatiPhoneCount() <em>Well Form Nati Phone Count</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getWellFormNatiPhoneCount()
     * @generated
     * @ordered
     */
    protected static final Long WELL_FORM_NATI_PHONE_COUNT_EDEFAULT = new Long(0L);

    /**
     * The cached value of the '{@link #getWellFormNatiPhoneCount() <em>Well Form Nati Phone Count</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getWellFormNatiPhoneCount()
     * @generated
     * @ordered
     */
    protected Long wellFormNatiPhoneCount = WELL_FORM_NATI_PHONE_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected WellFormNationalPhoneCountIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.WELL_FORM_NATIONAL_PHONE_COUNT_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Long getWellFormNatiPhoneCount() {
        return wellFormNatiPhoneCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWellFormNatiPhoneCount(Long newWellFormNatiPhoneCount) {
        Long oldWellFormNatiPhoneCount = wellFormNatiPhoneCount;
        wellFormNatiPhoneCount = newWellFormNatiPhoneCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.WELL_FORM_NATIONAL_PHONE_COUNT_INDICATOR__WELL_FORM_NATI_PHONE_COUNT, oldWellFormNatiPhoneCount, wellFormNatiPhoneCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Set<Object> getWellFormNatiPhoneValues() {
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
            case IndicatorsPackage.WELL_FORM_NATIONAL_PHONE_COUNT_INDICATOR__WELL_FORM_NATI_PHONE_COUNT:
                return getWellFormNatiPhoneCount();
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
            case IndicatorsPackage.WELL_FORM_NATIONAL_PHONE_COUNT_INDICATOR__WELL_FORM_NATI_PHONE_COUNT:
                setWellFormNatiPhoneCount((Long)newValue);
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
            case IndicatorsPackage.WELL_FORM_NATIONAL_PHONE_COUNT_INDICATOR__WELL_FORM_NATI_PHONE_COUNT:
                setWellFormNatiPhoneCount(WELL_FORM_NATI_PHONE_COUNT_EDEFAULT);
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
            case IndicatorsPackage.WELL_FORM_NATIONAL_PHONE_COUNT_INDICATOR__WELL_FORM_NATI_PHONE_COUNT:
                return WELL_FORM_NATI_PHONE_COUNT_EDEFAULT == null ? wellFormNatiPhoneCount != null : !WELL_FORM_NATI_PHONE_COUNT_EDEFAULT.equals(wellFormNatiPhoneCount);
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
        result.append(" (wellFormNatiPhoneCount: ");
        result.append(wellFormNatiPhoneCount);
        result.append(')');
        return result.toString();
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
            PhoneNumber phoneNumeber = phoneUtil.parseAndKeepRawInput(data.toString(), country);
            String format = phoneUtil.format(phoneNumeber, PhoneNumberFormat.NATIONAL);
            if (data.toString().equals(format)) {
                this.wellFormNatiPhoneCount++;
                if (checkMustStoreCurrentRow() || checkMustStoreCurrentRow(drillDownValueCount)) {
                    this.mustStoreRow = true;
                }
            }
        } catch (NumberParseException e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean reset() {
        this.wellFormNatiPhoneCount = WELL_FORM_NATI_PHONE_COUNT_EDEFAULT;
        drillDownValueCount = 0l;
        return super.reset();
    }

    @Override
    public Long getIntegerValue() {
        return this.getWellFormNatiPhoneCount();
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

} // WellFormNationalPhoneCountIndicatorImpl
