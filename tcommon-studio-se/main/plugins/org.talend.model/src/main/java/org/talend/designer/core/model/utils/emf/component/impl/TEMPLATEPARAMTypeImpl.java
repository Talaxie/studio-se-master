/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEMPLATEPARAM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATEPARAMTypeImpl#getSOURCE <em>SOURCE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATEPARAMTypeImpl#getTARGET <em>TARGET</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATEPARAMTypeImpl#getVALUE <em>VALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TEMPLATEPARAMTypeImpl extends EObjectImpl implements TEMPLATEPARAMType {
    /**
     * The default value of the '{@link #getSOURCE() <em>SOURCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSOURCE()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSOURCE() <em>SOURCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSOURCE()
     * @generated
     * @ordered
     */
    protected String sOURCE = SOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getTARGET() <em>TARGET</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTARGET()
     * @generated
     * @ordered
     */
    protected static final String TARGET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTARGET() <em>TARGET</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTARGET()
     * @generated
     * @ordered
     */
    protected String tARGET = TARGET_EDEFAULT;

    /**
     * The default value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected String vALUE = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TEMPLATEPARAMTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.TEMPLATEPARAM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSOURCE() {
        return sOURCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSOURCE(String newSOURCE) {
        String oldSOURCE = sOURCE;
        sOURCE = newSOURCE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TEMPLATEPARAM_TYPE__SOURCE, oldSOURCE, sOURCE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTARGET() {
        return tARGET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTARGET(String newTARGET) {
        String oldTARGET = tARGET;
        tARGET = newTARGET;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TEMPLATEPARAM_TYPE__TARGET, oldTARGET, tARGET));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVALUE() {
        return vALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVALUE(String newVALUE) {
        String oldVALUE = vALUE;
        vALUE = newVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TEMPLATEPARAM_TYPE__VALUE, oldVALUE, vALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.TEMPLATEPARAM_TYPE__SOURCE:
                return getSOURCE();
            case ComponentPackage.TEMPLATEPARAM_TYPE__TARGET:
                return getTARGET();
            case ComponentPackage.TEMPLATEPARAM_TYPE__VALUE:
                return getVALUE();
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
            case ComponentPackage.TEMPLATEPARAM_TYPE__SOURCE:
                setSOURCE((String)newValue);
                return;
            case ComponentPackage.TEMPLATEPARAM_TYPE__TARGET:
                setTARGET((String)newValue);
                return;
            case ComponentPackage.TEMPLATEPARAM_TYPE__VALUE:
                setVALUE((String)newValue);
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
            case ComponentPackage.TEMPLATEPARAM_TYPE__SOURCE:
                setSOURCE(SOURCE_EDEFAULT);
                return;
            case ComponentPackage.TEMPLATEPARAM_TYPE__TARGET:
                setTARGET(TARGET_EDEFAULT);
                return;
            case ComponentPackage.TEMPLATEPARAM_TYPE__VALUE:
                setVALUE(VALUE_EDEFAULT);
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
            case ComponentPackage.TEMPLATEPARAM_TYPE__SOURCE:
                return SOURCE_EDEFAULT == null ? sOURCE != null : !SOURCE_EDEFAULT.equals(sOURCE);
            case ComponentPackage.TEMPLATEPARAM_TYPE__TARGET:
                return TARGET_EDEFAULT == null ? tARGET != null : !TARGET_EDEFAULT.equals(tARGET);
            case ComponentPackage.TEMPLATEPARAM_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? vALUE != null : !VALUE_EDEFAULT.equals(vALUE);
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
        result.append(" (sOURCE: ");
        result.append(sOURCE);
        result.append(", tARGET: ");
        result.append(tARGET);
        result.append(", vALUE: ");
        result.append(vALUE);
        result.append(')');
        return result.toString();
    }

} //TEMPLATEPARAMTypeImpl
