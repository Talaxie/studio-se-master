/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.columnset.impl;

import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.indicators.columnset.BlockKeyIndicator;
import org.talend.dataquality.indicators.columnset.ColumnsetPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Block Key Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.columnset.impl.BlockKeyIndicatorImpl#getBlockSize2frequency <em>Block Size2frequency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockKeyIndicatorImpl extends ColumnSetMultiValueIndicatorImpl implements BlockKeyIndicator {

    /**
     * The default value of the '{@link #getBlockSize2frequency() <em>Block Size2frequency</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBlockSize2frequency()
     * @generated
     * @ordered
     */
    protected static final TreeMap<Object, Long> BLOCK_SIZE2FREQUENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBlockSize2frequency() <em>Block Size2frequency</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBlockSize2frequency()
     * @generated
     * @ordered
     */
    protected TreeMap<Object, Long> blockSize2frequency = BLOCK_SIZE2FREQUENCY_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BlockKeyIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ColumnsetPackage.Literals.BLOCK_KEY_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TreeMap<Object, Long> getBlockSize2frequency() {
        return blockSize2frequency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBlockSize2frequency(TreeMap<Object, Long> newBlockSize2frequency) {
        TreeMap<Object, Long> oldBlockSize2frequency = blockSize2frequency;
        blockSize2frequency = newBlockSize2frequency;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ColumnsetPackage.BLOCK_KEY_INDICATOR__BLOCK_SIZE2FREQUENCY, oldBlockSize2frequency, blockSize2frequency));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ColumnsetPackage.BLOCK_KEY_INDICATOR__BLOCK_SIZE2FREQUENCY:
                return getBlockSize2frequency();
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
            case ColumnsetPackage.BLOCK_KEY_INDICATOR__BLOCK_SIZE2FREQUENCY:
                setBlockSize2frequency((TreeMap<Object, Long>)newValue);
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
            case ColumnsetPackage.BLOCK_KEY_INDICATOR__BLOCK_SIZE2FREQUENCY:
                setBlockSize2frequency(BLOCK_SIZE2FREQUENCY_EDEFAULT);
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
            case ColumnsetPackage.BLOCK_KEY_INDICATOR__BLOCK_SIZE2FREQUENCY:
                return BLOCK_SIZE2FREQUENCY_EDEFAULT == null ? blockSize2frequency != null : !BLOCK_SIZE2FREQUENCY_EDEFAULT.equals(blockSize2frequency);
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
        result.append(" (blockSize2frequency: ");
        result.append(blockSize2frequency);
        result.append(')');
        return result.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#isSaveTempDataToFile()
     */
    @Override
    public boolean isUsedMapDBMode() {
        return false;
    }

} // BlockKeyIndicatorImpl
