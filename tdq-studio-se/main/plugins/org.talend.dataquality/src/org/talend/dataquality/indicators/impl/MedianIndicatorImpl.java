/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import java.sql.Types;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.algorithms.AlgoUtils;
import org.talend.dataquality.indicators.IndicatorValueType;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.MedianIndicator;
import org.talend.utils.sql.Java2SqlType;
import org.talend.utils.time.TimeTracer;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Median Indicator</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.dataquality.indicators.impl.MedianIndicatorImpl#getMedian <em>Median</em>}</li>
 * <li>{@link org.talend.dataquality.indicators.impl.MedianIndicatorImpl#getFrequenceTable <em>Frequence Table</em>}</li>
 * <li>{@link org.talend.dataquality.indicators.impl.MedianIndicatorImpl#getDateMedian <em>Date Median</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MedianIndicatorImpl extends IndicatorImpl implements MedianIndicator {

    /**
     * The default value of the '{@link #getMedian() <em>Median</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMedian()
     * @generated
     * @ordered
     */
    protected static final Double MEDIAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMedian() <em>Median</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMedian()
     * @generated
     * @ordered
     */
    protected Double median = MEDIAN_EDEFAULT;

    /**
     * This is true if the Median attribute has been set.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean medianESet;

    /**
     * The default value of the '{@link #getFrequenceTable() <em>Frequence Table</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getFrequenceTable()
     * @generated
     * @ordered
     */
    protected static final TreeMap<Object, Long> FREQUENCE_TABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFrequenceTable() <em>Frequence Table</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getFrequenceTable()
     * @generated
     * @ordered
     */
    protected TreeMap<Object, Long> frequenceTable = FREQUENCE_TABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getDateMedian() <em>Date Median</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDateMedian()
     * @generated
     * @ordered
     */
    protected static final Date DATE_MEDIAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateMedian() <em>Date Median</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDateMedian()
     * @generated
     * @ordered
     */
    protected Date dateMedian = DATE_MEDIAN_EDEFAULT;

    /**
     * The sorted frequency table. Contains data as keys and count as values.
     * 
     * @generated NOT
     */
    // private TreeMap<Object, Long> freqTable = new TreeMap<Object, Long>();
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MedianIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.MEDIAN_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Double getMedian() {
        return median;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMedian(Double newMedian) {
        Double oldMedian = median;
        median = newMedian;
        boolean oldMedianESet = medianESet;
        medianESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.MEDIAN_INDICATOR__MEDIAN, oldMedian, median, !oldMedianESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void unsetMedian() {
        Double oldMedian = median;
        boolean oldMedianESet = medianESet;
        median = MEDIAN_EDEFAULT;
        medianESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, IndicatorsPackage.MEDIAN_INDICATOR__MEDIAN, oldMedian, MEDIAN_EDEFAULT, oldMedianESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMedian() {
        return medianESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TreeMap<Object, Long> getFrequenceTableGen() {
        return frequenceTable;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.MedianIndicator#getFrequenceTable() @generated NOT
     */
    public TreeMap<Object, Long> getFrequenceTable() {
        if (frequenceTable == FREQUENCE_TABLE_EDEFAULT) {
            frequenceTable = new TreeMap<Object, Long>();
        }
        return getFrequenceTableGen();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFrequenceTable(TreeMap<Object, Long> newFrequenceTable) {
        TreeMap<Object, Long> oldFrequenceTable = frequenceTable;
        frequenceTable = newFrequenceTable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.MEDIAN_INDICATOR__FREQUENCE_TABLE, oldFrequenceTable, frequenceTable));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getDateMedian() {
        return dateMedian;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDateMedian(Date newDateMedian) {
        Date oldDateMedian = dateMedian;
        dateMedian = newDateMedian;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.MEDIAN_INDICATOR__DATE_MEDIAN, oldDateMedian, dateMedian));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public boolean computeMedian() {
        // scorreia keep private method "computeNumericMedian" as we may have a computeDateMedian later
        return computeNumericMedian();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.MEDIAN_INDICATOR__MEDIAN:
                return getMedian();
            case IndicatorsPackage.MEDIAN_INDICATOR__FREQUENCE_TABLE:
                return getFrequenceTable();
            case IndicatorsPackage.MEDIAN_INDICATOR__DATE_MEDIAN:
                return getDateMedian();
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
            case IndicatorsPackage.MEDIAN_INDICATOR__MEDIAN:
                setMedian((Double)newValue);
                return;
            case IndicatorsPackage.MEDIAN_INDICATOR__FREQUENCE_TABLE:
                setFrequenceTable((TreeMap<Object, Long>)newValue);
                return;
            case IndicatorsPackage.MEDIAN_INDICATOR__DATE_MEDIAN:
                setDateMedian((Date)newValue);
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
            case IndicatorsPackage.MEDIAN_INDICATOR__MEDIAN:
                unsetMedian();
                return;
            case IndicatorsPackage.MEDIAN_INDICATOR__FREQUENCE_TABLE:
                setFrequenceTable(FREQUENCE_TABLE_EDEFAULT);
                return;
            case IndicatorsPackage.MEDIAN_INDICATOR__DATE_MEDIAN:
                setDateMedian(DATE_MEDIAN_EDEFAULT);
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
            case IndicatorsPackage.MEDIAN_INDICATOR__MEDIAN:
                return isSetMedian();
            case IndicatorsPackage.MEDIAN_INDICATOR__FREQUENCE_TABLE:
                return FREQUENCE_TABLE_EDEFAULT == null ? frequenceTable != null : !FREQUENCE_TABLE_EDEFAULT.equals(frequenceTable);
            case IndicatorsPackage.MEDIAN_INDICATOR__DATE_MEDIAN:
                return DATE_MEDIAN_EDEFAULT == null ? dateMedian != null : !DATE_MEDIAN_EDEFAULT.equals(dateMedian);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT toString()
     */
    @Override
    public String toString() {

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (median: ");
        if (medianESet)
            result.append(median);
        else
            result.append("<unset>");
        return result.toString();
    }

    private static final boolean trace = true;

    private static Logger log = Logger.getLogger(MedianIndicatorImpl.class);

    /**
     * ADDED scorreia Method "computeNumericMedian" computes the median for numerical objects (objects must be Number).
     * 
     * @return true if ok.
     */
    private boolean computeNumericMedian() {
        if (getCount() == null || getCount() == 0) {
            return false;
        }

        TimeTracer tt;
        if (trace)
            tt = new TimeTracer("Median computation with frequency table.", null);
        else
            tt = null;

        if (trace) {
            tt.start("searching median");
        }

        long totalCount = super.getCount().longValue() - super.getNullCount().longValue();
        double localMedian = AlgoUtils.getMedian(totalCount, this.getFrequenceTable());

        if (trace) {
            tt.end("median found");
        }

        this.setMedian(localMedian);
        return true;
    }

    /**
     * by default, it is set to true because when loading the indicator from file, the median is already computed. This
     * flag is set to false when new data are passed to the handle(data) method. This flag is not useful when median is
     * computed via SQL query.
     */
    private boolean medianComputed = true; // fix bug 4936 set to true

    /*
     * (non-Javadoc) ADDED scorreia overriden method handle()
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#handle(java.lang.Object) @generated NOT
     */
    @Override
    public boolean handle(Object data) {
        boolean ok = super.handle(data);
        // TODO scorreia handle null values (handle case when null is replaced by a default value.
        if (data == null) {
            return ok;
        }
        return ok && AlgoUtils.incrementValueCounts(data, this.getFrequenceTable());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#storeSqlResults(java.util.List)
     * 
     * ADDED scorreia 2008-05-02 storeSqlResults(List<Object[]> objects)
     */
    @Override
    public boolean storeSqlResults(List<Object[]> objects) {
        if (!checkResults(objects, 1)) {
            return false;
        }

        // get the correct type of result from the analyzed element
        int javaType = this.getColumnType();

        if (objects.size() == 1) { // case when 1 row is returned
            String med = String.valueOf(objects.get(0)[0]);
            if (med == null) {
                log.error("Median is null!!");
                return false;
            }
            this.setMedian(MedianIndicatorImpl.getRealValue(javaType, med));
            return true;
        } else if (objects.size() == 2) { // case when 2 rows are returned
            Double r1 = MedianIndicatorImpl.getRealValue(javaType, String.valueOf(objects.get(0)[0]));
            Double r2 = MedianIndicatorImpl.getRealValue(javaType, String.valueOf(objects.get(1)[0]));
            if (r1 == null || r2 == null) {
                log.error("Cannot compute the median: At least one of the rows is null: " + r1 + " | " + r2);
                return false;
            }
            this.setMedian((r1 + r2) / 2);
            // this.medianComputed = true; // fix bug 4936
            return true;
        }
        return false;
    }

    /**
     * Method "getRealValue" converts object into double.
     * 
     * @param javaType
     * @param object
     * @return
     */
    static Double getRealValue(int javaType, String object) {

        // FIXME scorreia this is not the best way to work. Other indicator simply store dates.
        if (Java2SqlType.isDateInSQL(javaType)) {
            Date date = null;
            switch (javaType) {
            case Types.TIMESTAMP:
                date = java.sql.Timestamp.valueOf(object);
                break;
            case Types.DATE:
                date = java.sql.Date.valueOf(object);
                break;
            case Types.TIME:
                date = java.sql.Time.valueOf(object);
                break;
            default:
                break;
            }

            return date != null ? Double.valueOf(date.getTime()) : Double.NaN;
        }
        // else a number
        try {
            return Double.valueOf(object);
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#getRealValue()
     */
    @Override
    public Double getRealValue() {
        return median;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.ValueIndicatorImpl#getValueType()
     */
    @Override
    public IndicatorValueType getValueType() {
        return IndicatorValueType.REAL_VALUE;
    }

    @Override
    public boolean reset() {
        this.median = MEDIAN_EDEFAULT;
        if (frequenceTable != null) {
            this.frequenceTable.clear();
        }
        this.computed = COMPUTED_EDEFAULT; 
        return super.reset();
    }

    @Override
    public boolean finalizeComputation() {
        if (!isComputed()) {
            computeMedian();
        }
        return super.finalizeComputation();
    }

    public void setMedianComputed(boolean medianComputed) {
        this.medianComputed = medianComputed;
    }

    public boolean isMedianComputed() {
        return medianComputed;
    }

    
    
} // MedianIndicatorImpl
