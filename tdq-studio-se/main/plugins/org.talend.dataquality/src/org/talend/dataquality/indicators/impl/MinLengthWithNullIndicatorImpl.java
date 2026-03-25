/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.indicators.IndicatorParameters;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.MinLengthWithNullIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Min Length With Null Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MinLengthWithNullIndicatorImpl extends MinLengthIndicatorImpl implements MinLengthWithNullIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MinLengthWithNullIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.MIN_LENGTH_WITH_NULL_INDICATOR;
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
        if (data == null) {
            if (length == LENGTH_EDEFAULT || length > 0) {
                changeLength(0);
            }
            if (this.checkMustStoreCurrentRow()) {
                mustStoreRow = true;
            }
        }
        return ok;
    }
} // MinLengthWithNullIndicatorImpl
