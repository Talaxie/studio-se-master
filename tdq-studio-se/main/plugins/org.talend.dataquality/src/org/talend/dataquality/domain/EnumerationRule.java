/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.foundation.datatypes.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Association class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.EnumerationRule#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.EnumerationRule#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.DomainPackage#getEnumerationRule()
 * @model
 * @generated
 */
public interface EnumerationRule extends EObject {
    /**
     * Returns the value of the '<em><b>Domain</b></em>' reference list.
     * The list contents are of type {@link org.talend.dataquality.domain.Domain}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Domain</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Domain</em>' reference list.
     * @see org.talend.dataquality.domain.DomainPackage#getEnumerationRule_Domain()
     * @model
     * @generated
     */
    EList<Domain> getDomain();

    /**
     * Returns the value of the '<em><b>Enumeration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enumeration</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enumeration</em>' reference.
     * @see #setEnumeration(Enumeration)
     * @see org.talend.dataquality.domain.DomainPackage#getEnumerationRule_Enumeration()
     * @model
     * @generated
     */
    Enumeration getEnumeration();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.EnumerationRule#getEnumeration <em>Enumeration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enumeration</em>' reference.
     * @see #getEnumeration()
     * @generated
     */
    void setEnumeration(Enumeration value);

} // EnumerationRule
