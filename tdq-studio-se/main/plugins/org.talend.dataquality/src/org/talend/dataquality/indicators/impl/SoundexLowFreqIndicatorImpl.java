/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.PluginConstant;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.SoundexLowFreqIndicator;
import org.talend.utils.collections.MapValueSorter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Soundex Low Freq Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SoundexLowFreqIndicatorImpl extends SoundexFreqIndicatorImpl implements SoundexLowFreqIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SoundexLowFreqIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.SOUNDEX_LOW_FREQ_INDICATOR;
    }

    @Override
    public boolean handle(Object data) {
        return super.handle(data);
    }

    @Override
    /*
     * MOD qiongli bug 13654,the low soudex should order by ValueToDistinct asc
     */
    public boolean finalizeComputation() {
        final int topN = (parameters != null) ? parameters.getTopN() : PluginConstant.DEFAULT_TOP_N;
        if (isUsedMapDBMode()) {
            computeSoundexFreqByMapDB(false);
        } else {
            soundexForJavaEngine();
            MapValueSorter mvs = new MapValueSorter();
            List<Object> ls = mvs.sortMap(this.getValueToDistinctFreq(), true);
            List<Object> mostFrequent = getOrderElements(ls, topN, true);
            HashMap<Object, Long> map = new HashMap<Object, Long>();
            for (Object object : mostFrequent) {
                map.put(object, valueToFreq.get(object));
            }
            this.setValueToFreq(map);
            // this.distinctComputed = true;
        }
        return true;
    }

} // SoundexLowFreqIndicatorImpl
