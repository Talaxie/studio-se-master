/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITEMS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#getITEM <em>ITEM</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONINPUTSCHEMAS <em>BASEDONINPUTSCHEMAS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONSCHEMA <em>BASEDONSCHEMA</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONSUBJOBSTARTS <em>BASEDONSUBJOBSTARTS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isCOLUMNSBASEDONSCHEMA <em>COLUMNSBASEDONSCHEMA</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#getDEFAULT <em>DEFAULT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMSType()
 * @model extendedMetaData="name='ITEMS_._type' kind='elementOnly'"
 * @generated
 */
public interface ITEMSType extends EObject {
    /**
     * Returns the value of the '<em><b>ITEM</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.ITEMType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 							On TABLE mode: - FIELD can be either TEXT,
     * 							CHECK, CLOSED_LIST, COLUMN_LIST or
     * 							PREV_COLUMN_LIST - VALUE is used for TEXT,
     * 							CHECK
     * 
     * 							On CLOSED_LIST mode: - FIELD is not used -
     * 							READONLY is not used
     * 						
     * <!-- end-model-doc -->
     * @return the value of the '<em>ITEM</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMSType_ITEM()
     * @model type="org.talend.designer.core.model.utils.emf.component.ITEMType" containment="true"
     *        extendedMetaData="kind='element' name='ITEM' namespace='##targetNamespace'"
     * @generated
     */
    EList getITEM();

