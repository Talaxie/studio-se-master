/**
 * <copyright> </copyright>
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.RoutineItem;

import org.talend.designer.core.model.utils.emf.component.IMPORTType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Routine Item</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class RoutineItemImpl extends FileItemImpl implements RoutineItem {

    /**
     * The default value of the '{@link #isBuiltIn() <em>Built In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBuiltIn()
     * @generated
     * @ordered
     */
    protected static final boolean BUILT_IN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBuiltIn() <em>Built In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isBuiltIn()
     * @generated
     * @ordered
     */
    protected boolean builtIn = BUILT_IN_EDEFAULT;

    /**
     * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImports()
     * @generated
     * @ordered
     */
    protected EList imports;

    /**
     * The default value of the '{@link #getPackageType() <em>Package Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageType()
     * @generated
     * @ordered
     */
    protected static final String PACKAGE_TYPE_EDEFAULT = "routines";

    /**
     * The cached value of the '{@link #getPackageType() <em>Package Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageType()
     * @generated
     * @ordered
     */
    protected String packageType = PACKAGE_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected RoutineItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.ROUTINE_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isBuiltIn() {
        return builtIn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBuiltIn(boolean newBuiltIn) {
        boolean oldBuiltIn = builtIn;
        builtIn = newBuiltIn;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ROUTINE_ITEM__BUILT_IN, oldBuiltIn, builtIn));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getImports() {
        if (imports == null) {
            imports = new EObjectContainmentEList(IMPORTType.class, this, PropertiesPackage.ROUTINE_ITEM__IMPORTS);
        }
        return imports;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.ROUTINE_ITEM__IMPORTS:
                return ((InternalEList)getImports()).basicRemove(otherEnd, msgs);
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
            case PropertiesPackage.ROUTINE_ITEM__BUILT_IN:
                return isBuiltIn() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.ROUTINE_ITEM__IMPORTS:
                return getImports();
            case PropertiesPackage.ROUTINE_ITEM__PACKAGE_TYPE:
                return getPackageType();
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
            case PropertiesPackage.ROUTINE_ITEM__BUILT_IN:
                setBuiltIn(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.ROUTINE_ITEM__IMPORTS:
                getImports().clear();
                getImports().addAll((Collection)newValue);
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
            case PropertiesPackage.ROUTINE_ITEM__BUILT_IN:
                setBuiltIn(BUILT_IN_EDEFAULT);
                return;
            case PropertiesPackage.ROUTINE_ITEM__IMPORTS:
                getImports().clear();
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
            case PropertiesPackage.ROUTINE_ITEM__BUILT_IN:
                return builtIn != BUILT_IN_EDEFAULT;
            case PropertiesPackage.ROUTINE_ITEM__IMPORTS:
                return imports != null && !imports.isEmpty();
            case PropertiesPackage.ROUTINE_ITEM__PACKAGE_TYPE:
                return PACKAGE_TYPE_EDEFAULT == null ? packageType != null : !PACKAGE_TYPE_EDEFAULT.equals(packageType);
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
        result.append(" (builtIn: ");
        result.append(builtIn);
        result.append(", packageType: ");
        result.append(packageType);
        result.append(')');
        return result.toString();
    }

} // RoutineItemImpl
