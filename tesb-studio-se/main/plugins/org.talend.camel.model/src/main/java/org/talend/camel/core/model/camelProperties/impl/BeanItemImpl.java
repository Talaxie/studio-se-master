/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.camel.core.model.camelProperties.impl;

import org.eclipse.emf.ecore.EClass;
import org.talend.camel.core.model.camelProperties.BeanItem;
import org.talend.camel.core.model.camelProperties.CamelPropertiesPackage;
import org.talend.core.model.properties.impl.RoutineItemImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BeanItemImpl extends RoutineItemImpl implements BeanItem {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BeanItemImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return CamelPropertiesPackage.Literals.BEAN_ITEM;
	}
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @Not generated
     */
    public String getPackageType() {
        return "beans";
    }

} //BeanItemImpl
