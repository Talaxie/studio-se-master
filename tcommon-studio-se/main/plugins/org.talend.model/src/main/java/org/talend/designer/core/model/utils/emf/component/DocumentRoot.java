/**
 */
package org.talend.designer.core.model.utils.emf.component;

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
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getADVANCEDPARAMETERS <em>ADVANCEDPARAMETERS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCODEGENERATION <em>CODEGENERATION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCOMPONENT <em>COMPONENT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCONNECTORS <em>CONNECTORS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getDOCUMENTATION <em>DOCUMENTATION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getFAMILIES <em>FAMILIES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getHEADER <em>HEADER</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getITEMS <em>ITEMS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getPARAMETER <em>PARAMETER</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getPARAMETERS <em>PARAMETERS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getPLUGINDEPENDENCIES <em>PLUGINDEPENDENCIES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getRETURNS <em>RETURNS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getSQLTEMPLATES <em>SQLTEMPLATES</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot()
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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_Mixed()
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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_XMLNSPrefixMap()
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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>ADVANCEDPARAMETERS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ADVANCEDPARAMETERS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ADVANCEDPARAMETERS</em>' containment reference.
     * @see #setADVANCEDPARAMETERS(ADVANCEDPARAMETERSType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_ADVANCEDPARAMETERS()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ADVANCED_PARAMETERS' namespace='##targetNamespace'"
     * @generated
     */
    ADVANCEDPARAMETERSType getADVANCEDPARAMETERS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getADVANCEDPARAMETERS <em>ADVANCEDPARAMETERS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ADVANCEDPARAMETERS</em>' containment reference.
     * @see #getADVANCEDPARAMETERS()
     * @generated
     */
    void setADVANCEDPARAMETERS(ADVANCEDPARAMETERSType value);

    /**
     * Returns the value of the '<em><b>CODEGENERATION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CODEGENERATION</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CODEGENERATION</em>' containment reference.
     * @see #setCODEGENERATION(CODEGENERATIONType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_CODEGENERATION()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='CODEGENERATION' namespace='##targetNamespace'"
     * @generated
     */
    CODEGENERATIONType getCODEGENERATION();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCODEGENERATION <em>CODEGENERATION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CODEGENERATION</em>' containment reference.
     * @see #getCODEGENERATION()
     * @generated
     */
    void setCODEGENERATION(CODEGENERATIONType value);

    /**
     * Returns the value of the '<em><b>COMPONENT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COMPONENT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COMPONENT</em>' containment reference.
     * @see #setCOMPONENT(COMPONENTType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_COMPONENT()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='COMPONENT' namespace='##targetNamespace'"
     * @generated
     */
    COMPONENTType getCOMPONENT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCOMPONENT <em>COMPONENT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMPONENT</em>' containment reference.
     * @see #getCOMPONENT()
     * @generated
     */
    void setCOMPONENT(COMPONENTType value);

    /**
     * Returns the value of the '<em><b>CONNECTORS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTORS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTORS</em>' containment reference.
     * @see #setCONNECTORS(CONNECTORSType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_CONNECTORS()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='CONNECTORS' namespace='##targetNamespace'"
     * @generated
     */
    CONNECTORSType getCONNECTORS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getCONNECTORS <em>CONNECTORS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONNECTORS</em>' containment reference.
     * @see #getCONNECTORS()
     * @generated
     */
    void setCONNECTORS(CONNECTORSType value);

    /**
     * Returns the value of the '<em><b>DOCUMENTATION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DOCUMENTATION</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DOCUMENTATION</em>' containment reference.
     * @see #setDOCUMENTATION(DOCUMENTATIONType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_DOCUMENTATION()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DOCUMENTATION' namespace='##targetNamespace'"
     * @generated
     */
    DOCUMENTATIONType getDOCUMENTATION();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getDOCUMENTATION <em>DOCUMENTATION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DOCUMENTATION</em>' containment reference.
     * @see #getDOCUMENTATION()
     * @generated
     */
    void setDOCUMENTATION(DOCUMENTATIONType value);

    /**
     * Returns the value of the '<em><b>FAMILIES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FAMILIES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FAMILIES</em>' containment reference.
     * @see #setFAMILIES(FAMILIESType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_FAMILIES()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='FAMILIES' namespace='##targetNamespace'"
     * @generated
     */
    FAMILIESType getFAMILIES();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getFAMILIES <em>FAMILIES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FAMILIES</em>' containment reference.
     * @see #getFAMILIES()
     * @generated
     */
    void setFAMILIES(FAMILIESType value);

    /**
     * Returns the value of the '<em><b>HEADER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>HEADER</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>HEADER</em>' containment reference.
     * @see #setHEADER(HEADERType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_HEADER()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='HEADER' namespace='##targetNamespace'"
     * @generated
     */
    HEADERType getHEADER();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getHEADER <em>HEADER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>HEADER</em>' containment reference.
     * @see #getHEADER()
     * @generated
     */
    void setHEADER(HEADERType value);

    /**
     * Returns the value of the '<em><b>ITEMS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ITEMS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ITEMS</em>' containment reference.
     * @see #setITEMS(ITEMSType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_ITEMS()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ITEMS' namespace='##targetNamespace'"
     * @generated
     */
    ITEMSType getITEMS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getITEMS <em>ITEMS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ITEMS</em>' containment reference.
     * @see #getITEMS()
     * @generated
     */
    void setITEMS(ITEMSType value);

    /**
     * Returns the value of the '<em><b>PARAMETER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARAMETER</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARAMETER</em>' containment reference.
     * @see #setPARAMETER(PARAMETERType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_PARAMETER()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='PARAMETER' namespace='##targetNamespace'"
     * @generated
     */
    PARAMETERType getPARAMETER();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getPARAMETER <em>PARAMETER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARAMETER</em>' containment reference.
     * @see #getPARAMETER()
     * @generated
     */
    void setPARAMETER(PARAMETERType value);

    /**
     * Returns the value of the '<em><b>PARAMETERS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARAMETERS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARAMETERS</em>' containment reference.
     * @see #setPARAMETERS(PARAMETERSType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_PARAMETERS()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='PARAMETERS' namespace='##targetNamespace'"
     * @generated
     */
    PARAMETERSType getPARAMETERS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getPARAMETERS <em>PARAMETERS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARAMETERS</em>' containment reference.
     * @see #getPARAMETERS()
     * @generated
     */
    void setPARAMETERS(PARAMETERSType value);

    /**
     * Returns the value of the '<em><b>PLUGINDEPENDENCIES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PLUGINDEPENDENCIES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PLUGINDEPENDENCIES</em>' containment reference.
     * @see #setPLUGINDEPENDENCIES(PLUGINDEPENDENCIESType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_PLUGINDEPENDENCIES()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='PLUGINDEPENDENCIES' namespace='##targetNamespace'"
     * @generated
     */
    PLUGINDEPENDENCIESType getPLUGINDEPENDENCIES();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getPLUGINDEPENDENCIES <em>PLUGINDEPENDENCIES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PLUGINDEPENDENCIES</em>' containment reference.
     * @see #getPLUGINDEPENDENCIES()
     * @generated
     */
    void setPLUGINDEPENDENCIES(PLUGINDEPENDENCIESType value);

    /**
     * Returns the value of the '<em><b>RETURNS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RETURNS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RETURNS</em>' containment reference.
     * @see #setRETURNS(RETURNSType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_RETURNS()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='RETURNS' namespace='##targetNamespace'"
     * @generated
     */
    RETURNSType getRETURNS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getRETURNS <em>RETURNS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RETURNS</em>' containment reference.
     * @see #getRETURNS()
     * @generated
     */
    void setRETURNS(RETURNSType value);

    /**
     * Returns the value of the '<em><b>SQLTEMPLATES</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SQLTEMPLATES</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SQLTEMPLATES</em>' containment reference.
     * @see #setSQLTEMPLATES(SQLTEMPLATESType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDocumentRoot_SQLTEMPLATES()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SQLTEMPLATES' namespace='##targetNamespace'"
     * @generated
     */
    SQLTEMPLATESType getSQLTEMPLATES();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DocumentRoot#getSQLTEMPLATES <em>SQLTEMPLATES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SQLTEMPLATES</em>' containment reference.
     * @see #getSQLTEMPLATES()
     * @generated
     */
    void setSQLTEMPLATES(SQLTEMPLATESType value);

} // DocumentRoot
