/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.PluginConstant;
import org.talend.dataquality.domain.Domain;
import org.talend.dataquality.domain.RangeRestriction;
import org.talend.dataquality.domain.sql.SqlPredicate;
import org.talend.dataquality.helpers.DomainHelper;
import org.talend.dataquality.indicators.BinFrequencyIndicator;
import org.talend.dataquality.indicators.IndicatorsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bin Frequency Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BinFrequencyIndicatorImpl extends FrequencyIndicatorImpl implements BinFrequencyIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BinFrequencyIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.BIN_FREQUENCY_INDICATOR;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.FrequencyIndicatorImpl#handle(java.lang.Object)
     */
    @Override
    public boolean handle(Object data) {

        // if the bin parameter is set,look range name as frequency Map key.
        if (parameters != null) {
            Domain bins = parameters.getBins();
            if (bins != null) {
                String binFreqKey = getGroupLabel(data);
                // except null if the bin parameteris set.
                if (binFreqKey == null) {
                    return true;
                }
                return super.handle(binFreqKey);
            }
        }
        return super.handle(data);

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.FrequencyIndicatorImpl#specialName(java.lang.Object)
     */
    @Override
    protected String getFrequencyLabel(Object name) {
        String specialName = getGroupLabel(name);
        if (specialName != null) {
            return specialName;
        } else {
            return super.getFrequencyLabel(name);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * if the bin parameter is set,look range name as a new name.
     */
    protected String getGroupLabel(Object name) {
        if (name == null) {
            return null;
        }
        if (parameters != null) {
            Domain bins = parameters.getBins();
            if (bins != null) {
                EList<RangeRestriction> ranges = bins.getRanges();
                for (RangeRestriction range : ranges) {
                    double minRealValue = DomainHelper.getRealValue(range.getLowerValue());
                    double maxRealValue = DomainHelper.getRealValue(range.getUpperValue());
                    double inputValue = Double.valueOf(name.toString());
                    if (minRealValue <= inputValue && inputValue < maxRealValue) {
                        return range.getName();
                    }
                }
                // if the data(name) is not in these ranges,return null and ignor it.
                return null;
            }
        }
        return name.toString();
    }

    /**
     * if this range isn't computed by any data,put it(value is 0) to the map.so that it is displayed in result page.
     */
    @Override
    public boolean finalizeComputation() {
        if (parameters == null || parameters.getBins() == null) {
            return super.finalizeComputation();
        }
        EList<RangeRestriction> ranges = parameters.getBins().getRanges();
        for (RangeRestriction range : ranges) {
            String rangeName = range.getName();
            if (getMapForFreq().get(rangeName) == null) {
                getMapForFreq().put(rangeName, 0l);
            }
        }
        return super.finalizeComputation();
    }

    /**
     * if it has bin parameters and the range name is null,set it by concating min/max values.
     */
    @Override
    public boolean reset() {

        if (parameters == null || parameters.getBins() == null) {
            return super.reset();
        }
        EList<RangeRestriction> ranges = parameters.getBins().getRanges();
        for (RangeRestriction range : ranges) {
            if (range.getName() == null) {
                double minRealValue = DomainHelper.getRealValue(range.getLowerValue());
                double maxRealValue = DomainHelper.getRealValue(range.getUpperValue());
                String rangeName = analyzedElement.getName() + PluginConstant.SPACE_STRING
                        + SqlPredicate.GREATER_EQUAL.getLiteral() + PluginConstant.SPACE_STRING + minRealValue + " AND "
                        + analyzedElement.getName() + PluginConstant.SPACE_STRING + SqlPredicate.LESS.getLiteral()
                        + PluginConstant.SPACE_STRING + maxRealValue;
                range.setName(rangeName);
            }
        }
        return super.reset();
    }

} // BinFrequencyIndicatorImpl
