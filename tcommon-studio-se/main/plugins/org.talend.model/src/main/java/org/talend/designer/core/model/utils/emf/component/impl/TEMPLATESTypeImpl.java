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

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType;
import org.talend.designer.core.model.utils.emf.component.TEMPLATESType;
import org.talend.designer.core.model.utils.emf.component.TEMPLATEType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEMPLATES Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATESTypeImpl#getTEMPLATE <em>TEMPLATE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATESTypeImpl#getTEMPLATEPARAM <em>TEMPLATEPARAM</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATESTypeImpl#getCONNECTOR <em>CONNECTOR</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATESTypeImpl#getINPUT <em>INPUT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATESTypeImpl#isLOOKUP <em>LOOKUP</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.TEMPLATESTypeImpl#getOUTPUT <em>OUTPUT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TEMPLATESTypeImpl extends EObjectImpl implements TEMPLATESType {
    /**
     * The cached value of the '{@link #getTEMPLATE() <em>TEMPLATE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTEMPLATE()
     * @generated
     * @ordered
     */
    protected EList tEMPLATE;

    /**
     * The cached value of the '{@link #getTEMPLATEPARAM() <em>TEMPLATEPARAM</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTEMPLATEPARAM()
     * @generated
     * @ordered
     */
    protected EList tEMPLATEPARAM;

    /**
     * The default value of the '{@link #getCONNECTOR() <em>CONNECTOR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTOR()
     * @generated
     * @ordered
     */
    protected static final String CONNECTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONNECTOR() <em>CONNECTOR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTOR()
     * @generated
     * @ordered
     */
    protected String cONNECTOR = CONNECTOR_EDEFAULT;

    /**
     * The default value of the '{@link #getINPUT() <em>INPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINPUT()
     * @generated
     * @ordered
     */
    protected static final String INPUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getINPUT() <em>INPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINPUT()
     * @generated
     * @ordered
     */
    protected String iNPUT = INPUT_EDEFAULT;

    /**
     * The default value of the '{@link #isLOOKUP() <em>LOOKUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLOOKUP()
     * @generated
     * @ordered
     */
    protected static final boolean LOOKUP_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLOOKUP() <em>LOOKUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLOOKUP()
     * @generated
     * @ordered
     */
    protected boolean lOOKUP = LOOKUP_EDEFAULT;

    /**
     * This is true if the LOOKUP attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lOOKUPESet;

    /**
     * The default value of the '{@link #getOUTPUT() <em>OUTPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOUTPUT()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOUTPUT() <em>OUTPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOUTPUT()
     * @generated
     * @ordered
     */
    protected String oUTPUT = OUTPUT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TEMPLATESTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.TEMPLATES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getTEMPLATE() {
        if (tEMPLATE == null) {
            tEMPLATE = new EObjectContainmentEList(TEMPLATEType.class, this, ComponentPackage.TEMPLATES_TYPE__TEMPLATE);
        }
        return tEMPLATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getTEMPLATEPARAM() {
        if (tEMPLATEPARAM == null) {
            tEMPLATEPARAM = new EObjectContainmentEList(TEMPLATEPARAMType.class, this, ComponentPackage.TEMPLATES_TYPE__TEMPLATEPARAM);
        }
        return tEMPLATEPARAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCONNECTOR() {
        return cONNECTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONNECTOR(String newCONNECTOR) {
        String oldCONNECTOR = cONNECTOR;
        cONNECTOR = newCONNECTOR;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TEMPLATES_TYPE__CONNECTOR, oldCONNECTOR, cONNECTOR));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getINPUT() {
        return iNPUT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setINPUT(String newINPUT) {
        String oldINPUT = iNPUT;
        iNPUT = newINPUT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TEMPLATES_TYPE__INPUT, oldINPUT, iNPUT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLOOKUP() {
        return lOOKUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLOOKUP(boolean newLOOKUP) {
        boolean oldLOOKUP = lOOKUP;
        lOOKUP = newLOOKUP;
        boolean oldLOOKUPESet = lOOKUPESet;
        lOOKUPESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TEMPLATES_TYPE__LOOKUP, oldLOOKUP, lOOKUP, !oldLOOKUPESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLOOKUP() {
        boolean oldLOOKUP = lOOKUP;
        boolean oldLOOKUPESet = lOOKUPESet;
        lOOKUP = LOOKUP_EDEFAULT;
        lOOKUPESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.TEMPLATES_TYPE__LOOKUP, oldLOOKUP, LOOKUP_EDEFAULT, oldLOOKUPESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLOOKUP() {
        return lOOKUPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOUTPUT() {
        return oUTPUT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOUTPUT(String newOUTPUT) {
        String oldOUTPUT = oUTPUT;
        oUTPUT = newOUTPUT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.TEMPLATES_TYPE__OUTPUT, oldOUTPUT, oUTPUT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.TEMPLATES_TYPE__TEMPLATE:
                return ((InternalEList)getTEMPLATE()).basicRemove(otherEnd, msgs);
            case ComponentPackage.TEMPLATES_TYPE__TEMPLATEPARAM:
                return ((InternalEList)getTEMPLATEPARAM()).basicRemove(otherEnd, msgs);
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
            case ComponentPackage.TEMPLATES_TYPE__TEMPLATE:
                return getTEMPLATE();
            case ComponentPackage.TEMPLATES_TYPE__TEMPLATEPARAM:
                return getTEMPLATEPARAM();
            case ComponentPackage.TEMPLATES_TYPE__CONNECTOR:
                return getCONNECTOR();
            case ComponentPackage.TEMPLATES_TYPE__INPUT:
                return getINPUT();
            case ComponentPackage.TEMPLATES_TYPE__LOOKUP:
                return isLOOKUP() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.TEMPLATES_TYPE__OUTPUT:
                return getOUTPUT();
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
            case ComponentPackage.TEMPLATES_TYPE__TEMPLATE:
                getTEMPLATE().clear();
                getTEMPLATE().addAll((Collection)newValue);
                return;
            case ComponentPackage.TEMPLATES_TYPE__TEMPLATEPARAM:
                getTEMPLATEPARAM().clear();
                getTEMPLATEPARAM().addAll((Collection)newValue);
                return;
            case ComponentPackage.TEMPLATES_TYPE__CONNECTOR:
                setCONNECTOR((String)newValue);
                return;
            case ComponentPackage.TEMPLATES_TYPE__INPUT:
                setINPUT((String)newValue);
                return;
            case ComponentPackage.TEMPLATES_TYPE__LOOKUP:
                setLOOKUP(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.TEMPLATES_TYPE__OUTPUT:
                setOUTPUT((String)newValue);
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
            case ComponentPackage.TEMPLATES_TYPE__TEMPLATE:
                getTEMPLATE().clear();
                return;
            case ComponentPackage.TEMPLATES_TYPE__TEMPLATEPARAM:
                getTEMPLATEPARAM().clear();
                return;
            case ComponentPackage.TEMPLATES_TYPE__CONNECTOR:
                setCONNECTOR(CONNECTOR_EDEFAULT);
                return;
            case ComponentPackage.TEMPLATES_TYPE__INPUT:
                setINPUT(INPUT_EDEFAULT);
                return;
            case ComponentPackage.TEMPLATES_TYPE__LOOKUP:
                unsetLOOKUP();
                return;
            case ComponentPackage.TEMPLATES_TYPE__OUTPUT:
                setOUTPUT(OUTPUT_EDEFAULT);
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
            case ComponentPackage.TEMPLATES_TYPE__TEMPLATE:
                return tEMPLATE != null && !tEMPLATE.isEmpty();
            case ComponentPackage.TEMPLATES_TYPE__TEMPLATEPARAM:
                return tEMPLATEPARAM != null && !tEMPLATEPARAM.isEmpty();
            case ComponentPackage.TEMPLATES_TYPE__CONNECTOR:
                return CONNECTOR_EDEFAULT == null ? cONNECTOR != null : !CONNECTOR_EDEFAULT.equals(cONNECTOR);
            case ComponentPackage.TEMPLATES_TYPE__INPUT:
                return INPUT_EDEFAULT == null ? iNPUT != null : !INPUT_EDEFAULT.equals(iNPUT);
            case ComponentPackage.TEMPLATES_TYPE__LOOKUP:
                return isSetLOOKUP();
            case ComponentPackage.TEMPLATES_TYPE__OUTPUT:
                return OUTPUT_EDEFAULT == null ? oUTPUT != null : !OUTPUT_EDEFAULT.equals(oUTPUT);
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
        result.append(" (cONNECTOR: ");
        result.append(cONNECTOR);
        result.append(", iNPUT: ");
        result.append(iNPUT);
        result.append(", lOOKUP: ");
        if (lOOKUPESet) result.append(lOOKUP); else result.append("<unset>");
        result.append(", oUTPUT: ");
        result.append(oUTPUT);
        result.append(')');
        return result.toString();
    }

} //TEMPLATESTypeImpl
