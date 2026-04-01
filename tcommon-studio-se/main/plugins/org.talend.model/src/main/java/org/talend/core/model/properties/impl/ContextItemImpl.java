/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.properties.PropertiesPackage;

import org.talend.designer.core.model.utils.emf.talendfile.ContextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ContextItemImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ContextItemImpl#getDefaultContext <em>Default Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextItemImpl extends ItemImpl implements ContextItem {
    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected EList context;

    /**
     * The default value of the '{@link #getDefaultContext() <em>Default Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultContext()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultContext() <em>Default Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultContext()
     * @generated
     * @ordered
     */
    protected String defaultContext = DEFAULT_CONTEXT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.CONTEXT_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getContext() {
        if (context == null) {
            context = new EObjectResolvingEList(ContextType.class, this, PropertiesPackage.CONTEXT_ITEM__CONTEXT);
        }
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultContext() {
        return defaultContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultContext(String newDefaultContext) {
        String oldDefaultContext = defaultContext;
        defaultContext = newDefaultContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CONTEXT_ITEM__DEFAULT_CONTEXT, oldDefaultContext, defaultContext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.CONTEXT_ITEM__CONTEXT:
                return getContext();
            case PropertiesPackage.CONTEXT_ITEM__DEFAULT_CONTEXT:
                return getDefaultContext();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.CONTEXT_ITEM__CONTEXT:
                getContext().clear();
                getContext().addAll((Collection)newValue);
                return;
            case PropertiesPackage.CONTEXT_ITEM__DEFAULT_CONTEXT:
                setDefaultContext((String)newValue);
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
            case PropertiesPackage.CONTEXT_ITEM__CONTEXT:
                getContext().clear();
                return;
            case PropertiesPackage.CONTEXT_ITEM__DEFAULT_CONTEXT:
                setDefaultContext(DEFAULT_CONTEXT_EDEFAULT);
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
            case PropertiesPackage.CONTEXT_ITEM__CONTEXT:
                return context != null && !context.isEmpty();
            case PropertiesPackage.CONTEXT_ITEM__DEFAULT_CONTEXT:
                return DEFAULT_CONTEXT_EDEFAULT == null ? defaultContext != null : !DEFAULT_CONTEXT_EDEFAULT.equals(defaultContext);
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
        result.append(" (defaultContext: ");
        result.append(defaultContext);
        result.append(')');
        return result.toString();
    }

} //ContextItemImpl