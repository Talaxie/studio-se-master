/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.dataquality.domain.DomainPackage;
import org.talend.dataquality.domain.LengthRestriction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.impl.LengthRestrictionImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.impl.LengthRestrictionImpl#getMinimum <em>Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LengthRestrictionImpl extends EObjectImpl implements LengthRestriction {
    /**
     * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximum()
     * @generated
     * @ordered
     */
    protected static final int MAXIMUM_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximum()
     * @generated
     * @ordered
     */
    protected int maximum = MAXIMUM_EDEFAULT;

    /**
     * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimum()
     * @generated
     * @ordered
     */
    protected static final int MINIMUM_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimum()
     * @generated
     * @ordered
     */
    protected int minimum = MINIMUM_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LengthRestrictionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DomainPackage.Literals.LENGTH_RESTRICTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaximum(int newMaximum) {
        int oldMaximum = maximum;
        maximum = newMaximum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LENGTH_RESTRICTION__MAXIMUM, oldMaximum, maximum));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinimum(int newMinimum) {
        int oldMinimum = minimum;
        minimum = newMinimum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LENGTH_RESTRICTION__MINIMUM, oldMinimum, minimum));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DomainPackage.LENGTH_RESTRICTION__MAXIMUM:
                return getMaximum();
            case DomainPackage.LENGTH_RESTRICTION__MINIMUM:
                return getMinimum();
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
            case DomainPackage.LENGTH_RESTRICTION__MAXIMUM:
                setMaximum((Integer)newValue);
                return;
            case DomainPackage.LENGTH_RESTRICTION__MINIMUM:
                setMinimum((Integer)newValue);
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
            case DomainPackage.LENGTH_RESTRICTION__MAXIMUM:
                setMaximum(MAXIMUM_EDEFAULT);
                return;
            case DomainPackage.LENGTH_RESTRICTION__MINIMUM:
                setMinimum(MINIMUM_EDEFAULT);
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
            case DomainPackage.LENGTH_RESTRICTION__MAXIMUM:
                return maximum != MAXIMUM_EDEFAULT;
            case DomainPackage.LENGTH_RESTRICTION__MINIMUM:
                return minimum != MINIMUM_EDEFAULT;
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
        result.append(" (maximum: ");
        result.append(maximum);
        result.append(", minimum: ");
        result.append(minimum);
        result.append(')');
        return result.toString();
    }

} //LengthRestrictionImpl
