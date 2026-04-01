/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COMPONENT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getHEADER <em>HEADER</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getFAMILIES <em>FAMILIES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getDOCUMENTATION <em>DOCUMENTATION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getCONNECTORS <em>CONNECTORS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getSQLTEMPLATES <em>SQLTEMPLATES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getPARAMETERS <em>PARAMETERS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getADVANCEDPARAMETERS <em>ADVANCEDPARAMETERS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getCODEGENERATION <em>CODEGENERATION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getRETURNS <em>RETURNS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getPLUGINDEPENDENCIES <em>PLUGINDEPENDENCIES</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType()
 * @model extendedMetaData="name='COMPONENT_._type' kind='elementOnly'"
 * @generated
 */
public interface COMPONENTType extends EObject {
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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType_HEADER()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='HEADER' namespace='##targetNamespace'"
     * @generated
     */
    HEADERType getHEADER();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getHEADER <em>HEADER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>HEADER</em>' containment reference.
     * @see #getHEADER()
     * @generated
     */
    void setHEADER(HEADERType value);

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType_FAMILIES()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='FAMILIES' namespace='##targetNamespace'"
     * @generated
     */
    FAMILIESType getFAMILIES();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getFAMILIES <em>FAMILIES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FAMILIES</em>' containment reference.
     * @see #getFAMILIES()
     * @generated
     */
    void setFAMILIES(FAMILIESType value);

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType_DOCUMENTATION()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='DOCUMENTATION' namespace='##targetNamespace'"
     * @generated
     */
    DOCUMENTATIONType getDOCUMENTATION();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getDOCUMENTATION <em>DOCUMENTATION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DOCUMENTATION</em>' containment reference.
     * @see #getDOCUMENTATION()
     * @generated
     */
    void setDOCUMENTATION(DOCUMENTATIONType value);

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType_CONNECTORS()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='CONNECTORS' namespace='##targetNamespace'"
     * @generated
     */
    CONNECTORSType getCONNECTORS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getCONNECTORS <em>CONNECTORS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONNECTORS</em>' containment reference.
     * @see #getCONNECTORS()
     * @generated
     */
    void setCONNECTORS(CONNECTORSType value);

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType_SQLTEMPLATES()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SQLTEMPLATES' namespace='##targetNamespace'"
     * @generated
     */
    SQLTEMPLATESType getSQLTEMPLATES();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getSQLTEMPLATES <em>SQLTEMPLATES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SQLTEMPLATES</em>' containment reference.
     * @see #getSQLTEMPLATES()
     * @generated
     */
    void setSQLTEMPLATES(SQLTEMPLATESType value);

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType_PARAMETERS()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='PARAMETERS' namespace='##targetNamespace'"
     * @generated
     */
    PARAMETERSType getPARAMETERS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getPARAMETERS <em>PARAMETERS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARAMETERS</em>' containment reference.
     * @see #getPARAMETERS()
     * @generated
     */
    void setPARAMETERS(PARAMETERSType value);

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType_ADVANCEDPARAMETERS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ADVANCED_PARAMETERS' namespace='##targetNamespace'"
     * @generated
     */
    ADVANCEDPARAMETERSType getADVANCEDPARAMETERS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getADVANCEDPARAMETERS <em>ADVANCEDPARAMETERS</em>}' containment reference.
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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType_CODEGENERATION()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='CODEGENERATION' namespace='##targetNamespace'"
     * @generated
     */
    CODEGENERATIONType getCODEGENERATION();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getCODEGENERATION <em>CODEGENERATION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CODEGENERATION</em>' containment reference.
     * @see #getCODEGENERATION()
     * @generated
     */
    void setCODEGENERATION(CODEGENERATIONType value);

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType_RETURNS()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='RETURNS' namespace='##targetNamespace'"
     * @generated
     */
    RETURNSType getRETURNS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getRETURNS <em>RETURNS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RETURNS</em>' containment reference.
     * @see #getRETURNS()
     * @generated
     */
    void setRETURNS(RETURNSType value);

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOMPONENTType_PLUGINDEPENDENCIES()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='PLUGINDEPENDENCIES' namespace='##targetNamespace'"
     * @generated
     */
    PLUGINDEPENDENCIESType getPLUGINDEPENDENCIES();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COMPONENTType#getPLUGINDEPENDENCIES <em>PLUGINDEPENDENCIES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PLUGINDEPENDENCIES</em>' containment reference.
     * @see #getPLUGINDEPENDENCIES()
     * @generated
     */
    void setPLUGINDEPENDENCIES(PLUGINDEPENDENCIESType value);

} // COMPONENTType
