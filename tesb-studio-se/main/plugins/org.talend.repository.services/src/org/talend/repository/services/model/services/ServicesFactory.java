/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.services.model.services;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.repository.services.model.services.ServicesPackage
 * @generated
 */
public interface ServicesFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ServicesFactory eINSTANCE = org.talend.repository.services.model.services.impl.ServicesFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Service Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Item</em>'.
     * @generated
     */
    ServiceItem createServiceItem();

    /**
     * Returns a new object of class '<em>Service Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Operation</em>'.
     * @generated
     */
    ServiceOperation createServiceOperation();

    /**
     * Returns a new object of class '<em>Service Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Connection</em>'.
     * @generated
     */
    ServiceConnection createServiceConnection();

    /**
     * Returns a new object of class '<em>Service Port</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Port</em>'.
     * @generated
     */
    ServicePort createServicePort();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ServicesPackage getServicesPackage();

} //ServicesFactory
