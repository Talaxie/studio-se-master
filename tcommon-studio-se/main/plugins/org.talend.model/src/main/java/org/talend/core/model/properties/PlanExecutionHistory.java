/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Execution History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.PlanExecutionHistory#getOriginalLabel <em>Original Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.PlanExecutionHistory#getCurrentLabel <em>Current Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getPlanExecutionHistory()
 * @model
 * @generated
 */
public interface PlanExecutionHistory extends TaskExecutionHistory {
    /**
     * Returns the value of the '<em><b>Original Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Original Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Original Label</em>' attribute.
     * @see #setOriginalLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getPlanExecutionHistory_OriginalLabel()
     * @model
     * @generated
     */
    String getOriginalLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.PlanExecutionHistory#getOriginalLabel <em>Original Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Original Label</em>' attribute.
     * @see #getOriginalLabel()
     * @generated
     */
    void setOriginalLabel(String value);

    /**
     * Returns the value of the '<em><b>Current Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Label</em>' attribute.
     * @see #setCurrentLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getPlanExecutionHistory_CurrentLabel()
     * @model
     * @generated
     */
    String getCurrentLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.PlanExecutionHistory#getCurrentLabel <em>Current Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Label</em>' attribute.
     * @see #getCurrentLabel()
     * @generated
     */
    void setCurrentLabel(String value);

} // PlanExecutionHistory
