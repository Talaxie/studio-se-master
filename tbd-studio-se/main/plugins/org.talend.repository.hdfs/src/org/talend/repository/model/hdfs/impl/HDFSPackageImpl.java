/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.hdfs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.talend.repository.model.hadoopcluster.HadoopClusterPackage;

import org.talend.repository.model.hdfs.HDFSConnection;
import org.talend.repository.model.hdfs.HDFSConnectionItem;
import org.talend.repository.model.hdfs.HDFSFactory;
import org.talend.repository.model.hdfs.HDFSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HDFSPackageImpl extends EPackageImpl implements HDFSPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hdfsConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hdfsConnectionItemEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.repository.model.hdfs.HDFSPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private HDFSPackageImpl() {
        super(eNS_URI, HDFSFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link HDFSPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static HDFSPackage init() {
        if (isInited) return (HDFSPackage)EPackage.Registry.INSTANCE.getEPackage(HDFSPackage.eNS_URI);

        // Obtain or create and register package
        HDFSPackageImpl theHDFSPackage = (HDFSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HDFSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HDFSPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        HadoopClusterPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theHDFSPackage.createPackageContents();

        // Initialize created meta-data
        theHDFSPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theHDFSPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(HDFSPackage.eNS_URI, theHDFSPackage);
        return theHDFSPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHDFSConnection() {
        return hdfsConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_Distribution() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_DfVersion() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_DfDrivers() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_NameNodeURI() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_EnableKerberos() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_Principal() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_UserName() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_Group() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_RowSeparator() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_FieldSeparator() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_UseHeader() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_HeaderValue() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHDFSConnection_FirstLineCaption() {
        return (EAttribute)hdfsConnectionEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHDFSConnectionItem() {
        return hdfsConnectionItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HDFSFactory getHDFSFactory() {
        return (HDFSFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        hdfsConnectionEClass = createEClass(HDFS_CONNECTION);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__DISTRIBUTION);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__DF_VERSION);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__DF_DRIVERS);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__NAME_NODE_URI);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__ENABLE_KERBEROS);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__PRINCIPAL);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__USER_NAME);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__GROUP);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__ROW_SEPARATOR);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__FIELD_SEPARATOR);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__USE_HEADER);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__HEADER_VALUE);
        createEAttribute(hdfsConnectionEClass, HDFS_CONNECTION__FIRST_LINE_CAPTION);

        hdfsConnectionItemEClass = createEClass(HDFS_CONNECTION_ITEM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
        HadoopClusterPackage theHadoopClusterPackage = (HadoopClusterPackage)EPackage.Registry.INSTANCE.getEPackage(HadoopClusterPackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        hdfsConnectionEClass.getESuperTypes().add(theHadoopClusterPackage.getHadoopSubConnection());
        hdfsConnectionItemEClass.getESuperTypes().add(theHadoopClusterPackage.getHadoopSubConnectionItem());

        // Initialize classes and features; add operations and parameters
        initEClass(hdfsConnectionEClass, HDFSConnection.class, "HDFSConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHDFSConnection_Distribution(), theEcorePackage.getEString(), "distribution", null, 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_DfVersion(), theEcorePackage.getEString(), "dfVersion", null, 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_DfDrivers(), theEcorePackage.getEString(), "dfDrivers", null, 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_NameNodeURI(), theEcorePackage.getEString(), "nameNodeURI", "hdfs://localhost:9000/", 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_EnableKerberos(), theEcorePackage.getEBoolean(), "enableKerberos", null, 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_Principal(), theEcorePackage.getEString(), "principal", "nn/_HOST@EXAMPLE.COM", 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_UserName(), theEcorePackage.getEString(), "userName", "anonymous", 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_Group(), theEcorePackage.getEString(), "group", null, 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_RowSeparator(), theEcorePackage.getEString(), "rowSeparator", null, 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_FieldSeparator(), theEcorePackage.getEString(), "fieldSeparator", null, 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_UseHeader(), ecorePackage.getEBoolean(), "useHeader", null, 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_HeaderValue(), ecorePackage.getEString(), "headerValue", null, 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHDFSConnection_FirstLineCaption(), ecorePackage.getEBoolean(), "firstLineCaption", null, 0, 1, HDFSConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hdfsConnectionItemEClass, HDFSConnectionItem.class, "HDFSConnectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //HDFSPackageImpl
