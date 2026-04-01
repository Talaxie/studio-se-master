/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.codegen.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.talend.designer.codegen.persistence.EmittersPoolPackage
 * @generated
 */
public interface EmittersPoolFactory extends EFactory {

    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EmittersPoolFactory eINSTANCE = org.talend.designer.codegen.persistence.impl.EmittersPoolFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Document Root</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>Pool Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Pool Type</em>'.
     * @generated
     */
    PoolType createPoolType();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    EmittersPoolPackage getEmittersPoolPackage();

} // EmittersPoolFactory
