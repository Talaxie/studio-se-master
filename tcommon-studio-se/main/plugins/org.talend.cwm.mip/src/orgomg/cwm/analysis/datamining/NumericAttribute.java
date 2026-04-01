/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Numeric Attribute</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Attribute containing numbers, for which numeric operations are meaningful.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.NumericAttribute#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.NumericAttribute#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.NumericAttribute#isIsCyclic <em>Is Cyclic</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.NumericAttribute#isIsDiscrete <em>Is Discrete</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.analysis.datamining.DataminingPackage#getNumericAttribute()
 * @model
 * @generated
 */
public interface NumericAttribute extends MiningAttribute {

    /**
     * Returns the value of the '<em><b>Lower Bound</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Least
     * non-outlier value. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Lower Bound</em>' attribute.
     * @see #setLowerBound(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getNumericAttribute_LowerBound()
     * @model dataType="orgomg.cwm.objectmodel.core.Float"
     * @generated
     */
    String getLowerBound();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.NumericAttribute#getLowerBound <em>Lower Bound</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Lower Bound</em>' attribute.
     * @see #getLowerBound()
     * @generated
     */
    void setLowerBound(String value);

    /**
     * Returns the value of the '<em><b>Upper Bound</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Greatest non-outlier value. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Upper Bound</em>' attribute.
     * @see #setUpperBound(String)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getNumericAttribute_UpperBound()
     * @model dataType="orgomg.cwm.objectmodel.core.Float"
     * @generated
     */
    String getUpperBound();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.NumericAttribute#getUpperBound <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Upper Bound</em>' attribute.
     * @see #getUpperBound()
     * @generated
     */
    void setUpperBound(String value);

    /**
     * Returns the value of the '<em><b>Is Cyclic</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Indicates attributes with cyclic value range such as angles or numbers
     * representing the day of the week. If true, lowerBound and upperBound
     * define the base interval. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Cyclic</em>' attribute.
     * @see #setIsCyclic(boolean)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getNumericAttribute_IsCyclic()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsCyclic();

    /**
     * Sets the value of the '
     * {@link orgomg.cwm.analysis.datamining.NumericAttribute#isIsCyclic
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
     * Returns the value of the '<em><b>Is Discrete</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Tells
     * the algorithms whether to deal with the numbers as discrete values. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Is Discrete</em>' attribute.
     * @see #setIsDiscrete(boolean)
     * @see orgomg.cwm.analysis.datamining.DataminingPackage#getNumericAttribute_IsDiscrete()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsDiscrete();

    /**
     * Sets the value of the '{@link orgomg.cwm.analysis.datamining.NumericAttribute#isIsDiscrete <em>Is Discrete</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Discrete</em>' attribute.
     * @see #isIsDiscrete()
     * @generated
     */
    void setIsDiscrete(boolean value);

} // NumericAttribute
