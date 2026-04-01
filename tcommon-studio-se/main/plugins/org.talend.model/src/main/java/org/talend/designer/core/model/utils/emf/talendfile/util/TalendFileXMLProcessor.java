/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TalendFileXMLProcessor extends XMLProcessor {
    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TalendFileXMLProcessor() {
        super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
        extendedMetaData.putPackage(null, TalendFilePackage.eINSTANCE);
    }
    
    /**
     * Register for "*" and "xml" file extensions the TalendFileResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Map getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new TalendFileResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new TalendFileResourceFactoryImpl());
        }
        return registrations;
    }

} //TalendFileXMLProcessor
