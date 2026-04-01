/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.component_cache;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.core.model.component_cache.ComponentCachePackage
 * @generated
 */
public interface ComponentCacheFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ComponentCacheFactory eINSTANCE = org.talend.core.model.component_cache.impl.ComponentCacheFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Components Cache</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Components Cache</em>'.
     * @generated
     */
    ComponentsCache createComponentsCache();

    /**
     * Returns a new object of class '<em>Component Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Component Info</em>'.
     * @generated
     */
    ComponentInfo createComponentInfo();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ComponentCachePackage getComponentCachePackage();

} //ComponentCacheFactory
