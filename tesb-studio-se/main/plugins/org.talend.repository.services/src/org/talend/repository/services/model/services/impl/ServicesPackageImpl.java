/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.repository.services.model.services.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.repository.services.model.services.ServiceConnection;
import org.talend.repository.services.model.services.ServiceItem;
import org.talend.repository.services.model.services.ServiceOperation;
import org.talend.repository.services.model.services.ServicePort;
import org.talend.repository.services.model.services.ServicesFactory;
import org.talend.repository.services.model.services.ServicesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ServicesPackageImpl extends EPackageImpl implements ServicesPackage {

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    private EClass serviceItemEClass = null;

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    private EClass serviceOperationEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass serviceConnectionEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass servicePortEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
     * EPackage.Registry} by the package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.repository.services.model.services.ServicesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ServicesPackageImpl() {
		super(eNS_URI, ServicesFactory.eINSTANCE);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    private static boolean isInited = false;

    /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ServicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
    public static ServicesPackage init() {
		if (isInited) return (ServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI);

		// Obtain or create and register package
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropertiesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServicesPackage.createPackageContents();

		// Initialize created meta-data
		theServicesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicesPackage.eNS_URI, theServicesPackage);
		return theServicesPackage;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getServiceItem() {
		return serviceItemEClass;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getServiceOperation() {
		return serviceOperationEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServiceOperation_Label() {
		return (EAttribute)serviceOperationEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServiceOperation_Name() {
		return (EAttribute)serviceOperationEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServiceOperation_Id() {
		return (EAttribute)serviceOperationEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServiceOperation_ReferenceJobId() {
		return (EAttribute)serviceOperationEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServiceOperation_Documentation() {
		return (EAttribute)serviceOperationEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOperation_InBinding() {
		return (EAttribute)serviceOperationEClass.getEStructuralFeatures().get(5);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getServiceConnection() {
		return serviceConnectionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServiceConnection_WSDLPath() {
		return (EAttribute)serviceConnectionEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServiceConnection_ServicePort() {
		return (EReference)serviceConnectionEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServiceConnection_AdditionalInfo() {
		return (EReference)serviceConnectionEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getServicePort() {
		return servicePortEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServicePort_Name() {
		return (EAttribute)servicePortEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getServicePort_Id() {
		return (EAttribute)servicePortEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServicePort_ServiceOperation() {
		return (EReference)servicePortEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getServicePort_AdditionalInfo() {
		return (EReference)servicePortEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public ServicesFactory getServicesFactory() {
		return (ServicesFactory)getEFactoryInstance();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isCreated = false;

    /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serviceItemEClass = createEClass(SERVICE_ITEM);

		serviceOperationEClass = createEClass(SERVICE_OPERATION);
		createEAttribute(serviceOperationEClass, SERVICE_OPERATION__LABEL);
		createEAttribute(serviceOperationEClass, SERVICE_OPERATION__NAME);
		createEAttribute(serviceOperationEClass, SERVICE_OPERATION__ID);
		createEAttribute(serviceOperationEClass, SERVICE_OPERATION__REFERENCE_JOB_ID);
		createEAttribute(serviceOperationEClass, SERVICE_OPERATION__DOCUMENTATION);
		createEAttribute(serviceOperationEClass, SERVICE_OPERATION__IN_BINDING);

		serviceConnectionEClass = createEClass(SERVICE_CONNECTION);
		createEAttribute(serviceConnectionEClass, SERVICE_CONNECTION__WSDL_PATH);
		createEReference(serviceConnectionEClass, SERVICE_CONNECTION__SERVICE_PORT);
		createEReference(serviceConnectionEClass, SERVICE_CONNECTION__ADDITIONAL_INFO);

		servicePortEClass = createEClass(SERVICE_PORT);
		createEAttribute(servicePortEClass, SERVICE_PORT__NAME);
		createEAttribute(servicePortEClass, SERVICE_PORT__ID);
		createEReference(servicePortEClass, SERVICE_PORT__SERVICE_OPERATION);
		createEReference(servicePortEClass, SERVICE_PORT__ADDITIONAL_INFO);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isInitialized = false;

    /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PropertiesPackage thePropertiesPackage = (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ConnectionPackage theConnectionPackage = (ConnectionPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceItemEClass.getESuperTypes().add(thePropertiesPackage.getConnectionItem());
		serviceConnectionEClass.getESuperTypes().add(theConnectionPackage.getConnection());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceItemEClass, ServiceItem.class, "ServiceItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceOperationEClass, ServiceOperation.class, "ServiceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceOperation_Label(), theEcorePackage.getEString(), "label", null, 0, 1, ServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperation_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperation_Id(), theEcorePackage.getEString(), "id", null, 0, 1, ServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperation_ReferenceJobId(), ecorePackage.getEString(), "referenceJobId", null, 0, 1, ServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperation_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, ServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOperation_InBinding(), theEcorePackage.getEBoolean(), "inBinding", "true", 0, 1, ServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConnectionEClass, ServiceConnection.class, "ServiceConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceConnection_WSDLPath(), theEcorePackage.getEString(), "WSDLPath", null, 0, 1, ServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConnection_ServicePort(), this.getServicePort(), null, "servicePort", null, 0, -1, ServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConnection_AdditionalInfo(), thePropertiesPackage.getAdditionalInfoMap(), null, "additionalInfo", null, 0, -1, ServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicePortEClass, ServicePort.class, "ServicePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServicePort_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ServicePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePort_Id(), theEcorePackage.getEString(), "id", null, 0, 1, ServicePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePort_ServiceOperation(), this.getServiceOperation(), null, "serviceOperation", null, 0, -1, ServicePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePort_AdditionalInfo(), thePropertiesPackage.getAdditionalInfoMap(), null, "additionalInfo", null, 0, -1, ServicePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // ServicesPackageImpl
