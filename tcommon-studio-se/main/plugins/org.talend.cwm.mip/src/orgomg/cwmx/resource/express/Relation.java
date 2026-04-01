/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.resource.multidimensional.DimensionedObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Relation</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents a reference from one or more Dimensions to another Dimension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.Relation#isIsTemp <em>Is Temp</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.Relation#getPageSpace <em>Page Space</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.Relation#getReferenceDimension <em>Reference Dimension</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.Relation#getAggMapComponent <em>Agg Map Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends DimensionedObject {

    /**
     * Returns the value of the '<em><b>Is Temp</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If set,
     * this indicates that values of the Relation are only temporary, and will
     * be discarded at the end of each Express session. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Temp</em>' attribute.
     * @see #setIsTemp(boolean)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getRelation_IsTemp()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsTemp();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.Relation#isIsTemp <em>Is Temp</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Temp</em>' attribute.
     * @see #isIsTemp()
     * @generated
     */
    void setIsTemp(boolean value);

    /**
     * Returns the value of the '<em><b>Page Space</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * identifies the type of page space in which data associated with the
     * Relation will be stored:
     * 
     * OWNSPACE specifies that the data will be stored in private page space
     * associated with the Relation. SHAREDSPACE specifies that the data will be
     * stored in the database?s global page space. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Page Space</em>' attribute.
     * @see #setPageSpace(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getRelation_PageSpace()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getPageSpace();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.Relation#getPageSpace <em>Page Space</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Page Space</em>' attribute.
     * @see #getPageSpace()
     * @generated
     */
    void setPageSpace(String value);

    /**
     * Returns the value of the '<em><b>Reference Dimension</b></em>' reference.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.express.Dimension#getRelation
     * <em>Relation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the Dimension referenced by the Relation.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Reference Dimension</em>' reference.
     * @see #setReferenceDimension(Dimension)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getRelation_ReferenceDimension()
     * @see orgomg.cwmx.resource.express.Dimension#getRelation
     * @model opposite="relation" required="true"
     * @generated
     */
    Dimension getReferenceDimension();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.Relation#getReferenceDimension <em>Reference Dimension</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Reference Dimension</em>' reference.
     * @see #getReferenceDimension()
     * @generated
     */
    void setReferenceDimension(Dimension value);

    /**
     * Returns the value of the '<em><b>Agg Map Component</b></em>' reference
     * list. The list contents are of type
     * {@link orgomg.cwmx.resource.express.AggMapComponent}. It is bidirectional
     * and its opposite is '
     * {@link orgomg.cwmx.resource.express.AggMapComponent#getRelation
     * <em>Relation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the AggMapComponent. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Agg Map Component</em>' reference list.
     * @see orgomg.cwmx.resource.express.ExpressPackage#getRelation_AggMapComponent()
     * @see orgomg.cwmx.resource.express.AggMapComponent#getRelation
     * @model opposite="relation"
     * @generated
     */
    EList<AggMapComponent> getAggMapComponent();

} // Relation
