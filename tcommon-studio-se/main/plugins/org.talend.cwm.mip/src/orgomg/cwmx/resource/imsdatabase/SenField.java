/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import orgomg.cwm.resource.record.FixedOffsetField;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Sen Field</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship associates a SensitiveSegment instance to the Field instances that represent the fields in the segment to which the PCB must be sensitive.
 * 
 * Field level sensitivity provides an increased level of data independence by isolating application programs from changes in the arrangement of fields within a segment and addition or deletion of data within a segment. Additionally, it enhances data security by limiting an application program to a subset of fields within a segment and controlling replace operations at the field level.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SenField#isReplace <em>Replace</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SenField#getSenSegment <em>Sen Segment</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SenField#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSenField()
 * @model
 * @generated
 */
public interface SenField extends FixedOffsetField {

    /**
     * Returns the value of the '<em><b>Replace</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * value of this attribute specifies whether this field may be altered on a
     * replace call. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Replace</em>' attribute.
     * @see #setReplace(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSenField_Replace()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isReplace();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.SenField#isReplace
     * <em>Replace</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Replace</em>' attribute.
     * @see #isReplace()
     * @generated
     */
    void setReplace(boolean value);

    /**
     * Returns the value of the '<em><b>Sen Segment</b></em>' container
     * reference. It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.SenSegment#getSenField
     * <em>Sen Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The segment that is sensitive to this field. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Sen Segment</em>' container reference.
     * @see #setSenSegment(SenSegment)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSenField_SenSegment()
     * @see orgomg.cwmx.resource.imsdatabase.SenSegment#getSenField
     * @model opposite="senField" required="true"
     * @generated
     */
    SenSegment getSenSegment();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SenField#getSenSegment <em>Sen Segment</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Sen Segment</em>' container reference.
     * @see #getSenSegment()
     * @generated
     */
    void setSenSegment(SenSegment value);

    /**
     * Returns the value of the '<em><b>Field</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.Field#getSenField
     * <em>Sen Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The field to which the PCB is sensitive. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Field</em>' reference.
     * @see #setField(Field)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSenField_Field()
     * @see orgomg.cwmx.resource.imsdatabase.Field#getSenField
     * @model opposite="senField" required="true"
     * @generated
     */
    Field getField();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SenField#getField <em>Field</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Field</em>' reference.
     * @see #getField()
     * @generated
     */
    void setField(Field value);

} // SenField
