/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Key Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of how the blocking key is generated from the list of attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.BlockKeyDefinition#getPreAlgorithm <em>Pre Algorithm</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.BlockKeyDefinition#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.BlockKeyDefinition#getPostAlgorithm <em>Post Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.rules.RulesPackage#getBlockKeyDefinition()
 * @model
 * @generated
 */
public interface BlockKeyDefinition extends KeyDefinition {
    /**
     * Returns the value of the '<em><b>Pre Algorithm</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pre Algorithm</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pre Algorithm</em>' containment reference.
     * @see #setPreAlgorithm(AlgorithmDefinition)
     * @see org.talend.dataquality.rules.RulesPackage#getBlockKeyDefinition_PreAlgorithm()
     * @model containment="true"
     * @generated
     */
    AlgorithmDefinition getPreAlgorithm();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.BlockKeyDefinition#getPreAlgorithm <em>Pre Algorithm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pre Algorithm</em>' containment reference.
     * @see #getPreAlgorithm()
     * @generated
     */
    void setPreAlgorithm(AlgorithmDefinition value);

    /**
     * Returns the value of the '<em><b>Algorithm</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Algorithm</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Algorithm</em>' containment reference.
     * @see #setAlgorithm(AlgorithmDefinition)
     * @see org.talend.dataquality.rules.RulesPackage#getBlockKeyDefinition_Algorithm()
     * @model containment="true"
     * @generated
     */
    AlgorithmDefinition getAlgorithm();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.BlockKeyDefinition#getAlgorithm <em>Algorithm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Algorithm</em>' containment reference.
     * @see #getAlgorithm()
     * @generated
     */
    void setAlgorithm(AlgorithmDefinition value);

    /**
     * Returns the value of the '<em><b>Post Algorithm</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Post Algorithm</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Post Algorithm</em>' containment reference.
     * @see #setPostAlgorithm(AlgorithmDefinition)
     * @see org.talend.dataquality.rules.RulesPackage#getBlockKeyDefinition_PostAlgorithm()
     * @model containment="true"
     * @generated
     */
    AlgorithmDefinition getPostAlgorithm();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.BlockKeyDefinition#getPostAlgorithm <em>Post Algorithm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Post Algorithm</em>' containment reference.
     * @see #getPostAlgorithm()
     * @generated
     */
    void setPostAlgorithm(AlgorithmDefinition value);

} // BlockKeyDefinition
