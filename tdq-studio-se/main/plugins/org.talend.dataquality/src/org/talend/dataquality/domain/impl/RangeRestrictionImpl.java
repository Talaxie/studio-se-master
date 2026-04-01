/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.domain.DomainPackage;
import org.talend.dataquality.domain.LiteralValue;
import org.talend.dataquality.domain.RangeRestriction;
import org.talend.dataquality.expressions.BooleanExpressionNode;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.impl.RangeRestrictionImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.impl.RangeRestrictionImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.impl.RangeRestrictionImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeRestrictionImpl extends ModelElementImpl implements RangeRestriction {
    /**
     * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerValue()
     * @generated
     * @ordered
     */
    protected LiteralValue lowerValue;

    /**
     * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpperValue()
     * @generated
     * @ordered
     */
    protected LiteralValue upperValue;

    /**
     * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressions()
     * @generated
     * @ordered
     */
    protected BooleanExpressionNode expressions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RangeRestrictionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DomainPackage.Literals.RANGE_RESTRICTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralValue getLowerValue() {
        return lowerValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLowerValue(LiteralValue newLowerValue, NotificationChain msgs) {
        LiteralValue oldLowerValue = lowerValue;
        lowerValue = newLowerValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.RANGE_RESTRICTION__LOWER_VALUE, oldLowerValue, newLowerValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLowerValue(LiteralValue newLowerValue) {
        if (newLowerValue != lowerValue) {
            NotificationChain msgs = null;
            if (lowerValue != null)
                msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RANGE_RESTRICTION__LOWER_VALUE, null, msgs);
            if (newLowerValue != null)
                msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RANGE_RESTRICTION__LOWER_VALUE, null, msgs);
            msgs = basicSetLowerValue(newLowerValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RANGE_RESTRICTION__LOWER_VALUE, newLowerValue, newLowerValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralValue getUpperValue() {
        return upperValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUpperValue(LiteralValue newUpperValue, NotificationChain msgs) {
        LiteralValue oldUpperValue = upperValue;
        upperValue = newUpperValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.RANGE_RESTRICTION__UPPER_VALUE, oldUpperValue, newUpperValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpperValue(LiteralValue newUpperValue) {
        if (newUpperValue != upperValue) {
            NotificationChain msgs = null;
            if (upperValue != null)
                msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RANGE_RESTRICTION__UPPER_VALUE, null, msgs);
            if (newUpperValue != null)
                msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RANGE_RESTRICTION__UPPER_VALUE, null, msgs);
            msgs = basicSetUpperValue(newUpperValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RANGE_RESTRICTION__UPPER_VALUE, newUpperValue, newUpperValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BooleanExpressionNode getExpressions() {
        return expressions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpressions(BooleanExpressionNode newExpressions, NotificationChain msgs) {
        BooleanExpressionNode oldExpressions = expressions;
        expressions = newExpressions;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.RANGE_RESTRICTION__EXPRESSIONS, oldExpressions, newExpressions);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpressions(BooleanExpressionNode newExpressions) {
        if (newExpressions != expressions) {
            NotificationChain msgs = null;
            if (expressions != null)
                msgs = ((InternalEObject)expressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RANGE_RESTRICTION__EXPRESSIONS, null, msgs);
            if (newExpressions != null)
                msgs = ((InternalEObject)newExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.RANGE_RESTRICTION__EXPRESSIONS, null, msgs);
            msgs = basicSetExpressions(newExpressions, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RANGE_RESTRICTION__EXPRESSIONS, newExpressions, newExpressions));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DomainPackage.RANGE_RESTRICTION__LOWER_VALUE:
                return basicSetLowerValue(null, msgs);
            case DomainPackage.RANGE_RESTRICTION__UPPER_VALUE:
                return basicSetUpperValue(null, msgs);
            case DomainPackage.RANGE_RESTRICTION__EXPRESSIONS:
                return basicSetExpressions(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DomainPackage.RANGE_RESTRICTION__LOWER_VALUE:
                return getLowerValue();
            case DomainPackage.RANGE_RESTRICTION__UPPER_VALUE:
                return getUpperValue();
            case DomainPackage.RANGE_RESTRICTION__EXPRESSIONS:
                return getExpressions();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DomainPackage.RANGE_RESTRICTION__LOWER_VALUE:
                setLowerValue((LiteralValue)newValue);
                return;
            case DomainPackage.RANGE_RESTRICTION__UPPER_VALUE:
                setUpperValue((LiteralValue)newValue);
                return;
            case DomainPackage.RANGE_RESTRICTION__EXPRESSIONS:
                setExpressions((BooleanExpressionNode)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case DomainPackage.RANGE_RESTRICTION__LOWER_VALUE:
                setLowerValue((LiteralValue)null);
                return;
            case DomainPackage.RANGE_RESTRICTION__UPPER_VALUE:
                setUpperValue((LiteralValue)null);
                return;
            case DomainPackage.RANGE_RESTRICTION__EXPRESSIONS:
                setExpressions((BooleanExpressionNode)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DomainPackage.RANGE_RESTRICTION__LOWER_VALUE:
                return lowerValue != null;
            case DomainPackage.RANGE_RESTRICTION__UPPER_VALUE:
                return upperValue != null;
            case DomainPackage.RANGE_RESTRICTION__EXPRESSIONS:
                return expressions != null;
        }
        return super.eIsSet(featureID);
    }

} //RangeRestrictionImpl
