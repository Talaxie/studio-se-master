/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Ordinal Attribute</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Subclass of CategoricalAttribute that represents ordinal attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.OrdinalAttribute#isIsCyclic <em>Is Cyclic</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.OrdinalAttribute#getOrderingType <em>Ordering Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getOrdinalAttribute()
 * @model
 * @generated
 */
public interface OrdinalAttribute extends CategoricalAttribute {

    /**
     * Returns the value of the '<em><b>Is Cyclic</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Indicates ordinal attributes with cyclic value ranges, in which case the
     * first and last attributes in the ordered sequence of attributes define
     * the base interval. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Cyclic</em>' attribute.
     * @see #setIsCyclic(boolean)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getOrdinalAttribute_IsCyclic()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsCyclic();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.OrdinalAttribute#isIsCyclic
     * <em>Is Cyclic</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Is Cyclic</em>' attribute.
     * @see #isIsCyclic()
     * @generated
     */
    void setIsCyclic(boolean value);

    /**
     * Returns the value of the '<em><b>Ordering Type</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwm.analysis.datamining.OrderType}. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Indicates if categories
     * are ordered. If orderingType is inSequence then the aggregation of
     * categories defines the ordering relation. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Ordering Type</em>' attribute.
     * @see orgomg.cwm.analysis.datamining.OrderType
     * @see #setOrderingType(OrderType)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getOrdinalAttribute_OrderingType()
     * @model
     * @generated
     */
    OrderType getOrderingType();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.OrdinalAttribute#getOrderingType <em>Ordering Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Ordering Type</em>' attribute.
     * @see orgomg.cwm.analysis.datamining.OrderType
     * @see #getOrderingType()
     * @generated
     */
    void setOrderingType(OrderType value);

} // OrdinalAttribute
