/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLUGINDEPENDENCY Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCYType#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getPLUGINDEPENDENCYType()
 * @model extendedMetaData="name='PLUGINDEPENDENCY_._type' kind='empty'"
 * @generated
 */
public interface PLUGINDEPENDENCYType extends EObject {
    /**
     * Returns the value of the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ID</em>' attribute.
     * @see #setID(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getPLUGINDEPENDENCYType_ID()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='ID' namespace='##targetNamespace'"
     * @generated
     */
    String getID();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCYType#getID <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ID</em>' attribute.
     * @see #getID()
     * @generated
     */
    void setID(String value);

} // PLUGINDEPENDENCYType
