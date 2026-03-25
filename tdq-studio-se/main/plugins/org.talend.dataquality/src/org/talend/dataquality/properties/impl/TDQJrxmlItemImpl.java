/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.properties.impl;

import org.eclipse.emf.ecore.EClass;
import org.talend.commons.emf.FactoriesUtil;
import org.talend.dataquality.properties.PropertiesPackage;
import org.talend.dataquality.properties.TDQJrxmlItem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>TDQ Jrxml Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class TDQJrxmlItemImpl extends TDQFileItemImpl implements TDQJrxmlItem {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TDQJrxmlItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.TDQ_JRXML_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String getFileExtension() {
        return FactoriesUtil.JRXML;
    }

} // TDQJrxmlItemImpl
