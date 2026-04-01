/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getElementParameter <em>Element Parameter</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getNode <em>Node</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getNote <em>Note</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getProcess <em>Process</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getRequired <em>Required</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getSubjob <em>Subjob</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection</em>' containment reference.
     * @see #setConnection(ConnectionType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_Connection()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Connection' namespace='##targetNamespace'"
     * @generated
     */
    ConnectionType getConnection();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getConnection <em>Connection</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection</em>' containment reference.
     * @see #getConnection()
     * @generated
     */
    void setConnection(ConnectionType value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' containment reference.
     * @see #setContext(ContextType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_Context()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Context' namespace='##targetNamespace'"
     * @generated
     */
    ContextType getContext();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getContext <em>Context</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' containment reference.
     * @see #getContext()
     * @generated
     */
    void setContext(ContextType value);

    /**
     * Returns the value of the '<em><b>Element Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Parameter</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Parameter</em>' containment reference.
     * @see #setElementParameter(ElementParameterType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_ElementParameter()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ElementParameter' namespace='##targetNamespace'"
     * @generated
     */
    ElementParameterType getElementParameter();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getElementParameter <em>Element Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Parameter</em>' containment reference.
     * @see #getElementParameter()
     * @generated
     */
    void setElementParameter(ElementParameterType value);

    /**
     * Returns the value of the '<em><b>Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node</em>' containment reference.
     * @see #setNode(NodeType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_Node()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Node' namespace='##targetNamespace'"
     * @generated
     */
    NodeType getNode();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getNode <em>Node</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node</em>' containment reference.
     * @see #getNode()
     * @generated
     */
    void setNode(NodeType value);

    /**
     * Returns the value of the '<em><b>Note</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Note</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Note</em>' containment reference.
     * @see #setNote(NoteType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_Note()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Note' namespace='##targetNamespace'"
     * @generated
     */
    NoteType getNote();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getNote <em>Note</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Note</em>' containment reference.
     * @see #getNote()
     * @generated
     */
    void setNote(NoteType value);

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference.
     * @see #setParameters(ParametersType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_Parameters()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
     * @generated
     */
    ParametersType getParameters();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getParameters <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameters</em>' containment reference.
     * @see #getParameters()
     * @generated
     */
    void setParameters(ParametersType value);

    /**
     * Returns the value of the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' containment reference.
     * @see #setProcess(ProcessType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_Process()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Process' namespace='##targetNamespace'"
     * @generated
     */
    ProcessType getProcess();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getProcess <em>Process</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' containment reference.
     * @see #getProcess()
     * @generated
     */
    void setProcess(ProcessType value);

    /**
     * Returns the value of the '<em><b>Required</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Required</em>' containment reference.
     * @see #setRequired(RequiredType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_Required()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Required' namespace='##targetNamespace'"
     * @generated
     */
    RequiredType getRequired();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getRequired <em>Required</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Required</em>' containment reference.
     * @see #getRequired()
     * @generated
     */
    void setRequired(RequiredType value);

    /**
     * Returns the value of the '<em><b>Subjob</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subjob</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subjob</em>' containment reference.
     * @see #setSubjob(SubjobType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getDocumentRoot_Subjob()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='Subjob' namespace='##targetNamespace'"
     * @generated
     */
    SubjobType getSubjob();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot#getSubjob <em>Subjob</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subjob</em>' containment reference.
     * @see #getSubjob()
     * @generated
     */
    void setSubjob(SubjobType value);

} // DocumentRoot