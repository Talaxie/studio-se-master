/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COLUMN Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getCOMMENT <em>COMMENT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isCUSTOM <em>CUSTOM</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getDBTYPE <em>DBTYPE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getDEFAULT <em>DEFAULT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isKEY <em>KEY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getLENGTH <em>LENGTH</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getNAME <em>NAME</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isNULLABLE <em>NULLABLE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getPATTERN <em>PATTERN</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isREADONLY <em>READONLY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getRELATEDENTITY <em>RELATEDENTITY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getRELATIONSHIPTYPE <em>RELATIONSHIPTYPE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType()
 * @model extendedMetaData="name='COLUMN_._type' kind='empty'"
 * @generated
 */
public interface COLUMNType extends EObject {
    /**
     * Returns the value of the '<em><b>COMMENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COMMENT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COMMENT</em>' attribute.
     * @see #setCOMMENT(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_COMMENT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='COMMENT' namespace='##targetNamespace'"
     * @generated
     */
    String getCOMMENT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getCOMMENT <em>COMMENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMMENT</em>' attribute.
     * @see #getCOMMENT()
     * @generated
     */
    void setCOMMENT(String value);

    /**
     * Returns the value of the '<em><b>CUSTOM</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CUSTOM</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CUSTOM</em>' attribute.
     * @see #isSetCUSTOM()
     * @see #unsetCUSTOM()
     * @see #setCUSTOM(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_CUSTOM()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='CUSTOM' namespace='##targetNamespace'"
     * @generated
     */
    boolean isCUSTOM();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isCUSTOM <em>CUSTOM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CUSTOM</em>' attribute.
     * @see #isSetCUSTOM()
     * @see #unsetCUSTOM()
     * @see #isCUSTOM()
     * @generated
     */
    void setCUSTOM(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isCUSTOM <em>CUSTOM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCUSTOM()
     * @see #isCUSTOM()
     * @see #setCUSTOM(boolean)
     * @generated
     */
    void unsetCUSTOM();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isCUSTOM <em>CUSTOM</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CUSTOM</em>' attribute is set.
     * @see #unsetCUSTOM()
     * @see #isCUSTOM()
     * @see #setCUSTOM(boolean)
     * @generated
     */
    boolean isSetCUSTOM();

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_DEFAULT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='DEFAULT' namespace='##targetNamespace'"
     * @generated
     */
    String getDEFAULT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getDEFAULT <em>DEFAULT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DEFAULT</em>' attribute.
     * @see #getDEFAULT()
     * @generated
     */
    void setDEFAULT(String value);

    /**
     * Returns the value of the '<em><b>KEY</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>KEY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>KEY</em>' attribute.
     * @see #isSetKEY()
     * @see #unsetKEY()
     * @see #setKEY(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_KEY()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='KEY' namespace='##targetNamespace'"
     * @generated
     */
    boolean isKEY();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isKEY <em>KEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>KEY</em>' attribute.
     * @see #isSetKEY()
     * @see #unsetKEY()
     * @see #isKEY()
     * @generated
     */
    void setKEY(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isKEY <em>KEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKEY()
     * @see #isKEY()
     * @see #setKEY(boolean)
     * @generated
     */
    void unsetKEY();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isKEY <em>KEY</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>KEY</em>' attribute is set.
     * @see #unsetKEY()
     * @see #isKEY()
     * @see #setKEY(boolean)
     * @generated
     */
    boolean isSetKEY();

    /**
     * Returns the value of the '<em><b>LENGTH</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LENGTH</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LENGTH</em>' attribute.
     * @see #isSetLENGTH()
     * @see #unsetLENGTH()
     * @see #setLENGTH(int)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_LENGTH()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='LENGTH' namespace='##targetNamespace'"
     * @generated
     */
    int getLENGTH();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getLENGTH <em>LENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LENGTH</em>' attribute.
     * @see #isSetLENGTH()
     * @see #unsetLENGTH()
     * @see #getLENGTH()
     * @generated
     */
    void setLENGTH(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getLENGTH <em>LENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLENGTH()
     * @see #getLENGTH()
     * @see #setLENGTH(int)
     * @generated
     */
    void unsetLENGTH();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getLENGTH <em>LENGTH</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LENGTH</em>' attribute is set.
     * @see #unsetLENGTH()
     * @see #getLENGTH()
     * @see #setLENGTH(int)
     * @generated
     */
    boolean isSetLENGTH();

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getNAME();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(String value);

    /**
     * Returns the value of the '<em><b>NULLABLE</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NULLABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NULLABLE</em>' attribute.
     * @see #isSetNULLABLE()
     * @see #unsetNULLABLE()
     * @see #setNULLABLE(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_NULLABLE()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='NULLABLE' namespace='##targetNamespace'"
     * @generated
     */
    boolean isNULLABLE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isNULLABLE <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NULLABLE</em>' attribute.
     * @see #isSetNULLABLE()
     * @see #unsetNULLABLE()
     * @see #isNULLABLE()
     * @generated
     */
    void setNULLABLE(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isNULLABLE <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNULLABLE()
     * @see #isNULLABLE()
     * @see #setNULLABLE(boolean)
     * @generated
     */
    void unsetNULLABLE();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isNULLABLE <em>NULLABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>NULLABLE</em>' attribute is set.
     * @see #unsetNULLABLE()
     * @see #isNULLABLE()
     * @see #setNULLABLE(boolean)
     * @generated
     */
    boolean isSetNULLABLE();

    /**
     * Returns the value of the '<em><b>PATTERN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PATTERN</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PATTERN</em>' attribute.
     * @see #setPATTERN(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_PATTERN()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='PATTERN' namespace='##targetNamespace'"
     * @generated
     */
    String getPATTERN();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getPATTERN <em>PATTERN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PATTERN</em>' attribute.
     * @see #getPATTERN()
     * @generated
     */
    void setPATTERN(String value);

    /**
     * Returns the value of the '<em><b>PRECISION</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PRECISION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PRECISION</em>' attribute.
     * @see #isSetPRECISION()
     * @see #unsetPRECISION()
     * @see #setPRECISION(int)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_PRECISION()
     * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='PRECISION' namespace='##targetNamespace'"
     * @generated
     */
    int getPRECISION();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getPRECISION <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PRECISION</em>' attribute.
     * @see #isSetPRECISION()
     * @see #unsetPRECISION()
     * @see #getPRECISION()
     * @generated
     */
    void setPRECISION(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getPRECISION <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPRECISION()
     * @see #getPRECISION()
     * @see #setPRECISION(int)
     * @generated
     */
    void unsetPRECISION();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getPRECISION <em>PRECISION</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PRECISION</em>' attribute is set.
     * @see #unsetPRECISION()
     * @see #getPRECISION()
     * @see #setPRECISION(int)
     * @generated
     */
    boolean isSetPRECISION();

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_READONLY()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='READONLY' namespace='##targetNamespace'"
     * @generated
     */
    boolean isREADONLY();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isREADONLY <em>READONLY</em>}' attribute.
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
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isREADONLY <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREADONLY()
     * @see #isREADONLY()
     * @see #setREADONLY(boolean)
     * @generated
     */
    void unsetREADONLY();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isREADONLY <em>READONLY</em>}' attribute is set.
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
     * Returns the value of the '<em><b>RELATEDENTITY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RELATEDENTITY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RELATEDENTITY</em>' attribute.
     * @see #setRELATEDENTITY(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_RELATEDENTITY()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='RELATEDENTITY' namespace='##targetNamespace'"
     * @generated
     */
    String getRELATEDENTITY();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getRELATEDENTITY <em>RELATEDENTITY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RELATEDENTITY</em>' attribute.
     * @see #getRELATEDENTITY()
     * @generated
     */
    void setRELATEDENTITY(String value);

    /**
     * Returns the value of the '<em><b>RELATIONSHIPTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RELATIONSHIPTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RELATIONSHIPTYPE</em>' attribute.
     * @see #setRELATIONSHIPTYPE(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_RELATIONSHIPTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='RELATIONSHIPTYPE' namespace='##targetNamespace'"
     * @generated
     */
    String getRELATIONSHIPTYPE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getRELATIONSHIPTYPE <em>RELATIONSHIPTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RELATIONSHIPTYPE</em>' attribute.
     * @see #getRELATIONSHIPTYPE()
     * @generated
     */
    void setRELATIONSHIPTYPE(String value);

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see #setTYPE(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_TYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    String getTYPE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(String value);

    /**
     * Returns the value of the '<em><b>DBTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DBTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DBTYPE</em>' attribute.
     * @see #setDBTYPE(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_DBTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='DBTYPE' namespace='##targetNamespace'"
     * @generated
     */
    String getDBTYPE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getDBTYPE <em>DBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DBTYPE</em>' attribute.
     * @see #getDBTYPE()
     * @generated
     */
    void setDBTYPE(String value);

} // COLUMNType
