/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.codegen.persistence;

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
 * 
 * @see org.talend.designer.codegen.persistence.EmittersPoolFactory
 * @model kind="package" extendedMetaData="qualified='false'"
 * @generated
 */
public interface EmittersPoolPackage extends EPackage {

    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNAME = "org.talend.designer.codegen.persistence"; //$NON-NLS-1$

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_URI = "platform:/resource/org.talend.designer.codegen/src/main/java/org/talend/designer/codegen/utils/emf/EmittersPool.xsd"; //$NON-NLS-1$

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_PREFIX = "EmittersPool"; //$NON-NLS-1$

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EmittersPoolPackage eINSTANCE = org.talend.designer.codegen.persistence.impl.EmittersPoolPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.designer.codegen.persistence.impl.DocumentRootImpl <em>Document Root</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.talend.designer.codegen.persistence.impl.DocumentRootImpl
     * @see org.talend.designer.codegen.persistence.impl.EmittersPoolPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 0;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Pool</b></em>' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__POOL = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.talend.designer.codegen.persistence.impl.PoolTypeImpl <em>Pool Type</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.talend.designer.codegen.persistence.impl.PoolTypeImpl
     * @see org.talend.designer.codegen.persistence.impl.EmittersPoolPackageImpl#getPoolType()
     * @generated
     */
    int POOL_TYPE = 1;

    /**
     * The feature id for the '<em><b>Persistent Pool</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int POOL_TYPE__PERSISTENT_POOL = 0;

    /**
     * The number of structural features of the '<em>Pool Type</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int POOL_TYPE_FEATURE_COUNT = 1;

    /**
     * Returns the meta object for class '{@link org.talend.designer.codegen.persistence.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.talend.designer.codegen.persistence.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.designer.codegen.persistence.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.talend.designer.codegen.persistence.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.talend.designer.codegen.persistence.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.talend.designer.codegen.persistence.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.talend.designer.codegen.persistence.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.talend.designer.codegen.persistence.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.codegen.persistence.DocumentRoot#getPool <em>Pool</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Pool</em>'.
     * @see org.talend.designer.codegen.persistence.DocumentRoot#getPool()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Pool();

    /**
     * Returns the meta object for class '{@link org.talend.designer.codegen.persistence.PoolType <em>Pool Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Pool Type</em>'.
     * @see org.talend.designer.codegen.persistence.PoolType
     * @generated
     */
    EClass getPoolType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.codegen.persistence.PoolType#getPersistentPool <em>Persistent Pool</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Persistent Pool</em>'.
     * @see org.talend.designer.codegen.persistence.PoolType#getPersistentPool()
     * @see #getPoolType()
     * @generated
     */
    EAttribute getPoolType_PersistentPool();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EmittersPoolFactory getEmittersPoolFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    interface Literals {

        /**
         * The meta object literal for the '{@link org.talend.designer.codegen.persistence.impl.DocumentRootImpl <em>Document Root</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.talend.designer.codegen.persistence.impl.DocumentRootImpl
         * @see org.talend.designer.codegen.persistence.impl.EmittersPoolPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature. <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature. <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature. <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Pool</b></em>' containment reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference DOCUMENT_ROOT__POOL = eINSTANCE.getDocumentRoot_Pool();

        /**
         * The meta object literal for the '{@link org.talend.designer.codegen.persistence.impl.PoolTypeImpl <em>Pool Type</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.talend.designer.codegen.persistence.impl.PoolTypeImpl
         * @see org.talend.designer.codegen.persistence.impl.EmittersPoolPackageImpl#getPoolType()
         * @generated
         */
        EClass POOL_TYPE = eINSTANCE.getPoolType();

        /**
         * The meta object literal for the '<em><b>Persistent Pool</b></em>' attribute feature. <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute POOL_TYPE__PERSISTENT_POOL = eINSTANCE.getPoolType_PersistentPool();

    }

} // EmittersPoolPackage
