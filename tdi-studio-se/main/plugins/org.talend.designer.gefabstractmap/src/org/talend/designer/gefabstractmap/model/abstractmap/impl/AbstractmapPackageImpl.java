/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.gefabstractmap.model.abstractmap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.talend.designer.gefabstractmap.model.abstractmap.AbstractmapFactory;
import org.talend.designer.gefabstractmap.model.abstractmap.AbstractmapPackage;
import org.talend.designer.gefabstractmap.model.abstractmap.MapperTable;
import org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractmapPackageImpl extends EPackageImpl implements AbstractmapPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mapperTableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mapperTableEntityEClass = null;

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
     * @see org.talend.designer.gefabstractmap.model.abstractmap.AbstractmapPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private AbstractmapPackageImpl() {
        super(eNS_URI, AbstractmapFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link AbstractmapPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static AbstractmapPackage init() {
        if (isInited) return (AbstractmapPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractmapPackage.eNS_URI);

        // Obtain or create and register package
        AbstractmapPackageImpl theAbstractmapPackage = (AbstractmapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AbstractmapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AbstractmapPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theAbstractmapPackage.createPackageContents();

        // Initialize created meta-data
        theAbstractmapPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theAbstractmapPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(AbstractmapPackage.eNS_URI, theAbstractmapPackage);
        return theAbstractmapPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMapperTable() {
        return mapperTableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMapperTableEntity() {
        return mapperTableEntityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractmapFactory getAbstractmapFactory() {
        return (AbstractmapFactory)getEFactoryInstance();
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
        mapperTableEClass = createEClass(MAPPER_TABLE);

        mapperTableEntityEClass = createEClass(MAPPER_TABLE_ENTITY);
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

        // Initialize classes and features; add operations and parameters
        initEClass(mapperTableEClass, MapperTable.class, "MapperTable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(mapperTableEntityEClass, MapperTableEntity.class, "MapperTableEntity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //AbstractmapPackageImpl
