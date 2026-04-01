/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Segment Logical</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of this object class represents a segment in a DBD user object that has access method of LOGICAL. Segments in a logical DBD use segments in other DBDs instead of defining physical data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentLogical#isKeyData1 <em>Key Data1</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentLogical#isKeyData2 <em>Key Data2</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentLogical#getPhysical <em>Physical</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentLogical()
 * @model
 * @generated
 */
public interface SegmentLogical extends Segment {

    /**
     * Returns the value of the '<em><b>Key Data1</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute indicates how segment data will be handled when the logical DBD
     * is processed.
     * 
     * A value of TRUE specifies use of "DATA" as the type in the first
     * parameter of the SOURCE keyword in the generated DBD, which directs the
     * segment key to be placed in the key feedback area and the segment data to
     * be placed in the user?s I/O area.
     * 
     * A value of FALSE specified use of "KEY" as the type, which directs only
     * the key to be placed in the key feedback area. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Key Data1</em>' attribute.
     * @see #setKeyData1(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentLogical_KeyData1()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isKeyData1();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentLogical#isKeyData1
     * <em>Key Data1</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Key Data1</em>' attribute.
     * @see #isKeyData1()
     * @generated
     */
    void setKeyData1(boolean value);

    /**
     * Returns the value of the '<em><b>Key Data2</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute indicates how segment data will be handled when the logical DBD
     * is processed.
     * 
     * A value of TRUE specifies use of "DATA" as the type in the second
     * parameter of the SOURCE keyword in the generated DBD, which directs the
     * segment key to be placed in the key feedback area and the segment data to
     * be placed in the user?s I/O area.
     * 
     * A value of FALSE specified use of "KEY" as the type, which directs only
     * the key to be placed in the key feedback area. A value of NULL indicates
     * that there is no second SOURCE parameter. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Key Data2</em>' attribute.
     * @see #setKeyData2(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentLogical_KeyData2()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isKeyData2();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentLogical#isKeyData2
     * <em>Key Data2</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Key Data2</em>' attribute.
     * @see #isKeyData2()
     * @generated
     */
    void setKeyData2(boolean value);

    /**
     * Returns the value of the '<em><b>Physical</b></em>' reference list. The
     * list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.Segment}. It is bidirectional and
     * its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.Segment#getLogical
     * <em>Logical</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The real segment that is the basis of the logical
     * segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Physical</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentLogical_Physical()
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getLogical
     * @model opposite="logical" upper="2"
     * @generated
     */
    EList<Segment> getPhysical();

} // SegmentLogical
