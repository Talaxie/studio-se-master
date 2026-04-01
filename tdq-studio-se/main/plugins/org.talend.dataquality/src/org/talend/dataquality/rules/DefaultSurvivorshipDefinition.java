/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Survivorship Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.DefaultSurvivorshipDefinition#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.DefaultSurvivorshipDefinition#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.rules.RulesPackage#getDefaultSurvivorshipDefinition()
 * @model
 * @generated
 */
public interface DefaultSurvivorshipDefinition extends EObject {
    /**
     * Returns the value of the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' attribute.
     * @see #setDataType(String)
     * @see org.talend.dataquality.rules.RulesPackage#getDefaultSurvivorshipDefinition_DataType()
     * @model
     * @generated
     */
    String getDataType();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.DefaultSurvivorshipDefinition#getDataType <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' attribute.
     * @see #getDataType()
     * @generated
     */
    void setDataType(String value);

    /**
     * Returns the value of the '<em><b>Function</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' containment reference.
     * @see #setFunction(AlgorithmDefinition)
     * @see org.talend.dataquality.rules.RulesPackage#getDefaultSurvivorshipDefinition_Function()
     * @model containment="true"
     * @generated
     */
    AlgorithmDefinition getFunction();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.DefaultSurvivorshipDefinition#getFunction <em>Function</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function</em>' containment reference.
     * @see #getFunction()
     * @generated
     */
    void setFunction(AlgorithmDefinition value);

} // DefaultSurvivorshipDefinition
