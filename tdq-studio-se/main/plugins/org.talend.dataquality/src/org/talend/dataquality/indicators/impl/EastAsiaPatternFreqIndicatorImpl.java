/**
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.common.regex.ChainResponsibilityHandler;
import org.talend.dataquality.common.regex.HandlerFactory;
import org.talend.dataquality.indicators.EastAsiaPatternFreqIndicator;
import org.talend.dataquality.indicators.IndicatorsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>East Asia Pattern Freq Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EastAsiaPatternFreqIndicatorImpl extends PatternFreqIndicatorImpl implements EastAsiaPatternFreqIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected EastAsiaPatternFreqIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.EAST_ASIA_PATTERN_FREQ_INDICATOR;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.PatternFreqIndicatorImpl#convertCharacters(java.lang.String)
     */
    @Override
    public String convertCharacters(String data) {
        String convertCharacters = super.convertCharacters(data);
        if (!isBeanCustomized()) {
            convertCharacters = externalConvertChartacters(convertCharacters);
        }
        return convertCharacters;
    }

    /**
     * DOC talend Comment method "externalConvertChartacters".
     * 
     * @param convertCharacters
     * @return
     */
    private String externalConvertChartacters(String convertCharacters) {
        ChainResponsibilityHandler createEastAsiaPatternHandler = HandlerFactory.createEastAsiaPatternHandler();
        return createEastAsiaPatternHandler.handleRequest(convertCharacters);
    }

} // EastAsiaPatternFreqIndicatorImpl
