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
import org.talend.dataquality.indicators.AverageLengthIndicator;
import org.talend.dataquality.indicators.AvgLengthWithBlankIndicator;
import org.talend.dataquality.indicators.AvgLengthWithBlankNullIndicator;
import org.talend.dataquality.indicators.AvgLengthWithNullIndicator;
import org.talend.dataquality.indicators.Indicator;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.MaxLengthIndicator;
import org.talend.dataquality.indicators.MaxLengthWithBlankIndicator;
import org.talend.dataquality.indicators.MaxLengthWithBlankNullIndicator;
import org.talend.dataquality.indicators.MaxLengthWithNullIndicator;
import org.talend.dataquality.indicators.MinLengthIndicator;
import org.talend.dataquality.indicators.MinLengthWithBlankIndicator;
import org.talend.dataquality.indicators.MinLengthWithBlankNullIndicator;
import org.talend.dataquality.indicators.MinLengthWithNullIndicator;
import org.talend.dataquality.indicators.TextIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Text Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getAverageLengthIndicator <em>Average Length Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getMaxLengthIndicator <em>Max Length Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getMinLengthIndicator <em>Min Length Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getMinLengthWithBlankIndicator <em>Min Length With Blank Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getMinLengthWithNullIndicator <em>Min Length With Null Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getMinLengthWithBlankNullIndicator <em>Min Length With Blank Null Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getMaxLengthWithBlankIndicator <em>Max Length With Blank Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getMaxLengthWithNullIndicator <em>Max Length With Null Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getMaxLengthWithBlankNullIndicator <em>Max Length With Blank Null Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getAvgLengthWithBlankIndicator <em>Avg Length With Blank Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getAvgLengthWithNullIndicator <em>Avg Length With Null Indicator</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.impl.TextIndicatorImpl#getAvgLengthWithBlankNullIndicator <em>Avg Length With Blank Null Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextIndicatorImpl extends CompositeIndicatorImpl implements TextIndicator {

    /**
     * The cached value of the '{@link #getAverageLengthIndicator() <em>Average Length Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAverageLengthIndicator()
     * @generated
     * @ordered
     */
    protected AverageLengthIndicator averageLengthIndicator;

    /**
     * The cached value of the '{@link #getMaxLengthIndicator() <em>Max Length Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMaxLengthIndicator()
     * @generated
     * @ordered
     */
    protected MaxLengthIndicator maxLengthIndicator;

    /**
     * The cached value of the '{@link #getMinLengthIndicator() <em>Min Length Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMinLengthIndicator()
     * @generated
     * @ordered
     */
    protected MinLengthIndicator minLengthIndicator;

    /**
     * The cached value of the '{@link #getMinLengthWithBlankIndicator() <em>Min Length With Blank Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinLengthWithBlankIndicator()
     * @generated
     * @ordered
     */
    protected MinLengthWithBlankIndicator minLengthWithBlankIndicator;

    /**
     * The cached value of the '{@link #getMinLengthWithNullIndicator() <em>Min Length With Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinLengthWithNullIndicator()
     * @generated
     * @ordered
     */
    protected MinLengthWithNullIndicator minLengthWithNullIndicator;

    /**
     * The cached value of the '{@link #getMinLengthWithBlankNullIndicator() <em>Min Length With Blank Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinLengthWithBlankNullIndicator()
     * @generated
     * @ordered
     */
    protected MinLengthWithBlankNullIndicator minLengthWithBlankNullIndicator;

    /**
     * The cached value of the '{@link #getMaxLengthWithBlankIndicator() <em>Max Length With Blank Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLengthWithBlankIndicator()
     * @generated
     * @ordered
     */
    protected MaxLengthWithBlankIndicator maxLengthWithBlankIndicator;

    /**
     * The cached value of the '{@link #getMaxLengthWithNullIndicator() <em>Max Length With Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLengthWithNullIndicator()
     * @generated
     * @ordered
     */
    protected MaxLengthWithNullIndicator maxLengthWithNullIndicator;

    /**
     * The cached value of the '{@link #getMaxLengthWithBlankNullIndicator() <em>Max Length With Blank Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLengthWithBlankNullIndicator()
     * @generated
     * @ordered
     */
    protected MaxLengthWithBlankNullIndicator maxLengthWithBlankNullIndicator;

    /**
     * The cached value of the '{@link #getAvgLengthWithBlankIndicator() <em>Avg Length With Blank Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAvgLengthWithBlankIndicator()
     * @generated
     * @ordered
     */
    protected AvgLengthWithBlankIndicator avgLengthWithBlankIndicator;

    /**
     * The cached value of the '{@link #getAvgLengthWithNullIndicator() <em>Avg Length With Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAvgLengthWithNullIndicator()
     * @generated
     * @ordered
     */
    protected AvgLengthWithNullIndicator avgLengthWithNullIndicator;

    /**
     * The cached value of the '{@link #getAvgLengthWithBlankNullIndicator() <em>Avg Length With Blank Null Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAvgLengthWithBlankNullIndicator()
     * @generated
     * @ordered
     */
    protected AvgLengthWithBlankNullIndicator avgLengthWithBlankNullIndicator;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected TextIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.TEXT_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AverageLengthIndicator getAverageLengthIndicator() {
        return averageLengthIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAverageLengthIndicator(AverageLengthIndicator newAverageLengthIndicator,
            NotificationChain msgs) {
        AverageLengthIndicator oldAverageLengthIndicator = averageLengthIndicator;
        averageLengthIndicator = newAverageLengthIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR, oldAverageLengthIndicator, newAverageLengthIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAverageLengthIndicator(AverageLengthIndicator newAverageLengthIndicator) {
        if (newAverageLengthIndicator != averageLengthIndicator) {
            NotificationChain msgs = null;
            if (averageLengthIndicator != null)
                msgs = ((InternalEObject)averageLengthIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR, null, msgs);
            if (newAverageLengthIndicator != null)
                msgs = ((InternalEObject)newAverageLengthIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR, null, msgs);
            msgs = basicSetAverageLengthIndicator(newAverageLengthIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR, newAverageLengthIndicator, newAverageLengthIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MaxLengthIndicator getMaxLengthIndicator() {
        return maxLengthIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMaxLengthIndicator(MaxLengthIndicator newMaxLengthIndicator, NotificationChain msgs) {
        MaxLengthIndicator oldMaxLengthIndicator = maxLengthIndicator;
        maxLengthIndicator = newMaxLengthIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_INDICATOR, oldMaxLengthIndicator, newMaxLengthIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMaxLengthIndicator(MaxLengthIndicator newMaxLengthIndicator) {
        if (newMaxLengthIndicator != maxLengthIndicator) {
            NotificationChain msgs = null;
            if (maxLengthIndicator != null)
                msgs = ((InternalEObject)maxLengthIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_INDICATOR, null, msgs);
            if (newMaxLengthIndicator != null)
                msgs = ((InternalEObject)newMaxLengthIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_INDICATOR, null, msgs);
            msgs = basicSetMaxLengthIndicator(newMaxLengthIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_INDICATOR, newMaxLengthIndicator, newMaxLengthIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MinLengthIndicator getMinLengthIndicator() {
        return minLengthIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMinLengthIndicator(MinLengthIndicator newMinLengthIndicator, NotificationChain msgs) {
        MinLengthIndicator oldMinLengthIndicator = minLengthIndicator;
        minLengthIndicator = newMinLengthIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_INDICATOR, oldMinLengthIndicator, newMinLengthIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMinLengthIndicator(MinLengthIndicator newMinLengthIndicator) {
        if (newMinLengthIndicator != minLengthIndicator) {
            NotificationChain msgs = null;
            if (minLengthIndicator != null)
                msgs = ((InternalEObject)minLengthIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_INDICATOR, null, msgs);
            if (newMinLengthIndicator != null)
                msgs = ((InternalEObject)newMinLengthIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_INDICATOR, null, msgs);
            msgs = basicSetMinLengthIndicator(newMinLengthIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_INDICATOR, newMinLengthIndicator, newMinLengthIndicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinLengthWithBlankIndicator getMinLengthWithBlankIndicator() {
        return minLengthWithBlankIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMinLengthWithBlankIndicator(MinLengthWithBlankIndicator newMinLengthWithBlankIndicator, NotificationChain msgs) {
        MinLengthWithBlankIndicator oldMinLengthWithBlankIndicator = minLengthWithBlankIndicator;
        minLengthWithBlankIndicator = newMinLengthWithBlankIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR, oldMinLengthWithBlankIndicator, newMinLengthWithBlankIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinLengthWithBlankIndicator(MinLengthWithBlankIndicator newMinLengthWithBlankIndicator) {
        if (newMinLengthWithBlankIndicator != minLengthWithBlankIndicator) {
            NotificationChain msgs = null;
            if (minLengthWithBlankIndicator != null)
                msgs = ((InternalEObject)minLengthWithBlankIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR, null, msgs);
            if (newMinLengthWithBlankIndicator != null)
                msgs = ((InternalEObject)newMinLengthWithBlankIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR, null, msgs);
            msgs = basicSetMinLengthWithBlankIndicator(newMinLengthWithBlankIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR, newMinLengthWithBlankIndicator, newMinLengthWithBlankIndicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinLengthWithNullIndicator getMinLengthWithNullIndicator() {
        return minLengthWithNullIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMinLengthWithNullIndicator(MinLengthWithNullIndicator newMinLengthWithNullIndicator, NotificationChain msgs) {
        MinLengthWithNullIndicator oldMinLengthWithNullIndicator = minLengthWithNullIndicator;
        minLengthWithNullIndicator = newMinLengthWithNullIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR, oldMinLengthWithNullIndicator, newMinLengthWithNullIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinLengthWithNullIndicator(MinLengthWithNullIndicator newMinLengthWithNullIndicator) {
        if (newMinLengthWithNullIndicator != minLengthWithNullIndicator) {
            NotificationChain msgs = null;
            if (minLengthWithNullIndicator != null)
                msgs = ((InternalEObject)minLengthWithNullIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR, null, msgs);
            if (newMinLengthWithNullIndicator != null)
                msgs = ((InternalEObject)newMinLengthWithNullIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR, null, msgs);
            msgs = basicSetMinLengthWithNullIndicator(newMinLengthWithNullIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR, newMinLengthWithNullIndicator, newMinLengthWithNullIndicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinLengthWithBlankNullIndicator getMinLengthWithBlankNullIndicator() {
        return minLengthWithBlankNullIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMinLengthWithBlankNullIndicator(MinLengthWithBlankNullIndicator newMinLengthWithBlankNullIndicator, NotificationChain msgs) {
        MinLengthWithBlankNullIndicator oldMinLengthWithBlankNullIndicator = minLengthWithBlankNullIndicator;
        minLengthWithBlankNullIndicator = newMinLengthWithBlankNullIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR, oldMinLengthWithBlankNullIndicator, newMinLengthWithBlankNullIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinLengthWithBlankNullIndicator(MinLengthWithBlankNullIndicator newMinLengthWithBlankNullIndicator) {
        if (newMinLengthWithBlankNullIndicator != minLengthWithBlankNullIndicator) {
            NotificationChain msgs = null;
            if (minLengthWithBlankNullIndicator != null)
                msgs = ((InternalEObject)minLengthWithBlankNullIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR, null, msgs);
            if (newMinLengthWithBlankNullIndicator != null)
                msgs = ((InternalEObject)newMinLengthWithBlankNullIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR, null, msgs);
            msgs = basicSetMinLengthWithBlankNullIndicator(newMinLengthWithBlankNullIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR, newMinLengthWithBlankNullIndicator, newMinLengthWithBlankNullIndicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaxLengthWithBlankIndicator getMaxLengthWithBlankIndicator() {
        return maxLengthWithBlankIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMaxLengthWithBlankIndicator(MaxLengthWithBlankIndicator newMaxLengthWithBlankIndicator, NotificationChain msgs) {
        MaxLengthWithBlankIndicator oldMaxLengthWithBlankIndicator = maxLengthWithBlankIndicator;
        maxLengthWithBlankIndicator = newMaxLengthWithBlankIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR, oldMaxLengthWithBlankIndicator, newMaxLengthWithBlankIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxLengthWithBlankIndicator(MaxLengthWithBlankIndicator newMaxLengthWithBlankIndicator) {
        if (newMaxLengthWithBlankIndicator != maxLengthWithBlankIndicator) {
            NotificationChain msgs = null;
            if (maxLengthWithBlankIndicator != null)
                msgs = ((InternalEObject)maxLengthWithBlankIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR, null, msgs);
            if (newMaxLengthWithBlankIndicator != null)
                msgs = ((InternalEObject)newMaxLengthWithBlankIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR, null, msgs);
            msgs = basicSetMaxLengthWithBlankIndicator(newMaxLengthWithBlankIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR, newMaxLengthWithBlankIndicator, newMaxLengthWithBlankIndicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaxLengthWithNullIndicator getMaxLengthWithNullIndicator() {
        return maxLengthWithNullIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMaxLengthWithNullIndicator(MaxLengthWithNullIndicator newMaxLengthWithNullIndicator, NotificationChain msgs) {
        MaxLengthWithNullIndicator oldMaxLengthWithNullIndicator = maxLengthWithNullIndicator;
        maxLengthWithNullIndicator = newMaxLengthWithNullIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR, oldMaxLengthWithNullIndicator, newMaxLengthWithNullIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxLengthWithNullIndicator(MaxLengthWithNullIndicator newMaxLengthWithNullIndicator) {
        if (newMaxLengthWithNullIndicator != maxLengthWithNullIndicator) {
            NotificationChain msgs = null;
            if (maxLengthWithNullIndicator != null)
                msgs = ((InternalEObject)maxLengthWithNullIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR, null, msgs);
            if (newMaxLengthWithNullIndicator != null)
                msgs = ((InternalEObject)newMaxLengthWithNullIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR, null, msgs);
            msgs = basicSetMaxLengthWithNullIndicator(newMaxLengthWithNullIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR, newMaxLengthWithNullIndicator, newMaxLengthWithNullIndicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaxLengthWithBlankNullIndicator getMaxLengthWithBlankNullIndicator() {
        return maxLengthWithBlankNullIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMaxLengthWithBlankNullIndicator(MaxLengthWithBlankNullIndicator newMaxLengthWithBlankNullIndicator, NotificationChain msgs) {
        MaxLengthWithBlankNullIndicator oldMaxLengthWithBlankNullIndicator = maxLengthWithBlankNullIndicator;
        maxLengthWithBlankNullIndicator = newMaxLengthWithBlankNullIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR, oldMaxLengthWithBlankNullIndicator, newMaxLengthWithBlankNullIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxLengthWithBlankNullIndicator(MaxLengthWithBlankNullIndicator newMaxLengthWithBlankNullIndicator) {
        if (newMaxLengthWithBlankNullIndicator != maxLengthWithBlankNullIndicator) {
            NotificationChain msgs = null;
            if (maxLengthWithBlankNullIndicator != null)
                msgs = ((InternalEObject)maxLengthWithBlankNullIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR, null, msgs);
            if (newMaxLengthWithBlankNullIndicator != null)
                msgs = ((InternalEObject)newMaxLengthWithBlankNullIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR, null, msgs);
            msgs = basicSetMaxLengthWithBlankNullIndicator(newMaxLengthWithBlankNullIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR, newMaxLengthWithBlankNullIndicator, newMaxLengthWithBlankNullIndicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AvgLengthWithBlankIndicator getAvgLengthWithBlankIndicator() {
        return avgLengthWithBlankIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAvgLengthWithBlankIndicator(AvgLengthWithBlankIndicator newAvgLengthWithBlankIndicator, NotificationChain msgs) {
        AvgLengthWithBlankIndicator oldAvgLengthWithBlankIndicator = avgLengthWithBlankIndicator;
        avgLengthWithBlankIndicator = newAvgLengthWithBlankIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR, oldAvgLengthWithBlankIndicator, newAvgLengthWithBlankIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAvgLengthWithBlankIndicator(AvgLengthWithBlankIndicator newAvgLengthWithBlankIndicator) {
        if (newAvgLengthWithBlankIndicator != avgLengthWithBlankIndicator) {
            NotificationChain msgs = null;
            if (avgLengthWithBlankIndicator != null)
                msgs = ((InternalEObject)avgLengthWithBlankIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR, null, msgs);
            if (newAvgLengthWithBlankIndicator != null)
                msgs = ((InternalEObject)newAvgLengthWithBlankIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR, null, msgs);
            msgs = basicSetAvgLengthWithBlankIndicator(newAvgLengthWithBlankIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR, newAvgLengthWithBlankIndicator, newAvgLengthWithBlankIndicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AvgLengthWithNullIndicator getAvgLengthWithNullIndicator() {
        return avgLengthWithNullIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAvgLengthWithNullIndicator(AvgLengthWithNullIndicator newAvgLengthWithNullIndicator, NotificationChain msgs) {
        AvgLengthWithNullIndicator oldAvgLengthWithNullIndicator = avgLengthWithNullIndicator;
        avgLengthWithNullIndicator = newAvgLengthWithNullIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR, oldAvgLengthWithNullIndicator, newAvgLengthWithNullIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAvgLengthWithNullIndicator(AvgLengthWithNullIndicator newAvgLengthWithNullIndicator) {
        if (newAvgLengthWithNullIndicator != avgLengthWithNullIndicator) {
            NotificationChain msgs = null;
            if (avgLengthWithNullIndicator != null)
                msgs = ((InternalEObject)avgLengthWithNullIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR, null, msgs);
            if (newAvgLengthWithNullIndicator != null)
                msgs = ((InternalEObject)newAvgLengthWithNullIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR, null, msgs);
            msgs = basicSetAvgLengthWithNullIndicator(newAvgLengthWithNullIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR, newAvgLengthWithNullIndicator, newAvgLengthWithNullIndicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AvgLengthWithBlankNullIndicator getAvgLengthWithBlankNullIndicator() {
        return avgLengthWithBlankNullIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAvgLengthWithBlankNullIndicator(AvgLengthWithBlankNullIndicator newAvgLengthWithBlankNullIndicator, NotificationChain msgs) {
        AvgLengthWithBlankNullIndicator oldAvgLengthWithBlankNullIndicator = avgLengthWithBlankNullIndicator;
        avgLengthWithBlankNullIndicator = newAvgLengthWithBlankNullIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR, oldAvgLengthWithBlankNullIndicator, newAvgLengthWithBlankNullIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAvgLengthWithBlankNullIndicator(AvgLengthWithBlankNullIndicator newAvgLengthWithBlankNullIndicator) {
        if (newAvgLengthWithBlankNullIndicator != avgLengthWithBlankNullIndicator) {
            NotificationChain msgs = null;
            if (avgLengthWithBlankNullIndicator != null)
                msgs = ((InternalEObject)avgLengthWithBlankNullIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR, null, msgs);
            if (newAvgLengthWithBlankNullIndicator != null)
                msgs = ((InternalEObject)newAvgLengthWithBlankNullIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR, null, msgs);
            msgs = basicSetAvgLengthWithBlankNullIndicator(newAvgLengthWithBlankNullIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR, newAvgLengthWithBlankNullIndicator, newAvgLengthWithBlankNullIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case IndicatorsPackage.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR:
                return basicSetAverageLengthIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_INDICATOR:
                return basicSetMaxLengthIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_INDICATOR:
                return basicSetMinLengthIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR:
                return basicSetMinLengthWithBlankIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR:
                return basicSetMinLengthWithNullIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR:
                return basicSetMinLengthWithBlankNullIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR:
                return basicSetMaxLengthWithBlankIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR:
                return basicSetMaxLengthWithNullIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR:
                return basicSetMaxLengthWithBlankNullIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR:
                return basicSetAvgLengthWithBlankIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR:
                return basicSetAvgLengthWithNullIndicator(null, msgs);
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR:
                return basicSetAvgLengthWithBlankNullIndicator(null, msgs);
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
            case IndicatorsPackage.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR:
                return getAverageLengthIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_INDICATOR:
                return getMaxLengthIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_INDICATOR:
                return getMinLengthIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR:
                return getMinLengthWithBlankIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR:
                return getMinLengthWithNullIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR:
                return getMinLengthWithBlankNullIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR:
                return getMaxLengthWithBlankIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR:
                return getMaxLengthWithNullIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR:
                return getMaxLengthWithBlankNullIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR:
                return getAvgLengthWithBlankIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR:
                return getAvgLengthWithNullIndicator();
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR:
                return getAvgLengthWithBlankNullIndicator();
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
            case IndicatorsPackage.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR:
                setAverageLengthIndicator((AverageLengthIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_INDICATOR:
                setMaxLengthIndicator((MaxLengthIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_INDICATOR:
                setMinLengthIndicator((MinLengthIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR:
                setMinLengthWithBlankIndicator((MinLengthWithBlankIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR:
                setMinLengthWithNullIndicator((MinLengthWithNullIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR:
                setMinLengthWithBlankNullIndicator((MinLengthWithBlankNullIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR:
                setMaxLengthWithBlankIndicator((MaxLengthWithBlankIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR:
                setMaxLengthWithNullIndicator((MaxLengthWithNullIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR:
                setMaxLengthWithBlankNullIndicator((MaxLengthWithBlankNullIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR:
                setAvgLengthWithBlankIndicator((AvgLengthWithBlankIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR:
                setAvgLengthWithNullIndicator((AvgLengthWithNullIndicator)newValue);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR:
                setAvgLengthWithBlankNullIndicator((AvgLengthWithBlankNullIndicator)newValue);
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
            case IndicatorsPackage.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR:
                setAverageLengthIndicator((AverageLengthIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_INDICATOR:
                setMaxLengthIndicator((MaxLengthIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_INDICATOR:
                setMinLengthIndicator((MinLengthIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR:
                setMinLengthWithBlankIndicator((MinLengthWithBlankIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR:
                setMinLengthWithNullIndicator((MinLengthWithNullIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR:
                setMinLengthWithBlankNullIndicator((MinLengthWithBlankNullIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR:
                setMaxLengthWithBlankIndicator((MaxLengthWithBlankIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR:
                setMaxLengthWithNullIndicator((MaxLengthWithNullIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR:
                setMaxLengthWithBlankNullIndicator((MaxLengthWithBlankNullIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR:
                setAvgLengthWithBlankIndicator((AvgLengthWithBlankIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR:
                setAvgLengthWithNullIndicator((AvgLengthWithNullIndicator)null);
                return;
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR:
                setAvgLengthWithBlankNullIndicator((AvgLengthWithBlankNullIndicator)null);
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
            case IndicatorsPackage.TEXT_INDICATOR__AVERAGE_LENGTH_INDICATOR:
                return averageLengthIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_INDICATOR:
                return maxLengthIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_INDICATOR:
                return minLengthIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_INDICATOR:
                return minLengthWithBlankIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_NULL_INDICATOR:
                return minLengthWithNullIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__MIN_LENGTH_WITH_BLANK_NULL_INDICATOR:
                return minLengthWithBlankNullIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_INDICATOR:
                return maxLengthWithBlankIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_NULL_INDICATOR:
                return maxLengthWithNullIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__MAX_LENGTH_WITH_BLANK_NULL_INDICATOR:
                return maxLengthWithBlankNullIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_INDICATOR:
                return avgLengthWithBlankIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_NULL_INDICATOR:
                return avgLengthWithNullIndicator != null;
            case IndicatorsPackage.TEXT_INDICATOR__AVG_LENGTH_WITH_BLANK_NULL_INDICATOR:
                return avgLengthWithBlankNullIndicator != null;
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
        addChildToList(this.getAverageLengthIndicator(), children);
        addChildToList(this.getMaxLengthIndicator(), children);
        addChildToList(this.getMinLengthIndicator(), children);

        // ADDED yyi 2010-08-05
        addChildToList(this.getAvgLengthWithBlankIndicator(), children);
        addChildToList(this.getAvgLengthWithNullIndicator(), children);
        addChildToList(this.getAvgLengthWithBlankNullIndicator(), children);
        addChildToList(this.getMaxLengthWithBlankIndicator(), children);
        addChildToList(this.getMaxLengthWithNullIndicator(), children);
        addChildToList(this.getMaxLengthWithBlankNullIndicator(), children);
        addChildToList(this.getMinLengthWithBlankIndicator(), children);
        addChildToList(this.getMinLengthWithNullIndicator(), children);
        addChildToList(this.getMinLengthWithBlankNullIndicator(), children);
        // ~
        return children;
    }
} // TextIndicatorImpl
