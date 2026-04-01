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
import org.talend.dataquality.indicators.WellFormE164PhoneCountIndicator;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Well Form E164 Phone Count Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.WellFormE164PhoneCountIndicatorImpl#getWellFormE164PhoneCount <em>Well Form E164 Phone Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WellFormE164PhoneCountIndicatorImpl extends IndicatorImpl implements WellFormE164PhoneCountIndicator {

    protected final String PLUS_SIGN = "+";//$NON-NLS-1$

    /**
     * The default value of the '{@link #getWellFormE164PhoneCount() <em>Well Form E164 Phone Count</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getWellFormE164PhoneCount()
     * @generated
     * @ordered
     */
    protected static final Long WELL_FORM_E164_PHONE_COUNT_EDEFAULT = new Long(0L);

    /**
     * The cached value of the '{@link #getWellFormE164PhoneCount() <em>Well Form E164 Phone Count</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getWellFormE164PhoneCount()
     * @generated
     * @ordered
     */
    protected Long wellFormE164PhoneCount = WELL_FORM_E164_PHONE_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected WellFormE164PhoneCountIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.WELL_FORM_E164_PHONE_COUNT_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Long getWellFormE164PhoneCount() {
        return wellFormE164PhoneCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWellFormE164PhoneCount(Long newWellFormE164PhoneCount) {
        Long oldWellFormE164PhoneCount = wellFormE164PhoneCount;
        wellFormE164PhoneCount = newWellFormE164PhoneCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.WELL_FORM_E164_PHONE_COUNT_INDICATOR__WELL_FORM_E164_PHONE_COUNT, oldWellFormE164PhoneCount, wellFormE164PhoneCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Set<Object> getWellFormE164PhoneValues() {
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
            case IndicatorsPackage.WELL_FORM_E164_PHONE_COUNT_INDICATOR__WELL_FORM_E164_PHONE_COUNT:
                return getWellFormE164PhoneCount();
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
            case IndicatorsPackage.WELL_FORM_E164_PHONE_COUNT_INDICATOR__WELL_FORM_E164_PHONE_COUNT:
                setWellFormE164PhoneCount((Long)newValue);
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
            case IndicatorsPackage.WELL_FORM_E164_PHONE_COUNT_INDICATOR__WELL_FORM_E164_PHONE_COUNT:
                setWellFormE164PhoneCount(WELL_FORM_E164_PHONE_COUNT_EDEFAULT);
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
            case IndicatorsPackage.WELL_FORM_E164_PHONE_COUNT_INDICATOR__WELL_FORM_E164_PHONE_COUNT:
                return WELL_FORM_E164_PHONE_COUNT_EDEFAULT == null ? wellFormE164PhoneCount != null : !WELL_FORM_E164_PHONE_COUNT_EDEFAULT.equals(wellFormE164PhoneCount);
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
        result.append(" (wellFormE164PhoneCount: ");
        result.append(wellFormE164PhoneCount);
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
            PhoneNumber phoneNumeber = phoneUtil.parse(data.toString(), country);
            String format = phoneUtil.format(phoneNumeber, PhoneNumberFormat.E164);
            if (data.toString().equals(format)) {
                wellFormE164PhoneCount++;
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
        this.wellFormE164PhoneCount = WELL_FORM_E164_PHONE_COUNT_EDEFAULT;
        drillDownValueCount = 0l;
        return super.reset();
    }

    @Override
    public Long getIntegerValue() {
        return this.getWellFormE164PhoneCount();
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

} // WellFormE164PhoneCountIndicatorImpl
