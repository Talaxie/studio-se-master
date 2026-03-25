/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.columnset.impl;

import org.eclipse.emf.ecore.EClass;
import org.talend.dataquality.indicators.columnset.ColumnsetPackage;
import org.talend.dataquality.indicators.columnset.MinMaxDateIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Min Max Date Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MinMaxDateIndicatorImpl extends ColumnSetMultiValueIndicatorImpl implements MinMaxDateIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MinMaxDateIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ColumnsetPackage.Literals.MIN_MAX_DATE_INDICATOR;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#isUsedMapDBMode()
     */
    @Override
    public boolean isUsedMapDBMode() {
        return false;
    }

} // MinMaxDateIndicatorImpl
