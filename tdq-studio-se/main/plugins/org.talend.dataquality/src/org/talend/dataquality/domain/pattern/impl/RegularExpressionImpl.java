/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.pattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.cwm.relational.TdExpression;
import org.talend.dataquality.domain.pattern.PatternPackage;
import org.talend.dataquality.domain.pattern.RegularExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.pattern.impl.RegularExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.pattern.impl.RegularExpressionImpl#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularExpressionImpl extends PatternComponentImpl implements RegularExpression {
    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected TdExpression expression;

    /**
     * The default value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionType()
     * @generated
     * @ordered
     */
    protected static final String EXPRESSION_TYPE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getExpressionType() <em>Expression Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionType()
     * @generated
     * @ordered
     */
    protected String expressionType = EXPRESSION_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegularExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.REGULAR_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TdExpression getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(TdExpression newExpression, NotificationChain msgs) {
        TdExpression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.REGULAR_EXPRESSION__EXPRESSION, oldExpression, newExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(TdExpression newExpression) {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.REGULAR_EXPRESSION__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.REGULAR_EXPRESSION__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.REGULAR_EXPRESSION__EXPRESSION, newExpression, newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExpressionType() {
        return expressionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpressionType(String newExpressionType) {
        String oldExpressionType = expressionType;
        expressionType = newExpressionType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.REGULAR_EXPRESSION__EXPRESSION_TYPE, oldExpressionType, expressionType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.REGULAR_EXPRESSION__EXPRESSION:
                return basicSetExpression(null, msgs);
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
            case PatternPackage.REGULAR_EXPRESSION__EXPRESSION:
                return getExpression();
            case PatternPackage.REGULAR_EXPRESSION__EXPRESSION_TYPE:
                return getExpressionType();
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
            case PatternPackage.REGULAR_EXPRESSION__EXPRESSION:
                setExpression((TdExpression)newValue);
                return;
            case PatternPackage.REGULAR_EXPRESSION__EXPRESSION_TYPE:
                setExpressionType((String)newValue);
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
            case PatternPackage.REGULAR_EXPRESSION__EXPRESSION:
                setExpression((TdExpression)null);
                return;
            case PatternPackage.REGULAR_EXPRESSION__EXPRESSION_TYPE:
                setExpressionType(EXPRESSION_TYPE_EDEFAULT);
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
            case PatternPackage.REGULAR_EXPRESSION__EXPRESSION:
                return expression != null;
            case PatternPackage.REGULAR_EXPRESSION__EXPRESSION_TYPE:
                return EXPRESSION_TYPE_EDEFAULT == null ? expressionType != null : !EXPRESSION_TYPE_EDEFAULT.equals(expressionType);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (expressionType: ");
        result.append(expressionType);
        result.append(')');
        return result.toString();
    }

} //RegularExpressionImpl
