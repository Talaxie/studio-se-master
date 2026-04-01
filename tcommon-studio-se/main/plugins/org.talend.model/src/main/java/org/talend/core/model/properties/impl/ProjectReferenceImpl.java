/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.core.model.properties.Project;
import org.talend.core.model.properties.ProjectReference;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ProjectReferenceImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ProjectReferenceImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ProjectReferenceImpl#getReferencedProject <em>Referenced Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ProjectReferenceImpl#getReferencedBranch <em>Referenced Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectReferenceImpl extends EObjectImpl implements ProjectReference {
    /**
     * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProject()
     * @generated
     * @ordered
     */
    protected Project project;

    /**
     * The default value of the '{@link #getBranch() <em>Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranch()
     * @generated
     * @ordered
     */
    protected static final String BRANCH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBranch() <em>Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranch()
     * @generated
     * @ordered
     */
    protected String branch = BRANCH_EDEFAULT;

    /**
     * The cached value of the '{@link #getReferencedProject() <em>Referenced Project</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedProject()
     * @generated
     * @ordered
     */
    protected Project referencedProject;

    /**
     * The default value of the '{@link #getReferencedBranch() <em>Referenced Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedBranch()
     * @generated
     * @ordered
     */
    protected static final String REFERENCED_BRANCH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReferencedBranch() <em>Referenced Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedBranch()
     * @generated
     * @ordered
     */
    protected String referencedBranch = REFERENCED_BRANCH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProjectReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.PROJECT_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Project getProject() {
        if (project != null && project.eIsProxy()) {
            InternalEObject oldProject = (InternalEObject)project;
            project = (Project)eResolveProxy(oldProject);
            if (project != oldProject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROJECT_REFERENCE__PROJECT, oldProject, project));
            }
        }
        return project;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Project basicGetProject() {
        return project;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
        Project oldProject = project;
        project = newProject;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROJECT_REFERENCE__PROJECT, oldProject, newProject);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProject(Project newProject) {
        if (newProject != project) {
            NotificationChain msgs = null;
            if (project != null)
                msgs = ((InternalEObject)project).eInverseRemove(this, PropertiesPackage.PROJECT__REFERENCED_PROJECTS, Project.class, msgs);
            if (newProject != null)
                msgs = ((InternalEObject)newProject).eInverseAdd(this, PropertiesPackage.PROJECT__REFERENCED_PROJECTS, Project.class, msgs);
            msgs = basicSetProject(newProject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROJECT_REFERENCE__PROJECT, newProject, newProject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBranch() {
        return branch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBranch(String newBranch) {
        String oldBranch = branch;
        branch = newBranch;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROJECT_REFERENCE__BRANCH, oldBranch, branch));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Project getReferencedProject() {
        if (referencedProject != null && referencedProject.eIsProxy()) {
            InternalEObject oldReferencedProject = (InternalEObject)referencedProject;
            referencedProject = (Project)eResolveProxy(oldReferencedProject);
            if (referencedProject != oldReferencedProject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROJECT_REFERENCE__REFERENCED_PROJECT, oldReferencedProject, referencedProject));
            }
        }
        return referencedProject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Project basicGetReferencedProject() {
        return referencedProject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReferencedProject(Project newReferencedProject, NotificationChain msgs) {
        Project oldReferencedProject = referencedProject;
        referencedProject = newReferencedProject;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROJECT_REFERENCE__REFERENCED_PROJECT, oldReferencedProject, newReferencedProject);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedProject(Project newReferencedProject) {
        if (newReferencedProject != referencedProject) {
            NotificationChain msgs = null;
            if (referencedProject != null)
                msgs = ((InternalEObject)referencedProject).eInverseRemove(this, PropertiesPackage.PROJECT__AVAILABLE_REF_PROJECT, Project.class, msgs);
            if (newReferencedProject != null)
                msgs = ((InternalEObject)newReferencedProject).eInverseAdd(this, PropertiesPackage.PROJECT__AVAILABLE_REF_PROJECT, Project.class, msgs);
            msgs = basicSetReferencedProject(newReferencedProject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROJECT_REFERENCE__REFERENCED_PROJECT, newReferencedProject, newReferencedProject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReferencedBranch() {
        return referencedBranch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedBranch(String newReferencedBranch) {
        String oldReferencedBranch = referencedBranch;
        referencedBranch = newReferencedBranch;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROJECT_REFERENCE__REFERENCED_BRANCH, oldReferencedBranch, referencedBranch));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.PROJECT_REFERENCE__PROJECT:
                if (project != null)
                    msgs = ((InternalEObject)project).eInverseRemove(this, PropertiesPackage.PROJECT__REFERENCED_PROJECTS, Project.class, msgs);
                return basicSetProject((Project)otherEnd, msgs);
            case PropertiesPackage.PROJECT_REFERENCE__REFERENCED_PROJECT:
                if (referencedProject != null)
                    msgs = ((InternalEObject)referencedProject).eInverseRemove(this, PropertiesPackage.PROJECT__AVAILABLE_REF_PROJECT, Project.class, msgs);
                return basicSetReferencedProject((Project)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.PROJECT_REFERENCE__PROJECT:
                return basicSetProject(null, msgs);
            case PropertiesPackage.PROJECT_REFERENCE__REFERENCED_PROJECT:
                return basicSetReferencedProject(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.PROJECT_REFERENCE__PROJECT:
                if (resolve) return getProject();
                return basicGetProject();
            case PropertiesPackage.PROJECT_REFERENCE__BRANCH:
                return getBranch();
            case PropertiesPackage.PROJECT_REFERENCE__REFERENCED_PROJECT:
                if (resolve) return getReferencedProject();
                return basicGetReferencedProject();
            case PropertiesPackage.PROJECT_REFERENCE__REFERENCED_BRANCH:
                return getReferencedBranch();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.PROJECT_REFERENCE__PROJECT:
                setProject((Project)newValue);
                return;
            case PropertiesPackage.PROJECT_REFERENCE__BRANCH:
                setBranch((String)newValue);
                return;
            case PropertiesPackage.PROJECT_REFERENCE__REFERENCED_PROJECT:
                setReferencedProject((Project)newValue);
                return;
            case PropertiesPackage.PROJECT_REFERENCE__REFERENCED_BRANCH:
                setReferencedBranch((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PropertiesPackage.PROJECT_REFERENCE__PROJECT:
                setProject((Project)null);
                return;
            case PropertiesPackage.PROJECT_REFERENCE__BRANCH:
                setBranch(BRANCH_EDEFAULT);
                return;
            case PropertiesPackage.PROJECT_REFERENCE__REFERENCED_PROJECT:
                setReferencedProject((Project)null);
                return;
            case PropertiesPackage.PROJECT_REFERENCE__REFERENCED_BRANCH:
                setReferencedBranch(REFERENCED_BRANCH_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PropertiesPackage.PROJECT_REFERENCE__PROJECT:
                return project != null;
            case PropertiesPackage.PROJECT_REFERENCE__BRANCH:
                return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
            case PropertiesPackage.PROJECT_REFERENCE__REFERENCED_PROJECT:
                return referencedProject != null;
            case PropertiesPackage.PROJECT_REFERENCE__REFERENCED_BRANCH:
                return REFERENCED_BRANCH_EDEFAULT == null ? referencedBranch != null : !REFERENCED_BRANCH_EDEFAULT.equals(referencedBranch);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (branch: ");
        result.append(branch);
        result.append(", referencedBranch: ");
        result.append(referencedBranch);
        result.append(')');
        return result.toString();
    }

} //ProjectReferenceImpl