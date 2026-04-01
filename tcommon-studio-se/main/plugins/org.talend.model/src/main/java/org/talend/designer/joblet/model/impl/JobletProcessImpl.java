/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.joblet.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl;
import org.talend.designer.joblet.model.JobletNode;
import org.talend.designer.joblet.model.JobletPackage;
import org.talend.designer.joblet.model.JobletProcess;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Joblet Process</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.joblet.model.impl.JobletProcessImpl#getJobletNodes <em>Joblet Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobletProcessImpl extends ProcessTypeImpl implements JobletProcess {

    /**
     * The cached value of the '{@link #getJobletNodes() <em>Joblet Nodes</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getJobletNodes()
     * @generated
     * @ordered
     */
    protected EList<JobletNode> jobletNodes;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected JobletProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JobletPackage.Literals.JOBLET_PROCESS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<JobletNode> getJobletNodes() {
        if (jobletNodes == null) {
            jobletNodes = new EObjectContainmentEList<JobletNode>(JobletNode.class, this, JobletPackage.JOBLET_PROCESS__JOBLET_NODES);
        }
        return jobletNodes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JobletPackage.JOBLET_PROCESS__JOBLET_NODES:
                return ((InternalEList<?>)getJobletNodes()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JobletPackage.JOBLET_PROCESS__JOBLET_NODES:
                return getJobletNodes();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case JobletPackage.JOBLET_PROCESS__JOBLET_NODES:
                getJobletNodes().clear();
                getJobletNodes().addAll((Collection<? extends JobletNode>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case JobletPackage.JOBLET_PROCESS__JOBLET_NODES:
                getJobletNodes().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case JobletPackage.JOBLET_PROCESS__JOBLET_NODES:
                return jobletNodes != null && !jobletNodes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // JobletProcessImpl
