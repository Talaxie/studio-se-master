/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.indicators.IndicatorValueType;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.PatternMatchingIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pattern Matching Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PatternMatchingIndicatorImpl extends MatchingIndicatorImpl implements PatternMatchingIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected PatternMatchingIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.PATTERN_MATCHING_INDICATOR;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#storeSqlResults(java.util.List)
     * 
     * ADDED scorreia 2008-06-06 storeSqlResults(List<Object[]> objects)
     */
    @Override
    public boolean storeSqlResults(List<Object[]> objects) {
        if (!checkResults(objects, 2)) {
            return false;
        }
        Long match = Long.valueOf(String.valueOf(objects.get(0)[0]));
        Long total = Long.valueOf(String.valueOf(objects.get(0)[1]));
        if (match != null) {
            this.setMatchingValueCount(match);
        }
        if (total != null) {
            this.setCount(total);
        }
        if (total != null && match != null) {
            this.setNotMatchingValueCount(total - match);
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#getIntegerValue()
     */
    @Override
    public Long getIntegerValue() {
        return this.getMatchingValueCount();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#getValueType()
     */
    @Override
    public IndicatorValueType getValueType() {
        return IndicatorValueType.INTEGER_VALUE;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.MatchingIndicatorImpl#isUsedMapDBMode()
     */
    @Override
    public boolean isUsedMapDBMode() {
        return true;
    }

} // PatternMatchingIndicatorImpl
