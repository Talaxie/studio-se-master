/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RETURNS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.RETURNSType#getRETURN <em>RETURN</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getRETURNSType()
 * @model extendedMetaData="name='RETURNS_._type' kind='elementOnly'"
 * @generated
 */
public interface RETURNSType extends EObject {
    /**
     * Returns the value of the '<em><b>RETURN</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.RETURNType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RETURN</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RETURN</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getRETURNSType_RETURN()
     * @model type="org.talend.designer.core.model.utils.emf.component.RETURNType" containment="true"
     *        extendedMetaData="kind='element' name='RETURN' namespace='##targetNamespace'"
     * @generated
     */
    EList getRETURN();

} // RETURNSType
