/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.indicators.IndicatorValueType;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.ModeIndicator;
import org.talend.utils.collections.MapValueSorter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mode Indicator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.ModeIndicatorImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeIndicatorImpl extends FrequencyIndicatorImpl implements ModeIndicator {

    private static Logger log = Logger.getLogger(ModeIndicatorImpl.class);

    /**
     * The default value of the '{@link #getMode() <em>Mode</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected static final Object MODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected Object mode = MODE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ModeIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.MODE_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getMode() {
        return mode;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMode(Object newMode) {
        Object oldMode = mode;
        mode = newMode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.MODE_INDICATOR__MODE, oldMode, mode));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.MODE_INDICATOR__MODE:
                return getMode();
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
            case IndicatorsPackage.MODE_INDICATOR__MODE:
                setMode(newValue);
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
            case IndicatorsPackage.MODE_INDICATOR__MODE:
                setMode(MODE_EDEFAULT);
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
            case IndicatorsPackage.MODE_INDICATOR__MODE:
                return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
        }
        return super.eIsSet(featureID);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.FrequencyIndicatorImpl#handle(java.lang.Object)
     */
    @Override
    public boolean handle(Object data) {
        boolean handle = super.handle(data);
        mustStoreRow = false;
        return handle;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#storeSqlResults(java.util.List)
     * 
     * ADDED scorreia 2008-05-02 storeSqlResults(List<Object[]> objects)
     */
    @Override
    public boolean storeSqlResults(List<Object[]> objects) {
        // ADD xqliu 2009-05-14 bug 7179
        if (objects != null && objects.isEmpty()) {
            this.setMode("");
            return true;
        }
        // ~
        if (!checkResults(objects, 2)) {
            return false;
        }
        Object c = null;
        if (objects != null) {
            c = objects.get(0)[0];
            this.setMode(c);
        }

        if (log.isDebugEnabled()) {
            log.debug("Mode found: " + c);
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mode: ");
        result.append(mode);
        result.append(')');
        return result.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#getInstanceValue()
     * 
     * ADDED scorreia 2008-05-12 getInstanceValue()
     */
    @Override
    public String getInstanceValue() {
        return String.valueOf(this.getMode());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#getValueType()
     * 
     * ADDED scorreia 2008-05-12 getValueType()
     */
    @Override
    public IndicatorValueType getValueType() {
        return IndicatorValueType.INSTANCE_VALUE;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.FrequencyIndicatorImpl#finalizeComputation()
     */
    @Override
    public boolean finalizeComputation() {

        List<Object[]> mostFrequentList = new ArrayList<Object[]>();
        // get the most frequency value
        List<Object> mostFrequent = new MapValueSorter().getMostFrequent(getMapForFreq(), 1);
        if (mostFrequent != null && !mostFrequent.isEmpty()) {
            Object[] mostFrequentObj = new Object[] { mostFrequent.get(0), getMapForFreq().get(mostFrequent.get(0)) };
            mostFrequentList.add(mostFrequentObj);
        }

        this.storeSqlResults(mostFrequentList);
        return super.finalizeComputation();
    }

} // ModeIndicatorImpl
