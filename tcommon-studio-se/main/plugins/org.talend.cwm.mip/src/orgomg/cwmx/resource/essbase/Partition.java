/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase;

import orgomg.cwm.analysis.olap.CubeRegion;
import orgomg.cwm.foundation.expressions.ExpressionNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Partition</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an abstract Essbase partition class (the superclass of all Essbase partition types).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.essbase.Partition#isIsSource <em>Is Source</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.Partition#isIsShared <em>Is Shared</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.Partition#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.essbase.EssbasePackage#getPartition()
 * @model abstract="true"
 * @generated
 */
public interface Partition extends CubeRegion {

    /**
     * Returns the value of the '<em><b>Is Source</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * true, then this Partition is a source Partition (i.e., a source of data
     * values for some other target Partition). <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Source</em>' attribute.
     * @see #setIsSource(boolean)
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getPartition_IsSource()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsSource();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.essbase.Partition#isIsSource
     * <em>Is Source</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Is Source</em>' attribute.
     * @see #isIsSource()
     * @generated
     */
    void setIsSource(boolean value);

    /**
     * Returns the value of the '<em><b>Is Shared</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * true, then this Partition is a shared source Partition (i.e., shared by
     * several targets). <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Shared</em>' attribute.
     * @see #setIsShared(boolean)
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getPartition_IsShared()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsShared();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.essbase.Partition#isIsShared
     * <em>Is Shared</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Is Shared</em>' attribute.
     * @see #isIsShared()
     * @generated
     */
    void setIsShared(boolean value);

    /**
     * Returns the value of the '<em><b>Formula</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Expression specifying the mapping of source Partition data cells to
     * target Partition data cells. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Formula</em>' containment reference.
     * @see #setFormula(ExpressionNode)
     * @see orgomg.cwmx.resource.essbase.EssbasePackage#getPartition_Formula()
     * @model containment="true"
     * @generated
     */
    ExpressionNode getFormula();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.essbase.Partition#getFormula <em>Formula</em>}' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Formula</em>' containment reference.
     * @see #getFormula()
     * @generated
     */
    void setFormula(ExpressionNode value);

} // Partition
