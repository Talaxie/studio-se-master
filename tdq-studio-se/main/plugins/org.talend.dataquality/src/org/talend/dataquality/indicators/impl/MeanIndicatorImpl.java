package org.talend.dataquality.indicators.impl;

import java.util.List;

import org.apache.commons.lang.math.NumberUtils;
import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.MeanIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mean Indicator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MeanIndicatorImpl extends SumIndicatorImpl implements MeanIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MeanIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.MEAN_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Double getMean() {
        Long c = getCount(); // - getNullCount(); MOD scorreia removed in order to fix bug 10222
        if (c.compareTo(0L) == 0) {
            // MOD yyi 2010-04-13 10549: Cannot save analysis data into database because of NumberFormatException
            return Double.NaN;
        }
        // MOD xqliu 2009-06-29 bug 7068
        Double sum = null;
        try {
            sum = Double.valueOf(getSumStr());
        } catch (Exception e) {
            // do not return 0 otherwise the user will believe that the mean is 0
            return Double.NaN;
        }
        // ~

        if (sum == null) {
            throw new RuntimeException("Invalid sum in mean computation!!");
        }
        return sum / c;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#getIntegerValue()
     * 
     * ADDED yyi 2010-04-20 getIntegerValue()
     */
    @Override
    public Long getIntegerValue() {
        return this.getMean().longValue();
    }

    /*
     * ADDED
     * 
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IntegerSumIndicatorImpl#handle(java.lang.Object)
     */
    @Override
    public boolean handle(Object data) {
        if (data == null) {
            nullCount++;
        } else {
            // TDQ-4936 ADD mzhao mean count should not include null count.
            count++;
        }
        Boolean handleStatus = handleGenericSum(data);
        return handleStatus;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Double getMeanWithNulls(double valueForNull) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
        if (!checkResults(objects, 2)) {
            return false;
        }
        String s = String.valueOf(objects.get(0)[0]);
        String c = String.valueOf(objects.get(0)[1]);

        if (!NumberUtils.isNumber(s)) {
            s = "0";
        }

        if (!NumberUtils.isNumber(c)) {
            c = "0";
        }

        this.setSumStr(s);
        this.setCount(Long.valueOf(c));
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * ADDED
     * 
     * @see org.talend.dataquality.indicators.impl.SumIndicatorImpl#toString()
     */
    @Override
    public String toString() {
        return "Mean = " + getMean();
    }

} // MeanIndicatorImpl
