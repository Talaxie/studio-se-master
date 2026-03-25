/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.mapper.model.emf.mapper.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.designer.mapper.model.emf.mapper.MapperPackage;
import org.talend.designer.mapper.model.emf.mapper.UiProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.impl.UiPropertiesImpl#isShellMaximized <em>Shell Maximized</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiPropertiesImpl extends EObjectImpl implements UiProperties {
    /**
     * The default value of the '{@link #isShellMaximized() <em>Shell Maximized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isShellMaximized()
     * @generated
     * @ordered
     */
    protected static final boolean SHELL_MAXIMIZED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isShellMaximized() <em>Shell Maximized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isShellMaximized()
     * @generated
     * @ordered
     */
    protected boolean shellMaximized = SHELL_MAXIMIZED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UiPropertiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MapperPackage.Literals.UI_PROPERTIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isShellMaximized() {
        return shellMaximized;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setShellMaximized(boolean newShellMaximized) {
        boolean oldShellMaximized = shellMaximized;
        shellMaximized = newShellMaximized;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.UI_PROPERTIES__SHELL_MAXIMIZED, oldShellMaximized, shellMaximized));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MapperPackage.UI_PROPERTIES__SHELL_MAXIMIZED:
                return isShellMaximized();
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
            case MapperPackage.UI_PROPERTIES__SHELL_MAXIMIZED:
                setShellMaximized((Boolean)newValue);
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
            case MapperPackage.UI_PROPERTIES__SHELL_MAXIMIZED:
                setShellMaximized(SHELL_MAXIMIZED_EDEFAULT);
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
            case MapperPackage.UI_PROPERTIES__SHELL_MAXIMIZED:
                return shellMaximized != SHELL_MAXIMIZED_EDEFAULT;
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
        result.append(" (shellMaximized: ");
        result.append(shellMaximized);
        result.append(')');
        return result.toString();
    }

} //UiPropertiesImpl
