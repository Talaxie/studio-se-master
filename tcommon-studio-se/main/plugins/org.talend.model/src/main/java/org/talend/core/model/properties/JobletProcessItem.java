/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.talend.designer.joblet.model.JobletProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joblet Process Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.JobletProcessItem#getJobletProcess <em>Joblet Process</em>}</li>
 *   <li>{@link org.talend.core.model.properties.JobletProcessItem#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getJobletProcessItem()
 * @model
 * @generated
 */
public interface JobletProcessItem extends Item {
    /**
     * Returns the value of the '<em><b>Joblet Process</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Joblet Process</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Joblet Process</em>' reference.
     * @see #setJobletProcess(JobletProcess)
     * @see org.talend.core.model.properties.PropertiesPackage#getJobletProcessItem_JobletProcess()
     * @model
     * @generated
     */
    JobletProcess getJobletProcess();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.JobletProcessItem#getJobletProcess <em>Joblet Process</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Joblet Process</em>' reference.
     * @see #getJobletProcess()
     * @generated
     */
    void setJobletProcess(JobletProcess value);

    /**
     * Returns the value of the '<em><b>Icon</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Icon</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Icon</em>' reference.
     * @see #setIcon(ByteArray)
     * @see org.talend.core.model.properties.PropertiesPackage#getJobletProcessItem_Icon()
     * @model
     * @generated
     */
    ByteArray getIcon();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.JobletProcessItem#getIcon <em>Icon</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Icon</em>' reference.
     * @see #getIcon()
     * @generated
     */
    void setIcon(ByteArray value);

} // JobletProcessItem
