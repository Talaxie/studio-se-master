/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.category;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.analysis.category.CategoryFactory
 * @model kind="package"
 * @generated
 */
public interface CategoryPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "category";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://org.talend.dataquality.category";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.category";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CategoryPackage eINSTANCE = org.talend.dataquality.analysis.category.impl.CategoryPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.category.impl.AnalysisCategoryImpl <em>Analysis Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.category.impl.AnalysisCategoryImpl
     * @see org.talend.dataquality.analysis.category.impl.CategoryPackageImpl#getAnalysisCategory()
     * @generated
     */
    int ANALYSIS_CATEGORY = 0;

    /**
     * The feature id for the '<em><b>Analysis Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CATEGORY__ANALYSIS_TYPE = 0;

    /**
     * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CATEGORY__SUB_CATEGORIES = 1;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CATEGORY__LABEL = 2;

    /**
     * The number of structural features of the '<em>Analysis Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CATEGORY_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.dataquality.analysis.category.impl.AnalysisCategoriesImpl <em>Analysis Categories</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.analysis.category.impl.AnalysisCategoriesImpl
     * @see org.talend.dataquality.analysis.category.impl.CategoryPackageImpl#getAnalysisCategories()
     * @generated
     */
    int ANALYSIS_CATEGORIES = 1;

    /**
     * The feature id for the '<em><b>Categories</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CATEGORIES__CATEGORIES = 0;

    /**
     * The number of structural features of the '<em>Analysis Categories</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CATEGORIES_FEATURE_COUNT = 1;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.analysis.category.AnalysisCategory <em>Analysis Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Analysis Category</em>'.
     * @see org.talend.dataquality.analysis.category.AnalysisCategory
     * @generated
     */
    EClass getAnalysisCategory();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.category.AnalysisCategory#getAnalysisType <em>Analysis Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Analysis Type</em>'.
     * @see org.talend.dataquality.analysis.category.AnalysisCategory#getAnalysisType()
     * @see #getAnalysisCategory()
     * @generated
     */
    EAttribute getAnalysisCategory_AnalysisType();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.analysis.category.AnalysisCategory#getSubCategories <em>Sub Categories</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Categories</em>'.
     * @see org.talend.dataquality.analysis.category.AnalysisCategory#getSubCategories()
     * @see #getAnalysisCategory()
     * @generated
     */
    EReference getAnalysisCategory_SubCategories();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.analysis.category.AnalysisCategory#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.talend.dataquality.analysis.category.AnalysisCategory#getLabel()
     * @see #getAnalysisCategory()
     * @generated
     */
    EAttribute getAnalysisCategory_Label();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.analysis.category.AnalysisCategories <em>Analysis Categories</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Analysis Categories</em>'.
     * @see org.talend.dataquality.analysis.category.AnalysisCategories
     * @generated
     */
    EClass getAnalysisCategories();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.analysis.category.AnalysisCategories#getCategories <em>Categories</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Categories</em>'.
     * @see org.talend.dataquality.analysis.category.AnalysisCategories#getCategories()
     * @see #getAnalysisCategories()
     * @generated
     */
    EReference getAnalysisCategories_Categories();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CategoryFactory getCategoryFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.category.impl.AnalysisCategoryImpl <em>Analysis Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.category.impl.AnalysisCategoryImpl
         * @see org.talend.dataquality.analysis.category.impl.CategoryPackageImpl#getAnalysisCategory()
         * @generated
         */
        EClass ANALYSIS_CATEGORY = eINSTANCE.getAnalysisCategory();

        /**
         * The meta object literal for the '<em><b>Analysis Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS_CATEGORY__ANALYSIS_TYPE = eINSTANCE.getAnalysisCategory_AnalysisType();

        /**
         * The meta object literal for the '<em><b>Sub Categories</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_CATEGORY__SUB_CATEGORIES = eINSTANCE.getAnalysisCategory_SubCategories();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANALYSIS_CATEGORY__LABEL = eINSTANCE.getAnalysisCategory_Label();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.analysis.category.impl.AnalysisCategoriesImpl <em>Analysis Categories</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.analysis.category.impl.AnalysisCategoriesImpl
         * @see org.talend.dataquality.analysis.category.impl.CategoryPackageImpl#getAnalysisCategories()
         * @generated
         */
        EClass ANALYSIS_CATEGORIES = eINSTANCE.getAnalysisCategories();

        /**
         * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_CATEGORIES__CATEGORIES = eINSTANCE.getAnalysisCategories_Categories();

    }

} //CategoryPackage
