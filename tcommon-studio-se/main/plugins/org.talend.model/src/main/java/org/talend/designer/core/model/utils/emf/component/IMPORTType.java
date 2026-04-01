/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMPORT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getINSTALL <em>INSTALL</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getURL <em>URL</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getBundleID <em>Bundle ID</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getMESSAGE <em>MESSAGE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getMODULE <em>MODULE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getMODULEGROUP <em>MODULEGROUP</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isMRREQUIRED <em>MRREQUIRED</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getNAME <em>NAME</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isREQUIRED <em>REQUIRED</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getREQUIREDIF <em>REQUIREDIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isSHOW <em>SHOW</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getUrlPath <em>Url Path</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getMVN <em>MVN</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType()
 * @model extendedMetaData="name='IMPORT_._type' kind='elementOnly'"
 * @generated
 */
public interface IMPORTType extends EObject {
    /**
     * Returns the value of the '<em><b>INSTALL</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.INSTALLType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INSTALL</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>INSTALL</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_INSTALL()
     * @model type="org.talend.designer.core.model.utils.emf.component.INSTALLType" containment="true"
     *        extendedMetaData="kind='element' name='INSTALL' namespace='##targetNamespace'"
     * @generated
     */
    EList getINSTALL();

    /**
     * Returns the value of the '<em><b>URL</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>URL</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>URL</em>' attribute list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_URL()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='URL' namespace='##targetNamespace'"
     * @generated
     */
    EList getURL();

    /**
     * Returns the value of the '<em><b>Bundle ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bundle ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bundle ID</em>' attribute.
     * @see #setBundleID(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_BundleID()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='BundleID' namespace='##targetNamespace'"
     * @generated
     */
    String getBundleID();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getBundleID <em>Bundle ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bundle ID</em>' attribute.
     * @see #getBundleID()
     * @generated
     */
    void setBundleID(String value);

    /**
     * Returns the value of the '<em><b>MESSAGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MESSAGE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MESSAGE</em>' attribute.
     * @see #setMESSAGE(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_MESSAGE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='MESSAGE' namespace='##targetNamespace'"
     * @generated
     */
    String getMESSAGE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getMESSAGE <em>MESSAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MESSAGE</em>' attribute.
     * @see #getMESSAGE()
     * @generated
     */
    void setMESSAGE(String value);

    /**
     * Returns the value of the '<em><b>MODULE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MODULE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MODULE</em>' attribute.
     * @see #setMODULE(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_MODULE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='MODULE' namespace='##targetNamespace'"
     * @generated
     */
    String getMODULE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getMODULE <em>MODULE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MODULE</em>' attribute.
     * @see #getMODULE()
     * @generated
     */
    void setMODULE(String value);

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getNAME();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(String value);

