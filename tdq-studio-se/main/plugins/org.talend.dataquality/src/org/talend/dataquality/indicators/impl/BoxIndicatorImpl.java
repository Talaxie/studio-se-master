/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.indicators.BoxIndicator;
import org.talend.dataquality.indicators.IQRIndicator;
import org.talend.dataquality.indicators.Indicator;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.MeanIndicator;
import org.talend.dataquality.indicators.MedianIndicator;
import org.talend.dataquality.indicators.RangeIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Box Indicator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.BoxIndicatorImpl#getIQR <em>IQR</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.BoxIndicatorImpl#getRangeIndicator <em>Range Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.BoxIndicatorImpl#getMeanIndicator <em>Mean Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.BoxIndicatorImpl#getMedianIndicator <em>Median Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoxIndicatorImpl extends CompositeIndicatorImpl implements BoxIndicator {

    /**
     * The cached value of the '{@link #getIQR() <em>IQR</em>}' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getIQR()
     * @generated
     * @ordered
     */
    protected IQRIndicator iqr;

    /**
     * The cached value of the '{@link #getRangeIndicator() <em>Range Indicator</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRangeIndicator()
     * @generated
     * @ordered
     */
    protected RangeIndicator rangeIndicator;

    /**
     * The cached value of the '{@link #getMeanIndicator() <em>Mean Indicator</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMeanIndicator()
     * @generated
     * @ordered
     */
    protected MeanIndicator meanIndicator;

    /**
     * The cached value of the '{@link #getMedianIndicator() <em>Median Indicator</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMedianIndicator()
     * @generated
     * @ordered
     */
    protected MedianIndicator medianIndicator;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BoxIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.BOX_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IQRIndicator getIQR() {
        return iqr;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIQR(IQRIndicator newIQR, NotificationChain msgs) {
        IQRIndicator oldIQR = iqr;
        iqr = newIQR;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.BOX_INDICATOR__IQR, oldIQR, newIQR);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIQR(IQRIndicator newIQR) {
        if (newIQR != iqr) {
            NotificationChain msgs = null;
            if (iqr != null)
                msgs = ((InternalEObject)iqr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.BOX_INDICATOR__IQR, null, msgs);
            if (newIQR != null)
                msgs = ((InternalEObject)newIQR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.BOX_INDICATOR__IQR, null, msgs);
            msgs = basicSetIQR(newIQR, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.BOX_INDICATOR__IQR, newIQR, newIQR));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RangeIndicator getRangeIndicator() {
        return rangeIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRangeIndicator(RangeIndicator newRangeIndicator, NotificationChain msgs) {
        RangeIndicator oldRangeIndicator = rangeIndicator;
        rangeIndicator = newRangeIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.BOX_INDICATOR__RANGE_INDICATOR, oldRangeIndicator, newRangeIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRangeIndicator(RangeIndicator newRangeIndicator) {
        if (newRangeIndicator != rangeIndicator) {
            NotificationChain msgs = null;
            if (rangeIndicator != null)
                msgs = ((InternalEObject)rangeIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.BOX_INDICATOR__RANGE_INDICATOR, null, msgs);
            if (newRangeIndicator != null)
                msgs = ((InternalEObject)newRangeIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.BOX_INDICATOR__RANGE_INDICATOR, null, msgs);
            msgs = basicSetRangeIndicator(newRangeIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.BOX_INDICATOR__RANGE_INDICATOR, newRangeIndicator, newRangeIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeanIndicator getMeanIndicator() {
        return meanIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeanIndicator(MeanIndicator newMeanIndicator, NotificationChain msgs) {
        MeanIndicator oldMeanIndicator = meanIndicator;
        meanIndicator = newMeanIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.BOX_INDICATOR__MEAN_INDICATOR, oldMeanIndicator, newMeanIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMeanIndicator(MeanIndicator newMeanIndicator) {
        if (newMeanIndicator != meanIndicator) {
            NotificationChain msgs = null;
            if (meanIndicator != null)
                msgs = ((InternalEObject)meanIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.BOX_INDICATOR__MEAN_INDICATOR, null, msgs);
            if (newMeanIndicator != null)
                msgs = ((InternalEObject)newMeanIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.BOX_INDICATOR__MEAN_INDICATOR, null, msgs);
            msgs = basicSetMeanIndicator(newMeanIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.BOX_INDICATOR__MEAN_INDICATOR, newMeanIndicator, newMeanIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MedianIndicator getMedianIndicator() {
        return medianIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMedianIndicator(MedianIndicator newMedianIndicator, NotificationChain msgs) {
        MedianIndicator oldMedianIndicator = medianIndicator;
        medianIndicator = newMedianIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.BOX_INDICATOR__MEDIAN_INDICATOR, oldMedianIndicator, newMedianIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMedianIndicator(MedianIndicator newMedianIndicator) {
        if (newMedianIndicator != medianIndicator) {
            NotificationChain msgs = null;
            if (medianIndicator != null)
                msgs = ((InternalEObject)medianIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.BOX_INDICATOR__MEDIAN_INDICATOR, null, msgs);
            if (newMedianIndicator != null)
                msgs = ((InternalEObject)newMedianIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.BOX_INDICATOR__MEDIAN_INDICATOR, null, msgs);
            msgs = basicSetMedianIndicator(newMedianIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.BOX_INDICATOR__MEDIAN_INDICATOR, newMedianIndicator, newMedianIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case IndicatorsPackage.BOX_INDICATOR__IQR:
                return basicSetIQR(null, msgs);
            case IndicatorsPackage.BOX_INDICATOR__RANGE_INDICATOR:
                return basicSetRangeIndicator(null, msgs);
            case IndicatorsPackage.BOX_INDICATOR__MEAN_INDICATOR:
                return basicSetMeanIndicator(null, msgs);
            case IndicatorsPackage.BOX_INDICATOR__MEDIAN_INDICATOR:
                return basicSetMedianIndicator(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.BOX_INDICATOR__IQR:
                return getIQR();
            case IndicatorsPackage.BOX_INDICATOR__RANGE_INDICATOR:
                return getRangeIndicator();
            case IndicatorsPackage.BOX_INDICATOR__MEAN_INDICATOR:
                return getMeanIndicator();
            case IndicatorsPackage.BOX_INDICATOR__MEDIAN_INDICATOR:
                return getMedianIndicator();
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
            case IndicatorsPackage.BOX_INDICATOR__IQR:
                setIQR((IQRIndicator)newValue);
                return;
            case IndicatorsPackage.BOX_INDICATOR__RANGE_INDICATOR:
                setRangeIndicator((RangeIndicator)newValue);
                return;
            case IndicatorsPackage.BOX_INDICATOR__MEAN_INDICATOR:
                setMeanIndicator((MeanIndicator)newValue);
                return;
            case IndicatorsPackage.BOX_INDICATOR__MEDIAN_INDICATOR:
                setMedianIndicator((MedianIndicator)newValue);
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
            case IndicatorsPackage.BOX_INDICATOR__IQR:
                setIQR((IQRIndicator)null);
                return;
            case IndicatorsPackage.BOX_INDICATOR__RANGE_INDICATOR:
                setRangeIndicator((RangeIndicator)null);
                return;
            case IndicatorsPackage.BOX_INDICATOR__MEAN_INDICATOR:
                setMeanIndicator((MeanIndicator)null);
                return;
            case IndicatorsPackage.BOX_INDICATOR__MEDIAN_INDICATOR:
                setMedianIndicator((MedianIndicator)null);
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
            case IndicatorsPackage.BOX_INDICATOR__IQR:
                return iqr != null;
            case IndicatorsPackage.BOX_INDICATOR__RANGE_INDICATOR:
                return rangeIndicator != null;
            case IndicatorsPackage.BOX_INDICATOR__MEAN_INDICATOR:
                return meanIndicator != null;
            case IndicatorsPackage.BOX_INDICATOR__MEDIAN_INDICATOR:
                return medianIndicator != null;
        }
        return super.eIsSet(featureID);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataquality.indicators.impl.CompositeIndicatorImpl#getChildIndicators()
     * 
     * ADDED scorreia 2008-05-22 getChildIndicators()
     */
    @Override
    public EList<Indicator> getChildIndicators() {
        EList<Indicator> children = new BasicEList<Indicator>();
        addChildToList(this.getMeanIndicator(), children);
        addChildToList(this.getMedianIndicator(), children);
        addChildToList(this.getRangeIndicator(), children);
        addChildToList(this.getIQR(), children);
        return children;
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

} // BoxIndicatorImpl
