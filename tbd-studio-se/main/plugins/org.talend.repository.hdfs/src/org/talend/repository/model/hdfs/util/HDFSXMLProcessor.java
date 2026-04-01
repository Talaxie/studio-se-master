/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.hdfs.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.talend.repository.model.hdfs.HDFSPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HDFSXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HDFSXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        HDFSPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the HDFSResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new HDFSResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new HDFSResourceFactoryImpl());
        }
        return registrations;
    }

} //HDFSXMLProcessor
