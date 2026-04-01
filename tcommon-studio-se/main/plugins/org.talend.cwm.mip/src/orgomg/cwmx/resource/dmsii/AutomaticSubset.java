/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.objectmodel.core.BooleanExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Automatic Subset</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Subset that has a membership expression. Records in the spanned DataSet instance are part of the AutomaticSubset instance if the expression in the condition attribute evaluates to True.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.AutomaticSubset#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getAutomaticSubset()
 * @model
 * @generated
 */
public interface AutomaticSubset extends Subset {

    /**
     * Returns the value of the '<em><b>Condition</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Contains the text of an expression that determines
     * membership of the spanned DataSet's records in this AutomaticSubset
     * instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(BooleanExpression)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getAutomaticSubset_Condition()
     * @model containment="true"
     * @generated
     */
    BooleanExpression getCondition();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.AutomaticSubset#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(BooleanExpression value);

} // AutomaticSubset
