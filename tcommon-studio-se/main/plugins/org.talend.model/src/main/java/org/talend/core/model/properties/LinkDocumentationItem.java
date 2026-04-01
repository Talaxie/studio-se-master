/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Documentation Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.LinkDocumentationItem#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.LinkDocumentationItem#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.talend.core.model.properties.LinkDocumentationItem#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getLinkDocumentationItem()
 * @model
 * @generated
 */
public interface LinkDocumentationItem extends Item {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getLinkDocumentationItem_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.LinkDocumentationItem#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension</em>' attribute.
     * @see #setExtension(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getLinkDocumentationItem_Extension()
     * @model
     * @generated
     */
    String getExtension();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.LinkDocumentationItem#getExtension <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extension</em>' attribute.
     * @see #getExtension()
     * @generated
     */
    void setExtension(String value);

    /**
     * Returns the value of the '<em><b>Link</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Link</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Link</em>' reference.
     * @see #setLink(LinkType)
     * @see org.talend.core.model.properties.PropertiesPackage#getLinkDocumentationItem_Link()
     * @model
     * @generated
     */
    LinkType getLink();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.LinkDocumentationItem#getLink <em>Link</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Link</em>' reference.
     * @see #getLink()
     * @generated
     */
    void setLink(LinkType value);

} // LinkDocumentationItem
