/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEFAULT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType#getValue <em>Value</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType#getIF <em>IF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType#getNOTIF <em>NOTIF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDEFAULTType()
 * @model extendedMetaData="name='DEFAULT_._type' kind='simple'"
 * @generated
 */
public interface DEFAULTType extends EObject {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDEFAULTType_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="name=':0' kind='simple'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>IF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IF</em>' attribute.
     * @see #setIF(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDEFAULTType_IF()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='IF' namespace='##targetNamespace'"
     * @generated
     */
    String getIF();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType#getIF <em>IF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IF</em>' attribute.
     * @see #getIF()
     * @generated
     */
    void setIF(String value);

    /**
     * Returns the value of the '<em><b>NOTIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NOTIF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NOTIF</em>' attribute.
     * @see #setNOTIF(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDEFAULTType_NOTIF()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='NOT_IF' namespace='##targetNamespace'"
     * @generated
     */
    String getNOTIF();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DEFAULTType#getNOTIF <em>NOTIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NOTIF</em>' attribute.
     * @see #getNOTIF()
     * @generated
     */
    void setNOTIF(String value);

} // DEFAULTType
