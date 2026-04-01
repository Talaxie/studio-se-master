/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.talend.designer.business.model.business.ActionBusinessItem;
import org.talend.designer.business.model.business.ActorBusinessItem;
import org.talend.designer.business.model.business.BaseBusinessItemRelationship;
import org.talend.designer.business.model.business.BidirectionalBusinessItemRelationship;
import org.talend.designer.business.model.business.BusinessAssignment;
import org.talend.designer.business.model.business.BusinessFactory;
import org.talend.designer.business.model.business.BusinessItem;
import org.talend.designer.business.model.business.BusinessItemRelationship;
import org.talend.designer.business.model.business.BusinessItemShape;
import org.talend.designer.business.model.business.BusinessPackage;
import org.talend.designer.business.model.business.BusinessProcess;
import org.talend.designer.business.model.business.Context;
import org.talend.designer.business.model.business.Copybook;
import org.talend.designer.business.model.business.DataBusinessItem;
import org.talend.designer.business.model.business.DatabaseBusinessItem;
import org.talend.designer.business.model.business.DatabaseMetadata;
import org.talend.designer.business.model.business.DecisionBusinessItem;
import org.talend.designer.business.model.business.DirectionalBusinessItemRelationship;
import org.talend.designer.business.model.business.DocumentBusinessItem;
import org.talend.designer.business.model.business.Documentation;
import org.talend.designer.business.model.business.EllipseBusinessItem;
import org.talend.designer.business.model.business.FileDelimitedMetadata;
import org.talend.designer.business.model.business.FileExcelMetadata;
import org.talend.designer.business.model.business.FileLdifMetadata;
import org.talend.designer.business.model.business.FilePositionalMetadata;
import org.talend.designer.business.model.business.FileRegexpMetadata;
import org.talend.designer.business.model.business.FileXmlMetadata;
import org.talend.designer.business.model.business.GearBusinessItem;
import org.talend.designer.business.model.business.GenericSchemaMetadata;
import org.talend.designer.business.model.business.InputBusinessItem;
import org.talend.designer.business.model.business.Joblet;
import org.talend.designer.business.model.business.Ldap;
import org.talend.designer.business.model.business.ListBusinessItem;
import org.talend.designer.business.model.business.Query;
import org.talend.designer.business.model.business.Repository;
import org.talend.designer.business.model.business.Routine;
import org.talend.designer.business.model.business.SAPFunction;
import org.talend.designer.business.model.business.SQLPattern;
import org.talend.designer.business.model.business.Salesforce;
import org.talend.designer.business.model.business.SapFunctionMetadata;
import org.talend.designer.business.model.business.Service;
import org.talend.designer.business.model.business.TableMetadata;
import org.talend.designer.business.model.business.TalendItem;
import org.talend.designer.business.model.business.TerminalBusinessItem;
import org.talend.designer.business.model.business.Wsdl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class BusinessPackageImpl extends EPackageImpl implements BusinessPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public static final String copyright = ""; //$NON-NLS-1$

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass repositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass talendItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass businessProcessEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass processEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass routineEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass documentationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass databaseMetadataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapFunctionMetadataEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass tableMetadataEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass fileDelimitedMetadataEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass filePositionalMetadataEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass businessAssignmentEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass businessItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseBusinessItemRelationshipEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass businessItemRelationshipEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass directionalBusinessItemRelationshipEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bidirectionalBusinessItemRelationshipEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass businessItemShapeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass decisionBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass actionBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass terminalBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass dataBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass documentBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass inputBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass listBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass databaseBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass fileRegexpMetadataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actorBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ellipseBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gearBusinessItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass queryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jobletEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sqlPatternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass salesforceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass copybookEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mdmEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass wsdlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ldapEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapFunctionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileXmlMetadataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileExcelMetadataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileLdifMetadataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass genericSchemaMetadataEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.designer.business.model.business.BusinessPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private BusinessPackageImpl() {
        super(eNS_URI, BusinessFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link BusinessPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static BusinessPackage init() {
        if (isInited) return (BusinessPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI);

        // Obtain or create and register package
        BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BusinessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BusinessPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theBusinessPackage.createPackageContents();

        // Initialize created meta-data
        theBusinessPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theBusinessPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(BusinessPackage.eNS_URI, theBusinessPackage);
        return theBusinessPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getRepository() {
        return repositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getRepository_Talenditems() {
        return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTalendItem() {
        return talendItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTalendItem_Id() {
        return (EAttribute)talendItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTalendItem_Label() {
        return (EAttribute)talendItemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTalendItem_Author() {
        return (EAttribute)talendItemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTalendItem_Version() {
        return (EAttribute)talendItemEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTalendItem_Comment() {
        return (EAttribute)talendItemEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTalendItem_Assignments() {
        return (EReference)talendItemEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getTalendItem_Repository() {
        return (EReference)talendItemEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessProcess() {
        return businessProcessEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessProcess_BusinessItems() {
        return (EReference)businessProcessEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessProcess_LocalRepositoryCopy() {
        return (EReference)businessProcessEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcess() {
        return processEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoutine() {
        return routineEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentation() {
        return documentationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatabaseMetadata() {
        return databaseMetadataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSapFunctionMetadata() {
        return sapFunctionMetadataEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTableMetadata() {
        return tableMetadataEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileDelimitedMetadata() {
        return fileDelimitedMetadataEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getFilePositionalMetadata() {
        return filePositionalMetadataEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessAssignment() {
        return businessAssignmentEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessAssignment_BusinessItem() {
        return (EReference)businessAssignmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessAssignment_TalendItem() {
        return (EReference)businessAssignmentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBusinessAssignment_Comment() {
        return (EAttribute)businessAssignmentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessItem() {
        return businessItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessItem_BusinessProcess() {
        return (EReference)businessItemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBusinessItem_Name() {
        return (EAttribute)businessItemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessItem_Assignments() {
        return (EReference)businessItemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBusinessItem_VAlignment() {
        return (EAttribute)businessItemEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBusinessItem_HAlignment() {
        return (EAttribute)businessItemEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBaseBusinessItemRelationship() {
        return baseBusinessItemRelationshipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseBusinessItemRelationship_Source() {
        return (EReference)baseBusinessItemRelationshipEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseBusinessItemRelationship_Target() {
        return (EReference)baseBusinessItemRelationshipEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessItemRelationship() {
        return businessItemRelationshipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDirectionalBusinessItemRelationship() {
        return directionalBusinessItemRelationshipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBidirectionalBusinessItemRelationship() {
        return bidirectionalBusinessItemRelationshipEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessItemShape() {
        return businessItemShapeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessItemShape_IncomingRelationships() {
        return (EReference)businessItemShapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessItemShape_OutgoingRelationships() {
        return (EReference)businessItemShapeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDecisionBusinessItem() {
        return decisionBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionBusinessItem() {
        return actionBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getTerminalBusinessItem() {
        return terminalBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataBusinessItem() {
        return dataBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentBusinessItem() {
        return documentBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputBusinessItem() {
        return inputBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getListBusinessItem() {
        return listBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatabaseBusinessItem() {
        return databaseBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileRegexpMetadata() {
        return fileRegexpMetadataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActorBusinessItem() {
        return actorBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEllipseBusinessItem() {
        return ellipseBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGearBusinessItem() {
        return gearBusinessItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQuery() {
        return queryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJoblet() {
        return jobletEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSQLPattern() {
        return sqlPatternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSalesforce() {
        return salesforceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCopybook() {
        return copybookEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMDM() {
        return mdmEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWsdl() {
        return wsdlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLdap() {
        return ldapEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPFunction() {
        return sapFunctionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getService() {
        return serviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContext() {
        return contextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileXmlMetadata() {
        return fileXmlMetadataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileExcelMetadata() {
        return fileExcelMetadataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileLdifMetadata() {
        return fileLdifMetadataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGenericSchemaMetadata() {
        return genericSchemaMetadataEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BusinessFactory getBusinessFactory() {
        return (BusinessFactory)getEFactoryInstance();
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
        repositoryEClass = createEClass(REPOSITORY);
        createEReference(repositoryEClass, REPOSITORY__TALENDITEMS);

        talendItemEClass = createEClass(TALEND_ITEM);
        createEAttribute(talendItemEClass, TALEND_ITEM__ID);
        createEAttribute(talendItemEClass, TALEND_ITEM__LABEL);
        createEAttribute(talendItemEClass, TALEND_ITEM__AUTHOR);
        createEAttribute(talendItemEClass, TALEND_ITEM__VERSION);
        createEAttribute(talendItemEClass, TALEND_ITEM__COMMENT);
        createEReference(talendItemEClass, TALEND_ITEM__ASSIGNMENTS);
        createEReference(talendItemEClass, TALEND_ITEM__REPOSITORY);

        businessProcessEClass = createEClass(BUSINESS_PROCESS);
        createEReference(businessProcessEClass, BUSINESS_PROCESS__BUSINESS_ITEMS);
        createEReference(businessProcessEClass, BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY);

        processEClass = createEClass(PROCESS);

        routineEClass = createEClass(ROUTINE);

        documentationEClass = createEClass(DOCUMENTATION);

        databaseMetadataEClass = createEClass(DATABASE_METADATA);

        sapFunctionMetadataEClass = createEClass(SAP_FUNCTION_METADATA);

        tableMetadataEClass = createEClass(TABLE_METADATA);

        fileDelimitedMetadataEClass = createEClass(FILE_DELIMITED_METADATA);

        filePositionalMetadataEClass = createEClass(FILE_POSITIONAL_METADATA);

        fileRegexpMetadataEClass = createEClass(FILE_REGEXP_METADATA);

        fileXmlMetadataEClass = createEClass(FILE_XML_METADATA);

        fileExcelMetadataEClass = createEClass(FILE_EXCEL_METADATA);

        fileLdifMetadataEClass = createEClass(FILE_LDIF_METADATA);

        genericSchemaMetadataEClass = createEClass(GENERIC_SCHEMA_METADATA);

        contextEClass = createEClass(CONTEXT);

        businessAssignmentEClass = createEClass(BUSINESS_ASSIGNMENT);
        createEReference(businessAssignmentEClass, BUSINESS_ASSIGNMENT__BUSINESS_ITEM);
        createEReference(businessAssignmentEClass, BUSINESS_ASSIGNMENT__TALEND_ITEM);
        createEAttribute(businessAssignmentEClass, BUSINESS_ASSIGNMENT__COMMENT);

        businessItemEClass = createEClass(BUSINESS_ITEM);
        createEAttribute(businessItemEClass, BUSINESS_ITEM__NAME);
        createEReference(businessItemEClass, BUSINESS_ITEM__BUSINESS_PROCESS);
        createEReference(businessItemEClass, BUSINESS_ITEM__ASSIGNMENTS);
        createEAttribute(businessItemEClass, BUSINESS_ITEM__VALIGNMENT);
        createEAttribute(businessItemEClass, BUSINESS_ITEM__HALIGNMENT);

        baseBusinessItemRelationshipEClass = createEClass(BASE_BUSINESS_ITEM_RELATIONSHIP);
        createEReference(baseBusinessItemRelationshipEClass, BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE);
        createEReference(baseBusinessItemRelationshipEClass, BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET);

        businessItemRelationshipEClass = createEClass(BUSINESS_ITEM_RELATIONSHIP);

        directionalBusinessItemRelationshipEClass = createEClass(DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP);

        bidirectionalBusinessItemRelationshipEClass = createEClass(BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP);

        businessItemShapeEClass = createEClass(BUSINESS_ITEM_SHAPE);
        createEReference(businessItemShapeEClass, BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS);
        createEReference(businessItemShapeEClass, BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS);

        decisionBusinessItemEClass = createEClass(DECISION_BUSINESS_ITEM);

        actionBusinessItemEClass = createEClass(ACTION_BUSINESS_ITEM);

        terminalBusinessItemEClass = createEClass(TERMINAL_BUSINESS_ITEM);

        dataBusinessItemEClass = createEClass(DATA_BUSINESS_ITEM);

        documentBusinessItemEClass = createEClass(DOCUMENT_BUSINESS_ITEM);

        inputBusinessItemEClass = createEClass(INPUT_BUSINESS_ITEM);

        listBusinessItemEClass = createEClass(LIST_BUSINESS_ITEM);

        databaseBusinessItemEClass = createEClass(DATABASE_BUSINESS_ITEM);

        actorBusinessItemEClass = createEClass(ACTOR_BUSINESS_ITEM);

        ellipseBusinessItemEClass = createEClass(ELLIPSE_BUSINESS_ITEM);

        gearBusinessItemEClass = createEClass(GEAR_BUSINESS_ITEM);

        queryEClass = createEClass(QUERY);

        jobletEClass = createEClass(JOBLET);

        sqlPatternEClass = createEClass(SQL_PATTERN);

        salesforceEClass = createEClass(SALESFORCE);

        copybookEClass = createEClass(COPYBOOK);

        mdmEClass = createEClass(MDM);

        wsdlEClass = createEClass(WSDL);

        ldapEClass = createEClass(LDAP);

        sapFunctionEClass = createEClass(SAP_FUNCTION);

        serviceEClass = createEClass(SERVICE);
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

        // Add supertypes to classes
        businessProcessEClass.getESuperTypes().add(this.getTalendItem());
        processEClass.getESuperTypes().add(this.getTalendItem());
        routineEClass.getESuperTypes().add(this.getTalendItem());
        documentationEClass.getESuperTypes().add(this.getTalendItem());
        databaseMetadataEClass.getESuperTypes().add(this.getTalendItem());
        sapFunctionMetadataEClass.getESuperTypes().add(this.getTalendItem());
        tableMetadataEClass.getESuperTypes().add(this.getTalendItem());
        fileDelimitedMetadataEClass.getESuperTypes().add(this.getTalendItem());
        filePositionalMetadataEClass.getESuperTypes().add(this.getTalendItem());
        fileRegexpMetadataEClass.getESuperTypes().add(this.getTalendItem());
        fileXmlMetadataEClass.getESuperTypes().add(this.getTalendItem());
        fileExcelMetadataEClass.getESuperTypes().add(this.getTalendItem());
        fileLdifMetadataEClass.getESuperTypes().add(this.getTalendItem());
        genericSchemaMetadataEClass.getESuperTypes().add(this.getTalendItem());
        contextEClass.getESuperTypes().add(this.getTalendItem());
        baseBusinessItemRelationshipEClass.getESuperTypes().add(this.getBusinessItem());
        businessItemRelationshipEClass.getESuperTypes().add(this.getBaseBusinessItemRelationship());
        directionalBusinessItemRelationshipEClass.getESuperTypes().add(this.getBaseBusinessItemRelationship());
        bidirectionalBusinessItemRelationshipEClass.getESuperTypes().add(this.getBaseBusinessItemRelationship());
        businessItemShapeEClass.getESuperTypes().add(this.getBusinessItem());
        decisionBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        actionBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        terminalBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        dataBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        documentBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        inputBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        listBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        databaseBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        actorBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        ellipseBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        gearBusinessItemEClass.getESuperTypes().add(this.getBusinessItemShape());
        queryEClass.getESuperTypes().add(this.getTalendItem());
        jobletEClass.getESuperTypes().add(this.getTalendItem());
        sqlPatternEClass.getESuperTypes().add(this.getTalendItem());
        salesforceEClass.getESuperTypes().add(this.getTalendItem());
        copybookEClass.getESuperTypes().add(this.getTalendItem());
        mdmEClass.getESuperTypes().add(this.getTalendItem());
        wsdlEClass.getESuperTypes().add(this.getTalendItem());
        ldapEClass.getESuperTypes().add(this.getTalendItem());
        sapFunctionEClass.getESuperTypes().add(this.getTalendItem());
        serviceEClass.getESuperTypes().add(this.getTalendItem());

        // Initialize classes and features; add operations and parameters
        initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRepository_Talenditems(), this.getTalendItem(), this.getTalendItem_Repository(), "Talenditems", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(talendItemEClass, TalendItem.class, "TalendItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTalendItem_Id(), ecorePackage.getEString(), "id", null, 0, 1, TalendItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTalendItem_Label(), ecorePackage.getEString(), "label", "", 0, 1, TalendItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTalendItem_Author(), ecorePackage.getEString(), "author", "", 0, 1, TalendItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTalendItem_Version(), ecorePackage.getEString(), "version", null, 0, 1, TalendItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTalendItem_Comment(), ecorePackage.getEString(), "comment", "", 0, 1, TalendItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTalendItem_Assignments(), this.getBusinessAssignment(), this.getBusinessAssignment_TalendItem(), "assignments", null, 0, -1, TalendItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTalendItem_Repository(), this.getRepository(), this.getRepository_Talenditems(), "repository", null, 0, 1, TalendItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessProcessEClass, BusinessProcess.class, "BusinessProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBusinessProcess_BusinessItems(), this.getBusinessItem(), this.getBusinessItem_BusinessProcess(), "businessItems", null, 0, -1, BusinessProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessProcess_LocalRepositoryCopy(), this.getRepository(), null, "localRepositoryCopy", null, 0, 1, BusinessProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processEClass, org.talend.designer.business.model.business.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(routineEClass, Routine.class, "Routine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(databaseMetadataEClass, DatabaseMetadata.class, "DatabaseMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sapFunctionMetadataEClass, SapFunctionMetadata.class, "SapFunctionMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tableMetadataEClass, TableMetadata.class, "TableMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fileDelimitedMetadataEClass, FileDelimitedMetadata.class, "FileDelimitedMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(filePositionalMetadataEClass, FilePositionalMetadata.class, "FilePositionalMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fileRegexpMetadataEClass, FileRegexpMetadata.class, "FileRegexpMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fileXmlMetadataEClass, FileXmlMetadata.class, "FileXmlMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fileExcelMetadataEClass, FileExcelMetadata.class, "FileExcelMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fileLdifMetadataEClass, FileLdifMetadata.class, "FileLdifMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(genericSchemaMetadataEClass, GenericSchemaMetadata.class, "GenericSchemaMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(businessAssignmentEClass, BusinessAssignment.class, "BusinessAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBusinessAssignment_BusinessItem(), this.getBusinessItem(), this.getBusinessItem_Assignments(), "businessItem", null, 1, 1, BusinessAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessAssignment_TalendItem(), this.getTalendItem(), this.getTalendItem_Assignments(), "talendItem", null, 1, 1, BusinessAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBusinessAssignment_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BusinessAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessItemEClass, BusinessItem.class, "BusinessItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBusinessItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessItem_BusinessProcess(), this.getBusinessProcess(), this.getBusinessProcess_BusinessItems(), "businessProcess", null, 1, 1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessItem_Assignments(), this.getBusinessAssignment(), this.getBusinessAssignment_BusinessItem(), "assignments", null, 0, -1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBusinessItem_VAlignment(), ecorePackage.getEString(), "vAlignment", "VCENTRE", 0, 1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBusinessItem_HAlignment(), ecorePackage.getEString(), "hAlignment", "HCENTRE", 0, 1, BusinessItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(baseBusinessItemRelationshipEClass, BaseBusinessItemRelationship.class, "BaseBusinessItemRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBaseBusinessItemRelationship_Source(), this.getBusinessItemShape(), this.getBusinessItemShape_OutgoingRelationships(), "source", null, 0, 1, BaseBusinessItemRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBaseBusinessItemRelationship_Target(), this.getBusinessItemShape(), this.getBusinessItemShape_IncomingRelationships(), "target", null, 0, 1, BaseBusinessItemRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessItemRelationshipEClass, BusinessItemRelationship.class, "BusinessItemRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(directionalBusinessItemRelationshipEClass, DirectionalBusinessItemRelationship.class, "DirectionalBusinessItemRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(bidirectionalBusinessItemRelationshipEClass, BidirectionalBusinessItemRelationship.class, "BidirectionalBusinessItemRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(businessItemShapeEClass, BusinessItemShape.class, "BusinessItemShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBusinessItemShape_IncomingRelationships(), this.getBaseBusinessItemRelationship(), this.getBaseBusinessItemRelationship_Target(), "incomingRelationships", null, 0, -1, BusinessItemShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessItemShape_OutgoingRelationships(), this.getBaseBusinessItemRelationship(), this.getBaseBusinessItemRelationship_Source(), "outgoingRelationships", null, 0, -1, BusinessItemShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(decisionBusinessItemEClass, DecisionBusinessItem.class, "DecisionBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(actionBusinessItemEClass, ActionBusinessItem.class, "ActionBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(terminalBusinessItemEClass, TerminalBusinessItem.class, "TerminalBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dataBusinessItemEClass, DataBusinessItem.class, "DataBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(documentBusinessItemEClass, DocumentBusinessItem.class, "DocumentBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(inputBusinessItemEClass, InputBusinessItem.class, "InputBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(listBusinessItemEClass, ListBusinessItem.class, "ListBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(databaseBusinessItemEClass, DatabaseBusinessItem.class, "DatabaseBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(actorBusinessItemEClass, ActorBusinessItem.class, "ActorBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(ellipseBusinessItemEClass, EllipseBusinessItem.class, "EllipseBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(gearBusinessItemEClass, GearBusinessItem.class, "GearBusinessItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(jobletEClass, Joblet.class, "Joblet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sqlPatternEClass, SQLPattern.class, "SQLPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(salesforceEClass, Salesforce.class, "Salesforce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(copybookEClass, Copybook.class, "Copybook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(mdmEClass, org.talend.designer.business.model.business.MDM.class, "MDM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(wsdlEClass, Wsdl.class, "Wsdl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(ldapEClass, Ldap.class, "Ldap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sapFunctionEClass, SAPFunction.class, "SAPFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} // BusinessPackageImpl
