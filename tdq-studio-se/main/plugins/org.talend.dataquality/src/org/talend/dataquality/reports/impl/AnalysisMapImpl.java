/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.reports.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.dataquality.analysis.Analysis;
import org.talend.dataquality.reports.AnalysisMap;
import org.talend.dataquality.reports.ReportsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.reports.impl.AnalysisMapImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.AnalysisMapImpl#isMustRefresh <em>Must Refresh</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.AnalysisMapImpl#getReportType <em>Report Type</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.AnalysisMapImpl#getJrxmlSource <em>Jrxml Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisMapImpl extends EObjectImpl implements AnalysisMap {
    /**
     * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalysis()
     * @generated
     * @ordered
     */
    protected Analysis analysis;

    /**
     * The default value of the '{@link #isMustRefresh() <em>Must Refresh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMustRefresh()
     * @generated
     * @ordered
     */
    protected static final boolean MUST_REFRESH_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMustRefresh() <em>Must Refresh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMustRefresh()
     * @generated
     * @ordered
     */
    protected boolean mustRefresh = MUST_REFRESH_EDEFAULT;

    /**
     * The default value of the '{@link #getReportType() <em>Report Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportType()
     * @generated
     * @ordered
     */
    protected static final String REPORT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReportType() <em>Report Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportType()
     * @generated
     * @ordered
     */
    protected String reportType = REPORT_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getJrxmlSource() <em>Jrxml Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJrxmlSource()
     * @generated
     * @ordered
     */
    protected static final String JRXML_SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJrxmlSource() <em>Jrxml Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJrxmlSource()
     * @generated
     * @ordered
     */
    protected String jrxmlSource = JRXML_SOURCE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalysisMapImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReportsPackage.Literals.ANALYSIS_MAP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Analysis getAnalysis() {
        if (analysis != null && analysis.eIsProxy()) {
            InternalEObject oldAnalysis = (InternalEObject)analysis;
            analysis = (Analysis)eResolveProxy(oldAnalysis);
            if (analysis != oldAnalysis) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportsPackage.ANALYSIS_MAP__ANALYSIS, oldAnalysis, analysis));
            }
        }
        return analysis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Analysis basicGetAnalysis() {
        return analysis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnalysis(Analysis newAnalysis) {
        Analysis oldAnalysis = analysis;
        analysis = newAnalysis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.ANALYSIS_MAP__ANALYSIS, oldAnalysis, analysis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMustRefresh() {
        return mustRefresh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMustRefresh(boolean newMustRefresh) {
        boolean oldMustRefresh = mustRefresh;
        mustRefresh = newMustRefresh;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.ANALYSIS_MAP__MUST_REFRESH, oldMustRefresh, mustRefresh));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReportType(String newReportType) {
        String oldReportType = reportType;
        reportType = newReportType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.ANALYSIS_MAP__REPORT_TYPE, oldReportType, reportType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJrxmlSource() {
        return jrxmlSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJrxmlSource(String newJrxmlSource) {
        String oldJrxmlSource = jrxmlSource;
        jrxmlSource = newJrxmlSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.ANALYSIS_MAP__JRXML_SOURCE, oldJrxmlSource, jrxmlSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ReportsPackage.ANALYSIS_MAP__ANALYSIS:
                if (resolve) return getAnalysis();
                return basicGetAnalysis();
            case ReportsPackage.ANALYSIS_MAP__MUST_REFRESH:
                return isMustRefresh();
            case ReportsPackage.ANALYSIS_MAP__REPORT_TYPE:
                return getReportType();
            case ReportsPackage.ANALYSIS_MAP__JRXML_SOURCE:
                return getJrxmlSource();
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
            case ReportsPackage.ANALYSIS_MAP__ANALYSIS:
                setAnalysis((Analysis)newValue);
                return;
            case ReportsPackage.ANALYSIS_MAP__MUST_REFRESH:
                setMustRefresh((Boolean)newValue);
                return;
            case ReportsPackage.ANALYSIS_MAP__REPORT_TYPE:
                setReportType((String)newValue);
                return;
            case ReportsPackage.ANALYSIS_MAP__JRXML_SOURCE:
                setJrxmlSource((String)newValue);
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
            case ReportsPackage.ANALYSIS_MAP__ANALYSIS:
                setAnalysis((Analysis)null);
                return;
            case ReportsPackage.ANALYSIS_MAP__MUST_REFRESH:
                setMustRefresh(MUST_REFRESH_EDEFAULT);
                return;
            case ReportsPackage.ANALYSIS_MAP__REPORT_TYPE:
                setReportType(REPORT_TYPE_EDEFAULT);
                return;
            case ReportsPackage.ANALYSIS_MAP__JRXML_SOURCE:
                setJrxmlSource(JRXML_SOURCE_EDEFAULT);
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
            case ReportsPackage.ANALYSIS_MAP__ANALYSIS:
                return analysis != null;
            case ReportsPackage.ANALYSIS_MAP__MUST_REFRESH:
                return mustRefresh != MUST_REFRESH_EDEFAULT;
            case ReportsPackage.ANALYSIS_MAP__REPORT_TYPE:
                return REPORT_TYPE_EDEFAULT == null ? reportType != null : !REPORT_TYPE_EDEFAULT.equals(reportType);
            case ReportsPackage.ANALYSIS_MAP__JRXML_SOURCE:
                return JRXML_SOURCE_EDEFAULT == null ? jrxmlSource != null : !JRXML_SOURCE_EDEFAULT.equals(jrxmlSource);
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
        result.append(" (mustRefresh: ");
        result.append(mustRefresh);
        result.append(", reportType: ");
        result.append(reportType);
        result.append(", jrxmlSource: ");
        result.append(jrxmlSource);
        result.append(')');
        return result.toString();
    }

} //AnalysisMapImpl
