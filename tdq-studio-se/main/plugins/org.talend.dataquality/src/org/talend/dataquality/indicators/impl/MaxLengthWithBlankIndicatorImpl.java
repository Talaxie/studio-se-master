/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.indicators.IndicatorParameters;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.MaxLengthWithBlankIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Max Length With Blank Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MaxLengthWithBlankIndicatorImpl extends MaxLengthIndicatorImpl implements MaxLengthWithBlankIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MaxLengthWithBlankIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.MAX_LENGTH_WITH_BLANK_INDICATOR;
    }

    @Override
    public IndicatorParameters getParameters() {
        parameters = super.getParameters();
        parameters.getTextParameter().setUseNulls(false);
        parameters.getTextParameter().setUseBlank(true);
        return parameters;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public boolean handle(Object data) {
        boolean ok = super.handle(data);
        // handle case when length is not set although data is not null (this means that data is blank)
        if (data != null) {
            zeroIsMax();

        }
        return ok;
    }
} // MaxLengthWithBlankIndicatorImpl
