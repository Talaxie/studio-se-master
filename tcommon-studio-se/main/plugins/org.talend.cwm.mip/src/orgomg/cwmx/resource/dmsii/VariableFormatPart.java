/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.objectmodel.core.BooleanExpression;
import orgomg.cwm.resource.record.RecordDef;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Variable Format Part</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the VariableFormatParts that can be associated with a DataSet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.VariableFormatPart#getVfLabel <em>Vf Label</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.VariableFormatPart#getSelectCondition <em>Select Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getVariableFormatPart()
 * @model
 * @generated
 */
public interface VariableFormatPart extends RecordDef {

    /**
     * Returns the value of the '<em><b>Vf Label</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the value of <integer label> identifying this variable format
     * part. <integer label>s are the values of the DMS II data item in the
     * fixed part of the owning DataSet instance with the type RECORD TYPE. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Vf Label</em>' attribute.
     * @see #setVfLabel(long)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getVariableFormatPart_VfLabel()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getVfLabel();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.dmsii.VariableFormatPart#getVfLabel
     * <em>Vf Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Vf Label</em>' attribute.
     * @see #getVfLabel()
     * @generated
     */
    void setVfLabel(long value);

    /**
     * Returns the value of the '<em><b>Select Condition</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> A boolean expression determining which records appear
     * in the Remap. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Select Condition</em>' containment
     *         reference.
     * @see #setSelectCondition(BooleanExpression)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getVariableFormatPart_SelectCondition()
     * @model containment="true"
     * @generated
     */
    BooleanExpression getSelectCondition();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.VariableFormatPart#getSelectCondition <em>Select Condition</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Select Condition</em>' containment reference.
     * @see #getSelectCondition()
     * @generated
     */
    void setSelectCondition(BooleanExpression value);

} // VariableFormatPart