    /**
     * Returns the value of the '<em><b>REQUIRED</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REQUIRED</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REQUIRED</em>' attribute.
     * @see #isSetREQUIRED()
     * @see #unsetREQUIRED()
     * @see #setREQUIRED(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_REQUIRED()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='REQUIRED' namespace='##targetNamespace'"
     * @generated
     */
    boolean isREQUIRED();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isREQUIRED <em>REQUIRED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REQUIRED</em>' attribute.
     * @see #isSetREQUIRED()
     * @see #unsetREQUIRED()
     * @see #isREQUIRED()
     * @generated
     */
    void setREQUIRED(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isREQUIRED <em>REQUIRED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREQUIRED()
     * @see #isREQUIRED()
     * @see #setREQUIRED(boolean)
     * @generated
     */
    void unsetREQUIRED();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isREQUIRED <em>REQUIRED</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>REQUIRED</em>' attribute is set.
     * @see #unsetREQUIRED()
     * @see #isREQUIRED()
     * @see #setREQUIRED(boolean)
     * @generated
     */
    boolean isSetREQUIRED();

    /**
     * Returns the value of the '<em><b>SHOW</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SHOW</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SHOW</em>' attribute.
     * @see #isSetSHOW()
     * @see #unsetSHOW()
     * @see #setSHOW(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_SHOW()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='SHOW' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSHOW();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isSHOW <em>SHOW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SHOW</em>' attribute.
     * @see #isSetSHOW()
     * @see #unsetSHOW()
     * @see #isSHOW()
     * @generated
     */
    void setSHOW(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isSHOW <em>SHOW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSHOW()
     * @see #isSHOW()
     * @see #setSHOW(boolean)
     * @generated
     */
    void unsetSHOW();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isSHOW <em>SHOW</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SHOW</em>' attribute is set.
     * @see #unsetSHOW()
     * @see #isSHOW()
     * @see #setSHOW(boolean)
     * @generated
     */
    boolean isSetSHOW();

    /**
     * Returns the value of the '<em><b>Url Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Url Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Url Path</em>' attribute.
     * @see #setUrlPath(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_UrlPath()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='UrlPath' namespace='##targetNamespace'"
     * @generated
     */
    String getUrlPath();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getUrlPath <em>Url Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url Path</em>' attribute.
     * @see #getUrlPath()
     * @generated
     */
    void setUrlPath(String value);

    /**
     * Returns the value of the '<em><b>MVN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MVN</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MVN</em>' attribute.
     * @see #setMVN(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_MVN()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getMVN();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getMVN <em>MVN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MVN</em>' attribute.
     * @see #getMVN()
     * @generated
     */
    void setMVN(String value);

    /**
     * Returns the value of the '<em><b>REQUIREDIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REQUIREDIF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REQUIREDIF</em>' attribute.
     * @see #setREQUIREDIF(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_REQUIREDIF()
     * @model extendedMetaData="kind='attribute' name='REQUIRED_IF' namespace='##targetNamespace'"
     * @generated
     */
    String getREQUIREDIF();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getREQUIREDIF <em>REQUIREDIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REQUIREDIF</em>' attribute.
     * @see #getREQUIREDIF()
     * @generated
     */
    void setREQUIREDIF(String value);

    /**
     * Returns the value of the '<em><b>MRREQUIRED</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MRREQUIRED</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MRREQUIRED</em>' attribute.
     * @see #isSetMRREQUIRED()
     * @see #unsetMRREQUIRED()
     * @see #setMRREQUIRED(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_MRREQUIRED()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='MRREQUIRED' namespace='##targetNamespace'"
     * @generated
     */
    boolean isMRREQUIRED();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isMRREQUIRED <em>MRREQUIRED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MRREQUIRED</em>' attribute.
     * @see #isSetMRREQUIRED()
     * @see #unsetMRREQUIRED()
     * @see #isMRREQUIRED()
     * @generated
     */
    void setMRREQUIRED(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isMRREQUIRED <em>MRREQUIRED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMRREQUIRED()
     * @see #isMRREQUIRED()
     * @see #setMRREQUIRED(boolean)
     * @generated
     */
    void unsetMRREQUIRED();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#isMRREQUIRED <em>MRREQUIRED</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MRREQUIRED</em>' attribute is set.
     * @see #unsetMRREQUIRED()
     * @see #isMRREQUIRED()
     * @see #setMRREQUIRED(boolean)
     * @generated
     */
    boolean isSetMRREQUIRED();

    /**
     * Returns the value of the '<em><b>MODULEGROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MODULEGROUP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MODULEGROUP</em>' attribute.
     * @see #setMODULEGROUP(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTType_MODULEGROUP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='MODULE_GROUP' namespace='##targetNamespace'"
     * @generated
     */
    String getMODULEGROUP();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTType#getMODULEGROUP <em>MODULEGROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MODULEGROUP</em>' attribute.
     * @see #getMODULEGROUP()
     * @generated
     */
    void setMODULEGROUP(String value);

} // IMPORTType
