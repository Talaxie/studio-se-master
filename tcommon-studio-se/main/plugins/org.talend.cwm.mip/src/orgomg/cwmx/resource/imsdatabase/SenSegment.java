/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.resource.record.RecordDef;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Sen Segment</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The type holds the attributes that apply to a PCB?s use of a specific segment within a DBD. Application programs using a PCB can only access the segments to which that PCB is sensitive, protecting an hiding some of the data covered by the DBD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getProcoptSENSEG <em>Procopt SENSEG</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getSubsetPointers <em>Subset Pointers</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getPcb <em>Pcb</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getSenField <em>Sen Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSenSegment()
 * @model
 * @generated
 */
public interface SenSegment extends RecordDef {

    /**
     * Returns the value of the '<em><b>Procopt SENSEG</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the processing options allowable for use of this
     * sensitive segment by an associated application program. It has the same
     * meaning as the same attribute in the PCB, plus other options may be
     * specified here which are not allowed on the PCB. This PROCOPT overrides
     * the PCB PROCOPT. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Procopt SENSEG</em>' attribute.
     * @see #setProcoptSENSEG(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSenSegment_ProcoptSENSEG()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getProcoptSENSEG();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getProcoptSENSEG <em>Procopt SENSEG</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Procopt SENSEG</em>' attribute.
     * @see #getProcoptSENSEG()
     * @generated
     */
    void setProcoptSENSEG(String value);

    /**
     * Returns the value of the '<em><b>Subset Pointers</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * This attribute specifies sensitivity to the array of subset pointers,
     * each of which may be R (read sensitive), U (update sensitive), or N (not
     * sensitive). <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Subset Pointers</em>' attribute.
     * @see #setSubsetPointers(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSenSegment_SubsetPointers()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getSubsetPointers();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getSubsetPointers <em>Subset Pointers</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Subset Pointers</em>' attribute.
     * @see #getSubsetPointers()
     * @generated
     */
    void setSubsetPointers(String value);

    /**
     * Returns the value of the '<em><b>Pcb</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.PCB#getSenSegment <em>Sen Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The PCB that includes this sensitive segment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pcb</em>' container reference.
     * @see #setPcb(PCB)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSenSegment_Pcb()
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getSenSegment
     * @model opposite="senSegment" required="true"
     * @generated
     */
    PCB getPcb();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SenSegment#getPcb <em>Pcb</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Pcb</em>' container reference.
     * @see #getPcb()
     * @generated
     */
    void setPcb(PCB value);

    /**
     * Returns the value of the '<em><b>Sen Field</b></em>' containment reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.imsdatabase.SenField}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.SenField#getSenSegment <em>Sen Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The field to which the segment is sensitive.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sen Field</em>' containment reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSenSegment_SenField()
     * @see orgomg.cwmx.resource.imsdatabase.SenField#getSenSegment
     * @model opposite="senSegment" containment="true"
     * @generated
     */
    EList<SenField> getSenField();

    /**
     * Returns the value of the '<em><b>Segment</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.Segment#getSenseg
     * <em>Senseg</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> One segment to which the PCB is sensitive. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Segment</em>' reference.
     * @see #setSegment(Segment)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSenSegment_Segment()
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getSenseg
     * @model opposite="senseg" required="true"
     * @generated
     */
    Segment getSegment();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.SenSegment#getSegment
     * <em>Segment</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Segment</em>' reference.
     * @see #getSegment()
     * @generated
     */
    void setSegment(Segment value);

} // SenSegment
