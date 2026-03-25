/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.pattern;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.pattern.Pattern#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.pattern.PatternPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends ModelElement {
    /**
     * Returns the value of the '<em><b>Components</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.domain.pattern.PatternComponent}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Components</em>' containment reference list.
     * @see org.talend.dataquality.domain.pattern.PatternPackage#getPattern_Components()
     * @model containment="true"
     * @generated
     */
    EList<PatternComponent> getComponents();

} // Pattern
