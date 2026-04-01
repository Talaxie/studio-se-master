/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.analysis.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.AnalyzedDataSet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Analyzed Data Set</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.dataquality.analysis.impl.AnalyzedDataSetImpl#getDataCount <em>Data Count</em>}</li>
 * <li>{@link org.talend.dataquality.analysis.impl.AnalyzedDataSetImpl#getRecordSize <em>Record Size</em>}</li>
 * <li>{@link org.talend.dataquality.analysis.impl.AnalyzedDataSetImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AnalyzedDataSetImpl extends EObjectImpl implements AnalyzedDataSet {

    /**
     * The default value of the '{@link #getDataCount() <em>Data Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDataCount()
     * @generated
     * @ordered
     */
    protected static final int DATA_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDataCount() <em>Data Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDataCount()
     * @generated
     * @ordered
     */
    protected int dataCount = DATA_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getRecordSize() <em>Record Size</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRecordSize()
     * @generated
     * @ordered
     */
    protected static final int RECORD_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRecordSize() <em>Record Size</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRecordSize()
     * @generated
     * @ordered
     */
    protected int recordSize = RECORD_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getData() <em>Data</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getData()
     * @generated
     * @ordered
     */
    protected static final List<Object[]> DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getData()
     * @generated
     * @ordered
     */
    protected List<Object[]> data = DATA_EDEFAULT;

    /**
     * The default value of the '{@link #getPatternData() <em>Pattern Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPatternData()
     * @generated
     * @ordered
     */
    protected static final List<Object> PATTERN_DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPatternData() <em>Pattern Data</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getPatternData()
     * @generated NOT
     * @ordered
     */
    protected List<Object> patternData = PATTERN_DATA_EDEFAULT;

    // MOD zshen feature 12919
    public final static int VALID_VALUE = 0;

    public final static int INVALID_VALUE = 1;

    /**
     * The cached value of the '{@link #getFrequencyData() <em>Frequency Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrequencyData()
     * @generated
     * @ordered
     */
    protected Map<Object, List<Object[]>> frequencyData;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AnalyzedDataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnalysisPackage.Literals.ANALYZED_DATA_SET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getDataCount() {
        return dataCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDataCount(int newDataCount) {
        int oldDataCount = dataCount;
        dataCount = newDataCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYZED_DATA_SET__DATA_COUNT, oldDataCount, dataCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getRecordSize() {
        return recordSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRecordSize(int newRecordSize) {
        int oldRecordSize = recordSize;
        recordSize = newRecordSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYZED_DATA_SET__RECORD_SIZE, oldRecordSize, recordSize));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public List<Object[]> getData() {
        return data;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setData(List<Object[]> newData) {
        List<Object[]> oldData = data;
        data = newData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYZED_DATA_SET__DATA, oldData, data));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public List<Object> getPatternData() {
        return patternData;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPatternData(List<Object> newPatternData) {
        List<Object> oldPatternData = patternData;
        patternData = newPatternData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYZED_DATA_SET__PATTERN_DATA, oldPatternData, patternData));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Map<Object, List<Object[]>> getFrequencyData() {
        return frequencyData;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFrequencyData(Map<Object, List<Object[]>> newFrequencyData) {
        Map<Object, List<Object[]>> oldFrequencyData = frequencyData;
        frequencyData = newFrequencyData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYZED_DATA_SET__FREQUENCY_DATA, oldFrequencyData, frequencyData));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AnalysisPackage.ANALYZED_DATA_SET__DATA_COUNT:
                return getDataCount();
            case AnalysisPackage.ANALYZED_DATA_SET__RECORD_SIZE:
                return getRecordSize();
            case AnalysisPackage.ANALYZED_DATA_SET__DATA:
                return getData();
            case AnalysisPackage.ANALYZED_DATA_SET__PATTERN_DATA:
                return getPatternData();
            case AnalysisPackage.ANALYZED_DATA_SET__FREQUENCY_DATA:
                return getFrequencyData();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AnalysisPackage.ANALYZED_DATA_SET__DATA_COUNT:
                setDataCount((Integer)newValue);
                return;
            case AnalysisPackage.ANALYZED_DATA_SET__RECORD_SIZE:
                setRecordSize((Integer)newValue);
                return;
            case AnalysisPackage.ANALYZED_DATA_SET__DATA:
                setData((List<Object[]>)newValue);
                return;
            case AnalysisPackage.ANALYZED_DATA_SET__PATTERN_DATA:
                setPatternData((List<Object>)newValue);
                return;
            case AnalysisPackage.ANALYZED_DATA_SET__FREQUENCY_DATA:
                setFrequencyData((Map<Object, List<Object[]>>)newValue);
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
            case AnalysisPackage.ANALYZED_DATA_SET__DATA_COUNT:
                setDataCount(DATA_COUNT_EDEFAULT);
                return;
            case AnalysisPackage.ANALYZED_DATA_SET__RECORD_SIZE:
                setRecordSize(RECORD_SIZE_EDEFAULT);
                return;
            case AnalysisPackage.ANALYZED_DATA_SET__DATA:
                setData(DATA_EDEFAULT);
                return;
            case AnalysisPackage.ANALYZED_DATA_SET__PATTERN_DATA:
                setPatternData(PATTERN_DATA_EDEFAULT);
                return;
            case AnalysisPackage.ANALYZED_DATA_SET__FREQUENCY_DATA:
                setFrequencyData((Map<Object, List<Object[]>>)null);
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
            case AnalysisPackage.ANALYZED_DATA_SET__DATA_COUNT:
                return dataCount != DATA_COUNT_EDEFAULT;
            case AnalysisPackage.ANALYZED_DATA_SET__RECORD_SIZE:
                return recordSize != RECORD_SIZE_EDEFAULT;
            case AnalysisPackage.ANALYZED_DATA_SET__DATA:
                return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
            case AnalysisPackage.ANALYZED_DATA_SET__PATTERN_DATA:
                return PATTERN_DATA_EDEFAULT == null ? patternData != null : !PATTERN_DATA_EDEFAULT.equals(patternData);
            case AnalysisPackage.ANALYZED_DATA_SET__FREQUENCY_DATA:
                return frequencyData != null;
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
        result.append(" (dataCount: ");
        result.append(dataCount);
        result.append(", recordSize: ");
        result.append(recordSize);
        result.append(", data: ");
        result.append(data);
        result.append(", patternData: ");
        result.append(patternData);
        result.append(", frequencyData: ");
        result.append(frequencyData);
        result.append(')');
        return result.toString();
    }

} // AnalyzedDataSetImpl
