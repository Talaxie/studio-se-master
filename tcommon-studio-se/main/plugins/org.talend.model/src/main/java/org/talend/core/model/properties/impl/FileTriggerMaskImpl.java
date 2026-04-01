/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.core.model.properties.ExecutionServer;
import org.talend.core.model.properties.FileTrigger;
import org.talend.core.model.properties.FileTriggerMask;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Trigger Mask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#getFileTrigger <em>File Trigger</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#getFolderPath <em>Folder Path</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#getFileMask <em>File Mask</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#getContextParameterBaseName <em>Context Parameter Base Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#getCheckFileServer <em>Check File Server</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#isExist <em>Exist</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#isCreated <em>Created</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.FileTriggerMaskImpl#isModified <em>Modified</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileTriggerMaskImpl extends EObjectImpl implements FileTriggerMask {
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
     * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean ACTIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected boolean active = ACTIVE_EDEFAULT;

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
     * The cached value of the '{@link #getFileTrigger() <em>File Trigger</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileTrigger()
     * @generated
     * @ordered
     */
    protected FileTrigger fileTrigger;

    /**
     * The default value of the '{@link #getFolderPath() <em>Folder Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFolderPath()
     * @generated
     * @ordered
     */
    protected static final String FOLDER_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFolderPath() <em>Folder Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFolderPath()
     * @generated
     * @ordered
     */
    protected String folderPath = FOLDER_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getFileMask() <em>File Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileMask()
     * @generated
     * @ordered
     */
    protected static final String FILE_MASK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileMask() <em>File Mask</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileMask()
     * @generated
     * @ordered
     */
    protected String fileMask = FILE_MASK_EDEFAULT;

    /**
     * The default value of the '{@link #getContextParameterBaseName() <em>Context Parameter Base Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextParameterBaseName()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_PARAMETER_BASE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContextParameterBaseName() <em>Context Parameter Base Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextParameterBaseName()
     * @generated
     * @ordered
     */
    protected String contextParameterBaseName = CONTEXT_PARAMETER_BASE_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getCheckFileServer() <em>Check File Server</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCheckFileServer()
     * @generated
     * @ordered
     */
    protected ExecutionServer checkFileServer;

    /**
     * The default value of the '{@link #isExist() <em>Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExist()
     * @generated
     * @ordered
     */
    protected static final boolean EXIST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExist() <em>Exist</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExist()
     * @generated
     * @ordered
     */
    protected boolean exist = EXIST_EDEFAULT;

    /**
     * The default value of the '{@link #isCreated() <em>Created</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCreated()
     * @generated
     * @ordered
     */
    protected static final boolean CREATED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCreated() <em>Created</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCreated()
     * @generated
     * @ordered
     */
    protected boolean created = CREATED_EDEFAULT;

    /**
     * The default value of the '{@link #isModified() <em>Modified</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isModified()
     * @generated
     * @ordered
     */
    protected static final boolean MODIFIED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isModified() <em>Modified</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isModified()
     * @generated
     * @ordered
     */
    protected boolean modified = MODIFIED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FileTriggerMaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.FILE_TRIGGER_MASK;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isActive() {
        return active;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActive(boolean newActive) {
        boolean oldActive = active;
        active = newActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__ACTIVE, oldActive, active));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__LABEL, oldLabel, label));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileTrigger getFileTrigger() {
        if (fileTrigger != null && fileTrigger.eIsProxy()) {
            InternalEObject oldFileTrigger = (InternalEObject)fileTrigger;
            fileTrigger = (FileTrigger)eResolveProxy(oldFileTrigger);
            if (fileTrigger != oldFileTrigger) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.FILE_TRIGGER_MASK__FILE_TRIGGER, oldFileTrigger, fileTrigger));
            }
        }
        return fileTrigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileTrigger basicGetFileTrigger() {
        return fileTrigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFileTrigger(FileTrigger newFileTrigger) {
        FileTrigger oldFileTrigger = fileTrigger;
        fileTrigger = newFileTrigger;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__FILE_TRIGGER, oldFileTrigger, fileTrigger));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFolderPath() {
        return folderPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFolderPath(String newFolderPath) {
        String oldFolderPath = folderPath;
        folderPath = newFolderPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__FOLDER_PATH, oldFolderPath, folderPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFileMask() {
        return fileMask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFileMask(String newFileMask) {
        String oldFileMask = fileMask;
        fileMask = newFileMask;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__FILE_MASK, oldFileMask, fileMask));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContextParameterBaseName() {
        return contextParameterBaseName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextParameterBaseName(String newContextParameterBaseName) {
        String oldContextParameterBaseName = contextParameterBaseName;
        contextParameterBaseName = newContextParameterBaseName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__CONTEXT_PARAMETER_BASE_NAME, oldContextParameterBaseName, contextParameterBaseName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionServer getCheckFileServer() {
        if (checkFileServer != null && checkFileServer.eIsProxy()) {
            InternalEObject oldCheckFileServer = (InternalEObject)checkFileServer;
            checkFileServer = (ExecutionServer)eResolveProxy(oldCheckFileServer);
            if (checkFileServer != oldCheckFileServer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.FILE_TRIGGER_MASK__CHECK_FILE_SERVER, oldCheckFileServer, checkFileServer));
            }
        }
        return checkFileServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionServer basicGetCheckFileServer() {
        return checkFileServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCheckFileServer(ExecutionServer newCheckFileServer) {
        ExecutionServer oldCheckFileServer = checkFileServer;
        checkFileServer = newCheckFileServer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__CHECK_FILE_SERVER, oldCheckFileServer, checkFileServer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isExist() {
        return exist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExist(boolean newExist) {
        boolean oldExist = exist;
        exist = newExist;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__EXIST, oldExist, exist));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCreated() {
        return created;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreated(boolean newCreated) {
        boolean oldCreated = created;
        created = newCreated;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__CREATED, oldCreated, created));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isModified() {
        return modified;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModified(boolean newModified) {
        boolean oldModified = modified;
        modified = newModified;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.FILE_TRIGGER_MASK__MODIFIED, oldModified, modified));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.FILE_TRIGGER_MASK__ID:
                return new Integer(getId());
            case PropertiesPackage.FILE_TRIGGER_MASK__ACTIVE:
                return isActive() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.FILE_TRIGGER_MASK__LABEL:
                return getLabel();
            case PropertiesPackage.FILE_TRIGGER_MASK__DESCRIPTION:
                return getDescription();
            case PropertiesPackage.FILE_TRIGGER_MASK__FILE_TRIGGER:
                if (resolve) return getFileTrigger();
                return basicGetFileTrigger();
            case PropertiesPackage.FILE_TRIGGER_MASK__FOLDER_PATH:
                return getFolderPath();
            case PropertiesPackage.FILE_TRIGGER_MASK__FILE_MASK:
                return getFileMask();
            case PropertiesPackage.FILE_TRIGGER_MASK__CONTEXT_PARAMETER_BASE_NAME:
                return getContextParameterBaseName();
            case PropertiesPackage.FILE_TRIGGER_MASK__CHECK_FILE_SERVER:
                if (resolve) return getCheckFileServer();
                return basicGetCheckFileServer();
            case PropertiesPackage.FILE_TRIGGER_MASK__EXIST:
                return isExist() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.FILE_TRIGGER_MASK__CREATED:
                return isCreated() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.FILE_TRIGGER_MASK__MODIFIED:
                return isModified() ? Boolean.TRUE : Boolean.FALSE;
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
            case PropertiesPackage.FILE_TRIGGER_MASK__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__ACTIVE:
                setActive(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__FILE_TRIGGER:
                setFileTrigger((FileTrigger)newValue);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__FOLDER_PATH:
                setFolderPath((String)newValue);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__FILE_MASK:
                setFileMask((String)newValue);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__CONTEXT_PARAMETER_BASE_NAME:
                setContextParameterBaseName((String)newValue);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__CHECK_FILE_SERVER:
                setCheckFileServer((ExecutionServer)newValue);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__EXIST:
                setExist(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__CREATED:
                setCreated(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__MODIFIED:
                setModified(((Boolean)newValue).booleanValue());
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
            case PropertiesPackage.FILE_TRIGGER_MASK__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__ACTIVE:
                setActive(ACTIVE_EDEFAULT);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__FILE_TRIGGER:
                setFileTrigger((FileTrigger)null);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__FOLDER_PATH:
                setFolderPath(FOLDER_PATH_EDEFAULT);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__FILE_MASK:
                setFileMask(FILE_MASK_EDEFAULT);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__CONTEXT_PARAMETER_BASE_NAME:
                setContextParameterBaseName(CONTEXT_PARAMETER_BASE_NAME_EDEFAULT);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__CHECK_FILE_SERVER:
                setCheckFileServer((ExecutionServer)null);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__EXIST:
                setExist(EXIST_EDEFAULT);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__CREATED:
                setCreated(CREATED_EDEFAULT);
                return;
            case PropertiesPackage.FILE_TRIGGER_MASK__MODIFIED:
                setModified(MODIFIED_EDEFAULT);
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
            case PropertiesPackage.FILE_TRIGGER_MASK__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.FILE_TRIGGER_MASK__ACTIVE:
                return active != ACTIVE_EDEFAULT;
            case PropertiesPackage.FILE_TRIGGER_MASK__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.FILE_TRIGGER_MASK__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case PropertiesPackage.FILE_TRIGGER_MASK__FILE_TRIGGER:
                return fileTrigger != null;
            case PropertiesPackage.FILE_TRIGGER_MASK__FOLDER_PATH:
                return FOLDER_PATH_EDEFAULT == null ? folderPath != null : !FOLDER_PATH_EDEFAULT.equals(folderPath);
            case PropertiesPackage.FILE_TRIGGER_MASK__FILE_MASK:
                return FILE_MASK_EDEFAULT == null ? fileMask != null : !FILE_MASK_EDEFAULT.equals(fileMask);
            case PropertiesPackage.FILE_TRIGGER_MASK__CONTEXT_PARAMETER_BASE_NAME:
                return CONTEXT_PARAMETER_BASE_NAME_EDEFAULT == null ? contextParameterBaseName != null : !CONTEXT_PARAMETER_BASE_NAME_EDEFAULT.equals(contextParameterBaseName);
            case PropertiesPackage.FILE_TRIGGER_MASK__CHECK_FILE_SERVER:
                return checkFileServer != null;
            case PropertiesPackage.FILE_TRIGGER_MASK__EXIST:
                return exist != EXIST_EDEFAULT;
            case PropertiesPackage.FILE_TRIGGER_MASK__CREATED:
                return created != CREATED_EDEFAULT;
            case PropertiesPackage.FILE_TRIGGER_MASK__MODIFIED:
                return modified != MODIFIED_EDEFAULT;
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
        result.append(", active: ");
        result.append(active);
        result.append(", label: ");
        result.append(label);
        result.append(", description: ");
        result.append(description);
        result.append(", folderPath: ");
        result.append(folderPath);
        result.append(", fileMask: ");
        result.append(fileMask);
        result.append(", contextParameterBaseName: ");
        result.append(contextParameterBaseName);
        result.append(", exist: ");
        result.append(exist);
        result.append(", created: ");
        result.append(created);
        result.append(", modified: ");
        result.append(modified);
        result.append(')');
        return result.toString();
    }

} //FileTriggerMaskImpl
