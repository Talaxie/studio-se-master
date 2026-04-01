/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.category;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.analysis.category.CategoryPackage
 * @generated
 */
public interface CategoryFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CategoryFactory eINSTANCE = org.talend.dataquality.analysis.category.impl.CategoryFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Analysis Category</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analysis Category</em>'.
     * @generated
     */
    AnalysisCategory createAnalysisCategory();

    /**
     * Returns a new object of class '<em>Analysis Categories</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analysis Categories</em>'.
     * @generated
     */
    AnalysisCategories createAnalysisCategories();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CategoryPackage getCategoryPackage();

} //CategoryFactory
