/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Process Item</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.talend.core.model.properties.ProcessItem#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.talend.core.model.properties.PropertiesPackage#getProcessItem()
 * @model
 * @generated
 */
public interface ProcessItem extends Item {

    /**
     * Returns the value of the '<em><b>Process</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' reference.
     * @see #setProcess(ProcessType)
     * @see org.talend.core.model.properties.PropertiesPackage#getProcessItem_Process()
     * @model
     * @generated
     */
    ProcessType getProcess();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ProcessItem#getProcess <em>Process</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' reference.
     * @see #getProcess()
     * @generated
     */
    void setProcess(ProcessType value);

} // ProcessItem
