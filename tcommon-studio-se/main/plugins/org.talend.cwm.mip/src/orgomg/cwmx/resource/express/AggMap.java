/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Agg Map</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents an Express aggregation map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.AggMap#getAggMapComponent <em>Agg Map Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getAggMap()
 * @model
 * @generated
 */
public interface AggMap extends orgomg.cwm.objectmodel.core.Class {

    /**
     * Returns the value of the '<em><b>Agg Map Component</b></em>' containment
     * reference list. The list contents are of type
     * {@link orgomg.cwmx.resource.express.AggMapComponent}. It is bidirectional
     * and its opposite is '
     * {@link orgomg.cwmx.resource.express.AggMapComponent#getAggMap
     * <em>Agg Map</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies an AggMapComponent that forms part of the
     * AggMap. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Agg Map Component</em>' containment
     *         reference list.
     * @see orgomg.cwmx.resource.express.ExpressPackage#getAggMap_AggMapComponent()
     * @see orgomg.cwmx.resource.express.AggMapComponent#getAggMap
     * @model opposite="aggMap" containment="true"
     * @generated
     */
    EList<AggMapComponent> getAggMapComponent();

} // AggMap
