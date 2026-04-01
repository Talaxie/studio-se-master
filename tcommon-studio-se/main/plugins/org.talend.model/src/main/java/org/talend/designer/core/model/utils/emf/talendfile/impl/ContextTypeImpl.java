/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

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
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ContextTypeImpl#getContextParameter <em>Context Parameter</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ContextTypeImpl#isConfirmationNeeded <em>Confirmation Needed</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ContextTypeImpl#isHide <em>Hide</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ContextTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextTypeImpl extends EObjectImpl implements ContextType {
    /**
     * The cached value of the '{@link #getContextParameter() <em>Context Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextParameter()
     * @generated
     * @ordered
     */
    protected EList contextParameter;

    /**
     * The default value of the '{@link #isConfirmationNeeded() <em>Confirmation Needed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConfirmationNeeded()
     * @generated
     * @ordered
     */
    protected static final boolean CONFIRMATION_NEEDED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConfirmationNeeded() <em>Confirmation Needed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConfirmationNeeded()
     * @generated
     * @ordered
     */
    protected boolean confirmationNeeded = CONFIRMATION_NEEDED_EDEFAULT;

    /**
     * This is true if the Confirmation Needed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean confirmationNeededESet;

    /**
     * The default value of the '{@link #isHide() <em>Hide</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHide()
     * @generated
     * @ordered
     */
    protected static final boolean HIDE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isHide() <em>Hide</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHide()
     * @generated
     * @ordered
     */
    protected boolean hide = HIDE_EDEFAULT;

    /**
     * This is true if the Hide attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hideESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return TalendFilePackage.Literals.CONTEXT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getContextParameter() {
        if (contextParameter == null) {
            contextParameter = new EObjectContainmentEList(ContextParameterType.class, this, TalendFilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER);
        }
        return contextParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConfirmationNeeded() {
        return confirmationNeeded;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfirmationNeeded(boolean newConfirmationNeeded) {
        boolean oldConfirmationNeeded = confirmationNeeded;
        confirmationNeeded = newConfirmationNeeded;
        boolean oldConfirmationNeededESet = confirmationNeededESet;
        confirmationNeededESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED, oldConfirmationNeeded, confirmationNeeded, !oldConfirmationNeededESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConfirmationNeeded() {
        boolean oldConfirmationNeeded = confirmationNeeded;
        boolean oldConfirmationNeededESet = confirmationNeededESet;
        confirmationNeeded = CONFIRMATION_NEEDED_EDEFAULT;
        confirmationNeededESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED, oldConfirmationNeeded, CONFIRMATION_NEEDED_EDEFAULT, oldConfirmationNeededESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConfirmationNeeded() {
        return confirmationNeededESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isHide() {
        return hide;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHide(boolean newHide) {
        boolean oldHide = hide;
        hide = newHide;
        boolean oldHideESet = hideESet;
        hideESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.CONTEXT_TYPE__HIDE, oldHide, hide, !oldHideESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetHide() {
        boolean oldHide = hide;
        boolean oldHideESet = hideESet;
        hide = HIDE_EDEFAULT;
        hideESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.CONTEXT_TYPE__HIDE, oldHide, HIDE_EDEFAULT, oldHideESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetHide() {
        return hideESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.CONTEXT_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendFilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER:
                return ((InternalEList)getContextParameter()).basicRemove(otherEnd, msgs);
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
            case TalendFilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER:
                return getContextParameter();
            case TalendFilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED:
                return isConfirmationNeeded() ? Boolean.TRUE : Boolean.FALSE;
            case TalendFilePackage.CONTEXT_TYPE__HIDE:
                return isHide() ? Boolean.TRUE : Boolean.FALSE;
            case TalendFilePackage.CONTEXT_TYPE__NAME:
                return getName();
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
            case TalendFilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER:
                getContextParameter().clear();
                getContextParameter().addAll((Collection)newValue);
                return;
            case TalendFilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED:
                setConfirmationNeeded(((Boolean)newValue).booleanValue());
                return;
            case TalendFilePackage.CONTEXT_TYPE__HIDE:
                setHide(((Boolean)newValue).booleanValue());
                return;
            case TalendFilePackage.CONTEXT_TYPE__NAME:
                setName((String)newValue);
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
            case TalendFilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER:
                getContextParameter().clear();
                return;
            case TalendFilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED:
                unsetConfirmationNeeded();
                return;
            case TalendFilePackage.CONTEXT_TYPE__HIDE:
                unsetHide();
                return;
            case TalendFilePackage.CONTEXT_TYPE__NAME:
                setName(NAME_EDEFAULT);
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
            case TalendFilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER:
                return contextParameter != null && !contextParameter.isEmpty();
            case TalendFilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED:
                return isSetConfirmationNeeded();
            case TalendFilePackage.CONTEXT_TYPE__HIDE:
                return isSetHide();
            case TalendFilePackage.CONTEXT_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (confirmationNeeded: ");
        if (confirmationNeededESet) result.append(confirmationNeeded); else result.append("<unset>");
        result.append(", hide: ");
        if (hideESet) result.append(hide); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ContextTypeImpl