/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.component_cache.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.core.model.component_cache.ComponentCachePackage;
import org.talend.core.model.component_cache.ComponentInfo;
import org.talend.core.model.component_cache.ComponentsCache;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Components Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.component_cache.impl.ComponentsCacheImpl#getComponentEntryMap <em>Component Entry Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentsCacheImpl extends EObjectImpl implements ComponentsCache {
    /**
     * The cached value of the '{@link #getComponentEntryMap() <em>Component Entry Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponentEntryMap()
     * @generated
     * @ordered
     */
    protected EMap<String, EList<ComponentInfo>> componentEntryMap;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentsCacheImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentCachePackage.Literals.COMPONENTS_CACHE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, EList<ComponentInfo>> getComponentEntryMap() {
        if (componentEntryMap == null) {
            componentEntryMap = new EcoreEMap<String,EList<ComponentInfo>>(ComponentCachePackage.Literals.COMPONENT_ENTRY_MAP, ComponentEntryMapImpl.class, this, ComponentCachePackage.COMPONENTS_CACHE__COMPONENT_ENTRY_MAP);
        }
        return componentEntryMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentCachePackage.COMPONENTS_CACHE__COMPONENT_ENTRY_MAP:
                return ((InternalEList<?>)getComponentEntryMap()).basicRemove(otherEnd, msgs);
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
            case ComponentCachePackage.COMPONENTS_CACHE__COMPONENT_ENTRY_MAP:
                if (coreType) return getComponentEntryMap();
                else return getComponentEntryMap().map();
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
            case ComponentCachePackage.COMPONENTS_CACHE__COMPONENT_ENTRY_MAP:
                ((EStructuralFeature.Setting)getComponentEntryMap()).set(newValue);
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
            case ComponentCachePackage.COMPONENTS_CACHE__COMPONENT_ENTRY_MAP:
                getComponentEntryMap().clear();
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
            case ComponentCachePackage.COMPONENTS_CACHE__COMPONENT_ENTRY_MAP:
                return componentEntryMap != null && !componentEntryMap.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ComponentsCacheImpl
