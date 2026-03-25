/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlmapXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmlmapXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        XmlmapPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the XmlmapResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new XmlmapResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new XmlmapResourceFactoryImpl());
        }
        return registrations;
    }

} //XmlmapXMLProcessor
