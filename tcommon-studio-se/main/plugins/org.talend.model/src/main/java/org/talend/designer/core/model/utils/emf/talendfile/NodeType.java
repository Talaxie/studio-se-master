/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getElementParameter <em>Element Parameter</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getBinaryData <em>Binary Data</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getStringData <em>String Data</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getComponentVersion <em>Component Version</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelX <em>Offset Label X</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelY <em>Offset Label Y</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosX <em>Pos X</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getNodeData <em>Node Data</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getNodeContainer <em>Node Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType()
 * @model extendedMetaData="name='Node_._type' kind='elementOnly'"
 * @generated
 */
public interface NodeType extends EObject {
    /**
     * Returns the value of the '<em><b>Element Parameter</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Parameter</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_ElementParameter()
     * @model type="org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType" containment="true" required="true"
     *        extendedMetaData="kind='element' name='ElementParameter' namespace='##targetNamespace'"
     * @generated
     */
    EList getElementParameter();

    /**
     * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.talendfile.MetadataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metadata</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Metadata</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_Metadata()
     * @model type="org.talend.designer.core.model.utils.emf.talendfile.MetadataType" containment="true"
     *        extendedMetaData="kind='element' name='Metadata' namespace='##targetNamespace'"
     * @generated
     */
    EList getMetadata();

    /**
     * Returns the value of the '<em><b>Binary Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binary Data</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binary Data</em>' attribute.
     * @see #setBinaryData(byte[])
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_BinaryData()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
     *        extendedMetaData="kind='element' name='BinaryData' namespace='##targetNamespace'"
     * @generated
     */
    byte[] getBinaryData();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getBinaryData <em>Binary Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binary Data</em>' attribute.
     * @see #getBinaryData()
     * @generated
     */
    void setBinaryData(byte[] value);

    /**
     * Returns the value of the '<em><b>String Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>String Data</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>String Data</em>' attribute.
     * @see #setStringData(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_StringData()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='StringData' namespace='##targetNamespace'"
     * @generated
     */
    String getStringData();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getStringData <em>String Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>String Data</em>' attribute.
     * @see #getStringData()
     * @generated
     */
    void setStringData(String value);

    /**
     * Returns the value of the '<em><b>Component Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component Name</em>' attribute.
     * @see #setComponentName(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_ComponentName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='componentName' namespace='##targetNamespace'"
     * @generated
     */
    String getComponentName();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getComponentName <em>Component Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component Name</em>' attribute.
     * @see #getComponentName()
     * @generated
     */
    void setComponentName(String value);

    /**
     * Returns the value of the '<em><b>Component Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component Version</em>' attribute.
     * @see #setComponentVersion(String)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_ComponentVersion()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='componentVersion' namespace='##targetNamespace'"
     * @generated
     */
    String getComponentVersion();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getComponentVersion <em>Component Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component Version</em>' attribute.
     * @see #getComponentVersion()
     * @generated
     */
    void setComponentVersion(String value);

