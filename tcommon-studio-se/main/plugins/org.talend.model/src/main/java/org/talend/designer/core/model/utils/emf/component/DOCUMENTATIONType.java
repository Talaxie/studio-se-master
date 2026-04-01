/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOCUMENTATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.DOCUMENTATIONType#getURL <em>URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDOCUMENTATIONType()
 * @model extendedMetaData="name='DOCUMENTATION_._type' kind='elementOnly'"
 * @generated
 */
public interface DOCUMENTATIONType extends EObject {
    /**
     * Returns the value of the '<em><b>URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>URL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>URL</em>' attribute.
     * @see #setURL(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getDOCUMENTATIONType_URL()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='URL' namespace='##targetNamespace'"
     * @generated
     */
    String getURL();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.DOCUMENTATIONType#getURL <em>URL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>URL</em>' attribute.
     * @see #getURL()
     * @generated
     */
    void setURL(String value);

} // DOCUMENTATIONType
