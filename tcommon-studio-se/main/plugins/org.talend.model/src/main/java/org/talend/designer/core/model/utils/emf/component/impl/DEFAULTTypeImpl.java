/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.DEFAULTType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFAULT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DEFAULTTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DEFAULTTypeImpl#getIF <em>IF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.DEFAULTTypeImpl#getNOTIF <em>NOTIF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFAULTTypeImpl extends EObjectImpl implements DEFAULTType {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getIF() <em>IF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIF()
     * @generated
     * @ordered
     */
    protected static final String IF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIF() <em>IF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIF()
     * @generated
     * @ordered
     */
    protected String iF = IF_EDEFAULT;

    /**
     * The default value of the '{@link #getNOTIF() <em>NOTIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNOTIF()
     * @generated
     * @ordered
     */
    protected static final String NOTIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNOTIF() <em>NOTIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNOTIF()
     * @generated
     * @ordered
     */
    protected String nOTIF = NOTIF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DEFAULTTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.DEFAULT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DEFAULT_TYPE__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIF() {
        return iF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIF(String newIF) {
        String oldIF = iF;
        iF = newIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DEFAULT_TYPE__IF, oldIF, iF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNOTIF() {
        return nOTIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNOTIF(String newNOTIF) {
        String oldNOTIF = nOTIF;
        nOTIF = newNOTIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DEFAULT_TYPE__NOTIF, oldNOTIF, nOTIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.DEFAULT_TYPE__VALUE:
                return getValue();
            case ComponentPackage.DEFAULT_TYPE__IF:
                return getIF();
            case ComponentPackage.DEFAULT_TYPE__NOTIF:
                return getNOTIF();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ComponentPackage.DEFAULT_TYPE__VALUE:
                setValue((String)newValue);
                return;
            case ComponentPackage.DEFAULT_TYPE__IF:
                setIF((String)newValue);
                return;
            case ComponentPackage.DEFAULT_TYPE__NOTIF:
                setNOTIF((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case ComponentPackage.DEFAULT_TYPE__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case ComponentPackage.DEFAULT_TYPE__IF:
                setIF(IF_EDEFAULT);
                return;
            case ComponentPackage.DEFAULT_TYPE__NOTIF:
                setNOTIF(NOTIF_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ComponentPackage.DEFAULT_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case ComponentPackage.DEFAULT_TYPE__IF:
                return IF_EDEFAULT == null ? iF != null : !IF_EDEFAULT.equals(iF);
            case ComponentPackage.DEFAULT_TYPE__NOTIF:
                return NOTIF_EDEFAULT == null ? nOTIF != null : !NOTIF_EDEFAULT.equals(nOTIF);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (value: ");
        result.append(value);
        result.append(", iF: ");
        result.append(iF);
        result.append(", nOTIF: ");
        result.append(nOTIF);
        result.append(')');
        return result.toString();
    }

} //DEFAULTTypeImpl
