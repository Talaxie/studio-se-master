/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.hdfs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.repository.model.hdfs.HDFSPackage
 * @generated
 */
public interface HDFSFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    HDFSFactory eINSTANCE = org.talend.repository.model.hdfs.impl.HDFSFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connection</em>'.
     * @generated
     */
    HDFSConnection createHDFSConnection();

    /**
     * Returns a new object of class '<em>Connection Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connection Item</em>'.
     * @generated
     */
    HDFSConnectionItem createHDFSConnectionItem();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    HDFSPackage getHDFSPackage();

} //HDFSFactory
