/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FAMILIES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.FAMILIESType#getFAMILY <em>FAMILY</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getFAMILIESType()
 * @model extendedMetaData="name='FAMILIES_._type' kind='elementOnly'"
 * @generated
 */
public interface FAMILIESType extends EObject {
    /**
     * Returns the value of the '<em><b>FAMILY</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FAMILY</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FAMILY</em>' attribute list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getFAMILIESType_FAMILY()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='FAMILY' namespace='##targetNamespace'"
     * @generated
     */
    EList getFAMILY();

} // FAMILIESType
