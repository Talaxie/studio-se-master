/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Categorical Attribute</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An attribute with discrete values upon which performing numeric operations is typically not meaningful.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.CategoricalAttribute#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.CategoricalAttribute#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategoricalAttribute()
 * @model
 * @generated
 */
public interface CategoricalAttribute extends MiningAttribute {

    /**
     * Returns the value of the '<em><b>Taxonomy</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.CategoryHierarchy#getCategoricalAttribute
     * <em>Categorical Attribute</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> The taxonomy referenced by
     * CategoricalAttributes <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Taxonomy</em>' reference.
     * @see #setTaxonomy(CategoryHierarchy)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategoricalAttribute_Taxonomy()
     * @see orgomg.cwm.analysis.datamining.CategoryHierarchy#getCategoricalAttribute
     * @model opposite="categoricalAttribute"
     * @generated
     */
    CategoryHierarchy getTaxonomy();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.CategoricalAttribute#getTaxonomy
     * <em>Taxonomy</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Taxonomy</em>' reference.
     * @see #getTaxonomy()
     * @generated
     */
    void setTaxonomy(CategoryHierarchy value);

    /**
     * Returns the value of the '<em><b>Category</b></em>' containment reference
     * list. The list contents are of type
     * {@link orgomg.cwm.analysis.datamining.Category}. It is bidirectional and
     * its opposite is '
     * {@link orgomg.cwm.analysis.datamining.Category#getCategoricalAttribute
     * <em>Categorical Attribute</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Categories owned by the
     * CategoricalAttribute. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Category</em>' containment reference list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategoricalAttribute_Category()
     * @see orgomg.cwm.analysis.datamining.Category#getCategoricalAttribute
     * @model opposite="categoricalAttribute" containment="true"
     * @generated
     */
    EList<Category> getCategory();

} // CategoricalAttribute