    /**
     * Returns the value of the '<em><b>Offset Label X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset Label X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset Label X</em>' attribute.
     * @see #isSetOffsetLabelX()
     * @see #unsetOffsetLabelX()
     * @see #setOffsetLabelX(int)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_OffsetLabelX()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='offsetLabelX' namespace='##targetNamespace'"
     * @generated
     */
    int getOffsetLabelX();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelX <em>Offset Label X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset Label X</em>' attribute.
     * @see #isSetOffsetLabelX()
     * @see #unsetOffsetLabelX()
     * @see #getOffsetLabelX()
     * @generated
     */
    void setOffsetLabelX(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelX <em>Offset Label X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOffsetLabelX()
     * @see #getOffsetLabelX()
     * @see #setOffsetLabelX(int)
     * @generated
     */
    void unsetOffsetLabelX();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelX <em>Offset Label X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Offset Label X</em>' attribute is set.
     * @see #unsetOffsetLabelX()
     * @see #getOffsetLabelX()
     * @see #setOffsetLabelX(int)
     * @generated
     */
    boolean isSetOffsetLabelX();

    /**
     * Returns the value of the '<em><b>Offset Label Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset Label Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset Label Y</em>' attribute.
     * @see #isSetOffsetLabelY()
     * @see #unsetOffsetLabelY()
     * @see #setOffsetLabelY(int)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_OffsetLabelY()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='offsetLabelY' namespace='##targetNamespace'"
     * @generated
     */
    int getOffsetLabelY();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelY <em>Offset Label Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset Label Y</em>' attribute.
     * @see #isSetOffsetLabelY()
     * @see #unsetOffsetLabelY()
     * @see #getOffsetLabelY()
     * @generated
     */
    void setOffsetLabelY(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelY <em>Offset Label Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOffsetLabelY()
     * @see #getOffsetLabelY()
     * @see #setOffsetLabelY(int)
     * @generated
     */
    void unsetOffsetLabelY();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getOffsetLabelY <em>Offset Label Y</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Offset Label Y</em>' attribute is set.
     * @see #unsetOffsetLabelY()
     * @see #getOffsetLabelY()
     * @see #setOffsetLabelY(int)
     * @generated
     */
    boolean isSetOffsetLabelY();

    /**
     * Returns the value of the '<em><b>Pos X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pos X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pos X</em>' attribute.
     * @see #isSetPosX()
     * @see #unsetPosX()
     * @see #setPosX(int)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_PosX()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='posX' namespace='##targetNamespace'"
     * @generated
     */
    int getPosX();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosX <em>Pos X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pos X</em>' attribute.
     * @see #isSetPosX()
     * @see #unsetPosX()
     * @see #getPosX()
     * @generated
     */
    void setPosX(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosX <em>Pos X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPosX()
     * @see #getPosX()
     * @see #setPosX(int)
     * @generated
     */
    void unsetPosX();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosX <em>Pos X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pos X</em>' attribute is set.
     * @see #unsetPosX()
     * @see #getPosX()
     * @see #setPosX(int)
     * @generated
     */
    boolean isSetPosX();

    /**
     * Returns the value of the '<em><b>Pos Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pos Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pos Y</em>' attribute.
     * @see #isSetPosY()
     * @see #unsetPosY()
     * @see #setPosY(int)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_PosY()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='posY' namespace='##targetNamespace'"
     * @generated
     */
    int getPosY();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosY <em>Pos Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pos Y</em>' attribute.
     * @see #isSetPosY()
     * @see #unsetPosY()
     * @see #getPosY()
     * @generated
     */
    void setPosY(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosY <em>Pos Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPosY()
     * @see #getPosY()
     * @see #setPosY(int)
     * @generated
     */
    void unsetPosY();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getPosY <em>Pos Y</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pos Y</em>' attribute is set.
     * @see #unsetPosY()
     * @see #getPosY()
     * @see #setPosY(int)
     * @generated
     */
    boolean isSetPosY();

    /**
     * Returns the value of the '<em><b>Size X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size X</em>' attribute.
     * @see #isSetSizeX()
     * @see #unsetSizeX()
     * @see #setSizeX(int)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_SizeX()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='sizeX' namespace='##targetNamespace'"
     * @generated
     */
    int getSizeX();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getSizeX <em>Size X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size X</em>' attribute.
     * @see #isSetSizeX()
     * @see #unsetSizeX()
     * @see #getSizeX()
     * @generated
     */
    void setSizeX(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getSizeX <em>Size X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSizeX()
     * @see #getSizeX()
     * @see #setSizeX(int)
     * @generated
     */
    void unsetSizeX();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getSizeX <em>Size X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Size X</em>' attribute is set.
     * @see #unsetSizeX()
     * @see #getSizeX()
     * @see #setSizeX(int)
     * @generated
     */
    boolean isSetSizeX();

    /**
     * Returns the value of the '<em><b>Size Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size Y</em>' attribute.
     * @see #isSetSizeY()
     * @see #unsetSizeY()
     * @see #setSizeY(int)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_SizeY()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='sizeY' namespace='##targetNamespace'"
     * @generated
     */
    int getSizeY();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getSizeY <em>Size Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size Y</em>' attribute.
     * @see #isSetSizeY()
     * @see #unsetSizeY()
     * @see #getSizeY()
     * @generated
     */
    void setSizeY(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getSizeY <em>Size Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSizeY()
     * @see #getSizeY()
     * @see #setSizeY(int)
     * @generated
     */
    void unsetSizeY();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getSizeY <em>Size Y</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Size Y</em>' attribute is set.
     * @see #unsetSizeY()
     * @see #getSizeY()
     * @see #setSizeY(int)
     * @generated
     */
    boolean isSetSizeY();

    /**
     * Returns the value of the '<em><b>Screenshot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Screenshot</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Screenshot</em>' attribute.
     * @see #setScreenshot(byte[])
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_Screenshot()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
     * @generated
     */
    byte[] getScreenshot();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getScreenshot <em>Screenshot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Screenshot</em>' attribute.
     * @see #getScreenshot()
     * @generated
     */
    void setScreenshot(byte[] value);

    /**
     * Returns the value of the '<em><b>Node Data</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Data</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node Data</em>' containment reference.
     * @see #setNodeData(AbstractExternalData)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_NodeData()
     * @model containment="true"
     * @generated
     */
    AbstractExternalData getNodeData();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getNodeData <em>Node Data</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node Data</em>' containment reference.
     * @see #getNodeData()
     * @generated
     */
    void setNodeData(AbstractExternalData value);

    /**
     * Returns the value of the '<em><b>Node Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Container</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node Container</em>' containment reference.
     * @see #setNodeContainer(NodeContainerType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getNodeType_NodeContainer()
     * @model containment="true"
     * @generated
     */
    NodeContainerType getNodeContainer();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.NodeType#getNodeContainer <em>Node Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node Container</em>' containment reference.
     * @see #getNodeContainer()
     * @generated
     */
    void setNodeContainer(NodeContainerType value);

} // NodeType