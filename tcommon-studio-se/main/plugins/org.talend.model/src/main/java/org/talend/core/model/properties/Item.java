/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Item</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.Item#getProperty <em>Property</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Item#getState <em>State</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Item#getParent <em>Parent</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Item#getReferenceResources <em>Reference Resources</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Item#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link org.talend.core.model.properties.Item#isNeedVersion <em>Need Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends EObject {

    /**
     * Returns the value of the '<em><b>Property</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.Property#getItem <em>Item</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' reference.
     * @see #setProperty(Property)
     * @see org.talend.core.model.properties.PropertiesPackage#getItem_Property()
     * @see org.talend.core.model.properties.Property#getItem
     * @model opposite="item"
     * @generated
     */
    Property getProperty();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Item#getProperty <em>Property</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' reference.
     * @see #getProperty()
     * @generated
     */
    void setProperty(Property value);

    /**
     * Returns the value of the '<em><b>State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>State</em>' reference.
     * @see #setState(ItemState)
     * @see org.talend.core.model.properties.PropertiesPackage#getItem_State()
     * @model
     * @generated
     */
    ItemState getState();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Item#getState <em>State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' reference.
     * @see #getState()
     * @generated
     */
    void setState(ItemState value);

    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(EObject)
     * @see org.talend.core.model.properties.PropertiesPackage#getItem_Parent()
     * @model transient="true"
     * @generated
     */
    EObject getParent();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Item#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(EObject value);

    /**
     * Returns the value of the '<em><b>Reference Resources</b></em>' reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ReferenceFileItem}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Resources</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Resources</em>' reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getItem_ReferenceResources()
     * @model type="org.talend.core.model.properties.ReferenceFileItem"
     * @generated
     */
    EList getReferenceResources();

    /**
     * Returns the value of the '<em><b>File Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Extension</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Extension</em>' attribute.
     * @see #setFileExtension(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getItem_FileExtension()
     * @model
     * @generated
     */
    String getFileExtension();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Item#getFileExtension <em>File Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Extension</em>' attribute.
     * @see #getFileExtension()
     * @generated
     */
    void setFileExtension(String value);

    /**
     * Returns the value of the '<em><b>Need Version</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Need Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Need Version</em>' attribute.
     * @see #setNeedVersion(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getItem_NeedVersion()
     * @model default="true"
     * @generated
     */
    boolean isNeedVersion();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.Item#isNeedVersion <em>Need Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Need Version</em>' attribute.
     * @see #isNeedVersion()
     * @generated
     */
    void setNeedVersion(boolean value);

} // Item
