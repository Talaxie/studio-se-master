/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties;

import org.talend.core.model.properties.TDQItem;
import org.talend.dataquality.rules.DQRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDQ Business Rule Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.TDQBusinessRuleItem#getDqrule <em>Dqrule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.properties.PropertiesPackage#getTDQBusinessRuleItem()
 * @model
 * @generated
 */
public interface TDQBusinessRuleItem extends TDQItem {
    /**
     * Returns the value of the '<em><b>Dqrule</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dqrule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dqrule</em>' reference.
     * @see #setDqrule(DQRule)
     * @see org.talend.dataquality.properties.PropertiesPackage#getTDQBusinessRuleItem_Dqrule()
     * @model
     * @generated
     */
    DQRule getDqrule();

    /**
     * Sets the value of the '{@link org.talend.dataquality.properties.TDQBusinessRuleItem#getDqrule <em>Dqrule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dqrule</em>' reference.
     * @see #getDqrule()
     * @generated
     */
    void setDqrule(DQRule value);

} // TDQBusinessRuleItem
