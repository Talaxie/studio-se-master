/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import orgomg.cwm.resource.multidimensional.DimensionedObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Formula</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents a physical Express formula.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.Formula#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends DimensionedObject {

    /**
     * Returns the value of the '<em><b>Expression</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * calculation to be performed to produce values when you use the Formula.
     * It can be any valid Express expression, including a constant or the name
     * of a Variable. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Expression</em>' attribute.
     * @see #setExpression(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getFormula_Expression()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getExpression();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.Formula#getExpression <em>Expression</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' attribute.
     * @see #getExpression()
     * @generated
     */
    void setExpression(String value);

} // Formula
