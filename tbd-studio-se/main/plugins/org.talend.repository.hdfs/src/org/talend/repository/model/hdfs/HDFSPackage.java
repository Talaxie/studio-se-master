/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.hdfs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.talend.repository.model.hadoopcluster.HadoopClusterPackage;

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
 * @see org.talend.repository.model.hdfs.HDFSFactory
 * @model kind="package"
 * @generated
 */
public interface HDFSPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "hdfs";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.talend.org/hdfs";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TalendHDFS";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HDFSPackage eINSTANCE = org.talend.repository.model.hdfs.impl.HDFSPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.hdfs.impl.HDFSConnectionImpl
     * @see org.talend.repository.model.hdfs.impl.HDFSPackageImpl#getHDFSConnection()
     * @generated
     */
    int HDFS_CONNECTION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__NAME = HadoopClusterPackage.HADOOP_SUB_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__VISIBILITY = HadoopClusterPackage.HADOOP_SUB_CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__CLIENT_DEPENDENCY = HadoopClusterPackage.HADOOP_SUB_CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__SUPPLIER_DEPENDENCY = HadoopClusterPackage.HADOOP_SUB_CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__CONSTRAINT = HadoopClusterPackage.HADOOP_SUB_CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__NAMESPACE = HadoopClusterPackage.HADOOP_SUB_CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__IMPORTER = HadoopClusterPackage.HADOOP_SUB_CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__STEREOTYPE = HadoopClusterPackage.HADOOP_SUB_CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__TAGGED_VALUE = HadoopClusterPackage.HADOOP_SUB_CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__DOCUMENT = HadoopClusterPackage.HADOOP_SUB_CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__DESCRIPTION = HadoopClusterPackage.HADOOP_SUB_CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__RESPONSIBLE_PARTY = HadoopClusterPackage.HADOOP_SUB_CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__ELEMENT_NODE = HadoopClusterPackage.HADOOP_SUB_CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__SET = HadoopClusterPackage.HADOOP_SUB_CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__RENDERED_OBJECT = HadoopClusterPackage.HADOOP_SUB_CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__VOCABULARY_ELEMENT = HadoopClusterPackage.HADOOP_SUB_CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__MEASUREMENT = HadoopClusterPackage.HADOOP_SUB_CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__CHANGE_REQUEST = HadoopClusterPackage.HADOOP_SUB_CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__DASDL_PROPERTY = HadoopClusterPackage.HADOOP_SUB_CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__PROPERTIES = HadoopClusterPackage.HADOOP_SUB_CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__ID = HadoopClusterPackage.HADOOP_SUB_CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__COMMENT = HadoopClusterPackage.HADOOP_SUB_CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__LABEL = HadoopClusterPackage.HADOOP_SUB_CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__READ_ONLY = HadoopClusterPackage.HADOOP_SUB_CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__SYNCHRONISED = HadoopClusterPackage.HADOOP_SUB_CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__DIVERGENCY = HadoopClusterPackage.HADOOP_SUB_CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__OWNED_ELEMENT = HadoopClusterPackage.HADOOP_SUB_CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__IMPORTED_ELEMENT = HadoopClusterPackage.HADOOP_SUB_CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__DATA_MANAGER = HadoopClusterPackage.HADOOP_SUB_CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__PATHNAME = HadoopClusterPackage.HADOOP_SUB_CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__MACHINE = HadoopClusterPackage.HADOOP_SUB_CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = HadoopClusterPackage.HADOOP_SUB_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__COMPONENT = HadoopClusterPackage.HADOOP_SUB_CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__IS_CASE_SENSITIVE = HadoopClusterPackage.HADOOP_SUB_CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__CLIENT_CONNECTION = HadoopClusterPackage.HADOOP_SUB_CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__DATA_PACKAGE = HadoopClusterPackage.HADOOP_SUB_CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__RESOURCE_CONNECTION = HadoopClusterPackage.HADOOP_SUB_CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__VERSION = HadoopClusterPackage.HADOOP_SUB_CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__QUERIES = HadoopClusterPackage.HADOOP_SUB_CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__CONTEXT_MODE = HadoopClusterPackage.HADOOP_SUB_CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__CONTEXT_ID = HadoopClusterPackage.HADOOP_SUB_CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Context Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__CONTEXT_NAME = HadoopClusterPackage.HADOOP_SUB_CONNECTION__CONTEXT_NAME;

    /**
     * The feature id for the '<em><b>Relative Hadoop Cluster Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__RELATIVE_HADOOP_CLUSTER_ID = HadoopClusterPackage.HADOOP_SUB_CONNECTION__RELATIVE_HADOOP_CLUSTER_ID;

    /**
     * The feature id for the '<em><b>Distribution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__DISTRIBUTION = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Df Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__DF_VERSION = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Df Drivers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__DF_DRIVERS = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name Node URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__NAME_NODE_URI = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Enable Kerberos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__ENABLE_KERBEROS = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Principal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__PRINCIPAL = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__USER_NAME = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__GROUP = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Row Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__ROW_SEPARATOR = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Field Separator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__FIELD_SEPARATOR = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Use Header</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__USE_HEADER = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Header Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__HEADER_VALUE = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>First Line Caption</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION__FIRST_LINE_CAPTION = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 12;

    /**
     * The number of structural features of the '<em>Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION_FEATURE_COUNT = HadoopClusterPackage.HADOOP_SUB_CONNECTION_FEATURE_COUNT + 13;

    /**
     * The meta object id for the '{@link org.talend.repository.model.hdfs.impl.HDFSConnectionItemImpl <em>Connection Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.repository.model.hdfs.impl.HDFSConnectionItemImpl
     * @see org.talend.repository.model.hdfs.impl.HDFSPackageImpl#getHDFSConnectionItem()
     * @generated
     */
    int HDFS_CONNECTION_ITEM = 1;

    /**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION_ITEM__PROPERTY = HadoopClusterPackage.HADOOP_SUB_CONNECTION_ITEM__PROPERTY;

    /**
     * The feature id for the '<em><b>State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION_ITEM__STATE = HadoopClusterPackage.HADOOP_SUB_CONNECTION_ITEM__STATE;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION_ITEM__PARENT = HadoopClusterPackage.HADOOP_SUB_CONNECTION_ITEM__PARENT;

    /**
     * The feature id for the '<em><b>Reference Resources</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION_ITEM__REFERENCE_RESOURCES = HadoopClusterPackage.HADOOP_SUB_CONNECTION_ITEM__REFERENCE_RESOURCES;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION_ITEM__FILE_EXTENSION = HadoopClusterPackage.HADOOP_SUB_CONNECTION_ITEM__FILE_EXTENSION;

    /**
     * The feature id for the '<em><b>Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION_ITEM__CONNECTION = HadoopClusterPackage.HADOOP_SUB_CONNECTION_ITEM__CONNECTION;

    /**
     * The number of structural features of the '<em>Connection Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HDFS_CONNECTION_ITEM_FEATURE_COUNT = HadoopClusterPackage.HADOOP_SUB_CONNECTION_ITEM_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.talend.repository.model.hdfs.HDFSConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection
     * @generated
     */
    EClass getHDFSConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#getDistribution <em>Distribution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Distribution</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#getDistribution()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_Distribution();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#getDfVersion <em>Df Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Df Version</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#getDfVersion()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_DfVersion();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#getDfDrivers <em>Df Drivers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Df Drivers</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#getDfDrivers()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_DfDrivers();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#getNameNodeURI <em>Name Node URI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Node URI</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#getNameNodeURI()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_NameNodeURI();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#isEnableKerberos <em>Enable Kerberos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enable Kerberos</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#isEnableKerberos()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_EnableKerberos();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#getPrincipal <em>Principal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Principal</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#getPrincipal()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_Principal();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#getUserName <em>User Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User Name</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#getUserName()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_UserName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#getGroup()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_Group();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#getRowSeparator <em>Row Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Row Separator</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#getRowSeparator()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_RowSeparator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#getFieldSeparator <em>Field Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field Separator</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#getFieldSeparator()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_FieldSeparator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#isUseHeader <em>Use Header</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Header</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#isUseHeader()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_UseHeader();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#getHeaderValue <em>Header Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Header Value</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#getHeaderValue()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_HeaderValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.repository.model.hdfs.HDFSConnection#isFirstLineCaption <em>First Line Caption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>First Line Caption</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnection#isFirstLineCaption()
     * @see #getHDFSConnection()
     * @generated
     */
    EAttribute getHDFSConnection_FirstLineCaption();

    /**
     * Returns the meta object for class '{@link org.talend.repository.model.hdfs.HDFSConnectionItem <em>Connection Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Item</em>'.
     * @see org.talend.repository.model.hdfs.HDFSConnectionItem
     * @generated
     */
    EClass getHDFSConnectionItem();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    HDFSFactory getHDFSFactory();

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
         * The meta object literal for the '{@link org.talend.repository.model.hdfs.impl.HDFSConnectionImpl <em>Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.hdfs.impl.HDFSConnectionImpl
         * @see org.talend.repository.model.hdfs.impl.HDFSPackageImpl#getHDFSConnection()
         * @generated
         */
        EClass HDFS_CONNECTION = eINSTANCE.getHDFSConnection();

        /**
         * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__DISTRIBUTION = eINSTANCE.getHDFSConnection_Distribution();

        /**
         * The meta object literal for the '<em><b>Df Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__DF_VERSION = eINSTANCE.getHDFSConnection_DfVersion();

        /**
         * The meta object literal for the '<em><b>Df Drivers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__DF_DRIVERS = eINSTANCE.getHDFSConnection_DfDrivers();

        /**
         * The meta object literal for the '<em><b>Name Node URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__NAME_NODE_URI = eINSTANCE.getHDFSConnection_NameNodeURI();

        /**
         * The meta object literal for the '<em><b>Enable Kerberos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__ENABLE_KERBEROS = eINSTANCE.getHDFSConnection_EnableKerberos();

        /**
         * The meta object literal for the '<em><b>Principal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__PRINCIPAL = eINSTANCE.getHDFSConnection_Principal();

        /**
         * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__USER_NAME = eINSTANCE.getHDFSConnection_UserName();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__GROUP = eINSTANCE.getHDFSConnection_Group();

        /**
         * The meta object literal for the '<em><b>Row Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__ROW_SEPARATOR = eINSTANCE.getHDFSConnection_RowSeparator();

        /**
         * The meta object literal for the '<em><b>Field Separator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__FIELD_SEPARATOR = eINSTANCE.getHDFSConnection_FieldSeparator();

        /**
         * The meta object literal for the '<em><b>Use Header</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__USE_HEADER = eINSTANCE.getHDFSConnection_UseHeader();

        /**
         * The meta object literal for the '<em><b>Header Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__HEADER_VALUE = eINSTANCE.getHDFSConnection_HeaderValue();

        /**
         * The meta object literal for the '<em><b>First Line Caption</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HDFS_CONNECTION__FIRST_LINE_CAPTION = eINSTANCE.getHDFSConnection_FirstLineCaption();

        /**
         * The meta object literal for the '{@link org.talend.repository.model.hdfs.impl.HDFSConnectionItemImpl <em>Connection Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.repository.model.hdfs.impl.HDFSConnectionItemImpl
         * @see org.talend.repository.model.hdfs.impl.HDFSPackageImpl#getHDFSConnectionItem()
         * @generated
         */
        EClass HDFS_CONNECTION_ITEM = eINSTANCE.getHDFSConnectionItem();

    }

} //HDFSPackage
