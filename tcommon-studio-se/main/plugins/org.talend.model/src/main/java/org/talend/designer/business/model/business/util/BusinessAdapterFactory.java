/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.talend.designer.business.model.business.ActionBusinessItem;
import org.talend.designer.business.model.business.ActorBusinessItem;
import org.talend.designer.business.model.business.BaseBusinessItemRelationship;
import org.talend.designer.business.model.business.BidirectionalBusinessItemRelationship;
import org.talend.designer.business.model.business.BusinessAssignment;
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
import org.talend.designer.business.model.business.MDM;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see org.talend.designer.business.model.business.BusinessPackage
 * @generated
 */
public class BusinessAdapterFactory extends AdapterFactoryImpl {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public static final String copyright = ""; //$NON-NLS-1$

    /**
     * The cached model package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static BusinessPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BusinessAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = BusinessPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc --> This
     * implementation returns <code>true</code> if the object is either the model's package or is an instance object
     * of the model. <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BusinessSwitch modelSwitch =
        new BusinessSwitch() {
            public Object caseRepository(Repository object) {
                return createRepositoryAdapter();
            }
            public Object caseTalendItem(TalendItem object) {
                return createTalendItemAdapter();
            }
            public Object caseBusinessProcess(BusinessProcess object) {
                return createBusinessProcessAdapter();
            }
            public Object caseProcess(org.talend.designer.business.model.business.Process object) {
                return createProcessAdapter();
            }
            public Object caseRoutine(Routine object) {
                return createRoutineAdapter();
            }
            public Object caseDocumentation(Documentation object) {
                return createDocumentationAdapter();
            }
            public Object caseDatabaseMetadata(DatabaseMetadata object) {
                return createDatabaseMetadataAdapter();
            }
            public Object caseSapFunctionMetadata(SapFunctionMetadata object) {
                return createSapFunctionMetadataAdapter();
            }
            public Object caseTableMetadata(TableMetadata object) {
                return createTableMetadataAdapter();
            }
            public Object caseFileDelimitedMetadata(FileDelimitedMetadata object) {
                return createFileDelimitedMetadataAdapter();
            }
            public Object caseFilePositionalMetadata(FilePositionalMetadata object) {
                return createFilePositionalMetadataAdapter();
            }
            public Object caseFileRegexpMetadata(FileRegexpMetadata object) {
                return createFileRegexpMetadataAdapter();
            }
            public Object caseFileXmlMetadata(FileXmlMetadata object) {
                return createFileXmlMetadataAdapter();
            }
            public Object caseFileExcelMetadata(FileExcelMetadata object) {
                return createFileExcelMetadataAdapter();
            }
            public Object caseFileLdifMetadata(FileLdifMetadata object) {
                return createFileLdifMetadataAdapter();
            }
            public Object caseGenericSchemaMetadata(GenericSchemaMetadata object) {
                return createGenericSchemaMetadataAdapter();
            }
            public Object caseContext(Context object) {
                return createContextAdapter();
            }
            public Object caseBusinessAssignment(BusinessAssignment object) {
                return createBusinessAssignmentAdapter();
            }
            public Object caseBusinessItem(BusinessItem object) {
                return createBusinessItemAdapter();
            }
            public Object caseBaseBusinessItemRelationship(BaseBusinessItemRelationship object) {
                return createBaseBusinessItemRelationshipAdapter();
            }
            public Object caseBusinessItemRelationship(BusinessItemRelationship object) {
                return createBusinessItemRelationshipAdapter();
            }
            public Object caseDirectionalBusinessItemRelationship(DirectionalBusinessItemRelationship object) {
                return createDirectionalBusinessItemRelationshipAdapter();
            }
            public Object caseBidirectionalBusinessItemRelationship(BidirectionalBusinessItemRelationship object) {
                return createBidirectionalBusinessItemRelationshipAdapter();
            }
            public Object caseBusinessItemShape(BusinessItemShape object) {
                return createBusinessItemShapeAdapter();
            }
            public Object caseDecisionBusinessItem(DecisionBusinessItem object) {
                return createDecisionBusinessItemAdapter();
            }
            public Object caseActionBusinessItem(ActionBusinessItem object) {
                return createActionBusinessItemAdapter();
            }
            public Object caseTerminalBusinessItem(TerminalBusinessItem object) {
                return createTerminalBusinessItemAdapter();
            }
            public Object caseDataBusinessItem(DataBusinessItem object) {
                return createDataBusinessItemAdapter();
            }
            public Object caseDocumentBusinessItem(DocumentBusinessItem object) {
                return createDocumentBusinessItemAdapter();
            }
            public Object caseInputBusinessItem(InputBusinessItem object) {
                return createInputBusinessItemAdapter();
            }
            public Object caseListBusinessItem(ListBusinessItem object) {
                return createListBusinessItemAdapter();
            }
            public Object caseDatabaseBusinessItem(DatabaseBusinessItem object) {
                return createDatabaseBusinessItemAdapter();
            }
            public Object caseActorBusinessItem(ActorBusinessItem object) {
                return createActorBusinessItemAdapter();
            }
            public Object caseEllipseBusinessItem(EllipseBusinessItem object) {
                return createEllipseBusinessItemAdapter();
            }
            public Object caseGearBusinessItem(GearBusinessItem object) {
                return createGearBusinessItemAdapter();
            }
            public Object caseQuery(Query object) {
                return createQueryAdapter();
            }
            public Object caseJoblet(Joblet object) {
                return createJobletAdapter();
            }
            public Object caseSQLPattern(SQLPattern object) {
                return createSQLPatternAdapter();
            }
            public Object caseSalesforce(Salesforce object) {
                return createSalesforceAdapter();
            }
            public Object caseCopybook(Copybook object) {
                return createCopybookAdapter();
            }
            public Object caseMDM(MDM object) {
                return createMDMAdapter();
            }
            public Object caseWsdl(Wsdl object) {
                return createWsdlAdapter();
            }
            public Object caseLdap(Ldap object) {
                return createLdapAdapter();
            }
            public Object caseSAPFunction(SAPFunction object) {
                return createSAPFunctionAdapter();
            }
            public Object caseService(Service object) {
                return createServiceAdapter();
            }
            public Object defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    public Adapter createAdapter(Notifier target) {
        return (Adapter)modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Repository <em>Repository</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Repository
     * @generated
     */
    public Adapter createRepositoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.TalendItem <em>Talaxie Item</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.TalendItem
     * @generated
     */
    public Adapter createTalendItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.BusinessProcess <em>Process</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.BusinessProcess
     * @generated
     */
    public Adapter createBusinessProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Process <em>Process</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Process
     * @generated
     */
    public Adapter createProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Routine <em>Routine</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Routine
     * @generated
     */
    public Adapter createRoutineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Documentation
     * @generated
     */
    public Adapter createDocumentationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.DatabaseMetadata <em>Database Metadata</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.DatabaseMetadata
     * @generated
     */
    public Adapter createDatabaseMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.SapFunctionMetadata <em>Sap Function Metadata</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.SapFunctionMetadata
     * @generated
     */
    public Adapter createSapFunctionMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.TableMetadata <em>Table Metadata</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.TableMetadata
     * @generated
     */
    public Adapter createTableMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.FileDelimitedMetadata <em>File Delimited Metadata</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.FileDelimitedMetadata
     * @generated
     */
    public Adapter createFileDelimitedMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.FilePositionalMetadata <em>File Positional Metadata</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.FilePositionalMetadata
     * @generated
     */
    public Adapter createFilePositionalMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.BusinessAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.BusinessAssignment
     * @generated
     */
    public Adapter createBusinessAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.BusinessItem <em>Item</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.BusinessItem
     * @generated
     */
    public Adapter createBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.BaseBusinessItemRelationship <em>Base Business Item Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.BaseBusinessItemRelationship
     * @generated
     */
    public Adapter createBaseBusinessItemRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.BusinessItemRelationship <em>Item Relationship</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.BusinessItemRelationship
     * @generated
     */
    public Adapter createBusinessItemRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.DirectionalBusinessItemRelationship <em>Directional Business Item Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.DirectionalBusinessItemRelationship
     * @generated
     */
    public Adapter createDirectionalBusinessItemRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.BidirectionalBusinessItemRelationship <em>Bidirectional Business Item Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.BidirectionalBusinessItemRelationship
     * @generated
     */
    public Adapter createBidirectionalBusinessItemRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.BusinessItemShape <em>Item Shape</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.BusinessItemShape
     * @generated
     */
    public Adapter createBusinessItemShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.DecisionBusinessItem <em>Decision Business Item</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.DecisionBusinessItem
     * @generated
     */
    public Adapter createDecisionBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.ActionBusinessItem <em>Action Business Item</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.ActionBusinessItem
     * @generated
     */
    public Adapter createActionBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.TerminalBusinessItem <em>Terminal Business Item</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.TerminalBusinessItem
     * @generated
     */
    public Adapter createTerminalBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.DataBusinessItem <em>Data Business Item</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.DataBusinessItem
     * @generated
     */
    public Adapter createDataBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.DocumentBusinessItem <em>Document Business Item</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.DocumentBusinessItem
     * @generated
     */
    public Adapter createDocumentBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.InputBusinessItem <em>Input Business Item</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.InputBusinessItem
     * @generated
     */
    public Adapter createInputBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.ListBusinessItem <em>List Business Item</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.ListBusinessItem
     * @generated
     */
    public Adapter createListBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.DatabaseBusinessItem <em>Database Business Item</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.DatabaseBusinessItem
     * @generated
     */
    public Adapter createDatabaseBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.FileRegexpMetadata <em>File Regexp Metadata</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.FileRegexpMetadata
     * @generated
     */
    public Adapter createFileRegexpMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.ActorBusinessItem <em>Actor Business Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.ActorBusinessItem
     * @generated
     */
    public Adapter createActorBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.EllipseBusinessItem <em>Ellipse Business Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.EllipseBusinessItem
     * @generated
     */
    public Adapter createEllipseBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.GearBusinessItem <em>Gear Business Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.GearBusinessItem
     * @generated
     */
    public Adapter createGearBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Query <em>Query</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Query
     * @generated
     */
    public Adapter createQueryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Joblet <em>Joblet</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Joblet
     * @generated
     */
    public Adapter createJobletAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.SQLPattern <em>SQL Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.SQLPattern
     * @generated
     */
    public Adapter createSQLPatternAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Salesforce <em>Salesforce</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Salesforce
     * @generated
     */
    public Adapter createSalesforceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Copybook <em>Copybook</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Copybook
     * @generated
     */
    public Adapter createCopybookAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.MDM <em>MDM</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.MDM
     * @generated
     */
    public Adapter createMDMAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Wsdl <em>Wsdl</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Wsdl
     * @generated
     */
    public Adapter createWsdlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Ldap <em>Ldap</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Ldap
     * @generated
     */
    public Adapter createLdapAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.SAPFunction <em>SAP Function</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.SAPFunction
     * @generated
     */
    public Adapter createSAPFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Service <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Service
     * @generated
     */
    public Adapter createServiceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.Context <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.Context
     * @generated
     */
    public Adapter createContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.FileXmlMetadata <em>File Xml Metadata</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.FileXmlMetadata
     * @generated
     */
    public Adapter createFileXmlMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.FileExcelMetadata <em>File Excel Metadata</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.FileExcelMetadata
     * @generated
     */
    public Adapter createFileExcelMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.FileLdifMetadata <em>File Ldif Metadata</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.FileLdifMetadata
     * @generated
     */
    public Adapter createFileLdifMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.business.model.business.GenericSchemaMetadata <em>Generic Schema Metadata</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.business.model.business.GenericSchemaMetadata
     * @generated
     */
    public Adapter createGenericSchemaMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc --> This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // BusinessAdapterFactory
