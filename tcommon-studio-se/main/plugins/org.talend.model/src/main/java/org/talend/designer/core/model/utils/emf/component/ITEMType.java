/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITEM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getITEMS <em>ITEMS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getCONTEXT <em>CONTEXT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isDISPLAYNAMEASVALUE <em>DISPLAYNAMEASVALUE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getFIELD <em>FIELD</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getFILTER <em>FILTER</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getNAME <em>NAME</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isNOCONTEXTASSIST <em>NOCONTEXTASSIST</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getNOTREADONLYIF <em>NOTREADONLYIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getNOTSHOWIF <em>NOTSHOWIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isRAW <em>RAW</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isREADONLY <em>READONLY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getREADONLYIF <em>READONLYIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getREPOSITORYITEM <em>REPOSITORYITEM</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getSHOWIF <em>SHOWIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getVALUE <em>VALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType()
 * @model extendedMetaData="name='ITEM_._type' kind='elementOnly'"
 * @generated
 */
public interface ITEMType extends EObject {
    /**
     * Returns the value of the '<em><b>ITEMS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 										Used for combo box in TABLE
     * 										field
     * 									
     * <!-- end-model-doc -->
     * @return the value of the '<em>ITEMS</em>' containment reference.
     * @see #setITEMS(ITEMSType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_ITEMS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ITEMS' namespace='##targetNamespace'"
     * @generated
     */
    ITEMSType getITEMS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getITEMS <em>ITEMS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ITEMS</em>' containment reference.
     * @see #getITEMS()
     * @generated
     */
    void setITEMS(ITEMSType value);

    /**
     * Returns the value of the '<em><b>CONTEXT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONTEXT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONTEXT</em>' attribute.
     * @see #setCONTEXT(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_CONTEXT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='CONTEXT' namespace='##targetNamespace'"
     * @generated
     */
    String getCONTEXT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getCONTEXT <em>CONTEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONTEXT</em>' attribute.
     * @see #getCONTEXT()
     * @generated
     */
    void setCONTEXT(String value);

