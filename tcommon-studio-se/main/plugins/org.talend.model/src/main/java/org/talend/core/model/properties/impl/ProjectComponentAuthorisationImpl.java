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

import org.talend.core.model.properties.Component;
import org.talend.core.model.properties.Project;
import org.talend.core.model.properties.ProjectComponentAuthorisation;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Component Authorisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ProjectComponentAuthorisationImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ProjectComponentAuthorisationImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectComponentAuthorisationImpl extends EObjectImpl implements ProjectComponentAuthorisation {
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
     * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponent()
     * @generated
     * @ordered
     */
    protected Component component;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProjectComponentAuthorisationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.PROJECT_COMPONENT_AUTHORISATION;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__PROJECT, oldProject, project));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__PROJECT, oldProject, newProject);
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
                msgs = ((InternalEObject)project).eInverseRemove(this, PropertiesPackage.PROJECT__ALLOWED_COMPONENTS, Project.class, msgs);
            if (newProject != null)
                msgs = ((InternalEObject)newProject).eInverseAdd(this, PropertiesPackage.PROJECT__ALLOWED_COMPONENTS, Project.class, msgs);
            msgs = basicSetProject(newProject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__PROJECT, newProject, newProject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component getComponent() {
        if (component != null && component.eIsProxy()) {
            InternalEObject oldComponent = (InternalEObject)component;
            component = (Component)eResolveProxy(oldComponent);
            if (component != oldComponent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__COMPONENT, oldComponent, component));
            }
        }
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component basicGetComponent() {
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
        Component oldComponent = component;
        component = newComponent;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__COMPONENT, oldComponent, newComponent);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComponent(Component newComponent) {
        if (newComponent != component) {
            NotificationChain msgs = null;
            if (component != null)
                msgs = ((InternalEObject)component).eInverseRemove(this, PropertiesPackage.COMPONENT__PROJECTS, Component.class, msgs);
            if (newComponent != null)
                msgs = ((InternalEObject)newComponent).eInverseAdd(this, PropertiesPackage.COMPONENT__PROJECTS, Component.class, msgs);
            msgs = basicSetComponent(newComponent, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__COMPONENT, newComponent, newComponent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__PROJECT:
                if (project != null)
                    msgs = ((InternalEObject)project).eInverseRemove(this, PropertiesPackage.PROJECT__ALLOWED_COMPONENTS, Project.class, msgs);
                return basicSetProject((Project)otherEnd, msgs);
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__COMPONENT:
                if (component != null)
                    msgs = ((InternalEObject)component).eInverseRemove(this, PropertiesPackage.COMPONENT__PROJECTS, Component.class, msgs);
                return basicSetComponent((Component)otherEnd, msgs);
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
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__PROJECT:
                return basicSetProject(null, msgs);
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__COMPONENT:
                return basicSetComponent(null, msgs);
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
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__PROJECT:
                if (resolve) return getProject();
                return basicGetProject();
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__COMPONENT:
                if (resolve) return getComponent();
                return basicGetComponent();
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
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__PROJECT:
                setProject((Project)newValue);
                return;
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__COMPONENT:
                setComponent((Component)newValue);
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
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__PROJECT:
                setProject((Project)null);
                return;
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__COMPONENT:
                setComponent((Component)null);
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
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__PROJECT:
                return project != null;
            case PropertiesPackage.PROJECT_COMPONENT_AUTHORISATION__COMPONENT:
                return component != null;
        }
        return super.eIsSet(featureID);
    }

} //ProjectComponentAuthorisationImpl