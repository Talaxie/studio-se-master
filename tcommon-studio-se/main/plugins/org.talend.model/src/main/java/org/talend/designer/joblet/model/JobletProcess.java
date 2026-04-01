/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.joblet.model;

import org.eclipse.emf.common.util.EList;

import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joblet Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.joblet.model.JobletProcess#getJobletNodes <em>Joblet Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.joblet.model.JobletPackage#getJobletProcess()
 * @model
 * @generated
 */
public interface JobletProcess extends ProcessType {
    /**
     * Returns the value of the '<em><b>Joblet Nodes</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.joblet.model.JobletNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Joblet Nodes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Joblet Nodes</em>' containment reference list.
     * @see org.talend.designer.joblet.model.JobletPackage#getJobletProcess_JobletNodes()
     * @model containment="true"
     * @generated
     */
    EList<JobletNode> getJobletNodes();

} // JobletProcess
