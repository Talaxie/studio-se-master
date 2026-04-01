/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCIESType;
import org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCYType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PLUGINDEPENDENCIES Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PLUGINDEPENDENCIESTypeImpl#getPLUGINDEPENDENCY <em>PLUGINDEPENDENCY</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PLUGINDEPENDENCIESTypeImpl extends EObjectImpl implements PLUGINDEPENDENCIESType {
    /**
     * The cached value of the '{@link #getPLUGINDEPENDENCY() <em>PLUGINDEPENDENCY</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPLUGINDEPENDENCY()
     * @generated
     * @ordered
     */
    protected EList pLUGINDEPENDENCY;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PLUGINDEPENDENCIESTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.PLUGINDEPENDENCIES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getPLUGINDEPENDENCY() {
        if (pLUGINDEPENDENCY == null) {
            pLUGINDEPENDENCY = new EObjectContainmentEList(PLUGINDEPENDENCYType.class, this, ComponentPackage.PLUGINDEPENDENCIES_TYPE__PLUGINDEPENDENCY);
        }
        return pLUGINDEPENDENCY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.PLUGINDEPENDENCIES_TYPE__PLUGINDEPENDENCY:
                return ((InternalEList)getPLUGINDEPENDENCY()).basicRemove(otherEnd, msgs);
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
            case ComponentPackage.PLUGINDEPENDENCIES_TYPE__PLUGINDEPENDENCY:
                return getPLUGINDEPENDENCY();
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
            case ComponentPackage.PLUGINDEPENDENCIES_TYPE__PLUGINDEPENDENCY:
                getPLUGINDEPENDENCY().clear();
                getPLUGINDEPENDENCY().addAll((Collection)newValue);
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
            case ComponentPackage.PLUGINDEPENDENCIES_TYPE__PLUGINDEPENDENCY:
                getPLUGINDEPENDENCY().clear();
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
            case ComponentPackage.PLUGINDEPENDENCIES_TYPE__PLUGINDEPENDENCY:
                return pLUGINDEPENDENCY != null && !pLUGINDEPENDENCY.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PLUGINDEPENDENCIESTypeImpl
