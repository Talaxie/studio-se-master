/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Agg Map Component</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents a component of an Express aggregation map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.AggMapComponent#getAggOperator <em>Agg Operator</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.AggMapComponent#getRelation <em>Relation</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.AggMapComponent#getDimension <em>Dimension</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.AggMapComponent#getComputeClause <em>Compute Clause</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.AggMapComponent#getAggMap <em>Agg Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getAggMapComponent()
 * @model
 * @generated
 */
public interface AggMapComponent extends ModelElement {

    /**
     * Returns the value of the '<em><b>Agg Operator</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A text
     * expression indicating the type of aggregate operation. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Agg Operator</em>' attribute.
     * @see #setAggOperator(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getAggMapComponent_AggOperator()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getAggOperator();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.AggMapComponent#getAggOperator <em>Agg Operator</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Agg Operator</em>' attribute.
     * @see #getAggOperator()
     * @generated
     */
    void setAggOperator(String value);

    /**
     * Returns the value of the '<em><b>Relation</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.express.Relation#getAggMapComponent
     * <em>Agg Map Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the Relation used by the
     * AggMapComponent. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Relation</em>' reference.
     * @see #setRelation(Relation)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getAggMapComponent_Relation()
     * @see orgomg.cwmx.resource.express.Relation#getAggMapComponent
     * @model opposite="aggMapComponent"
     * @generated
     */
    Relation getRelation();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.express.AggMapComponent#getRelation
     * <em>Relation</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Relation</em>' reference.
     * @see #getRelation()
     * @generated
     */
    void setRelation(Relation value);

    /**
     * Returns the value of the '<em><b>Dimension</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.express.Dimension#getAggMapComponent
     * <em>Agg Map Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the Dimension associated with the
     * AggMapComponent. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dimension</em>' reference.
     * @see #setDimension(Dimension)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getAggMapComponent_Dimension()
     * @see orgomg.cwmx.resource.express.Dimension#getAggMapComponent
     * @model opposite="aggMapComponent" required="true"
     * @generated
     */
    Dimension getDimension();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.express.AggMapComponent#getDimension
     * <em>Dimension</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Dimension</em>' reference.
     * @see #getDimension()
     * @generated
     */
    void setDimension(Dimension value);

    /**
     * Returns the value of the '<em><b>Compute Clause</b></em>' containment
     * reference. It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.express.PreComputeClause#getAggMapComponent
     * <em>Agg Map Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the PreComputeClause associated
     * with the AggMapComponent. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Compute Clause</em>' containment reference.
     * @see #setComputeClause(PreComputeClause)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getAggMapComponent_ComputeClause()
     * @see orgomg.cwmx.resource.express.PreComputeClause#getAggMapComponent
     * @model opposite="aggMapComponent" containment="true"
     * @generated
     */
    PreComputeClause getComputeClause();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.AggMapComponent#getComputeClause <em>Compute Clause</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Compute Clause</em>' containment reference.
     * @see #getComputeClause()
     * @generated
     */
    void setComputeClause(PreComputeClause value);

    /**
     * Returns the value of the '<em><b>Agg Map</b></em>' container reference.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.express.AggMap#getAggMapComponent
     * <em>Agg Map Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the AggMap. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Agg Map</em>' container reference.
     * @see #setAggMap(AggMap)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getAggMapComponent_AggMap()
     * @see orgomg.cwmx.resource.express.AggMap#getAggMapComponent
     * @model opposite="aggMapComponent" required="true"
     * @generated
     */
    AggMap getAggMap();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.AggMapComponent#getAggMap <em>Agg Map</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Agg Map</em>' container reference.
     * @see #getAggMap()
     * @generated
     */
    void setAggMap(AggMap value);

} // AggMapComponent
