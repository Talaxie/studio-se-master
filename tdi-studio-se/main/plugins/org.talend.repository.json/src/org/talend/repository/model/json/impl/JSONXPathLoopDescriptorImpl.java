/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.repository.model.json.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.repository.model.json.JSONFileConnection;
import org.talend.repository.model.json.JSONXPathLoopDescriptor;
import org.talend.repository.model.json.JsonPackage;
import org.talend.repository.model.json.SchemaTarget;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>JSONX Path Loop Descriptor</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.repository.model.json.impl.JSONXPathLoopDescriptorImpl#getLimitBoucle <em>Limit Boucle</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONXPathLoopDescriptorImpl#getAbsoluteXPathQuery <em>Absolute XPath Query</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONXPathLoopDescriptorImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONXPathLoopDescriptorImpl#getSchemaTargets <em>Schema Targets</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONXPathLoopDescriptorImpl#getFlag <em>Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JSONXPathLoopDescriptorImpl extends EObjectImpl implements JSONXPathLoopDescriptor {

    /**
     * The default value of the '{@link #getLimitBoucle() <em>Limit Boucle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimitBoucle()
     * @generated
     * @ordered
     */
    protected static final Integer LIMIT_BOUCLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLimitBoucle() <em>Limit Boucle</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLimitBoucle()
     * @generated
     * @ordered
     */
    protected Integer limitBoucle = LIMIT_BOUCLE_EDEFAULT;

    /**
     * The default value of the '{@link #getAbsoluteXPathQuery() <em>Absolute XPath Query</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAbsoluteXPathQuery()
     * @generated
     * @ordered
     */
    protected static final String ABSOLUTE_XPATH_QUERY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAbsoluteXPathQuery() <em>Absolute XPath Query</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAbsoluteXPathQuery()
     * @generated
     * @ordered
     */
    protected String absoluteXPathQuery = ABSOLUTE_XPATH_QUERY_EDEFAULT;

    /**
     * The cached value of the '{@link #getSchemaTargets() <em>Schema Targets</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSchemaTargets()
     * @generated
     * @ordered
     */
    protected EList<SchemaTarget> schemaTargets;

    /**
     * The default value of the '{@link #getFlag() <em>Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlag()
     * @generated
     * @ordered
     */
    protected static final String FLAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlag() <em>Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlag()
     * @generated
     * @ordered
     */
    protected String flag = FLAG_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected JSONXPathLoopDescriptorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JsonPackage.Literals.JSONX_PATH_LOOP_DESCRIPTOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Integer getLimitBoucle() {
        return limitBoucle;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLimitBoucle(Integer newLimitBoucle) {
        Integer oldLimitBoucle = limitBoucle;
        limitBoucle = newLimitBoucle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__LIMIT_BOUCLE, oldLimitBoucle, limitBoucle));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getAbsoluteXPathQuery() {
        return absoluteXPathQuery;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAbsoluteXPathQuery(String newAbsoluteXPathQuery) {
        String oldAbsoluteXPathQuery = absoluteXPathQuery;
        absoluteXPathQuery = newAbsoluteXPathQuery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__ABSOLUTE_XPATH_QUERY, oldAbsoluteXPathQuery, absoluteXPathQuery));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public JSONFileConnection getConnection() {
        if (eContainerFeatureID() != JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION) return null;
        return (JSONFileConnection)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnection(JSONFileConnection newConnection, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newConnection, JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setConnection(JSONFileConnection newConnection) {
        if (newConnection != eInternalContainer() || (eContainerFeatureID() != JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION && newConnection != null)) {
            if (EcoreUtil.isAncestor(this, newConnection))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newConnection != null)
                msgs = ((InternalEObject)newConnection).eInverseAdd(this, JsonPackage.JSON_FILE_CONNECTION__SCHEMA, JSONFileConnection.class, msgs);
            msgs = basicSetConnection(newConnection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION, newConnection, newConnection));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SchemaTarget> getSchemaTargets() {
        if (schemaTargets == null) {
            schemaTargets = new EObjectContainmentWithInverseEList<SchemaTarget>(SchemaTarget.class, this, JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS, JsonPackage.SCHEMA_TARGET__SCHEMA);
        }
        return schemaTargets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFlag() {
        return flag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlag(String newFlag) {
        String oldFlag = flag;
        flag = newFlag;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__FLAG, oldFlag, flag));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetConnection((JSONFileConnection)otherEnd, msgs);
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchemaTargets()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION:
                return basicSetConnection(null, msgs);
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS:
                return ((InternalEList<?>)getSchemaTargets()).basicRemove(otherEnd, msgs);
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
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION:
                return eInternalContainer().eInverseRemove(this, JsonPackage.JSON_FILE_CONNECTION__SCHEMA, JSONFileConnection.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__LIMIT_BOUCLE:
                return getLimitBoucle();
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__ABSOLUTE_XPATH_QUERY:
                return getAbsoluteXPathQuery();
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION:
                return getConnection();
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS:
                return getSchemaTargets();
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__FLAG:
                return getFlag();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__LIMIT_BOUCLE:
                setLimitBoucle((Integer)newValue);
                return;
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__ABSOLUTE_XPATH_QUERY:
                setAbsoluteXPathQuery((String)newValue);
                return;
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION:
                setConnection((JSONFileConnection)newValue);
                return;
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS:
                getSchemaTargets().clear();
                getSchemaTargets().addAll((Collection<? extends SchemaTarget>)newValue);
                return;
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__FLAG:
                setFlag((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__LIMIT_BOUCLE:
                setLimitBoucle(LIMIT_BOUCLE_EDEFAULT);
                return;
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__ABSOLUTE_XPATH_QUERY:
                setAbsoluteXPathQuery(ABSOLUTE_XPATH_QUERY_EDEFAULT);
                return;
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION:
                setConnection((JSONFileConnection)null);
                return;
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS:
                getSchemaTargets().clear();
                return;
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__FLAG:
                setFlag(FLAG_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__LIMIT_BOUCLE:
                return LIMIT_BOUCLE_EDEFAULT == null ? limitBoucle != null : !LIMIT_BOUCLE_EDEFAULT.equals(limitBoucle);
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__ABSOLUTE_XPATH_QUERY:
                return ABSOLUTE_XPATH_QUERY_EDEFAULT == null ? absoluteXPathQuery != null : !ABSOLUTE_XPATH_QUERY_EDEFAULT.equals(absoluteXPathQuery);
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION:
                return getConnection() != null;
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS:
                return schemaTargets != null && !schemaTargets.isEmpty();
            case JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__FLAG:
                return FLAG_EDEFAULT == null ? flag != null : !FLAG_EDEFAULT.equals(flag);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (LimitBoucle: ");
        result.append(limitBoucle);
        result.append(", AbsoluteXPathQuery: ");
        result.append(absoluteXPathQuery);
        result.append(", flag: ");
        result.append(flag);
        result.append(')');
        return result.toString();
    }

} // JSONXPathLoopDescriptorImpl
