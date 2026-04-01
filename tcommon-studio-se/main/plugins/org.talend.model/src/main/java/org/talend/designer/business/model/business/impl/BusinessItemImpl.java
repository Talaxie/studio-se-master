/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.designer.business.model.business.BusinessAssignment;
import org.talend.designer.business.model.business.BusinessItem;
import org.talend.designer.business.model.business.BusinessPackage;
import org.talend.designer.business.model.business.BusinessProcess;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.business.model.business.impl.BusinessItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.impl.BusinessItemImpl#getBusinessProcess <em>Business Process</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.impl.BusinessItemImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.impl.BusinessItemImpl#getVAlignment <em>VAlignment</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.impl.BusinessItemImpl#getHAlignment <em>HAlignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BusinessItemImpl extends EObjectImpl implements BusinessItem {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public static final String copyright = ""; //$NON-NLS-1$

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
     * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAssignments()
     * @generated
     * @ordered
     */
    protected EList assignments;

    /**
     * The default value of the '{@link #getVAlignment() <em>VAlignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVAlignment()
     * @generated
     * @ordered
     */
    protected static final String VALIGNMENT_EDEFAULT = "VCENTRE";

    /**
     * The cached value of the '{@link #getVAlignment() <em>VAlignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVAlignment()
     * @generated
     * @ordered
     */
    protected String vAlignment = VALIGNMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getHAlignment() <em>HAlignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHAlignment()
     * @generated
     * @ordered
     */
    protected static final String HALIGNMENT_EDEFAULT = "HCENTRE";

    /**
     * The cached value of the '{@link #getHAlignment() <em>HAlignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHAlignment()
     * @generated
     * @ordered
     */
    protected String hAlignment = HALIGNMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BusinessItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return BusinessPackage.Literals.BUSINESS_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BusinessProcess getBusinessProcess() {
        if (eContainerFeatureID() != BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS) return null;
        return (BusinessProcess)eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBusinessProcess(BusinessProcess newBusinessProcess, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBusinessProcess, BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public void setBusinessProcess(BusinessProcess newBusinessProcess) {
        if (newBusinessProcess != eInternalContainer() || (eContainerFeatureID != BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS && newBusinessProcess != null)) {
            if (EcoreUtil.isAncestor(this, newBusinessProcess))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBusinessProcess != null)
                msgs = ((InternalEObject)newBusinessProcess).eInverseAdd(this, BusinessPackage.BUSINESS_PROCESS__BUSINESS_ITEMS, BusinessProcess.class, msgs);
            msgs = basicSetBusinessProcess(newBusinessProcess, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS, newBusinessProcess, newBusinessProcess));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS_ITEM__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getAssignments() {
        if (assignments == null) {
            assignments = new EObjectContainmentWithInverseEList(BusinessAssignment.class, this, BusinessPackage.BUSINESS_ITEM__ASSIGNMENTS, BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM);
        }
        return assignments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVAlignment() {
        return vAlignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVAlignment(String newVAlignment) {
        String oldVAlignment = vAlignment;
        vAlignment = newVAlignment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS_ITEM__VALIGNMENT, oldVAlignment, vAlignment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHAlignment() {
        return hAlignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHAlignment(String newHAlignment) {
        String oldHAlignment = hAlignment;
        hAlignment = newHAlignment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS_ITEM__HALIGNMENT, oldHAlignment, hAlignment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBusinessProcess((BusinessProcess)otherEnd, msgs);
            case BusinessPackage.BUSINESS_ITEM__ASSIGNMENTS:
                return ((InternalEList)getAssignments()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS:
                return basicSetBusinessProcess(null, msgs);
            case BusinessPackage.BUSINESS_ITEM__ASSIGNMENTS:
                return ((InternalEList)getAssignments()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS:
                return eInternalContainer().eInverseRemove(this, BusinessPackage.BUSINESS_PROCESS__BUSINESS_ITEMS, BusinessProcess.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM__NAME:
                return getName();
            case BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS:
                return getBusinessProcess();
            case BusinessPackage.BUSINESS_ITEM__ASSIGNMENTS:
                return getAssignments();
            case BusinessPackage.BUSINESS_ITEM__VALIGNMENT:
                return getVAlignment();
            case BusinessPackage.BUSINESS_ITEM__HALIGNMENT:
                return getHAlignment();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM__NAME:
                setName((String)newValue);
                return;
            case BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS:
                setBusinessProcess((BusinessProcess)newValue);
                return;
            case BusinessPackage.BUSINESS_ITEM__ASSIGNMENTS:
                getAssignments().clear();
                getAssignments().addAll((Collection)newValue);
                return;
            case BusinessPackage.BUSINESS_ITEM__VALIGNMENT:
                setVAlignment((String)newValue);
                return;
            case BusinessPackage.BUSINESS_ITEM__HALIGNMENT:
                setHAlignment((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM__NAME:
                setName(NAME_EDEFAULT);
                return;
            case BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS:
                setBusinessProcess((BusinessProcess)null);
                return;
            case BusinessPackage.BUSINESS_ITEM__ASSIGNMENTS:
                getAssignments().clear();
                return;
            case BusinessPackage.BUSINESS_ITEM__VALIGNMENT:
                setVAlignment(VALIGNMENT_EDEFAULT);
                return;
            case BusinessPackage.BUSINESS_ITEM__HALIGNMENT:
                setHAlignment(HALIGNMENT_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS:
                return getBusinessProcess() != null;
            case BusinessPackage.BUSINESS_ITEM__ASSIGNMENTS:
                return assignments != null && !assignments.isEmpty();
            case BusinessPackage.BUSINESS_ITEM__VALIGNMENT:
                return VALIGNMENT_EDEFAULT == null ? vAlignment != null : !VALIGNMENT_EDEFAULT.equals(vAlignment);
            case BusinessPackage.BUSINESS_ITEM__HALIGNMENT:
                return HALIGNMENT_EDEFAULT == null ? hAlignment != null : !HALIGNMENT_EDEFAULT.equals(hAlignment);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: "); //$NON-NLS-1$
        result.append(name);
        result.append(')');
        return result.toString();
    }

} // BusinessItemImpl
