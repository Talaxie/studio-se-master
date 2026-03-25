/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.schema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.indicators.impl.IndicatorImpl;
import org.talend.dataquality.indicators.schema.AbstractTableIndicator;
import org.talend.dataquality.indicators.schema.SchemaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Table Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.AbstractTableIndicatorImpl#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.AbstractTableIndicatorImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractTableIndicatorImpl extends IndicatorImpl implements AbstractTableIndicator {

    /**
     * The default value of the '{@link #getRowCount() <em>Row Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRowCount()
     * @generated
     * @ordered
     */
    protected static final long ROW_COUNT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRowCount() <em>Row Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRowCount()
     * @generated
     * @ordered
     */
    protected long rowCount = ROW_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getTableName()
     * @generated
     * @ordered
     */
    protected static final String TABLE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getTableName()
     * @generated
     * @ordered
     */
    protected String tableName = TABLE_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AbstractTableIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.ABSTRACT_TABLE_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getRowCount() {
        return rowCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRowCount(long newRowCount) {
        long oldRowCount = rowCount;
        rowCount = newRowCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.ABSTRACT_TABLE_INDICATOR__ROW_COUNT, oldRowCount, rowCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTableName() {
        return tableName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTableName(String newTableName) {
        String oldTableName = tableName;
        tableName = newTableName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.ABSTRACT_TABLE_INDICATOR__TABLE_NAME, oldTableName, tableName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SchemaPackage.ABSTRACT_TABLE_INDICATOR__ROW_COUNT:
                return getRowCount();
            case SchemaPackage.ABSTRACT_TABLE_INDICATOR__TABLE_NAME:
                return getTableName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SchemaPackage.ABSTRACT_TABLE_INDICATOR__ROW_COUNT:
                setRowCount((Long)newValue);
                return;
            case SchemaPackage.ABSTRACT_TABLE_INDICATOR__TABLE_NAME:
                setTableName((String)newValue);
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
            case SchemaPackage.ABSTRACT_TABLE_INDICATOR__ROW_COUNT:
                setRowCount(ROW_COUNT_EDEFAULT);
                return;
            case SchemaPackage.ABSTRACT_TABLE_INDICATOR__TABLE_NAME:
                setTableName(TABLE_NAME_EDEFAULT);
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
            case SchemaPackage.ABSTRACT_TABLE_INDICATOR__ROW_COUNT:
                return rowCount != ROW_COUNT_EDEFAULT;
            case SchemaPackage.ABSTRACT_TABLE_INDICATOR__TABLE_NAME:
                return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (rowCount: ");
        result.append(rowCount);
        result.append(", tableName: ");
        result.append(tableName);
        result.append(')');
        return result.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#reset()
     */
    @Override
    public boolean reset() {
        this.tableName = TABLE_NAME_EDEFAULT;
        this.rowCount = ROW_COUNT_EDEFAULT;
        return super.reset();
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

} // AbstractTableIndicatorImpl
