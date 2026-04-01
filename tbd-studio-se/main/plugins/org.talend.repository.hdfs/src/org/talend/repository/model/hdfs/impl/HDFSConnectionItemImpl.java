/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.hdfs.impl;

import org.eclipse.emf.ecore.EClass;

import org.talend.repository.model.hadoopcluster.impl.HadoopSubConnectionItemImpl;

import org.talend.repository.model.hdfs.HDFSConnectionItem;
import org.talend.repository.model.hdfs.HDFSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HDFSConnectionItemImpl extends HadoopSubConnectionItemImpl implements HDFSConnectionItem {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HDFSConnectionItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HDFSPackage.Literals.HDFS_CONNECTION_ITEM;
    }

} //HDFSConnectionItemImpl
