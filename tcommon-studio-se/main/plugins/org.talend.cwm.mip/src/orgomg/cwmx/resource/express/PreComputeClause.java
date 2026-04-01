/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Pre Compute Clause</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents a pre-compute clause for an Express aggregation map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.PreComputeClause#getStatusList <em>Status List</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.PreComputeClause#getAggMapComponent <em>Agg Map Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getPreComputeClause()
 * @model
 * @generated
 */
public interface PreComputeClause extends ModelElement {

    /**
     * Returns the value of the '<em><b>Status List</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * status of the dimension to aggregate. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Status List</em>' attribute.
     * @see #setStatusList(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getPreComputeClause_StatusList()
     * @model dataType="orgomg.cwm.objectmodel.core.Any"
     * @generated
     */
    String getStatusList();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.PreComputeClause#getStatusList <em>Status List</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Status List</em>' attribute.
     * @see #getStatusList()
     * @generated
     */
    void setStatusList(String value);

    /**
     * Returns the value of the '<em><b>Agg Map Component</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.express.AggMapComponent#getComputeClause <em>Compute Clause</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the AggMapComponent.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Agg Map Component</em>' container reference.
     * @see #setAggMapComponent(AggMapComponent)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getPreComputeClause_AggMapComponent()
     * @see orgomg.cwmx.resource.express.AggMapComponent#getComputeClause
     * @model opposite="computeClause" required="true"
     * @generated
     */
    AggMapComponent getAggMapComponent();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.PreComputeClause#getAggMapComponent <em>Agg Map Component</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Agg Map Component</em>' container reference.
     * @see #getAggMapComponent()
     * @generated
     */
    void setAggMapComponent(AggMapComponent value);

} // PreComputeClause
