/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.codegen.persistence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Pool Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.talend.designer.codegen.persistence.PoolType#getPersistentPool <em>Persistent Pool</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.talend.designer.codegen.persistence.EmittersPoolPackage#getPoolType()
 * @model extendedMetaData="name='Pool_._type' kind='elementOnly'"
 * @generated
 */
public interface PoolType extends EObject {

    /**
     * Returns the value of the '<em><b>Persistent Pool</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persistent Pool</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Persistent Pool</em>' attribute.
     * @see #setPersistentPool(byte[])
     * @see org.talend.designer.codegen.persistence.EmittersPoolPackage#getPoolType_PersistentPool()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" required="true"
     * extendedMetaData="kind='element' name='PersistentPool' namespace='##targetNamespace'"
     * @generated
     */
    byte[] getPersistentPool();

    /**
     * Sets the value of the '{@link org.talend.designer.codegen.persistence.PoolType#getPersistentPool <em>Persistent Pool</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Persistent Pool</em>' attribute.
     * @see #getPersistentPool()
     * @generated
     */
    void setPersistentPool(byte[] value);

} // PoolType
