/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties;

import org.talend.core.model.properties.TDQItem;
import org.talend.dataquality.domain.pattern.Pattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDQ Pattern Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.TDQPatternItem#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.properties.PropertiesPackage#getTDQPatternItem()
 * @model
 * @generated
 */
public interface TDQPatternItem extends TDQItem {
    /**
     * Returns the value of the '<em><b>Pattern</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pattern</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pattern</em>' reference.
     * @see #setPattern(Pattern)
     * @see org.talend.dataquality.properties.PropertiesPackage#getTDQPatternItem_Pattern()
     * @model
     * @generated
     */
    Pattern getPattern();

    /**
     * Sets the value of the '{@link org.talend.dataquality.properties.TDQPatternItem#getPattern <em>Pattern</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pattern</em>' reference.
     * @see #getPattern()
     * @generated
     */
    void setPattern(Pattern value);

} // TDQPatternItem
