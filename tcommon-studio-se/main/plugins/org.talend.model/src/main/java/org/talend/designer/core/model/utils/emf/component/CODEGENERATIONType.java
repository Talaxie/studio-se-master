/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CODEGENERATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType#getTEMPLATES <em>TEMPLATES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType#getIMPORTS <em>IMPORTS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCODEGENERATIONType()
 * @model extendedMetaData="name='CODEGENERATION_._type' kind='elementOnly'"
 * @generated
 */
public interface CODEGENERATIONType extends EObject {
    /**
     * Returns the value of the '<em><b>TEMPLATES</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.TEMPLATESType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Used only for virtual components
     * <!-- end-model-doc -->
     * @return the value of the '<em>TEMPLATES</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCODEGENERATIONType_TEMPLATES()
     * @model type="org.talend.designer.core.model.utils.emf.component.TEMPLATESType" containment="true"
     *        extendedMetaData="kind='element' name='TEMPLATES' namespace='##targetNamespace'"
     * @generated
     */
    EList getTEMPLATES();

    /**
     * Returns the value of the '<em><b>IMPORTS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IMPORTS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IMPORTS</em>' containment reference.
     * @see #setIMPORTS(IMPORTSType)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCODEGENERATIONType_IMPORTS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='IMPORTS' namespace='##targetNamespace'"
     * @generated
     */
    IMPORTSType getIMPORTS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType#getIMPORTS <em>IMPORTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IMPORTS</em>' containment reference.
     * @see #getIMPORTS()
     * @generated
     */
    void setIMPORTS(IMPORTSType value);

} // CODEGENERATIONType
