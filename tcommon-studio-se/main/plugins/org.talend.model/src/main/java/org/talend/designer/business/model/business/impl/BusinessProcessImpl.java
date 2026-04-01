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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.designer.business.model.business.BusinessItem;
import org.talend.designer.business.model.business.BusinessPackage;
import org.talend.designer.business.model.business.BusinessProcess;
import org.talend.designer.business.model.business.Repository;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Process</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.business.model.business.impl.BusinessProcessImpl#getBusinessItems <em>Business Items</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.impl.BusinessProcessImpl#getLocalRepositoryCopy <em>Local Repository Copy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessProcessImpl extends TalendItemImpl implements BusinessProcess {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public static final String copyright = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getBusinessItems() <em>Business Items</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBusinessItems()
     * @generated
     * @ordered
     */
    protected EList businessItems;

    /**
     * The cached value of the '{@link #getLocalRepositoryCopy() <em>Local Repository Copy</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLocalRepositoryCopy()
     * @generated
     * @ordered
     */
    protected Repository localRepositoryCopy;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BusinessProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return BusinessPackage.Literals.BUSINESS_PROCESS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getBusinessItems() {
        if (businessItems == null) {
            businessItems = new EObjectContainmentWithInverseEList(BusinessItem.class, this, BusinessPackage.BUSINESS_PROCESS__BUSINESS_ITEMS, BusinessPackage.BUSINESS_ITEM__BUSINESS_PROCESS);
        }
        return businessItems;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Repository getLocalRepositoryCopy() {
        return localRepositoryCopy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocalRepositoryCopy(Repository newLocalRepositoryCopy, NotificationChain msgs) {
        Repository oldLocalRepositoryCopy = localRepositoryCopy;
        localRepositoryCopy = newLocalRepositoryCopy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY, oldLocalRepositoryCopy, newLocalRepositoryCopy);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLocalRepositoryCopy(Repository newLocalRepositoryCopy) {
        if (newLocalRepositoryCopy != localRepositoryCopy) {
            NotificationChain msgs = null;
            if (localRepositoryCopy != null)
                msgs = ((InternalEObject)localRepositoryCopy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusinessPackage.BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY, null, msgs);
            if (newLocalRepositoryCopy != null)
                msgs = ((InternalEObject)newLocalRepositoryCopy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusinessPackage.BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY, null, msgs);
            msgs = basicSetLocalRepositoryCopy(newLocalRepositoryCopy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY, newLocalRepositoryCopy, newLocalRepositoryCopy));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_PROCESS__BUSINESS_ITEMS:
                return ((InternalEList)getBusinessItems()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_PROCESS__BUSINESS_ITEMS:
                return ((InternalEList)getBusinessItems()).basicRemove(otherEnd, msgs);
            case BusinessPackage.BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY:
                return basicSetLocalRepositoryCopy(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_PROCESS__BUSINESS_ITEMS:
                return getBusinessItems();
            case BusinessPackage.BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY:
                return getLocalRepositoryCopy();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_PROCESS__BUSINESS_ITEMS:
                getBusinessItems().clear();
                getBusinessItems().addAll((Collection)newValue);
                return;
            case BusinessPackage.BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY:
                setLocalRepositoryCopy((Repository)newValue);
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
            case BusinessPackage.BUSINESS_PROCESS__BUSINESS_ITEMS:
                getBusinessItems().clear();
                return;
            case BusinessPackage.BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY:
                setLocalRepositoryCopy((Repository)null);
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
            case BusinessPackage.BUSINESS_PROCESS__BUSINESS_ITEMS:
                return businessItems != null && !businessItems.isEmpty();
            case BusinessPackage.BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY:
                return localRepositoryCopy != null;
        }
        return super.eIsSet(featureID);
    }

} // BusinessProcessImpl
