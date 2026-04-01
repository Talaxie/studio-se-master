/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.designer.core.model.utils.emf.talendfile.AbstractExternalData;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.MetadataType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeContainerType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getElementParameter <em>Element Parameter</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getBinaryData <em>Binary Data</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getStringData <em>String Data</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getComponentVersion <em>Component Version</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getOffsetLabelX <em>Offset Label X</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getOffsetLabelY <em>Offset Label Y</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getNodeData <em>Node Data</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl#getNodeContainer <em>Node Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeTypeImpl extends EObjectImpl implements NodeType {
    /**
     * The cached value of the '{@link #getElementParameter() <em>Element Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementParameter()
     * @generated
     * @ordered
     */
    protected EList elementParameter;

    /**
     * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetadata()
     * @generated
     * @ordered
     */
    protected EList metadata;

    /**
     * The default value of the '{@link #getBinaryData() <em>Binary Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBinaryData()
     * @generated
     * @ordered
     */
    protected static final byte[] BINARY_DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBinaryData() <em>Binary Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBinaryData()
     * @generated
     * @ordered
     */
    protected byte[] binaryData = BINARY_DATA_EDEFAULT;

    /**
     * The default value of the '{@link #getStringData() <em>String Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStringData()
     * @generated
     * @ordered
     */
    protected static final String STRING_DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStringData() <em>String Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStringData()
     * @generated
     * @ordered
     */
    protected String stringData = STRING_DATA_EDEFAULT;

    /**
     * The default value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponentName()
     * @generated
     * @ordered
     */
    protected static final String COMPONENT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponentName()
     * @generated
     * @ordered
     */
    protected String componentName = COMPONENT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getComponentVersion() <em>Component Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponentVersion()
     * @generated
     * @ordered
     */
    protected static final String COMPONENT_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getComponentVersion() <em>Component Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponentVersion()
     * @generated
     * @ordered
     */
    protected String componentVersion = COMPONENT_VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getOffsetLabelX() <em>Offset Label X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffsetLabelX()
     * @generated
     * @ordered
     */
    protected static final int OFFSET_LABEL_X_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getOffsetLabelX() <em>Offset Label X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffsetLabelX()
     * @generated
     * @ordered
     */
    protected int offsetLabelX = OFFSET_LABEL_X_EDEFAULT;

    /**
     * This is true if the Offset Label X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean offsetLabelXESet;

    /**
     * The default value of the '{@link #getOffsetLabelY() <em>Offset Label Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffsetLabelY()
     * @generated
     * @ordered
     */
    protected static final int OFFSET_LABEL_Y_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getOffsetLabelY() <em>Offset Label Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffsetLabelY()
     * @generated
     * @ordered
     */
    protected int offsetLabelY = OFFSET_LABEL_Y_EDEFAULT;

    /**
     * This is true if the Offset Label Y attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean offsetLabelYESet;

    /**
     * The default value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosX()
     * @generated
     * @ordered
     */
    protected static final int POS_X_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosX()
     * @generated
     * @ordered
     */
    protected int posX = POS_X_EDEFAULT;

    /**
     * This is true if the Pos X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean posXESet;

    /**
     * The default value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosY()
     * @generated
     * @ordered
     */
    protected static final int POS_Y_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosY()
     * @generated
     * @ordered
     */
    protected int posY = POS_Y_EDEFAULT;

    /**
     * This is true if the Pos Y attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean posYESet;

    /**
     * The default value of the '{@link #getSizeX() <em>Size X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeX()
     * @generated
     * @ordered
     */
    protected static final int SIZE_X_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSizeX() <em>Size X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeX()
     * @generated
     * @ordered
     */
    protected int sizeX = SIZE_X_EDEFAULT;

    /**
     * This is true if the Size X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sizeXESet;

    /**
     * The default value of the '{@link #getSizeY() <em>Size Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeY()
     * @generated
     * @ordered
     */
    protected static final int SIZE_Y_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSizeY() <em>Size Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeY()
     * @generated
     * @ordered
     */
    protected int sizeY = SIZE_Y_EDEFAULT;

    /**
     * This is true if the Size Y attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sizeYESet;

    /**
     * The default value of the '{@link #getScreenshot() <em>Screenshot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScreenshot()
     * @generated
     * @ordered
     */
    protected static final byte[] SCREENSHOT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScreenshot() <em>Screenshot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScreenshot()
     * @generated
     * @ordered
     */
    protected byte[] screenshot = SCREENSHOT_EDEFAULT;

    /**
     * The cached value of the '{@link #getNodeData() <em>Node Data</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodeData()
     * @generated
     * @ordered
     */
    protected AbstractExternalData nodeData;

    /**
     * The cached value of the '{@link #getNodeContainer() <em>Node Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodeContainer()
     * @generated
     * @ordered
     */
    protected NodeContainerType nodeContainer;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NodeTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return TalendFilePackage.Literals.NODE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getElementParameter() {
        if (elementParameter == null) {
            elementParameter = new EObjectContainmentEList(ElementParameterType.class, this, TalendFilePackage.NODE_TYPE__ELEMENT_PARAMETER);
        }
        return elementParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getMetadata() {
        if (metadata == null) {
            metadata = new EObjectContainmentEList(MetadataType.class, this, TalendFilePackage.NODE_TYPE__METADATA);
        }
        return metadata;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public byte[] getBinaryData() {
        return binaryData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBinaryData(byte[] newBinaryData) {
        byte[] oldBinaryData = binaryData;
        binaryData = newBinaryData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__BINARY_DATA, oldBinaryData, binaryData));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStringData() {
        return stringData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStringData(String newStringData) {
        String oldStringData = stringData;
        stringData = newStringData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__STRING_DATA, oldStringData, stringData));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComponentName(String newComponentName) {
        String oldComponentName = componentName;
        componentName = newComponentName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__COMPONENT_NAME, oldComponentName, componentName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getComponentVersion() {
        return componentVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComponentVersion(String newComponentVersion) {
        String oldComponentVersion = componentVersion;
        componentVersion = newComponentVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__COMPONENT_VERSION, oldComponentVersion, componentVersion));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getOffsetLabelX() {
        return offsetLabelX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOffsetLabelX(int newOffsetLabelX) {
        int oldOffsetLabelX = offsetLabelX;
        offsetLabelX = newOffsetLabelX;
        boolean oldOffsetLabelXESet = offsetLabelXESet;
        offsetLabelXESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__OFFSET_LABEL_X, oldOffsetLabelX, offsetLabelX, !oldOffsetLabelXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOffsetLabelX() {
        int oldOffsetLabelX = offsetLabelX;
        boolean oldOffsetLabelXESet = offsetLabelXESet;
        offsetLabelX = OFFSET_LABEL_X_EDEFAULT;
        offsetLabelXESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NODE_TYPE__OFFSET_LABEL_X, oldOffsetLabelX, OFFSET_LABEL_X_EDEFAULT, oldOffsetLabelXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOffsetLabelX() {
        return offsetLabelXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getOffsetLabelY() {
        return offsetLabelY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOffsetLabelY(int newOffsetLabelY) {
        int oldOffsetLabelY = offsetLabelY;
        offsetLabelY = newOffsetLabelY;
        boolean oldOffsetLabelYESet = offsetLabelYESet;
        offsetLabelYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__OFFSET_LABEL_Y, oldOffsetLabelY, offsetLabelY, !oldOffsetLabelYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOffsetLabelY() {
        int oldOffsetLabelY = offsetLabelY;
        boolean oldOffsetLabelYESet = offsetLabelYESet;
        offsetLabelY = OFFSET_LABEL_Y_EDEFAULT;
        offsetLabelYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NODE_TYPE__OFFSET_LABEL_Y, oldOffsetLabelY, OFFSET_LABEL_Y_EDEFAULT, oldOffsetLabelYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOffsetLabelY() {
        return offsetLabelYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPosX() {
        return posX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPosX(int newPosX) {
        int oldPosX = posX;
        posX = newPosX;
        boolean oldPosXESet = posXESet;
        posXESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__POS_X, oldPosX, posX, !oldPosXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPosX() {
        int oldPosX = posX;
        boolean oldPosXESet = posXESet;
        posX = POS_X_EDEFAULT;
        posXESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NODE_TYPE__POS_X, oldPosX, POS_X_EDEFAULT, oldPosXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPosX() {
        return posXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPosY() {
        return posY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPosY(int newPosY) {
        int oldPosY = posY;
        posY = newPosY;
        boolean oldPosYESet = posYESet;
        posYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__POS_Y, oldPosY, posY, !oldPosYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPosY() {
        int oldPosY = posY;
        boolean oldPosYESet = posYESet;
        posY = POS_Y_EDEFAULT;
        posYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NODE_TYPE__POS_Y, oldPosY, POS_Y_EDEFAULT, oldPosYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPosY() {
        return posYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSizeX() {
        return sizeX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSizeX(int newSizeX) {
        int oldSizeX = sizeX;
        sizeX = newSizeX;
        boolean oldSizeXESet = sizeXESet;
        sizeXESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__SIZE_X, oldSizeX, sizeX, !oldSizeXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSizeX() {
        int oldSizeX = sizeX;
        boolean oldSizeXESet = sizeXESet;
        sizeX = SIZE_X_EDEFAULT;
        sizeXESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NODE_TYPE__SIZE_X, oldSizeX, SIZE_X_EDEFAULT, oldSizeXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSizeX() {
        return sizeXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSizeY() {
        return sizeY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSizeY(int newSizeY) {
        int oldSizeY = sizeY;
        sizeY = newSizeY;
        boolean oldSizeYESet = sizeYESet;
        sizeYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__SIZE_Y, oldSizeY, sizeY, !oldSizeYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSizeY() {
        int oldSizeY = sizeY;
        boolean oldSizeYESet = sizeYESet;
        sizeY = SIZE_Y_EDEFAULT;
        sizeYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NODE_TYPE__SIZE_Y, oldSizeY, SIZE_Y_EDEFAULT, oldSizeYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSizeY() {
        return sizeYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public byte[] getScreenshot() {
        return screenshot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScreenshot(byte[] newScreenshot) {
        byte[] oldScreenshot = screenshot;
        screenshot = newScreenshot;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__SCREENSHOT, oldScreenshot, screenshot));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractExternalData getNodeData() {
        return nodeData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNodeData(AbstractExternalData newNodeData, NotificationChain msgs) {
        AbstractExternalData oldNodeData = nodeData;
        nodeData = newNodeData;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__NODE_DATA, oldNodeData, newNodeData);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNodeData(AbstractExternalData newNodeData) {
        if (newNodeData != nodeData) {
            NotificationChain msgs = null;
            if (nodeData != null)
                msgs = ((InternalEObject)nodeData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.NODE_TYPE__NODE_DATA, null, msgs);
            if (newNodeData != null)
                msgs = ((InternalEObject)newNodeData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.NODE_TYPE__NODE_DATA, null, msgs);
            msgs = basicSetNodeData(newNodeData, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__NODE_DATA, newNodeData, newNodeData));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeContainerType getNodeContainer() {
        return nodeContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNodeContainer(NodeContainerType newNodeContainer, NotificationChain msgs) {
        NodeContainerType oldNodeContainer = nodeContainer;
        nodeContainer = newNodeContainer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__NODE_CONTAINER, oldNodeContainer, newNodeContainer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNodeContainer(NodeContainerType newNodeContainer) {
        if (newNodeContainer != nodeContainer) {
            NotificationChain msgs = null;
            if (nodeContainer != null)
                msgs = ((InternalEObject)nodeContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.NODE_TYPE__NODE_CONTAINER, null, msgs);
            if (newNodeContainer != null)
                msgs = ((InternalEObject)newNodeContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.NODE_TYPE__NODE_CONTAINER, null, msgs);
            msgs = basicSetNodeContainer(newNodeContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NODE_TYPE__NODE_CONTAINER, newNodeContainer, newNodeContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendFilePackage.NODE_TYPE__ELEMENT_PARAMETER:
                return ((InternalEList)getElementParameter()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.NODE_TYPE__METADATA:
                return ((InternalEList)getMetadata()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.NODE_TYPE__NODE_DATA:
                return basicSetNodeData(null, msgs);
            case TalendFilePackage.NODE_TYPE__NODE_CONTAINER:
                return basicSetNodeContainer(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TalendFilePackage.NODE_TYPE__ELEMENT_PARAMETER:
                return getElementParameter();
            case TalendFilePackage.NODE_TYPE__METADATA:
                return getMetadata();
            case TalendFilePackage.NODE_TYPE__BINARY_DATA:
                return getBinaryData();
            case TalendFilePackage.NODE_TYPE__STRING_DATA:
                return getStringData();
            case TalendFilePackage.NODE_TYPE__COMPONENT_NAME:
                return getComponentName();
            case TalendFilePackage.NODE_TYPE__COMPONENT_VERSION:
                return getComponentVersion();
            case TalendFilePackage.NODE_TYPE__OFFSET_LABEL_X:
                return new Integer(getOffsetLabelX());
            case TalendFilePackage.NODE_TYPE__OFFSET_LABEL_Y:
                return new Integer(getOffsetLabelY());
            case TalendFilePackage.NODE_TYPE__POS_X:
                return new Integer(getPosX());
            case TalendFilePackage.NODE_TYPE__POS_Y:
                return new Integer(getPosY());
            case TalendFilePackage.NODE_TYPE__SIZE_X:
                return new Integer(getSizeX());
            case TalendFilePackage.NODE_TYPE__SIZE_Y:
                return new Integer(getSizeY());
            case TalendFilePackage.NODE_TYPE__SCREENSHOT:
                return getScreenshot();
            case TalendFilePackage.NODE_TYPE__NODE_DATA:
                return getNodeData();
            case TalendFilePackage.NODE_TYPE__NODE_CONTAINER:
                return getNodeContainer();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TalendFilePackage.NODE_TYPE__ELEMENT_PARAMETER:
                getElementParameter().clear();
                getElementParameter().addAll((Collection)newValue);
                return;
            case TalendFilePackage.NODE_TYPE__METADATA:
                getMetadata().clear();
                getMetadata().addAll((Collection)newValue);
                return;
            case TalendFilePackage.NODE_TYPE__BINARY_DATA:
                setBinaryData((byte[])newValue);
                return;
            case TalendFilePackage.NODE_TYPE__STRING_DATA:
                setStringData((String)newValue);
                return;
            case TalendFilePackage.NODE_TYPE__COMPONENT_NAME:
                setComponentName((String)newValue);
                return;
            case TalendFilePackage.NODE_TYPE__COMPONENT_VERSION:
                setComponentVersion((String)newValue);
                return;
            case TalendFilePackage.NODE_TYPE__OFFSET_LABEL_X:
                setOffsetLabelX(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.NODE_TYPE__OFFSET_LABEL_Y:
                setOffsetLabelY(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.NODE_TYPE__POS_X:
                setPosX(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.NODE_TYPE__POS_Y:
                setPosY(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.NODE_TYPE__SIZE_X:
                setSizeX(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.NODE_TYPE__SIZE_Y:
                setSizeY(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.NODE_TYPE__SCREENSHOT:
                setScreenshot((byte[])newValue);
                return;
            case TalendFilePackage.NODE_TYPE__NODE_DATA:
                setNodeData((AbstractExternalData)newValue);
                return;
            case TalendFilePackage.NODE_TYPE__NODE_CONTAINER:
                setNodeContainer((NodeContainerType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case TalendFilePackage.NODE_TYPE__ELEMENT_PARAMETER:
                getElementParameter().clear();
                return;
            case TalendFilePackage.NODE_TYPE__METADATA:
                getMetadata().clear();
                return;
            case TalendFilePackage.NODE_TYPE__BINARY_DATA:
                setBinaryData(BINARY_DATA_EDEFAULT);
                return;
            case TalendFilePackage.NODE_TYPE__STRING_DATA:
                setStringData(STRING_DATA_EDEFAULT);
                return;
            case TalendFilePackage.NODE_TYPE__COMPONENT_NAME:
                setComponentName(COMPONENT_NAME_EDEFAULT);
                return;
            case TalendFilePackage.NODE_TYPE__COMPONENT_VERSION:
                setComponentVersion(COMPONENT_VERSION_EDEFAULT);
                return;
            case TalendFilePackage.NODE_TYPE__OFFSET_LABEL_X:
                unsetOffsetLabelX();
                return;
            case TalendFilePackage.NODE_TYPE__OFFSET_LABEL_Y:
                unsetOffsetLabelY();
                return;
            case TalendFilePackage.NODE_TYPE__POS_X:
                unsetPosX();
                return;
            case TalendFilePackage.NODE_TYPE__POS_Y:
                unsetPosY();
                return;
            case TalendFilePackage.NODE_TYPE__SIZE_X:
                unsetSizeX();
                return;
            case TalendFilePackage.NODE_TYPE__SIZE_Y:
                unsetSizeY();
                return;
            case TalendFilePackage.NODE_TYPE__SCREENSHOT:
                setScreenshot(SCREENSHOT_EDEFAULT);
                return;
            case TalendFilePackage.NODE_TYPE__NODE_DATA:
                setNodeData((AbstractExternalData)null);
                return;
            case TalendFilePackage.NODE_TYPE__NODE_CONTAINER:
                setNodeContainer((NodeContainerType)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TalendFilePackage.NODE_TYPE__ELEMENT_PARAMETER:
                return elementParameter != null && !elementParameter.isEmpty();
            case TalendFilePackage.NODE_TYPE__METADATA:
                return metadata != null && !metadata.isEmpty();
            case TalendFilePackage.NODE_TYPE__BINARY_DATA:
                return BINARY_DATA_EDEFAULT == null ? binaryData != null : !BINARY_DATA_EDEFAULT.equals(binaryData);
            case TalendFilePackage.NODE_TYPE__STRING_DATA:
                return STRING_DATA_EDEFAULT == null ? stringData != null : !STRING_DATA_EDEFAULT.equals(stringData);
            case TalendFilePackage.NODE_TYPE__COMPONENT_NAME:
                return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
            case TalendFilePackage.NODE_TYPE__COMPONENT_VERSION:
                return COMPONENT_VERSION_EDEFAULT == null ? componentVersion != null : !COMPONENT_VERSION_EDEFAULT.equals(componentVersion);
            case TalendFilePackage.NODE_TYPE__OFFSET_LABEL_X:
                return isSetOffsetLabelX();
            case TalendFilePackage.NODE_TYPE__OFFSET_LABEL_Y:
                return isSetOffsetLabelY();
            case TalendFilePackage.NODE_TYPE__POS_X:
                return isSetPosX();
            case TalendFilePackage.NODE_TYPE__POS_Y:
                return isSetPosY();
            case TalendFilePackage.NODE_TYPE__SIZE_X:
                return isSetSizeX();
            case TalendFilePackage.NODE_TYPE__SIZE_Y:
                return isSetSizeY();
            case TalendFilePackage.NODE_TYPE__SCREENSHOT:
                return SCREENSHOT_EDEFAULT == null ? screenshot != null : !SCREENSHOT_EDEFAULT.equals(screenshot);
            case TalendFilePackage.NODE_TYPE__NODE_DATA:
                return nodeData != null;
            case TalendFilePackage.NODE_TYPE__NODE_CONTAINER:
                return nodeContainer != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (binaryData: ");
        result.append(binaryData);
        result.append(", stringData: ");
        result.append(stringData);
        result.append(", componentName: ");
        result.append(componentName);
        result.append(", componentVersion: ");
        result.append(componentVersion);
        result.append(", offsetLabelX: ");
        if (offsetLabelXESet) result.append(offsetLabelX); else result.append("<unset>");
        result.append(", offsetLabelY: ");
        if (offsetLabelYESet) result.append(offsetLabelY); else result.append("<unset>");
        result.append(", posX: ");
        if (posXESet) result.append(posX); else result.append("<unset>");
        result.append(", posY: ");
        if (posYESet) result.append(posY); else result.append("<unset>");
        result.append(", sizeX: ");
        if (sizeXESet) result.append(sizeX); else result.append("<unset>");
        result.append(", sizeY: ");
        if (sizeYESet) result.append(sizeY); else result.append("<unset>");
        result.append(", screenshot: ");
        result.append(screenshot);
        result.append(')');
        return result.toString();
    }

} //NodeTypeImpl