/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Dimension</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Essbase Dimension is the primary physical object used in the construction of Essbase Databases.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.essbase.Dimension#getType <em>Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.Dimension#isIsDense <em>Is Dense</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.Dimension#getOutline <em>Outline</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.essbase.EssbasePackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends orgomg.cwm.resource.multidimensional.Dimension {

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute. The literals
     * are from the enumeration
     * {@link orgomg.cwmx.resource.essbase.DimensionType}. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> The type of the
     * Essbase Dimension. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see orgomg.cwmx.resource.essbase.DimensionType
     * @see #setType(DimensionType)
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getDimension_Type()
     * @model
     * @generated
     */
    DimensionType getType();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.essbase.Dimension#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see orgomg.cwmx.resource.essbase.DimensionType
     * @see #getType()
     * @generated
     */
    void setType(DimensionType value);

    /**
     * Returns the value of the '<em><b>Is Dense</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Specifies if this Essbase Dimension is sparse or dense. Generally
     * affected by Dimension type (e.g., Accounts and Time Dimensions are
     * usually dense). <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Dense</em>' attribute.
     * @see #setIsDense(boolean)
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getDimension_IsDense()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsDense();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.essbase.Dimension#isIsDense
     * <em>Is Dense</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Is Dense</em>' attribute.
     * @see #isIsDense()
     * @generated
     */
    void setIsDense(boolean value);

    /**
     * Returns the value of the '<em><b>Outline</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.essbase.Outline#getDimension
     * <em>Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The Outline that organizes the Dimensions. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Outline</em>' reference.
     * @see #setOutline(Outline)
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getDimension_Outline()
     * @see orgomg.cwmx.resource.essbase.Outline#getDimension
     * @model opposite="dimension" required="true"
     * @generated
     */
    Outline getOutline();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.essbase.Dimension#getOutline
     * <em>Outline</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Outline</em>' reference.
     * @see #getOutline()
     * @generated
     */
    void setOutline(Outline value);

} // Dimension
