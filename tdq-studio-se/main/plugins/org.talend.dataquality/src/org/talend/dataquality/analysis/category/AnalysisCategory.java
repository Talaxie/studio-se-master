/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.category;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.talend.dataquality.analysis.AnalysisType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.category.AnalysisCategory#getAnalysisType <em>Analysis Type</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.category.AnalysisCategory#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.category.AnalysisCategory#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.analysis.category.CategoryPackage#getAnalysisCategory()
 * @model
 * @generated
 */
public interface AnalysisCategory extends EObject {
    /**
     * Returns the value of the '<em><b>Analysis Type</b></em>' attribute.
     * The default value is <code>""</code>.
     * The literals are from the enumeration {@link org.talend.dataquality.analysis.AnalysisType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analysis Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analysis Type</em>' attribute.
     * @see org.talend.dataquality.analysis.AnalysisType
     * @see #isSetAnalysisType()
     * @see #unsetAnalysisType()
     * @see #setAnalysisType(AnalysisType)
     * @see org.talend.dataquality.analysis.category.CategoryPackage#getAnalysisCategory_AnalysisType()
     * @model default="" unsettable="true"
     * @generated
     */
    AnalysisType getAnalysisType();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.category.AnalysisCategory#getAnalysisType <em>Analysis Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analysis Type</em>' attribute.
     * @see org.talend.dataquality.analysis.AnalysisType
     * @see #isSetAnalysisType()
     * @see #unsetAnalysisType()
     * @see #getAnalysisType()
     * @generated
     */
    void setAnalysisType(AnalysisType value);

    /**
     * Unsets the value of the '{@link org.talend.dataquality.analysis.category.AnalysisCategory#getAnalysisType <em>Analysis Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalysisType()
     * @see #getAnalysisType()
     * @see #setAnalysisType(AnalysisType)
     * @generated
     */
    void unsetAnalysisType();

    /**
     * Returns whether the value of the '{@link org.talend.dataquality.analysis.category.AnalysisCategory#getAnalysisType <em>Analysis Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analysis Type</em>' attribute is set.
     * @see #unsetAnalysisType()
     * @see #getAnalysisType()
     * @see #setAnalysisType(AnalysisType)
     * @generated
     */
    boolean isSetAnalysisType();

    /**
     * Returns the value of the '<em><b>Sub Categories</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.analysis.category.AnalysisCategory}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Categories</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Categories</em>' containment reference list.
     * @see org.talend.dataquality.analysis.category.CategoryPackage#getAnalysisCategory_SubCategories()
     * @model containment="true"
     * @generated
     */
    EList<AnalysisCategory> getSubCategories();

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.dataquality.analysis.category.CategoryPackage#getAnalysisCategory_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.category.AnalysisCategory#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

} // AnalysisCategory
