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

import org.talend.core.model.properties.BusinessProcessItem;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.SVGBusinessProcessItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVG Business Process Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.SVGBusinessProcessItemImpl#getBusinessProcessItem <em>Business Process Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SVGBusinessProcessItemImpl extends FileItemImpl implements SVGBusinessProcessItem {
    /**
     * The cached value of the '{@link #getBusinessProcessItem() <em>Business Process Item</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusinessProcessItem()
     * @generated
     * @ordered
     */
    protected BusinessProcessItem businessProcessItem;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SVGBusinessProcessItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.SVG_BUSINESS_PROCESS_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessProcessItem getBusinessProcessItem() {
        if (businessProcessItem != null && businessProcessItem.eIsProxy()) {
            InternalEObject oldBusinessProcessItem = (InternalEObject)businessProcessItem;
            businessProcessItem = (BusinessProcessItem)eResolveProxy(oldBusinessProcessItem);
            if (businessProcessItem != oldBusinessProcessItem) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM, oldBusinessProcessItem, businessProcessItem));
            }
        }
        return businessProcessItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessProcessItem basicGetBusinessProcessItem() {
        return businessProcessItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBusinessProcessItem(BusinessProcessItem newBusinessProcessItem, NotificationChain msgs) {
        BusinessProcessItem oldBusinessProcessItem = businessProcessItem;
        businessProcessItem = newBusinessProcessItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM, oldBusinessProcessItem, newBusinessProcessItem);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBusinessProcessItem(BusinessProcessItem newBusinessProcessItem) {
        if (newBusinessProcessItem != businessProcessItem) {
            NotificationChain msgs = null;
            if (businessProcessItem != null)
                msgs = ((InternalEObject)businessProcessItem).eInverseRemove(this, PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM, BusinessProcessItem.class, msgs);
            if (newBusinessProcessItem != null)
                msgs = ((InternalEObject)newBusinessProcessItem).eInverseAdd(this, PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM, BusinessProcessItem.class, msgs);
            msgs = basicSetBusinessProcessItem(newBusinessProcessItem, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM, newBusinessProcessItem, newBusinessProcessItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM:
                if (businessProcessItem != null)
                    msgs = ((InternalEObject)businessProcessItem).eInverseRemove(this, PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM, BusinessProcessItem.class, msgs);
                return basicSetBusinessProcessItem((BusinessProcessItem)otherEnd, msgs);
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
            case PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM:
                return basicSetBusinessProcessItem(null, msgs);
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
            case PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM:
                if (resolve) return getBusinessProcessItem();
                return basicGetBusinessProcessItem();
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
            case PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM:
                setBusinessProcessItem((BusinessProcessItem)newValue);
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
            case PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM:
                setBusinessProcessItem((BusinessProcessItem)null);
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
            case PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM:
                return businessProcessItem != null;
        }
        return super.eIsSet(featureID);
    }

} //SVGBusinessProcessItemImpl
