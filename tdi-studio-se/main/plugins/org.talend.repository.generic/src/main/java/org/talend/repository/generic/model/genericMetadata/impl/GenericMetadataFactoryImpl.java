/**
 */
package org.talend.repository.generic.model.genericMetadata.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.repository.generic.model.genericMetadata.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericMetadataFactoryImpl extends EFactoryImpl implements GenericMetadataFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static GenericMetadataFactory init() {
        try {
            GenericMetadataFactory theGenericMetadataFactory = (GenericMetadataFactory)EPackage.Registry.INSTANCE.getEFactory(GenericMetadataPackage.eNS_URI);
            if (theGenericMetadataFactory != null) {
                return theGenericMetadataFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new GenericMetadataFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericMetadataFactoryImpl() {
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
            case GenericMetadataPackage.GENERIC_CONNECTION: return createGenericConnection();
            case GenericMetadataPackage.GENERIC_CONNECTION_ITEM: return createGenericConnectionItem();
            case GenericMetadataPackage.SUB_CONTAINER: return createSubContainer();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericConnection createGenericConnection() {
        GenericConnectionImpl genericConnection = new GenericConnectionImpl();
        return genericConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericConnectionItem createGenericConnectionItem() {
        GenericConnectionItemImpl genericConnectionItem = new GenericConnectionItemImpl();
        return genericConnectionItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubContainer createSubContainer() {
        SubContainerImpl subContainer = new SubContainerImpl();
        return subContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericMetadataPackage getGenericMetadataPackage() {
        return (GenericMetadataPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static GenericMetadataPackage getPackage() {
        return GenericMetadataPackage.eINSTANCE;
    }

} //GenericMetadataFactoryImpl
