/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.hdfs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.repository.model.hdfs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HDFSFactoryImpl extends EFactoryImpl implements HDFSFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static HDFSFactory init() {
        try {
            HDFSFactory theHDFSFactory = (HDFSFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.talend.org/hdfs"); 
            if (theHDFSFactory != null) {
                return theHDFSFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new HDFSFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HDFSFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case HDFSPackage.HDFS_CONNECTION: return createHDFSConnection();
            case HDFSPackage.HDFS_CONNECTION_ITEM: return createHDFSConnectionItem();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HDFSConnection createHDFSConnection() {
        HDFSConnectionImpl hdfsConnection = new HDFSConnectionImpl();
        return hdfsConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HDFSConnectionItem createHDFSConnectionItem() {
        HDFSConnectionItemImpl hdfsConnectionItem = new HDFSConnectionItemImpl();
        return hdfsConnectionItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HDFSPackage getHDFSPackage() {
        return (HDFSPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static HDFSPackage getPackage() {
        return HDFSPackage.eINSTANCE;
    }

} //HDFSFactoryImpl
