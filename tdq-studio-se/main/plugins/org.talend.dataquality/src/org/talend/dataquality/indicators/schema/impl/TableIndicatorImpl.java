/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.schema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.indicators.schema.SchemaPackage;
import org.talend.dataquality.indicators.schema.TableIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Table Indicator</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.dataquality.indicators.schema.impl.TableIndicatorImpl#getRowCount <em>Row Count</em>}</li>
 * <li>{@link org.talend.dataquality.indicators.schema.impl.TableIndicatorImpl#getTableName <em>Table Name</em>}</li>
 * <li>{@link org.talend.dataquality.indicators.schema.impl.TableIndicatorImpl#getKeyCount <em>Key Count</em>}</li>
 * <li>{@link org.talend.dataquality.indicators.schema.impl.TableIndicatorImpl#getIndexCount <em>Index Count</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TableIndicatorImpl extends AbstractTableIndicatorImpl implements TableIndicator {

    /**
     * The default value of the '{@link #getKeyCount() <em>Key Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getKeyCount()
     * @generated
     * @ordered
     */
    protected static final int KEY_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getKeyCount() <em>Key Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getKeyCount()
     * @generated
     * @ordered
     */
    protected int keyCount = KEY_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getIndexCount() <em>Index Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getIndexCount()
     * @generated
     * @ordered
     */
    protected static final int INDEX_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getIndexCount() <em>Index Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getIndexCount()
     * @generated
     * @ordered
     */
    protected int indexCount = INDEX_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected TableIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.TABLE_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getKeyCount() {
        return keyCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setKeyCount(int newKeyCount) {
        int oldKeyCount = keyCount;
        keyCount = newKeyCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TABLE_INDICATOR__KEY_COUNT, oldKeyCount, keyCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getIndexCount() {
        return indexCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIndexCount(int newIndexCount) {
        int oldIndexCount = indexCount;
        indexCount = newIndexCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TABLE_INDICATOR__INDEX_COUNT, oldIndexCount, indexCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SchemaPackage.TABLE_INDICATOR__KEY_COUNT:
                return getKeyCount();
            case SchemaPackage.TABLE_INDICATOR__INDEX_COUNT:
                return getIndexCount();
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
            case SchemaPackage.TABLE_INDICATOR__KEY_COUNT:
                setKeyCount((Integer)newValue);
                return;
            case SchemaPackage.TABLE_INDICATOR__INDEX_COUNT:
                setIndexCount((Integer)newValue);
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
            case SchemaPackage.TABLE_INDICATOR__KEY_COUNT:
                setKeyCount(KEY_COUNT_EDEFAULT);
                return;
            case SchemaPackage.TABLE_INDICATOR__INDEX_COUNT:
                setIndexCount(INDEX_COUNT_EDEFAULT);
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
            case SchemaPackage.TABLE_INDICATOR__KEY_COUNT:
                return keyCount != KEY_COUNT_EDEFAULT;
            case SchemaPackage.TABLE_INDICATOR__INDEX_COUNT:
                return indexCount != INDEX_COUNT_EDEFAULT;
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
        result.append(" (keyCount: ");
        result.append(keyCount);
        result.append(", indexCount: ");
        result.append(indexCount);
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
        this.keyCount = KEY_COUNT_EDEFAULT;
        this.indexCount = INDEX_COUNT_EDEFAULT;
        return super.reset();
    }

} // TableIndicatorImpl
