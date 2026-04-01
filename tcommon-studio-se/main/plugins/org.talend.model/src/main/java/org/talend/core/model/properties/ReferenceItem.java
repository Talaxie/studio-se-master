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
 * A representation of the model object '<em><b>Reference Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ReferenceItem#getState <em>State</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ReferenceItem#getParent <em>Parent</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ReferenceItem#isReloadFromFile <em>Reload From File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getReferenceItem()
 * @model
 * @generated
 */
public interface ReferenceItem extends EObject {
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
     * @see org.talend.core.model.properties.PropertiesPackage#getReferenceItem_State()
     * @model
     * @generated
     */
    ItemState getState();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ReferenceItem#getState <em>State</em>}' reference.
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
     * @see org.talend.core.model.properties.PropertiesPackage#getReferenceItem_Parent()
     * @model transient="true"
     * @generated
     */
    EObject getParent();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ReferenceItem#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(EObject value);

    /**
     * Returns the value of the '<em><b>Reload From File</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reload From File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reload From File</em>' attribute.
     * @see #setReloadFromFile(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getReferenceItem_ReloadFromFile()
     * @model default="true" transient="true"
     * @generated
     */
    boolean isReloadFromFile();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ReferenceItem#isReloadFromFile <em>Reload From File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reload From File</em>' attribute.
     * @see #isReloadFromFile()
     * @generated
     */
    void setReloadFromFile(boolean value);

} // ReferenceItem
