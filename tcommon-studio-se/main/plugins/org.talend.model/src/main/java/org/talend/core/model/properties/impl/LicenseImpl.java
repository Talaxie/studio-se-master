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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.core.model.properties.License;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.LicenseImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.LicenseImpl#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.LicenseImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.LicenseImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.LicenseImpl#getDateTokenCheck <em>Date Token Check</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LicenseImpl extends EObjectImpl implements License {
    /**
     * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLicense()
     * @generated
     * @ordered
     */
    protected static final byte[] LICENSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLicense()
     * @generated
     * @ordered
     */
    protected byte[] license = LICENSE_EDEFAULT;

    /**
     * The default value of the '{@link #getCustomerName() <em>Customer Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerName()
     * @generated
     * @ordered
     */
    protected static final String CUSTOMER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomerName() <em>Customer Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerName()
     * @generated
     * @ordered
     */
    protected String customerName = CUSTOMER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getParams() <em>Params</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParams()
     * @generated
     * @ordered
     */
    protected static final String PARAMS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getParams() <em>Params</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParams()
     * @generated
     * @ordered
     */
    protected String params = PARAMS_EDEFAULT;

    /**
     * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToken()
     * @generated
     * @ordered
     */
    protected static final String TOKEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToken()
     * @generated
     * @ordered
     */
    protected String token = TOKEN_EDEFAULT;

    /**
     * The default value of the '{@link #getDateTokenCheck() <em>Date Token Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateTokenCheck()
     * @generated
     * @ordered
     */
    protected static final String DATE_TOKEN_CHECK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateTokenCheck() <em>Date Token Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateTokenCheck()
     * @generated
     * @ordered
     */
    protected String dateTokenCheck = DATE_TOKEN_CHECK_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LicenseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.LICENSE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public byte[] getLicense() {
        return license;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLicense(byte[] newLicense) {
        byte[] oldLicense = license;
        license = newLicense;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.LICENSE__LICENSE, oldLicense, license));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCustomerName(String newCustomerName) {
        String oldCustomerName = customerName;
        customerName = newCustomerName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.LICENSE__CUSTOMER_NAME, oldCustomerName, customerName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getParams() {
        return params;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParams(String newParams) {
        String oldParams = params;
        params = newParams;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.LICENSE__PARAMS, oldParams, params));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getToken() {
        return token;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setToken(String newToken) {
        String oldToken = token;
        token = newToken;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.LICENSE__TOKEN, oldToken, token));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDateTokenCheck() {
        return dateTokenCheck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDateTokenCheck(String newDateTokenCheck) {
        String oldDateTokenCheck = dateTokenCheck;
        dateTokenCheck = newDateTokenCheck;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.LICENSE__DATE_TOKEN_CHECK, oldDateTokenCheck, dateTokenCheck));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.LICENSE__LICENSE:
                return getLicense();
            case PropertiesPackage.LICENSE__CUSTOMER_NAME:
                return getCustomerName();
            case PropertiesPackage.LICENSE__PARAMS:
                return getParams();
            case PropertiesPackage.LICENSE__TOKEN:
                return getToken();
            case PropertiesPackage.LICENSE__DATE_TOKEN_CHECK:
                return getDateTokenCheck();
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
            case PropertiesPackage.LICENSE__LICENSE:
                setLicense((byte[])newValue);
                return;
            case PropertiesPackage.LICENSE__CUSTOMER_NAME:
                setCustomerName((String)newValue);
                return;
            case PropertiesPackage.LICENSE__PARAMS:
                setParams((String)newValue);
                return;
            case PropertiesPackage.LICENSE__TOKEN:
                setToken((String)newValue);
                return;
            case PropertiesPackage.LICENSE__DATE_TOKEN_CHECK:
                setDateTokenCheck((String)newValue);
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
            case PropertiesPackage.LICENSE__LICENSE:
                setLicense(LICENSE_EDEFAULT);
                return;
            case PropertiesPackage.LICENSE__CUSTOMER_NAME:
                setCustomerName(CUSTOMER_NAME_EDEFAULT);
                return;
            case PropertiesPackage.LICENSE__PARAMS:
                setParams(PARAMS_EDEFAULT);
                return;
            case PropertiesPackage.LICENSE__TOKEN:
                setToken(TOKEN_EDEFAULT);
                return;
            case PropertiesPackage.LICENSE__DATE_TOKEN_CHECK:
                setDateTokenCheck(DATE_TOKEN_CHECK_EDEFAULT);
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
            case PropertiesPackage.LICENSE__LICENSE:
                return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
            case PropertiesPackage.LICENSE__CUSTOMER_NAME:
                return CUSTOMER_NAME_EDEFAULT == null ? customerName != null : !CUSTOMER_NAME_EDEFAULT.equals(customerName);
            case PropertiesPackage.LICENSE__PARAMS:
                return PARAMS_EDEFAULT == null ? params != null : !PARAMS_EDEFAULT.equals(params);
            case PropertiesPackage.LICENSE__TOKEN:
                return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
            case PropertiesPackage.LICENSE__DATE_TOKEN_CHECK:
                return DATE_TOKEN_CHECK_EDEFAULT == null ? dateTokenCheck != null : !DATE_TOKEN_CHECK_EDEFAULT.equals(dateTokenCheck);
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
        result.append(" (license: ");
        result.append(license);
        result.append(", customerName: ");
        result.append(customerName);
        result.append(", params: ");
        result.append(params);
        result.append(", token: ");
        result.append(token);
        result.append(", dateTokenCheck: ");
        result.append(dateTokenCheck);
        result.append(')');
        return result.toString();
    }

} //LicenseImpl