/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Key Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.MatchKeyDefinition#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.MatchKeyDefinition#getConfidenceWeight <em>Confidence Weight</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.MatchKeyDefinition#getHandleNull <em>Handle Null</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.MatchKeyDefinition#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.MatchKeyDefinition#getTokenizationType <em>Tokenization Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.rules.RulesPackage#getMatchKeyDefinition()
 * @model
 * @generated
 */
public interface MatchKeyDefinition extends KeyDefinition {
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
     * @see org.talend.dataquality.rules.RulesPackage#getMatchKeyDefinition_Algorithm()
     * @model containment="true"
     * @generated
     */
    AlgorithmDefinition getAlgorithm();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.MatchKeyDefinition#getAlgorithm <em>Algorithm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Algorithm</em>' containment reference.
     * @see #getAlgorithm()
     * @generated
     */
    void setAlgorithm(AlgorithmDefinition value);

    /**
     * Returns the value of the '<em><b>Confidence Weight</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines how much important is this attribute in the matching.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Confidence Weight</em>' attribute.
     * @see #setConfidenceWeight(int)
     * @see org.talend.dataquality.rules.RulesPackage#getMatchKeyDefinition_ConfidenceWeight()
     * @model
     * @generated
     */
    int getConfidenceWeight();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.MatchKeyDefinition#getConfidenceWeight <em>Confidence Weight</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Confidence Weight</em>' attribute.
     * @see #getConfidenceWeight()
     * @generated
     */
    void setConfidenceWeight(int value);

    /**
     * Returns the value of the '<em><b>Handle Null</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines how to handle null values.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Handle Null</em>' attribute.
     * @see #setHandleNull(String)
     * @see org.talend.dataquality.rules.RulesPackage#getMatchKeyDefinition_HandleNull()
     * @model
     * @generated
     */
    String getHandleNull();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.MatchKeyDefinition#getHandleNull <em>Handle Null</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Handle Null</em>' attribute.
     * @see #getHandleNull()
     * @generated
     */
    void setHandleNull(String value);

    /**
     * Returns the value of the '<em><b>Threshold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Threshold on the matching probability of the attribute.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Threshold</em>' attribute.
     * @see #setThreshold(double)
     * @see org.talend.dataquality.rules.RulesPackage#getMatchKeyDefinition_Threshold()
     * @model
     * @generated
     */
    double getThreshold();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.MatchKeyDefinition#getThreshold <em>Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Threshold</em>' attribute.
     * @see #getThreshold()
     * @generated
     */
    void setThreshold(double value);

    /**
     * Returns the value of the '<em><b>Tokenization Type</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tokenization Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tokenization Type</em>' attribute.
     * @see #setTokenizationType(String)
     * @see org.talend.dataquality.rules.RulesPackage#getMatchKeyDefinition_TokenizationType()
     * @model default=""
     * @generated
     */
    String getTokenizationType();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.MatchKeyDefinition#getTokenizationType <em>Tokenization Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tokenization Type</em>' attribute.
     * @see #getTokenizationType()
     * @generated
     */
    void setTokenizationType(String value);

} // MatchKeyDefinition
