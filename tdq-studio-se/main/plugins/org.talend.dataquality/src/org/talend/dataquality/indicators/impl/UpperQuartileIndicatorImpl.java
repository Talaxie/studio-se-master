/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.talend.algorithms.AlgoUtils;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.UpperQuartileIndicator;
import org.talend.dataquality.indicators.mapdb.AbstractDB;
import org.talend.dataquality.indicators.mapdb.DBMap;
import org.talend.dataquality.indicators.mapdb.StandardDBName;
import org.talend.resource.ResourceManager;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Upper Quartile Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UpperQuartileIndicatorImpl extends MaxValueIndicatorImpl implements UpperQuartileIndicator {

    private static Logger log = Logger.getLogger(UpperQuartileIndicatorImpl.class);

    private Map<Object, Long> frequenceTable = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected UpperQuartileIndicatorImpl() {
        super();
    }

    /**
     * Create a new DBMap
     * 
     * @return
     */
    private Map<Object, Long> initValueForUpperQuartileDBMap(String dbName) {
        if (isUsedMapDBMode()) {
            return new DBMap<Object, Long>(ResourceManager.getMapDBFilePath(), ResourceManager.getMapDBFileName(this),
                    ResourceManager.getMapDBCatalogName(this, dbName));
        } else {
            return new TreeMap<Object, Long>();
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.UPPER_QUARTILE_INDICATOR;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#storeSqlResults(java.util.List)
     * 
     * ADDED scorreia 2008-12-01 storeSqlResults(List<Object[]> objects)
     */
    @Override
    public boolean storeSqlResults(List<Object[]> objects) {
        if (!checkResults(objects, 1)) {
            return false;
        }

        // get the correct type of result from the analyzed element
        int javaType = this.getColumnType();
        this.setDatatype(javaType);

        if (objects.size() == 1) { // case when 1 row is returned
            String med = String.valueOf(objects.get(0)[0]);
            if (med == null) {
                log.error("Upper quartile is null!!");
                return false;
            }
            this.setValue(String.valueOf(MedianIndicatorImpl.getRealValue(javaType, med)));
            return true;
        } else if (objects.size() == 2) { // case when 2 rows are returned
            Double r1 = MedianIndicatorImpl.getRealValue(javaType, String.valueOf(objects.get(0)[0]));
            Double r2 = MedianIndicatorImpl.getRealValue(javaType, String.valueOf(objects.get(1)[0]));
            if (r1 == null || r2 == null) {
                log.error("Cannot compute the upper quartile: At least one of the rows is null: " + r1 + " | " + r2);
                return false;
            }
            this.setValue(String.valueOf((r1 + r2) / 2));
            return true;
        }
        return false;
    }

    @Override
    public boolean handle(Object data) {
        boolean ok = super.handle(data);
        // TODO scorreia handle null values (handle case when null is replaced by a default value.
        if (data == null) {
            return ok;
        }
        return ok && AlgoUtils.incrementValueCounts(data, this.frequenceTable);
    }

    @Override
    public boolean reset() {
        this.computed = COMPUTED_EDEFAULT;
        this.setValue(VALUE_EDEFAULT);
        if (isUsedMapDBMode()) {
            if (frequenceTable != null) {
                ((DBMap<Object, Long>) frequenceTable).clear();
            }
            frequenceTable = initValueForUpperQuartileDBMap(StandardDBName.computeProcess.name());
        } else {
            this.frequenceTable.clear();
        }
        return super.reset();
    }

    @Override
    public boolean finalizeComputation() {
        if (!isComputed()) {
            if (this.getCount() == null || this.getCount() == 0) {
                this.setValue(String.valueOf(Double.NaN));
            } else {
                long total = this.getCount().longValue() - this.getNullCount().longValue();
                final double quantile = AlgoUtils.getQuantile(total, frequenceTable, 3, 4);
                this.setValue(String.valueOf(quantile));
            }
            // get the correct type of result from the analyzed element
            int javaType = this.getColumnType();
            this.setDatatype(javaType);
        }
        return super.finalizeComputation();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#getMapDB(java.lang.String)
     */
    @Override
    public AbstractDB getMapDB(String dbName) {
        if (isUsedMapDBMode()) {
            if (StandardDBName.computeProcess.name().equals(dbName) && frequenceTable != null
                    && !((DBMap<Object, Long>) frequenceTable).isClosed()) {
                return (DBMap<Object, Long>) frequenceTable;
            }
            return ((DBMap<Object, Long>) initValueForUpperQuartileDBMap(StandardDBName.computeProcess.name()));
        } else {
            return super.getMapDB(dbName);
        }
    }

} // UpperQuartileIndicatorImpl
