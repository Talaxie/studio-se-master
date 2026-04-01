/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONNECTORS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CONNECTORSType#getCONNECTOR <em>CONNECTOR</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORSType()
 * @model extendedMetaData="name='CONNECTORS_._type' kind='elementOnly'"
 * @generated
 */
public interface CONNECTORSType extends EObject {
    /**
     * Returns the value of the '<em><b>CONNECTOR</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.CONNECTORType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * BUILTIN can only be used when CTYPE = 'FLOW'
     * <!-- end-model-doc -->
     * @return the value of the '<em>CONNECTOR</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCONNECTORSType_CONNECTOR()
     * @model type="org.talend.designer.core.model.utils.emf.component.CONNECTORType" containment="true" required="true"
     *        extendedMetaData="kind='element' name='CONNECTOR' namespace='##targetNamespace'"
     * @generated
     */
    EList getCONNECTOR();

} // CONNECTORSType
