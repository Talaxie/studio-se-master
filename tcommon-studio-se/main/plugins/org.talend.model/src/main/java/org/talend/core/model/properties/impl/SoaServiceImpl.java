/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.SoaOperation;
import org.talend.core.model.properties.SoaService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soa Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getCreation <em>Creation</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getUsedType <em>Used Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getParamStyle <em>Param Style</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaServiceImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoaServiceImpl extends EObjectImpl implements SoaService {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameSpace()
     * @generated
     * @ordered
     */
    protected static final String NAME_SPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameSpace()
     * @generated
     * @ordered
     */
    protected String nameSpace = NAME_SPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContact()
     * @generated
     * @ordered
     */
    protected static final String CONTACT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContact()
     * @generated
     * @ordered
     */
    protected String contact = CONTACT_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getCreation() <em>Creation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreation()
     * @generated
     * @ordered
     */
    protected static final Date CREATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCreation() <em>Creation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreation()
     * @generated
     * @ordered
     */
    protected Date creation = CREATION_EDEFAULT;

    /**
     * The default value of the '{@link #getModification() <em>Modification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModification()
     * @generated
     * @ordered
     */
    protected static final Date MODIFICATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModification() <em>Modification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModification()
     * @generated
     * @ordered
     */
    protected Date modification = MODIFICATION_EDEFAULT;

    /**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected static final int PORT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected int port = PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected static final String STYLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected String style = STYLE_EDEFAULT;

    /**
     * The default value of the '{@link #getUsedType() <em>Used Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsedType()
     * @generated
     * @ordered
     */
    protected static final String USED_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUsedType() <em>Used Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsedType()
     * @generated
     * @ordered
     */
    protected String usedType = USED_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getParamStyle() <em>Param Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParamStyle()
     * @generated
     * @ordered
     */
    protected static final String PARAM_STYLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getParamStyle() <em>Param Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParamStyle()
     * @generated
     * @ordered
     */
    protected String paramStyle = PARAM_STYLE_EDEFAULT;

    /**
     * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperations()
     * @generated
     * @ordered
     */
    protected EList operations;

    /**
     * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected static final String STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected String status = STATUS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SoaServiceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.SOA_SERVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNameSpace() {
        return nameSpace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNameSpace(String newNameSpace) {
        String oldNameSpace = nameSpace;
        nameSpace = newNameSpace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__NAME_SPACE, oldNameSpace, nameSpace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContact() {
        return contact;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContact(String newContact) {
        String oldContact = contact;
        contact = newContact;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__CONTACT, oldContact, contact));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getCreation() {
        return creation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreation(Date newCreation) {
        Date oldCreation = creation;
        creation = newCreation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__CREATION, oldCreation, creation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getModification() {
        return modification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModification(Date newModification) {
        Date oldModification = modification;
        modification = newModification;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__MODIFICATION, oldModification, modification));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPort() {
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPort(int newPort) {
        int oldPort = port;
        port = newPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__PORT, oldPort, port));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStyle() {
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStyle(String newStyle) {
        String oldStyle = style;
        style = newStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__STYLE, oldStyle, style));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUsedType() {
        return usedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsedType(String newUsedType) {
        String oldUsedType = usedType;
        usedType = newUsedType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__USED_TYPE, oldUsedType, usedType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getParamStyle() {
        return paramStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParamStyle(String newParamStyle) {
        String oldParamStyle = paramStyle;
        paramStyle = newParamStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__PARAM_STYLE, oldParamStyle, paramStyle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getOperations() {
        if (operations == null) {
            operations = new EObjectContainmentWithInverseEList(SoaOperation.class, this, PropertiesPackage.SOA_SERVICE__OPERATIONS, PropertiesPackage.SOA_OPERATION__SERVICE);
        }
        return operations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatus(String newStatus) {
        String oldStatus = status;
        status = newStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_SERVICE__STATUS, oldStatus, status));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.SOA_SERVICE__OPERATIONS:
                return ((InternalEList)getOperations()).basicAdd(otherEnd, msgs);
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
            case PropertiesPackage.SOA_SERVICE__OPERATIONS:
                return ((InternalEList)getOperations()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.SOA_SERVICE__ID:
                return new Integer(getId());
            case PropertiesPackage.SOA_SERVICE__LABEL:
                return getLabel();
            case PropertiesPackage.SOA_SERVICE__NAME_SPACE:
                return getNameSpace();
            case PropertiesPackage.SOA_SERVICE__CONTACT:
                return getContact();
            case PropertiesPackage.SOA_SERVICE__DESCRIPTION:
                return getDescription();
            case PropertiesPackage.SOA_SERVICE__CREATION:
                return getCreation();
            case PropertiesPackage.SOA_SERVICE__MODIFICATION:
                return getModification();
            case PropertiesPackage.SOA_SERVICE__PORT:
                return new Integer(getPort());
            case PropertiesPackage.SOA_SERVICE__TYPE:
                return getType();
            case PropertiesPackage.SOA_SERVICE__STYLE:
                return getStyle();
            case PropertiesPackage.SOA_SERVICE__USED_TYPE:
                return getUsedType();
            case PropertiesPackage.SOA_SERVICE__PARAM_STYLE:
                return getParamStyle();
            case PropertiesPackage.SOA_SERVICE__OPERATIONS:
                return getOperations();
            case PropertiesPackage.SOA_SERVICE__STATUS:
                return getStatus();
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
            case PropertiesPackage.SOA_SERVICE__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_SERVICE__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__NAME_SPACE:
                setNameSpace((String)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__CONTACT:
                setContact((String)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__CREATION:
                setCreation((Date)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__MODIFICATION:
                setModification((Date)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__PORT:
                setPort(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_SERVICE__TYPE:
                setType((String)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__STYLE:
                setStyle((String)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__USED_TYPE:
                setUsedType((String)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__PARAM_STYLE:
                setParamStyle((String)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__OPERATIONS:
                getOperations().clear();
                getOperations().addAll((Collection)newValue);
                return;
            case PropertiesPackage.SOA_SERVICE__STATUS:
                setStatus((String)newValue);
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
            case PropertiesPackage.SOA_SERVICE__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__NAME_SPACE:
                setNameSpace(NAME_SPACE_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__CONTACT:
                setContact(CONTACT_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__CREATION:
                setCreation(CREATION_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__MODIFICATION:
                setModification(MODIFICATION_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__PORT:
                setPort(PORT_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__USED_TYPE:
                setUsedType(USED_TYPE_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__PARAM_STYLE:
                setParamStyle(PARAM_STYLE_EDEFAULT);
                return;
            case PropertiesPackage.SOA_SERVICE__OPERATIONS:
                getOperations().clear();
                return;
            case PropertiesPackage.SOA_SERVICE__STATUS:
                setStatus(STATUS_EDEFAULT);
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
            case PropertiesPackage.SOA_SERVICE__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.SOA_SERVICE__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.SOA_SERVICE__NAME_SPACE:
                return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
            case PropertiesPackage.SOA_SERVICE__CONTACT:
                return CONTACT_EDEFAULT == null ? contact != null : !CONTACT_EDEFAULT.equals(contact);
            case PropertiesPackage.SOA_SERVICE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case PropertiesPackage.SOA_SERVICE__CREATION:
                return CREATION_EDEFAULT == null ? creation != null : !CREATION_EDEFAULT.equals(creation);
            case PropertiesPackage.SOA_SERVICE__MODIFICATION:
                return MODIFICATION_EDEFAULT == null ? modification != null : !MODIFICATION_EDEFAULT.equals(modification);
            case PropertiesPackage.SOA_SERVICE__PORT:
                return port != PORT_EDEFAULT;
            case PropertiesPackage.SOA_SERVICE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case PropertiesPackage.SOA_SERVICE__STYLE:
                return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
            case PropertiesPackage.SOA_SERVICE__USED_TYPE:
                return USED_TYPE_EDEFAULT == null ? usedType != null : !USED_TYPE_EDEFAULT.equals(usedType);
            case PropertiesPackage.SOA_SERVICE__PARAM_STYLE:
                return PARAM_STYLE_EDEFAULT == null ? paramStyle != null : !PARAM_STYLE_EDEFAULT.equals(paramStyle);
            case PropertiesPackage.SOA_SERVICE__OPERATIONS:
                return operations != null && !operations.isEmpty();
            case PropertiesPackage.SOA_SERVICE__STATUS:
                return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
        result.append(" (id: ");
        result.append(id);
        result.append(", label: ");
        result.append(label);
        result.append(", nameSpace: ");
        result.append(nameSpace);
        result.append(", contact: ");
        result.append(contact);
        result.append(", description: ");
        result.append(description);
        result.append(", creation: ");
        result.append(creation);
        result.append(", modification: ");
        result.append(modification);
        result.append(", port: ");
        result.append(port);
        result.append(", type: ");
        result.append(type);
        result.append(", style: ");
        result.append(style);
        result.append(", usedType: ");
        result.append(usedType);
        result.append(", paramStyle: ");
        result.append(paramStyle);
        result.append(", status: ");
        result.append(status);
        result.append(')');
        return result.toString();
    }

} //SoaServiceImpl
