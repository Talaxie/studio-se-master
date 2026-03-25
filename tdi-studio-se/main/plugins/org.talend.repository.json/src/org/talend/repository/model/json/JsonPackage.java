/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.json;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;

import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.repository.model.json.JsonFactory
 * @model kind="package"
 * @generated
 */
public interface JsonPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "json";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.talend.org/json";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TalendJSON";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    JsonPackage eINSTANCE = org.talend.repository.model.json.impl.JsonPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl <em>JSON File Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.json.impl.JSONFileConnectionImpl
     * @see org.talend.repository.model.json.impl.JsonPackageImpl#getJSONFileConnection()
     * @generated
     */
    int JSON_FILE_CONNECTION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__NAME = ConnectionPackage.CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__VISIBILITY = ConnectionPackage.CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__CLIENT_DEPENDENCY = ConnectionPackage.CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__SUPPLIER_DEPENDENCY = ConnectionPackage.CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__CONSTRAINT = ConnectionPackage.CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__NAMESPACE = ConnectionPackage.CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__IMPORTER = ConnectionPackage.CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__STEREOTYPE = ConnectionPackage.CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__TAGGED_VALUE = ConnectionPackage.CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__DOCUMENT = ConnectionPackage.CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__DESCRIPTION = ConnectionPackage.CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__RESPONSIBLE_PARTY = ConnectionPackage.CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__ELEMENT_NODE = ConnectionPackage.CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__SET = ConnectionPackage.CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__RENDERED_OBJECT = ConnectionPackage.CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__VOCABULARY_ELEMENT = ConnectionPackage.CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__MEASUREMENT = ConnectionPackage.CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__CHANGE_REQUEST = ConnectionPackage.CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__DASDL_PROPERTY = ConnectionPackage.CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__PROPERTIES = ConnectionPackage.CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__ID = ConnectionPackage.CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__COMMENT = ConnectionPackage.CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__LABEL = ConnectionPackage.CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__READ_ONLY = ConnectionPackage.CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__SYNCHRONISED = ConnectionPackage.CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__DIVERGENCY = ConnectionPackage.CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__OWNED_ELEMENT = ConnectionPackage.CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__IMPORTED_ELEMENT = ConnectionPackage.CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__DATA_MANAGER = ConnectionPackage.CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__PATHNAME = ConnectionPackage.CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__MACHINE = ConnectionPackage.CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = ConnectionPackage.CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__COMPONENT = ConnectionPackage.CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__IS_CASE_SENSITIVE = ConnectionPackage.CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__CLIENT_CONNECTION = ConnectionPackage.CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__DATA_PACKAGE = ConnectionPackage.CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__RESOURCE_CONNECTION = ConnectionPackage.CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__VERSION = ConnectionPackage.CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__QUERIES = ConnectionPackage.CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__CONTEXT_MODE = ConnectionPackage.CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__CONTEXT_ID = ConnectionPackage.CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Context Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__CONTEXT_NAME = ConnectionPackage.CONNECTION__CONTEXT_NAME;

    /**
     * The feature id for the '<em><b>JSON File Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__JSON_FILE_PATH = ConnectionPackage.CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Guess</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__GUESS = ConnectionPackage.CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Mask XPattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__MASK_XPATTERN = ConnectionPackage.CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Schema</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__SCHEMA = ConnectionPackage.CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__ENCODING = ConnectionPackage.CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__GROUP = ConnectionPackage.CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Root</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__ROOT = ConnectionPackage.CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Loop</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__LOOP = ConnectionPackage.CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Input Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__INPUT_MODEL = ConnectionPackage.CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Output File Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__OUTPUT_FILE_PATH = ConnectionPackage.CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>File Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__FILE_CONTENT = ConnectionPackage.CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Readby Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION__READBY_MODE = ConnectionPackage.CONNECTION_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>JSON File Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION_FEATURE_COUNT = ConnectionPackage.CONNECTION_FEATURE_COUNT + 12;

    /**
     * The meta object id for the '{@link org.talend.repository.model.json.impl.JSONFileConnectionItemImpl <em>JSON File Connection Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.json.impl.JSONFileConnectionItemImpl
     * @see org.talend.repository.model.json.impl.JsonPackageImpl#getJSONFileConnectionItem()
     * @generated
     */
    int JSON_FILE_CONNECTION_ITEM = 1;

    /**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION_ITEM__PROPERTY = PropertiesPackage.CONNECTION_ITEM__PROPERTY;

    /**
     * The feature id for the '<em><b>State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION_ITEM__STATE = PropertiesPackage.CONNECTION_ITEM__STATE;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION_ITEM__PARENT = PropertiesPackage.CONNECTION_ITEM__PARENT;

    /**
     * The feature id for the '<em><b>Reference Resources</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION_ITEM__REFERENCE_RESOURCES = PropertiesPackage.CONNECTION_ITEM__REFERENCE_RESOURCES;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION_ITEM__FILE_EXTENSION = PropertiesPackage.CONNECTION_ITEM__FILE_EXTENSION;

    /**
     * The feature id for the '<em><b>Need Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION_ITEM__NEED_VERSION = PropertiesPackage.CONNECTION_ITEM__NEED_VERSION;

    /**
     * The feature id for the '<em><b>Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION_ITEM__CONNECTION = PropertiesPackage.CONNECTION_ITEM__CONNECTION;

    /**
     * The number of structural features of the '<em>JSON File Connection Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_CONNECTION_ITEM_FEATURE_COUNT = PropertiesPackage.CONNECTION_ITEM_FEATURE_COUNT + 0;


    /**
     * The meta object id for the '{@link org.talend.repository.model.json.impl.JSONXPathLoopDescriptorImpl <em>JSONX Path Loop Descriptor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.json.impl.JSONXPathLoopDescriptorImpl
     * @see org.talend.repository.model.json.impl.JsonPackageImpl#getJSONXPathLoopDescriptor()
     * @generated
     */
    int JSONX_PATH_LOOP_DESCRIPTOR = 2;

    /**
     * The feature id for the '<em><b>Limit Boucle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSONX_PATH_LOOP_DESCRIPTOR__LIMIT_BOUCLE = 0;

    /**
     * The feature id for the '<em><b>Absolute XPath Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSONX_PATH_LOOP_DESCRIPTOR__ABSOLUTE_XPATH_QUERY = 1;

    /**
     * The feature id for the '<em><b>Connection</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION = 2;

    /**
     * The feature id for the '<em><b>Schema Targets</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS = 3;

    /**
     * The feature id for the '<em><b>Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSONX_PATH_LOOP_DESCRIPTOR__FLAG = 4;

    /**
     * The number of structural features of the '<em>JSONX Path Loop Descriptor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSONX_PATH_LOOP_DESCRIPTOR_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.talend.repository.model.json.impl.JSONFileNodeImpl <em>JSON File Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.json.impl.JSONFileNodeImpl
     * @see org.talend.repository.model.json.impl.JsonPackageImpl#getJSONFileNode()
     * @generated
     */
    int JSON_FILE_NODE = 3;

    /**
     * The feature id for the '<em><b>JSON Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_NODE__JSON_PATH = 0;

    /**
     * The feature id for the '<em><b>Related Column</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_NODE__RELATED_COLUMN = 1;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_NODE__DEFAULT_VALUE = 2;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_NODE__ATTRIBUTE = 3;

    /**
     * The feature id for the '<em><b>Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_NODE__ORDER = 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_NODE__TYPE = 5;

    /**
     * The number of structural features of the '<em>JSON File Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JSON_FILE_NODE_FEATURE_COUNT = 6;


    /**
     * The meta object id for the '{@link org.talend.repository.model.json.impl.SchemaTargetImpl <em>Schema Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.json.impl.SchemaTargetImpl
     * @see org.talend.repository.model.json.impl.JsonPackageImpl#getSchemaTarget()
     * @generated
     */
    int SCHEMA_TARGET = 4;

    /**
     * The feature id for the '<em><b>Relative XPath Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TARGET__RELATIVE_XPATH_QUERY = 0;

    /**
     * The feature id for the '<em><b>Tag Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TARGET__TAG_NAME = 1;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TARGET__SCHEMA = 2;

    /**
     * The number of structural features of the '<em>Schema Target</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TARGET_FEATURE_COUNT = 3;


    /**
     * Returns the meta object for class '{@link org.talend.repository.model.json.JSONFileConnection <em>JSON File Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JSON File Connection</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection
     * @generated
     */
    EClass getJSONFileConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileConnection#getJSONFilePath <em>JSON File Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>JSON File Path</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#getJSONFilePath()
     * @see #getJSONFileConnection()
     * @generated
     */
    EAttribute getJSONFileConnection_JSONFilePath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileConnection#isGuess <em>Guess</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Guess</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#isGuess()
     * @see #getJSONFileConnection()
     * @generated
     */
    EAttribute getJSONFileConnection_Guess();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileConnection#getMaskXPattern <em>Mask XPattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mask XPattern</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#getMaskXPattern()
     * @see #getJSONFileConnection()
     * @generated
     */
    EAttribute getJSONFileConnection_MaskXPattern();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.repository.model.json.JSONFileConnection#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Schema</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#getSchema()
     * @see #getJSONFileConnection()
     * @generated
     */
    EReference getJSONFileConnection_Schema();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileConnection#getEncoding <em>Encoding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Encoding</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#getEncoding()
     * @see #getJSONFileConnection()
     * @generated
     */
    EAttribute getJSONFileConnection_Encoding();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.repository.model.json.JSONFileConnection#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Group</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#getGroup()
     * @see #getJSONFileConnection()
     * @generated
     */
    EReference getJSONFileConnection_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.repository.model.json.JSONFileConnection#getRoot <em>Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Root</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#getRoot()
     * @see #getJSONFileConnection()
     * @generated
     */
    EReference getJSONFileConnection_Root();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.repository.model.json.JSONFileConnection#getLoop <em>Loop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Loop</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#getLoop()
     * @see #getJSONFileConnection()
     * @generated
     */
    EReference getJSONFileConnection_Loop();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileConnection#isInputModel <em>Input Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Model</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#isInputModel()
     * @see #getJSONFileConnection()
     * @generated
     */
    EAttribute getJSONFileConnection_InputModel();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileConnection#getOutputFilePath <em>Output File Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output File Path</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#getOutputFilePath()
     * @see #getJSONFileConnection()
     * @generated
     */
    EAttribute getJSONFileConnection_OutputFilePath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileConnection#getFileContent <em>File Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Content</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#getFileContent()
     * @see #getJSONFileConnection()
     * @generated
     */
    EAttribute getJSONFileConnection_FileContent();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileConnection#getReadbyMode <em>Readby Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Readby Mode</em>'.
     * @see org.talend.repository.model.json.JSONFileConnection#getReadbyMode()
     * @see #getJSONFileConnection()
     * @generated
     */
    EAttribute getJSONFileConnection_ReadbyMode();

    /**
     * Returns the meta object for class '{@link org.talend.repository.model.json.JSONFileConnectionItem <em>JSON File Connection Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JSON File Connection Item</em>'.
     * @see org.talend.repository.model.json.JSONFileConnectionItem
     * @generated
     */
    EClass getJSONFileConnectionItem();

    /**
     * Returns the meta object for class '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor <em>JSONX Path Loop Descriptor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JSONX Path Loop Descriptor</em>'.
     * @see org.talend.repository.model.json.JSONXPathLoopDescriptor
     * @generated
     */
    EClass getJSONXPathLoopDescriptor();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getLimitBoucle <em>Limit Boucle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Limit Boucle</em>'.
     * @see org.talend.repository.model.json.JSONXPathLoopDescriptor#getLimitBoucle()
     * @see #getJSONXPathLoopDescriptor()
     * @generated
     */
    EAttribute getJSONXPathLoopDescriptor_LimitBoucle();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getAbsoluteXPathQuery <em>Absolute XPath Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Absolute XPath Query</em>'.
     * @see org.talend.repository.model.json.JSONXPathLoopDescriptor#getAbsoluteXPathQuery()
     * @see #getJSONXPathLoopDescriptor()
     * @generated
     */
    EAttribute getJSONXPathLoopDescriptor_AbsoluteXPathQuery();

    /**
     * Returns the meta object for the container reference '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Connection</em>'.
     * @see org.talend.repository.model.json.JSONXPathLoopDescriptor#getConnection()
     * @see #getJSONXPathLoopDescriptor()
     * @generated
     */
    EReference getJSONXPathLoopDescriptor_Connection();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getSchemaTargets <em>Schema Targets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Schema Targets</em>'.
     * @see org.talend.repository.model.json.JSONXPathLoopDescriptor#getSchemaTargets()
     * @see #getJSONXPathLoopDescriptor()
     * @generated
     */
    EReference getJSONXPathLoopDescriptor_SchemaTargets();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getFlag <em>Flag</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flag</em>'.
     * @see org.talend.repository.model.json.JSONXPathLoopDescriptor#getFlag()
     * @see #getJSONXPathLoopDescriptor()
     * @generated
     */
    EAttribute getJSONXPathLoopDescriptor_Flag();

    /**
     * Returns the meta object for class '{@link org.talend.repository.model.json.JSONFileNode <em>JSON File Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JSON File Node</em>'.
     * @see org.talend.repository.model.json.JSONFileNode
     * @generated
     */
    EClass getJSONFileNode();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileNode#getJSONPath <em>JSON Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>JSON Path</em>'.
     * @see org.talend.repository.model.json.JSONFileNode#getJSONPath()
     * @see #getJSONFileNode()
     * @generated
     */
    EAttribute getJSONFileNode_JSONPath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileNode#getRelatedColumn <em>Related Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Related Column</em>'.
     * @see org.talend.repository.model.json.JSONFileNode#getRelatedColumn()
     * @see #getJSONFileNode()
     * @generated
     */
    EAttribute getJSONFileNode_RelatedColumn();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileNode#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.talend.repository.model.json.JSONFileNode#getDefaultValue()
     * @see #getJSONFileNode()
     * @generated
     */
    EAttribute getJSONFileNode_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileNode#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attribute</em>'.
     * @see org.talend.repository.model.json.JSONFileNode#getAttribute()
     * @see #getJSONFileNode()
     * @generated
     */
    EAttribute getJSONFileNode_Attribute();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileNode#getOrder <em>Order</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Order</em>'.
     * @see org.talend.repository.model.json.JSONFileNode#getOrder()
     * @see #getJSONFileNode()
     * @generated
     */
    EAttribute getJSONFileNode_Order();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.JSONFileNode#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.talend.repository.model.json.JSONFileNode#getType()
     * @see #getJSONFileNode()
     * @generated
     */
    EAttribute getJSONFileNode_Type();

    /**
     * Returns the meta object for class '{@link org.talend.repository.model.json.SchemaTarget <em>Schema Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schema Target</em>'.
     * @see org.talend.repository.model.json.SchemaTarget
     * @generated
     */
    EClass getSchemaTarget();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.SchemaTarget#getRelativeXPathQuery <em>Relative XPath Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Relative XPath Query</em>'.
     * @see org.talend.repository.model.json.SchemaTarget#getRelativeXPathQuery()
     * @see #getSchemaTarget()
     * @generated
     */
    EAttribute getSchemaTarget_RelativeXPathQuery();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.json.SchemaTarget#getTagName <em>Tag Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tag Name</em>'.
     * @see org.talend.repository.model.json.SchemaTarget#getTagName()
     * @see #getSchemaTarget()
     * @generated
     */
    EAttribute getSchemaTarget_TagName();

    /**
     * Returns the meta object for the container reference '{@link org.talend.repository.model.json.SchemaTarget#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Schema</em>'.
     * @see org.talend.repository.model.json.SchemaTarget#getSchema()
     * @see #getSchemaTarget()
     * @generated
     */
    EReference getSchemaTarget_Schema();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    JsonFactory getJsonFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl <em>JSON File Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.json.impl.JSONFileConnectionImpl
         * @see org.talend.repository.model.json.impl.JsonPackageImpl#getJSONFileConnection()
         * @generated
         */
        EClass JSON_FILE_CONNECTION = eINSTANCE.getJSONFileConnection();

        /**
         * The meta object literal for the '<em><b>JSON File Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_CONNECTION__JSON_FILE_PATH = eINSTANCE.getJSONFileConnection_JSONFilePath();

        /**
         * The meta object literal for the '<em><b>Guess</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_CONNECTION__GUESS = eINSTANCE.getJSONFileConnection_Guess();

        /**
         * The meta object literal for the '<em><b>Mask XPattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_CONNECTION__MASK_XPATTERN = eINSTANCE.getJSONFileConnection_MaskXPattern();

        /**
         * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JSON_FILE_CONNECTION__SCHEMA = eINSTANCE.getJSONFileConnection_Schema();

        /**
         * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_CONNECTION__ENCODING = eINSTANCE.getJSONFileConnection_Encoding();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JSON_FILE_CONNECTION__GROUP = eINSTANCE.getJSONFileConnection_Group();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JSON_FILE_CONNECTION__ROOT = eINSTANCE.getJSONFileConnection_Root();

        /**
         * The meta object literal for the '<em><b>Loop</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JSON_FILE_CONNECTION__LOOP = eINSTANCE.getJSONFileConnection_Loop();

        /**
         * The meta object literal for the '<em><b>Input Model</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_CONNECTION__INPUT_MODEL = eINSTANCE.getJSONFileConnection_InputModel();

        /**
         * The meta object literal for the '<em><b>Output File Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_CONNECTION__OUTPUT_FILE_PATH = eINSTANCE.getJSONFileConnection_OutputFilePath();

        /**
         * The meta object literal for the '<em><b>File Content</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_CONNECTION__FILE_CONTENT = eINSTANCE.getJSONFileConnection_FileContent();

        /**
         * The meta object literal for the '<em><b>Readby Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_CONNECTION__READBY_MODE = eINSTANCE.getJSONFileConnection_ReadbyMode();

        /**
         * The meta object literal for the '{@link org.talend.repository.model.json.impl.JSONFileConnectionItemImpl <em>JSON File Connection Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.json.impl.JSONFileConnectionItemImpl
         * @see org.talend.repository.model.json.impl.JsonPackageImpl#getJSONFileConnectionItem()
         * @generated
         */
        EClass JSON_FILE_CONNECTION_ITEM = eINSTANCE.getJSONFileConnectionItem();

        /**
         * The meta object literal for the '{@link org.talend.repository.model.json.impl.JSONXPathLoopDescriptorImpl <em>JSONX Path Loop Descriptor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.json.impl.JSONXPathLoopDescriptorImpl
         * @see org.talend.repository.model.json.impl.JsonPackageImpl#getJSONXPathLoopDescriptor()
         * @generated
         */
        EClass JSONX_PATH_LOOP_DESCRIPTOR = eINSTANCE.getJSONXPathLoopDescriptor();

        /**
         * The meta object literal for the '<em><b>Limit Boucle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSONX_PATH_LOOP_DESCRIPTOR__LIMIT_BOUCLE = eINSTANCE.getJSONXPathLoopDescriptor_LimitBoucle();

        /**
         * The meta object literal for the '<em><b>Absolute XPath Query</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSONX_PATH_LOOP_DESCRIPTOR__ABSOLUTE_XPATH_QUERY = eINSTANCE.getJSONXPathLoopDescriptor_AbsoluteXPathQuery();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION = eINSTANCE.getJSONXPathLoopDescriptor_Connection();

        /**
         * The meta object literal for the '<em><b>Schema Targets</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS = eINSTANCE.getJSONXPathLoopDescriptor_SchemaTargets();

        /**
         * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSONX_PATH_LOOP_DESCRIPTOR__FLAG = eINSTANCE.getJSONXPathLoopDescriptor_Flag();

        /**
         * The meta object literal for the '{@link org.talend.repository.model.json.impl.JSONFileNodeImpl <em>JSON File Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.json.impl.JSONFileNodeImpl
         * @see org.talend.repository.model.json.impl.JsonPackageImpl#getJSONFileNode()
         * @generated
         */
        EClass JSON_FILE_NODE = eINSTANCE.getJSONFileNode();

        /**
         * The meta object literal for the '<em><b>JSON Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_NODE__JSON_PATH = eINSTANCE.getJSONFileNode_JSONPath();

        /**
         * The meta object literal for the '<em><b>Related Column</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_NODE__RELATED_COLUMN = eINSTANCE.getJSONFileNode_RelatedColumn();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_NODE__DEFAULT_VALUE = eINSTANCE.getJSONFileNode_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_NODE__ATTRIBUTE = eINSTANCE.getJSONFileNode_Attribute();

        /**
         * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_NODE__ORDER = eINSTANCE.getJSONFileNode_Order();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JSON_FILE_NODE__TYPE = eINSTANCE.getJSONFileNode_Type();

        /**
         * The meta object literal for the '{@link org.talend.repository.model.json.impl.SchemaTargetImpl <em>Schema Target</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.json.impl.SchemaTargetImpl
         * @see org.talend.repository.model.json.impl.JsonPackageImpl#getSchemaTarget()
         * @generated
         */
        EClass SCHEMA_TARGET = eINSTANCE.getSchemaTarget();

        /**
         * The meta object literal for the '<em><b>Relative XPath Query</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TARGET__RELATIVE_XPATH_QUERY = eINSTANCE.getSchemaTarget_RelativeXPathQuery();

        /**
         * The meta object literal for the '<em><b>Tag Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TARGET__TAG_NAME = eINSTANCE.getSchemaTarget_TagName();

        /**
         * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TARGET__SCHEMA = eINSTANCE.getSchemaTarget_Schema();

    }

} //JsonPackage
