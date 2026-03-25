/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.json;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSONX Path Loop Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getLimitBoucle <em>Limit Boucle</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getAbsoluteXPathQuery <em>Absolute XPath Query</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getSchemaTargets <em>Schema Targets</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getFlag <em>Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.repository.model.json.JsonPackage#getJSONXPathLoopDescriptor()
 * @model
 * @generated
 */
public interface JSONXPathLoopDescriptor extends EObject {
    /**
     * Returns the value of the '<em><b>Limit Boucle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Limit Boucle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Limit Boucle</em>' attribute.
     * @see #setLimitBoucle(Integer)
     * @see org.talend.repository.model.json.JsonPackage#getJSONXPathLoopDescriptor_LimitBoucle()
     * @model
     * @generated
     */
    Integer getLimitBoucle();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getLimitBoucle <em>Limit Boucle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Limit Boucle</em>' attribute.
     * @see #getLimitBoucle()
     * @generated
     */
    void setLimitBoucle(Integer value);

    /**
     * Returns the value of the '<em><b>Absolute XPath Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Absolute XPath Query</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Absolute XPath Query</em>' attribute.
     * @see #setAbsoluteXPathQuery(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONXPathLoopDescriptor_AbsoluteXPathQuery()
     * @model
     * @generated
     */
    String getAbsoluteXPathQuery();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getAbsoluteXPathQuery <em>Absolute XPath Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Absolute XPath Query</em>' attribute.
     * @see #getAbsoluteXPathQuery()
     * @generated
     */
    void setAbsoluteXPathQuery(String value);

    /**
     * Returns the value of the '<em><b>Connection</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.repository.model.json.JSONFileConnection#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection</em>' container reference.
     * @see #setConnection(JSONFileConnection)
     * @see org.talend.repository.model.json.JsonPackage#getJSONXPathLoopDescriptor_Connection()
     * @see org.talend.repository.model.json.JSONFileConnection#getSchema
     * @model opposite="schema" transient="false"
     * @generated
     */
    JSONFileConnection getConnection();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getConnection <em>Connection</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection</em>' container reference.
     * @see #getConnection()
     * @generated
     */
    void setConnection(JSONFileConnection value);

    /**
     * Returns the value of the '<em><b>Schema Targets</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.repository.model.json.SchemaTarget}.
     * It is bidirectional and its opposite is '{@link org.talend.repository.model.json.SchemaTarget#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Targets</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Targets</em>' containment reference list.
     * @see org.talend.repository.model.json.JsonPackage#getJSONXPathLoopDescriptor_SchemaTargets()
     * @see org.talend.repository.model.json.SchemaTarget#getSchema
     * @model opposite="schema" containment="true"
     * @generated
     */
    EList<SchemaTarget> getSchemaTargets();

    /**
     * Returns the value of the '<em><b>Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flag</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flag</em>' attribute.
     * @see #setFlag(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONXPathLoopDescriptor_Flag()
     * @model
     * @generated
     */
    String getFlag();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getFlag <em>Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flag</em>' attribute.
     * @see #getFlag()
     * @generated
     */
    void setFlag(String value);

} // JSONXPathLoopDescriptor
