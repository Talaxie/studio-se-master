/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.component_cache.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.talend.core.model.component_cache.ComponentCachePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentCacheXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentCacheXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        ComponentCachePackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the ComponentCacheResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new ComponentCacheResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new ComponentCacheResourceFactoryImpl());
        }
        return registrations;
    }

} //ComponentCacheXMLProcessor
