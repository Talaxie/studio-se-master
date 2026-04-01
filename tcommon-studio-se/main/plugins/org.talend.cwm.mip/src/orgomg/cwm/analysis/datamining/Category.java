/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Category</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A potential value of categoricalAttribute. For a given categoricalAttribute, all categories must be of the same Category subclass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.Category#getDisplayValue <em>Display Value</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.Category#getProperty <em>Property</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.Category#getValue <em>Value</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.Category#getCategoricalAttribute <em>Categorical Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends ModelElement {

    /**
     * Returns the value of the '<em><b>Display Value</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
     * string used when the category is displayed. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Display Value</em>' attribute.
     * @see #setDisplayValue(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategory_DisplayValue()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getDisplayValue();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.Category#getDisplayValue <em>Display Value</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Display Value</em>' attribute.
     * @see #getDisplayValue()
     * @generated
     */
    void setDisplayValue(String value);

    /**
     * Returns the value of the '<em><b>Property</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwm.analysis.datamining.CategoryProperty}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Categories with "missing" property represent that no information is
     * available. If there are categories with property "invalid" then other
     * categories are valid by default. If there are categories with property
     * "valid" then other categories are invalid by default. Positive and
     * negative define allowed values of a binary attribute. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Property</em>' attribute.
     * @see orgomg.cwm.analysis.datamining.CategoryProperty
     * @see #setProperty(CategoryProperty)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategory_Property()
     * @model
     * @generated
     */
    CategoryProperty getProperty();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.Category#getProperty
     * <em>Property</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Property</em>' attribute.
     * @see orgomg.cwm.analysis.datamining.CategoryProperty
     * @see #getProperty()
     * @generated
     */
    void setProperty(CategoryProperty value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Value
     * holder for the Category. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategory_Value()
     * @model dataType="orgomg.cwm.objectmodel.core.Any"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.Category#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Categorical Attribute</b></em>'
     * container reference. It is bidirectional and its opposite is '
     * {@link orgomg.cwm.analysis.datamining.CategoricalAttribute#getCategory
     * <em>Category</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The CategoricalAttribute owning Categories. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Categorical Attribute</em>' container
     *         reference.
     * @see #setCategoricalAttribute(CategoricalAttribute)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getCategory_CategoricalAttribute()
     * @see orgomg.cwm.analysis.datamining.CategoricalAttribute#getCategory
     * @model opposite="category"
     * @generated
     */
    CategoricalAttribute getCategoricalAttribute();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.Category#getCategoricalAttribute <em>Categorical Attribute</em>}' container reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Categorical Attribute</em>' container reference.
     * @see #getCategoricalAttribute()
     * @generated
     */
    void setCategoricalAttribute(CategoricalAttribute value);

} // Category
