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

import org.talend.designer.core.model.utils.emf.component.ARGType;
import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JAVACOMMAND Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.JAVACOMMANDTypeImpl#getARG <em>ARG</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.JAVACOMMANDTypeImpl#getCLASS <em>CLASS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.JAVACOMMANDTypeImpl#getFUNCTION <em>FUNCTION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.JAVACOMMANDTypeImpl#getJAR <em>JAR</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JAVACOMMANDTypeImpl extends EObjectImpl implements JAVACOMMANDType {
    /**
     * The cached value of the '{@link #getARG() <em>ARG</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getARG()
     * @generated
     * @ordered
     */
    protected EList aRG;

    /**
     * The default value of the '{@link #getCLASS() <em>CLASS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCLASS()
     * @generated
     * @ordered
     */
    protected static final String CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCLASS() <em>CLASS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCLASS()
     * @generated
     * @ordered
     */
    protected String cLASS = CLASS_EDEFAULT;

    /**
     * The default value of the '{@link #getFUNCTION() <em>FUNCTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFUNCTION()
     * @generated
     * @ordered
     */
    protected static final String FUNCTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFUNCTION() <em>FUNCTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFUNCTION()
     * @generated
     * @ordered
     */
    protected String fUNCTION = FUNCTION_EDEFAULT;

    /**
     * The default value of the '{@link #getJAR() <em>JAR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJAR()
     * @generated
     * @ordered
     */
    protected static final String JAR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJAR() <em>JAR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJAR()
     * @generated
     * @ordered
     */
    protected String jAR = JAR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JAVACOMMANDTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.JAVACOMMAND_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getARG() {
        if (aRG == null) {
            aRG = new EObjectContainmentEList(ARGType.class, this, ComponentPackage.JAVACOMMAND_TYPE__ARG);
        }
        return aRG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCLASS() {
        return cLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCLASS(String newCLASS) {
        String oldCLASS = cLASS;
        cLASS = newCLASS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.JAVACOMMAND_TYPE__CLASS, oldCLASS, cLASS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFUNCTION() {
        return fUNCTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFUNCTION(String newFUNCTION) {
        String oldFUNCTION = fUNCTION;
        fUNCTION = newFUNCTION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.JAVACOMMAND_TYPE__FUNCTION, oldFUNCTION, fUNCTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJAR() {
        return jAR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJAR(String newJAR) {
        String oldJAR = jAR;
        jAR = newJAR;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.JAVACOMMAND_TYPE__JAR, oldJAR, jAR));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.JAVACOMMAND_TYPE__ARG:
                return ((InternalEList)getARG()).basicRemove(otherEnd, msgs);
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
            case ComponentPackage.JAVACOMMAND_TYPE__ARG:
                return getARG();
            case ComponentPackage.JAVACOMMAND_TYPE__CLASS:
                return getCLASS();
            case ComponentPackage.JAVACOMMAND_TYPE__FUNCTION:
                return getFUNCTION();
            case ComponentPackage.JAVACOMMAND_TYPE__JAR:
                return getJAR();
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
            case ComponentPackage.JAVACOMMAND_TYPE__ARG:
                getARG().clear();
                getARG().addAll((Collection)newValue);
                return;
            case ComponentPackage.JAVACOMMAND_TYPE__CLASS:
                setCLASS((String)newValue);
                return;
            case ComponentPackage.JAVACOMMAND_TYPE__FUNCTION:
                setFUNCTION((String)newValue);
                return;
            case ComponentPackage.JAVACOMMAND_TYPE__JAR:
                setJAR((String)newValue);
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
            case ComponentPackage.JAVACOMMAND_TYPE__ARG:
                getARG().clear();
                return;
            case ComponentPackage.JAVACOMMAND_TYPE__CLASS:
                setCLASS(CLASS_EDEFAULT);
                return;
            case ComponentPackage.JAVACOMMAND_TYPE__FUNCTION:
                setFUNCTION(FUNCTION_EDEFAULT);
                return;
            case ComponentPackage.JAVACOMMAND_TYPE__JAR:
                setJAR(JAR_EDEFAULT);
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
            case ComponentPackage.JAVACOMMAND_TYPE__ARG:
                return aRG != null && !aRG.isEmpty();
            case ComponentPackage.JAVACOMMAND_TYPE__CLASS:
                return CLASS_EDEFAULT == null ? cLASS != null : !CLASS_EDEFAULT.equals(cLASS);
            case ComponentPackage.JAVACOMMAND_TYPE__FUNCTION:
                return FUNCTION_EDEFAULT == null ? fUNCTION != null : !FUNCTION_EDEFAULT.equals(fUNCTION);
            case ComponentPackage.JAVACOMMAND_TYPE__JAR:
                return JAR_EDEFAULT == null ? jAR != null : !JAR_EDEFAULT.equals(jAR);
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
        result.append(" (cLASS: ");
        result.append(cLASS);
        result.append(", fUNCTION: ");
        result.append(fUNCTION);
        result.append(", jAR: ");
        result.append(jAR);
        result.append(')');
        return result.toString();
    }

} //JAVACOMMANDTypeImpl
