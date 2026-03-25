/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.category;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Categories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.category.AnalysisCategories#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.analysis.category.CategoryPackage#getAnalysisCategories()
 * @model
 * @generated
 */
public interface AnalysisCategories extends EObject {
    /**
     * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.analysis.category.AnalysisCategory}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Categories</em>' containment reference list.
     * @see org.talend.dataquality.analysis.category.CategoryPackage#getAnalysisCategories_Categories()
     * @model containment="true"
     * @generated
     */
    EList<AnalysisCategory> getCategories();

} // AnalysisCategories
