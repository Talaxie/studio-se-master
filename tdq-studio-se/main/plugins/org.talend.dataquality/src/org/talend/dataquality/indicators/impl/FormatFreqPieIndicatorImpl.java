/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.PluginConstant;
import org.talend.dataquality.helpers.IndicatorHelper;
import org.talend.dataquality.indicators.FormatFreqPieIndicator;
import org.talend.dataquality.indicators.IndicatorParameters;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.TextParameters;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Format Freq Pie Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.FormatFreqPieIndicatorImpl#getWellFormE164Count <em>Well Form E164 Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.FormatFreqPieIndicatorImpl#getWellFormInteCount <em>Well Form Inte Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.FormatFreqPieIndicatorImpl#getWellFormNatiCount <em>Well Form Nati Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.FormatFreqPieIndicatorImpl#getInvalidFormCount <em>Invalid Form Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.FormatFreqPieIndicatorImpl#getCurrentKey <em>Current Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormatFreqPieIndicatorImpl extends FrequencyIndicatorImpl implements FormatFreqPieIndicator {

    protected final String PLUS_SIGN = "+";//$NON-NLS-1$

    private final String WELL_FORM_E164_KEY = "Format_E164";

    private final String WELL_FORM_INTE_KEY = "Format_International";

    private final String WELL_FORM_NATI_KEY = "Format_National";

    private final String INVALID_FORM_KEY = "Other";

    /**
     * The default value of the '{@link #getWellFormE164Count() <em>Well Form E164 Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getWellFormE164Count()
     * @generated
     * @ordered
     */
    protected static final long WELL_FORM_E164_COUNT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getWellFormE164Count() <em>Well Form E164 Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getWellFormE164Count()
     * @generated
     * @ordered
     */
    protected long wellFormE164Count = WELL_FORM_E164_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getWellFormInteCount() <em>Well Form Inte Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getWellFormInteCount()
     * @generated
     * @ordered
     */
    protected static final long WELL_FORM_INTE_COUNT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getWellFormInteCount() <em>Well Form Inte Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getWellFormInteCount()
     * @generated
     * @ordered
     */
    protected long wellFormInteCount = WELL_FORM_INTE_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getWellFormNatiCount() <em>Well Form Nati Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getWellFormNatiCount()
     * @generated
     * @ordered
     */
    protected static final long WELL_FORM_NATI_COUNT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getWellFormNatiCount() <em>Well Form Nati Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getWellFormNatiCount()
     * @generated
     * @ordered
     */
    protected long wellFormNatiCount = WELL_FORM_NATI_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getInvalidFormCount() <em>Invalid Form Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getInvalidFormCount()
     * @generated
     * @ordered
     */
    protected static final long INVALID_FORM_COUNT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getInvalidFormCount() <em>Invalid Form Count</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getInvalidFormCount()
     * @generated
     * @ordered
     */
    protected long invalidFormCount = INVALID_FORM_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getCurrentKey() <em>Current Key</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getCurrentKey()
     * @generated
     * @ordered
     */
    protected static final String CURRENT_KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrentKey() <em>Current Key</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getCurrentKey()
     * @generated
     * @ordered
     */
    protected String currentKey = CURRENT_KEY_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected FormatFreqPieIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.FORMAT_FREQ_PIE_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getWellFormE164Count() {
        return wellFormE164Count;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWellFormE164Count(long newWellFormE164Count) {
        long oldWellFormE164Count = wellFormE164Count;
        wellFormE164Count = newWellFormE164Count;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_E164_COUNT, oldWellFormE164Count, wellFormE164Count));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getWellFormInteCount() {
        return wellFormInteCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWellFormInteCount(long newWellFormInteCount) {
        long oldWellFormInteCount = wellFormInteCount;
        wellFormInteCount = newWellFormInteCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_INTE_COUNT, oldWellFormInteCount, wellFormInteCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getWellFormNatiCount() {
        return wellFormNatiCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWellFormNatiCount(long newWellFormNatiCount) {
        long oldWellFormNatiCount = wellFormNatiCount;
        wellFormNatiCount = newWellFormNatiCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_NATI_COUNT, oldWellFormNatiCount, wellFormNatiCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getInvalidFormCount() {
        return invalidFormCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInvalidFormCount(long newInvalidFormCount) {
        long oldInvalidFormCount = invalidFormCount;
        invalidFormCount = newInvalidFormCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__INVALID_FORM_COUNT, oldInvalidFormCount, invalidFormCount));
    }

    /**
     * <!-- get the current key for drilling down --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getCurrentKey() {
        return currentKey;
    }

    /**
     * <!-- based on the current date foramt,set the current key --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCurrentKey(String newCurrentKey) {
        String oldCurrentKey = currentKey;
        currentKey = newCurrentKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__CURRENT_KEY, oldCurrentKey, currentKey));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_E164_COUNT:
                return getWellFormE164Count();
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_INTE_COUNT:
                return getWellFormInteCount();
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_NATI_COUNT:
                return getWellFormNatiCount();
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__INVALID_FORM_COUNT:
                return getInvalidFormCount();
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__CURRENT_KEY:
                return getCurrentKey();
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
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_E164_COUNT:
                setWellFormE164Count((Long)newValue);
                return;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_INTE_COUNT:
                setWellFormInteCount((Long)newValue);
                return;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_NATI_COUNT:
                setWellFormNatiCount((Long)newValue);
                return;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__INVALID_FORM_COUNT:
                setInvalidFormCount((Long)newValue);
                return;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__CURRENT_KEY:
                setCurrentKey((String)newValue);
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
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_E164_COUNT:
                setWellFormE164Count(WELL_FORM_E164_COUNT_EDEFAULT);
                return;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_INTE_COUNT:
                setWellFormInteCount(WELL_FORM_INTE_COUNT_EDEFAULT);
                return;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_NATI_COUNT:
                setWellFormNatiCount(WELL_FORM_NATI_COUNT_EDEFAULT);
                return;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__INVALID_FORM_COUNT:
                setInvalidFormCount(INVALID_FORM_COUNT_EDEFAULT);
                return;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__CURRENT_KEY:
                setCurrentKey(CURRENT_KEY_EDEFAULT);
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
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_E164_COUNT:
                return wellFormE164Count != WELL_FORM_E164_COUNT_EDEFAULT;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_INTE_COUNT:
                return wellFormInteCount != WELL_FORM_INTE_COUNT_EDEFAULT;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__WELL_FORM_NATI_COUNT:
                return wellFormNatiCount != WELL_FORM_NATI_COUNT_EDEFAULT;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__INVALID_FORM_COUNT:
                return invalidFormCount != INVALID_FORM_COUNT_EDEFAULT;
            case IndicatorsPackage.FORMAT_FREQ_PIE_INDICATOR__CURRENT_KEY:
                return CURRENT_KEY_EDEFAULT == null ? currentKey != null : !CURRENT_KEY_EDEFAULT.equals(currentKey);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @Not generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        return result.toString();
    }

    @Override
    public boolean handle(Object data) {
        count++;
        boolean isInvalidForm = false;
        try {
            if (data == null || data.toString().trim().equals(PluginConstant.EMPTY_STRING)) {
                isInvalidForm = true;
            } else {

                PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
                IndicatorParameters indParameters = this.getParameters();
                TextParameters textParameters = indParameters == null ? null : indParameters.getTextParameter();
                String country = IndicatorHelper.getCountryCodeByParameter(textParameters);
                PhoneNumber phoneNumeber = phoneUtil.parse(data.toString(), country);
                // MOD msjian TDQ-7603 2013-7-19: with the Standard value to compare
                String format_E164 = phoneUtil.format(phoneNumeber, PhoneNumberFormat.E164);
                String format_inter = phoneUtil.format(phoneNumeber, PhoneNumberFormat.INTERNATIONAL);
                String format_national = phoneUtil.format(phoneNumeber, PhoneNumberFormat.NATIONAL);
                if (data.toString().equals(format_E164)) {
                    this.mustStoreRow = checkMustStoreCurrentRow(wellFormE164Count);
                    wellFormE164Count++;
                    setCurrentKey(WELL_FORM_E164_KEY);

                } else if (data.toString().equals(format_inter)) {
                    this.mustStoreRow = checkMustStoreCurrentRow(wellFormInteCount);
                    wellFormInteCount++;
                    setCurrentKey(WELL_FORM_INTE_KEY);
                } else if (data.toString().equals(format_national)) {
                    this.mustStoreRow = checkMustStoreCurrentRow(wellFormNatiCount);
                    wellFormNatiCount++;
                    setCurrentKey(WELL_FORM_NATI_KEY);
                } else {
                    isInvalidForm = true;
                }
                // TDQ-7603~

            }

        } catch (Exception e) {
            isInvalidForm = true;
        }
        if (isInvalidForm) {
            this.mustStoreRow = checkMustStoreCurrentRow(invalidFormCount);
            invalidFormCount++;
            setCurrentKey(INVALID_FORM_KEY);
        }
        return true;
    }

    @Override
    public boolean reset() {
        wellFormE164Count = WELL_FORM_E164_COUNT_EDEFAULT;
        wellFormInteCount = WELL_FORM_INTE_COUNT_EDEFAULT;
        wellFormNatiCount = WELL_FORM_NATI_COUNT_EDEFAULT;
        invalidFormCount = INVALID_FORM_COUNT_EDEFAULT;
        return super.reset();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.FrequencyIndicatorImpl#getCount(java.lang.Object)
     */
    @Override
    public Long getCount(Object dataValue) {
        Long freq = this.valueToFreq.get(dataValue);
        return (freq == null) ? 0L : freq;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.FrequencyIndicatorImpl#finalizeComputation()
     */
    @Override
    public boolean finalizeComputation() {
        getMapForFreq().put(this.WELL_FORM_E164_KEY, wellFormE164Count);
        getMapForFreq().put(this.WELL_FORM_INTE_KEY, wellFormInteCount);
        getMapForFreq().put(this.WELL_FORM_NATI_KEY, wellFormNatiCount);
        getMapForFreq().put(this.INVALID_FORM_KEY, invalidFormCount);
        return super.finalizeComputation();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.FrequencyIndicatorImpl#getDBName(java.lang.Object)
     */
    @Override
    protected String getDBName(Object name) {
        return this.getCurrentKey();
    }

} // FormatFreqPieIndicatorImpl
