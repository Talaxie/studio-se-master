/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.designer.business.model.business.BusinessFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessPackage extends EPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    String copyright = ""; //$NON-NLS-1$

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "business"; //$NON-NLS-1$

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "business"; //$NON-NLS-1$

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "business"; //$NON-NLS-1$

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    BusinessPackage eINSTANCE = org.talend.designer.business.model.business.impl.BusinessPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.RepositoryImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getRepository()
     * @generated
     */
    int REPOSITORY = 0;

    /**
     * The feature id for the '<em><b>Talenditems</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY__TALENDITEMS = 0;

    /**
     * The number of structural features of the '<em>Repository</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.TalendItemImpl <em>Talaxie Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.TalendItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTalendItem()
     * @generated
     */
    int TALEND_ITEM = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__ID = 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__LABEL = 1;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__AUTHOR = 2;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__VERSION = 3;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__COMMENT = 4;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__ASSIGNMENTS = 5;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__REPOSITORY = 6;

    /**
     * The number of structural features of the '<em>Talaxie Item</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BusinessProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BusinessProcessImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessProcess()
     * @generated
     */
    int BUSINESS_PROCESS = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The feature id for the '<em><b>Business Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__BUSINESS_ITEMS = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Local Repository Copy</b></em>' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY = TALEND_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Process</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.ProcessImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getProcess()
     * @generated
     */
    int PROCESS = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Process</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int PROCESS_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.RoutineImpl <em>Routine</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.RoutineImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getRoutine()
     * @generated
     */
    int ROUTINE = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Routine</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ROUTINE_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DocumentationImpl <em>Documentation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DocumentationImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDocumentation()
     * @generated
     */
    int DOCUMENTATION = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Documentation</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DatabaseMetadataImpl <em>Database Metadata</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DatabaseMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDatabaseMetadata()
     * @generated
     */
    int DATABASE_METADATA = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Database Metadata</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.SapFunctionMetadataImpl <em>Sap Function Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.SapFunctionMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getSapFunctionMetadata()
     * @generated
     */
    int SAP_FUNCTION_METADATA = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Sap Function Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.TableMetadataImpl <em>Table Metadata</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.TableMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTableMetadata()
     * @generated
     */
    int TABLE_METADATA = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Table Metadata</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FileDelimitedMetadataImpl <em>File Delimited Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FileDelimitedMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileDelimitedMetadata()
     * @generated
     */
    int FILE_DELIMITED_METADATA = 9;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Delimited Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FilePositionalMetadataImpl <em>File Positional Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FilePositionalMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFilePositionalMetadata()
     * @generated
     */
    int FILE_POSITIONAL_METADATA = 10;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Positional Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BusinessAssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BusinessAssignmentImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessAssignment()
     * @generated
     */
    int BUSINESS_ASSIGNMENT = 17;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BusinessItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItem()
     * @generated
     */
    int BUSINESS_ITEM = 18;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BusinessItemRelationshipImpl <em>Item Relationship</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BusinessItemRelationshipImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItemRelationship()
     * @generated
     */
    int BUSINESS_ITEM_RELATIONSHIP = 20;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BusinessItemShapeImpl <em>Item Shape</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BusinessItemShapeImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItemShape()
     * @generated
     */
    int BUSINESS_ITEM_SHAPE = 23;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DecisionBusinessItemImpl <em>Decision Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DecisionBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDecisionBusinessItem()
     * @generated
     */
    int DECISION_BUSINESS_ITEM = 24;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.ActionBusinessItemImpl <em>Action Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.ActionBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getActionBusinessItem()
     * @generated
     */
    int ACTION_BUSINESS_ITEM = 25;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.TerminalBusinessItemImpl <em>Terminal Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.TerminalBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTerminalBusinessItem()
     * @generated
     */
    int TERMINAL_BUSINESS_ITEM = 26;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DataBusinessItemImpl <em>Data Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DataBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDataBusinessItem()
     * @generated
     */
    int DATA_BUSINESS_ITEM = 27;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DocumentBusinessItemImpl <em>Document Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DocumentBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDocumentBusinessItem()
     * @generated
     */
    int DOCUMENT_BUSINESS_ITEM = 28;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.InputBusinessItemImpl <em>Input Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.InputBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getInputBusinessItem()
     * @generated
     */
    int INPUT_BUSINESS_ITEM = 29;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.ListBusinessItemImpl <em>List Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.ListBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getListBusinessItem()
     * @generated
     */
    int LIST_BUSINESS_ITEM = 30;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DatabaseBusinessItemImpl <em>Database Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DatabaseBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDatabaseBusinessItem()
     * @generated
     */
    int DATABASE_BUSINESS_ITEM = 31;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FileRegexpMetadataImpl <em>File Regexp Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FileRegexpMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileRegexpMetadata()
     * @generated
     */
    int FILE_REGEXP_METADATA = 11;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.ActorBusinessItemImpl <em>Actor Business Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.ActorBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getActorBusinessItem()
     * @generated
     */
    int ACTOR_BUSINESS_ITEM = 32;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.EllipseBusinessItemImpl <em>Ellipse Business Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.EllipseBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getEllipseBusinessItem()
     * @generated
     */
    int ELLIPSE_BUSINESS_ITEM = 33;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.GearBusinessItemImpl <em>Gear Business Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.GearBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getGearBusinessItem()
     * @generated
     */
    int GEAR_BUSINESS_ITEM = 34;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Regexp Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;


    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FileXmlMetadataImpl <em>File Xml Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FileXmlMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileXmlMetadata()
     * @generated
     */
    int FILE_XML_METADATA = 12;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Xml Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FileExcelMetadataImpl <em>File Excel Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FileExcelMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileExcelMetadata()
     * @generated
     */
    int FILE_EXCEL_METADATA = 13;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Excel Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FileLdifMetadataImpl <em>File Ldif Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FileLdifMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileLdifMetadata()
     * @generated
     */
    int FILE_LDIF_METADATA = 14;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Ldif Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;


    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.GenericSchemaMetadataImpl <em>Generic Schema Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.GenericSchemaMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getGenericSchemaMetadata()
     * @generated
     */
    int GENERIC_SCHEMA_METADATA = 15;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Generic Schema Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BaseBusinessItemRelationshipImpl <em>Base Business Item Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BaseBusinessItemRelationshipImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBaseBusinessItemRelationship()
     * @generated
     */
    int BASE_BUSINESS_ITEM_RELATIONSHIP = 19;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DirectionalBusinessItemRelationshipImpl <em>Directional Business Item Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DirectionalBusinessItemRelationshipImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDirectionalBusinessItemRelationship()
     * @generated
     */
    int DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP = 21;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BidirectionalBusinessItemRelationshipImpl <em>Bidirectional Business Item Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BidirectionalBusinessItemRelationshipImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBidirectionalBusinessItemRelationship()
     * @generated
     */
    int BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP = 22;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.ContextImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getContext()
     * @generated
     */
    int CONTEXT = 16;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;


    /**
     * The feature id for the '<em><b>Business Item</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ASSIGNMENT__BUSINESS_ITEM = 0;

    /**
     * The feature id for the '<em><b>Talaxie Item</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int BUSINESS_ASSIGNMENT__TALEND_ITEM = 1;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ASSIGNMENT__COMMENT = 2;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ASSIGNMENT_FEATURE_COUNT = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__NAME = 0;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__BUSINESS_PROCESS = 1;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__ASSIGNMENTS = 2;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__VALIGNMENT = 3;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__HALIGNMENT = 4;

    /**
     * The number of structural features of the '<em>Item</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_FEATURE_COUNT = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_BUSINESS_ITEM_RELATIONSHIP__NAME = BUSINESS_ITEM__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_BUSINESS_ITEM_RELATIONSHIP__BUSINESS_PROCESS = BUSINESS_ITEM__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_BUSINESS_ITEM_RELATIONSHIP__ASSIGNMENTS = BUSINESS_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_BUSINESS_ITEM_RELATIONSHIP__VALIGNMENT = BUSINESS_ITEM__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_BUSINESS_ITEM_RELATIONSHIP__HALIGNMENT = BUSINESS_ITEM__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE = BUSINESS_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET = BUSINESS_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Base Business Item Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_BUSINESS_ITEM_RELATIONSHIP_FEATURE_COUNT = BUSINESS_ITEM_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__NAME = BASE_BUSINESS_ITEM_RELATIONSHIP__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__BUSINESS_PROCESS = BASE_BUSINESS_ITEM_RELATIONSHIP__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__ASSIGNMENTS = BASE_BUSINESS_ITEM_RELATIONSHIP__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__VALIGNMENT = BASE_BUSINESS_ITEM_RELATIONSHIP__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__HALIGNMENT = BASE_BUSINESS_ITEM_RELATIONSHIP__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__SOURCE = BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__TARGET = BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET;

    /**
     * The number of structural features of the '<em>Item Relationship</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP_FEATURE_COUNT = BASE_BUSINESS_ITEM_RELATIONSHIP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__NAME = BASE_BUSINESS_ITEM_RELATIONSHIP__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__BUSINESS_PROCESS = BASE_BUSINESS_ITEM_RELATIONSHIP__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__ASSIGNMENTS = BASE_BUSINESS_ITEM_RELATIONSHIP__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__VALIGNMENT = BASE_BUSINESS_ITEM_RELATIONSHIP__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__HALIGNMENT = BASE_BUSINESS_ITEM_RELATIONSHIP__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__SOURCE = BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__TARGET = BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET;

    /**
     * The number of structural features of the '<em>Directional Business Item Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP_FEATURE_COUNT = BASE_BUSINESS_ITEM_RELATIONSHIP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__NAME = BASE_BUSINESS_ITEM_RELATIONSHIP__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__BUSINESS_PROCESS = BASE_BUSINESS_ITEM_RELATIONSHIP__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__ASSIGNMENTS = BASE_BUSINESS_ITEM_RELATIONSHIP__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__VALIGNMENT = BASE_BUSINESS_ITEM_RELATIONSHIP__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__HALIGNMENT = BASE_BUSINESS_ITEM_RELATIONSHIP__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__SOURCE = BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP__TARGET = BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET;

    /**
     * The number of structural features of the '<em>Bidirectional Business Item Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP_FEATURE_COUNT = BASE_BUSINESS_ITEM_RELATIONSHIP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__NAME = BUSINESS_ITEM__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS = BUSINESS_ITEM__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__ASSIGNMENTS = BUSINESS_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__VALIGNMENT = BUSINESS_ITEM__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__HALIGNMENT = BUSINESS_ITEM__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Item Shape</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE_FEATURE_COUNT = BUSINESS_ITEM_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Decision Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Action Business Item</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Terminal Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Data Business Item</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Document Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Input Business Item</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>List Business Item</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Database Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Actor Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Ellipse Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>VAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__VALIGNMENT = BUSINESS_ITEM_SHAPE__VALIGNMENT;

    /**
     * The feature id for the '<em><b>HAlignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__HALIGNMENT = BUSINESS_ITEM_SHAPE__HALIGNMENT;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Gear Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.QueryImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getQuery()
     * @generated
     */
    int QUERY = 35;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Query</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.JobletImpl <em>Joblet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.JobletImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getJoblet()
     * @generated
     */
    int JOBLET = 36;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Joblet</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.SQLPatternImpl <em>SQL Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.SQLPatternImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getSQLPattern()
     * @generated
     */
    int SQL_PATTERN = 37;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_PATTERN__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_PATTERN__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_PATTERN__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_PATTERN__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_PATTERN__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_PATTERN__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_PATTERN__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>SQL Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_PATTERN_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.SalesforceImpl <em>Salesforce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.SalesforceImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getSalesforce()
     * @generated
     */
    int SALESFORCE = 38;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Salesforce</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.CopybookImpl <em>Copybook</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.CopybookImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getCopybook()
     * @generated
     */
    int COPYBOOK = 39;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYBOOK__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYBOOK__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYBOOK__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYBOOK__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYBOOK__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYBOOK__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYBOOK__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Copybook</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COPYBOOK_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.MDMImpl <em>MDM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.MDMImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getMDM()
     * @generated
     */
    int MDM = 40;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>MDM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.WsdlImpl <em>Wsdl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.WsdlImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getWsdl()
     * @generated
     */
    int WSDL = 41;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Wsdl</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.LdapImpl <em>Ldap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.LdapImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getLdap()
     * @generated
     */
    int LDAP = 42;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Ldap</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.SAPFunctionImpl <em>SAP Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.SAPFunctionImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getSAPFunction()
     * @generated
     */
    int SAP_FUNCTION = 43;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>SAP Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.ServiceImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getService()
     * @generated
     */
    int SERVICE = 44;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Repository <em>Repository</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Repository</em>'.
     * @see org.talend.designer.business.model.business.Repository
     * @generated
     */
    EClass getRepository();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.business.model.business.Repository#getTalenditems <em>Talenditems</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Talenditems</em>'.
     * @see org.talend.designer.business.model.business.Repository#getTalenditems()
     * @see #getRepository()
     * @generated
     */
    EReference getRepository_Talenditems();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.TalendItem <em>Talaxie Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Talaxie Item</em>'.
     * @see org.talend.designer.business.model.business.TalendItem
     * @generated
     */
    EClass getTalendItem();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.TalendItem#getId <em>Id</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getId()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Id();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.TalendItem#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getLabel()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Label();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.TalendItem#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getAuthor()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Author();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.TalendItem#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getVersion()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Version();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.TalendItem#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getComment()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Comment();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.business.model.business.TalendItem#getAssignments <em>Assignments</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Assignments</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getAssignments()
     * @see #getTalendItem()
     * @generated
     */
    EReference getTalendItem_Assignments();

    /**
     * Returns the meta object for the container reference '{@link org.talend.designer.business.model.business.TalendItem#getRepository <em>Repository</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Repository</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getRepository()
     * @see #getTalendItem()
     * @generated
     */
    EReference getTalendItem_Repository();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BusinessProcess <em>Process</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see org.talend.designer.business.model.business.BusinessProcess
     * @generated
     */
    EClass getBusinessProcess();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.business.model.business.BusinessProcess#getBusinessItems <em>Business Items</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Business Items</em>'.
     * @see org.talend.designer.business.model.business.BusinessProcess#getBusinessItems()
     * @see #getBusinessProcess()
     * @generated
     */
    EReference getBusinessProcess_BusinessItems();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.business.model.business.BusinessProcess#getLocalRepositoryCopy <em>Local Repository Copy</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local Repository Copy</em>'.
     * @see org.talend.designer.business.model.business.BusinessProcess#getLocalRepositoryCopy()
     * @see #getBusinessProcess()
     * @generated
     */
    EReference getBusinessProcess_LocalRepositoryCopy();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Process <em>Process</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see org.talend.designer.business.model.business.Process
     * @generated
     */
    EClass getProcess();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Routine <em>Routine</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Routine</em>'.
     * @see org.talend.designer.business.model.business.Routine
     * @generated
     */
    EClass getRoutine();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Documentation</em>'.
     * @see org.talend.designer.business.model.business.Documentation
     * @generated
     */
    EClass getDocumentation();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DatabaseMetadata <em>Database Metadata</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Database Metadata</em>'.
     * @see org.talend.designer.business.model.business.DatabaseMetadata
     * @generated
     */
    EClass getDatabaseMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.SapFunctionMetadata <em>Sap Function Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sap Function Metadata</em>'.
     * @see org.talend.designer.business.model.business.SapFunctionMetadata
     * @generated
     */
    EClass getSapFunctionMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.TableMetadata <em>Table Metadata</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Table Metadata</em>'.
     * @see org.talend.designer.business.model.business.TableMetadata
     * @generated
     */
    EClass getTableMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FileDelimitedMetadata <em>File Delimited Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Delimited Metadata</em>'.
     * @see org.talend.designer.business.model.business.FileDelimitedMetadata
     * @generated
     */
    EClass getFileDelimitedMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FilePositionalMetadata <em>File Positional Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Positional Metadata</em>'.
     * @see org.talend.designer.business.model.business.FilePositionalMetadata
     * @generated
     */
    EClass getFilePositionalMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BusinessAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see org.talend.designer.business.model.business.BusinessAssignment
     * @generated
     */
    EClass getBusinessAssignment();

    /**
     * Returns the meta object for the container reference '{@link org.talend.designer.business.model.business.BusinessAssignment#getBusinessItem <em>Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Business Item</em>'.
     * @see org.talend.designer.business.model.business.BusinessAssignment#getBusinessItem()
     * @see #getBusinessAssignment()
     * @generated
     */
    EReference getBusinessAssignment_BusinessItem();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.business.model.business.BusinessAssignment#getTalendItem <em>Talaxie Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Talaxie Item</em>'.
     * @see org.talend.designer.business.model.business.BusinessAssignment#getTalendItem()
     * @see #getBusinessAssignment()
     * @generated
     */
    EReference getBusinessAssignment_TalendItem();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.BusinessAssignment#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see org.talend.designer.business.model.business.BusinessAssignment#getComment()
     * @see #getBusinessAssignment()
     * @generated
     */
    EAttribute getBusinessAssignment_Comment();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BusinessItem <em>Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Item</em>'.
     * @see org.talend.designer.business.model.business.BusinessItem
     * @generated
     */
    EClass getBusinessItem();

    /**
     * Returns the meta object for the container reference '{@link org.talend.designer.business.model.business.BusinessItem#getBusinessProcess <em>Business Process</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Business Process</em>'.
     * @see org.talend.designer.business.model.business.BusinessItem#getBusinessProcess()
     * @see #getBusinessItem()
     * @generated
     */
    EReference getBusinessItem_BusinessProcess();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.BusinessItem#getName <em>Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.business.model.business.BusinessItem#getName()
     * @see #getBusinessItem()
     * @generated
     */
    EAttribute getBusinessItem_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.business.model.business.BusinessItem#getAssignments <em>Assignments</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assignments</em>'.
     * @see org.talend.designer.business.model.business.BusinessItem#getAssignments()
     * @see #getBusinessItem()
     * @generated
     */
    EReference getBusinessItem_Assignments();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.BusinessItem#getVAlignment <em>VAlignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VAlignment</em>'.
     * @see org.talend.designer.business.model.business.BusinessItem#getVAlignment()
     * @see #getBusinessItem()
     * @generated
     */
    EAttribute getBusinessItem_VAlignment();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.BusinessItem#getHAlignment <em>HAlignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>HAlignment</em>'.
     * @see org.talend.designer.business.model.business.BusinessItem#getHAlignment()
     * @see #getBusinessItem()
     * @generated
     */
    EAttribute getBusinessItem_HAlignment();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BaseBusinessItemRelationship <em>Base Business Item Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Business Item Relationship</em>'.
     * @see org.talend.designer.business.model.business.BaseBusinessItemRelationship
     * @generated
     */
    EClass getBaseBusinessItemRelationship();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.business.model.business.BaseBusinessItemRelationship#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see org.talend.designer.business.model.business.BaseBusinessItemRelationship#getSource()
     * @see #getBaseBusinessItemRelationship()
     * @generated
     */
    EReference getBaseBusinessItemRelationship_Source();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.business.model.business.BaseBusinessItemRelationship#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.talend.designer.business.model.business.BaseBusinessItemRelationship#getTarget()
     * @see #getBaseBusinessItemRelationship()
     * @generated
     */
    EReference getBaseBusinessItemRelationship_Target();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BusinessItemRelationship <em>Item Relationship</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Relationship</em>'.
     * @see org.talend.designer.business.model.business.BusinessItemRelationship
     * @generated
     */
    EClass getBusinessItemRelationship();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DirectionalBusinessItemRelationship <em>Directional Business Item Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Directional Business Item Relationship</em>'.
     * @see org.talend.designer.business.model.business.DirectionalBusinessItemRelationship
     * @generated
     */
    EClass getDirectionalBusinessItemRelationship();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BidirectionalBusinessItemRelationship <em>Bidirectional Business Item Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bidirectional Business Item Relationship</em>'.
     * @see org.talend.designer.business.model.business.BidirectionalBusinessItemRelationship
     * @generated
     */
    EClass getBidirectionalBusinessItemRelationship();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BusinessItemShape <em>Item Shape</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Shape</em>'.
     * @see org.talend.designer.business.model.business.BusinessItemShape
     * @generated
     */
    EClass getBusinessItemShape();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.business.model.business.BusinessItemShape#getIncomingRelationships <em>Incoming Relationships</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Relationships</em>'.
     * @see org.talend.designer.business.model.business.BusinessItemShape#getIncomingRelationships()
     * @see #getBusinessItemShape()
     * @generated
     */
    EReference getBusinessItemShape_IncomingRelationships();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.business.model.business.BusinessItemShape#getOutgoingRelationships <em>Outgoing Relationships</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing Relationships</em>'.
     * @see org.talend.designer.business.model.business.BusinessItemShape#getOutgoingRelationships()
     * @see #getBusinessItemShape()
     * @generated
     */
    EReference getBusinessItemShape_OutgoingRelationships();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DecisionBusinessItem <em>Decision Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Decision Business Item</em>'.
     * @see org.talend.designer.business.model.business.DecisionBusinessItem
     * @generated
     */
    EClass getDecisionBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.ActionBusinessItem <em>Action Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Business Item</em>'.
     * @see org.talend.designer.business.model.business.ActionBusinessItem
     * @generated
     */
    EClass getActionBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.TerminalBusinessItem <em>Terminal Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Terminal Business Item</em>'.
     * @see org.talend.designer.business.model.business.TerminalBusinessItem
     * @generated
     */
    EClass getTerminalBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DataBusinessItem <em>Data Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Business Item</em>'.
     * @see org.talend.designer.business.model.business.DataBusinessItem
     * @generated
     */
    EClass getDataBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DocumentBusinessItem <em>Document Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Business Item</em>'.
     * @see org.talend.designer.business.model.business.DocumentBusinessItem
     * @generated
     */
    EClass getDocumentBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.InputBusinessItem <em>Input Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Business Item</em>'.
     * @see org.talend.designer.business.model.business.InputBusinessItem
     * @generated
     */
    EClass getInputBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.ListBusinessItem <em>List Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>List Business Item</em>'.
     * @see org.talend.designer.business.model.business.ListBusinessItem
     * @generated
     */
    EClass getListBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DatabaseBusinessItem <em>Database Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Database Business Item</em>'.
     * @see org.talend.designer.business.model.business.DatabaseBusinessItem
     * @generated
     */
    EClass getDatabaseBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FileRegexpMetadata <em>File Regexp Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Regexp Metadata</em>'.
     * @see org.talend.designer.business.model.business.FileRegexpMetadata
     * @generated
     */
    EClass getFileRegexpMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.ActorBusinessItem <em>Actor Business Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Actor Business Item</em>'.
     * @see org.talend.designer.business.model.business.ActorBusinessItem
     * @generated
     */
    EClass getActorBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.EllipseBusinessItem <em>Ellipse Business Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ellipse Business Item</em>'.
     * @see org.talend.designer.business.model.business.EllipseBusinessItem
     * @generated
     */
    EClass getEllipseBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.GearBusinessItem <em>Gear Business Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gear Business Item</em>'.
     * @see org.talend.designer.business.model.business.GearBusinessItem
     * @generated
     */
    EClass getGearBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Query <em>Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Query</em>'.
     * @see org.talend.designer.business.model.business.Query
     * @generated
     */
    EClass getQuery();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Joblet <em>Joblet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Joblet</em>'.
     * @see org.talend.designer.business.model.business.Joblet
     * @generated
     */
    EClass getJoblet();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.SQLPattern <em>SQL Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SQL Pattern</em>'.
     * @see org.talend.designer.business.model.business.SQLPattern
     * @generated
     */
    EClass getSQLPattern();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Salesforce <em>Salesforce</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Salesforce</em>'.
     * @see org.talend.designer.business.model.business.Salesforce
     * @generated
     */
    EClass getSalesforce();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Copybook <em>Copybook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Copybook</em>'.
     * @see org.talend.designer.business.model.business.Copybook
     * @generated
     */
    EClass getCopybook();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.MDM <em>MDM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>MDM</em>'.
     * @see org.talend.designer.business.model.business.MDM
     * @generated
     */
    EClass getMDM();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Wsdl <em>Wsdl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wsdl</em>'.
     * @see org.talend.designer.business.model.business.Wsdl
     * @generated
     */
    EClass getWsdl();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Ldap <em>Ldap</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ldap</em>'.
     * @see org.talend.designer.business.model.business.Ldap
     * @generated
     */
    EClass getLdap();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.SAPFunction <em>SAP Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAP Function</em>'.
     * @see org.talend.designer.business.model.business.SAPFunction
     * @generated
     */
    EClass getSAPFunction();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Service <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service</em>'.
     * @see org.talend.designer.business.model.business.Service
     * @generated
     */
    EClass getService();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Context <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context</em>'.
     * @see org.talend.designer.business.model.business.Context
     * @generated
     */
    EClass getContext();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FileXmlMetadata <em>File Xml Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Xml Metadata</em>'.
     * @see org.talend.designer.business.model.business.FileXmlMetadata
     * @generated
     */
    EClass getFileXmlMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FileExcelMetadata <em>File Excel Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Excel Metadata</em>'.
     * @see org.talend.designer.business.model.business.FileExcelMetadata
     * @generated
     */
    EClass getFileExcelMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FileLdifMetadata <em>File Ldif Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Ldif Metadata</em>'.
     * @see org.talend.designer.business.model.business.FileLdifMetadata
     * @generated
     */
    EClass getFileLdifMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.GenericSchemaMetadata <em>Generic Schema Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic Schema Metadata</em>'.
     * @see org.talend.designer.business.model.business.GenericSchemaMetadata
     * @generated
     */
    EClass getGenericSchemaMetadata();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    BusinessFactory getBusinessFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals  {

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.RepositoryImpl <em>Repository</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.RepositoryImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getRepository()
         * @generated
         */
        EClass REPOSITORY = eINSTANCE.getRepository();

        /**
         * The meta object literal for the '<em><b>Talenditems</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference REPOSITORY__TALENDITEMS = eINSTANCE.getRepository_Talenditems();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.TalendItemImpl <em>Talaxie Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.TalendItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTalendItem()
         * @generated
         */
        EClass TALEND_ITEM = eINSTANCE.getTalendItem();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__ID = eINSTANCE.getTalendItem_Id();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__LABEL = eINSTANCE.getTalendItem_Label();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__AUTHOR = eINSTANCE.getTalendItem_Author();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__VERSION = eINSTANCE.getTalendItem_Version();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__COMMENT = eINSTANCE.getTalendItem_Comment();

        /**
         * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference TALEND_ITEM__ASSIGNMENTS = eINSTANCE.getTalendItem_Assignments();

        /**
         * The meta object literal for the '<em><b>Repository</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference TALEND_ITEM__REPOSITORY = eINSTANCE.getTalendItem_Repository();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BusinessProcessImpl <em>Process</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BusinessProcessImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessProcess()
         * @generated
         */
        EClass BUSINESS_PROCESS = eINSTANCE.getBusinessProcess();

        /**
         * The meta object literal for the '<em><b>Business Items</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_PROCESS__BUSINESS_ITEMS = eINSTANCE.getBusinessProcess_BusinessItems();

        /**
         * The meta object literal for the '<em><b>Local Repository Copy</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY = eINSTANCE.getBusinessProcess_LocalRepositoryCopy();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.ProcessImpl <em>Process</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.ProcessImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getProcess()
         * @generated
         */
        EClass PROCESS = eINSTANCE.getProcess();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.RoutineImpl <em>Routine</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.RoutineImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getRoutine()
         * @generated
         */
        EClass ROUTINE = eINSTANCE.getRoutine();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DocumentationImpl <em>Documentation</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DocumentationImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDocumentation()
         * @generated
         */
        EClass DOCUMENTATION = eINSTANCE.getDocumentation();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DatabaseMetadataImpl <em>Database Metadata</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DatabaseMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDatabaseMetadata()
         * @generated
         */
        EClass DATABASE_METADATA = eINSTANCE.getDatabaseMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.SapFunctionMetadataImpl <em>Sap Function Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.SapFunctionMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getSapFunctionMetadata()
         * @generated
         */
        EClass SAP_FUNCTION_METADATA = eINSTANCE.getSapFunctionMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.TableMetadataImpl <em>Table Metadata</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.TableMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTableMetadata()
         * @generated
         */
        EClass TABLE_METADATA = eINSTANCE.getTableMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FileDelimitedMetadataImpl <em>File Delimited Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FileDelimitedMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileDelimitedMetadata()
         * @generated
         */
        EClass FILE_DELIMITED_METADATA = eINSTANCE.getFileDelimitedMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FilePositionalMetadataImpl <em>File Positional Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FilePositionalMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFilePositionalMetadata()
         * @generated
         */
        EClass FILE_POSITIONAL_METADATA = eINSTANCE.getFilePositionalMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BusinessAssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BusinessAssignmentImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessAssignment()
         * @generated
         */
        EClass BUSINESS_ASSIGNMENT = eINSTANCE.getBusinessAssignment();

        /**
         * The meta object literal for the '<em><b>Business Item</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BUSINESS_ASSIGNMENT__BUSINESS_ITEM = eINSTANCE.getBusinessAssignment_BusinessItem();

        /**
         * The meta object literal for the '<em><b>Talaxie Item</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ASSIGNMENT__TALEND_ITEM = eINSTANCE.getBusinessAssignment_TalendItem();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_ASSIGNMENT__COMMENT = eINSTANCE.getBusinessAssignment_Comment();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BusinessItemImpl <em>Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItem()
         * @generated
         */
        EClass BUSINESS_ITEM = eINSTANCE.getBusinessItem();

        /**
         * The meta object literal for the '<em><b>Business Process</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BUSINESS_ITEM__BUSINESS_PROCESS = eINSTANCE.getBusinessItem_BusinessProcess();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_ITEM__NAME = eINSTANCE.getBusinessItem_Name();

        /**
         * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BUSINESS_ITEM__ASSIGNMENTS = eINSTANCE.getBusinessItem_Assignments();

        /**
         * The meta object literal for the '<em><b>VAlignment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_ITEM__VALIGNMENT = eINSTANCE.getBusinessItem_VAlignment();

        /**
         * The meta object literal for the '<em><b>HAlignment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_ITEM__HALIGNMENT = eINSTANCE.getBusinessItem_HAlignment();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BaseBusinessItemRelationshipImpl <em>Base Business Item Relationship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BaseBusinessItemRelationshipImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBaseBusinessItemRelationship()
         * @generated
         */
        EClass BASE_BUSINESS_ITEM_RELATIONSHIP = eINSTANCE.getBaseBusinessItemRelationship();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE = eINSTANCE.getBaseBusinessItemRelationship_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET = eINSTANCE.getBaseBusinessItemRelationship_Target();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BusinessItemRelationshipImpl <em>Item Relationship</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BusinessItemRelationshipImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItemRelationship()
         * @generated
         */
        EClass BUSINESS_ITEM_RELATIONSHIP = eINSTANCE.getBusinessItemRelationship();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DirectionalBusinessItemRelationshipImpl <em>Directional Business Item Relationship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DirectionalBusinessItemRelationshipImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDirectionalBusinessItemRelationship()
         * @generated
         */
        EClass DIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP = eINSTANCE.getDirectionalBusinessItemRelationship();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BidirectionalBusinessItemRelationshipImpl <em>Bidirectional Business Item Relationship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BidirectionalBusinessItemRelationshipImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBidirectionalBusinessItemRelationship()
         * @generated
         */
        EClass BIDIRECTIONAL_BUSINESS_ITEM_RELATIONSHIP = eINSTANCE.getBidirectionalBusinessItemRelationship();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BusinessItemShapeImpl <em>Item Shape</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BusinessItemShapeImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItemShape()
         * @generated
         */
        EClass BUSINESS_ITEM_SHAPE = eINSTANCE.getBusinessItemShape();

        /**
         * The meta object literal for the '<em><b>Incoming Relationships</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS = eINSTANCE.getBusinessItemShape_IncomingRelationships();

        /**
         * The meta object literal for the '<em><b>Outgoing Relationships</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS = eINSTANCE.getBusinessItemShape_OutgoingRelationships();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DecisionBusinessItemImpl <em>Decision Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DecisionBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDecisionBusinessItem()
         * @generated
         */
        EClass DECISION_BUSINESS_ITEM = eINSTANCE.getDecisionBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.ActionBusinessItemImpl <em>Action Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.ActionBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getActionBusinessItem()
         * @generated
         */
        EClass ACTION_BUSINESS_ITEM = eINSTANCE.getActionBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.TerminalBusinessItemImpl <em>Terminal Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.TerminalBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTerminalBusinessItem()
         * @generated
         */
        EClass TERMINAL_BUSINESS_ITEM = eINSTANCE.getTerminalBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DataBusinessItemImpl <em>Data Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DataBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDataBusinessItem()
         * @generated
         */
        EClass DATA_BUSINESS_ITEM = eINSTANCE.getDataBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DocumentBusinessItemImpl <em>Document Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DocumentBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDocumentBusinessItem()
         * @generated
         */
        EClass DOCUMENT_BUSINESS_ITEM = eINSTANCE.getDocumentBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.InputBusinessItemImpl <em>Input Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.InputBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getInputBusinessItem()
         * @generated
         */
        EClass INPUT_BUSINESS_ITEM = eINSTANCE.getInputBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.ListBusinessItemImpl <em>List Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.ListBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getListBusinessItem()
         * @generated
         */
        EClass LIST_BUSINESS_ITEM = eINSTANCE.getListBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DatabaseBusinessItemImpl <em>Database Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DatabaseBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDatabaseBusinessItem()
         * @generated
         */
        EClass DATABASE_BUSINESS_ITEM = eINSTANCE.getDatabaseBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FileRegexpMetadataImpl <em>File Regexp Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FileRegexpMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileRegexpMetadata()
         * @generated
         */
        EClass FILE_REGEXP_METADATA = eINSTANCE.getFileRegexpMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.ActorBusinessItemImpl <em>Actor Business Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.ActorBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getActorBusinessItem()
         * @generated
         */
        EClass ACTOR_BUSINESS_ITEM = eINSTANCE.getActorBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.EllipseBusinessItemImpl <em>Ellipse Business Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.EllipseBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getEllipseBusinessItem()
         * @generated
         */
        EClass ELLIPSE_BUSINESS_ITEM = eINSTANCE.getEllipseBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.GearBusinessItemImpl <em>Gear Business Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.GearBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getGearBusinessItem()
         * @generated
         */
        EClass GEAR_BUSINESS_ITEM = eINSTANCE.getGearBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.QueryImpl <em>Query</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.QueryImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getQuery()
         * @generated
         */
        EClass QUERY = eINSTANCE.getQuery();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.JobletImpl <em>Joblet</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.JobletImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getJoblet()
         * @generated
         */
        EClass JOBLET = eINSTANCE.getJoblet();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.SQLPatternImpl <em>SQL Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.SQLPatternImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getSQLPattern()
         * @generated
         */
        EClass SQL_PATTERN = eINSTANCE.getSQLPattern();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.SalesforceImpl <em>Salesforce</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.SalesforceImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getSalesforce()
         * @generated
         */
        EClass SALESFORCE = eINSTANCE.getSalesforce();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.CopybookImpl <em>Copybook</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.CopybookImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getCopybook()
         * @generated
         */
        EClass COPYBOOK = eINSTANCE.getCopybook();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.MDMImpl <em>MDM</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.MDMImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getMDM()
         * @generated
         */
        EClass MDM = eINSTANCE.getMDM();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.WsdlImpl <em>Wsdl</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.WsdlImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getWsdl()
         * @generated
         */
        EClass WSDL = eINSTANCE.getWsdl();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.LdapImpl <em>Ldap</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.LdapImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getLdap()
         * @generated
         */
        EClass LDAP = eINSTANCE.getLdap();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.SAPFunctionImpl <em>SAP Function</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.SAPFunctionImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getSAPFunction()
         * @generated
         */
        EClass SAP_FUNCTION = eINSTANCE.getSAPFunction();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.ServiceImpl <em>Service</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.ServiceImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getService()
         * @generated
         */
        EClass SERVICE = eINSTANCE.getService();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.ContextImpl <em>Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.ContextImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getContext()
         * @generated
         */
        EClass CONTEXT = eINSTANCE.getContext();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FileXmlMetadataImpl <em>File Xml Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FileXmlMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileXmlMetadata()
         * @generated
         */
        EClass FILE_XML_METADATA = eINSTANCE.getFileXmlMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FileExcelMetadataImpl <em>File Excel Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FileExcelMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileExcelMetadata()
         * @generated
         */
        EClass FILE_EXCEL_METADATA = eINSTANCE.getFileExcelMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FileLdifMetadataImpl <em>File Ldif Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FileLdifMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileLdifMetadata()
         * @generated
         */
        EClass FILE_LDIF_METADATA = eINSTANCE.getFileLdifMetadata();

            /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.GenericSchemaMetadataImpl <em>Generic Schema Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.GenericSchemaMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getGenericSchemaMetadata()
         * @generated
         */
        EClass GENERIC_SCHEMA_METADATA = eINSTANCE.getGenericSchemaMetadata();

}

} // BusinessPackage
