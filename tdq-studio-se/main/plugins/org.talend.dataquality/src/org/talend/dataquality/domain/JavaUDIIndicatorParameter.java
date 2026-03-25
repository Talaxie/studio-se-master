/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain;

import orgomg.mof.model.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java UDI Indicator Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.JavaUDIIndicatorParameter#getKey <em>Key</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.JavaUDIIndicatorParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.DomainPackage#getJavaUDIIndicatorParameter()
 * @model
 * @generated
 */
public interface JavaUDIIndicatorParameter extends ModelElement {
    /**
     * Returns the value of the '<em><b>Key</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key</em>' attribute.
     * @see #setKey(String)
     * @see org.talend.dataquality.domain.DomainPackage#getJavaUDIIndicatorParameter_Key()
     * @model default=""
     * @generated
     */
    String getKey();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.JavaUDIIndicatorParameter#getKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' attribute.
     * @see #getKey()
     * @generated
     */
    void setKey(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.talend.dataquality.domain.DomainPackage#getJavaUDIIndicatorParameter_Value()
     * @model default=""
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.JavaUDIIndicatorParameter#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // JavaUDIIndicatorParameter
