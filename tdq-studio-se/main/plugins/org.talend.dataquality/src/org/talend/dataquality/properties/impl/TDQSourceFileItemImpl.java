/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.properties.impl;

import org.eclipse.emf.ecore.EClass;
import org.talend.commons.utils.WorkspaceUtils;
import org.talend.dataquality.properties.PropertiesPackage;
import org.talend.dataquality.properties.TDQSourceFileItem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>TDQ Source File Item</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class TDQSourceFileItemImpl extends TDQFileItemImpl implements TDQSourceFileItem {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TDQSourceFileItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.TDQ_SOURCE_FILE_ITEM;
    }

    @Override
    public String getFileExtension() {
        return WorkspaceUtils.SQL_EXTENSION;
    }

} // TDQSourceFileItemImpl
