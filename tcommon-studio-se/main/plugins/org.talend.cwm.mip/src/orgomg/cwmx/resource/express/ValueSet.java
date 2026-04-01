/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import orgomg.cwm.resource.multidimensional.DimensionedObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Value Set</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents a physical Express value set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.ValueSet#isIsTemp <em>Is Temp</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.ValueSet#getReferenceDimension <em>Reference Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getValueSet()
 * @model
 * @generated
 */
public interface ValueSet extends DimensionedObject {

    /**
     * Returns the value of the '<em><b>Is Temp</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If set,
     * this indicates that values in the ValueSet are only temporary, and will
     * be discarded at the end of each Express session. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Temp</em>' attribute.
     * @see #setIsTemp(boolean)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getValueSet_IsTemp()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsTemp();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.ValueSet#isIsTemp <em>Is Temp</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Temp</em>' attribute.
     * @see #isIsTemp()
     * @generated
     */
    void setIsTemp(boolean value);

    /**
     * Returns the value of the '<em><b>Reference Dimension</b></em>' reference.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.express.Dimension#getValueSet
     * <em>Value Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the Dimension whose values are to be
     * stored in the ValueSet. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Reference Dimension</em>' reference.
     * @see #setReferenceDimension(Dimension)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getValueSet_ReferenceDimension()
     * @see orgomg.cwmx.resource.express.Dimension#getValueSet
     * @model opposite="valueSet" required="true"
     * @generated
     */
    Dimension getReferenceDimension();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.ValueSet#getReferenceDimension <em>Reference Dimension</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Reference Dimension</em>' reference.
     * @see #getReferenceDimension()
     * @generated
     */
    void setReferenceDimension(Dimension value);

} // ValueSet
