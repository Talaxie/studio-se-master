/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.dataquality.indicators.DateGrain;
import org.talend.dataquality.indicators.DateParameters;
import org.talend.dataquality.indicators.IndicatorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.impl.DateParametersImpl#getDateAggregationType <em>Date Aggregation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateParametersImpl extends EObjectImpl implements DateParameters {

    /**
     * The default value of the '{@link #getDateAggregationType() <em>Date Aggregation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateAggregationType()
     * @generated NOT code generation does not set the correct default!
     * @ordered
     */
    protected static final DateGrain DATE_AGGREGATION_TYPE_EDEFAULT = DateGrain.YEAR;

    /**
     * The cached value of the '{@link #getDateAggregationType() <em>Date Aggregation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateAggregationType()
     * @generated
     * @ordered
     */
    protected DateGrain dateAggregationType = DATE_AGGREGATION_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DateParametersImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IndicatorsPackage.Literals.DATE_PARAMETERS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateGrain getDateAggregationType() {
        return dateAggregationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDateAggregationType(DateGrain newDateAggregationType) {
        DateGrain oldDateAggregationType = dateAggregationType;
        dateAggregationType = newDateAggregationType == null ? DATE_AGGREGATION_TYPE_EDEFAULT : newDateAggregationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IndicatorsPackage.DATE_PARAMETERS__DATE_AGGREGATION_TYPE, oldDateAggregationType, dateAggregationType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IndicatorsPackage.DATE_PARAMETERS__DATE_AGGREGATION_TYPE:
                return getDateAggregationType();
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
            case IndicatorsPackage.DATE_PARAMETERS__DATE_AGGREGATION_TYPE:
                setDateAggregationType((DateGrain)newValue);
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
            case IndicatorsPackage.DATE_PARAMETERS__DATE_AGGREGATION_TYPE:
                setDateAggregationType(DATE_AGGREGATION_TYPE_EDEFAULT);
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
            case IndicatorsPackage.DATE_PARAMETERS__DATE_AGGREGATION_TYPE:
                return dateAggregationType != DATE_AGGREGATION_TYPE_EDEFAULT;
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
        result.append(" (dateAggregationType: ");
        result.append(dateAggregationType);
        result.append(')');
        return result.toString();
    }

} // DateParametersImpl
