/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soa Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.SoaService#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getContact <em>Contact</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getCreation <em>Creation</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getModification <em>Modification</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getPort <em>Port</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getType <em>Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getStyle <em>Style</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getUsedType <em>Used Type</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getParamStyle <em>Param Style</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaService#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getSoaService()
 * @model
 * @generated
 */
public interface SoaService extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Name Space</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Space</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name Space</em>' attribute.
     * @see #setNameSpace(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_NameSpace()
     * @model
     * @generated
     */
    String getNameSpace();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getNameSpace <em>Name Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Space</em>' attribute.
     * @see #getNameSpace()
     * @generated
     */
    void setNameSpace(String value);

    /**
     * Returns the value of the '<em><b>Contact</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contact</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contact</em>' attribute.
     * @see #setContact(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Contact()
     * @model
     * @generated
     */
    String getContact();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getContact <em>Contact</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contact</em>' attribute.
     * @see #getContact()
     * @generated
     */
    void setContact(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Creation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Creation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Creation</em>' attribute.
     * @see #setCreation(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Creation()
     * @model
     * @generated
     */
    Date getCreation();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getCreation <em>Creation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Creation</em>' attribute.
     * @see #getCreation()
     * @generated
     */
    void setCreation(Date value);

    /**
     * Returns the value of the '<em><b>Modification</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modification</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modification</em>' attribute.
     * @see #setModification(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Modification()
     * @model
     * @generated
     */
    Date getModification();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getModification <em>Modification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modification</em>' attribute.
     * @see #getModification()
     * @generated
     */
    void setModification(Date value);

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Port()
     * @model
     * @generated
     */
    int getPort();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
    void setPort(int value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style</em>' attribute.
     * @see #setStyle(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Style()
     * @model
     * @generated
     */
    String getStyle();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getStyle <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' attribute.
     * @see #getStyle()
     * @generated
     */
    void setStyle(String value);

    /**
     * Returns the value of the '<em><b>Used Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Used Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Used Type</em>' attribute.
     * @see #setUsedType(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_UsedType()
     * @model
     * @generated
     */
    String getUsedType();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getUsedType <em>Used Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Used Type</em>' attribute.
     * @see #getUsedType()
     * @generated
     */
    void setUsedType(String value);

    /**
     * Returns the value of the '<em><b>Param Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Param Style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Param Style</em>' attribute.
     * @see #setParamStyle(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_ParamStyle()
     * @model
     * @generated
     */
    String getParamStyle();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getParamStyle <em>Param Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Param Style</em>' attribute.
     * @see #getParamStyle()
     * @generated
     */
    void setParamStyle(String value);

    /**
     * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.SoaOperation}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.SoaOperation#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Operations()
     * @see org.talend.core.model.properties.SoaOperation#getService
     * @model type="org.talend.core.model.properties.SoaOperation" opposite="service" containment="true" ordered="false"
     * @generated
     */
    EList getOperations();

    /**
     * Returns the value of the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status</em>' attribute.
     * @see #setStatus(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaService_Status()
     * @model
     * @generated
     */
    String getStatus();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaService#getStatus <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' attribute.
     * @see #getStatus()
     * @generated
     */
    void setStatus(String value);

} // SoaService
