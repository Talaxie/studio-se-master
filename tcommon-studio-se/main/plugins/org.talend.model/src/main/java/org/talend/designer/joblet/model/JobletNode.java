/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.joblet.model;

import org.talend.designer.core.model.utils.emf.talendfile.NodeType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.joblet.model.JobletNode#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.designer.joblet.model.JobletNode#isInput <em>Input</em>}</li>
 *   <li>{@link org.talend.designer.joblet.model.JobletNode#isTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.joblet.model.JobletPackage#getJobletNode()
 * @model
 * @generated
 */
public interface JobletNode extends NodeType {

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.talend.designer.joblet.model.JobletPackage#getJobletNode_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.talend.designer.joblet.model.JobletNode#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' attribute.
     * @see #setInput(boolean)
     * @see org.talend.designer.joblet.model.JobletPackage#getJobletNode_Input()
     * @model
     * @generated
     */
    boolean isInput();

    /**
     * Sets the value of the '{@link org.talend.designer.joblet.model.JobletNode#isInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #isInput()
     * @generated
     */
    void setInput(boolean value);

    /**
     * Returns the value of the '<em><b>Trigger</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger</em>' attribute.
     * @see #setTrigger(boolean)
     * @see org.talend.designer.joblet.model.JobletPackage#getJobletNode_Trigger()
     * @model
     * @generated
     */
    boolean isTrigger();

    /**
     * Sets the value of the '{@link org.talend.designer.joblet.model.JobletNode#isTrigger <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger</em>' attribute.
     * @see #isTrigger()
     * @generated
     */
    void setTrigger(boolean value);
} // JobletNode
