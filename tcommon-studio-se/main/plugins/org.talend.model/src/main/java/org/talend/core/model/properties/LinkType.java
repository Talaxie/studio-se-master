/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.LinkType#getURI <em>URI</em>}</li>
 *   <li>{@link org.talend.core.model.properties.LinkType#isState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getLinkType()
 * @model
 * @generated
 */
public interface LinkType extends EObject {
    /**
     * Returns the value of the '<em><b>URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>URI</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>URI</em>' attribute.
     * @see #setURI(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getLinkType_URI()
     * @model
     * @generated
     */
    String getURI();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.LinkType#getURI <em>URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>URI</em>' attribute.
     * @see #getURI()
     * @generated
     */
    void setURI(String value);

    /**
     * Returns the value of the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>State</em>' attribute.
     * @see #setState(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getLinkType_State()
     * @model
     * @generated
     */
    boolean isState();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.LinkType#isState <em>State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' attribute.
     * @see #isState()
     * @generated
     */
    void setState(boolean value);

} // LinkType
