/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.ReferenceItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ReferenceItemImpl#getState <em>State</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ReferenceItemImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ReferenceItemImpl#isReloadFromFile <em>Reload From File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceItemImpl extends EObjectImpl implements ReferenceItem {
    /**
     * The cached value of the '{@link #getState() <em>State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getState()
     * @generated
     * @ordered
     */
    protected ItemState state;

    /**
     * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected EObject parent;

    /**
     * The default value of the '{@link #isReloadFromFile() <em>Reload From File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReloadFromFile()
     * @generated
     * @ordered
     */
    protected static final boolean RELOAD_FROM_FILE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isReloadFromFile() <em>Reload From File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReloadFromFile()
     * @generated
     * @ordered
     */
    protected boolean reloadFromFile = RELOAD_FROM_FILE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.REFERENCE_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemState getState() {
        if (state != null && state.eIsProxy()) {
            InternalEObject oldState = (InternalEObject)state;
            state = (ItemState)eResolveProxy(oldState);
            if (state != oldState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.REFERENCE_ITEM__STATE, oldState, state));
            }
        }
        return state;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemState basicGetState() {
        return state;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setState(ItemState newState) {
        ItemState oldState = state;
        state = newState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.REFERENCE_ITEM__STATE, oldState, state));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getParent() {
        if (parent != null && parent.eIsProxy()) {
            InternalEObject oldParent = (InternalEObject)parent;
            parent = eResolveProxy(oldParent);
            if (parent != oldParent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.REFERENCE_ITEM__PARENT, oldParent, parent));
            }
        }
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetParent() {
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(EObject newParent) {
        EObject oldParent = parent;
        parent = newParent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.REFERENCE_ITEM__PARENT, oldParent, parent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isReloadFromFile() {
        return reloadFromFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReloadFromFile(boolean newReloadFromFile) {
        boolean oldReloadFromFile = reloadFromFile;
        reloadFromFile = newReloadFromFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.REFERENCE_ITEM__RELOAD_FROM_FILE, oldReloadFromFile, reloadFromFile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.REFERENCE_ITEM__STATE:
                if (resolve) return getState();
                return basicGetState();
            case PropertiesPackage.REFERENCE_ITEM__PARENT:
                if (resolve) return getParent();
                return basicGetParent();
            case PropertiesPackage.REFERENCE_ITEM__RELOAD_FROM_FILE:
                return isReloadFromFile() ? Boolean.TRUE : Boolean.FALSE;
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
            case PropertiesPackage.REFERENCE_ITEM__STATE:
                setState((ItemState)newValue);
                return;
            case PropertiesPackage.REFERENCE_ITEM__PARENT:
                setParent((EObject)newValue);
                return;
            case PropertiesPackage.REFERENCE_ITEM__RELOAD_FROM_FILE:
                setReloadFromFile(((Boolean)newValue).booleanValue());
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
            case PropertiesPackage.REFERENCE_ITEM__STATE:
                setState((ItemState)null);
                return;
            case PropertiesPackage.REFERENCE_ITEM__PARENT:
                setParent((EObject)null);
                return;
            case PropertiesPackage.REFERENCE_ITEM__RELOAD_FROM_FILE:
                setReloadFromFile(RELOAD_FROM_FILE_EDEFAULT);
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
            case PropertiesPackage.REFERENCE_ITEM__STATE:
                return state != null;
            case PropertiesPackage.REFERENCE_ITEM__PARENT:
                return parent != null;
            case PropertiesPackage.REFERENCE_ITEM__RELOAD_FROM_FILE:
                return reloadFromFile != RELOAD_FROM_FILE_EDEFAULT;
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
        result.append(" (reloadFromFile: ");
        result.append(reloadFromFile);
        result.append(')');
        return result.toString();
    }

} //ReferenceItemImpl
