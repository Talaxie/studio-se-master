/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.resource.record.RecordDef;
import orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.RulesType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Segment</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of this object class represents a segment within a DBD user object. A segment is the IMS-view of a data structure that maps the fields in the segment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#isExitFlag <em>Exit Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getMaximumLength <em>Maximum Length</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getMinimumLength <em>Minimum Length</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getRules <em>Rules</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getSubsetPointers <em>Subset Pointers</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#isDirectDependent <em>Direct Dependent</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getPcPointer <em>Pc Pointer</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getLogical <em>Logical</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getDbd <em>Dbd</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getSenseg <em>Senseg</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getChild <em>Child</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getParent <em>Parent</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Segment#getExit <em>Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends RecordDef {

    /**
     * Returns the value of the '<em><b>Exit Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute is a flag to indicate whether a segment will use the data
     * capture exits specified on the DBD. A valid of FALSE maps to use of
     * EXIT=NONE parameter on the SEGM macro. This flag has no meaning when
     * exits points to any instances of PropagatedBy. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Exit Flag</em>' attribute.
     * @see #setExitFlag(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_ExitFlag()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isExitFlag();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.Segment#isExitFlag
     * <em>Exit Flag</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Exit Flag</em>' attribute.
     * @see #isExitFlag()
     * @generated
     */
    void setExitFlag(boolean value);

    /**
     * Returns the value of the '<em><b>Frequency</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds estimated number of times that this segment will occur
     * for each occurrence of its physical parent. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Frequency</em>' attribute.
     * @see #setFrequency(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_Frequency()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getFrequency();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.Segment#getFrequency
     * <em>Frequency</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Frequency</em>' attribute.
     * @see #getFrequency()
     * @generated
     */
    void setFrequency(String value);

    /**
     * Returns the value of the '<em><b>Maximum Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the length of a fixed-length segment, or the maximum
     * length of a variable length segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Maximum Length</em>' attribute.
     * @see #setMaximumLength(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_MaximumLength()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getMaximumLength();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Segment#getMaximumLength <em>Maximum Length</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Maximum Length</em>' attribute.
     * @see #getMaximumLength()
     * @generated
     */
    void setMaximumLength(long value);

    /**
     * Returns the value of the '<em><b>Minimum Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the minimum length of a variable length segment. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Minimum Length</em>' attribute.
     * @see #setMinimumLength(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_MinimumLength()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getMinimumLength();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Segment#getMinimumLength <em>Minimum Length</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Minimum Length</em>' attribute.
     * @see #getMinimumLength()
     * @generated
     */
    void setMinimumLength(long value);

    /**
     * Returns the value of the '<em><b>Rules</b></em>' attribute. The literals
     * are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.RulesType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attributes holds the value that indicates where to place new occurrences
     * of this segment type in the physical database. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Rules</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.RulesType
     * @see #setRules(RulesType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_Rules()
     * @model
     * @generated
     */
    RulesType getRules();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Segment#getRules <em>Rules</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Rules</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.RulesType
     * @see #getRules()
     * @generated
     */
    void setRules(RulesType value);

    /**
     * Returns the value of the '<em><b>Subset Pointers</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * This attribute holds the number of subset pointers in a direct dependent
     * segment in a DEDB DBD. Valid values are 0-8. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Subset Pointers</em>' attribute.
     * @see #setSubsetPointers(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_SubsetPointers()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getSubsetPointers();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Segment#getSubsetPointers <em>Subset Pointers</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Subset Pointers</em>' attribute.
     * @see #getSubsetPointers()
     * @generated
     */
    void setSubsetPointers(String value);

    /**
     * Returns the value of the '<em><b>Direct Dependent</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * This attribute indicates whether the segment is direct dependent or
     * sequential. A value of TRUE specifies use of DIR as the segment type on
     * the generated DBD. A value of FALSE specifies use of SEQ on the generated
     * DBD. This attribute is ignored for the root segment of the DBD user
     * object. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Direct Dependent</em>' attribute.
     * @see #setDirectDependent(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_DirectDependent()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isDirectDependent();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Segment#isDirectDependent <em>Direct Dependent</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Direct Dependent</em>' attribute.
     * @see #isDirectDependent()
     * @generated
     */
    void setDirectDependent(boolean value);

    /**
     * Returns the value of the '<em><b>Pc Pointer</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute describes the type of physical child pointer to be stored in
     * the prefix area of the segment in the DBD. Valid Values are SNGL, DBLE,
     * null <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Pc Pointer</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType
     * @see #setPcPointer(ChildPointerType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_PcPointer()
     * @model
     * @generated
     */
    ChildPointerType getPcPointer();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Segment#getPcPointer <em>Pc Pointer</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Pc Pointer</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType
     * @see #getPcPointer()
     * @generated
     */
    void setPcPointer(ChildPointerType value);

    /**
     * Returns the value of the '<em><b>Logical</b></em>' reference list. The
     * list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentLogical}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentLogical#getPhysical
     * <em>Physical</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The logical segment that is based on this physical
     * segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Logical</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_Logical()
     * @see orgomg.cwmx.resource.imsdatabase.SegmentLogical#getPhysical
     * @model opposite="physical"
     * @generated
     */
    EList<SegmentLogical> getLogical();

    /**
     * Returns the value of the '<em><b>Dbd</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.DBD#getSegment <em>Segment</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * DBD that owns this segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dbd</em>' container reference.
     * @see #setDbd(DBD)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_Dbd()
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getSegment
     * @model opposite="segment" required="true"
     * @generated
     */
    DBD getDbd();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Segment#getDbd <em>Dbd</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Dbd</em>' container reference.
     * @see #getDbd()
     * @generated
     */
    void setDbd(DBD value);

    /**
     * Returns the value of the '<em><b>Senseg</b></em>' reference list. The
     * list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.SenSegment}. It is bidirectional
     * and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.SenSegment#getSegment
     * <em>Segment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The sensitive segments that use this segment. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Senseg</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_Senseg()
     * @see orgomg.cwmx.resource.imsdatabase.SenSegment#getSegment
     * @model opposite="segment"
     * @generated
     */
    EList<SenSegment> getSenseg();

    /**
     * Returns the value of the '<em><b>Child</b></em>' reference list. The list
     * contents are of type {@link orgomg.cwmx.resource.imsdatabase.Segment}. It
     * is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.Segment#getParent
     * <em>Parent</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The physical child segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Child</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_Child()
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getParent
     * @model opposite="parent"
     * @generated
     */
    EList<Segment> getChild();

    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.Segment#getChild <em>Child</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The physical parent segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(Segment)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_Parent()
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getChild
     * @model opposite="child"
     * @generated
     */
    Segment getParent();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.Segment#getParent
     * <em>Parent</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(Segment value);

    /**
     * Returns the value of the '<em><b>Exit</b></em>' containment reference
     * list. The list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.Exit}. It is bidirectional and
     * its opposite is '{@link orgomg.cwmx.resource.imsdatabase.Exit#getSegment
     * <em>Segment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Data capture exit used by this Segment. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Exit</em>' containment reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegment_Exit()
     * @see orgomg.cwmx.resource.imsdatabase.Exit#getSegment
     * @model opposite="segment" containment="true"
     * @generated
     */
    EList<Exit> getExit();

} // Segment
