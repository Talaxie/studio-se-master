/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Component Authorisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ProjectComponentAuthorisation#getProject <em>Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ProjectComponentAuthorisation#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getProjectComponentAuthorisation()
 * @model
 * @generated
 */
public interface ProjectComponentAuthorisation extends EObject {
    /**
     * Returns the value of the '<em><b>Project</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.Project#getAllowedComponents <em>Allowed Components</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project</em>' reference.
     * @see #setProject(Project)
     * @see org.talend.core.model.properties.PropertiesPackage#getProjectComponentAuthorisation_Project()
     * @see org.talend.core.model.properties.Project#getAllowedComponents
     * @model opposite="allowedComponents" required="true"
     * @generated
     */
    Project getProject();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ProjectComponentAuthorisation#getProject <em>Project</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Project</em>' reference.
     * @see #getProject()
     * @generated
     */
    void setProject(Project value);

    /**
     * Returns the value of the '<em><b>Component</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.Component#getProjects <em>Projects</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' reference.
     * @see #setComponent(Component)
     * @see org.talend.core.model.properties.PropertiesPackage#getProjectComponentAuthorisation_Component()
     * @see org.talend.core.model.properties.Component#getProjects
     * @model opposite="projects" required="true"
     * @generated
     */
    Component getComponent();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ProjectComponentAuthorisation#getComponent <em>Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component</em>' reference.
     * @see #getComponent()
     * @generated
     */
    void setComponent(Component value);

} // ProjectComponentAuthorisation