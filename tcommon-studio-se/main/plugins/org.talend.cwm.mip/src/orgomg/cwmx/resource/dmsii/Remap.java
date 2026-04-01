/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.objectmodel.core.Expression;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.resource.record.RecordDef;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Remap</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains information identifying a Remap of a DMSII DataSet or Set. The features of a Remap instance must be RemapItem instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Remap#isIsRequiredAll <em>Is Required All</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Remap#isIsReadOnlyAll <em>Is Read Only All</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Remap#isIsGivingException <em>Is Giving Exception</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Remap#getSelectCondition <em>Select Condition</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.Remap#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemap()
 * @model
 * @generated
 */
public interface Remap extends RecordDef {

    /**
     * Returns the value of the '<em><b>Is Required All</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, all items in the remap are required to be non-null. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Is Required All</em>' attribute.
     * @see #setIsRequiredAll(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemap_IsRequiredAll()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsRequiredAll();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Remap#isIsRequiredAll <em>Is Required All</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Required All</em>' attribute.
     * @see #isIsRequiredAll()
     * @generated
     */
    void setIsRequiredAll(boolean value);

    /**
     * Returns the value of the '<em><b>Is Read Only All</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the READONLY ALL clause was specified. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Read Only All</em>' attribute.
     * @see #setIsReadOnlyAll(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemap_IsReadOnlyAll()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsReadOnlyAll();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Remap#isIsReadOnlyAll <em>Is Read Only All</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Read Only All</em>' attribute.
     * @see #isIsReadOnlyAll()
     * @generated
     */
    void setIsReadOnlyAll(boolean value);

    /**
     * Returns the value of the '<em><b>Is Giving Exception</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The isGivingException boolean is meaningful only if isReadOnlyAll = True.
     * If the isGivingException boolean is absent, no exception clause was
     * specified. If it is present, False indicates that the NO EXCEPTION clause
     * was specified whereas True indicates the GIVING EXCEPTION clause. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Is Giving Exception</em>' attribute.
     * @see #setIsGivingException(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemap_IsGivingException()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsGivingException();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Remap#isIsGivingException <em>Is Giving Exception</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Giving Exception</em>' attribute.
     * @see #isIsGivingException()
     * @generated
     */
    void setIsGivingException(boolean value);

    /**
     * Returns the value of the '<em><b>Select Condition</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Contains the expression specified in a remap's SELECT
     * clause. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Select Condition</em>' containment
     *         reference.
     * @see #setSelectCondition(Expression)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemap_SelectCondition()
     * @model containment="true"
     * @generated
     */
    Expression getSelectCondition();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Remap#getSelectCondition <em>Select Condition</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Select Condition</em>' containment reference.
     * @see #getSelectCondition()
     * @generated
     */
    void setSelectCondition(Expression value);

    /**
     * Returns the value of the '<em><b>Structure</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.objectmodel.core.StructuralFeature#getRemap
     * <em>Remap</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the structure that is remapped by the
     * Remap instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Structure</em>' reference.
     * @see #setStructure(StructuralFeature)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemap_Structure()
     * @see orgomg.cwm.objectmodel.core.StructuralFeature#getRemap
     * @model opposite="remap" required="true"
     * @generated
     */
    StructuralFeature getStructure();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.Remap#getStructure <em>Structure</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Structure</em>' reference.
     * @see #getStructure()
     * @generated
     */
    void setStructure(StructuralFeature value);

} // Remap
