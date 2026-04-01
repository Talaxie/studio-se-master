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

import org.talend.core.model.properties.CronUITalendTrigger;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cron UI Talaxie Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.CronUITalendTriggerImpl#getListDaysOfWeek <em>List Days Of Week</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.CronUITalendTriggerImpl#getListDaysOfMonth <em>List Days Of Month</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.CronUITalendTriggerImpl#getListMonths <em>List Months</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.CronUITalendTriggerImpl#getListYears <em>List Years</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.CronUITalendTriggerImpl#getListHours <em>List Hours</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.CronUITalendTriggerImpl#getListMinutes <em>List Minutes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CronUITalendTriggerImpl extends TalendTriggerImpl implements CronUITalendTrigger {
    /**
     * The default value of the '{@link #getListDaysOfWeek() <em>List Days Of Week</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListDaysOfWeek()
     * @generated
     * @ordered
     */
    protected static final String LIST_DAYS_OF_WEEK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getListDaysOfWeek() <em>List Days Of Week</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListDaysOfWeek()
     * @generated
     * @ordered
     */
    protected String listDaysOfWeek = LIST_DAYS_OF_WEEK_EDEFAULT;

    /**
     * The default value of the '{@link #getListDaysOfMonth() <em>List Days Of Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListDaysOfMonth()
     * @generated
     * @ordered
     */
    protected static final String LIST_DAYS_OF_MONTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getListDaysOfMonth() <em>List Days Of Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListDaysOfMonth()
     * @generated
     * @ordered
     */
    protected String listDaysOfMonth = LIST_DAYS_OF_MONTH_EDEFAULT;

    /**
     * The default value of the '{@link #getListMonths() <em>List Months</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListMonths()
     * @generated
     * @ordered
     */
    protected static final String LIST_MONTHS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getListMonths() <em>List Months</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListMonths()
     * @generated
     * @ordered
     */
    protected String listMonths = LIST_MONTHS_EDEFAULT;

    /**
     * The default value of the '{@link #getListYears() <em>List Years</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListYears()
     * @generated
     * @ordered
     */
    protected static final String LIST_YEARS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getListYears() <em>List Years</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListYears()
     * @generated
     * @ordered
     */
    protected String listYears = LIST_YEARS_EDEFAULT;

    /**
     * The default value of the '{@link #getListHours() <em>List Hours</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListHours()
     * @generated
     * @ordered
     */
    protected static final String LIST_HOURS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getListHours() <em>List Hours</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListHours()
     * @generated
     * @ordered
     */
    protected String listHours = LIST_HOURS_EDEFAULT;

    /**
     * The default value of the '{@link #getListMinutes() <em>List Minutes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListMinutes()
     * @generated
     * @ordered
     */
    protected static final String LIST_MINUTES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getListMinutes() <em>List Minutes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getListMinutes()
     * @generated
     * @ordered
     */
    protected String listMinutes = LIST_MINUTES_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CronUITalendTriggerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.CRON_UI_TALEND_TRIGGER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getListDaysOfWeek() {
        return listDaysOfWeek;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListDaysOfWeek(String newListDaysOfWeek) {
        String oldListDaysOfWeek = listDaysOfWeek;
        listDaysOfWeek = newListDaysOfWeek;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_WEEK, oldListDaysOfWeek, listDaysOfWeek));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getListDaysOfMonth() {
        return listDaysOfMonth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListDaysOfMonth(String newListDaysOfMonth) {
        String oldListDaysOfMonth = listDaysOfMonth;
        listDaysOfMonth = newListDaysOfMonth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_MONTH, oldListDaysOfMonth, listDaysOfMonth));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getListMonths() {
        return listMonths;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListMonths(String newListMonths) {
        String oldListMonths = listMonths;
        listMonths = newListMonths;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MONTHS, oldListMonths, listMonths));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getListYears() {
        return listYears;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListYears(String newListYears) {
        String oldListYears = listYears;
        listYears = newListYears;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_YEARS, oldListYears, listYears));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getListHours() {
        return listHours;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListHours(String newListHours) {
        String oldListHours = listHours;
        listHours = newListHours;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_HOURS, oldListHours, listHours));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getListMinutes() {
        return listMinutes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setListMinutes(String newListMinutes) {
        String oldListMinutes = listMinutes;
        listMinutes = newListMinutes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MINUTES, oldListMinutes, listMinutes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_WEEK:
                return getListDaysOfWeek();
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_MONTH:
                return getListDaysOfMonth();
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MONTHS:
                return getListMonths();
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_YEARS:
                return getListYears();
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_HOURS:
                return getListHours();
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MINUTES:
                return getListMinutes();
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
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_WEEK:
                setListDaysOfWeek((String)newValue);
                return;
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_MONTH:
                setListDaysOfMonth((String)newValue);
                return;
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MONTHS:
                setListMonths((String)newValue);
                return;
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_YEARS:
                setListYears((String)newValue);
                return;
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_HOURS:
                setListHours((String)newValue);
                return;
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MINUTES:
                setListMinutes((String)newValue);
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
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_WEEK:
                setListDaysOfWeek(LIST_DAYS_OF_WEEK_EDEFAULT);
                return;
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_MONTH:
                setListDaysOfMonth(LIST_DAYS_OF_MONTH_EDEFAULT);
                return;
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MONTHS:
                setListMonths(LIST_MONTHS_EDEFAULT);
                return;
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_YEARS:
                setListYears(LIST_YEARS_EDEFAULT);
                return;
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_HOURS:
                setListHours(LIST_HOURS_EDEFAULT);
                return;
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MINUTES:
                setListMinutes(LIST_MINUTES_EDEFAULT);
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
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_WEEK:
                return LIST_DAYS_OF_WEEK_EDEFAULT == null ? listDaysOfWeek != null : !LIST_DAYS_OF_WEEK_EDEFAULT.equals(listDaysOfWeek);
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_DAYS_OF_MONTH:
                return LIST_DAYS_OF_MONTH_EDEFAULT == null ? listDaysOfMonth != null : !LIST_DAYS_OF_MONTH_EDEFAULT.equals(listDaysOfMonth);
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MONTHS:
                return LIST_MONTHS_EDEFAULT == null ? listMonths != null : !LIST_MONTHS_EDEFAULT.equals(listMonths);
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_YEARS:
                return LIST_YEARS_EDEFAULT == null ? listYears != null : !LIST_YEARS_EDEFAULT.equals(listYears);
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_HOURS:
                return LIST_HOURS_EDEFAULT == null ? listHours != null : !LIST_HOURS_EDEFAULT.equals(listHours);
            case PropertiesPackage.CRON_UI_TALEND_TRIGGER__LIST_MINUTES:
                return LIST_MINUTES_EDEFAULT == null ? listMinutes != null : !LIST_MINUTES_EDEFAULT.equals(listMinutes);
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
        result.append(" (listDaysOfWeek: ");
        result.append(listDaysOfWeek);
        result.append(", listDaysOfMonth: ");
        result.append(listDaysOfMonth);
        result.append(", listMonths: ");
        result.append(listMonths);
        result.append(", listYears: ");
        result.append(listYears);
        result.append(", listHours: ");
        result.append(listHours);
        result.append(", listMinutes: ");
        result.append(listMinutes);
        result.append(')');
        return result.toString();
    }

} //CronUITalendTriggerImpl
