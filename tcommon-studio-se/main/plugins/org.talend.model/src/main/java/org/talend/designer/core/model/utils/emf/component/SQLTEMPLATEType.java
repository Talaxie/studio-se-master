/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQLTEMPLATE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.SQLTEMPLATEType#getCONTENT <em>CONTENT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.SQLTEMPLATEType#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getSQLTEMPLATEType()
 * @model extendedMetaData="name='SQLTEMPLATE_._type' kind='empty'"
 * @generated
 */
public interface SQLTEMPLATEType extends EObject {
    /**
     * Returns the value of the '<em><b>CONTENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONTENT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONTENT</em>' attribute.
     * @see #setCONTENT(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getSQLTEMPLATEType_CONTENT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='CONTENT' namespace='##targetNamespace'"
     * @generated
     */
    String getCONTENT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.SQLTEMPLATEType#getCONTENT <em>CONTENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONTENT</em>' attribute.
     * @see #getCONTENT()
     * @generated
     */
    void setCONTENT(String value);

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
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getSQLTEMPLATEType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getNAME();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.SQLTEMPLATEType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(String value);

} // SQLTEMPLATEType
