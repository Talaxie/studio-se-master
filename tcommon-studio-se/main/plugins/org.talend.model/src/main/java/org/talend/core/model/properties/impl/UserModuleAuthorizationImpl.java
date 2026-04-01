/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.User;
import org.talend.core.model.properties.UserModuleAuthorization;
import org.talend.core.model.properties.UserModuleAuthorizationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Module Authorization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.UserModuleAuthorizationImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.UserModuleAuthorizationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserModuleAuthorizationImpl extends EObjectImpl implements UserModuleAuthorization {
    /**
     * The cached value of the '{@link #getUser() <em>User</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUser()
     * @generated
     * @ordered
     */
    protected User user;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final UserModuleAuthorizationType TYPE_EDEFAULT = UserModuleAuthorizationType.JOB_CONDUCTOR_LITERAL;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected UserModuleAuthorizationType type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UserModuleAuthorizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.USER_MODULE_AUTHORIZATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public User getUser() {
        if (user != null && user.eIsProxy()) {
            InternalEObject oldUser = (InternalEObject)user;
            user = (User)eResolveProxy(oldUser);
            if (user != oldUser) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.USER_MODULE_AUTHORIZATION__USER, oldUser, user));
            }
        }
        return user;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public User basicGetUser() {
        return user;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
        User oldUser = user;
        user = newUser;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.USER_MODULE_AUTHORIZATION__USER, oldUser, newUser);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUser(User newUser) {
        if (newUser != user) {
            NotificationChain msgs = null;
            if (user != null)
                msgs = ((InternalEObject)user).eInverseRemove(this, PropertiesPackage.USER__MODULE_AUTHORIZATION, User.class, msgs);
            if (newUser != null)
                msgs = ((InternalEObject)newUser).eInverseAdd(this, PropertiesPackage.USER__MODULE_AUTHORIZATION, User.class, msgs);
            msgs = basicSetUser(newUser, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.USER_MODULE_AUTHORIZATION__USER, newUser, newUser));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserModuleAuthorizationType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(UserModuleAuthorizationType newType) {
        UserModuleAuthorizationType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.USER_MODULE_AUTHORIZATION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.USER_MODULE_AUTHORIZATION__USER:
                if (user != null)
                    msgs = ((InternalEObject)user).eInverseRemove(this, PropertiesPackage.USER__MODULE_AUTHORIZATION, User.class, msgs);
                return basicSetUser((User)otherEnd, msgs);
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
            case PropertiesPackage.USER_MODULE_AUTHORIZATION__USER:
                return basicSetUser(null, msgs);
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
            case PropertiesPackage.USER_MODULE_AUTHORIZATION__USER:
                if (resolve) return getUser();
                return basicGetUser();
            case PropertiesPackage.USER_MODULE_AUTHORIZATION__TYPE:
                return getType();
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
            case PropertiesPackage.USER_MODULE_AUTHORIZATION__USER:
                setUser((User)newValue);
                return;
            case PropertiesPackage.USER_MODULE_AUTHORIZATION__TYPE:
                setType((UserModuleAuthorizationType)newValue);
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
            case PropertiesPackage.USER_MODULE_AUTHORIZATION__USER:
                setUser((User)null);
                return;
            case PropertiesPackage.USER_MODULE_AUTHORIZATION__TYPE:
                setType(TYPE_EDEFAULT);
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
            case PropertiesPackage.USER_MODULE_AUTHORIZATION__USER:
                return user != null;
            case PropertiesPackage.USER_MODULE_AUTHORIZATION__TYPE:
                return type != TYPE_EDEFAULT;
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
        result.append(" (type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //UserModuleAuthorizationImpl
