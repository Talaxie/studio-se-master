/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.FORMATType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FORMAT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.FORMATTypeImpl#getCONNECTION <em>CONNECTION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.FORMATTypeImpl#getHINT <em>HINT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.FORMATTypeImpl#getLABEL <em>LABEL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FORMATTypeImpl extends EObjectImpl implements FORMATType {
    /**
     * The default value of the '{@link #getCONNECTION() <em>CONNECTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTION()
     * @generated
     * @ordered
     */
    protected static final String CONNECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONNECTION() <em>CONNECTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTION()
     * @generated
     * @ordered
     */
    protected String cONNECTION = CONNECTION_EDEFAULT;

    /**
     * The default value of the '{@link #getHINT() <em>HINT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHINT()
     * @generated
     * @ordered
     */
    protected static final String HINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHINT() <em>HINT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHINT()
     * @generated
     * @ordered
     */
    protected String hINT = HINT_EDEFAULT;

    /**
     * The default value of the '{@link #getLABEL() <em>LABEL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLABEL()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLABEL() <em>LABEL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLABEL()
     * @generated
     * @ordered
     */
    protected String lABEL = LABEL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FORMATTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.FORMAT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCONNECTION() {
        return cONNECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONNECTION(String newCONNECTION) {
        String oldCONNECTION = cONNECTION;
        cONNECTION = newCONNECTION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.FORMAT_TYPE__CONNECTION, oldCONNECTION, cONNECTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHINT() {
        return hINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHINT(String newHINT) {
        String oldHINT = hINT;
        hINT = newHINT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.FORMAT_TYPE__HINT, oldHINT, hINT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLABEL() {
        return lABEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLABEL(String newLABEL) {
        String oldLABEL = lABEL;
        lABEL = newLABEL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.FORMAT_TYPE__LABEL, oldLABEL, lABEL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.FORMAT_TYPE__CONNECTION:
                return getCONNECTION();
            case ComponentPackage.FORMAT_TYPE__HINT:
                return getHINT();
            case ComponentPackage.FORMAT_TYPE__LABEL:
                return getLABEL();
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
            case ComponentPackage.FORMAT_TYPE__CONNECTION:
                setCONNECTION((String)newValue);
                return;
            case ComponentPackage.FORMAT_TYPE__HINT:
                setHINT((String)newValue);
                return;
            case ComponentPackage.FORMAT_TYPE__LABEL:
                setLABEL((String)newValue);
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
            case ComponentPackage.FORMAT_TYPE__CONNECTION:
                setCONNECTION(CONNECTION_EDEFAULT);
                return;
            case ComponentPackage.FORMAT_TYPE__HINT:
                setHINT(HINT_EDEFAULT);
                return;
            case ComponentPackage.FORMAT_TYPE__LABEL:
                setLABEL(LABEL_EDEFAULT);
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
            case ComponentPackage.FORMAT_TYPE__CONNECTION:
                return CONNECTION_EDEFAULT == null ? cONNECTION != null : !CONNECTION_EDEFAULT.equals(cONNECTION);
            case ComponentPackage.FORMAT_TYPE__HINT:
                return HINT_EDEFAULT == null ? hINT != null : !HINT_EDEFAULT.equals(hINT);
            case ComponentPackage.FORMAT_TYPE__LABEL:
                return LABEL_EDEFAULT == null ? lABEL != null : !LABEL_EDEFAULT.equals(lABEL);
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
        result.append(" (cONNECTION: ");
        result.append(cONNECTION);
        result.append(", hINT: ");
        result.append(hINT);
        result.append(", lABEL: ");
        result.append(lABEL);
        result.append(')');
        return result.toString();
    }

} //FORMATTypeImpl
