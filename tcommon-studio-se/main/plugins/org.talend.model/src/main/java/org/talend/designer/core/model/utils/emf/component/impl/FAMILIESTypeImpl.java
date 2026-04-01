/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.FAMILIESType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FAMILIES Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.FAMILIESTypeImpl#getFAMILY <em>FAMILY</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FAMILIESTypeImpl extends EObjectImpl implements FAMILIESType {
    /**
     * The cached value of the '{@link #getFAMILY() <em>FAMILY</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFAMILY()
     * @generated
     * @ordered
     */
    protected EList fAMILY;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FAMILIESTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.FAMILIES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getFAMILY() {
        if (fAMILY == null) {
            fAMILY = new EDataTypeEList(String.class, this, ComponentPackage.FAMILIES_TYPE__FAMILY);
        }
        return fAMILY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.FAMILIES_TYPE__FAMILY:
                return getFAMILY();
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
            case ComponentPackage.FAMILIES_TYPE__FAMILY:
                getFAMILY().clear();
                getFAMILY().addAll((Collection)newValue);
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
            case ComponentPackage.FAMILIES_TYPE__FAMILY:
                getFAMILY().clear();
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
            case ComponentPackage.FAMILIES_TYPE__FAMILY:
                return fAMILY != null && !fAMILY.isEmpty();
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
        result.append(" (fAMILY: ");
        result.append(fAMILY);
        result.append(')');
        return result.toString();
    }

} //FAMILIESTypeImpl
