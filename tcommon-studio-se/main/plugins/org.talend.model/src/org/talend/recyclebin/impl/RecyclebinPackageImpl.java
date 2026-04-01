/**
 */
package org.talend.recyclebin.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.talend.recyclebin.RecycleBin;
import org.talend.recyclebin.RecyclebinFactory;
import org.talend.recyclebin.RecyclebinPackage;
import org.talend.recyclebin.TalendItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecyclebinPackageImpl extends EPackageImpl implements RecyclebinPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass recycleBinEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass talendItemEClass = null;

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
     * @see org.talend.recyclebin.RecyclebinPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RecyclebinPackageImpl() {
        super(eNS_URI, RecyclebinFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link RecyclebinPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RecyclebinPackage init() {
        if (isInited) return (RecyclebinPackage)EPackage.Registry.INSTANCE.getEPackage(RecyclebinPackage.eNS_URI);

        // Obtain or create and register package
        RecyclebinPackageImpl theRecyclebinPackage = (RecyclebinPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RecyclebinPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RecyclebinPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theRecyclebinPackage.createPackageContents();

        // Initialize created meta-data
        theRecyclebinPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRecyclebinPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RecyclebinPackage.eNS_URI, theRecyclebinPackage);
        return theRecyclebinPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRecycleBin() {
        return recycleBinEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRecycleBin_DeletedFolders() {
        return (EAttribute)recycleBinEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecycleBin_DeletedItems() {
        return (EReference)recycleBinEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTalendItem() {
        return talendItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTalendItem_Id() {
        return (EAttribute)talendItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTalendItem_Path() {
        return (EAttribute)talendItemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTalendItem_Type() {
        return (EAttribute)talendItemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecyclebinFactory getRecyclebinFactory() {
        return (RecyclebinFactory)getEFactoryInstance();
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
        recycleBinEClass = createEClass(RECYCLE_BIN);
        createEAttribute(recycleBinEClass, RECYCLE_BIN__DELETED_FOLDERS);
        createEReference(recycleBinEClass, RECYCLE_BIN__DELETED_ITEMS);

        talendItemEClass = createEClass(TALEND_ITEM);
        createEAttribute(talendItemEClass, TALEND_ITEM__ID);
        createEAttribute(talendItemEClass, TALEND_ITEM__PATH);
        createEAttribute(talendItemEClass, TALEND_ITEM__TYPE);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(recycleBinEClass, RecycleBin.class, "RecycleBin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRecycleBin_DeletedFolders(), ecorePackage.getEString(), "deletedFolders", null, 0, -1, RecycleBin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRecycleBin_DeletedItems(), this.getTalendItem(), null, "deletedItems", null, 0, -1, RecycleBin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(talendItemEClass, TalendItem.class, "TalendItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTalendItem_Id(), ecorePackage.getEString(), "id", null, 0, 1, TalendItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTalendItem_Path(), ecorePackage.getEString(), "path", null, 0, 1, TalendItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTalendItem_Type(), ecorePackage.getEString(), "type", null, 0, 1, TalendItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //RecyclebinPackageImpl
