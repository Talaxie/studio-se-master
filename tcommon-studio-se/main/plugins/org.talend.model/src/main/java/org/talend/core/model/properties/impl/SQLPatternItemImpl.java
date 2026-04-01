/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.SQLPatternItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Pattern Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.SQLPatternItemImpl#isSystem <em>System</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SQLPatternItemImpl#getEltName <em>Elt Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLPatternItemImpl extends FileItemImpl implements SQLPatternItem {
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
     * The default value of the '{@link #getEltName() <em>Elt Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEltName()
     * @generated
     * @ordered
     */
    protected static final String ELT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEltName() <em>Elt Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEltName()
     * @generated
     * @ordered
     */
    protected String eltName = ELT_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SQLPatternItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.SQL_PATTERN_ITEM;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SQL_PATTERN_ITEM__SYSTEM, oldSystem, system));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEltName() {
        return eltName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEltName(String newEltName) {
        String oldEltName = eltName;
        eltName = newEltName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SQL_PATTERN_ITEM__ELT_NAME, oldEltName, eltName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.SQL_PATTERN_ITEM__SYSTEM:
                return isSystem() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.SQL_PATTERN_ITEM__ELT_NAME:
                return getEltName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.SQL_PATTERN_ITEM__SYSTEM:
                setSystem(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.SQL_PATTERN_ITEM__ELT_NAME:
                setEltName((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PropertiesPackage.SQL_PATTERN_ITEM__SYSTEM:
                setSystem(SYSTEM_EDEFAULT);
                return;
            case PropertiesPackage.SQL_PATTERN_ITEM__ELT_NAME:
                setEltName(ELT_NAME_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PropertiesPackage.SQL_PATTERN_ITEM__SYSTEM:
                return system != SYSTEM_EDEFAULT;
            case PropertiesPackage.SQL_PATTERN_ITEM__ELT_NAME:
                return ELT_NAME_EDEFAULT == null ? eltName != null : !ELT_NAME_EDEFAULT.equals(eltName);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (system: ");
        result.append(system);
        result.append(", eltName: ");
        result.append(eltName);
        result.append(')');
        return result.toString();
    }

} //SQLPatternItemImpl
