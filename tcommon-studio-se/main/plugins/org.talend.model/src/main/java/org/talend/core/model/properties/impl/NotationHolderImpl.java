/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.core.model.properties.NotationHolder;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Notation Holder</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.NotationHolderImpl#getNotationString <em>Notation String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotationHolderImpl extends EObjectImpl implements NotationHolder {

    /**
     * The default value of the '{@link #getNotationString() <em>Notation String</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getNotationString()
     * @generated
     * @ordered
     */
    protected static final String NOTATION_STRING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNotationString() <em>Notation String</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getNotationString()
     * @generated
     * @ordered
     */
    protected String notationString = NOTATION_STRING_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected NotationHolderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.NOTATION_HOLDER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getNotationString() {
        return notationString;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNotationString(String newNotationString) {
        String oldNotationString = notationString;
        notationString = newNotationString;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.NOTATION_HOLDER__NOTATION_STRING, oldNotationString, notationString));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.NOTATION_HOLDER__NOTATION_STRING:
                return getNotationString();
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
            case PropertiesPackage.NOTATION_HOLDER__NOTATION_STRING:
                setNotationString((String)newValue);
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
            case PropertiesPackage.NOTATION_HOLDER__NOTATION_STRING:
                setNotationString(NOTATION_STRING_EDEFAULT);
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
            case PropertiesPackage.NOTATION_HOLDER__NOTATION_STRING:
                return NOTATION_STRING_EDEFAULT == null ? notationString != null : !NOTATION_STRING_EDEFAULT.equals(notationString);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (notationString: ");
        result.append(notationString);
        result.append(')');
        return result.toString();
    }

} // NotationHolderImpl
