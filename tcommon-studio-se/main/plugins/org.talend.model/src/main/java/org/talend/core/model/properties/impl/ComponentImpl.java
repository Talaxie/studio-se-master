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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.core.model.properties.Component;
import org.talend.core.model.properties.ProjectComponentAuthorisation;
import org.talend.core.model.properties.Project;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentImpl#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentImpl#getDeleteDate <em>Delete Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentImpl#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentImpl#getFileDescriptor <em>File Descriptor</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ComponentImpl#getProjects <em>Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends EObjectImpl implements Component {
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
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final float VERSION_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected float version = VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getLastUpdateDate() <em>Last Update Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastUpdateDate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_UPDATE_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastUpdateDate() <em>Last Update Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastUpdateDate()
     * @generated
     * @ordered
     */
    protected Date lastUpdateDate = LAST_UPDATE_DATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected User author;

    /**
     * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreationDate()
     * @generated
     * @ordered
     */
    protected static final Date CREATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreationDate()
     * @generated
     * @ordered
     */
    protected Date creationDate = CREATION_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getDeleteDate() <em>Delete Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeleteDate()
     * @generated
     * @ordered
     */
    protected static final Date DELETE_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDeleteDate() <em>Delete Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeleteDate()
     * @generated
     * @ordered
     */
    protected Date deleteDate = DELETE_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #isDeleted() <em>Deleted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDeleted()
     * @generated
     * @ordered
     */
    protected static final boolean DELETED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDeleted() <em>Deleted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDeleted()
     * @generated
     * @ordered
     */
    protected boolean deleted = DELETED_EDEFAULT;

    /**
     * The default value of the '{@link #getFileDescriptor() <em>File Descriptor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileDescriptor()
     * @generated
     * @ordered
     */
    protected static final byte[] FILE_DESCRIPTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileDescriptor() <em>File Descriptor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileDescriptor()
     * @generated
     * @ordered
     */
    protected byte[] fileDescriptor = FILE_DESCRIPTOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProjects()
     * @generated
     * @ordered
     */
    protected EList projects;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.COMPONENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public float getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(float newVersion) {
        float oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastUpdateDate(Date newLastUpdateDate) {
        Date oldLastUpdateDate = lastUpdateDate;
        lastUpdateDate = newLastUpdateDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT__LAST_UPDATE_DATE, oldLastUpdateDate, lastUpdateDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getProjects() {
        if (projects == null) {
            projects = new EObjectWithInverseResolvingEList(ProjectComponentAuthorisation.class, this, PropertiesPackage.COMPONENT__PROJECTS, PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__COMPONENT);
        }
        return projects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public User getAuthor() {
        if (author != null && author.eIsProxy()) {
            InternalEObject oldAuthor = (InternalEObject)author;
            author = (User)eResolveProxy(oldAuthor);
            if (author != oldAuthor) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.COMPONENT__AUTHOR, oldAuthor, author));
            }
        }
        return author;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public User basicGetAuthor() {
        return author;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthor(User newAuthor) {
        User oldAuthor = author;
        author = newAuthor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT__AUTHOR, oldAuthor, author));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreationDate(Date newCreationDate) {
        Date oldCreationDate = creationDate;
        creationDate = newCreationDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT__CREATION_DATE, oldCreationDate, creationDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getDeleteDate() {
        return deleteDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeleteDate(Date newDeleteDate) {
        Date oldDeleteDate = deleteDate;
        deleteDate = newDeleteDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT__DELETE_DATE, oldDeleteDate, deleteDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeleted(boolean newDeleted) {
        boolean oldDeleted = deleted;
        deleted = newDeleted;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT__DELETED, oldDeleted, deleted));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public byte[] getFileDescriptor() {
        return fileDescriptor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFileDescriptor(byte[] newFileDescriptor) {
        byte[] oldFileDescriptor = fileDescriptor;
        fileDescriptor = newFileDescriptor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT__FILE_DESCRIPTOR, oldFileDescriptor, fileDescriptor));
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
            case PropertiesPackage.COMPONENT__PROJECTS:
                return ((InternalEList)getProjects()).basicAdd(otherEnd, msgs);
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
            case PropertiesPackage.COMPONENT__PROJECTS:
                return ((InternalEList)getProjects()).basicRemove(otherEnd, msgs);
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
            case PropertiesPackage.COMPONENT__ID:
                return new Integer(getId());
            case PropertiesPackage.COMPONENT__LABEL:
                return getLabel();
            case PropertiesPackage.COMPONENT__VERSION:
                return new Float(getVersion());
            case PropertiesPackage.COMPONENT__LAST_UPDATE_DATE:
                return getLastUpdateDate();
            case PropertiesPackage.COMPONENT__AUTHOR:
                if (resolve) return getAuthor();
                return basicGetAuthor();
            case PropertiesPackage.COMPONENT__CREATION_DATE:
                return getCreationDate();
            case PropertiesPackage.COMPONENT__DELETE_DATE:
                return getDeleteDate();
            case PropertiesPackage.COMPONENT__DELETED:
                return isDeleted() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.COMPONENT__FILE_DESCRIPTOR:
                return getFileDescriptor();
            case PropertiesPackage.COMPONENT__PROJECTS:
                return getProjects();
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
            case PropertiesPackage.COMPONENT__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.COMPONENT__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.COMPONENT__VERSION:
                setVersion(((Float)newValue).floatValue());
                return;
            case PropertiesPackage.COMPONENT__LAST_UPDATE_DATE:
                setLastUpdateDate((Date)newValue);
                return;
            case PropertiesPackage.COMPONENT__AUTHOR:
                setAuthor((User)newValue);
                return;
            case PropertiesPackage.COMPONENT__CREATION_DATE:
                setCreationDate((Date)newValue);
                return;
            case PropertiesPackage.COMPONENT__DELETE_DATE:
                setDeleteDate((Date)newValue);
                return;
            case PropertiesPackage.COMPONENT__DELETED:
                setDeleted(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.COMPONENT__FILE_DESCRIPTOR:
                setFileDescriptor((byte[])newValue);
                return;
            case PropertiesPackage.COMPONENT__PROJECTS:
                getProjects().clear();
                getProjects().addAll((Collection)newValue);
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
            case PropertiesPackage.COMPONENT__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.COMPONENT__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.COMPONENT__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case PropertiesPackage.COMPONENT__LAST_UPDATE_DATE:
                setLastUpdateDate(LAST_UPDATE_DATE_EDEFAULT);
                return;
            case PropertiesPackage.COMPONENT__AUTHOR:
                setAuthor((User)null);
                return;
            case PropertiesPackage.COMPONENT__CREATION_DATE:
                setCreationDate(CREATION_DATE_EDEFAULT);
                return;
            case PropertiesPackage.COMPONENT__DELETE_DATE:
                setDeleteDate(DELETE_DATE_EDEFAULT);
                return;
            case PropertiesPackage.COMPONENT__DELETED:
                setDeleted(DELETED_EDEFAULT);
                return;
            case PropertiesPackage.COMPONENT__FILE_DESCRIPTOR:
                setFileDescriptor(FILE_DESCRIPTOR_EDEFAULT);
                return;
            case PropertiesPackage.COMPONENT__PROJECTS:
                getProjects().clear();
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
            case PropertiesPackage.COMPONENT__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.COMPONENT__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.COMPONENT__VERSION:
                return version != VERSION_EDEFAULT;
            case PropertiesPackage.COMPONENT__LAST_UPDATE_DATE:
                return LAST_UPDATE_DATE_EDEFAULT == null ? lastUpdateDate != null : !LAST_UPDATE_DATE_EDEFAULT.equals(lastUpdateDate);
            case PropertiesPackage.COMPONENT__AUTHOR:
                return author != null;
            case PropertiesPackage.COMPONENT__CREATION_DATE:
                return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
            case PropertiesPackage.COMPONENT__DELETE_DATE:
                return DELETE_DATE_EDEFAULT == null ? deleteDate != null : !DELETE_DATE_EDEFAULT.equals(deleteDate);
            case PropertiesPackage.COMPONENT__DELETED:
                return deleted != DELETED_EDEFAULT;
            case PropertiesPackage.COMPONENT__FILE_DESCRIPTOR:
                return FILE_DESCRIPTOR_EDEFAULT == null ? fileDescriptor != null : !FILE_DESCRIPTOR_EDEFAULT.equals(fileDescriptor);
            case PropertiesPackage.COMPONENT__PROJECTS:
                return projects != null && !projects.isEmpty();
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
        result.append(", version: ");
        result.append(version);
        result.append(", lastUpdateDate: ");
        result.append(lastUpdateDate);
        result.append(", creationDate: ");
        result.append(creationDate);
        result.append(", deleteDate: ");
        result.append(deleteDate);
        result.append(", deleted: ");
        result.append(deleted);
        result.append(", fileDescriptor: ");
        result.append(fileDescriptor);
        result.append(')');
        return result.toString();
    }

} //ComponentImpl