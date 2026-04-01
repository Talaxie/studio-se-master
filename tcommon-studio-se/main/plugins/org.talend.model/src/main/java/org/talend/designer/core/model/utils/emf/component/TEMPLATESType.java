/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEMPLATES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getTEMPLATE <em>TEMPLATE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getTEMPLATEPARAM <em>TEMPLATEPARAM</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getCONNECTOR <em>CONNECTOR</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getINPUT <em>INPUT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#isLOOKUP <em>LOOKUP</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getOUTPUT <em>OUTPUT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getTEMPLATESType()
 * @model extendedMetaData="name='TEMPLATES_._type' kind='elementOnly'"
 * @generated
 */
public interface TEMPLATESType extends EObject {
    /**
     * Returns the value of the '<em><b>TEMPLATE</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.TEMPLATEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TEMPLATE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TEMPLATE</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getTEMPLATESType_TEMPLATE()
     * @model type="org.talend.designer.core.model.utils.emf.component.TEMPLATEType" containment="true"
     *        extendedMetaData="kind='element' name='TEMPLATE' namespace='##targetNamespace'"
     * @generated
     */
    EList getTEMPLATE();

    /**
     * Returns the value of the '<em><b>TEMPLATEPARAM</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TEMPLATEPARAM</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TEMPLATEPARAM</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getTEMPLATESType_TEMPLATEPARAM()
     * @model type="org.talend.designer.core.model.utils.emf.component.TEMPLATEPARAMType" containment="true"
     *        extendedMetaData="kind='element' name='TEMPLATE_PARAM' namespace='##targetNamespace'"
     * @generated
     */
    EList getTEMPLATEPARAM();

    /**
     * Returns the value of the '<em><b>CONNECTOR</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTOR</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTOR</em>' attribute.
     * @see #setCONNECTOR(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getTEMPLATESType_CONNECTOR()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='CONNECTOR' namespace='##targetNamespace'"
     * @generated
     */
    String getCONNECTOR();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getCONNECTOR <em>CONNECTOR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONNECTOR</em>' attribute.
     * @see #getCONNECTOR()
     * @generated
     */
    void setCONNECTOR(String value);

    /**
     * Returns the value of the '<em><b>INPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INPUT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>INPUT</em>' attribute.
     * @see #setINPUT(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getTEMPLATESType_INPUT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='INPUT' namespace='##targetNamespace'"
     * @generated
     */
    String getINPUT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getINPUT <em>INPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>INPUT</em>' attribute.
     * @see #getINPUT()
     * @generated
     */
    void setINPUT(String value);

    /**
     * Returns the value of the '<em><b>LOOKUP</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LOOKUP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LOOKUP</em>' attribute.
     * @see #isSetLOOKUP()
     * @see #unsetLOOKUP()
     * @see #setLOOKUP(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getTEMPLATESType_LOOKUP()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='LOOKUP' namespace='##targetNamespace'"
     * @generated
     */
    boolean isLOOKUP();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#isLOOKUP <em>LOOKUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LOOKUP</em>' attribute.
     * @see #isSetLOOKUP()
     * @see #unsetLOOKUP()
     * @see #isLOOKUP()
     * @generated
     */
    void setLOOKUP(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#isLOOKUP <em>LOOKUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLOOKUP()
     * @see #isLOOKUP()
     * @see #setLOOKUP(boolean)
     * @generated
     */
    void unsetLOOKUP();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#isLOOKUP <em>LOOKUP</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LOOKUP</em>' attribute is set.
     * @see #unsetLOOKUP()
     * @see #isLOOKUP()
     * @see #setLOOKUP(boolean)
     * @generated
     */
    boolean isSetLOOKUP();

    /**
     * Returns the value of the '<em><b>OUTPUT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OUTPUT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OUTPUT</em>' attribute.
     * @see #setOUTPUT(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getTEMPLATESType_OUTPUT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='OUTPUT' namespace='##targetNamespace'"
     * @generated
     */
    String getOUTPUT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType#getOUTPUT <em>OUTPUT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OUTPUT</em>' attribute.
     * @see #getOUTPUT()
     * @generated
     */
    void setOUTPUT(String value);

} // TEMPLATESType
