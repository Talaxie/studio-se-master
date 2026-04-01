/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQLTEMPLATES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.SQLTEMPLATESType#getSQLTEMPLATE <em>SQLTEMPLATE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.SQLTEMPLATESType#getDB <em>DB</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getSQLTEMPLATESType()
 * @model extendedMetaData="name='SQLTEMPLATES_._type' kind='elementOnly'"
 * @generated
 */
public interface SQLTEMPLATESType extends EObject {
    /**
     * Returns the value of the '<em><b>SQLTEMPLATE</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.SQLTEMPLATEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SQLTEMPLATE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SQLTEMPLATE</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getSQLTEMPLATESType_SQLTEMPLATE()
     * @model type="org.talend.designer.core.model.utils.emf.component.SQLTEMPLATEType" containment="true"
     *        extendedMetaData="kind='element' name='SQLTEMPLATE' namespace='##targetNamespace'"
     * @generated
     */
    EList getSQLTEMPLATE();

    /**
     * Returns the value of the '<em><b>DB</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DB</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DB</em>' attribute.
     * @see #setDB(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getSQLTEMPLATESType_DB()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='DB' namespace='##targetNamespace'"
     * @generated
     */
    String getDB();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.SQLTEMPLATESType#getDB <em>DB</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DB</em>' attribute.
     * @see #getDB()
     * @generated
     */
    void setDB(String value);

} // SQLTEMPLATESType
