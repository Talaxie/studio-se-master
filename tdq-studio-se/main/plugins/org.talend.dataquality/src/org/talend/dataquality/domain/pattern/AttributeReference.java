/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.pattern;

import orgomg.cwm.objectmodel.core.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.pattern.AttributeReference#getReferencedAttribute <em>Referenced Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.pattern.PatternPackage#getAttributeReference()
 * @model
 * @generated
 */
public interface AttributeReference extends PatternComponent {
    /**
     * Returns the value of the '<em><b>Referenced Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Attribute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Attribute</em>' reference.
     * @see #setReferencedAttribute(Attribute)
     * @see org.talend.dataquality.domain.pattern.PatternPackage#getAttributeReference_ReferencedAttribute()
     * @model
     * @generated
     */
    Attribute getReferencedAttribute();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.pattern.AttributeReference#getReferencedAttribute <em>Referenced Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Attribute</em>' reference.
     * @see #getReferencedAttribute()
     * @generated
     */
    void setReferencedAttribute(Attribute value);

} // AttributeReference
