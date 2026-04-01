/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er;

import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwm.objectmodel.core.Classifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Domain</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Domain instances represent restrictions on data types declared elsewhere and can be used as the type of Attribute instances. Domains restrict, in a manner described by their validationRule attribute, the values of the type identified via the baseType reference that can be stored in the Attribute. Because the baseType reference is optional, Domains are not required to have a base type; in such cases, the type of the Domain is the type of the default expression.
 * 
 * The following figures illustrate ways that Domains can be used to subset a enumerated and numeric data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.foundation.er.Domain#getDefault <em>Default</em>}</li>
 *   <li>{@link orgomg.cwmx.foundation.er.Domain#getValidationRule <em>Validation Rule</em>}</li>
 *   <li>{@link orgomg.cwmx.foundation.er.Domain#getBaseType <em>Base Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.foundation.er.ErPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends Classifier {

    /**
     * Returns the value of the '<em><b>Default</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An
     * expression indicating the default value of Attributes for which this
     * Domain serves as the type. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Default</em>' containment reference.
     * @see #setDefault(ExpressionNode)
     * @see orgomg.cwmx.foundation.er.ErPackage#getDomain_Default()
     * @model containment="true"
     * @generated
     */
    ExpressionNode getDefault();

    /**
     * Sets the value of the '{@link orgomg.cwmx.foundation.er.Domain#getDefault <em>Default</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Default</em>' containment reference.
     * @see #getDefault()
     * @generated
     */
    void setDefault(ExpressionNode value);

    /**
     * Returns the value of the '<em><b>Validation Rule</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Contains an expression that describes the valid
     * values for this attribute. If the baseType reference is not empty, the
     * expression restricts the values of the base type indicated by it. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Validation Rule</em>' containment
     *         reference.
     * @see #setValidationRule(ExpressionNode)
     * @see orgomg.cwmx.foundation.er.ErPackage#getDomain_ValidationRule()
     * @model containment="true"
     * @generated
     */
    ExpressionNode getValidationRule();

    /**
     * Sets the value of the '{@link orgomg.cwmx.foundation.er.Domain#getValidationRule <em>Validation Rule</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validation Rule</em>' containment reference.
     * @see #getValidationRule()
     * @generated
     */
    void setValidationRule(ExpressionNode value);

    /**
     * Returns the value of the '<em><b>Base Type</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.objectmodel.core.Classifier#getDomain <em>Domain</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Identifies the Classifier instance that is the type upon which the Domain
     * is based. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Base Type</em>' reference.
     * @see #setBaseType(Classifier)
     * @see orgomg.cwmx.foundation.er.ErPackage#getDomain_BaseType()
     * @see orgomg.cwm.objectmodel.core.Classifier#getDomain
     * @model opposite="domain"
     * @generated
     */
    Classifier getBaseType();

    /**
     * Sets the value of the '{@link orgomg.cwmx.foundation.er.Domain#getBaseType <em>Base Type</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Type</em>' reference.
     * @see #getBaseType()
     * @generated
     */
    void setBaseType(Classifier value);

} // Domain
