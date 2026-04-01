/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.component_cache;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.component_cache.ComponentsCache#getComponentEntryMap <em>Component Entry Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.component_cache.ComponentCachePackage#getComponentsCache()
 * @model
 * @generated
 */
public interface ComponentsCache extends EObject {
    /**
     * Returns the value of the '<em><b>Component Entry Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type list of {@link org.talend.core.model.component_cache.ComponentInfo},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component Entry Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component Entry Map</em>' map.
     * @see org.talend.core.model.component_cache.ComponentCachePackage#getComponentsCache_ComponentEntryMap()
     * @model mapType="org.talend.core.model.component_cache.ComponentEntryMap<org.eclipse.emf.ecore.EString, org.talend.core.model.component_cache.ComponentInfo>"
     * @generated
     */
    EMap<String, EList<ComponentInfo>> getComponentEntryMap();

} // ComponentsCache
