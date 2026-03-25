/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.repository.services.model.services;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.repository.services.model.services.ServicesFactory
 * @model kind="package"
 * @generated
 */
public interface ServicesPackage extends EPackage {

    /**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "services";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://www.talend.org/Services";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "Services";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    ServicesPackage eINSTANCE = org.talend.repository.services.model.services.impl.ServicesPackageImpl.init();

    /**
	 * The meta object id for the '{@link org.talend.repository.services.model.services.impl.ServiceItemImpl <em>Service Item</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.talend.repository.services.model.services.impl.ServiceItemImpl
	 * @see org.talend.repository.services.model.services.impl.ServicesPackageImpl#getServiceItem()
	 * @generated
	 */
    int SERVICE_ITEM = 0;

    /**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_ITEM__PROPERTY = PropertiesPackage.CONNECTION_ITEM__PROPERTY;

    /**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_ITEM__STATE = PropertiesPackage.CONNECTION_ITEM__STATE;

    /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_ITEM__PARENT = PropertiesPackage.CONNECTION_ITEM__PARENT;

    /**
	 * The feature id for the '<em><b>Reference Resources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_ITEM__REFERENCE_RESOURCES = PropertiesPackage.CONNECTION_ITEM__REFERENCE_RESOURCES;

    /**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_ITEM__FILE_EXTENSION = PropertiesPackage.CONNECTION_ITEM__FILE_EXTENSION;

    /**
	 * The feature id for the '<em><b>Need Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ITEM__NEED_VERSION = PropertiesPackage.CONNECTION_ITEM__NEED_VERSION;

				/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_ITEM__CONNECTION = PropertiesPackage.CONNECTION_ITEM__CONNECTION;

    /**
     * The number of structural features of the '<em>Service Item</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_ITEM_FEATURE_COUNT = PropertiesPackage.CONNECTION_ITEM_FEATURE_COUNT + 0;

    /**
	 * The meta object id for the '{@link org.talend.repository.services.model.services.impl.ServiceOperationImpl <em>Service Operation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.talend.repository.services.model.services.impl.ServiceOperationImpl
	 * @see org.talend.repository.services.model.services.impl.ServicesPackageImpl#getServiceOperation()
	 * @generated
	 */
    int SERVICE_OPERATION = 1;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_OPERATION__LABEL = 0;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_OPERATION__NAME = 1;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_OPERATION__ID = 2;

    /**
     * The feature id for the '<em><b>Reference Job Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_OPERATION__REFERENCE_JOB_ID = 3;

    /**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_OPERATION__DOCUMENTATION = 4;

    /**
	 * The feature id for the '<em><b>In Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__IN_BINDING = 5;

				/**
	 * The number of structural features of the '<em>Service Operation</em>' class.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_OPERATION_FEATURE_COUNT = 6;

    /**
	 * The meta object id for the '{@link org.talend.repository.services.model.services.impl.ServiceConnectionImpl <em>Service Connection</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.talend.repository.services.model.services.impl.ServiceConnectionImpl
	 * @see org.talend.repository.services.model.services.impl.ServicesPackageImpl#getServiceConnection()
	 * @generated
	 */
    int SERVICE_CONNECTION = 2;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__NAME = ConnectionPackage.CONNECTION__NAME;

