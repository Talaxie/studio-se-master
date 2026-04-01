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
import org.talend.dataquality.domain.LiteralValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.impl.LiteralValueImpl#getEncodeValueMeaning <em>Encode Value Meaning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralValueImpl extends EObjectImpl implements LiteralValue {
    /**
     * The default value of the '{@link #getEncodeValueMeaning() <em>Encode Value Meaning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEncodeValueMeaning()
     * @generated
     * @ordered
     */
    protected static final String ENCODE_VALUE_MEANING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEncodeValueMeaning() <em>Encode Value Meaning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEncodeValueMeaning()
     * @generated
     * @ordered
     */
    protected String encodeValueMeaning = ENCODE_VALUE_MEANING_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LiteralValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DomainPackage.Literals.LITERAL_VALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEncodeValueMeaning() {
        return encodeValueMeaning;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEncodeValueMeaning(String newEncodeValueMeaning) {
        String oldEncodeValueMeaning = encodeValueMeaning;
        encodeValueMeaning = newEncodeValueMeaning;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LITERAL_VALUE__ENCODE_VALUE_MEANING, oldEncodeValueMeaning, encodeValueMeaning));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DomainPackage.LITERAL_VALUE__ENCODE_VALUE_MEANING:
                return getEncodeValueMeaning();
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
            case DomainPackage.LITERAL_VALUE__ENCODE_VALUE_MEANING:
                setEncodeValueMeaning((String)newValue);
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
            case DomainPackage.LITERAL_VALUE__ENCODE_VALUE_MEANING:
                setEncodeValueMeaning(ENCODE_VALUE_MEANING_EDEFAULT);
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
            case DomainPackage.LITERAL_VALUE__ENCODE_VALUE_MEANING:
                return ENCODE_VALUE_MEANING_EDEFAULT == null ? encodeValueMeaning != null : !ENCODE_VALUE_MEANING_EDEFAULT.equals(encodeValueMeaning);
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
        result.append(" (encodeValueMeaning: ");
        result.append(encodeValueMeaning);
        result.append(')');
        return result.toString();
    }

} //LiteralValueImpl
