/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.mapper.model.emf.mapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.UiProperties#isShellMaximized <em>Shell Maximized</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getUiProperties()
 * @model
 * @generated
 */
public interface UiProperties extends EObject {
    /**
     * Returns the value of the '<em><b>Shell Maximized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shell Maximized</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shell Maximized</em>' attribute.
     * @see #setShellMaximized(boolean)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getUiProperties_ShellMaximized()
     * @model
     * @generated
     */
    boolean isShellMaximized();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.UiProperties#isShellMaximized <em>Shell Maximized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shell Maximized</em>' attribute.
     * @see #isShellMaximized()
     * @generated
     */
    void setShellMaximized(boolean value);

} // UiProperties
