/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survivorship Key Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.SurvivorshipKeyDefinition#getFunction <em>Function</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.SurvivorshipKeyDefinition#isAllowManualResolution <em>Allow Manual Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.rules.RulesPackage#getSurvivorshipKeyDefinition()
 * @model
 * @generated
 */
public interface SurvivorshipKeyDefinition extends KeyDefinition {
    /**
     * Returns the value of the '<em><b>Function</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' containment reference.
     * @see #setFunction(AlgorithmDefinition)
     * @see org.talend.dataquality.rules.RulesPackage#getSurvivorshipKeyDefinition_Function()
     * @model containment="true"
     * @generated
     */
    AlgorithmDefinition getFunction();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.SurvivorshipKeyDefinition#getFunction <em>Function</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function</em>' containment reference.
     * @see #getFunction()
     * @generated
     */
    void setFunction(AlgorithmDefinition value);

    /**
     * Returns the value of the '<em><b>Allow Manual Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allow Manual Resolution</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allow Manual Resolution</em>' attribute.
     * @see #setAllowManualResolution(boolean)
     * @see org.talend.dataquality.rules.RulesPackage#getSurvivorshipKeyDefinition_AllowManualResolution()
     * @model
     * @generated
     */
    boolean isAllowManualResolution();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.SurvivorshipKeyDefinition#isAllowManualResolution <em>Allow Manual Resolution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Allow Manual Resolution</em>' attribute.
     * @see #isAllowManualResolution()
     * @generated
     */
    void setAllowManualResolution(boolean value);

} // SurvivorshipKeyDefinition
