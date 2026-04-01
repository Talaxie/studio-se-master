/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.joblet.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;
import org.talend.designer.joblet.model.JobletFactory;
import org.talend.designer.joblet.model.JobletNode;
import org.talend.designer.joblet.model.JobletPackage;
import org.talend.designer.joblet.model.JobletProcess;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class JobletPackageImpl extends EPackageImpl implements JobletPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass jobletProcessEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass jobletNodeEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.designer.joblet.model.JobletPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private JobletPackageImpl() {
        super(eNS_URI, JobletFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this
     * model, and for any others upon which it depends.  Simple
     * dependencies are satisfied by calling this method on all
     * dependent packages before doing anything else.  This method drives
     * initialization for interdependent packages directly, in parallel
     * with this package, itself.
     * <p>Of this package and its interdependencies, all packages which
     * have not yet been registered by their URI values are first created
     * and registered.  The packages are then initialized in two steps:
     * meta-model objects for all of the packages are created before any
     * are initialized, since one package's meta-model objects may refer to
     * those of another.
     * <p>Invocation of this method will not affect any packages that have
     * already been initialized.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static JobletPackage init() {
        if (isInited) return (JobletPackage)EPackage.Registry.INSTANCE.getEPackage(JobletPackage.eNS_URI);

        // Obtain or create and register package
        JobletPackageImpl theJobletPackage = (JobletPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof JobletPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new JobletPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        TalendFilePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theJobletPackage.createPackageContents();

        // Initialize created meta-data
        theJobletPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theJobletPackage.freeze();

        return theJobletPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getJobletProcess() {
        return jobletProcessEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getJobletProcess_JobletNodes() {
        return (EReference)jobletProcessEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getJobletNode() {
        return jobletNodeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJobletNode_Description() {
        return (EAttribute)jobletNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJobletNode_Input() {
        return (EAttribute)jobletNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJobletNode_Trigger() {
        return (EAttribute)jobletNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public JobletFactory getJobletFactory() {
        return (JobletFactory)getEFactoryInstance();
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
        jobletProcessEClass = createEClass(JOBLET_PROCESS);
        createEReference(jobletProcessEClass, JOBLET_PROCESS__JOBLET_NODES);

        jobletNodeEClass = createEClass(JOBLET_NODE);
        createEAttribute(jobletNodeEClass, JOBLET_NODE__DESCRIPTION);
        createEAttribute(jobletNodeEClass, JOBLET_NODE__INPUT);
        createEAttribute(jobletNodeEClass, JOBLET_NODE__TRIGGER);
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
        TalendFilePackage theTalendFilePackage = (TalendFilePackage)EPackage.Registry.INSTANCE.getEPackage(TalendFilePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        jobletProcessEClass.getESuperTypes().add(theTalendFilePackage.getProcessType());
        jobletNodeEClass.getESuperTypes().add(theTalendFilePackage.getNodeType());

        // Initialize classes and features; add operations and parameters
        initEClass(jobletProcessEClass, JobletProcess.class, "JobletProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJobletProcess_JobletNodes(), this.getJobletNode(), null, "jobletNodes", null, 0, -1, JobletProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jobletNodeEClass, JobletNode.class, "JobletNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJobletNode_Description(), ecorePackage.getEString(), "description", null, 0, 1, JobletNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJobletNode_Input(), ecorePackage.getEBoolean(), "input", null, 0, 1, JobletNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getJobletNode_Trigger(), ecorePackage.getEBoolean(), "trigger", null, 0, 1, JobletNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} // JobletPackageImpl
