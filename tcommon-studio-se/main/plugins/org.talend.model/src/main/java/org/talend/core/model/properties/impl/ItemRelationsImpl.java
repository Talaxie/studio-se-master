/**
 * <copyright>
 * </copyright>
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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.talend.core.model.properties.ItemRelation;
import org.talend.core.model.properties.ItemRelations;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Relations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ItemRelationsImpl#getBaseItem <em>Base Item</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ItemRelationsImpl#getRelatedItems <em>Related Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemRelationsImpl extends EObjectImpl implements ItemRelations {
    /**
     * The cached value of the '{@link #getBaseItem() <em>Base Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseItem()
     * @generated
     * @ordered
     */
    protected ItemRelation baseItem;

    /**
     * The cached value of the '{@link #getRelatedItems() <em>Related Items</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelatedItems()
     * @generated
     * @ordered
     */
    protected EList relatedItems;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ItemRelationsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.ITEM_RELATIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemRelation getBaseItem() {
        return baseItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseItem(ItemRelation newBaseItem, NotificationChain msgs) {
        ItemRelation oldBaseItem = baseItem;
        baseItem = newBaseItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM_RELATIONS__BASE_ITEM, oldBaseItem, newBaseItem);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBaseItem(ItemRelation newBaseItem) {
        if (newBaseItem != baseItem) {
            NotificationChain msgs = null;
            if (baseItem != null)
                msgs = ((InternalEObject)baseItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.ITEM_RELATIONS__BASE_ITEM, null, msgs);
            if (newBaseItem != null)
                msgs = ((InternalEObject)newBaseItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.ITEM_RELATIONS__BASE_ITEM, null, msgs);
            msgs = basicSetBaseItem(newBaseItem, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM_RELATIONS__BASE_ITEM, newBaseItem, newBaseItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getRelatedItems() {
        if (relatedItems == null) {
            relatedItems = new EObjectContainmentEList(ItemRelation.class, this, PropertiesPackage.ITEM_RELATIONS__RELATED_ITEMS);
        }
        return relatedItems;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.ITEM_RELATIONS__BASE_ITEM:
                return basicSetBaseItem(null, msgs);
            case PropertiesPackage.ITEM_RELATIONS__RELATED_ITEMS:
                return ((InternalEList)getRelatedItems()).basicRemove(otherEnd, msgs);
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
            case PropertiesPackage.ITEM_RELATIONS__BASE_ITEM:
                return getBaseItem();
            case PropertiesPackage.ITEM_RELATIONS__RELATED_ITEMS:
                return getRelatedItems();
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
            case PropertiesPackage.ITEM_RELATIONS__BASE_ITEM:
                setBaseItem((ItemRelation)newValue);
                return;
            case PropertiesPackage.ITEM_RELATIONS__RELATED_ITEMS:
                getRelatedItems().clear();
                getRelatedItems().addAll((Collection)newValue);
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
            case PropertiesPackage.ITEM_RELATIONS__BASE_ITEM:
                setBaseItem((ItemRelation)null);
                return;
            case PropertiesPackage.ITEM_RELATIONS__RELATED_ITEMS:
                getRelatedItems().clear();
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
            case PropertiesPackage.ITEM_RELATIONS__BASE_ITEM:
                return baseItem != null;
            case PropertiesPackage.ITEM_RELATIONS__RELATED_ITEMS:
                return relatedItems != null && !relatedItems.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ItemRelationsImpl