    /**
     * Returns the value of the '<em><b>BASEDONINPUTSCHEMAS</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BASEDONINPUTSCHEMAS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BASEDONINPUTSCHEMAS</em>' attribute.
     * @see #isSetBASEDONINPUTSCHEMAS()
     * @see #unsetBASEDONINPUTSCHEMAS()
     * @see #setBASEDONINPUTSCHEMAS(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMSType_BASEDONINPUTSCHEMAS()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='BASED_ON_INPUT_SCHEMAS' namespace='##targetNamespace'"
     * @generated
     */
    boolean isBASEDONINPUTSCHEMAS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONINPUTSCHEMAS <em>BASEDONINPUTSCHEMAS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BASEDONINPUTSCHEMAS</em>' attribute.
     * @see #isSetBASEDONINPUTSCHEMAS()
     * @see #unsetBASEDONINPUTSCHEMAS()
     * @see #isBASEDONINPUTSCHEMAS()
     * @generated
     */
    void setBASEDONINPUTSCHEMAS(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONINPUTSCHEMAS <em>BASEDONINPUTSCHEMAS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBASEDONINPUTSCHEMAS()
     * @see #isBASEDONINPUTSCHEMAS()
     * @see #setBASEDONINPUTSCHEMAS(boolean)
     * @generated
     */
    void unsetBASEDONINPUTSCHEMAS();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONINPUTSCHEMAS <em>BASEDONINPUTSCHEMAS</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>BASEDONINPUTSCHEMAS</em>' attribute is set.
     * @see #unsetBASEDONINPUTSCHEMAS()
     * @see #isBASEDONINPUTSCHEMAS()
     * @see #setBASEDONINPUTSCHEMAS(boolean)
     * @generated
     */
    boolean isSetBASEDONINPUTSCHEMAS();

    /**
     * Returns the value of the '<em><b>BASEDONSCHEMA</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BASEDONSCHEMA</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BASEDONSCHEMA</em>' attribute.
     * @see #isSetBASEDONSCHEMA()
     * @see #unsetBASEDONSCHEMA()
     * @see #setBASEDONSCHEMA(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMSType_BASEDONSCHEMA()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='BASED_ON_SCHEMA' namespace='##targetNamespace'"
     * @generated
     */
    boolean isBASEDONSCHEMA();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONSCHEMA <em>BASEDONSCHEMA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BASEDONSCHEMA</em>' attribute.
     * @see #isSetBASEDONSCHEMA()
     * @see #unsetBASEDONSCHEMA()
     * @see #isBASEDONSCHEMA()
     * @generated
     */
    void setBASEDONSCHEMA(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONSCHEMA <em>BASEDONSCHEMA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBASEDONSCHEMA()
     * @see #isBASEDONSCHEMA()
     * @see #setBASEDONSCHEMA(boolean)
     * @generated
     */
    void unsetBASEDONSCHEMA();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONSCHEMA <em>BASEDONSCHEMA</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>BASEDONSCHEMA</em>' attribute is set.
     * @see #unsetBASEDONSCHEMA()
     * @see #isBASEDONSCHEMA()
     * @see #setBASEDONSCHEMA(boolean)
     * @generated
     */
    boolean isSetBASEDONSCHEMA();

    /**
     * Returns the value of the '<em><b>BASEDONSUBJOBSTARTS</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BASEDONSUBJOBSTARTS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BASEDONSUBJOBSTARTS</em>' attribute.
     * @see #isSetBASEDONSUBJOBSTARTS()
     * @see #unsetBASEDONSUBJOBSTARTS()
     * @see #setBASEDONSUBJOBSTARTS(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMSType_BASEDONSUBJOBSTARTS()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='BASED_ON_SUBJOB_STARTS' namespace='##targetNamespace'"
     * @generated
     */
    boolean isBASEDONSUBJOBSTARTS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONSUBJOBSTARTS <em>BASEDONSUBJOBSTARTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BASEDONSUBJOBSTARTS</em>' attribute.
     * @see #isSetBASEDONSUBJOBSTARTS()
     * @see #unsetBASEDONSUBJOBSTARTS()
     * @see #isBASEDONSUBJOBSTARTS()
     * @generated
     */
    void setBASEDONSUBJOBSTARTS(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONSUBJOBSTARTS <em>BASEDONSUBJOBSTARTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBASEDONSUBJOBSTARTS()
     * @see #isBASEDONSUBJOBSTARTS()
     * @see #setBASEDONSUBJOBSTARTS(boolean)
     * @generated
     */
    void unsetBASEDONSUBJOBSTARTS();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isBASEDONSUBJOBSTARTS <em>BASEDONSUBJOBSTARTS</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>BASEDONSUBJOBSTARTS</em>' attribute is set.
     * @see #unsetBASEDONSUBJOBSTARTS()
     * @see #isBASEDONSUBJOBSTARTS()
     * @see #setBASEDONSUBJOBSTARTS(boolean)
     * @generated
     */
    boolean isSetBASEDONSUBJOBSTARTS();

    /**
     * Returns the value of the '<em><b>COLUMNSBASEDONSCHEMA</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COLUMNSBASEDONSCHEMA</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COLUMNSBASEDONSCHEMA</em>' attribute.
     * @see #isSetCOLUMNSBASEDONSCHEMA()
     * @see #unsetCOLUMNSBASEDONSCHEMA()
     * @see #setCOLUMNSBASEDONSCHEMA(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMSType_COLUMNSBASEDONSCHEMA()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='COLUMNS_BASED_ON_SCHEMA' namespace='##targetNamespace'"
     * @generated
     */
    boolean isCOLUMNSBASEDONSCHEMA();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isCOLUMNSBASEDONSCHEMA <em>COLUMNSBASEDONSCHEMA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COLUMNSBASEDONSCHEMA</em>' attribute.
     * @see #isSetCOLUMNSBASEDONSCHEMA()
     * @see #unsetCOLUMNSBASEDONSCHEMA()
     * @see #isCOLUMNSBASEDONSCHEMA()
     * @generated
     */
    void setCOLUMNSBASEDONSCHEMA(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isCOLUMNSBASEDONSCHEMA <em>COLUMNSBASEDONSCHEMA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCOLUMNSBASEDONSCHEMA()
     * @see #isCOLUMNSBASEDONSCHEMA()
     * @see #setCOLUMNSBASEDONSCHEMA(boolean)
     * @generated
     */
    void unsetCOLUMNSBASEDONSCHEMA();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#isCOLUMNSBASEDONSCHEMA <em>COLUMNSBASEDONSCHEMA</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>COLUMNSBASEDONSCHEMA</em>' attribute is set.
     * @see #unsetCOLUMNSBASEDONSCHEMA()
     * @see #isCOLUMNSBASEDONSCHEMA()
     * @see #setCOLUMNSBASEDONSCHEMA(boolean)
     * @generated
     */
    boolean isSetCOLUMNSBASEDONSCHEMA();

    /**
     * Returns the value of the '<em><b>DEFAULT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DEFAULT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DEFAULT</em>' attribute.
     * @see #setDEFAULT(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getITEMSType_DEFAULT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='DEFAULT' namespace='##targetNamespace'"
     * @generated
     */
    String getDEFAULT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.ITEMSType#getDEFAULT <em>DEFAULT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DEFAULT</em>' attribute.
     * @see #getDEFAULT()
     * @generated
     */
    void setDEFAULT(String value);

} // ITEMSType
