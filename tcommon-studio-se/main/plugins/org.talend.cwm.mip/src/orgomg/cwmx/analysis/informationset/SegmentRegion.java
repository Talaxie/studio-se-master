/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.analysis.olap.CubeRegion;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Segment Region</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SegmentRegion represents a sub-set of a Segment. A SegmentRegion may be used for exposing a subset of the dimensionality of a Segment. The Member Selections comprising a SegmentRegion always collectively define a subset of the total dimensionality of the associated Segment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.SegmentRegion#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getSegmentRegion()
 * @model
 * @generated
 */
public interface SegmentRegion extends CubeRegion {

    /**
     * Returns the value of the '<em><b>Rule</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.analysis.informationset.Rule}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.analysis.informationset.Rule#getSegmentRegion <em>Segment Region</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Rules for a SegmentRegion.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rule</em>' reference list.
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getSegmentRegion_Rule()
     * @see orgomg.cwmx.analysis.informationset.Rule#getSegmentRegion
     * @model opposite="segmentRegion"
     * @generated
     */
    EList<Rule> getRule();

} // SegmentRegion
