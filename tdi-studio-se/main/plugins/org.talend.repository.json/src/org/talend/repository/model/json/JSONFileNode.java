/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.json;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON File Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.repository.model.json.JSONFileNode#getJSONPath <em>JSON Path</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileNode#getRelatedColumn <em>Related Column</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileNode#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileNode#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileNode#getOrder <em>Order</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileNode#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.repository.model.json.JsonPackage#getJSONFileNode()
 * @model
 * @generated
 */
public interface JSONFileNode extends EObject {
    /**
     * Returns the value of the '<em><b>JSON Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>JSON Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>JSON Path</em>' attribute.
     * @see #setJSONPath(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileNode_JSONPath()
     * @model
     * @generated
     */
    String getJSONPath();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileNode#getJSONPath <em>JSON Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>JSON Path</em>' attribute.
     * @see #getJSONPath()
     * @generated
     */
    void setJSONPath(String value);

    /**
     * Returns the value of the '<em><b>Related Column</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Related Column</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Related Column</em>' attribute.
     * @see #setRelatedColumn(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileNode_RelatedColumn()
     * @model
     * @generated
     */
    String getRelatedColumn();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileNode#getRelatedColumn <em>Related Column</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Related Column</em>' attribute.
     * @see #getRelatedColumn()
     * @generated
     */
    void setRelatedColumn(String value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileNode_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileNode#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

    /**
     * Returns the value of the '<em><b>Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' attribute.
     * @see #setAttribute(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileNode_Attribute()
     * @model
     * @generated
     */
    String getAttribute();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileNode#getAttribute <em>Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute</em>' attribute.
     * @see #getAttribute()
     * @generated
     */
    void setAttribute(String value);

    /**
     * Returns the value of the '<em><b>Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Order</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Order</em>' attribute.
     * @see #setOrder(int)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileNode_Order()
     * @model
     * @generated
     */
    int getOrder();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileNode#getOrder <em>Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Order</em>' attribute.
     * @see #getOrder()
     * @generated
     */
    void setOrder(int value);

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
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileNode_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileNode#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // JSONFileNode
