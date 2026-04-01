/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Category Hierarchy</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a hierarchical ordering (aka taxonomy) between groups of items.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.CategoryHierarchy#getCategoricalAttribute <em>Categorical Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategoryHierarchy()
 * @model
 * @generated
 */
public interface CategoryHierarchy extends orgomg.cwm.objectmodel.core.Class {

    /**
     * Returns the value of the '<em><b>Categorical Attribute</b></em>'
     * reference list. The list contents are of type
     * {@link orgomg.cwm.analysis.datamining.CategoricalAttribute}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.CategoricalAttribute#getTaxonomy
     * <em>Taxonomy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The CategoricalAttributes referencing a taxonomy.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Categorical Attribute</em>' reference list.
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategoryHierarchy_CategoricalAttribute()
     * @see orgomg.cwm.analysis.datamining.CategoricalAttribute#getTaxonomy
     * @model opposite="taxonomy"
     * @generated
     */
    EList<CategoricalAttribute> getCategoricalAttribute();

} // CategoryHierarchy
