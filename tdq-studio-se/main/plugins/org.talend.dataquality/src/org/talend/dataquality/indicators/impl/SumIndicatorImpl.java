/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.indicators.IndicatorValueType;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.SumIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Sum Indicator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.SumIndicatorImpl#getSumStr <em>Sum Str</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.SumIndicatorImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SumIndicatorImpl extends IndicatorImpl implements SumIndicator {

    private static Logger log = Logger.getLogger(SumIndicatorImpl.class);

    /**
     * The default value of the '{@link #getSumStr() <em>Sum Str</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSumStr()
     * @generated
     * @ordered
     */
    protected static final String SUM_STR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSumStr() <em>Sum Str</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSumStr()
     * @generated
     * @ordered
     */
    protected String sumStr = SUM_STR_EDEFAULT;

    /**
     * The default value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDatatype()
     * @generated
     * @ordered
     */
    protected static final int DATATYPE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDatatype()
     * @generated
     * @ordered
     */
    protected int datatype = DATATYPE_EDEFAULT;

    /**
     * MOD msjian 2012-8-31 TDQ-5960: use BigDecimal to make the number more bigger. because when the database is Db2,
     * the sum result is incorrect when the number is bigger than Integer.MAX_VALUE
     */
    protected class GenericSum {

        public BigDecimal sum = new BigDecimal("0");

        public void sumObject(Object object) {
            BigDecimal obj = new BigDecimal(String.valueOf(object).trim());
            sum = sum.add(obj);
        }

        public void reset() {
            this.sum = new BigDecimal("0");
        }

        public String getAsString() {
            return this.sum.toString();
        }

        public BigDecimal getMean(long count) {
            if (this.sum != null) {
                if (count <= 0) {
                    return null;
                }
                return this.sum.divide(BigDecimal.valueOf(count));
            }
            return null;
        }

    }

    protected GenericSum genericSum;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SumIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.SUM_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSumStr() {
        return sumStr;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSumStr(String newSumStr) {
        String oldSumStr = sumStr;
        sumStr = newSumStr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.SUM_INDICATOR__SUM_STR, oldSumStr, sumStr));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getDatatype() {
        return datatype;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDatatype(int newDatatype) {
        int oldDatatype = datatype;
        datatype = newDatatype;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.SUM_INDICATOR__DATATYPE, oldDatatype, datatype));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.SUM_INDICATOR__SUM_STR:
                return getSumStr();
            case IndicatorsPackage.SUM_INDICATOR__DATATYPE:
                return getDatatype();
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
            case IndicatorsPackage.SUM_INDICATOR__SUM_STR:
                setSumStr((String)newValue);
                return;
            case IndicatorsPackage.SUM_INDICATOR__DATATYPE:
                setDatatype((Integer)newValue);
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
            case IndicatorsPackage.SUM_INDICATOR__SUM_STR:
                setSumStr(SUM_STR_EDEFAULT);
                return;
            case IndicatorsPackage.SUM_INDICATOR__DATATYPE:
                setDatatype(DATATYPE_EDEFAULT);
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
            case IndicatorsPackage.SUM_INDICATOR__SUM_STR:
                return SUM_STR_EDEFAULT == null ? sumStr != null : !SUM_STR_EDEFAULT.equals(sumStr);
            case IndicatorsPackage.SUM_INDICATOR__DATATYPE:
                return datatype != DATATYPE_EDEFAULT;
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
        result.append(" (sumStr: ");
        result.append(sumStr);
        result.append(", datatype: ");
        result.append(datatype);
        result.append(')');
        return result.toString();
    }

    /*
     * (non-Javadoc) ADDED scorreia 2008-04-08 handle object
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#handle(java.lang.Object)
     */
    @Override
    public boolean handle(Object data) {
        boolean handled = super.handle(data);
        if (!handled) {
            return handled;
        }
        return handleGenericSum(data);
    }

    protected boolean handleGenericSum(Object data) {
        boolean handled = Boolean.TRUE;
        if (data == null) {
            // TODO scorreia handle null values !!!
            return false;
        }
        // assert data instanceof Integer : "Sum indicator wants integer data, got: " + data;
        getGenericSum().sumObject(data);
        return handled;
    }

    /**
     * DOC scorreia Comment method "getGenericSum".
     * 
     * @return
     */
    private GenericSum getGenericSum() {
        if (genericSum == null) {
            genericSum = new GenericSum();
        }
        return genericSum;
    }

    /*
     * (non-Javadoc) ADDED scorreia 2008-04-08 finalizeComputation
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#finalizeComputation()
     */
    @Override
    public boolean finalizeComputation() {
        if (genericSum != null) {
            this.sumStr = genericSum.getAsString();
        } else {
            this.sumStr = String.valueOf(Double.NaN);
        }
        // get the correct type of result from the analyzed element
        int javaType = this.getColumnType();
        this.setDatatype(javaType);
        return super.finalizeComputation();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#getRealValue()
     * 
     * ADDED scorreia 2008-05-12 getRealValue()
     */
    @Override
    public Double getRealValue() {
        if (this.getSumStr() == null) {
            log.warn(this.toString() + " has a null sum.");
            return null;
        }
        return Double.valueOf(this.getSumStr());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#getValueType()
     * 
     * ADDED scorreia 2008-05-12 getValueType()
     */
    @Override
    public IndicatorValueType getValueType() {
        return IndicatorValueType.REAL_VALUE;
    }

    @Override
    public boolean reset() {
        if (genericSum != null) {
            this.genericSum.reset();
        }
        this.sumStr = SUM_STR_EDEFAULT;
        this.computed = COMPUTED_EDEFAULT;
        return super.reset();
    }

} // SumIndicatorImpl
