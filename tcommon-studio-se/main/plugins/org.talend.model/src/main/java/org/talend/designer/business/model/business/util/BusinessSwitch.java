/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.talend.designer.business.model.business.BusinessPackage
 * @generated
 */
public class BusinessSwitch {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public static final String copyright = ""; //$NON-NLS-1$

    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static BusinessPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BusinessSwitch() {
        if (modelPackage == null) {
            modelPackage = BusinessPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public Object doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch((EClass)eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case BusinessPackage.REPOSITORY: {
                Repository repository = (Repository)theEObject;
                Object result = caseRepository(repository);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.TALEND_ITEM: {
                TalendItem talendItem = (TalendItem)theEObject;
                Object result = caseTalendItem(talendItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.BUSINESS_PROCESS: {
                BusinessProcess businessProcess = (BusinessProcess)theEObject;
                Object result = caseBusinessProcess(businessProcess);
                if (result == null) result = caseTalendItem(businessProcess);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.PROCESS: {
                org.talend.designer.business.model.business.Process process = (org.talend.designer.business.model.business.Process)theEObject;
                Object result = caseProcess(process);
                if (result == null) result = caseTalendItem(process);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.ROUTINE: {
                Routine routine = (Routine)theEObject;
                Object result = caseRoutine(routine);
                if (result == null) result = caseTalendItem(routine);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.DOCUMENTATION: {
                Documentation documentation = (Documentation)theEObject;
                Object result = caseDocumentation(documentation);
                if (result == null) result = caseTalendItem(documentation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.DATABASE_METADATA: {
                DatabaseMetadata databaseMetadata = (DatabaseMetadata)theEObject;
                Object result = caseDatabaseMetadata(databaseMetadata);
                if (result == null) result = caseTalendItem(databaseMetadata);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.SAP_FUNCTION_METADATA: {
                SapFunctionMetadata sapFunctionMetadata = (SapFunctionMetadata)theEObject;
                Object result = caseSapFunctionMetadata(sapFunctionMetadata);
                if (result == null) result = caseTalendItem(sapFunctionMetadata);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.TABLE_METADATA: {
                TableMetadata tableMetadata = (TableMetadata)theEObject;
                Object result = caseTableMetadata(tableMetadata);
                if (result == null) result = caseTalendItem(tableMetadata);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.FILE_DELIMITED_METADATA: {
                FileDelimitedMetadata fileDelimitedMetadata = (FileDelimitedMetadata)theEObject;
                Object result = caseFileDelimitedMetadata(fileDelimitedMetadata);
                if (result == null) result = caseTalendItem(fileDelimitedMetadata);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.FILE_POSITIONAL_METADATA: {
                FilePositionalMetadata filePositionalMetadata = (FilePositionalMetadata)theEObject;
                Object result = caseFilePositionalMetadata(filePositionalMetadata);
                if (result == null) result = caseTalendItem(filePositionalMetadata);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.FILE_REGEXP_METADATA: {
                FileRegexpMetadata fileRegexpMetadata = (FileRegexpMetadata)theEObject;
                Object result = caseFileRegexpMetadata(fileRegexpMetadata);
                if (result == null) result = caseTalendItem(fileRegexpMetadata);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.FILE_XML_METADATA: {
                FileXmlMetadata fileXmlMetadata = (FileXmlMetadata)theEObject;
                Object result = caseFileXmlMetadata(fileXmlMetadata);
                if (result == null) result = caseTalendItem(fileXmlMetadata);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.FILE_EXCEL_METADATA: {
                FileExcelMetadata fileExcelMetadata = (FileExcelMetadata)theEObject;
                Object result = caseFileExcelMetadata(fileExcelMetadata);
                if (result == null) result = caseTalendItem(fileExcelMetadata);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.FILE_LDIF_METADATA: {
                FileLdifMetadata fileLdifMetadata = (FileLdifMetadata)theEObject;
                Object result = caseFileLdifMetadata(fileLdifMetadata);
                if (result == null) result = caseTalendItem(fileLdifMetadata);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.GENERIC_SCHEMA_METADATA: {
                GenericSchemaMetadata genericSchemaMetadata = (GenericSchemaMetadata)theEObject;
                Object result = caseGenericSchemaMetadata(genericSchemaMetadata);
                if (result == null) result = caseTalendItem(genericSchemaMetadata);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.CONTEXT: {
                Context context = (Context)theEObject;
                Object result = caseContext(context);
                if (result == null) result = caseTalendItem(context);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.BUSINESS_ASSIGNMENT: {
                BusinessAssignment businessAssignment = (BusinessAssignment)theEObject;
                Object result = caseBusinessAssignment(businessAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.BUSINESS_ITEM: {
                BusinessItem businessItem = (BusinessItem)theEObject;
                Object result = caseBusinessItem(businessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP: {
                BaseBusinessItemRelationship baseBusinessItemRelationship = (BaseBusinessItemRelationship)theEObject;
                Object result = caseBaseBusinessItemRelationship(baseBusinessItemRelationship);
                if (result == null) result = caseBusinessItem(baseBusinessItemRelationship);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.BUSINESS_ITEM_RELATIONSHIP: {
                BusinessItemRelationship businessItemRelationship = (BusinessItemRelationship)theEObject;
                Object result = caseBusinessItemRelationship(businessItemRelationship);
                if (result == null) result = caseBaseBusinessItemRelationship(businessItemRelationship);
                if (result == null) result = caseBusinessItem(businessItemRelationship);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP: {
                DirectionalBusinessItemRelationship directionalBusinessItemRelationship = (DirectionalBusinessItemRelationship)theEObject;
                Object result = caseDirectionalBusinessItemRelationship(directionalBusinessItemRelationship);
                if (result == null) result = caseBaseBusinessItemRelationship(directionalBusinessItemRelationship);
                if (result == null) result = caseBusinessItem(directionalBusinessItemRelationship);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP: {
                BidirectionalBusinessItemRelationship bidirectionalBusinessItemRelationship = (BidirectionalBusinessItemRelationship)theEObject;
                Object result = caseBidirectionalBusinessItemRelationship(bidirectionalBusinessItemRelationship);
                if (result == null) result = caseBaseBusinessItemRelationship(bidirectionalBusinessItemRelationship);
                if (result == null) result = caseBusinessItem(bidirectionalBusinessItemRelationship);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.BUSINESS_ITEM_SHAPE: {
                BusinessItemShape businessItemShape = (BusinessItemShape)theEObject;
                Object result = caseBusinessItemShape(businessItemShape);
                if (result == null) result = caseBusinessItem(businessItemShape);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.DECISION_BUSINESS_ITEM: {
                DecisionBusinessItem decisionBusinessItem = (DecisionBusinessItem)theEObject;
                Object result = caseDecisionBusinessItem(decisionBusinessItem);
                if (result == null) result = caseBusinessItemShape(decisionBusinessItem);
                if (result == null) result = caseBusinessItem(decisionBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.ACTION_BUSINESS_ITEM: {
                ActionBusinessItem actionBusinessItem = (ActionBusinessItem)theEObject;
                Object result = caseActionBusinessItem(actionBusinessItem);
                if (result == null) result = caseBusinessItemShape(actionBusinessItem);
                if (result == null) result = caseBusinessItem(actionBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.TERMINAL_BUSINESS_ITEM: {
                TerminalBusinessItem terminalBusinessItem = (TerminalBusinessItem)theEObject;
                Object result = caseTerminalBusinessItem(terminalBusinessItem);
                if (result == null) result = caseBusinessItemShape(terminalBusinessItem);
                if (result == null) result = caseBusinessItem(terminalBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.DATA_BUSINESS_ITEM: {
                DataBusinessItem dataBusinessItem = (DataBusinessItem)theEObject;
                Object result = caseDataBusinessItem(dataBusinessItem);
                if (result == null) result = caseBusinessItemShape(dataBusinessItem);
                if (result == null) result = caseBusinessItem(dataBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.DOCUMENT_BUSINESS_ITEM: {
                DocumentBusinessItem documentBusinessItem = (DocumentBusinessItem)theEObject;
                Object result = caseDocumentBusinessItem(documentBusinessItem);
                if (result == null) result = caseBusinessItemShape(documentBusinessItem);
                if (result == null) result = caseBusinessItem(documentBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.INPUT_BUSINESS_ITEM: {
                InputBusinessItem inputBusinessItem = (InputBusinessItem)theEObject;
                Object result = caseInputBusinessItem(inputBusinessItem);
                if (result == null) result = caseBusinessItemShape(inputBusinessItem);
                if (result == null) result = caseBusinessItem(inputBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.LIST_BUSINESS_ITEM: {
                ListBusinessItem listBusinessItem = (ListBusinessItem)theEObject;
                Object result = caseListBusinessItem(listBusinessItem);
                if (result == null) result = caseBusinessItemShape(listBusinessItem);
                if (result == null) result = caseBusinessItem(listBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.DATABASE_BUSINESS_ITEM: {
                DatabaseBusinessItem databaseBusinessItem = (DatabaseBusinessItem)theEObject;
                Object result = caseDatabaseBusinessItem(databaseBusinessItem);
                if (result == null) result = caseBusinessItemShape(databaseBusinessItem);
                if (result == null) result = caseBusinessItem(databaseBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.ACTOR_BUSINESS_ITEM: {
                ActorBusinessItem actorBusinessItem = (ActorBusinessItem)theEObject;
                Object result = caseActorBusinessItem(actorBusinessItem);
                if (result == null) result = caseBusinessItemShape(actorBusinessItem);
                if (result == null) result = caseBusinessItem(actorBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.ELLIPSE_BUSINESS_ITEM: {
                EllipseBusinessItem ellipseBusinessItem = (EllipseBusinessItem)theEObject;
                Object result = caseEllipseBusinessItem(ellipseBusinessItem);
                if (result == null) result = caseBusinessItemShape(ellipseBusinessItem);
                if (result == null) result = caseBusinessItem(ellipseBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.GEAR_BUSINESS_ITEM: {
                GearBusinessItem gearBusinessItem = (GearBusinessItem)theEObject;
                Object result = caseGearBusinessItem(gearBusinessItem);
                if (result == null) result = caseBusinessItemShape(gearBusinessItem);
                if (result == null) result = caseBusinessItem(gearBusinessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.QUERY: {
                Query query = (Query)theEObject;
                Object result = caseQuery(query);
                if (result == null) result = caseTalendItem(query);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.JOBLET: {
                Joblet joblet = (Joblet)theEObject;
                Object result = caseJoblet(joblet);
                if (result == null) result = caseTalendItem(joblet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.SQL_PATTERN: {
                SQLPattern sqlPattern = (SQLPattern)theEObject;
                Object result = caseSQLPattern(sqlPattern);
                if (result == null) result = caseTalendItem(sqlPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.SALESFORCE: {
                Salesforce salesforce = (Salesforce)theEObject;
                Object result = caseSalesforce(salesforce);
                if (result == null) result = caseTalendItem(salesforce);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.COPYBOOK: {
                Copybook copybook = (Copybook)theEObject;
                Object result = caseCopybook(copybook);
                if (result == null) result = caseTalendItem(copybook);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.MDM: {
                MDM mdm = (MDM)theEObject;
                Object result = caseMDM(mdm);
                if (result == null) result = caseTalendItem(mdm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.WSDL: {
                Wsdl wsdl = (Wsdl)theEObject;
                Object result = caseWsdl(wsdl);
                if (result == null) result = caseTalendItem(wsdl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.LDAP: {
                Ldap ldap = (Ldap)theEObject;
                Object result = caseLdap(ldap);
                if (result == null) result = caseTalendItem(ldap);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.SAP_FUNCTION: {
                SAPFunction sapFunction = (SAPFunction)theEObject;
                Object result = caseSAPFunction(sapFunction);
                if (result == null) result = caseTalendItem(sapFunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BusinessPackage.SERVICE: {
                Service service = (Service)theEObject;
                Object result = caseService(service);
                if (result == null) result = caseTalendItem(service);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Repository</em>'. <!-- begin-user-doc
     * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRepository(Repository object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Talaxie Item</em>'. <!-- begin-user-doc
     * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Talaxie Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseTalendItem(TalendItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseBusinessProcess(BusinessProcess object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseProcess(org.talend.designer.business.model.business.Process object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Routine</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Routine</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRoutine(Routine object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Documentation</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Documentation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDocumentation(Documentation object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Database Metadata</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Database Metadata</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatabaseMetadata(DatabaseMetadata object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sap Function Metadata</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sap Function Metadata</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSapFunctionMetadata(SapFunctionMetadata object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Table Metadata</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Table Metadata</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseTableMetadata(TableMetadata object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Delimited Metadata</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Delimited Metadata</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseFileDelimitedMetadata(FileDelimitedMetadata object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Positional Metadata</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Positional Metadata</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseFilePositionalMetadata(FilePositionalMetadata object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Assignment</em>'. <!-- begin-user-doc
     * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseBusinessAssignment(BusinessAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseBusinessItem(BusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Business Item Relationship</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Business Item Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseBaseBusinessItemRelationship(BaseBusinessItemRelationship object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Item Relationship</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Item Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseBusinessItemRelationship(BusinessItemRelationship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Directional Business Item Relationship</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Directional Business Item Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDirectionalBusinessItemRelationship(DirectionalBusinessItemRelationship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bidirectional Business Item Relationship</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bidirectional Business Item Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseBidirectionalBusinessItemRelationship(BidirectionalBusinessItemRelationship object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Item Shape</em>'. <!-- begin-user-doc
     * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Item Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseBusinessItemShape(BusinessItemShape object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Decision Business Item</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Decision Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDecisionBusinessItem(DecisionBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Action Business Item</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Action Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseActionBusinessItem(ActionBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Terminal Business Item</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Terminal Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseTerminalBusinessItem(TerminalBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Data Business Item</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Data Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDataBusinessItem(DataBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Document Business Item</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Document Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDocumentBusinessItem(DocumentBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Input Business Item</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Input Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseInputBusinessItem(InputBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>List Business Item</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>List Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseListBusinessItem(ListBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpretting the object as an instance of '<em>Database Business Item</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpretting the object as an instance of '<em>Database Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDatabaseBusinessItem(DatabaseBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Regexp Metadata</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Regexp Metadata</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseFileRegexpMetadata(FileRegexpMetadata object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Actor Business Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Actor Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseActorBusinessItem(ActorBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ellipse Business Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ellipse Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseEllipseBusinessItem(EllipseBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gear Business Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gear Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseGearBusinessItem(GearBusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Query</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseQuery(Query object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Joblet</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Joblet</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseJoblet(Joblet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SQL Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SQL Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSQLPattern(SQLPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Salesforce</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Salesforce</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSalesforce(Salesforce object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Copybook</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Copybook</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseCopybook(Copybook object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>MDM</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>MDM</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseMDM(MDM object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wsdl</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wsdl</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseWsdl(Wsdl object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ldap</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ldap</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseLdap(Ldap object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAP Function</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAP Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSAPFunction(SAPFunction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseService(Service object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseContext(Context object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Xml Metadata</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Xml Metadata</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseFileXmlMetadata(FileXmlMetadata object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Excel Metadata</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Excel Metadata</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseFileExcelMetadata(FileExcelMetadata object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Ldif Metadata</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Ldif Metadata</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseFileLdifMetadata(FileLdifMetadata object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic Schema Metadata</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic Schema Metadata</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseGenericSchemaMetadata(GenericSchemaMetadata object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null; returning a non-null result will terminate the switch, but this is the last
     * case anyway. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public Object defaultCase(EObject object) {
        return null;
    }

} // BusinessSwitch
