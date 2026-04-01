/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.INSTALLType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INSTALL Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.INSTALLTypeImpl#getCOMMAND <em>COMMAND</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.INSTALLTypeImpl#getOS <em>OS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class INSTALLTypeImpl extends EObjectImpl implements INSTALLType {
    /**
     * The default value of the '{@link #getCOMMAND() <em>COMMAND</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMMAND()
     * @generated
     * @ordered
     */
    protected static final String COMMAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCOMMAND() <em>COMMAND</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMMAND()
     * @generated
     * @ordered
     */
    protected String cOMMAND = COMMAND_EDEFAULT;

    /**
     * The default value of the '{@link #getOS() <em>OS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOS()
     * @generated
     * @ordered
     */
    protected static final String OS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOS() <em>OS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOS()
     * @generated
     * @ordered
     */
    protected String oS = OS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected INSTALLTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.INSTALL_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCOMMAND() {
        return cOMMAND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOMMAND(String newCOMMAND) {
        String oldCOMMAND = cOMMAND;
        cOMMAND = newCOMMAND;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.INSTALL_TYPE__COMMAND, oldCOMMAND, cOMMAND));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOS() {
        return oS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOS(String newOS) {
        String oldOS = oS;
        oS = newOS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.INSTALL_TYPE__OS, oldOS, oS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.INSTALL_TYPE__COMMAND:
                return getCOMMAND();
            case ComponentPackage.INSTALL_TYPE__OS:
                return getOS();
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
            case ComponentPackage.INSTALL_TYPE__COMMAND:
                setCOMMAND((String)newValue);
                return;
            case ComponentPackage.INSTALL_TYPE__OS:
                setOS((String)newValue);
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
            case ComponentPackage.INSTALL_TYPE__COMMAND:
                setCOMMAND(COMMAND_EDEFAULT);
                return;
            case ComponentPackage.INSTALL_TYPE__OS:
                setOS(OS_EDEFAULT);
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
            case ComponentPackage.INSTALL_TYPE__COMMAND:
                return COMMAND_EDEFAULT == null ? cOMMAND != null : !COMMAND_EDEFAULT.equals(cOMMAND);
            case ComponentPackage.INSTALL_TYPE__OS:
                return OS_EDEFAULT == null ? oS != null : !OS_EDEFAULT.equals(oS);
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
        result.append(" (cOMMAND: ");
        result.append(cOMMAND);
        result.append(", oS: ");
        result.append(oS);
        result.append(')');
        return result.toString();
    }

} //INSTALLTypeImpl
