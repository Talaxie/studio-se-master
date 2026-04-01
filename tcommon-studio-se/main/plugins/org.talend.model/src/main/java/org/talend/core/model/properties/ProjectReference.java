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
 * A representation of the model object '<em><b>Project Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ProjectReference#getProject <em>Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ProjectReference#getBranch <em>Branch</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ProjectReference#getReferencedProject <em>Referenced Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ProjectReference#getReferencedBranch <em>Referenced Branch</em>}</li>
 * </ul>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getProjectReference()
 * @model
 * @generated
 */
public interface ProjectReference extends EObject {
    /**
     * Returns the value of the '<em><b>Project</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.Project#getReferencedProjects <em>Referenced Projects</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project</em>' reference.
     * @see #setProject(Project)
     * @see org.talend.core.model.properties.PropertiesPackage#getProjectReference_Project()
     * @see org.talend.core.model.properties.Project#getReferencedProjects
     * @model opposite="referencedProjects" required="true"
     * @generated
     */
    Project getProject();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ProjectReference#getProject <em>Project</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Project</em>' reference.
     * @see #getProject()
     * @generated
     */
    void setProject(Project value);

    /**
     * Returns the value of the '<em><b>Branch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Branch</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Branch</em>' attribute.
     * @see #setBranch(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getProjectReference_Branch()
     * @model
     * @generated
     */
    String getBranch();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ProjectReference#getBranch <em>Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Branch</em>' attribute.
     * @see #getBranch()
     * @generated
     */
    void setBranch(String value);

    /**
     * Returns the value of the '<em><b>Referenced Project</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.Project#getAvailableRefProject <em>Available Ref Project</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Project</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Project</em>' reference.
     * @see #setReferencedProject(Project)
     * @see org.talend.core.model.properties.PropertiesPackage#getProjectReference_ReferencedProject()
     * @see org.talend.core.model.properties.Project#getAvailableRefProject
     * @model opposite="availableRefProject" required="true"
     * @generated
     */
    Project getReferencedProject();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ProjectReference#getReferencedProject <em>Referenced Project</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Project</em>' reference.
     * @see #getReferencedProject()
     * @generated
     */
    void setReferencedProject(Project value);

    /**
     * Returns the value of the '<em><b>Referenced Branch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Branch</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Branch</em>' attribute.
     * @see #setReferencedBranch(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getProjectReference_ReferencedBranch()
     * @model
     * @generated
     */
    String getReferencedBranch();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ProjectReference#getReferencedBranch <em>Referenced Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Branch</em>' attribute.
     * @see #getReferencedBranch()
     * @generated
     */
    void setReferencedBranch(String value);

} // ProjectReference