    /**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__VISIBILITY = ConnectionPackage.CONNECTION__VISIBILITY;

    /**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__CLIENT_DEPENDENCY = ConnectionPackage.CONNECTION__CLIENT_DEPENDENCY;

    /**
	 * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__SUPPLIER_DEPENDENCY = ConnectionPackage.CONNECTION__SUPPLIER_DEPENDENCY;

    /**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__CONSTRAINT = ConnectionPackage.CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__NAMESPACE = ConnectionPackage.CONNECTION__NAMESPACE;

    /**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__IMPORTER = ConnectionPackage.CONNECTION__IMPORTER;

    /**
	 * The feature id for the '<em><b>Stereotype</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__STEREOTYPE = ConnectionPackage.CONNECTION__STEREOTYPE;

    /**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__TAGGED_VALUE = ConnectionPackage.CONNECTION__TAGGED_VALUE;

    /**
	 * The feature id for the '<em><b>Document</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__DOCUMENT = ConnectionPackage.CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__DESCRIPTION = ConnectionPackage.CONNECTION__DESCRIPTION;

    /**
	 * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__RESPONSIBLE_PARTY = ConnectionPackage.CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__ELEMENT_NODE = ConnectionPackage.CONNECTION__ELEMENT_NODE;

    /**
	 * The feature id for the '<em><b>Set</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__SET = ConnectionPackage.CONNECTION__SET;

    /**
	 * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__RENDERED_OBJECT = ConnectionPackage.CONNECTION__RENDERED_OBJECT;

    /**
	 * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__VOCABULARY_ELEMENT = ConnectionPackage.CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__MEASUREMENT = ConnectionPackage.CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__CHANGE_REQUEST = ConnectionPackage.CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__DASDL_PROPERTY = ConnectionPackage.CONNECTION__DASDL_PROPERTY;

    /**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__PROPERTIES = ConnectionPackage.CONNECTION__PROPERTIES;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__ID = ConnectionPackage.CONNECTION__ID;

    /**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__COMMENT = ConnectionPackage.CONNECTION__COMMENT;

    /**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__LABEL = ConnectionPackage.CONNECTION__LABEL;

    /**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__READ_ONLY = ConnectionPackage.CONNECTION__READ_ONLY;

    /**
	 * The feature id for the '<em><b>Synchronised</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__SYNCHRONISED = ConnectionPackage.CONNECTION__SYNCHRONISED;

    /**
	 * The feature id for the '<em><b>Divergency</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__DIVERGENCY = ConnectionPackage.CONNECTION__DIVERGENCY;

    /**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__OWNED_ELEMENT = ConnectionPackage.CONNECTION__OWNED_ELEMENT;

    /**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__IMPORTED_ELEMENT = ConnectionPackage.CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__DATA_MANAGER = ConnectionPackage.CONNECTION__DATA_MANAGER;

    /**
	 * The feature id for the '<em><b>Pathname</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__PATHNAME = ConnectionPackage.CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__MACHINE = ConnectionPackage.CONNECTION__MACHINE;

    /**
	 * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = ConnectionPackage.CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__COMPONENT = ConnectionPackage.CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__IS_CASE_SENSITIVE = ConnectionPackage.CONNECTION__IS_CASE_SENSITIVE;

    /**
	 * The feature id for the '<em><b>Client Connection</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__CLIENT_CONNECTION = ConnectionPackage.CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__DATA_PACKAGE = ConnectionPackage.CONNECTION__DATA_PACKAGE;

    /**
	 * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__RESOURCE_CONNECTION = ConnectionPackage.CONNECTION__RESOURCE_CONNECTION;

    /**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__VERSION = ConnectionPackage.CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__QUERIES = ConnectionPackage.CONNECTION__QUERIES;

    /**
	 * The feature id for the '<em><b>Context Mode</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__CONTEXT_MODE = ConnectionPackage.CONNECTION__CONTEXT_MODE;

    /**
	 * The feature id for the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__CONTEXT_ID = ConnectionPackage.CONNECTION__CONTEXT_ID;

    /**
	 * The feature id for the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__CONTEXT_NAME = ConnectionPackage.CONNECTION__CONTEXT_NAME;

    /**
	 * The feature id for the '<em><b>WSDL Path</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__WSDL_PATH = ConnectionPackage.CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Service Port</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_CONNECTION__SERVICE_PORT = ConnectionPackage.CONNECTION_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Additional Info</b></em>' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION__ADDITIONAL_INFO = ConnectionPackage.CONNECTION_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Service Connection</em>' class.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_CONNECTION_FEATURE_COUNT = ConnectionPackage.CONNECTION_FEATURE_COUNT + 3;

    /**
	 * The meta object id for the '{@link org.talend.repository.services.model.services.impl.ServicePortImpl <em>Service Port</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.talend.repository.services.model.services.impl.ServicePortImpl
	 * @see org.talend.repository.services.model.services.impl.ServicesPackageImpl#getServicePort()
	 * @generated
	 */
    int SERVICE_PORT = 3;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_PORT__NAME = 0;

    /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_PORT__ID = 1;

    /**
	 * The feature id for the '<em><b>Service Operation</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_PORT__SERVICE_OPERATION = 2;

    /**
	 * The feature id for the '<em><b>Additional Info</b></em>' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SERVICE_PORT__ADDITIONAL_INFO = 3;

    /**
     * The number of structural features of the '<em>Service Port</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SERVICE_PORT_FEATURE_COUNT = 4;

    /**
	 * Returns the meta object for class '{@link org.talend.repository.services.model.services.ServiceItem <em>Service Item</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Item</em>'.
	 * @see org.talend.repository.services.model.services.ServiceItem
	 * @generated
	 */
    EClass getServiceItem();

