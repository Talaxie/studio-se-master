/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.FileTrigger#getFileTriggerMasks <em>File Trigger Masks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getFileTrigger()
 * @model
 * @generated
 */
public interface FileTrigger extends SimpleTalendTrigger {
    /**
     * Returns the value of the '<em><b>File Trigger Masks</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.FileTriggerMask}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Trigger Masks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Trigger Masks</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getFileTrigger_FileTriggerMasks()
     * @model type="org.talend.core.model.properties.FileTriggerMask" containment="true" ordered="false"
     * @generated
     */
    EList getFileTriggerMasks();

} // FileTrigger
