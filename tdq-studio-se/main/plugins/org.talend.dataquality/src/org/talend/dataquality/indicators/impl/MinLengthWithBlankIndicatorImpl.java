/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.indicators.IndicatorParameters;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.MinLengthWithBlankIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Min Length With Blank Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MinLengthWithBlankIndicatorImpl extends MinLengthIndicatorImpl implements MinLengthWithBlankIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MinLengthWithBlankIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.MIN_LENGTH_WITH_BLANK_INDICATOR;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.MinLengthIndicatorImpl#handle(java.lang.Object)
     */
    @Override
    public boolean handle(Object data) {
        boolean ok = super.handle(data);
        if (data != null && ((String) data).trim().length() == 0) {
            if (length == LENGTH_EDEFAULT || length > 0) {
                changeLength(0);
            }
            if (this.checkMustStoreCurrentRow()) {
                mustStoreRow = true;
            }
        }
        return ok;
    }

    @Override
    public IndicatorParameters getParameters() {
        parameters = super.getParameters();
        parameters.getTextParameter().setUseNulls(false);
        parameters.getTextParameter().setUseBlank(true);
        return parameters;
    }
} // MinLengthWithBlankIndicatorImpl
