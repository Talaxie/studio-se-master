/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.LengthRestriction#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.LengthRestriction#getMinimum <em>Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.DomainPackage#getLengthRestriction()
 * @model
 * @generated
 */
public interface LengthRestriction extends EObject {
    /**
     * Returns the value of the '<em><b>Maximum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum</em>' attribute.
     * @see #setMaximum(int)
     * @see org.talend.dataquality.domain.DomainPackage#getLengthRestriction_Maximum()
     * @model
     * @generated
     */
    int getMaximum();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.LengthRestriction#getMaximum <em>Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum</em>' attribute.
     * @see #getMaximum()
     * @generated
     */
    void setMaximum(int value);

    /**
     * Returns the value of the '<em><b>Minimum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimum</em>' attribute.
     * @see #setMinimum(int)
     * @see org.talend.dataquality.domain.DomainPackage#getLengthRestriction_Minimum()
     * @model
     * @generated
     */
    int getMinimum();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.LengthRestriction#getMinimum <em>Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimum</em>' attribute.
     * @see #getMinimum()
     * @generated
     */
    void setMinimum(int value);

} // LengthRestriction
