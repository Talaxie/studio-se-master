/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.librariesmanager.emf.librariesindex;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Libraries Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.librariesmanager.emf.librariesindex.LibrariesIndex#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.talend.librariesmanager.emf.librariesindex.LibrariesIndex#getJarsToRelativePath <em>Jars To Relative Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.librariesmanager.emf.librariesindex.LibrariesindexPackage#getLibrariesIndex()
 * @model
 * @generated
 */
public interface LibrariesIndex extends EObject {
    /**
     * Returns the value of the '<em><b>Initialized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initialized</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initialized</em>' attribute.
     * @see #setInitialized(boolean)
     * @see org.talend.librariesmanager.emf.librariesindex.LibrariesindexPackage#getLibrariesIndex_Initialized()
     * @model
     * @generated
     */
    boolean isInitialized();

    /**
     * Sets the value of the '{@link org.talend.librariesmanager.emf.librariesindex.LibrariesIndex#isInitialized <em>Initialized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initialized</em>' attribute.
     * @see #isInitialized()
     * @generated
     */
    void setInitialized(boolean value);

    /**
     * Returns the value of the '<em><b>Jars To Relative Path</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Jars To Relative Path</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Jars To Relative Path</em>' map.
     * @see org.talend.librariesmanager.emf.librariesindex.LibrariesindexPackage#getLibrariesIndex_JarsToRelativePath()
     * @model mapType="org.talend.librariesmanager.emf.librariesindex.jarToRelativePath<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
     * @generated
     */
    EMap<String, String> getJarsToRelativePath();

} // LibrariesIndex
