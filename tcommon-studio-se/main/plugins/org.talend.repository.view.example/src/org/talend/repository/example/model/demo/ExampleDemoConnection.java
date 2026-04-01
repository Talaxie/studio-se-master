/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.example.model.demo;

import org.talend.core.model.metadata.builder.connection.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Demo Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.repository.example.model.demo.ExampleDemoConnection#getType <em>Type</em>}</li>
 *   <li>{@link org.talend.repository.example.model.demo.ExampleDemoConnection#isValid <em>Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.repository.example.model.demo.DemoPackage#getExampleDemoConnection()
 * @model
 * @generated
 */
public interface ExampleDemoConnection extends Connection {
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
     * @see org.talend.repository.example.model.demo.DemoPackage#getExampleDemoConnection_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.talend.repository.example.model.demo.ExampleDemoConnection#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Valid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valid</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Valid</em>' attribute.
     * @see #setValid(boolean)
     * @see org.talend.repository.example.model.demo.DemoPackage#getExampleDemoConnection_Valid()
     * @model
     * @generated
     */
    boolean isValid();

    /**
     * Sets the value of the '{@link org.talend.repository.example.model.demo.ExampleDemoConnection#isValid <em>Valid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valid</em>' attribute.
     * @see #isValid()
     * @generated
     */
    void setValid(boolean value);

} // ExampleDemoConnection
