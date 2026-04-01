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
import org.talend.dataquality.indicators.BlankCountIndicator;
import org.talend.dataquality.indicators.CountsIndicator;
import org.talend.dataquality.indicators.DefValueCountIndicator;
import org.talend.dataquality.indicators.DistinctCountIndicator;
import org.talend.dataquality.indicators.DuplicateCountIndicator;
import org.talend.dataquality.indicators.Indicator;
import org.talend.dataquality.indicators.IndicatorsPackage;
import org.talend.dataquality.indicators.NullCountIndicator;
import org.talend.dataquality.indicators.RowCountIndicator;
import org.talend.dataquality.indicators.UniqueCountIndicator;

/**
 * O <!-- begin-user-doc --> An implementation of the model object '<em><b>Counts Indicator</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.dataquality.indicators.impl.CountsIndicatorImpl#getBlankCountIndicator <em>Blank Count
 * Indicator</em>}</li>
 * <li>{@link org.talend.dataquality.indicators.impl.CountsIndicatorImpl#getRowCountIndicator <em>Row Count Indicator
 * </em>}</li>
 * <li>{@link org.talend.dataquality.indicators.impl.CountsIndicatorImpl#getNullCountIndicator <em>Null Count Indicator
 * </em>}</li>
 * <li>{@link org.talend.dataquality.indicators.impl.CountsIndicatorImpl#getUniqueCountIndicator <em>Unique Count
 * Indicator</em>}</li>
 * <li>{@link org.talend.dataquality.indicators.impl.CountsIndicatorImpl#getDistinctCountIndicator <em>Distinct Count
 * Indicator</em>}</li>
 * <li>{@link org.talend.dataquality.indicators.impl.CountsIndicatorImpl#getDuplicateCountIndicator <em>Duplicate Count
 * Indicator</em>}</li>
 * <li>{@link org.talend.dataquality.indicators.impl.CountsIndicatorImpl#getDefaultValueIndicator <em>Default Value
 * Indicator</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CountsIndicatorImpl extends CompositeIndicatorImpl implements CountsIndicator {

    /**
     * The cached value of the '{@link #getBlankCountIndicator() <em>Blank Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getBlankCountIndicator()
     * @generated
     * @ordered
     */
    protected BlankCountIndicator blankCountIndicator;

    /**
     * The cached value of the '{@link #getRowCountIndicator() <em>Row Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRowCountIndicator()
     * @generated
     * @ordered
     */
    protected RowCountIndicator rowCountIndicator;

    /**
     * The cached value of the '{@link #getNullCountIndicator() <em>Null Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getNullCountIndicator()
     * @generated
     * @ordered
     */
    protected NullCountIndicator nullCountIndicator;

    /**
     * The cached value of the '{@link #getUniqueCountIndicator() <em>Unique Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getUniqueCountIndicator()
     * @generated
     * @ordered
     */
    protected UniqueCountIndicator uniqueCountIndicator;

    /**
     * The cached value of the '{@link #getDistinctCountIndicator() <em>Distinct Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDistinctCountIndicator()
     * @generated
     * @ordered
     */
    protected DistinctCountIndicator distinctCountIndicator;

    /**
     * The cached value of the '{@link #getDuplicateCountIndicator() <em>Duplicate Count Indicator</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDuplicateCountIndicator()
     * @generated
     * @ordered
     */
    protected DuplicateCountIndicator duplicateCountIndicator;

    /**
     * The cached value of the '{@link #getDefaultValueIndicator() <em>Default Value Indicator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValueIndicator()
     * @generated
     * @ordered
     */
    protected DefValueCountIndicator defaultValueIndicator;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected CountsIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.COUNTS_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BlankCountIndicator getBlankCountIndicator() {
        return blankCountIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBlankCountIndicator(BlankCountIndicator newBlankCountIndicator, NotificationChain msgs) {
        BlankCountIndicator oldBlankCountIndicator = blankCountIndicator;
        blankCountIndicator = newBlankCountIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__BLANK_COUNT_INDICATOR, oldBlankCountIndicator, newBlankCountIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setBlankCountIndicator(BlankCountIndicator newBlankCountIndicator) {
        if (newBlankCountIndicator != blankCountIndicator) {
            NotificationChain msgs = null;
            if (blankCountIndicator != null)
                msgs = ((InternalEObject)blankCountIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__BLANK_COUNT_INDICATOR, null, msgs);
            if (newBlankCountIndicator != null)
                msgs = ((InternalEObject)newBlankCountIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__BLANK_COUNT_INDICATOR, null, msgs);
            msgs = basicSetBlankCountIndicator(newBlankCountIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__BLANK_COUNT_INDICATOR, newBlankCountIndicator, newBlankCountIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RowCountIndicator getRowCountIndicator() {
        return rowCountIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRowCountIndicator(RowCountIndicator newRowCountIndicator, NotificationChain msgs) {
        RowCountIndicator oldRowCountIndicator = rowCountIndicator;
        rowCountIndicator = newRowCountIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__ROW_COUNT_INDICATOR, oldRowCountIndicator, newRowCountIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRowCountIndicator(RowCountIndicator newRowCountIndicator) {
        if (newRowCountIndicator != rowCountIndicator) {
            NotificationChain msgs = null;
            if (rowCountIndicator != null)
                msgs = ((InternalEObject)rowCountIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__ROW_COUNT_INDICATOR, null, msgs);
            if (newRowCountIndicator != null)
                msgs = ((InternalEObject)newRowCountIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__ROW_COUNT_INDICATOR, null, msgs);
            msgs = basicSetRowCountIndicator(newRowCountIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__ROW_COUNT_INDICATOR, newRowCountIndicator, newRowCountIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NullCountIndicator getNullCountIndicator() {
        return nullCountIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNullCountIndicator(NullCountIndicator newNullCountIndicator, NotificationChain msgs) {
        NullCountIndicator oldNullCountIndicator = nullCountIndicator;
        nullCountIndicator = newNullCountIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__NULL_COUNT_INDICATOR, oldNullCountIndicator, newNullCountIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNullCountIndicator(NullCountIndicator newNullCountIndicator) {
        if (newNullCountIndicator != nullCountIndicator) {
            NotificationChain msgs = null;
            if (nullCountIndicator != null)
                msgs = ((InternalEObject)nullCountIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__NULL_COUNT_INDICATOR, null, msgs);
            if (newNullCountIndicator != null)
                msgs = ((InternalEObject)newNullCountIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__NULL_COUNT_INDICATOR, null, msgs);
            msgs = basicSetNullCountIndicator(newNullCountIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__NULL_COUNT_INDICATOR, newNullCountIndicator, newNullCountIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public UniqueCountIndicator getUniqueCountIndicator() {
        return uniqueCountIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUniqueCountIndicator(UniqueCountIndicator newUniqueCountIndicator, NotificationChain msgs) {
        UniqueCountIndicator oldUniqueCountIndicator = uniqueCountIndicator;
        uniqueCountIndicator = newUniqueCountIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__UNIQUE_COUNT_INDICATOR, oldUniqueCountIndicator, newUniqueCountIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setUniqueCountIndicator(UniqueCountIndicator newUniqueCountIndicator) {
        if (newUniqueCountIndicator != uniqueCountIndicator) {
            NotificationChain msgs = null;
            if (uniqueCountIndicator != null)
                msgs = ((InternalEObject)uniqueCountIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__UNIQUE_COUNT_INDICATOR, null, msgs);
            if (newUniqueCountIndicator != null)
                msgs = ((InternalEObject)newUniqueCountIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__UNIQUE_COUNT_INDICATOR, null, msgs);
            msgs = basicSetUniqueCountIndicator(newUniqueCountIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__UNIQUE_COUNT_INDICATOR, newUniqueCountIndicator, newUniqueCountIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DistinctCountIndicator getDistinctCountIndicator() {
        return distinctCountIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDistinctCountIndicator(DistinctCountIndicator newDistinctCountIndicator,
            NotificationChain msgs) {
        DistinctCountIndicator oldDistinctCountIndicator = distinctCountIndicator;
        distinctCountIndicator = newDistinctCountIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__DISTINCT_COUNT_INDICATOR, oldDistinctCountIndicator, newDistinctCountIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDistinctCountIndicator(DistinctCountIndicator newDistinctCountIndicator) {
        if (newDistinctCountIndicator != distinctCountIndicator) {
            NotificationChain msgs = null;
            if (distinctCountIndicator != null)
                msgs = ((InternalEObject)distinctCountIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__DISTINCT_COUNT_INDICATOR, null, msgs);
            if (newDistinctCountIndicator != null)
                msgs = ((InternalEObject)newDistinctCountIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__DISTINCT_COUNT_INDICATOR, null, msgs);
            msgs = basicSetDistinctCountIndicator(newDistinctCountIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__DISTINCT_COUNT_INDICATOR, newDistinctCountIndicator, newDistinctCountIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DuplicateCountIndicator getDuplicateCountIndicator() {
        return duplicateCountIndicator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDuplicateCountIndicator(DuplicateCountIndicator newDuplicateCountIndicator,
            NotificationChain msgs) {
        DuplicateCountIndicator oldDuplicateCountIndicator = duplicateCountIndicator;
        duplicateCountIndicator = newDuplicateCountIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__DUPLICATE_COUNT_INDICATOR, oldDuplicateCountIndicator, newDuplicateCountIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDuplicateCountIndicator(DuplicateCountIndicator newDuplicateCountIndicator) {
        if (newDuplicateCountIndicator != duplicateCountIndicator) {
            NotificationChain msgs = null;
            if (duplicateCountIndicator != null)
                msgs = ((InternalEObject)duplicateCountIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__DUPLICATE_COUNT_INDICATOR, null, msgs);
            if (newDuplicateCountIndicator != null)
                msgs = ((InternalEObject)newDuplicateCountIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__DUPLICATE_COUNT_INDICATOR, null, msgs);
            msgs = basicSetDuplicateCountIndicator(newDuplicateCountIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__DUPLICATE_COUNT_INDICATOR, newDuplicateCountIndicator, newDuplicateCountIndicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefValueCountIndicator getDefaultValueIndicator() {
        return defaultValueIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultValueIndicator(DefValueCountIndicator newDefaultValueIndicator, NotificationChain msgs) {
        DefValueCountIndicator oldDefaultValueIndicator = defaultValueIndicator;
        defaultValueIndicator = newDefaultValueIndicator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__DEFAULT_VALUE_INDICATOR, oldDefaultValueIndicator, newDefaultValueIndicator);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultValueIndicator(DefValueCountIndicator newDefaultValueIndicator) {
        if (newDefaultValueIndicator != defaultValueIndicator) {
            NotificationChain msgs = null;
            if (defaultValueIndicator != null)
                msgs = ((InternalEObject)defaultValueIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__DEFAULT_VALUE_INDICATOR, null, msgs);
            if (newDefaultValueIndicator != null)
                msgs = ((InternalEObject)newDefaultValueIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IndicatorsPackage.COUNTS_INDICATOR__DEFAULT_VALUE_INDICATOR, null, msgs);
            msgs = basicSetDefaultValueIndicator(newDefaultValueIndicator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.COUNTS_INDICATOR__DEFAULT_VALUE_INDICATOR, newDefaultValueIndicator, newDefaultValueIndicator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case IndicatorsPackage.COUNTS_INDICATOR__BLANK_COUNT_INDICATOR:
                return basicSetBlankCountIndicator(null, msgs);
            case IndicatorsPackage.COUNTS_INDICATOR__ROW_COUNT_INDICATOR:
                return basicSetRowCountIndicator(null, msgs);
            case IndicatorsPackage.COUNTS_INDICATOR__NULL_COUNT_INDICATOR:
                return basicSetNullCountIndicator(null, msgs);
            case IndicatorsPackage.COUNTS_INDICATOR__UNIQUE_COUNT_INDICATOR:
                return basicSetUniqueCountIndicator(null, msgs);
            case IndicatorsPackage.COUNTS_INDICATOR__DISTINCT_COUNT_INDICATOR:
                return basicSetDistinctCountIndicator(null, msgs);
            case IndicatorsPackage.COUNTS_INDICATOR__DUPLICATE_COUNT_INDICATOR:
                return basicSetDuplicateCountIndicator(null, msgs);
            case IndicatorsPackage.COUNTS_INDICATOR__DEFAULT_VALUE_INDICATOR:
                return basicSetDefaultValueIndicator(null, msgs);
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
            case IndicatorsPackage.COUNTS_INDICATOR__BLANK_COUNT_INDICATOR:
                return getBlankCountIndicator();
            case IndicatorsPackage.COUNTS_INDICATOR__ROW_COUNT_INDICATOR:
                return getRowCountIndicator();
            case IndicatorsPackage.COUNTS_INDICATOR__NULL_COUNT_INDICATOR:
                return getNullCountIndicator();
            case IndicatorsPackage.COUNTS_INDICATOR__UNIQUE_COUNT_INDICATOR:
                return getUniqueCountIndicator();
            case IndicatorsPackage.COUNTS_INDICATOR__DISTINCT_COUNT_INDICATOR:
                return getDistinctCountIndicator();
            case IndicatorsPackage.COUNTS_INDICATOR__DUPLICATE_COUNT_INDICATOR:
                return getDuplicateCountIndicator();
            case IndicatorsPackage.COUNTS_INDICATOR__DEFAULT_VALUE_INDICATOR:
                return getDefaultValueIndicator();
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
            case IndicatorsPackage.COUNTS_INDICATOR__BLANK_COUNT_INDICATOR:
                setBlankCountIndicator((BlankCountIndicator)newValue);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__ROW_COUNT_INDICATOR:
                setRowCountIndicator((RowCountIndicator)newValue);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__NULL_COUNT_INDICATOR:
                setNullCountIndicator((NullCountIndicator)newValue);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__UNIQUE_COUNT_INDICATOR:
                setUniqueCountIndicator((UniqueCountIndicator)newValue);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__DISTINCT_COUNT_INDICATOR:
                setDistinctCountIndicator((DistinctCountIndicator)newValue);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__DUPLICATE_COUNT_INDICATOR:
                setDuplicateCountIndicator((DuplicateCountIndicator)newValue);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__DEFAULT_VALUE_INDICATOR:
                setDefaultValueIndicator((DefValueCountIndicator)newValue);
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
            case IndicatorsPackage.COUNTS_INDICATOR__BLANK_COUNT_INDICATOR:
                setBlankCountIndicator((BlankCountIndicator)null);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__ROW_COUNT_INDICATOR:
                setRowCountIndicator((RowCountIndicator)null);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__NULL_COUNT_INDICATOR:
                setNullCountIndicator((NullCountIndicator)null);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__UNIQUE_COUNT_INDICATOR:
                setUniqueCountIndicator((UniqueCountIndicator)null);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__DISTINCT_COUNT_INDICATOR:
                setDistinctCountIndicator((DistinctCountIndicator)null);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__DUPLICATE_COUNT_INDICATOR:
                setDuplicateCountIndicator((DuplicateCountIndicator)null);
                return;
            case IndicatorsPackage.COUNTS_INDICATOR__DEFAULT_VALUE_INDICATOR:
                setDefaultValueIndicator((DefValueCountIndicator)null);
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
            case IndicatorsPackage.COUNTS_INDICATOR__BLANK_COUNT_INDICATOR:
                return blankCountIndicator != null;
            case IndicatorsPackage.COUNTS_INDICATOR__ROW_COUNT_INDICATOR:
                return rowCountIndicator != null;
            case IndicatorsPackage.COUNTS_INDICATOR__NULL_COUNT_INDICATOR:
                return nullCountIndicator != null;
            case IndicatorsPackage.COUNTS_INDICATOR__UNIQUE_COUNT_INDICATOR:
                return uniqueCountIndicator != null;
            case IndicatorsPackage.COUNTS_INDICATOR__DISTINCT_COUNT_INDICATOR:
                return distinctCountIndicator != null;
            case IndicatorsPackage.COUNTS_INDICATOR__DUPLICATE_COUNT_INDICATOR:
                return duplicateCountIndicator != null;
            case IndicatorsPackage.COUNTS_INDICATOR__DEFAULT_VALUE_INDICATOR:
                return defaultValueIndicator != null;
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
        addChildToList(this.getRowCountIndicator(), children);
        addChildToList(this.getBlankCountIndicator(), children);
        addChildToList(this.getDistinctCountIndicator(), children);
        addChildToList(this.getDuplicateCountIndicator(), children);
        addChildToList(this.getNullCountIndicator(), children);
        addChildToList(this.getUniqueCountIndicator(), children);
        // MOD klliu 2010-09-09 bug 13411
        addChildToList(this.getDefaultValueIndicator(), children);
        return children;
    }

} // CountsIndicatorImpl
