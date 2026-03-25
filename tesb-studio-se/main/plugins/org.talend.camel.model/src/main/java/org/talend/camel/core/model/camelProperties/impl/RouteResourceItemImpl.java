/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.camel.core.model.camelProperties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.camel.core.model.camelProperties.CamelPropertiesPackage;
import org.talend.camel.core.model.camelProperties.RouteResourceItem;
import org.talend.core.model.properties.impl.FileItemImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Resource Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.camel.core.model.camelProperties.impl.RouteResourceItemImpl#getBindingExtension <em>Binding Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteResourceItemImpl extends FileItemImpl implements RouteResourceItem {
    /**
	 * The default value of the '{@link #getBindingExtension() <em>Binding Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_EXTENSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBindingExtension() <em>Binding Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingExtension()
	 * @generated
	 * @ordered
	 */
	protected String bindingExtension = BINDING_EXTENSION_EDEFAULT;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RouteResourceItemImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return CamelPropertiesPackage.Literals.ROUTE_RESOURCE_ITEM;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBindingExtension() {
		return bindingExtension;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingExtension(String newBindingExtension) {
		String oldBindingExtension = bindingExtension;
		bindingExtension = newBindingExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamelPropertiesPackage.ROUTE_RESOURCE_ITEM__BINDING_EXTENSION, oldBindingExtension, bindingExtension));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CamelPropertiesPackage.ROUTE_RESOURCE_ITEM__BINDING_EXTENSION:
				return getBindingExtension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamelPropertiesPackage.ROUTE_RESOURCE_ITEM__BINDING_EXTENSION:
				setBindingExtension((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CamelPropertiesPackage.ROUTE_RESOURCE_ITEM__BINDING_EXTENSION:
				setBindingExtension(BINDING_EXTENSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CamelPropertiesPackage.ROUTE_RESOURCE_ITEM__BINDING_EXTENSION:
				return BINDING_EXTENSION_EDEFAULT == null ? bindingExtension != null : !BINDING_EXTENSION_EDEFAULT.equals(bindingExtension);
		}
		return super.eIsSet(featureID);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bindingExtension: ");
		result.append(bindingExtension);
		result.append(')');
		return result.toString();
	}

} //RouteResourceItemImpl
