/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Dimension</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents a physical Express dimension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.Dimension#getRelation <em>Relation</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.Dimension#getColumnDimensionInWorksheet <em>Column Dimension In Worksheet</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.Dimension#getRowDimensionInWorksheet <em>Row Dimension In Worksheet</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.Dimension#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.Dimension#getAggMapComponent <em>Agg Map Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getDimension()
 * @model abstract="true"
 * @generated
 */
public interface Dimension extends orgomg.cwm.resource.multidimensional.Dimension {

    /**
     * Returns the value of the '<em><b>Relation</b></em>' reference list. The
     * list contents are of type {@link orgomg.cwmx.resource.express.Relation}.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.express.Relation#getReferenceDimension
     * <em>Reference Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the Express Relations that
     * reference the Dimension. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Relation</em>' reference list.
     * @see orgomg.cwmx.resource.express.ExpressPackage#getDimension_Relation()
     * @see orgomg.cwmx.resource.express.Relation#getReferenceDimension
     * @model opposite="referenceDimension"
     * @generated
     */
    EList<Relation> getRelation();

    /**
     * Returns the value of the '<em><b>Column Dimension In Worksheet</b></em>'
     * reference list. The list contents are of type
     * {@link orgomg.cwmx.resource.express.Worksheet}. It is bidirectional and
     * its opposite is '
     * {@link orgomg.cwmx.resource.express.Worksheet#getColumnDimension
     * <em>Column Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the Worksheets using the
     * Dimension as a column dimension. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Column Dimension In Worksheet</em>'
     *         reference list.
     * @see orgomg.cwmx.resource.express.ExpressPackage#getDimension_ColumnDimensionInWorksheet()
     * @see orgomg.cwmx.resource.express.Worksheet#getColumnDimension
     * @model opposite="columnDimension"
     * @generated
     */
    EList<Worksheet> getColumnDimensionInWorksheet();

    /**
     * Returns the value of the '<em><b>Row Dimension In Worksheet</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.express.Worksheet}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.express.Worksheet#getRowDimension <em>Row Dimension</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the Worksheets using the Dimension as a row dimension.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Row Dimension In Worksheet</em>' reference list.
     * @see orgomg.cwmx.resource.express.ExpressPackage#getDimension_RowDimensionInWorksheet()
     * @see orgomg.cwmx.resource.express.Worksheet#getRowDimension
     * @model opposite="rowDimension"
     * @generated
     */
    EList<Worksheet> getRowDimensionInWorksheet();

    /**
     * Returns the value of the '<em><b>Value Set</b></em>' reference list. The
     * list contents are of type {@link orgomg.cwmx.resource.express.ValueSet}.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.express.ValueSet#getReferenceDimension
     * <em>Reference Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the Express ValueSets that
     * reference a Dimension. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Value Set</em>' reference list.
     * @see orgomg.cwmx.resource.express.ExpressPackage#getDimension_ValueSet()
     * @see orgomg.cwmx.resource.express.ValueSet#getReferenceDimension
     * @model opposite="referenceDimension"
     * @generated
     */
    EList<ValueSet> getValueSet();

    /**
     * Returns the value of the '<em><b>Agg Map Component</b></em>' reference
     * list. The list contents are of type
     * {@link orgomg.cwmx.resource.express.AggMapComponent}. It is bidirectional
     * and its opposite is '
     * {@link orgomg.cwmx.resource.express.AggMapComponent#getDimension
     * <em>Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the AggMapComponent. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Agg Map Component</em>' reference list.
     * @see orgomg.cwmx.resource.express.ExpressPackage#getDimension_AggMapComponent()
     * @see orgomg.cwmx.resource.express.AggMapComponent#getDimension
     * @model opposite="dimension"
     * @generated
     */
    EList<AggMapComponent> getAggMapComponent();

} // Dimension
