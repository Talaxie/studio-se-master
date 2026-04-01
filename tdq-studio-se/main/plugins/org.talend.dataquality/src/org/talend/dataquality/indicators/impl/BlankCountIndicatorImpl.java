/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.helpers.IndicatorHelper;
import org.talend.dataquality.indicators.BlankCountIndicator;
import org.talend.dataquality.indicators.IndicatorsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Blank Count Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.BlankCountIndicatorImpl#getBlankCount <em>Blank Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlankCountIndicatorImpl extends IndicatorImpl implements BlankCountIndicator {

    /**
     * The default value of the '{@link #getBlankCount() <em>Blank Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBlankCount()
     * @generated
     * @ordered
     */
    protected static final Long BLANK_COUNT_EDEFAULT = new Long(0L);

    /**
     * The cached value of the '{@link #getBlankCount() <em>Blank Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBlankCount()
     * @generated
     * @ordered
     */
    protected Long blankCount = BLANK_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BlankCountIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.BLANK_COUNT_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Long getBlankCount() {
        return blankCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBlankCount(Long newBlankCount) {
        Long oldBlankCount = blankCount;
        blankCount = newBlankCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.BLANK_COUNT_INDICATOR__BLANK_COUNT, oldBlankCount, blankCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.BLANK_COUNT_INDICATOR__BLANK_COUNT:
                return getBlankCount();
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
            case IndicatorsPackage.BLANK_COUNT_INDICATOR__BLANK_COUNT:
                setBlankCount((Long)newValue);
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
            case IndicatorsPackage.BLANK_COUNT_INDICATOR__BLANK_COUNT:
                setBlankCount(BLANK_COUNT_EDEFAULT);
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
            case IndicatorsPackage.BLANK_COUNT_INDICATOR__BLANK_COUNT:
                return BLANK_COUNT_EDEFAULT == null ? blankCount != null : !BLANK_COUNT_EDEFAULT.equals(blankCount);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("blankCount: ");
        result.append(blankCount);
        return result.toString();
    }

    @Override
    public boolean handle(Object data) {
        boolean ok = super.handle(data);
        if (data == null) {
            return ok;
        }

        // Check on the correct type of data must be done when constructing the indicator.
        assert data instanceof String : "Cannot check for blank on non string: " + data;
        String str = String.valueOf(data);
        if (StringUtils.isBlank(str)) {
            // MOD mzhao feature: 12919
            if (this.checkMustStoreCurrentRow()) {
                mustStoreRow = true;
            }
            this.blankCount++;
        }
        return ok;
    }

    @Override
    public boolean reset() {
        this.blankCount = BLANK_COUNT_EDEFAULT;
        return super.reset();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#storeSqlResults(java.lang.String, java.lang.Object[])
     */
    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#storeSqlResults(java.lang.Object[])
     * 
     * ADDED scorreia 2008-04-30 storeSqlResults(List<Object[]> objects)
     */
    @Override
    public boolean storeSqlResults(List<Object[]> objects) {
        if (!super.checkResults(objects, 1)) {
            return false;
        }

        // MOD gdbu 2011-4-14 bug : 18975
        this.setBlankCount(IndicatorHelper.getLongFromObject(objects.get(0)[0]));
        // ~18975

        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#getIntegerValue()
     * 
     * ADDED scorreia 2008-05-12 getIntegerValue()
     */
    @Override
    public Long getIntegerValue() {
        return this.getBlankCount();
    }

} // BlankCountIndicatorImpl