    /**
	 * Returns the meta object for class '{@link org.talend.repository.services.model.services.ServiceOperation <em>Service Operation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Operation</em>'.
	 * @see org.talend.repository.services.model.services.ServiceOperation
	 * @generated
	 */
    EClass getServiceOperation();

    /**
	 * Returns the meta object for the attribute '{@link org.talend.repository.services.model.services.ServiceOperation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.talend.repository.services.model.services.ServiceOperation#getLabel()
	 * @see #getServiceOperation()
	 * @generated
	 */
    EAttribute getServiceOperation_Label();

    /**
	 * Returns the meta object for the attribute '{@link org.talend.repository.services.model.services.ServiceOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.talend.repository.services.model.services.ServiceOperation#getName()
	 * @see #getServiceOperation()
	 * @generated
	 */
    EAttribute getServiceOperation_Name();

    /**
	 * Returns the meta object for the attribute '{@link org.talend.repository.services.model.services.ServiceOperation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.talend.repository.services.model.services.ServiceOperation#getId()
	 * @see #getServiceOperation()
	 * @generated
	 */
    EAttribute getServiceOperation_Id();

    /**
	 * Returns the meta object for the attribute '{@link org.talend.repository.services.model.services.ServiceOperation#getReferenceJobId <em>Reference Job Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Job Id</em>'.
	 * @see org.talend.repository.services.model.services.ServiceOperation#getReferenceJobId()
	 * @see #getServiceOperation()
	 * @generated
	 */
    EAttribute getServiceOperation_ReferenceJobId();

    /**
	 * Returns the meta object for the attribute '{@link org.talend.repository.services.model.services.ServiceOperation#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.talend.repository.services.model.services.ServiceOperation#getDocumentation()
	 * @see #getServiceOperation()
	 * @generated
	 */
    EAttribute getServiceOperation_Documentation();

    /**
	 * Returns the meta object for the attribute '{@link org.talend.repository.services.model.services.ServiceOperation#isInBinding <em>In Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Binding</em>'.
	 * @see org.talend.repository.services.model.services.ServiceOperation#isInBinding()
	 * @see #getServiceOperation()
	 * @generated
	 */
	EAttribute getServiceOperation_InBinding();

				/**
	 * Returns the meta object for class '{@link org.talend.repository.services.model.services.ServiceConnection <em>Service Connection</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Connection</em>'.
	 * @see org.talend.repository.services.model.services.ServiceConnection
	 * @generated
	 */
    EClass getServiceConnection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.repository.services.model.services.ServiceConnection#getWSDLPath <em>WSDL Path</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>WSDL Path</em>'.
     * @see org.talend.repository.services.model.services.ServiceConnection#getWSDLPath()
     * @see #getServiceConnection()
     * @generated
     */
    EAttribute getServiceConnection_WSDLPath();

    /**
	 * Returns the meta object for the reference list '{@link org.talend.repository.services.model.services.ServiceConnection#getServicePort <em>Service Port</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Port</em>'.
	 * @see org.talend.repository.services.model.services.ServiceConnection#getServicePort()
	 * @see #getServiceConnection()
	 * @generated
	 */
    EReference getServiceConnection_ServicePort();

    /**
	 * Returns the meta object for the map '{@link org.talend.repository.services.model.services.ServiceConnection#getAdditionalInfo <em>Additional Info</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Additional Info</em>'.
	 * @see org.talend.repository.services.model.services.ServiceConnection#getAdditionalInfo()
	 * @see #getServiceConnection()
	 * @generated
	 */
    EReference getServiceConnection_AdditionalInfo();

    /**
	 * Returns the meta object for class '{@link org.talend.repository.services.model.services.ServicePort <em>Service Port</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Port</em>'.
	 * @see org.talend.repository.services.model.services.ServicePort
	 * @generated
	 */
    EClass getServicePort();

    /**
	 * Returns the meta object for the attribute '{@link org.talend.repository.services.model.services.ServicePort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.talend.repository.services.model.services.ServicePort#getName()
	 * @see #getServicePort()
	 * @generated
	 */
    EAttribute getServicePort_Name();

    /**
	 * Returns the meta object for the attribute '{@link org.talend.repository.services.model.services.ServicePort#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.talend.repository.services.model.services.ServicePort#getId()
	 * @see #getServicePort()
	 * @generated
	 */
    EAttribute getServicePort_Id();

    /**
	 * Returns the meta object for the reference list '{@link org.talend.repository.services.model.services.ServicePort#getServiceOperation <em>Service Operation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Operation</em>'.
	 * @see org.talend.repository.services.model.services.ServicePort#getServiceOperation()
	 * @see #getServicePort()
	 * @generated
	 */
    EReference getServicePort_ServiceOperation();

