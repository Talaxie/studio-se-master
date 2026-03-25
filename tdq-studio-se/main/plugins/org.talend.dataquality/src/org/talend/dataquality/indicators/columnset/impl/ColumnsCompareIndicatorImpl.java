/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.columnset.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.talend.cwm.relational.TdColumn;
import org.talend.dataquality.indicators.columnset.ColumnsCompareIndicator;
import org.talend.dataquality.indicators.columnset.ColumnsetPackage;
import org.talend.dataquality.indicators.impl.MatchingIndicatorImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Columns Compare Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.columnset.impl.ColumnsCompareIndicatorImpl#getColumnSetA <em>Column Set A</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.impl.ColumnsCompareIndicatorImpl#getColumnSetB <em>Column Set B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ColumnsCompareIndicatorImpl extends MatchingIndicatorImpl implements ColumnsCompareIndicator {

    /**
     * The cached value of the '{@link #getColumnSetA() <em>Column Set A</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumnSetA()
     * @generated
     * @ordered
     */
    protected EList<TdColumn> columnSetA;

    /**
     * The cached value of the '{@link #getColumnSetB() <em>Column Set B</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumnSetB()
     * @generated
     * @ordered
     */
    protected EList<TdColumn> columnSetB;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ColumnsCompareIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ColumnsetPackage.Literals.COLUMNS_COMPARE_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<TdColumn> getColumnSetA() {
        if (columnSetA == null) {
            columnSetA = new EObjectResolvingEList<TdColumn>(TdColumn.class, this, ColumnsetPackage.COLUMNS_COMPARE_INDICATOR__COLUMN_SET_A);
        }
        return columnSetA;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<TdColumn> getColumnSetB() {
        if (columnSetB == null) {
            columnSetB = new EObjectResolvingEList<TdColumn>(TdColumn.class, this, ColumnsetPackage.COLUMNS_COMPARE_INDICATOR__COLUMN_SET_B);
        }
        return columnSetB;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ColumnsetPackage.COLUMNS_COMPARE_INDICATOR__COLUMN_SET_A:
                return getColumnSetA();
            case ColumnsetPackage.COLUMNS_COMPARE_INDICATOR__COLUMN_SET_B:
                return getColumnSetB();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ColumnsetPackage.COLUMNS_COMPARE_INDICATOR__COLUMN_SET_A:
                getColumnSetA().clear();
                getColumnSetA().addAll((Collection<? extends TdColumn>)newValue);
                return;
            case ColumnsetPackage.COLUMNS_COMPARE_INDICATOR__COLUMN_SET_B:
                getColumnSetB().clear();
                getColumnSetB().addAll((Collection<? extends TdColumn>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ColumnsetPackage.COLUMNS_COMPARE_INDICATOR__COLUMN_SET_A:
                getColumnSetA().clear();
                return;
            case ColumnsetPackage.COLUMNS_COMPARE_INDICATOR__COLUMN_SET_B:
                getColumnSetB().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ColumnsetPackage.COLUMNS_COMPARE_INDICATOR__COLUMN_SET_A:
                return columnSetA != null && !columnSetA.isEmpty();
            case ColumnsetPackage.COLUMNS_COMPARE_INDICATOR__COLUMN_SET_B:
                return columnSetB != null && !columnSetB.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#storeSqlResults(java.util.List)
     */
    @Override
    public boolean storeSqlResults(List<Object[]> objects) {
        if (!checkResults(objects, 1)) {
            return false;
        }

        // MOD zshen exchange OracleODBC will get a double value to int.Else Have a NumberFormatException at here.
        Long notMatch = Long.valueOf(String.valueOf(objects.get(0)[0]).split("\\.")[0]);
        // ~
        this.setNotMatchingValueCount(notMatch);

        return true;
    }

} // ColumnsCompareIndicatorImpl
