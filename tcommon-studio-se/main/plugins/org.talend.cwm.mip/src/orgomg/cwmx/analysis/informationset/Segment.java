/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.analysis.olap.Cube;
import orgomg.cwm.objectmodel.core.ProcedureExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Segment</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Segment represents a multidimensional structure. A Segment is defined by a collection of unique Dimensions from the InformationSet. Each unique combination of members in the Cartesian product of the Segment?s Dimensions identifies precisely one data cell within the multidimensional structure.
 * 
 * Note that a logical segment is "defined" by a collection of unique Dimensions from the InformationSet, and is "described" by a collection of one or more Segment Regions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.Segment#getRegionSequence <em>Region Sequence</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.Segment#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends Cube {

    /**
     * Returns the value of the '<em><b>Region Sequence</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Specifies the sequence of the SegmentRegion. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Region Sequence</em>' containment
     *         reference.
     * @see #setRegionSequence(ProcedureExpression)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getSegment_RegionSequence()
     * @model containment="true"
     * @generated
     */
    ProcedureExpression getRegionSequence();

    /**
     * Sets the value of the '{@link orgomg.cwmx.analysis.informationset.Segment#getRegionSequence <em>Region Sequence</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Region Sequence</em>' containment reference.
     * @see #getRegionSequence()
     * @generated
     */
    void setRegionSequence(ProcedureExpression value);

    /**
     * Returns the value of the '<em><b>Rule</b></em>' reference list. The list
     * contents are of type {@link orgomg.cwmx.analysis.informationset.Rule}. It
     * is bidirectional and its opposite is '
     * {@link orgomg.cwmx.analysis.informationset.Rule#getSegment
     * <em>Segment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The Rule for a Segment <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Rule</em>' reference list.
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getSegment_Rule()
     * @see orgomg.cwmx.analysis.informationset.Rule#getSegment
     * @model opposite="segment"
     * @generated
     */
    EList<Rule> getRule();

} // Segment
