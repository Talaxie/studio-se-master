/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.helpers.IndicatorHelper;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.NullCountIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Null Count Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NullCountIndicatorImpl extends IndicatorImpl implements NullCountIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected NullCountIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.NULL_COUNT_INDICATOR;
    }

    /*
     * (non-Javadoc) ADDED scorreia 2008-04-08 toString()
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#toString()
     */
    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer(this.getName());
        buf.append("= ");
        buf.append(this.nullCount);
        return buf.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#storeSqlResults(java.util.List)
     * 
     * ADDED scorreia 2008-04-30 storeSqlResults(List<Object[]> objects)
     */
    @Override
    public boolean storeSqlResults(List<Object[]> objects) {
        if (!checkResults(objects, 1)) {
            return false;
        }
        // MOD gdbu 2011-4-14 bug : 18975
        this.setNullCount(IndicatorHelper.getLongFromObject(objects.get(0)[0]));
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
        return this.getNullCount();
    }

    /**
     * ADD mzhao feature: 12919
     */
    @Override
    public boolean handle(Object data) {
        boolean returnValue = super.handle(data);
        if (data == null) {
            if (checkMustStoreCurrentRow()) {
                this.mustStoreRow = true;
            }
        }
        return returnValue;
    }

} // NullCountIndicatorImpl
