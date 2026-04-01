/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.example.model.demo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.talend.core.model.metadata.builder.connection.ConnectionPackage;

import org.talend.core.model.properties.PropertiesPackage;

import org.talend.repository.example.model.demo.DemoFactory;
import org.talend.repository.example.model.demo.DemoPackage;
import org.talend.repository.example.model.demo.ExampleDemoConnection;
import org.talend.repository.example.model.demo.ExampleDemoConnectionItem;
import org.talend.repository.example.model.demo.ExtendedExampleDemoConnectionItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoPackageImpl extends EPackageImpl implements DemoPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exampleDemoConnectionItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exampleDemoConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extendedExampleDemoConnectionItemEClass = null;

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
     * @see org.talend.repository.example.model.demo.DemoPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DemoPackageImpl() {
        super(eNS_URI, DemoFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DemoPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DemoPackage init() {
        if (isInited) return (DemoPackage)EPackage.Registry.INSTANCE.getEPackage(DemoPackage.eNS_URI);

        // Obtain or create and register package
        DemoPackageImpl theDemoPackage = (DemoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DemoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DemoPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PropertiesPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theDemoPackage.createPackageContents();

        // Initialize created meta-data
        theDemoPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDemoPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DemoPackage.eNS_URI, theDemoPackage);
        return theDemoPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExampleDemoConnectionItem() {
        return exampleDemoConnectionItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExampleDemoConnection() {
        return exampleDemoConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExampleDemoConnection_Type() {
        return (EAttribute)exampleDemoConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExampleDemoConnection_Valid() {
        return (EAttribute)exampleDemoConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtendedExampleDemoConnectionItem() {
        return extendedExampleDemoConnectionItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DemoFactory getDemoFactory() {
        return (DemoFactory)getEFactoryInstance();
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
        exampleDemoConnectionItemEClass = createEClass(EXAMPLE_DEMO_CONNECTION_ITEM);

        exampleDemoConnectionEClass = createEClass(EXAMPLE_DEMO_CONNECTION);
        createEAttribute(exampleDemoConnectionEClass, EXAMPLE_DEMO_CONNECTION__TYPE);
        createEAttribute(exampleDemoConnectionEClass, EXAMPLE_DEMO_CONNECTION__VALID);

        extendedExampleDemoConnectionItemEClass = createEClass(EXTENDED_EXAMPLE_DEMO_CONNECTION_ITEM);
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
        PropertiesPackage thePropertiesPackage = (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);
        ConnectionPackage theConnectionPackage = (ConnectionPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        exampleDemoConnectionItemEClass.getESuperTypes().add(thePropertiesPackage.getConnectionItem());
        exampleDemoConnectionEClass.getESuperTypes().add(theConnectionPackage.getConnection());
        extendedExampleDemoConnectionItemEClass.getESuperTypes().add(this.getExampleDemoConnectionItem());

        // Initialize classes and features; add operations and parameters
        initEClass(exampleDemoConnectionItemEClass, ExampleDemoConnectionItem.class, "ExampleDemoConnectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(exampleDemoConnectionEClass, ExampleDemoConnection.class, "ExampleDemoConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExampleDemoConnection_Type(), ecorePackage.getEString(), "type", null, 0, 1, ExampleDemoConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExampleDemoConnection_Valid(), ecorePackage.getEBoolean(), "valid", null, 0, 1, ExampleDemoConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extendedExampleDemoConnectionItemEClass, ExtendedExampleDemoConnectionItem.class, "ExtendedExampleDemoConnectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //DemoPackageImpl
