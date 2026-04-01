/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.LiteralValue#getEncodeValueMeaning <em>Encode Value Meaning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.DomainPackage#getLiteralValue()
 * @model
 * @generated
 */
public interface LiteralValue extends EObject {
    /**
     * Returns the value of the '<em><b>Encode Value Meaning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Encode Value Meaning</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Encode Value Meaning</em>' attribute.
     * @see #setEncodeValueMeaning(String)
     * @see org.talend.dataquality.domain.DomainPackage#getLiteralValue_EncodeValueMeaning()
     * @model
     * @generated
     */
    String getEncodeValueMeaning();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.LiteralValue#getEncodeValueMeaning <em>Encode Value Meaning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Encode Value Meaning</em>' attribute.
     * @see #getEncodeValueMeaning()
     * @generated
     */
    void setEncodeValueMeaning(String value);

} // LiteralValue
