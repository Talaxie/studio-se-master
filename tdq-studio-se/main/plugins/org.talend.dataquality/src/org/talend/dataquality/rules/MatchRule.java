/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a single Match Rule. That is it defines a simple matching rule based on the conjonction of all MatchKey definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.MatchRule#getMatchKeys <em>Match Keys</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.MatchRule#getMatchInterval <em>Match Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.rules.RulesPackage#getMatchRule()
 * @model
 * @generated
 */
public interface MatchRule extends ModelElement {
    /**
     * Returns the value of the '<em><b>Match Keys</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.rules.MatchKeyDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Match Keys</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Match Keys</em>' containment reference list.
     * @see org.talend.dataquality.rules.RulesPackage#getMatchRule_MatchKeys()
     * @model containment="true"
     * @generated
     */
    EList<MatchKeyDefinition> getMatchKeys();

    /**
     * Returns the value of the '<em><b>Match Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Match Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Match Interval</em>' attribute.
     * @see #setMatchInterval(double)
     * @see org.talend.dataquality.rules.RulesPackage#getMatchRule_MatchInterval()
     * @model
     * @generated
     */
    double getMatchInterval();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.MatchRule#getMatchInterval <em>Match Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Match Interval</em>' attribute.
     * @see #getMatchInterval()
     * @generated
     */
    void setMatchInterval(double value);

} // MatchRule
