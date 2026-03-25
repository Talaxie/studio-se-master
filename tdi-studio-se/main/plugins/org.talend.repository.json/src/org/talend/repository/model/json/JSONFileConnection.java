/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.json;

import org.eclipse.emf.common.util.EList;
import org.talend.core.model.metadata.builder.connection.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON File Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#getJSONFilePath <em>JSON File Path</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#isGuess <em>Guess</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#getMaskXPattern <em>Mask XPattern</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#getGroup <em>Group</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#getRoot <em>Root</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#isInputModel <em>Input Model</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#getOutputFilePath <em>Output File Path</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#getFileContent <em>File Content</em>}</li>
 *   <li>{@link org.talend.repository.model.json.JSONFileConnection#getReadbyMode <em>Readby Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection()
 * @model
 * @generated
 */
public interface JSONFileConnection extends Connection {
    /**
     * Returns the value of the '<em><b>JSON File Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>JSON File Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>JSON File Path</em>' attribute.
     * @see #setJSONFilePath(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_JSONFilePath()
     * @model
     * @generated
     */
    String getJSONFilePath();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileConnection#getJSONFilePath <em>JSON File Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>JSON File Path</em>' attribute.
     * @see #getJSONFilePath()
     * @generated
     */
    void setJSONFilePath(String value);

    /**
     * Returns the value of the '<em><b>Guess</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Guess</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Guess</em>' attribute.
     * @see #setGuess(boolean)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_Guess()
     * @model
     * @generated
     */
    boolean isGuess();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileConnection#isGuess <em>Guess</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Guess</em>' attribute.
     * @see #isGuess()
     * @generated
     */
    void setGuess(boolean value);

    /**
     * Returns the value of the '<em><b>Mask XPattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mask XPattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mask XPattern</em>' attribute.
     * @see #setMaskXPattern(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_MaskXPattern()
     * @model
     * @generated
     */
    String getMaskXPattern();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileConnection#getMaskXPattern <em>Mask XPattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mask XPattern</em>' attribute.
     * @see #getMaskXPattern()
     * @generated
     */
    void setMaskXPattern(String value);

    /**
     * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.repository.model.json.JSONXPathLoopDescriptor}.
     * It is bidirectional and its opposite is '{@link org.talend.repository.model.json.JSONXPathLoopDescriptor#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema</em>' containment reference list.
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_Schema()
     * @see org.talend.repository.model.json.JSONXPathLoopDescriptor#getConnection
     * @model opposite="connection" containment="true"
     * @generated
     */
    EList<JSONXPathLoopDescriptor> getSchema();

    /**
     * Returns the value of the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Encoding</em>' attribute.
     * @see #setEncoding(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_Encoding()
     * @model
     * @generated
     */
    String getEncoding();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileConnection#getEncoding <em>Encoding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Encoding</em>' attribute.
     * @see #getEncoding()
     * @generated
     */
    void setEncoding(String value);

    /**
     * Returns the value of the '<em><b>Group</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.repository.model.json.JSONFileNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' containment reference list.
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_Group()
     * @model containment="true"
     * @generated
     */
    EList<JSONFileNode> getGroup();

    /**
     * Returns the value of the '<em><b>Root</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.repository.model.json.JSONFileNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root</em>' containment reference list.
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_Root()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<JSONFileNode> getRoot();

    /**
     * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.repository.model.json.JSONFileNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop</em>' containment reference list.
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_Loop()
     * @model containment="true"
     * @generated
     */
    EList<JSONFileNode> getLoop();

    /**
     * Returns the value of the '<em><b>Input Model</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Model</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Model</em>' attribute.
     * @see #setInputModel(boolean)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_InputModel()
     * @model default="true"
     * @generated
     */
    boolean isInputModel();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileConnection#isInputModel <em>Input Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Model</em>' attribute.
     * @see #isInputModel()
     * @generated
     */
    void setInputModel(boolean value);

    /**
     * Returns the value of the '<em><b>Output File Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output File Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output File Path</em>' attribute.
     * @see #setOutputFilePath(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_OutputFilePath()
     * @model
     * @generated
     */
    String getOutputFilePath();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileConnection#getOutputFilePath <em>Output File Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output File Path</em>' attribute.
     * @see #getOutputFilePath()
     * @generated
     */
    void setOutputFilePath(String value);

    /**
     * Returns the value of the '<em><b>File Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Content</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Content</em>' attribute.
     * @see #setFileContent(byte[])
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_FileContent()
     * @model
     * @generated
     */
    byte[] getFileContent();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileConnection#getFileContent <em>File Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Content</em>' attribute.
     * @see #getFileContent()
     * @generated
     */
    void setFileContent(byte[] value);

    /**
     * Returns the value of the '<em><b>Readby Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Readby Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Readby Mode</em>' attribute.
     * @see #setReadbyMode(String)
     * @see org.talend.repository.model.json.JsonPackage#getJSONFileConnection_ReadbyMode()
     * @model
     * @generated
     */
    String getReadbyMode();

    /**
     * Sets the value of the '{@link org.talend.repository.model.json.JSONFileConnection#getReadbyMode <em>Readby Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Readby Mode</em>' attribute.
     * @see #getReadbyMode()
     * @generated
     */
    void setReadbyMode(String value);

} // JSONFileConnection
