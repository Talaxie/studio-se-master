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
import org.talend.designer.core.model.utils.emf.component.ITEMSType;
import org.talend.designer.core.model.utils.emf.component.ITEMType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ITEMS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMSTypeImpl#getITEM <em>ITEM</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMSTypeImpl#isBASEDONINPUTSCHEMAS <em>BASEDONINPUTSCHEMAS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMSTypeImpl#isBASEDONSCHEMA <em>BASEDONSCHEMA</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMSTypeImpl#isBASEDONSUBJOBSTARTS <em>BASEDONSUBJOBSTARTS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMSTypeImpl#isCOLUMNSBASEDONSCHEMA <em>COLUMNSBASEDONSCHEMA</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMSTypeImpl#getDEFAULT <em>DEFAULT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ITEMSTypeImpl extends EObjectImpl implements ITEMSType {
    /**
     * The cached value of the '{@link #getITEM() <em>ITEM</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getITEM()
     * @generated
     * @ordered
     */
    protected EList iTEM;

    /**
     * The default value of the '{@link #isBASEDONINPUTSCHEMAS() <em>BASEDONINPUTSCHEMAS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBASEDONINPUTSCHEMAS()
     * @generated
     * @ordered
     */
    protected static final boolean BASEDONINPUTSCHEMAS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBASEDONINPUTSCHEMAS() <em>BASEDONINPUTSCHEMAS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBASEDONINPUTSCHEMAS()
     * @generated
     * @ordered
     */
    protected boolean bASEDONINPUTSCHEMAS = BASEDONINPUTSCHEMAS_EDEFAULT;

    /**
     * This is true if the BASEDONINPUTSCHEMAS attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bASEDONINPUTSCHEMASESet;

    /**
     * The default value of the '{@link #isBASEDONSCHEMA() <em>BASEDONSCHEMA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBASEDONSCHEMA()
     * @generated
     * @ordered
     */
    protected static final boolean BASEDONSCHEMA_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBASEDONSCHEMA() <em>BASEDONSCHEMA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBASEDONSCHEMA()
     * @generated
     * @ordered
     */
    protected boolean bASEDONSCHEMA = BASEDONSCHEMA_EDEFAULT;

    /**
     * This is true if the BASEDONSCHEMA attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bASEDONSCHEMAESet;

    /**
     * The default value of the '{@link #isBASEDONSUBJOBSTARTS() <em>BASEDONSUBJOBSTARTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBASEDONSUBJOBSTARTS()
     * @generated
     * @ordered
     */
    protected static final boolean BASEDONSUBJOBSTARTS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBASEDONSUBJOBSTARTS() <em>BASEDONSUBJOBSTARTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBASEDONSUBJOBSTARTS()
     * @generated
     * @ordered
     */
    protected boolean bASEDONSUBJOBSTARTS = BASEDONSUBJOBSTARTS_EDEFAULT;

    /**
     * This is true if the BASEDONSUBJOBSTARTS attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bASEDONSUBJOBSTARTSESet;

    /**
     * The default value of the '{@link #isCOLUMNSBASEDONSCHEMA() <em>COLUMNSBASEDONSCHEMA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCOLUMNSBASEDONSCHEMA()
     * @generated
     * @ordered
     */
    protected static final boolean COLUMNSBASEDONSCHEMA_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCOLUMNSBASEDONSCHEMA() <em>COLUMNSBASEDONSCHEMA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCOLUMNSBASEDONSCHEMA()
     * @generated
     * @ordered
     */
    protected boolean cOLUMNSBASEDONSCHEMA = COLUMNSBASEDONSCHEMA_EDEFAULT;

    /**
     * This is true if the COLUMNSBASEDONSCHEMA attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cOLUMNSBASEDONSCHEMAESet;

    /**
     * The default value of the '{@link #getDEFAULT() <em>DEFAULT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULT()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDEFAULT() <em>DEFAULT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULT()
     * @generated
     * @ordered
     */
    protected String dEFAULT = DEFAULT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ITEMSTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.ITEMS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getITEM() {
        if (iTEM == null) {
            iTEM = new EObjectContainmentEList(ITEMType.class, this, ComponentPackage.ITEMS_TYPE__ITEM);
        }
        return iTEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBASEDONINPUTSCHEMAS() {
        return bASEDONINPUTSCHEMAS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBASEDONINPUTSCHEMAS(boolean newBASEDONINPUTSCHEMAS) {
        boolean oldBASEDONINPUTSCHEMAS = bASEDONINPUTSCHEMAS;
        bASEDONINPUTSCHEMAS = newBASEDONINPUTSCHEMAS;
        boolean oldBASEDONINPUTSCHEMASESet = bASEDONINPUTSCHEMASESet;
        bASEDONINPUTSCHEMASESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEMS_TYPE__BASEDONINPUTSCHEMAS, oldBASEDONINPUTSCHEMAS, bASEDONINPUTSCHEMAS, !oldBASEDONINPUTSCHEMASESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBASEDONINPUTSCHEMAS() {
        boolean oldBASEDONINPUTSCHEMAS = bASEDONINPUTSCHEMAS;
        boolean oldBASEDONINPUTSCHEMASESet = bASEDONINPUTSCHEMASESet;
        bASEDONINPUTSCHEMAS = BASEDONINPUTSCHEMAS_EDEFAULT;
        bASEDONINPUTSCHEMASESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.ITEMS_TYPE__BASEDONINPUTSCHEMAS, oldBASEDONINPUTSCHEMAS, BASEDONINPUTSCHEMAS_EDEFAULT, oldBASEDONINPUTSCHEMASESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBASEDONINPUTSCHEMAS() {
        return bASEDONINPUTSCHEMASESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBASEDONSCHEMA() {
        return bASEDONSCHEMA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBASEDONSCHEMA(boolean newBASEDONSCHEMA) {
        boolean oldBASEDONSCHEMA = bASEDONSCHEMA;
        bASEDONSCHEMA = newBASEDONSCHEMA;
        boolean oldBASEDONSCHEMAESet = bASEDONSCHEMAESet;
        bASEDONSCHEMAESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEMS_TYPE__BASEDONSCHEMA, oldBASEDONSCHEMA, bASEDONSCHEMA, !oldBASEDONSCHEMAESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBASEDONSCHEMA() {
        boolean oldBASEDONSCHEMA = bASEDONSCHEMA;
        boolean oldBASEDONSCHEMAESet = bASEDONSCHEMAESet;
        bASEDONSCHEMA = BASEDONSCHEMA_EDEFAULT;
        bASEDONSCHEMAESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.ITEMS_TYPE__BASEDONSCHEMA, oldBASEDONSCHEMA, BASEDONSCHEMA_EDEFAULT, oldBASEDONSCHEMAESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBASEDONSCHEMA() {
        return bASEDONSCHEMAESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBASEDONSUBJOBSTARTS() {
        return bASEDONSUBJOBSTARTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBASEDONSUBJOBSTARTS(boolean newBASEDONSUBJOBSTARTS) {
        boolean oldBASEDONSUBJOBSTARTS = bASEDONSUBJOBSTARTS;
        bASEDONSUBJOBSTARTS = newBASEDONSUBJOBSTARTS;
        boolean oldBASEDONSUBJOBSTARTSESet = bASEDONSUBJOBSTARTSESet;
        bASEDONSUBJOBSTARTSESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEMS_TYPE__BASEDONSUBJOBSTARTS, oldBASEDONSUBJOBSTARTS, bASEDONSUBJOBSTARTS, !oldBASEDONSUBJOBSTARTSESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBASEDONSUBJOBSTARTS() {
        boolean oldBASEDONSUBJOBSTARTS = bASEDONSUBJOBSTARTS;
        boolean oldBASEDONSUBJOBSTARTSESet = bASEDONSUBJOBSTARTSESet;
        bASEDONSUBJOBSTARTS = BASEDONSUBJOBSTARTS_EDEFAULT;
        bASEDONSUBJOBSTARTSESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.ITEMS_TYPE__BASEDONSUBJOBSTARTS, oldBASEDONSUBJOBSTARTS, BASEDONSUBJOBSTARTS_EDEFAULT, oldBASEDONSUBJOBSTARTSESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBASEDONSUBJOBSTARTS() {
        return bASEDONSUBJOBSTARTSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCOLUMNSBASEDONSCHEMA() {
        return cOLUMNSBASEDONSCHEMA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOLUMNSBASEDONSCHEMA(boolean newCOLUMNSBASEDONSCHEMA) {
        boolean oldCOLUMNSBASEDONSCHEMA = cOLUMNSBASEDONSCHEMA;
        cOLUMNSBASEDONSCHEMA = newCOLUMNSBASEDONSCHEMA;
        boolean oldCOLUMNSBASEDONSCHEMAESet = cOLUMNSBASEDONSCHEMAESet;
        cOLUMNSBASEDONSCHEMAESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEMS_TYPE__COLUMNSBASEDONSCHEMA, oldCOLUMNSBASEDONSCHEMA, cOLUMNSBASEDONSCHEMA, !oldCOLUMNSBASEDONSCHEMAESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCOLUMNSBASEDONSCHEMA() {
        boolean oldCOLUMNSBASEDONSCHEMA = cOLUMNSBASEDONSCHEMA;
        boolean oldCOLUMNSBASEDONSCHEMAESet = cOLUMNSBASEDONSCHEMAESet;
        cOLUMNSBASEDONSCHEMA = COLUMNSBASEDONSCHEMA_EDEFAULT;
        cOLUMNSBASEDONSCHEMAESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.ITEMS_TYPE__COLUMNSBASEDONSCHEMA, oldCOLUMNSBASEDONSCHEMA, COLUMNSBASEDONSCHEMA_EDEFAULT, oldCOLUMNSBASEDONSCHEMAESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCOLUMNSBASEDONSCHEMA() {
        return cOLUMNSBASEDONSCHEMAESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDEFAULT() {
        return dEFAULT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDEFAULT(String newDEFAULT) {
        String oldDEFAULT = dEFAULT;
        dEFAULT = newDEFAULT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEMS_TYPE__DEFAULT, oldDEFAULT, dEFAULT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.ITEMS_TYPE__ITEM:
                return ((InternalEList)getITEM()).basicRemove(otherEnd, msgs);
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
            case ComponentPackage.ITEMS_TYPE__ITEM:
                return getITEM();
            case ComponentPackage.ITEMS_TYPE__BASEDONINPUTSCHEMAS:
                return isBASEDONINPUTSCHEMAS() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.ITEMS_TYPE__BASEDONSCHEMA:
                return isBASEDONSCHEMA() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.ITEMS_TYPE__BASEDONSUBJOBSTARTS:
                return isBASEDONSUBJOBSTARTS() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.ITEMS_TYPE__COLUMNSBASEDONSCHEMA:
                return isCOLUMNSBASEDONSCHEMA() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.ITEMS_TYPE__DEFAULT:
                return getDEFAULT();
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
            case ComponentPackage.ITEMS_TYPE__ITEM:
                getITEM().clear();
                getITEM().addAll((Collection)newValue);
                return;
            case ComponentPackage.ITEMS_TYPE__BASEDONINPUTSCHEMAS:
                setBASEDONINPUTSCHEMAS(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.ITEMS_TYPE__BASEDONSCHEMA:
                setBASEDONSCHEMA(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.ITEMS_TYPE__BASEDONSUBJOBSTARTS:
                setBASEDONSUBJOBSTARTS(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.ITEMS_TYPE__COLUMNSBASEDONSCHEMA:
                setCOLUMNSBASEDONSCHEMA(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.ITEMS_TYPE__DEFAULT:
                setDEFAULT((String)newValue);
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
            case ComponentPackage.ITEMS_TYPE__ITEM:
                getITEM().clear();
                return;
            case ComponentPackage.ITEMS_TYPE__BASEDONINPUTSCHEMAS:
                unsetBASEDONINPUTSCHEMAS();
                return;
            case ComponentPackage.ITEMS_TYPE__BASEDONSCHEMA:
                unsetBASEDONSCHEMA();
                return;
            case ComponentPackage.ITEMS_TYPE__BASEDONSUBJOBSTARTS:
                unsetBASEDONSUBJOBSTARTS();
                return;
            case ComponentPackage.ITEMS_TYPE__COLUMNSBASEDONSCHEMA:
                unsetCOLUMNSBASEDONSCHEMA();
                return;
            case ComponentPackage.ITEMS_TYPE__DEFAULT:
                setDEFAULT(DEFAULT_EDEFAULT);
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
            case ComponentPackage.ITEMS_TYPE__ITEM:
                return iTEM != null && !iTEM.isEmpty();
            case ComponentPackage.ITEMS_TYPE__BASEDONINPUTSCHEMAS:
                return isSetBASEDONINPUTSCHEMAS();
            case ComponentPackage.ITEMS_TYPE__BASEDONSCHEMA:
                return isSetBASEDONSCHEMA();
            case ComponentPackage.ITEMS_TYPE__BASEDONSUBJOBSTARTS:
                return isSetBASEDONSUBJOBSTARTS();
            case ComponentPackage.ITEMS_TYPE__COLUMNSBASEDONSCHEMA:
                return isSetCOLUMNSBASEDONSCHEMA();
            case ComponentPackage.ITEMS_TYPE__DEFAULT:
                return DEFAULT_EDEFAULT == null ? dEFAULT != null : !DEFAULT_EDEFAULT.equals(dEFAULT);
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
        result.append(" (bASEDONINPUTSCHEMAS: ");
        if (bASEDONINPUTSCHEMASESet) result.append(bASEDONINPUTSCHEMAS); else result.append("<unset>");
        result.append(", bASEDONSCHEMA: ");
        if (bASEDONSCHEMAESet) result.append(bASEDONSCHEMA); else result.append("<unset>");
        result.append(", bASEDONSUBJOBSTARTS: ");
        if (bASEDONSUBJOBSTARTSESet) result.append(bASEDONSUBJOBSTARTS); else result.append("<unset>");
        result.append(", cOLUMNSBASEDONSCHEMA: ");
        if (cOLUMNSBASEDONSCHEMAESet) result.append(cOLUMNSBASEDONSCHEMA); else result.append("<unset>");
        result.append(", dEFAULT: ");
        result.append(dEFAULT);
        result.append(')');
        return result.toString();
    }

} //ITEMSTypeImpl
