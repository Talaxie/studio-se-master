/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.commons.emf.FactoriesUtil;
import org.talend.core.model.properties.impl.TDQItemImpl;
import org.talend.dataquality.properties.PropertiesPackage;
import org.talend.dataquality.properties.TDQReportItem;
import orgomg.cwmx.analysis.informationreporting.Report;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDQ Report Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.impl.TDQReportItemImpl#getReport <em>Report</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDQReportItemImpl extends TDQItemImpl implements TDQReportItem {
    /**
     * The cached value of the '{@link #getReport() <em>Report</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReport()
     * @generated
     * @ordered
     */
    protected Report report;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TDQReportItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.TDQ_REPORT_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Report getReport() {
        if (report != null && report.eIsProxy()) {
            InternalEObject oldReport = (InternalEObject)report;
            report = (Report)eResolveProxy(oldReport);
            if (report != oldReport) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.TDQ_REPORT_ITEM__REPORT, oldReport, report));
            }
        }
        return report;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Report basicGetReport() {
        return report;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReport(Report newReport) {
        Report oldReport = report;
        report = newReport;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TDQ_REPORT_ITEM__REPORT, oldReport, report));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.TDQ_REPORT_ITEM__REPORT:
                if (resolve) return getReport();
                return basicGetReport();
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
            case PropertiesPackage.TDQ_REPORT_ITEM__REPORT:
                setReport((Report)newValue);
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
            case PropertiesPackage.TDQ_REPORT_ITEM__REPORT:
                setReport((Report)null);
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
            case PropertiesPackage.TDQ_REPORT_ITEM__REPORT:
                return report != null;
        }
        return super.eIsSet(featureID);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getFileExtension(){
        return FactoriesUtil.REP;
    }
    
} //TDQReportItemImpl
