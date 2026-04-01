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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.Component#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Component#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Component#getVersion <em>Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Component#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Component#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Component#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Component#getDeleteDate <em>Delete Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Component#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Component#getFileDescriptor <em>File Descriptor</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Component#getProjects <em>Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
     * @see org.talend.core.model.properties.PropertiesPackage#getComponent_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Component#getId <em>Id</em>}' attribute.
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
     * @see org.talend.core.model.properties.PropertiesPackage#getComponent_Label()
     * @model unique="false"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Component#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(float)
     * @see org.talend.core.model.properties.PropertiesPackage#getComponent_Version()
     * @model unique="false"
     * @generated
     */
    float getVersion();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Component#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(float value);

    /**
     * Returns the value of the '<em><b>Last Update Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Update Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Update Date</em>' attribute.
     * @see #setLastUpdateDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getComponent_LastUpdateDate()
     * @model unique="false"
     * @generated
     */
    Date getLastUpdateDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Component#getLastUpdateDate <em>Last Update Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Update Date</em>' attribute.
     * @see #getLastUpdateDate()
     * @generated
     */
    void setLastUpdateDate(Date value);

    /**
     * Returns the value of the '<em><b>Projects</b></em>' reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ProjectComponentAuthorisation}.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.ProjectComponentAuthorisation#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Projects</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Projects</em>' reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getComponent_Projects()
     * @see org.talend.core.model.properties.ProjectComponentAuthorisation#getComponent
     * @model type="org.talend.core.model.properties.ProjectComponentAuthorisation" opposite="component" ordered="false"
     * @generated
     */
    EList getProjects();

    /**
     * Returns the value of the '<em><b>Author</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Author</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Author</em>' reference.
     * @see #setAuthor(User)
     * @see org.talend.core.model.properties.PropertiesPackage#getComponent_Author()
     * @model required="true"
     * @generated
     */
    User getAuthor();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Component#getAuthor <em>Author</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Author</em>' reference.
     * @see #getAuthor()
     * @generated
     */
    void setAuthor(User value);

    /**
     * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Creation Date</em>' attribute.
     * @see #setCreationDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getComponent_CreationDate()
     * @model unique="false" required="true"
     * @generated
     */
    Date getCreationDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Component#getCreationDate <em>Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Creation Date</em>' attribute.
     * @see #getCreationDate()
     * @generated
     */
    void setCreationDate(Date value);

    /**
     * Returns the value of the '<em><b>Delete Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delete Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delete Date</em>' attribute.
     * @see #setDeleteDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getComponent_DeleteDate()
     * @model unique="false"
     * @generated
     */
    Date getDeleteDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Component#getDeleteDate <em>Delete Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete Date</em>' attribute.
     * @see #getDeleteDate()
     * @generated
     */
    void setDeleteDate(Date value);

    /**
     * Returns the value of the '<em><b>Deleted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deleted</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deleted</em>' attribute.
     * @see #setDeleted(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getComponent_Deleted()
     * @model unique="false"
     * @generated
     */
    boolean isDeleted();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Component#isDeleted <em>Deleted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deleted</em>' attribute.
     * @see #isDeleted()
     * @generated
     */
    void setDeleted(boolean value);

    /**
     * Returns the value of the '<em><b>File Descriptor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Descriptor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Descriptor</em>' attribute.
     * @see #setFileDescriptor(byte[])
     * @see org.talend.core.model.properties.PropertiesPackage#getComponent_FileDescriptor()
     * @model
     * @generated
     */
    byte[] getFileDescriptor();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Component#getFileDescriptor <em>File Descriptor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Descriptor</em>' attribute.
     * @see #getFileDescriptor()
     * @generated
     */
    void setFileDescriptor(byte[] value);

} // Component