/**
 */
package org.talend.repository.generic.model.genericMetadata;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.repository.generic.model.genericMetadata.GenericMetadataPackage
 * @generated
 */
public interface GenericMetadataFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    GenericMetadataFactory eINSTANCE = org.talend.repository.generic.model.genericMetadata.impl.GenericMetadataFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Generic Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic Connection</em>'.
     * @generated
     */
    GenericConnection createGenericConnection();

    /**
     * Returns a new object of class '<em>Generic Connection Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic Connection Item</em>'.
     * @generated
     */
    GenericConnectionItem createGenericConnectionItem();

    /**
     * Returns a new object of class '<em>Sub Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Container</em>'.
     * @generated
     */
    SubContainer createSubContainer();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    GenericMetadataPackage getGenericMetadataPackage();

} //GenericMetadataFactory