    /**
     * Returns the value of the '<em><b>DISPLAYNAMEASVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DISPLAYNAMEASVALUE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DISPLAYNAMEASVALUE</em>' attribute.
     * @see #isSetDISPLAYNAMEASVALUE()
     * @see #unsetDISPLAYNAMEASVALUE()
     * @see #setDISPLAYNAMEASVALUE(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_DISPLAYNAMEASVALUE()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='DISPLAY_NAME_AS_VALUE' namespace='##targetNamespace'"
     * @generated
     */
    boolean isDISPLAYNAMEASVALUE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isDISPLAYNAMEASVALUE <em>DISPLAYNAMEASVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DISPLAYNAMEASVALUE</em>' attribute.
     * @see #isSetDISPLAYNAMEASVALUE()
     * @see #unsetDISPLAYNAMEASVALUE()
     * @see #isDISPLAYNAMEASVALUE()
     * @generated
     */
    void setDISPLAYNAMEASVALUE(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isDISPLAYNAMEASVALUE <em>DISPLAYNAMEASVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDISPLAYNAMEASVALUE()
     * @see #isDISPLAYNAMEASVALUE()
     * @see #setDISPLAYNAMEASVALUE(boolean)
     * @generated
     */
    void unsetDISPLAYNAMEASVALUE();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isDISPLAYNAMEASVALUE <em>DISPLAYNAMEASVALUE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DISPLAYNAMEASVALUE</em>' attribute is set.
     * @see #unsetDISPLAYNAMEASVALUE()
     * @see #isDISPLAYNAMEASVALUE()
     * @see #setDISPLAYNAMEASVALUE(boolean)
     * @generated
     */
    boolean isSetDISPLAYNAMEASVALUE();

    /**
     * Returns the value of the '<em><b>FIELD</b></em>' attribute.
     * The default value is <code>"TEXT"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FIELD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FIELD</em>' attribute.
     * @see #isSetFIELD()
     * @see #unsetFIELD()
     * @see #setFIELD(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_FIELD()
     * @model default="TEXT" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='FIELD' namespace='##targetNamespace'"
     * @generated
     */
    String getFIELD();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getFIELD <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FIELD</em>' attribute.
     * @see #isSetFIELD()
     * @see #unsetFIELD()
     * @see #getFIELD()
     * @generated
     */
    void setFIELD(String value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getFIELD <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFIELD()
     * @see #getFIELD()
     * @see #setFIELD(String)
     * @generated
     */
    void unsetFIELD();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getFIELD <em>FIELD</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>FIELD</em>' attribute is set.
     * @see #unsetFIELD()
     * @see #getFIELD()
     * @see #setFIELD(String)
     * @generated
     */
    boolean isSetFIELD();

    /**
     * Returns the value of the '<em><b>FILTER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FILTER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FILTER</em>' attribute.
     * @see #setFILTER(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_FILTER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='FILTER' namespace='##targetNamespace'"
     * @generated
     */
    String getFILTER();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getFILTER <em>FILTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FILTER</em>' attribute.
     * @see #getFILTER()
     * @generated
     */
    void setFILTER(String value);

    /**
     * Returns the value of the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NAME</em>' attribute.
     * @see #setNAME(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getNAME();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(String value);

    /**
     * Returns the value of the '<em><b>NOCONTEXTASSIST</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NOCONTEXTASSIST</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NOCONTEXTASSIST</em>' attribute.
     * @see #isSetNOCONTEXTASSIST()
     * @see #unsetNOCONTEXTASSIST()
     * @see #setNOCONTEXTASSIST(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_NOCONTEXTASSIST()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='NO_CONTEXT_ASSIST' namespace='##targetNamespace'"
     * @generated
     */
    boolean isNOCONTEXTASSIST();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isNOCONTEXTASSIST <em>NOCONTEXTASSIST</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NOCONTEXTASSIST</em>' attribute.
     * @see #isSetNOCONTEXTASSIST()
     * @see #unsetNOCONTEXTASSIST()
     * @see #isNOCONTEXTASSIST()
     * @generated
     */
    void setNOCONTEXTASSIST(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isNOCONTEXTASSIST <em>NOCONTEXTASSIST</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNOCONTEXTASSIST()
     * @see #isNOCONTEXTASSIST()
     * @see #setNOCONTEXTASSIST(boolean)
     * @generated
     */
    void unsetNOCONTEXTASSIST();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isNOCONTEXTASSIST <em>NOCONTEXTASSIST</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>NOCONTEXTASSIST</em>' attribute is set.
     * @see #unsetNOCONTEXTASSIST()
     * @see #isNOCONTEXTASSIST()
     * @see #setNOCONTEXTASSIST(boolean)
     * @generated
     */
    boolean isSetNOCONTEXTASSIST();

    /**
     * Returns the value of the '<em><b>NOTREADONLYIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NOTREADONLYIF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NOTREADONLYIF</em>' attribute.
     * @see #setNOTREADONLYIF(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_NOTREADONLYIF()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='NOT_READONLY_IF' namespace='##targetNamespace'"
     * @generated
     */
    String getNOTREADONLYIF();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getNOTREADONLYIF <em>NOTREADONLYIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NOTREADONLYIF</em>' attribute.
     * @see #getNOTREADONLYIF()
     * @generated
     */
    void setNOTREADONLYIF(String value);

    /**
     * Returns the value of the '<em><b>NOTSHOWIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NOTSHOWIF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NOTSHOWIF</em>' attribute.
     * @see #setNOTSHOWIF(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_NOTSHOWIF()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='NOT_SHOW_IF' namespace='##targetNamespace'"
     * @generated
     */
    String getNOTSHOWIF();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getNOTSHOWIF <em>NOTSHOWIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NOTSHOWIF</em>' attribute.
     * @see #getNOTSHOWIF()
     * @generated
     */
    void setNOTSHOWIF(String value);

    /**
     * Returns the value of the '<em><b>READONLY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>READONLY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>READONLY</em>' attribute.
     * @see #isSetREADONLY()
     * @see #unsetREADONLY()
     * @see #setREADONLY(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_READONLY()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='READONLY' namespace='##targetNamespace'"
     * @generated
     */
    boolean isREADONLY();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isREADONLY <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>READONLY</em>' attribute.
     * @see #isSetREADONLY()
     * @see #unsetREADONLY()
     * @see #isREADONLY()
     * @generated
     */
    void setREADONLY(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isREADONLY <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREADONLY()
     * @see #isREADONLY()
     * @see #setREADONLY(boolean)
     * @generated
     */
    void unsetREADONLY();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isREADONLY <em>READONLY</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>READONLY</em>' attribute is set.
     * @see #unsetREADONLY()
     * @see #isREADONLY()
     * @see #setREADONLY(boolean)
     * @generated
     */
    boolean isSetREADONLY();

    /**
     * Returns the value of the '<em><b>READONLYIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>READONLYIF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>READONLYIF</em>' attribute.
     * @see #setREADONLYIF(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_READONLYIF()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='READONLY_IF' namespace='##targetNamespace'"
     * @generated
     */
    String getREADONLYIF();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getREADONLYIF <em>READONLYIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>READONLYIF</em>' attribute.
     * @see #getREADONLYIF()
     * @generated
     */
    void setREADONLYIF(String value);

    /**
     * Returns the value of the '<em><b>REPOSITORYITEM</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REPOSITORYITEM</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REPOSITORYITEM</em>' attribute.
     * @see #setREPOSITORYITEM(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_REPOSITORYITEM()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='REPOSITORY_ITEM' namespace='##targetNamespace'"
     * @generated
     */
    String getREPOSITORYITEM();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getREPOSITORYITEM <em>REPOSITORYITEM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REPOSITORYITEM</em>' attribute.
     * @see #getREPOSITORYITEM()
     * @generated
     */
    void setREPOSITORYITEM(String value);

    /**
     * Returns the value of the '<em><b>SHOWIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SHOWIF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SHOWIF</em>' attribute.
     * @see #setSHOWIF(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_SHOWIF()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='SHOW_IF' namespace='##targetNamespace'"
     * @generated
     */
    String getSHOWIF();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getSHOWIF <em>SHOWIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SHOWIF</em>' attribute.
     * @see #getSHOWIF()
     * @generated
     */
    void setSHOWIF(String value);

    /**
     * Returns the value of the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VALUE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VALUE</em>' attribute.
     * @see #setVALUE(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_VALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='VALUE' namespace='##targetNamespace'"
     * @generated
     */
    String getVALUE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#getVALUE <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUE</em>' attribute.
     * @see #getVALUE()
     * @generated
     */
    void setVALUE(String value);

    /**
     * Returns the value of the '<em><b>RAW</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RAW</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RAW</em>' attribute.
     * @see #isSetRAW()
     * @see #unsetRAW()
     * @see #setRAW(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMType_RAW()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='RAW' namespace='##targetNamespace'"
     * @generated
     */
    boolean isRAW();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isRAW <em>RAW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RAW</em>' attribute.
     * @see #isSetRAW()
     * @see #unsetRAW()
     * @see #isRAW()
     * @generated
     */
    void setRAW(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isRAW <em>RAW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRAW()
     * @see #isRAW()
     * @see #setRAW(boolean)
     * @generated
     */
    void unsetRAW();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMType#isRAW <em>RAW</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RAW</em>' attribute is set.
     * @see #unsetRAW()
     * @see #isRAW()
     * @see #setRAW(boolean)
     * @generated
     */
    boolean isSetRAW();

} // ITEMType
