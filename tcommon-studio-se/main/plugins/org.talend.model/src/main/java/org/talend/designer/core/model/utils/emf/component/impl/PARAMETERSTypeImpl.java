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
import org.talend.designer.core.model.utils.emf.component.PARAMETERSType;
import org.talend.designer.core.model.utils.emf.component.PARAMETERType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PARAMETERS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERSTypeImpl#getPARAMETER <em>PARAMETER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PARAMETERSTypeImpl extends EObjectImpl implements PARAMETERSType {
    /**
     * The cached value of the '{@link #getPARAMETER() <em>PARAMETER</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARAMETER()
     * @generated
     * @ordered
     */
    protected EList pARAMETER;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PARAMETERSTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.PARAMETERS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getPARAMETER() {
        if (pARAMETER == null) {
            pARAMETER = new EObjectContainmentEList(PARAMETERType.class, this, ComponentPackage.PARAMETERS_TYPE__PARAMETER);
        }
        return pARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.PARAMETERS_TYPE__PARAMETER:
                return ((InternalEList)getPARAMETER()).basicRemove(otherEnd, msgs);
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
            case ComponentPackage.PARAMETERS_TYPE__PARAMETER:
                return getPARAMETER();
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
            case ComponentPackage.PARAMETERS_TYPE__PARAMETER:
                getPARAMETER().clear();
                getPARAMETER().addAll((Collection)newValue);
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
            case ComponentPackage.PARAMETERS_TYPE__PARAMETER:
                getPARAMETER().clear();
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
            case ComponentPackage.PARAMETERS_TYPE__PARAMETER:
                return pARAMETER != null && !pARAMETER.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PARAMETERSTypeImpl
