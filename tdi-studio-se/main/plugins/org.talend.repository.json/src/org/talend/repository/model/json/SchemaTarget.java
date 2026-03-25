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
 * A representation of the model object '<em><b>Schema Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.repository.model.json.SchemaTarget#getRelativeXPathQuery <em>Relative XPath Query</em>}</li>
 *   <li>{@link org.talend.repository.model.json.SchemaTarget#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link org.talend.repository.model.json.SchemaTarget#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.repository.model.json.JsonPackage#getSchemaTarget()
 * @model
 * @generated
 */
public interface SchemaTarget extends EObject {
    /**
     * Returns the value of the '<em><b>Relative XPath Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relative XPath Query</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relative XPath Query</em>' attribute.
     * @see #setRelativeXPathQuery(String)
     * @see org.talend.repository.model.json.JsonPackage#getSchemaTarget_RelativeXPathQuery()
     * @model
     * @generated
     */
    String getRelativeXPathQuery();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.SchemaTarget#getRelativeXPathQuery <em>Relative XPath Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relative XPath Query</em>' attribute.
     * @see #getRelativeXPathQuery()
     * @generated
     */
    void setRelativeXPathQuery(String value);

    /**
     * Returns the value of the '<em><b>Tag Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tag Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tag Name</em>' attribute.
     * @see #setTagName(String)
     * @see org.talend.repository.model.json.JsonPackage#getSchemaTarget_TagName()
     * @model
     * @generated
     */
    String getTagName();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.SchemaTarget#getTagName <em>Tag Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tag Name</em>' attribute.
     * @see #getTagName()
     * @generated
     */
    void setTagName(String value);

    /**
     * Returns the value of the '<em><b>Schema</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getSchemaTargets <em>Schema Targets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema</em>' container reference.
     * @see #setSchema(JSONXPathLoopDescriptor)
     * @see org.talend.repository.model.json.JsonPackage#getSchemaTarget_Schema()
     * @see org.talend.repository.model.json.JSONXPathLoopDescriptor#getSchemaTargets
     * @model opposite="schemaTargets" transient="false"
     * @generated
     */
    JSONXPathLoopDescriptor getSchema();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.SchemaTarget#getSchema <em>Schema</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema</em>' container reference.
     * @see #getSchema()
     * @generated
     */
    void setSchema(JSONXPathLoopDescriptor value);

} // SchemaTarget
