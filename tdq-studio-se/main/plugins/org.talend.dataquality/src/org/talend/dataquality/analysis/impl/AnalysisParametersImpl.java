/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.AnalysisParameters;
import org.talend.dataquality.analysis.AnalysisType;
import org.talend.dataquality.analysis.ExecutionLanguage;
import org.talend.dataquality.analysis.SampleDataShowWay;
import org.talend.dataquality.domain.Domain;
import org.talend.dataquality.indicators.Indicator;
import orgomg.cwmx.analysis.informationreporting.impl.ReportGroupImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl#getDataFilter <em>Data Filter</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl#getIndicatorValidationDomains <em>Indicator Validation Domains</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl#getDataValidationDomains <em>Data Validation Domains</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl#getAnalysisType <em>Analysis Type</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl#getDeactivatedIndicators <em>Deactivated Indicators</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl#getExecutionLanguage <em>Execution Language</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl#isStoreData <em>Store Data</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl#getMaxNumberRows <em>Max Number Rows</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisParametersImpl#getSampleDataShowWay <em>Sample Data Show Way</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisParametersImpl extends ReportGroupImpl implements AnalysisParameters {
    /**
     * The cached value of the '{@link #getDataFilter() <em>Data Filter</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataFilter()
     * @generated
     * @ordered
     */
    protected EList<Domain> dataFilter;

    /**
     * The cached value of the '{@link #getIndicatorValidationDomains() <em>Indicator Validation Domains</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndicatorValidationDomains()
     * @generated
     * @ordered
     */
    protected EList<Domain> indicatorValidationDomains;

    /**
     * The cached value of the '{@link #getDataValidationDomains() <em>Data Validation Domains</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataValidationDomains()
     * @generated
     * @ordered
     */
    protected EList<Domain> dataValidationDomains;

    /**
     * The default value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalysisType()
     * @generated
     * @ordered
     */
    protected static final AnalysisType ANALYSIS_TYPE_EDEFAULT = AnalysisType.COLUMN;

    /**
     * The cached value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalysisType()
     * @generated
     * @ordered
     */
    protected AnalysisType analysisType = ANALYSIS_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getDeactivatedIndicators() <em>Deactivated Indicators</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeactivatedIndicators()
     * @generated
     * @ordered
     */
    protected EList<Indicator> deactivatedIndicators;

    /**
     * The default value of the '{@link #getExecutionLanguage() <em>Execution Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionLanguage()
     * @generated
     * @ordered
     */
    protected static final ExecutionLanguage EXECUTION_LANGUAGE_EDEFAULT = ExecutionLanguage.SQL;

    /**
     * The cached value of the '{@link #getExecutionLanguage() <em>Execution Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionLanguage()
     * @generated
     * @ordered
     */
    protected ExecutionLanguage executionLanguage = EXECUTION_LANGUAGE_EDEFAULT;

    /**
     * The default value of the '{@link #isStoreData() <em>Store Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStoreData()
     * @generated
     * @ordered
     */
    protected static final boolean STORE_DATA_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isStoreData() <em>Store Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStoreData()
     * @generated
     * @ordered
     */
    protected boolean storeData = STORE_DATA_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxNumberRows() <em>Max Number Rows</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxNumberRows()
     * @generated
     * @ordered
     */
    protected static final int MAX_NUMBER_ROWS_EDEFAULT = 50;

    /**
     * The cached value of the '{@link #getMaxNumberRows() <em>Max Number Rows</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxNumberRows()
     * @generated
     * @ordered
     */
    protected int maxNumberRows = MAX_NUMBER_ROWS_EDEFAULT;

    /**
     * The default value of the '{@link #getSampleDataShowWay() <em>Sample Data Show Way</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSampleDataShowWay()
     * @generated
     * @ordered
     */
    protected static final SampleDataShowWay SAMPLE_DATA_SHOW_WAY_EDEFAULT = SampleDataShowWay.FIRST;

    /**
     * The cached value of the '{@link #getSampleDataShowWay() <em>Sample Data Show Way</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSampleDataShowWay()
     * @generated
     * @ordered
     */
    protected SampleDataShowWay sampleDataShowWay = SAMPLE_DATA_SHOW_WAY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalysisParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnalysisPackage.Literals.ANALYSIS_PARAMETERS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Domain> getDataFilter() {
        if (dataFilter == null) {
            dataFilter = new EObjectResolvingEList<Domain>(Domain.class, this, AnalysisPackage.ANALYSIS_PARAMETERS__DATA_FILTER);
        }
        return dataFilter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Domain> getIndicatorValidationDomains() {
        if (indicatorValidationDomains == null) {
            indicatorValidationDomains = new EObjectResolvingEList<Domain>(Domain.class, this, AnalysisPackage.ANALYSIS_PARAMETERS__INDICATOR_VALIDATION_DOMAINS);
        }
        return indicatorValidationDomains;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Domain> getDataValidationDomains() {
        if (dataValidationDomains == null) {
            dataValidationDomains = new EObjectResolvingEList<Domain>(Domain.class, this, AnalysisPackage.ANALYSIS_PARAMETERS__DATA_VALIDATION_DOMAINS);
        }
        return dataValidationDomains;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisType getAnalysisType() {
        return analysisType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnalysisType(AnalysisType newAnalysisType) {
        AnalysisType oldAnalysisType = analysisType;
        analysisType = newAnalysisType == null ? ANALYSIS_TYPE_EDEFAULT : newAnalysisType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_PARAMETERS__ANALYSIS_TYPE, oldAnalysisType, analysisType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Indicator> getDeactivatedIndicators() {
        if (deactivatedIndicators == null) {
            deactivatedIndicators = new EObjectResolvingEList<Indicator>(Indicator.class, this, AnalysisPackage.ANALYSIS_PARAMETERS__DEACTIVATED_INDICATORS);
        }
        return deactivatedIndicators;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionLanguage getExecutionLanguage() {
        return executionLanguage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionLanguage(ExecutionLanguage newExecutionLanguage) {
        ExecutionLanguage oldExecutionLanguage = executionLanguage;
        executionLanguage = newExecutionLanguage == null ? EXECUTION_LANGUAGE_EDEFAULT : newExecutionLanguage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_PARAMETERS__EXECUTION_LANGUAGE, oldExecutionLanguage, executionLanguage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStoreData() {
        return storeData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStoreData(boolean newStoreData) {
        boolean oldStoreData = storeData;
        storeData = newStoreData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_PARAMETERS__STORE_DATA, oldStoreData, storeData));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxNumberRows() {
        return maxNumberRows;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxNumberRows(int newMaxNumberRows) {
        int oldMaxNumberRows = maxNumberRows;
        maxNumberRows = newMaxNumberRows;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_PARAMETERS__MAX_NUMBER_ROWS, oldMaxNumberRows, maxNumberRows));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SampleDataShowWay getSampleDataShowWay() {
        return sampleDataShowWay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSampleDataShowWay(SampleDataShowWay newSampleDataShowWay) {
        SampleDataShowWay oldSampleDataShowWay = sampleDataShowWay;
        sampleDataShowWay = newSampleDataShowWay == null ? SAMPLE_DATA_SHOW_WAY_EDEFAULT : newSampleDataShowWay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_PARAMETERS__SAMPLE_DATA_SHOW_WAY, oldSampleDataShowWay, sampleDataShowWay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS_PARAMETERS__DATA_FILTER:
                return getDataFilter();
            case AnalysisPackage.ANALYSIS_PARAMETERS__INDICATOR_VALIDATION_DOMAINS:
                return getIndicatorValidationDomains();
            case AnalysisPackage.ANALYSIS_PARAMETERS__DATA_VALIDATION_DOMAINS:
                return getDataValidationDomains();
            case AnalysisPackage.ANALYSIS_PARAMETERS__ANALYSIS_TYPE:
                return getAnalysisType();
            case AnalysisPackage.ANALYSIS_PARAMETERS__DEACTIVATED_INDICATORS:
                return getDeactivatedIndicators();
            case AnalysisPackage.ANALYSIS_PARAMETERS__EXECUTION_LANGUAGE:
                return getExecutionLanguage();
            case AnalysisPackage.ANALYSIS_PARAMETERS__STORE_DATA:
                return isStoreData();
            case AnalysisPackage.ANALYSIS_PARAMETERS__MAX_NUMBER_ROWS:
                return getMaxNumberRows();
            case AnalysisPackage.ANALYSIS_PARAMETERS__SAMPLE_DATA_SHOW_WAY:
                return getSampleDataShowWay();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS_PARAMETERS__DATA_FILTER:
                getDataFilter().clear();
                getDataFilter().addAll((Collection<? extends Domain>)newValue);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__INDICATOR_VALIDATION_DOMAINS:
                getIndicatorValidationDomains().clear();
                getIndicatorValidationDomains().addAll((Collection<? extends Domain>)newValue);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__DATA_VALIDATION_DOMAINS:
                getDataValidationDomains().clear();
                getDataValidationDomains().addAll((Collection<? extends Domain>)newValue);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__ANALYSIS_TYPE:
                setAnalysisType((AnalysisType)newValue);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__DEACTIVATED_INDICATORS:
                getDeactivatedIndicators().clear();
                getDeactivatedIndicators().addAll((Collection<? extends Indicator>)newValue);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__EXECUTION_LANGUAGE:
                setExecutionLanguage((ExecutionLanguage)newValue);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__STORE_DATA:
                setStoreData((Boolean)newValue);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__MAX_NUMBER_ROWS:
                setMaxNumberRows((Integer)newValue);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__SAMPLE_DATA_SHOW_WAY:
                setSampleDataShowWay((SampleDataShowWay)newValue);
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
            case AnalysisPackage.ANALYSIS_PARAMETERS__DATA_FILTER:
                getDataFilter().clear();
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__INDICATOR_VALIDATION_DOMAINS:
                getIndicatorValidationDomains().clear();
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__DATA_VALIDATION_DOMAINS:
                getDataValidationDomains().clear();
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__ANALYSIS_TYPE:
                setAnalysisType(ANALYSIS_TYPE_EDEFAULT);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__DEACTIVATED_INDICATORS:
                getDeactivatedIndicators().clear();
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__EXECUTION_LANGUAGE:
                setExecutionLanguage(EXECUTION_LANGUAGE_EDEFAULT);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__STORE_DATA:
                setStoreData(STORE_DATA_EDEFAULT);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__MAX_NUMBER_ROWS:
                setMaxNumberRows(MAX_NUMBER_ROWS_EDEFAULT);
                return;
            case AnalysisPackage.ANALYSIS_PARAMETERS__SAMPLE_DATA_SHOW_WAY:
                setSampleDataShowWay(SAMPLE_DATA_SHOW_WAY_EDEFAULT);
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
            case AnalysisPackage.ANALYSIS_PARAMETERS__DATA_FILTER:
                return dataFilter != null && !dataFilter.isEmpty();
            case AnalysisPackage.ANALYSIS_PARAMETERS__INDICATOR_VALIDATION_DOMAINS:
                return indicatorValidationDomains != null && !indicatorValidationDomains.isEmpty();
            case AnalysisPackage.ANALYSIS_PARAMETERS__DATA_VALIDATION_DOMAINS:
                return dataValidationDomains != null && !dataValidationDomains.isEmpty();
            case AnalysisPackage.ANALYSIS_PARAMETERS__ANALYSIS_TYPE:
                return analysisType != ANALYSIS_TYPE_EDEFAULT;
            case AnalysisPackage.ANALYSIS_PARAMETERS__DEACTIVATED_INDICATORS:
                return deactivatedIndicators != null && !deactivatedIndicators.isEmpty();
            case AnalysisPackage.ANALYSIS_PARAMETERS__EXECUTION_LANGUAGE:
                return executionLanguage != EXECUTION_LANGUAGE_EDEFAULT;
            case AnalysisPackage.ANALYSIS_PARAMETERS__STORE_DATA:
                return storeData != STORE_DATA_EDEFAULT;
            case AnalysisPackage.ANALYSIS_PARAMETERS__MAX_NUMBER_ROWS:
                return maxNumberRows != MAX_NUMBER_ROWS_EDEFAULT;
            case AnalysisPackage.ANALYSIS_PARAMETERS__SAMPLE_DATA_SHOW_WAY:
                return sampleDataShowWay != SAMPLE_DATA_SHOW_WAY_EDEFAULT;
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
        result.append(" (analysisType: ");
        result.append(analysisType);
        result.append(", executionLanguage: ");
        result.append(executionLanguage);
        result.append(", storeData: ");
        result.append(storeData);
        result.append(", maxNumberRows: ");
        result.append(maxNumberRows);
        result.append(", sampleDataShowWay: ");
        result.append(sampleDataShowWay);
        result.append(')');
        return result.toString();
    }

} //AnalysisParametersImpl
