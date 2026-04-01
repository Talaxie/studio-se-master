/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.camel.core.model.camelProperties.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.talend.camel.core.model.camelProperties.CamelPropertiesPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CamelPropertiesXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CamelPropertiesXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        CamelPropertiesPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the CamelPropertiesResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new CamelPropertiesResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new CamelPropertiesResourceFactoryImpl());
        }
        return registrations;
    }

} //CamelPropertiesXMLProcessor