    /**
	 * Returns the meta object for the map '{@link org.talend.repository.services.model.services.ServicePort#getAdditionalInfo <em>Additional Info</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Additional Info</em>'.
	 * @see org.talend.repository.services.model.services.ServicePort#getAdditionalInfo()
	 * @see #getServicePort()
	 * @generated
	 */
    EReference getServicePort_AdditionalInfo();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    ServicesFactory getServicesFactory();

    /**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
	 * @generated
	 */
    interface Literals {

        /**
		 * The meta object literal for the '{@link org.talend.repository.services.model.services.impl.ServiceItemImpl <em>Service Item</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.talend.repository.services.model.services.impl.ServiceItemImpl
		 * @see org.talend.repository.services.model.services.impl.ServicesPackageImpl#getServiceItem()
		 * @generated
		 */
        EClass SERVICE_ITEM = eINSTANCE.getServiceItem();

        /**
		 * The meta object literal for the '{@link org.talend.repository.services.model.services.impl.ServiceOperationImpl <em>Service Operation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.talend.repository.services.model.services.impl.ServiceOperationImpl
		 * @see org.talend.repository.services.model.services.impl.ServicesPackageImpl#getServiceOperation()
		 * @generated
		 */
        EClass SERVICE_OPERATION = eINSTANCE.getServiceOperation();

        /**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SERVICE_OPERATION__LABEL = eINSTANCE.getServiceOperation_Label();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SERVICE_OPERATION__NAME = eINSTANCE.getServiceOperation_Name();

        /**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SERVICE_OPERATION__ID = eINSTANCE.getServiceOperation_Id();

        /**
		 * The meta object literal for the '<em><b>Reference Job Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SERVICE_OPERATION__REFERENCE_JOB_ID = eINSTANCE.getServiceOperation_ReferenceJobId();

        /**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SERVICE_OPERATION__DOCUMENTATION = eINSTANCE.getServiceOperation_Documentation();

        /**
		 * The meta object literal for the '<em><b>In Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OPERATION__IN_BINDING = eINSTANCE.getServiceOperation_InBinding();

								/**
		 * The meta object literal for the '{@link org.talend.repository.services.model.services.impl.ServiceConnectionImpl <em>Service Connection</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.talend.repository.services.model.services.impl.ServiceConnectionImpl
		 * @see org.talend.repository.services.model.services.impl.ServicesPackageImpl#getServiceConnection()
		 * @generated
		 */
        EClass SERVICE_CONNECTION = eINSTANCE.getServiceConnection();

        /**
		 * The meta object literal for the '<em><b>WSDL Path</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
         * end-user-doc -->
		 * @generated
		 */
        EAttribute SERVICE_CONNECTION__WSDL_PATH = eINSTANCE.getServiceConnection_WSDLPath();

        /**
		 * The meta object literal for the '<em><b>Service Port</b></em>' reference list feature.
		 * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
		 * @generated
		 */
        EReference SERVICE_CONNECTION__SERVICE_PORT = eINSTANCE.getServiceConnection_ServicePort();

        /**
		 * The meta object literal for the '<em><b>Additional Info</b></em>' map feature.
		 * <!-- begin-user-doc --> <!--
         * end-user-doc -->
		 * @generated
		 */
        EReference SERVICE_CONNECTION__ADDITIONAL_INFO = eINSTANCE.getServiceConnection_AdditionalInfo();

        /**
		 * The meta object literal for the '{@link org.talend.repository.services.model.services.impl.ServicePortImpl <em>Service Port</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.talend.repository.services.model.services.impl.ServicePortImpl
		 * @see org.talend.repository.services.model.services.impl.ServicesPackageImpl#getServicePort()
		 * @generated
		 */
        EClass SERVICE_PORT = eINSTANCE.getServicePort();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SERVICE_PORT__NAME = eINSTANCE.getServicePort_Name();

        /**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SERVICE_PORT__ID = eINSTANCE.getServicePort_Id();

        /**
         * The meta object literal for the '<em><b>Service Operation</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SERVICE_PORT__SERVICE_OPERATION = eINSTANCE.getServicePort_ServiceOperation();

        /**
		 * The meta object literal for the '<em><b>Additional Info</b></em>' map feature.
		 * <!-- begin-user-doc --> <!--
         * end-user-doc -->
		 * @generated
		 */
        EReference SERVICE_PORT__ADDITIONAL_INFO = eINSTANCE.getServicePort_AdditionalInfo();

    }

} // ServicesPackage
