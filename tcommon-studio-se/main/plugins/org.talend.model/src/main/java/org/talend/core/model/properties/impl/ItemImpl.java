/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.talend.core.model.properties.FolderItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.ReferenceFileItem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ItemImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ItemImpl#getState <em>State</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ItemImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ItemImpl#getReferenceResources <em>Reference Resources</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ItemImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ItemImpl#isNeedVersion <em>Need Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ItemImpl extends EObjectImpl implements Item {

    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected Property property;

    /**
     * The cached value of the '{@link #getState() <em>State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getState()
     * @generated
     * @ordered
     */
    protected ItemState state;
    /**
     * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected EObject parent;

    /**
     * The cached value of the '{@link #getReferenceResources() <em>Reference Resources</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceResources()
     * @generated
     * @ordered
     */
    protected EList referenceResources;

    /**
     * The default value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileExtension()
     * @generated
     * @ordered
     */
    protected static final String FILE_EXTENSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileExtension()
     * @generated
     * @ordered
     */
    protected String fileExtension = FILE_EXTENSION_EDEFAULT;

    /**
     * The default value of the '{@link #isNeedVersion() <em>Need Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNeedVersion()
     * @generated
     * @ordered
     */
    protected static final boolean NEED_VERSION_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isNeedVersion() <em>Need Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNeedVersion()
     * @generated
     * @ordered
     */
    protected boolean needVersion = NEED_VERSION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Property getProperty() {
        if (property != null && property.eIsProxy()) {
            InternalEObject oldProperty = (InternalEObject)property;
            property = (Property)eResolveProxy(oldProperty);
            if (property != oldProperty) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.ITEM__PROPERTY, oldProperty, property));
            }
        }
        return property;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Property basicGetProperty() {
        return property;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs) {
        Property oldProperty = property;
        property = newProperty;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM__PROPERTY, oldProperty, newProperty);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setProperty(Property newProperty) {
        if (newProperty != property) {
            NotificationChain msgs = null;
            if (property != null)
                msgs = ((InternalEObject)property).eInverseRemove(this, PropertiesPackage.PROPERTY__ITEM, Property.class, msgs);
            if (newProperty != null)
                msgs = ((InternalEObject)newProperty).eInverseAdd(this, PropertiesPackage.PROPERTY__ITEM, Property.class, msgs);
            msgs = basicSetProperty(newProperty, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM__PROPERTY, newProperty, newProperty));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public ItemState getState() {
        if (state != null && state.eIsProxy()) {
            InternalEObject oldState = (InternalEObject) state;
            state = (ItemState) eResolveProxy(oldState);
            if (state != oldState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.ITEM__STATE, oldState, state));
            }
            if (this instanceof FolderItem) {
                state.setItemRelated(this);
            }
        }
        return state;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemState basicGetState() {
        return state;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public void setState(ItemState newState) {
        ItemState oldState = state;
        state = newState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM__STATE, oldState, state));
        if (this instanceof FolderItem) {
            state.setItemRelated(this);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getParent() {
        if (parent != null && parent.eIsProxy()) {
            InternalEObject oldParent = (InternalEObject)parent;
            parent = eResolveProxy(oldParent);
            if (parent != oldParent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.ITEM__PARENT, oldParent, parent));
            }
        }
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetParent() {
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(EObject newParent) {
        EObject oldParent = parent;
        parent = newParent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM__PARENT, oldParent, parent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getReferenceResources() {
        if (referenceResources == null) {
            referenceResources = new EObjectResolvingEList(ReferenceFileItem.class, this, PropertiesPackage.ITEM__REFERENCE_RESOURCES);
        }
        return referenceResources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFileExtension(String newFileExtension) {
        String oldFileExtension = fileExtension;
        fileExtension = newFileExtension;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM__FILE_EXTENSION, oldFileExtension, fileExtension));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNeedVersion() {
        return needVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNeedVersion(boolean newNeedVersion) {
        boolean oldNeedVersion = needVersion;
        needVersion = newNeedVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.ITEM__NEED_VERSION, oldNeedVersion, needVersion));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.ITEM__PROPERTY:
                if (property != null)
                    msgs = ((InternalEObject)property).eInverseRemove(this, PropertiesPackage.PROPERTY__ITEM, Property.class, msgs);
                return basicSetProperty((Property)otherEnd, msgs);
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
            case PropertiesPackage.ITEM__PROPERTY:
                return basicSetProperty(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.ITEM__PROPERTY:
                if (resolve) return getProperty();
                return basicGetProperty();
            case PropertiesPackage.ITEM__STATE:
                if (resolve) return getState();
                return basicGetState();
            case PropertiesPackage.ITEM__PARENT:
                if (resolve) return getParent();
                return basicGetParent();
            case PropertiesPackage.ITEM__REFERENCE_RESOURCES:
                return getReferenceResources();
            case PropertiesPackage.ITEM__FILE_EXTENSION:
                return getFileExtension();
            case PropertiesPackage.ITEM__NEED_VERSION:
                return isNeedVersion() ? Boolean.TRUE : Boolean.FALSE;
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
            case PropertiesPackage.ITEM__PROPERTY:
                setProperty((Property)newValue);
                return;
            case PropertiesPackage.ITEM__STATE:
                setState((ItemState)newValue);
                return;
            case PropertiesPackage.ITEM__PARENT:
                setParent((EObject)newValue);
                return;
            case PropertiesPackage.ITEM__REFERENCE_RESOURCES:
                getReferenceResources().clear();
                getReferenceResources().addAll((Collection)newValue);
                return;
            case PropertiesPackage.ITEM__FILE_EXTENSION:
                setFileExtension((String)newValue);
                return;
            case PropertiesPackage.ITEM__NEED_VERSION:
                setNeedVersion(((Boolean)newValue).booleanValue());
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
            case PropertiesPackage.ITEM__PROPERTY:
                setProperty((Property)null);
                return;
            case PropertiesPackage.ITEM__STATE:
                setState((ItemState)null);
                return;
            case PropertiesPackage.ITEM__PARENT:
                setParent((EObject)null);
                return;
            case PropertiesPackage.ITEM__REFERENCE_RESOURCES:
                getReferenceResources().clear();
                return;
            case PropertiesPackage.ITEM__FILE_EXTENSION:
                setFileExtension(FILE_EXTENSION_EDEFAULT);
                return;
            case PropertiesPackage.ITEM__NEED_VERSION:
                setNeedVersion(NEED_VERSION_EDEFAULT);
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
            case PropertiesPackage.ITEM__PROPERTY:
                return property != null;
            case PropertiesPackage.ITEM__STATE:
                return state != null;
            case PropertiesPackage.ITEM__PARENT:
                return parent != null;
            case PropertiesPackage.ITEM__REFERENCE_RESOURCES:
                return referenceResources != null && !referenceResources.isEmpty();
            case PropertiesPackage.ITEM__FILE_EXTENSION:
                return FILE_EXTENSION_EDEFAULT == null ? fileExtension != null : !FILE_EXTENSION_EDEFAULT.equals(fileExtension);
            case PropertiesPackage.ITEM__NEED_VERSION:
                return needVersion != NEED_VERSION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    @Override
    public String toString() {
        return getProperty().toString();
    }

} // ItemImpl
