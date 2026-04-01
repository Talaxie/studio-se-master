/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.codegen.persistence;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Document Root</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.talend.designer.codegen.persistence.DocumentRoot#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.talend.designer.codegen.persistence.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.talend.designer.codegen.persistence.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.talend.designer.codegen.persistence.DocumentRoot#getPool <em>Pool</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.talend.designer.codegen.persistence.EmittersPoolPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {

    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list. The list contents are of type
     * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.talend.designer.codegen.persistence.EmittersPoolPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     * extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map. The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String}, <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.talend.designer.codegen.persistence.EmittersPoolPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String"
     * valueType="java.lang.String" transient="true" extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map. The key is of type
     * {@link java.lang.String}, and the value is of type {@link java.lang.String}, <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.talend.designer.codegen.persistence.EmittersPoolPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String"
     * valueType="java.lang.String" transient="true" extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Pool</b></em>' containment reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pool</em>' containment reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Pool</em>' containment reference.
     * @see #setPool(PoolType)
     * @see org.talend.designer.codegen.persistence.EmittersPoolPackage#getDocumentRoot_Pool()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     * extendedMetaData="kind='element' name='Pool' namespace='##targetNamespace'"
     * @generated
     */
    PoolType getPool();

    /**
     * Sets the value of the '{@link org.talend.designer.codegen.persistence.DocumentRoot#getPool <em>Pool</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Pool</em>' containment reference.
     * @see #getPool()
     * @generated
     */
    void setPool(PoolType value);

} // DocumentRoot
