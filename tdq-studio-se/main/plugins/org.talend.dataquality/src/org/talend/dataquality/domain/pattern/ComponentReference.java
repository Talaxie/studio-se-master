/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.pattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.pattern.ComponentReference#getReferencedComponent <em>Referenced Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.pattern.PatternPackage#getComponentReference()
 * @model
 * @generated
 */
public interface ComponentReference extends PatternComponent {
    /**
     * Returns the value of the '<em><b>Referenced Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Component</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Component</em>' reference.
     * @see #setReferencedComponent(PatternComponent)
     * @see org.talend.dataquality.domain.pattern.PatternPackage#getComponentReference_ReferencedComponent()
     * @model
     * @generated
     */
    PatternComponent getReferencedComponent();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.pattern.ComponentReference#getReferencedComponent <em>Referenced Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Component</em>' reference.
     * @see #getReferencedComponent()
     * @generated
     */
    void setReferencedComponent(PatternComponent value);

} // ComponentReference
