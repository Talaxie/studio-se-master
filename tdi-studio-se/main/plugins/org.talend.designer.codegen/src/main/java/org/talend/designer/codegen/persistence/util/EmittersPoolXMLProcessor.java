/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.codegen.persistence.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.talend.designer.codegen.persistence.EmittersPoolPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EmittersPoolXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EmittersPoolXMLProcessor() {
        super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
        extendedMetaData.putPackage(null, EmittersPoolPackage.eINSTANCE);
    }

    /**
     * Register for "*" and "xml" file extensions the EmittersPoolResourceFactoryImpl factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Map getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new EmittersPoolResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new EmittersPoolResourceFactoryImpl());
        }
        return registrations;
    }

} // EmittersPoolXMLProcessor
