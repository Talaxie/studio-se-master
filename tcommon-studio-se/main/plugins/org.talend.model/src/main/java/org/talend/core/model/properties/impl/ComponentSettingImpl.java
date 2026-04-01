/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.core.model.properties.ComponentSetting;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Component Setting</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentSettingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentSettingImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentSettingImpl#getFamily <em>Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentSettingImpl extends EObjectImpl implements ComponentSetting {

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isHidden()
     * @generated
     * @ordered
     */
    protected static final boolean HIDDEN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isHidden()
     * @generated
     * @ordered
     */
    protected boolean hidden = HIDDEN_EDEFAULT;

    /**
     * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getFamily()
     * @generated
     * @ordered
     */
    protected static final String FAMILY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getFamily()
     * @generated
     * @ordered
     */
    protected String family = FAMILY_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ComponentSettingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.COMPONENT_SETTING;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT_SETTING__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setHidden(boolean newHidden) {
        boolean oldHidden = hidden;
        hidden = newHidden;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT_SETTING__HIDDEN, oldHidden, hidden));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getFamily() {
        return family;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFamily(String newFamily) {
        String oldFamily = family;
        family = newFamily;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT_SETTING__FAMILY, oldFamily, family));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.COMPONENT_SETTING__NAME:
                return getName();
            case PropertiesPackage.COMPONENT_SETTING__HIDDEN:
                return isHidden() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.COMPONENT_SETTING__FAMILY:
                return getFamily();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.COMPONENT_SETTING__NAME:
                setName((String)newValue);
                return;
            case PropertiesPackage.COMPONENT_SETTING__HIDDEN:
                setHidden(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.COMPONENT_SETTING__FAMILY:
                setFamily((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PropertiesPackage.COMPONENT_SETTING__NAME:
                setName(NAME_EDEFAULT);
                return;
            case PropertiesPackage.COMPONENT_SETTING__HIDDEN:
                setHidden(HIDDEN_EDEFAULT);
                return;
            case PropertiesPackage.COMPONENT_SETTING__FAMILY:
                setFamily(FAMILY_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PropertiesPackage.COMPONENT_SETTING__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case PropertiesPackage.COMPONENT_SETTING__HIDDEN:
                return hidden != HIDDEN_EDEFAULT;
            case PropertiesPackage.COMPONENT_SETTING__FAMILY:
                return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", hidden: ");
        result.append(hidden);
        result.append(", family: ");
        result.append(family);
        result.append(')');
        return result.toString();
    }

} // ComponentSettingImpl
