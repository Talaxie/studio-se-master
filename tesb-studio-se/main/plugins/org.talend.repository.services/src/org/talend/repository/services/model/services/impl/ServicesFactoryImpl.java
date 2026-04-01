/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.services.model.services.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.repository.services.model.services.ServiceConnection;
import org.talend.repository.services.model.services.ServiceItem;
import org.talend.repository.services.model.services.ServiceOperation;
import org.talend.repository.services.model.services.ServicePort;
import org.talend.repository.services.model.services.ServicesFactory;
import org.talend.repository.services.model.services.ServicesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicesFactoryImpl extends EFactoryImpl implements ServicesFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ServicesFactory init() {
        try {
            ServicesFactory theServicesFactory = (ServicesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.talend.org/Services"); 
            if (theServicesFactory != null) {
                return theServicesFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ServicesFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServicesFactoryImpl() {
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
            case ServicesPackage.SERVICE_ITEM: return createServiceItem();
            case ServicesPackage.SERVICE_OPERATION: return createServiceOperation();
            case ServicesPackage.SERVICE_CONNECTION: return createServiceConnection();
            case ServicesPackage.SERVICE_PORT: return createServicePort();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceItem createServiceItem() {
        ServiceItemImpl serviceItem = new ServiceItemImpl();
        return serviceItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceOperation createServiceOperation() {
        ServiceOperationImpl serviceOperation = new ServiceOperationImpl();
        return serviceOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceConnection createServiceConnection() {
        ServiceConnectionImpl serviceConnection = new ServiceConnectionImpl();
        return serviceConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServicePort createServicePort() {
        ServicePortImpl servicePort = new ServicePortImpl();
        return servicePort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServicesPackage getServicesPackage() {
        return (ServicesPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ServicesPackage getPackage() {
        return ServicesPackage.eINSTANCE;
    }

} //ServicesFactoryImpl
