/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.RoleRight;
import org.talend.core.model.properties.UserRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.UserRoleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.UserRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.UserRoleImpl#getLocalizedLabel <em>Localized Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.UserRoleImpl#isFixed <em>Fixed</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.UserRoleImpl#getRolesRights <em>Roles Rights</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserRoleImpl extends EObjectImpl implements UserRole {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalizedLabel() <em>Localized Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalizedLabel()
     * @generated
     * @ordered
     */
    protected static final String LOCALIZED_LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalizedLabel() <em>Localized Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalizedLabel()
     * @generated
     * @ordered
     */
    protected String localizedLabel = LOCALIZED_LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFixed()
     * @generated
     * @ordered
     */
    protected static final boolean FIXED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFixed()
     * @generated
     * @ordered
     */
    protected boolean fixed = FIXED_EDEFAULT;

    /**
     * The cached value of the '{@link #getRolesRights() <em>Roles Rights</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRolesRights()
     * @generated
     * @ordered
     */
    protected EList rolesRights;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UserRoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.USER_ROLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.USER_ROLE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.USER_ROLE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocalizedLabel() {
        return localizedLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalizedLabel(String newLocalizedLabel) {
        String oldLocalizedLabel = localizedLabel;
        localizedLabel = newLocalizedLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.USER_ROLE__LOCALIZED_LABEL, oldLocalizedLabel, localizedLabel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFixed() {
        return fixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFixed(boolean newFixed) {
        boolean oldFixed = fixed;
        fixed = newFixed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.USER_ROLE__FIXED, oldFixed, fixed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getRolesRights() {
        if (rolesRights == null) {
            rolesRights = new EObjectWithInverseResolvingEList(RoleRight.class, this, PropertiesPackage.USER_ROLE__ROLES_RIGHTS, PropertiesPackage.ROLE_RIGHT__ROLE);
        }
        return rolesRights;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.USER_ROLE__ROLES_RIGHTS:
                return ((InternalEList)getRolesRights()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.USER_ROLE__ROLES_RIGHTS:
                return ((InternalEList)getRolesRights()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.USER_ROLE__ID:
                return new Integer(getId());
            case PropertiesPackage.USER_ROLE__NAME:
                return getName();
            case PropertiesPackage.USER_ROLE__LOCALIZED_LABEL:
                return getLocalizedLabel();
            case PropertiesPackage.USER_ROLE__FIXED:
                return isFixed() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.USER_ROLE__ROLES_RIGHTS:
                return getRolesRights();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.USER_ROLE__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.USER_ROLE__NAME:
                setName((String)newValue);
                return;
            case PropertiesPackage.USER_ROLE__LOCALIZED_LABEL:
                setLocalizedLabel((String)newValue);
                return;
            case PropertiesPackage.USER_ROLE__FIXED:
                setFixed(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.USER_ROLE__ROLES_RIGHTS:
                getRolesRights().clear();
                getRolesRights().addAll((Collection)newValue);
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
            case PropertiesPackage.USER_ROLE__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.USER_ROLE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case PropertiesPackage.USER_ROLE__LOCALIZED_LABEL:
                setLocalizedLabel(LOCALIZED_LABEL_EDEFAULT);
                return;
            case PropertiesPackage.USER_ROLE__FIXED:
                setFixed(FIXED_EDEFAULT);
                return;
            case PropertiesPackage.USER_ROLE__ROLES_RIGHTS:
                getRolesRights().clear();
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
            case PropertiesPackage.USER_ROLE__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.USER_ROLE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case PropertiesPackage.USER_ROLE__LOCALIZED_LABEL:
                return LOCALIZED_LABEL_EDEFAULT == null ? localizedLabel != null : !LOCALIZED_LABEL_EDEFAULT.equals(localizedLabel);
            case PropertiesPackage.USER_ROLE__FIXED:
                return fixed != FIXED_EDEFAULT;
            case PropertiesPackage.USER_ROLE__ROLES_RIGHTS:
                return rolesRights != null && !rolesRights.isEmpty();
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
        result.append(" (id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(", localizedLabel: ");
        result.append(localizedLabel);
        result.append(", fixed: ");
        result.append(fixed);
        result.append(')');
        return result.toString();
    }

} //UserRoleImpl