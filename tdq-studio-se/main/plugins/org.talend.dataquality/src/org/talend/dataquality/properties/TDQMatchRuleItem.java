/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties;

import org.talend.core.model.properties.TDQItem;
import org.talend.dataquality.rules.MatchRuleDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDQ Match Rule Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.TDQMatchRuleItem#getMatchRule <em>Match Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.properties.PropertiesPackage#getTDQMatchRuleItem()
 * @model
 * @generated
 */
public interface TDQMatchRuleItem extends TDQItem {
    /**
     * Returns the value of the '<em><b>Match Rule</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Match Rule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Match Rule</em>' reference.
     * @see #setMatchRule(MatchRuleDefinition)
     * @see org.talend.dataquality.properties.PropertiesPackage#getTDQMatchRuleItem_MatchRule()
     * @model
     * @generated
     */
    MatchRuleDefinition getMatchRule();

    /**
     * Sets the value of the '{@link org.talend.dataquality.properties.TDQMatchRuleItem#getMatchRule <em>Match Rule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Match Rule</em>' reference.
     * @see #getMatchRule()
     * @generated
     */
    void setMatchRule(MatchRuleDefinition value);

} // TDQMatchRuleItem
