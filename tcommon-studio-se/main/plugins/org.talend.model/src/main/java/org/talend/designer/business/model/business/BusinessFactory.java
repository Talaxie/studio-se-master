/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see org.talend.designer.business.model.business.BusinessPackage
 * @generated
 */
public interface BusinessFactory extends EFactory {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    String copyright = ""; //$NON-NLS-1$

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    BusinessFactory eINSTANCE = org.talend.designer.business.model.business.impl.BusinessFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Repository</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Repository</em>'.
     * @generated
     */
    Repository createRepository();

    /**
     * Returns a new object of class '<em>Process</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Process</em>'.
     * @generated
     */
    BusinessProcess createBusinessProcess();

    /**
     * Returns a new object of class '<em>Process</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Process</em>'.
     * @generated
     */
    Process createProcess();

    /**
     * Returns a new object of class '<em>Routine</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Routine</em>'.
     * @generated
     */
    Routine createRoutine();

    /**
     * Returns a new object of class '<em>Documentation</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Documentation</em>'.
     * @generated
     */
    Documentation createDocumentation();

    /**
     * Returns a new object of class '<em>Database Metadata</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Database Metadata</em>'.
     * @generated
     */
    DatabaseMetadata createDatabaseMetadata();

    /**
     * Returns a new object of class '<em>Sap Function Metadata</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sap Function Metadata</em>'.
     * @generated
     */
    SapFunctionMetadata createSapFunctionMetadata();

    /**
     * Returns a new object of class '<em>Table Metadata</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Table Metadata</em>'.
     * @generated
     */
    TableMetadata createTableMetadata();

    /**
     * Returns a new object of class '<em>File Delimited Metadata</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Delimited Metadata</em>'.
     * @generated
     */
    FileDelimitedMetadata createFileDelimitedMetadata();

    /**
     * Returns a new object of class '<em>File Positional Metadata</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Positional Metadata</em>'.
     * @generated
     */
    FilePositionalMetadata createFilePositionalMetadata();

    /**
     * Returns a new object of class '<em>Assignment</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment</em>'.
     * @generated
     */
    BusinessAssignment createBusinessAssignment();

    /**
     * Returns a new object of class '<em>Item Relationship</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Item Relationship</em>'.
     * @generated
     */
    BusinessItemRelationship createBusinessItemRelationship();

    /**
     * Returns a new object of class '<em>Directional Business Item Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Directional Business Item Relationship</em>'.
     * @generated
     */
    DirectionalBusinessItemRelationship createDirectionalBusinessItemRelationship();

    /**
     * Returns a new object of class '<em>Bidirectional Business Item Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bidirectional Business Item Relationship</em>'.
     * @generated
     */
    BidirectionalBusinessItemRelationship createBidirectionalBusinessItemRelationship();

    /**
     * Returns a new object of class '<em>Decision Business Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return a new object of class '<em>Decision Business Item</em>'.
     * @generated
     */
    DecisionBusinessItem createDecisionBusinessItem();

    /**
     * Returns a new object of class '<em>Action Business Item</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Action Business Item</em>'.
     * @generated
     */
    ActionBusinessItem createActionBusinessItem();

    /**
     * Returns a new object of class '<em>Terminal Business Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return a new object of class '<em>Terminal Business Item</em>'.
     * @generated
     */
    TerminalBusinessItem createTerminalBusinessItem();

    /**
     * Returns a new object of class '<em>Data Business Item</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Data Business Item</em>'.
     * @generated
     */
    DataBusinessItem createDataBusinessItem();

    /**
     * Returns a new object of class '<em>Document Business Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return a new object of class '<em>Document Business Item</em>'.
     * @generated
     */
    DocumentBusinessItem createDocumentBusinessItem();

    /**
     * Returns a new object of class '<em>Input Business Item</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>Input Business Item</em>'.
     * @generated
     */
    InputBusinessItem createInputBusinessItem();

    /**
     * Returns a new object of class '<em>List Business Item</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return a new object of class '<em>List Business Item</em>'.
     * @generated
     */
    ListBusinessItem createListBusinessItem();

    /**
     * Returns a new object of class '<em>Database Business Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return a new object of class '<em>Database Business Item</em>'.
     * @generated
     */
    DatabaseBusinessItem createDatabaseBusinessItem();

    /**
     * Returns a new object of class '<em>File Regexp Metadata</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Regexp Metadata</em>'.
     * @generated
     */
    FileRegexpMetadata createFileRegexpMetadata();

    /**
     * Returns a new object of class '<em>Actor Business Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Actor Business Item</em>'.
     * @generated
     */
    ActorBusinessItem createActorBusinessItem();

    /**
     * Returns a new object of class '<em>Ellipse Business Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ellipse Business Item</em>'.
     * @generated
     */
    EllipseBusinessItem createEllipseBusinessItem();

    /**
     * Returns a new object of class '<em>Gear Business Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gear Business Item</em>'.
     * @generated
     */
    GearBusinessItem createGearBusinessItem();

    /**
     * Returns a new object of class '<em>Query</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Query</em>'.
     * @generated
     */
    Query createQuery();

    /**
     * Returns a new object of class '<em>Joblet</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Joblet</em>'.
     * @generated
     */
    Joblet createJoblet();

    /**
     * Returns a new object of class '<em>SQL Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SQL Pattern</em>'.
     * @generated
     */
    SQLPattern createSQLPattern();

    /**
     * Returns a new object of class '<em>Salesforce</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Salesforce</em>'.
     * @generated
     */
    Salesforce createSalesforce();

    /**
     * Returns a new object of class '<em>Copybook</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Copybook</em>'.
     * @generated
     */
    Copybook createCopybook();

    /**
     * Returns a new object of class '<em>MDM</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>MDM</em>'.
     * @generated
     */
    MDM createMDM();

    /**
     * Returns a new object of class '<em>Wsdl</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wsdl</em>'.
     * @generated
     */
    Wsdl createWsdl();

    /**
     * Returns a new object of class '<em>Ldap</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ldap</em>'.
     * @generated
     */
    Ldap createLdap();

    /**
     * Returns a new object of class '<em>SAP Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SAP Function</em>'.
     * @generated
     */
    SAPFunction createSAPFunction();

    /**
     * Returns a new object of class '<em>Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service</em>'.
     * @generated
     */
    Service createService();

    /**
     * Returns a new object of class '<em>Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Context</em>'.
     * @generated
     */
    Context createContext();

    /**
     * Returns a new object of class '<em>File Xml Metadata</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Xml Metadata</em>'.
     * @generated
     */
    FileXmlMetadata createFileXmlMetadata();

    /**
     * Returns a new object of class '<em>File Excel Metadata</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Excel Metadata</em>'.
     * @generated
     */
    FileExcelMetadata createFileExcelMetadata();

    /**
     * Returns a new object of class '<em>File Ldif Metadata</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Ldif Metadata</em>'.
     * @generated
     */
    FileLdifMetadata createFileLdifMetadata();

    /**
     * Returns a new object of class '<em>Generic Schema Metadata</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic Schema Metadata</em>'.
     * @generated
     */
    GenericSchemaMetadata createGenericSchemaMetadata();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    BusinessPackage getBusinessPackage();

} // BusinessFactory
