/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FORMAT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.FORMATType#getCONNECTION <em>CONNECTION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.FORMATType#getHINT <em>HINT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.FORMATType#getLABEL <em>LABEL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getFORMATType()
 * @model extendedMetaData="name='FORMAT_._type' kind='empty'"
 * @generated
 */
public interface FORMATType extends EObject {
    /**
     * Returns the value of the '<em><b>CONNECTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTION</em>' attribute.
     * @see #setCONNECTION(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getFORMATType_CONNECTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='CONNECTION' namespace='##targetNamespace'"
     * @generated
     */
    String getCONNECTION();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.FORMATType#getCONNECTION <em>CONNECTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONNECTION</em>' attribute.
     * @see #getCONNECTION()
     * @generated
     */
    void setCONNECTION(String value);

    /**
     * Returns the value of the '<em><b>HINT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>HINT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>HINT</em>' attribute.
     * @see #setHINT(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getFORMATType_HINT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='HINT' namespace='##targetNamespace'"
     * @generated
     */
    String getHINT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.FORMATType#getHINT <em>HINT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>HINT</em>' attribute.
     * @see #getHINT()
     * @generated
     */
    void setHINT(String value);

    /**
     * Returns the value of the '<em><b>LABEL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LABEL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LABEL</em>' attribute.
     * @see #setLABEL(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getFORMATType_LABEL()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='LABEL' namespace='##targetNamespace'"
     * @generated
     */
    String getLABEL();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.FORMATType#getLABEL <em>LABEL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LABEL</em>' attribute.
     * @see #getLABEL()
     * @generated
     */
    void setLABEL(String value);

} // FORMATType
