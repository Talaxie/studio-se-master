/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Notation Holder</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.NotationHolder#getNotationString <em>Notation String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getNotationHolder()
 * @model
 * @generated
 */
public interface NotationHolder extends EObject {

    /**
     * Returns the value of the '<em><b>Notation String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Notation String</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Notation String</em>' attribute.
     * @see #setNotationString(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getNotationHolder_NotationString()
     * @model
     * @generated
     */
    String getNotationString();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.NotationHolder#getNotationString <em>Notation String</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Notation String</em>' attribute.
     * @see #getNotationString()
     * @generated
     */
    void setNotationString(String value);

} // NotationHolder
