/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition.userdefine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.cwm.relational.TdExpression;
import org.talend.dataquality.indicators.definition.impl.IndicatorDefinitionImpl;
import org.talend.dataquality.indicators.definition.userdefine.UDIndicatorDefinition;
import org.talend.dataquality.indicators.definition.userdefine.UserdefinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UD Indicator Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.definition.userdefine.impl.UDIndicatorDefinitionImpl#getViewInvalidRowsExpression <em>View Invalid Rows Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.userdefine.impl.UDIndicatorDefinitionImpl#getViewValidRowsExpression <em>View Valid Rows Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.userdefine.impl.UDIndicatorDefinitionImpl#getViewInvalidValuesExpression <em>View Invalid Values Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.userdefine.impl.UDIndicatorDefinitionImpl#getViewValidValuesExpression <em>View Valid Values Expression</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.userdefine.impl.UDIndicatorDefinitionImpl#getViewRowsExpression <em>View Rows Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UDIndicatorDefinitionImpl extends IndicatorDefinitionImpl implements UDIndicatorDefinition {
    /**
     * The cached value of the '{@link #getViewInvalidRowsExpression() <em>View Invalid Rows Expression</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getViewInvalidRowsExpression()
     * @generated
     * @ordered
     */
    protected EList<TdExpression> viewInvalidRowsExpression;

    /**
     * The cached value of the '{@link #getViewValidRowsExpression() <em>View Valid Rows Expression</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getViewValidRowsExpression()
     * @generated
     * @ordered
     */
    protected EList<TdExpression> viewValidRowsExpression;

    /**
     * The cached value of the '{@link #getViewInvalidValuesExpression() <em>View Invalid Values Expression</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getViewInvalidValuesExpression()
     * @generated
     * @ordered
     */
    protected EList<TdExpression> viewInvalidValuesExpression;

    /**
     * The cached value of the '{@link #getViewValidValuesExpression() <em>View Valid Values Expression</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getViewValidValuesExpression()
     * @generated
     * @ordered
     */
    protected EList<TdExpression> viewValidValuesExpression;

    /**
     * The cached value of the '{@link #getViewRowsExpression() <em>View Rows Expression</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getViewRowsExpression()
     * @generated
     * @ordered
     */
    protected EList<TdExpression> viewRowsExpression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UDIndicatorDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UserdefinePackage.Literals.UD_INDICATOR_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TdExpression> getViewInvalidRowsExpression() {
        if (viewInvalidRowsExpression == null) {
            viewInvalidRowsExpression = new EObjectContainmentEList<TdExpression>(TdExpression.class, this, UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_ROWS_EXPRESSION);
        }
        return viewInvalidRowsExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TdExpression> getViewValidRowsExpression() {
        if (viewValidRowsExpression == null) {
            viewValidRowsExpression = new EObjectContainmentEList<TdExpression>(TdExpression.class, this, UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_ROWS_EXPRESSION);
        }
        return viewValidRowsExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TdExpression> getViewInvalidValuesExpression() {
        if (viewInvalidValuesExpression == null) {
            viewInvalidValuesExpression = new EObjectContainmentEList<TdExpression>(TdExpression.class, this, UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_VALUES_EXPRESSION);
        }
        return viewInvalidValuesExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TdExpression> getViewValidValuesExpression() {
        if (viewValidValuesExpression == null) {
            viewValidValuesExpression = new EObjectContainmentEList<TdExpression>(TdExpression.class, this, UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_VALUES_EXPRESSION);
        }
        return viewValidValuesExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TdExpression> getViewRowsExpression() {
        if (viewRowsExpression == null) {
            viewRowsExpression = new EObjectContainmentEList<TdExpression>(TdExpression.class, this, UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_ROWS_EXPRESSION);
        }
        return viewRowsExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_ROWS_EXPRESSION:
                return ((InternalEList<?>)getViewInvalidRowsExpression()).basicRemove(otherEnd, msgs);
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_ROWS_EXPRESSION:
                return ((InternalEList<?>)getViewValidRowsExpression()).basicRemove(otherEnd, msgs);
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_VALUES_EXPRESSION:
                return ((InternalEList<?>)getViewInvalidValuesExpression()).basicRemove(otherEnd, msgs);
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_VALUES_EXPRESSION:
                return ((InternalEList<?>)getViewValidValuesExpression()).basicRemove(otherEnd, msgs);
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_ROWS_EXPRESSION:
                return ((InternalEList<?>)getViewRowsExpression()).basicRemove(otherEnd, msgs);
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
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_ROWS_EXPRESSION:
                return getViewInvalidRowsExpression();
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_ROWS_EXPRESSION:
                return getViewValidRowsExpression();
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_VALUES_EXPRESSION:
                return getViewInvalidValuesExpression();
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_VALUES_EXPRESSION:
                return getViewValidValuesExpression();
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_ROWS_EXPRESSION:
                return getViewRowsExpression();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_ROWS_EXPRESSION:
                getViewInvalidRowsExpression().clear();
                getViewInvalidRowsExpression().addAll((Collection<? extends TdExpression>)newValue);
                return;
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_ROWS_EXPRESSION:
                getViewValidRowsExpression().clear();
                getViewValidRowsExpression().addAll((Collection<? extends TdExpression>)newValue);
                return;
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_VALUES_EXPRESSION:
                getViewInvalidValuesExpression().clear();
                getViewInvalidValuesExpression().addAll((Collection<? extends TdExpression>)newValue);
                return;
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_VALUES_EXPRESSION:
                getViewValidValuesExpression().clear();
                getViewValidValuesExpression().addAll((Collection<? extends TdExpression>)newValue);
                return;
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_ROWS_EXPRESSION:
                getViewRowsExpression().clear();
                getViewRowsExpression().addAll((Collection<? extends TdExpression>)newValue);
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
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_ROWS_EXPRESSION:
                getViewInvalidRowsExpression().clear();
                return;
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_ROWS_EXPRESSION:
                getViewValidRowsExpression().clear();
                return;
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_VALUES_EXPRESSION:
                getViewInvalidValuesExpression().clear();
                return;
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_VALUES_EXPRESSION:
                getViewValidValuesExpression().clear();
                return;
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_ROWS_EXPRESSION:
                getViewRowsExpression().clear();
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
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_ROWS_EXPRESSION:
                return viewInvalidRowsExpression != null && !viewInvalidRowsExpression.isEmpty();
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_ROWS_EXPRESSION:
                return viewValidRowsExpression != null && !viewValidRowsExpression.isEmpty();
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_INVALID_VALUES_EXPRESSION:
                return viewInvalidValuesExpression != null && !viewInvalidValuesExpression.isEmpty();
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_VALID_VALUES_EXPRESSION:
                return viewValidValuesExpression != null && !viewValidValuesExpression.isEmpty();
            case UserdefinePackage.UD_INDICATOR_DEFINITION__VIEW_ROWS_EXPRESSION:
                return viewRowsExpression != null && !viewRowsExpression.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //UDIndicatorDefinitionImpl
