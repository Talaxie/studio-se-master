/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.indicators.IndicatorParameters;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.MaxLengthWithNullIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Max Length With Null Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MaxLengthWithNullIndicatorImpl extends MaxLengthIndicatorImpl implements MaxLengthWithNullIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MaxLengthWithNullIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.MAX_LENGTH_WITH_NULL_INDICATOR;
    }

    @Override
    public IndicatorParameters getParameters() {
        parameters = super.getParameters();
        parameters.getTextParameter().setUseNulls(true);
        parameters.getTextParameter().setUseBlank(false);
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
        // set max length to 0 when it is not already set and data is null
        if (data == null) {
            zeroIsMax();
        }
        return ok;
    }
} // MaxLengthWithNullIndicatorImpl
