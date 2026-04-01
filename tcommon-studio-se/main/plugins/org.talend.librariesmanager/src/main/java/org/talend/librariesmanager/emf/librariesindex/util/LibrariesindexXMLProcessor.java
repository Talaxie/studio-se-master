/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.librariesmanager.emf.librariesindex.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.talend.librariesmanager.emf.librariesindex.LibrariesindexPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LibrariesindexXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LibrariesindexXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        LibrariesindexPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the LibrariesindexResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new LibrariesindexResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new LibrariesindexResourceFactoryImpl());
        }
        return registrations;
    }

} //LibrariesindexXMLProcessor
