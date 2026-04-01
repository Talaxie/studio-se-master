/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADVANCEDPARAMETERS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.ADVANCEDPARAMETERSType#getPARAMETER <em>PARAMETER</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getADVANCEDPARAMETERSType()
 * @model extendedMetaData="name='ADVANCED_PARAMETERS_._type' kind='elementOnly'"
 * @generated
 */
public interface ADVANCEDPARAMETERSType extends EObject {
    /**
     * Returns the value of the '<em><b>PARAMETER</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.PARAMETERType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARAMETER</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARAMETER</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getADVANCEDPARAMETERSType_PARAMETER()
     * @model type="org.talend.designer.core.model.utils.emf.component.PARAMETERType" containment="true"
     *        extendedMetaData="kind='element' name='PARAMETER' namespace='##targetNamespace'"
     * @generated
     */
    EList getPARAMETER();

} // ADVANCEDPARAMETERSType
