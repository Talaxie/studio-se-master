/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.json.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.talend.repository.model.json.JSONXPathLoopDescriptor;
import org.talend.repository.model.json.JsonPackage;
import org.talend.repository.model.json.SchemaTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.repository.model.json.impl.SchemaTargetImpl#getRelativeXPathQuery <em>Relative XPath Query</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.SchemaTargetImpl#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.SchemaTargetImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaTargetImpl extends EObjectImpl implements SchemaTarget {
    /**
     * The default value of the '{@link #getRelativeXPathQuery() <em>Relative XPath Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelativeXPathQuery()
     * @generated
     * @ordered
     */
    protected static final String RELATIVE_XPATH_QUERY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRelativeXPathQuery() <em>Relative XPath Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelativeXPathQuery()
     * @generated
     * @ordered
     */
    protected String relativeXPathQuery = RELATIVE_XPATH_QUERY_EDEFAULT;

    /**
     * The default value of the '{@link #getTagName() <em>Tag Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTagName()
     * @generated
     * @ordered
     */
    protected static final String TAG_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTagName() <em>Tag Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTagName()
     * @generated
     * @ordered
     */
    protected String tagName = TAG_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchemaTargetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JsonPackage.Literals.SCHEMA_TARGET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRelativeXPathQuery() {
        return relativeXPathQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRelativeXPathQuery(String newRelativeXPathQuery) {
        String oldRelativeXPathQuery = relativeXPathQuery;
        relativeXPathQuery = newRelativeXPathQuery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.SCHEMA_TARGET__RELATIVE_XPATH_QUERY, oldRelativeXPathQuery, relativeXPathQuery));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTagName(String newTagName) {
        String oldTagName = tagName;
        tagName = newTagName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.SCHEMA_TARGET__TAG_NAME, oldTagName, tagName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JSONXPathLoopDescriptor getSchema() {
        if (eContainerFeatureID() != JsonPackage.SCHEMA_TARGET__SCHEMA) return null;
        return (JSONXPathLoopDescriptor)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSchema(JSONXPathLoopDescriptor newSchema, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSchema, JsonPackage.SCHEMA_TARGET__SCHEMA, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchema(JSONXPathLoopDescriptor newSchema) {
        if (newSchema != eInternalContainer() || (eContainerFeatureID() != JsonPackage.SCHEMA_TARGET__SCHEMA && newSchema != null)) {
            if (EcoreUtil.isAncestor(this, newSchema))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSchema != null)
                msgs = ((InternalEObject)newSchema).eInverseAdd(this, JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS, JSONXPathLoopDescriptor.class, msgs);
            msgs = basicSetSchema(newSchema, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.SCHEMA_TARGET__SCHEMA, newSchema, newSchema));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JsonPackage.SCHEMA_TARGET__SCHEMA:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSchema((JSONXPathLoopDescriptor)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JsonPackage.SCHEMA_TARGET__SCHEMA:
                return basicSetSchema(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case JsonPackage.SCHEMA_TARGET__SCHEMA:
                return eInternalContainer().eInverseRemove(this, JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS, JSONXPathLoopDescriptor.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JsonPackage.SCHEMA_TARGET__RELATIVE_XPATH_QUERY:
                return getRelativeXPathQuery();
            case JsonPackage.SCHEMA_TARGET__TAG_NAME:
                return getTagName();
            case JsonPackage.SCHEMA_TARGET__SCHEMA:
                return getSchema();
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
            case JsonPackage.SCHEMA_TARGET__RELATIVE_XPATH_QUERY:
                setRelativeXPathQuery((String)newValue);
                return;
            case JsonPackage.SCHEMA_TARGET__TAG_NAME:
                setTagName((String)newValue);
                return;
            case JsonPackage.SCHEMA_TARGET__SCHEMA:
                setSchema((JSONXPathLoopDescriptor)newValue);
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
            case JsonPackage.SCHEMA_TARGET__RELATIVE_XPATH_QUERY:
                setRelativeXPathQuery(RELATIVE_XPATH_QUERY_EDEFAULT);
                return;
            case JsonPackage.SCHEMA_TARGET__TAG_NAME:
                setTagName(TAG_NAME_EDEFAULT);
                return;
            case JsonPackage.SCHEMA_TARGET__SCHEMA:
                setSchema((JSONXPathLoopDescriptor)null);
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
            case JsonPackage.SCHEMA_TARGET__RELATIVE_XPATH_QUERY:
                return RELATIVE_XPATH_QUERY_EDEFAULT == null ? relativeXPathQuery != null : !RELATIVE_XPATH_QUERY_EDEFAULT.equals(relativeXPathQuery);
            case JsonPackage.SCHEMA_TARGET__TAG_NAME:
                return TAG_NAME_EDEFAULT == null ? tagName != null : !TAG_NAME_EDEFAULT.equals(tagName);
            case JsonPackage.SCHEMA_TARGET__SCHEMA:
                return getSchema() != null;
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
        result.append(" (RelativeXPathQuery: ");
        result.append(relativeXPathQuery);
        result.append(", TagName: ");
        result.append(tagName);
        result.append(')');
        return result.toString();
    }

} //SchemaTargetImpl
