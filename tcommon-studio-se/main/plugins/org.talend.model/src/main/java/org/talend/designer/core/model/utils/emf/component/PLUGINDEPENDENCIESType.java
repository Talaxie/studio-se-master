/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLUGINDEPENDENCIES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCIESType#getPLUGINDEPENDENCY <em>PLUGINDEPENDENCY</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getPLUGINDEPENDENCIESType()
 * @model extendedMetaData="name='PLUGINDEPENDENCIES_._type' kind='elementOnly'"
 * @generated
 */
public interface PLUGINDEPENDENCIESType extends EObject {
    /**
     * Returns the value of the '<em><b>PLUGINDEPENDENCY</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PLUGINDEPENDENCY</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PLUGINDEPENDENCY</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getPLUGINDEPENDENCIESType_PLUGINDEPENDENCY()
     * @model type="org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCYType" containment="true"
     *        extendedMetaData="kind='element' name='PLUGINDEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    EList getPLUGINDEPENDENCY();

} // PLUGINDEPENDENCIESType
