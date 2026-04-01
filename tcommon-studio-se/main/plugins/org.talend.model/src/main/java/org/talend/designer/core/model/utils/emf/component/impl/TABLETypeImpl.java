/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.designer.core.model.utils.emf.component.COLUMNType;
import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.TABLEType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TABLE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TABLETypeImpl#getCOLUMN <em>COLUMN</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TABLETypeImpl#getIF <em>IF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TABLETypeImpl#getNOTIF <em>NOTIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TABLETypeImpl#getREADONLYCOLUMNPOSITION <em>READONLYCOLUMNPOSITION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TABLETypeImpl#isREADONLY <em>READONLY</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TABLETypeImpl extends EObjectImpl implements TABLEType {
    /**
     * The cached value of the '{@link #getCOLUMN() <em>COLUMN</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOLUMN()
     * @generated
     * @ordered
     */
    protected EList cOLUMN;

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
     * The default value of the '{@link #getREADONLYCOLUMNPOSITION() <em>READONLYCOLUMNPOSITION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREADONLYCOLUMNPOSITION()
     * @generated
     * @ordered
     */
    protected static final String READONLYCOLUMNPOSITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREADONLYCOLUMNPOSITION() <em>READONLYCOLUMNPOSITION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREADONLYCOLUMNPOSITION()
     * @generated
     * @ordered
     */
    protected String rEADONLYCOLUMNPOSITION = READONLYCOLUMNPOSITION_EDEFAULT;

    /**
     * The default value of the '{@link #isREADONLY() <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isREADONLY()
     * @generated
     * @ordered
     */
    protected static final boolean READONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isREADONLY() <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isREADONLY()
     * @generated
     * @ordered
     */
    protected boolean rEADONLY = READONLY_EDEFAULT;

    /**
     * This is true if the READONLY attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEADONLYESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TABLETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.TABLE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getCOLUMN() {
        if (cOLUMN == null) {
            cOLUMN = new EObjectContainmentEList(COLUMNType.class, this, ComponentPackage.TABLE_TYPE__COLUMN);
        }
        return cOLUMN;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TABLE_TYPE__IF, oldIF, iF));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TABLE_TYPE__NOTIF, oldNOTIF, nOTIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getREADONLYCOLUMNPOSITION() {
        return rEADONLYCOLUMNPOSITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREADONLYCOLUMNPOSITION(String newREADONLYCOLUMNPOSITION) {
        String oldREADONLYCOLUMNPOSITION = rEADONLYCOLUMNPOSITION;
        rEADONLYCOLUMNPOSITION = newREADONLYCOLUMNPOSITION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TABLE_TYPE__READONLYCOLUMNPOSITION, oldREADONLYCOLUMNPOSITION, rEADONLYCOLUMNPOSITION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isREADONLY() {
        return rEADONLY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREADONLY(boolean newREADONLY) {
        boolean oldREADONLY = rEADONLY;
        rEADONLY = newREADONLY;
        boolean oldREADONLYESet = rEADONLYESet;
        rEADONLYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TABLE_TYPE__READONLY, oldREADONLY, rEADONLY, !oldREADONLYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREADONLY() {
        boolean oldREADONLY = rEADONLY;
        boolean oldREADONLYESet = rEADONLYESet;
        rEADONLY = READONLY_EDEFAULT;
        rEADONLYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.TABLE_TYPE__READONLY, oldREADONLY, READONLY_EDEFAULT, oldREADONLYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREADONLY() {
        return rEADONLYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.TABLE_TYPE__COLUMN:
                return ((InternalEList)getCOLUMN()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.TABLE_TYPE__COLUMN:
                return getCOLUMN();
            case ComponentPackage.TABLE_TYPE__IF:
                return getIF();
            case ComponentPackage.TABLE_TYPE__NOTIF:
                return getNOTIF();
            case ComponentPackage.TABLE_TYPE__READONLYCOLUMNPOSITION:
                return getREADONLYCOLUMNPOSITION();
            case ComponentPackage.TABLE_TYPE__READONLY:
                return isREADONLY() ? Boolean.TRUE : Boolean.FALSE;
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
            case ComponentPackage.TABLE_TYPE__COLUMN:
                getCOLUMN().clear();
                getCOLUMN().addAll((Collection)newValue);
                return;
            case ComponentPackage.TABLE_TYPE__IF:
                setIF((String)newValue);
                return;
            case ComponentPackage.TABLE_TYPE__NOTIF:
                setNOTIF((String)newValue);
                return;
            case ComponentPackage.TABLE_TYPE__READONLYCOLUMNPOSITION:
                setREADONLYCOLUMNPOSITION((String)newValue);
                return;
            case ComponentPackage.TABLE_TYPE__READONLY:
                setREADONLY(((Boolean)newValue).booleanValue());
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
            case ComponentPackage.TABLE_TYPE__COLUMN:
                getCOLUMN().clear();
                return;
            case ComponentPackage.TABLE_TYPE__IF:
                setIF(IF_EDEFAULT);
                return;
            case ComponentPackage.TABLE_TYPE__NOTIF:
                setNOTIF(NOTIF_EDEFAULT);
                return;
            case ComponentPackage.TABLE_TYPE__READONLYCOLUMNPOSITION:
                setREADONLYCOLUMNPOSITION(READONLYCOLUMNPOSITION_EDEFAULT);
                return;
            case ComponentPackage.TABLE_TYPE__READONLY:
                unsetREADONLY();
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
            case ComponentPackage.TABLE_TYPE__COLUMN:
                return cOLUMN != null && !cOLUMN.isEmpty();
            case ComponentPackage.TABLE_TYPE__IF:
                return IF_EDEFAULT == null ? iF != null : !IF_EDEFAULT.equals(iF);
            case ComponentPackage.TABLE_TYPE__NOTIF:
                return NOTIF_EDEFAULT == null ? nOTIF != null : !NOTIF_EDEFAULT.equals(nOTIF);
            case ComponentPackage.TABLE_TYPE__READONLYCOLUMNPOSITION:
                return READONLYCOLUMNPOSITION_EDEFAULT == null ? rEADONLYCOLUMNPOSITION != null : !READONLYCOLUMNPOSITION_EDEFAULT.equals(rEADONLYCOLUMNPOSITION);
            case ComponentPackage.TABLE_TYPE__READONLY:
                return isSetREADONLY();
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
        result.append(" (iF: ");
        result.append(iF);
        result.append(", nOTIF: ");
        result.append(nOTIF);
        result.append(", rEADONLYCOLUMNPOSITION: ");
        result.append(rEADONLYCOLUMNPOSITION);
        result.append(", rEADONLY: ");
        if (rEADONLYESet) result.append(rEADONLY); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TABLETypeImpl
