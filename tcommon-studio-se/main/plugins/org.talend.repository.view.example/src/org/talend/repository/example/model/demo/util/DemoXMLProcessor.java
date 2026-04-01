/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.example.model.demo.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.talend.repository.example.model.demo.DemoPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DemoXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        DemoPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the DemoResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new DemoResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new DemoResourceFactoryImpl());
        }
        return registrations;
    }

} //DemoXMLProcessor
