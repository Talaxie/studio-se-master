/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.designer.core.model.utils.emf.talendfile.ItemInforType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Infor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ItemInforTypeImpl#getIdOrName <em>Id Or Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ItemInforTypeImpl#isSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemInforTypeImpl extends EObjectImpl implements ItemInforType {
    /**
     * The default value of the '{@link #getIdOrName() <em>Id Or Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdOrName()
     * @generated
     * @ordered
     */
    protected static final String ID_OR_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdOrName() <em>Id Or Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdOrName()
     * @generated
     * @ordered
     */
    protected String idOrName = ID_OR_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isSystem() <em>System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSystem()
     * @generated
     * @ordered
     */
    protected static final boolean SYSTEM_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSystem() <em>System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSystem()
     * @generated
     * @ordered
     */
    protected boolean system = SYSTEM_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ItemInforTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return TalendFilePackage.Literals.ITEM_INFOR_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIdOrName() {
        return idOrName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdOrName(String newIdOrName) {
        String oldIdOrName = idOrName;
        idOrName = newIdOrName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.ITEM_INFOR_TYPE__ID_OR_NAME, oldIdOrName, idOrName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSystem() {
        return system;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSystem(boolean newSystem) {
        boolean oldSystem = system;
        system = newSystem;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.ITEM_INFOR_TYPE__SYSTEM, oldSystem, system));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TalendFilePackage.ITEM_INFOR_TYPE__ID_OR_NAME:
                return getIdOrName();
            case TalendFilePackage.ITEM_INFOR_TYPE__SYSTEM:
                return isSystem() ? Boolean.TRUE : Boolean.FALSE;
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
            case TalendFilePackage.ITEM_INFOR_TYPE__ID_OR_NAME:
                setIdOrName((String)newValue);
                return;
            case TalendFilePackage.ITEM_INFOR_TYPE__SYSTEM:
                setSystem(((Boolean)newValue).booleanValue());
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
            case TalendFilePackage.ITEM_INFOR_TYPE__ID_OR_NAME:
                setIdOrName(ID_OR_NAME_EDEFAULT);
                return;
            case TalendFilePackage.ITEM_INFOR_TYPE__SYSTEM:
                setSystem(SYSTEM_EDEFAULT);
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
            case TalendFilePackage.ITEM_INFOR_TYPE__ID_OR_NAME:
                return ID_OR_NAME_EDEFAULT == null ? idOrName != null : !ID_OR_NAME_EDEFAULT.equals(idOrName);
            case TalendFilePackage.ITEM_INFOR_TYPE__SYSTEM:
                return system != SYSTEM_EDEFAULT;
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
        result.append(" (idOrName: ");
        result.append(idOrName);
        result.append(", system: ");
        result.append(system);
        result.append(')');
        return result.toString();
    }

} //ItemInforTypeImpl
