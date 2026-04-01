/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwm.resource.record.Field;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Remap Item</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Maps a Remap instance?s field to its source, which may be some DataItem or an expression.
 * 
 * The name attribute of a RemapItem instance defaults to the name attribute of the associated DataItem instance. If changed in the Remap definition by a "<identifier> =" clause, the name attribute of the Remap instance is simply set to <identifier>.
 * 
 * The RemapItem instance?s initial value is stored in the initialValue attribute inherited from the CWM ObjectModel?s Attribute class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.RemapItem#getOccurs <em>Occurs</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsHidden <em>Is Hidden</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsGivingException <em>Is Giving Exception</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.RemapItem#getVirtualExpression <em>Virtual Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemapItem()
 * @model
 * @generated
 */
public interface RemapItem extends Field {

    /**
     * Returns the value of the '<em><b>Occurs</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * specified, overrides the occurs attribute of the associated DataItem
     * instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Occurs</em>' attribute.
     * @see #setOccurs(long)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemapItem_Occurs()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getOccurs();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.RemapItem#getOccurs <em>Occurs</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Occurs</em>' attribute.
     * @see #getOccurs()
     * @generated
     */
    void setOccurs(long value);

    /**
     * Returns the value of the '<em><b>Is Required</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, overrides the isRequired attribute of the associated DataItem
     * instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Required</em>' attribute.
     * @see #setIsRequired(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemapItem_IsRequired()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsRequired();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsRequired <em>Is Required</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Required</em>' attribute.
     * @see #isIsRequired()
     * @generated
     */
    void setIsRequired(boolean value);

    /**
     * Returns the value of the '<em><b>Is Hidden</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the corresponding DataItem is not visible to the user of the Remap.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Hidden</em>' attribute.
     * @see #setIsHidden(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemapItem_IsHidden()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsHidden();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.dmsii.RemapItem#isIsHidden
     * <em>Is Hidden</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Is Hidden</em>' attribute.
     * @see #isIsHidden()
     * @generated
     */
    void setIsHidden(boolean value);

    /**
     * Returns the value of the '<em><b>Is Read Only</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the RemapItem is readonly. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Read Only</em>' attribute.
     * @see #setIsReadOnly(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemapItem_IsReadOnly()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsReadOnly();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsReadOnly <em>Is Read Only</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Read Only</em>' attribute.
     * @see #isIsReadOnly()
     * @generated
     */
    void setIsReadOnly(boolean value);

    /**
     * Returns the value of the '<em><b>Is Giving Exception</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The isGivingException boolean is meaningful only if isReadOnly = True. If
     * the isGivingException boolean is absent, no exception clause was
     * specified. If it is present, False indicates that the NO EXCEPTION clause
     * was specified whereas True indicates the GIVING EXCEPTION clause. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Is Giving Exception</em>' attribute.
     * @see #setIsGivingException(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemapItem_IsGivingException()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsGivingException();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsGivingException <em>Is Giving Exception</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Giving Exception</em>' attribute.
     * @see #isIsGivingException()
     * @generated
     */
    void setIsGivingException(boolean value);

    /**
     * Returns the value of the '<em><b>Is Virtual</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the RemapItem instance is calculated when accessed using the
     * expression stored in the virtualExpression attribute. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Is Virtual</em>' attribute.
     * @see #setIsVirtual(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemapItem_IsVirtual()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsVirtual();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsVirtual <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Virtual</em>' attribute.
     * @see #isIsVirtual()
     * @generated
     */
    void setIsVirtual(boolean value);

    /**
     * Returns the value of the '<em><b>Virtual Expression</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The expression used to calculate the value of a
     * virtual RemapItem. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Virtual Expression</em>' containment
     *         reference.
     * @see #setVirtualExpression(ExpressionNode)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getRemapItem_VirtualExpression()
     * @model containment="true"
     * @generated
     */
    ExpressionNode getVirtualExpression();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.RemapItem#getVirtualExpression <em>Virtual Expression</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Virtual Expression</em>' containment reference.
     * @see #getVirtualExpression()
     * @generated
     */
    void setVirtualExpression(ExpressionNode value);

} // RemapItem
